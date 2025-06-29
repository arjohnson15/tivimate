package p429;

import android.util.Log;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p174.C2472;
import p174.C2473;
import p174.EnumC2475;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p428.C4921;
import p428.C4941;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹶˎ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4966 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f18775;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ String f18776;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4966(String str, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f18776 = str;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4966) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f18775;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C2473 c2473 = C2473.f9825;
            this.f18775 = 1;
            obj = c2473.m6598(this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        Collection<C4921> collectionValues = ((Map) obj).values();
        String str = this.f18776;
        for (C4921 c4921 : collectionValues) {
            C2472 c2472 = new C2472(str);
            c4921.getClass();
            String str2 = "App Quality Sessions session changed: " + c2472;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            C4941 c4941 = c4921.f18600;
            synchronized (c4941) {
                if (!Objects.equals(c4941.f18690, str)) {
                    C4941.m11065(c4941.f18691, c4941.f18689, str);
                    c4941.f18690 = str;
                }
            }
            String str3 = "Notified " + EnumC2475.f9830 + " of new session " + str;
        }
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C4966(this.f18776, interfaceC3746);
    }
}
