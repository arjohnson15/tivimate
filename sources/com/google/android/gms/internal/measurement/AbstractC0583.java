package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ﾞﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0583 extends AbstractC0563 {
    private static Map<Class<?>, AbstractC0583> zzc = new ConcurrentHashMap();
    protected C0405 zzb;
    private int zzd;

    public AbstractC0583() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = C0405.f2688;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static InterfaceC0465 m2531(InterfaceC0465 interfaceC0465) {
        int size = interfaceC0465.size();
        return interfaceC0465.mo2107(size == 0 ? 10 : size << 1);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m2532(Class cls, AbstractC0583 abstractC0583) {
        abstractC0583.m2539();
        zzc.put(cls, abstractC0583);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final boolean m2533(AbstractC0583 abstractC0583, boolean z) {
        byte bByteValue = ((Byte) abstractC0583.mo1622(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0440 c0440 = C0440.f2745;
        c0440.getClass();
        boolean zMo1848 = c0440.m2222(abstractC0583.getClass()).mo1848(abstractC0583);
        if (z) {
            abstractC0583.mo1622(2);
        }
        return zMo1848;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static Object m2534(Method method, AbstractC0563 abstractC0563, Object... objArr) {
        try {
            return method.invoke(abstractC0563, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C0548 m2535(InterfaceC0309 interfaceC0309) {
        int size = interfaceC0309.size();
        int i = size == 0 ? 10 : size << 1;
        C0548 c0548 = (C0548) interfaceC0309;
        if (i >= c0548.f2897) {
            return new C0548(Arrays.copyOf(c0548.f2896, i), c0548.f2897, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static AbstractC0583 m2536(Class cls) throws ClassNotFoundException {
        AbstractC0583 abstractC0583 = zzc.get(cls);
        if (abstractC0583 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0583 = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0583 == null) {
            abstractC0583 = (AbstractC0583) ((AbstractC0583) AbstractC0547.m2452(cls)).mo1622(6);
            if (abstractC0583 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, abstractC0583);
        }
        return abstractC0583;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0440 c0440 = C0440.f2745;
        c0440.getClass();
        return c0440.m2222(getClass()).mo1844(this, (AbstractC0583) obj);
    }

    public final int hashCode() {
        if (m2540()) {
            C0440 c0440 = C0440.f2745;
            c0440.getClass();
            return c0440.m2222(getClass()).mo1849(this);
        }
        if (this.zza == 0) {
            C0440 c04402 = C0440.f2745;
            c04402.getClass();
            this.zza = c04402.m2222(getClass()).mo1849(this);
        }
        return this.zza;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0308.f2424;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0308.m1814(this, sb, 0);
        return sb.toString();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m2537(int i) {
        if (i < 0) {
            throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", i));
        }
        this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final AbstractC0312 m2538() {
        return (AbstractC0312) mo1622(5);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m2539() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m2540() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0563
    /* renamed from: ـﹶ */
    public final int mo2513(InterfaceC0494 interfaceC0494) {
        int iMo1841;
        int iMo18412;
        if (m2540()) {
            if (interfaceC0494 == null) {
                C0440 c0440 = C0440.f2745;
                c0440.getClass();
                iMo18412 = c0440.m2222(getClass()).mo1841(this);
            } else {
                iMo18412 = interfaceC0494.mo1841(this);
            }
            if (iMo18412 >= 0) {
                return iMo18412;
            }
            throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", iMo18412));
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (interfaceC0494 == null) {
            C0440 c04402 = C0440.f2745;
            c04402.getClass();
            iMo1841 = c04402.m2222(getClass()).mo1841(this);
        } else {
            iMo1841 = interfaceC0494.mo1841(this);
        }
        m2537(iMo1841);
        return iMo1841;
    }

    /* renamed from: ᐧʻ */
    public abstract Object mo1622(int i);

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final AbstractC0312 m2541() {
        AbstractC0312 abstractC0312 = (AbstractC0312) mo1622(5);
        abstractC0312.m1818(this);
        return abstractC0312;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m2542(C0346 c0346) {
        C0440 c0440 = C0440.f2745;
        c0440.getClass();
        InterfaceC0494 interfaceC0494M2222 = c0440.m2222(getClass());
        C0355 c0355 = c0346.f2471;
        if (c0355 == null) {
            c0355 = new C0355();
            Charset charset = AbstractC0412.f2705;
            if (c0346 == null) {
                throw new NullPointerException("output");
            }
            c0355.f2536 = c0346;
            c0346.f2471 = c0355;
        }
        interfaceC0494M2222.mo1842(this, c0355);
    }
}
