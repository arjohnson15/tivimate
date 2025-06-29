package p417;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p062.AbstractBinderC1444;
import p195.AbstractC2710;

/* renamed from: ﹳᴵ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC4776 extends AbstractBinderC1444 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public AbstractC4747 f18311;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f18312;

    public BinderC4776(AbstractC4747 abstractC4747, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f18311 = abstractC4747;
        this.f18312 = i;
    }

    @Override // p062.AbstractBinderC1444
    /* renamed from: ᵢʿ */
    public final boolean mo4997(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC2710.m6874(parcel, Bundle.CREATOR);
            AbstractC2710.m6872(parcel);
            AbstractC4753.m10689(this.f18311, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC4747 abstractC4747 = this.f18311;
            abstractC4747.getClass();
            C4773 c4773 = new C4773(abstractC4747, i2, strongBinder, bundle);
            HandlerC4777 handlerC4777 = abstractC4747.f18216;
            handlerC4777.sendMessage(handlerC4777.obtainMessage(1, this.f18312, -1, c4773));
            this.f18311 = null;
        } else if (i == 2) {
            parcel.readInt();
            AbstractC2710.m6872(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C4767 c4767 = (C4767) AbstractC2710.m6874(parcel, C4767.CREATOR);
            AbstractC2710.m6872(parcel);
            AbstractC4747 abstractC47472 = this.f18311;
            AbstractC4753.m10689(abstractC47472, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC4753.m10683(c4767);
            abstractC47472.f18207 = c4767;
            Bundle bundle2 = c4767.f18296;
            AbstractC4753.m10689(this.f18311, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC4747 abstractC47473 = this.f18311;
            abstractC47473.getClass();
            C4773 c47732 = new C4773(abstractC47473, i3, strongBinder2, bundle2);
            HandlerC4777 handlerC47772 = abstractC47473.f18216;
            handlerC47772.sendMessage(handlerC47772.obtainMessage(1, this.f18312, -1, c47732));
            this.f18311 = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
