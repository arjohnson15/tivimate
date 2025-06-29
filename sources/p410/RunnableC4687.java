package p410;

import java.util.concurrent.ExecutionException;
import p072.C1602;
import p288.C3403;
import p395.InterfaceFutureC4542;
import p414.AbstractC4730;

/* renamed from: ﹳˎ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4687 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceFutureC4542 f17839;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C1602 f17840;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17841;

    public /* synthetic */ RunnableC4687(InterfaceFutureC4542 interfaceFutureC4542, C1602 c1602, int i) {
        this.f17841 = i;
        this.f17839 = interfaceFutureC4542;
        this.f17840 = c1602;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17841) {
            case 0:
                InterfaceFutureC4542 interfaceFutureC4542 = this.f17839;
                boolean zIsCancelled = interfaceFutureC4542.isCancelled();
                C1602 c1602 = this.f17840;
                if (zIsCancelled) {
                    c1602.m5209(null);
                    break;
                } else {
                    try {
                        c1602.mo3974(AbstractC4686.m10588(interfaceFutureC4542));
                        break;
                    } catch (ExecutionException e) {
                        c1602.mo3974(new C3403(e.getCause()));
                        return;
                    }
                }
            default:
                InterfaceFutureC4542 interfaceFutureC45422 = this.f17839;
                boolean zIsCancelled2 = interfaceFutureC45422.isCancelled();
                C1602 c16022 = this.f17840;
                if (zIsCancelled2) {
                    c16022.m5209(null);
                    break;
                } else {
                    try {
                        c16022.mo3974(AbstractC4730.m10643(interfaceFutureC45422));
                        break;
                    } catch (ExecutionException e2) {
                        c16022.mo3974(new C3403(e2.getCause()));
                    }
                }
        }
    }
}
