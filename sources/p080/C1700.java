package p080;

import java.util.Arrays;
import p331.C3762;
import p331.C3767;
import p447.C5175;

/* renamed from: ʿˏ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1700 {

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static boolean f6626;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C3762 f6631;

    /* renamed from: ˑי, reason: contains not printable characters */
    public C1698 f6636;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1699 f6641;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f6637 = 1000;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f6627 = false;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f6635 = 0;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f6628 = 32;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f6638 = 32;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f6634 = false;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean[] f6642 = new boolean[32];

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f6629 = 1;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f6632 = 0;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f6630 = 32;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C1703[] f6640 = new C1703[1000];

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f6633 = 0;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C1698[] f6639 = new C1698[32];

    public C1700() {
        m5394();
        C3762 c3762 = new C3762(3);
        c3762.f14530 = new C1704();
        c3762.f14531 = new C1704();
        c3762.f14532 = new C1703[32];
        this.f6631 = c3762;
        C1699 c1699 = new C1699(c3762);
        c1699.f6623 = new C1703[128];
        c1699.f6624 = new C1703[128];
        c1699.f6622 = 0;
        c1699.f6625 = new C3767(c1699);
        this.f6641 = c1699;
        this.f6636 = new C1698(c3762);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m5379(Object obj) {
        C1703 c1703 = ((C5175) obj).f19887;
        if (c1703 != null) {
            return (int) (c1703.f6656 + 0.5f);
        }
        return 0;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5380(C1703 c1703, C1703 c17032, int i, float f, C1703 c17033, C1703 c17034, int i2, int i3) {
        C1698 c1698M5383 = m5383();
        if (c17032 == c17033) {
            c1698M5383.f6621.m5405(c1703, 1.0f);
            c1698M5383.f6621.m5405(c17034, 1.0f);
            c1698M5383.f6621.m5405(c17032, -2.0f);
        } else if (f == 0.5f) {
            c1698M5383.f6621.m5405(c1703, 1.0f);
            c1698M5383.f6621.m5405(c17032, -1.0f);
            c1698M5383.f6621.m5405(c17033, -1.0f);
            c1698M5383.f6621.m5405(c17034, 1.0f);
            if (i > 0 || i2 > 0) {
                c1698M5383.f6617 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c1698M5383.f6621.m5405(c1703, -1.0f);
            c1698M5383.f6621.m5405(c17032, 1.0f);
            c1698M5383.f6617 = i;
        } else if (f >= 1.0f) {
            c1698M5383.f6621.m5405(c17034, -1.0f);
            c1698M5383.f6621.m5405(c17033, 1.0f);
            c1698M5383.f6617 = -i2;
        } else {
            float f2 = 1.0f - f;
            c1698M5383.f6621.m5405(c1703, f2 * 1.0f);
            c1698M5383.f6621.m5405(c17032, f2 * (-1.0f));
            c1698M5383.f6621.m5405(c17033, (-1.0f) * f);
            c1698M5383.f6621.m5405(c17034, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c1698M5383.f6617 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c1698M5383.m5372(this, i3);
        }
        m5389(c1698M5383);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m5381(C1703 c1703, C1703 c17032, int i, int i2) {
        if (i2 == 8 && c17032.f6663 && c1703.f6658 == -1) {
            c1703.m5416(this, c17032.f6656 + i);
            return;
        }
        C1698 c1698M5383 = m5383();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c1698M5383.f6617 = i;
        }
        if (z) {
            c1698M5383.f6621.m5405(c1703, 1.0f);
            c1698M5383.f6621.m5405(c17032, -1.0f);
        } else {
            c1698M5383.f6621.m5405(c1703, -1.0f);
            c1698M5383.f6621.m5405(c17032, 1.0f);
        }
        if (i2 != 8) {
            c1698M5383.m5372(this, i2);
        }
        m5389(c1698M5383);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C1703 m5382(int i) {
        if (this.f6629 + 1 >= this.f6638) {
            m5387();
        }
        C1703 c1703M5391 = m5391(4);
        int i2 = this.f6635 + 1;
        this.f6635 = i2;
        this.f6629++;
        c1703M5391.f6655 = i2;
        c1703M5391.f6660 = i;
        ((C1703[]) this.f6631.f14532)[i2] = c1703M5391;
        C1699 c1699 = this.f6641;
        c1699.f6625.f14557 = c1703M5391;
        float[] fArr = c1703M5391.f6657;
        Arrays.fill(fArr, 0.0f);
        fArr[c1703M5391.f6660] = 1.0f;
        c1699.m5377(c1703M5391);
        return c1703M5391;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C1698 m5383() {
        Object obj;
        C3762 c3762 = this.f6631;
        C1704 c1704 = (C1704) c3762.f14530;
        int i = c1704.f6666;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c1704.f6667;
            obj = objArr[i2];
            objArr[i2] = null;
            c1704.f6666 = i2;
        } else {
            obj = null;
        }
        C1698 c1698 = (C1698) obj;
        if (c1698 == null) {
            return new C1698(c3762);
        }
        c1698.f6620 = null;
        c1698.f6621.m5399();
        c1698.f6617 = 0.0f;
        c1698.f6618 = false;
        return c1698;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C1703 m5384() {
        if (this.f6629 + 1 >= this.f6638) {
            m5387();
        }
        C1703 c1703M5391 = m5391(3);
        int i = this.f6635 + 1;
        this.f6635 = i;
        this.f6629++;
        c1703M5391.f6655 = i;
        ((C1703[]) this.f6631.f14532)[i] = c1703M5391;
        return c1703M5391;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090 A[SYNTHETIC] */
    /* renamed from: ˎٴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5385(p080.C1698 r17) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p080.C1700.m5385(ʿˏ.ʽᐧ):void");
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C1703 m5386(Object obj) {
        C1703 c1703 = null;
        if (obj == null) {
            return null;
        }
        if (this.f6629 + 1 >= this.f6638) {
            m5387();
        }
        if (obj instanceof C5175) {
            C5175 c5175 = (C5175) obj;
            c1703 = c5175.f19887;
            if (c1703 == null) {
                c5175.m11526();
                c1703 = c5175.f19887;
            }
            int i = c1703.f6655;
            C3762 c3762 = this.f6631;
            if (i == -1 || i > this.f6635 || ((C1703[]) c3762.f14532)[i] == null) {
                if (i != -1) {
                    c1703.m5414();
                }
                int i2 = this.f6635 + 1;
                this.f6635 = i2;
                this.f6629++;
                c1703.f6655 = i2;
                c1703.f6654 = 1;
                ((C1703[]) c3762.f14532)[i2] = c1703;
            }
        }
        return c1703;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m5387() {
        int i = this.f6628 * 2;
        this.f6628 = i;
        this.f6639 = (C1698[]) Arrays.copyOf(this.f6639, i);
        C3762 c3762 = this.f6631;
        c3762.f14532 = (C1703[]) Arrays.copyOf((C1703[]) c3762.f14532, this.f6628);
        int i2 = this.f6628;
        this.f6642 = new boolean[i2];
        this.f6638 = i2;
        this.f6630 = i2;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m5388(C1698 c1698) {
        int i;
        if (c1698.f6618) {
            c1698.f6620.m5416(this, c1698.f6617);
        } else {
            C1698[] c1698Arr = this.f6639;
            int i2 = this.f6632;
            c1698Arr[i2] = c1698;
            C1703 c1703 = c1698.f6620;
            c1703.f6658 = i2;
            this.f6632 = i2 + 1;
            c1703.m5413(this, c1698);
        }
        if (this.f6627) {
            int i3 = 0;
            while (i3 < this.f6632) {
                if (this.f6639[i3] == null) {
                    System.out.println("WTF");
                }
                C1698 c16982 = this.f6639[i3];
                if (c16982 != null && c16982.f6618) {
                    c16982.f6620.m5416(this, c16982.f6617);
                    ((C1704) this.f6631.f14530).m5417(c16982);
                    this.f6639[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f6632;
                        if (i4 >= i) {
                            break;
                        }
                        C1698[] c1698Arr2 = this.f6639;
                        int i6 = i4 - 1;
                        C1698 c16983 = c1698Arr2[i4];
                        c1698Arr2[i6] = c16983;
                        C1703 c17032 = c16983.f6620;
                        if (c17032.f6658 == i4) {
                            c17032.f6658 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f6639[i5] = null;
                    }
                    this.f6632 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f6627 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5389(p080.C1698 r17) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p080.C1700.m5389(ʿˏ.ʽᐧ):void");
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m5390() {
        C1699 c1699 = this.f6641;
        if (c1699.mo5369()) {
            m5398();
            return;
        }
        if (!this.f6634) {
            m5395(c1699);
            return;
        }
        for (int i = 0; i < this.f6632; i++) {
            if (!this.f6639[i].f6618) {
                m5395(c1699);
                return;
            }
        }
        m5398();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1703 m5391(int i) {
        C1704 c1704 = (C1704) this.f6631.f14531;
        int i2 = c1704.f6666;
        C1703 c1703 = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c1704.f6667;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c1704.f6666 = i3;
            c1703 = r4;
        }
        C1703 c17032 = c1703;
        if (c17032 == null) {
            c17032 = new C1703(i);
            c17032.f6654 = i;
        } else {
            c17032.m5414();
            c17032.f6654 = i;
        }
        int i4 = this.f6633;
        int i5 = this.f6637;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f6637 = i6;
            this.f6640 = (C1703[]) Arrays.copyOf(this.f6640, i6);
        }
        C1703[] c1703Arr = this.f6640;
        int i7 = this.f6633;
        this.f6633 = i7 + 1;
        c1703Arr[i7] = c17032;
        return c17032;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m5392(C1703 c1703, C1703 c17032, int i, int i2) {
        C1698 c1698M5383 = m5383();
        C1703 c1703M5384 = m5384();
        c1703M5384.f6660 = 0;
        c1698M5383.m5368(c1703, c17032, c1703M5384, i);
        if (i2 != 8) {
            c1698M5383.f6621.m5405(m5382(i2), (int) (c1698M5383.f6621.m5402(c1703M5384) * (-1.0f)));
        }
        m5389(c1698M5383);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m5393(C1703 c1703, C1703 c17032, int i, int i2) {
        C1698 c1698M5383 = m5383();
        C1703 c1703M5384 = m5384();
        c1703M5384.f6660 = 0;
        c1698M5383.m5371(c1703, c17032, c1703M5384, i);
        if (i2 != 8) {
            c1698M5383.f6621.m5405(m5382(i2), (int) (c1698M5383.f6621.m5402(c1703M5384) * (-1.0f)));
        }
        m5389(c1698M5383);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m5394() {
        for (int i = 0; i < this.f6632; i++) {
            C1698 c1698 = this.f6639[i];
            if (c1698 != null) {
                ((C1704) this.f6631.f14530).m5417(c1698);
            }
            this.f6639[i] = null;
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m5395(C1699 c1699) {
        int i = 0;
        while (true) {
            if (i >= this.f6632) {
                break;
            }
            C1698 c1698 = this.f6639[i];
            int i2 = 1;
            if (c1698.f6620.f6654 != 1) {
                float f = 0.0f;
                if (c1698.f6617 < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (i4 < this.f6632) {
                            C1698 c16982 = this.f6639[i4];
                            if (c16982.f6620.f6654 != i2 && !c16982.f6618 && c16982.f6617 < f) {
                                int iM5406 = c16982.f6621.m5406();
                                int i8 = 0;
                                while (i8 < iM5406) {
                                    C1703 c1703M5400 = c16982.f6621.m5400(i8);
                                    float fM5402 = c16982.f6621.m5402(c1703M5400);
                                    if (fM5402 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c1703M5400.f6664[i9] / fM5402;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i6 = c1703M5400.f6655;
                                                i5 = i4;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i4++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i5 != -1) {
                            C1698 c16983 = this.f6639[i5];
                            c16983.f6620.f6658 = -1;
                            c16983.m5374(((C1703[]) this.f6631.f14532)[i6]);
                            C1703 c1703 = c16983.f6620;
                            c1703.f6658 = i5;
                            c1703.m5413(this, c16983);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f6629 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m5385(c1699);
        m5398();
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m5396() {
        C3762 c3762;
        int i = 0;
        while (true) {
            c3762 = this.f6631;
            C1703[] c1703Arr = (C1703[]) c3762.f14532;
            if (i >= c1703Arr.length) {
                break;
            }
            C1703 c1703 = c1703Arr[i];
            if (c1703 != null) {
                c1703.m5414();
            }
            i++;
        }
        C1704 c1704 = (C1704) c3762.f14531;
        C1703[] c1703Arr2 = this.f6640;
        int length = this.f6633;
        c1704.getClass();
        if (length > c1703Arr2.length) {
            length = c1703Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C1703 c17032 = c1703Arr2[i2];
            int i3 = c1704.f6666;
            Object[] objArr = c1704.f6667;
            if (i3 < objArr.length) {
                objArr[i3] = c17032;
                c1704.f6666 = i3 + 1;
            }
        }
        this.f6633 = 0;
        Arrays.fill((C1703[]) c3762.f14532, (Object) null);
        this.f6635 = 0;
        C1699 c1699 = this.f6641;
        c1699.f6622 = 0;
        c1699.f6617 = 0.0f;
        this.f6629 = 1;
        for (int i4 = 0; i4 < this.f6632; i4++) {
            C1698 c1698 = this.f6639[i4];
        }
        m5394();
        this.f6632 = 0;
        this.f6636 = new C1698(c3762);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5397(C1703 c1703, int i) {
        int i2 = c1703.f6658;
        if (i2 == -1) {
            c1703.m5416(this, i);
            for (int i3 = 0; i3 < this.f6635 + 1; i3++) {
                C1703 c17032 = ((C1703[]) this.f6631.f14532)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C1698 c1698M5383 = m5383();
            c1698M5383.f6620 = c1703;
            float f = i;
            c1703.f6656 = f;
            c1698M5383.f6617 = f;
            c1698M5383.f6618 = true;
            m5389(c1698M5383);
            return;
        }
        C1698 c1698 = this.f6639[i2];
        if (c1698.f6618) {
            c1698.f6617 = i;
            return;
        }
        if (c1698.f6621.m5406() == 0) {
            c1698.f6618 = true;
            c1698.f6617 = i;
            return;
        }
        C1698 c1698M53832 = m5383();
        if (i < 0) {
            c1698M53832.f6617 = i * (-1);
            c1698M53832.f6621.m5405(c1703, 1.0f);
        } else {
            c1698M53832.f6617 = i;
            c1698M53832.f6621.m5405(c1703, -1.0f);
        }
        m5389(c1698M53832);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m5398() {
        for (int i = 0; i < this.f6632; i++) {
            C1698 c1698 = this.f6639[i];
            c1698.f6620.f6656 = c1698.f6617;
        }
    }
}
