package p226;

import android.util.Log;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.C0091;
import androidx.fragment.app.C0101;
import androidx.fragment.app.C0117;
import androidx.fragment.app.C0118;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p013.AbstractC1041;
import p013.AbstractC1052;
import p013.C1056;
import p070.AbstractC1547;
import p288.C3397;
import p291.AbstractC3459;
import p338.InterfaceC3856;
import ٴˉ.ﹳﹳ;

/* renamed from: ˑʽ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3035 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f11725;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3031 f11726;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3035(C3031 c3031, int i) {
        super(1);
        this.f11725 = i;
        this.f11726 = c3031;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f11725) {
            case 0:
                C3031 c3031 = this.f11726;
                C1056 c1056 = c3031.f11707;
                ListIterator listIterator = c1056.listIterator(c1056.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0118) objPrevious).f713) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                C0118 c0118 = (C0118) objPrevious;
                c3031.f11709 = c0118;
                if (c0118 != null) {
                    boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                    AbstractC0104 abstractC0104 = c0118.f714;
                    if (zIsLoggable) {
                        String str = "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + abstractC0104;
                    }
                    abstractC0104.m692();
                    abstractC0104.m666(new C0117(abstractC0104), false);
                }
                break;
            default:
                C3026 c3026 = (C3026) obj;
                C3031 c30312 = this.f11726;
                C0118 c01182 = c30312.f11709;
                if (c01182 == null) {
                    C1056 c10562 = c30312.f11707;
                    ListIterator listIterator2 = c10562.listIterator(c10562.mo4037());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((C0118) objPrevious2).f713) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    c01182 = (C0118) objPrevious2;
                }
                if (c01182 != null) {
                    boolean zIsLoggable2 = Log.isLoggable("FragmentManager", 2);
                    AbstractC0104 abstractC01042 = c01182.f714;
                    if (zIsLoggable2) {
                        String str2 = "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + abstractC01042;
                    }
                    if (abstractC01042.f611 != null) {
                        Iterator it = abstractC01042.m671(new ArrayList(Collections.singletonList(abstractC01042.f611)), 0, 1).iterator();
                        while (it.hasNext()) {
                            C0101 c0101 = (C0101) it.next();
                            c0101.getClass();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                String str3 = "SpecialEffectsController: Processing Progress " + c3026.f11701;
                            }
                            ArrayList arrayList = c0101.f590;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                AbstractC1052.m4043(((C0091) it2.next()).f553, arrayList2);
                            }
                            List listM4016 = AbstractC1041.m4016(AbstractC1041.m4029(arrayList2));
                            int size = listM4016.size();
                            for (int i = 0; i < size; i++) {
                                ((AbstractC3459) listM4016.get(i)).mo591(c3026);
                            }
                        }
                        Iterator it3 = abstractC01042.f624.iterator();
                        while (it3.hasNext()) {
                            ((ﹳﹳ) it3.next()).getClass();
                        }
                    }
                }
                break;
        }
        return C3397.f13249;
    }
}
