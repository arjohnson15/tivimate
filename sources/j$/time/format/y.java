package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
final class y implements TemporalAccessor {
    final /* synthetic */ ChronoLocalDate a;
    final /* synthetic */ TemporalAccessor b;
    final /* synthetic */ j$.time.chrono.k c;
    final /* synthetic */ ZoneId d;

    y(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.k kVar, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = kVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object A(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.e() ? this.c : rVar == j$.time.temporal.l.l() ? this.d : rVar == j$.time.temporal.l.j() ? this.b.A(rVar) : rVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !qVar.C()) ? this.b.f(qVar) : chronoLocalDate.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t s(j$.time.temporal.q qVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !qVar.C()) ? this.b.s(qVar) : chronoLocalDate.s(qVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.k kVar = this.c;
        if (kVar != null) {
            str = " with chronology " + kVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.q qVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !qVar.C()) ? this.b.v(qVar) : chronoLocalDate.v(qVar);
    }
}
