package p344;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import p102.C1784;
import p102.C1785;
import p102.C1786;
import p196.C2711;
import ʻˋ.ˋˊ;
import ˈˉ.ﹳﹳ;

/* renamed from: ᵎᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3917 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final String[] f15228;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile int f15230;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final String f15231;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f15232;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ˋˊ f15227 = new ˋˊ(3);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ﹳﹳ f15229 = new ﹳﹳ(16);

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f15232 = property == null ? false : property.equalsIgnoreCase("true");
        f15228 = new String[]{"1.6", "1.7"};
        f15231 = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static LinkedHashSet m9104() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = AbstractC3917.class.getClassLoader();
            String str = f15231;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            ˆˑ.ﹳﹳ.יʻ("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static InterfaceC3918 m9105(Class cls) {
        int i;
        InterfaceC3918 interfaceC3918M9111 = m9111(cls.getName());
        if (f15232) {
            C1785 c1785 = ˆˑ.ﹳﹳ.ـﹶ;
            Class cls2 = null;
            if (c1785 == null) {
                if (ˆˑ.ﹳﹳ.ʽᐧ) {
                    c1785 = null;
                } else {
                    try {
                        c1785 = new C1785();
                    } catch (SecurityException unused) {
                        c1785 = null;
                    }
                    ˆˑ.ﹳﹳ.ـﹶ = c1785;
                    ˆˑ.ﹳﹳ.ʽᐧ = true;
                }
            }
            if (c1785 != null) {
                Class[] classContext = c1785.getClassContext();
                String name = ˆˑ.ﹳﹳ.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                ˆˑ.ﹳﹳ.ﾞʽ("Detected logger name mismatch. Given name: \"" + interfaceC3918M9111.mo5521() + "\"; computed name: \"" + cls2.getName() + "\".");
                ˆˑ.ﹳﹳ.ﾞʽ("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC3918M9111;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m9106(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            ˆˑ.ﹳﹳ.ﾞʽ("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ˆˑ.ﹳﹳ.ﾞʽ("Found binding in [" + ((URL) it.next()) + "]");
            }
            ˆˑ.ﹳﹳ.ﾞʽ("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final void m9107() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f15228) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            ˆˑ.ﹳﹳ.ﾞʽ("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f15228).toString());
            ˆˑ.ﹳﹳ.ﾞʽ("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            ˆˑ.ﹳﹳ.יʻ("Unexpected problem occured during version sanity check", th);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m9108() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) f15227.ᐧˋ;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2711 c2711 = (C2711) it.next();
                if (c2711 != null) {
                    C1784 c1784 = c2711.f10610;
                    String str = c1784.f6926;
                    if (c1784.f6922 == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c1784.f6922 instanceof C1786)) {
                        if (!c1784.m5508()) {
                            ˆˑ.ﹳﹳ.ﾞʽ(str);
                        } else if (c1784.m5508()) {
                            try {
                                c1784.f6925.invoke(c1784.f6922, c2711);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c2711.f10610.m5508()) {
                        ˆˑ.ﹳﹳ.ﾞʽ("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        ˆˑ.ﹳﹳ.ﾞʽ("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        ˆˑ.ﹳﹳ.ﾞʽ("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(c2711.f10610.f6922 instanceof C1786)) {
                        ˆˑ.ﹳﹳ.ﾞʽ("The following set of substitute loggers may have been accessed");
                        ˆˑ.ﹳﹳ.ﾞʽ("during the initialization phase. Logging calls during this");
                        ˆˑ.ﹳﹳ.ﾞʽ("phase were not honored. However, subsequent logging calls to these");
                        ˆˑ.ﹳﹳ.ﾞʽ("loggers will work as normally expected.");
                        ˆˑ.ﹳﹳ.ﾞʽ("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m9109() {
        ˋˊ r0 = f15227;
        synchronized (r0) {
            try {
                r0.ˆʿ = true;
                Iterator it = new ArrayList(((HashMap) r0.ˎˑ).values()).iterator();
                while (it.hasNext()) {
                    C1784 c1784 = (C1784) it.next();
                    c1784.f6922 = m9111(c1784.f6926);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m9110() {
        LinkedHashSet linkedHashSetM9104;
        try {
            if (m9112()) {
                linkedHashSetM9104 = null;
            } else {
                linkedHashSetM9104 = m9104();
                m9106(linkedHashSetM9104);
            }
            StaticLoggerBinder.getSingleton();
            f15230 = 3;
            m9114(linkedHashSetM9104);
            m9109();
            m9108();
            f15227.ـﹶ();
        } catch (Exception e) {
            f15230 = 2;
            ˆˑ.ﹳﹳ.יʻ("Failed to instantiate SLF4J LoggerFactory", e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            if (message == null || !(message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                f15230 = 2;
                ˆˑ.ﹳﹳ.יʻ("Failed to instantiate SLF4J LoggerFactory", e2);
                throw e2;
            }
            f15230 = 4;
            ˆˑ.ﹳﹳ.ﾞʽ("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            ˆˑ.ﹳﹳ.ﾞʽ("Defaulting to no-operation (NOP) logger implementation");
            ˆˑ.ﹳﹳ.ﾞʽ("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message2 = e3.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f15230 = 2;
                ˆˑ.ﹳﹳ.ﾞʽ("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                ˆˑ.ﹳﹳ.ﾞʽ("Your binding is version 1.5.5 or earlier.");
                ˆˑ.ﹳﹳ.ﾞʽ("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static InterfaceC3918 m9111(String str) {
        return m9113().m3672(str);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m9112() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static ILoggerFactory m9113() {
        if (f15230 == 0) {
            synchronized (AbstractC3917.class) {
                try {
                    if (f15230 == 0) {
                        f15230 = 1;
                        m9110();
                        if (f15230 == 3) {
                            m9107();
                        }
                    }
                } finally {
                }
            }
        }
        int i = f15230;
        if (i == 1) {
            return f15227;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f15229;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m9114(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        ˆˑ.ﹳﹳ.ﾞʽ("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }
}
