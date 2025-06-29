package com.google.crypto.tink.shaded.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0763 extends AbstractC0775 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Class f3603 = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static List m3172(long j, Object obj, int i) {
        C0729 c0729;
        List list = (List) AbstractC0768.f3622.m3211(j, obj);
        if (list.isEmpty()) {
            List c07292 = list instanceof InterfaceC0742 ? new C0729(i) : ((list instanceof InterfaceC0786) && (list instanceof InterfaceC0780)) ? ((InterfaceC0780) list).mo2949(i) : new ArrayList(i);
            AbstractC0768.m3185(j, obj, c07292);
            return c07292;
        }
        if (f3603.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC0768.m3185(j, obj, arrayList);
            c0729 = arrayList;
        } else {
            if (!(list instanceof C0723)) {
                if (!(list instanceof InterfaceC0786) || !(list instanceof InterfaceC0780)) {
                    return list;
                }
                InterfaceC0780 interfaceC0780 = (InterfaceC0780) list;
                if (((AbstractC0724) interfaceC0780).f3523) {
                    return list;
                }
                InterfaceC0780 interfaceC0780Mo2949 = interfaceC0780.mo2949(list.size() + i);
                AbstractC0768.m3185(j, obj, interfaceC0780Mo2949);
                return interfaceC0780Mo2949;
            }
            C0729 c07293 = new C0729(list.size() + i);
            c07293.addAll((C0723) list);
            AbstractC0768.m3185(j, obj, c07293);
            c0729 = c07293;
        }
        return c0729;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775
    /* renamed from: ʽᐧ */
    public final void mo2950(long j, Object obj, Object obj2) {
        List list = (List) AbstractC0768.f3622.m3211(j, obj2);
        List listM3172 = m3172(j, obj, list.size());
        int size = listM3172.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM3172.addAll(list);
        }
        if (size > 0) {
            list = listM3172;
        }
        AbstractC0768.m3185(j, obj, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775
    /* renamed from: ˑʽ */
    public final List mo2951(long j, Object obj) {
        return m3172(j, obj, 10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775
    /* renamed from: ـﹶ */
    public final void mo2952(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC0768.f3622.m3211(j, obj);
        if (list instanceof InterfaceC0742) {
            objUnmodifiableList = ((InterfaceC0742) list).mo2929();
        } else {
            if (f3603.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0786) && (list instanceof InterfaceC0780)) {
                AbstractC0724 abstractC0724 = (AbstractC0724) ((InterfaceC0780) list);
                if (abstractC0724.f3523) {
                    abstractC0724.f3523 = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC0768.m3185(j, obj, objUnmodifiableList);
    }
}
