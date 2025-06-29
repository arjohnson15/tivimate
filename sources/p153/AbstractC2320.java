package p153;

import androidx.leanback.widget.ﾞᐧ;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p015.C1067;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p397.C4612;
import p397.InterfaceC4608;

/* renamed from: ˊˉ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2320 implements InterfaceC4608 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayDeque f9182;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9183;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final PriorityQueue f9184;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayDeque f9185 = new ArrayDeque();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f9186;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f9187;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2321 f9188;

    public AbstractC2320() {
        for (int i = 0; i < 10; i++) {
            this.f9185.add(new C2321());
        }
        this.f9182 = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.f9182;
            C1067 c1067 = new C1067(13, this);
            C2327 c2327 = new C2327(3);
            c2327.f9237 = c1067;
            arrayDeque.add(c2327);
        }
        this.f9184 = new PriorityQueue();
        this.f9187 = -9223372036854775807L;
    }

    @Override // p312.InterfaceC3585
    public void flush() {
        ArrayDeque arrayDeque;
        this.f9186 = 0L;
        this.f9183 = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f9184;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f9185;
            if (zIsEmpty) {
                break;
            }
            C2321 c2321 = (C2321) priorityQueue.poll();
            int i = AbstractC4470.f17202;
            c2321.mo8492();
            arrayDeque.add(c2321);
        }
        C2321 c23212 = this.f9188;
        if (c23212 != null) {
            c23212.mo8492();
            arrayDeque.add(c23212);
            this.f9188 = null;
        }
    }

    @Override // p312.InterfaceC3585
    /* renamed from: ʽᐧ */
    public void mo1102() {
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public abstract boolean mo6379();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract void mo6380(C2321 c2321);

    @Override // p397.InterfaceC4608
    /* renamed from: ˑʽ */
    public final void mo5469(long j) {
        this.f9183 = j;
    }

    @Override // p312.InterfaceC3585
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo6381(long j) {
        this.f9187 = j;
    }

    @Override // p312.InterfaceC3585
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object mo6382() {
        AbstractC4464.m10132(this.f9188 == null);
        ArrayDeque arrayDeque = this.f9185;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C2321 c2321 = (C2321) arrayDeque.pollFirst();
        this.f9188 = c2321;
        return c2321;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public abstract ﾞᐧ mo6383();

    @Override // p312.InterfaceC3585
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo6384(C4612 c4612) {
        AbstractC4464.m10142(c4612 == this.f9188);
        C2321 c2321 = (C2321) c4612;
        long j = this.f9187;
        if (j == -9223372036854775807L || c2321.f13807 >= j) {
            long j2 = this.f9186;
            this.f9186 = 1 + j2;
            c2321.f9189 = j2;
            this.f9184.add(c2321);
        } else {
            c2321.mo8492();
            this.f9185.add(c2321);
        }
        this.f9188 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        return null;
     */
    @Override // p312.InterfaceC3585
    /* renamed from: ﹶˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p397.AbstractC4600 mo6378() {
        /*
            r8 = this;
            java.util.ArrayDeque r0 = r8.f9182
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r8.f9184
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            ˊˉ.ˏᵢ r3 = (p153.C2321) r3
            int r4 = p383.AbstractC4470.f17202
            long r3 = r3.f13807
            long r5 = r8.f9183
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            ˊˉ.ˏᵢ r1 = (p153.C2321) r1
            r3 = 4
            boolean r4 = r1.m4401(r3)
            java.util.ArrayDeque r5 = r8.f9185
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            ⁱᵎ.ˉי r0 = (p397.AbstractC4600) r0
            r0.m4409(r3)
            r1.mo8492()
            r5.add(r1)
            return r0
        L41:
            r8.mo6380(r1)
            boolean r3 = r8.mo6379()
            if (r3 == 0) goto L63
            androidx.leanback.widget.ﾞᐧ r2 = r8.mo6383()
            java.lang.Object r0 = r0.pollFirst()
            ⁱᵎ.ˉי r0 = (p397.AbstractC4600) r0
            long r3 = r1.f13807
            r0.f13784 = r3
            r0.f17602 = r2
            r0.f17603 = r3
            r1.mo8492()
            r5.add(r1)
            return r0
        L63:
            r1.mo8492()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p153.AbstractC2320.mo6378():ⁱᵎ.ˉי");
    }
}
