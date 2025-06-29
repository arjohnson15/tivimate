package p101;

import androidx.leanback.widget.C0153;
import androidx.media3.common.ParserException;
import java.util.List;
import p254.AbstractC3152;
import p254.C3159;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ˆˏ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1775 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public AbstractC1783 f6886;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f6887;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public InterfaceC3177 f6888;

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        try {
            return m5495((C3159) interfaceC3168);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r21, p166.C2430 r22) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p101.C1775.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m5495(C3159 c3159) {
        boolean zM7824;
        C0153 c0153 = new C0153();
        if (c0153.m935(c3159, true) && (c0153.f1074 & 2) == 2) {
            int iMin = Math.min(c0153.f1072, 8);
            C4457 c4457 = new C4457(iMin);
            c3159.mo4875(c4457.f17171, 0, iMin, false);
            c4457.m10108(0);
            if (c4457.m10096() >= 5 && c4457.m10086() == 127 && c4457.m10110() == 1179402563) {
                this.f6886 = new C1782();
            } else {
                c4457.m10108(0);
                try {
                    zM7824 = AbstractC3152.m7824(1, c4457, true);
                } catch (ParserException unused) {
                    zM7824 = false;
                }
                if (zM7824) {
                    this.f6886 = new C1776();
                } else {
                    c4457.m10108(0);
                    if (C1777.m5500(c4457, C1777.f6894)) {
                        this.f6886 = new C1777();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        AbstractC1783 abstractC1783 = this.f6886;
        if (abstractC1783 != null) {
            C1780 c1780 = abstractC1783.f6917;
            C0153 c0153 = c1780.f6905;
            c0153.f1074 = 0;
            c0153.f1071 = 0L;
            c0153.f1073 = 0;
            c0153.f1077 = 0;
            c0153.f1072 = 0;
            c1780.f6902.m10099(0);
            c1780.f6904 = -1;
            c1780.f6903 = false;
            if (j == 0) {
                abstractC1783.mo5499(!abstractC1783.f6912);
                return;
            }
            if (abstractC1783.f6915 != 0) {
                long j3 = (abstractC1783.f6921 * j2) / 1000000;
                abstractC1783.f6910 = j3;
                InterfaceC1781 interfaceC1781 = abstractC1783.f6920;
                int i = AbstractC4470.f17202;
                interfaceC1781.mo5493(j3);
                abstractC1783.f6915 = 2;
            }
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f6888 = interfaceC3177;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
