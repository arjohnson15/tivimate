package p123;

import j$.util.DesugarCollections;
import java.util.HashMap;
import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;
import p191.C2646;
import p302.C3510;
import p302.InterfaceC3513;

/* renamed from: ˈـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1993 implements InterfaceC1789 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7589;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1993 f7590 = new C1993();

    static {
        C3510 c3510 = new C3510(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3513.class, c3510);
        f7589 = new C1787("storageMetrics", DesugarCollections.unmodifiableMap(new HashMap(map)));
    }

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        ((InterfaceC1792) obj2).mo4589(f7589, ((C2646) obj).f10505);
    }
}
