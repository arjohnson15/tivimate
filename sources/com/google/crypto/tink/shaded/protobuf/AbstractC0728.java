package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0728 implements InterfaceC0752, Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public AbstractC0785 f3527;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0785 f3528;

    public AbstractC0728(AbstractC0785 abstractC0785) {
        this.f3528 = abstractC0785;
        if (abstractC0785.m3244()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f3527 = abstractC0785.m3245();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m2944(Object obj, Object obj2) {
        C0736 c0736 = C0736.f3551;
        c0736.getClass();
        c0736.m3049(obj.getClass()).mo2935(obj, obj2);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC0785 m2945() {
        if (!this.f3527.m3244()) {
            return this.f3527;
        }
        AbstractC0785 abstractC0785 = this.f3527;
        abstractC0785.getClass();
        C0736 c0736 = C0736.f3551;
        c0736.getClass();
        c0736.m3049(abstractC0785.getClass()).mo2939(abstractC0785);
        abstractC0785.m3246();
        return this.f3527;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AbstractC0728 m2946() {
        AbstractC0728 abstractC0728Mo3168 = this.f3528.mo3168();
        abstractC0728Mo3168.f3527 = m2945();
        return abstractC0728Mo3168;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC0785 m2947() {
        AbstractC0785 abstractC0785M2945 = m2945();
        abstractC0785M2945.getClass();
        if (AbstractC0785.m3235(abstractC0785M2945, true)) {
            return abstractC0785M2945;
        }
        throw new UninitializedMessageException();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m2948() {
        if (this.f3527.m3244()) {
            return;
        }
        AbstractC0785 abstractC0785M3245 = this.f3528.m3245();
        m2944(abstractC0785M3245, this.f3527);
        this.f3527 = abstractC0785M3245;
    }
}
