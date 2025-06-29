package p424;

import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p000.C0882;
import p000.InterfaceC0875;
import p014.C1060;
import p014.C1064;
import p036.InterfaceC1239;
import p061.C1403;
import p076.C1654;
import p076.C1671;
import p076.InterfaceC1662;
import p099.C1772;
import p166.AbstractC2435;
import p166.C2428;
import p166.C2431;
import p193.C2705;
import p248.C3121;
import p254.C3158;
import p254.InterfaceC3157;
import p254.InterfaceC3165;
import p256.AbstractC3191;
import p256.AbstractC3193;
import p256.C3192;
import p256.C3195;
import p256.C3201;
import p256.C3202;
import p256.InterfaceC3194;
import p256.InterfaceC3203;
import p293.C3474;
import p323.C3683;
import p345.AbstractC3980;
import p356.AbstractC4034;
import p356.C4030;
import p356.C4032;
import p356.C4039;
import p356.C4041;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p397.C4605;
import p397.C4610;
import p438.C5077;
import ˏʼ.ʽᐧ;
import ﹳᴵ.ˉי;
import ﹶˋ.ـﹶ;

/* renamed from: ﹶʾ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4897 implements InterfaceC3203 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ـﹶ f18493;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC0875 f18494;

    /* renamed from: ˉי, reason: contains not printable characters */
    public InterfaceC1239 f18495;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f18496;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public BehindLiveWindowException f18497;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C4039 f18498;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4904 f18499;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int[] f18500;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1662 f18501;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f18502;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f18503;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f18504;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f18505;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4894[] f18506;

    public C4897(C2428 c2428, InterfaceC1662 interfaceC1662, C4039 c4039, ـﹶ r32, int i, int[] iArr, InterfaceC1239 interfaceC1239, int i2, InterfaceC0875 interfaceC0875, long j, int i3, boolean z, ArrayList arrayList, C4904 c4904) {
        InterfaceC3165 c3683;
        String str;
        C2431 c2431;
        C4894[] c4894Arr;
        AbstractC4034 abstractC4034;
        C3202 c3202;
        this.f18501 = interfaceC1662;
        this.f18498 = c4039;
        this.f18493 = r32;
        this.f18500 = iArr;
        this.f18495 = interfaceC1239;
        this.f18505 = i2;
        this.f18494 = interfaceC0875;
        this.f18496 = i;
        this.f18502 = j;
        this.f18503 = i3;
        this.f18499 = c4904;
        long jM9302 = c4039.m9302(i);
        ArrayList arrayListM11018 = m11018();
        this.f18506 = new C4894[interfaceC1239.length()];
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f18506.length) {
            AbstractC4034 abstractC40342 = (AbstractC4034) arrayListM11018.get(interfaceC1239.mo4440(i5));
            C4030 c4030 = r32.ﹳˎ(abstractC40342.f15516);
            C4894[] c4894Arr2 = this.f18506;
            C4030 c40302 = c4030 == null ? (C4030) abstractC40342.f15516.get(i4) : c4030;
            C2431 c24312 = abstractC40342.f15520;
            c2428.getClass();
            String str2 = c24312.f9664;
            if (!AbstractC2435.m6551(str2)) {
                if (str2 != null && (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm") || str2.startsWith("video/x-matroska") || str2.startsWith("audio/x-matroska") || str2.startsWith("application/x-matroska"))) {
                    str = str2;
                    c2431 = c24312;
                    c4894Arr = c4894Arr2;
                    abstractC4034 = abstractC40342;
                    c3683 = new C1064((C3474) c2428.f9649, c2428.f9650 ? 1 : 3);
                } else if (Objects.equals(str2, "image/jpeg")) {
                    c3683 = new C1772(1);
                } else if (Objects.equals(str2, "image/png")) {
                    c3683 = new C1772((byte) 0, 1);
                } else {
                    int i6 = z ? 4 : 0;
                    str = str2;
                    c2431 = c24312;
                    c4894Arr = c4894Arr2;
                    abstractC4034 = abstractC40342;
                    c3683 = new C3683((C3474) c2428.f9649, c2428.f9650 ? i6 : i6 | 32, null, null, arrayList, c4904);
                }
                if (c2428.f9650 && !AbstractC2435.m6551(str) && !(c3683.mo4086() instanceof C3683) && !(c3683.mo4086() instanceof C1064)) {
                    c3683 = new C4610(c3683, (C3474) c2428.f9649);
                }
                c3202 = new C3202(c3683, i2, c2431);
                int i7 = i5;
                c4894Arr[i7] = new C4894(jM9302, abstractC4034, c40302, c3202, 0L, abstractC4034.mo9296());
                i5 = i7 + 1;
                i4 = 0;
            } else if (c2428.f9650) {
                c3683 = new C4605(((C3474) c2428.f9649).mo8058(c24312), c24312);
            } else {
                c3202 = null;
                c4894Arr = c4894Arr2;
                abstractC4034 = abstractC40342;
                int i72 = i5;
                c4894Arr[i72] = new C4894(jM9302, abstractC4034, c40302, c3202, 0L, abstractC4034.mo9296());
                i5 = i72 + 1;
                i4 = 0;
            }
            str = str2;
            c2431 = c24312;
            c4894Arr = c4894Arr2;
            abstractC4034 = abstractC40342;
            if (c2428.f9650) {
                c3683 = new C4610(c3683, (C3474) c2428.f9649);
            }
            c3202 = new C3202(c3683, i2, c2431);
            int i722 = i5;
            c4894Arr[i722] = new C4894(jM9302, abstractC4034, c40302, c3202, 0L, abstractC4034.mo9296());
            i5 = i722 + 1;
            i4 = 0;
        }
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ʽᐧ */
    public final void mo7656() {
        for (C4894 c4894 : this.f18506) {
            C3202 c3202 = (C3202) c4894.f18482;
            if (c3202 != null) {
                c3202.f12461.mo4073();
            }
        }
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ʿʼ */
    public final int mo7657(long j, List list) {
        return (this.f18497 != null || this.f18495.length() < 2) ? list.size() : this.f18495.mo4441(j, list);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4894 m11017(int i) {
        C4894[] c4894Arr = this.f18506;
        C4894 c4894 = c4894Arr[i];
        C4030 c4030 = this.f18493.ﹳˎ(((AbstractC4034) c4894.f18477).f15516);
        if (c4030 == null || c4030.equals((C4030) c4894.f18480)) {
            return c4894;
        }
        C4894 c48942 = new C4894(c4894.f18476, (AbstractC4034) c4894.f18477, c4030, (C3202) c4894.f18482, c4894.f18478, (InterfaceC4906) c4894.f18481);
        c4894Arr[i] = c48942;
        return c48942;
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ˏᵢ */
    public final boolean mo7658(long j, AbstractC3191 abstractC3191, List list) {
        if (this.f18497 != null) {
            return false;
        }
        return this.f18495.mo4443(j, abstractC3191, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // p256.InterfaceC3203
    /* renamed from: ˑʽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo7659(long r19, p438.C5085 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            ﹶʾ.ˉי[] r0 = r7.f18506
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L62
            r5 = r0[r4]
            java.lang.Object r6 = r5.f18481
            ﹶʾ.ﹶˆ r6 = (p424.InterfaceC4906) r6
            if (r6 == 0) goto L5f
            long r8 = r5.m11015()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L5f
        L1d:
            java.lang.Object r0 = r5.f18481
            ﹶʾ.ﹶˆ r0 = (p424.InterfaceC4906) r0
            p383.AbstractC4464.m10146(r0)
            long r3 = r5.f18476
            long r3 = r0.mo4867(r1, r3)
            long r10 = r5.f18478
            long r3 = r3 + r10
            long r12 = r5.m11013(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L54
            r14 = -1
            r16 = 1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L4c
            p383.AbstractC4464.m10146(r0)
            long r14 = r0.mo4856()
            long r14 = r14 + r10
            long r14 = r14 + r8
            long r14 = r14 - r16
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L54
        L4c:
            long r3 = r3 + r16
            long r3 = r5.m11013(r3)
            r5 = r3
            goto L55
        L54:
            r5 = r12
        L55:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.m11289(r1, r3, r5)
            return r0
        L5f:
            int r4 = r4 + 1
            goto L8
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p424.C4897.mo7659(long, ﹶﾞ.ˋﾞ):long");
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ـﹶ */
    public final void mo7660() throws BehindLiveWindowException {
        BehindLiveWindowException behindLiveWindowException = this.f18497;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.f18501.mo5333();
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ٴˎ */
    public final void mo7661(C5077 c5077, long j, List list, C2428 c2428) {
        long j2;
        C4894[] c4894Arr;
        InterfaceC3194[] interfaceC3194Arr;
        long jMax;
        AbstractC4034 abstractC4034;
        long j3;
        long jM10184;
        C2431 c2431;
        C2428 c24282;
        Object c3201;
        long jM10206;
        long j4;
        long jM101842;
        boolean z;
        if (this.f18497 != null) {
            return;
        }
        long j5 = c5077.f19296;
        long j6 = j - j5;
        long jM102062 = AbstractC4470.m10206(this.f18498.m9300(this.f18496).f15525) + AbstractC4470.m10206(this.f18498.f15537) + j;
        C4904 c4904 = this.f18499;
        if (c4904 != null) {
            C4898 c4898 = c4904.f18564;
            C4039 c4039 = c4898.f18514;
            if (!c4039.f15540) {
                j2 = j6;
                z = false;
            } else if (c4898.f18509) {
                j2 = j6;
                z = true;
            } else {
                Map.Entry entryCeilingEntry = c4898.f18508.ceilingEntry(Long.valueOf(c4039.f15535));
                C4902 c4902 = c4898.f18507;
                if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jM102062) {
                    j2 = j6;
                    z = false;
                } else {
                    long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                    C4899 c4899 = c4902.f18561;
                    j2 = j6;
                    long j7 = c4899.f18547;
                    if (j7 == -9223372036854775807L || j7 < jLongValue) {
                        c4899.f18547 = jLongValue;
                    }
                    z = true;
                }
                if (z && c4898.f18515) {
                    c4898.f18509 = true;
                    c4898.f18515 = false;
                    C4899 c48992 = c4902.f18561;
                    c48992.f18518.removeCallbacks(c48992.f18526);
                    c48992.m11022();
                }
            }
            if (z) {
                return;
            }
        } else {
            j2 = j6;
        }
        long jM102063 = AbstractC4470.m10206(AbstractC4470.m10170(this.f18502));
        C4039 c40392 = this.f18498;
        long j8 = c40392.f15537;
        long jM102064 = j8 == -9223372036854775807L ? -9223372036854775807L : jM102063 - AbstractC4470.m10206(j8 + c40392.m9300(this.f18496).f15525);
        AbstractC3193 abstractC3193 = list.isEmpty() ? null : (AbstractC3193) list.get(list.size() - 1);
        int length = this.f18495.length();
        InterfaceC3194[] interfaceC3194Arr2 = new InterfaceC3194[length];
        int i = 0;
        while (true) {
            c4894Arr = this.f18506;
            if (i >= length) {
                break;
            }
            C4894 c4894 = c4894Arr[i];
            InterfaceC4906 interfaceC4906 = (InterfaceC4906) c4894.f18481;
            ˉי r23 = InterfaceC3194.f12406;
            if (interfaceC4906 == null) {
                interfaceC3194Arr2[i] = r23;
                j4 = jM102064;
            } else {
                long jM11008 = c4894.m11008(jM102063);
                long jM11011 = c4894.m11011(jM102063);
                if (abstractC3193 != null) {
                    j4 = jM102064;
                    jM101842 = abstractC3193.mo7892();
                } else {
                    InterfaceC4906 interfaceC49062 = (InterfaceC4906) c4894.f18481;
                    AbstractC4464.m10146(interfaceC49062);
                    j4 = jM102064;
                    jM101842 = AbstractC4470.m10184(interfaceC49062.mo4867(j, c4894.f18476) + c4894.f18478, jM11008, jM11011);
                }
                if (jM101842 < jM11008) {
                    interfaceC3194Arr2[i] = r23;
                } else {
                    interfaceC3194Arr2[i] = new C3121(m11017(i), jM101842, jM11011);
                }
            }
            i++;
            jM102064 = j4;
        }
        long j9 = jM102064;
        long j10 = 0;
        if (!this.f18498.f15540 || c4894Arr[0].m11015() == 0) {
            interfaceC3194Arr = interfaceC3194Arr2;
            jMax = -9223372036854775807L;
        } else {
            long jM11009 = c4894Arr[0].m11009(c4894Arr[0].m11011(jM102063));
            C4039 c40393 = this.f18498;
            long j11 = c40393.f15537;
            if (j11 == -9223372036854775807L) {
                interfaceC3194Arr = interfaceC3194Arr2;
                jM10206 = -9223372036854775807L;
            } else {
                interfaceC3194Arr = interfaceC3194Arr2;
                jM10206 = jM102063 - AbstractC4470.m10206(j11 + c40393.m9300(this.f18496).f15525);
            }
            long jMin = Math.min(jM10206, jM11009) - j5;
            j10 = 0;
            jMax = Math.max(0L, jMin);
        }
        long j12 = j2;
        long j13 = j10;
        this.f18495.mo4450(j5, j12, jMax, list, interfaceC3194Arr);
        int iMo4449 = this.f18495.mo4449();
        SystemClock.elapsedRealtime();
        C4894 c4894M11017 = m11017(iMo4449);
        InterfaceC4906 interfaceC49063 = (InterfaceC4906) c4894M11017.f18481;
        C4030 c4030 = (C4030) c4894M11017.f18480;
        C3202 c3202 = (C3202) c4894M11017.f18482;
        AbstractC4034 abstractC40342 = (AbstractC4034) c4894M11017.f18477;
        if (c3202 != null) {
            C4032 c4032 = c3202.f12459 == null ? abstractC40342.f15517 : null;
            C4032 c4032Mo9295 = interfaceC49063 == null ? abstractC40342.mo9295() : null;
            if (c4032 != null || c4032Mo9295 != null) {
                C2431 c2431Mo4435 = this.f18495.mo4435();
                int iMo4448 = this.f18495.mo4448();
                Object objMo4451 = this.f18495.mo4451();
                if (c4032 != null) {
                    C4032 c4032M9293 = c4032.m9293(c4032Mo9295, c4030.f15503);
                    if (c4032M9293 != null) {
                        c4032 = c4032M9293;
                    }
                } else {
                    c4032Mo9295.getClass();
                    c4032 = c4032Mo9295;
                }
                c2428.f9649 = new C3195(this.f18494, ʽᐧ.ʽᐧ(abstractC40342, c4030.f15503, c4032, 0), c2431Mo4435, iMo4448, objMo4451, (C3202) c4894M11017.f18482);
                return;
            }
        }
        C4039 c40394 = this.f18498;
        boolean z2 = c40394.f15540 && this.f18496 == c40394.f15533.size() - 1;
        long j14 = c4894M11017.f18476;
        boolean z3 = (z2 && j14 == -9223372036854775807L) ? false : true;
        if (c4894M11017.m11015() == j13) {
            c2428.f9650 = z3;
            return;
        }
        long jM110082 = c4894M11017.m11008(jM102063);
        long jM110112 = c4894M11017.m11011(jM102063);
        if (z2) {
            long jM110092 = c4894M11017.m11009(jM110112);
            z3 &= (jM110092 - c4894M11017.m11013(jM110112)) + jM110092 >= j14;
        }
        long j15 = c4894M11017.f18478;
        if (abstractC3193 != null) {
            abstractC4034 = abstractC40342;
            jM10184 = abstractC3193.mo7892();
            j3 = j14;
        } else {
            AbstractC4464.m10146(interfaceC49063);
            abstractC4034 = abstractC40342;
            j3 = j14;
            jM10184 = AbstractC4470.m10184(interfaceC49063.mo4867(j, j3) + j15, jM110082, jM110112);
        }
        if (jM10184 < jM110082) {
            this.f18497 = new BehindLiveWindowException();
            return;
        }
        if (jM10184 <= jM110112) {
            AbstractC4034 abstractC40343 = abstractC4034;
            if (!this.f18504 || jM10184 < jM110112) {
                if (z3 && c4894M11017.m11013(jM10184) >= j3) {
                    c2428.f9650 = true;
                    return;
                }
                int iMin = (int) Math.min(this.f18503, (jM110112 - jM10184) + 1);
                if (j3 != -9223372036854775807L) {
                    while (iMin > 1 && c4894M11017.m11013((iMin + jM10184) - 1) >= j3) {
                        iMin--;
                    }
                }
                long j16 = list.isEmpty() ? j : -9223372036854775807L;
                C2431 c2431Mo44352 = this.f18495.mo4435();
                int iMo44482 = this.f18495.mo4448();
                Object objMo44512 = this.f18495.mo4451();
                long jM11013 = c4894M11017.m11013(jM10184);
                AbstractC4464.m10146(interfaceC49063);
                long j17 = j3;
                C4032 c4032Mo4859 = interfaceC49063.mo4859(jM10184 - j15);
                InterfaceC0875 interfaceC0875 = this.f18494;
                if (c3202 == null) {
                    c3201 = new C3201(interfaceC0875, ʽᐧ.ʽᐧ(abstractC40343, c4030.f15503, c4032Mo4859, c4894M11017.m11014(jM10184, j9) ? 0 : 8), c2431Mo44352, iMo44482, objMo44512, jM11013, c4894M11017.m11009(jM10184), jM10184, this.f18505, c2431Mo44352);
                    c24282 = c2428;
                } else {
                    C4032 c40322 = c4032Mo4859;
                    int i2 = 1;
                    int i3 = 1;
                    while (true) {
                        if (i2 >= iMin) {
                            c2431 = c2431Mo44352;
                            break;
                        }
                        int i4 = iMin;
                        c2431 = c2431Mo44352;
                        AbstractC4464.m10146(interfaceC49063);
                        C4032 c4032M92932 = c40322.m9293(interfaceC49063.mo4859((i2 + jM10184) - j15), c4030.f15503);
                        if (c4032M92932 == null) {
                            break;
                        }
                        i3++;
                        i2++;
                        c2431Mo44352 = c2431;
                        c40322 = c4032M92932;
                        iMin = i4;
                    }
                    long j18 = (i3 + jM10184) - 1;
                    long jM110093 = c4894M11017.m11009(j18);
                    long j19 = (j3 == -9223372036854775807L || j17 > jM110093) ? -9223372036854775807L : j17;
                    C0882 c0882 = ʽᐧ.ʽᐧ(abstractC40343, c4030.f15503, c40322, c4894M11017.m11014(j18, j9) ? 0 : 8);
                    long j20 = -abstractC40343.f15518;
                    C2431 c24312 = c2431;
                    if (AbstractC2435.m6553(c24312.f9667)) {
                        j20 += jM11013;
                    }
                    C3192 c3192 = new C3192(interfaceC0875, c0882, c24312, iMo44482, objMo44512, jM11013, jM110093, j16, j19, jM10184, i3, j20, (C3202) c4894M11017.f18482);
                    c24282 = c2428;
                    c3201 = c3192;
                }
                c24282.f9649 = c3201;
                return;
            }
        }
        c2428.f9650 = z3;
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ᐧʻ */
    public final boolean mo7662(AbstractC3191 abstractC3191, boolean z, C1060 c1060, C2705 c2705) {
        long jMax;
        if (!z) {
            return false;
        }
        C4904 c4904 = this.f18499;
        if (c4904 != null) {
            long j = c4904.f18567;
            boolean z2 = j != -9223372036854775807L && j < abstractC3191.f12398;
            C4898 c4898 = c4904.f18564;
            if (c4898.f18514.f15540) {
                if (!c4898.f18509) {
                    if (z2) {
                        if (c4898.f18515) {
                            c4898.f18509 = true;
                            c4898.f18515 = false;
                            C4899 c4899 = c4898.f18507.f18561;
                            c4899.f18518.removeCallbacks(c4899.f18526);
                            c4899.m11022();
                        }
                    }
                }
                return true;
            }
        }
        boolean z3 = this.f18498.f15540;
        C4894[] c4894Arr = this.f18506;
        if (!z3 && (abstractC3191 instanceof AbstractC3193)) {
            IOException iOException = (IOException) c1060.f4468;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f1342 == 404) {
                C4894 c4894 = c4894Arr[this.f18495.mo4439(abstractC3191.f12395)];
                long jM11015 = c4894.m11015();
                if (jM11015 != -1 && jM11015 != 0) {
                    InterfaceC4906 interfaceC4906 = (InterfaceC4906) c4894.f18481;
                    AbstractC4464.m10146(interfaceC4906);
                    if (((AbstractC3193) abstractC3191).mo7892() > ((interfaceC4906.mo4856() + c4894.f18478) + jM11015) - 1) {
                        this.f18504 = true;
                        return true;
                    }
                }
            }
        }
        C4894 c48942 = c4894Arr[this.f18495.mo4439(abstractC3191.f12395)];
        AbstractC3980 abstractC3980 = ((AbstractC4034) c48942.f18477).f15516;
        ـﹶ r3 = this.f18493;
        C4030 c4030 = r3.ﹳˎ(abstractC3980);
        C4030 c40302 = (C4030) c48942.f18480;
        if (c4030 != null && !c40302.equals(c4030)) {
            return true;
        }
        InterfaceC1239 interfaceC1239 = this.f18495;
        AbstractC3980 abstractC39802 = ((AbstractC4034) c48942.f18477).f15516;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC1239.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC1239.mo4438(i2, jElapsedRealtime)) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < abstractC39802.size(); i3++) {
            hashSet.add(Integer.valueOf(((C4030) abstractC39802.get(i3)).f15502));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = r3.ᐧʻ(abstractC39802);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hashSet2.add(Integer.valueOf(((C4030) arrayList.get(i4)).f15502));
        }
        C1671 c1671 = new C1671(size, size - hashSet2.size(), length, i);
        if (!c1671.m5361(2) && !c1671.m5361(1)) {
            return false;
        }
        c2705.getClass();
        C1654 c1654M6867 = C2705.m6867(c1671, c1060);
        if (c1654M6867 != null) {
            int i5 = c1654M6867.f6452;
            if (c1671.m5361(i5)) {
                long j2 = c1654M6867.f6451;
                if (i5 == 2) {
                    InterfaceC1239 interfaceC12392 = this.f18495;
                    return interfaceC12392.mo4442(interfaceC12392.mo4439(abstractC3191.f12395), j2);
                }
                if (i5 != 1) {
                    return false;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                String str = c40302.f15501;
                HashMap map = (HashMap) r3.ˆʿ;
                if (map.containsKey(str)) {
                    Long l = (Long) map.get(str);
                    int i6 = AbstractC4470.f17202;
                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                } else {
                    jMax = jElapsedRealtime2;
                }
                map.put(str, Long.valueOf(jMax));
                int i7 = c40302.f15502;
                if (i7 == Integer.MIN_VALUE) {
                    return true;
                }
                Integer numValueOf = Integer.valueOf(i7);
                HashMap map2 = (HashMap) r3.ˎˑ;
                if (map2.containsKey(numValueOf)) {
                    Long l2 = (Long) map2.get(numValueOf);
                    int i8 = AbstractC4470.f17202;
                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                }
                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                return true;
            }
        }
        return false;
    }

    @Override // p256.InterfaceC3203
    /* renamed from: ﹳﹳ */
    public final void mo7663(AbstractC3191 abstractC3191) {
        if (abstractC3191 instanceof C3195) {
            int iMo4439 = this.f18495.mo4439(((C3195) abstractC3191).f12395);
            C4894[] c4894Arr = this.f18506;
            C4894 c4894 = c4894Arr[iMo4439];
            if (((InterfaceC4906) c4894.f18481) == null) {
                C3202 c3202 = (C3202) c4894.f18482;
                AbstractC4464.m10146(c3202);
                InterfaceC3157 interfaceC3157 = c3202.f12457;
                C3158 c3158 = interfaceC3157 instanceof C3158 ? (C3158) interfaceC3157 : null;
                if (c3158 != null) {
                    AbstractC4034 abstractC4034 = (AbstractC4034) c4894.f18477;
                    c4894Arr[iMo4439] = new C4894(c4894.f18476, abstractC4034, (C4030) c4894.f18480, (C3202) c4894.f18482, c4894.f18478, new C1403(c3158, abstractC4034.f15518, 7));
                }
            }
        }
        C4904 c4904 = this.f18499;
        if (c4904 != null) {
            long j = c4904.f18567;
            if (j == -9223372036854775807L || abstractC3191.f12392 > j) {
                c4904.f18567 = abstractC3191.f12392;
            }
            c4904.f18564.f18515 = true;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ArrayList m11018() {
        List list = this.f18498.m9300(this.f18496).f15526;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f18500) {
            arrayList.addAll(((C4041) list.get(i)).f15547);
        }
        return arrayList;
    }
}
