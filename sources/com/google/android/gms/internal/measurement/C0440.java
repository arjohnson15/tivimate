package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import p080.AbstractC1702;

/* renamed from: com.google.android.gms.internal.measurement.יˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0440 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C0440 f2745 = new C0440();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ConcurrentHashMap f2746 = new ConcurrentHashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0355 f2747;

    public C0440() {
        InterfaceC0509[] interfaceC0509Arr = {C0553.f2903, C0355.f2535};
        C0355 c0355 = new C0355();
        c0355.f2536 = interfaceC0509Arr;
        C0355 c03552 = new C0355();
        Charset charset = AbstractC0412.f2705;
        c03552.f2536 = c0355;
        this.f2747 = c03552;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.gms.internal.measurement.ʾʾ] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0494 m2222(Class cls) {
        C0474 c0474M2265;
        Charset charset = AbstractC0412.f2705;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f2746;
        InterfaceC0494 interfaceC0494 = (InterfaceC0494) concurrentHashMap.get(cls);
        if (interfaceC0494 != null) {
            return interfaceC0494;
        }
        C0355 c0355 = this.f2747;
        c0355.getClass();
        AbstractC0583.class.isAssignableFrom(cls);
        C0371 c0371Mo1967 = ((C0355) c0355.f2536).mo1967(cls);
        boolean z = (c0371Mo1967.f2628 & 2) == 2;
        C0553 c0553 = AbstractC0527.f2871;
        if (z) {
            c0474M2265 = new C0328(c0371Mo1967.f2627);
        } else {
            if (AbstractC0344.f2464[AbstractC1702.m5411(c0371Mo1967.m2078())] == 1) {
                c0553 = null;
            }
            c0474M2265 = C0474.m2265(c0371Mo1967, c0553);
        }
        InterfaceC0494 interfaceC04942 = (InterfaceC0494) concurrentHashMap.putIfAbsent(cls, c0474M2265);
        return interfaceC04942 != null ? interfaceC04942 : c0474M2265;
    }
}
