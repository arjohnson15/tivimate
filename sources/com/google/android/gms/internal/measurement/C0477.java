package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0477 implements InterfaceC0489 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Double f2812;

    public C0477(Double d) {
        if (d == null) {
            this.f2812 = Double.valueOf(Double.NaN);
        } else {
            this.f2812 = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0477) {
            return this.f2812.equals(((C0477) obj).f2812);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2812.hashCode();
    }

    public final String toString() {
        return mo1876();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ */
    public final Double mo1860() {
        return this.f2812;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public final InterfaceC0489 mo1862() {
        return new C0477(this.f2812);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ */
    public final InterfaceC0489 mo1866(String str, ﹶˋ.ـﹶ r3, ArrayList arrayList) throws NumberFormatException {
        if ("toString".equals(str)) {
            return new C0429(mo1876());
        }
        throw new IllegalArgumentException(mo1876() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ */
    public final Iterator mo1867() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ */
    public final Boolean mo1875() {
        Double d = this.f2812;
        return Boolean.valueOf((Double.isNaN(d.doubleValue()) || d.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ */
    public final String mo1876() throws NumberFormatException {
        Double d = this.f2812;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = (bigDecimalValueOf.signum() == 0 || bigDecimalValueOf.signum() == 0) ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }
}
