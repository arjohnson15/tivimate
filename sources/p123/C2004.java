package p123;

import j$.util.DesugarCollections;
import java.util.HashMap;
import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;
import p191.C2649;
import p302.C3510;
import p302.InterfaceC3513;

/* renamed from: ˈـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2004 implements InterfaceC1789 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7624;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1787 f7625;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7626;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2004 f7627 = new C2004();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1787 f7628;

    static {
        C3510 c3510 = new C3510(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3513.class, c3510);
        f7624 = new C1787("window", DesugarCollections.unmodifiableMap(new HashMap(map)));
        C3510 c35102 = new C3510(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC3513.class, c35102);
        f7626 = new C1787("logSourceMetrics", DesugarCollections.unmodifiableMap(new HashMap(map2)));
        C3510 c35103 = new C3510(3);
        HashMap map3 = new HashMap();
        map3.put(InterfaceC3513.class, c35103);
        f7628 = new C1787("globalMetrics", DesugarCollections.unmodifiableMap(new HashMap(map3)));
        C3510 c35104 = new C3510(4);
        HashMap map4 = new HashMap();
        map4.put(InterfaceC3513.class, c35104);
        f7625 = new C1787("appNamespace", DesugarCollections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        C2649 c2649 = (C2649) obj;
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        interfaceC1792.mo4589(f7624, c2649.f10521);
        interfaceC1792.mo4589(f7626, c2649.f10519);
        interfaceC1792.mo4589(f7628, c2649.f10520);
        interfaceC1792.mo4589(f7625, c2649.f10522);
    }
}
