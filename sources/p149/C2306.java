package p149;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import ˆٴ.ˉˏ;

/* renamed from: ˊʾ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2306 extends C2287 {
    public static final Parcelable.Creator<C2306> CREATOR = new ˉˏ(18);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f9105;

    public C2306(Parcel parcel) {
        super(parcel);
        this.f9105 = parcel.readInt() == 1;
    }

    public C2306(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9105 ? 1 : 0);
    }
}
