package p256;

import android.net.Uri;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p014.C1060;
import p076.C1653;
import p076.C1654;
import p076.C1659;
import p076.InterfaceC1656;
import p076.InterfaceC1658;
import p076.InterfaceC1666;
import p166.C2428;
import p166.C2431;
import p175.C2484;
import p193.C2705;
import p312.C3589;
import p331.C3759;
import p374.C4261;
import p374.C4296;
import p374.InterfaceC4254;
import p374.InterfaceC4258;
import p374.InterfaceC4280;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import p385.InterfaceC4493;
import p424.C4892;
import p424.C4904;
import p438.C5077;
import p456.C5349;
import ـˈ.ˉᵎ;

/* renamed from: יᴵ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3196 implements InterfaceC4254, InterfaceC4280, InterfaceC1658, InterfaceC1666 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public C4892 f12411;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final List f12412;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int[] f12413;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC3203 f12414;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public AbstractC3198 f12415;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C2705 f12416;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f12417;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2431[] f12418;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public AbstractC3191 f12419;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C4296[] f12420;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C4296 f12421;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C1659 f12422;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean[] f12423;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f12424;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C2428 f12425;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public long f12426;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public long f12427;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public C2431 f12428;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Object f12429;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final C3759 f12430;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ᐧʻ f12431;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f12432;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ArrayList f12433;

    public C3196(int i, int[] iArr, C2431[] c2431Arr, InterfaceC3203 interfaceC3203, InterfaceC4258 interfaceC4258, C1653 c1653, long j, InterfaceC4483 interfaceC4483, C4480 c4480, C2705 c2705, ᐧʻ r13) {
        this.f12424 = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f12413 = iArr;
        this.f12418 = c2431Arr == null ? new C2431[0] : c2431Arr;
        this.f12414 = interfaceC3203;
        this.f12429 = interfaceC4258;
        this.f12431 = r13;
        this.f12416 = c2705;
        this.f12422 = new C1659("ChunkSampleStream");
        this.f12425 = new C2428();
        ArrayList arrayList = new ArrayList();
        this.f12433 = arrayList;
        this.f12412 = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12420 = new C4296[length];
        this.f12423 = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C4296[] c4296Arr = new C4296[i3];
        interfaceC4483.getClass();
        C4296 c4296 = new C4296(c1653, interfaceC4483, c4480);
        this.f12421 = c4296;
        iArr2[0] = i;
        c4296Arr[0] = c4296;
        while (i2 < length) {
            C4296 c42962 = new C4296(c1653, null, null);
            this.f12420[i2] = c42962;
            int i4 = i2 + 1;
            c4296Arr[i4] = c42962;
            iArr2[i4] = this.f12413[i2];
            i2 = i4;
        }
        this.f12430 = new C3759(iArr2, 11, c4296Arr);
        this.f12427 = j;
        this.f12426 = j;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        return this.f12422.m5335();
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ */
    public final int mo4054(C5349 c5349, C3589 c3589, int i) {
        if (m7897()) {
            return -3;
        }
        AbstractC3198 abstractC3198 = this.f12415;
        C4296 c4296 = this.f12421;
        if (abstractC3198 != null && abstractC3198.m7902(0) <= c4296.m9765()) {
            return -3;
        }
        m7900();
        return c4296.m9773(c5349, c3589, i, this.f12417);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final AbstractC3198 m7893(int i) {
        ArrayList arrayList = this.f12433;
        AbstractC3198 abstractC3198 = (AbstractC3198) arrayList.get(i);
        AbstractC4470.m10175(arrayList, i, arrayList.size());
        this.f12432 = Math.max(this.f12432, arrayList.size());
        int i2 = 0;
        this.f12421.m9761(abstractC3198.m7902(0));
        while (true) {
            C4296[] c4296Arr = this.f12420;
            if (i2 >= c4296Arr.length) {
                return abstractC3198;
            }
            C4296 c4296 = c4296Arr[i2];
            i2++;
            c4296.m9761(abstractC3198.m7902(i2));
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m7894(long j) {
        ArrayList arrayList;
        AbstractC3198 abstractC3198;
        this.f12426 = j;
        if (m7897()) {
            this.f12427 = j;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            arrayList = this.f12433;
            if (i2 >= arrayList.size()) {
                break;
            }
            abstractC3198 = (AbstractC3198) arrayList.get(i2);
            long j2 = abstractC3198.f12398;
            if (j2 == j && abstractC3198.f12443 == -9223372036854775807L) {
                break;
            } else if (j2 > j) {
                break;
            } else {
                i2++;
            }
        }
        abstractC3198 = null;
        C4296 c4296 = this.f12421;
        boolean zM9758 = abstractC3198 != null ? c4296.m9758(abstractC3198.m7902(0)) : c4296.m9776(j < mo6173(), j);
        C4296[] c4296Arr = this.f12420;
        if (zM9758) {
            this.f12432 = m7895(c4296.m9765(), 0);
            int length = c4296Arr.length;
            while (i < length) {
                c4296Arr[i].m9776(true, j);
                i++;
            }
            return;
        }
        this.f12427 = j;
        this.f12417 = false;
        arrayList.clear();
        this.f12432 = 0;
        C1659 c1659 = this.f12422;
        if (c1659.m5335()) {
            c4296.m9760();
            int length2 = c4296Arr.length;
            while (i < length2) {
                c4296Arr[i].m9760();
                i++;
            }
            c1659.m5330();
            return;
        }
        c1659.f6473 = null;
        c4296.m9764(false);
        for (C4296 c42962 : c4296Arr) {
            c42962.m9764(false);
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int m7895(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.f12433;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC3198) arrayList.get(i2)).m7902(0) <= i);
        return i2 - 1;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final AbstractC3198 m7896() {
        return (AbstractC3198) ˉᵎ.ﹶˆ(1, this.f12433);
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ */
    public final boolean mo4058() {
        return !m7897() && this.f12421.m9782(this.f12417);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        if (this.f12417) {
            return Long.MIN_VALUE;
        }
        if (m7897()) {
            return this.f12427;
        }
        long jMax = this.f12426;
        AbstractC3198 abstractC3198M7896 = m7896();
        if (!abstractC3198M7896.mo7891()) {
            ArrayList arrayList = this.f12433;
            abstractC3198M7896 = arrayList.size() > 1 ? (AbstractC3198) ˉᵎ.ﹶˆ(2, arrayList) : null;
        }
        if (abstractC3198M7896 != null) {
            jMax = Math.max(jMax, abstractC3198M7896.f12392);
        }
        return Math.max(jMax, this.f12421.m9767());
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        long j;
        List listEmptyList;
        if (!this.f12417) {
            C1659 c1659 = this.f12422;
            if (!c1659.m5335() && !c1659.m5332()) {
                boolean zM7897 = m7897();
                if (zM7897) {
                    listEmptyList = Collections.emptyList();
                    j = this.f12427;
                } else {
                    j = m7896().f12392;
                    listEmptyList = this.f12412;
                }
                this.f12414.mo7661(c5077, j, listEmptyList, this.f12425);
                C2428 c2428 = this.f12425;
                boolean z = c2428.f9650;
                AbstractC3191 abstractC3191 = (AbstractC3191) c2428.f9649;
                c2428.f9649 = null;
                c2428.f9650 = false;
                if (z) {
                    this.f12427 = -9223372036854775807L;
                    this.f12417 = true;
                    return true;
                }
                if (abstractC3191 == null) {
                    return false;
                }
                this.f12419 = abstractC3191;
                boolean z2 = abstractC3191 instanceof AbstractC3198;
                C3759 c3759 = this.f12430;
                if (z2) {
                    AbstractC3198 abstractC3198 = (AbstractC3198) abstractC3191;
                    if (zM7897) {
                        long j2 = this.f12427;
                        if (abstractC3198.f12398 != j2) {
                            this.f12421.f16730 = j2;
                            for (C4296 c4296 : this.f12420) {
                                c4296.f16730 = this.f12427;
                            }
                        }
                        this.f12427 = -9223372036854775807L;
                    }
                    abstractC3198.f12442 = c3759;
                    C4296[] c4296Arr = (C4296[]) c3759.f14523;
                    int[] iArr = new int[c4296Arr.length];
                    for (int i = 0; i < c4296Arr.length; i++) {
                        C4296 c42962 = c4296Arr[i];
                        iArr[i] = c42962.f16728 + c42962.f16719;
                    }
                    abstractC3198.f12441 = iArr;
                    this.f12433.add(abstractC3198);
                } else if (abstractC3191 instanceof C3195) {
                    ((C3195) abstractC3191).f12410 = c3759;
                }
                this.f12431.ʿˏ(new C4261(abstractC3191.f12396, abstractC3191.f12390, c1659.m5334(abstractC3191, this, this.f12416.m6869(abstractC3191.f12393))), abstractC3191.f12393, this.f12424, abstractC3191.f12395, abstractC3191.f12391, abstractC3191.f12397, abstractC3191.f12398, abstractC3191.f12392);
                return true;
            }
        }
        return false;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m7897() {
        return this.f12427 != -9223372036854775807L;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ */
    public final void mo4062() throws IOException {
        C1659 c1659 = this.f12422;
        c1659.mo5333();
        this.f12421.m9770();
        if (c1659.m5335()) {
            return;
        }
        this.f12414.mo7660();
    }

    @Override // p076.InterfaceC1666
    /* renamed from: ٴˎ */
    public final void mo5357() {
        this.f12421.m9757();
        for (C4296 c4296 : this.f12420) {
            c4296.m9757();
        }
        this.f12414.mo7656();
        C4892 c4892 = this.f12411;
        if (c4892 != null) {
            synchronized (c4892) {
                C4904 c4904 = (C4904) c4892.f18452.remove(this);
                if (c4904 != null) {
                    c4904.f18566.m9757();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ᵢˎ.ˋﾞ] */
    @Override // p076.InterfaceC1658
    /* renamed from: ᐧʻ */
    public final C1654 mo5327(InterfaceC1656 interfaceC1656, long j, long j2, IOException iOException, int i) {
        C1654 c1654;
        AbstractC3191 abstractC3191 = (AbstractC3191) interfaceC1656;
        long j3 = abstractC3191.f12394.f3991;
        boolean z = abstractC3191 instanceof AbstractC3198;
        ArrayList arrayList = this.f12433;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && m7901(size)) ? false : true;
        Uri uri = abstractC3191.f12394.f3992;
        C4261 c4261 = new C4261(j2);
        AbstractC4470.m10171(abstractC3191.f12398);
        AbstractC4470.m10171(abstractC3191.f12392);
        C1060 c1060 = new C1060(i, iOException);
        InterfaceC3203 interfaceC3203 = this.f12414;
        C2705 c2705 = this.f12416;
        if (!interfaceC3203.mo7662(abstractC3191, z2, c1060, c2705)) {
            c1654 = null;
        } else if (z2) {
            if (z) {
                AbstractC4464.m10132(m7893(size) == abstractC3191);
                if (arrayList.isEmpty()) {
                    this.f12427 = this.f12426;
                }
            }
            c1654 = C1659.f6469;
        } else {
            AbstractC4464.m10144("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            c1654 = null;
        }
        if (c1654 == null) {
            long jM6871 = c2705.m6871(c1060);
            c1654 = jM6871 != -9223372036854775807L ? new C1654(jM6871, false, 0) : C1659.f6471;
        }
        boolean zM5323 = c1654.m5323();
        C1654 c16542 = c1654;
        this.f12431.ˎٴ(c4261, abstractC3191.f12393, this.f12424, abstractC3191.f12395, abstractC3191.f12391, abstractC3191.f12397, abstractC3191.f12398, abstractC3191.f12392, iOException, !zM5323);
        if (!zM5323) {
            this.f12419 = null;
            c2705.getClass();
            this.f12429.mo7664(this);
        }
        return c16542;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m7898(C4892 c4892) {
        this.f12411 = c4892;
        C4296 c4296 = this.f12421;
        c4296.m9760();
        InterfaceC4493 interfaceC4493 = c4296.f16717;
        if (interfaceC4493 != null) {
            interfaceC4493.mo10246(c4296.f16704);
            c4296.f16717 = null;
            c4296.f16723 = null;
        }
        for (C4296 c42962 : this.f12420) {
            c42962.m9760();
            InterfaceC4493 interfaceC44932 = c42962.f16717;
            if (interfaceC44932 != null) {
                interfaceC44932.mo10246(c42962.f16704);
                c42962.f16717 = null;
                c42962.f16723 = null;
            }
        }
        this.f12422.m5331(this);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m7899(long j) {
        long j2;
        if (m7897()) {
            return;
        }
        C4296 c4296 = this.f12421;
        int i = c4296.f16728;
        c4296.m9780(true, j);
        C4296 c42962 = this.f12421;
        int i2 = c42962.f16728;
        if (i2 > i) {
            synchronized (c42962) {
                j2 = c42962.f16719 == 0 ? Long.MIN_VALUE : c42962.f16726[c42962.f16714];
            }
            int i3 = 0;
            while (true) {
                C4296[] c4296Arr = this.f12420;
                if (i3 >= c4296Arr.length) {
                    break;
                }
                c4296Arr[i3].m9780(this.f12423[i3], j2);
                i3++;
            }
        }
        int iMin = Math.min(m7895(i2, 0), this.f12432);
        if (iMin > 0) {
            AbstractC4470.m10175(this.f12433, 0, iMin);
            this.f12432 -= iMin;
        }
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ */
    public final int mo4066(long j) {
        if (m7897()) {
            return 0;
        }
        C4296 c4296 = this.f12421;
        int iM9777 = c4296.m9777(this.f12417, j);
        AbstractC3198 abstractC3198 = this.f12415;
        if (abstractC3198 != null) {
            iM9777 = Math.min(iM9777, abstractC3198.m7902(0) - c4296.m9765());
        }
        c4296.m9779(iM9777);
        m7900();
        return iM9777;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        C1659 c1659 = this.f12422;
        if (c1659.m5332() || m7897()) {
            return;
        }
        boolean zM5335 = c1659.m5335();
        InterfaceC3203 interfaceC3203 = this.f12414;
        ArrayList arrayList = this.f12433;
        List list = this.f12412;
        if (zM5335) {
            AbstractC3191 abstractC3191 = this.f12419;
            abstractC3191.getClass();
            boolean z = abstractC3191 instanceof AbstractC3198;
            if (!(z && m7901(arrayList.size() - 1)) && interfaceC3203.mo7658(j, abstractC3191, list)) {
                c1659.m5330();
                if (z) {
                    this.f12415 = (AbstractC3198) abstractC3191;
                    return;
                }
                return;
            }
            return;
        }
        int iMo7657 = interfaceC3203.mo7657(j, list);
        if (iMo7657 < arrayList.size()) {
            AbstractC4464.m10132(!c1659.m5335());
            int size = arrayList.size();
            while (true) {
                if (iMo7657 >= size) {
                    iMo7657 = -1;
                    break;
                } else if (!m7901(iMo7657)) {
                    break;
                } else {
                    iMo7657++;
                }
            }
            if (iMo7657 == -1) {
                return;
            }
            long j2 = m7896().f12392;
            AbstractC3198 abstractC3198M7893 = m7893(iMo7657);
            if (arrayList.isEmpty()) {
                this.f12427 = this.f12426;
            }
            this.f12417 = false;
            this.f12431.ˆʿ(new C2484(1, this.f12424, null, 3, null, AbstractC4470.m10171(abstractC3198M7893.f12398), AbstractC4470.m10171(j2)));
        }
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m7900() {
        int iM7895 = m7895(this.f12421.m9765(), this.f12432 - 1);
        while (true) {
            int i = this.f12432;
            if (i > iM7895) {
                return;
            }
            this.f12432 = i + 1;
            AbstractC3198 abstractC3198 = (AbstractC3198) this.f12433.get(i);
            C2431 c2431 = abstractC3198.f12395;
            if (!c2431.equals(this.f12428)) {
                this.f12431.ᐧʻ(this.f12424, c2431, abstractC3198.f12391, abstractC3198.f12397, abstractC3198.f12398);
            }
            this.f12428 = c2431;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ᵢˎ.ˋﾞ] */
    @Override // p076.InterfaceC1658
    /* renamed from: ﹳﹳ */
    public final void mo5328(InterfaceC1656 interfaceC1656, long j, long j2, boolean z) {
        AbstractC3191 abstractC3191 = (AbstractC3191) interfaceC1656;
        this.f12419 = null;
        this.f12415 = null;
        long j3 = abstractC3191.f12396;
        Uri uri = abstractC3191.f12394.f3992;
        C4261 c4261 = new C4261(j2);
        this.f12416.getClass();
        this.f12431.ˋⁱ(c4261, abstractC3191.f12393, this.f12424, abstractC3191.f12395, abstractC3191.f12391, abstractC3191.f12397, abstractC3191.f12398, abstractC3191.f12392);
        if (z) {
            return;
        }
        if (m7897()) {
            this.f12421.m9764(false);
            for (C4296 c4296 : this.f12420) {
                c4296.m9764(false);
            }
        } else if (abstractC3191 instanceof AbstractC3198) {
            ArrayList arrayList = this.f12433;
            m7893(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f12427 = this.f12426;
            }
        }
        this.f12429.mo7664(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        if (m7897()) {
            return this.f12427;
        }
        if (this.f12417) {
            return Long.MIN_VALUE;
        }
        return m7896().f12392;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ᵢˎ.ˋﾞ] */
    @Override // p076.InterfaceC1658
    /* renamed from: ﾞʽ */
    public final void mo5329(InterfaceC1656 interfaceC1656, long j, long j2) {
        AbstractC3191 abstractC3191 = (AbstractC3191) interfaceC1656;
        this.f12419 = null;
        this.f12414.mo7663(abstractC3191);
        long j3 = abstractC3191.f12396;
        Uri uri = abstractC3191.f12394.f3992;
        C4261 c4261 = new C4261(j2);
        this.f12416.getClass();
        this.f12431.ˑי(c4261, abstractC3191.f12393, this.f12424, abstractC3191.f12395, abstractC3191.f12391, abstractC3191.f12397, abstractC3191.f12398, abstractC3191.f12392);
        this.f12429.mo7664(this);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m7901(int i) {
        int iM9765;
        AbstractC3198 abstractC3198 = (AbstractC3198) this.f12433.get(i);
        if (this.f12421.m9765() > abstractC3198.m7902(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C4296[] c4296Arr = this.f12420;
            if (i2 >= c4296Arr.length) {
                return false;
            }
            iM9765 = c4296Arr[i2].m9765();
            i2++;
        } while (iM9765 <= abstractC3198.m7902(i2));
        return true;
    }
}
