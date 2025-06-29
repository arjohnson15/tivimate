package p065;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import p072.AbstractC1642;

/* renamed from: ʾᵔ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC1519 extends Binder implements InterfaceC1480 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ C1526 f6181;

    public BinderC1519(C1526 c1526) {
        this.f6181 = c1526;
        attachInterface(this, InterfaceC1480.f6024);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC1480.f6024;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo5032(parcel.createStringArray());
        return true;
    }

    @Override // p065.InterfaceC1480
    /* renamed from: ˏᴵ */
    public final void mo5032(String[] strArr) {
        C1526 c1526 = this.f6181;
        AbstractC1642.m5294(c1526.f6207, null, 0, new C1503(c1526, strArr, null), 3);
    }
}
