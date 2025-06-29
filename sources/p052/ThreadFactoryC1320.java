package p052;

import java.util.concurrent.ThreadFactory;

/* renamed from: ʾʼ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC1320 implements ThreadFactory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5376;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f5377;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1322(runnable, this.f5377, this.f5376);
    }
}
