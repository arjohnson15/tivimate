package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0339 extends AbstractC0482 implements InterfaceC0404 {
    public C0339(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0404
    /* renamed from: ـﹶ */
    public final int mo1812() {
        Parcel parcelM2290 = m2290(m2287(), 2);
        int i = parcelM2290.readInt();
        parcelM2290.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0404
    /* renamed from: ᵎˏ */
    public final void mo1813(long j, Bundle bundle, String str, String str2) {
        Parcel parcelM2287 = m2287();
        parcelM2287.writeString(str);
        parcelM2287.writeString(str2);
        AbstractC0522.m2385(parcelM2287, bundle);
        parcelM2287.writeLong(j);
        m2291(parcelM2287, 1);
    }
}
