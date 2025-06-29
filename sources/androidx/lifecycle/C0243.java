package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import p285.C3383;

/* renamed from: androidx.lifecycle.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0243 implements InterfaceC0213 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f1282;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f1283;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f1284;

    public C0243(InterfaceC0222 interfaceC0222) {
        this.f1284 = 2;
        this.f1282 = interfaceC0222;
        C0258 c0258 = C0258.f1317;
        Class<?> cls = interfaceC0222.getClass();
        C0209 c0209 = (C0209) c0258.f1319.get(cls);
        this.f1283 = c0209 == null ? c0258.m1092(cls, null) : c0209;
    }

    public /* synthetic */ C0243(Object obj, int i, Object obj2) {
        this.f1284 = i;
        this.f1282 = obj;
        this.f1283 = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f1284) {
            case 0:
                int i = AbstractC0240.f1280[enumC0247.ordinal()];
                InterfaceC0211 interfaceC0211 = (InterfaceC0211) this.f1282;
                if (i == 3) {
                    interfaceC0211.mo1006();
                } else if (i == 6) {
                    interfaceC0211.onDestroy(interfaceC0262);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0213 interfaceC0213 = (InterfaceC0213) this.f1283;
                if (interfaceC0213 != null) {
                    interfaceC0213.mo607(interfaceC0262, enumC0247);
                    return;
                }
                return;
            case 1:
                if (enumC0247 == EnumC0247.ON_START) {
                    ((AbstractC0233) this.f1282).mo1031(this);
                    ((C3383) this.f1283).m8244();
                    return;
                }
                return;
            default:
                HashMap map = ((C0209) this.f1283).f1220;
                List list = (List) map.get(enumC0247);
                InterfaceC0222 interfaceC0222 = (InterfaceC0222) this.f1282;
                C0209.m1005(list, interfaceC0262, enumC0247, interfaceC0222);
                C0209.m1005((List) map.get(EnumC0247.ON_ANY), interfaceC0262, enumC0247, interfaceC0222);
                return;
        }
    }
}
