package p303;

import android.support.v4.media.session.AbstractC0001;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import net.lingala.zip4j.exception.ZipException;
import p007.C0945;
import p008.C0974;
import p080.AbstractC1702;
import p266.C3262;
import p298.C3493;
import p298.C3494;
import p298.C3496;
import p298.C3498;
import p298.C3501;
import p298.C3503;
import ʽᵔ.ʽⁱ;
import ʿﾞ.ﹳﹳ;
import ˊﹶ.ˋˉ;

/* renamed from: ᐧʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3519 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3496 f13630;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3262 f13631;

    public C3519(C3496 c3496, C3262 c3262, ˋˉ r3) {
        super(r3);
        this.f13630 = c3496;
        this.f13631 = c3262;
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public static void m8398(File file, File file2, boolean z) throws ZipException {
        if (!z) {
            if (!file2.delete()) {
                throw new ZipException("Could not delete temporary file");
            }
        } else {
            if (!file.delete()) {
                throw new ZipException("cannot delete old zip file");
            }
            if (!file2.renameTo(file)) {
                throw new ZipException("cannot rename modified zip file");
            }
        }
    }

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public static int m8399(ArrayList arrayList, C3493 c3493) throws ZipException {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C3493) arrayList.get(i)).equals(c3493)) {
                return i;
            }
        }
        throw new ZipException("Could not find file header in list of central directory file headers");
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public static void m8400(RandomAccessFile randomAccessFile, C0974 c0974, long j, long j2, C0945 c0945, int i) throws IOException {
        long j3 = j2 + j;
        long j4 = 0;
        if (j < 0 || j3 < 0 || j > j3) {
            throw new ZipException("invalid offsets");
        }
        if (j == j3) {
            return;
        }
        try {
            randomAccessFile.seek(j);
            long j5 = j3 - j;
            byte[] bArr = j5 < ((long) i) ? new byte[(int) j5] : new byte[i];
            while (true) {
                int i2 = randomAccessFile.read(bArr);
                if (i2 == -1) {
                    return;
                }
                c0974.write(bArr, 0, i2);
                long j6 = i2;
                c0945.m3811(j6);
                j4 += j6;
                if (j4 == j5) {
                    return;
                }
                if (bArr.length + j4 > j5) {
                    bArr = new byte[(int) (j5 - j4)];
                }
            }
        } catch (IOException e) {
            throw new ZipException(e);
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m8401(ﹳﹳ r24, C0945 c0945) throws Throwable {
        Throwable th;
        ArrayList arrayList;
        C3518 c3518 = (C3518) r24;
        C3496 c3496 = this.f13630;
        if (c3496.f13539) {
            throw new ZipException("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : c3518.f13629) {
            if (AbstractC0001.m10(c3496, str) != null) {
                arrayList2.add(str);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        String path = c3496.f13534.getPath();
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sbM5407 = AbstractC1702.m5407(path);
        sbM5407.append(secureRandom.nextInt(10000));
        File file = new File(sbM5407.toString());
        while (file.exists()) {
            StringBuilder sbM54072 = AbstractC1702.m5407(path);
            sbM54072.append(secureRandom.nextInt(10000));
            file = new File(sbM54072.toString());
        }
        boolean z = false;
        try {
            C0974 c0974 = new C0974(file);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(c3496.f13534, "r");
                try {
                    ArrayList arrayList3 = new ArrayList(c3496.f13532.f4789);
                    Collections.sort(arrayList3, new ʽⁱ(16));
                    Iterator it = arrayList3.iterator();
                    long j = 0;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C3501 c3501 = (C3501) ((ﹳﹳ) c3518).ᐧⁱ;
                        if (!zHasNext) {
                            this.f13631.m8027(c3496, c0974);
                            try {
                                randomAccessFile.close();
                                try {
                                    c0974.close();
                                    m8398(c3496.f13534, file, true);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = true;
                                    m8398(c3496.f13534, file, z);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z = true;
                                try {
                                    c0974.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                        }
                        C3493 c3493 = (C3493) it.next();
                        int iM8399 = m8399(arrayList3, c3493);
                        long filePointer = (iM8399 == arrayList3.size() - 1 ? c3496.f13536 ? c3496.f13533.f13570 : c3496.f13535.f13550 : ((C3493) arrayList3.get(iM8399 + 1)).f13512) - c0974.f4313.getFilePointer();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            if ((!str2.endsWith("/") || !c3493.f13492.startsWith(str2)) && !c3493.f13492.equals(str2)) {
                            }
                            m8402(arrayList3, c3493, filePointer);
                            if (!c3496.f13532.f4789.remove(c3493)) {
                                throw new ZipException("Could not remove entry from list of central directory headers");
                            }
                            j += filePointer;
                            arrayList = arrayList3;
                            ˊˆ();
                            arrayList3 = arrayList;
                        }
                        arrayList = arrayList3;
                        m8400(randomAccessFile, c0974, j, filePointer, c0945, c3501.f13558);
                        j += filePointer;
                        ˊˆ();
                        arrayList3 = arrayList;
                    }
                } finally {
                }
            } catch (Throwable th5) {
                th = th5;
                c0974.close();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            m8398(c3496.f13534, file, z);
            throw th;
        }
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final void m8402(ArrayList arrayList, C3493 c3493, long j) throws ZipException {
        C3496 c3496;
        C3494 c3494;
        if (j == Long.MIN_VALUE) {
            throw new ArithmeticException("long overflow");
        }
        long j2 = -j;
        int iM8399 = m8399(arrayList, c3493);
        if (iM8399 == -1) {
            throw new ZipException("Could not locate modified file header in zipModel");
        }
        while (true) {
            iM8399++;
            int size = arrayList.size();
            c3496 = this.f13630;
            if (iM8399 >= size) {
                break;
            }
            C3493 c34932 = (C3493) arrayList.get(iM8399);
            c34932.f13512 += j2;
            if (c3496.f13536 && (c3494 = c34932.f13496) != null) {
                long j3 = c3494.f13514;
                if (j3 != -1) {
                    c3494.f13514 = j3 + j2;
                }
            }
        }
        C3498 c3498 = c3496.f13535;
        c3498.f13550 -= j;
        c3498.f13549--;
        int i = c3498.f13544;
        if (i > 0) {
            c3498.f13544 = i - 1;
        }
        if (c3496.f13536) {
            C3503 c3503 = c3496.f13533;
            c3503.f13570 -= j;
            c3503.f13563 = c3503.f13565 - 1;
            c3496.f13537.f13543 -= j;
        }
    }
}
