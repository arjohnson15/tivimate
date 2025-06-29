package p049;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ʽﹳ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1311 extends Thread {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f5355;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final CountDownLatch f5356 = new CountDownLatch(1);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f5357 = false;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final WeakReference f5358;

    public C1311(C1308 c1308, long j) {
        this.f5358 = new WeakReference(c1308);
        this.f5355 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1308 c1308;
        WeakReference weakReference = this.f5358;
        try {
            if (this.f5356.await(this.f5355, TimeUnit.MILLISECONDS) || (c1308 = (C1308) weakReference.get()) == null) {
                return;
            }
            c1308.m4613();
            this.f5357 = true;
        } catch (InterruptedException unused) {
            C1308 c13082 = (C1308) weakReference.get();
            if (c13082 != null) {
                c13082.m4613();
                this.f5357 = true;
            }
        }
    }
}
