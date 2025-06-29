package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0705 implements Parcelable {
    public static final Parcelable.Creator<C0705> CREATOR = new android.support.v4.media.ـﹶ(5);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f3345;

    public C0705(long j) {
        this.f3345 = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0705) && this.f3345 == ((C0705) obj).f3345;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3345)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3345);
    }
}
