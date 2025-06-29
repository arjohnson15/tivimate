package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0682 implements Parcelable {
    public static final Parcelable.Creator<C0682> CREATOR = new android.support.v4.media.ـﹶ(4);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0702 f3254;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f3255;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C0705 f3256;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0702 f3257;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0702 f3258;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f3259;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f3260;

    public C0682(C0702 c0702, C0702 c07022, C0705 c0705, C0702 c07023, int i) {
        Objects.requireNonNull(c0702, "start cannot be null");
        Objects.requireNonNull(c07022, "end cannot be null");
        Objects.requireNonNull(c0705, "validator cannot be null");
        this.f3258 = c0702;
        this.f3254 = c07022;
        this.f3257 = c07023;
        this.f3255 = i;
        this.f3256 = c0705;
        if (c07023 != null && c0702.f3339.compareTo(c07023.f3339) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c07023 != null && c07023.f3339.compareTo(c07022.f3339) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC0696.m2869(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f3260 = c0702.m2874(c07022) + 1;
        this.f3259 = (c07022.f3337 - c0702.f3337) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0682)) {
            return false;
        }
        C0682 c0682 = (C0682) obj;
        return this.f3258.equals(c0682.f3258) && this.f3254.equals(c0682.f3254) && Objects.equals(this.f3257, c0682.f3257) && this.f3255 == c0682.f3255 && this.f3256.equals(c0682.f3256);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3258, this.f3254, this.f3257, Integer.valueOf(this.f3255), this.f3256});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3258, 0);
        parcel.writeParcelable(this.f3254, 0);
        parcel.writeParcelable(this.f3257, 0);
        parcel.writeParcelable(this.f3256, 0);
        parcel.writeInt(this.f3255);
    }
}
