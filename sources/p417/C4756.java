package p417;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ﹳᴵ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4756 implements IInterface {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final IBinder f18246;

    public C4756(IBinder iBinder) {
        this.f18246 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18246;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10691(BinderC4776 binderC4776, C4765 c4765) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(binderC4776);
            parcelObtain.writeInt(1);
            C4749.m10672(c4765, parcelObtain, 0);
            this.f18246.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
