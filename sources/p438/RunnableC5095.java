package p438;

import android.util.Pair;
import com.google.android.gms.internal.measurement.C0559;
import p033.C1220;
import p361.C4092;
import p374.C4290;

/* renamed from: ﹶﾞ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5095 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0559 f19380;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Pair f19381;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f19382;

    public /* synthetic */ RunnableC5095(C0559 c0559, Pair pair, int i) {
        this.f19382 = i;
        this.f19380 = c0559;
        this.f19381 = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19382) {
            case 0:
                C1220 c1220 = (C1220) ((C4092) this.f19380.f2913).f15797;
                Pair pair = this.f19381;
                c1220.mo2507(((Integer) pair.first).intValue(), (C4290) pair.second);
                break;
            case 1:
                C1220 c12202 = (C1220) ((C4092) this.f19380.f2913).f15797;
                Pair pair2 = this.f19381;
                c12202.mo2496(((Integer) pair2.first).intValue(), (C4290) pair2.second);
                break;
            default:
                C1220 c12203 = (C1220) ((C4092) this.f19380.f2913).f15797;
                Pair pair3 = this.f19381;
                c12203.mo2501(((Integer) pair3.first).intValue(), (C4290) pair3.second);
                break;
        }
    }
}
