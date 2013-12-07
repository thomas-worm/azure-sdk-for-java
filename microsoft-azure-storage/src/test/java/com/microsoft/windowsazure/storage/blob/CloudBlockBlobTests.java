/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.storage.blob;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;

import javax.xml.stream.XMLStreamException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.windowsazure.storage.AccessCondition;
import com.microsoft.windowsazure.storage.Constants;
import com.microsoft.windowsazure.storage.OperationContext;
import com.microsoft.windowsazure.storage.RetryNoRetry;
import com.microsoft.windowsazure.storage.SendingRequestEvent;
import com.microsoft.windowsazure.storage.StorageCredentialsSharedAccessSignature;
import com.microsoft.windowsazure.storage.StorageEvent;
import com.microsoft.windowsazure.storage.StorageException;
import com.microsoft.windowsazure.storage.TestHelper;
import com.microsoft.windowsazure.storage.core.Utility;

/**
 * Block Blob Tests
 */
public class CloudBlockBlobTests extends BlobTestBase {

    protected CloudBlobContainer container;

    @Before
    public void blockBlobTestMethodSetup() throws URISyntaxException, StorageException {
        container = getRandomContainerReference();
        container.create();
    }

    @After
    public void blockBlobTestMethodTearDown() throws StorageException {
        container.deleteIfExists();
    }

    @Test
    public void testCopyBlockBlobSasToSasTest() throws InvalidKeyException, URISyntaxException, StorageException,
            IOException, InterruptedException {
        this.doCloudBlockBlobCopy(true, true);
    }

    @Test
    public void testCopyBlockBlobToSasTest() throws InvalidKeyException, URISyntaxException, StorageException,
            IOException, InterruptedException {
        this.doCloudBlockBlobCopy(false, true);
    }

    @Test
    public void testCopyBlockBlobSasTest() throws InvalidKeyException, URISyntaxException, StorageException,
            IOException, InterruptedException {
        this.doCloudBlockBlobCopy(true, false);
    }

    @Test
    public void testCopyBlockBlobTest() throws InvalidKeyException, URISyntaxException, StorageException, IOException,
            InterruptedException {
        this.doCloudBlockBlobCopy(false, false);
    }

    @Test
    public void testCopyBlockBlobWithMetadataOverride() throws URISyntaxException, StorageException, IOException,
            InterruptedException {
        Calendar calendar = Calendar.getInstance(Utility.UTC_ZONE);
        String data = "String data";
        CloudBlockBlob source = container.getBlockBlobReference("source");

        source.uploadText(data, Constants.UTF8_CHARSET, null, null, null);

        source.getMetadata().put("Test", "value");
        source.uploadMetadata();

        CloudBlockBlob copy = container.getBlockBlobReference("copy");
        copy.getMetadata().put("Test2", "value2");
        String copyId = copy.startCopyFromBlob(defiddler(source));
        waitForCopy(copy);

        assertEquals(CopyStatus.SUCCESS, copy.getCopyState().getStatus());
        assertEquals(source.getQualifiedUri().getPath(), copy.getCopyState().getSource().getPath());
        assertEquals(data.length(), copy.getCopyState().getTotalBytes().intValue());
        assertEquals(data.length(), copy.getCopyState().getBytesCopied().intValue());
        assertEquals(copyId, copy.getCopyState().getCopyId());
        assertTrue(copy.getCopyState().getCompletionTime().compareTo(new Date(calendar.get(Calendar.MINUTE) - 1)) > 0);

        String copyData = copy.downloadText(Constants.UTF8_CHARSET, null, null, null);
        assertEquals(data, copyData);

        copy.downloadAttributes();
        source.downloadAttributes();
        BlobProperties prop1 = copy.getProperties();
        BlobProperties prop2 = source.getProperties();

        assertEquals(prop1.getCacheControl(), prop2.getCacheControl());
        assertEquals(prop1.getContentEncoding(), prop2.getContentEncoding());
        assertEquals(prop1.getContentDisposition(), prop2.getContentDisposition());
        assertEquals(prop1.getContentLanguage(), prop2.getContentLanguage());
        assertEquals(prop1.getContentMD5(), prop2.getContentMD5());
        assertEquals(prop1.getContentType(), prop2.getContentType());

        assertEquals("value2", copy.getMetadata().get("Test2"));
        assertFalse(copy.getMetadata().containsKey("Test"));

        copy.delete();
    }

    @Test
    public void testCopyBlockBlobFromSnapshot() throws StorageException, IOException, URISyntaxException,
            InterruptedException {
        CloudBlockBlob source = container.getBlockBlobReference("source");
        String data = "String data";
        source.uploadText(data, Constants.UTF8_CHARSET, null, null, null);

        source.getMetadata().put("Test", "value");
        source.uploadMetadata();

        CloudBlockBlob snapshot = (CloudBlockBlob) source.createSnapshot();

        //Modify source
        String newData = "Hello";
        source.getMetadata().put("Test", "newvalue");
        source.uploadMetadata();
        source.getProperties().setContentMD5(null);
        source.uploadText(newData, Constants.UTF8_CHARSET, null, null, null);

        assertEquals(newData, source.downloadText(Constants.UTF8_CHARSET, null, null, null));
        assertEquals(data, snapshot.downloadText(Constants.UTF8_CHARSET, null, null, null));

        source.downloadAttributes();
        snapshot.downloadAttributes();
        assertFalse(source.getMetadata().get("Test").equals(snapshot.getMetadata().get("Test")));

        CloudBlockBlob copy = container.getBlockBlobReference("copy");
        String copyId = copy.startCopyFromBlob(defiddler(snapshot));
        waitForCopy(copy);

        copy.downloadAttributes();

        assertEquals(CopyStatus.SUCCESS, copy.getCopyState().getStatus());
        assertEquals(data, copy.downloadText(Constants.UTF8_CHARSET, null, null, null));
        assertEquals(copyId, copy.getProperties().getCopyState().getCopyId());

        copy.downloadAttributes();
        BlobProperties prop1 = copy.getProperties();
        BlobProperties prop2 = snapshot.getProperties();

        assertEquals(prop1.getCacheControl(), prop2.getCacheControl());
        assertEquals(prop1.getContentEncoding(), prop2.getContentEncoding());
        assertEquals(prop1.getContentDisposition(), prop2.getContentDisposition());
        assertEquals(prop1.getContentLanguage(), prop2.getContentLanguage());
        assertEquals(prop1.getContentMD5(), prop2.getContentMD5());
        assertEquals(prop1.getContentType(), prop2.getContentType());

        assertEquals("value", copy.getMetadata().get("Test"));

        copy.delete();
    }

