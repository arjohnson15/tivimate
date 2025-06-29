package p070;

import java.util.Arrays;
import p288.InterfaceC3402;
import p338.InterfaceC3856;
import p338.InterfaceC3859;
import p338.InterfaceC3864;
import p338.InterfaceC3865;
import p338.InterfaceC3870;
import p338.InterfaceC3871;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʿ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1549 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m5138(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m5139(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m5140(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(ᐧʻ.ˋⁱ(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        String name = AbstractC1549.class.getName();
        StackTraceElement[] stackTrace = classCastException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        classCastException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        throw classCastException;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m5141(int i, Object obj) {
        if (obj == null || m5143(i, obj)) {
            return;
        }
        m5140(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m5142(Float f, Float f2) {
        if (f == null) {
            if (f2 != null) {
                return false;
            }
        } else if (f2 == null || f.floatValue() != f2.floatValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static boolean m5143(int i, Object obj) {
        if (obj instanceof InterfaceC3402) {
            return (obj instanceof InterfaceC1559 ? ((InterfaceC1559) obj).mo5137() : obj instanceof InterfaceC3865 ? 0 : obj instanceof InterfaceC3856 ? 1 : obj instanceof InterfaceC3864 ? 2 : obj instanceof InterfaceC3870 ? 3 : obj instanceof InterfaceC3859 ? 4 : obj instanceof InterfaceC3871 ? 6 : -1) == i;
        }
        return false;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String m5144(Object obj, String str) {
        return str + obj;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m5145(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
