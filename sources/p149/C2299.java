package p149;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import ˆٴ.ˉˏ;

/* renamed from: ˊʾ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2299 extends C2287 {
    public static final Parcelable.Creator<C2299> CREATOR = new ˉˏ(13);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public String f9084;

    public C2299(Parcel parcel) {
        super(parcel);
        this.f9084 = parcel.readString();
    }

    public C2299(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f9084);
    }
}
