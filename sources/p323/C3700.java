package p323;

import p254.InterfaceC3178;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ᴵˊ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3700 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C3694 f14261;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f14263;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f14265;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3178 f14267;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f14268;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f14269;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C3698 f14270;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f14271;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3696 f14260 = new C3696();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f14266 = new C4457();

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4457 f14262 = new C4457(1);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4457 f14264 = new C4457();

    public C3700(InterfaceC3178 interfaceC3178, C3698 c3698, C3694 c3694) {
        this.f14267 = interfaceC3178;
        this.f14270 = c3698;
        this.f14261 = c3694;
        this.f14270 = c3698;
        this.f14261 = c3694;
        interfaceC3178.mo7840(c3698.f14256.f14248);
        m8659();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m8656() {
        this.f14268++;
        if (!this.f14263) {
            return false;
        }
        int i = this.f14269 + 1;
        this.f14269 = i;
        int[] iArr = this.f14260.f14236;
        int i2 = this.f14265;
        if (i != iArr[i2]) {
            return true;
        }
        this.f14265 = i2 + 1;
        this.f14269 = 0;
        return false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m8657(int i, int i2) {
        C4457 c4457;
        C3686 c3686M8658 = m8658();
        if (c3686M8658 == null) {
            return 0;
        }
        C3696 c3696 = this.f14260;
        int length = c3686M8658.f14192;
        if (length != 0) {
            c4457 = c3696.f14237;
        } else {
            int i3 = AbstractC4470.f17202;
            byte[] bArr = c3686M8658.f14189;
            int length2 = bArr.length;
            C4457 c44572 = this.f14264;
            c44572.m10081(length2, bArr);
            length = bArr.length;
            c4457 = c44572;
        }
        boolean z = c3696.f14229 && c3696.f14227[this.f14268];
        boolean z2 = z || i2 != 0;
        C4457 c44573 = this.f14262;
        c44573.f17171[0] = (byte) ((z2 ? 128 : 0) | length);
        c44573.m10108(0);
        InterfaceC3178 interfaceC3178 = this.f14267;
        interfaceC3178.mo7844(c44573, 1, 1);
        interfaceC3178.mo7844(c4457, length, 1);
        if (!z2) {
            return length + 1;
        }
        C4457 c44574 = this.f14266;
        if (!z) {
            c44574.m10099(8);
            byte[] bArr2 = c44574.f17171;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            interfaceC3178.mo7844(c44574, 8, 1);
            return length + 9;
        }
        C4457 c44575 = c3696.f14237;
        int iM10100 = c44575.m10100();
        c44575.m10085(-2);
        int i4 = (iM10100 * 6) + 2;
        if (i2 != 0) {
            c44574.m10099(i4);
            byte[] bArr3 = c44574.f17171;
            c44575.m10097(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            c44574 = c44575;
        }
        interfaceC3178.mo7844(c44574, i4, 1);
        return length + 1 + i4;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3686 m8658() {
        if (!this.f14263) {
            return null;
        }
        C3696 c3696 = this.f14260;
        C3694 c3694 = c3696.f14234;
        int i = AbstractC4470.f17202;
        int i2 = c3694.f14220;
        C3686 c3686 = c3696.f14228;
        if (c3686 == null) {
            C3686[] c3686Arr = this.f14270.f14256.f14244;
            c3686 = c3686Arr == null ? null : c3686Arr[i2];
        }
        if (c3686 == null || !c3686.f14191) {
            return null;
        }
        return c3686;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m8659() {
        C3696 c3696 = this.f14260;
        c3696.f14239 = 0;
        c3696.f14233 = 0L;
        c3696.f14238 = false;
        c3696.f14229 = false;
        c3696.f14230 = false;
        c3696.f14228 = null;
        this.f14268 = 0;
        this.f14265 = 0;
        this.f14269 = 0;
        this.f14271 = 0;
        this.f14263 = false;
    }
}
