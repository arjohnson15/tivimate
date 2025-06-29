package p036;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p076.C1667;
import p122.AbstractC1903;
import p122.C1916;
import p136.C2096;
import p141.C2192;
import p141.C2198;
import p153.C2326;
import p166.C2431;
import p234.C3079;
import p234.C3086;
import p272.C3306;
import p334.C3789;
import p345.AbstractC3925;
import p345.AbstractC3952;
import p345.C3983;
import p356.C4030;

/* renamed from: ʼﹶ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1259 implements Comparator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5169;

    public /* synthetic */ C1259(int i) {
        this.f5169 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5169) {
            case 0:
                return ((C2431) obj2).f9691 - ((C2431) obj).f9691;
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 2:
                return Integer.compare(((C1247) ((List) obj).get(0)).f5109, ((C1247) ((List) obj2).get(0)).f5109);
            case 3:
                return ((C1253) Collections.max((List) obj)).compareTo((C1253) Collections.max((List) obj2));
            case 4:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C3983.m9214(C1244.m4468((C1244) Collections.max(list, new C1259(6)), (C1244) Collections.max(list2, new C1259(6)))).mo9158(list.size(), list2.size()).mo9155((C1244) Collections.max(list, new C1259(7)), (C1244) Collections.max(list2, new C1259(7)), new C1259(7)).mo9156();
            case 5:
                return ((C1246) ((List) obj).get(0)).compareTo((C1246) ((List) obj2).get(0));
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return C1244.m4468((C1244) obj, (C1244) obj2);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C1244 c1244 = (C1244) obj;
                C1244 c12442 = (C1244) obj2;
                AbstractC3925 abstractC3925Mo9123 = (c1244.f5075 && c1244.f5076) ? C1255.f5150 : C1255.f5150.mo9123();
                C3983 c3983 = AbstractC3952.f15315;
                c1244.f5084.getClass();
                return c3983.mo9155(Integer.valueOf(c1244.f5087), Integer.valueOf(c12442.f5087), abstractC3925Mo9123).mo9155(Integer.valueOf(c1244.f5081), Integer.valueOf(c12442.f5081), abstractC3925Mo9123).mo9156();
            case 8:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 9:
                return ((C1667) obj).f6508 - ((C1667) obj2).f6508;
            case 10:
                return Float.compare(((C1667) obj).f6507, ((C1667) obj2).f6507);
            case 11:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 12:
                String name = ((File) obj).getName();
                int i2 = C2096.f8288;
                return name.substring(0, i2).compareTo(((File) obj2).getName().substring(0, i2));
            case 13:
                return C2198.m6127(((C2192) obj).f8619.f8778, ((C2192) obj2).f8619.f8778);
            case 14:
                return Integer.compare(((C2326) obj2).f9235, ((C2326) obj).f9235);
            case 15:
                return Integer.compare(((C3079) obj).f11872.f11903, ((C3079) obj2).f11872.f11903);
            case 16:
                return Long.compare(((C3086) obj).f11909, ((C3086) obj2).f11909);
            case 17:
                C3306 c3306 = (C3306) obj;
                C3306 c33062 = (C3306) obj2;
                int iCompare = Integer.compare(c33062.f12855, c3306.f12855);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = c3306.f12856.compareTo(c33062.f12856);
                return iCompareTo != 0 ? iCompareTo : c3306.f12858.compareTo(c33062.f12858);
            case 18:
                C3306 c33063 = (C3306) obj;
                C3306 c33064 = (C3306) obj2;
                int iCompare2 = Integer.compare(c33064.f12857, c33063.f12857);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = c33064.f12856.compareTo(c33063.f12856);
                return iCompareTo2 != 0 ? iCompareTo2 : c33064.f12858.compareTo(c33063.f12858);
            case 19:
                C4030 c4030 = (C4030) obj;
                C4030 c40302 = (C4030) obj2;
                int iCompare3 = Integer.compare(c4030.f15502, c40302.f15502);
                return iCompare3 != 0 ? iCompare3 : c4030.f15501.compareTo(c40302.f15501);
            case 20:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((C1916) ((AbstractC1903) obj)).f7272.compareTo(((C1916) ((AbstractC1903) obj2)).f7272);
        }
    }
}
