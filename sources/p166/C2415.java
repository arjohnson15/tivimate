package p166;

import java.util.Arrays;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ˊﹶ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2415 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C2415 f9587 = new C2415(1, 2, 3, -1, -1, null);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9588;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f9589;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f9590;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9591;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f9592;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f9593;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] f9594;

    static {
        ᵎˏ.ﹳˎ(0, 1, 2, 3, 4);
        AbstractC4470.m10164(5);
    }

    public C2415(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f9591 = i;
        this.f9588 = i2;
        this.f9590 = i3;
        this.f9594 = bArr;
        this.f9589 = i4;
        this.f9592 = i5;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m6509(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? ˉᵎ.ˉⁱ("Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m6510(C2415 c2415) {
        int i;
        int i2;
        int i3;
        int i4;
        if (c2415 == null) {
            return true;
        }
        int i5 = c2415.f9591;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = c2415.f9588) == -1 || i == 2) && (((i2 = c2415.f9590) == -1 || i2 == 3) && c2415.f9594 == null && (((i3 = c2415.f9592) == -1 || i3 == 8) && ((i4 = c2415.f9589) == -1 || i4 == 8)));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m6511(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? ˉᵎ.ˉⁱ("Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m6512(int i) {
        return i != -1 ? i != 1 ? i != 2 ? ˉᵎ.ˉⁱ("Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m6513(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m6514(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2415.class != obj.getClass()) {
            return false;
        }
        C2415 c2415 = (C2415) obj;
        return this.f9591 == c2415.f9591 && this.f9588 == c2415.f9588 && this.f9590 == c2415.f9590 && Arrays.equals(this.f9594, c2415.f9594) && this.f9589 == c2415.f9589 && this.f9592 == c2415.f9592;
    }

    public final int hashCode() {
        if (this.f9593 == 0) {
            this.f9593 = ((((Arrays.hashCode(this.f9594) + ((((((527 + this.f9591) * 31) + this.f9588) * 31) + this.f9590) * 31)) * 31) + this.f9589) * 31) + this.f9592;
        }
        return this.f9593;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m6509(this.f9591));
        sb.append(", ");
        sb.append(m6512(this.f9588));
        sb.append(", ");
        sb.append(m6511(this.f9590));
        sb.append(", ");
        sb.append(this.f9594 != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f9589;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f9592;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return ᵎˏ.ˎٴ(sb, str2, ")");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m6515() {
        return (this.f9591 == -1 || this.f9588 == -1 || this.f9590 == -1) ? false : true;
    }
}
