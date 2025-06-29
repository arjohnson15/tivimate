package p457;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p080.AbstractC1702;

/* renamed from: ﾞﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC5373 implements ThreadFactory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20842;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicInteger f20843 = new AtomicInteger(0);

    public ThreadFactoryC5373(boolean z) {
        this.f20842 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbM5407 = AbstractC1702.m5407(this.f20842 ? "WM.task-" : "androidx.work-");
        sbM5407.append(this.f20843.incrementAndGet());
        return new Thread(runnable, sbM5407.toString());
    }
}
