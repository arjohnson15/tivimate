package p438;

import android.util.Pair;
import java.util.ArrayList;
import p033.C1220;
import p141.RunnableC2187;
import p166.AbstractC2394;
import p166.C2395;
import p166.C2412;
import p166.C2434;
import p345.AbstractC3980;
import p345.C3961;
import p362.C4125;
import p374.C4290;
import p383.AbstractC4464;
import p383.C4469;

/* renamed from: ﹶﾞ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5097 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4125 f19385;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C5116 f19386;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f19387;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public Object f19388;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C5116 f19389;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f19391;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1220 f19392;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f19394;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f19395;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f19396;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4469 f19397;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C5116 f19398;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2412 f19393 = new C2412();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2434 f19384 = new C2434();

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public ArrayList f19390 = new ArrayList();

    public C5097(C1220 c1220, C4469 c4469, C4125 c4125, C5080 c5080) {
        this.f19392 = c1220;
        this.f19397 = c4469;
        this.f19385 = c4125;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C4290 m11297(AbstractC2394 abstractC2394, Object obj, long j, long j2, C2434 c2434, C2412 c2412) {
        abstractC2394.mo6479(obj, c2412);
        abstractC2394.m6480(c2412.f9576, c2434);
        abstractC2394.mo6469(obj);
        int i = c2412.f9579.f9452;
        if (i != 0) {
            if (i == 1) {
                c2412.m6504(0);
            }
            c2412.f9579.getClass();
            c2412.m6505(0);
        }
        abstractC2394.mo6479(obj, c2412);
        int iM6502 = c2412.m6502(j);
        return iM6502 == -1 ? new C4290(obj, j2, c2412.m6499(j)) : new C4290(obj, iM6502, c2412.m6500(iM6502), j2, -1);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11298() {
        if (this.f19387 == 0) {
            return;
        }
        C5116 c5116 = this.f19398;
        AbstractC4464.m10146(c5116);
        this.f19388 = c5116.f19492;
        this.f19396 = c5116.f19502.f19313.f16694;
        while (c5116 != null) {
            c5116.m11347();
            c5116 = c5116.f19495;
        }
        this.f19398 = null;
        this.f19389 = null;
        this.f19386 = null;
        this.f19387 = 0;
        m11300();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5082 m11299(AbstractC2394 abstractC2394, Object obj, int i, int i2, long j, long j2) {
        C4290 c4290 = new C4290(obj, i, i2, j2, -1);
        C2412 c2412 = this.f19393;
        long jM6503 = abstractC2394.mo6479(obj, c2412).m6503(i, i2);
        if (i2 == c2412.m6500(i)) {
            c2412.f9579.getClass();
        }
        c2412.m6505(i);
        long jMax = 0;
        if (jM6503 != -9223372036854775807L && 0 >= jM6503) {
            jMax = Math.max(0L, jM6503 - 1);
        }
        return new C5082(c4290, jMax, j, -9223372036854775807L, jM6503, false, false, false, false);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m11300() {
        C3961 c3961M9205 = AbstractC3980.m9205();
        for (C5116 c5116 = this.f19398; c5116 != null; c5116 = c5116.f19495) {
            c3961M9205.m9172(c5116.f19502.f19313);
        }
        C5116 c51162 = this.f19386;
        this.f19397.m10158(new RunnableC2187(this, c3961M9205, c51162 == null ? null : c51162.f19502.f19313, 13));
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C4290 m11301(AbstractC2394 abstractC2394, Object obj, long j) {
        long jM11310;
        int iMo6469;
        Object obj2 = obj;
        C2412 c2412 = this.f19393;
        int i = abstractC2394.mo6479(obj2, c2412).f9576;
        Object obj3 = this.f19388;
        if (obj3 == null || (iMo6469 = abstractC2394.mo6469(obj3)) == -1 || abstractC2394.mo6180(iMo6469, c2412, false).f9576 != i) {
            C5116 c5116 = this.f19398;
            while (true) {
                if (c5116 == null) {
                    C5116 c51162 = this.f19398;
                    while (true) {
                        if (c51162 != null) {
                            int iMo64692 = abstractC2394.mo6469(c51162.f19492);
                            if (iMo64692 != -1 && abstractC2394.mo6180(iMo64692, c2412, false).f9576 == i) {
                                jM11310 = c51162.f19502.f19313.f16694;
                                break;
                            }
                            c51162 = c51162.f19495;
                        } else {
                            jM11310 = m11310(obj2);
                            if (jM11310 == -1) {
                                jM11310 = this.f19394;
                                this.f19394 = 1 + jM11310;
                                if (this.f19398 == null) {
                                    this.f19388 = obj2;
                                    this.f19396 = jM11310;
                                }
                            }
                        }
                    }
                } else {
                    if (c5116.f19492.equals(obj2)) {
                        jM11310 = c5116.f19502.f19313.f16694;
                        break;
                    }
                    c5116 = c5116.f19495;
                }
            }
        } else {
            jM11310 = this.f19396;
        }
        long j2 = jM11310;
        abstractC2394.mo6479(obj2, c2412);
        int i2 = c2412.f9576;
        C2434 c2434 = this.f19384;
        abstractC2394.m6480(i2, c2434);
        boolean z = false;
        for (int iMo64693 = abstractC2394.mo6469(obj); iMo64693 >= c2434.f9716; iMo64693--) {
            abstractC2394.mo6180(iMo64693, c2412, true);
            boolean z2 = c2412.f9579.f9452 > 0;
            z |= z2;
            if (c2412.m6502(c2412.f9580) != -1) {
                obj2 = c2412.f9574;
                obj2.getClass();
            }
            if (z && (!z2 || c2412.f9580 != 0)) {
                break;
            }
        }
        return m11297(abstractC2394, obj2, j, j2, this.f19384, this.f19393);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m11302(C5116 c5116) {
        AbstractC4464.m10146(c5116);
        boolean z = false;
        if (c5116.equals(this.f19389)) {
            return false;
        }
        this.f19389 = c5116;
        while (true) {
            c5116 = c5116.f19495;
            if (c5116 == null) {
                break;
            }
            if (c5116 == this.f19386) {
                this.f19386 = this.f19398;
                z = true;
            }
            c5116.m11347();
            this.f19387--;
        }
        C5116 c51162 = this.f19389;
        c51162.getClass();
        if (c51162.f19495 != null) {
            c51162.m11341();
            c51162.f19495 = null;
            c51162.m11344();
        }
        m11300();
        return z;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m11303(AbstractC2394 abstractC2394) {
        C5116 c5116;
        C5116 c51162 = this.f19398;
        if (c51162 == null) {
            return true;
        }
        int iMo6469 = abstractC2394.mo6469(c51162.f19492);
        while (true) {
            iMo6469 = abstractC2394.m6481(iMo6469, this.f19393, this.f19384, this.f19395, this.f19391);
            while (true) {
                c51162.getClass();
                c5116 = c51162.f19495;
                if (c5116 == null || c51162.f19502.f19315) {
                    break;
                }
                c51162 = c5116;
            }
            if (iMo6469 == -1 || c5116 == null || abstractC2394.mo6469(c5116.f19492) != iMo6469) {
                break;
            }
            c51162 = c5116;
        }
        boolean zM11302 = m11302(c51162);
        c51162.f19502 = m11309(abstractC2394, c51162.f19502);
        return !zM11302;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m11304(AbstractC2394 abstractC2394, C4290 c4290, boolean z) {
        int iMo6469 = abstractC2394.mo6469(c4290.f16693);
        if (abstractC2394.mo6179(abstractC2394.mo6180(iMo6469, this.f19393, false).f9576, this.f19384, 0L).f9718) {
            return false;
        }
        return abstractC2394.m6481(iMo6469, this.f19393, this.f19384, this.f19395, this.f19391) == -1 && z;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5082 m11305(AbstractC2394 abstractC2394, C5116 c5116, long j) {
        C5082 c5082M11308;
        long j2;
        C5082 c5082 = c5116.f19502;
        long j3 = (c5116.f19498 + c5082.f19310) - j;
        if (c5082.f19315) {
            C5082 c50822 = c5116.f19502;
            C4290 c4290 = c50822.f19313;
            int iM6481 = abstractC2394.m6481(abstractC2394.mo6469(c4290.f16693), this.f19393, this.f19384, this.f19395, this.f19391);
            if (iM6481 != -1) {
                C2412 c2412 = this.f19393;
                int i = abstractC2394.mo6180(iM6481, c2412, true).f9576;
                Object obj = c2412.f9574;
                obj.getClass();
                long jM11310 = c4290.f16694;
                long j4 = 0;
                if (abstractC2394.mo6179(i, this.f19384, 0L).f9716 == iM6481) {
                    Pair pairM6471 = abstractC2394.m6471(this.f19384, this.f19393, i, -9223372036854775807L, Math.max(0L, j3));
                    if (pairM6471 != null) {
                        obj = pairM6471.first;
                        long jLongValue = ((Long) pairM6471.second).longValue();
                        C5116 c51162 = c5116.f19495;
                        if (c51162 == null || !c51162.f19492.equals(obj)) {
                            jM11310 = m11310(obj);
                            if (jM11310 == -1) {
                                jM11310 = this.f19394;
                                this.f19394 = 1 + jM11310;
                            }
                        } else {
                            jM11310 = c51162.f19502.f19313.f16694;
                        }
                        j2 = jLongValue;
                        j4 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                C4290 c4290M11297 = m11297(abstractC2394, obj, j2, jM11310, this.f19384, this.f19393);
                if (j4 != -9223372036854775807L && c50822.f19312 != -9223372036854775807L) {
                    int i2 = abstractC2394.mo6479(c4290.f16693, c2412).f9579.f9452;
                    c2412.f9579.getClass();
                    if (i2 > 0) {
                        c2412.m6505(0);
                    }
                }
                return m11311(abstractC2394, c4290M11297, j4, j2);
            }
            return null;
        }
        C4290 c42902 = c5082.f19313;
        Object obj2 = c42902.f16693;
        C2412 c24122 = this.f19393;
        abstractC2394.mo6479(obj2, c24122);
        boolean zM9753 = c42902.m9753();
        Object obj3 = c42902.f16693;
        if (zM9753) {
            C2395 c2395 = c24122.f9579;
            int i3 = c42902.f16690;
            int i4 = c2395.m6484(i3).f9638;
            if (i4 != -1) {
                int iM6525 = c24122.f9579.m6484(i3).m6525(c42902.f16692);
                if (iM6525 < i4) {
                    c5082M11308 = m11299(abstractC2394, c42902.f16693, i3, iM6525, c5082.f19312, c42902.f16694);
                } else {
                    long jLongValue2 = c5082.f19312;
                    if (jLongValue2 == -9223372036854775807L) {
                        Pair pairM64712 = abstractC2394.m6471(this.f19384, c24122, c24122.f9576, -9223372036854775807L, Math.max(0L, j3));
                        if (pairM64712 != null) {
                            jLongValue2 = ((Long) pairM64712.second).longValue();
                        }
                    }
                    abstractC2394.mo6479(obj3, c24122);
                    int i5 = c42902.f16690;
                    c24122.m6506(i5);
                    c24122.f9579.m6484(i5).getClass();
                    c5082M11308 = m11308(abstractC2394, c42902.f16693, Math.max(0L, jLongValue2), c5082.f19312, c42902.f16694);
                }
            }
            return null;
        }
        int i6 = c42902.f16691;
        if (i6 != -1) {
            c24122.m6504(i6);
        }
        int iM6500 = c24122.m6500(i6);
        c24122.m6505(i6);
        if (iM6500 != c24122.f9579.m6484(i6).f9638) {
            c5082M11308 = m11299(abstractC2394, c42902.f16693, c42902.f16691, iM6500, c5082.f19310, c42902.f16694);
        } else {
            abstractC2394.mo6479(obj3, c24122);
            c24122.m6506(i6);
            c24122.f9579.m6484(i6).getClass();
            c5082M11308 = m11308(abstractC2394, c42902.f16693, 0L, c5082.f19310, c42902.f16694);
        }
        return c5082M11308;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m11306(AbstractC2394 abstractC2394, long j, long j2) {
        C5082 c5082M11309;
        C5116 c5116 = this.f19398;
        C5116 c51162 = null;
        while (c5116 != null) {
            C5082 c5082 = c5116.f19502;
            if (c51162 == null) {
                c5082M11309 = m11309(abstractC2394, c5082);
            } else {
                C5082 c5082M11305 = m11305(abstractC2394, c51162, j);
                if (c5082M11305 == null) {
                    return !m11302(c51162);
                }
                if (c5082.f19309 != c5082M11305.f19309 || !c5082.f19313.equals(c5082M11305.f19313)) {
                    return !m11302(c51162);
                }
                c5082M11309 = c5082M11305;
            }
            c5116.f19502 = c5082M11309.m11288(c5082.f19312);
            long j3 = c5082.f19310;
            if (j3 != -9223372036854775807L) {
                long j4 = c5082M11309.f19310;
                if (j3 != j4) {
                    c5116.m11349();
                    return (m11302(c5116) || (c5116 == this.f19386 && !c5116.f19502.f19314 && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c5116.f19498 + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c5116.f19498 + j4) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c51162 = c5116;
            c5116 = c5116.f19495;
        }
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5116 m11307() {
        C5116 c5116 = this.f19398;
        if (c5116 == null) {
            return null;
        }
        if (c5116 == this.f19386) {
            this.f19386 = c5116.f19495;
        }
        c5116.m11347();
        int i = this.f19387 - 1;
        this.f19387 = i;
        if (i == 0) {
            this.f19389 = null;
            C5116 c51162 = this.f19398;
            this.f19388 = c51162.f19492;
            this.f19396 = c51162.f19502.f19313.f16694;
        }
        this.f19398 = this.f19398.f19495;
        m11300();
        return this.f19398;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C5082 m11308(AbstractC2394 abstractC2394, Object obj, long j, long j2, long j3) {
        long j4;
        C2412 c2412 = this.f19393;
        abstractC2394.mo6479(obj, c2412);
        int iM6499 = c2412.m6499(j);
        if (iM6499 != -1) {
            c2412.m6504(iM6499);
        }
        boolean z = false;
        if (iM6499 != -1) {
            c2412.m6505(iM6499);
        } else if (c2412.f9579.f9452 > 0) {
            c2412.m6505(0);
        }
        C4290 c4290 = new C4290(obj, j3, iM6499);
        if (!c4290.m9753() && iM6499 == -1) {
            z = true;
        }
        boolean zM11312 = m11312(abstractC2394, c4290);
        boolean zM11304 = m11304(abstractC2394, c4290, z);
        if (iM6499 != -1) {
            c2412.m6505(iM6499);
        }
        if (iM6499 != -1) {
            c2412.m6506(iM6499);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c2412.f9580 : j4;
        return new C5082(c4290, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, false, z, zM11312, zM11304);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p438.C5082 m11309(p166.AbstractC2394 r20, p438.C5082 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            ᵢˎ.ﹳˑ r3 = r2.f19313
            boolean r4 = r3.m9753()
            r5 = -1
            int r6 = r3.f16691
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
            r12 = 1
            goto L18
        L16:
            r4 = 0
            r12 = 0
        L18:
            boolean r13 = r0.m11312(r1, r3)
            boolean r14 = r0.m11304(r1, r3, r12)
            java.lang.Object r4 = r3.f16693
            ˊﹶ.ˎᵔ r7 = r0.f19393
            r1.mo6479(r4, r7)
            boolean r1 = r3.m9753()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.m6506(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.m9753()
            int r4 = r3.f16690
            if (r1 == 0) goto L4c
            int r1 = r3.f16692
            long r8 = r7.m6503(r4, r1)
        L4a:
            r15 = r8
            goto L5c
        L4c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L59
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L57
            goto L59
        L57:
            r15 = r10
            goto L5c
        L59:
            long r8 = r7.f9580
            goto L4a
        L5c:
            boolean r1 = r3.m9753()
            if (r1 == 0) goto L66
            r7.m6505(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.m6505(r6)
        L6b:
            ﹶﾞ.ˋˉ r17 = new ﹶﾞ.ˋˉ
            long r4 = r2.f19309
            long r6 = r2.f19312
            r18 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: p438.C5097.m11309(ˊﹶ.ʻʿ, ﹶﾞ.ˋˉ):ﹶﾞ.ˋˉ");
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final long m11310(Object obj) {
        for (int i = 0; i < this.f19390.size(); i++) {
            C5116 c5116 = (C5116) this.f19390.get(i);
            if (c5116.f19492.equals(obj)) {
                return c5116.f19502.f19313.f16694;
            }
        }
        return -1L;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5082 m11311(AbstractC2394 abstractC2394, C4290 c4290, long j, long j2) {
        abstractC2394.mo6479(c4290.f16693, this.f19393);
        if (!c4290.m9753()) {
            return m11308(abstractC2394, c4290.f16693, j2, j, c4290.f16694);
        }
        return m11299(abstractC2394, c4290.f16693, c4290.f16690, c4290.f16692, j, c4290.f16694);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m11312(AbstractC2394 abstractC2394, C4290 c4290) {
        if (!(!c4290.m9753() && c4290.f16691 == -1)) {
            return false;
        }
        Object obj = c4290.f16693;
        return abstractC2394.mo6179(abstractC2394.mo6479(obj, this.f19393).f9576, this.f19384, 0L).f9709 == abstractC2394.mo6469(obj);
    }
}
