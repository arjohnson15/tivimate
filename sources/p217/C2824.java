package p217;

import p072.C1584;
import p330.AbstractC3752;
import p330.InterfaceC3750;

/* renamed from: ˏˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2824 extends AbstractC3752 implements InterfaceC3750 {
    private volatile Object _preHandler;

    public C2824() {
        super(C1584.f6342);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7100(java.lang.Throwable r3, p330.InterfaceC3747 r4) {
        /*
            r2 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r4) goto L4a
            r0 = 28
            if (r4 >= r0) goto L4a
            java.lang.Object r4 = r2._preHandler
            r0 = 0
            if (r4 == r2) goto L12
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            goto L32
        L12:
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L2f
            int r1 = r4.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            int r1 = r4.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r4 = r0
        L30:
            r2._preHandler = r4
        L32:
            if (r4 == 0) goto L39
            java.lang.Object r4 = r4.invoke(r0, r0)
            goto L3a
        L39:
            r4 = r0
        L3a:
            boolean r1 = r4 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L41
            r0 = r4
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L41:
            if (r0 == 0) goto L4a
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r0.uncaughtException(r4, r3)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p217.C2824.m7100(java.lang.Throwable, ᴵⁱ.ˉי):void");
    }
}