    /**
     * Start copying a blob and then abort
     * 
     * @throws StorageException
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void testCopyFromBlobAbortTest() throws StorageException, URISyntaxException, IOException,
            InterruptedException {
        final int length = 128;
        CloudBlob originalBlob = uploadNewBlob(container, BlobType.BLOCK_BLOB, "originalBlob", length, null);
        CloudBlob copyBlob = container.getBlockBlobReference(originalBlob.getName() + "copyed");
        copyBlob.startCopyFromBlob(originalBlob);

        try {
            copyBlob.abortCopy(copyBlob.getProperties().getCopyState().getCopyId());
        }
        catch (StorageException e) {
            if (!e.getErrorCode().contains("NoPendingCopyOperation")) {
                throw e;
            }
        }
    }

    /**
     * Create a snapshot
     * 
     * @throws StorageException
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void testBlobSnapshotValidationTest() throws StorageException, URISyntaxException, IOException,
            InterruptedException {
        final int length = 1024;
        CloudBlockBlob blockBlobRef = (CloudBlockBlob) uploadNewBlob(container, BlobType.BLOCK_BLOB, "originalBlob",
                length, null);
        final CloudBlob blobSnapshot = blockBlobRef.createSnapshot();

        for (ListBlobItem blob : container.listBlobs(null, true, EnumSet.allOf(BlobListingDetails.class), null, null)) {
            final ByteArrayOutputStream outStream = new ByteArrayOutputStream(length);
            ((CloudBlob) blob).download(outStream);
        }

        ByteArrayOutputStream outStream = new ByteArrayOutputStream(length);

        blobSnapshot.download(outStream);
        byte[] retrievedBuff = outStream.toByteArray();
        assertEquals(length, retrievedBuff.length);

        // Read operation should work fine.
        blobSnapshot.downloadAttributes();

        final CloudBlockBlob blobSnapshotUsingRootUri = container.getBlockBlobReference(blockBlobRef.getUri()
                .toString(), blobSnapshot.getSnapshotID());
        outStream = new ByteArrayOutputStream(length);

        blobSnapshotUsingRootUri.download(outStream);
        retrievedBuff = outStream.toByteArray();
        assertEquals(length, retrievedBuff.length);
        assertEquals(blobSnapshot.getSnapshotID(), blobSnapshotUsingRootUri.getSnapshotID());

        // Expect an IllegalArgumentException from upload.
        try {
            final Random randGenerator = new Random();
            final byte[] buff = new byte[length];
            randGenerator.nextBytes(buff);
            blobSnapshot.upload(new ByteArrayInputStream(buff), -1);
            fail("Expect an IllegalArgumentException from upload");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cannot perform this operation on a blob representing a snapshot.", e.getMessage());
        }

        // Expect an IllegalArgumentException from uploadMetadata.
        try {
            blobSnapshot.uploadMetadata();
            fail("Expect an IllegalArgumentException from uploadMetadata");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cannot perform this operation on a blob representing a snapshot.", e.getMessage());
        }

        // Expect an IllegalArgumentException from uploadProperties.
        try {
            blobSnapshot.uploadProperties();
            fail("Expect an IllegalArgumentException from uploadProperties");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cannot perform this operation on a blob representing a snapshot.", e.getMessage());
        }

        // Expect an IllegalArgumentException from createSnapshot.
        try {
            blobSnapshot.createSnapshot();
            fail("Expect an IllegalArgumentException from createSnapshot");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cannot perform this operation on a blob representing a snapshot.", e.getMessage());
        }
    }

    /**
     * Create a blob and try to download a range of its contents
     * 
     * @throws StorageException
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     * @throws XMLStreamException
     */
    @Test
    public void testBlobDownloadRangeValidationTest() throws StorageException, URISyntaxException, IOException,
            InterruptedException {
        final int blockLength = 1024 * 1024;
        final int length = 5 * blockLength;

        final String blockBlobName = generateRandomBlobNameWithPrefix("testBlockBlob");
        final CloudBlockBlob blockBlobRef = container.getBlockBlobReference(blockBlobName);

        ArrayList<BlockEntry> blockList = new ArrayList<BlockEntry>();
        for (int i = 1; i <= 5; i++) {
            String blockID = String.format("%08d", i);
            blockBlobRef.uploadBlock(blockID, getRandomDataStream(length), blockLength, null, null, null);
            blockList.add(new BlockEntry(blockID, BlockSearchMode.LATEST));
        }

        blockBlobRef.commitBlockList(blockList);

        //Download full blob
        blockBlobRef.download(new ByteArrayOutputStream());
        assertEquals(length, blockBlobRef.getProperties().getLength());

        //Download blob range.
        ByteArrayOutputStream downloadStream = new ByteArrayOutputStream();
        blockBlobRef.downloadRange(0, (long) 100, downloadStream);
        assertEquals(length, blockBlobRef.getProperties().getLength());

        //Download block list.
        blockBlobRef.downloadBlockList();
        assertEquals(length, blockBlobRef.getProperties().getLength());
    }

