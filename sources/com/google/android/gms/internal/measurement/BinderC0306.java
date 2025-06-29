package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import p440.C5124;

/* renamed from: com.google.android.gms.internal.measurement.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC0306 extends AbstractBinderC0558 implements InterfaceC0404 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5124 f2423;

    public BinderC0306(C5124 c5124) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f2423 = c5124;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0558
    /* renamed from: ʽᐧ */
    public final boolean mo1630(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            AbstractC0522.m2387(parcel);
            mo1813(j, bundle, string, string2);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f2423);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0404
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int mo1812() {
        return System.identityHashCode(this.f2423);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0404
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo1813(long j, Bundle bundle, String str, String str2) {
        this.f2423.mo11398(j, bundle, str, str2);
    }
}
