package p166;

import java.util.Arrays;
import p383.AbstractC4464;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ˊﹶ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2433 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f9696;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9697;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f9698;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9699;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2431[] f9700;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
    }

    public C2433(String str, C2431... c2431Arr) {
        AbstractC4464.m10142(c2431Arr.length > 0);
        this.f9696 = str;
        this.f9700 = c2431Arr;
        this.f9699 = c2431Arr.length;
        int iM6554 = AbstractC2435.m6554(c2431Arr[0].f9667);
        this.f9698 = iM6554 == -1 ? AbstractC2435.m6554(c2431Arr[0].f9664) : iM6554;
        String str2 = c2431Arr[0].f9689;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c2431Arr[0].f9678 | 16384;
        for (int i2 = 1; i2 < c2431Arr.length; i2++) {
            String str3 = c2431Arr[i2].f9689;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m6543(i2, "languages", c2431Arr[0].f9689, c2431Arr[i2].f9689);
                return;
            } else {
                if (i != (c2431Arr[i2].f9678 | 16384)) {
                    m6543(i2, "role flags", Integer.toBinaryString(c2431Arr[0].f9678), Integer.toBinaryString(c2431Arr[i2].f9678));
                    return;
                }
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m6543(int i, String str, String str2, String str3) {
        AbstractC4464.m10147("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2433.class != obj.getClass()) {
            return false;
        }
        C2433 c2433 = (C2433) obj;
        return this.f9696.equals(c2433.f9696) && Arrays.equals(this.f9700, c2433.f9700);
    }

    public final int hashCode() {
        if (this.f9697 == 0) {
            this.f9697 = Arrays.hashCode(this.f9700) + ᵎˏ.ˏʾ(527, 31, this.f9696);
        }
        return this.f9697;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6544(C2431 c2431) {
        int i = 0;
        while (true) {
            C2431[] c2431Arr = this.f9700;
            if (i >= c2431Arr.length) {
                return -1;
            }
            if (c2431 == c2431Arr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2431 m6545() {
        return this.f9700[0];
    }
}
