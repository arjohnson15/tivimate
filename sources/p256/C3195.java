package p256;

import com.bumptech.glide.ﹳﹳ;
import p000.C0878;
import p000.C0882;
import p000.InterfaceC0875;
import p166.C2431;
import p254.C3159;
import p331.C3759;
import p383.AbstractC4464;

/* renamed from: יᴵ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3195 extends AbstractC3191 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f12407;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public volatile boolean f12408;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C3202 f12409;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C3759 f12410;

    public C3195(InterfaceC0875 interfaceC0875, C0882 c0882, C2431 c2431, int i, Object obj, C3202 c3202) {
        super(interfaceC0875, c0882, 2, c2431, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12409 = c3202;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
        this.f12408 = true;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() {
        if (this.f12407 == 0) {
            this.f12409.m7905(this.f12410, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C0882 c0882M3699 = this.f12390.m3699(this.f12407);
            C0878 c0878 = this.f12394;
            C3159 c3159 = new C3159(c0878, c0882M3699.f4001, c0878.mo3680(c0882M3699));
            while (!this.f12408) {
                try {
                    int iMo4075 = this.f12409.f12461.mo4075(c3159, C3202.f12454);
                    boolean z = false;
                    AbstractC4464.m10132(iMo4075 != 1);
                    if (iMo4075 == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.f12407 = c3159.f12217 - this.f12390.f4001;
                }
            }
        } finally {
            ﹳﹳ.ﹶˆ(this.f12394);
        }
    }
}
