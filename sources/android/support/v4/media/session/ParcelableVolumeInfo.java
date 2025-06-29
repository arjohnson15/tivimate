package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0000(3);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f19;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f20;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f21;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f22;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f23;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23);
        parcel.writeInt(this.f21);
        parcel.writeInt(this.f22);
        parcel.writeInt(this.f20);
        parcel.writeInt(this.f19);
    }
}
