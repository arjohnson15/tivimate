package p456;

import android.content.pm.PackageManager;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ˑˉ;

/* renamed from: ﾞⁱ.ᵢᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5335 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ AtomicReference f20693;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public /* synthetic */ C5244 f20694;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20695;

    public /* synthetic */ RunnableC5335() {
        this.f20695 = 0;
    }

    public /* synthetic */ RunnableC5335(C5244 c5244, AtomicReference atomicReference, int i) {
        this.f20695 = i;
        this.f20693 = atomicReference;
        this.f20694 = c5244;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m12012() {
        synchronized (this.f20693) {
            try {
                try {
                    AtomicReference atomicReference = this.f20693;
                    C5236 c5236 = (C5236) ((ﹳﹳ) this.f20694).ᐧⁱ;
                    C5245 c5245 = c5236.f20123;
                    String strM11753 = c5236.m11654().m11753();
                    c5245.getClass();
                    atomicReference.set(c5245.m11723(strM11753, AbstractC5248.f20240));
                } finally {
                    this.f20693.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m12013() {
        synchronized (this.f20693) {
            try {
                try {
                    AtomicReference atomicReference = this.f20693;
                    C5236 c5236 = (C5236) ((ﹳﹳ) this.f20694).ᐧⁱ;
                    atomicReference.set(Integer.valueOf(c5236.f20123.m11731(c5236.m11654().m11753(), AbstractC5248.f20229)));
                } finally {
                    this.f20693.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m12014() {
        synchronized (this.f20693) {
            try {
                try {
                    AtomicReference atomicReference = this.f20693;
                    C5236 c5236 = (C5236) ((ﹳﹳ) this.f20694).ᐧⁱ;
                    C5245 c5245 = c5236.f20123;
                    String strM11753 = c5236.m11654().m11753();
                    c5245.getClass();
                    atomicReference.set(Boolean.valueOf(c5245.m11727(strM11753, AbstractC5248.f20241)));
                } finally {
                    this.f20693.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private final void m12015() {
        synchronized (this.f20693) {
            try {
                try {
                    AtomicReference atomicReference = this.f20693;
                    C5236 c5236 = (C5236) ((ﹳﹳ) this.f20694).ᐧⁱ;
                    atomicReference.set(Long.valueOf(c5236.f20123.m11734(c5236.m11654().m11753(), AbstractC5248.f20279)));
                } finally {
                    this.f20693.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f20695) {
            case 0:
                C5244 c5244 = this.f20694;
                Bundle bundle = c5244.ᐧᴵ().f20482.ᵔﹳ();
                C5272 c5272M11652 = ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).m11652();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                c5272M11652.m11846();
                c5272M11652.m11757();
                C5253 c5253M11777 = c5272M11652.m11777(false);
                c5272M11652.m11785(new ˑˉ(c5272M11652, this.f20693, c5253M11777, bundle, 5));
                return;
            case 1:
                m12014();
                return;
            case 2:
                m12012();
                return;
            case 3:
                m12013();
                return;
            case 4:
                m12015();
                return;
            default:
                synchronized (this.f20693) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f20693;
                            C5236 c5236 = (C5236) ((ﹳﹳ) this.f20694).ᐧⁱ;
                            atomicReference.set(Double.valueOf(c5236.f20123.m11732(c5236.m11654().m11753(), AbstractC5248.f20275)));
                        } finally {
                            this.f20693.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
