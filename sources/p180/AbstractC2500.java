package p180;

import java.util.Collection;
import java.util.EnumSet;
import p109.EnumC1805;

/* renamed from: ˋᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2500 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f9932 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m6609(long j, InterfaceC2499 interfaceC2499) {
        return (j & interfaceC2499.getValue()) > 0;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static long m6610(Collection collection) {
        long value = 0;
        for (Object obj : collection) {
            if (!(obj instanceof InterfaceC2499)) {
                throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
            }
            value |= ((InterfaceC2499) obj).getValue();
        }
        return value;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m6611(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            char[] cArr = f9932;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m6612(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static InterfaceC2499 m6613(long j, Class cls, EnumC1805 enumC1805) {
        for (InterfaceC2499 interfaceC2499 : (InterfaceC2499[]) cls.getEnumConstants()) {
            if (interfaceC2499.getValue() == j) {
                return interfaceC2499;
            }
        }
        return enumC1805;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static EnumSet m6614(long j, Class cls) {
        if (!InterfaceC2499.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            if (m6609(j, (InterfaceC2499) obj)) {
                enumSetNoneOf.add(obj);
            }
        }
        return enumSetNoneOf;
    }
}
