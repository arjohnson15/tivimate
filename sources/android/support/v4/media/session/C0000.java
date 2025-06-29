package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* renamed from: android.support.v4.media.session.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0000 implements Parcelable.Creator {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f39;

    public /* synthetic */ C0000(int i) {
        this.f39 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f39) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f16 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0000(1);

                    /* renamed from: ˆʿ, reason: contains not printable characters */
                    public final long f14;

                    /* renamed from: ᐧⁱ, reason: contains not printable characters */
                    public final MediaDescriptionCompat f15;

                    {
                        this.f15 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f14 = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb.append(this.f15);
                        sb.append(", Id=");
                        return AbstractC0002.m42(sb, this.f14, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f15.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.f14);
                    }
                };
            case 2:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0000(2);

                    /* renamed from: ˆʿ, reason: contains not printable characters */
                    public final Parcelable f17;

                    /* renamed from: ᐧⁱ, reason: contains not printable characters */
                    public final Object f18;

                    {
                        this.f17 = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Parcelable parcelable2 = this.f17;
                        if (parcelable2 == null) {
                            return mediaSessionCompat$Token.f17 == null;
                        }
                        Parcelable parcelable3 = mediaSessionCompat$Token.f17;
                        if (parcelable3 == null) {
                            return false;
                        }
                        return parcelable2.equals(parcelable3);
                    }

                    public final int hashCode() {
                        Parcelable parcelable2 = this.f17;
                        if (parcelable2 == null) {
                            return 0;
                        }
                        return parcelable2.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable(this.f17, i);
                    }
                };
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f23 = parcel.readInt();
                parcelableVolumeInfo.f21 = parcel.readInt();
                parcelableVolumeInfo.f22 = parcel.readInt();
                parcelableVolumeInfo.f20 = parcel.readInt();
                parcelableVolumeInfo.f19 = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f39) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 1:
                return new MediaSessionCompat$QueueItem[i];
            case 2:
                return new MediaSessionCompat$Token[i];
            case 3:
                return new ParcelableVolumeInfo[i];
            default:
                return new PlaybackStateCompat[i];
        }
    }
}
