package p166;

import java.util.Arrays;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2395 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C2395 f9449 = new C2395(new C2422[0]);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C2422 f9450;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2422[] f9451;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9452;

    static {
        C2422 c2422 = new C2422(-1, -1, new int[0], new C2402[0], new long[0]);
        int[] iArr = c2422.f9636;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c2422.f9639;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f9450 = new C2422(0, c2422.f9635, iArrCopyOf, (C2402[]) Arrays.copyOf(c2422.f9640, 0), jArrCopyOf);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
        AbstractC4470.m10164(3);
        AbstractC4470.m10164(4);
    }

    public C2395(C2422[] c2422Arr) {
        this.f9452 = c2422Arr.length;
        this.f9451 = c2422Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2395.class != obj.getClass()) {
            return false;
        }
        C2395 c2395 = (C2395) obj;
        return AbstractC4470.m10194(null, null) && this.f9452 == c2395.f9452 && Arrays.equals(this.f9451, c2395.f9451);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9451) + (((((this.f9452 * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C2422[] c2422Arr = this.f9451;
            if (i >= c2422Arr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c2422Arr[i].getClass();
            for (int i2 = 0; i2 < c2422Arr[i].f9636.length; i2++) {
                sb.append("ad(state=");
                int i3 = c2422Arr[i].f9636[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c2422Arr[i].f9639[i2]);
                sb.append(')');
                if (i2 < c2422Arr[i].f9636.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c2422Arr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m6483(int i) {
        if (i != this.f9452 - 1) {
            return false;
        }
        m6484(i).getClass();
        return false;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2422 m6484(int i) {
        return i < 0 ? f9450 : this.f9451[i];
    }
}
