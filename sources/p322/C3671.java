package p322;

import java.util.Map;
import p077.C1672;
import p077.C1673;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ᴵˉ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3671 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ Object f14077;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C3678 f14078;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f14079;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1673 f14080;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3671(Object obj, C1673 c1673, C3678 c3678, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f14079 = obj;
        this.f14080 = c1673;
        this.f14078 = c3678;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C3671 c3671 = (C3671) mo1056((C1672) obj, (InterfaceC3746) obj2);
        C3397 c3397 = C3397.f13249;
        c3671.mo1055(c3397);
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        ˉⁱ.ˆʿ(obj);
        C1672 c1672 = (C1672) this.f14077;
        C1673 c1673 = this.f14080;
        Object obj2 = this.f14079;
        if (obj2 != null) {
            c1672.m5362(c1673, obj2);
        } else {
            if (c1672.f6522.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            c1672.f6523.remove(c1673);
        }
        C3678 c3678 = this.f14078;
        c3678.getClass();
        Boolean bool = (Boolean) c1672.f6523.get(C3678.f14098);
        C1673 c16732 = C3678.f14101;
        Map map = c1672.f6523;
        c3678.f14102 = new C3676(bool, (Double) map.get(c16732), (Integer) map.get(C3678.f14097), (Integer) map.get(C3678.f14099), (Long) map.get(C3678.f14100));
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C3671 c3671 = new C3671(this.f14079, this.f14080, this.f14078, interfaceC3746);
        c3671.f14077 = obj;
        return c3671;
    }
}
