package p291;

import android.os.Parcel;
import android.os.Parcelable;
import ـˏ.ٴˎ;

/* renamed from: ٴᐧ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3427 implements Parcelable {
    public static final Parcelable.Creator<C3427> CREATOR = new ٴˎ(24);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f13305;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public String f13306;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13306);
        parcel.writeInt(this.f13305);
    }
}
