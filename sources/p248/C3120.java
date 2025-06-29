package p248;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.AbstractList;
import java.util.ArrayList;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p000.InterfaceC0880;
import p033.C1219;
import p036.InterfaceC1239;
import p076.C1653;
import p076.InterfaceC1662;
import p134.C2085;
import p134.C2088;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p166.C2433;
import p193.C2705;
import p256.C3196;
import p266.C3264;
import p293.C3474;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p374.C4241;
import p374.C4251;
import p374.InterfaceC4254;
import p374.InterfaceC4258;
import p374.InterfaceC4280;
import p374.InterfaceC4294;
import p374.InterfaceC4295;
import p385.C4480;
import p385.InterfaceC4483;
import p438.C5077;
import p438.C5085;
import ʻˋ.ˋˊ;

/* renamed from: יˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3120 implements InterfaceC4294, InterfaceC4258 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public C2088 f12032;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC0880 f12033;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4480 f12034;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C1653 f12035;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC1662 f12036;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C4251 f12037;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public C3196[] f12038;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C4241 f12039;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC4483 f12040;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ˋˊ f12041;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C3264 f12042;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2705 f12043;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ᐧʻ f12044;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public InterfaceC4295 f12045;

    public C3120(C2088 c2088, ˋˊ r6, InterfaceC0880 interfaceC0880, C3264 c3264, InterfaceC4483 interfaceC4483, C4480 c4480, C2705 c2705, ᐧʻ r12, InterfaceC1662 interfaceC1662, C1653 c1653) {
        this.f12032 = c2088;
        this.f12041 = r6;
        this.f12033 = interfaceC0880;
        this.f12036 = interfaceC1662;
        this.f12040 = interfaceC4483;
        this.f12034 = c4480;
        this.f12043 = c2705;
        this.f12044 = r12;
        this.f12035 = c1653;
        this.f12042 = c3264;
        C2433[] c2433Arr = new C2433[c2088.f8250.length];
        int i = 0;
        while (true) {
            C2085[] c2085Arr = c2088.f8250;
            if (i >= c2085Arr.length) {
                this.f12039 = new C4241(c2433Arr);
                this.f12038 = new C3196[0];
                c3264.getClass();
                C3928 c3928 = AbstractC3980.f15360;
                C3932 c3932 = C3932.f15274;
                this.f12037 = new C4251(c3932, c3932);
                return;
            }
            C2431[] c2431Arr = c2085Arr[i].f8214;
            C2431[] c2431Arr2 = new C2431[c2431Arr.length];
            for (int i2 = 0; i2 < c2431Arr.length; i2++) {
                C2431 c2431 = c2431Arr[i2];
                C2417 c2417M6541 = c2431.m6541();
                c2417M6541.f9603 = interfaceC4483.mo10235(c2431);
                C2431 c24312 = new C2431(c2417M6541);
                if (r6.ˆʿ && ((C3474) r6.ᐧˋ).mo8055(c24312)) {
                    C2417 c2417M65412 = c24312.m6541();
                    c2417M65412.f9602 = AbstractC2435.m6559("application/x-media3-cues");
                    c2417M65412.f9599 = ((C3474) r6.ᐧˋ).mo8051(c24312);
                    StringBuilder sb = new StringBuilder();
                    sb.append(c24312.f9667);
                    String str = c24312.f9663;
                    sb.append(str != null ? " ".concat(str) : "");
                    c2417M65412.f9627 = sb.toString();
                    c2417M65412.f9621 = Long.MAX_VALUE;
                    c24312 = new C2431(c2417M65412);
                }
                c2431Arr2[i2] = c24312;
            }
            c2433Arr[i] = new C2433(Integer.toString(i), c2431Arr2);
            i++;
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        return this.f12037.mo6160();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉי */
    public final long mo6161() {
        return -9223372036854775807L;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉⁱ */
    public final long mo6162(InterfaceC1239[] interfaceC1239Arr, boolean[] zArr, InterfaceC4254[] interfaceC4254Arr, boolean[] zArr2, long j) {
        int i;
        InterfaceC1239 interfaceC1239;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < interfaceC1239Arr.length) {
            InterfaceC4254 interfaceC4254 = interfaceC4254Arr[i2];
            if (interfaceC4254 != null) {
                C3196 c3196 = (C3196) interfaceC4254;
                InterfaceC1239 interfaceC12392 = interfaceC1239Arr[i2];
                if (interfaceC12392 == null || !zArr[i2]) {
                    c3196.m7898(null);
                    interfaceC4254Arr[i2] = null;
                } else {
                    ((C3119) c3196.f12414).f12025 = interfaceC12392;
                    arrayList.add(c3196);
                }
            }
            if (interfaceC4254Arr[i2] != null || (interfaceC1239 = interfaceC1239Arr[i2]) == null) {
                i = i2;
            } else {
                int iM9703 = this.f12039.m9703(interfaceC1239.mo4434());
                C2088 c2088 = this.f12032;
                ˋˊ r1 = this.f12041;
                InterfaceC0875 interfaceC0875Mo900 = ((InterfaceC0864) r1.ˎˑ).mo900();
                InterfaceC0880 interfaceC0880 = this.f12033;
                if (interfaceC0880 != null) {
                    interfaceC0875Mo900.mo3678(interfaceC0880);
                }
                i = i2;
                C3196 c31962 = new C3196(this.f12032.f8250[iM9703].f8222, null, null, new C3119(this.f12036, c2088, iM9703, interfaceC1239, interfaceC0875Mo900, (C3474) r1.ᐧˋ, r1.ˆʿ), this, this.f12035, j, this.f12040, this.f12034, this.f12043, this.f12044);
                arrayList.add(c31962);
                interfaceC4254Arr[i] = c31962;
                zArr2[i] = true;
            }
            i2 = i + 1;
        }
        C3196[] c3196Arr = new C3196[arrayList.size()];
        this.f12038 = c3196Arr;
        arrayList.toArray(c3196Arr);
        AbstractList abstractListM9196 = AbstractC3968.m9196(arrayList, new C1219(21));
        this.f12042.getClass();
        this.f12037 = new C4251(arrayList, abstractListM9196);
        return j;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) {
        this.f12045 = interfaceC4295;
        interfaceC4295.mo9719(this);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ */
    public final long mo6164(long j) {
        for (C3196 c3196 : this.f12038) {
            c3196.m7894(j);
        }
        return j;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        return this.f12037.mo6165();
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        return this.f12037.mo6166(c5077);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ */
    public final long mo6167(long j, C5085 c5085) {
        for (C3196 c3196 : this.f12038) {
            if (c3196.f12424 == 2) {
                return c3196.f12414.mo7659(j, c5085);
            }
        }
        return j;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי */
    public final void mo6168() {
        this.f12036.mo5333();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ */
    public final C4241 mo6169() {
        return this.f12039;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ */
    public final void mo6170(long j) {
        for (C3196 c3196 : this.f12038) {
            c3196.m7899(j);
        }
    }

    @Override // p374.InterfaceC4258
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo7664(InterfaceC4280 interfaceC4280) {
        InterfaceC4295 interfaceC4295 = this.f12045;
        interfaceC4295.getClass();
        interfaceC4295.mo7664(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        this.f12037.mo6171(j);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        return this.f12037.mo6173();
    }
}
