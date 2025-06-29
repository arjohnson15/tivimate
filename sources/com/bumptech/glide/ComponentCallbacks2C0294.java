package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.leanback.widget.RunnableC0183;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p009.C0987;
import p009.C0990;
import p009.C1001;
import p009.InterfaceC0981;
import p009.InterfaceC0986;
import p009.InterfaceC0994;
import p009.InterfaceC1000;
import p063.C1457;
import p259.InterfaceC3214;
import p329.AbstractC3742;
import p346.C3992;
import p346.InterfaceC3990;
import ʻˋ.ˋˊ;
import ᵔʼ.ˑʽ;

/* renamed from: com.bumptech.glide.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0294 implements ComponentCallbacks2, InterfaceC1000 {

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final C3992 f2391;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Context f2392;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC0986 f2393;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final InterfaceC0981 f2394;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC0994 f2395;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f2396;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ˋˊ f2397;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ComponentCallbacks2C0283 f2398;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C3992 f2399;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C1001 f2400;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final RunnableC0183 f2401;

    static {
        C3992 c3992 = (C3992) new C3992().m9240(Bitmap.class);
        c3992.f15386 = true;
        f2391 = c3992;
        ((C3992) new C3992().m9240(C1457.class)).f15386 = true;
    }

    public ComponentCallbacks2C0294(ComponentCallbacks2C0283 componentCallbacks2C0283, InterfaceC0994 interfaceC0994, InterfaceC0986 interfaceC0986, Context context) {
        ˋˊ r1 = new ˋˊ(2);
        ˑʽ r2 = componentCallbacks2C0283.f2344;
        this.f2400 = new C1001();
        RunnableC0183 runnableC0183 = new RunnableC0183(3, this);
        this.f2401 = runnableC0183;
        this.f2398 = componentCallbacks2C0283;
        this.f2395 = interfaceC0994;
        this.f2393 = interfaceC0986;
        this.f2397 = r1;
        this.f2392 = context;
        Context applicationContext = context.getApplicationContext();
        C0287 c0287 = new C0287(this, r1);
        r2.getClass();
        boolean z = ﹳﹳ.ˏᵢ(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3) && !z) {
        }
        InterfaceC0981 c0990 = z ? new C0990(applicationContext, c0287) : new C0987();
        this.f2394 = c0990;
        synchronized (componentCallbacks2C0283.f2339) {
            if (componentCallbacks2C0283.f2339.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0283.f2339.add(this);
        }
        char[] cArr = AbstractC3742.f14503;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC0994.mo3952(this);
        } else {
            AbstractC3742.m8714().post(runnableC0183);
        }
        interfaceC0994.mo3952(c0990);
        this.f2396 = new CopyOnWriteArrayList(componentCallbacks2C0283.f2341.f2347);
        m1598(componentCallbacks2C0283.f2341.m1556());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2397 + ", treeNode=" + this.f2393 + "}";
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˉי */
    public final synchronized void mo1559() {
        m1597();
        this.f2400.mo1559();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m1595(InterfaceC3214 interfaceC3214) {
        if (interfaceC3214 == null) {
            return;
        }
        boolean zM1600 = m1600(interfaceC3214);
        InterfaceC3990 interfaceC3990Mo1565 = interfaceC3214.mo1565();
        if (zM1600) {
            return;
        }
        ComponentCallbacks2C0283 componentCallbacks2C0283 = this.f2398;
        synchronized (componentCallbacks2C0283.f2339) {
            try {
                Iterator it = componentCallbacks2C0283.f2339.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ComponentCallbacks2C0294) it.next()).m1600(interfaceC3214)) {
                        }
                    } else if (interfaceC3990Mo1565 != null) {
                        interfaceC3214.mo1566(null);
                        interfaceC3990Mo1565.clear();
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final synchronized void m1596() {
        try {
            Iterator it = AbstractC3742.m8709(this.f2400.f4351).iterator();
            while (it.hasNext()) {
                m1595((InterfaceC3214) it.next());
            }
            this.f2400.f4351.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˏʾ */
    public final synchronized void mo1560() {
        this.f2400.mo1560();
        m1596();
        ˋˊ r0 = this.f2397;
        Iterator it = AbstractC3742.m8709((Set) r0.ˎˑ).iterator();
        while (it.hasNext()) {
            r0.ˑʽ((InterfaceC3990) it.next());
        }
        ((HashSet) r0.ᐧˋ).clear();
        this.f2395.mo3953(this);
        this.f2395.mo3953(this.f2394);
        AbstractC3742.m8714().removeCallbacks(this.f2401);
        this.f2398.m1554(this);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final synchronized void m1597() {
        ˋˊ r0 = this.f2397;
        r0.ˆʿ = false;
        Iterator it = AbstractC3742.m8709((Set) r0.ˎˑ).iterator();
        while (it.hasNext()) {
            InterfaceC3990 interfaceC3990 = (InterfaceC3990) it.next();
            if (!interfaceC3990.mo9221() && !interfaceC3990.isRunning()) {
                interfaceC3990.mo9220();
            }
        }
        ((HashSet) r0.ᐧˋ).clear();
    }

    @Override // p009.InterfaceC1000
    /* renamed from: ˑʽ */
    public final synchronized void mo1562() {
        this.f2400.mo1562();
        m1599();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final synchronized void m1598(C3992 c3992) {
        C3992 c39922 = (C3992) c3992.clone();
        if (c39922.f15386 && !c39922.f15394) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        c39922.f15394 = true;
        c39922.f15386 = true;
        this.f2399 = c39922;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final synchronized void m1599() {
        ˋˊ r0 = this.f2397;
        r0.ˆʿ = true;
        Iterator it = AbstractC3742.m8709((Set) r0.ˎˑ).iterator();
        while (it.hasNext()) {
            InterfaceC3990 interfaceC3990 = (InterfaceC3990) it.next();
            if (interfaceC3990.isRunning()) {
                interfaceC3990.mo9228();
                ((HashSet) r0.ᐧˋ).add(interfaceC3990);
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final synchronized boolean m1600(InterfaceC3214 interfaceC3214) {
        InterfaceC3990 interfaceC3990Mo1565 = interfaceC3214.mo1565();
        if (interfaceC3990Mo1565 == null) {
            return true;
        }
        if (!this.f2397.ˑʽ(interfaceC3990Mo1565)) {
            return false;
        }
        this.f2400.f4351.remove(interfaceC3214);
        interfaceC3214.mo1566(null);
        return true;
    }
}
