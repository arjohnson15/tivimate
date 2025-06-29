package p385;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p141.RunnableC2187;
import p374.C4290;
import p383.AbstractC4470;
import p383.RunnableC4466;

/* renamed from: ᵢﹶ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4480 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4290 f17250;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f17251;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f17252;

    public C4480(CopyOnWriteArrayList copyOnWriteArrayList, int i, C4290 c4290) {
        this.f17251 = copyOnWriteArrayList;
        this.f17252 = i;
        this.f17250 = c4290;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ᵢﹶ.ˏʾ] */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10225() {
        Iterator it = this.f17251.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            AbstractC4470.m10217(c4499.f17317, new RunnableC4487(this, c4499.f17316, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ᵢﹶ.ˏʾ] */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m10226() {
        Iterator it = this.f17251.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            AbstractC4470.m10217(c4499.f17317, new RunnableC4487(this, c4499.f17316, 0));
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10227(int i) {
        Iterator it = this.f17251.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            AbstractC4470.m10217(c4499.f17317, new RunnableC4466(this, c4499.f17316, i, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ᵢﹶ.ˏʾ] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10228() {
        Iterator it = this.f17251.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            AbstractC4470.m10217(c4499.f17317, new RunnableC4487(this, c4499.f17316, 2));
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10229(Exception exc) {
        Iterator it = this.f17251.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            AbstractC4470.m10217(c4499.f17317, new RunnableC2187(this, c4499.f17316, exc, 6));
        }
    }
}
