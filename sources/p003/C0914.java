package p003;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p083.C1711;
import p260.C3222;

/* renamed from: ʻʾ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0914 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C0902 f4071 = new C0902(6);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C0897 f4072 = new C0897(2);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0902 f4073;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashSet f4074;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f4075;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3222 f4076;

    public C0914(C3222 c3222) {
        C0902 c0902 = f4071;
        this.f4075 = new ArrayList();
        this.f4074 = new HashSet();
        this.f4076 = c3222;
        this.f4073 = c0902;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized ArrayList m3731(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f4075.iterator();
            while (it.hasNext()) {
                C0904 c0904 = (C0904) it.next();
                if (!this.f4074.contains(c0904) && c0904.f4053.isAssignableFrom(cls)) {
                    this.f4074.add(c0904);
                    arrayList.add(c0904.f4052.mo3711(this));
                    this.f4074.remove(c0904);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized void m3732(Class cls, InterfaceC0889 interfaceC0889) {
        this.f4075.add(0, new C0904(cls, InputStream.class, interfaceC0889));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized InterfaceC0913 m3733(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f4075.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                C0904 c0904 = (C0904) it.next();
                if (this.f4074.contains(c0904)) {
                    z = true;
                } else {
                    if (!c0904.f4053.isAssignableFrom(cls) || !c0904.f4051.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f4074.add(c0904);
                        arrayList.add(c0904.f4052.mo3711(this));
                        this.f4074.remove(c0904);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C0902 c0902 = this.f4073;
                C3222 c3222 = this.f4076;
                c0902.getClass();
                return new C0887(arrayList, 2, c3222);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC0913) arrayList.get(0);
            }
            if (z) {
                return f4072;
            }
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f4074.clear();
            throw th;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m3734(Class cls, Class cls2, InterfaceC0889 interfaceC0889) {
        C0904 c0904 = new C0904(cls, cls2, interfaceC0889);
        ArrayList arrayList = this.f4075;
        arrayList.add(arrayList.size(), c0904);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final synchronized ArrayList m3735() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f4075.iterator();
        while (it.hasNext()) {
            C0904 c0904 = (C0904) it.next();
            if (c0904.f4053.isAssignableFrom(C0893.class) && c0904.f4051.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(c0904.f4052);
            }
        }
        return arrayList;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final synchronized ArrayList m3736(C1711 c1711) {
        ArrayList arrayListM3735;
        arrayListM3735 = m3735();
        m3734(C0893.class, InputStream.class, c1711);
        return arrayListM3735;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized ArrayList m3737(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f4075.iterator();
        while (it.hasNext()) {
            C0904 c0904 = (C0904) it.next();
            if (!arrayList.contains(c0904.f4051) && c0904.f4053.isAssignableFrom(cls)) {
                arrayList.add(c0904.f4051);
            }
        }
        return arrayList;
    }
}
