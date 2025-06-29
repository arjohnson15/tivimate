package p341;

import p254.InterfaceC3177;
import p383.AbstractC4470;
import p383.C4457;
import p383.C4458;

/* renamed from: ᵎˑ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3882 implements InterfaceC3881 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f14938 = new C4457(32);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f14939;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f14940;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3904 f14941;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f14942;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f14943;

    public C3882(InterfaceC3904 interfaceC3904) {
        this.f14941 = interfaceC3904;
    }

    @Override // p341.InterfaceC3881
    /* renamed from: ʽᐧ */
    public final void mo9080(int i, C4457 c4457) {
        boolean z = (i & 1) != 0;
        int iM10086 = z ? c4457.f17169 + c4457.m10086() : -1;
        if (this.f14942) {
            if (!z) {
                return;
            }
            this.f14942 = false;
            c4457.m10108(iM10086);
            this.f14943 = 0;
        }
        while (c4457.m10096() > 0) {
            int i2 = this.f14943;
            C4457 c44572 = this.f14938;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM100862 = c4457.m10086();
                    c4457.m10108(c4457.f17169 - 1);
                    if (iM100862 == 255) {
                        this.f14942 = true;
                        return;
                    }
                }
                int iMin = Math.min(c4457.m10096(), 3 - this.f14943);
                c4457.m10097(c44572.f17171, this.f14943, iMin);
                int i3 = this.f14943 + iMin;
                this.f14943 = i3;
                if (i3 == 3) {
                    c44572.m10108(0);
                    c44572.m10104(3);
                    c44572.m10085(1);
                    int iM100863 = c44572.m10086();
                    int iM100864 = c44572.m10086();
                    this.f14939 = (iM100863 & 128) != 0;
                    int i4 = (((iM100863 & 15) << 8) | iM100864) + 3;
                    this.f14940 = i4;
                    byte[] bArr = c44572.f17171;
                    if (bArr.length < i4) {
                        c44572.m10077(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c4457.m10096(), this.f14940 - this.f14943);
                c4457.m10097(c44572.f17171, this.f14943, iMin2);
                int i5 = this.f14943 + iMin2;
                this.f14943 = i5;
                int i6 = this.f14940;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f14939) {
                        c44572.m10104(i6);
                    } else {
                        if (AbstractC4470.m10178(0, i6, -1, c44572.f17171) != 0) {
                            this.f14942 = true;
                            return;
                        }
                        c44572.m10104(this.f14940 - 4);
                    }
                    c44572.m10108(0);
                    this.f14941.mo4798(c44572);
                    this.f14943 = 0;
                }
            }
        }
    }

    @Override // p341.InterfaceC3881
    /* renamed from: ـﹶ */
    public final void mo9081() {
        this.f14942 = true;
    }

    @Override // p341.InterfaceC3881
    /* renamed from: ﹳﹳ */
    public final void mo9082(C4458 c4458, InterfaceC3177 interfaceC3177, C3898 c3898) {
        this.f14941.mo4801(c4458, interfaceC3177, c3898);
        this.f14942 = true;
    }
}
