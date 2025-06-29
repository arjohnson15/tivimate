package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0000(4);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f24;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final long f25;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final long f26;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f27;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ArrayList f28;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final float f29;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f30;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long f31;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f32;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final CharSequence f33;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final Bundle f34;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0003();

        /* renamed from: ˆʿ, reason: contains not printable characters */
        public final CharSequence f35;

        /* renamed from: ˎˑ, reason: contains not printable characters */
        public final int f36;

        /* renamed from: ᐧˋ, reason: contains not printable characters */
        public final Bundle f37;

        /* renamed from: ᐧⁱ, reason: contains not printable characters */
        public final String f38;

        public CustomAction(Parcel parcel) {
            this.f38 = parcel.readString();
            this.f35 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f36 = parcel.readInt();
            this.f37 = parcel.readBundle(AbstractC0001.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f35) + ", mIcon=" + this.f36 + ", mExtras=" + this.f37;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f38);
            TextUtils.writeToParcel(this.f35, parcel, i);
            parcel.writeInt(this.f36);
            parcel.writeBundle(this.f37);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f30 = parcel.readInt();
        this.f24 = parcel.readLong();
        this.f29 = parcel.readFloat();
        this.f26 = parcel.readLong();
        this.f27 = parcel.readLong();
        this.f25 = parcel.readLong();
        this.f33 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f28 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f31 = parcel.readLong();
        this.f34 = parcel.readBundle(AbstractC0001.class.getClassLoader());
        this.f32 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f30);
        sb.append(", position=");
        sb.append(this.f24);
        sb.append(", buffered position=");
        sb.append(this.f27);
        sb.append(", speed=");
        sb.append(this.f29);
        sb.append(", updated=");
        sb.append(this.f26);
        sb.append(", actions=");
        sb.append(this.f25);
        sb.append(", error code=");
        sb.append(this.f32);
        sb.append(", error message=");
        sb.append(this.f33);
        sb.append(", custom actions=");
        sb.append(this.f28);
        sb.append(", active item id=");
        return AbstractC0002.m42(sb, this.f31, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30);
        parcel.writeLong(this.f24);
        parcel.writeFloat(this.f29);
        parcel.writeLong(this.f26);
        parcel.writeLong(this.f27);
        parcel.writeLong(this.f25);
        TextUtils.writeToParcel(this.f33, parcel, i);
        parcel.writeTypedList(this.f28);
        parcel.writeLong(this.f31);
        parcel.writeBundle(this.f34);
        parcel.writeInt(this.f32);
    }
}
