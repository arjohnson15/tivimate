package p291;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0087;
import java.util.ArrayList;
import ـˏ.ٴˎ;

/* renamed from: ٴᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3439 implements Parcelable {
    public static final Parcelable.Creator<C3439> CREATOR = new ٴˎ(23);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f13334;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f13335;

    public C3439(Parcel parcel) {
        this.f13335 = parcel.createStringArrayList();
        this.f13334 = parcel.createTypedArrayList(C0087.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f13335);
        parcel.writeTypedList(this.f13334);
    }
}
