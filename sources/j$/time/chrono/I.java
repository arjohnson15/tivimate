package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class I implements l {
    public static final I BE;
    public static final I BEFORE_BE;
    private static final /* synthetic */ I[] a;

    static {
        I i = new I("BEFORE_BE", 0);
        BEFORE_BE = i;
        I i2 = new I("BE", 1);
        BE = i2;
        a = new I[]{i, i2};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object A(j$.time.temporal.r rVar) {
        return AbstractC5402g.m(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return AbstractC5402g.i(this, qVar);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.q qVar) {
        return AbstractC5402g.f(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long v(j$.time.temporal.q qVar) {
        return AbstractC5402g.g(this, qVar);
    }
}
