package j$.time.temporal;

import j$.time.chrono.AbstractC5402g;
import j$.time.format.F;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
final class j implements q {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;
    private static final /* synthetic */ j[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient t b;
    private final transient long c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        d = new j[]{jVar, jVar2, jVar3};
    }

    private j(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = t.j((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }

    @Override // j$.time.temporal.q
    public final t A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.f(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final boolean C() {
        return true;
    }

    @Override // j$.time.temporal.q
    public final t n() {
        return this.b;
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor p(HashMap map, TemporalAccessor temporalAccessor, F f) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.k kVarP = AbstractC5402g.p(temporalAccessor);
        F f2 = F.LENIENT;
        long j = this.c;
        if (f == f2) {
            return kVarP.l(j$.com.android.tools.r8.a.q(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return kVarP.l(jLongValue - j);
    }

    @Override // j$.time.temporal.q
    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.v(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.q
    public final boolean s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.q
    public final Temporal v(Temporal temporal, long j) {
        if (this.b.i(j)) {
            return temporal.d(j$.com.android.tools.r8.a.q(j, this.c), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.a + " " + j);
    }
}
