package p401;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p061.C1410;
import p112.C1808;
import p334.C3789;
import p353.AbstractC4010;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.InterfaceC4462;
import p397.C4598;
import p397.C4601;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ⁱﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4619 implements InterfaceC4602 {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final Pattern f17668 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1410 f17669;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public LinkedHashMap f17672;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f17673;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public float f17670 = -3.4028235E38f;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public float f17674 = -3.4028235E38f;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4457 f17671 = new C4457();

    public C4619(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f17673 = false;
            this.f17669 = null;
            return;
        }
        this.f17673 = true;
        String strM10188 = AbstractC4470.m10188((byte[]) list.get(0));
        AbstractC4464.m10142(strM10188.startsWith("Format:"));
        C1410 c1410M4888 = C1410.m4888(strM10188);
        c1410M4888.getClass();
        this.f17669 = c1410M4888;
        m10506(new C4457((byte[]) list.get(1)), AbstractC4010.f15450);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m10504(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static long m10505(String str) {
        Matcher matcher = f17668.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = AbstractC4470.f17202;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏʾ */
    public final int mo2490() {
        return 1;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏᵢ */
    public final /* synthetic */ InterfaceC4599 mo2492(byte[] bArr, int i, int i2) {
        return ᐧʻ.ʽᐧ(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10506(p383.C4457 r38, java.nio.charset.Charset r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p401.C4619.m10506(ᵢᵢ.ˋⁱ, java.nio.charset.Charset):void");
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ـﹶ */
    public final /* synthetic */ void mo2495() {
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo2506(byte[] bArr, C4601 c4601, C4125 c4125) {
        ᐧʻ.ـﹶ(this, bArr, c4601, c4125);
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹶˆ */
    public final void mo2508(byte[] bArr, int i, int i2, C4601 c4601, InterfaceC4462 interfaceC4462) throws NumberFormatException {
        Charset charset;
        C1410 c1410;
        C4457 c4457;
        int i3;
        int i4;
        int i5;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i6;
        PointF pointF;
        int i7;
        int i8;
        float f2;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        float f6;
        int i11;
        int i12;
        Integer num;
        int iM10509;
        int i13;
        C4619 c4619 = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4457 c44572 = c4619.f17671;
        c44572.m10081(i + i2, bArr);
        c44572.m10108(i);
        Charset charsetM10088 = c44572.m10088();
        if (charsetM10088 == null) {
            charsetM10088 = AbstractC4010.f15450;
        }
        boolean z = c4619.f17673;
        if (!z) {
            c4619.m10506(c44572, charsetM10088);
        }
        C1410 c1410M4888 = z ? c4619.f17669 : null;
        while (true) {
            String strM10109 = c44572.m10109(charsetM10088);
            if (strM10109 == null) {
                long j = c4601.f17606;
                ArrayList arrayList3 = (j == -9223372036854775807L || !c4601.f17605) ? null : new ArrayList();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    List list = (List) arrayList.get(i14);
                    if (!list.isEmpty() || i14 == 0) {
                        if (i14 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i14)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i14 + 1)).longValue() - ((Long) arrayList2.get(i14)).longValue();
                        if (j == -9223372036854775807L || jLongValue >= j) {
                            interfaceC4462.mo4264(new C4598(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C4598(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC4462.mo4264((C4598) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM10109.startsWith("Format:")) {
                c1410M4888 = C1410.m4888(strM10109);
            } else if (strM10109.startsWith("Dialogue:")) {
                if (c1410M4888 == null) {
                    AbstractC4464.m10144("SsaParser", "Skipping dialogue line before complete format: ".concat(strM10109));
                } else {
                    AbstractC4464.m10142(strM10109.startsWith("Dialogue:"));
                    String strSubstring = strM10109.substring(9);
                    int i15 = c1410M4888.f5761;
                    String[] strArrSplit = strSubstring.split(",", i15);
                    if (strArrSplit.length != i15) {
                        AbstractC4464.m10144("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM10109));
                    } else {
                        C4457 c44573 = c44572;
                        long jM10505 = m10505(strArrSplit[c1410M4888.f5763]);
                        if (jM10505 == -9223372036854775807L) {
                            AbstractC4464.m10144("SsaParser", "Skipping invalid timing: ".concat(strM10109));
                        } else {
                            long jM105052 = m10505(strArrSplit[c1410M4888.f5760]);
                            if (jM105052 == -9223372036854775807L) {
                                AbstractC4464.m10144("SsaParser", "Skipping invalid timing: ".concat(strM10109));
                            } else {
                                LinkedHashMap linkedHashMap = c4619.f17672;
                                charset = charsetM10088;
                                C4620 c4620 = (linkedHashMap == null || (i13 = c1410M4888.f5762) == -1) ? null : (C4620) linkedHashMap.get(strArrSplit[i13].trim());
                                String str = strArrSplit[c1410M4888.f5764];
                                Matcher matcher = C4618.f17666.matcher(str);
                                int i16 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    C1410 c14102 = c1410M4888;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFM10503 = C4618.m10503(strGroup);
                                        if (pointFM10503 != null) {
                                            pointF2 = pointFM10503;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = C4618.f17667.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iM10509 = C4620.m10509(strGroup2);
                                        } else {
                                            iM10509 = -1;
                                        }
                                        if (iM10509 != -1) {
                                            i16 = iM10509;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    c1410M4888 = c14102;
                                }
                                c1410 = c1410M4888;
                                String strReplace = C4618.f17666.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f7 = c4619.f17670;
                                float f8 = c4619.f17674;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (c4620 != null) {
                                    Integer num2 = c4620.f17679;
                                    if (num2 != null) {
                                        c4457 = c44573;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        c4457 = c44573;
                                    }
                                    if (c4620.f17677 == 3 && (num = c4620.f17683) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f9 = c4620.f17676;
                                    if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                        i9 = Integer.MIN_VALUE;
                                        f5 = -3.4028235E38f;
                                    } else {
                                        f5 = f9 / f8;
                                        i9 = 1;
                                    }
                                    boolean z2 = c4620.f17682;
                                    boolean z3 = c4620.f17681;
                                    if (z3 && z2) {
                                        i10 = i9;
                                        f6 = f5;
                                        i11 = 0;
                                        i12 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i10 = i9;
                                        f6 = f5;
                                        i11 = 0;
                                        i12 = 33;
                                        if (z3) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z2) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (c4620.f17678) {
                                        spannableString.setSpan(new UnderlineSpan(), i11, spannableString.length(), i12);
                                    }
                                    if (c4620.f17684) {
                                        spannableString.setSpan(new StrikethroughSpan(), i11, spannableString.length(), i12);
                                    }
                                    i3 = i16;
                                    f = f6;
                                    i5 = i10;
                                    i4 = -1;
                                } else {
                                    c4457 = c44573;
                                    i3 = i16;
                                    i4 = -1;
                                    i5 = Integer.MIN_VALUE;
                                    f = -3.4028235E38f;
                                }
                                if (i3 != i4) {
                                    i4 = i3;
                                } else if (c4620 != null) {
                                    i4 = c4620.f17675;
                                }
                                switch (i4) {
                                    case 0:
                                    default:
                                        ᵎˏ.ʿˏ(i4, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        alignment2 = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                }
                                int i17 = Integer.MIN_VALUE;
                                switch (i4) {
                                    case 0:
                                    default:
                                        ᵎˏ.ʿˏ(i4, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        i6 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                                        i6 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i6 = 1;
                                        break;
                                    case 3:
                                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case 9:
                                        i6 = 2;
                                        break;
                                }
                                switch (i4) {
                                    case 0:
                                    default:
                                        ᵎˏ.ʿˏ(i4, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i17 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                                        pointF = pointF2;
                                        i17 = 1;
                                        break;
                                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case 8:
                                    case 9:
                                        pointF = pointF2;
                                        i17 = 0;
                                        break;
                                }
                                if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                    float f10 = 0.95f;
                                    if (i6 != 0) {
                                        i7 = 1;
                                        if (i6 != 1) {
                                            i8 = 2;
                                            f2 = i6 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i8 = 2;
                                            f2 = 0.5f;
                                        }
                                    } else {
                                        i7 = 1;
                                        i8 = 2;
                                        f2 = 0.05f;
                                    }
                                    if (i17 == 0) {
                                        f10 = 0.05f;
                                    } else if (i17 == i7) {
                                        f10 = 0.5f;
                                    } else if (i17 != i8) {
                                        f10 = -3.4028235E38f;
                                    }
                                    f3 = f10;
                                    f4 = f2;
                                } else {
                                    float f11 = pointF.x / f7;
                                    f3 = pointF.y / f8;
                                    f4 = f11;
                                }
                                C1808 c1808 = new C1808(spannableString, alignment2, null, null, f3, 0, i17, f4, i6, i5, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iM10504 = m10504(jM105052, arrayList2, arrayList);
                                for (int iM105042 = m10504(jM10505, arrayList2, arrayList); iM105042 < iM10504; iM105042++) {
                                    ((List) arrayList.get(iM105042)).add(c1808);
                                }
                                c4619 = this;
                                c1410M4888 = c1410;
                                charsetM10088 = charset;
                                c44572 = c4457;
                            }
                        }
                        charset = charsetM10088;
                        c1410 = c1410M4888;
                        c4457 = c44573;
                        c4619 = this;
                        c1410M4888 = c1410;
                        charsetM10088 = charset;
                        c44572 = c4457;
                    }
                }
                charset = charsetM10088;
                c1410 = c1410M4888;
                c4457 = c44572;
                c4619 = this;
                c1410M4888 = c1410;
                charsetM10088 = charset;
                c44572 = c4457;
            } else {
                charset = charsetM10088;
                c1410 = c1410M4888;
                c4457 = c44572;
                c4619 = this;
                c1410M4888 = c1410;
                charsetM10088 = charset;
                c44572 = c4457;
            }
        }
    }
}
