package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import androidx.datastore.preferences.protobuf.C0016;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p447.AbstractC5179;

/* renamed from: com.google.android.gms.internal.measurement.ʼᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0315 implements Serializable, Iterable {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0315 f2430 = new C0315(AbstractC0412.f2704);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0553 f2431 = new C0553(5);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f2432;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f2433 = 0;

    public C0315(byte[] bArr) {
        bArr.getClass();
        this.f2432 = bArr;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m1832(int i, int i2, int i3) {
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

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C0315 m1833(byte[] bArr, int i, int i2) {
        m1832(i, i + i2, bArr.length);
        f2431.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C0315(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0315) || mo1834() != ((C0315) obj).mo1834()) {
            return false;
        }
        if (mo1834() == 0) {
            return true;
        }
        if (!(obj instanceof C0315)) {
            return obj.equals(this);
        }
        C0315 c0315 = (C0315) obj;
        int i = this.f2433;
        int i2 = c0315.f2433;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iMo1834 = mo1834();
        if (iMo1834 > c0315.mo1834()) {
            throw new IllegalArgumentException("Length too large: " + iMo1834 + mo1834());
        }
        if (iMo1834 > c0315.mo1834()) {
            throw new IllegalArgumentException(AbstractC0002.m55(iMo1834, c0315.mo1834(), "Ran off end of other: 0, ", ", "));
        }
        int iMo1835 = mo1835() + iMo1834;
        int iMo18352 = mo1835();
        int iMo18353 = c0315.mo1835();
        while (iMo18352 < iMo1835) {
            if (this.f2432[iMo18352] != c0315.f2432[iMo18353]) {
                return false;
            }
            iMo18352++;
            iMo18353++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f2433;
        if (i == 0) {
            int iMo1834 = mo1834();
            int iMo1835 = mo1835();
            int i2 = iMo1834;
            for (int i3 = iMo1835; i3 < iMo1835 + iMo1834; i3++) {
                i2 = (i2 * 31) + this.f2432[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.f2433 = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0016(this);
    }

    public final String toString() {
        String strM2449;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo1834 = mo1834();
        if (mo1834() <= 50) {
            strM2449 = AbstractC0543.m2449(this);
        } else {
            int iM1832 = m1832(0, 47, mo1834());
            strM2449 = ᵎﹳ.ᐧʻ.ˉⁱ(AbstractC0543.m2449(iM1832 == 0 ? f2430 : new C0574(this.f2432, mo1835(), iM1832)), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo1834);
        sb.append(" contents=\"");
        return ˆʽ.ᵎˏ.ˎٴ(sb, strM2449, "\">");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public int mo1834() {
        return this.f2432.length;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int mo1835() {
        return 0;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public byte mo1836(int i) {
        return this.f2432[i];
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public byte mo1837(int i) {
        return this.f2432[i];
    }
}
