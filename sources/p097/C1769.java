package p097;

import p070.AbstractC1549;
import p317.AbstractC3616;
import ˎˊ.ˏʾ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˆˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1769 implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final long f6843;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final long f6844;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ int f6845 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f6846;

    static {
        int i = AbstractC1767.f6834;
        f6843 = ˏʾ.ˋⁱ(4611686018427387903L);
        f6844 = ˏʾ.ˋⁱ(-4611686018427387903L);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final void m5481(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strM8515 = AbstractC3616.m8515(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM8515.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM8515.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) strM8515, 0, i6);
            } else {
                sb.append((CharSequence) strM8515, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final boolean m5482(long j) {
        return j == f6843 || j == f6844;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final long m5483(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return ˏʾ.ˋⁱ(ᵢʿ.ﹳﹳ(j5, -4611686018427387903L, 4611686018427387903L));
        }
        long j6 = ((j5 * j3) + (j2 - (j4 * j3))) << 1;
        int i = AbstractC1767.f6834;
        return j6;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final long m5484(long j, EnumC1768 enumC1768) {
        if (j == f6843) {
            return Long.MAX_VALUE;
        }
        if (j == f6844) {
            return Long.MIN_VALUE;
        }
        return enumC1768.f6842.convert(j >> 1, ((((int) j) & 1) == 0 ? EnumC1768.NANOSECONDS : EnumC1768.MILLISECONDS).f6842);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C1769) obj).f6846;
        long j2 = this.f6846;
        long j3 = j2 ^ j;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return AbstractC1549.m5139(j2, j);
        }
        int i = (((int) j2) & 1) - (((int) j) & 1);
        return j2 < 0 ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1769) {
            return this.f6846 == ((C1769) obj).f6846;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6846;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        boolean z;
        int iM5484;
        int i;
        int i2;
        long j = this.f6846;
        if (j == 0) {
            return "0s";
        }
        if (j == f6843) {
            return "Infinity";
        }
        if (j == f6844) {
            return "-Infinity";
        }
        boolean z2 = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        if (j < 0) {
            j = (((int) j) & 1) + ((-(j >> 1)) << 1);
            int i3 = AbstractC1767.f6834;
        }
        long jM5484 = m5484(j, EnumC1768.DAYS);
        if (m5482(j)) {
            z = z2;
            iM5484 = 0;
        } else {
            z = z2;
            iM5484 = (int) (m5484(j, EnumC1768.HOURS) % 24);
        }
        int iM54842 = m5482(j) ? 0 : (int) (m5484(j, EnumC1768.MINUTES) % 60);
        int iM54843 = m5482(j) ? 0 : (int) (m5484(j, EnumC1768.SECONDS) % 60);
        if (m5482(j)) {
            i = 0;
        } else {
            i = (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
        }
        boolean z3 = jM5484 != 0;
        boolean z4 = iM5484 != 0;
        boolean z5 = iM54842 != 0;
        boolean z6 = (iM54843 == 0 && i == 0) ? false : true;
        if (z3) {
            sb.append(jM5484);
            sb.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iM5484);
            sb.append('h');
            i2 = i4;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iM54842);
            sb.append('m');
            i2 = i5;
        }
        if (z6) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iM54843 != 0 || z3 || z4 || z5) {
                m5481(sb, iM54843, i, 9, "s");
            } else if (i >= 1000000) {
                m5481(sb, i / 1000000, i % 1000000, 6, "ms");
            } else if (i >= 1000) {
                m5481(sb, i / 1000, i % 1000, 3, "us");
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i2 = i6;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
