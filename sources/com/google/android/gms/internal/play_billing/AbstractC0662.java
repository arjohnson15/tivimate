package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0662 extends AbstractC0625 {
    private static final Map zzb = new ConcurrentHashMap();
    protected C0652 zzc;
    private int zzd;

    public AbstractC0662() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C0652.f3053;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Object m2703(Method method, AbstractC0625 abstractC0625, Object... objArr) {
        try {
            return method.invoke(abstractC0625, objArr);
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

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m2704(Class cls, AbstractC0662 abstractC0662) {
        abstractC0662.m2710();
        zzb.put(cls, abstractC0662);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static AbstractC0662 m2705(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        AbstractC0662 abstractC0662 = (AbstractC0662) map.get(cls);
        if (abstractC0662 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0662 = (AbstractC0662) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0662 == null) {
            abstractC0662 = (AbstractC0662) ((AbstractC0662) AbstractC0603.m2590(cls)).mo2555(6);
            if (abstractC0662 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC0662);
        }
        return abstractC0662;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final boolean m2706(AbstractC0662 abstractC0662, boolean z) {
        byte bByteValue = ((Byte) abstractC0662.mo2555(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo2626 = C0592.f2957.m2557(abstractC0662.getClass()).mo2626(abstractC0662);
        if (z) {
            abstractC0662.mo2555(2);
        }
        return zMo2626;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C0592.f2957.m2557(getClass()).mo2630(this, (AbstractC0662) obj);
    }

    public final int hashCode() {
        if (m2707()) {
            return C0592.f2957.m2557(getClass()).mo2632(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo2632 = C0592.f2957.m2557(getClass()).mo2632(this);
        this.zza = iMo2632;
        return iMo2632;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0609.f2978;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0609.m2608(this, sb, 0);
        return sb.toString();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m2707() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: ˏʾ */
    public abstract Object mo2555(int i);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m2708() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m2709() {
        int iMo2629;
        if (m2707()) {
            iMo2629 = C0592.f2957.m2557(getClass()).mo2629(this);
            if (iMo2629 < 0) {
                throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", iMo2629));
            }
        } else {
            iMo2629 = this.zzd & Integer.MAX_VALUE;
            if (iMo2629 == Integer.MAX_VALUE) {
                iMo2629 = C0592.f2957.m2557(getClass()).mo2629(this);
                if (iMo2629 < 0) {
                    throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", iMo2629));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo2629;
            }
        }
        return iMo2629;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0625
    /* renamed from: ـﹶ */
    public final int mo2639(InterfaceC0638 interfaceC0638) {
        if (m2707()) {
            int iMo2629 = interfaceC0638.mo2629(this);
            if (iMo2629 >= 0) {
                return iMo2629;
            }
            throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", iMo2629));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo26292 = interfaceC0638.mo2629(this);
        if (iMo26292 < 0) {
            throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", iMo26292));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo26292;
        return iMo26292;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2710() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
