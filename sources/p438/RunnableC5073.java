package p438;

import android.util.Pair;
import com.google.android.gms.internal.measurement.C0559;
import p033.C1220;
import p175.C2484;
import p361.C4092;
import p374.C4290;

/* renamed from: ﹶﾞ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5073 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0559 f19231;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Pair f19232;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C2484 f19233;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f19234;

    public /* synthetic */ RunnableC5073(C0559 c0559, Pair pair, C2484 c2484, int i) {
        this.f19234 = i;
        this.f19231 = c0559;
        this.f19232 = pair;
        this.f19233 = c2484;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19234) {
            case 0:
                C1220 c1220 = (C1220) ((C4092) this.f19231.f2913).f15797;
                Pair pair = this.f19232;
                int iIntValue = ((Integer) pair.first).intValue();
                C4290 c4290 = (C4290) pair.second;
                c4290.getClass();
                c1220.mo2481(iIntValue, c4290, this.f19233);
                break;
            default:
                C1220 c12202 = (C1220) ((C4092) this.f19231.f2913).f15797;
                Pair pair2 = this.f19232;
                c12202.mo2488(((Integer) pair2.first).intValue(), (C4290) pair2.second, this.f19233);
                break;
        }
    }
}
