package p013;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p278.AbstractC3362;
import p338.InterfaceC3856;
import p447.AbstractC5179;
import ـˈ.ˉᵎ;

/* renamed from: ʻי.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1037 extends AbstractC3362 {
    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static ArrayList m4005(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C1043(objArr, true));
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static ArrayList m4006(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C1043(objArr, true));
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final void m4007(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(ˉᵎ.ˋⁱ("fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC5179.m11548(i2, "fromIndex (", ") is less than zero."));
        }
        if (i3 > i) {
            throw new IndexOutOfBoundsException(ˉᵎ.ˋⁱ("toIndex (", i3, ") is greater than size (", i, ")."));
        }
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static void m4008() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static int m4009(List list) {
        return list.size() - 1;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static int m4010(List list, InterfaceC3856 interfaceC3856) {
        int size = list.size();
        int i = 0;
        m4007(list.size(), 0, size);
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iIntValue = ((Number) interfaceC3856.mo4036(list.get(i3))).intValue();
            if (iIntValue < 0) {
                i = i3 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static List m4011(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C1053.f4449;
    }
}
