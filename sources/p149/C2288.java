package p149;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import ˆٴ.ˉˏ;

/* renamed from: ˊʾ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2288 extends C2287 {
    public static final Parcelable.Creator<C2288> CREATOR = new ˉˏ(16);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f9063;

    public C2288(Parcel parcel) {
        super(parcel);
        this.f9063 = parcel.readInt();
    }

    public C2288(AbsSavedState absSavedState, int i) {
        super(absSavedState);
        this.f9063 = i;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9063);
    }
}
