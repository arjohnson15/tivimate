package p063;

import java.util.ArrayDeque;
import p156.C2335;
import p329.AbstractC3742;
import p368.C4177;

/* renamed from: ʾᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1454 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayDeque f5950;

    public C1454(int i) {
        switch (i) {
            case 1:
                this.f5950 = new ArrayDeque();
                break;
            default:
                char[] cArr = AbstractC3742.f14503;
                this.f5950 = new ArrayDeque(0);
                break;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m5008(C4177 c4177) {
        synchronized (this.f5950) {
            try {
                if (this.f5950.size() < 10) {
                    this.f5950.offer(c4177);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public synchronized void m5009(C2335 c2335) {
        c2335.f9262 = null;
        c2335.f9263 = null;
        this.f5950.offer(c2335);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4177 m5010() {
        C4177 c4177;
        synchronized (this.f5950) {
            c4177 = (C4177) this.f5950.poll();
        }
        return c4177 == null ? new C4177() : c4177;
    }
}
