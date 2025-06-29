package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import p287.C3391;
import p287.InterfaceC3392;
import ـˏ.ٴˎ;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new ٴˎ(21);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3392 f1749;

    public ParcelImpl(Parcel parcel) {
        this.f1749 = new C3391(parcel).m8258();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new C3391(parcel).m8256(this.f1749);
    }
}
