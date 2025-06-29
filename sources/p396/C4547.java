package p396;

import androidx.leanback.widget.ʿˏ;
import java.lang.reflect.InvocationHandler;

/* renamed from: ⁱᴵ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4547 implements InvocationHandler {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Class f17449;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ʿˏ f17450;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object[] f17451 = new Object[0];

    public C4547(ʿˏ r1, Class cls) {
        this.f17450 = r1;
        this.f17449 = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r1 = p396.AbstractC4582.m10484(r0, r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        ((j$.util.concurrent.ConcurrentHashMap) r0.ᐧⁱ).put(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        r9 = (p396.AbstractC4582) r3;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Ld
            java.lang.Object r8 = r9.invoke(r7, r10)
            return r8
        Ld:
            if (r10 == 0) goto L10
            goto L12
        L10:
            java.lang.Object[] r10 = r7.f17451
        L12:
            ⁱᴵ.ـﹶ r0 = p396.AbstractC4597.f17595
            boolean r1 = r0.mo10419(r9)
            java.lang.Class r2 = r7.f17449
            if (r1 == 0) goto L22
            java.lang.Object r8 = r0.mo10420(r9, r2, r8, r10)
            goto L87
        L22:
            androidx.leanback.widget.ʿˏ r0 = r7.f17450
        L24:
            java.lang.Object r1 = r0.ᐧⁱ
            j$.util.concurrent.ConcurrentHashMap r1 = (j$.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r9)
            boolean r3 = r1 instanceof p396.AbstractC4582
            if (r3 == 0) goto L34
            ⁱᴵ.ᵎˏ r1 = (p396.AbstractC4582) r1
        L32:
            r9 = r1
            goto L75
        L34:
            if (r1 != 0) goto L62
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            monitor-enter(r3)
            java.lang.Object r1 = r0.ᐧⁱ     // Catch: java.lang.Throwable -> L53
            j$.util.concurrent.ConcurrentHashMap r1 = (j$.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.putIfAbsent(r9, r3)     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L5e
            ⁱᴵ.ᵎˏ r1 = p396.AbstractC4582.m10484(r0, r2, r9)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r0.ᐧⁱ     // Catch: java.lang.Throwable -> L53
            j$.util.concurrent.ConcurrentHashMap r0 = (j$.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L53
            r0.put(r9, r1)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L53
            goto L32
        L53:
            r8 = move-exception
            goto L60
        L55:
            r8 = move-exception
            java.lang.Object r10 = r0.ᐧⁱ     // Catch: java.lang.Throwable -> L53
            j$.util.concurrent.ConcurrentHashMap r10 = (j$.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L53
            r10.remove(r9)     // Catch: java.lang.Throwable -> L53
            throw r8     // Catch: java.lang.Throwable -> L53
        L5e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L53
            goto L62
        L60:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L53
            throw r8
        L62:
            monitor-enter(r1)
            java.lang.Object r3 = r0.ᐧⁱ     // Catch: java.lang.Throwable -> L6f
            j$.util.concurrent.ConcurrentHashMap r3 = (j$.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = r3.get(r9)     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L71
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6f
            goto L24
        L6f:
            r8 = move-exception
            goto L88
        L71:
            r9 = r3
            ⁱᴵ.ᵎˏ r9 = (p396.AbstractC4582) r9     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6f
        L75:
            ⁱᴵ.ﹳˑ r6 = new ⁱᴵ.ﹳˑ
            ﹶˏ.ﹳﹳ r4 = r9.f17531
            ⁱᴵ.ˋⁱ r5 = r9.f17532
            ⁱᴵ.ˎᵔ r1 = r9.f17533
            r0 = r6
            r2 = r8
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r8 = r9.mo10435(r6, r10)
        L87:
            return r8
        L88:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p396.C4547.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
