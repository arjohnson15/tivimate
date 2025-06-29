package p052;

import com.google.android.gms.internal.measurement.C0559;
import java.util.ArrayList;
import p200.C2755;
import p240.InterfaceC3101;

/* renamed from: ʾʼ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1326 implements InterfaceC3101 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f5387;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5388;

    public /* synthetic */ C1326(int i, Object obj) {
        this.f5388 = i;
        this.f5387 = obj;
    }

    @Override // p240.InterfaceC3101
    /* renamed from: ˑʽ */
    public final void mo731(Object obj) {
        switch (this.f5388) {
            case 0:
                C1327 c1327 = (C1327) obj;
                if (c1327 == null) {
                    c1327 = new C1327(-3);
                }
                ((C0559) this.f5387).m2486(c1327);
                return;
            default:
                C1327 c13272 = (C1327) obj;
                synchronized (AbstractC1323.f5382) {
                    try {
                        C2755 c2755 = AbstractC1323.f5384;
                        ArrayList arrayList = (ArrayList) c2755.get((String) this.f5387);
                        if (arrayList == null) {
                            return;
                        }
                        c2755.remove((String) this.f5387);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC3101) arrayList.get(i)).mo731(c13272);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
