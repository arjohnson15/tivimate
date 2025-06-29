package p004;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;
import android.view.View;
import p447.AbstractC5179;

/* renamed from: ʻʿ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0926 extends View.BaseSavedState {
    public static final Parcelable.Creator<C0926> CREATOR = new ـﹶ(7);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f4113;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC5179.m11550(sb, this.f4113, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4113);
    }
}
