package p189;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import ˆʽ.ᵎˏ;
import ˆٴ.ˉˏ;

/* renamed from: ˎʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2640 extends View.BaseSavedState {
    public static final Parcelable.Creator<C2640> CREATOR = new ˉˏ(27);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f10453;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f10453;
        return ᵎˏ.ˎٴ(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f10453));
    }
}
