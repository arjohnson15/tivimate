package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC5402g;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* renamed from: j$.time.format.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5412h implements InterfaceC5410f {
    @Override // j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        Long lE = zVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorD = zVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorD.f(aVar) ? Long.valueOf(zVar.d().v(aVar)) : null;
        int i = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iS = aVar.S(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jO = j$.com.android.tools.r8.a.o(j, 315569520000L) + 1;
            LocalDateTime localDateTimeB0 = LocalDateTime.b0(j$.com.android.tools.r8.a.n(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jO > 0) {
                sb.append('+');
                sb.append(jO);
            }
            sb.append(localDateTimeB0);
            if (localDateTimeB0.V() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeB02 = LocalDateTime.b0(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeB02);
            if (localDateTimeB02.V() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeB02.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iS > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iS <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iS / i2;
                sb.append((char) (i3 + 48));
                iS -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        v vVar = new v();
        vVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        vVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        vVar.o(aVar, 2);
        vVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        vVar.o(aVar2, 2);
        vVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        vVar.o(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i4 = 0;
        vVar.b(aVar4, 0, 9, true);
        vVar.e('Z');
        C5409e c5409eF = vVar.y(Locale.getDefault()).f();
        w wVarD = wVar.d();
        int iP = c5409eF.p(wVarD, charSequence, i);
        if (iP < 0) {
            return iP;
        }
        long jLongValue = wVarD.j(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = wVarD.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = wVarD.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = wVarD.j(aVar).intValue();
        int iIntValue4 = wVarD.j(aVar2).intValue();
        Long lJ = wVarD.j(aVar3);
        Long lJ2 = wVarD.j(aVar4);
        int iIntValue5 = lJ != null ? lJ.intValue() : 0;
        int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i3 = iIntValue5;
            i4 = 1;
            i2 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            wVar.p();
            i2 = iIntValue3;
            i3 = 59;
        } else {
            i2 = iIntValue3;
            i3 = iIntValue5;
        }
        try {
            LocalDateTime localDateTimePlusDays = LocalDateTime.Z(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3).plusDays(i4);
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            localDateTimePlusDays.getClass();
            return wVar.o(aVar4, iIntValue6, i, wVar.o(j$.time.temporal.a.INSTANT_SECONDS, j$.com.android.tools.r8.a.p(jLongValue / 10000, 315569520000L) + AbstractC5402g.n(localDateTimePlusDays, zoneOffset), i, iP));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
