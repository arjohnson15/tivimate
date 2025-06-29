package p036;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import p166.C2409;
import p374.C4241;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ʼﹶ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1245 extends C2409 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ int f5088 = 0;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final boolean f5089;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final SparseBooleanArray f5090;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean f5091;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean f5092;

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean f5093;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final SparseArray f5094;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean f5095;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean f5096;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean f5097;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean f5098;

    static {
        new C1245(new C1240());
        AbstractC4470.m10164(1000);
        AbstractC4470.m10164(1001);
        AbstractC4470.m10164(1002);
        AbstractC4470.m10164(1003);
        AbstractC4470.m10164(1004);
        ᵎˏ.ﹳˎ(1005, 1006, 1007, 1008, 1009);
        ᵎˏ.ﹳˎ(1010, 1011, 1012, 1013, 1014);
        AbstractC4470.m10164(1015);
        AbstractC4470.m10164(1016);
        AbstractC4470.m10164(1017);
        AbstractC4470.m10164(1018);
    }

    public C1245(C1240 c1240) {
        super(c1240);
        this.f5095 = c1240.f5067;
        this.f5089 = c1240.f5061;
        this.f5092 = c1240.f5064;
        this.f5098 = c1240.f5070;
        this.f5097 = c1240.f5069;
        this.f5093 = c1240.f5065;
        this.f5096 = c1240.f5068;
        this.f5091 = c1240.f5063;
        this.f5094 = c1240.f5066;
        this.f5090 = c1240.f5062;
    }

    @Override // p166.C2409
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1245.class != obj.getClass()) {
            return false;
        }
        C1245 c1245 = (C1245) obj;
        if (super.equals(c1245) && this.f5095 == c1245.f5095 && this.f5089 == c1245.f5089 && this.f5092 == c1245.f5092 && this.f5098 == c1245.f5098 && this.f5097 == c1245.f5097 && this.f5093 == c1245.f5093 && this.f5096 == c1245.f5096 && this.f5091 == c1245.f5091) {
            SparseBooleanArray sparseBooleanArray = this.f5090;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c1245.f5090;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.f5094;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = c1245.f5094;
                        if (sparseArray2.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            C4241 c4241 = (C4241) entry.getKey();
                                            if (!map2.containsKey(c4241) || !AbstractC4470.m10194(entry.getValue(), map2.get(c4241))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    @Override // p166.C2409
    public final int hashCode() {
        return (((((((((((((((((super.hashCode() + 31) * 31) + (this.f5095 ? 1 : 0)) * 961) + (this.f5089 ? 1 : 0)) * 961) + (this.f5092 ? 1 : 0)) * 28629151) + (this.f5098 ? 1 : 0)) * 31) + (this.f5097 ? 1 : 0)) * 31) + (this.f5093 ? 1 : 0)) * 31) + (this.f5096 ? 1 : 0)) * 31) + (this.f5091 ? 1 : 0)) * 31;
    }
}
