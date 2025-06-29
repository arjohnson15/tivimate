package p061;

import androidx.leanback.widget.ﾞᐧ;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p331.C3761;

/* renamed from: ʾـ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1416 extends AbstractC1373 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1435 f5778;

    public AbstractC1416(AbstractC1361 abstractC1361) {
        C1392 c1392 = new C1392(this);
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
        C1435 c1435 = new C1435(r2, new C3761(AbstractC1361.f5517, 4, abstractC1361));
        this.f5778 = c1435;
        c1435.f5880.add(c1392);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Object m4909(int i) {
        return this.f5778.f5878.get(i);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m4910(List list, boolean z) {
        C1435 c1435 = this.f5778;
        int i = c1435.f5879 + 1;
        c1435.f5879 = i;
        List list2 = c1435.f5875;
        if (list != list2) {
            if (!z || list == null) {
                ﾞᐧ r3 = c1435.f5877;
                if (list == null) {
                    int size = list2.size();
                    c1435.f5875 = null;
                    c1435.f5878 = Collections.emptyList();
                    r3.ﾞᐧ(0, size);
                    c1435.m4971();
                } else if (list2 == null) {
                    c1435.f5875 = list;
                    c1435.f5878 = DesugarCollections.unmodifiableList(list);
                    r3.ˋˉ(0, list.size());
                    c1435.m4971();
                } else {
                    ((ExecutorService) c1435.f5874.f14527).execute(new RunnableC1432(c1435, list2, list, i, 1));
                }
            } else {
                c1435.f5875 = list;
                c1435.f5878 = DesugarCollections.unmodifiableList(list);
                c1435.m4971();
            }
        }
        if (!z || list == null) {
            return;
        }
        m4765();
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        return this.f5778.f5878.size();
    }
}
