package p045;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ـﹶ;

/* renamed from: ʽᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1302 implements Parcelable {
    public static final Parcelable.Creator<C1302> CREATOR = new ـﹶ(14);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC1299 f5325;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f5325 == null) {
                    this.f5325 = new BinderC1300(this);
                }
                parcel.writeStrongBinder(this.f5325.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ */
    public void mo0(int i, Bundle bundle) {
    }
}
