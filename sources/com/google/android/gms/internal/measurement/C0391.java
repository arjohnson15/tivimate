package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0391 extends AbstractC0482 implements InterfaceC0511 {
    public C0391(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0511
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo2130(Bundle bundle) {
        Parcel parcelM2287 = m2287();
        AbstractC0522.m2385(parcelM2287, bundle);
        m2291(parcelM2287, 1);
    }
}
