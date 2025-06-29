package p372;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.lifecycle.RunnableC0246;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p014.C1060;
import p036.InterfaceC1239;
import p076.C1653;
import p076.C1654;
import p076.C1659;
import p076.C1671;
import p076.InterfaceC1656;
import p076.InterfaceC1658;
import p076.InterfaceC1666;
import p080.AbstractC1702;
import p166.AbstractC2435;
import p166.C2401;
import p166.C2405;
import p166.C2417;
import p166.C2431;
import p166.C2433;
import p175.C2484;
import p193.C2705;
import p254.C3175;
import p254.InterfaceC3157;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p256.AbstractC3191;
import p324.C3701;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p374.C4241;
import p374.C4261;
import p374.InterfaceC4280;
import p374.InterfaceC4283;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import p438.C5077;
import p438.C5101;
import ʻˋ.ˋˊ;
import ˆˑ.ﹳﹳ;
import ˏᵢ.ᵢٴ;
import ـˈ.ˉᵎ;
import ᵢ.ʿʼ;

/* renamed from: ᵢˆ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4234 implements InterfaceC1658, InterfaceC1666, InterfaceC4280, InterfaceC3177, InterfaceC4283 {

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public static final Set f16384 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: ʻ, reason: contains not printable characters */
    public C2405 f16385;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public long f16386;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final Handler f16387;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f16388;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public C2431 f16389;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public C4220 f16390;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f16391;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public boolean f16392;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final SparseIntArray f16393;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f16394;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1653 f16395;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public boolean f16396;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f16397;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public C4225 f16398;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public C4228[] f16399;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public boolean f16400;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C4480 f16401;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int[] f16402;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public int f16403;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ᵢٴ f16404;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final RunnableC4232 f16405;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public int f16406;

    /* renamed from: ˏ, reason: contains not printable characters */
    public long f16407;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public boolean f16408;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final ArrayList f16409;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ˋˊ f16410;

    /* renamed from: יˋ, reason: contains not printable characters */
    public boolean f16411;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C2705 f16412;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public C4241 f16413;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public C2431 f16414;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public boolean f16415;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public long f16416;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4226 f16417;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f16418;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C1659 f16419 = new C1659("Loader:HlsSampleStreamWrapper");

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final HashSet f16420;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public int[] f16421;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public Set f16422;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final Map f16423;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final ArrayList f16424;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final RunnableC4232 f16425;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2431 f16426;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final List f16427;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean f16428;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public int f16429;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public boolean[] f16430;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final InterfaceC4483 f16431;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public AbstractC3191 f16432;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ᐧʻ f16433;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public boolean[] f16434;

    /* JADX WARN: Type inference failed for: r1v12, types: [ᵢˆ.ᴵʿ] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ᵢˆ.ᴵʿ] */
    public C4234(String str, int i, ᵢٴ r3, C4226 c4226, Map map, C1653 c1653, long j, C2431 c2431, InterfaceC4483 interfaceC4483, C4480 c4480, C2705 c2705, ᐧʻ r13, int i2) {
        this.f16418 = str;
        this.f16394 = i;
        this.f16404 = r3;
        this.f16417 = c4226;
        this.f16423 = map;
        this.f16395 = c1653;
        this.f16426 = c2431;
        this.f16431 = interfaceC4483;
        this.f16401 = c4480;
        this.f16412 = c2705;
        this.f16433 = r13;
        this.f16391 = i2;
        ˋˊ r1 = new ˋˊ(8, false);
        r1.ˎˑ = null;
        r1.ˆʿ = false;
        r1.ᐧˋ = null;
        this.f16410 = r1;
        this.f16402 = new int[0];
        Set set = f16384;
        this.f16420 = new HashSet(set.size());
        this.f16393 = new SparseIntArray(set.size());
        this.f16399 = new C4228[0];
        this.f16434 = new boolean[0];
        this.f16430 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f16409 = arrayList;
        this.f16427 = DesugarCollections.unmodifiableList(arrayList);
        this.f16424 = new ArrayList();
        final int i3 = 0;
        this.f16405 = new Runnable(this) { // from class: ᵢˆ.ᴵʿ

            /* renamed from: ˆʿ, reason: contains not printable characters */
            public final /* synthetic */ C4234 f16379;

            {
                this.f16379 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f16379.m9691();
                        break;
                    default:
                        C4234 c4234 = this.f16379;
                        c4234.f16411 = true;
                        c4234.m9691();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f16425 = new Runnable(this) { // from class: ᵢˆ.ᴵʿ

            /* renamed from: ˆʿ, reason: contains not printable characters */
            public final /* synthetic */ C4234 f16379;

            {
                this.f16379 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f16379.m9691();
                        break;
                    default:
                        C4234 c4234 = this.f16379;
                        c4234.f16411 = true;
                        c4234.m9691();
                        break;
                }
            }
        };
        this.f16387 = AbstractC4470.m10200(null);
        this.f16386 = j;
        this.f16416 = j;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static C2431 m9681(C2431 c2431, C2431 c24312, boolean z) {
        String strM6560;
        String strM10177;
        if (c2431 == null) {
            return c24312;
        }
        String str = c24312.f9667;
        int iM6554 = AbstractC2435.m6554(str);
        String str2 = c2431.f9663;
        if (AbstractC4470.m10167(iM6554, str2) == 1) {
            strM10177 = AbstractC4470.m10177(iM6554, str2);
            strM6560 = AbstractC2435.m6560(strM10177);
        } else {
            String strM6548 = AbstractC2435.m6548(str2, str);
            strM6560 = str;
            strM10177 = strM6548;
        }
        C2417 c2417M6541 = c24312.m6541();
        c2417M6541.f9614 = c2431.f9677;
        c2417M6541.f9595 = c2431.f9657;
        c2417M6541.f9611 = AbstractC3980.m9209(c2431.f9673);
        c2417M6541.f9625 = c2431.f9689;
        c2417M6541.f9596 = c2431.f9658;
        c2417M6541.f9615 = c2431.f9678;
        c2417M6541.f9616 = z ? c2431.f9679 : -1;
        c2417M6541.f9610 = z ? c2431.f9672 : -1;
        c2417M6541.f9627 = strM10177;
        if (iM6554 == 2) {
            c2417M6541.f9607 = c2431.f9684;
            c2417M6541.f9620 = c2431.f9687;
            c2417M6541.f9623 = c2431.f9659;
        }
        if (strM6560 != null) {
            c2417M6541.m6523(strM6560);
        }
        int i = c2431.f9662;
        if (i != -1 && iM6554 == 1) {
            c2417M6541.f9624 = i;
        }
        C2401 c2401M6492 = c2431.f9670;
        if (c2401M6492 != null) {
            C2401 c2401 = c24312.f9670;
            if (c2401 != null) {
                c2401M6492 = c2401.m6492(c2401M6492);
            }
            c2417M6541.f9601 = c2401M6492;
        }
        return new C2431(c2417M6541);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static int m9682(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        return this.f16419.m5335();
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿʼ */
    public final void mo4850() {
        this.f16428 = true;
        this.f16387.post(this.f16425);
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ʿˏ */
    public final InterfaceC3178 mo4851(int i, int i2) {
        C4228[] c4228Arr;
        C4228 c4228;
        int i3 = 0;
        while (true) {
            c4228Arr = this.f16399;
            if (i3 >= c4228Arr.length) {
                c4228 = null;
                break;
            }
            if (this.f16402[i3] == i) {
                c4228 = c4228Arr[i3];
                break;
            }
            i3++;
        }
        if (c4228 == null) {
            if (this.f16428) {
                AbstractC4464.m10144("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
                return new C3175();
            }
            int length = c4228Arr.length;
            boolean z = i2 == 1 || i2 == 2;
            C4228 c42282 = new C4228(this.f16395, this.f16431, this.f16401, this.f16423);
            c42282.f16730 = this.f16386;
            if (z) {
                c42282.f16370 = this.f16385;
                c42282.f16731 = true;
            }
            long j = this.f16407;
            if (c42282.f16707 != j) {
                c42282.f16707 = j;
                c42282.f16731 = true;
            }
            if (this.f16390 != null) {
                c42282.f16706 = r4.f16295;
            }
            c42282.f16722 = this;
            int i4 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f16402, i4);
            this.f16402 = iArrCopyOf;
            iArrCopyOf[length] = i;
            C4228[] c4228Arr2 = this.f16399;
            int i5 = AbstractC4470.f17202;
            Object[] objArrCopyOf = Arrays.copyOf(c4228Arr2, c4228Arr2.length + 1);
            objArrCopyOf[c4228Arr2.length] = c42282;
            this.f16399 = (C4228[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f16434, i4);
            this.f16434 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.f16408 |= z;
            this.f16420.add(Integer.valueOf(i2));
            this.f16393.append(i2, length);
            if (m9682(i2) > m9682(this.f16429)) {
                this.f16403 = length;
                this.f16429 = i2;
            }
            this.f16430 = Arrays.copyOf(this.f16430, i4);
            c4228 = c42282;
        }
        if (i2 != 5) {
            return c4228;
        }
        if (this.f16398 == null) {
            this.f16398 = new C4225(c4228, this.f16391);
        }
        return this.f16398;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m9683() throws IOException {
        this.f16419.mo5333();
        C4226 c4226 = this.f16417;
        BehindLiveWindowException behindLiveWindowException = c4226.f16361;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = c4226.f16354;
        if (uri == null || !c4226.f16362) {
            return;
        }
        C3701 c3701 = (C3701) c4226.f16360.f14322.get(uri);
        c3701.f14273.mo5333();
        IOException iOException = c3701.f14280;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m9684() {
        for (C4228 c4228 : this.f16399) {
            c4228.m9764(this.f16400);
        }
        this.f16400 = false;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m9685() {
        return this.f16416 != -9223372036854775807L;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m9686(int i) {
        ArrayList arrayList;
        AbstractC4464.m10132(!this.f16419.m5335());
        int i2 = i;
        loop0: while (true) {
            arrayList = this.f16409;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    C4220 c4220 = (C4220) arrayList.get(i2);
                    for (int i4 = 0; i4 < this.f16399.length; i4++) {
                        if (this.f16399[i4].m9765() > c4220.m9666(i4)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((C4220) arrayList.get(i3)).f16280) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return;
        }
        long j = m9693().f12392;
        C4220 c42202 = (C4220) arrayList.get(i2);
        AbstractC4470.m10175(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.f16399.length; i5++) {
            this.f16399[i5].m9761(c42202.m9666(i5));
        }
        if (arrayList.isEmpty()) {
            this.f16416 = this.f16386;
        } else {
            ((C4220) AbstractC3968.m9180(arrayList)).f16288 = true;
        }
        this.f16396 = false;
        this.f16433.ˆʿ(new C2484(1, this.f16429, null, 3, null, AbstractC4470.m10171(c42202.f12398), AbstractC4470.m10171(j)));
    }

    @Override // p254.InterfaceC3177
    /* renamed from: ˎˑ */
    public final void mo4858(InterfaceC3157 interfaceC3157) {
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4241 m9687(C2433[] c2433Arr) {
        for (int i = 0; i < c2433Arr.length; i++) {
            C2433 c2433 = c2433Arr[i];
            C2431[] c2431Arr = new C2431[c2433.f9699];
            for (int i2 = 0; i2 < c2433.f9699; i2++) {
                C2431 c2431 = c2433.f9700[i2];
                int iMo10235 = this.f16431.mo10235(c2431);
                C2417 c2417M6541 = c2431.m6541();
                c2417M6541.f9603 = iMo10235;
                c2431Arr[i2] = new C2431(c2417M6541);
            }
            c2433Arr[i] = new C2433(c2433.f9696, c2431Arr);
        }
        return new C4241(c2433Arr);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        if (this.f16396) {
            return Long.MIN_VALUE;
        }
        if (m9685()) {
            return this.f16416;
        }
        long jMax = this.f16386;
        C4220 c4220M9693 = m9693();
        if (!c4220M9693.f16285) {
            ArrayList arrayList = this.f16409;
            c4220M9693 = arrayList.size() > 1 ? (C4220) ˉᵎ.ﹶˆ(2, arrayList) : null;
        }
        if (c4220M9693 != null) {
            jMax = Math.max(jMax, c4220M9693.f12392);
        }
        if (this.f16411) {
            for (C4228 c4228 : this.f16399) {
                jMax = Math.max(jMax, c4228.m9767());
            }
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0280 A[PHI: r0
  0x0280: PHI (r0v13 ᴵˎ.ʽﹶ) = (r0v12 ᴵˎ.ʽﹶ), (r0v21 ᴵˎ.ʽﹶ) binds: [B:102:0x024b, B:110:0x026c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo6166(p438.C5077 r58) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372.C4234.mo6166(ﹶﾞ.ˆᵔ):boolean");
    }

    @Override // p374.InterfaceC4283
    /* renamed from: יʻ, reason: contains not printable characters */
    public final void mo9688() {
        this.f16387.post(this.f16405);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9689() {
        AbstractC4464.m10132(this.f16388);
        this.f16413.getClass();
        this.f16422.getClass();
    }

    @Override // p076.InterfaceC1666
    /* renamed from: ٴˎ */
    public final void mo5357() {
        for (C4228 c4228 : this.f16399) {
            c4228.m9757();
        }
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ᐧʻ */
    public final C1654 mo5327(InterfaceC1656 interfaceC1656, long j, long j2, IOException iOException, int i) {
        boolean zMo4442;
        C1654 c1654;
        int i2;
        AbstractC3191 abstractC3191 = (AbstractC3191) interfaceC1656;
        boolean z = abstractC3191 instanceof C4220;
        if (z && !((C4220) abstractC3191).f16287 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).f1342) == 410 || i2 == 404)) {
            return C1659.f6470;
        }
        long j3 = abstractC3191.f12394.f3991;
        Uri uri = abstractC3191.f12394.f3992;
        C4261 c4261 = new C4261(j2);
        AbstractC4470.m10171(abstractC3191.f12398);
        AbstractC4470.m10171(abstractC3191.f12392);
        C1060 c1060 = new C1060(i, iOException);
        C4226 c4226 = this.f16417;
        C1671 c1671 = ﹳﹳ.ˏᵢ(c4226.f16363);
        C2705 c2705 = this.f16412;
        c2705.getClass();
        C1654 c1654M6867 = C2705.m6867(c1671, c1060);
        if (c1654M6867 == null || c1654M6867.f6452 != 2) {
            zMo4442 = false;
        } else {
            InterfaceC1239 interfaceC1239 = c4226.f16363;
            zMo4442 = interfaceC1239.mo4442(interfaceC1239.mo4433(c4226.f16355.m6544(abstractC3191.f12395)), c1654M6867.f6451);
        }
        if (zMo4442) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.f16409;
                AbstractC4464.m10132(((C4220) arrayList.remove(arrayList.size() - 1)) == abstractC3191);
                if (arrayList.isEmpty()) {
                    this.f16416 = this.f16386;
                } else {
                    ((C4220) AbstractC3968.m9180(arrayList)).f16288 = true;
                }
            }
            c1654 = C1659.f6469;
        } else {
            long jM6871 = c2705.m6871(c1060);
            c1654 = jM6871 != -9223372036854775807L ? new C1654(jM6871, false, 0) : C1659.f6471;
        }
        boolean zM5323 = c1654.m5323();
        this.f16433.ˎٴ(c4261, abstractC3191.f12393, this.f16394, abstractC3191.f12395, abstractC3191.f12391, abstractC3191.f12397, abstractC3191.f12398, abstractC3191.f12392, iOException, !zM5323);
        if (!zM5323) {
            this.f16432 = null;
        }
        if (zMo4442) {
            if (this.f16388) {
                this.f16404.ᵎـ(this);
            } else {
                C5101 c5101 = new C5101();
                c5101.f19426 = this.f16386;
                mo6166(new C5077(c5101));
            }
        }
        return c1654;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m9690(C2433[] c2433Arr, int... iArr) {
        this.f16413 = m9687(c2433Arr);
        this.f16422 = new HashSet();
        for (int i : iArr) {
            this.f16422.add(this.f16413.m9704(i));
        }
        this.f16406 = 0;
        this.f16387.post(new RunnableC0246(27, this.f16404));
        this.f16388 = true;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m9691() {
        if (!this.f16415 && this.f16421 == null && this.f16411) {
            for (C4228 c4228 : this.f16399) {
                if (c4228.m9756() == null) {
                    return;
                }
            }
            C4241 c4241 = this.f16413;
            if (c4241 != null) {
                int i = c4241.f16466;
                int[] iArr = new int[i];
                this.f16421 = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        C4228[] c4228Arr = this.f16399;
                        if (i3 < c4228Arr.length) {
                            C2431 c2431M9756 = c4228Arr[i3].m9756();
                            AbstractC4464.m10146(c2431M9756);
                            C2431 c2431 = this.f16413.m9704(i2).f9700[0];
                            String str = c2431.f9667;
                            String str2 = c2431M9756.f9667;
                            int iM6554 = AbstractC2435.m6554(str2);
                            if (iM6554 != 3) {
                                if (iM6554 == AbstractC2435.m6554(str)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            } else if (AbstractC4470.m10194(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || c2431M9756.f9661 == c2431.f9661)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    this.f16421[i2] = i3;
                }
                Iterator it = this.f16424.iterator();
                while (it.hasNext()) {
                    ((C4222) it.next()).m9670();
                }
                return;
            }
            int length = this.f16399.length;
            int i4 = 0;
            int i5 = -2;
            int i6 = -1;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                C2431 c2431M97562 = this.f16399[i4].m9756();
                AbstractC4464.m10146(c2431M97562);
                String str3 = c2431M97562.f9667;
                int i7 = AbstractC2435.m6552(str3) ? 2 : AbstractC2435.m6550(str3) ? 1 : AbstractC2435.m6551(str3) ? 3 : -2;
                if (m9682(i7) > m9682(i5)) {
                    i6 = i4;
                    i5 = i7;
                } else if (i7 == i5 && i6 != -1) {
                    i6 = -1;
                }
                i4++;
            }
            C2433 c2433 = this.f16417.f16355;
            int i8 = c2433.f9699;
            this.f16406 = -1;
            this.f16421 = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                this.f16421[i9] = i9;
            }
            C2433[] c2433Arr = new C2433[length];
            int i10 = 0;
            while (i10 < length) {
                C2431 c2431M97563 = this.f16399[i10].m9756();
                AbstractC4464.m10146(c2431M97563);
                String str4 = this.f16418;
                C2431 c24312 = this.f16426;
                if (i10 == i6) {
                    C2431[] c2431Arr = new C2431[i8];
                    for (int i11 = 0; i11 < i8; i11++) {
                        C2431 c2431M6542 = c2433.f9700[i11];
                        if (i5 == 1 && c24312 != null) {
                            c2431M6542 = c2431M6542.m6542(c24312);
                        }
                        c2431Arr[i11] = i8 == 1 ? c2431M97563.m6542(c2431M6542) : m9681(c2431M6542, c2431M97563, true);
                    }
                    c2433Arr[i10] = new C2433(str4, c2431Arr);
                    this.f16406 = i10;
                } else {
                    if (i5 != 2 || !AbstractC2435.m6550(c2431M97563.f9667)) {
                        c24312 = null;
                    }
                    StringBuilder sbM5409 = AbstractC1702.m5409(str4, ":muxed:");
                    sbM5409.append(i10 < i6 ? i10 : i10 - 1);
                    c2433Arr[i10] = new C2433(sbM5409.toString(), m9681(c24312, c2431M97563, false));
                }
                i10++;
            }
            this.f16413 = m9687(c2433Arr);
            AbstractC4464.m10132(this.f16422 == null);
            this.f16422 = Collections.emptySet();
            this.f16388 = true;
            this.f16404.ﾞˊ();
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m9692(boolean z, long j) {
        C4220 c4220;
        boolean z2;
        this.f16386 = j;
        if (m9685()) {
            this.f16416 = j;
            return true;
        }
        boolean z3 = this.f16417.f16357;
        ArrayList arrayList = this.f16409;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                c4220 = (C4220) arrayList.get(i);
                if (c4220.f12398 == j) {
                    break;
                }
            }
            c4220 = null;
        } else {
            c4220 = null;
        }
        if (this.f16411 && !z) {
            int length = this.f16399.length;
            for (int i2 = 0; i2 < length; i2++) {
                C4228 c4228 = this.f16399[i2];
                if (!(c4220 != null ? c4228.m9758(c4220.m9666(i2)) : c4228.m9776(false, j)) && (this.f16434[i2] || !this.f16408)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.f16416 = j;
        this.f16396 = false;
        arrayList.clear();
        C1659 c1659 = this.f16419;
        if (c1659.m5335()) {
            if (this.f16411) {
                for (C4228 c42282 : this.f16399) {
                    c42282.m9760();
                }
            }
            c1659.m5330();
        } else {
            c1659.f6473 = null;
            m9684();
        }
        return true;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        C1659 c1659 = this.f16419;
        if (c1659.m5332() || m9685()) {
            return;
        }
        boolean zM5335 = c1659.m5335();
        C4226 c4226 = this.f16417;
        List list = this.f16427;
        if (zM5335) {
            this.f16432.getClass();
            if (c4226.f16361 != null ? false : c4226.f16363.mo4443(j, this.f16432, list)) {
                c1659.m5330();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && c4226.m9674((C4220) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            m9686(size);
        }
        int size2 = (c4226.f16361 != null || c4226.f16363.length() < 2) ? list.size() : c4226.f16363.mo4441(j, list);
        if (size2 < this.f16409.size()) {
            m9686(size2);
        }
    }

    @Override // p076.InterfaceC1658
    /* renamed from: ﹳﹳ */
    public final void mo5328(InterfaceC1656 interfaceC1656, long j, long j2, boolean z) {
        AbstractC3191 abstractC3191 = (AbstractC3191) interfaceC1656;
        this.f16432 = null;
        long j3 = abstractC3191.f12396;
        Uri uri = abstractC3191.f12394.f3992;
        C4261 c4261 = new C4261(j2);
        this.f16412.getClass();
        this.f16433.ˋⁱ(c4261, abstractC3191.f12393, this.f16394, abstractC3191.f12395, abstractC3191.f12391, abstractC3191.f12397, abstractC3191.f12398, abstractC3191.f12392);
        if (z) {
            return;
        }
        if (m9685() || this.f16397 == 0) {
            m9684();
        }
        if (this.f16397 > 0) {
            this.f16404.ᵎـ(this);
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        if (m9685()) {
            return this.f16416;
        }
        if (this.f16396) {
            return Long.MIN_VALUE;
        }
        return m9693().f12392;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076.InterfaceC1658
    /* renamed from: ﾞʽ */
    public final void mo5329(InterfaceC1656 interfaceC1656, long j, long j2) {
        AbstractC3191 abstractC3191 = (AbstractC3191) interfaceC1656;
        this.f16432 = null;
        C4226 c4226 = this.f16417;
        if (abstractC3191 instanceof C4219) {
            C4219 c4219 = (C4219) abstractC3191;
            c4226.f16351 = c4219.f16266;
            Uri uri = c4219.f12390.f4004;
            byte[] bArr = c4219.f16265;
            bArr.getClass();
            ʿʼ r2 = c4226.f16349;
            r2.getClass();
            uri.getClass();
        }
        long j3 = abstractC3191.f12396;
        Uri uri2 = abstractC3191.f12394.f3992;
        C4261 c4261 = new C4261(j2);
        this.f16412.getClass();
        this.f16433.ˑי(c4261, abstractC3191.f12393, this.f16394, abstractC3191.f12395, abstractC3191.f12391, abstractC3191.f12397, abstractC3191.f12398, abstractC3191.f12392);
        if (this.f16388) {
            this.f16404.ᵎـ(this);
            return;
        }
        C5101 c5101 = new C5101();
        c5101.f19426 = this.f16386;
        mo6166(new C5077(c5101));
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final C4220 m9693() {
        return (C4220) ˉᵎ.ﹶˆ(1, this.f16409);
    }
}
