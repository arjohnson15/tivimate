package p080;

import java.util.ArrayList;
import p331.C3762;

/* renamed from: ʿˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1698 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1701 f6621;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C1703 f6620 = null;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f6617 = 0.0f;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayList f6619 = new ArrayList();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f6618 = false;

    public C1698(C3762 c3762) {
        this.f6621 = new C1701(this, c3762);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            ʿˏ.ᐧʻ r0 = r10.f6620
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            ʿˏ.ᐧʻ r1 = r10.f6620
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = ᵎﹳ.ᐧʻ.ˉⁱ(r0, r1)
            float r1 = r10.f6617
            r2 = 1
            r3 = 0
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = p080.AbstractC1702.m5407(r0)
            float r1 = r10.f6617
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            ʿˏ.ـﹶ r5 = r10.f6621
            int r5 = r5.m5406()
        L3c:
            if (r3 >= r5) goto L9d
            ʿˏ.ـﹶ r6 = r10.f6621
            ʿˏ.ᐧʻ r6 = r6.m5400(r3)
            if (r6 != 0) goto L47
            goto L9a
        L47:
            ʿˏ.ـﹶ r7 = r10.f6621
            float r7 = r7.m5404(r3)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L9a
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L67
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L77
            java.lang.String r1 = "- "
            java.lang.String r0 = ᵎﹳ.ᐧʻ.ˉⁱ(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L77
        L67:
            if (r8 <= 0) goto L70
            java.lang.String r1 = " + "
            java.lang.String r0 = ᵎﹳ.ᐧʻ.ˉⁱ(r0, r1)
            goto L77
        L70:
            java.lang.String r1 = " - "
            java.lang.String r0 = ᵎﹳ.ᐧʻ.ˉⁱ(r0, r1)
            goto L64
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L82
            java.lang.String r0 = ᵎﹳ.ᐧʻ.ˉⁱ(r0, r6)
            goto L99
        L82:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L99:
            r1 = 1
        L9a:
            int r3 = r3 + 1
            goto L3c
        L9d:
            if (r1 != 0) goto La5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = ᵎﹳ.ᐧʻ.ˉⁱ(r0, r1)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p080.C1698.toString():java.lang.String");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5368(C1703 c1703, C1703 c17032, C1703 c17033, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f6617 = i;
        }
        if (z) {
            this.f6621.m5405(c1703, 1.0f);
            this.f6621.m5405(c17032, -1.0f);
            this.f6621.m5405(c17033, -1.0f);
        } else {
            this.f6621.m5405(c1703, -1.0f);
            this.f6621.m5405(c17032, 1.0f);
            this.f6621.m5405(c17033, 1.0f);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean mo5369() {
        return this.f6620 == null && this.f6617 == 0.0f && this.f6621.m5406() == 0;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m5370(C1700 c1700, C1703 c1703, boolean z) {
        if (c1703 == null || !c1703.f6663) {
            return;
        }
        float fM5402 = this.f6621.m5402(c1703);
        this.f6617 = (c1703.f6656 * fM5402) + this.f6617;
        this.f6621.m5401(c1703, z);
        if (z) {
            c1703.m5412(this);
        }
        if (this.f6621.m5406() == 0) {
            this.f6618 = true;
            c1700.f6627 = true;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5371(C1703 c1703, C1703 c17032, C1703 c17033, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f6617 = i;
        }
        if (z) {
            this.f6621.m5405(c1703, 1.0f);
            this.f6621.m5405(c17032, -1.0f);
            this.f6621.m5405(c17033, 1.0f);
        } else {
            this.f6621.m5405(c1703, -1.0f);
            this.f6621.m5405(c17032, 1.0f);
            this.f6621.m5405(c17033, -1.0f);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5372(C1700 c1700, int i) {
        this.f6621.m5405(c1700.m5382(i), 1.0f);
        this.f6621.m5405(c1700.m5382(i), -1.0f);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1703 m5373(boolean[] zArr, C1703 c1703) {
        int i;
        int iM5406 = this.f6621.m5406();
        C1703 c17032 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM5406; i2++) {
            float fM5404 = this.f6621.m5404(i2);
            if (fM5404 < 0.0f) {
                C1703 c1703M5400 = this.f6621.m5400(i2);
                if ((zArr == null || !zArr[c1703M5400.f6655]) && c1703M5400 != c1703 && (((i = c1703M5400.f6654) == 3 || i == 4) && fM5404 < f)) {
                    f = fM5404;
                    c17032 = c1703M5400;
                }
            }
        }
        return c17032;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m5374(C1703 c1703) {
        C1703 c17032 = this.f6620;
        if (c17032 != null) {
            this.f6621.m5405(c17032, -1.0f);
            this.f6620.f6658 = -1;
            this.f6620 = null;
        }
        float fM5401 = this.f6621.m5401(c1703, true) * (-1.0f);
        this.f6620 = c1703;
        if (fM5401 == 1.0f) {
            return;
        }
        this.f6617 /= fM5401;
        C1701 c1701 = this.f6621;
        int i = c1701.f6646;
        for (int i2 = 0; i != -1 && i2 < c1701.f6648; i2++) {
            float[] fArr = c1701.f6650;
            fArr[i] = fArr[i] / fM5401;
            i = c1701.f6649[i];
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C1703 mo5375(boolean[] zArr) {
        return m5373(zArr, null);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void mo5376(C1700 c1700, C1698 c1698, boolean z) {
        C1701 c1701 = this.f6621;
        c1701.getClass();
        float fM5402 = c1701.m5402(c1698.f6620);
        c1701.m5401(c1698.f6620, z);
        C1701 c17012 = c1698.f6621;
        int iM5406 = c17012.m5406();
        for (int i = 0; i < iM5406; i++) {
            C1703 c1703M5400 = c17012.m5400(i);
            c1701.m5403(c1703M5400, c17012.m5402(c1703M5400) * fM5402, z);
        }
        this.f6617 = (c1698.f6617 * fM5402) + this.f6617;
        if (z) {
            c1698.f6620.m5412(this);
        }
        if (this.f6620 == null || this.f6621.m5406() != 0) {
            return;
        }
        this.f6618 = true;
        c1700.f6627 = true;
    }
}
