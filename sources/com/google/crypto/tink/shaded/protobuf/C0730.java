package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0730 extends AbstractC0775 {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo2950(long j, Object obj, Object obj2) {
        AbstractC0771 abstractC0771 = AbstractC0768.f3622;
        InterfaceC0780 interfaceC0780Mo2949 = (InterfaceC0780) abstractC0771.m3211(j, obj);
        InterfaceC0780 interfaceC0780 = (InterfaceC0780) abstractC0771.m3211(j, obj2);
        int size = interfaceC0780Mo2949.size();
        int size2 = interfaceC0780.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0724) interfaceC0780Mo2949).f3523) {
                interfaceC0780Mo2949 = interfaceC0780Mo2949.mo2949(size2 + size);
            }
            interfaceC0780Mo2949.addAll(interfaceC0780);
        }
        if (size > 0) {
            interfaceC0780 = interfaceC0780Mo2949;
        }
        AbstractC0768.m3185(j, obj, interfaceC0780);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List mo2951(long j, Object obj) {
        InterfaceC0780 interfaceC0780 = (InterfaceC0780) AbstractC0768.f3622.m3211(j, obj);
        if (((AbstractC0724) interfaceC0780).f3523) {
            return interfaceC0780;
        }
        int size = interfaceC0780.size();
        InterfaceC0780 interfaceC0780Mo2949 = interfaceC0780.mo2949(size == 0 ? 10 : size * 2);
        AbstractC0768.m3185(j, obj, interfaceC0780Mo2949);
        return interfaceC0780Mo2949;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0775
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo2952(long j, Object obj) {
        ((AbstractC0724) ((InterfaceC0780) AbstractC0768.f3622.m3211(j, obj))).f3523 = false;
    }
}
