package p033;

import p166.AbstractC2394;
import p166.C2434;
import p374.C4290;

/* renamed from: ʼᵎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1216 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f4991;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f4992;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f4993;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f4994;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f4995;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ C1223 f4996;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4290 f4997;

    public C1216(C1223 c1223, String str, int i, C4290 c4290) {
        this.f4996 = c1223;
        this.f4994 = str;
        this.f4991 = i;
        this.f4993 = c4290 == null ? -1L : c4290.f16694;
        if (c4290 == null || !c4290.m9753()) {
            return;
        }
        this.f4997 = c4290;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m4331(AbstractC2394 abstractC2394, AbstractC2394 abstractC23942) {
        int i = this.f4991;
        if (i < abstractC2394.mo6474()) {
            C1223 c1223 = this.f4996;
            abstractC2394.m6480(i, c1223.f5029);
            C2434 c2434 = c1223.f5029;
            for (int i2 = c2434.f9716; i2 <= c2434.f9709; i2++) {
                int iMo6469 = abstractC23942.mo6469(abstractC2394.mo6472(i2));
                if (iMo6469 != -1) {
                    i = abstractC23942.mo6180(iMo6469, c1223.f5026, false).f9576;
                    break;
                }
            }
            i = -1;
        } else if (i >= abstractC23942.mo6474()) {
            i = -1;
        }
        this.f4991 = i;
        if (i == -1) {
            return false;
        }
        C4290 c4290 = this.f4997;
        return c4290 == null || abstractC23942.mo6469(c4290.f16693) != -1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m4332(C1218 c1218) {
        C4290 c4290 = c1218.f5008;
        if (c4290 == null) {
            return this.f4991 != c1218.f5004;
        }
        long j = this.f4993;
        if (j == -1) {
            return false;
        }
        if (c4290.f16694 > j) {
            return true;
        }
        C4290 c42902 = this.f4997;
        if (c42902 == null) {
            return false;
        }
        AbstractC2394 abstractC2394 = c1218.f5000;
        int iMo6469 = abstractC2394.mo6469(c4290.f16693);
        int iMo64692 = abstractC2394.mo6469(c42902.f16693);
        if (c4290.f16694 < c42902.f16694 || iMo6469 < iMo64692) {
            return false;
        }
        if (iMo6469 > iMo64692) {
            return true;
        }
        boolean zM9753 = c4290.m9753();
        int i = c42902.f16690;
        if (!zM9753) {
            int i2 = c4290.f16691;
            return i2 == -1 || i2 > i;
        }
        int i3 = c4290.f16690;
        if (i3 > i) {
            return true;
        }
        if (i3 == i) {
            if (c4290.f16692 > c42902.f16692) {
                return true;
            }
        }
        return false;
    }
}
