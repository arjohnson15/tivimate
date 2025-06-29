package p378;

import android.view.View;
import android.view.ViewGroup;
import p013.C1032;
import p070.AbstractC1563;
import p070.C1546;
import p070.InterfaceC1559;
import p155.EnumC2332;
import p185.AbstractC2561;
import p218.C2830;
import p218.C2831;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ᵢٴ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4395 extends AbstractC2561 implements InterfaceC3864, InterfaceC1559 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f16923;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ View f16924;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f16925;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public /* synthetic */ Object f16926;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4395(View view, InterfaceC3746 interfaceC3746) {
        super(interfaceC3746);
        this.f16924 = view;
        this.f16923 = 2;
    }

    @Override // p185.AbstractC2563
    public final String toString() {
        if (this.f10145 != null) {
            return super.toString();
        }
        AbstractC1563.f6304.getClass();
        return C1546.m5136(this);
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4395) mo1056((C2830) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p070.InterfaceC1559
    /* renamed from: ˑʽ */
    public final int mo5137() {
        return this.f16923;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        Object obj2;
        Object obj3 = EnumC2332.f9250;
        int i = this.f16925;
        View view = this.f16924;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C2830 c2830 = (C2830) this.f16926;
            this.f16926 = c2830;
            this.f16925 = 1;
            c2830.f10981 = view;
            c2830.f10984 = 3;
            c2830.f10983 = this;
            return obj3;
        }
        Object obj4 = C3397.f13249;
        if (i == 1) {
            C2830 c28302 = (C2830) this.f16926;
            ˉⁱ.ˆʿ(obj);
            if (view instanceof ViewGroup) {
                this.f16926 = null;
                this.f16925 = 2;
                c28302.getClass();
                C2831 c2831 = new C2831(new C1032(3, (ViewGroup) view));
                if (c2831.f10985.hasNext()) {
                    c28302.f10982 = c2831;
                    c28302.f10984 = 2;
                    c28302.f10983 = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return obj4;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C4395 c4395 = new C4395(this.f16924, interfaceC3746);
        c4395.f16926 = obj;
        return c4395;
    }
}
