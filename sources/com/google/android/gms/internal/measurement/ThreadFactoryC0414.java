package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.ˎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC0414 implements ThreadFactory {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ThreadFactory f2706;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f2706.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
