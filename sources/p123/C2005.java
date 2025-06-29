package p123;

import j$.util.DesugarCollections;
import java.util.HashMap;
import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;
import p191.C2650;
import p302.C3510;
import p302.InterfaceC3513;

/* renamed from: ˈـ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2005 implements InterfaceC1789 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7629;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7630;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2005 f7631 = new C2005();

    static {
        C3510 c3510 = new C3510(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3513.class, c3510);
        f7629 = new C1787("currentCacheSizeBytes", DesugarCollections.unmodifiableMap(new HashMap(map)));
        C3510 c35102 = new C3510(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC3513.class, c35102);
        f7630 = new C1787("maxCacheSizeBytes", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        C2650 c2650 = (C2650) obj;
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        interfaceC1792.mo4582(f7629, c2650.f10524);
        interfaceC1792.mo4582(f7630, c2650.f10523);
    }
}
