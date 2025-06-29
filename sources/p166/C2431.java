package p166;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import p345.AbstractC3980;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p447.AbstractC5179;
import ˆʽ.ᵎˏ;

/* renamed from: ˊﹶ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2431 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f9657;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f9658;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final float f9659;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f9660;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f9661;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int f9662;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final String f9663;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String f9664;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f9665;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final int f9666;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final String f9667;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f9668;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final long f9669;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C2401 f9670;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int f9671;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f9672;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC3980 f9673;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final List f9674;

    /* renamed from: יʻ, reason: contains not printable characters */
    public final int f9675;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int f9676;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f9677;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f9678;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f9679;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f9680;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f9681;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f9682;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int f9683;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final int f9684;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C2405 f9685;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f9686;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int f9687;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final C2415 f9688;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f9689;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f9690;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f9691;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final byte[] f9692;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final float f9693;

    static {
        new C2417().m6521();
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
        AbstractC4470.m10164(3);
        AbstractC4470.m10164(4);
        ᵎˏ.ﹳˎ(5, 6, 7, 8, 9);
        ᵎˏ.ﹳˎ(10, 11, 12, 13, 14);
        ᵎˏ.ﹳˎ(15, 16, 17, 18, 19);
        ᵎˏ.ﹳˎ(20, 21, 22, 23, 24);
        ᵎˏ.ﹳˎ(25, 26, 27, 28, 29);
        AbstractC4470.m10164(30);
        AbstractC4470.m10164(31);
        AbstractC4470.m10164(32);
    }

    public C2431(C2417 c2417) throws MissingResourceException {
        boolean z;
        String str;
        this.f9677 = c2417.f9614;
        String strM10161 = AbstractC4470.m10161(c2417.f9625);
        this.f9689 = strM10161;
        if (c2417.f9611.isEmpty() && c2417.f9595 != null) {
            this.f9673 = AbstractC3980.m9207(new C2411(strM10161, c2417.f9595));
            this.f9657 = c2417.f9595;
        } else if (!c2417.f9611.isEmpty() && c2417.f9595 == null) {
            AbstractC3980 abstractC3980 = c2417.f9611;
            this.f9673 = abstractC3980;
            Iterator it = abstractC3980.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C2411) abstractC3980.get(0)).f9572;
                    break;
                }
                C2411 c2411 = (C2411) it.next();
                if (TextUtils.equals(c2411.f9573, strM10161)) {
                    str = c2411.f9572;
                    break;
                }
            }
            this.f9657 = str;
        } else if (c2417.f9611.isEmpty() && c2417.f9595 == null) {
            z = true;
            AbstractC4464.m10132(z);
            this.f9673 = c2417.f9611;
            this.f9657 = c2417.f9595;
        } else {
            for (int i = 0; i < c2417.f9611.size(); i++) {
                if (((C2411) c2417.f9611.get(i)).f9572.equals(c2417.f9595)) {
                    z = true;
                    break;
                }
            }
            z = false;
            AbstractC4464.m10132(z);
            this.f9673 = c2417.f9611;
            this.f9657 = c2417.f9595;
        }
        this.f9658 = c2417.f9596;
        this.f9678 = c2417.f9615;
        int i2 = c2417.f9616;
        this.f9679 = i2;
        int i3 = c2417.f9610;
        this.f9672 = i3;
        this.f9691 = i3 != -1 ? i3 : i2;
        this.f9663 = c2417.f9627;
        this.f9670 = c2417.f9601;
        this.f9664 = c2417.f9608;
        this.f9667 = c2417.f9602;
        this.f9683 = c2417.f9605;
        this.f9671 = c2417.f9619;
        List list = c2417.f9609;
        this.f9674 = list == null ? Collections.emptyList() : list;
        C2405 c2405 = c2417.f9612;
        this.f9685 = c2405;
        this.f9669 = c2417.f9621;
        this.f9684 = c2417.f9607;
        this.f9687 = c2417.f9620;
        this.f9659 = c2417.f9623;
        int i4 = c2417.f9597;
        this.f9666 = i4 == -1 ? 0 : i4;
        float f = c2417.f9604;
        this.f9693 = f == -1.0f ? 1.0f : f;
        this.f9692 = c2417.f9629;
        this.f9675 = c2417.f9628;
        this.f9688 = c2417.f9613;
        this.f9662 = c2417.f9624;
        this.f9681 = c2417.f9600;
        this.f9660 = c2417.f9618;
        int i5 = c2417.f9598;
        this.f9668 = i5 == -1 ? 0 : i5;
        int i6 = c2417.f9606;
        this.f9680 = i6 != -1 ? i6 : 0;
        this.f9661 = c2417.f9617;
        this.f9686 = c2417.f9599;
        this.f9690 = c2417.f9622;
        this.f9665 = c2417.f9626;
        int i7 = c2417.f9603;
        if (i7 != 0 || c2405 == null) {
            this.f9676 = i7;
        } else {
            this.f9676 = 1;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2431.class != obj.getClass()) {
            return false;
        }
        C2431 c2431 = (C2431) obj;
        int i2 = this.f9682;
        return (i2 == 0 || (i = c2431.f9682) == 0 || i2 == i) && this.f9658 == c2431.f9658 && this.f9678 == c2431.f9678 && this.f9679 == c2431.f9679 && this.f9672 == c2431.f9672 && this.f9683 == c2431.f9683 && this.f9669 == c2431.f9669 && this.f9684 == c2431.f9684 && this.f9687 == c2431.f9687 && this.f9666 == c2431.f9666 && this.f9675 == c2431.f9675 && this.f9662 == c2431.f9662 && this.f9681 == c2431.f9681 && this.f9660 == c2431.f9660 && this.f9668 == c2431.f9668 && this.f9680 == c2431.f9680 && this.f9661 == c2431.f9661 && this.f9690 == c2431.f9690 && this.f9665 == c2431.f9665 && this.f9676 == c2431.f9676 && Float.compare(this.f9659, c2431.f9659) == 0 && Float.compare(this.f9693, c2431.f9693) == 0 && Objects.equals(this.f9677, c2431.f9677) && Objects.equals(this.f9657, c2431.f9657) && this.f9673.equals(c2431.f9673) && Objects.equals(this.f9663, c2431.f9663) && Objects.equals(this.f9664, c2431.f9664) && Objects.equals(this.f9667, c2431.f9667) && Objects.equals(this.f9689, c2431.f9689) && Arrays.equals(this.f9692, c2431.f9692) && Objects.equals(this.f9670, c2431.f9670) && Objects.equals(this.f9688, c2431.f9688) && Objects.equals(this.f9685, c2431.f9685) && m6540(c2431);
    }

    public final int hashCode() {
        if (this.f9682 == 0) {
            String str = this.f9677;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f9657;
            int iHashCode2 = (this.f9673.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f9689;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9658) * 31) + this.f9678) * 31) + this.f9679) * 31) + this.f9672) * 31;
            String str4 = this.f9663;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C2401 c2401 = this.f9670;
            int iHashCode5 = (iHashCode4 + (c2401 == null ? 0 : c2401.hashCode())) * 961;
            String str5 = this.f9664;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f9667;
            this.f9682 = ((((((((((((((((((((Float.floatToIntBits(this.f9693) + ((((Float.floatToIntBits(this.f9659) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f9683) * 31) + ((int) this.f9669)) * 31) + this.f9684) * 31) + this.f9687) * 31)) * 31) + this.f9666) * 31)) * 31) + this.f9675) * 31) + this.f9662) * 31) + this.f9681) * 31) + this.f9660) * 31) + this.f9668) * 31) + this.f9680) * 31) + this.f9661) * 31) + this.f9690) * 31) + this.f9665) * 31) + this.f9676;
        }
        return this.f9682;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f9677);
        sb.append(", ");
        sb.append(this.f9657);
        sb.append(", ");
        sb.append(this.f9664);
        sb.append(", ");
        sb.append(this.f9667);
        sb.append(", ");
        sb.append(this.f9663);
        sb.append(", ");
        sb.append(this.f9691);
        sb.append(", ");
        sb.append(this.f9689);
        sb.append(", [");
        sb.append(this.f9684);
        sb.append(", ");
        sb.append(this.f9687);
        sb.append(", ");
        sb.append(this.f9659);
        sb.append(", ");
        sb.append(this.f9688);
        sb.append("], [");
        sb.append(this.f9662);
        sb.append(", ");
        return AbstractC5179.m11550(sb, this.f9681, "])");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6539() {
        int i;
        int i2 = this.f9684;
        if (i2 == -1 || (i = this.f9687) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m6540(C2431 c2431) {
        List list = this.f9674;
        if (list.size() != c2431.f9674.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c2431.f9674.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2417 m6541() {
        C2417 c2417 = new C2417();
        c2417.f9614 = this.f9677;
        c2417.f9595 = this.f9657;
        c2417.f9611 = this.f9673;
        c2417.f9625 = this.f9689;
        c2417.f9596 = this.f9658;
        c2417.f9615 = this.f9678;
        c2417.f9616 = this.f9679;
        c2417.f9610 = this.f9672;
        c2417.f9627 = this.f9663;
        c2417.f9601 = this.f9670;
        c2417.f9608 = this.f9664;
        c2417.f9602 = this.f9667;
        c2417.f9605 = this.f9683;
        c2417.f9619 = this.f9671;
        c2417.f9609 = this.f9674;
        c2417.f9612 = this.f9685;
        c2417.f9621 = this.f9669;
        c2417.f9607 = this.f9684;
        c2417.f9620 = this.f9687;
        c2417.f9623 = this.f9659;
        c2417.f9597 = this.f9666;
        c2417.f9604 = this.f9693;
        c2417.f9629 = this.f9692;
        c2417.f9628 = this.f9675;
        c2417.f9613 = this.f9688;
        c2417.f9624 = this.f9662;
        c2417.f9600 = this.f9681;
        c2417.f9618 = this.f9660;
        c2417.f9598 = this.f9668;
        c2417.f9606 = this.f9680;
        c2417.f9617 = this.f9661;
        c2417.f9599 = this.f9686;
        c2417.f9622 = this.f9690;
        c2417.f9626 = this.f9665;
        c2417.f9603 = this.f9676;
        return c2417;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2431 m6542(C2431 c2431) {
        String str;
        float f;
        String str2;
        int i;
        int i2;
        if (this == c2431) {
            return this;
        }
        int iM6554 = AbstractC2435.m6554(this.f9667);
        String str3 = c2431.f9677;
        String str4 = c2431.f9657;
        if (str4 == null) {
            str4 = this.f9657;
        }
        AbstractC3980 abstractC3980 = c2431.f9673;
        if (abstractC3980.isEmpty()) {
            abstractC3980 = this.f9673;
        }
        if ((iM6554 != 3 && iM6554 != 1) || (str = c2431.f9689) == null) {
            str = this.f9689;
        }
        int i3 = this.f9679;
        if (i3 == -1) {
            i3 = c2431.f9679;
        }
        int i4 = this.f9672;
        if (i4 == -1) {
            i4 = c2431.f9672;
        }
        String str5 = this.f9663;
        if (str5 == null) {
            String strM10177 = AbstractC4470.m10177(iM6554, c2431.f9663);
            if (AbstractC4470.m10192(strM10177).length == 1) {
                str5 = strM10177;
            }
        }
        C2401 c2401M6492 = c2431.f9670;
        C2401 c2401 = this.f9670;
        if (c2401 != null) {
            c2401M6492 = c2401.m6492(c2401M6492);
        }
        float f2 = this.f9659;
        if (f2 == -1.0f && iM6554 == 2) {
            f2 = c2431.f9659;
        }
        int i5 = this.f9658 | c2431.f9658;
        int i6 = this.f9678 | c2431.f9678;
        ArrayList arrayList = new ArrayList();
        C2405 c2405 = c2431.f9685;
        if (c2405 != null) {
            C2413[] c2413Arr = c2405.f9503;
            int length = c2413Arr.length;
            f = f2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                C2413 c2413 = c2413Arr[i7];
                C2413[] c2413Arr2 = c2413Arr;
                if (c2413.f9582 != null) {
                    arrayList.add(c2413);
                }
                i7++;
                length = i8;
                c2413Arr = c2413Arr2;
            }
            str2 = c2405.f9501;
        } else {
            f = f2;
            str2 = null;
        }
        C2405 c24052 = this.f9685;
        if (c24052 != null) {
            if (str2 == null) {
                str2 = c24052.f9501;
            }
            int size = arrayList.size();
            C2413[] c2413Arr3 = c24052.f9503;
            int length2 = c2413Arr3.length;
            int i9 = 0;
            while (true) {
                String str6 = str2;
                if (i9 >= length2) {
                    break;
                }
                C2413 c24132 = c2413Arr3[i9];
                C2413[] c2413Arr4 = c2413Arr3;
                if (c24132.f9582 != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            i = size;
                            i2 = length2;
                            arrayList.add(c24132);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((C2413) arrayList.get(i10)).f9581.equals(c24132.f9581)) {
                            break;
                        }
                        i10++;
                        length2 = i2;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i9++;
                str2 = str6;
                c2413Arr3 = c2413Arr4;
                length2 = i2;
                size = i;
            }
        }
        C2405 c24053 = arrayList.isEmpty() ? null : new C2405(str2, arrayList);
        C2417 c2417M6541 = m6541();
        c2417M6541.f9614 = str3;
        c2417M6541.f9595 = str4;
        c2417M6541.f9611 = AbstractC3980.m9209(abstractC3980);
        c2417M6541.f9625 = str;
        c2417M6541.f9596 = i5;
        c2417M6541.f9615 = i6;
        c2417M6541.f9616 = i3;
        c2417M6541.f9610 = i4;
        c2417M6541.f9627 = str5;
        c2417M6541.f9601 = c2401M6492;
        c2417M6541.f9612 = c24053;
        c2417M6541.f9623 = f;
        c2417M6541.f9622 = c2431.f9690;
        c2417M6541.f9626 = c2431.f9665;
        return new C2431(c2417M6541);
    }
}
