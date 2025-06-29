package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0463 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public /* synthetic */ C0397 f2782;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f2783;

    public /* synthetic */ CallableC0463(int i) {
        this.f2783 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2783) {
            case 0:
                C0397 c0397 = this.f2782;
                c0397.getClass();
                C0453 c0453 = new C0453("internal.registerCallback");
                c0453.f2758 = c0397.f2677;
                return c0453;
            default:
                return new C0453(this.f2782.f2675);
        }
    }
}
