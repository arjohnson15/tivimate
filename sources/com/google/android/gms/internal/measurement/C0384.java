package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import p331.C3758;
import p331.C3762;

/* renamed from: com.google.android.gms.internal.measurement.ˉᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0384 extends C0402 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3762 f2658;

    public C0384(C3762 c3762) {
        this.f2658 = c3762;
    }

    @Override // com.google.android.gms.internal.measurement.C0402, com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ */
    public final InterfaceC0489 mo1866(String str, ﹶˋ.ـﹶ r14, ArrayList arrayList) {
        C3762 c3762;
        c3762 = this.f2658;
        switch (str) {
            case "getEventName":
                AbstractC0543.m2446(0, "getEventName", arrayList);
                return new C0429(((C0423) c3762.f14531).f2720);
            case "getTimestamp":
                AbstractC0543.m2446(0, "getTimestamp", arrayList);
                return new C0477(Double.valueOf(((C0423) c3762.f14531).f2718));
            case "getParamValue":
                AbstractC0543.m2446(1, "getParamValue", arrayList);
                String strMo1876 = ((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) arrayList.get(0)).mo1876();
                HashMap map = ((C0423) c3762.f14531).f2719;
                return AbstractC0370.m2075(map.containsKey(strMo1876) ? map.get(strMo1876) : null);
            case "getParams":
                AbstractC0543.m2446(0, "getParams", arrayList);
                HashMap map2 = ((C0423) c3762.f14531).f2719;
                C0402 c0402 = new C0402();
                for (String str2 : map2.keySet()) {
                    c0402.mo1863(str2, AbstractC0370.m2075(map2.get(str2)));
                }
                return c0402;
            case "setParamValue":
                AbstractC0543.m2446(2, "setParamValue", arrayList);
                String strMo18762 = ((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) arrayList.get(0)).mo1876();
                InterfaceC0489 interfaceC0489M8736 = ((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) arrayList.get(1));
                C0423 c0423 = (C0423) c3762.f14531;
                Object objM2444 = AbstractC0543.m2444(interfaceC0489M8736);
                HashMap map3 = c0423.f2719;
                if (objM2444 == null) {
                    map3.remove(strMo18762);
                } else {
                    map3.put(strMo18762, C0423.m2189(map3.get(strMo18762), objM2444, strMo18762));
                }
                return interfaceC0489M8736;
            case "setEventName":
                AbstractC0543.m2446(1, "setEventName", arrayList);
                InterfaceC0489 interfaceC0489M87362 = ((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) arrayList.get(0));
                if (InterfaceC0489.f2827.equals(interfaceC0489M87362) || InterfaceC0489.f2823.equals(interfaceC0489M87362)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                ((C0423) c3762.f14531).f2720 = interfaceC0489M87362.mo1876();
                return new C0429(interfaceC0489M87362.mo1876());
            default:
                return super.mo1866(str, r14, arrayList);
        }
    }
}
