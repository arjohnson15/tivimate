package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q implements l {
    public static final q AH;
    private static final /* synthetic */ q[] a;

    static {
        q qVar = new q("AH", 0);
        AH = qVar;
        a = new q[]{qVar};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object A(j$.time.temporal.r rVar) {
        return AbstractC5402g.m(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(1, j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return AbstractC5402g.i(this, qVar);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.q qVar) {
        return AbstractC5402g.f(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.ERA ? j$.time.temporal.t.j(1L, 1L) : j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long v(j$.time.temporal.q qVar) {
        return AbstractC5402g.g(this, qVar);
    }
}
