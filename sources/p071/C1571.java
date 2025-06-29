package p071;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;

/* renamed from: ʿʼ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1571 implements Parcelable {
    public static final Parcelable.Creator<C1571> CREATOR = new ـﹶ(21);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Intent f6321;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f6322;

    public C1571(Intent intent, int i) {
        this.f6322 = i;
        this.f6321 = intent;
    }

    public C1571(Parcel parcel) {
        this.f6322 = parcel.readInt();
        this.f6321 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f6322;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f6321);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6322);
        Intent intent = this.f6321;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
