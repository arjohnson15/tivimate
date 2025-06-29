package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0437 implements Comparator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ﹶˋ.ـﹶ f2743;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0381 f2744;

    public C0437(AbstractC0381 abstractC0381, ﹶˋ.ـﹶ r2) {
        this.f2744 = abstractC0381;
        this.f2743 = r2;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC0489 interfaceC0489 = (InterfaceC0489) obj;
        InterfaceC0489 interfaceC04892 = (InterfaceC0489) obj2;
        if (interfaceC0489 instanceof C0550) {
            return !(interfaceC04892 instanceof C0550) ? 1 : 0;
        }
        if (interfaceC04892 instanceof C0550) {
            return -1;
        }
        AbstractC0381 abstractC0381 = this.f2744;
        return abstractC0381 == null ? interfaceC0489.mo1876().compareTo(interfaceC04892.mo1876()) : (int) AbstractC0543.m2445(abstractC0381.mo1817(this.f2743, Arrays.asList(interfaceC0489, interfaceC04892)).mo1860().doubleValue());
    }
}
