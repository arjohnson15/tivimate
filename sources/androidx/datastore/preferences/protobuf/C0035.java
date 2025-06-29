package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0035 extends AbstractC0020 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Class f410 = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static List m353(long j, Object obj, int i) {
        C0060 c0060;
        List list = (List) AbstractC0029.f392.m494(j, obj);
        if (list.isEmpty()) {
            List c00602 = list instanceof InterfaceC0019 ? new C0060(i) : ((list instanceof InterfaceC0084) && (list instanceof InterfaceC0048)) ? ((InterfaceC0048) list).mo344(i) : new ArrayList(i);
            AbstractC0029.m314(j, obj, c00602);
            return c00602;
        }
        if (f410.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC0029.m314(j, obj, arrayList);
            c0060 = arrayList;
        } else {
            if (!(list instanceof C0044)) {
                if (!(list instanceof InterfaceC0084) || !(list instanceof InterfaceC0048)) {
                    return list;
                }
                InterfaceC0048 interfaceC0048 = (InterfaceC0048) list;
                if (((AbstractC0012) interfaceC0048).f358) {
                    return list;
                }
                InterfaceC0048 interfaceC0048Mo344 = interfaceC0048.mo344(list.size() + i);
                AbstractC0029.m314(j, obj, interfaceC0048Mo344);
                return interfaceC0048Mo344;
            }
            C0060 c00603 = new C0060(list.size() + i);
            c00603.addAll((C0044) list);
            AbstractC0029.m314(j, obj, c00603);
            c0060 = c00603;
        }
        return c0060;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0020
    /* renamed from: ʽᐧ */
    public final void mo287(AbstractC0083 abstractC0083, AbstractC0083 abstractC00832, long j) {
        List list = (List) AbstractC0029.f392.m494(j, abstractC00832);
        List listM353 = m353(j, abstractC0083, list.size());
        int size = listM353.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM353.addAll(list);
        }
        if (size > 0) {
            list = listM353;
        }
        AbstractC0029.m314(j, abstractC0083, list);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0020
    /* renamed from: ˑʽ */
    public final List mo288(long j, Object obj) {
        return m353(j, obj, 10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0020
    /* renamed from: ـﹶ */
    public final void mo289(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC0029.f392.m494(j, obj);
        if (list instanceof InterfaceC0019) {
            objUnmodifiableList = ((InterfaceC0019) list).mo285();
        } else {
            if (f410.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0084) && (list instanceof InterfaceC0048)) {
                AbstractC0012 abstractC0012 = (AbstractC0012) ((InterfaceC0048) list);
                if (abstractC0012.f358) {
                    abstractC0012.f358 = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC0029.m314(j, obj, objUnmodifiableList);
    }
}
