package p350;

import android.os.Parcel;
import android.os.Parcelable;
import p061.C1404;

/* renamed from: ᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4002 implements Parcelable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Parcelable f15438;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C4003 f15437 = new C4003();
    public static final Parcelable.Creator<AbstractC4002> CREATOR = new C1404(7);

    public AbstractC4002() {
        this.f15438 = null;
    }

    public AbstractC4002(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f15438 = parcelable == null ? f15437 : parcelable;
    }

    public AbstractC4002(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f15438 = parcelable == f15437 ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f15438, i);
    }
}
