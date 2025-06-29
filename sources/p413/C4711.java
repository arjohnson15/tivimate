package p413;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p061.C1404;
import p350.AbstractC4002;

/* renamed from: ﹳי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4711 extends AbstractC4002 {
    public static final Parcelable.Creator<C4711> CREATOR = new C1404(9);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f18080;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f18081;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f18082;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean f18083;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean f18084;

    public C4711(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18081 = parcel.readInt();
        this.f18082 = parcel.readInt();
        this.f18080 = parcel.readInt() == 1;
        this.f18083 = parcel.readInt() == 1;
        this.f18084 = parcel.readInt() == 1;
    }

    public C4711(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f18081 = bottomSheetBehavior.f3169;
        this.f18082 = bottomSheetBehavior.f3144;
        this.f18080 = bottomSheetBehavior.f3142;
        this.f18083 = bottomSheetBehavior.f3155;
        this.f18084 = bottomSheetBehavior.f3172;
    }

    @Override // p350.AbstractC4002, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f18081);
        parcel.writeInt(this.f18082);
        parcel.writeInt(this.f18080 ? 1 : 0);
        parcel.writeInt(this.f18083 ? 1 : 0);
        parcel.writeInt(this.f18084 ? 1 : 0);
    }
}
