package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0319 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = ˈⁱ.ﹳﹳ.ᵔ(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < i) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    j = ˈⁱ.ﹳﹳ.ˋˉ(parcel, i2);
                    break;
                case 2:
                    j2 = ˈⁱ.ﹳﹳ.ˋˉ(parcel, i2);
                    break;
                case 3:
                    z = ˈⁱ.ﹳﹳ.ᵢʿ(parcel, i2);
                    break;
                case 4:
                    str = ˈⁱ.ﹳﹳ.ˉי(parcel, i2);
                    break;
                case 5:
                    str2 = ˈⁱ.ﹳﹳ.ˉי(parcel, i2);
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str3 = ˈⁱ.ﹳﹳ.ˉי(parcel, i2);
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    bundle = ˈⁱ.ﹳﹳ.ٴˎ(parcel, i2);
                    break;
                case '\b':
                    str4 = ˈⁱ.ﹳﹳ.ˉי(parcel, i2);
                    break;
                default:
                    ˈⁱ.ﹳﹳ.ᵔﹳ(parcel, i2);
                    break;
            }
        }
        ˈⁱ.ﹳﹳ.ˏᴵ(parcel, i);
        return new C0383(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0383[i];
    }
}
