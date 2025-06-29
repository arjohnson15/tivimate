package androidx.datastore.preferences.protobuf;

import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0058 extends AbstractC0020 {
    @Override // androidx.datastore.preferences.protobuf.AbstractC0020
    /* renamed from: ʽᐧ */
    public final void mo287(AbstractC0083 abstractC0083, AbstractC0083 abstractC00832, long j) {
        AbstractC0057 abstractC0057 = AbstractC0029.f392;
        InterfaceC0048 interfaceC0048Mo344 = (InterfaceC0048) abstractC0057.m494(j, abstractC0083);
        InterfaceC0048 interfaceC0048 = (InterfaceC0048) abstractC0057.m494(j, abstractC00832);
        int size = interfaceC0048Mo344.size();
        int size2 = interfaceC0048.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0012) interfaceC0048Mo344).f358) {
                interfaceC0048Mo344 = interfaceC0048Mo344.mo344(size2 + size);
            }
            interfaceC0048Mo344.addAll(interfaceC0048);
        }
        if (size > 0) {
            interfaceC0048 = interfaceC0048Mo344;
        }
        AbstractC0029.m314(j, abstractC0083, interfaceC0048);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0020
    /* renamed from: ˑʽ */
    public final List mo288(long j, Object obj) {
        InterfaceC0048 interfaceC0048 = (InterfaceC0048) AbstractC0029.f392.m494(j, obj);
        if (((AbstractC0012) interfaceC0048).f358) {
            return interfaceC0048;
        }
        int size = interfaceC0048.size();
        InterfaceC0048 interfaceC0048Mo344 = interfaceC0048.mo344(size == 0 ? 10 : size * 2);
        AbstractC0029.m314(j, obj, interfaceC0048Mo344);
        return interfaceC0048Mo344;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0020
    /* renamed from: ـﹶ */
    public final void mo289(long j, Object obj) {
        ((AbstractC0012) ((InterfaceC0048) AbstractC0029.f392.m494(j, obj))).f358 = false;
    }
}