    @Test
    public void testBlockBlobDownloadRangeTest() throws URISyntaxException, StorageException, IOException {
        byte[] buffer = getRandomBuffer(2 * 1024);

        CloudBlockBlob blob = container.getBlockBlobReference("blob1");
        ByteArrayInputStream wholeBlob = new ByteArrayInputStream(buffer);
        blob.upload(wholeBlob, -1);

        ByteArrayOutputStream blobStream = new ByteArrayOutputStream();
        try {
            blob.downloadRange(0, new Long(0), blobStream, null, null, null);
        }
        catch (IndexOutOfBoundsException ex) {

        }

        blob.downloadRange(0, new Long(1024), blobStream);
        assertEquals(blobStream.size(), 1024);
        TestHelper.assertStreamsAreEqualAtIndex(new ByteArrayInputStream(blobStream.toByteArray()), wholeBlob, 0, 0,
                1024, 2 * 1024);

        CloudBlockBlob blob2 = container.getBlockBlobReference("blob1");
        try {
            blob.downloadRange(1024, new Long(0), blobStream, null, null, null);
        }
        catch (IndexOutOfBoundsException ex) {

        }

        ByteArrayOutputStream blobStream2 = new ByteArrayOutputStream();
        blob2.downloadRange(1024, new Long(1024), blobStream2);
        TestHelper.assertStreamsAreEqualAtIndex(new ByteArrayInputStream(blobStream2.toByteArray()), wholeBlob, 1024,
                1024, 1024, 2 * 1024);
        blob2.downloadAttributes();
        assertAreEqual(blob, blob2);
    }

    @Test
    public void testBlobUploadFromStreamTest() throws URISyntaxException, StorageException, IOException {
        final String blockBlobName = generateRandomBlobNameWithPrefix("testBlockBlob");
        final CloudBlockBlob blockBlobRef = container.getBlockBlobReference(blockBlobName);

        int length = 2 * 1024;
        ByteArrayInputStream srcStream = getRandomDataStream(length);
        blockBlobRef.upload(srcStream, -1);
        ByteArrayOutputStream dstStream = new ByteArrayOutputStream();
        blockBlobRef.download(dstStream);
        TestHelper.assertStreamsAreEqual(srcStream, new ByteArrayInputStream(dstStream.toByteArray()));

        length = 5 * 1024 * 1024;
        srcStream = getRandomDataStream(length);
        blockBlobRef.upload(srcStream, length);
        dstStream = new ByteArrayOutputStream();
        blockBlobRef.download(dstStream);
        TestHelper.assertStreamsAreEqual(srcStream, new ByteArrayInputStream(dstStream.toByteArray()));
    }

    @Test
    public void testBlobUploadFromStreamRequestOptionsTest() throws URISyntaxException, StorageException, IOException {
        final String blockBlobName1 = generateRandomBlobNameWithPrefix("testBlockBlob");
        final CloudBlockBlob blockBlobRef1 = container.getBlockBlobReference(blockBlobName1);

        final String blockBlobName2 = generateRandomBlobNameWithPrefix("testBlockBlob");
        final CloudBlockBlob blockBlobRef2 = container.getBlockBlobReference(blockBlobName2);

        final int length = 2 * com.microsoft.windowsazure.storage.Constants.MB;
        ByteArrayInputStream srcStream = getRandomDataStream(length);

        BlobRequestOptions options = new BlobRequestOptions();
        options.setSingleBlobPutThresholdInBytes(length / 2);
        options.setRetryPolicyFactory(RetryNoRetry.getInstance());
        OperationContext context = new OperationContext();
        blockBlobRef1.upload(srcStream, length, null /* accessCondition */, options, context);

        assertTrue(context.getRequestResults().size() >= 2);

        srcStream.reset();
        options.setSingleBlobPutThresholdInBytes(length);
        context = new OperationContext();
        blockBlobRef2.upload(srcStream, length, null /* accessCondition */, options, context);

        assertTrue(context.getRequestResults().size() <= 2);
    }

    @Test
    public void testBlobUploadWithoutMD5Validation() throws URISyntaxException, StorageException, IOException {
        final String blockBlobName = generateRandomBlobNameWithPrefix("testBlockBlob");
        final CloudBlockBlob blockBlobRef = container.getBlockBlobReference(blockBlobName);

        final int length = 2 * 1024;
        ByteArrayInputStream srcStream = getRandomDataStream(length);
        BlobRequestOptions options = new BlobRequestOptions();
        options.setDisableContentMD5Validation(false);
        options.setStoreBlobContentMD5(false);

        blockBlobRef.upload(srcStream, -1, null, options, null);
        blockBlobRef.downloadAttributes();
        blockBlobRef.getProperties().setContentMD5("MDAwMDAwMDA=");
        blockBlobRef.uploadProperties(null, options, null);

        try {
            blockBlobRef.download(new ByteArrayOutputStream(), null, options, null);
            fail();
        }
        catch (StorageException ex) {
            assertEquals(306, ex.getHttpStatusCode());
            assertEquals("InvalidMd5", ex.getErrorCode());
        }

        options.setDisableContentMD5Validation(true);
        blockBlobRef.download(new ByteArrayOutputStream(), null, options, null);
    }

