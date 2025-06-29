package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.ᵢˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0664 implements InterfaceC0600, IInterface {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final IBinder f3073;

    public C0664(IBinder iBinder) {
        this.f3073 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3073;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m2711(int i, String str, String str2, Bundle bundle) {
        Parcel parcelM2712 = m2712();
        parcelM2712.writeInt(i);
        parcelM2712.writeString(str);
        parcelM2712.writeString(str2);
        int i2 = AbstractC0591.f2956;
        parcelM2712.writeInt(1);
        bundle.writeToParcel(parcelM2712, 0);
        Parcel parcelM2713 = m2713(parcelM2712, 10);
        int i3 = parcelM2713.readInt();
        parcelM2713.recycle();
        return i3;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Parcel m2712() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return parcelObtain;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Parcel m2713(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f3073.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
