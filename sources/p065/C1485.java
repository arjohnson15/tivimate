package p065;

import p013.C1047;
import p034.InterfaceC1224;
import p414.AbstractC4717;
import p457.C5368;

/* renamed from: ʾᵔ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1485 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f6058;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6059;

    public /* synthetic */ C1485(int i, Object obj) {
        this.f6059 = i;
        this.f6058 = obj;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5056(InterfaceC1224 interfaceC1224) {
        switch (this.f6059) {
            case 0:
                ((C1047) this.f6058).mo4036(interfaceC1224);
                return;
            default:
                interfaceC1224.mo4386();
                try {
                    StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((C5368) this.f6058).getClass();
                    sb.append(System.currentTimeMillis() - AbstractC4717.f18104);
                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    interfaceC1224.mo4392(sb.toString());
                    interfaceC1224.mo4390();
                    return;
                } finally {
                    interfaceC1224.mo4385();
                }
        }
    }
}
