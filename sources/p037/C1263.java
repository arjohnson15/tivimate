package p037;

import javax.el.ExpressionFactory;
import p129.InterfaceC2054;
import p266.C3262;
import ﹶˋ.ـﹶ;

/* renamed from: ʽʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1263 implements InterfaceC2054 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m4523(String str, C1264 c1264, C3262 c3262, Object obj) {
        try {
            return ((Boolean) AbstractC1266.f5182.createValueExpression(c1264, str, Boolean.class).getValue(c1264)).booleanValue();
        } catch (Throwable th) {
            ـﹶ r3 = new ـﹶ(th, c3262);
            r3.ˋˊ(obj);
            c3262.m8030(r3);
            return false;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ExpressionFactory m4524() {
        return AbstractC1266.f5182;
    }
}
