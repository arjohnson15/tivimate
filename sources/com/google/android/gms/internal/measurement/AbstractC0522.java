package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0522 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ClassLoader f2867 = AbstractC0522.class.getClassLoader();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m2384(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m2385(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Parcelable m2386(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m2387(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(ـˈ.ˉᵎ.ˉⁱ("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
