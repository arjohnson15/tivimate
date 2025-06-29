package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.leanback.widget.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0186 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C0197 c0197 = new C0197();
        c0197.f1195 = Bundle.EMPTY;
        c0197.f1196 = parcel.readInt();
        c0197.f1195 = parcel.readBundle(GridLayoutManager.class.getClassLoader());
        return c0197;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0197[i];
    }
}
