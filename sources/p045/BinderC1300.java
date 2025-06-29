package p045;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ʽᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC1300 extends Binder implements InterfaceC1299 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final /* synthetic */ int f5322 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ C1302 f5323;

    public BinderC1300(C1302 c1302) {
        this.f5323 = c1302;
        attachInterface(this, InterfaceC1299.f5321);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC1299.f5321;
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
        int i3 = parcel.readInt();
        Object objCreateFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
        C1302 c1302 = this.f5323;
        c1302.getClass();
        c1302.mo0(i3, (Bundle) objCreateFromParcel);
        return true;
    }
}
