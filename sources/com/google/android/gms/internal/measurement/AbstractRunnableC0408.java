package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.measurement.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0408 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f2696;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f2697;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2698;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f2699;

    public AbstractRunnableC0408(C0367 c0367, boolean z) {
        this.f2698 = c0367;
        c0367.f2615.getClass();
        this.f2699 = System.currentTimeMillis();
        c0367.f2615.getClass();
        this.f2696 = SystemClock.elapsedRealtime();
        this.f2697 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0367 c0367 = this.f2698;
        if (c0367.f2621) {
            mo2143();
            return;
        }
        try {
            mo1628();
        } catch (Exception e) {
            c0367.m2049(e, false, this.f2697);
            mo2143();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo2143() {
    }

    /* renamed from: ـﹶ */
    public abstract void mo1628();
}
