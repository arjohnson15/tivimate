package p456;

import android.os.IBinder;
import android.os.IInterface;
import p417.AbstractC4747;

/* renamed from: ﾞⁱ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5314 extends AbstractC4747 {
    @Override // p417.AbstractC4747
    /* renamed from: ˋˊ */
    public final String mo8565() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p417.AbstractC4747
    /* renamed from: ˑי */
    public final /* synthetic */ IInterface mo8568(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5311 ? (InterfaceC5311) iInterfaceQueryLocalInterface : new C5330(iBinder);
    }

    @Override // p417.AbstractC4747, p349.InterfaceC4000
    /* renamed from: ٴˎ */
    public final int mo8569() {
        return 12451000;
    }

    @Override // p417.AbstractC4747
    /* renamed from: ﾞˊ */
    public final String mo8574() {
        return "com.google.android.gms.measurement.START";
    }
}
