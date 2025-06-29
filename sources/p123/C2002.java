package p123;

import j$.util.DesugarCollections;
import java.util.HashMap;
import p103.C1787;
import p103.InterfaceC1789;
import p103.InterfaceC1792;
import p191.C2652;
import p302.C3510;
import p302.InterfaceC3513;

/* renamed from: ˈـ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2002 implements InterfaceC1789 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1787 f7619;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1787 f7620;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2002 f7621 = new C2002();

    static {
        C3510 c3510 = new C3510(1);
        HashMap map = new HashMap();
        map.put(InterfaceC3513.class, c3510);
        f7619 = new C1787("eventsDroppedCount", DesugarCollections.unmodifiableMap(new HashMap(map)));
        C3510 c35102 = new C3510(3);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC3513.class, c35102);
        f7620 = new C1787("reason", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p103.InterfaceC1790
    /* renamed from: ـﹶ */
    public final void mo4581(Object obj, Object obj2) {
        C2652 c2652 = (C2652) obj;
        InterfaceC1792 interfaceC1792 = (InterfaceC1792) obj2;
        interfaceC1792.mo4582(f7619, c2652.f10528);
        interfaceC1792.mo4589(f7620, c2652.f10527);
    }
}
