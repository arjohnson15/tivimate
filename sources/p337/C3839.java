package p337;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.google.android.gms.internal.measurement.C0559;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p166.C2397;
import p166.C2423;
import p166.C2431;
import p166.C2441;
import p310.C3581;
import p312.C3589;
import p362.AbstractC4126;
import p362.C4116;
import p362.InterfaceC4118;
import p362.InterfaceC4129;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.InterfaceC4493;
import p438.C5074;
import p438.C5081;
import p438.C5096;
import p438.C5099;
import p438.InterfaceC5111;
import p438.SurfaceHolderCallbackC5075;
import p456.C5349;
import ʻˉ.ᐧˋ;
import ˊﹶ.ˋˉ;
import ᵎﹳ.ᐧʻ;
import ᵢˈ.ˉⁱ;

/* renamed from: ᵎˆ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3839 extends AbstractC4126 implements InterfaceC5111 {

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public C2431 f14741;

    /* renamed from: ʻـ, reason: contains not printable characters */
    public boolean f14742;

    /* renamed from: ˉ, reason: contains not printable characters */
    public final C0559 f14743;

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public int f14744;

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public long f14745;

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public boolean f14746;

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public boolean f14747;

    /* renamed from: יʾ, reason: contains not printable characters */
    public boolean f14748;

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public boolean f14749;

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final Context f14750;

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public C2431 f14751;

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final ˉⁱ f14752;

    /* renamed from: ﾞי, reason: contains not printable characters */
    public int f14753;

    public C3839(Context context, InterfaceC4118 interfaceC4118, C3581 c3581, boolean z, Handler handler, SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075, ˉⁱ r13) {
        super(1, interfaceC4118, c3581, z, 44100.0f);
        this.f14750 = context.getApplicationContext();
        this.f14752 = r13;
        this.f14744 = -1000;
        this.f14743 = new C0559(handler, surfaceHolderCallbackC5075);
        r13.ـﹶ.f14844 = new ˋˉ(25, this);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m8986() {
        long jMax = this.f14752.ᵎˏ(mo1122());
        if (jMax != Long.MIN_VALUE) {
            if (!this.f14749) {
                jMax = Math.max(this.f14745, jMax);
            }
            this.f14745 = jMax;
            this.f14749 = false;
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final boolean mo8987(C2431 c2431) {
        C5081 c5081 = this.f19484;
        c5081.getClass();
        if (c5081.f19308 != 0) {
            int iM8990 = m8990(c2431);
            if ((iM8990 & 512) != 0) {
                C5081 c50812 = this.f19484;
                c50812.getClass();
                if (c50812.f19308 == 2 || (iM8990 & 1024) != 0) {
                    return true;
                }
                if (c2431.f9668 == 0 && c2431.f9680 == 0) {
                    return true;
                }
            }
        }
        return this.f14752.ـﹶ.mo9007(c2431);
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʽᐧ */
    public final void mo1113(C2441 c2441) {
        this.f14752.ʽᐧ(c2441);
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ʿʼ */
    public final C2441 mo1114() {
        return this.f14752.ـﹶ.f14819;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ʿˊ */
    public final C5099 mo3850(C5349 c5349) throws ExoPlaybackException {
        C2431 c2431 = (C2431) c5349.f20757;
        c2431.getClass();
        this.f14741 = c2431;
        C5099 c5099Mo3850 = super.mo3850(c5349);
        C0559 c0559 = this.f14743;
        Handler handler = (Handler) c0559.f2912;
        if (handler != null) {
            handler.post(new ᐧˋ(c0559, c2431, c5099Mo3850, 19));
        }
        return c5099Mo3850;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9 A[Catch: AudioSink$ConfigurationException -> 0x00f7, TryCatch #0 {AudioSink$ConfigurationException -> 0x00f7, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:52:0x00f9, B:53:0x00fc), top: B:57:0x00d9 }] */
    @Override // p362.AbstractC4126
    /* renamed from: ˉᵎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3852(p166.C2431 r14, android.media.MediaFormat r15) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3839.mo3852(ˊﹶ.ᵎـ, android.media.MediaFormat):void");
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ˉⁱ */
    public final boolean mo1119() {
        return this.f14752.ـﹶ.mo8996() || super.mo1119();
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˊᵔ */
    public final void mo3854(Exception exc) {
        AbstractC4464.m10147("MediaCodecAudioRenderer", "Audio codec error", exc);
        C0559 c0559 = this.f14743;
        Handler handler = (Handler) c0559.f2912;
        if (handler != null) {
            handler.post(new RunnableC3819(c0559, exc, 3));
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˋﾞ */
    public final void mo3855(long j, long j2, String str) {
        C0559 c0559 = this.f14743;
        Handler handler = (Handler) c0559.f2912;
        if (handler != null) {
            handler.post(new RunnableC3819(c0559, str, j, j2));
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˎˑ */
    public final C5099 mo3857(C4116 c4116, C2431 c2431, C2431 c24312) {
        C5099 c5099M9434 = c4116.m9434(c2431, c24312);
        boolean z = this.f15940 == null && mo8987(c24312);
        int i = c5099M9434.f19403;
        if (z) {
            i |= 32768;
        }
        if (m8988(c4116, c24312) > this.f14753) {
            i |= 64;
        }
        int i2 = i;
        return new C5099(c4116.f15902, c2431, c24312, i2 != 0 ? 0 : c5099M9434.f19406, i2);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˎٴ */
    public final void mo3858() {
        ˉⁱ r0 = this.f14752;
        this.f14742 = false;
        try {
            try {
                m9448();
                m9455();
            } finally {
                ᐧʻ.יʻ(this.f15940, (InterfaceC4493) null);
                this.f15940 = null;
            }
        } finally {
            if (this.f14747) {
                this.f14747 = false;
                r0.ـﹶ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    @Override // p362.AbstractC4126
    /* renamed from: ˎᵔ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p362.C4123 mo3859(p362.C4116 r12, p166.C2431 r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3839.mo3859(ᵔᵢ.ˏʾ, ˊﹶ.ᵎـ, android.media.MediaCrypto, float):ᵔᵢ.ᐧʻ");
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m8988(C4116 c4116, C2431 c2431) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c4116.f15902) || (i = AbstractC4470.f17202) >= 24 || (i == 23 && AbstractC4470.m10183(this.f14750))) {
            return c2431.f9683;
        }
        return -1;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏʾ */
    public final boolean mo1122() {
        return this.f15934 && this.f14752.ـﹶ.mo9003();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏᴵ */
    public final void mo1123(boolean z, boolean z2) {
        C5074 c5074 = new C5074();
        this.f15991 = c5074;
        C0559 c0559 = this.f14743;
        Handler handler = (Handler) c0559.f2912;
        if (handler != null) {
            handler.post(new RunnableC3819(c0559, c5074, 0));
        }
        C5081 c5081 = this.f19484;
        c5081.getClass();
        boolean z3 = c5081.f19307;
        ˉⁱ r5 = this.f14752;
        if (z3) {
            r5.ˏᵢ();
        } else {
            r5.ﹳˎ();
        }
        this.f19488.getClass();
        r5.getClass();
        this.f19490.getClass();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˏᵢ */
    public final InterfaceC5111 mo1124() {
        return this;
    }

    @Override // p438.AbstractC5115, p438.InterfaceC5109
    /* renamed from: ˑʽ */
    public final void mo1125(int i, Object obj) {
        ˉⁱ r1 = this.f14752;
        if (i == 2) {
            obj.getClass();
            r1.יʻ(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            C2397 c2397 = (C2397) obj;
            c2397.getClass();
            r1.ˏʾ(c2397);
            return;
        }
        if (i == 6) {
            C2423 c2423 = (C2423) obj;
            c2423.getClass();
            r1.ˋˊ(c2423);
            return;
        }
        if (i == 12) {
            if (AbstractC4470.f17202 >= 23) {
                AbstractC3833.m8948(r1, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f14744 = ((Integer) obj).intValue();
            InterfaceC4129 interfaceC4129 = this.f15961;
            if (interfaceC4129 != null && AbstractC4470.f17202 >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f14744));
                interfaceC4129.mo5343(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            r1.ﾞˊ(((Boolean) obj).booleanValue());
        } else if (i == 10) {
            obj.getClass();
            r1.ˑי(((Integer) obj).intValue());
        } else if (i == 11) {
            this.f15971 = (C5096) obj;
        }
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ˑי */
    public final void mo1126(boolean z, long j) throws ExoPlaybackException {
        super.mo1126(z, j);
        this.f14752.flush();
        this.f14745 = j;
        this.f14742 = false;
        this.f14749 = true;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ˑⁱ */
    public final float mo3860(float f, C2431[] c2431Arr) {
        int iMax = -1;
        for (C2431 c2431 : c2431Arr) {
            int i = c2431.f9681;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // p362.AbstractC4126
    /* renamed from: יˋ */
    public final void mo3862() {
        this.f14752.ﾞʽ();
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ـﹶ */
    public final boolean mo1128() {
        boolean z = this.f14742;
        this.f14742 = false;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    @Override // p362.AbstractC4126
    /* renamed from: ٴᐧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo3863(long r1, long r3, p362.InterfaceC4129 r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, p166.C2431 r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r0 = this;
            r6.getClass()
            ˊﹶ.ᵎـ r1 = r0.f14751
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r8 & 2
            if (r1 == 0) goto L14
            r5.getClass()
            r5.mo5345(r7, r3)
            return r2
        L14:
            ᵢˈ.ˉⁱ r1 = r0.f14752
            if (r12 == 0) goto L28
            if (r5 == 0) goto L1d
            r5.mo5345(r7, r3)
        L1d:
            ﹶﾞ.ʿʼ r3 = r0.f15991
            int r4 = r3.f19243
            int r4 = r4 + r9
            r3.f19243 = r4
            r1.ﾞʽ()
            return r2
        L28:
            ᵎˆ.ﹳﹶ r1 = r1.ـﹶ     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L3e androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L58
            boolean r1 = r1.mo8999(r6, r10, r9)     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L3e androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L58
            if (r1 == 0) goto L3d
            if (r5 == 0) goto L35
            r5.mo5345(r7, r3)
        L35:
            ﹶﾞ.ʿʼ r1 = r0.f15991
            int r3 = r1.f19236
            int r3 = r3 + r9
            r1.f19236 = r3
            return r2
        L3d:
            return r3
        L3e:
            r1 = move-exception
            boolean r2 = r0.f15984
            if (r2 == 0) goto L4f
            ﹶﾞ.ˊᵔ r2 = r0.f19484
            r2.getClass()
            int r2 = r2.f19308
            if (r2 == 0) goto L4f
            r2 = 5003(0x138b, float:7.01E-42)
            goto L51
        L4f:
            r2 = 5002(0x138a, float:7.009E-42)
        L51:
            boolean r3 = r1.f1413
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.m11339(r1, r14, r3, r2)
            throw r1
        L58:
            r1 = move-exception
            ˊﹶ.ᵎـ r2 = r0.f14741
            boolean r3 = r0.f15984
            if (r3 == 0) goto L6b
            ﹶﾞ.ˊᵔ r3 = r0.f19484
            r3.getClass()
            int r3 = r3.f19308
            if (r3 == 0) goto L6b
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6d
        L6b:
            r3 = 5001(0x1389, float:7.008E-42)
        L6d:
            boolean r4 = r1.f1410
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.m11339(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3839.mo3863(long, long, ᵔᵢ.ﹶˆ, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, ˊﹶ.ᵎـ):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    @Override // p362.AbstractC4126
    /* renamed from: ᐧʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo3864(p362.InterfaceC4115 r17, p166.C2431 r18) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3839.mo3864(ᵔᵢ.ˎٴ, ˊﹶ.ᵎـ):int");
    }

    @Override // p362.AbstractC4126, p438.AbstractC5115
    /* renamed from: ᴵʿ */
    public final void mo1131() {
        C0559 c0559 = this.f14743;
        this.f14747 = true;
        this.f14741 = null;
        try {
            this.f14752.flush();
            try {
                super.mo1131();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo1131();
                throw th;
            } finally {
            }
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᵎʽ */
    public final void mo3868(String str) {
        C0559 c0559 = this.f14743;
        Handler handler = (Handler) c0559.f2912;
        if (handler != null) {
            handler.post(new RunnableC3819(c0559, str, 6));
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᵎˏ */
    public final void mo1132() {
        this.f14752.ᵎـ();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᵎـ */
    public final void mo3871() {
        this.f14752.getClass();
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final void mo8989() throws ExoPlaybackException {
        try {
            this.f14752.ˉי();
        } catch (AudioSink$WriteException e) {
            throw m11339(e, e.f1414, e.f1413, this.f15984 ? 5003 : 5002);
        }
    }

    @Override // p362.AbstractC4126
    /* renamed from: ᵔﹳ */
    public final void mo3873(C3589 c3589) {
        C2431 c2431;
        if (AbstractC4470.f17202 < 29 || (c2431 = c3589.f13802) == null || !Objects.equals(c2431.f9667, "audio/opus") || !this.f15984) {
            return;
        }
        ByteBuffer byteBuffer = c3589.f13801;
        byteBuffer.getClass();
        c3589.f13802.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            this.f14752.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // p362.AbstractC4126
    /* renamed from: ᵢٴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList mo3875(p362.InterfaceC4115 r4, p166.C2431 r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r5.f9667
            if (r1 != 0) goto L8
            ᵎᴵ.ˉᵎ r4 = p345.C3932.f15274
            goto L31
        L8:
            ᵢˈ.ˉⁱ r1 = r3.f14752
            ᵎˆ.ﹳﹶ r1 = r1.ـﹶ
            boolean r1 = r1.mo9007(r5)
            if (r1 == 0) goto L2d
            java.lang.String r1 = "audio/raw"
            java.util.List r1 = p362.AbstractC4130.m9468(r1, r0, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L20
            r1 = 0
            goto L26
        L20:
            java.lang.Object r1 = r1.get(r0)
            ᵔᵢ.ˏʾ r1 = (p362.C4116) r1
        L26:
            if (r1 == 0) goto L2d
            ᵎᴵ.ˉᵎ r4 = p345.AbstractC3980.m9207(r1)
            goto L31
        L2d:
            ᵎᴵ.ˉᵎ r4 = p362.AbstractC4130.m9474(r4, r5, r6, r0)
        L31:
            java.util.regex.Pattern r6 = p362.AbstractC4130.f16009
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            ᵔᵢ.ᵎˏ r4 = new ᵔᵢ.ᵎˏ
            r4.<init>(r0, r5)
            ـˏ.ᴵˋ r5 = new ـˏ.ᴵˋ
            r0 = 3
            r5.<init>(r0, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p337.C3839.mo3875(ᵔᵢ.ˎٴ, ˊﹶ.ᵎـ, boolean):java.util.ArrayList");
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final int m8990(C2431 c2431) {
        this.f14752.getClass();
        C3825 c3825 = C3825.f14706;
        if (!c3825.f14709) {
            return 0;
        }
        int i = c3825.f14707 ? 1536 : 512;
        return c3825.f14708 ? i | 2048 : i;
    }

    @Override // p362.AbstractC4126
    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void mo8991(long j) {
        this.f14752.getClass();
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹳˎ */
    public final void mo1134() {
        m8986();
        this.f14752.ﹳﹳ();
    }

    @Override // p438.InterfaceC5111
    /* renamed from: ﹳﹳ */
    public final long mo1135() {
        if (this.f19478 == 2) {
            m8986();
        }
        return this.f14745;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹶˆ */
    public final String mo1137() {
        return "MediaCodecAudioRenderer";
    }
}
