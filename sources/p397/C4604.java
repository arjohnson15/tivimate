package p397;

import java.io.EOFException;
import p033.C1210;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p166.InterfaceC2442;
import p254.C3156;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ⁱᵎ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4604 implements InterfaceC3178 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4603 f17608;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C2431 f17610;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3178 f17612;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC4602 f17614;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f17615 = 0;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f17609 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public byte[] f17613 = AbstractC4470.f17203;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f17611 = new C4457();

    public C4604(InterfaceC3178 interfaceC3178, InterfaceC4603 interfaceC4603) {
        this.f17612 = interfaceC3178;
        this.f17608 = interfaceC4603;
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʽᐧ */
    public final int mo7839(InterfaceC2442 interfaceC2442, int i, boolean z) throws EOFException {
        if (this.f17614 == null) {
            return this.f17612.mo7839(interfaceC2442, i, z);
        }
        m10491(i);
        int iMo3679 = interfaceC2442.mo3679(this.f17613, this.f17609, i);
        if (iMo3679 != -1) {
            this.f17609 += iMo3679;
            return iMo3679;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʿʼ */
    public final void mo7840(C2431 c2431) {
        c2431.f9667.getClass();
        String str = c2431.f9667;
        AbstractC4464.m10142(AbstractC2435.m6554(str) == 3);
        boolean zEquals = c2431.equals(this.f17610);
        InterfaceC4603 interfaceC4603 = this.f17608;
        if (!zEquals) {
            this.f17610 = c2431;
            this.f17614 = interfaceC4603.mo8055(c2431) ? interfaceC4603.mo8058(c2431) : null;
        }
        InterfaceC4602 interfaceC4602 = this.f17614;
        InterfaceC3178 interfaceC3178 = this.f17612;
        if (interfaceC4602 == null) {
            interfaceC3178.mo7840(c2431);
            return;
        }
        C2417 c2417M6541 = c2431.m6541();
        c2417M6541.f9602 = AbstractC2435.m6559("application/x-media3-cues");
        c2417M6541.f9627 = str;
        c2417M6541.f9621 = Long.MAX_VALUE;
        c2417M6541.f9599 = interfaceC4603.mo8051(c2431);
        ᐧʻ.ˋˊ(c2417M6541, interfaceC3178);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ˑʽ */
    public final /* synthetic */ void mo7841(int i, C4457 c4457) {
        ᵎˏ.ـﹶ(this, c4457, i);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ـﹶ */
    public final void mo7842(long j, int i, int i2, int i3, C3156 c3156) {
        if (this.f17614 == null) {
            this.f17612.mo7842(j, i, i2, i3, c3156);
            return;
        }
        AbstractC4464.m10124("DRM on subtitles is not supported", c3156 == null);
        int i4 = (this.f17609 - i3) - i2;
        this.f17614.mo2508(this.f17613, i4, i2, C4601.f17604, new C1210(this, j, i));
        int i5 = i4 + i2;
        this.f17615 = i5;
        if (i5 == this.f17609) {
            this.f17615 = 0;
            this.f17609 = 0;
        }
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ٴˎ */
    public final int mo7843(InterfaceC2442 interfaceC2442, int i, boolean z) {
        return mo7839(interfaceC2442, i, z);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m10491(int i) {
        int length = this.f17613.length;
        int i2 = this.f17609;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f17615;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f17613;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f17615, bArr2, 0, i3);
        this.f17615 = 0;
        this.f17609 = i3;
        this.f17613 = bArr2;
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ﹳﹳ */
    public final void mo7844(C4457 c4457, int i, int i2) {
        if (this.f17614 == null) {
            this.f17612.mo7844(c4457, i, i2);
            return;
        }
        m10491(i);
        c4457.m10097(this.f17613, this.f17609, i);
        this.f17609 += i;
    }
}
