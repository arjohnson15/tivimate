package p291;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p061.C1404;

/* renamed from: ٴᐧ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3445 implements Parcelable {
    public static final Parcelable.Creator<C3445> CREATOR = new C1404(5);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Bundle f13344;

    public C3445(Bundle bundle) {
        this.f13344 = bundle;
    }

    public C3445(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f13344 = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f13344);
    }
}
