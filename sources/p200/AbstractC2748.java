package p200;

import java.util.Arrays;

/* renamed from: ˎٴ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2748 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f10747;

    static {
        long[] jArr = AbstractC2745.f10739;
        int iM6984 = AbstractC2745.m6984(0);
        int iMax = iM6984 > 0 ? Math.max(7, AbstractC2745.m6981(iM6984)) : 0;
        if (iMax != 0) {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        int[] iArr = new int[iMax];
        f10747 = new int[0];
    }
}
