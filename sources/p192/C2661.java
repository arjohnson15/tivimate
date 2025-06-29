package p192;

import java.util.concurrent.ThreadPoolExecutor;
import ˏʼ.ʽᐧ;
import ﹶˋ.ـﹶ;

/* renamed from: ˎˉ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2661 extends ʽᐧ {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f10544;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final /* synthetic */ ʽᐧ f10545;

    public C2661(ʽᐧ r1, ThreadPoolExecutor threadPoolExecutor) {
        this.f10545 = r1;
        this.f10544 = threadPoolExecutor;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m6838(ـﹶ r3) {
        ThreadPoolExecutor threadPoolExecutor = this.f10544;
        try {
            this.f10545.ʿˏ(r3);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m6839(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f10544;
        try {
            this.f10545.ﹳˎ(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
