package p141;

import android.os.Handler;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.Closeable;
import p345.C3930;
import p383.AbstractC4470;

/* renamed from: ˉˑ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2195 implements Runnable, Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f8627;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f8628;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C2209 f8629;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Handler f8630 = AbstractC4470.m10200(null);

    public RunnableC2195(C2209 c2209, long j) {
        this.f8629 = c2209;
        this.f8627 = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8628 = false;
        this.f8630.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2209 c2209 = this.f8629;
        ᐧʻ r1 = c2209.f8732;
        r1.ﹳˑ(r1.ˏʾ(4, c2209.f8733, C3930.f15266, c2209.f8719));
        this.f8630.postDelayed(this, this.f8627);
    }
}
