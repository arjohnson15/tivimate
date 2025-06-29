package p149;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import ˆٴ.ˉˏ;

/* renamed from: ˊʾ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2295 extends C2287 {
    public static final Parcelable.Creator<C2295> CREATOR = new ˉˏ(12);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public String f9075;

    public C2295(Parcel parcel) {
        super(parcel);
        this.f9075 = parcel.readString();
    }

    public C2295(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f9075);
    }
}
