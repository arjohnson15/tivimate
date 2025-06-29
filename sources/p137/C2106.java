package p137;

import android.util.Log;
import com.google.android.gms.internal.measurement.C0559;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p329.AbstractC3740;
import ʿﾞ.ﹳﹳ;

/* renamed from: ˉˈ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2106 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f8315;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f8318;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0559 f8317 = new C0559(7);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2100 f8314 = new C2100(0);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f8316 = new HashMap();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final HashMap f8319 = new HashMap();

    public C2106(int i) {
        this.f8315 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5964(int i, Class cls) {
        NavigableMap navigableMapM5970 = m5970(cls);
        Integer num = (Integer) navigableMapM5970.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM5970.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM5970.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2099 m5965(Class cls) {
        HashMap map = this.f8319;
        C2099 c2099 = (C2099) map.get(cls);
        if (c2099 == null) {
            if (cls.equals(int[].class)) {
                c2099 = new C2099(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                c2099 = new C2099(0);
            }
            map.put(cls, c2099);
        }
        return c2099;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final synchronized void m5966(Object obj) {
        Class<?> cls = obj.getClass();
        C2099 c2099M5965 = m5965(cls);
        int iM5951 = c2099M5965.m5951(obj);
        int iM5949 = c2099M5965.m5949() * iM5951;
        if (iM5949 <= this.f8315 / 2) {
            C2100 c2100 = this.f8314;
            InterfaceC2103 interfaceC2103M5952 = (InterfaceC2103) ((ArrayDeque) ((ﹳﹳ) c2100).ᐧⁱ).poll();
            if (interfaceC2103M5952 == null) {
                interfaceC2103M5952 = c2100.m5952();
            }
            C2108 c2108 = (C2108) interfaceC2103M5952;
            c2108.f8330 = iM5951;
            c2108.f8331 = cls;
            this.f8317.m2509(c2108, obj);
            NavigableMap navigableMapM5970 = m5970(cls);
            Integer num = (Integer) navigableMapM5970.get(Integer.valueOf(c2108.f8330));
            Integer numValueOf = Integer.valueOf(c2108.f8330);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM5970.put(numValueOf, Integer.valueOf(iIntValue));
            this.f8318 += iM5949;
            m5967(this.f8315);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5967(int i) {
        while (this.f8318 > i) {
            Object objM2498 = this.f8317.m2498();
            AbstractC3740.m8705(objM2498);
            C2099 c2099M5965 = m5965(objM2498.getClass());
            this.f8318 -= c2099M5965.m5949() * c2099M5965.m5951(objM2498);
            m5964(c2099M5965.m5951(objM2498), objM2498.getClass());
            if (Log.isLoggable(c2099M5965.m5950(), 2)) {
                c2099M5965.m5950();
                String str = "evicted: " + c2099M5965.m5951(objM2498);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m5968() {
        m5967(0);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object m5969(C2108 c2108, Class cls) {
        Object obj;
        C2099 c2099M5965 = m5965(cls);
        Object objM2502 = this.f8317.m2502(c2108);
        if (objM2502 != null) {
            this.f8318 -= c2099M5965.m5949() * c2099M5965.m5951(objM2502);
            m5964(c2099M5965.m5951(objM2502), cls);
        }
        if (objM2502 != null) {
            return objM2502;
        }
        if (Log.isLoggable(c2099M5965.m5950(), 2)) {
            c2099M5965.m5950();
            String str = "Allocated " + c2108.f8330 + " bytes";
        }
        int i = c2108.f8330;
        switch (c2099M5965.f8297) {
            case 0:
                obj = new byte[i];
                break;
            default:
                obj = new int[i];
                break;
        }
        return obj;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final NavigableMap m5970(Class cls) {
        HashMap map = this.f8316;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized Object m5971(int i, Class cls) {
        C2108 c2108;
        int i2;
        try {
            Integer num = (Integer) m5970(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f8318) != 0 && this.f8315 / i2 < 2 && num.intValue() > i * 8)) {
                C2100 c2100 = this.f8314;
                InterfaceC2103 interfaceC2103M5952 = (InterfaceC2103) ((ArrayDeque) ((ﹳﹳ) c2100).ᐧⁱ).poll();
                if (interfaceC2103M5952 == null) {
                    interfaceC2103M5952 = c2100.m5952();
                }
                c2108 = (C2108) interfaceC2103M5952;
                c2108.f8330 = i;
                c2108.f8331 = cls;
            } else {
                C2100 c21002 = this.f8314;
                int iIntValue = num.intValue();
                InterfaceC2103 interfaceC2103M59522 = (InterfaceC2103) ((ArrayDeque) ((ﹳﹳ) c21002).ᐧⁱ).poll();
                if (interfaceC2103M59522 == null) {
                    interfaceC2103M59522 = c21002.m5952();
                }
                c2108 = (C2108) interfaceC2103M59522;
                c2108.f8330 = iIntValue;
                c2108.f8331 = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m5969(c2108, cls);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final synchronized void m5972(int i) {
        try {
            if (i >= 40) {
                m5968();
            } else if (i >= 20 || i == 15) {
                m5967(this.f8315 / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
