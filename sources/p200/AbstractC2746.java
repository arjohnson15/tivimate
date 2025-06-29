package p200;

import java.util.ConcurrentModificationException;
import p070.AbstractC1549;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2746 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object f10741 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f10740 = new Object();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int m6986(C2752 c2752, Object obj, int i) {
        int i2 = c2752.f10764;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM9072 = AbstractC3876.m9072(i2, i, c2752.f10765);
            if (iM9072 < 0 || AbstractC1549.m5138(obj, c2752.f10763[iM9072])) {
                return iM9072;
            }
            int i3 = iM9072 + 1;
            while (i3 < i2 && c2752.f10765[i3] == i) {
                if (AbstractC1549.m5138(obj, c2752.f10763[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM9072 - 1; i4 >= 0 && c2752.f10765[i4] == i; i4--) {
                if (AbstractC1549.m5138(obj, c2752.f10763[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
