package p291;

import android.util.Log;
import androidx.fragment.app.C0091;
import androidx.fragment.app.C0107;

/* renamed from: ٴᐧ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3441 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0091 f13337;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C0107 f13338;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13339;

    public /* synthetic */ RunnableC3441(C0091 c0091, C0107 c0107, int i) {
        this.f13339 = i;
        this.f13337 = c0091;
        this.f13338 = c0107;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13339) {
            case 0:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
                C0091 c0091 = this.f13337;
                if (zIsLoggable) {
                    String str = "Transition for operation " + c0091 + " has completed";
                }
                c0091.m602(this.f13338);
                break;
            default:
                boolean zIsLoggable2 = Log.isLoggable("FragmentManager", 2);
                C0091 c00912 = this.f13337;
                if (zIsLoggable2) {
                    String str2 = "Transition for operation " + c00912 + " has completed";
                }
                c00912.m602(this.f13338);
                break;
        }
    }
}
