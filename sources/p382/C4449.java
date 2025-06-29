package p382;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ᵢᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4449 implements InterfaceC4452, IInterface {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final IBinder f17142;

    public C4449(IBinder iBinder) {
        this.f17142 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17142;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Parcel m10065(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f17142.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
