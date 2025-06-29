package p438;

import android.util.Pair;
import com.google.android.gms.internal.measurement.C0559;
import p033.C1220;
import p175.C2484;
import p361.C4092;
import p374.C4261;
import p374.C4290;

/* renamed from: ﹶﾞ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5094 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0559 f19375;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C2484 f19376;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Pair f19377;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C4261 f19378;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f19379;

    public /* synthetic */ RunnableC5094(C0559 c0559, Pair pair, C4261 c4261, C2484 c2484, int i) {
        this.f19379 = i;
        this.f19375 = c0559;
        this.f19377 = pair;
        this.f19378 = c4261;
        this.f19376 = c2484;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19379) {
            case 0:
                C1220 c1220 = (C1220) ((C4092) this.f19375.f2913).f15797;
                Pair pair = this.f19377;
                c1220.mo2482(((Integer) pair.first).intValue(), (C4290) pair.second, this.f19378, this.f19376);
                break;
            case 1:
                C1220 c12202 = (C1220) ((C4092) this.f19375.f2913).f15797;
                Pair pair2 = this.f19377;
                c12202.mo2510(((Integer) pair2.first).intValue(), (C4290) pair2.second, this.f19378, this.f19376);
                break;
            default:
                C1220 c12203 = (C1220) ((C4092) this.f19375.f2913).f15797;
                Pair pair3 = this.f19377;
                c12203.mo2485(((Integer) pair3.first).intValue(), (C4290) pair3.second, this.f19378, this.f19376);
                break;
        }
    }
}
