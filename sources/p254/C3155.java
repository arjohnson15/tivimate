package p254;

import java.util.List;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2430;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.C4457;
import ᵎﹳ.ᐧʻ;

/* renamed from: יי.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3155 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12197;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f12198;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f12199;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f12200;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3177 f12201;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC3178 f12202;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f12203;

    public C3155(int i, int i2, String str) {
        this.f12200 = i;
        this.f12197 = i2;
        this.f12199 = str;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        int i = this.f12197;
        int i2 = this.f12200;
        AbstractC4464.m10132((i2 == -1 || i == -1) ? false : true);
        C4457 c4457 = new C4457(i);
        ((C3159) interfaceC3168).mo4875(c4457.f17171, 0, i, false);
        return c4457.m10100() == i2;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) {
        int i = this.f12198;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC3178 interfaceC3178 = this.f12202;
        interfaceC3178.getClass();
        int iMo7843 = interfaceC3178.mo7843(interfaceC3168, 1024, true);
        if (iMo7843 == -1) {
            this.f12198 = 2;
            this.f12202.mo7842(0L, 1, this.f12203, 0, null);
            this.f12203 = 0;
        } else {
            this.f12203 += iMo7843;
        }
        return 0;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        if (j == 0 || this.f12198 == 1) {
            this.f12198 = 1;
            this.f12203 = 0;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f12201 = interfaceC3177;
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(1024, 4);
        this.f12202 = interfaceC3178Mo4851;
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559(this.f12199);
        ᐧʻ.ˋˊ(c2417, interfaceC3178Mo4851);
        this.f12201.mo4850();
        this.f12201.mo4858(new C3162());
        this.f12198 = 1;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