    @Test
    public void testBlobEmptyHeaderSigningTest() throws URISyntaxException, StorageException, IOException {
        final String blockBlobName = generateRandomBlobNameWithPrefix("testBlockBlob");
        final CloudBlockBlob blockBlobRef = container.getBlockBlobReference(blockBlobName);

        final int length = 2 * 1024;
        ByteArrayInputStream srcStream = getRandomDataStream(length);

        OperationContext context = new OperationContext();
        context.getSendingRequestEventHandler().addListener(new StorageEvent<SendingRequestEvent>() {

            @Override
            public void eventOccurred(SendingRequestEvent eventArg) {
                HttpURLConnection connection = (HttpURLConnection) eventArg.getConnectionObject();
                connection.setRequestProperty("x-ms-foo", "");
            }
        });

        blockBlobRef.upload(srcStream, -1, null, null, context);
        blockBlobRef.download(new ByteArrayOutputStream(), null, null, context);
    }

    @Test
    public void testCloudBlockBlobDownloadToByteArray() throws URISyntaxException, StorageException, IOException {
        CloudBlockBlob blob = container.getBlockBlobReference("blob1");
        this.doDownloadTest(blob, 1 * 512, 2 * 512, 0);
        this.doDownloadTest(blob, 1 * 512, 2 * 512, 1 * 512);
        this.doDownloadTest(blob, 2 * 512, 4 * 512, 1 * 512);
        this.doDownloadTest(blob, 5 * 1024 * 1024, 5 * 1024 * 1024, 0);
        this.doDownloadTest(blob, 5 * 1024 * 1024, 6 * 1024 * 1024, 512);
    }

    @Test
    public void testCloudBlockBlobDownloadRangeToByteArray() throws URISyntaxException, StorageException, IOException {
        CloudBlockBlob blob = container.getBlockBlobReference(generateRandomBlobNameWithPrefix("downloadrange"));

        this.doDownloadRangeToByteArrayTest(blob, 8 * 1024 * 1024, 8 * 1024 * 1024, 1 * 1024 * 1024, new Long(
                1 * 1024 * 1024), new Long(5 * 1024 * 1024));
        this.doDownloadRangeToByteArrayTest(blob, 8 * 1024 * 1024, 8 * 1024 * 1024, 2 * 1024 * 1024, new Long(
                2 * 1024 * 1024), new Long(6 * 1024 * 1024));
        this.doDownloadRangeToByteArrayTest(blob, 8 * 1024 * 1024, 8 * 1024 * 1024, 1 * 1024 * 1024, new Long(
                4 * 1024 * 1024), new Long(4 * 1024 * 1024));

        this.doDownloadRangeToByteArrayTest(blob, 2 * 512, 4 * 512, 0, new Long(1 * 512), new Long(1 * 512));
        this.doDownloadRangeToByteArrayTest(blob, 2 * 512, 4 * 512, 1 * 512, new Long(0), null);
        this.doDownloadRangeToByteArrayTest(blob, 2 * 512, 4 * 512, 1 * 512, new Long(1 * 512), null);
        this.doDownloadRangeToByteArrayTest(blob, 2 * 512, 4 * 512, 1 * 512, new Long(0), new Long(1 * 512));
        this.doDownloadRangeToByteArrayTest(blob, 2 * 512, 4 * 512, 2 * 512, new Long(1 * 512), new Long(1 * 512));
        this.doDownloadRangeToByteArrayTest(blob, 2 * 512, 4 * 512, 2 * 512, new Long(1 * 512), new Long(2 * 512));

        // Edge cases
        this.doDownloadRangeToByteArrayTest(blob, 1024, 1024, 1023, new Long(1023), new Long(1));
        this.doDownloadRangeToByteArrayTest(blob, 1024, 1024, 0, new Long(1023), new Long(1));
        this.doDownloadRangeToByteArrayTest(blob, 1024, 1024, 0, new Long(0), new Long(1));
        this.doDownloadRangeToByteArrayTest(blob, 1024, 1024, 0, new Long(512), new Long(1));
        this.doDownloadRangeToByteArrayTest(blob, 1024, 1024, 512, new Long(1023), new Long(1));
    }

    @Test
    public void testCloudBlockBlobDownloadRangeToByteArrayNegativeTest() throws URISyntaxException, StorageException,
            IOException {
        CloudBlockBlob blob = container
                .getBlockBlobReference(generateRandomBlobNameWithPrefix("downloadrangenegative"));
        this.doDownloadRangeToByteArrayNegativeTests(blob);
    }

    @Test
    public void testCloudBlockBlobUploadFromStreamWithAccessCondition() throws URISyntaxException, StorageException,
            IOException {
        CloudBlockBlob blob1 = container.getBlockBlobReference("blob1");
        AccessCondition accessCondition = AccessCondition.generateIfNoneMatchCondition("\"*\"");

        final int length = 2 * 1024 * 1024;
        ByteArrayInputStream srcStream = getRandomDataStream(length);

        blob1.upload(srcStream, length, accessCondition, null, null);
        blob1.downloadAttributes();

        CloudBlockBlob blob2 = (CloudBlockBlob) uploadNewBlob(container, BlobType.BLOCK_BLOB, "accesscond", length,
                null);
        blob2.downloadAttributes();

        srcStream.reset();
        accessCondition = AccessCondition.generateIfNoneMatchCondition(blob1.getProperties().getEtag());
        try {
            blob1.upload(srcStream, length, accessCondition, null, null);
        }
        catch (StorageException ex) {
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, ex.getHttpStatusCode());
        }

        srcStream.reset();
        accessCondition = AccessCondition.generateIfMatchCondition(blob1.getProperties().getEtag());
        blob1.upload(srcStream, length, accessCondition, null, null);

