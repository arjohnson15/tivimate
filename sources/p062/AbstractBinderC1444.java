package p062;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ʾٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1444 extends Binder implements IInterface {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f5914 = 1;

    public AbstractBinderC1444(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f5914) {
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo4997(i, parcel, parcel2);
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean mo4997(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }
}
