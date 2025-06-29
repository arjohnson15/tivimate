package p065;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ʾᵔ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1510 implements InterfaceC1513 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public IBinder f6148;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6148;
    }

    @Override // p065.InterfaceC1513
    /* renamed from: ˉⁱ */
    public final void mo5033(InterfaceC1480 interfaceC1480, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1513.f6163);
            parcelObtain.writeStrongInterface(interfaceC1480);
            parcelObtain.writeInt(i);
            this.f6148.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p065.InterfaceC1513
    /* renamed from: ˎٴ */
    public final int mo5034(InterfaceC1480 interfaceC1480, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1513.f6163);
            parcelObtain.writeStrongInterface(interfaceC1480);
            parcelObtain.writeString(str);
            this.f6148.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p065.InterfaceC1513
    /* renamed from: ﹳˑ */
    public final void mo5035(int i, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1513.f6163);
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            this.f6148.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
