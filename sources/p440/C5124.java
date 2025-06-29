package p440;

import android.os.Bundle;
import java.util.HashSet;
import p331.C3767;
import p345.AbstractC3985;
import p456.AbstractC5310;
import p456.InterfaceC5268;
import ᵢ.ʿʼ;

/* renamed from: ﾞʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5124 implements InterfaceC5268 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f19594;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f19595;

    public /* synthetic */ C5124(int i, Object obj) {
        this.f19595 = i;
        this.f19594 = obj;
    }

    @Override // p456.InterfaceC5268
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo11398(long j, Bundle bundle, String str, String str2) {
        Object obj = this.f19594;
        switch (this.f19595) {
            case 0:
                C3767 c3767 = (C3767) obj;
                if (((HashSet) c3767.f14557).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    AbstractC3985 abstractC3985 = AbstractC5125.f19598;
                    String strM11923 = AbstractC5310.m11923(str2, AbstractC5310.f20604, AbstractC5310.f20597);
                    if (strM11923 != null) {
                        str2 = strM11923;
                    }
                    bundle2.putString("events", str2);
                    ((C3767) c3767.f14558).m8808(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !AbstractC5125.f19598.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((C3767) ((ʿʼ) obj).ˆʿ).m8808(3, bundle3);
                    break;
                }
                break;
        }
    }
}
