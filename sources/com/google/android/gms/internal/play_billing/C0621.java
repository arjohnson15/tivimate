package com.google.android.gms.internal.play_billing;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0621 extends AbstractC0587 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Class f2993 = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.AbstractC0587
    /* renamed from: ʽᐧ */
    public final void mo2551(long j, Object obj, Object obj2) {
        C0630 c0630;
        List list = (List) AbstractC0603.m2601(j, obj2);
        int size = list.size();
        List listMo2653 = (List) AbstractC0603.m2601(j, obj);
        if (listMo2653.isEmpty()) {
            listMo2653 = listMo2653 instanceof InterfaceC0665 ? new C0630(size) : ((listMo2653 instanceof InterfaceC0605) && (listMo2653 instanceof InterfaceC0680)) ? ((InterfaceC0680) listMo2653).mo2653(size) : new ArrayList(size);
            AbstractC0603.m2592(j, obj, listMo2653);
        } else {
            if (f2993.isAssignableFrom(listMo2653.getClass())) {
                ArrayList arrayList = new ArrayList(listMo2653.size() + size);
                arrayList.addAll(listMo2653);
                AbstractC0603.m2592(j, obj, arrayList);
                c0630 = arrayList;
            } else if (listMo2653 instanceof C0681) {
                C0630 c06302 = new C0630(listMo2653.size() + size);
                c06302.addAll(c06302.f3003.size(), (C0681) listMo2653);
                AbstractC0603.m2592(j, obj, c06302);
                c0630 = c06302;
            } else if ((listMo2653 instanceof InterfaceC0605) && (listMo2653 instanceof InterfaceC0680)) {
                InterfaceC0680 interfaceC0680 = (InterfaceC0680) listMo2653;
                if (!((AbstractC0655) interfaceC0680).f3062) {
                    listMo2653 = interfaceC0680.mo2653(listMo2653.size() + size);
                    AbstractC0603.m2592(j, obj, listMo2653);
                }
            }
            listMo2653 = c0630;
        }
        int size2 = listMo2653.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listMo2653.addAll(list);
        }
        if (size2 > 0) {
            list = listMo2653;
        }
        AbstractC0603.m2592(j, obj, list);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0587
    /* renamed from: ـﹶ */
    public final void mo2552(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC0603.m2601(j, obj);
        if (list instanceof InterfaceC0665) {
            objUnmodifiableList = ((InterfaceC0665) list).mo2649();
        } else {
            if (f2993.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0605) && (list instanceof InterfaceC0680)) {
                AbstractC0655 abstractC0655 = (AbstractC0655) ((InterfaceC0680) list);
                boolean z = abstractC0655.f3062;
                if (z && z) {
                    abstractC0655.f3062 = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC0603.m2592(j, obj, objUnmodifiableList);
    }
}
