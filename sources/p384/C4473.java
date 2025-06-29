package p384;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p254.C3159;
import p254.C3175;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.C4457;

/* renamed from: ᵢⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4473 implements InterfaceC3165 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4474 f17213;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f17214;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f17215;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f17216;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f17217;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public C4475 f17218;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f17219;

    /* renamed from: ˑי, reason: contains not printable characters */
    public C4476 f17221;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3177 f17223;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f17224;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f17225;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f17227;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4457 f17222 = new C4457(4);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f17212 = new C4457(9);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f17220 = new C4457(11);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4457 f17226 = new C4457();

    public C4473() {
        C4474 c4474 = new C4474(new C3175());
        c4474.f17228 = -9223372036854775807L;
        c4474.f17229 = new long[0];
        c4474.f17230 = new long[0];
        this.f17213 = c4474;
        this.f17224 = 1;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) throws EOFException, InterruptedIOException {
        C4457 c4457 = this.f17222;
        C3159 c3159 = (C3159) interfaceC3168;
        c3159.mo4875(c4457.f17171, 0, 3, false);
        c4457.m10108(0);
        if (c4457.m10095() != 4607062) {
            return false;
        }
        c3159.mo4875(c4457.f17171, 0, 2, false);
        c4457.m10108(0);
        if ((c4457.m10100() & 250) != 0) {
            return false;
        }
        c3159.mo4875(c4457.f17171, 0, 4, false);
        c4457.m10108(0);
        int iM10092 = c4457.m10092();
        c3159.f12219 = 0;
        c3159.m7828(iM10092, false);
        c3159.mo4875(c4457.f17171, 0, 4, false);
        c4457.m10108(0);
        return c4457.m10092() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r30, p166.C2430 r31) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p384.C4473.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 m10221(C3159 c3159) throws EOFException, InterruptedIOException {
        int i = this.f17215;
        C4457 c4457 = this.f17226;
        byte[] bArr = c4457.f17171;
        if (i > bArr.length) {
            c4457.m10081(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c4457.m10108(0);
        }
        c4457.m10104(this.f17215);
        c3159.mo4876(c4457.f17171, 0, this.f17215, false);
        return c4457;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        if (j == 0) {
            this.f17224 = 1;
            this.f17219 = false;
        } else {
            this.f17224 = 3;
        }
        this.f17214 = 0;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f17223 = interfaceC3177;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
