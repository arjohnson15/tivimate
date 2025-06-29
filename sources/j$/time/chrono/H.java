package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class H extends AbstractC5398c {
    private static final long serialVersionUID = -8722293800195731463L;
    private final transient LocalDate a;

    H(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private int X() {
        return this.a.getYear() + 543;
    }

    private H Z(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new H(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 8, this);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final l D() {
        return X() >= 1 ? I.BE : I.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.p pVar) {
        return (H) super.H(pVar);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    /* renamed from: M */
    public final ChronoLocalDate n(long j, TemporalUnit temporalUnit) {
        return (H) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c
    final ChronoLocalDate U(long j) {
        return Z(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC5398c
    final ChronoLocalDate V(long j) {
        return Z(this.a.j0(j));
    }

    @Override // j$.time.chrono.AbstractC5398c
    final ChronoLocalDate W(long j) {
        return Z(this.a.l0(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.H d(long r9, j$.time.temporal.q r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.v(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.G.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.LocalDate r3 = r8.a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.F r11 = j$.time.chrono.F.d
            j$.time.temporal.t r11 = r11.K(r0)
            r11.b(r9, r0)
            int r11 = r8.X()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.Z()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r3.j0(r9)
            j$.time.chrono.H r9 = r8.Z(r9)
            return r9
        L4c:
            j$.time.chrono.F r2 = j$.time.chrono.F.d
            j$.time.temporal.t r2 = r2.K(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.LocalDate r9 = r3.d(r9, r11)
            j$.time.chrono.H r9 = r8.Z(r9)
            return r9
        L6b:
            int r9 = r8.X()
            int r9 = (-542) - r9
            j$.time.LocalDate r9 = r3.s0(r9)
            j$.time.chrono.H r9 = r8.Z(r9)
            return r9
        L7a:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r3.s0(r2)
            j$.time.chrono.H r9 = r8.Z(r9)
            return r9
        L85:
            int r9 = r8.X()
            r10 = 1
            if (r9 < r10) goto L8d
            goto L8f
        L8d:
            int r2 = 1 - r2
        L8f:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r3.s0(r2)
            j$.time.chrono.H r9 = r8.Z(r9)
            return r9
        L9a:
            j$.time.chrono.ChronoLocalDate r9 = super.d(r9, r11)
            j$.time.chrono.H r9 = (j$.time.chrono.H) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.H.d(long, j$.time.temporal.q):j$.time.chrono.H");
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k a() {
        return F.d;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate e(long j, TemporalUnit temporalUnit) {
        return (H) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (H) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return this.a.equals(((H) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        F.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    /* renamed from: k */
    public final ChronoLocalDate r(j$.time.temporal.m mVar) {
        return (H) super.r(mVar);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (H) super.n(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.Temporal
    public final Temporal r(LocalDate localDate) {
        return (H) super.r(localDate);
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.A(this);
        }
        if (!AbstractC5402g.h(this, qVar)) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = G.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.s(qVar);
        }
        if (i != 4) {
            return F.d.K(aVar);
        }
        j$.time.temporal.t tVarN = j$.time.temporal.a.YEAR.n();
        return j$.time.temporal.t.j(1L, X() <= 0 ? (-(tVarN.e() + 543)) + 1 : 543 + tVarN.d());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i = G.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 4) {
            int iX = X();
            if (iX < 1) {
                iX = 1 - iX;
            }
            return iX;
        }
        LocalDate localDate = this.a;
        if (i == 5) {
            return ((X() * 12) + localDate.Z()) - 1;
        }
        if (i == 6) {
            return X();
        }
        if (i != 7) {
            return localDate.v(qVar);
        }
        return X() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final long w() {
        return this.a.w();
    }

    @Override // j$.time.chrono.AbstractC5398c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(j$.time.k kVar) {
        return C5400e.T(this, kVar);
    }
}
