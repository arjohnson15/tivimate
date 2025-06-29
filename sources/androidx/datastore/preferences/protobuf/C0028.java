package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0028 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C0028 f387 = new C0028();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ConcurrentHashMap f388 = new ConcurrentHashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0030 f389 = new C0030();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.ᵔﹳ] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.ᵔﹳ] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0025 m308(Class cls) {
        C0037 c0037M363;
        C0037 c0070;
        Class cls2;
        AbstractC0077.m565(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f388;
        InterfaceC0025 interfaceC0025 = (InterfaceC0025) concurrentHashMap.get(cls);
        if (interfaceC0025 != null) {
            return interfaceC0025;
        }
        C0030 c0030 = this.f389;
        c0030.getClass();
        Class cls3 = AbstractC0074.f500;
        if (!AbstractC0083.class.isAssignableFrom(cls) && (cls2 = AbstractC0074.f500) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C0063 c0063Mo474 = ((C0079) c0030.f398).mo474(cls);
        if ((c0063Mo474.f485 & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0083.class.isAssignableFrom(cls);
            AbstractC0083 abstractC0083 = c0063Mo474.f484;
            if (zIsAssignableFrom) {
                c0070 = new C0070(AbstractC0074.f501, AbstractC0045.f452, abstractC0083);
            } else {
                AbstractC0055 abstractC0055 = AbstractC0074.f498;
                C0041 c0041 = AbstractC0045.f451;
                if (c0041 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0070 = new C0070(abstractC0055, c0041, abstractC0083);
            }
            c0037M363 = c0070;
        } else if (AbstractC0083.class.isAssignableFrom(cls)) {
            c0037M363 = c0063Mo474.m499() == 1 ? C0037.m363(c0063Mo474, AbstractC0069.f490, AbstractC0020.f367, AbstractC0074.f501, AbstractC0045.f452, AbstractC0047.f453) : C0037.m363(c0063Mo474, AbstractC0069.f490, AbstractC0020.f367, AbstractC0074.f501, null, AbstractC0047.f453);
        } else if (c0063Mo474.m499() == 1) {
            C0009 c0009 = AbstractC0069.f491;
            C0035 c0035 = AbstractC0020.f368;
            AbstractC0055 abstractC00552 = AbstractC0074.f498;
            C0041 c00412 = AbstractC0045.f451;
            if (c00412 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c0037M363 = C0037.m363(c0063Mo474, c0009, c0035, abstractC00552, c00412, AbstractC0047.f454);
        } else {
            c0037M363 = C0037.m363(c0063Mo474, AbstractC0069.f491, AbstractC0020.f368, AbstractC0074.f499, null, AbstractC0047.f454);
        }
        InterfaceC0025 interfaceC00252 = (InterfaceC0025) concurrentHashMap.putIfAbsent(cls, c0037M363);
        return interfaceC00252 != null ? interfaceC00252 : c0037M363;
    }
}
