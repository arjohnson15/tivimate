package p192;

import java.util.concurrent.ThreadFactory;

/* renamed from: ˎˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2667 implements ThreadFactory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ String f10560;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10561;

    public /* synthetic */ ThreadFactoryC2667(String str, int i) {
        this.f10561 = i;
        this.f10560 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f10561) {
            case 0:
                Thread thread = new Thread(runnable, this.f10560);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f10560);
        }
    }
}
