package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ʼי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0312 implements Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public AbstractC0583 f2428;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0583 f2429;

    public AbstractC0312(AbstractC0583 abstractC0583) {
        this.f2429 = abstractC0583;
        if (abstractC0583.m2540()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2428 = (AbstractC0583) abstractC0583.mo1622(4);
    }

    public final /* synthetic */ Object clone() {
        AbstractC0312 abstractC0312 = (AbstractC0312) this.f2429.mo1622(5);
        abstractC0312.f2428 = m1819();
        return abstractC0312;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC0312 m1818(AbstractC0583 abstractC0583) {
        AbstractC0583 abstractC05832 = this.f2429;
        if (abstractC05832.equals(abstractC0583)) {
            return this;
        }
        if (!this.f2428.m2540()) {
            AbstractC0583 abstractC05833 = (AbstractC0583) abstractC05832.mo1622(4);
            AbstractC0583 abstractC05834 = this.f2428;
            C0440 c0440 = C0440.f2745;
            c0440.getClass();
            c0440.m2222(abstractC05833.getClass()).mo1843(abstractC05833, abstractC05834);
            this.f2428 = abstractC05833;
        }
        AbstractC0583 abstractC05835 = this.f2428;
        C0440 c04402 = C0440.f2745;
        c04402.getClass();
        c04402.m2222(abstractC05835.getClass()).mo1843(abstractC05835, abstractC0583);
        return this;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC0583 m1819() {
        if (!this.f2428.m2540()) {
            return this.f2428;
        }
        AbstractC0583 abstractC0583 = this.f2428;
        abstractC0583.getClass();
        C0440 c0440 = C0440.f2745;
        c0440.getClass();
        c0440.m2222(abstractC0583.getClass()).mo1846(abstractC0583);
        abstractC0583.m2539();
        return this.f2428;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m1820() {
        if (this.f2428.m2540()) {
            return;
        }
        AbstractC0583 abstractC0583 = (AbstractC0583) this.f2429.mo1622(4);
        AbstractC0583 abstractC05832 = this.f2428;
        C0440 c0440 = C0440.f2745;
        c0440.getClass();
        c0440.m2222(abstractC0583.getClass()).mo1843(abstractC0583, abstractC05832);
        this.f2428 = abstractC0583;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC0583 m1821() {
        AbstractC0583 abstractC0583M1819 = m1819();
        if (AbstractC0583.m2533(abstractC0583M1819, true)) {
            return abstractC0583M1819;
        }
        throw new zznu("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m1822(byte[] bArr, int i, C0350 c0350) throws zzlk {
        if (!this.f2428.m2540()) {
            AbstractC0583 abstractC0583 = (AbstractC0583) this.f2429.mo1622(4);
            AbstractC0583 abstractC05832 = this.f2428;
            C0440 c0440 = C0440.f2745;
            c0440.getClass();
            c0440.m2222(abstractC0583.getClass()).mo1843(abstractC0583, abstractC05832);
            this.f2428 = abstractC0583;
        }
        try {
            C0440 c04402 = C0440.f2745;
            AbstractC0583 abstractC05833 = this.f2428;
            c04402.getClass();
            InterfaceC0494 interfaceC0494M2222 = c04402.m2222(abstractC05833.getClass());
            AbstractC0583 abstractC05834 = this.f2428;
            C0382 c0382 = new C0382();
            c0350.getClass();
            interfaceC0494M2222.mo1847(abstractC05834, bArr, 0, i, c0382);
        } catch (zzlk e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzlk.m1616();
        }
    }
}
