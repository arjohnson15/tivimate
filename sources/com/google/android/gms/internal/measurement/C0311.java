package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p331.C3758;

/* renamed from: com.google.android.gms.internal.measurement.ʼˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0311 extends AbstractC0381 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C0453 f2425;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f2426;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f2427;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0311(C0453 c0453, boolean z, boolean z2) {
        super("log");
        this.f2425 = c0453;
        this.f2426 = z;
        this.f2427 = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0381
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0489 mo1817(ﹶˋ.ـﹶ r14, List list) {
        AbstractC0543.m2439(1, "log", list);
        int size = list.size();
        C0550 c0550 = InterfaceC0489.f2827;
        C0453 c0453 = this.f2425;
        if (size == 1) {
            ((ᵢ.ʿʼ) c0453.f2758).ᵎˏ(3, ((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) list.get(0)).mo1876(), Collections.emptyList(), this.f2426, this.f2427);
            return c0550;
        }
        int iM2441 = AbstractC0543.m2441(((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) list.get(0)).mo1860().doubleValue());
        int i = iM2441 != 2 ? iM2441 != 3 ? iM2441 != 5 ? iM2441 != 6 ? 3 : 2 : 5 : 1 : 4;
        String strMo1876 = ((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) list.get(1)).mo1876();
        if (list.size() == 2) {
            ((ᵢ.ʿʼ) c0453.f2758).ᵎˏ(i, strMo1876, Collections.emptyList(), this.f2426, this.f2427);
            return c0550;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(((C3758) r14.ˎˑ).m8736(r14, (InterfaceC0489) list.get(i2)).mo1876());
        }
        ((ᵢ.ʿʼ) c0453.f2758).ᵎˏ(i, strMo1876, arrayList, this.f2426, this.f2427);
        return c0550;
    }
}
