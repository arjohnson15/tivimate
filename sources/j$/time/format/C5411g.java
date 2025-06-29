package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: j$.time.format.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5411g extends j {
    private final boolean g;

    C5411g(j$.time.temporal.a aVar, int i, int i2, boolean z) {
        this(aVar, i, i2, z, 0);
        Objects.requireNonNull(aVar, "field");
        if (!aVar.n().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    C5411g(j$.time.temporal.q qVar, int i, int i2, boolean z, int i3) {
        super(qVar, i, i2, G.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.j
    final boolean c(w wVar) {
        return wVar.l() && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.e == -1) {
            return this;
        }
        return new C5411g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    final j f(int i) {
        return new C5411g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.a;
        Long lE = zVar.e(qVar);
        if (lE == null) {
            return false;
        }
        D dB = zVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.t tVarN = qVar.n();
        tVarN.b(jLongValue, qVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarN.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(tVarN.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            dB.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            dB.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            dB.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        int i2 = (wVar.l() || c(wVar)) ? this.b : 0;
        int i3 = (wVar.l() || c(wVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i == length) {
            return i2 > 0 ? ~i : i;
        }
        if (this.g) {
            char cCharAt = charSequence.charAt(i);
            wVar.g().getClass();
            if (cCharAt != '.') {
                return i2 > 0 ? ~i : i;
            }
            i++;
        }
        int i4 = i;
        int i5 = i2 + i4;
        if (i5 > length) {
            return ~i4;
        }
        int iMin = Math.min(i3 + i4, length);
        int i6 = i4;
        int i7 = 0;
        while (true) {
            if (i6 >= iMin) {
                break;
            }
            int i8 = i6 + 1;
            int iA = wVar.g().a(charSequence.charAt(i6));
            if (iA >= 0) {
                i7 = (i7 * 10) + iA;
                i6 = i8;
            } else if (i8 < i5) {
                return ~i4;
            }
        }
        BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i6 - i4);
        j$.time.temporal.t tVarN = this.a.n();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarN.e());
        return wVar.o(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(tVarN.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i6);
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
