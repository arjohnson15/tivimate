package p341;

import p254.C3159;
import p383.AbstractC4470;
import p383.C4457;
import p383.C4458;

/* renamed from: ᵎˑ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3908 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f15198;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f15200;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f15204;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4458 f15201 = new C4458(0);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f15202 = -9223372036854775807L;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f15203 = -9223372036854775807L;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f15199 = -9223372036854775807L;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f15197 = new C4457();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m9097(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static long m9098(C4457 c4457) {
        int i = c4457.f17169;
        if (c4457.m10096() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c4457.m10097(bArr, 0, 9);
        c4457.m10108(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9099(C3159 c3159) {
        byte[] bArr = AbstractC4470.f17203;
        C4457 c4457 = this.f15197;
        c4457.getClass();
        c4457.m10081(bArr.length, bArr);
        this.f15200 = true;
        c3159.f12219 = 0;
    }
}
