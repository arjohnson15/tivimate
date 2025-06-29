package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0080;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0785 extends AbstractC0758 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0785> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C0741 unknownFields;

    public AbstractC0785() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C0741.f3558;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static AbstractC0785 m3232(AbstractC0785 abstractC0785, AbstractC0080 abstractC0080, C0747 c0747) throws InvalidProtocolBufferException {
        AbstractC0785 abstractC0785M3245 = abstractC0785.m3245();
        try {
            C0736 c0736 = C0736.f3551;
            c0736.getClass();
            InterfaceC0727 interfaceC0727M3049 = c0736.m3049(abstractC0785M3245.getClass());
            C0746 c0746 = (C0746) abstractC0080.f507;
            if (c0746 == null) {
                c0746 = new C0746(abstractC0080);
            }
            interfaceC0727M3049.mo2940(abstractC0785M3245, c0746, c0747);
            interfaceC0727M3049.mo2939(abstractC0785M3245);
            return abstractC0785M3245;
        } catch (InvalidProtocolBufferException e) {
            if (e.f3520) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static AbstractC0785 m3233(Class cls) throws ClassNotFoundException {
        AbstractC0785 abstractC0785Mo3134 = defaultInstanceMap.get(cls);
        if (abstractC0785Mo3134 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0785Mo3134 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0785Mo3134 == null) {
            abstractC0785Mo3134 = ((AbstractC0785) AbstractC0768.m3180(cls)).mo3134();
            if (abstractC0785Mo3134 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0785Mo3134);
        }
        return abstractC0785Mo3134;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m3234(Class cls, AbstractC0785 abstractC0785) {
        abstractC0785.m3246();
        defaultInstanceMap.put(cls, abstractC0785);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final boolean m3235(AbstractC0785 abstractC0785, boolean z) {
        byte bByteValue = ((Byte) abstractC0785.mo3242(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0736 c0736 = C0736.f3551;
        c0736.getClass();
        boolean zMo2934 = c0736.m3049(abstractC0785.getClass()).mo2934(abstractC0785);
        if (z) {
            abstractC0785.mo3242(2);
        }
        return zMo2934;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m3236(AbstractC0785 abstractC0785) throws InvalidProtocolBufferException {
        if (!m3235(abstractC0785, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static Object m3237(Method method, AbstractC0758 abstractC0758, Object... objArr) {
        try {
            return method.invoke(abstractC0758, objArr);
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

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static AbstractC0785 m3238(AbstractC0785 abstractC0785, AbstractC0748 abstractC0748, C0747 c0747) throws InvalidProtocolBufferException {
        C0762 c0762 = (C0762) abstractC0748;
        C0783 c0783M567 = AbstractC0080.m567(c0762.f3602, c0762.mo3169(), c0762.size(), true);
        AbstractC0785 abstractC0785M3232 = m3232(abstractC0785, c0783M567, c0747);
        c0783M567.mo437(UNINITIALIZED_HASH_CODE);
        m3236(abstractC0785M3232);
        return abstractC0785M3232;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0736 c0736 = C0736.f3551;
        c0736.getClass();
        return c0736.m3049(getClass()).mo2941(this, (AbstractC0785) obj);
    }

    public final int hashCode() {
        if (m3244()) {
            C0736 c0736 = C0736.f3551;
            c0736.getClass();
            return c0736.m3049(getClass()).mo2936(this);
        }
        if (this.memoizedHashCode == 0) {
            C0736 c07362 = C0736.f3551;
            c07362.getClass();
            this.memoizedHashCode = c07362.m3049(getClass()).mo2936(this);
        }
        return this.memoizedHashCode;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0776.f3638;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0776.m3213(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final AbstractC0728 m3239() {
        return (AbstractC0728) mo3242(5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0752
    /* renamed from: ˋⁱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC0785 mo3134() {
        return (AbstractC0785) mo3242(6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0758
    /* renamed from: ˎٴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC0728 mo3168() {
        return (AbstractC0728) mo3242(5);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public abstract Object mo3242(int i);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m3243() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m3244() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0758
    /* renamed from: ـﹶ */
    public final int mo3166(InterfaceC0727 interfaceC0727) {
        int iMo2942;
        int iMo29422;
        if (m3244()) {
            if (interfaceC0727 == null) {
                C0736 c0736 = C0736.f3551;
                c0736.getClass();
                iMo29422 = c0736.m3049(getClass()).mo2942(this);
            } else {
                iMo29422 = interfaceC0727.mo2942(this);
            }
            if (iMo29422 >= 0) {
                return iMo29422;
            }
            throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", iMo29422));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (interfaceC0727 == null) {
            C0736 c07362 = C0736.f3551;
            c07362.getClass();
            iMo2942 = c07362.m3049(getClass()).mo2942(this);
        } else {
            iMo2942 = interfaceC0727.mo2942(this);
        }
        m3249(iMo2942);
        return iMo2942;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0758
    /* renamed from: ٴˎ */
    public final void mo3167(C0735 c0735) {
        C0736 c0736 = C0736.f3551;
        c0736.getClass();
        InterfaceC0727 interfaceC0727M3049 = c0736.m3049(getClass());
        C0756 c0756 = c0735.f3547;
        if (c0756 == null) {
            c0756 = new C0756(c0735);
        }
        interfaceC0727M3049.mo2943(this, c0756);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final AbstractC0785 m3245() {
        return (AbstractC0785) mo3242(4);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m3246() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m3247() {
        m3249(Integer.MAX_VALUE);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final AbstractC0728 m3248() {
        AbstractC0728 abstractC0728 = (AbstractC0728) mo3242(5);
        if (!abstractC0728.f3528.equals(this)) {
            abstractC0728.m2948();
            AbstractC0728.m2944(abstractC0728.f3527, this);
        }
        return abstractC0728;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m3249(int i) {
        if (i < 0) {
            throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }
}
