package p065;

import android.database.SQLException;
import java.util.Set;
import p013.C1038;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1481 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6025;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f6026;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1512 f6027;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1481(C1512 c1512, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6027 = c1512;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1481) mo1056((InterfaceC1521) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        InterfaceC1521 interfaceC1521;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6025;
        C1038 c1038 = C1038.f4437;
        try {
            if (i == 0) {
                ˉⁱ.ˆʿ(obj);
                interfaceC1521 = (InterfaceC1521) this.f6026;
                this.f6026 = interfaceC1521;
                this.f6025 = 1;
                obj = interfaceC1521.mo5098(this);
                if (obj == enumC2332) {
                    return enumC2332;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ˉⁱ.ˆʿ(obj);
                    return (Set) obj;
                }
                interfaceC1521 = (InterfaceC1521) this.f6026;
                ˉⁱ.ˆʿ(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return c1038;
            }
            EnumC1475 enumC1475 = EnumC1475.f6003;
            C1517 c1517 = new C1517(this.f6027, null);
            this.f6026 = null;
            this.f6025 = 2;
            obj = interfaceC1521.mo5097(enumC1475, c1517, this);
            if (obj == enumC2332) {
                return enumC2332;
            }
            return (Set) obj;
        } catch (SQLException unused) {
            return c1038;
        }
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C1481 c1481 = new C1481(this.f6027, interfaceC3746);
        c1481.f6026 = obj;
        return c1481;
    }
}
