package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.leanback.widget.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0197 implements Parcelable {
    public static final Parcelable.Creator<C0197> CREATOR = new C0186();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Bundle f1195;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f1196;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1196);
        parcel.writeBundle(this.f1195);
    }
}
