package p043;

import java.util.Date;
import java.util.HashMap;
import p103.InterfaceC1788;
import p103.InterfaceC1789;
import p103.InterfaceC1791;
import p264.InterfaceC3259;

/* renamed from: ʽי.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1294 implements InterfaceC3259 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1292 f5308 = new C1292(0);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1291 f5309 = new C1291();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1289 f5310;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1289 f5311;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f5312;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1292 f5313;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f5314;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f5315;

    /* JADX WARN: Type inference failed for: r0v1, types: [ʽי.ʽᐧ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ʽי.ʽᐧ] */
    static {
        final int i = 0;
        f5310 = new InterfaceC1788() { // from class: ʽי.ʽᐧ
            @Override // p103.InterfaceC1790
            /* renamed from: ـﹶ, reason: contains not printable characters */
            public final void mo4581(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC1791) obj2).mo4590((String) obj);
                        break;
                    default:
                        ((InterfaceC1791) obj2).mo4583(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f5311 = new InterfaceC1788() { // from class: ʽי.ʽᐧ
            @Override // p103.InterfaceC1790
            /* renamed from: ـﹶ, reason: contains not printable characters */
            public final void mo4581(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC1791) obj2).mo4590((String) obj);
                        break;
                    default:
                        ((InterfaceC1791) obj2).mo4583(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C1294() {
        HashMap map = new HashMap();
        this.f5314 = map;
        HashMap map2 = new HashMap();
        this.f5312 = map2;
        this.f5313 = f5308;
        this.f5315 = false;
        map2.put(String.class, f5310);
        map.remove(String.class);
        map2.put(Boolean.class, f5311);
        map.remove(Boolean.class);
        map2.put(Date.class, f5309);
        map.remove(Date.class);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3259 m4593(Class cls, InterfaceC1789 interfaceC1789) {
        this.f5314.put(cls, interfaceC1789);
        this.f5312.remove(cls);
        return this;
    }
}
