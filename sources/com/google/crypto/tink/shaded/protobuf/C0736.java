package com.google.crypto.tink.shaded.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0736 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C0736 f3551 = new C0736();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ConcurrentHashMap f3552 = new ConcurrentHashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0756 f3553 = new C0756();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.crypto.tink.shaded.protobuf.ᵔﹳ] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.ᵔﹳ] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0727 m3049(Class cls) {
        C0744 c0744M3061;
        C0744 c0774;
        Class cls2;
        AbstractC0731.m2954(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f3552;
        InterfaceC0727 interfaceC0727 = (InterfaceC0727) concurrentHashMap.get(cls);
        if (interfaceC0727 != null) {
            return interfaceC0727;
        }
        C0756 c0756 = this.f3553;
        c0756.getClass();
        Class cls3 = AbstractC0734.f3543;
        if (!AbstractC0785.class.isAssignableFrom(cls) && (cls2 = AbstractC0734.f3543) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C0767 c0767Mo3051 = ((C0737) c0756.f3598).mo3051(cls);
        if ((c0767Mo3051.f3621 & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0785.class.isAssignableFrom(cls);
            AbstractC0758 abstractC0758 = c0767Mo3051.f3620;
            if (zIsAssignableFrom) {
                c0774 = new C0774(AbstractC0734.f3544, AbstractC0770.f3629, abstractC0758);
            } else {
                AbstractC0777 abstractC0777 = AbstractC0734.f3541;
                C0751 c0751 = AbstractC0770.f3628;
                if (c0751 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0774 = new C0774(abstractC0777, c0751, abstractC0758);
            }
            c0744M3061 = c0774;
        } else if (AbstractC0785.class.isAssignableFrom(cls)) {
            c0744M3061 = c0767Mo3051.m3179() == 1 ? C0744.m3061(c0767Mo3051, AbstractC0773.f3631, AbstractC0775.f3636, AbstractC0734.f3544, AbstractC0770.f3629, AbstractC0725.f3524) : C0744.m3061(c0767Mo3051, AbstractC0773.f3631, AbstractC0775.f3636, AbstractC0734.f3544, null, AbstractC0725.f3524);
        } else if (c0767Mo3051.m3179() == 1) {
            C0721 c0721 = AbstractC0773.f3632;
            C0763 c0763 = AbstractC0775.f3637;
            AbstractC0777 abstractC07772 = AbstractC0734.f3541;
            C0751 c07512 = AbstractC0770.f3628;
            if (c07512 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c0744M3061 = C0744.m3061(c0767Mo3051, c0721, c0763, abstractC07772, c07512, AbstractC0725.f3525);
        } else {
            c0744M3061 = C0744.m3061(c0767Mo3051, AbstractC0773.f3632, AbstractC0775.f3637, AbstractC0734.f3542, null, AbstractC0725.f3525);
        }
        InterfaceC0727 interfaceC07272 = (InterfaceC0727) concurrentHashMap.putIfAbsent(cls, c0744M3061);
        return interfaceC07272 != null ? interfaceC07272 : c0744M3061;
    }
}
