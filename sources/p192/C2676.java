package p192;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.leanback.widget.RunnableC0134;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p200.C2752;
import p260.C3222;
import p456.C5349;
import ˈי.ʾˈ;
import ﹳᴵ.ˉי;

/* renamed from: ˎˉ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2676 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final Object f10574 = new Object();

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static volatile C2676 f10575;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2752 f10576;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2668 f10577;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f10578;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public volatile int f10579;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f10580;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC2663 f10581;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ˉי f10582;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Handler f10583;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C2675 f10584;

    public C2676(C2672 c2672) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f10580 = reentrantReadWriteLock;
        this.f10579 = 3;
        InterfaceC2663 interfaceC2663 = (InterfaceC2663) c2672.f5785;
        this.f10581 = interfaceC2663;
        int i = c2672.f5787;
        this.f10578 = i;
        this.f10584 = (C2675) c2672.f5786;
        this.f10583 = new Handler(Looper.getMainLooper());
        this.f10576 = new C2752(0);
        this.f10582 = new ˉי(25);
        C2668 c2668 = new C2668(this);
        this.f10577 = c2668;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f10579 = 0;
            } catch (Throwable th) {
                this.f10580.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m6854() == 0) {
            try {
                interfaceC2663.mo3956(new C2654(c2668));
            } catch (Throwable th2) {
                m6858(th2);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2676 m6853() {
        C2676 c2676;
        synchronized (f10574) {
            try {
                c2676 = f10575;
                if (!(c2676 != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c2676;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6854() {
        this.f10580.readLock().lock();
        try {
            return this.f10579;
        } finally {
            this.f10580.readLock().unlock();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final CharSequence m6855(CharSequence charSequence, int i, int i2) {
        C2658[] c2658Arr;
        if (!(m6854() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        ʾˈ.ˑʽ("start should be <= than end", i <= i2);
        C2674 c2674 = null;
        if (charSequence == null) {
            return null;
        }
        ʾˈ.ˑʽ("start should be < than charSequence length", i <= charSequence.length());
        ʾˈ.ˑʽ("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C3222 c3222 = (C3222) this.f10577.f10564;
        c3222.getClass();
        boolean z = charSequence instanceof C2673;
        if (z) {
            ((C2673) charSequence).m6850();
        }
        if (z) {
            c2674 = new C2674((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    c2674 = new C2674((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C2658.class) <= i2) {
                    c2674 = new C2674();
                    c2674.f10571 = false;
                    c2674.f10570 = new SpannableString(charSequence);
                }
            } finally {
                if (z) {
                    ((C2673) charSequence).m6847();
                }
            }
        }
        if (c2674 != null && (c2658Arr = (C2658[]) c2674.f10570.getSpans(i, i2, C2658.class)) != null && c2658Arr.length > 0) {
            for (C2658 c2658 : c2658Arr) {
                int spanStart = c2674.f10570.getSpanStart(c2658);
                int spanEnd = c2674.f10570.getSpanEnd(c2658);
                if (spanStart != i2) {
                    c2674.removeSpan(c2658);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            C2674 c26742 = (C2674) c3222.m7941(charSequence, i3, i4, Integer.MAX_VALUE, false, new C5349(9, c2674, (ˉי) c3222.f12538, false));
            if (c26742 != null) {
                Spannable spannable = c26742.f10570;
                if (z) {
                    ((C2673) charSequence).m6847();
                }
                return spannable;
            }
            if (!z) {
                return charSequence;
            }
        } else if (!z) {
            return charSequence;
        }
        return charSequence;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6856() {
        if (!(this.f10578 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m6854() == 1) {
            return;
        }
        this.f10580.writeLock().lock();
        try {
            if (this.f10579 == 0) {
                return;
            }
            this.f10579 = 0;
            this.f10580.writeLock().unlock();
            C2668 c2668 = this.f10577;
            C2676 c2676 = (C2676) c2668.f10563;
            try {
                c2676.f10581.mo3956(new C2654(c2668));
            } catch (Throwable th) {
                c2676.m6858(th);
            }
        } finally {
            this.f10580.writeLock().unlock();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m6857(AbstractC2669 abstractC2669) {
        ʾˈ.ʿʼ(abstractC2669, "initCallback cannot be null");
        this.f10580.writeLock().lock();
        try {
            if (this.f10579 == 1 || this.f10579 == 2) {
                this.f10583.post(new RunnableC0134(Arrays.asList(abstractC2669), this.f10579, (Throwable) null));
            } else {
                this.f10576.add(abstractC2669);
            }
            this.f10580.writeLock().unlock();
        } catch (Throwable th) {
            this.f10580.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6858(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f10580.writeLock().lock();
        try {
            this.f10579 = 2;
            arrayList.addAll(this.f10576);
            this.f10576.clear();
            this.f10580.writeLock().unlock();
            this.f10583.post(new RunnableC0134(arrayList, this.f10579, th));
        } catch (Throwable th2) {
            this.f10580.writeLock().unlock();
            throw th2;
        }
    }
}
