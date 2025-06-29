package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new ـﹶ(1);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final CharSequence f2;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Bitmap f3;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Uri f4;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final CharSequence f5;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public MediaDescription f6;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final CharSequence f7;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f8;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Uri f9;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Bundle f10;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f8 = str;
        this.f2 = charSequence;
        this.f5 = charSequence2;
        this.f7 = charSequence3;
        this.f3 = bitmap;
        this.f9 = uri;
        this.f10 = bundle;
        this.f4 = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f2) + ", " + ((Object) this.f5) + ", " + ((Object) this.f7);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionM66 = this.f6;
        if (mediaDescriptionM66 == null) {
            MediaDescription.Builder builderM56 = AbstractC0004.m56();
            AbstractC0004.m69(builderM56, this.f8);
            AbstractC0004.m65(builderM56, this.f2);
            AbstractC0004.m62(builderM56, this.f5);
            AbstractC0004.m58(builderM56, this.f7);
            AbstractC0004.m59(builderM56, this.f3);
            AbstractC0004.m60(builderM56, this.f9);
            Bundle bundle2 = this.f10;
            Uri uri = this.f4;
            if (i2 >= 23 || uri == null) {
                AbstractC0004.m61(builderM56, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                AbstractC0004.m61(builderM56, bundle);
            }
            if (i2 >= 23) {
                AbstractC0006.m102(builderM56, uri);
            }
            mediaDescriptionM66 = AbstractC0004.m66(builderM56);
            this.f6 = mediaDescriptionM66;
        }
        mediaDescriptionM66.writeToParcel(parcel, i);
    }
}
