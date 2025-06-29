package j$.time;

import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements j$.time.temporal.r {
    public final /* synthetic */ int a;

    @Override // j$.time.temporal.r
    public final Object g(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 0:
                return LocalDate.U(temporalAccessor);
            case 1:
                return LocalDateTime.T(temporalAccessor);
            default:
                return OffsetDateTime.S(temporalAccessor);
        }
    }
}
