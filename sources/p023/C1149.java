package p023;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C0107;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.UUID;
import p070.AbstractC1547;
import p070.AbstractC1549;
import p141.RunnableC2187;
import p269.AbstractC3288;
import p269.C3289;
import p279.AbstractC3370;
import p288.C3397;
import p334.C3781;
import p338.InterfaceC3865;
import p406.RunnableC4645;
import p414.AbstractC4723;
import p414.C4722;
import p457.C5391;
import ʻˉ.ᐧˋ;

/* renamed from: ʼʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1149 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4792;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4793;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f4794;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1149(Object obj, int i, Object obj2) {
        super(0);
        this.f4792 = i;
        this.f4793 = obj;
        this.f4794 = obj2;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        switch (this.f4792) {
            case 0:
                C5391.m12163().m12168(AbstractC1148.f4791, "NetworkRequestConstraintController unregister callback");
                ((C1141) this.f4793).f4777.unregisterNetworkCallback((C1145) this.f4794);
                return C3397.f13249;
            case 1:
                AbstractC3370 abstractC3370 = ((AbstractC3288) this.f4793).f12820;
                C3289 c3289 = (C3289) this.f4794;
                synchronized (abstractC3370.f13192) {
                    if (abstractC3370.f13194.remove(c3289) && abstractC3370.f13194.isEmpty()) {
                        abstractC3370.mo8226();
                    }
                }
                return C3397.f13249;
            case 2:
                if (Log.isLoggable("FragmentManager", 2)) {
                }
                C0107 c0107 = (C0107) this.f4793;
                c0107.f667.mo6063(c0107.f670, new ᐧˋ(c0107, 15, (ViewGroup) this.f4794));
                return C3397.f13249;
            case 3:
                return new File(((Context) this.f4793).getApplicationContext().getFilesDir(), AbstractC1549.m5144(AbstractC1549.m5144(".preferences_pb", ((C3781) this.f4794).f14627), "datastore/"));
            case 4:
                C4722 c4722 = (C4722) this.f4793;
                c4722.f18122.m5045(new RunnableC4645(c4722, 0, (UUID) this.f4794));
                AbstractC4723.m10640(c4722.f18131, c4722.f18122, c4722.f18123);
                return C3397.f13249;
            default:
                C4722 c47222 = (C4722) this.f4794;
                WorkDatabase workDatabase = c47222.f18122;
                workDatabase.m5045(new RunnableC2187(workDatabase, (String) this.f4793, c47222, 9));
                AbstractC4723.m10640(c47222.f18131, c47222.f18122, c47222.f18123);
                return C3397.f13249;
        }
    }
}
