package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l {
    static final r a = new o(1);
    static final r b = new o(2);
    static final r c = new o(3);
    static final r d = new o(4);
    static final r e = new o(5);
    static final r f = new o(6);
    static final r g = new o(7);

    public static int a(TemporalAccessor temporalAccessor, q qVar) {
        t tVarS = temporalAccessor.s(qVar);
        if (!tVarS.h()) {
            throw new s("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jV = temporalAccessor.v(qVar);
        if (tVarS.i(jV)) {
            return (int) jV;
        }
        throw new j$.time.c("Invalid value for " + qVar + " (valid values " + tVarS + "): " + jV);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.e(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.e(j2, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, r rVar) {
        if (rVar == a || rVar == b || rVar == c) {
            return null;
        }
        return rVar.g(temporalAccessor);
    }

    public static t d(TemporalAccessor temporalAccessor, q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.A(temporalAccessor);
        }
        if (temporalAccessor.f(qVar)) {
            return ((a) qVar).n();
        }
        throw new s(j$.time.d.a("Unsupported field: ", qVar));
    }

    public static r e() {
        return b;
    }

    public static r f() {
        return f;
    }

    public static r g() {
        return g;
    }

    public static /* synthetic */ int h(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }

    public static r i() {
        return d;
    }

    public static r j() {
        return c;
    }

    public static r k() {
        return e;
    }

    public static r l() {
        return a;
    }
}
