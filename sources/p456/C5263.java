package p456;

import java.lang.Thread;

/* renamed from: ﾞⁱ.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5263 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C5247 f20386;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f20387;

    public C5263(C5247 c5247, String str) {
        this.f20386 = c5247;
        this.f20387 = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f20386.ˏᵢ().f20571.m4531(th, this.f20387);
    }
}
