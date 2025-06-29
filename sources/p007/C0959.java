package p007;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import p331.C3761;
import p362.InterfaceC4129;
import p383.AbstractC4470;

/* renamed from: ʻˉ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0959 implements Handler.Callback {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0950 f4256;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Handler f4257;

    public C0959(AbstractC0950 abstractC0950, InterfaceC4129 interfaceC4129) {
        this.f4256 = abstractC0950;
        Handler handlerM10200 = AbstractC4470.m10200(this);
        this.f4257 = handlerM10200;
        interfaceC4129.mo5352(this, handlerM10200);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = AbstractC4470.f17202;
        m3895(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3895(long j) {
        Surface surface;
        AbstractC0950 abstractC0950 = this.f4256;
        if (this != abstractC0950.f4198 || abstractC0950.f15961 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            abstractC0950.f15968 = true;
            return;
        }
        try {
            abstractC0950.m9449(j);
            abstractC0950.m3866(abstractC0950.f4194);
            abstractC0950.f15991.f19236++;
            C0969 c0969 = abstractC0950.f4184;
            boolean z = c0969.f4277 != 3;
            c0969.f4277 = 3;
            c0969.f4279.getClass();
            c0969.f4285 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
            if (z && (surface = abstractC0950.f4193) != null) {
                C3761 c3761 = abstractC0950.f4197;
                Handler handler = (Handler) c3761.f14527;
                if (handler != null) {
                    handler.post(new RunnableC0941(c3761, surface, SystemClock.elapsedRealtime()));
                }
                abstractC0950.f4199 = true;
            }
            abstractC0950.mo3856(j);
        } catch (ExoPlaybackException e) {
            abstractC0950.f15947 = e;
        }
    }
}
