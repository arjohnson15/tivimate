package p374;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p036.InterfaceC1239;
import p166.C2417;
import p166.C2431;
import p166.C2433;
import p266.C3264;
import p310.C3581;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p438.C5077;
import p438.C5085;

/* renamed from: ᵢˎ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4255 implements InterfaceC4294, InterfaceC4295 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final IdentityHashMap f16521;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC4294[] f16523;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3264 f16524;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C4251 f16525;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4294[] f16527;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public InterfaceC4295 f16528;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C4241 f16529;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ArrayList f16526 = new ArrayList();

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final HashMap f16522 = new HashMap();

    public C4255(C3264 c3264, long[] jArr, InterfaceC4294... interfaceC4294Arr) {
        this.f16524 = c3264;
        this.f16527 = interfaceC4294Arr;
        c3264.getClass();
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932 = C3932.f15274;
        this.f16525 = new C4251(c3932, c3932);
        this.f16521 = new IdentityHashMap();
        this.f16523 = new InterfaceC4294[0];
        for (int i = 0; i < interfaceC4294Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f16527[i] = new C4259(interfaceC4294Arr[i], j);
            }
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        return this.f16525.mo6160();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉי */
    public final long mo6161() {
        long j = -9223372036854775807L;
        for (InterfaceC4294 interfaceC4294 : this.f16523) {
            long jMo6161 = interfaceC4294.mo6161();
            if (jMo6161 == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC4294.mo6164(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC4294 interfaceC42942 : this.f16523) {
                    if (interfaceC42942 == interfaceC4294) {
                        break;
                    }
                    if (interfaceC42942.mo6164(jMo6161) != jMo6161) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jMo6161;
            } else if (jMo6161 != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉⁱ */
    public final long mo6162(InterfaceC1239[] interfaceC1239Arr, boolean[] zArr, InterfaceC4254[] interfaceC4254Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[interfaceC1239Arr.length];
        int[] iArr2 = new int[interfaceC1239Arr.length];
        int i = 0;
        while (true) {
            int length = interfaceC1239Arr.length;
            identityHashMap = this.f16521;
            if (i >= length) {
                break;
            }
            InterfaceC4254 interfaceC4254 = interfaceC4254Arr[i];
            Integer num = interfaceC4254 == null ? null : (Integer) identityHashMap.get(interfaceC4254);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC1239 interfaceC1239 = interfaceC1239Arr[i];
            if (interfaceC1239 != null) {
                String str = interfaceC1239.mo4434().f9696;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = interfaceC1239Arr.length;
        InterfaceC4254[] interfaceC4254Arr2 = new InterfaceC4254[length2];
        InterfaceC4254[] interfaceC4254Arr3 = new InterfaceC4254[interfaceC1239Arr.length];
        InterfaceC1239[] interfaceC1239Arr2 = new InterfaceC1239[interfaceC1239Arr.length];
        InterfaceC4294[] interfaceC4294Arr = this.f16527;
        ArrayList arrayList2 = new ArrayList(interfaceC4294Arr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < interfaceC4294Arr.length) {
            int i3 = 0;
            while (i3 < interfaceC1239Arr.length) {
                interfaceC4254Arr3[i3] = iArr[i3] == i2 ? interfaceC4254Arr[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC1239 interfaceC12392 = interfaceC1239Arr[i3];
                    interfaceC12392.getClass();
                    arrayList = arrayList2;
                    C2433 c2433 = (C2433) this.f16522.get(interfaceC12392.mo4434());
                    c2433.getClass();
                    interfaceC1239Arr2[i3] = new C4292(interfaceC12392, c2433);
                } else {
                    arrayList = arrayList2;
                    interfaceC1239Arr2[i3] = null;
                }
                i3++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i4 = i2;
            InterfaceC4294[] interfaceC4294Arr2 = interfaceC4294Arr;
            InterfaceC1239[] interfaceC1239Arr3 = interfaceC1239Arr2;
            long jMo6162 = interfaceC4294Arr[i2].mo6162(interfaceC1239Arr2, zArr, interfaceC4254Arr3, zArr2, j2);
            if (i4 == 0) {
                j2 = jMo6162;
            } else if (jMo6162 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC1239Arr.length; i5++) {
                if (iArr2[i5] == i4) {
                    InterfaceC4254 interfaceC42542 = interfaceC4254Arr3[i5];
                    interfaceC42542.getClass();
                    interfaceC4254Arr2[i5] = interfaceC4254Arr3[i5];
                    identityHashMap.put(interfaceC42542, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    AbstractC4464.m10132(interfaceC4254Arr3[i5] == null);
                }
            }
            if (z) {
                arrayList3.add(interfaceC4294Arr2[i4]);
            }
            i2 = i4 + 1;
            arrayList2 = arrayList3;
            interfaceC4294Arr = interfaceC4294Arr2;
            interfaceC1239Arr2 = interfaceC1239Arr3;
        }
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(interfaceC4254Arr2, 0, interfaceC4254Arr, 0, length2);
        this.f16523 = (InterfaceC4294[]) arrayList4.toArray(new InterfaceC4294[0]);
        AbstractList abstractListM9196 = AbstractC3968.m9196(arrayList4, new C3581(18));
        this.f16524.getClass();
        this.f16525 = new C4251(arrayList4, abstractListM9196);
        return j2;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) {
        this.f16528 = interfaceC4295;
        ArrayList arrayList = this.f16526;
        InterfaceC4294[] interfaceC4294Arr = this.f16527;
        Collections.addAll(arrayList, interfaceC4294Arr);
        for (InterfaceC4294 interfaceC4294 : interfaceC4294Arr) {
            interfaceC4294.mo6163(this, j);
        }
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ */
    public final long mo6164(long j) {
        long jMo6164 = this.f16523[0].mo6164(j);
        int i = 1;
        while (true) {
            InterfaceC4294[] interfaceC4294Arr = this.f16523;
            if (i >= interfaceC4294Arr.length) {
                return jMo6164;
            }
            if (interfaceC4294Arr[i].mo6164(jMo6164) != jMo6164) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // p374.InterfaceC4295
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo9719(InterfaceC4294 interfaceC4294) {
        ArrayList arrayList = this.f16526;
        arrayList.remove(interfaceC4294);
        if (arrayList.isEmpty()) {
            InterfaceC4294[] interfaceC4294Arr = this.f16527;
            int i = 0;
            for (InterfaceC4294 interfaceC42942 : interfaceC4294Arr) {
                i += interfaceC42942.mo6169().f16466;
            }
            C2433[] c2433Arr = new C2433[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC4294Arr.length; i3++) {
                C4241 c4241Mo6169 = interfaceC4294Arr[i3].mo6169();
                int i4 = c4241Mo6169.f16466;
                int i5 = 0;
                while (i5 < i4) {
                    C2433 c2433M9704 = c4241Mo6169.m9704(i5);
                    int i6 = c2433M9704.f9699;
                    C2431[] c2431Arr = new C2431[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        C2431 c2431 = c2433M9704.f9700[i7];
                        C2417 c2417M6541 = c2431.m6541();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = c2431.f9677;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c2417M6541.f9614 = sb.toString();
                        c2431Arr[i7] = new C2431(c2417M6541);
                    }
                    C2433 c2433 = new C2433(i3 + ":" + c2433M9704.f9696, c2431Arr);
                    this.f16522.put(c2433, c2433M9704);
                    c2433Arr[i2] = c2433;
                    i5++;
                    i2++;
                }
            }
            this.f16529 = new C4241(c2433Arr);
            InterfaceC4295 interfaceC4295 = this.f16528;
            interfaceC4295.getClass();
            interfaceC4295.mo9719(this);
        }
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        return this.f16525.mo6165();
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        ArrayList arrayList = this.f16526;
        if (arrayList.isEmpty()) {
            return this.f16525.mo6166(c5077);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC4294) arrayList.get(i)).mo6166(c5077);
        }
        return false;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ */
    public final long mo6167(long j, C5085 c5085) {
        InterfaceC4294[] interfaceC4294Arr = this.f16523;
        return (interfaceC4294Arr.length > 0 ? interfaceC4294Arr[0] : this.f16527[0]).mo6167(j, c5085);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי */
    public final void mo6168() {
        for (InterfaceC4294 interfaceC4294 : this.f16527) {
            interfaceC4294.mo6168();
        }
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ */
    public final C4241 mo6169() {
        C4241 c4241 = this.f16529;
        c4241.getClass();
        return c4241;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ */
    public final void mo6170(long j) {
        for (InterfaceC4294 interfaceC4294 : this.f16523) {
            interfaceC4294.mo6170(j);
        }
    }

    @Override // p374.InterfaceC4258
    /* renamed from: ᵎـ */
    public final void mo7664(InterfaceC4280 interfaceC4280) {
        InterfaceC4295 interfaceC4295 = this.f16528;
        interfaceC4295.getClass();
        interfaceC4295.mo7664(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        this.f16525.mo6171(j);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        return this.f16525.mo6173();
    }
}
