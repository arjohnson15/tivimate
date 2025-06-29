package p305;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import p026.C1164;
import p113.BinderC1816;
import p195.AbstractC2710;
import p417.AbstractBinderC4772;
import p417.AbstractC4753;
import p417.C4769;
import p417.InterfaceC4748;
import ˈⁱ.ˉⁱ;

/* renamed from: ᐧˆ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3534 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final BinderC3527 f13668;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Context f13669;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static volatile InterfaceC4748 f13670;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final BinderC3527 f13671;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Object f13672;

    static {
        new BinderC3527(0, AbstractBinderC3528.m8413("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC3527(1, AbstractBinderC3528.m8413("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f13671 = new BinderC3527(2, AbstractBinderC3528.m8413("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f13668 = new BinderC3527(3, AbstractBinderC3528.m8413("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f13672 = new Object();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3541 m8422(String str, BinderC3538 binderC3538, boolean z, boolean z2) {
        try {
            m8423();
            AbstractC4753.m10683(f13669);
            try {
                InterfaceC4748 interfaceC4748 = f13670;
                BinderC1816 binderC1816 = new BinderC1816(f13669.getPackageManager());
                C4769 c4769 = (C4769) interfaceC4748;
                Parcel parcelM2289 = c4769.m2289();
                int i = AbstractC2710.f10608;
                boolean z3 = true;
                parcelM2289.writeInt(1);
                int i2 = ˉⁱ.ˑﾞ(parcelM2289, 20293);
                ˉⁱ.ᴵʼ(parcelM2289, 1, str);
                ˉⁱ.ˋˉ(parcelM2289, 2, binderC3538);
                ˉⁱ.ᵢٴ(parcelM2289, 3, 4);
                parcelM2289.writeInt(z ? 1 : 0);
                ˉⁱ.ᵢٴ(parcelM2289, 4, 4);
                parcelM2289.writeInt(z2 ? 1 : 0);
                ˉⁱ.ˑⁱ(parcelM2289, i2);
                AbstractC2710.m6873(parcelM2289, binderC1816);
                Parcel parcelM2288 = c4769.m2288(parcelM2289, 5);
                if (parcelM2288.readInt() == 0) {
                    z3 = false;
                }
                parcelM2288.recycle();
                return z3 ? C3541.f13688 : new C3539(new CallableC3530(z, str, binderC3538));
            } catch (RemoteException e) {
                return new C3541(false, "module call", e);
            }
        } catch (DynamiteModule$LoadingException e2) {
            return new C3541(false, "module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m8423() {
        InterfaceC4748 c4769;
        if (f13670 != null) {
            return;
        }
        AbstractC4753.m10683(f13669);
        synchronized (f13672) {
            try {
                if (f13670 == null) {
                    IBinder iBinderM4219 = C1164.m4214(f13669, C1164.f4825, "com.google.android.gms.googlecertificates").m4219("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = AbstractBinderC4772.f18299;
                    if (iBinderM4219 == null) {
                        c4769 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM4219.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        c4769 = iInterfaceQueryLocalInterface instanceof InterfaceC4748 ? (InterfaceC4748) iInterfaceQueryLocalInterface : new C4769(iBinderM4219, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    f13670 = c4769;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static synchronized void m8424(Context context) {
        if (f13669 == null) {
            if (context != null) {
                f13669 = context.getApplicationContext();
            }
        }
    }
}
