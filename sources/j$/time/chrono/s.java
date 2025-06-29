package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s implements l {
    public static final s BCE;
    public static final s CE;
    private static final /* synthetic */ s[] a;

    static {
        s sVar = new s("BCE", 0);
        BCE = sVar;
        s sVar2 = new s("CE", 1);
        CE = sVar2;
        a = new s[]{sVar, sVar2};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) a.clone();
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
