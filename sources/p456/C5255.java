package p456;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.HandlerC0413;
import p101.C1778;
import p331.C3759;
import p396.C4554;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˆﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5255 extends AbstractC5257 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4554 f20360;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public HandlerC0413 f20361;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f20362;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C1778 f20363;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3759 f20364;

    public C5255(C5236 c5236) {
        super(c5236);
        this.f20362 = true;
        this.f20360 = new C4554(this);
        C1778 c1778 = new C1778();
        c1778.f6899 = this;
        c1778.f6898 = new C5235(0, c1778, (C5236) ((ﹳﹳ) this).ᐧⁱ);
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c1778.f6900 = jElapsedRealtime;
        c1778.f6897 = jElapsedRealtime;
        this.f20363 = c1778;
        this.f20364 = new C3759(this);
    }

    @Override // p456.AbstractC5257
    /* renamed from: ᴵˋ */
    public final boolean mo11715() {
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m11755() {
        m11846();
        if (this.f20361 == null) {
            this.f20361 = new HandlerC0413(Looper.getMainLooper(), 0);
        }
    }
}
