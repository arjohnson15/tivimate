package p061;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;
import java.util.ArrayList;

/* renamed from: ʾـ.ᵢﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1427 implements Parcelable {
    public static final Parcelable.Creator<C1427> CREATOR = new ـﹶ(20);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5836;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f5837;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f5838;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f5839;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f5840;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int[] f5841;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f5842;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f5843;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int[] f5844;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ArrayList f5845;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5842);
        parcel.writeInt(this.f5836);
        parcel.writeInt(this.f5839);
        if (this.f5839 > 0) {
            parcel.writeIntArray(this.f5841);
        }
        parcel.writeInt(this.f5837);
        if (this.f5837 > 0) {
            parcel.writeIntArray(this.f5844);
        }
        parcel.writeInt(this.f5838 ? 1 : 0);
        parcel.writeInt(this.f5840 ? 1 : 0);
        parcel.writeInt(this.f5843 ? 1 : 0);
        parcel.writeList(this.f5845);
    }
}
