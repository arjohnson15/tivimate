package p164;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊᵔ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2378 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Iterator f9399;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public /* synthetic */ Object f9400;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ List f9401;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f9402;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object f9403;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f9404;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2378(List list, ArrayList arrayList, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f9401 = list;
        this.f9402 = arrayList;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2378) mo1056(obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        Iterator it;
        List list;
        int i = this.f9404;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            obj = this.f9400;
            it = this.f9401.iterator();
            list = this.f9402;
        } else if (i == 1) {
            Object obj2 = this.f9403;
            Iterator it2 = this.f9399;
            List list2 = (List) this.f9400;
            ˉⁱ.ˆʿ(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C2360(1, null));
                this.f9400 = list2;
                this.f9399 = it2;
                this.f9403 = null;
                this.f9404 = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f9399;
            list = (List) this.f9400;
            ˉⁱ.ˆʿ(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f9400 = list;
        this.f9399 = it;
        this.f9403 = obj;
        this.f9404 = 1;
        throw null;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2378 c2378 = new C2378(this.f9401, this.f9402, interfaceC3746);
        c2378.f9400 = obj;
        return c2378;
    }
}
