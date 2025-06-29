package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x implements l, Serializable {
    public static final x d;
    private static final x[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient LocalDate b;
    private final transient String c;

    static {
        x xVar = new x(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = xVar;
        e = new x[]{xVar, new x(0, LocalDate.of(1912, 7, 30), "Taisho"), new x(1, LocalDate.of(1926, 12, 25), "Showa"), new x(2, LocalDate.of(1989, 1, 8), "Heisei"), new x(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    private x(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static x[] B() {
        x[] xVarArr = e;
        return (x[]) Arrays.copyOf(xVarArr, xVarArr.length);
    }

    static x g(LocalDate localDate) {
        if (localDate.isBefore(w.d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        x[] xVarArr = e;
        for (int length = xVarArr.length - 1; length >= 0; length--) {
            x xVar = xVarArr[length];
            if (localDate.compareTo(xVar.b) >= 0) {
                return xVar;
            }
        }
        return null;
    }

    static x l() {
        return e[r0.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static x u(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            x[] xVarArr = e;
            if (i2 < xVarArr.length) {
                return xVarArr[i2];
            }
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    private Object writeReplace() {
        return new D((byte) 5, this);
    }

    static long x() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.n().f();
        for (x xVar : e) {
            jF = Math.min(jF, (xVar.b.O() - xVar.b.Y()) + 1);
            if (xVar.q() != null) {
                jF = Math.min(jF, xVar.q().b.Y() - 1);
            }
        }
        return jF;
    }

    static long z() {
        int year = 1000000000 - l().b.getYear();
        x[] xVarArr = e;
        int year2 = xVarArr[0].b.getYear();
        for (int i = 1; i < xVarArr.length; i++) {
            x xVar = xVarArr[i];
            year = Math.min(year, (xVar.b.getYear() - year2) + 1);
            year2 = xVar.b.getYear();
        }
        return year;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object A(j$.time.temporal.r rVar) {
        return AbstractC5402g.m(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal C(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    final void G(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return AbstractC5402g.i(this, qVar);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return this.a;
    }

    final LocalDate m() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.q qVar) {
        return AbstractC5402g.f(this, (j$.time.temporal.a) qVar);
    }

    final x q() {
        if (this == l()) {
            return null;
        }
        return u(this.a + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return qVar == aVar ? u.d.K(aVar) : j$.time.temporal.l.d(this, qVar);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long v(j$.time.temporal.q qVar) {
        return AbstractC5402g.g(this, qVar);
    }
}
