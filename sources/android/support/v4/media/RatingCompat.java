package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new ـﹶ(3);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final float f12;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f13;

    public RatingCompat(int i, float f) {
        this.f13 = i;
        this.f12 = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f13);
        sb.append(" rating=");
        float f = this.f12;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13);
        parcel.writeFloat(this.f12);
    }
}
