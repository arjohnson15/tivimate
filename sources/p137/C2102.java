package p137;

import android.graphics.Bitmap;
import android.os.Build;
import com.google.android.gms.internal.measurement.C0559;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p080.AbstractC1702;
import p329.AbstractC3742;
import ʿﾞ.ﹳﹳ;

/* renamed from: ˉˈ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2102 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8302;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8303;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8304;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8305;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Bitmap.Config[] f8306;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2100 f8309 = new C2100(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0559 f8307 = new C0559(7);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f8308 = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f8306 = configArr;
        f8302 = configArr;
        f8304 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f8305 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f8303 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m5954(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final String toString() {
        StringBuilder sbM5407 = AbstractC1702.m5407("SizeConfigStrategy{groupedMap=");
        sbM5407.append(this.f8307);
        sbM5407.append(", sortedSizes=(");
        HashMap map = this.f8308;
        for (Map.Entry entry : map.entrySet()) {
            sbM5407.append(entry.getKey());
            sbM5407.append('[');
            sbM5407.append(entry.getValue());
            sbM5407.append("], ");
        }
        if (!map.isEmpty()) {
            sbM5407.replace(sbM5407.length() - 2, sbM5407.length(), "");
        }
        sbM5407.append(")}");
        return sbM5407.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Bitmap m5955(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int i3 = 0;
        int iM8716 = AbstractC3742.m8716(config) * i * i2;
        C2100 c2100 = this.f8309;
        InterfaceC2103 interfaceC2103M5952 = (InterfaceC2103) ((ArrayDeque) ((ﹳﹳ) c2100).ᐧⁱ).poll();
        if (interfaceC2103M5952 == null) {
            interfaceC2103M5952 = c2100.m5952();
        }
        C2101 c2101 = (C2101) interfaceC2103M5952;
        c2101.f8299 = iM8716;
        c2101.f8300 = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = AbstractC2109.f8333[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : f8303 : f8305 : f8304 : f8306;
        } else {
            configArr = f8302;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer num = (Integer) m5958(config2).ceilingKey(Integer.valueOf(iM8716));
            if (num == null || num.intValue() > iM8716 * 8) {
                i3++;
            } else if (num.intValue() != iM8716 || (config2 != null ? !config2.equals(config) : config != null)) {
                c2100.ˎᵢ(c2101);
                int iIntValue = num.intValue();
                InterfaceC2103 interfaceC2103M59522 = (InterfaceC2103) ((ArrayDeque) ((ﹳﹳ) c2100).ᐧⁱ).poll();
                if (interfaceC2103M59522 == null) {
                    interfaceC2103M59522 = c2100.m5952();
                }
                c2101 = (C2101) interfaceC2103M59522;
                c2101.f8299 = iIntValue;
                c2101.f8300 = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f8307.m2502(c2101);
        if (bitmap != null) {
            m5957(Integer.valueOf(c2101.f8299), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m5956(Bitmap bitmap) {
        int iM8712 = AbstractC3742.m8712(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C2100 c2100 = this.f8309;
        InterfaceC2103 interfaceC2103M5952 = (InterfaceC2103) ((ArrayDeque) ((ﹳﹳ) c2100).ᐧⁱ).poll();
        if (interfaceC2103M5952 == null) {
            interfaceC2103M5952 = c2100.m5952();
        }
        C2101 c2101 = (C2101) interfaceC2103M5952;
        c2101.f8299 = iM8712;
        c2101.f8300 = config;
        this.f8307.m2509(c2101, bitmap);
        NavigableMap navigableMapM5958 = m5958(bitmap.getConfig());
        Integer num = (Integer) navigableMapM5958.get(Integer.valueOf(c2101.f8299));
        navigableMapM5958.put(Integer.valueOf(c2101.f8299), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5957(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM5958 = m5958(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM5958.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM5958.remove(num);
                return;
            } else {
                navigableMapM5958.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m5954(AbstractC3742.m8712(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final NavigableMap m5958(Bitmap.Config config) {
        HashMap map = this.f8308;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }
}
