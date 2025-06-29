package p141;

import android.net.Uri;
import android.util.SparseArray;
import androidx.leanback.widget.ﾞᐧ;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import com.google.android.gms.internal.measurement.C0559;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;
import p331.C3761;
import p345.AbstractC3968;
import p345.C3930;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4456;

/* renamed from: ˉˑ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2209 implements Closeable {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f8715;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ﾞᐧ f8717;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Uri f8719;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f8720;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f8721;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C4456 f8722;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public RunnableC2195 f8723;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final SocketFactory f8725;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ﾞᐧ f8726;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C0559 f8727;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f8729;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public String f8733;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ArrayDeque f8718 = new ArrayDeque();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final SparseArray f8730 = new SparseArray();

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ᐧʻ f8732 = new ᐧʻ(this);

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C2203 f8724 = new C2203(new C3761(this));

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f8716 = 60000;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public long f8728 = -9223372036854775807L;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f8731 = -1;

    public C2209(ﾞᐧ r1, ﾞᐧ r2, String str, Uri uri, SocketFactory socketFactory) {
        this.f8726 = r1;
        this.f8717 = r2;
        this.f8720 = str;
        this.f8725 = socketFactory;
        this.f8719 = AbstractC2214.m6186(uri);
        this.f8727 = AbstractC2214.m6188(uri);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m6141(C2209 c2209, RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException) {
        c2209.getClass();
        if (c2209.f8721) {
            c2209.f8717.ᴵʼ(rtspMediaSource$RtspPlaybackException);
            return;
        }
        String message = rtspMediaSource$RtspPlaybackException.getMessage();
        if (message == null) {
            message = "";
        }
        c2209.f8726.ʾʼ(message, rtspMediaSource$RtspPlaybackException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC2195 runnableC2195 = this.f8723;
        if (runnableC2195 != null) {
            runnableC2195.close();
            this.f8723 = null;
            Uri uri = this.f8719;
            String str = this.f8733;
            str.getClass();
            ᐧʻ r2 = this.f8732;
            C2209 c2209 = (C2209) r2.ᐧˋ;
            int i = c2209.f8731;
            if (i != -1 && i != 0) {
                c2209.f8731 = 0;
                r2.ﹳˑ(r2.ˏʾ(12, str, C3930.f15266, uri));
            }
        }
        this.f8724.close();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6144() {
        long jM10171;
        C2211 c2211 = (C2211) this.f8718.pollFirst();
        if (c2211 == null) {
            C2210 c2210 = (C2210) this.f8717.ˆʿ;
            long j = c2210.f8742;
            if (j != -9223372036854775807L) {
                jM10171 = AbstractC4470.m10171(j);
            } else {
                long j2 = c2210.f8752;
                jM10171 = j2 != -9223372036854775807L ? AbstractC4470.m10171(j2) : 0L;
            }
            c2210.f8745.m6145(jM10171);
            return;
        }
        Uri uriM6174 = c2211.m6174();
        AbstractC4464.m10146(c2211.f8757);
        String str = c2211.f8757;
        String str2 = this.f8733;
        ᐧʻ r5 = this.f8732;
        ((C2209) r5.ᐧˋ).f8731 = 0;
        AbstractC3968.m9194("Transport", str);
        r5.ﹳˑ(r5.ˏʾ(10, str2, C3930.m9139(1, new Object[]{"Transport", str}, null), uriM6174));
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m6145(long j) {
        Uri uri = this.f8719;
        String str = this.f8733;
        str.getClass();
        ᐧʻ r5 = this.f8732;
        int i = ((C2209) r5.ᐧˋ).f8731;
        AbstractC4464.m10132(i == 1 || i == 2);
        C2208 c2208 = C2208.f8711;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i2 = AbstractC4470.f17202;
        r5.ﹳˑ(r5.ˏʾ(6, str, C3930.m9139(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m6146(long j) {
        if (this.f8731 == 2 && !this.f8715) {
            Uri uri = this.f8719;
            String str = this.f8733;
            str.getClass();
            ᐧʻ r3 = this.f8732;
            C2209 c2209 = (C2209) r3.ᐧˋ;
            AbstractC4464.m10132(c2209.f8731 == 2);
            r3.ﹳˑ(r3.ˏʾ(5, str, C3930.f15266, uri));
            c2209.f8715 = true;
        }
        this.f8728 = j;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Socket m6147(Uri uri) {
        AbstractC4464.m10142(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f8725.createSocket(host, port);
    }
}
