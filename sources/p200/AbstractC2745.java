package p200;

/* renamed from: ˎٴ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2745 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final long[] f10739 = {-9187201950435737345L, -1};

    static {
        new C2756(0);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int m6980(long[] jArr, int i, int i2) {
        while (i < i2) {
            if (((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int m6981(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final int m6982(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m6983(long[] jArr, int i) {
        int i2 = (i + 7) >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int length = jArr.length;
        int i4 = length - 1;
        int i5 = length - 2;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[i4] = jArr[0];
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int m6984(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int m6985(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }
}
