package p256;

import com.bumptech.glide.ﹳﹳ;
import p000.C0878;
import p000.C0882;
import p000.InterfaceC0875;
import p166.AbstractC2435;
import p166.C2431;
import p254.C3159;
import p254.InterfaceC3178;
import p331.C3759;
import p374.C4296;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: יᴵ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3192 extends AbstractC3198 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public long f12399;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final long f12400;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f12401;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public volatile boolean f12402;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final InterfaceC3199 f12403;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f12404;

    public C3192(InterfaceC0875 interfaceC0875, C0882 c0882, C2431 c2431, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, InterfaceC3199 interfaceC3199) {
        super(interfaceC0875, c0882, c2431, i, obj, j, j2, j3, j4, j5);
        this.f12404 = i2;
        this.f12400 = j6;
        this.f12403 = interfaceC3199;
    }

    @Override // p256.AbstractC3193
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo7891() {
        return this.f12401;
    }

    @Override // p256.AbstractC3193
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long mo7892() {
        return this.f12405 + this.f12404;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
        this.f12402 = true;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() {
        C3759 c3759 = this.f12442;
        AbstractC4464.m10146(c3759);
        if (this.f12399 == 0) {
            long j = this.f12400;
            for (C4296 c4296 : (C4296[]) c3759.f14523) {
                if (c4296.f16707 != j) {
                    c4296.f16707 = j;
                    c4296.f16731 = true;
                }
            }
            InterfaceC3199 interfaceC3199 = this.f12403;
            long j2 = this.f12443;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f12400;
            long j4 = this.f12440;
            ((C3202) interfaceC3199).m7905(c3759, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.f12400);
        }
        try {
            C0882 c0882M3699 = this.f12390.m3699(this.f12399);
            C0878 c0878 = this.f12394;
            C3159 c3159 = new C3159(c0878, c0882M3699.f4001, c0878.mo3680(c0882M3699));
            while (!this.f12402) {
                try {
                    int iMo4075 = ((C3202) this.f12403).f12461.mo4075(c3159, C3202.f12454);
                    AbstractC4464.m10132(iMo4075 != 1);
                    if (!(iMo4075 == 0)) {
                        break;
                    }
                } finally {
                    this.f12399 = c3159.f12217 - this.f12390.f4001;
                }
            }
            C2431 c2431 = this.f12395;
            if (AbstractC2435.m6553(c2431.f9664)) {
                int i = c2431.f9690;
                int i2 = c2431.f9665;
                if ((i > 1 || i2 > 1) && i != -1 && i2 != -1) {
                    InterfaceC3178 interfaceC3178M8747 = c3759.m8747(4);
                    int i3 = i * i2;
                    long j5 = (this.f12392 - this.f12398) / i3;
                    for (int i4 = 1; i4 < i3; i4++) {
                        interfaceC3178M8747.mo7841(0, new C4457());
                        interfaceC3178M8747.mo7842(i4 * j5, 0, 0, 0, null);
                    }
                }
            }
            ﹳﹳ.ﹶˆ(this.f12394);
            this.f12401 = !this.f12402;
        } catch (Throwable th) {
            ﹳﹳ.ﹶˆ(this.f12394);
            throw th;
        }
    }
}
