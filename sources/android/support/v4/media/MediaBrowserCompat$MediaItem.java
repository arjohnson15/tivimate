package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new ـﹶ(0);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final MediaDescriptionCompat f0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f1 = parcel.readInt();
        this.f0 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f1 + ", mDescription=" + this.f0 + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1);
        this.f0.writeToParcel(parcel, i);
    }
}
