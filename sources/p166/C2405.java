package p166;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p383.AbstractC4470;
import ˆٴ.ˉˏ;

/* renamed from: ˊﹶ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2405 implements Comparator, Parcelable {
    public static final Parcelable.Creator<C2405> CREATOR = new ˉˏ(19);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f9500;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f9501;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f9502;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2413[] f9503;

    public C2405(Parcel parcel) {
        this.f9501 = parcel.readString();
        C2413[] c2413Arr = (C2413[]) parcel.createTypedArray(C2413.CREATOR);
        int i = AbstractC4470.f17202;
        this.f9503 = c2413Arr;
        this.f9502 = c2413Arr.length;
    }

    public C2405(String str, ArrayList arrayList) {
        this(str, false, (C2413[]) arrayList.toArray(new C2413[0]));
    }

    public C2405(String str, boolean z, C2413... c2413Arr) {
        this.f9501 = str;
        c2413Arr = z ? (C2413[]) c2413Arr.clone() : c2413Arr;
        this.f9503 = c2413Arr;
        this.f9502 = c2413Arr.length;
        Arrays.sort(c2413Arr, this);
    }

    public C2405(C2413... c2413Arr) {
        this(null, true, c2413Arr);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2413 c2413 = (C2413) obj;
        C2413 c24132 = (C2413) obj2;
        UUID uuid = AbstractC2424.f9644;
        return uuid.equals(c2413.f9581) ? uuid.equals(c24132.f9581) ? 0 : 1 : c2413.f9581.compareTo(c24132.f9581);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2405.class != obj.getClass()) {
            return false;
        }
        C2405 c2405 = (C2405) obj;
        return AbstractC4470.m10194(this.f9501, c2405.f9501) && Arrays.equals(this.f9503, c2405.f9503);
    }

    public final int hashCode() {
        if (this.f9500 == 0) {
            String str = this.f9501;
            this.f9500 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f9503);
        }
        return this.f9500;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9501);
        parcel.writeTypedArray(this.f9503, 0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2405 m6494(String str) {
        return AbstractC4470.m10194(this.f9501, str) ? this : new C2405(str, false, this.f9503);
    }
}
