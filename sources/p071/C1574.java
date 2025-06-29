package p071;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC0104;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0213;
import androidx.lifecycle.InterfaceC0262;
import java.util.HashMap;
import p286.AbstractC3390;
import p291.InterfaceC3443;

/* renamed from: ʿʼ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1574 implements InterfaceC0213 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ String f6327;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f6328;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6329;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f6330;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6331;

    public /* synthetic */ C1574(Object obj, String str, Object obj2, Object obj3, int i) {
        this.f6331 = i;
        this.f6328 = obj;
        this.f6327 = str;
        this.f6329 = obj2;
        this.f6330 = obj3;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) {
        Bundle bundle;
        switch (this.f6331) {
            case 0:
                boolean zEquals = EnumC0247.ON_START.equals(enumC0247);
                String str = this.f6327;
                AbstractC1569 abstractC1569 = (AbstractC1569) this.f6328;
                if (!zEquals) {
                    if (!EnumC0247.ON_STOP.equals(enumC0247)) {
                        if (EnumC0247.ON_DESTROY.equals(enumC0247)) {
                            abstractC1569.m5163(str);
                            break;
                        }
                    } else {
                        abstractC1569.f6315.remove(str);
                        break;
                    }
                } else {
                    HashMap map = abstractC1569.f6315;
                    InterfaceC1566 interfaceC1566 = (InterfaceC1566) this.f6329;
                    AbstractC3390 abstractC3390 = (AbstractC3390) this.f6330;
                    map.put(str, new C1572(abstractC3390, interfaceC1566));
                    HashMap map2 = abstractC1569.f6318;
                    if (map2.containsKey(str)) {
                        Object obj = map2.get(str);
                        map2.remove(str);
                        interfaceC1566.mo4094(obj);
                    }
                    Bundle bundle2 = abstractC1569.f6319;
                    C1571 c1571 = (C1571) bundle2.getParcelable(str);
                    if (c1571 != null) {
                        bundle2.remove(str);
                        interfaceC1566.mo4094(abstractC3390.mo8249(c1571.f6321, c1571.f6322));
                        break;
                    }
                }
                break;
            default:
                EnumC0247 enumC02472 = EnumC0247.ON_START;
                String str2 = this.f6327;
                AbstractC0104 abstractC0104 = (AbstractC0104) this.f6328;
                if (enumC0247 == enumC02472 && (bundle = (Bundle) abstractC0104.f603.get(str2)) != null) {
                    ((InterfaceC3443) this.f6329).mo8296(str2, bundle);
                    abstractC0104.f603.remove(str2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        "Clearing fragment result with key ".concat(str2);
                    }
                }
                if (enumC0247 == EnumC0247.ON_DESTROY) {
                    ((AbstractC0233) this.f6330).mo1031(this);
                    abstractC0104.f606.remove(str2);
                    break;
                }
                break;
        }
    }
}
