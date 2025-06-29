package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import p334.C3789;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements r, m {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.m
    public Temporal C(Temporal temporal) {
        a aVar = a.DAY_OF_MONTH;
        return temporal.d(temporal.s(aVar).d(), aVar);
    }

    @Override // j$.time.temporal.r
    public Object g(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 1:
                return (ZoneId) temporalAccessor.A(l.a);
            case 2:
                return (j$.time.chrono.k) temporalAccessor.A(l.b);
            case 3:
                return (TemporalUnit) temporalAccessor.A(l.c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.f(aVar)) {
                    return ZoneOffset.d0(temporalAccessor.p(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.A(l.a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.A(l.d);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.f(aVar2)) {
                    return LocalDate.g0(temporalAccessor.v(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.f(aVar3)) {
                    return j$.time.k.c0(temporalAccessor.v(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return "LocalDate";
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
