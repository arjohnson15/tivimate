package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0592 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C0592 f2957 = new C0592();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ConcurrentHashMap f2958 = new ConcurrentHashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0679 f2959 = new C0679();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0638 m2557(Class cls) {
        C0619 c0619;
        Class cls2;
        Charset charset = AbstractC0595.f2962;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f2958;
        InterfaceC0638 interfaceC0638M2715 = (InterfaceC0638) concurrentHashMap.get(cls);
        if (interfaceC0638M2715 == null) {
            C0679 c0679 = this.f2959;
            c0679.getClass();
            Class cls3 = AbstractC0656.f3065;
            if (!AbstractC0662.class.isAssignableFrom(cls) && (cls2 = AbstractC0656.f3065) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            C0642 c0642Mo2572 = ((C0657) c0679.f3103).mo2572(cls);
            if ((c0642Mo2572.f3030 & 2) == 2) {
                boolean zIsAssignableFrom = AbstractC0662.class.isAssignableFrom(cls);
                AbstractC0625 abstractC0625 = c0642Mo2572.f3029;
                if (zIsAssignableFrom) {
                    c0619 = new C0619(AbstractC0656.f3064, AbstractC0604.f2976, abstractC0625);
                } else {
                    C0622 c0622 = AbstractC0656.f3063;
                    C0671 c0671 = AbstractC0604.f2975;
                    if (c0671 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    c0619 = new C0619(c0622, c0671, abstractC0625);
                }
                interfaceC0638M2715 = c0619;
            } else if (AbstractC0662.class.isAssignableFrom(cls)) {
                if (c0642Mo2572.m2657() - 1 != 1) {
                    int i = AbstractC0588.f2955;
                    C0661 c0661 = AbstractC0587.f2953;
                    C0622 c06222 = AbstractC0656.f3064;
                    C0671 c06712 = AbstractC0604.f2976;
                    int i2 = AbstractC0651.f3052;
                    interfaceC0638M2715 = C0668.m2715(c0642Mo2572, c0661, c06222, c06712);
                } else {
                    int i3 = AbstractC0588.f2955;
                    C0661 c06612 = AbstractC0587.f2953;
                    C0622 c06223 = AbstractC0656.f3064;
                    int i4 = AbstractC0651.f3052;
                    interfaceC0638M2715 = C0668.m2715(c0642Mo2572, c06612, c06223, null);
                }
            } else if (c0642Mo2572.m2657() - 1 != 1) {
                int i5 = AbstractC0588.f2955;
                C0621 c0621 = AbstractC0587.f2954;
                C0622 c06224 = AbstractC0656.f3063;
                C0671 c06713 = AbstractC0604.f2975;
                if (c06713 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                int i6 = AbstractC0651.f3052;
                interfaceC0638M2715 = C0668.m2715(c0642Mo2572, c0621, c06224, c06713);
            } else {
                int i7 = AbstractC0588.f2955;
                C0621 c06212 = AbstractC0587.f2954;
                C0622 c06225 = AbstractC0656.f3063;
                int i8 = AbstractC0651.f3052;
                interfaceC0638M2715 = C0668.m2715(c0642Mo2572, c06212, c06225, null);
            }
            InterfaceC0638 interfaceC0638 = (InterfaceC0638) concurrentHashMap.putIfAbsent(cls, interfaceC0638M2715);
            if (interfaceC0638 != null) {
                return interfaceC0638;
            }
        }
        return interfaceC0638M2715;
    }
}
