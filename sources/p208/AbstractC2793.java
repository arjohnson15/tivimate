package p208;

import java.util.Arrays;
import p153.C2324;
import p383.AbstractC4464;

/* renamed from: ˏ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2793 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f10876 = {0, 0, 0, 1};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final float[] f10874 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Object f10875 = new Object();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int[] f10877 = new int[10];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m7071(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        AbstractC4464.m10132(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m7074(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m7074(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m7074(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m7074(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m7072(C2324 c2324) {
        int iM6395 = c2324.m6395() + 1;
        c2324.m6408(8);
        for (int i = 0; i < iM6395; i++) {
            c2324.m6395();
            c2324.m6395();
            c2324.m6406();
        }
        c2324.m6408(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0348  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p208.C2792 m7073(byte[] r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p208.AbstractC2793.m7073(byte[], int, int):ˏ.ʿʼ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7074(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m7075(int i, byte[] bArr) {
        int i2;
        synchronized (f10875) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f10877;
                    if (iArr.length <= i4) {
                        f10877 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f10877[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f10877[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p208.C2796 m7076(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p208.AbstractC2793.m7076(byte[], int, int):ˏ.ᐧʻ");
    }
}
