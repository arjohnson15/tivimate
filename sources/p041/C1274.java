package p041;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p070.AbstractC1549;
import p126.InterfaceC2023;
import p127.C2034;
import p158.AbstractC2339;
import p363.C4131;
import p430.C4994;
import p430.C4999;
import p430.C5021;
import p430.InterfaceC4992;
import ᴵﹳ.ﹶˆ;

/* renamed from: ʽˉ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1274 implements Cloneable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f5220;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C5021 f5221;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final AtomicBoolean f5222;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C1276 f5223;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C1278 f5224;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public volatile C1276 f5225;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public volatile boolean f5226;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f5227;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f5228;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C1287 f5229;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4999 f5230;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C1273 f5231;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object f5232;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public volatile C1273 f5233;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C1283 f5234;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f5235;

    public C1274(C4999 c4999, C5021 c5021) {
        this.f5230 = c4999;
        this.f5221 = c5021;
        this.f5224 = (C1278) c4999.f18920.f17462;
        c4999.f18921.getClass();
        C1287 c1287 = new C1287(this);
        c1287.mo9539(0, TimeUnit.MILLISECONDS);
        this.f5229 = c1287;
        this.f5222 = new AtomicBoolean();
        this.f5227 = true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String m4537(C1274 c1274) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1274.f5226 ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(c1274.f5221.f19052.m11092());
        return sb.toString();
    }

    public final void cancel() {
        Socket socket;
        if (this.f5226) {
            return;
        }
        this.f5226 = true;
        C1273 c1273 = this.f5233;
        if (c1273 != null) {
            ((InterfaceC2023) c1273.f5215).cancel();
        }
        C1276 c1276 = this.f5225;
        if (c1276 == null || (socket = c1276.f5248) == null) {
            return;
        }
        AbstractC2339.m6447(socket);
    }

    public final Object clone() {
        return new C1274(this.f5230, this.f5221);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m4538(boolean z) {
        C1273 c1273;
        synchronized (this) {
            if (!this.f5227) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c1273 = this.f5233) != null) {
            ((InterfaceC2023) c1273.f5215).cancel();
            ((C1274) c1273.f5216).m4540(c1273, true, true, null);
        }
        this.f5231 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p430.C4994 m4539() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ﹶˏ.ˋˊ r0 = r11.f5230
            java.util.List r0 = r0.f18925
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p013.AbstractC1052.m4043(r0, r2)
            ˈᵔ.ـﹶ r0 = new ˈᵔ.ـﹶ
            ﹶˏ.ˋˊ r1 = r11.f5230
            r3 = 1
            r0.<init>(r3, r1)
            r2.add(r0)
            ˈᵔ.ـﹶ r0 = new ˈᵔ.ـﹶ
            ﹶˏ.ˋˊ r1 = r11.f5230
            ﹶˏ.ˏʾ r1 = r1.f18932
            r3 = 0
            r0.<init>(r3, r1)
            r2.add(r0)
            ʼˊ.ʽᐧ r0 = new ʼˊ.ʽᐧ
            ﹶˏ.ˋˊ r1 = r11.f5230
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            ʽˉ.ـﹶ r0 = p041.C1282.f5271
            r2.add(r0)
            ﹶˏ.ˋˊ r0 = r11.f5230
            java.util.List r0 = r0.f18930
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            p013.AbstractC1052.m4043(r0, r2)
            ˈᵔ.ʽᐧ r0 = new ˈᵔ.ʽᐧ
            r0.<init>()
            r2.add(r0)
            ˈᵔ.ٴˎ r9 = new ˈᵔ.ٴˎ
            ﹶˏ.ﾞʽ r10 = r11.f5221
            ﹶˏ.ˋˊ r0 = r11.f5230
            int r6 = r0.f18922
            int r7 = r0.f18924
            int r8 = r0.f18933
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            ﹶˏ.ˆʿ r2 = r9.m5665(r10)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            boolean r3 = r11.f5226     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            if (r3 != 0) goto L6b
            r11.m4544(r0)
            return r2
        L6b:
            p158.AbstractC2339.m6438(r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            throw r2     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
        L76:
            r2 = move-exception
            goto L82
        L78:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.m4544(r1)     // Catch: java.lang.Throwable -> L7f
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r1 = move-exception
            r2 = r1
            r1 = 1
        L82:
            if (r1 != 0) goto L87
            r11.m4544(r0)
        L87:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p041.C1274.m4539():ﹶˏ.ˆʿ");
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final IOException m4540(C1273 c1273, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        if (!c1273.equals(this.f5233)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.f5235) {
                        if (z2 || !this.f5220) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.f5235 = false;
                    }
                    if (z2) {
                        this.f5220 = false;
                    }
                    boolean z5 = this.f5235;
                    boolean z6 = (z5 || this.f5220) ? false : true;
                    if (!z5 && !this.f5220) {
                        if (!this.f5227) {
                            z3 = true;
                        }
                    }
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.f5233 = null;
            C1276 c1276 = this.f5223;
            if (c1276 != null) {
                c1276.m4554();
            }
        }
        return z4 ? m4542(iOException) : iOException;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Socket m4541() {
        C1276 c1276 = this.f5223;
        byte[] bArr = AbstractC2339.f9301;
        ArrayList arrayList = c1276.f5249;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC1549.m5138(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f5223 = null;
        if (arrayList.isEmpty()) {
            c1276.f5253 = System.nanoTime();
            C1278 c1278 = this.f5224;
            c1278.getClass();
            byte[] bArr2 = AbstractC2339.f9301;
            boolean z = c1276.f5242;
            C4131 c4131 = (C4131) c1278.f5259;
            if (z) {
                c1276.f5242 = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c1278.f5258;
                concurrentLinkedQueue.remove(c1276);
                if (concurrentLinkedQueue.isEmpty()) {
                    c4131.m9480();
                }
                return c1276.f5254;
            }
            c4131.m9479((C1285) c1278.f5261, 0L);
        }
        return null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final IOException m4542(IOException iOException) throws IOException {
        Socket socketM4541;
        byte[] bArr = AbstractC2339.f9301;
        C1276 c1276 = this.f5223;
        if (c1276 != null) {
            synchronized (c1276) {
                socketM4541 = m4541();
            }
            if (this.f5223 == null) {
                if (socketM4541 != null) {
                    AbstractC2339.m6447(socketM4541);
                }
            } else if (socketM4541 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f5228 || !this.f5229.m9583()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4543(InterfaceC4992 interfaceC4992) {
        RunnableC1284 runnableC1284;
        if (!this.f5222.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C2034 c2034 = C2034.f7700;
        this.f5232 = C2034.f7700.mo5681();
        ﹶˆ r0 = this.f5230.f18931;
        RunnableC1284 runnableC12842 = new RunnableC1284(this, interfaceC4992);
        synchronized (r0) {
            ((ArrayDeque) r0.ˆʿ).add(runnableC12842);
            String str = this.f5221.f19052.f18961;
            Iterator it = ((ArrayDeque) r0.ˎˑ).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) r0.ˆʿ).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            runnableC1284 = null;
                            break;
                        } else {
                            runnableC1284 = (RunnableC1284) it2.next();
                            if (AbstractC1549.m5138(runnableC1284.f5282.f5221.f19052.f18961, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    runnableC1284 = (RunnableC1284) it.next();
                    if (AbstractC1549.m5138(runnableC1284.f5282.f5221.f19052.f18961, str)) {
                        break;
                    }
                }
            }
            if (runnableC1284 != null) {
                runnableC12842.f5281 = runnableC1284.f5281;
            }
        }
        r0.ᵢʿ();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final IOException m4544(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f5227) {
                this.f5227 = false;
                if (!this.f5235) {
                    if (!this.f5220) {
                        z = true;
                    }
                }
            }
        }
        return z ? m4542(iOException) : iOException;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4545(C1276 c1276) {
        byte[] bArr = AbstractC2339.f9301;
        if (this.f5223 != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f5223 = c1276;
        c1276.f5249.add(new C1279(this, this.f5232));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4994 m4546() {
        if (!this.f5222.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f5229.m9582();
        C2034 c2034 = C2034.f7700;
        this.f5232 = C2034.f7700.mo5681();
        try {
            ﹶˆ r0 = this.f5230.f18931;
            synchronized (r0) {
                ((ArrayDeque) r0.ᐧˋ).add(this);
            }
            return m4539();
        } finally {
            ﹶˆ r1 = this.f5230.f18931;
            r1.ᵎـ((ArrayDeque) r1.ᐧˋ, this);
        }
    }
}
