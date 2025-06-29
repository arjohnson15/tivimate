package p128;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p447.AbstractC5179;

/* renamed from: ˈﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2039 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f7712;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f7713;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f7714;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] f7715;

    public C2039(long j, byte[] bArr, int i, int i2) {
        this.f7714 = i;
        this.f7712 = i2;
        this.f7713 = j;
        this.f7715 = bArr;
    }

    public C2039(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C2039 m5689(C2037 c2037, ByteOrder byteOrder) {
        C2037[] c2037Arr = {c2037};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2042.f7720[5]]);
        byteBufferWrap.order(byteOrder);
        C2037 c20372 = c2037Arr[0];
        byteBufferWrap.putInt((int) c20372.f7711);
        byteBufferWrap.putInt((int) c20372.f7710);
        return new C2039(byteBufferWrap.array(), 5, 1);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2039 m5690(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2042.f7720[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C2039(byteBufferWrap.array(), 3, 1);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2039 m5691(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2042.f7720[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C2039(byteBufferWrap.array(), 4, 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C2042.f7735[this.f7714]);
        sb.append(", data length:");
        return AbstractC5179.m11550(sb, this.f7715.length, ")");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m5692(ByteOrder byteOrder) throws Throwable {
        Object objM5694 = m5694(byteOrder);
        if (objM5694 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM5694 instanceof String) {
            return Integer.parseInt((String) objM5694);
        }
        if (objM5694 instanceof long[]) {
            long[] jArr = (long[]) objM5694;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM5694 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM5694;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String m5693(ByteOrder byteOrder) throws Throwable {
        Object objM5694 = m5694(byteOrder);
        if (objM5694 == null) {
            return null;
        }
        if (objM5694 instanceof String) {
            return (String) objM5694;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM5694 instanceof long[]) {
            long[] jArr = (long[]) objM5694;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM5694 instanceof int[]) {
            int[] iArr = (int[]) objM5694;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM5694 instanceof double[]) {
            double[] dArr = (double[]) objM5694;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM5694 instanceof C2037[])) {
            return null;
        }
        C2037[] c2037Arr = (C2037[]) objM5694;
        while (i < c2037Arr.length) {
            sb.append(c2037Arr[i].f7711);
            sb.append('/');
            sb.append(c2037Arr[i].f7710);
            i++;
            if (i != c2037Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:79|(2:81|(2:82|(2:84|(2:166|86)(1:87))(2:165|88)))|89|(2:91|(6:168|93|99|140|100|103)(3:94|(2:96|170)(2:97|169)|98))|167|99|140|100|103) */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, ˈﹳ.ʿʼ[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.io.Serializable, ˈﹳ.ʿʼ[]] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m5694(java.nio.ByteOrder r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p128.C2039.m5694(java.nio.ByteOrder):java.io.Serializable");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final double m5695(ByteOrder byteOrder) throws Throwable {
        Object objM5694 = m5694(byteOrder);
        if (objM5694 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM5694 instanceof String) {
            return Double.parseDouble((String) objM5694);
        }
        if (objM5694 instanceof long[]) {
            if (((long[]) objM5694).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM5694 instanceof int[]) {
            if (((int[]) objM5694).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM5694 instanceof double[]) {
            double[] dArr = (double[]) objM5694;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM5694 instanceof C2037[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C2037[] c2037Arr = (C2037[]) objM5694;
        if (c2037Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C2037 c2037 = c2037Arr[0];
        return c2037.f7711 / c2037.f7710;
    }
}
