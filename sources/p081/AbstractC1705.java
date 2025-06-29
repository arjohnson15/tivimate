package p081;

import android.util.SparseArray;
import java.util.HashMap;
import p183.EnumC2533;
import ـˈ.ˉᵎ;

/* renamed from: ʿˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1705 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final HashMap f6668;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final SparseArray f6669 = new SparseArray();

    static {
        HashMap map = new HashMap();
        f6668 = map;
        map.put(EnumC2533.f10073, 0);
        map.put(EnumC2533.f10070, 1);
        map.put(EnumC2533.f10071, 2);
        for (EnumC2533 enumC2533 : map.keySet()) {
            f6669.append(((Integer) f6668.get(enumC2533)).intValue(), enumC2533);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static EnumC2533 m5420(int i) {
        EnumC2533 enumC2533 = (EnumC2533) f6669.get(i);
        if (enumC2533 != null) {
            return enumC2533;
        }
        throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Unknown Priority for value ", i));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m5421(EnumC2533 enumC2533) {
        Integer num = (Integer) f6668.get(enumC2533);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC2533);
    }
}
