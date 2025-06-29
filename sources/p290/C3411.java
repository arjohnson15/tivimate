package p290;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p061.C1404;
import p350.AbstractC4002;

/* renamed from: ٴٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3411 extends AbstractC4002 {
    public static final Parcelable.Creator<C3411> CREATOR = new C1404(4);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f13269;

    public C3411(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13269 = parcel.readInt();
    }

    public C3411(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f13269 = sideSheetBehavior.f3376;
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f13269);
    }
}