        srcStream.reset();
        accessCondition = AccessCondition.generateIfMatchCondition(blob2.getProperties().getEtag());
        try {
            blob1.upload(srcStream, length, accessCondition, null, null);
        }
        catch (StorageException ex) {
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, ex.getHttpStatusCode());
        }

        srcStream.reset();
        accessCondition = AccessCondition.generateIfNoneMatchCondition(blob2.getProperties().getEtag());
        blob1.upload(srcStream, length, accessCondition, null, null);
    }

    /**
     * @throws StorageException
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void testBlobNamePlusEncodingTest() throws StorageException, URISyntaxException, IOException,
            InterruptedException {
        final int length = 1 * 1024;

        final CloudBlockBlob originalBlob = (CloudBlockBlob) uploadNewBlob(container, BlobType.BLOCK_BLOB, "a+b.txt",
                length, null);
        final CloudBlob copyBlob = container.getBlockBlobReference(originalBlob.getName() + "copyed");

        copyBlob.startCopyFromBlob(originalBlob);
        waitForCopy(copyBlob);
        copyBlob.downloadAttributes();
    }

    /**
     * @throws StorageException
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void testSendingRequestEventBlob() throws StorageException, URISyntaxException, IOException,
            InterruptedException {
        final int length = 128;

        final ArrayList<Boolean> callList = new ArrayList<Boolean>();
        OperationContext sendingRequestEventContext = new OperationContext();
        sendingRequestEventContext.getSendingRequestEventHandler().addListener(new StorageEvent<SendingRequestEvent>() {

            @Override
            public void eventOccurred(SendingRequestEvent eventArg) {
                assertEquals(eventArg.getRequestResult(), eventArg.getOpContext().getLastResult());
                callList.add(true);
            }
        });

        assertEquals(0, callList.size());

        //Put blob
        CloudBlob blob = uploadNewBlob(container, BlobType.BLOCK_BLOB, "bb", length, sendingRequestEventContext);

        assertEquals(1, callList.size());

        //Get blob
        blob.download(new ByteArrayOutputStream(), null, null, sendingRequestEventContext);
        assertEquals(2, callList.size());

        //uploadMetadata
        blob.uploadMetadata(null, null, sendingRequestEventContext);
        assertEquals(3, callList.size());

        //uploadMetadata
        blob.downloadAttributes(null, null, sendingRequestEventContext);
        assertEquals(4, callList.size());

    }

    /**
     * @throws URISyntaxException
     * @throws StorageException
     * @throws IOException
     */
    @Test
    public void testBlobInputStream() throws URISyntaxException, StorageException, IOException {
        final int blobLength = 16 * 1024;
        final Random randGenerator = new Random();
        String blobName = generateRandomBlobNameWithPrefix("testblob");
        final CloudBlockBlob blobRef = container.getBlockBlobReference(blobName);

        final byte[] buff = new byte[blobLength];
        randGenerator.nextBytes(buff);
        buff[0] = -1;
        buff[1] = -128;
        final ByteArrayInputStream sourceStream = new ByteArrayInputStream(buff);

        final BlobRequestOptions options = new BlobRequestOptions();
        final OperationContext operationContext = new OperationContext();
        options.setStoreBlobContentMD5(true);
        options.setTimeoutIntervalInMs(90000);
        options.setRetryPolicyFactory(new RetryNoRetry());
        blobRef.uploadFullBlob(sourceStream, blobLength, null, options, operationContext);

        BlobInputStream blobStream = blobRef.openInputStream();

        for (int i = 0; i < blobLength; i++) {
            int data = blobStream.read();
            assertTrue(data >= 0);
            assertEquals(buff[i], (byte) data);
        }

        assertEquals(-1, blobStream.read());

        blobRef.delete();
    }

    /**
     * @throws URISyntaxException
     * @throws StorageException
     * @throws IOException
     * @throws XMLStreamException
     */
    @Test
    public void testCurrentOperationByteCount() throws URISyntaxException, StorageException, IOException {
        final int blockLength = 4 * 1024 * 1024;
        final Random randGenerator = new Random();
        String blobName = generateRandomBlobNameWithPrefix("testblob");
        final CloudBlockBlob blobRef = container.getBlockBlobReference(blobName);

        final ArrayList<byte[]> byteList = new ArrayList<byte[]>();
        final ArrayList<BlockEntry> blockList = new ArrayList<BlockEntry>();

        int numberOfBlocks = 4;

        for (int m = 0; m < numberOfBlocks; m++) {
            final byte[] buff = new byte[blockLength];
            randGenerator.nextBytes(buff);
            byteList.add(buff);
            blobRef.uploadBlock("ABC" + m, new ByteArrayInputStream(buff), blockLength);

            blockList.add(new BlockEntry("ABC" + m, BlockSearchMode.LATEST));
        }

        blobRef.commitBlockList(blockList);

        OperationContext operationContext = new OperationContext();
        BlobRequestOptions options = new BlobRequestOptions();
        options.setTimeoutIntervalInMs(2000);
        options.setRetryPolicyFactory(new RetryNoRetry());

        ByteArrayOutputStream downloadedDataStream = new ByteArrayOutputStream();
        try {
            blobRef.download(downloadedDataStream, null, options, operationContext);
        }
        catch (Exception e) {
            assertEquals(downloadedDataStream.size(), operationContext.getCurrentOperationByteCount());
        }

        operationContext = new OperationContext();
        options = new BlobRequestOptions();
        options.setTimeoutIntervalInMs(90000);

        downloadedDataStream = new ByteArrayOutputStream();
        blobRef.download(downloadedDataStream, null, options, operationContext);

        assertEquals(blockLength * numberOfBlocks, operationContext.getCurrentOperationByteCount());

        blobRef.delete();
    }

    @Test
    public void testUploadFromByteArray() throws Exception {
        String blobName = generateRandomBlobNameWithPrefix("testblob");
        final CloudBlockBlob blob = container.getBlockBlobReference(blobName);

        this.doUploadFromByteArrayTest(blob, 4 * 512, 0, 4 * 512);
        this.doUploadFromByteArrayTest(blob, 4 * 512, 0, 2 * 512);
        this.doUploadFromByteArrayTest(blob, 4 * 512, 1 * 512, 2 * 512);
        this.doUploadFromByteArrayTest(blob, 4 * 512, 2 * 512, 2 * 512);
        this.doUploadFromByteArrayTest(blob, 512, 0, 511);
    }

    private void doUploadFromByteArrayTest(CloudBlockBlob blob, int bufferSize, int bufferOffset, int count)
            throws Exception {
        byte[] buffer = getRandomBuffer(bufferSize);
        byte[] downloadedBuffer = new byte[bufferSize];

        blob.uploadFromByteArray(buffer, bufferOffset, count);
        blob.downloadToByteArray(downloadedBuffer, 0);

        int i = 0;
        for (; i < count; i++) {
            assertEquals(buffer[i + bufferOffset], downloadedBuffer[i]);
        }

        for (; i < downloadedBuffer.length; i++) {
            assertEquals(0, downloadedBuffer[i]);
        }
    }

    @Test
    public void testUploadDownloadFromFile() throws IOException, StorageException, URISyntaxException {
        String blobName = generateRandomBlobNameWithPrefix("testblob");
        final CloudBlockBlob blob = container.getBlockBlobReference(blobName);

        this.doUploadDownloadFileTest(blob, 0);
        this.doUploadDownloadFileTest(blob, 4096);
        this.doUploadDownloadFileTest(blob, 4097);
        this.doUploadDownloadFileTest(blob, 5 * 1024 * 1024);
        this.doUploadDownloadFileTest(blob, 11 * 1024 * 1024);
    }

    private void doUploadDownloadFileTest(CloudBlockBlob blob, int fileSize) throws IOException, StorageException {
        File sourceFile = File.createTempFile("sourceFile", ".tmp");
        File destinationFile = new File(sourceFile.getParentFile(), "destinationFile.tmp");

        try {

            byte[] buffer = getRandomBuffer(fileSize);
            FileOutputStream fos = new FileOutputStream(sourceFile);
            fos.write(buffer);
            fos.close();
            blob.uploadFromFile(sourceFile.getAbsolutePath());

            blob.downloadToFile(destinationFile.getAbsolutePath());
            assertTrue("Destination file does not exist.", destinationFile.exists());
            assertEquals("Destination file does not match input file.", fileSize, destinationFile.length());
            FileInputStream fis = new FileInputStream(destinationFile);

            byte[] readBuffer = new byte[fileSize];
            fis.read(readBuffer);
            fis.close();

            for (int i = 0; i < fileSize; i++) {
                assertEquals("File contents do not match.", buffer[i], readBuffer[i]);
            }
        }
        finally {
            if (sourceFile.exists()) {
                sourceFile.delete();
            }

            if (destinationFile.exists()) {
                destinationFile.delete();
            }
        }
    }

    @Test
    public void testUploadDownloadFromText() throws URISyntaxException, StorageException, IOException {
        String blobName = generateRandomBlobNameWithPrefix("testblob");
        final CloudBlockBlob blob = container.getBlockBlobReference(blobName);

        this.doUploadDownloadStringTest(blob, 0);
        this.doUploadDownloadStringTest(blob, 8000);
    }

    @Test
    public void testBlobMultiConditionHeaders() throws URISyntaxException, StorageException, IOException {
        final String blockBlobName = generateRandomBlobNameWithPrefix("testBlockBlob");
        final CloudBlockBlob blockBlobRef = container.getBlockBlobReference(blockBlobName);

        final int length = 2 * 1024;
        ByteArrayInputStream srcStream = getRandomDataStream(length);
        OperationContext context = new OperationContext();
        blockBlobRef.upload(srcStream, -1, null, null, context);

        AccessCondition condition = AccessCondition.generateIfMatchCondition(context.getLastResult().getEtag());
        condition.setIfUnmodifiedSinceDate(context.getLastResult().getStartDate());

        StorageEvent<SendingRequestEvent> event = new StorageEvent<SendingRequestEvent>() {

            @Override
            public void eventOccurred(SendingRequestEvent eventArg) {
                HttpURLConnection connection = (HttpURLConnection) eventArg.getConnectionObject();
                assertNotNull(connection.getRequestProperty("If-Unmodified-Since"));
                assertNotNull(connection.getRequestProperty("If-Match"));
            }
        };

        context.getSendingRequestEventHandler().addListener(event);

        blockBlobRef.upload(srcStream, -1, condition, null, context);
    }

    @Test
    public void testBlobConditionalAccess() throws StorageException, IOException, URISyntaxException {
        CloudBlockBlob blob = (CloudBlockBlob) BlobTestBase.uploadNewBlob(container, BlobType.BLOCK_BLOB, "test", 128,
                null);
        blob.downloadAttributes();

        String currentETag = blob.getProperties().getEtag();
        Date currentModifiedTime = blob.getProperties().getLastModified();

        // ETag conditional tests
        blob.getMetadata().put("ETagConditionalName", "ETagConditionalValue");
        blob.uploadMetadata(AccessCondition.generateIfMatchCondition(currentETag), null, null);

        blob.downloadAttributes();
        String newETag = blob.getProperties().getEtag();
        assertFalse(newETag.equals(currentETag));

        blob.getMetadata().put("ETagConditionalName", "ETagConditionalValue2");

        try {
            blob.uploadMetadata(AccessCondition.generateIfNoneMatchCondition(newETag), null, null);
            fail("If none match on conditional test should throw");
        }
        catch (StorageException e) {
            assertEquals("ConditionNotMet", e.getErrorCode());
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, e.getHttpStatusCode());
            assertEquals("The condition specified using HTTP conditional header(s) is not met.", e.getMessage());
        }

        String invalidETag = "\"0x10101010\"";
        try {
            blob.uploadMetadata(AccessCondition.generateIfMatchCondition(invalidETag), null, null);
            fail("Invalid ETag on conditional test should throw");
        }
        catch (StorageException e) {
            assertEquals("ConditionNotMet", e.getErrorCode());
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, e.getHttpStatusCode());
            assertEquals("The condition specified using HTTP conditional header(s) is not met.", e.getMessage());
        }

        currentETag = blob.getProperties().getEtag();
        blob.uploadMetadata(AccessCondition.generateIfNoneMatchCondition(invalidETag), null, null);

        blob.downloadAttributes();
        newETag = blob.getProperties().getEtag();

        // LastModifiedTime tests
        currentModifiedTime = blob.getProperties().getLastModified();

        blob.getMetadata().put("DateConditionalName", "DateConditionalValue");

        try {
            blob.uploadMetadata(AccessCondition.generateIfModifiedSinceCondition(currentModifiedTime), null, null);
            fail("IfModifiedSince conditional on current modified time should throw");
        }
        catch (StorageException e) {
            assertEquals("ConditionNotMet", e.getErrorCode());
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, e.getHttpStatusCode());
            assertEquals("The condition specified using HTTP conditional header(s) is not met.", e.getMessage());
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(currentModifiedTime);
        cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) - 5);
        Date pastTime = cal.getTime();
        blob.uploadMetadata(AccessCondition.generateIfModifiedSinceCondition(pastTime), null, null);

        cal = Calendar.getInstance();
        cal.setTime(currentModifiedTime);
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) - 5);
        pastTime = cal.getTime();
        blob.uploadMetadata(AccessCondition.generateIfModifiedSinceCondition(pastTime), null, null);

        cal = Calendar.getInstance();
        cal.setTime(currentModifiedTime);
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 5);
        pastTime = cal.getTime();
        blob.uploadMetadata(AccessCondition.generateIfModifiedSinceCondition(pastTime), null, null);

        currentModifiedTime = blob.getProperties().getLastModified();

        cal = Calendar.getInstance();
        cal.setTime(currentModifiedTime);
        cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) - 5);
        pastTime = cal.getTime();
        try {
            blob.uploadMetadata(AccessCondition.generateIfNotModifiedSinceCondition(pastTime), null, null);
            fail("IfNotModifiedSince conditional on past time should throw");
        }
        catch (StorageException e) {
            assertEquals("ConditionNotMet", e.getErrorCode());
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, e.getHttpStatusCode());
            assertEquals("The condition specified using HTTP conditional header(s) is not met.", e.getMessage());
        }

        cal = Calendar.getInstance();
        cal.setTime(currentModifiedTime);
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) - 5);
        pastTime = cal.getTime();
        try {
            blob.uploadMetadata(AccessCondition.generateIfNotModifiedSinceCondition(pastTime), null, null);
            fail("IfNotModifiedSince conditional on past time should throw");
        }
        catch (StorageException e) {
            assertEquals("ConditionNotMet", e.getErrorCode());
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, e.getHttpStatusCode());
            assertEquals("The condition specified using HTTP conditional header(s) is not met.", e.getMessage());
        }

        cal = Calendar.getInstance();
        cal.setTime(currentModifiedTime);
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 5);
        pastTime = cal.getTime();
        try {
            blob.uploadMetadata(AccessCondition.generateIfNotModifiedSinceCondition(pastTime), null, null);
            fail("IfNotModifiedSince conditional on past time should throw");
        }
        catch (StorageException e) {
            assertEquals("ConditionNotMet", e.getErrorCode());
            assertEquals(HttpURLConnection.HTTP_PRECON_FAILED, e.getHttpStatusCode());
            assertEquals("The condition specified using HTTP conditional header(s) is not met.", e.getMessage());
        }

        blob.getMetadata().put("DateConditionalName", "DateConditionalValue2");

        currentETag = blob.getProperties().getEtag();
        blob.uploadMetadata(AccessCondition.generateIfNotModifiedSinceCondition(currentModifiedTime), null, null);

        blob.downloadAttributes();
        newETag = blob.getProperties().getEtag();
        assertFalse("ETage should be modified on write metadata", newETag.equals(currentETag));
    }

    private void doUploadDownloadStringTest(CloudBlockBlob blob, int length) throws StorageException, IOException {
        String stringToUse = this.getRandomUNCString(length);
        blob.uploadText(stringToUse, Constants.UTF8_CHARSET, null, null, null);
        String newString = blob.downloadText(Constants.UTF8_CHARSET, null, null, null);
        assertEquals("Strings are not equal", stringToUse, newString);

        stringToUse = this.getRandomUNCString(length);
        blob.uploadText(stringToUse, "UTF-16", null, null, null);
        newString = blob.downloadText("UTF-16", null, null, null);
        assertEquals("Strings are not equal", stringToUse, newString);

        stringToUse = this.getRandomUNCString(length);
        blob.uploadText(stringToUse, "UTF-16BE", null, null, null);
        newString = blob.downloadText("UTF-16BE", null, null, null);
        assertEquals("Strings are not equal", stringToUse, newString);

        stringToUse = this.getRandomUNCString(length);
        blob.uploadText(stringToUse, "UTF-16LE", null, null, null);
        newString = blob.downloadText("UTF-16LE", null, null, null);
        assertEquals("Strings are not equal", stringToUse, newString);

        stringToUse = this.getRandomASCIIString(length);
        blob.uploadText(stringToUse, "US-ASCII", null, null, null);
        newString = blob.downloadText("US-ASCII", null, null, null);
        assertEquals("Strings are not equal", stringToUse, newString);
    }

    // Not a good test over all of Unicode, but good enough for our purposes 
    private String getRandomUNCString(int length) {
        return this.getRandomString(length, 0xD7FF);
    }

    private String getRandomASCIIString(int length) {
        return this.getRandomString(length, 0x7F);
    }

    private String getRandomString(int length, int maxCodePoint) {
        int[] codePoints = new int[length];
        Random random = new Random(237);
        for (int i = 0; i < length; i++) {
            codePoints[i] = random.nextInt(maxCodePoint);
        }

        return new String(codePoints, 0, length);
    }

    private void doCloudBlockBlobCopy(boolean sourceIsSas, boolean destinationIsSas) throws URISyntaxException,
            StorageException, IOException, InvalidKeyException, InterruptedException {

        // Create source on server.
        CloudBlockBlob source = container.getBlockBlobReference("source");

        String data = "String data";
        source.uploadText(data, Constants.UTF8_CHARSET, null, null, null);

        source.getMetadata().put("Test", "value");
        source.uploadMetadata();

        // Create destination on server.
        CloudBlockBlob destination = container.getBlockBlobReference("destination");
        destination.commitBlockList(new ArrayList<BlockEntry>());

        CloudBlockBlob copySource = source;
        CloudBlockBlob copyDestination = destination;

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.setTime(new Date());
        cal.add(Calendar.SECOND, 300);

        if (sourceIsSas) {
            // Source SAS must have read permissions
            SharedAccessBlobPolicy policy = new SharedAccessBlobPolicy();
            policy.setPermissions(EnumSet.of(SharedAccessBlobPermissions.READ, SharedAccessBlobPermissions.WRITE));
            policy.setSharedAccessExpiryTime(cal.getTime());

            BlobContainerPermissions perms = new BlobContainerPermissions();
            perms.getSharedAccessPolicies().put("read", policy);
            container.uploadPermissions(perms);
            Thread.sleep(30000);

            String sasToken = source.generateSharedAccessSignature(policy, null);

            // Get source
            StorageCredentialsSharedAccessSignature credentials = new StorageCredentialsSharedAccessSignature(sasToken);
            copySource = new CloudBlockBlob(credentials.transformUri(source.getUri()));
        }

        if (destinationIsSas) {
            // Destination SAS must have write permissions
            SharedAccessBlobPolicy policy = new SharedAccessBlobPolicy();
            policy.setPermissions(EnumSet.of(SharedAccessBlobPermissions.READ, SharedAccessBlobPermissions.WRITE));
            policy.setSharedAccessExpiryTime(cal.getTime());

            BlobContainerPermissions perms = new BlobContainerPermissions();
            // Source container must be public if source is not SAS
            if (!sourceIsSas) {
                perms.setPublicAccess(BlobContainerPublicAccessType.BLOB);
            }
            perms.getSharedAccessPolicies().put("write", policy);
            container.uploadPermissions(perms);
            Thread.sleep(30000);

            String sasToken = destination.generateSharedAccessSignature(policy, null);

            // Get destination 
            StorageCredentialsSharedAccessSignature credentials = new StorageCredentialsSharedAccessSignature(sasToken);
            copyDestination = new CloudBlockBlob(credentials.transformUri(destination.getUri()));
        }

        Thread.sleep(30000);

        // Start copy and wait for completion
        String copyId = copyDestination.startCopyFromBlob(copySource);
        waitForCopy(copyDestination);
        Calendar calendar = Calendar.getInstance(Utility.UTC_ZONE);
        destination.downloadAttributes();

        // Check original blob references for equality
        assertEquals(CopyStatus.SUCCESS, destination.getCopyState().getStatus());
        assertEquals(source.getQualifiedUri().getPath(), destination.getCopyState().getSource().getPath());
        assertEquals(data.length(), destination.getCopyState().getTotalBytes().intValue());
        assertEquals(data.length(), destination.getCopyState().getBytesCopied().intValue());
        assertEquals(copyId, destination.getProperties().getCopyState().getCopyId());
        assertTrue(destination.getCopyState().getCompletionTime()
                .compareTo(new Date(calendar.get(Calendar.MINUTE) - 1)) > 0);

        if (!destinationIsSas) {
            try {
                copyDestination.abortCopy(destination.getCopyState().getCopyId());
            }
            catch (StorageException ex) {
                assertEquals(HttpURLConnection.HTTP_CONFLICT, ex.getHttpStatusCode());
            }
        }

        source.downloadAttributes();
        assertNotNull(destination.getProperties().getEtag());
        assertFalse(source.getProperties().getEtag().equals(destination.getProperties().getEtag()));
        assertTrue(destination.getProperties().getLastModified().compareTo(new Date(calendar.get(Calendar.MINUTE) - 1)) > 0);

        String copyData = destination.downloadText(Constants.UTF8_CHARSET, null, null, null);
        assertEquals(data, copyData);

        destination.downloadAttributes();
        BlobProperties prop1 = destination.getProperties();
        BlobProperties prop2 = source.getProperties();

        assertEquals(prop1.getCacheControl(), prop2.getCacheControl());
        assertEquals(prop1.getContentEncoding(), prop2.getContentEncoding());
        assertEquals(prop1.getContentLanguage(), prop2.getContentLanguage());
        assertEquals(prop1.getContentMD5(), prop2.getContentMD5());
        assertEquals(prop1.getContentType(), prop2.getContentType());

        assertEquals("value", destination.getMetadata().get("Test"));

        destination.delete();
        source.delete();
    }
}
