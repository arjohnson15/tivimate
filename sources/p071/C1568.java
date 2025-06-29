package p071;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;

/* renamed from: ʿʼ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1568 implements Parcelable {
    public static final Parcelable.Creator<C1568> CREATOR = new ـﹶ(22);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Intent f6310;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f6311;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f6312;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final IntentSender f6313;

    public C1568(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f6313 = intentSender;
        this.f6310 = intent;
        this.f6311 = i;
        this.f6312 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6313, i);
        parcel.writeParcelable(this.f6310, i);
        parcel.writeInt(this.f6311);
        parcel.writeInt(this.f6312);
    }
}
