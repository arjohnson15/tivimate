package p456;

import p101.C1778;
import p331.C3759;
import p396.C4554;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5342 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ long f20715;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C5255 f20716;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20717;

    public /* synthetic */ RunnableC5342(C5255 c5255, long j, int i) {
        this.f20717 = i;
        this.f20715 = j;
        this.f20716 = c5255;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20717) {
            case 0:
                C5255 c5255 = this.f20716;
                c5255.m11846();
                c5255.m11755();
                C5301 c5301 = c5255.ˏᵢ();
                long j = this.f20715;
                c5301.f20566.m4531(Long.valueOf(j), "Activity resumed, time");
                C5236 c5236 = (C5236) ((ﹳﹳ) c5255).ᐧⁱ;
                boolean zM11727 = c5236.f20123.m11727(null, AbstractC5248.f20213);
                C5245 c5245 = c5236.f20123;
                C1778 c1778 = c5255.f20363;
                if (zM11727) {
                    if (c5245.m11729() || c5255.f20362) {
                        ((C5255) c1778.f6899).m11846();
                        ((C5235) c1778.f6898).m11844();
                        c1778.f6900 = j;
                        c1778.f6897 = j;
                    }
                } else if (c5245.m11729() || c5255.ᐧᴵ().f20478.m12010()) {
                    ((C5255) c1778.f6899).m11846();
                    ((C5235) c1778.f6898).m11844();
                    c1778.f6900 = j;
                    c1778.f6897 = j;
                }
                C3759 c3759 = c5255.f20364;
                C5255 c52552 = (C5255) c3759.f14523;
                c52552.m11846();
                RunnableC5251 runnableC5251 = (RunnableC5251) c3759.f14522;
                if (runnableC5251 != null) {
                    c52552.f20361.removeCallbacks(runnableC5251);
                }
                c52552.ᐧᴵ().f20478.m12011(false);
                c52552.m11846();
                c52552.f20362 = false;
                if (((C5236) ((ﹳﹳ) c52552).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20274) && c52552.m11847().f20155) {
                    c52552.ˏᵢ().f20566.m4533("Retrying trigger URI registration in foreground");
                    c52552.m11847().m11702();
                }
                C4554 c4554 = c5255.f20360;
                ((C5255) c4554.f17462).m11846();
                C5255 c52553 = (C5255) c4554.f17462;
                if (((C5236) ((ﹳﹳ) c52553).ᐧⁱ).m11662()) {
                    ((C5236) ((ﹳﹳ) c52553).ᐧⁱ).f20107.getClass();
                    c4554.m10433(false, System.currentTimeMillis());
                    break;
                }
                break;
            default:
                C5255 c52554 = this.f20716;
                c52554.m11846();
                c52554.m11755();
                C5301 c53012 = c52554.ˏᵢ();
                long j2 = this.f20715;
                c53012.f20566.m4531(Long.valueOf(j2), "Activity paused, time");
                C3759 c37592 = c52554.f20364;
                C5255 c52555 = (C5255) c37592.f14523;
                ((C5236) ((ﹳﹳ) c52555).ᐧⁱ).f20107.getClass();
                RunnableC5251 runnableC52512 = new RunnableC5251(c37592, System.currentTimeMillis(), j2);
                c37592.f14522 = runnableC52512;
                c52555.f20361.postDelayed(runnableC52512, 2000L);
                if (((C5236) ((ﹳﹳ) c52554).ᐧⁱ).f20123.m11729()) {
                    ((C5235) c52554.f20363.f6898).m11844();
                    break;
                }
                break;
        }
    }
}
