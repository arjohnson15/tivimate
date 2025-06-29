package p379;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;
import p158.AbstractC2339;
import p430.C5014;

/* renamed from: ᵢᐧ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4401 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4413 f16944;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f16945;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4414 f16946;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C4398 f16947;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f16948;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4398 f16949;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f16950;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f16951;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f16952;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f16953;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayDeque f16954;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public IOException f16955;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f16956;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4416 f16957;

    public C4401(int i, C4413 c4413, boolean z, boolean z2, C5014 c5014) {
        this.f16952 = i;
        this.f16944 = c4413;
        this.f16953 = c4413.f17020.m10027();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f16954 = arrayDeque;
        this.f16957 = new C4416(this, c4413.f17010.m10027(), z2);
        this.f16946 = new C4414(this, z);
        this.f16949 = new C4398(this);
        this.f16947 = new C4398(this);
        if (c5014 == null) {
            if (!m9996()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m9996()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c5014);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9991() throws IOException {
        C4414 c4414 = this.f16946;
        if (c4414.f17027) {
            throw new IOException("stream closed");
        }
        if (c4414.f17029) {
            throw new IOException("stream finished");
        }
        if (this.f16948 != 0) {
            IOException iOException = this.f16955;
            if (iOException == null) {
                throw new StreamResetException(this.f16948);
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9992(int i) {
        if (m10001(i, null)) {
            this.f16944.m10018(this.f16952, i);
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m9993(C5014 c5014, boolean z) {
        boolean zM10002;
        byte[] bArr = AbstractC2339.f9301;
        synchronized (this) {
            try {
                if (this.f16950 && z) {
                    this.f16957.getClass();
                } else {
                    this.f16950 = true;
                    this.f16954.add(c5014);
                }
                if (z) {
                    this.f16957.f17036 = true;
                }
                zM10002 = m10002();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM10002) {
            return;
        }
        this.f16944.m10024(this.f16952);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m9994() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final synchronized void m9995(int i) {
        if (this.f16948 == 0) {
            this.f16948 = i;
            notifyAll();
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m9996() {
        boolean z = (this.f16952 & 1) == 1;
        this.f16944.getClass();
        return true == z;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9997(int i, IOException iOException) {
        if (m10001(i, iOException)) {
            this.f16944.f17008.m10032(this.f16952, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9998() {
        /*
            r2 = this;
            byte[] r0 = p158.AbstractC2339.f9301
            monitor-enter(r2)
            ᵢᐧ.ﹳˎ r0 = r2.f16957     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f17036     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.f17037     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            ᵢᐧ.ᵎˏ r0 = r2.f16946     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f17029     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.f17027     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L34
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.m10002()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r0 == 0) goto L2a
            r0 = 9
            r1 = 0
            r2.m9997(r0, r1)
            goto L33
        L2a:
            if (r1 != 0) goto L33
            ᵢᐧ.ᴵʿ r0 = r2.f16944
            int r1 = r2.f16952
            r0.m10024(r1)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.C4401.m9998():void");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final synchronized int m9999() {
        return this.f16948;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C4414 m10000() {
        synchronized (this) {
            if (!this.f16950 && !m9996()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f16946;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m10001(int i, IOException iOException) {
        byte[] bArr = AbstractC2339.f9301;
        synchronized (this) {
            if (this.f16948 != 0) {
                return false;
            }
            this.f16948 = i;
            this.f16955 = iOException;
            notifyAll();
            if (this.f16957.f17036) {
                if (this.f16946.f17029) {
                    return false;
                }
            }
            this.f16944.m10024(this.f16952);
            return true;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final synchronized boolean m10002() {
        if (this.f16948 != 0) {
            return false;
        }
        C4416 c4416 = this.f16957;
        if (c4416.f17036 || c4416.f17037) {
            C4414 c4414 = this.f16946;
            if (c4414.f17029 || c4414.f17027) {
                if (this.f16950) {
                    return false;
                }
            }
        }
        return true;
    }
}
