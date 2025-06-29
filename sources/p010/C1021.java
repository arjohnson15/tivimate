package p010;

import p070.AbstractC1549;
import p132.C2077;
import p148.C2258;
import p148.C2278;
import p317.AbstractC3629;
import p330.InterfaceC3747;
import p330.InterfaceC3750;
import p334.C3789;
import p338.InterfaceC3864;
import ˉʼ.ﹶˆ;
import ˉﾞ.ˎˉ;
import ˉﾞ.יˆ;
import ˉﾞ.ᐧʻ;
import ـˈ.ʻˉ;

/* renamed from: ʻˎ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1021 implements InterfaceC3864 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4400;

    public /* synthetic */ C1021(int i) {
        this.f4400 = i;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        switch (this.f4400) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                ᐧʻ r10 = (ᐧʻ) obj;
                ᐧʻ r11 = (ᐧʻ) obj2;
                C2077 c2077 = C2077.f7939;
                c2077.getClass();
                iCompare = ﹶˆ.ʽᐧ(((Boolean) C2077.f8004.ʿˏ(c2077, C2077.f7994[228])).booleanValue()) ? Boolean.compare(r11.יʻ, r10.יʻ) : 0;
                if (iCompare == 0) {
                    iCompare = r10.ﹳﹳ().compareTo(r11.ﹳﹳ());
                }
                return Integer.valueOf(iCompare);
            case 2:
                ᐧʻ r102 = (ᐧʻ) obj;
                ᐧʻ r112 = (ᐧʻ) obj2;
                C2077 c20772 = C2077.f7939;
                c20772.getClass();
                iCompare = ﹶˆ.ʽᐧ(((Boolean) C2077.f8004.ʿˏ(c20772, C2077.f7994[228])).booleanValue()) ? Boolean.compare(r112.יʻ, r102.יʻ) : 0;
                if (iCompare == 0) {
                    iCompare = r102.ﹳﹳ().compareTo(r112.ﹳﹳ());
                }
                return Integer.valueOf(iCompare);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                return ((InterfaceC3747) obj).mo3967((InterfaceC3750) obj2);
            case 5:
                return ((InterfaceC3747) obj).mo3967((InterfaceC3750) obj2);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                ʿʾ.ﹶˆ r103 = (ʿʾ.ﹶˆ) obj;
                ʿʾ.ﹶˆ r113 = (ʿʾ.ﹶˆ) obj2;
                boolean z = r103.ˑʽ;
                if (z == r113.ˑʽ) {
                    iCompareToIgnoreCase = r103.ـﹶ.compareToIgnoreCase(r113.ـﹶ);
                } else if (!z) {
                    iCompareToIgnoreCase = 1;
                }
                return Integer.valueOf(iCompareToIgnoreCase);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((Long) obj) != null ? 1 : -1);
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (AbstractC3629.m8560(str, str2, true)) {
                    iCompare = -1;
                } else if (AbstractC3629.m8560(str2, str, true)) {
                    iCompare = 1;
                }
                return Integer.valueOf(iCompare);
            case 9:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                if (AbstractC3629.m8561(str3, str4, true)) {
                    iCompare = -1;
                } else if (AbstractC3629.m8561(str4, str3, true)) {
                    iCompare = 1;
                }
                return Integer.valueOf(iCompare);
            case 10:
                boolean z2 = ((ˎˉ) obj).ʿʼ;
                return Integer.valueOf(z2 != ((ˎˉ) obj2).ʿʼ ? z2 ? -1 : 1 : 0);
            case 11:
                InterfaceC3750 interfaceC3750 = (InterfaceC3750) obj2;
                if (!(interfaceC3750 instanceof C2258)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC3750 : Integer.valueOf(iIntValue + 1);
            case 12:
                C2258 c2258 = (C2258) obj;
                InterfaceC3750 interfaceC37502 = (InterfaceC3750) obj2;
                if (c2258 != null) {
                    return c2258;
                }
                return interfaceC37502 instanceof C2258 ? (C2258) interfaceC37502 : null;
            case 13:
                C2278 c2278 = (C2278) obj;
                InterfaceC3750 interfaceC37503 = (InterfaceC3750) obj2;
                if (interfaceC37503 instanceof C2258) {
                    C2258 c22582 = (C2258) interfaceC37503;
                    Object objM6261 = c22582.m6261(c2278.f9027);
                    int i = c2278.f9028;
                    c2278.f9025[i] = objM6261;
                    c2278.f9028 = 1 + i;
                    c2278.f9026[i] = c22582;
                }
                return c2278;
            case 14:
                ʻˉ r104 = (ʻˉ) obj;
                ʻˉ r114 = (ʻˉ) obj2;
                Integer num2 = r104.ʿʼ;
                int iIntValue2 = num2 != null ? num2.intValue() : r104.ٴˎ;
                Integer num3 = r114.ʿʼ;
                int iM5145 = AbstractC1549.m5145(iIntValue2, num3 != null ? num3.intValue() : r114.ٴˎ);
                if (iM5145 == 0) {
                    Integer num4 = r114.ʿʼ;
                    Integer num5 = r104.ʿʼ;
                    if (num5 == null || num4 == null) {
                        if (num5 != null) {
                            iCompare = 1;
                        } else if (num4 != null) {
                            iCompare = -1;
                        }
                    }
                    iM5145 = iCompare;
                }
                return Integer.valueOf(iM5145);
            case 15:
                יˆ r105 = (יˆ) obj;
                יˆ r115 = (יˆ) obj2;
                return Integer.valueOf(r105.ʽᐧ() ? -1 : r115.ʽᐧ() ? 1 : r105.ﹳﹳ.compareToIgnoreCase(r115.ﹳﹳ));
            default:
                Long l = (Long) obj;
                Long l2 = (Long) obj2;
                long jLongValue = l != null ? l.longValue() : 0L;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                C2077 c20773 = C2077.f7939;
                return Integer.valueOf(jLongValue != c20773.m5788() ? jLongValue2 == c20773.m5788() ? 1 : AbstractC1549.m5139(jLongValue, jLongValue2) : -1);
        }
    }
}
