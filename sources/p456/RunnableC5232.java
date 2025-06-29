package p456;

import android.content.ComponentName;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʻˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5232 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ServiceConnectionC5246 f20081;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20082;

    public /* synthetic */ RunnableC5232(ServiceConnectionC5246 serviceConnectionC5246, int i) {
        this.f20082 = i;
        this.f20081 = serviceConnectionC5246;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20082) {
            case 0:
                ServiceConnectionC5246 serviceConnectionC5246 = this.f20081;
                C5272 c5272 = serviceConnectionC5246.f20172;
                ComponentName componentName = new ComponentName(((C5236) ((ﹳﹳ) serviceConnectionC5246.f20172).ᐧⁱ).f20114, "com.google.android.gms.measurement.AppMeasurementService");
                c5272.m11846();
                if (c5272.f20411 != null) {
                    c5272.f20411 = null;
                    c5272.ˏᵢ().f20566.m4531(componentName, "Disconnected from device MeasurementService");
                    c5272.m11846();
                    c5272.m11781();
                    break;
                }
                break;
            default:
                C5272 c52722 = this.f20081.f20172;
                c52722.f20411 = null;
                c52722.m11778();
                break;
        }
    }
}
