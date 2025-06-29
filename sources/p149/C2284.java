package p149;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import ˆٴ.ˉˏ;

/* renamed from: ˊʾ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2284 extends C2287 {
    public static final Parcelable.Creator<C2284> CREATOR = new ˉˏ(17);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f9056;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f9057;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f9058;

    public C2284(Parcel parcel) {
        super(parcel);
        this.f9058 = parcel.readInt();
        this.f9056 = parcel.readInt();
        this.f9057 = parcel.readInt();
    }

    public C2284(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9058);
        parcel.writeInt(this.f9056);
        parcel.writeInt(this.f9057);
    }
}
