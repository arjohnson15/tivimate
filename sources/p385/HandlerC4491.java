package p385;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import java.io.IOException;
import p014.C1060;
import p193.C2705;
import p383.AbstractC4464;

/* renamed from: ᵢﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class HandlerC4491 extends Handler {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C4488 f17286;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f17287;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4491(C4488 c4488, Looper looper) {
        super(looper);
        this.f17286 = c4488;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable thMo8041;
        C4477 c4477 = (C4477) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                thMo8041 = this.f17286.f17270.mo8041((C4495) c4477.f17242);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                C4488 c4488 = this.f17286;
                thMo8041 = c4488.f17270.mo8033(c4488.f17266, (C4484) c4477.f17242);
            }
        } catch (MediaDrmCallbackException e) {
            boolean zM10254 = m10254(message, e);
            thMo8041 = e;
            if (zM10254) {
                return;
            }
        } catch (Exception e2) {
            AbstractC4464.m10127("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            thMo8041 = e2;
        }
        C2705 c2705 = this.f17286.f17283;
        long j = c4477.f17243;
        c2705.getClass();
        synchronized (this) {
            try {
                if (!this.f17287) {
                    this.f17286.f17278.obtainMessage(message.what, Pair.create(c4477.f17242, thMo8041)).sendToTarget();
                }
            } finally {
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m10254(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
        C4477 c4477 = (C4477) message.obj;
        if (!c4477.f17241) {
            return false;
        }
        int i = c4477.f17244 + 1;
        c4477.f17244 = i;
        this.f17286.f17283.getClass();
        if (i > 3) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        long jM6871 = this.f17286.f17283.m6871(new C1060(c4477.f17244, mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new DefaultDrmSession$UnexpectedDrmSessionException(mediaDrmCallbackException.getCause())));
        if (jM6871 == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f17287) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jM6871);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
