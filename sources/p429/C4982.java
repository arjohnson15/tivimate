package p429;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p013.AbstractC1037;
import p013.AbstractC1041;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p174.C2473;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p428.C4921;
import ˈⁱ.ˉⁱ;
import ﹶˋ.ـﹶ;

/* renamed from: ﹶˎ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4982 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f18818;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ ـﹶ f18819;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f18820;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4982(ـﹶ r1, ArrayList arrayList, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f18819 = r1;
        this.f18820 = arrayList;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4982) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) throws RemoteException {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f18818;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C2473 c2473 = C2473.f9825;
            this.f18818 = 1;
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
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Collection collectionValues = map.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((C4921) it.next()).f18601.m3801()) {
                        ArrayList arrayList = this.f18820;
                        ـﹶ r2 = this.f18819;
                        for (Message message : AbstractC1041.m4018(AbstractC1041.m4015(AbstractC1037.m4006(ـﹶ.ـﹶ(r2, arrayList, 2), ـﹶ.ـﹶ(r2, arrayList, 1))), new C4965())) {
                            if (((Messenger) r2.ˎˑ) != null) {
                                try {
                                    String str = "Sending lifecycle " + message.what + " to service";
                                    Messenger messenger = (Messenger) r2.ˎˑ;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e) {
                                    String str2 = "Unable to deliver message: " + message.what;
                                    r2.ˎٴ(message);
                                }
                            } else {
                                r2.ˎٴ(message);
                            }
                        }
                    }
                }
            }
        }
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C4982(this.f18819, this.f18820, interfaceC3746);
    }
}
