package p374;

import android.net.Uri;
import java.util.Map;
import p000.C0882;
import p000.InterfaceC0875;
import p000.InterfaceC0880;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ᵢˎ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4282 implements InterfaceC0875 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f16626;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f16627;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4243 f16628;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final byte[] f16629;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0875 f16630;

    public C4282(InterfaceC0875 interfaceC0875, int i, C4243 c4243) {
        AbstractC4464.m10142(i > 0);
        this.f16630 = interfaceC0875;
        this.f16626 = i;
        this.f16628 = c4243;
        this.f16629 = new byte[1];
        this.f16627 = i;
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) {
        int i3 = this.f16627;
        InterfaceC0875 interfaceC0875 = this.f16630;
        if (i3 == 0) {
            byte[] bArr2 = this.f16629;
            int i4 = 0;
            if (interfaceC0875.mo3679(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iMo3679 = interfaceC0875.mo3679(bArr3, i4, i6);
                        if (iMo3679 != -1) {
                            i4 += iMo3679;
                            i6 -= iMo3679;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        C4457 c4457 = new C4457(i5, bArr3);
                        C4243 c4243 = this.f16628;
                        long jMax = !c4243.f16476 ? c4243.f16480 : Math.max(c4243.f16475.m9750(true), c4243.f16480);
                        int iM10096 = c4457.m10096();
                        InterfaceC3178 interfaceC3178 = c4243.f16470;
                        interfaceC3178.getClass();
                        interfaceC3178.mo7841(iM10096, c4457);
                        interfaceC3178.mo7842(jMax, 1, iM10096, 0, null);
                        c4243.f16476 = true;
                    }
                }
                this.f16627 = this.f16626;
            }
            return -1;
        }
        int iMo36792 = interfaceC0875.mo3679(bArr, i, Math.min(this.f16627, i2));
        if (iMo36792 != -1) {
            this.f16627 -= iMo36792;
        }
        return iMo36792;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˉי */
    public final Map mo3674() {
        return this.f16630.mo3674();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f16630.mo3681();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ﹶˆ */
    public final void mo3678(InterfaceC0880 interfaceC0880) {
        interfaceC0880.getClass();
        this.f16630.mo3678(interfaceC0880);
    }
}
