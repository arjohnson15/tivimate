package p323;

import p383.C4457;

/* renamed from: ᴵˊ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3682 implements InterfaceC3699 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f14113;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object f14114;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f14115;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f14116;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f14117;

    public C3682(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f14117 = i2;
        this.f14113 = i3;
        this.f14115 = i4;
        this.f14116 = i5;
        this.f14114 = bArr;
    }

    public C3682(C3681 c3681) {
        C4457 c4457 = c3681.f14112;
        this.f14114 = c4457;
        c4457.m10108(12);
        this.f14113 = c4457.m10106() & 255;
        this.f14117 = c4457.m10106();
    }

    @Override // p323.InterfaceC3699
    /* renamed from: ʽᐧ */
    public int mo899() {
        return this.f14117;
    }

    @Override // p323.InterfaceC3699
    /* renamed from: ˑʽ */
    public int mo901() {
        C4457 c4457 = (C4457) this.f14114;
        int i = this.f14113;
        if (i == 8) {
            return c4457.m10086();
        }
        if (i == 16) {
            return c4457.m10100();
        }
        int i2 = this.f14115;
        this.f14115 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f14116 & 15;
        }
        int iM10086 = c4457.m10086();
        this.f14116 = iM10086;
        return (iM10086 & 240) >> 4;
    }

    @Override // p323.InterfaceC3699
    /* renamed from: ـﹶ */
    public int mo902() {
        return -1;
    }
}
