package p424;

import android.support.v4.media.session.AbstractC0001;
import android.support.v4.media.session.AbstractC0002;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p000.InterfaceC0880;
import p033.C1215;
import p036.InterfaceC1239;
import p076.C1653;
import p076.InterfaceC1662;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2428;
import p166.C2431;
import p166.C2433;
import p193.C2705;
import p256.C3196;
import p256.C3200;
import p266.C3264;
import p293.C3474;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p356.AbstractC4034;
import p356.C4038;
import p356.C4039;
import p356.C4041;
import p356.C4042;
import p356.C4043;
import p374.C4241;
import p374.C4251;
import p374.C4264;
import p374.C4296;
import p374.InterfaceC4254;
import p374.InterfaceC4258;
import p374.InterfaceC4280;
import p374.InterfaceC4294;
import p374.InterfaceC4295;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4480;
import p385.InterfaceC4483;
import p397.C4607;
import p438.C5077;
import p438.C5085;
import ـˈ.ˉᵎ;
import ﹶˋ.ـﹶ;

/* renamed from: ﹶʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4892 implements InterfaceC4294, InterfaceC4258 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C3264 f18444;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ᐧʻ f18445;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2705 f18446;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f18447;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final InterfaceC1662 f18448;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public List f18449;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC0880 f18450;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C4480 f18451;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C4898 f18453;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C1653 f18454;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC4483 f18455;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18456;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C4241 f18457;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C4251 f18458;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public InterfaceC4295 f18460;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ـﹶ f18461;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ᐧʻ f18462;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final long f18463;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public C4039 f18464;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C4901[] f18465;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static final Pattern f18442 = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final Pattern f18441 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public C3196[] f18443 = new C3196[0];

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C4895[] f18459 = new C4895[0];

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final IdentityHashMap f18452 = new IdentityHashMap();

    public C4892(int i, C4039 c4039, ـﹶ r26, int i2, ᐧʻ r28, InterfaceC0880 interfaceC0880, InterfaceC4483 interfaceC4483, C4480 c4480, C2705 c2705, ᐧʻ r33, long j, InterfaceC1662 interfaceC1662, C1653 c1653, C3264 c3264, C4902 c4902, C1215 c1215) throws NumberFormatException {
        int i3;
        int i4;
        int i5;
        List list;
        boolean[] zArr;
        int i6;
        C2431[] c2431Arr;
        C2431[] c2431ArrM11006;
        C4042 c4042M11005;
        Integer num;
        InterfaceC4483 interfaceC44832 = interfaceC4483;
        this.f18456 = i;
        this.f18464 = c4039;
        this.f18461 = r26;
        this.f18447 = i2;
        this.f18445 = r28;
        this.f18450 = interfaceC0880;
        this.f18455 = interfaceC44832;
        this.f18451 = c4480;
        this.f18446 = c2705;
        this.f18462 = r33;
        this.f18463 = j;
        this.f18448 = interfaceC1662;
        this.f18454 = c1653;
        this.f18444 = c3264;
        this.f18453 = new C4898(c4039, c4902, c1653);
        c3264.getClass();
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932 = C3932.f15274;
        this.f18458 = new C4251(c3932, c3932);
        C4038 c4038M9300 = c4039.m9300(i2);
        List list2 = c4038M9300.f15528;
        this.f18449 = list2;
        List list3 = c4038M9300.f15526;
        int size = list3.size();
        HashMap map = new HashMap(AbstractC3968.m9176(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            map.put(Long.valueOf(((C4041) list3.get(i7)).f15548), Integer.valueOf(i7));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        for (int i8 = 0; i8 < size; i8++) {
            C4041 c4041 = (C4041) list3.get(i8);
            C4042 c4042M110052 = m11005("http://dashif.org/guidelines/trickmode", c4041.f15546);
            List list4 = c4041.f15549;
            c4042M110052 = c4042M110052 == null ? m11005("http://dashif.org/guidelines/trickmode", list4) : c4042M110052;
            int iIntValue = (c4042M110052 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(c4042M110052.f15551)))) == null) ? i8 : num.intValue();
            if (iIntValue == i8 && (c4042M11005 = m11005("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i9 = AbstractC4470.f17202;
                for (String str : c4042M11005.f15551.split(",", -1)) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i8) {
                List list5 = (List) sparseArray.get(i8);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i8, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] iArrM3 = AbstractC0001.m3((Collection) arrayList.get(i10));
            iArr[i10] = iArrM3;
            Arrays.sort(iArrM3);
        }
        boolean[] zArr2 = new boolean[size2];
        C2431[][] c2431Arr2 = new C2431[size2][];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr2 = iArr[i11];
            int length = iArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                List list7 = ((C4041) list3.get(iArr2[i13])).f15547;
                int[] iArr3 = iArr2;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (!((AbstractC4034) list7.get(i14)).f15519.isEmpty()) {
                        zArr2[i11] = true;
                        i12++;
                        break;
                    }
                }
                i13++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i11];
            int length2 = iArr4.length;
            int i15 = 0;
            while (i15 < length2) {
                int i16 = iArr4[i15];
                C4041 c40412 = (C4041) list3.get(i16);
                List list8 = ((C4041) list3.get(i16)).f15550;
                int[] iArr5 = iArr4;
                int i17 = length2;
                int i18 = 0;
                while (i18 < list8.size()) {
                    C4042 c4042 = (C4042) list8.get(i18);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c4042.f15553)) {
                        C2417 c2417 = new C2417();
                        c2417.f9602 = AbstractC2435.m6559("application/cea-608");
                        c2417.f9614 = AbstractC0002.m42(new StringBuilder(), c40412.f15548, ":cea608");
                        c2431ArrM11006 = m11006(c4042, f18442, new C2431(c2417));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(c4042.f15553)) {
                        C2417 c24172 = new C2417();
                        c24172.f9602 = AbstractC2435.m6559("application/cea-708");
                        c24172.f9614 = AbstractC0002.m42(new StringBuilder(), c40412.f15548, ":cea708");
                        c2431ArrM11006 = m11006(c4042, f18441, new C2431(c24172));
                    } else {
                        i18++;
                        list8 = list9;
                    }
                    c2431Arr = c2431ArrM11006;
                    i6 = 1;
                }
                i15++;
                iArr4 = iArr5;
                length2 = i17;
            }
            i6 = 1;
            c2431Arr = new C2431[0];
            c2431Arr2[i11] = c2431Arr;
            if (c2431Arr.length != 0) {
                i12 += i6;
            }
            i11 += i6;
        }
        int size3 = list2.size() + i12 + size2;
        C2433[] c2433Arr = new C2433[size3];
        C4901[] c4901Arr = new C4901[size3];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr6 = iArr[i19];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr6.length;
            int i21 = size2;
            int i22 = 0;
            while (i22 < length3) {
                arrayList3.addAll(((C4041) list3.get(iArr6[i22])).f15547);
                i22++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            C2431[] c2431Arr3 = new C2431[size4];
            int i23 = 0;
            while (i23 < size4) {
                int i24 = size4;
                C2431 c2431 = ((AbstractC4034) arrayList3.get(i23)).f15520;
                ArrayList arrayList4 = arrayList3;
                C2417 c2417M6541 = c2431.m6541();
                c2417M6541.f9603 = interfaceC44832.mo10235(c2431);
                c2431Arr3[i23] = new C2431(c2417M6541);
                i23++;
                size4 = i24;
                arrayList3 = arrayList4;
            }
            C4041 c40413 = (C4041) list3.get(iArr6[0]);
            long j2 = c40413.f15548;
            String string = j2 != -1 ? Long.toString(j2) : ˉᵎ.ˉⁱ("unset:", i19);
            int i25 = i20 + 1;
            if (zArr2[i19]) {
                i3 = i20 + 2;
                i4 = i25;
            } else {
                i3 = i25;
                i4 = -1;
            }
            if (c2431Arr2[i19].length != 0) {
                i5 = i3;
                i3++;
            } else {
                i5 = -1;
            }
            m11004(r28, c2431Arr3);
            List list10 = list3;
            c2433Arr[i20] = new C2433(string, c2431Arr3);
            C3928 c39282 = AbstractC3980.f15360;
            C3932 c39322 = C3932.f15274;
            c4901Arr[i20] = new C4901(c40413.f15545, 0, iArr6, i20, i4, i5, -1, c39322);
            int i26 = i4;
            int i27 = -1;
            if (i26 != -1) {
                String str2 = ᵎﹳ.ᐧʻ.ˉⁱ(string, ":emsg");
                C2417 c24173 = new C2417();
                c24173.f9614 = str2;
                c24173.f9602 = AbstractC2435.m6559("application/x-emsg");
                list = list2;
                zArr = zArr2;
                c2433Arr[i26] = new C2433(str2, new C2431(c24173));
                c4901Arr[i26] = new C4901(5, 1, iArr6, i20, -1, -1, -1, c39322);
                i27 = -1;
            } else {
                list = list2;
                zArr = zArr2;
            }
            if (i5 != i27) {
                String str3 = ᵎﹳ.ᐧʻ.ˉⁱ(string, ":cc");
                c4901Arr[i5] = new C4901(3, 1, iArr6, i20, -1, -1, -1, AbstractC3980.m9210(c2431Arr2[i19]));
                m11004(r28, c2431Arr2[i19]);
                c2433Arr[i5] = new C2433(str3, c2431Arr2[i19]);
            }
            i19++;
            size2 = i21;
            interfaceC44832 = interfaceC4483;
            iArr = iArr7;
            i20 = i3;
            list3 = list10;
            zArr2 = zArr;
            list2 = list;
        }
        List list11 = list2;
        int i28 = 0;
        while (i28 < list11.size()) {
            List list12 = list11;
            C4043 c4043 = (C4043) list12.get(i28);
            C2417 c24174 = new C2417();
            c24174.f9614 = c4043.m9304();
            c24174.f9602 = AbstractC2435.m6559("application/x-emsg");
            c2433Arr[i20] = new C2433(c4043.m9304() + ":" + i28, new C2431(c24174));
            C3928 c39283 = AbstractC3980.f15360;
            c4901Arr[i20] = new C4901(5, 2, new int[0], -1, -1, -1, i28, C3932.f15274);
            i28++;
            list11 = list12;
            i20++;
        }
        Pair pairCreate = Pair.create(new C4241(c2433Arr), c4901Arr);
        this.f18457 = (C4241) pairCreate.first;
        this.f18465 = (C4901[]) pairCreate.second;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m11004(ᐧʻ r5, C2431[] c2431Arr) {
        for (int i = 0; i < c2431Arr.length; i++) {
            C2431 c2431 = c2431Arr[i];
            C2428 c2428 = (C2428) r5.ᐧˋ;
            if (c2428.f9650 && ((C3474) c2428.f9649).mo8055(c2431)) {
                C2417 c2417M6541 = c2431.m6541();
                c2417M6541.f9602 = AbstractC2435.m6559("application/x-media3-cues");
                c2417M6541.f9599 = ((C3474) c2428.f9649).mo8051(c2431);
                StringBuilder sb = new StringBuilder();
                sb.append(c2431.f9667);
                String str = c2431.f9663;
                sb.append(str != null ? " ".concat(str) : "");
                c2417M6541.f9627 = sb.toString();
                c2417M6541.f9621 = Long.MAX_VALUE;
                c2431 = new C2431(c2417M6541);
            }
            c2431Arr[i] = c2431;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4042 m11005(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C4042 c4042 = (C4042) list.get(i);
            if (str.equals(c4042.f15553)) {
                return c4042;
            }
        }
        return null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C2431[] m11006(C4042 c4042, Pattern pattern, C2431 c2431) throws NumberFormatException {
        String str = c4042.f15551;
        if (str == null) {
            return new C2431[]{c2431};
        }
        int i = AbstractC4470.f17202;
        String[] strArrSplit = str.split(";", -1);
        C2431[] c2431Arr = new C2431[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new C2431[]{c2431};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            C2417 c2417M6541 = c2431.m6541();
            c2417M6541.f9614 = c2431.f9677 + ":" + i3;
            c2417M6541.f9617 = i3;
            c2417M6541.f9625 = matcher.group(2);
            c2431Arr[i2] = new C2431(c2417M6541);
        }
        return c2431Arr;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        return this.f18458.mo6160();
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
        boolean z;
        int[] iArr;
        int i2;
        int[] iArr2;
        InterfaceC4254[] interfaceC4254Arr2;
        C2433 c2433M9704;
        int i3;
        int i4;
        C4904 c4904;
        boolean z2;
        InterfaceC1239[] interfaceC1239Arr2 = interfaceC1239Arr;
        InterfaceC4254[] interfaceC4254Arr3 = interfaceC4254Arr;
        int[] iArr3 = new int[interfaceC1239Arr2.length];
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= interfaceC1239Arr2.length) {
                break;
            }
            InterfaceC1239 interfaceC1239 = interfaceC1239Arr2[i5];
            if (interfaceC1239 != null) {
                iArr3[i5] = this.f18457.m9703(interfaceC1239.mo4434());
            } else {
                iArr3[i5] = -1;
            }
            i5++;
        }
        for (int i6 = 0; i6 < interfaceC1239Arr2.length; i6++) {
            if (interfaceC1239Arr2[i6] == null || !zArr[i6]) {
                InterfaceC4254 interfaceC4254 = interfaceC4254Arr3[i6];
                if (interfaceC4254 instanceof C3196) {
                    ((C3196) interfaceC4254).m7898(this);
                } else if (interfaceC4254 instanceof C3200) {
                    ((C3200) interfaceC4254).m7904();
                }
                interfaceC4254Arr3[i6] = null;
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= interfaceC1239Arr2.length) {
                break;
            }
            InterfaceC4254 interfaceC42542 = interfaceC4254Arr3[i7];
            if ((interfaceC42542 instanceof C4264) || (interfaceC42542 instanceof C3200)) {
                int iM11007 = m11007(iArr3, i7);
                if (iM11007 == -1) {
                    z2 = interfaceC4254Arr3[i7] instanceof C4264;
                } else {
                    InterfaceC4254 interfaceC42543 = interfaceC4254Arr3[i7];
                    z2 = (interfaceC42543 instanceof C3200) && ((C3200) interfaceC42543).f12448 == interfaceC4254Arr3[iM11007];
                }
                if (!z2) {
                    InterfaceC4254 interfaceC42544 = interfaceC4254Arr3[i7];
                    if (interfaceC42544 instanceof C3200) {
                        ((C3200) interfaceC42544).m7904();
                    }
                    interfaceC4254Arr3[i7] = null;
                }
            }
            i7++;
        }
        int i8 = 0;
        while (i8 < interfaceC1239Arr2.length) {
            InterfaceC1239 interfaceC12392 = interfaceC1239Arr2[i8];
            if (interfaceC12392 == null) {
                i2 = i8;
                iArr2 = iArr3;
                interfaceC4254Arr2 = interfaceC4254Arr3;
            } else {
                InterfaceC4254 interfaceC42545 = interfaceC4254Arr3[i8];
                if (interfaceC42545 == null) {
                    zArr2[i8] = z;
                    C4901 c4901 = this.f18465[iArr3[i8]];
                    int i9 = c4901.f18556;
                    if (i9 == 0) {
                        int i10 = c4901.f18558;
                        boolean z3 = i10 != i;
                        if (z3) {
                            c2433M9704 = this.f18457.m9704(i10);
                            i3 = 1;
                        } else {
                            c2433M9704 = null;
                            i3 = 0;
                        }
                        int i11 = c4901.f18559;
                        C3932 c3932M9204 = i11 != i ? this.f18465[i11].f18555 : AbstractC3980.m9204();
                        int size = c3932M9204.size() + i3;
                        C2431[] c2431Arr = new C2431[size];
                        int[] iArr4 = new int[size];
                        if (z3) {
                            c2431Arr[0] = c2433M9704.m6545();
                            iArr4[0] = 5;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < c3932M9204.size(); i12++) {
                            C2431 c2431 = (C2431) c3932M9204.get(i12);
                            c2431Arr[i4] = c2431;
                            iArr4[i4] = 3;
                            arrayList.add(c2431);
                            i4++;
                        }
                        if (this.f18464.f15540 && z3) {
                            C4898 c4898 = this.f18453;
                            c4904 = new C4904(c4898, c4898.f18513);
                        } else {
                            c4904 = null;
                        }
                        ᐧʻ r3 = this.f18445;
                        InterfaceC1662 interfaceC1662 = this.f18448;
                        C4039 c4039 = this.f18464;
                        int i13 = i8;
                        ـﹶ r9 = this.f18461;
                        int[] iArr5 = iArr3;
                        int i14 = this.f18447;
                        int[] iArr6 = c4901.f18557;
                        int i15 = c4901.f18553;
                        long j2 = this.f18463;
                        InterfaceC0880 interfaceC0880 = this.f18450;
                        InterfaceC0875 interfaceC0875Mo900 = ((InterfaceC0864) r3.ˎˑ).mo900();
                        if (interfaceC0880 != null) {
                            interfaceC0875Mo900.mo3678(interfaceC0880);
                        }
                        i2 = i13;
                        C4904 c49042 = c4904;
                        iArr2 = iArr5;
                        C3196 c3196 = new C3196(c4901.f18553, iArr4, c2431Arr, new C4897((C2428) r3.ᐧˋ, interfaceC1662, c4039, r9, i14, iArr6, interfaceC12392, i15, interfaceC0875Mo900, j2, r3.ˆʿ, z3, arrayList, c4904), this, this.f18454, j, this.f18455, this.f18451, this.f18446, this.f18462);
                        synchronized (this) {
                            this.f18452.put(c3196, c49042);
                        }
                        interfaceC4254Arr2 = interfaceC4254Arr;
                        interfaceC4254Arr2[i2] = c3196;
                    } else {
                        i2 = i8;
                        iArr2 = iArr3;
                        interfaceC4254Arr2 = interfaceC4254Arr3;
                        if (i9 == 2) {
                            interfaceC4254Arr2[i2] = new C4895((C4043) this.f18449.get(c4901.f18560), interfaceC12392.mo4434().m6545(), this.f18464.f15540);
                        }
                    }
                } else {
                    i2 = i8;
                    iArr2 = iArr3;
                    interfaceC4254Arr2 = interfaceC4254Arr3;
                    if (interfaceC42545 instanceof C3196) {
                        ((C4897) ((C3196) interfaceC42545).f12414).f18495 = interfaceC12392;
                    }
                }
            }
            i8 = i2 + 1;
            interfaceC4254Arr3 = interfaceC4254Arr2;
            iArr3 = iArr2;
            z = true;
            i = -1;
            interfaceC1239Arr2 = interfaceC1239Arr;
        }
        int[] iArr7 = iArr3;
        InterfaceC4254[] interfaceC4254Arr4 = interfaceC4254Arr3;
        int i16 = 0;
        while (i16 < interfaceC1239Arr.length) {
            if (interfaceC4254Arr4[i16] != null || interfaceC1239Arr[i16] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C4901 c49012 = this.f18465[iArr[i16]];
                if (c49012.f18556 == 1) {
                    int iM110072 = m11007(iArr, i16);
                    if (iM110072 == -1) {
                        interfaceC4254Arr4[i16] = new C4264();
                    } else {
                        C3196 c31962 = (C3196) interfaceC4254Arr4[iM110072];
                        int i17 = c49012.f18553;
                        int i18 = 0;
                        while (true) {
                            C4296[] c4296Arr = c31962.f12420;
                            if (i18 >= c4296Arr.length) {
                                throw new IllegalStateException();
                            }
                            if (c31962.f12413[i18] == i17) {
                                boolean[] zArr3 = c31962.f12423;
                                AbstractC4464.m10132(!zArr3[i18]);
                                zArr3[i18] = true;
                                c4296Arr[i18].m9776(true, j);
                                interfaceC4254Arr4[i16] = new C3200(c31962, c31962, c4296Arr[i18], i18);
                                break;
                            }
                            i18++;
                        }
                    }
                    i16++;
                    iArr7 = iArr;
                }
            }
            i16++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC4254 interfaceC42546 : interfaceC4254Arr4) {
            if (interfaceC42546 instanceof C3196) {
                arrayList2.add((C3196) interfaceC42546);
            } else if (interfaceC42546 instanceof C4895) {
                arrayList3.add((C4895) interfaceC42546);
            }
        }
        C3196[] c3196Arr = new C3196[arrayList2.size()];
        this.f18443 = c3196Arr;
        arrayList2.toArray(c3196Arr);
        C4895[] c4895Arr = new C4895[arrayList3.size()];
        this.f18459 = c4895Arr;
        arrayList3.toArray(c4895Arr);
        C3264 c3264 = this.f18444;
        AbstractList abstractListM9196 = AbstractC3968.m9196(arrayList2, new C4607(2));
        c3264.getClass();
        this.f18458 = new C4251(arrayList2, abstractListM9196);
        return j;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) {
        this.f18460 = interfaceC4295;
        interfaceC4295.mo9719(this);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ */
    public final long mo6164(long j) {
        for (C3196 c3196 : this.f18443) {
            c3196.m7894(j);
        }
        for (C4895 c4895 : this.f18459) {
            int iM10163 = AbstractC4470.m10163(c4895.f18486, j, true);
            c4895.f18490 = iM10163;
            c4895.f18485 = (c4895.f18487 && iM10163 == c4895.f18486.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        return this.f18458.mo6165();
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        return this.f18458.mo6166(c5077);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ */
    public final long mo6167(long j, C5085 c5085) {
        for (C3196 c3196 : this.f18443) {
            if (c3196.f12424 == 2) {
                return c3196.f12414.mo7659(j, c5085);
            }
        }
        return j;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי */
    public final void mo6168() {
        this.f18448.mo5333();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ */
    public final C4241 mo6169() {
        return this.f18457;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ */
    public final void mo6170(long j) {
        for (C3196 c3196 : this.f18443) {
            c3196.m7899(j);
        }
    }

    @Override // p374.InterfaceC4258
    /* renamed from: ᵎـ */
    public final void mo7664(InterfaceC4280 interfaceC4280) {
        this.f18460.mo7664(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        this.f18458.mo6171(j);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m11007(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        C4901[] c4901Arr = this.f18465;
        int i3 = c4901Arr[i2].f18554;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && c4901Arr[i5].f18556 == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        return this.f18458.mo6173();
    }
}
