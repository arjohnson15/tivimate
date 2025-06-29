package p076;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.lifecycle.RunnableC0246;
import java.nio.ByteBuffer;
import p007.C0959;
import p061.C1423;
import p312.C3583;
import p362.C4109;
import p362.C4117;
import p362.C4121;
import p362.InterfaceC4111;
import p362.InterfaceC4129;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʿˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1665 implements InterfaceC4129 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f6501;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object f6502;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f6503;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f6504;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f6505;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1665(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            if (r10 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            android.content.Context r0 = r10.getApplicationContext()
        Lb:
            r9.f6503 = r0
            int r0 = p383.AbstractC4470.f17202
            if (r10 == 0) goto L2a
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            if (r10 == 0) goto L2a
            java.lang.String r10 = r10.getNetworkCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L2a
            java.lang.String r10 = p395.AbstractC4535.m10341(r10)
            goto L36
        L2a:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.getCountry()
            java.lang.String r10 = p395.AbstractC4535.m10341(r10)
        L36:
            int[] r10 = p076.C1660.m5336(r10)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 8
            r0.<init>(r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            ᵎᴵ.ˉᵎ r4 = p076.C1660.f6478
            r5 = r10[r1]
            java.lang.Object r5 = r4.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            ᵎᴵ.ˉᵎ r6 = p076.C1660.f6476
            r7 = 1
            r8 = r10[r7]
            java.lang.Object r6 = r6.get(r8)
            java.lang.Long r6 = (java.lang.Long) r6
            r0.put(r5, r6)
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            ᵎᴵ.ˉᵎ r8 = p076.C1660.f6477
            r2 = r10[r2]
            java.lang.Object r2 = r8.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.put(r6, r2)
            r2 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            ᵎᴵ.ˉᵎ r8 = p076.C1660.f6480
            r3 = r10[r3]
            java.lang.Object r3 = r8.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r0.put(r6, r3)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            ᵎᴵ.ˉᵎ r6 = p076.C1660.f6475
            r5 = r10[r5]
            java.lang.Object r5 = r6.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            ᵎᴵ.ˉᵎ r5 = p076.C1660.f6479
            r2 = r10[r2]
            java.lang.Object r2 = r5.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.put(r3, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10 = r10[r1]
            java.lang.Object r10 = r4.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            r0.put(r2, r10)
            r9.f6504 = r0
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.f6501 = r10
            ᵢᵢ.ˏᴵ r10 = p383.C4460.f17177
            r9.f6502 = r10
            r9.f6505 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076.C1665.<init>(android.content.Context):void");
    }

    public C1665(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC4111 interfaceC4111) {
        this.f6503 = mediaCodec;
        this.f6504 = new C4109(handlerThread);
        this.f6502 = interfaceC4111;
        this.f6501 = 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m5340(C1665 c1665, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C4109 c4109 = (C4109) c1665.f6504;
        AbstractC4464.m10132(c4109.f15890 == null);
        HandlerThread handlerThread = c4109.f15882;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) c1665.f6503;
        mediaCodec.setCallback(c4109, handler);
        c4109.f15890 = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((InterfaceC4111) c1665.f6502).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        c1665.f6501 = 1;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m5341(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p362.InterfaceC4129
    public void flush() {
        ((InterfaceC4111) this.f6502).flush();
        ((MediaCodec) this.f6503).flush();
        C4109 c4109 = (C4109) this.f6504;
        synchronized (c4109.f15891) {
            c4109.f15885++;
            Handler handler = c4109.f15890;
            int i = AbstractC4470.f17202;
            handler.post(new RunnableC0246(26, c4109));
        }
        ((MediaCodec) this.f6503).start();
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo5342() {
        try {
            if (this.f6501 == 1) {
                ((InterfaceC4111) this.f6502).shutdown();
                C4109 c4109 = (C4109) this.f6504;
                synchronized (c4109.f15891) {
                    c4109.f15886 = true;
                    c4109.f15882.quit();
                    c4109.m9425();
                }
            }
            this.f6501 = 2;
            if (this.f6505) {
                return;
            }
            try {
                int i = AbstractC4470.f17202;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.f6503).stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f6505) {
                try {
                    int i2 = AbstractC4470.f17202;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.f6503).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo5343(Bundle bundle) {
        ((InterfaceC4111) this.f6502).mo9426(bundle);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public void mo5344(Surface surface) {
        ((MediaCodec) this.f6503).setOutputSurface(surface);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void mo5345(int i, boolean z) {
        ((MediaCodec) this.f6503).releaseOutputBuffer(i, z);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int mo5346(MediaCodec.BufferInfo bufferInfo) {
        int i;
        ((InterfaceC4111) this.f6502).mo9429();
        C4109 c4109 = (C4109) this.f6504;
        synchronized (c4109.f15891) {
            try {
                IllegalStateException illegalStateException = c4109.f15894;
                if (illegalStateException != null) {
                    c4109.f15894 = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c4109.f15884;
                if (codecException != null) {
                    c4109.f15884 = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c4109.f15887;
                if (cryptoException != null) {
                    c4109.f15887 = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(c4109.f15885 > 0 || c4109.f15886)) {
                    C1423 c1423 = c4109.f15883;
                    int i2 = c1423.f5793;
                    int i3 = c1423.f5794;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c1423.f5795[i2];
                        c1423.f5793 = (i2 + 1) & c1423.f5796;
                        if (i >= 0) {
                            AbstractC4464.m10146(c4109.f15889);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c4109.f15892.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (i == -2) {
                            c4109.f15889 = (MediaFormat) c4109.f15893.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo5347(int i, C3583 c3583, long j, int i2) {
        ((InterfaceC4111) this.f6502).mo9427(i, c3583, j, i2);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void mo5348(int i, int i2, long j, int i3) {
        ((InterfaceC4111) this.f6502).mo9428(i, i2, j, i3);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ByteBuffer mo5349(int i) {
        return ((MediaCodec) this.f6503).getInputBuffer(i);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public void mo5350(int i, long j) {
        ((MediaCodec) this.f6503).releaseOutputBuffer(i, j);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void mo5351(int i) {
        ((MediaCodec) this.f6503).setVideoScalingMode(i);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public void mo5352(C0959 c0959, Handler handler) {
        ((MediaCodec) this.f6503).setOnFrameRenderedListener(new C4121(this, c0959, 0), handler);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public ByteBuffer mo5353(int i) {
        return ((MediaCodec) this.f6503).getOutputBuffer(i);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public MediaFormat mo5354() {
        MediaFormat mediaFormat;
        C4109 c4109 = (C4109) this.f6504;
        synchronized (c4109.f15891) {
            try {
                mediaFormat = c4109.f15889;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean mo5355(C4117 c4117) {
        C4109 c4109 = (C4109) this.f6504;
        synchronized (c4109.f15891) {
            c4109.f15888 = c4117;
        }
        return true;
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int mo5356() {
        int i;
        ((InterfaceC4111) this.f6502).mo9429();
        C4109 c4109 = (C4109) this.f6504;
        synchronized (c4109.f15891) {
            try {
                IllegalStateException illegalStateException = c4109.f15894;
                if (illegalStateException != null) {
                    c4109.f15894 = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c4109.f15884;
                if (codecException != null) {
                    c4109.f15884 = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c4109.f15887;
                if (cryptoException != null) {
                    c4109.f15887 = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(c4109.f15885 > 0 || c4109.f15886)) {
                    C1423 c1423 = c4109.f15895;
                    int i2 = c1423.f5793;
                    int i3 = c1423.f5794;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c1423.f5795[i2];
                        c1423.f5793 = (i2 + 1) & c1423.f5796;
                    }
                }
            } finally {
            }
        }
        return i;
    }
}
