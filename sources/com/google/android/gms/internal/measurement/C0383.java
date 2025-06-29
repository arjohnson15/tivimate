package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177.AbstractC2491;

/* renamed from: com.google.android.gms.internal.measurement.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0383 extends AbstractC2491 {
    public static final Parcelable.Creator<C0383> CREATOR = new C0319();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f2650;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f2651;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final String f2652;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f2653;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f2654;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f2655;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final String f2656;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Bundle f2657;

    public C0383(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f2655 = j;
        this.f2650 = j2;
        this.f2653 = z;
        this.f2654 = str;
        this.f2651 = str2;
        this.f2656 = str3;
        this.f2657 = bundle;
        this.f2652 = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = ˈⁱ.ˉⁱ.ˑﾞ(parcel, 20293);
        ˈⁱ.ˉⁱ.ᵢٴ(parcel, 1, 8);
        parcel.writeLong(this.f2655);
        ˈⁱ.ˉⁱ.ᵢٴ(parcel, 2, 8);
        parcel.writeLong(this.f2650);
        ˈⁱ.ˉⁱ.ᵢٴ(parcel, 3, 4);
        parcel.writeInt(this.f2653 ? 1 : 0);
        ˈⁱ.ˉⁱ.ᴵʼ(parcel, 4, this.f2654);
        ˈⁱ.ˉⁱ.ᴵʼ(parcel, 5, this.f2651);
        ˈⁱ.ˉⁱ.ᴵʼ(parcel, 6, this.f2656);
        ˈⁱ.ˉⁱ.ﹳﹶ(parcel, 7, this.f2657);
        ˈⁱ.ˉⁱ.ᴵʼ(parcel, 8, this.f2652);
        ˈⁱ.ˉⁱ.ˑⁱ(parcel, i2);
    }
}
