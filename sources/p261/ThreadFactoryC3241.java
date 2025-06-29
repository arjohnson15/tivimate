package p261;

import java.util.concurrent.ThreadFactory;
import p123.RunnableC2003;

/* renamed from: ـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC3241 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC2003(runnable, 1), "glide-active-resources");
    }
}
