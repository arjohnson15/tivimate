package p009;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;
import p305.C3532;

/* renamed from: ʻˋ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0983 implements InterfaceC0991 {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final Executor f4323 = AsyncTask.SERIAL_EXECUTOR;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0988 f4324;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public volatile boolean f4325;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3532 f4326;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f4327;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C0996 f4328 = new C0996(0, this);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile boolean f4329;

    public C0983(Context context, C3532 c3532, C0988 c0988) {
        this.f4327 = context.getApplicationContext();
        this.f4326 = c3532;
        this.f4324 = c0988;
    }

    @Override // p009.InterfaceC0991
    /* renamed from: ʽᐧ */
    public final boolean mo1602() {
        f4323.execute(new RunnableC0998(this, 0));
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m3949() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f4326.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
            }
            return true;
        }
    }

    @Override // p009.InterfaceC0991
    /* renamed from: ـﹶ */
    public final void mo1607() {
        f4323.execute(new RunnableC0998(this, 1));
    }
}
