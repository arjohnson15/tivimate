package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0083 extends AbstractC0052 {
    private static Map<Object, AbstractC0083> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected C0051 unknownFields;

    public AbstractC0083() {
        this.memoizedHashCode = 0;
        this.unknownFields = C0051.f458;
        this.memoizedSerializedSize = -1;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static AbstractC0083 m577(Class cls) throws ClassNotFoundException {
        AbstractC0083 abstractC0083 = defaultInstanceMap.get(cls);
        if (abstractC0083 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0083 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0083 == null) {
            abstractC0083 = (AbstractC0083) ((AbstractC0083) AbstractC0029.m320(cls)).mo581(6);
            if (abstractC0083 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0083);
        }
        return abstractC0083;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m578(Class cls, AbstractC0083 abstractC0083) {
        defaultInstanceMap.put(cls, abstractC0083);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Object m579(Method method, AbstractC0052 abstractC0052, Object... objArr) {
        try {
            return method.invoke(abstractC0052, objArr);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0083) mo581(6)).getClass().isInstance(obj)) {
            return false;
        }
        C0028 c0028 = C0028.f387;
        c0028.getClass();
        return c0028.m308(getClass()).mo305(this, (AbstractC0083) obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C0028 c0028 = C0028.f387;
        c0028.getClass();
        int iMo304 = c0028.m308(getClass()).mo304(this);
        this.memoizedHashCode = iMo304;
        return iMo304;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0072.m504(this, sb, 0);
        return sb.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0052
    /* renamed from: ˑʽ */
    public final void mo480(C0040 c0040) {
        C0028 c0028 = C0028.f387;
        c0028.getClass();
        InterfaceC0025 interfaceC0025M308 = c0028.m308(getClass());
        C0030 c0030 = c0040.f436;
        if (c0030 == null) {
            c0030 = new C0030(c0040);
        }
        interfaceC0025M308.mo300(this, c0030);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0052
    /* renamed from: ـﹶ */
    public final int mo481() {
        if (this.memoizedSerializedSize == -1) {
            C0028 c0028 = C0028.f387;
            c0028.getClass();
            this.memoizedSerializedSize = c0028.m308(getClass()).mo301(this);
        }
        return this.memoizedSerializedSize;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m580() {
        byte bByteValue = ((Byte) mo581(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0028 c0028 = C0028.f387;
        c0028.getClass();
        boolean zMo299 = c0028.m308(getClass()).mo299(this);
        mo581(2);
        return zMo299;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract Object mo581(int i);
}
