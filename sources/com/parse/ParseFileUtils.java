package com.parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ParseFileUtils {
    public static void cleanDirectory(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        IOException e = null;
        for (File file2 : fileArrListFiles) {
            try {
                forceDelete(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    public static void copyFile(File file, File file2) throws Throwable {
        copyFile(file, file2, true);
    }

    public static void copyFile(File file, File file2, boolean z) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (!file2.exists() || file2.canWrite()) {
            doCopyFile(file, file2, z);
            return;
        }
        throw new IOException("Destination '" + file2 + "' exists but is read-only");
    }

    public static void deleteDirectory(File file) throws IOException {
        if (file.exists()) {
            if (!isSymlink(file)) {
                cleanDirectory(file);
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + ".");
        }
    }

    public static boolean deleteQuietly(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.FileOutputStream, java.io.OutputStream] */
    private static void doCopyFile(File file, File file2, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        ?? fileOutputStream;
        FileChannel channel;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileChannel channel2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
            fileOutputStream = 0;
        }
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                channel = fileInputStream.getChannel();
            } catch (Throwable th2) {
                th = th2;
                channel = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = 0;
            channel = fileOutputStream;
            ParseIOUtils.closeQuietly(channel2);
            ParseIOUtils.closeQuietly((OutputStream) fileOutputStream);
            ParseIOUtils.closeQuietly(channel);
            ParseIOUtils.closeQuietly((InputStream) fileInputStream);
            throw th;
        }
        try {
            channel2 = fileOutputStream.getChannel();
            long size = channel.size();
            long j = 0;
            while (j < size) {
                long jTransferFrom = channel2.transferFrom(channel, j, Math.min(size - j, 31457280L));
                if (jTransferFrom == 0) {
                    break;
                } else {
                    j += jTransferFrom;
                }
            }
            ParseIOUtils.closeQuietly(channel2);
            ParseIOUtils.closeQuietly((OutputStream) fileOutputStream);
            ParseIOUtils.closeQuietly(channel);
            ParseIOUtils.closeQuietly((InputStream) fileInputStream);
            long length = file.length();
            long length2 = file2.length();
            if (length == length2) {
                if (z) {
                    file2.setLastModified(file.lastModified());
                    return;
                }
                return;
            }
            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
        } catch (Throwable th4) {
            th = th4;
            ParseIOUtils.closeQuietly(channel2);
            ParseIOUtils.closeQuietly((OutputStream) fileOutputStream);
            ParseIOUtils.closeQuietly(channel);
            ParseIOUtils.closeQuietly((InputStream) fileInputStream);
            throw th;
        }
    }

    public static void forceDelete(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectory(file);
            return;
        }
        boolean zExists = file.exists();
        if (file.delete()) {
            return;
        }
        if (zExists) {
            throw new IOException("Unable to delete file: " + file);
        }
        throw new FileNotFoundException("File does not exist: " + file);
    }

    public static void getAllNestedFiles(String str, List<File> list) {
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    list.add(file);
                } else if (file.isDirectory()) {
                    getAllNestedFiles(file.getAbsolutePath(), list);
                }
            }
        }
    }

    public static boolean isSymlink(File file) {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static FileInputStream openInputStream(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException("File '" + file + "' cannot be read");
    }

    public static FileOutputStream openOutputStream(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("File '" + file + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        }
        return new FileOutputStream(file);
    }

    public static byte[] readFileToByteArray(File file) throws Throwable {
        FileInputStream fileInputStreamOpenInputStream;
        try {
            fileInputStreamOpenInputStream = openInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStreamOpenInputStream = null;
        }
        try {
            byte[] byteArray = ParseIOUtils.toByteArray(fileInputStreamOpenInputStream);
            ParseIOUtils.closeQuietly((InputStream) fileInputStreamOpenInputStream);
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            ParseIOUtils.closeQuietly((InputStream) fileInputStreamOpenInputStream);
            throw th;
        }
    }

    public static JSONObject readFileToJSONObject(File file) {
        return new JSONObject(readFileToString(file, "UTF-8"));
    }

    public static String readFileToString(File file, String str) {
        return readFileToString(file, Charset.forName(str));
    }

    public static String readFileToString(File file, Charset charset) {
        return new String(readFileToByteArray(file), charset);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStreamOpenOutputStream;
        try {
            fileOutputStreamOpenOutputStream = openOutputStream(file);
        } catch (Throwable th) {
            th = th;
            fileOutputStreamOpenOutputStream = null;
        }
        try {
            fileOutputStreamOpenOutputStream.write(bArr);
            ParseIOUtils.closeQuietly((OutputStream) fileOutputStreamOpenOutputStream);
        } catch (Throwable th2) {
            th = th2;
            ParseIOUtils.closeQuietly((OutputStream) fileOutputStreamOpenOutputStream);
            throw th;
        }
    }

    public static void writeJSONObjectToFile(File file, JSONObject jSONObject) throws Throwable {
        writeByteArrayToFile(file, jSONObject.toString().getBytes("UTF-8"));
    }

    public static void writeStringToFile(File file, String str, String str2) throws Throwable {
        writeStringToFile(file, str, Charset.forName(str2));
    }

    public static void writeStringToFile(File file, String str, Charset charset) throws Throwable {
        writeByteArrayToFile(file, str.getBytes(charset));
    }
}
