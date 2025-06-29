package p424;

import android.os.Handler;
import androidx.media3.common.ParserException;
import p076.C1653;
import p166.C2401;
import p166.C2431;
import p166.InterfaceC2442;
import p246.C3117;
import p254.C3156;
import p254.InterfaceC3178;
import p374.C4240;
import p374.C4296;
import p383.AbstractC4470;
import p383.C4457;
import p392.C4520;
import p456.C5349;

/* renamed from: ﹶʾ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4904 implements InterfaceC3178 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C4898 f18564;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4296 f18566;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5349 f18563 = new C5349(19);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4520 f18565 = new C4520();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f18567 = -9223372036854775807L;

    public C4904(C4898 c4898, C1653 c1653) {
        this.f18564 = c4898;
        this.f18566 = new C4296(c1653, null, null);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʽᐧ */
    public final int mo7839(InterfaceC2442 interfaceC2442, int i, boolean z) {
        C4296 c4296 = this.f18566;
        c4296.getClass();
        return c4296.mo7839(interfaceC2442, i, z);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʿʼ */
    public final void mo7840(C2431 c2431) {
        this.f18566.mo7840(c2431);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ˑʽ */
    public final void mo7841(int i, C4457 c4457) {
        mo7844(c4457, i, 0);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ـﹶ */
    public final void mo7842(long j, int i, int i2, int i3, C3156 c3156) {
        long jM9768;
        long jM10204;
        this.f18566.mo7842(j, i, i2, i3, c3156);
        while (this.f18566.m9782(false)) {
            C4520 c4520 = this.f18565;
            c4520.mo8492();
            if (this.f18566.m9773(this.f18563, c4520, 0, false) == -4) {
                c4520.m8494();
            } else {
                c4520 = null;
            }
            if (c4520 != null) {
                long j2 = c4520.f13807;
                C2401 c2401 = this.f18564.f18510.ﹶˆ(c4520);
                if (c2401 != null) {
                    C3117 c3117 = (C3117) c2401.f9491[0];
                    String str = c3117.f12019;
                    String str2 = c3117.f12015;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jM10204 = AbstractC4470.m10204(AbstractC4470.m10188(c3117.f12016));
                        } catch (ParserException unused) {
                            jM10204 = -9223372036854775807L;
                        }
                        if (jM10204 != -9223372036854775807L) {
                            C4896 c4896 = new C4896(j2, jM10204);
                            Handler handler = this.f18564.f18512;
                            handler.sendMessage(handler.obtainMessage(1, c4896));
                        }
                    }
                }
            }
        }
        C4296 c4296 = this.f18566;
        C4240 c4240 = c4296.f16721;
        synchronized (c4296) {
            int i4 = c4296.f16727;
            jM9768 = i4 == 0 ? -1L : c4296.m9768(i4);
        }
        c4240.m9700(jM9768);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ٴˎ */
    public final int mo7843(InterfaceC2442 interfaceC2442, int i, boolean z) {
        return mo7839(interfaceC2442, i, z);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ﹳﹳ */
    public final void mo7844(C4457 c4457, int i, int i2) {
        C4296 c4296 = this.f18566;
        c4296.getClass();
        c4296.mo7844(c4457, i, 0);
    }
}
