package p312;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;
import p049.C1309;
import p383.AbstractC4464;

/* renamed from: ᐧᴵ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3587 implements InterfaceC3585 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3589[] f13787;

    /* renamed from: ˉי, reason: contains not printable characters */
    public DecoderException f13788;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f13789;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f13790;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f13791;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f13792;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1309 f13794;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC3584[] f13795;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f13796;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C3589 f13799;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f13786 = new Object();

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f13797 = -9223372036854775807L;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ArrayDeque f13793 = new ArrayDeque();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayDeque f13798 = new ArrayDeque();

    public AbstractC3587(C3589[] c3589Arr, AbstractC3584[] abstractC3584Arr) {
        this.f13787 = c3589Arr;
        this.f13796 = c3589Arr.length;
        for (int i = 0; i < this.f13796; i++) {
            this.f13787[i] = mo1106();
        }
        this.f13795 = abstractC3584Arr;
        this.f13792 = abstractC3584Arr.length;
        for (int i2 = 0; i2 < this.f13792; i2++) {
            this.f13795[i2] = mo1104();
        }
        C1309 c1309 = new C1309(this);
        this.f13794 = c1309;
        c1309.start();
    }

    @Override // p312.InterfaceC3585
    public final void flush() {
        synchronized (this.f13786) {
            try {
                this.f13791 = true;
                this.f13790 = 0;
                C3589 c3589 = this.f13799;
                if (c3589 != null) {
                    c3589.mo8492();
                    int i = this.f13796;
                    this.f13796 = i + 1;
                    this.f13787[i] = c3589;
                    this.f13799 = null;
                }
                while (!this.f13793.isEmpty()) {
                    C3589 c35892 = (C3589) this.f13793.removeFirst();
                    c35892.mo8492();
                    int i2 = this.f13796;
                    this.f13796 = i2 + 1;
                    this.f13787[i2] = c35892;
                }
                while (!this.f13798.isEmpty()) {
                    ((AbstractC3584) this.f13798.removeFirst()).mo1101();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p312.InterfaceC3585
    /* renamed from: ʽᐧ */
    public void mo1102() throws InterruptedException {
        synchronized (this.f13786) {
            this.f13789 = true;
            this.f13786.notify();
        }
        try {
            this.f13794.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: ˉי */
    public abstract DecoderException mo1103(C3589 c3589, AbstractC3584 abstractC3584, boolean z);

    @Override // p312.InterfaceC3585
    /* renamed from: ˉⁱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC3584 mo6378() {
        synchronized (this.f13786) {
            try {
                DecoderException decoderException = this.f13788;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f13798.isEmpty()) {
                    return null;
                }
                return (AbstractC3584) this.f13798.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m8487(long j) {
        boolean z;
        synchronized (this.f13786) {
            long j2 = this.f13797;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m8488() {
        DecoderException decoderExceptionMo1107;
        synchronized (this.f13786) {
            while (!this.f13789) {
                try {
                    if (!this.f13793.isEmpty() && this.f13792 > 0) {
                        break;
                    }
                    this.f13786.wait();
                } finally {
                }
            }
            if (this.f13789) {
                return false;
            }
            C3589 c3589 = (C3589) this.f13793.removeFirst();
            AbstractC3584[] abstractC3584Arr = this.f13795;
            int i = this.f13792 - 1;
            this.f13792 = i;
            AbstractC3584 abstractC3584 = abstractC3584Arr[i];
            boolean z = this.f13791;
            this.f13791 = false;
            if (c3589.m4401(4)) {
                abstractC3584.m4409(4);
            } else {
                abstractC3584.f13784 = c3589.f13807;
                if (c3589.m4401(134217728)) {
                    abstractC3584.m4409(134217728);
                }
                if (!m8487(c3589.f13807)) {
                    abstractC3584.f13783 = true;
                }
                try {
                    decoderExceptionMo1107 = mo1103(c3589, abstractC3584, z);
                } catch (OutOfMemoryError e) {
                    decoderExceptionMo1107 = mo1107(e);
                } catch (RuntimeException e2) {
                    decoderExceptionMo1107 = mo1107(e2);
                }
                if (decoderExceptionMo1107 != null) {
                    synchronized (this.f13786) {
                        this.f13788 = decoderExceptionMo1107;
                    }
                    return false;
                }
            }
            synchronized (this.f13786) {
                try {
                    if (this.f13791) {
                        abstractC3584.mo1101();
                    } else if (abstractC3584.f13783) {
                        this.f13790++;
                        abstractC3584.mo1101();
                    } else {
                        abstractC3584.f13785 = this.f13790;
                        this.f13790 = 0;
                        this.f13798.addLast(abstractC3584);
                    }
                    c3589.mo8492();
                    int i2 = this.f13796;
                    this.f13796 = i2 + 1;
                    this.f13787[i2] = c3589;
                } finally {
                }
            }
            return true;
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m8489(AbstractC3584 abstractC3584) {
        synchronized (this.f13786) {
            abstractC3584.mo1100();
            int i = this.f13792;
            this.f13792 = i + 1;
            this.f13795[i] = abstractC3584;
            if (!this.f13793.isEmpty() && this.f13792 > 0) {
                this.f13786.notify();
            }
        }
    }

    /* renamed from: ˏᵢ */
    public abstract AbstractC3584 mo1104();

    @Override // p312.InterfaceC3585
    /* renamed from: ـﹶ */
    public final void mo6381(long j) {
        synchronized (this.f13786) {
            try {
                AbstractC4464.m10132(this.f13796 == this.f13787.length || this.f13791);
                this.f13797 = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p312.InterfaceC3585
    /* renamed from: ٴˎ */
    public final Object mo6382() {
        C3589 c3589;
        synchronized (this.f13786) {
            try {
                DecoderException decoderException = this.f13788;
                if (decoderException != null) {
                    throw decoderException;
                }
                AbstractC4464.m10132(this.f13799 == null);
                int i = this.f13796;
                if (i == 0) {
                    c3589 = null;
                } else {
                    C3589[] c3589Arr = this.f13787;
                    int i2 = i - 1;
                    this.f13796 = i2;
                    c3589 = c3589Arr[i2];
                }
                this.f13799 = c3589;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3589;
    }

    /* renamed from: ᐧʻ */
    public abstract C3589 mo1106();

    @Override // p312.InterfaceC3585
    /* renamed from: ᴵʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo6384(C3589 c3589) {
        synchronized (this.f13786) {
            try {
                DecoderException decoderException = this.f13788;
                if (decoderException != null) {
                    throw decoderException;
                }
                AbstractC4464.m10142(c3589 == this.f13799);
                this.f13793.addLast(c3589);
                if (!this.f13793.isEmpty() && this.f13792 > 0) {
                    this.f13786.notify();
                }
                this.f13799 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹶˆ */
    public abstract DecoderException mo1107(Throwable th);
}
