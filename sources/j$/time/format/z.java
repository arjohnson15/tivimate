package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes2.dex */
final class z {
    private TemporalAccessor a;
    private DateTimeFormatter b;
    private int c;

    z(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.k kVarA = dateTimeFormatter.a();
        if (kVarA != null) {
            j$.time.chrono.k kVar = (j$.time.chrono.k) temporalAccessor.A(j$.time.temporal.l.e());
            ZoneId zoneId = (ZoneId) temporalAccessor.A(j$.time.temporal.l.l());
            ChronoLocalDate chronoLocalDateQ = null;
            kVarA = Objects.equals(kVarA, kVar) ? null : kVarA;
            Objects.equals(null, zoneId);
            if (kVarA != null) {
                j$.time.chrono.k kVar2 = kVarA != null ? kVarA : kVar;
                if (kVarA != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDateQ = kVar2.q(temporalAccessor);
                    } else if (kVarA != j$.time.chrono.r.d || kVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.C() && temporalAccessor.f(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + kVarA + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new y(chronoLocalDateQ, temporalAccessor, kVar2, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    final void a() {
        this.c--;
    }

    final D b() {
        return this.b.b();
    }

    final Locale c() {
        return this.b.c();
    }

    final TemporalAccessor d() {
        return this.a;
    }

    final Long e(j$.time.temporal.q qVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.f(qVar)) {
            return Long.valueOf(temporalAccessor.v(qVar));
        }
        return null;
    }

    final Object f(j$.time.temporal.r rVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objA = temporalAccessor.A(rVar);
        if (objA != null || this.c != 0) {
            return objA;
        }
        throw new j$.time.c("Unable to extract " + rVar + " from temporal " + temporalAccessor);
    }

    final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
