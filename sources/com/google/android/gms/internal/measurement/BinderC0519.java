package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC0519 extends AbstractBinderC0558 implements InterfaceC0511 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f2862;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AtomicReference f2863;

    public BinderC0519() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f2863 = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m2379(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L37
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L37
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            throw r0
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.BinderC0519.m2379(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0558
    /* renamed from: ʽᐧ */
    public final boolean mo1630(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
        AbstractC0522.m2387(parcel);
        mo2130(bundle);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0511
    /* renamed from: ʿʼ */
    public final void mo2130(Bundle bundle) {
        synchronized (this.f2863) {
            try {
                try {
                    this.f2863.set(bundle);
                    this.f2862 = true;
                } finally {
                    this.f2863.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Bundle m2380(long j) {
        Bundle bundle;
        synchronized (this.f2863) {
            if (!this.f2862) {
                try {
                    this.f2863.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f2863.get();
        }
        return bundle;
    }
}
