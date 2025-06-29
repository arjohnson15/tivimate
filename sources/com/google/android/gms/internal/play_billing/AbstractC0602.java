package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0602 implements Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public AbstractC0662 f2966;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0662 f2967;

    public AbstractC0602(AbstractC0662 abstractC0662) {
        this.f2967 = abstractC0662;
        if (abstractC0662.m2707()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2966 = (AbstractC0662) abstractC0662.mo2555(4);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m2576(Object obj, Object obj2) {
        C0592.f2957.m2557(obj.getClass()).mo2624(obj, obj2);
    }

    public final Object clone() {
        AbstractC0602 abstractC0602 = (AbstractC0602) this.f2967.mo2555(5);
        abstractC0602.f2966 = m2580();
        return abstractC0602;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC0662 m2577() {
        AbstractC0662 abstractC0662M2580 = m2580();
        abstractC0662M2580.getClass();
        if (AbstractC0662.m2706(abstractC0662M2580, true)) {
            return abstractC0662M2580;
        }
        throw new zzfe();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2578() {
        if (this.f2966.m2707()) {
            return;
        }
        m2579();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m2579() {
        AbstractC0662 abstractC0662 = (AbstractC0662) this.f2967.mo2555(4);
        m2576(abstractC0662, this.f2966);
        this.f2966 = abstractC0662;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC0662 m2580() {
        if (!this.f2966.m2707()) {
            return this.f2966;
        }
        AbstractC0662 abstractC0662 = this.f2966;
        abstractC0662.getClass();
        C0592.f2957.m2557(abstractC0662.getClass()).mo2628(abstractC0662);
        abstractC0662.m2710();
        return this.f2966;
    }
}
