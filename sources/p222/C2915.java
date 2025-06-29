package p222;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import ˏ.ˑʽ;

/* renamed from: ˏᴵ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2915 extends View.BaseSavedState {
    public static final Parcelable.Creator<C2915> CREATOR = new ˑʽ(3);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f11294;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f11294 ? (byte) 1 : (byte) 0);
    }
}
