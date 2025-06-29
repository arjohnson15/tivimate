package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p331.C3758;

/* renamed from: com.google.android.gms.internal.measurement.ᵢᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0529 extends AbstractC0381 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C0355 f2872;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final HashMap f2873;

    public C0529(C0355 c0355) {
        super("require");
        this.f2873 = new HashMap();
        this.f2872 = c0355;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0381
    /* renamed from: ـﹶ */
    public final InterfaceC0489 mo1817(ﹶˋ.ـﹶ r3, List list) {
        InterfaceC0489 interfaceC0489;
        AbstractC0543.m2446(1, "require", list);
        String strMo1876 = ((C3758) r3.ˎˑ).m8736(r3, (InterfaceC0489) list.get(0)).mo1876();
        HashMap map = this.f2873;
        if (map.containsKey(strMo1876)) {
            return (InterfaceC0489) map.get(strMo1876);
        }
        HashMap map2 = (HashMap) this.f2872.f2536;
        if (map2.containsKey(strMo1876)) {
            try {
                interfaceC0489 = (InterfaceC0489) ((Callable) map2.get(strMo1876)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(ᵎﹳ.ᐧʻ.ﾞˊ("Failed to create API implementation: ", strMo1876));
            }
        } else {
            interfaceC0489 = InterfaceC0489.f2827;
        }
        if (interfaceC0489 instanceof AbstractC0381) {
            map.put(strMo1876, (AbstractC0381) interfaceC0489);
        }
        return interfaceC0489;
    }
}
