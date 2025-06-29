package p061;

import androidx.leanback.widget.ﾞᐧ;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p331.C3761;

/* renamed from: ʾـ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1422 extends AbstractC1373 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1365 f5792;

    public AbstractC1422(AbstractC1361 abstractC1361) {
        C1384 c1384 = new C1384(this);
        ﾞᐧ r2 = new ﾞᐧ(10, this);
        synchronized (AbstractC1361.f5519) {
            try {
                if (AbstractC1361.f5517 == null) {
                    AbstractC1361.f5517 = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1365 c1365 = new C1365(r2, new C3761(AbstractC1361.f5517, 4, abstractC1361));
        this.f5792 = c1365;
        c1365.f5545.add(c1384);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Object m4923(int i) {
        return this.f5792.f5543.get(i);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m4924(List list) {
        C1365 c1365 = this.f5792;
        int i = c1365.f5544 + 1;
        c1365.f5544 = i;
        List list2 = c1365.f5540;
        if (list == list2) {
            return;
        }
        ﾞᐧ r3 = c1365.f5542;
        if (list == null) {
            int size = list2.size();
            c1365.f5540 = null;
            c1365.f5543 = Collections.emptyList();
            r3.ﾞᐧ(0, size);
            c1365.m4740();
            return;
        }
        if (list2 != null) {
            ((ExecutorService) c1365.f5539.f14527).execute(new RunnableC1432(c1365, list2, list, i, 0));
            return;
        }
        c1365.f5540 = list;
        c1365.f5543 = DesugarCollections.unmodifiableList(list);
        r3.ˋˉ(0, list.size());
        c1365.m4740();
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        return this.f5792.f5543.size();
    }
}
