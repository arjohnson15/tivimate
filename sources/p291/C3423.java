package p291;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0087;
import java.util.ArrayList;
import ـˏ.ٴˎ;

/* renamed from: ٴᐧ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3423 implements Parcelable {
    public static final Parcelable.Creator<C3423> CREATOR = new ٴˎ(25);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ArrayList f13294;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public String f13295;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public ArrayList f13296;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C0087[] f13297;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f13298;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ArrayList f13299;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public ArrayList f13300;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ArrayList f13301;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f13299);
        parcel.writeStringList(this.f13294);
        parcel.writeTypedArray(this.f13297, i);
        parcel.writeInt(this.f13298);
        parcel.writeString(this.f13295);
        parcel.writeStringList(this.f13300);
        parcel.writeTypedList(this.f13301);
        parcel.writeTypedList(this.f13296);
    }
}
