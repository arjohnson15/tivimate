package p009;

import android.content.IntentFilter;
import android.util.Log;
import p329.AbstractC3742;

/* renamed from: ʻˋ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0998 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0983 f4347;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4348;

    public /* synthetic */ RunnableC0998(C0983 c0983, int i) {
        this.f4348 = i;
        this.f4347 = c0983;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4348) {
            case 0:
                C0983 c0983 = this.f4347;
                c0983.f4329 = c0983.m3949();
                try {
                    C0983 c09832 = this.f4347;
                    c09832.f4327.registerReceiver(c09832.f4328, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f4347.f4325 = true;
                    break;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    }
                    this.f4347.f4325 = false;
                    return;
                }
            case 1:
                if (this.f4347.f4325) {
                    this.f4347.f4325 = false;
                    C0983 c09833 = this.f4347;
                    c09833.f4327.unregisterReceiver(c09833.f4328);
                    break;
                }
                break;
            default:
                boolean z = this.f4347.f4329;
                C0983 c09834 = this.f4347;
                c09834.f4329 = c09834.m3949();
                if (z != this.f4347.f4329) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        String str = "connectivity changed, isConnected: " + this.f4347.f4329;
                    }
                    C0983 c09835 = this.f4347;
                    AbstractC3742.m8714().post(new RunnableC0997(1, c09835, c09835.f4329));
                    break;
                }
                break;
        }
    }
}
