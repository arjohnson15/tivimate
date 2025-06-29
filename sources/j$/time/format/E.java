package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC5396a;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class E implements TemporalAccessor {
    ZoneId b;
    j$.time.chrono.k c;
    boolean d;
    private F e;
    private ChronoLocalDate f;
    private j$.time.k g;
    final HashMap a = new HashMap();
    j$.time.s h = j$.time.s.d;

    E() {
    }

    private void B(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new j$.time.c("Conflict found: Fields resolved to two different dates: " + this.f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (((AbstractC5396a) this.c).equals(chronoLocalDate.a())) {
                this.f = chronoLocalDate;
                return;
            }
            throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.c);
        }
    }

    private void C(j$.time.temporal.q qVar, j$.time.temporal.a aVar, Long l) {
        Long l2 = (Long) this.a.put(aVar, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + l + " while resolving  " + qVar);
    }

    private void g(TemporalAccessor temporalAccessor) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.q qVar = (j$.time.temporal.q) entry.getKey();
            if (temporalAccessor.f(qVar)) {
                try {
                    long jV = temporalAccessor.v(qVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jV != jLongValue) {
                        throw new j$.time.c("Conflict found: Field " + qVar + " " + jV + " differs from " + qVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private void m() {
        HashMap map = this.a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                q(zoneId);
                return;
            }
            Long l = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                q(ZoneOffset.d0(l.intValue()));
            }
        }
    }

    private void q(ZoneId zoneId) {
        HashMap map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        B(this.c.L(Instant.ofEpochSecond(((Long) map.remove(aVar)).longValue()), zoneId).c());
        C(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.b().l0()));
    }

    private void u(long j, long j2, long j3, long j4) {
        if (this.e == F.LENIENT) {
            long j5 = j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(j, 3600000000000L), j$.com.android.tools.r8.a.p(j2, 60000000000L)), j$.com.android.tools.r8.a.p(j3, 1000000000L)), j4);
            z(j$.time.k.c0(j$.com.android.tools.r8.a.n(j5, 86400000000000L)), j$.time.s.b((int) j$.com.android.tools.r8.a.o(j5, 86400000000000L)));
            return;
        }
        int iS = j$.time.temporal.a.MINUTE_OF_HOUR.S(j2);
        int iS2 = j$.time.temporal.a.NANO_OF_SECOND.S(j4);
        if (this.e == F.SMART && j == 24 && iS == 0 && j3 == 0 && iS2 == 0) {
            z(j$.time.k.g, j$.time.s.b(1));
        } else {
            z(j$.time.k.b0(j$.time.temporal.a.HOUR_OF_DAY.S(j), iS, j$.time.temporal.a.SECOND_OF_MINUTE.S(j3), iS2), j$.time.s.d);
        }
    }

    private void x() {
        HashMap map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            F f = this.e;
            if (f == F.STRICT || (f == F.SMART && jLongValue != 0)) {
                aVar.T(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            C(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            F f2 = this.e;
            if (f2 == F.STRICT || (f2 == F.SMART && jLongValue2 != 0)) {
                aVar3.T(jLongValue2);
            }
            C(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.e == F.LENIENT) {
                    C(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.p(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.T(jLongValue3);
                    aVar5.T(jLongValue3);
                    C(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.e != F.LENIENT) {
                aVar6.T(jLongValue5);
            }
            C(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            C(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            C(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            C(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.e != F.LENIENT) {
                aVar7.T(jLongValue6);
            }
            C(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            C(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.e != F.LENIENT) {
                aVar8.T(jLongValue7);
            }
            C(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            C(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.e != F.LENIENT) {
                aVar9.T(jLongValue8);
            }
            C(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            C(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            C(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.e != F.LENIENT) {
                aVar10.T(jLongValue9);
            }
            C(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            C(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            F f3 = this.e;
            F f4 = F.LENIENT;
            if (f3 != f4) {
                aVar11.T(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.e != f4) {
                    aVar12.T(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                C(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.e != f4) {
                    aVar13.T(jLongValue12);
                }
                C(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    u(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void z(j$.time.k kVar, j$.time.s sVar) {
        j$.time.k kVar2 = this.g;
        if (kVar2 == null) {
            this.g = kVar;
            this.h = sVar;
            return;
        }
        if (!kVar2.equals(kVar)) {
            throw new j$.time.c("Conflict found: Fields resolved to different times: " + this.g + " " + kVar);
        }
        j$.time.s sVar2 = this.h;
        sVar2.getClass();
        j$.time.s sVar3 = j$.time.s.d;
        if (sVar2 == sVar3 || sVar == sVar3 || this.h.equals(sVar)) {
            this.h = sVar;
            return;
        }
        throw new j$.time.c("Conflict found: Fields resolved to different excess periods: " + this.h + " " + sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.l()) {
            return this.b;
        }
        if (rVar == j$.time.temporal.l.e()) {
            return this.c;
        }
        if (rVar == j$.time.temporal.l.f()) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return LocalDate.U(chronoLocalDate);
            }
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this.g;
        }
        if (rVar != j$.time.temporal.l.i()) {
            if (rVar != j$.time.temporal.l.k() && rVar == j$.time.temporal.l.j()) {
                return null;
            }
            return rVar.g(this);
        }
        Long l = (Long) this.a.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l != null) {
            return ZoneOffset.d0(l.intValue());
        }
        ZoneId zoneId = this.b;
        return zoneId instanceof ZoneOffset ? zoneId : rVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (this.a.containsKey(qVar)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.f(qVar)) {
            return true;
        }
        j$.time.k kVar = this.g;
        if (kVar == null || !kVar.f(qVar)) {
            return (qVar == null || (qVar instanceof j$.time.temporal.a) || !qVar.s(this)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void l(j$.time.format.F r24) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.E.l(j$.time.format.F):void");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.t s(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        Objects.requireNonNull(qVar, "field");
        Long l = (Long) this.a.get(qVar);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.f(qVar)) {
            return this.f.v(qVar);
        }
        j$.time.k kVar = this.g;
        if (kVar != null && kVar.f(qVar)) {
            return this.g.v(qVar);
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }
}
