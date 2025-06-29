package p065;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: ʾᵔ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC1482 extends Binder implements InterfaceC1513 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final /* synthetic */ int f6028 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ MultiInstanceInvalidationService f6029;

    public BinderC1482(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f6029 = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC1513.f6163);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC1513.f6163;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC1480 interfaceC1480 = null;
        InterfaceC1480 interfaceC14802 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC1480.f6024);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1480)) {
                    C1528 c1528 = new C1528();
                    c1528.f6209 = strongBinder;
                    interfaceC1480 = c1528;
                } else {
                    interfaceC1480 = (InterfaceC1480) iInterfaceQueryLocalInterface;
                }
            }
            int iMo5034 = mo5034(interfaceC1480, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iMo5034);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC1480.f6024);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1480)) {
                    C1528 c15282 = new C1528();
                    c15282.f6209 = strongBinder2;
                    interfaceC14802 = c15282;
                } else {
                    interfaceC14802 = (InterfaceC1480) iInterfaceQueryLocalInterface2;
                }
            }
            mo5033(interfaceC14802, parcel.readInt());
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo5035(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }

    @Override // p065.InterfaceC1513
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo5033(InterfaceC1480 interfaceC1480, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6029;
        synchronized (multiInstanceInvalidationService.f1746) {
            multiInstanceInvalidationService.f1746.unregister(interfaceC1480);
        }
    }

    @Override // p065.InterfaceC1513
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int mo5034(InterfaceC1480 interfaceC1480, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6029;
        synchronized (multiInstanceInvalidationService.f1746) {
            try {
                int i2 = multiInstanceInvalidationService.f1748 + 1;
                multiInstanceInvalidationService.f1748 = i2;
                if (multiInstanceInvalidationService.f1746.register(interfaceC1480, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.f1745.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.f1748--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // p065.InterfaceC1513
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void mo5035(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6029;
        synchronized (multiInstanceInvalidationService.f1746) {
            String str = (String) multiInstanceInvalidationService.f1745.get(Integer.valueOf(i));
            if (str == null) {
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f1746.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    Integer num = (Integer) multiInstanceInvalidationService.f1746.getBroadcastCookie(i2);
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f1745.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            ((InterfaceC1480) multiInstanceInvalidationService.f1746.getBroadcastItem(i2)).mo5032(strArr);
                        } catch (RemoteException e) {
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f1746.finishBroadcast();
                }
            }
        }
    }
}
