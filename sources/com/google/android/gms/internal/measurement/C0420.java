package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p331.C3758;

/* renamed from: com.google.android.gms.internal.measurement.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0420 extends AbstractC0381 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ﹶˋ.ـﹶ f2712;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ArrayList f2713;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ArrayList f2714;

    public C0420(C0420 c0420) {
        super(c0420.f2645);
        ArrayList arrayList = new ArrayList(c0420.f2713.size());
        this.f2713 = arrayList;
        arrayList.addAll(c0420.f2713);
        ArrayList arrayList2 = new ArrayList(c0420.f2714.size());
        this.f2714 = arrayList2;
        arrayList2.addAll(c0420.f2714);
        this.f2712 = c0420.f2712;
    }

    public C0420(String str, ArrayList arrayList, List list, ﹶˋ.ـﹶ r4) {
        super(str);
        this.f2713 = new ArrayList();
        this.f2712 = r4;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f2713.add(((InterfaceC0489) it.next()).mo1876());
            }
        }
        this.f2714 = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0381, com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public final InterfaceC0489 mo1862() {
        return new C0420(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0381
    /* renamed from: ـﹶ */
    public final InterfaceC0489 mo1817(ﹶˋ.ـﹶ r6, List list) {
        C0550 c0550;
        ﹶˋ.ـﹶ r0 = this.f2712.ﹳˑ();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2713;
            int size = arrayList.size();
            c0550 = InterfaceC0489.f2827;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                r0.ˈٴ((String) arrayList.get(i), ((C3758) r6.ˎˑ).m8736(r6, (InterfaceC0489) list.get(i)));
            } else {
                r0.ˈٴ((String) arrayList.get(i), c0550);
            }
            i++;
        }
        Iterator it = this.f2714.iterator();
        while (it.hasNext()) {
            InterfaceC0489 interfaceC0489 = (InterfaceC0489) it.next();
            C3758 c3758 = (C3758) r0.ˎˑ;
            InterfaceC0489 interfaceC0489M8736 = c3758.m8736(r0, interfaceC0489);
            if (interfaceC0489M8736 instanceof C0506) {
                interfaceC0489M8736 = c3758.m8736(r0, interfaceC0489);
            }
            if (interfaceC0489M8736 instanceof C0421) {
                return ((C0421) interfaceC0489M8736).f2716;
            }
        }
        return c0550;
    }
}
