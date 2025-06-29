package p210;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import com.google.android.gms.internal.measurement.C0559;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p031.C1186;
import p031.C1193;
import p031.C1194;
import p031.C1199;
import p031.C1204;
import p119.C1860;
import p200.C2741;
import p238.AbstractC3095;
import p266.C3264;
import p293.ComponentCallbacks2C3481;
import p333.C3780;
import p381.EnumC4441;
import p417.AbstractC4753;
import p450.InterfaceC5190;
import ˎˊ.ˆʿ;

/* renamed from: ˏʼ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2804 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f10931;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC5190 f10934;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2801 f10935;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f10936;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C1199 f10938;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1204 f10939;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final Object f10930 = new Object();

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C2741 f10929 = new C2741(0);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AtomicBoolean f10932 = new AtomicBoolean(false);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AtomicBoolean f10937 = new AtomicBoolean();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f10940 = new CopyOnWriteArrayList();

    /* renamed from: ˉי, reason: contains not printable characters */
    public final CopyOnWriteArrayList f10933 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public C2804(Context context, String str, C2801 c2801) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        int i = 1;
        int i2 = 0;
        this.f10936 = context;
        AbstractC4753.m10688(str);
        this.f10931 = str;
        this.f10935 = c2801;
        C2803 c2803 = FirebaseInitProvider.f3657;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    String str2 = ComponentDiscoveryService.class + " has no service info.";
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str3 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str3)) && str3.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str3.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C1186(i2, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC4441 enumC4441 = EnumC4441.f17120;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new C1186(i, new FirebaseCommonRegistrar()));
        arrayList3.add(new C1186(i, new ExecutorsRegistrar()));
        arrayList4.add(C1194.m4246(context, Context.class, new Class[0]));
        arrayList4.add(C1194.m4246(this, C2804.class, new Class[0]));
        arrayList4.add(C1194.m4246(c2801, C2801.class, new Class[0]));
        C3264 c3264 = new C3264(8);
        if (ˆʿ.ˋⁱ(context) && FirebaseInitProvider.f3656.get()) {
            arrayList4.add(C1194.m4246(c2803, C2803.class, new Class[0]));
        }
        C1204 c1204 = new C1204(arrayList3, arrayList4, c3264);
        this.f10939 = c1204;
        Trace.endSection();
        this.f10938 = new C1199(new C1193(this, 2, context));
        this.f10934 = c1204.mo4259(C1860.class);
        C2802 c2802 = new C2802(this);
        m7085();
        if (this.f10932.get()) {
            ComponentCallbacks2C3481.f13440.f13444.get();
        }
        this.f10940.add(c2802);
        Trace.endSection();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2804 m7079() {
        C2804 c2804;
        synchronized (f10930) {
            try {
                c2804 = (C2804) f10929.get("[DEFAULT]");
                if (c2804 == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC3095.m7613() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C1860) c2804.f10934.get()).m5617();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2804;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C2804 m7080(Context context) {
        synchronized (f10930) {
            try {
                if (f10929.containsKey("[DEFAULT]")) {
                    return m7079();
                }
                C2801 c2801M7078 = C2801.m7078(context);
                if (c2801M7078 == null) {
                    return null;
                }
                return m7081(context, c2801M7078);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C2804 m7081(Context context, C2801 c2801) {
        C2804 c2804;
        AtomicReference atomicReference = C2806.f10946;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C2806.f10946;
            if (atomicReference2.get() == null) {
                C2806 c2806 = new C2806();
                while (true) {
                    if (atomicReference2.compareAndSet(null, c2806)) {
                        ComponentCallbacks2C3481.m8357(application);
                        ComponentCallbacks2C3481.f13440.m8359(c2806);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f10930) {
            C2741 c2741 = f10929;
            AbstractC4753.m10681("FirebaseApp name [DEFAULT] already exists!", !c2741.containsKey("[DEFAULT]"));
            AbstractC4753.m10689(context, "Application context cannot be null.");
            c2804 = new C2804(context, "[DEFAULT]", c2801);
            c2741.put("[DEFAULT]", c2804);
        }
        c2804.m7083();
        return c2804;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2804)) {
            return false;
        }
        C2804 c2804 = (C2804) obj;
        c2804.m7085();
        return this.f10931.equals(c2804.f10931);
    }

    public final int hashCode() {
        return this.f10931.hashCode();
    }

    public final String toString() {
        C0559 c0559 = new C0559(this);
        c0559.m2487(this.f10931, "name");
        c0559.m2487(this.f10935, "options");
        return c0559.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object m7082(Class cls) {
        m7085();
        return this.f10939.mo4256(cls);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m7083() {
        HashMap map;
        if (!ˆʿ.ˋⁱ(this.f10936)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m7085();
            sb.append(this.f10931);
            sb.toString();
            Context context = this.f10936;
            AtomicReference atomicReference = C2800.f10916;
            if (atomicReference.get() == null) {
                C2800 c2800 = new C2800(context);
                while (!atomicReference.compareAndSet(null, c2800)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(c2800, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        m7085();
        sb2.append(this.f10931);
        sb2.toString();
        C1204 c1204 = this.f10939;
        m7085();
        boolean zEquals = "[DEFAULT]".equals(this.f10931);
        AtomicReference atomicReference2 = c1204.f4953;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (c1204) {
                    map = new HashMap(c1204.f4952);
                }
                c1204.m4262(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((C1860) this.f10934.get()).m5617();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m7084() {
        boolean z;
        m7085();
        C3780 c3780 = (C3780) this.f10938.get();
        synchronized (c3780) {
            z = c3780.f14623;
        }
        return z;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7085() {
        AbstractC4753.m10681("FirebaseApp was deleted", !this.f10937.get());
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m7086() {
        StringBuilder sb = new StringBuilder();
        m7085();
        byte[] bytes = this.f10931.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        m7085();
        byte[] bytes2 = this.f10935.f10918.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }
}
