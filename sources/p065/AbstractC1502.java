package p065;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p013.C1053;
import p057.C1344;
import p145.AbstractC2234;
import p155.EnumC2332;
import p185.AbstractC2562;
import p262.InterfaceC3254;
import p262.InterfaceC3255;
import p278.AbstractC3362;
import p288.C3397;
import p317.AbstractC3616;

/* renamed from: ʾᵔ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1502 {
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Object m5068(InterfaceC1506 interfaceC1506, String str, AbstractC2562 abstractC2562) {
        Object objMo5080 = interfaceC1506.mo5080(str, C1520.f6182, abstractC2562);
        return objMo5080 == EnumC2332.f9250 ? objMo5080 : C3397.f13249;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1529 m5069(int i, String str) {
        TreeMap treeMap = C1529.f6210;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                C1529 c1529 = new C1529(i);
                c1529.f6211 = str;
                c1529.f6213 = i;
                return c1529;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C1529 c15292 = (C1529) entryCeilingEntry.getValue();
            c15292.f6211 = str;
            c15292.f6213 = i;
            return c15292;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1483 m5070(Context context, Class cls, String str) {
        if (AbstractC3616.m8523(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new C1483(context, cls, str);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract void m5071(InterfaceC3254 interfaceC3254, Object obj);

    /* renamed from: ˉי, reason: contains not printable characters */
    public long m5072(InterfaceC3255 interfaceC3255, Object obj) {
        if (obj == null) {
            return -1L;
        }
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108(m5075());
        try {
            m5071(interfaceC3254Mo6108, obj);
            interfaceC3254Mo6108.mo6098();
            interfaceC3254Mo6108.close();
            return AbstractC2234.m6220(interfaceC3255);
        } catch (Throwable th) {
            interfaceC3254Mo6108.close();
            throw th;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public List m5073(InterfaceC3255 interfaceC3255, Collection collection) {
        if (collection == null) {
            return C1053.f4449;
        }
        C1344 c1344 = new C1344(10);
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108(m5075());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    m5071(interfaceC3254Mo6108, obj);
                    interfaceC3254Mo6108.mo6098();
                    interfaceC3254Mo6108.mo6102();
                    c1344.add(Long.valueOf(AbstractC2234.m6220(interfaceC3255)));
                } else {
                    c1344.add(-1L);
                }
            }
            interfaceC3254Mo6108.close();
            return AbstractC3362.m8205(c1344);
        } catch (Throwable th) {
            interfaceC3254Mo6108.close();
            throw th;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m5074(InterfaceC3255 interfaceC3255, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108(m5075());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    m5071(interfaceC3254Mo6108, obj);
                    interfaceC3254Mo6108.mo6098();
                    interfaceC3254Mo6108.mo6102();
                }
            }
        } finally {
            interfaceC3254Mo6108.close();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract String m5075();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m5076(InterfaceC3255 interfaceC3255, Object obj) {
        if (obj == null) {
            return;
        }
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108(m5075());
        try {
            m5071(interfaceC3254Mo6108, obj);
            interfaceC3254Mo6108.mo6098();
            interfaceC3254Mo6108.close();
            AbstractC2234.m6224(interfaceC3255);
        } catch (Throwable th) {
            interfaceC3254Mo6108.close();
            throw th;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m5077(InterfaceC3255 interfaceC3255, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108(m5075());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    m5071(interfaceC3254Mo6108, obj);
                    interfaceC3254Mo6108.mo6098();
                    interfaceC3254Mo6108.mo6102();
                    AbstractC2234.m6224(interfaceC3255);
                }
            }
        } finally {
            interfaceC3254Mo6108.close();
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m5078(InterfaceC3255 interfaceC3255, Object obj) {
        if (obj == null) {
            return;
        }
        InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255.mo6108(m5075());
        try {
            m5071(interfaceC3254Mo6108, obj);
            interfaceC3254Mo6108.mo6098();
        } finally {
            interfaceC3254Mo6108.close();
        }
    }
}
