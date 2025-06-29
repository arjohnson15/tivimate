package p403;

import java.util.List;
import p007.C0946;
import p254.C3159;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p260.C3222;
import p293.C3474;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4470;
import p383.C4457;
import ᵔᵔ.ٴˎ;

/* renamed from: ﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4622 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0946 f17694;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f17695;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f17696;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f17697;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f17698;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C4623 f17699;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f17700;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f17701;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f17702;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f17703;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4457 f17704;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3177 f17705;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C4625 f17706;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f17707;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3474 f17708;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C4623[] f17709;

    public C4622(int i, C3474 c3474) {
        this.f17708 = c3474;
        this.f17702 = (i & 1) == 0;
        this.f17704 = new C4457(12);
        this.f17694 = new C0946();
        this.f17705 = new ٴˎ(28);
        this.f17709 = new C4623[0];
        this.f17698 = -1L;
        this.f17707 = -1L;
        this.f17697 = -1;
        this.f17701 = -9223372036854775807L;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        C4457 c4457 = this.f17704;
        ((C3159) interfaceC3168).mo4875(c4457.f17171, 0, 12, false);
        c4457.m10108(0);
        if (c4457.m10083() != 1179011410) {
            return false;
        }
        c4457.m10085(4);
        return c4457.m10083() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r22, p166.C2430 r23) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p403.C4622.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
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
        this.f17696 = -1L;
        this.f17699 = null;
        for (C4623 c4623 : this.f17709) {
            if (c4623.f17712 == 0) {
                c4623.f17715 = 0;
            } else {
                c4623.f17715 = c4623.f17713[AbstractC4470.m10195(c4623.f17714, j, true)];
            }
        }
        if (j != 0) {
            this.f17695 = 6;
        } else if (this.f17709.length == 0) {
            this.f17695 = 0;
        } else {
            this.f17695 = 3;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f17695 = 0;
        if (this.f17702) {
            interfaceC3177 = new C3222(interfaceC3177, this.f17708);
        }
        this.f17705 = interfaceC3177;
        this.f17696 = -1L;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
