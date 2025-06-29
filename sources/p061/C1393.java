package p061;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;

/* renamed from: ʾـ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1393 implements Parcelable {
    public static final Parcelable.Creator<C1393> CREATOR = new ـﹶ(18);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5676;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f5677;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f5678;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5678);
        parcel.writeInt(this.f5676);
        parcel.writeInt(this.f5677 ? 1 : 0);
    }
}
