package p179;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ˆٴ.ˉˏ;

/* renamed from: ˋᴵ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2493 implements Parcelable {
    public static final Parcelable.Creator<C2493> CREATOR = new ˉˏ(25);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f9917;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f9918;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f9919;

    public C2493(int i, long j, long j2) {
        AbstractC4464.m10142(j < j2);
        this.f9919 = j;
        this.f9917 = j2;
        this.f9918 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2493.class != obj.getClass()) {
            return false;
        }
        C2493 c2493 = (C2493) obj;
        return this.f9919 == c2493.f9919 && this.f9917 == c2493.f9917 && this.f9918 == c2493.f9918;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9919), Long.valueOf(this.f9917), Integer.valueOf(this.f9918)});
    }

    public final String toString() {
        int i = AbstractC4470.f17202;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f9919 + ", endTimeMs=" + this.f9917 + ", speedDivisor=" + this.f9918;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9919);
        parcel.writeLong(this.f9917);
        parcel.writeInt(this.f9918);
    }
}
