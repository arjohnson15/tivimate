package p404;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p080.AbstractC1702;
import p175.C2477;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;
import ـˊ.ʿʼ;

/* renamed from: ﹳʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4630 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ʿʼ f17739 = new ʿʼ(9);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f17734 = {112, 114, 111, 0};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final byte[] f17738 = {112, 114, 109, 0};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final byte[] f17742 = {48, 49, 53, 0};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final byte[] f17735 = {48, 49, 48, 0};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final byte[] f17740 = {48, 48, 57, 0};

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final byte[] f17741 = {48, 48, 53, 0};

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final byte[] f17737 = {48, 48, 49, 0};

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final byte[] f17743 = {48, 48, 49, 0};

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final byte[] f17736 = {48, 48, 50, 0};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static byte[] m10515(C2477[] c2477Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C2477 c2477 : c2477Arr) {
            length += ((((c2477.f9847 * 2) + 7) & (-8)) / 8) + (c2477.f9844 * 2) + m10534((String) c2477.f9838, (String) c2477.f9842, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c2477.f9841;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f17740)) {
            for (C2477 c24772 : c2477Arr) {
                m10526(byteArrayOutputStream, c24772, m10534((String) c24772.f9838, (String) c24772.f9842, bArr));
                m10521(byteArrayOutputStream, c24772);
                int[] iArr = (int[]) c24772.f9846;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    m10517(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m10532(byteArrayOutputStream, c24772);
            }
        } else {
            for (C2477 c24773 : c2477Arr) {
                m10526(byteArrayOutputStream, c24773, m10534((String) c24773.f9838, (String) c24773.f9842, bArr));
            }
            for (C2477 c24774 : c2477Arr) {
                m10521(byteArrayOutputStream, c24774);
                int[] iArr2 = (int[]) c24774.f9846;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    m10517(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m10532(byteArrayOutputStream, c24774);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m10516(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m10517(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m10533(byteArrayOutputStream, i, 2);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C2477[] m10518(ByteArrayInputStream byteArrayInputStream, int i, C2477[] c2477Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C2477[0];
        }
        if (i != c2477Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM10520 = (int) m10520(byteArrayInputStream, 2);
            iArr[i2] = (int) m10520(byteArrayInputStream, 2);
            strArr[i2] = new String(m10528(byteArrayInputStream, iM10520), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C2477 c2477 = c2477Arr[i3];
            if (!((String) c2477.f9842).equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c2477.f9844 = i4;
            c2477.f9846 = m10529(byteArrayInputStream, i4);
        }
        return c2477Arr;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C2477[] m10519(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f17735)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM10520 = (int) m10520(fileInputStream, 1);
        byte[] bArrM10524 = m10524(fileInputStream, (int) m10520(fileInputStream, 4), (int) m10520(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM10524);
        try {
            C2477[] c2477ArrM10530 = m10530(byteArrayInputStream, str, iM10520);
            byteArrayInputStream.close();
            return c2477ArrM10530;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static long m10520(InputStream inputStream, int i) throws IOException {
        byte[] bArrM10528 = m10528(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrM10528[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static void m10521(ByteArrayOutputStream byteArrayOutputStream, C2477 c2477) throws IOException {
        int i = 0;
        for (Map.Entry entry : ((TreeMap) c2477.f9839).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m10517(byteArrayOutputStream, iIntValue - i);
                m10517(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static C2477[] m10522(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C2477[] c2477Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C2477[0];
        }
        if (i != c2477Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m10520(byteArrayInputStream, 2);
            String str = new String(m10528(byteArrayInputStream, (int) m10520(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM10520 = m10520(byteArrayInputStream, 4);
            int iM10520 = (int) m10520(byteArrayInputStream, 2);
            C2477 c2477 = null;
            if (c2477Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c2477Arr.length) {
                        break;
                    }
                    if (((String) c2477Arr[i3].f9842).equals(strSubstring)) {
                        c2477 = c2477Arr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c2477 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c2477.f9840 = jM10520;
            int[] iArrM10529 = m10529(byteArrayInputStream, iM10520);
            if (Arrays.equals(bArr, f17737)) {
                c2477.f9844 = iM10520;
                c2477.f9846 = iArrM10529;
            }
        }
        return c2477Arr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static boolean m10523(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C2477[] c2477Arr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f17742;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f17735;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM10515 = m10515(c2477Arr, bArr3);
                m10533(byteArrayOutputStream, c2477Arr.length, 1);
                m10533(byteArrayOutputStream, bArrM10515.length, 4);
                byte[] bArrM10527 = m10527(bArrM10515);
                m10533(byteArrayOutputStream, bArrM10527.length, 4);
                byteArrayOutputStream.write(bArrM10527);
                return true;
            }
            byte[] bArr4 = f17741;
            if (Arrays.equals(bArr, bArr4)) {
                m10533(byteArrayOutputStream, c2477Arr.length, 1);
                for (C2477 c2477 : c2477Arr) {
                    int size = ((TreeMap) c2477.f9839).size() * 4;
                    String strM10534 = m10534((String) c2477.f9838, (String) c2477.f9842, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m10517(byteArrayOutputStream, strM10534.getBytes(charset).length);
                    m10517(byteArrayOutputStream, ((int[]) c2477.f9846).length);
                    m10533(byteArrayOutputStream, size, 4);
                    m10533(byteArrayOutputStream, c2477.f9845, 4);
                    byteArrayOutputStream.write(strM10534.getBytes(charset));
                    Iterator it = ((TreeMap) c2477.f9839).keySet().iterator();
                    while (it.hasNext()) {
                        m10517(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m10517(byteArrayOutputStream, 0);
                    }
                    for (int i2 : (int[]) c2477.f9846) {
                        m10517(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = f17740;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM105152 = m10515(c2477Arr, bArr5);
                m10533(byteArrayOutputStream, c2477Arr.length, 1);
                m10533(byteArrayOutputStream, bArrM105152.length, 4);
                byte[] bArrM105272 = m10527(bArrM105152);
                m10533(byteArrayOutputStream, bArrM105272.length, 4);
                byteArrayOutputStream.write(bArrM105272);
                return true;
            }
            byte[] bArr6 = f17737;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m10517(byteArrayOutputStream, c2477Arr.length);
            for (C2477 c24772 : c2477Arr) {
                String strM105342 = m10534((String) c24772.f9838, (String) c24772.f9842, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m10517(byteArrayOutputStream, strM105342.getBytes(charset2).length);
                TreeMap treeMap = (TreeMap) c24772.f9839;
                m10517(byteArrayOutputStream, treeMap.size());
                m10517(byteArrayOutputStream, ((int[]) c24772.f9846).length);
                m10533(byteArrayOutputStream, c24772.f9845, 4);
                byteArrayOutputStream.write(strM105342.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m10517(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : (int[]) c24772.f9846) {
                    m10517(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m10517(byteArrayOutputStream2, c2477Arr.length);
            int i4 = 2;
            int i5 = 2;
            for (C2477 c24773 : c2477Arr) {
                m10533(byteArrayOutputStream2, c24773.f9845, 4);
                m10533(byteArrayOutputStream2, c24773.f9840, 4);
                m10533(byteArrayOutputStream2, c24773.f9847, 4);
                String strM105343 = m10534((String) c24773.f9838, (String) c24773.f9842, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM105343.getBytes(charset3).length;
                m10517(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM105343.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C4638 c4638 = new C4638(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(c4638);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c2477Arr.length) {
                try {
                    C2477 c24774 = c2477Arr[i6];
                    m10517(byteArrayOutputStream3, i6);
                    m10517(byteArrayOutputStream3, c24774.f9844);
                    i7 = i7 + 4 + (c24774.f9844 * 2);
                    int[] iArr = (int[]) c24774.f9846;
                    int length3 = iArr.length;
                    int i8 = 0;
                    while (i < length3) {
                        int i9 = iArr[i];
                        m10517(byteArrayOutputStream3, i9 - i8);
                        i++;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C4638 c46382 = new C4638(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(c46382);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c2477Arr.length) {
                try {
                    C2477 c24775 = c2477Arr[i10];
                    Iterator it3 = ((TreeMap) c24775.f9839).entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m10532(byteArrayOutputStream4, c24775);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m10521(byteArrayOutputStream4, c24775);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m10517(byteArrayOutputStream3, i10);
                            int length4 = byteArray3.length + i4 + byteArray4.length;
                            int i12 = i11 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m10533(byteArrayOutputStream3, length4, 4);
                            m10517(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i11 = i12 + length4;
                            i10++;
                            arrayList3 = arrayList4;
                            i4 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
            }
            C4638 c46383 = new C4638(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(c46383);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            m10533(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                C4638 c46384 = (C4638) arrayList2.get(i13);
                int i14 = c46384.f17754;
                if (i14 == 1) {
                    j = 0;
                } else if (i14 == 2) {
                    j = 1;
                } else if (i14 == 3) {
                    j = 2;
                } else if (i14 == 4) {
                    j = 3;
                } else {
                    if (i14 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                m10533(byteArrayOutputStream, j, 4);
                m10533(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c46384.f17752;
                if (c46384.f17753) {
                    long length5 = bArr7.length;
                    byte[] bArrM105273 = m10527(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM105273);
                    m10533(byteArrayOutputStream, bArrM105273.length, 4);
                    m10533(byteArrayOutputStream, length5, 4);
                    length = bArrM105273.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m10533(byteArrayOutputStream, bArr7.length, 4);
                    m10533(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i13++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static byte[] m10524(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m10525(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m10525(file2) && z;
        }
        return z;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m10526(ByteArrayOutputStream byteArrayOutputStream, C2477 c2477, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m10517(byteArrayOutputStream, str.getBytes(charset).length);
        m10517(byteArrayOutputStream, c2477.f9844);
        m10533(byteArrayOutputStream, c2477.f9841, 4);
        m10533(byteArrayOutputStream, c2477.f9845, 4);
        m10533(byteArrayOutputStream, c2477.f9847, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static byte[] m10527(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static byte[] m10528(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(ˉᵎ.ˉⁱ("Not enough bytes to read: ", i));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int[] m10529(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM10520 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM10520 += (int) m10520(byteArrayInputStream, 2);
            iArr[i2] = iM10520;
        }
        return iArr;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static C2477[] m10530(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C2477[0];
        }
        C2477[] c2477Arr = new C2477[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM10520 = (int) m10520(byteArrayInputStream, 2);
            int iM105202 = (int) m10520(byteArrayInputStream, 2);
            c2477Arr[i2] = new C2477(str, new String(m10528(byteArrayInputStream, iM10520), StandardCharsets.UTF_8), m10520(byteArrayInputStream, 4), iM105202, (int) m10520(byteArrayInputStream, 4), (int) m10520(byteArrayInputStream, 4), new int[iM105202], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C2477 c2477 = c2477Arr[i3];
            int iAvailable = byteArrayInputStream.available() - c2477.f9841;
            int iM105203 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = (TreeMap) c2477.f9839;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM105203 += (int) m10520(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM105203), 1);
                for (int iM105204 = (int) m10520(byteArrayInputStream, 2); iM105204 > 0; iM105204--) {
                    m10520(byteArrayInputStream, 2);
                    int iM105205 = (int) m10520(byteArrayInputStream, 1);
                    if (iM105205 != 6 && iM105205 != 7) {
                        while (iM105205 > 0) {
                            m10520(byteArrayInputStream, 1);
                            for (int iM105206 = (int) m10520(byteArrayInputStream, 1); iM105206 > 0; iM105206--) {
                                m10520(byteArrayInputStream, 2);
                            }
                            iM105205--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c2477.f9846 = m10529(byteArrayInputStream, c2477.f9844);
            int i4 = c2477.f9847;
            BitSet bitSetValueOf = BitSet.valueOf(m10528(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return c2477Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ce A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10531(android.content.Context r19, java.util.concurrent.Executor r20, p404.InterfaceC4634 r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p404.AbstractC4630.m10531(android.content.Context, java.util.concurrent.Executor, ﹳʻ.ـﹶ, boolean):void");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m10532(ByteArrayOutputStream byteArrayOutputStream, C2477 c2477) throws IOException {
        byte[] bArr = new byte[(((c2477.f9847 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) c2477.f9839).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c2477.f9847;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m10533(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m10534(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f17737;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f17741;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return ᵎˏ.ˎٴ(AbstractC1702.m5407(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static C2477[] m10535(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C2477[] c2477Arr) throws IOException {
        byte[] bArr3 = f17743;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f17736)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM10520 = (int) m10520(fileInputStream, 2);
            byte[] bArrM10524 = m10524(fileInputStream, (int) m10520(fileInputStream, 4), (int) m10520(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM10524);
            try {
                C2477[] c2477ArrM10522 = m10522(byteArrayInputStream, bArr2, iM10520, c2477Arr);
                byteArrayInputStream.close();
                return c2477ArrM10522;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f17742, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM105202 = (int) m10520(fileInputStream, 1);
        byte[] bArrM105242 = m10524(fileInputStream, (int) m10520(fileInputStream, 4), (int) m10520(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM105242);
        try {
            C2477[] c2477ArrM10518 = m10518(byteArrayInputStream2, iM105202, c2477Arr);
            byteArrayInputStream2.close();
            return c2477ArrM10518;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
