package p065;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p007.ExecutorC0955;
import p013.C1034;
import p013.C1047;
import p034.InterfaceC1225;
import p034.InterfaceC1229;
import p050.AbstractC1312;
import p050.AbstractC1313;
import p061.AbstractC1420;
import p070.AbstractC1563;
import p070.C1545;
import p072.AbstractC1633;
import p072.AbstractC1636;
import p072.AbstractC1642;
import p072.C1584;
import p072.C1613;
import p072.ExecutorC1620;
import p072.InterfaceC1643;
import p148.C2267;
import p150.ExecutorC2314;
import p176.InterfaceC2487;
import p236.C3092;
import p270.AbstractC3293;
import p288.C3405;
import p330.C3753;
import p330.InterfaceC3747;
import ـˈ.ˉᵎ;
import ᴵﹳ.ٴˎ;
import ᵔʼ.ˑʽ;
import ﹳᴵ.ˉי;

/* renamed from: ʾᵔ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1483 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f6030;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f6035;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC1225 f6038;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f6039;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1545 f6041;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Executor f6042;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Executor f6043;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f6045;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f6047;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayList f6046 = new ArrayList();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList f6031 = new ArrayList();

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f6032 = 1;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final long f6036 = -1;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C1496 f6033 = new C1496(0);

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final LinkedHashSet f6034 = new LinkedHashSet();

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final LinkedHashSet f6044 = new LinkedHashSet();

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final ArrayList f6037 = new ArrayList();

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f6040 = true;

    public C1483(Context context, Class cls, String str) {
        this.f6041 = AbstractC1563.m5154(cls);
        this.f6030 = context;
        this.f6039 = str;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC1484 m5036() {
        int i;
        boolean z;
        AbstractC1420 abstractC1420Mo1439;
        C1509 c1509;
        C1514 c1514;
        InterfaceC1229 interfaceC1229M5031;
        InterfaceC1229 interfaceC1229M50312;
        Executor executorC1620;
        InterfaceC3747 interfaceC3747Mo3967;
        boolean zContainsKey;
        Executor executor = this.f6042;
        if (executor == null && this.f6043 == null) {
            ExecutorC0955 executorC0955 = C3092.f11932;
            this.f6043 = executorC0955;
            this.f6042 = executorC0955;
        } else if (executor != null && this.f6043 == null) {
            this.f6043 = executor;
        } else if (executor == null) {
            this.f6042 = this.f6043;
        }
        LinkedHashSet linkedHashSet = this.f6044;
        LinkedHashSet linkedHashSet2 = this.f6034;
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", iIntValue).toString());
                }
            }
        }
        ˑʽ r0 = this.f6038;
        if (r0 == null) {
            r0 = new ˑʽ();
        }
        ˑʽ r5 = r0;
        if (this.f6036 > 0) {
            if (this.f6039 != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.f6046;
        boolean z2 = this.f6047;
        int i2 = this.f6032;
        if (i2 == 0) {
            throw null;
        }
        Context context = this.f6030;
        if (i2 != 1) {
            i = i2;
        } else {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = this.f6042;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f6043;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C1509 c15092 = new C1509(context, this.f6039, r5, this.f6033, arrayList, z2, i, executor2, executor3, null, this.f6040, this.f6045, linkedHashSet2, null, null, null, this.f6031, this.f6037, this.f6035, null, null);
        Class clsMo5134 = this.f6041.mo5134();
        Package r3 = clsMo5134.getPackage();
        String name = r3 != null ? r3.getName() : null;
        if (name == null) {
            name = "";
        }
        String canonicalName = clsMo5134.getCanonicalName();
        if (name.length() == 0) {
            z = true;
        } else {
            z = true;
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = canonicalName.replace('.', '_').concat("_Impl");
        try {
            AbstractC1484 abstractC1484 = (AbstractC1484) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, z, clsMo5134.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            abstractC1484.getClass();
            try {
                abstractC1420Mo1439 = abstractC1484.mo1439();
            } catch (C3405 unused) {
                abstractC1420Mo1439 = null;
            }
            if (abstractC1420Mo1439 == null) {
                c1509 = c15092;
                c1514 = new C1514(c1509, new C1047(3, abstractC1484));
            } else {
                c1509 = c15092;
                c1514 = new C1514(c1509, abstractC1420Mo1439);
            }
            abstractC1484.f6049 = c1514;
            abstractC1484.f6054 = abstractC1484.mo1381();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setMo1437 = abstractC1484.mo1437();
            int size = setMo1437.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setMo1437.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                int i3 = -1;
                List list = c1509.f6133;
                if (zHasNext) {
                    InterfaceC2487 interfaceC2487 = (InterfaceC2487) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i4 = size2 - 1;
                            if (((C1545) interfaceC2487).m5135(list.get(size2))) {
                                zArr[size2] = z;
                                i3 = size2;
                                break;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size2 = i4;
                        }
                    }
                    if (i3 < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + ((C1545) interfaceC2487).m5132() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(interfaceC2487, list.get(i3));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i5 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                break;
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size3 = i5;
                        }
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    for (AbstractC3293 abstractC3293 : abstractC1484.mo1436(linkedHashMap)) {
                        int i6 = abstractC3293.f12827;
                        C1496 c1496 = c1509.f6146;
                        LinkedHashMap linkedHashMap2 = c1496.f6088;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                            if (map == null) {
                                map = C1034.f4436;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(abstractC3293.f12826));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c1496.m5060(abstractC3293);
                        }
                    }
                    LinkedHashMap linkedHashMapMo1438 = abstractC1484.mo1438();
                    boolean[] zArr2 = new boolean[linkedHashMapMo1438.size()];
                    Iterator it3 = linkedHashMapMo1438.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        List list2 = c1509.f6144;
                        if (!zHasNext2) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i7 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i7 < 0) {
                                        break;
                                    }
                                    size4 = i7;
                                }
                            }
                            InterfaceC3747 interfaceC3747 = c1509.f6129;
                            if (interfaceC3747 != null) {
                                AbstractC1636 abstractC1636 = (AbstractC1636) interfaceC3747.mo3966(C3753.f14515);
                                AbstractC1633 abstractC1633 = abstractC1636 instanceof AbstractC1633 ? (AbstractC1633) abstractC1636 : null;
                                if (abstractC1633 == null || (executorC1620 = abstractC1633.mo5199()) == null) {
                                    executorC1620 = new ExecutorC1620(abstractC1636);
                                }
                                abstractC1484.f6052 = executorC1620;
                                abstractC1484.f6056 = new ExecutorC1522(executorC1620);
                                abstractC1484.f6053 = AbstractC1642.m5296(interfaceC3747.mo3967(new C1613((InterfaceC1643) interfaceC3747.mo3966(C1584.f6341))));
                                if (abstractC1484.m5051()) {
                                    C2267 c2267 = abstractC1484.f6053;
                                    if (c2267 == null) {
                                        c2267 = null;
                                    }
                                    interfaceC3747Mo3967 = c2267.f8999.mo3967(abstractC1636.mo5222(z ? 1 : 0, null));
                                } else {
                                    C2267 c22672 = abstractC1484.f6053;
                                    if (c22672 == null) {
                                        c22672 = null;
                                    }
                                    interfaceC3747Mo3967 = c22672.f8999;
                                }
                                abstractC1484.f6048 = interfaceC3747Mo3967;
                            } else {
                                abstractC1484.f6052 = c1509.f6136;
                                abstractC1484.f6056 = new ExecutorC1522(c1509.f6147);
                                Executor executor4 = abstractC1484.f6052;
                                if (executor4 == null) {
                                    executor4 = null;
                                }
                                C2267 c2267M5296 = AbstractC1642.m5296(ٴˎ.ˋⁱ(AbstractC1642.m5305(executor4), AbstractC1642.m5293()));
                                abstractC1484.f6053 = c2267M5296;
                                ExecutorC1522 executorC1522 = abstractC1484.f6056;
                                if (executorC1522 == null) {
                                    executorC1522 = null;
                                }
                                abstractC1484.f6048 = c2267M5296.f8999.mo3967(AbstractC1642.m5305(executorC1522));
                            }
                            abstractC1484.f6051 = c1509.f6140;
                            C1514 c15142 = abstractC1484.f6049;
                            if (c15142 == null) {
                                c15142 = null;
                            }
                            InterfaceC1229 interfaceC1229M5093 = c15142.m5093();
                            if (interfaceC1229M5093 == null) {
                                interfaceC1229M5031 = null;
                                break;
                            }
                            interfaceC1229M5031 = interfaceC1229M5093;
                            while (!(interfaceC1229M5031 instanceof AbstractC1312)) {
                                if (!(interfaceC1229M5031 instanceof InterfaceC1478)) {
                                    interfaceC1229M5031 = null;
                                    break;
                                }
                                interfaceC1229M5031 = ((InterfaceC1478) interfaceC1229M5031).m5031();
                            }
                            C1514 c15143 = abstractC1484.f6049;
                            if (c15143 == null) {
                                c15143 = null;
                            }
                            InterfaceC1229 interfaceC1229M50932 = c15143.m5093();
                            if (interfaceC1229M50932 == null) {
                                interfaceC1229M50312 = null;
                                break;
                            }
                            interfaceC1229M50312 = interfaceC1229M50932;
                            while (!(interfaceC1229M50312 instanceof AbstractC1313)) {
                                if (!(interfaceC1229M50312 instanceof InterfaceC1478)) {
                                    interfaceC1229M50312 = null;
                                    break;
                                }
                                interfaceC1229M50312 = ((InterfaceC1478) interfaceC1229M50312).m5031();
                            }
                            Intent intent = c1509.f6130;
                            if (intent != null) {
                                String str = c1509.f6127;
                                if (str == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                C1500 c1500M5047 = abstractC1484.m5047();
                                c1500M5047.getClass();
                                c1500M5047.f6099 = new C1530(c1509.f6139, str, intent);
                            }
                            return abstractC1484;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        InterfaceC2487 interfaceC24872 = (InterfaceC2487) entry.getKey();
                        for (InterfaceC2487 interfaceC24873 : (List) entry.getValue()) {
                            int size5 = list2.size() - 1;
                            if (size5 >= 0) {
                                while (true) {
                                    int i8 = size5 - 1;
                                    if (((C1545) interfaceC24873).m5135(list2.get(size5))) {
                                        zArr2[size5] = z;
                                        break;
                                    }
                                    if (i8 < 0) {
                                        break;
                                    }
                                    size5 = i8;
                                }
                                size5 = -1;
                            } else {
                                size5 = -1;
                            }
                            if (size5 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + ((C1545) interfaceC24873).m5132() + ") for " + ((C1545) interfaceC24872).m5132() + " is missing in the database configuration.").toString());
                            }
                            abstractC1484.f6050.put(interfaceC24873, list2.get(size5));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsMo5134.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsMo5134.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsMo5134.getCanonicalName(), e3);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m5037(ExecutorC2314 executorC2314) {
        this.f6042 = executorC2314;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m5038() {
        this.f6040 = true;
        this.f6045 = true;
        this.f6035 = true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5039(AbstractC3293... abstractC3293Arr) {
        for (AbstractC3293 abstractC3293 : abstractC3293Arr) {
            LinkedHashSet linkedHashSet = this.f6044;
            linkedHashSet.add(Integer.valueOf(abstractC3293.f12827));
            linkedHashSet.add(Integer.valueOf(abstractC3293.f12826));
        }
        AbstractC3293[] abstractC3293Arr2 = (AbstractC3293[]) Arrays.copyOf(abstractC3293Arr, abstractC3293Arr.length);
        C1496 c1496 = this.f6033;
        c1496.getClass();
        for (AbstractC3293 abstractC32932 : abstractC3293Arr2) {
            c1496.m5060(abstractC32932);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5040(ˉי r1) {
        this.f6038 = r1;
    }
}
