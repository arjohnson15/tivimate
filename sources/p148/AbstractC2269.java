package p148;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p010.C1021;
import p034.C1228;
import p072.AbstractC1642;
import p217.C2824;
import p317.AbstractC3619;
import p330.InterfaceC3747;
import p338.InterfaceC3856;
import p338.InterfaceC3864;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;

/* renamed from: ˊʻ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2269 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1228 f9003 = new C1228("CLOSED", 1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1228 f9000 = new C1228("UNDEFINED", 1);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1228 f9002 = new C1228("REUSABLE_CLAIMED", 1);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1228 f9006 = new C1228("NO_THREAD_ELEMENTS", 1);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1021 f9001 = new C1021(11);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1021 f9004 = new C1021(12);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1021 f9005 = new C1021(13);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final UndeliveredElementException m6276(InterfaceC3856 interfaceC3856, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            interfaceC3856.mo4036(obj);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
            }
            ʾˈ.ـﹶ(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final AbstractC2263 m6277(Object obj) {
        if (obj != f9003) {
            return (AbstractC2263) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #2 {all -> 0x0067, blocks: (B:15:0x0046, B:17:0x0054, B:19:0x005a, B:32:0x008b, B:22:0x0069, B:24:0x0077, B:29:0x0082, B:31:0x0088, B:37:0x0098, B:40:0x00a1, B:39:0x009e, B:27:0x007d), top: B:52:0x0046, inners: #0 }] */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m6278(java.lang.Object r6, p330.InterfaceC3746 r7) {
        /*
            boolean r0 = r7 instanceof p148.C2257
            if (r0 == 0) goto Lab
            ˊʻ.ʿʼ r7 = (p148.C2257) r7
            java.lang.Throwable r0 = p288.AbstractC3404.m8265(r6)
            if (r0 != 0) goto Le
            r1 = r6
            goto L14
        Le:
            ʿʽ.ᵎˏ r1 = new ʿʽ.ᵎˏ
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            ʿʽ.ﹳˎ r0 = r7.f8979
            ˎʻ.ˑʽ r2 = r7.f8978
            ᴵⁱ.ˉי r3 = r2.mo3963()
            boolean r3 = r0.mo5276(r3)
            r4 = 1
            if (r3 == 0) goto L30
            r7.f8980 = r1
            r7.f6358 = r4
            ᴵⁱ.ˉי r6 = r2.mo3963()
            r0.mo5198(r6, r7)
            goto Lae
        L30:
            ʿʽ.ˑⁱ r0 = p072.AbstractC1628.m5245()
            boolean r3 = r0.m5225()
            if (r3 == 0) goto L43
            r7.f8980 = r1
            r7.f6358 = r4
            r0.m5228(r7)
            goto Lae
        L43:
            r0.m5224(r4)
            ᴵⁱ.ˉי r1 = r2.mo3963()     // Catch: java.lang.Throwable -> L67
            ʿʽ.ʿˏ r3 = p072.C1584.f6341     // Catch: java.lang.Throwable -> L67
            ᴵⁱ.ˏᵢ r1 = r1.mo3966(r3)     // Catch: java.lang.Throwable -> L67
            ʿʽ.ﾞˎ r1 = (p072.InterfaceC1643) r1     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L69
            boolean r3 = r1.mo5168()     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L69
            java.util.concurrent.CancellationException r6 = r1.mo5169()     // Catch: java.lang.Throwable -> L67
            ٴˑ.ٴˎ r1 = new ٴˑ.ٴˎ     // Catch: java.lang.Throwable -> L67
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L67
            r7.mo3974(r1)     // Catch: java.lang.Throwable -> L67
            goto L8b
        L67:
            r6 = move-exception
            goto La2
        L69:
            java.lang.Object r1 = r7.f8981     // Catch: java.lang.Throwable -> L67
            ᴵⁱ.ˉי r3 = r2.mo3963()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = m6280(r3, r1)     // Catch: java.lang.Throwable -> L67
            ʼᵔ.ـﹶ r5 = p148.AbstractC2269.f9006     // Catch: java.lang.Throwable -> L67
            if (r1 == r5) goto L7c
            ʿʽ.ⁱⁱ r5 = p072.AbstractC1642.m5306(r2, r3, r1)     // Catch: java.lang.Throwable -> L67
            goto L7d
        L7c:
            r5 = 0
        L7d:
            r2.mo3974(r6)     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L88
            boolean r6 = r5.m5274()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L8b
        L88:
            m6288(r3, r1)     // Catch: java.lang.Throwable -> L67
        L8b:
            boolean r6 = r0.m5230()     // Catch: java.lang.Throwable -> L67
            if (r6 != 0) goto L8b
        L91:
            r0.m5226(r4)
            goto Lae
        L95:
            r6 = move-exception
            if (r5 == 0) goto L9e
            boolean r2 = r5.m5274()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto La1
        L9e:
            m6288(r3, r1)     // Catch: java.lang.Throwable -> L67
        La1:
            throw r6     // Catch: java.lang.Throwable -> L67
        La2:
            r7.m5193(r6)     // Catch: java.lang.Throwable -> La6
            goto L91
        La6:
            r6 = move-exception
            r0.m5226(r4)
            throw r6
        Lab:
            r7.mo3974(r6)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148.AbstractC2269.m6278(java.lang.Object, ᴵⁱ.ʿʼ):void");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static int m6279(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m6281(i, i2, i3, str);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final Object m6280(InterfaceC3747 interfaceC3747, Object obj) {
        if (obj == null) {
            obj = interfaceC3747.mo3968(0, f9001);
        }
        return obj == 0 ? f9006 : obj instanceof Integer ? interfaceC3747.mo3968(new C2278(((Number) obj).intValue(), interfaceC3747), f9005) : ((C2258) obj).m6261(interfaceC3747);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final long m6281(long j, long j2, long j3, String str) {
        String property;
        int i = AbstractC2275.f9020;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM8557 = AbstractC3619.m8557(property);
        if (lM8557 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM8557.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final Object m6282(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final void m6283(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Expected positive parallelism level, but got ", i).toString());
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m6284(InterfaceC3856 interfaceC3856, Object obj, InterfaceC3747 interfaceC3747) {
        UndeliveredElementException undeliveredElementExceptionM6276 = m6276(interfaceC3856, obj, null);
        if (undeliveredElementExceptionM6276 != null) {
            AbstractC1642.m5288(undeliveredElementExceptionM6276, interfaceC3747);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final void m6285(Throwable th, InterfaceC3747 interfaceC3747) {
        Throwable runtimeException;
        Iterator it = AbstractC2276.f9021.iterator();
        while (it.hasNext()) {
            try {
                ((C2824) it.next()).m7100(th, interfaceC3747);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ʾˈ.ـﹶ(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            ʾˈ.ـﹶ(th, new DiagnosticCoroutineContextException(interfaceC3747));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final boolean m6286(Object obj) {
        return obj == f9003;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Object m6287(AbstractC2263 abstractC2263, long j, InterfaceC3864 interfaceC3864) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (abstractC2263.f8996 >= j && !abstractC2263.mo6259()) {
                return abstractC2263;
            }
            Object obj = AbstractC2256.f8976.get(abstractC2263);
            C1228 c1228 = f9003;
            if (obj == c1228) {
                return c1228;
            }
            AbstractC2263 abstractC22632 = (AbstractC2263) ((AbstractC2256) obj);
            if (abstractC22632 == null) {
                abstractC22632 = (AbstractC2263) interfaceC3864.mo1054(Long.valueOf(abstractC2263.f8996 + 1), abstractC2263);
                do {
                    atomicReferenceFieldUpdater = AbstractC2256.f8976;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2263, null, abstractC22632)) {
                        if (abstractC2263.mo6259()) {
                            abstractC2263.m6257();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC2263) == null);
            }
            abstractC2263 = abstractC22632;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final void m6288(InterfaceC3747 interfaceC3747, Object obj) {
        if (obj == f9006) {
            return;
        }
        if (!(obj instanceof C2278)) {
            ((C2258) interfaceC3747.mo3968(null, f9004)).m6260(obj);
            return;
        }
        C2278 c2278 = (C2278) obj;
        C2258[] c2258Arr = c2278.f9026;
        int length = c2258Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            c2258Arr[length].m6260(c2278.f9025[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
