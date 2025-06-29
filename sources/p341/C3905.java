package p341;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p153.C2324;
import p254.C3159;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.C4457;

/* renamed from: ᵎˑ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3905 implements InterfaceC3165 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2324 f15174;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f15175;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f15176;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f15177;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3177 f15181;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f15182;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4457 f15183;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f15180 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3878 f15173 = new C3878(true, null, 0);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f15179 = new C4457(2048);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f15184 = -1;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f15178 = -1;

    public C3905() {
        C4457 c4457 = new C4457(10);
        this.f15183 = c4457;
        byte[] bArr = c4457.f17171;
        this.f15174 = new C2324(bArr.length, bArr);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) throws EOFException, InterruptedIOException {
        C3159 c3159 = (C3159) interfaceC3168;
        int iM9095 = m9095(c3159);
        int i = iM9095;
        int i2 = 0;
        int i3 = 0;
        do {
            C4457 c4457 = this.f15183;
            c3159.mo4875(c4457.f17171, 0, 2, false);
            c4457.m10108(0);
            if ((c4457.m10100() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c3159.mo4875(c4457.f17171, 0, 4, false);
                C2324 c2324 = this.f15174;
                c2324.m6407(14);
                int iM6410 = c2324.m6410(13);
                if (iM6410 <= 6) {
                    i++;
                    c3159.f12219 = 0;
                    c3159.m7828(i, false);
                } else {
                    c3159.m7828(iM6410 - 6, false);
                    i3 += iM6410;
                }
            } else {
                i++;
                c3159.f12219 = 0;
                c3159.m7828(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iM9095 < 8192);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r19, p166.C2430 r20) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3905.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m9095(C3159 c3159) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            C4457 c4457 = this.f15183;
            c3159.mo4875(c4457.f17171, 0, 10, false);
            c4457.m10108(0);
            if (c4457.m10095() != 4801587) {
                break;
            }
            c4457.m10085(3);
            int iM10079 = c4457.m10079();
            i += iM10079 + 10;
            c3159.m7828(iM10079, false);
        }
        c3159.f12219 = 0;
        c3159.m7828(i, false);
        if (this.f15178 == -1) {
            this.f15178 = i;
        }
        return i;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        this.f15177 = false;
        this.f15173.mo9076();
        this.f15182 = j2;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f15181 = interfaceC3177;
        this.f15173.mo9079(interfaceC3177, new C3898(0, 1));
        interfaceC3177.mo4850();
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
