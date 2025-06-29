package p141;

import androidx.leanback.widget.ﾞᐧ;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import p034.C1228;
import p076.C1659;
import p331.C3761;
import p345.C3932;
import p353.AbstractC4010;
import p383.AbstractC4464;
import ʻˉ.ᐧˋ;

/* renamed from: ˉˑ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2203 implements Closeable {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f8663 = 0;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Socket f8665;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2218 f8667;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3761 f8668;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public volatile boolean f8669;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1659 f8664 = new C1659("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Map f8666 = DesugarCollections.synchronizedMap(new HashMap());

    static {
        Charset charset = AbstractC4010.f15451;
    }

    public C2203(C3761 c3761) {
        this.f8668 = c3761;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8669) {
            return;
        }
        try {
            C2218 c2218 = this.f8667;
            if (c2218 != null) {
                c2218.close();
            }
            this.f8664.m5331(null);
            Socket socket = this.f8665;
            if (socket != null) {
                socket.close();
            }
            this.f8669 = true;
        } catch (Throwable th) {
            this.f8669 = true;
            throw th;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6136(C3932 c3932) {
        AbstractC4464.m10146(this.f8667);
        C2218 c2218 = this.f8667;
        c2218.getClass();
        c2218.f8783.post(new ᐧˋ(c2218, new C1228(AbstractC2214.f8767).m4414(c3932).getBytes(AbstractC4010.f15450), c3932, 8));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6137(Socket socket) {
        this.f8665 = socket;
        this.f8667 = new C2218(this, socket.getOutputStream());
        this.f8664.m5334(new C2219(this, socket.getInputStream()), new ﾞᐧ(18, this), 0);
    }
}
