package p166;

import java.util.HashSet;

/* renamed from: ˊﹶ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2426 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final HashSet f9647 = new HashSet();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String f9646 = "media3.common";

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static synchronized void m6526(String str) {
        if (f9647.add(str)) {
            f9646 += ", " + str;
        }
    }
}
