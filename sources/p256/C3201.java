package p256;

import com.bumptech.glide.ﹳﹳ;
import p000.C0878;
import p000.C0882;
import p000.InterfaceC0875;
import p166.C2431;
import p254.C3159;
import p254.InterfaceC3178;
import p331.C3759;
import p374.C4296;
import p383.AbstractC4464;

/* renamed from: יᴵ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3201 extends AbstractC3198 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f12449;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C2431 f12450;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public long f12451;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f12452;

    public C3201(InterfaceC0875 interfaceC0875, C0882 c0882, C2431 c2431, int i, Object obj, long j, long j2, long j3, int i2, C2431 c24312) {
        super(interfaceC0875, c0882, c2431, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f12452 = i2;
        this.f12450 = c24312;
    }

    @Override // p256.AbstractC3193
    /* renamed from: ʽᐧ */
    public final boolean mo7891() {
        return this.f12449;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() {
        C0878 c0878 = this.f12394;
        C3759 c3759 = this.f12442;
        AbstractC4464.m10146(c3759);
        for (C4296 c4296 : (C4296[]) c3759.f14523) {
            if (c4296.f16707 != 0) {
                c4296.f16707 = 0L;
                c4296.f16731 = true;
            }
        }
        InterfaceC3178 interfaceC3178M8747 = c3759.m8747(this.f12452);
        interfaceC3178M8747.mo7840(this.f12450);
        try {
            long jMo3680 = c0878.mo3680(this.f12390.m3699(this.f12451));
            if (jMo3680 != -1) {
                jMo3680 += this.f12451;
            }
            C3159 c3159 = new C3159(this.f12394, this.f12451, jMo3680);
            for (int iMo7843 = 0; iMo7843 != -1; iMo7843 = interfaceC3178M8747.mo7843(c3159, Integer.MAX_VALUE, true)) {
                this.f12451 += iMo7843;
            }
            interfaceC3178M8747.mo7842(this.f12398, 1, (int) this.f12451, 0, null);
            ﹳﹳ.ﹶˆ(c0878);
            this.f12449 = true;
        } catch (Throwable th) {
            ﹳﹳ.ﹶˆ(c0878);
            throw th;
        }
    }
}
