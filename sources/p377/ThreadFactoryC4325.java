package p377;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p026.C1157;
import p251.RunnableC3129;

/* renamed from: ᵢי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC4325 implements ThreadFactory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f16800;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AtomicInteger f16801;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4326 f16802;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ThreadFactoryC4327 f16803;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f16804;

    public ThreadFactoryC4325(ThreadFactoryC4327 threadFactoryC4327, String str, boolean z) {
        C4326 c4326 = C4326.f16805;
        this.f16801 = new AtomicInteger();
        this.f16803 = threadFactoryC4327;
        this.f16800 = str;
        this.f16802 = c4326;
        this.f16804 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC3129 runnableC3129 = new RunnableC3129(this, 16, runnable);
        this.f16803.getClass();
        C1157 c1157 = new C1157(runnableC3129);
        c1157.setName("glide-" + this.f16800 + "-thread-" + this.f16801.getAndIncrement());
        return c1157;
    }
}
