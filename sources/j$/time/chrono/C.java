package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class C implements l {
    public static final C BEFORE_ROC;
    public static final C ROC;
    private static final /* synthetic */ C[] a;

    static {
        C c = new C("BEFORE_ROC", 0);
        BEFORE_ROC = c;
        C c2 = new C("ROC", 1);
        ROC = c2;
        a = new C[]{c, c2};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) a.clone();
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
