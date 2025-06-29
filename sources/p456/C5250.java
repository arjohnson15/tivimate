package p456;

import p293.C3474;

/* renamed from: ﾞⁱ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5250 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Object f20305 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC5313 f20306;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f20308;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f20309;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f20310 = new Object();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public volatile Object f20307 = null;

    public C5250(String str, Object obj, InterfaceC5313 interfaceC5313) {
        this.f20309 = str;
        this.f20308 = obj;
        this.f20306 = interfaceC5313;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m11751(Object obj) {
        synchronized (this.f20310) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC5310.f20599 == null) {
            return this.f20308;
        }
        synchronized (f20305) {
            try {
                if (C3474.m8337()) {
                    return this.f20307 == null ? this.f20308 : this.f20307;
                }
                try {
                    for (C5250 c5250 : AbstractC5248.f20251) {
                        if (C3474.m8337()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objMo8054 = null;
                        try {
                            InterfaceC5313 interfaceC5313 = c5250.f20306;
                            if (interfaceC5313 != null) {
                                objMo8054 = interfaceC5313.mo8054();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f20305) {
                            c5250.f20307 = objMo8054;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC5313 interfaceC53132 = this.f20306;
                if (interfaceC53132 == null) {
                    return this.f20308;
                }
                try {
                    return interfaceC53132.mo8054();
                } catch (IllegalStateException unused3) {
                    return this.f20308;
                } catch (SecurityException unused4) {
                    return this.f20308;
                }
            } finally {
            }
        }
    }
}
