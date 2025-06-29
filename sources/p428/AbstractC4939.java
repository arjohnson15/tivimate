package p428;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p251.C3130;
import p362.C4125;

/* renamed from: ﹶˊ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4939 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ExecutorService f18686 = AbstractC4928.m11052("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Object m11064(C3130 c3130) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c3130.m7690(f18686, new C4125(10, countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (c3130.m7685()) {
            return c3130.m7689();
        }
        if (c3130.f12086) {
            throw new CancellationException("Task is already canceled");
        }
        if (c3130.m7693()) {
            throw new IllegalStateException(c3130.m7684());
        }
        throw new TimeoutException();
    }
}
