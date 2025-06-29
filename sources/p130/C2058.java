package p130;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p061.C1403;
import p179.C2495;
import p254.C3159;
import p254.C3176;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p323.C3685;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.C4457;

/* renamed from: ˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2058 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC3177 f7787;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f7788;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C3685 f7789;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C3159 f7790;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f7791;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4457 f7792 = new C4457(6);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f7793 = -1;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2495 f7794;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f7795;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C1403 f7796;

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
        C3685 c3685 = this.f7789;
        if (c3685 != null) {
            c3685.getClass();
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) throws EOFException, InterruptedIOException {
        C3159 c3159 = (C3159) interfaceC3168;
        C4457 c4457 = this.f7792;
        c4457.m10099(2);
        c3159.mo4875(c4457.f17171, 0, 2, false);
        if (c4457.m10100() != 65496) {
            return false;
        }
        c4457.m10099(2);
        c3159.mo4875(c4457.f17171, 0, 2, false);
        int iM10100 = c4457.m10100();
        this.f7795 = iM10100;
        if (iM10100 == 65504) {
            c4457.m10099(2);
            c3159.mo4875(c4457.f17171, 0, 2, false);
            c3159.m7828(c4457.m10100() - 2, false);
            c4457.m10099(2);
            c3159.mo4875(c4457.f17171, 0, 2, false);
            this.f7795 = c4457.m10100();
        }
        if (this.f7795 != 65505) {
            return false;
        }
        c3159.m7828(2, false);
        c4457.m10099(6);
        c3159.mo4875(c4457.f17171, 0, 6, false);
        return c4457.m10110() == 1165519206 && c4457.m10100() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0189  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r27, p166.C2430 r28) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p130.C2058.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5723() {
        InterfaceC3177 interfaceC3177 = this.f7787;
        interfaceC3177.getClass();
        interfaceC3177.mo4850();
        this.f7787.mo4858(new C3176(-9223372036854775807L));
        this.f7791 = 6;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        if (j == 0) {
            this.f7791 = 0;
            this.f7789 = null;
        } else if (this.f7791 == 5) {
            C3685 c3685 = this.f7789;
            c3685.getClass();
            c3685.mo4082(j, j2);
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f7787 = interfaceC3177;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
