package p166;

import android.os.Parcel;
import android.os.Parcelable;
import p383.AbstractC4470;
import ˆٴ.ˉˏ;

/* renamed from: ˊﹶ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2418 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C2418> CREATOR = new ˉˏ(22);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f9630;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f9631;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f9632;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
    }

    public C2418() {
        this.f9632 = -1;
        this.f9630 = -1;
        this.f9631 = -1;
    }

    public C2418(Parcel parcel) {
        this.f9632 = parcel.readInt();
        this.f9630 = parcel.readInt();
        this.f9631 = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2418 c2418 = (C2418) obj;
        int i = this.f9632 - c2418.f9632;
        if (i != 0) {
            return i;
        }
        int i2 = this.f9630 - c2418.f9630;
        return i2 == 0 ? this.f9631 - c2418.f9631 : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2418.class != obj.getClass()) {
            return false;
        }
        C2418 c2418 = (C2418) obj;
        return this.f9632 == c2418.f9632 && this.f9630 == c2418.f9630 && this.f9631 == c2418.f9631;
    }

    public final int hashCode() {
        return (((this.f9632 * 31) + this.f9630) * 31) + this.f9631;
    }

    public final String toString() {
        return this.f9632 + "." + this.f9630 + "." + this.f9631;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9632);
        parcel.writeInt(this.f9630);
        parcel.writeInt(this.f9631);
    }
}
