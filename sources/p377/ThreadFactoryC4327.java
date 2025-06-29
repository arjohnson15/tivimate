package p377;

import java.util.concurrent.ThreadFactory;
import p026.C1157;

/* renamed from: ᵢי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC4327 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1157(runnable);
    }
}
