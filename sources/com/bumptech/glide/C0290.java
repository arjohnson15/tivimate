package com.bumptech.glide;

import com.bumptech.glide.load.data.C0282;
import com.bumptech.glide.load.data.InterfaceC0278;
import com.bumptech.glide.load.data.InterfaceC0279;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p003.C0895;
import p003.C0918;
import p003.InterfaceC0889;
import p003.InterfaceC0913;
import p023.C1147;
import p035.C1232;
import p035.C1233;
import p035.C1234;
import p035.C1235;
import p035.C1236;
import p083.C1711;
import p240.C3100;
import p260.C3222;
import p261.C3235;
import p314.InterfaceC3593;
import p314.InterfaceC3595;
import p314.InterfaceC3597;
import p314.InterfaceC3603;
import p329.AbstractC3740;
import p331.C3759;
import p331.C3761;
import p445.C5154;
import p445.InterfaceC5156;
import ᵔʼ.ˑʽ;

/* renamed from: com.bumptech.glide.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0290 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1147 f2375;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C0282 f2376;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C3222 f2377;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3759 f2379;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0918 f2380;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1147 f2381;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C1232 f2382;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1147 f2383;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3761 f2378 = new C3761(3);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1234 f2384 = new C1234();

    public C0290() {
        C3222 c3222 = new C3222(new C3100(20), new ˑʽ(), new ᵔᵔ.ٴˎ(14), 4);
        this.f2377 = c3222;
        this.f2380 = new C0918(c3222);
        this.f2375 = new C1147(1);
        this.f2379 = new C3759((byte) 0, 3);
        this.f2383 = new C1147(2);
        this.f2376 = new C0282();
        this.f2381 = new C1147(6);
        this.f2382 = new C1232(0);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C3759 c3759 = this.f2379;
        synchronized (c3759) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) c3759.f14522);
                ((ArrayList) c3759.f14522).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c3759.f14522).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c3759.f14522).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m1582(Class cls, InterfaceC3593 interfaceC3593) {
        C1147 c1147 = this.f2375;
        synchronized (c1147) {
            c1147.f4789.add(new C1235(cls, interfaceC3593));
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ArrayList m1583(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f2379.m8752(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f2381.m4165(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                C3759 c3759 = this.f2379;
                synchronized (c3759) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) c3759.f14522).iterator();
                    while (it3.hasNext()) {
                        List<C1236> list = (List) ((HashMap) c3759.f14523).get((String) it3.next());
                        if (list != null) {
                            for (C1236 c1236 : list) {
                                if (c1236.f5052.isAssignableFrom(cls) && cls4.isAssignableFrom(c1236.f5050)) {
                                    arrayList.add(c1236.f5051);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new C3235(cls, cls4, cls5, arrayList, this.f2381.m4168(cls4, cls5), this.f2377));
            }
        }
        return arrayList2;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m1584(InterfaceC0278 interfaceC0278) {
        C0282 c0282 = this.f2376;
        synchronized (c0282) {
            ((HashMap) c0282.f2327).put(interfaceC0278.mo1537(), interfaceC0278);
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m1585(InterfaceC3603 interfaceC3603) {
        C1232 c1232 = this.f2382;
        synchronized (c1232) {
            c1232.f5042.add(interfaceC3603);
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m1586(C1711 c1711) {
        C0918 c0918 = this.f2380;
        synchronized (c0918) {
            Iterator it = c0918.f4088.m3736(c1711).iterator();
            while (it.hasNext()) {
                ((InterfaceC0889) it.next()).getClass();
            }
            c0918.f4087.f2385.clear();
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m1587(Class cls, Class cls2, InterfaceC5156 interfaceC5156) {
        C1147 c1147 = this.f2381;
        synchronized (c1147) {
            c1147.f4789.add(new C5154(cls, cls2, interfaceC5156));
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC0279 m1588(Object obj) {
        InterfaceC0279 interfaceC0279Mo1536;
        C0282 c0282 = this.f2376;
        synchronized (c0282) {
            try {
                AbstractC3740.m8705(obj);
                InterfaceC0278 interfaceC0278 = (InterfaceC0278) ((HashMap) c0282.f2327).get(obj.getClass());
                if (interfaceC0278 == null) {
                    Iterator it = ((HashMap) c0282.f2327).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC0278 interfaceC02782 = (InterfaceC0278) it.next();
                        if (interfaceC02782.mo1537().isAssignableFrom(obj.getClass())) {
                            interfaceC0278 = interfaceC02782;
                            break;
                        }
                    }
                }
                if (interfaceC0278 == null) {
                    interfaceC0278 = C0282.f2326;
                }
                interfaceC0279Mo1536 = interfaceC0278.mo1536(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0279Mo1536;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m1589(Class cls, InterfaceC3597 interfaceC3597) {
        C1147 c1147 = this.f2383;
        synchronized (c1147) {
            c1147.f4789.add(new C1233(cls, interfaceC3597));
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1590(Class cls, Class cls2, InterfaceC0889 interfaceC0889) {
        C0918 c0918 = this.f2380;
        synchronized (c0918) {
            c0918.f4088.m3734(cls, cls2, interfaceC0889);
            c0918.f4087.f2385.clear();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList m1591() {
        ArrayList arrayList;
        C1232 c1232 = this.f2382;
        synchronized (c1232) {
            arrayList = c1232.f5042;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final List m1592(Object obj) {
        List listUnmodifiableList;
        C0918 c0918 = this.f2380;
        c0918.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c0918) {
            C0895 c0895 = (C0895) c0918.f4087.f2385.get(cls);
            listUnmodifiableList = c0895 == null ? null : c0895.f4032;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = DesugarCollections.unmodifiableList(c0918.f4088.m3731(cls));
                if (((C0895) c0918.f4087.f2385.put(cls, new C0895(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC0913 interfaceC0913 = (InterfaceC0913) listUnmodifiableList.get(i);
            if (interfaceC0913.mo3706(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(interfaceC0913);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new Registry$NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m1593(String str, Class cls, Class cls2, InterfaceC3595 interfaceC3595) {
        C3759 c3759 = this.f2379;
        synchronized (c3759) {
            c3759.m8750(str).add(new C1236(cls, cls2, interfaceC3595));
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m1594(Class cls, InterfaceC0889 interfaceC0889) {
        C0918 c0918 = this.f2380;
        synchronized (c0918) {
            c0918.f4088.m3732(cls, interfaceC0889);
            c0918.f4087.f2385.clear();
        }
    }
}
