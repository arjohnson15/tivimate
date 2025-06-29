package p303;

import android.support.v4.media.session.AbstractC0001;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import p007.C0945;
import p008.C0973;
import p008.C0974;
import p008.C0979;
import p080.AbstractC1702;
import p223.AbstractC2978;
import p260.C3222;
import p266.C3262;
import p298.C3493;
import p298.C3495;
import p298.C3496;
import p298.C3501;
import p447.AbstractC5179;
import ʿﾞ.ﹳﹳ;
import ˊﹶ.ˋˉ;
import ـˊ.ʿʼ;

/* renamed from: ᐧʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3514 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3496 f13620;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final char[] f13621;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3262 f13622;

    public C3514(C3496 c3496, char[] cArr, C3262 c3262, ˋˉ r4) {
        super(r4);
        this.f13620 = c3496;
        this.f13621 = cArr;
        this.f13622 = c3262;
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public static C3495 m8393(C3495 c3495, File file, C0945 c0945) throws IOException {
        C3495 c34952 = new C3495(c3495);
        if (file.isDirectory()) {
            c34952.f13523 = 0L;
        } else {
            c34952.f13523 = file.length();
        }
        if (c3495.f13520 <= 0) {
            long jLastModified = file.lastModified();
            if (jLastModified < 0) {
                c34952.f13520 = 0L;
            } else {
                c34952.f13520 = jLastModified;
            }
        }
        c34952.f13521 = false;
        if (!AbstractC2978.m7367(c3495.f13531)) {
            c34952.f13531 = AbstractC2978.m7354(file, c3495);
        }
        if (file.isDirectory()) {
            c34952.f13526 = 1;
            c34952.f13530 = 1;
            c34952.f13525 = false;
        } else {
            if (c34952.f13525 && c34952.f13530 == 2) {
                c0945.getClass();
                if (!file.exists() || !file.canRead()) {
                    throw new ZipException("input file is null or does not exist or cannot read. Cannot calculate CRC for the file");
                }
                byte[] bArr = new byte[16384];
                CRC32 crc32 = new CRC32();
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        crc32.update(bArr, 0, i);
                        c0945.m3811(i);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                long value = crc32.getValue();
                fileInputStream.close();
                c34952.f13524 = value;
            }
            if (file.length() == 0) {
                c34952.f13526 = 1;
            }
        }
        return c34952;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m8394(ﹳﹳ r12, C0945 c0945) throws IOException {
        String string;
        C3517 c3517 = (C3517) r12;
        C3495 c3495 = c3517.f13628;
        int i = c3495.f13526;
        if (i != 1 && i != 2) {
            throw new ZipException("unsupported compression type");
        }
        if (!c3495.f13525) {
            c3495.f13530 = 1;
        } else {
            if (c3495.f13530 == 1) {
                throw new ZipException("Encryption method has to be set, when encrypt files flag is set");
            }
            char[] cArr = this.f13621;
            if (cArr == null || cArr.length <= 0) {
                throw new ZipException("input password is empty or null");
            }
        }
        ArrayList arrayList = new ArrayList();
        for (File file : c3517.f13627) {
            arrayList.add(file);
            boolean zM7360 = AbstractC2978.m7360(file);
            int i2 = c3495.f13529;
            if (zM7360 && !AbstractC1702.m5410(1, i2)) {
                arrayList.addAll(AbstractC2978.m7361(file, c3495));
            }
        }
        int i3 = c3495.f13529;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            if (!AbstractC2978.m7360(file2)) {
                if (!file2.exists()) {
                    throw new ZipException("File does not exist: " + file2);
                }
            } else if (AbstractC1702.m5410(i3, 3) || AbstractC1702.m5410(i3, 2)) {
                if (!file2.exists()) {
                    StringBuilder sb = new StringBuilder("Symlink target '");
                    try {
                        string = Files.readSymbolicLink(file2.toPath()).toString();
                    } catch (Error | Exception unused) {
                        string = "";
                    }
                    sb.append(string);
                    sb.append("' does not exist for link '");
                    sb.append(file2);
                    sb.append("'");
                    throw new ZipException(sb.toString());
                }
            }
        }
        C3501 c3501 = (C3501) ((ﹳﹳ) c3517).ᐧⁱ;
        byte[] bArr = new byte[c3501.f13558];
        ArrayList arrayList2 = new ArrayList(arrayList);
        C3496 c3496 = this.f13620;
        if (c3496.f13534.exists()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                File file3 = (File) it2.next();
                if (!AbstractC2978.m7367(file3.getName())) {
                    arrayList2.remove(file3);
                }
                C3493 c3493M10 = AbstractC0001.m10(c3496, AbstractC2978.m7354(file3, c3495));
                if (c3493M10 != null) {
                    if (c3495.f13522) {
                        c0945.getClass();
                        new C3519(c3496, this.f13622, new ˋˉ(19, c0945)).ﾞʽ(new C3518(Collections.singletonList(c3493M10.f13492), c3501));
                        ˊˆ();
                    } else {
                        arrayList2.remove(file3);
                    }
                }
            }
        }
        C0974 c0974 = new C0974(c3496.f13534, c3496.f13540);
        try {
            C0973 c0973M8397 = m8397(c0974, c3501);
            try {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    File file4 = (File) it3.next();
                    ˊˆ();
                    C3495 c3495M8393 = m8393(c3495, file4, c0945);
                    int i4 = c3495M8393.f13529;
                    file4.getAbsolutePath();
                    c0945.getClass();
                    if (AbstractC2978.m7360(file4) && (AbstractC1702.m5410(1, i4) || AbstractC1702.m5410(3, i4))) {
                        m8395(file4, c0973M8397, c3495M8393, c0974);
                        if (AbstractC1702.m5410(1, i4)) {
                        }
                    }
                    c0973M8397.m3942(c3495M8393);
                    if (file4.exists() && !file4.isDirectory()) {
                        FileInputStream fileInputStream = new FileInputStream(file4);
                        while (true) {
                            try {
                                int i5 = fileInputStream.read(bArr);
                                if (i5 == -1) {
                                    break;
                                }
                                c0973M8397.write(bArr, 0, i5);
                                c0945.m3811(i5);
                                ˊˆ();
                            } finally {
                            }
                        }
                        fileInputStream.close();
                    }
                    m8396(c0973M8397, c0974, file4, false);
                }
                c0973M8397.close();
                c0974.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                c0974.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final void m8395(File file, C0973 c0973, C3495 c3495, C0974 c0974) throws IOException {
        String string;
        C3495 c34952 = new C3495(c3495);
        String str = c3495.f13531;
        String name = file.getName();
        if (str.contains("/")) {
            name = str.substring(0, str.lastIndexOf("/") + 1) + name;
        }
        c34952.f13531 = name;
        c34952.f13525 = false;
        c34952.f13526 = 1;
        c0973.m3942(c34952);
        try {
            string = Files.readSymbolicLink(file.toPath()).toString();
        } catch (Error | Exception unused) {
            string = "";
        }
        c0973.write(string.getBytes());
        m8396(c0973, c0974, file, true);
    }

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final void m8396(C0973 c0973, C0974 c0974, File file, boolean z) throws IOException {
        byte[] bArrM7359;
        C0974 c09742;
        boolean z2;
        String string;
        String str;
        C3493 c3493M3943 = c0973.m3943();
        try {
            if (Files.isSymbolicLink(file.toPath()) || file.exists()) {
                Path path = file.toPath();
                bArrM7359 = AbstractC2978.m7363() ? AbstractC2978.m7359(path) : (System.getProperty("os.name").toLowerCase().contains("mac") || System.getProperty("os.name").toLowerCase().contains("nux")) ? AbstractC2978.m7372(path) : new byte[4];
            } else {
                bArrM7359 = new byte[4];
            }
        } catch (NoSuchMethodError unused) {
            bArrM7359 = new byte[4];
        }
        if (!z) {
            bArrM7359[3] = AbstractC2978.m7373(bArrM7359[3], 5);
        }
        c3493M3943.f13511 = bArrM7359;
        C3262 c3262 = this.f13622;
        c3262.getClass();
        C3496 c3496 = this.f13620;
        if (c3496 == null) {
            throw new ZipException("invalid input parameters, cannot update local file header");
        }
        if (c3493M3943.f13510 != c0974.f4312) {
            String parent = c3496.f13534.getParent();
            String strM7355 = AbstractC2978.m7355(c3496.f13534.getName());
            if (parent != null) {
                StringBuilder sbM5407 = AbstractC1702.m5407(parent);
                sbM5407.append(System.getProperty("file.separator"));
                string = sbM5407.toString();
            } else {
                string = "";
            }
            z2 = true;
            if (c3493M3943.f13510 < 9) {
                str = string + strM7355 + ".z0" + (c3493M3943.f13510 + 1);
            } else {
                str = string + strM7355 + ".z" + (c3493M3943.f13510 + 1);
            }
            c09742 = new C0974(new File(str));
        } else {
            c09742 = c0974;
            z2 = false;
        }
        long filePointer = c09742.f4313.getFilePointer();
        c09742.f4313.seek(c3493M3943.f13512 + 14);
        long j = c3493M3943.f13507;
        C3222 c3222 = (C3222) c3262.f12726;
        byte[] bArr = (byte[]) c3262.f12724;
        C3222.m7925(j, bArr);
        c09742.write(bArr, 0, 4);
        if (c3493M3943.f13499 >= 4294967295L) {
            C3222.m7925(4294967295L, bArr);
            c09742.write(bArr, 0, 4);
            c09742.write(bArr, 0, 4);
            int i = c3493M3943.f13501 + 8;
            if (c09742.f4313.skipBytes(i) != i) {
                throw new ZipException(AbstractC5179.m11548(i, "Unable to skip ", " bytes to update LFH"));
            }
            c3222.m7952(c09742, c3493M3943.f13499);
            c3222.m7952(c09742, c3493M3943.f13494);
        } else {
            C3222.m7925(c3493M3943.f13494, bArr);
            c09742.write(bArr, 0, 4);
            C3222.m7925(c3493M3943.f13499, bArr);
            c09742.write(bArr, 0, 4);
        }
        if (z2) {
            c09742.close();
        } else {
            c0974.f4313.seek(filePointer);
        }
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final C0973 m8397(C0974 c0974, C3501 c3501) throws IOException {
        C3496 c3496 = this.f13620;
        if (c3496.f13534.exists()) {
            c0974.f4313.seek(c3496.f13536 ? c3496.f13533.f13570 : c3496.f13535.f13550);
        }
        C0973 c0973 = new C0973();
        c0973.f4307 = new ʿʼ(2);
        c0973.f4298 = new C3262(14);
        c0973.f4302 = new CRC32();
        C3222 c3222 = new C3222(9);
        c0973.f4305 = c3222;
        c0973.f4308 = 0L;
        c0973.f4300 = true;
        if (c3501.f13558 < 512) {
            throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
        }
        C0979 c0979 = new C0979();
        c0979.f4319 = 0L;
        c0979.f4320 = c0974;
        c0973.f4304 = c0979;
        c0973.f4296 = this.f13621;
        c0973.f4295 = c3501;
        if (c0979.m3947()) {
            c3496.f13539 = true;
            c3496.f13540 = c0979.m3947() ? c0974.f4309 : 0L;
        }
        c0973.f4299 = c3496;
        c0973.f4301 = false;
        if (c0979.m3947()) {
            c3222.m7953(c0979, (int) 134695760);
        }
        return c0973;
    }
}
