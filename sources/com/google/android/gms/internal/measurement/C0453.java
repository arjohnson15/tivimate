package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p331.C3758;
import p331.C3761;
import p331.C3762;
import p331.C3767;
import p456.C5352;
import p456.CallableC5267;

/* renamed from: com.google.android.gms.internal.measurement.ـʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0453 extends AbstractC0381 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ int f2757 = 3;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f2758;

    public /* synthetic */ C0453(String str) {
        super(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453(C3761 c3761) {
        super("getValue");
        this.f2758 = c3761;
    }

    public C0453(C3762 c3762) {
        super("internal.eventLogger");
        this.f2758 = c3762;
    }

    public C0453(ᵢ.ʿʼ r7) {
        super("internal.logger");
        this.f2758 = r7;
        this.f2644.put("log", new C0311(this, false, true));
        this.f2644.put("silent", new C0320("silent", 2));
        ((AbstractC0381) this.f2644.get("silent")).mo1863("log", new C0311(this, true, true));
        this.f2644.put("unmonitored", new C0320("unmonitored", 3));
        ((AbstractC0381) this.f2644.get("unmonitored")).mo1863("log", new C0311(this, false, false));
    }

    public C0453(CallableC5267 callableC5267) {
        super("internal.appMetadata");
        this.f2758 = callableC5267;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0381
    /* renamed from: ـﹶ */
    public final InterfaceC0489 mo1817(ﹶˋ.ـﹶ r9, List list) {
        TreeMap treeMap;
        switch (this.f2757) {
            case 0:
                AbstractC0543.m2446(3, this.f2645, list);
                String strMo1876 = ((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(0)).mo1876();
                long jM2445 = (long) AbstractC0543.m2445(((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(1)).mo1860().doubleValue());
                InterfaceC0489 interfaceC0489M8736 = ((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(2));
                HashMap mapM2437 = interfaceC0489M8736 instanceof C0402 ? AbstractC0543.m2437((C0402) interfaceC0489M8736) : new HashMap();
                C3762 c3762 = (C3762) this.f2758;
                c3762.getClass();
                HashMap map = new HashMap();
                for (String str : mapM2437.keySet()) {
                    HashMap map2 = ((C0423) c3762.f14530).f2719;
                    map.put(str, C0423.m2189(map2.containsKey(str) ? map2.get(str) : null, mapM2437.get(str), str));
                }
                ((ArrayList) c3762.f14532).add(new C0423(strMo1876, jM2445, map));
                return InterfaceC0489.f2827;
            case 1:
                AbstractC0543.m2446(2, "getValue", list);
                InterfaceC0489 interfaceC0489M87362 = ((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(0));
                InterfaceC0489 interfaceC0489M87363 = ((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(1));
                String strMo18762 = interfaceC0489M87362.mo1876();
                C3761 c3761 = (C3761) this.f2758;
                Map map3 = (Map) ((C5352) c3761.f14528).f20767.get((String) c3761.f14527);
                String str2 = (map3 == null || !map3.containsKey(strMo18762)) ? null : (String) map3.get(strMo18762);
                return str2 != null ? new C0429(str2) : interfaceC0489M87363;
            case 2:
                return InterfaceC0489.f2827;
            case 3:
                AbstractC0543.m2446(3, this.f2645, list);
                ((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(0)).mo1876();
                InterfaceC0489 interfaceC0489M87364 = ((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(1));
                if (!(interfaceC0489M87364 instanceof C0420)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC0489 interfaceC0489M87365 = ((C3758) r9.ˎˑ).m8736(r9, (InterfaceC0489) list.get(2));
                if (!(interfaceC0489M87365 instanceof C0402)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C0402 c0402 = (C0402) interfaceC0489M87365;
                if (!c0402.f2685.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strMo18763 = c0402.mo1870("type").mo1876();
                int iM2441 = c0402.f2685.containsKey("priority") ? AbstractC0543.m2441(c0402.mo1870("priority").mo1860().doubleValue()) : 1000;
                C0420 c0420 = (C0420) interfaceC0489M87364;
                C3767 c3767 = (C3767) this.f2758;
                c3767.getClass();
                if ("create".equals(strMo18763)) {
                    treeMap = (TreeMap) c3767.f14558;
                } else {
                    if (!"edit".equals(strMo18763)) {
                        throw new IllegalStateException(ᵎﹳ.ᐧʻ.ﾞˊ("Unknown callback type: ", strMo18763));
                    }
                    treeMap = (TreeMap) c3767.f14557;
                }
                if (treeMap.containsKey(Integer.valueOf(iM2441))) {
                    iM2441 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iM2441), c0420);
                return InterfaceC0489.f2827;
            default:
                try {
                    return AbstractC0370.m2075(((CallableC5267) this.f2758).call());
                } catch (Exception unused) {
                    return InterfaceC0489.f2827;
                }
        }
    }
}
