package p223;

import android.support.v4.media.session.AbstractC0002;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import net.lingala.zip4j.exception.ZipException;
import p007.AbstractC0949;
import p028.AbstractC1173;
import p028.C1171;
import p028.C1176;
import p028.C1177;
import p080.AbstractC1702;
import p298.AbstractC3492;
import p298.C3495;
import p298.C3496;
import p298.C3499;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˏᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2978 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f11454 = {0, 0, -92, -127};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f11453 = {0, 0, -19, 65};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static byte[] m7351(char[] cArr, boolean z) {
        int i = 0;
        if (!z) {
            byte[] bArr = new byte[cArr.length];
            while (i < cArr.length) {
                bArr[i] = (byte) cArr[i];
                i++;
            }
            return bArr;
        }
        try {
            ByteBuffer byteBufferEncode = AbstractC2980.f11455.encode(CharBuffer.wrap(cArr));
            byte[] bArr2 = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr2);
            return bArr2;
        } catch (Exception unused) {
            byte[] bArr3 = new byte[cArr.length];
            while (i < cArr.length) {
                bArr3[i] = (byte) cArr[i];
                i++;
            }
            return bArr3;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static long m7352(long j) {
        long j2;
        if (j < 0) {
            return 2162688L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        if (i < 1980) {
            j2 = 2162688;
        } else {
            j2 = (calendar.get(13) >> 1) | ((i - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5);
        }
        if (j2 != 2162688) {
            return j2 + ((j % 2000) << 32);
        }
        return 2162688L;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static byte m7353(boolean z, byte b, int i) {
        return z ? m7370(b, i) : b;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static String m7354(File file, C3495 c3495) throws ZipException {
        try {
            File file2 = new File(file.getCanonicalPath());
            String string = c3495.f13531;
            if (!m7367(string)) {
                string = m7360(file2) ? file2.toPath().toRealPath(LinkOption.NOFOLLOW_LINKS).getFileName().toString() : file2.getName();
            }
            if (file2.isDirectory()) {
                string = string + "/";
            }
            if (m7367(string)) {
                return string;
            }
            StringBuilder sbM50 = AbstractC0002.m50("fileName to add to zip is empty or null. fileName: '", string, "' DefaultFolderPath: 'null' FileNameInZip: ");
            sbM50.append(c3495.f13531);
            String string2 = sbM50.toString();
            if (m7360(file)) {
                string2 = ᐧʻ.ˉⁱ(string2, "isSymlink: true ");
            }
            if (m7367(null)) {
                string2 = ᵎˏ.ˑי("rootFolderNameInZip: '", (String) null, "' ");
            }
            throw new ZipException(string2);
        } catch (IOException e) {
            throw new ZipException(e);
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static String m7355(String str) throws ZipException {
        if (!m7367(str)) {
            throw new ZipException("zip file name is empty or null, cannot determine zip file name");
        }
        if (str.contains(System.getProperty("file.separator"))) {
            str = str.substring(str.lastIndexOf(System.getProperty("file.separator")) + 1);
        }
        return str.endsWith(".zip") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m7356(Path path, byte[] bArr) throws IOException {
        DosFileAttributeView dosFileAttributeViewM3818;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            if (m7363()) {
                if (bArr[0] == 0 || (dosFileAttributeViewM3818 = AbstractC0949.m3818(Files.getFileAttributeView(path, AbstractC0949.m3826(), LinkOption.NOFOLLOW_LINKS))) == null) {
                    return;
                }
                dosFileAttributeViewM3818.setReadOnly(m7357(bArr[0], 0));
                dosFileAttributeViewM3818.setHidden(m7357(bArr[0], 1));
                dosFileAttributeViewM3818.setSystem(m7357(bArr[0], 2));
                dosFileAttributeViewM3818.setArchive(m7357(bArr[0], 5));
            } else {
                if (!System.getProperty("os.name").toLowerCase().contains("mac") && !System.getProperty("os.name").toLowerCase().contains("nux")) {
                    return;
                }
                if (bArr[2] == 0 && bArr[3] == 0) {
                    return;
                }
                HashSet hashSet = new HashSet();
                m7364(bArr[3], 0, hashSet, PosixFilePermission.OWNER_READ);
                m7364(bArr[2], 7, hashSet, PosixFilePermission.OWNER_WRITE);
                m7364(bArr[2], 6, hashSet, PosixFilePermission.OWNER_EXECUTE);
                m7364(bArr[2], 5, hashSet, PosixFilePermission.GROUP_READ);
                m7364(bArr[2], 4, hashSet, PosixFilePermission.GROUP_WRITE);
                m7364(bArr[2], 3, hashSet, PosixFilePermission.GROUP_EXECUTE);
                m7364(bArr[2], 2, hashSet, PosixFilePermission.OTHERS_READ);
                m7364(bArr[2], 1, hashSet, PosixFilePermission.OTHERS_WRITE);
                m7364(bArr[2], 0, hashSet, PosixFilePermission.OTHERS_EXECUTE);
                Files.setPosixFilePermissions(path, hashSet);
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static boolean m7357(byte b, int i) {
        return ((1 << i) & ((long) b)) != 0;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m7358(InputStream inputStream, byte[] bArr) throws IOException {
        int i = inputStream.read(bArr);
        if (i == -1) {
            throw new IOException("Unexpected EOF reached when trying to read stream");
        }
        if (i != bArr.length) {
            if (i < 0) {
                throw new IOException("Invalid readLength");
            }
            int i2 = 0;
            if (i == 0) {
                i = 0;
            } else {
                int length = bArr.length - i;
                for (int i3 = 1; i < bArr.length && i2 != -1 && i3 < 15; i3++) {
                    i2 = inputStream.read(bArr, i, length);
                    if (i2 > 0) {
                        i += i2;
                        length -= i2;
                    }
                }
            }
            if (i != bArr.length) {
                throw new IOException("Cannot read fully into byte buffer");
            }
        }
        return i;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static byte[] m7359(Path path) throws IOException {
        DosFileAttributeView dosFileAttributeViewM3818;
        byte[] bArr = new byte[4];
        try {
            dosFileAttributeViewM3818 = AbstractC0949.m3818(Files.getFileAttributeView(path, AbstractC0949.m3826(), LinkOption.NOFOLLOW_LINKS));
        } catch (IOException unused) {
        }
        if (dosFileAttributeViewM3818 == null) {
            return bArr;
        }
        DosFileAttributes attributes = dosFileAttributeViewM3818.readAttributes();
        bArr[0] = m7353(attributes.isArchive(), m7353(attributes.isDirectory(), m7353(attributes.isSystem(), m7353(attributes.isHidden(), m7353(attributes.isReadOnly(), (byte) 0, 0), 1), 2), 4), 5);
        return bArr;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static boolean m7360(File file) {
        try {
            return Files.isSymbolicLink(file.toPath());
        } catch (Error | Exception unused) {
            return false;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static ArrayList m7361(File file, C3495 c3495) throws ZipException {
        if (file == null) {
            throw new ZipException("input path is null, cannot read files in the directory");
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (file.isDirectory() && file.canRead() && fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isHidden() || c3495.f13519) {
                    arrayList.add(file2);
                    boolean zM7360 = m7360(file2);
                    if ((zM7360 && !AbstractC1702.m5410(1, c3495.f13529)) || (!zM7360 && file2.isDirectory())) {
                        arrayList.addAll(m7361(file2, c3495));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static AbstractC1173 m7362(C3496 c3496) {
        if (c3496.f13534.getName().endsWith(".zip.001")) {
            File file = c3496.f13534;
            C1176 c1176 = new C1176();
            c1176.f4867 = new C1177(file, m7365(file));
            return c1176;
        }
        File file2 = c3496.f13534;
        boolean z = c3496.f13539;
        int i = c3496.f13535.f13546;
        C1171 c1171 = new C1171();
        c1171.f4842 = 0;
        c1171.f4846 = new byte[1];
        c1171.f4845 = new RandomAccessFile(file2, "r");
        c1171.f4841 = file2;
        c1171.f4844 = z;
        c1171.f4843 = i;
        if (z) {
            c1171.f4842 = i;
        }
        return c1171;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static boolean m7363() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7364(byte b, int i, HashSet hashSet, PosixFilePermission posixFilePermission) {
        if (m7357(b, i)) {
            hashSet.add(posixFilePermission);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static File[] m7365(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            name = name.substring(0, iLastIndexOf);
        }
        File[] fileArrListFiles = file.getParentFile().listFiles(new C2977(name));
        if (fileArrListFiles == null) {
            return new File[0];
        }
        Arrays.sort(fileArrListFiles);
        return fileArrListFiles;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m7366(AbstractC3492 abstractC3492) throws ZipException {
        int i = abstractC3492.f13493;
        if (i != 3) {
            return i;
        }
        C3499 c3499 = abstractC3492.f13504;
        if (c3499 != null) {
            return c3499.f13555;
        }
        throw new ZipException("AesExtraDataRecord not present in local header for aes encrypted data");
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static boolean m7367(String str) {
        return str != null && str.trim().length() > 0;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static int m7368(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative offset");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("Length greater than buffer size");
        }
        while (i3 != i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            i3 += i4;
        }
        return i3;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static boolean m7369(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static byte m7370(byte b, int i) {
        return (byte) (b | (1 << i));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static long m7371(long j) {
        int i = (int) ((j >> 5) & 63);
        int i2 = (int) ((j >> 11) & 31);
        int i3 = (int) ((j >> 16) & 31);
        int i4 = (int) (((j >> 21) & 15) - 1);
        int i5 = (int) (((j >> 25) & 127) + 1980);
        Calendar calendar = Calendar.getInstance();
        calendar.set(i5, i4, i3, i2, i, (int) ((j << 1) & 62));
        calendar.set(14, 0);
        return calendar.getTime().getTime() + (j >> 32);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static byte[] m7372(Path path) {
        byte[] bArr = new byte[4];
        try {
            Set setPermissions = AbstractC2979.m7387(Files.getFileAttributeView(path, AbstractC2979.m7374(), LinkOption.NOFOLLOW_LINKS)).readAttributes().permissions();
            boolean zIsSymbolicLink = Files.isSymbolicLink(path);
            if (zIsSymbolicLink) {
                byte bM7370 = m7370(bArr[3], 7);
                bArr[3] = bM7370;
                bArr[3] = m7373(bM7370, 6);
            } else {
                bArr[3] = m7353(Files.isRegularFile(path, new LinkOption[0]), bArr[3], 7);
                bArr[3] = m7353(Files.isDirectory(path, new LinkOption[0]), bArr[3], 6);
            }
            bArr[3] = m7353(zIsSymbolicLink, bArr[3], 5);
            bArr[3] = m7353(setPermissions.contains(PosixFilePermission.OWNER_READ), bArr[3], 0);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.OWNER_WRITE), bArr[2], 7);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.OWNER_EXECUTE), bArr[2], 6);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.GROUP_READ), bArr[2], 5);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.GROUP_WRITE), bArr[2], 4);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.GROUP_EXECUTE), bArr[2], 3);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.OTHERS_READ), bArr[2], 2);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.OTHERS_WRITE), bArr[2], 1);
            bArr[2] = m7353(setPermissions.contains(PosixFilePermission.OTHERS_EXECUTE), bArr[2], 0);
        } catch (IOException unused) {
        }
        return bArr;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static byte m7373(byte b, int i) {
        return (byte) (b & (~(1 << i)));
    }
}
