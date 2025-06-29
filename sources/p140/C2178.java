package p140;

import androidx.work.impl.WorkDatabase_Impl;
import p013.C1047;
import p148.C2274;
import p155.EnumC2332;
import p184.InterfaceC2552;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;
import ˏʼ.ʽᐧ;

/* renamed from: ˉˏ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2178 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f8555;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ String[] f8556;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C1047 f8557;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f8558;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ WorkDatabase_Impl f8559;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178(WorkDatabase_Impl workDatabase_Impl, String[] strArr, C1047 c1047, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f8559 = workDatabase_Impl;
        this.f8556 = strArr;
        this.f8557 = c1047;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2178) mo1056((InterfaceC2552) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f8555;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C2168 c2168 = new C2168(this.f8559, (InterfaceC2552) this.f8558, this.f8556, this.f8557, null);
            this.f8555 = 1;
            C2274 c2274 = new C2274(this, mo3963());
            if (ʽᐧ.ᐧˋ(c2274, c2274, c2168) == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2178 c2178 = new C2178(this.f8559, this.f8556, this.f8557, interfaceC3746);
        c2178.f8558 = obj;
        return c2178;
    }
}
