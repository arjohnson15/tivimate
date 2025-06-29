package p457;

import androidx.work.CoroutineWorker;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞﹶ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5372 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f20840;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ CoroutineWorker f20841;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5372(CoroutineWorker coroutineWorker, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f20841 = coroutineWorker;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C5372) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f20840;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f20840 = 1;
            obj = this.f20841.mo1367(this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return obj;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C5372(this.f20841, interfaceC3746);
    }
}
