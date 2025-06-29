package p065;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ʾᵔ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1528 implements InterfaceC1480 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public IBinder f6209;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6209;
    }

    @Override // p065.InterfaceC1480
    /* renamed from: ˏᴵ */
    public final void mo5032(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1480.f6024);
            parcelObtain.writeStringArray(strArr);
            this.f6209.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
