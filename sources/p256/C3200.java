package p256;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import p312.C3589;
import p374.C4296;
import p374.InterfaceC4254;
import p383.AbstractC4464;
import p456.C5349;

/* renamed from: יᴵ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3200 implements InterfaceC4254 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4296 f12444;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C3196 f12445;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f12446;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f12447;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3196 f12448;

    public C3200(C3196 c3196, C3196 c31962, C4296 c4296, int i) {
        this.f12445 = c3196;
        this.f12448 = c31962;
        this.f12444 = c4296;
        this.f12446 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7903() {
        if (this.f12447) {
            return;
        }
        C3196 c3196 = this.f12445;
        ᐧʻ r1 = c3196.f12431;
        int[] iArr = c3196.f12413;
        int i = this.f12446;
        r1.ᐧʻ(iArr[i], c3196.f12418[i], 0, (Object) null, c3196.f12426);
        this.f12447 = true;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ */
    public final int mo4054(C5349 c5349, C3589 c3589, int i) {
        C3196 c3196 = this.f12445;
        if (c3196.m7897()) {
            return -3;
        }
        AbstractC3198 abstractC3198 = c3196.f12415;
        C4296 c4296 = this.f12444;
        if (abstractC3198 != null && abstractC3198.m7902(this.f12446 + 1) <= c4296.m9765()) {
            return -3;
        }
        m7903();
        return c4296.m9773(c5349, c3589, i, c3196.f12417);
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ */
    public final boolean mo4058() {
        C3196 c3196 = this.f12445;
        return !c3196.m7897() && this.f12444.m9782(c3196.f12417);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7904() {
        C3196 c3196 = this.f12445;
        boolean[] zArr = c3196.f12423;
        int i = this.f12446;
        AbstractC4464.m10132(zArr[i]);
        c3196.f12423[i] = false;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ */
    public final void mo4062() {
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ */
    public final int mo4066(long j) {
        C3196 c3196 = this.f12445;
        if (c3196.m7897()) {
            return 0;
        }
        boolean z = c3196.f12417;
        C4296 c4296 = this.f12444;
        int iM9777 = c4296.m9777(z, j);
        AbstractC3198 abstractC3198 = c3196.f12415;
        if (abstractC3198 != null) {
            iM9777 = Math.min(iM9777, abstractC3198.m7902(this.f12446 + 1) - c4296.m9765());
        }
        c4296.m9779(iM9777);
        if (iM9777 > 0) {
            m7903();
        }
        return iM9777;
    }
}
