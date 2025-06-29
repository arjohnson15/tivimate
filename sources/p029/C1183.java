package p029;

import android.os.SystemClock;
import android.util.Log;
import androidx.leanback.widget.ʿˏ;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p183.C2534;
import p183.EnumC2533;
import p251.C3136;
import p331.C3767;
import p415.C4742;
import p428.C4918;

/* renamed from: ʼˑ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1183 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final double f4891;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f4892;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f4893;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f4894;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final ʿˏ f4895;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f4896;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final double f4897;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayBlockingQueue f4898;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ThreadPoolExecutor f4899;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f4900;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3767 f4901;

    public C1183(ʿˏ r8, C4742 c4742, C3767 c3767) {
        double d = c4742.f18194;
        this.f4897 = d;
        this.f4891 = c4742.f18190;
        this.f4896 = c4742.f18193 * 1000;
        this.f4895 = r8;
        this.f4901 = c3767;
        this.f4900 = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f4892 = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f4898 = arrayBlockingQueue;
        this.f4899 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4893 = 0;
        this.f4894 = 0L;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4236(C4918 c4918, C3136 c3136) {
        String str = "Sending report through Google DataTransport: " + c4918.f18593;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        this.f4895.ˎٴ(new C2534(c4918.f18595, EnumC2533.f10071), new C1180(SystemClock.elapsedRealtime() - this.f4900 < 2000, this, c3136, c4918));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m4237() {
        if (this.f4894 == 0) {
            this.f4894 = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f4894) / this.f4896);
        int iMin = this.f4898.size() == this.f4892 ? Math.min(100, this.f4893 + iCurrentTimeMillis) : Math.max(0, this.f4893 - iCurrentTimeMillis);
        if (this.f4893 != iMin) {
            this.f4893 = iMin;
            this.f4894 = System.currentTimeMillis();
        }
        return iMin;
    }
}
