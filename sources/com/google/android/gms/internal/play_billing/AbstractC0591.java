package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.play_billing.ʼﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0591 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f2956 = 0;

    static {
        AbstractC0591.class.getClassLoader();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Parcelable m2556(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
