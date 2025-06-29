package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.AbstractC0002;
import androidx.datastore.preferences.protobuf.C0016;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p278.AbstractC3362;
import p447.AbstractC5179;

/* renamed from: com.google.android.gms.internal.play_billing.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0615 implements Iterable, Serializable {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0615 f2983 = new C0615(AbstractC0595.f2961);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f2984;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f2985 = 0;

    static {
        int i = AbstractC0620.f2992;
    }

    public C0615(byte[] bArr) {
        bArr.getClass();
        this.f2984 = bArr;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C0615 m2621(byte[] bArr, int i, int i2) {
        m2622(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C0615(bArr2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m2622(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC5179.m11548(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0002.m55(i2, i3, "End index: ", " >= "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0615) || mo2574() != ((C0615) obj).mo2574()) {
            return false;
        }
        if (mo2574() == 0) {
            return true;
        }
        if (!(obj instanceof C0615)) {
            return obj.equals(this);
        }
        C0615 c0615 = (C0615) obj;
        int i = this.f2985;
        int i2 = c0615.f2985;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iMo2574 = mo2574();
        if (iMo2574 > c0615.mo2574()) {
            throw new IllegalArgumentException("Length too large: " + iMo2574 + mo2574());
        }
        if (iMo2574 > c0615.mo2574()) {
            throw new IllegalArgumentException(AbstractC0002.m55(iMo2574, c0615.mo2574(), "Ran off end of other: 0, ", ", "));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < iMo2574) {
            if (this.f2984[i3] != c0615.f2984[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f2985;
        if (i != 0) {
            return i;
        }
        int iMo2574 = mo2574();
        int i2 = iMo2574;
        for (int i3 = 0; i3 < iMo2574; i3++) {
            i2 = (i2 * 31) + this.f2984[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f2985 = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0016(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo2574 = mo2574();
        if (mo2574() <= 50) {
            strConcat = AbstractC3362.m8211(this);
        } else {
            int iM2622 = m2622(0, 47, mo2574());
            strConcat = AbstractC3362.m8211(iM2622 == 0 ? f2983 : new C0599(iM2622, this.f2984)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo2574);
        sb.append(" contents=\"");
        return ˆʽ.ᵎˏ.ˎٴ(sb, strConcat, "\">");
    }

    /* renamed from: ٴˎ */
    public byte mo2573(int i) {
        return this.f2984[i];
    }

    /* renamed from: ᐧʻ */
    public int mo2574() {
        return this.f2984.length;
    }

    /* renamed from: ﹳﹳ */
    public byte mo2575(int i) {
        return this.f2984[i];
    }
}
