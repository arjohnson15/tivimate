package p362;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p056.InterfaceC1335;
import p166.C2431;
import p230.C3071;
import p312.C3583;
import p312.C3589;
import p312.InterfaceC3586;
import p337.C3851;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p385.C4479;
import p385.InterfaceC4493;
import p438.AbstractC5115;
import p438.C5074;
import p438.C5096;
import p438.C5099;
import p456.C5349;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵔᵢ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4126 extends AbstractC5115 {

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public static final byte[] f15930 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean f15931;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public float f15932;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final InterfaceC4118 f15933;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public boolean f15934;

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public boolean f15935;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public C2431 f15936;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public boolean f15937;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public boolean f15938;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public long f15939;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public InterfaceC4493 f15940;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public boolean f15941;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public C4116 f15942;

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public long f15943;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C4122 f15944;

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public boolean f15945;

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public long f15946;

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public ExoPlaybackException f15947;

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public C4120 f15948;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f15949;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public InterfaceC4493 f15950;

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public int f15951;

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public boolean f15952;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final MediaCodec.BufferInfo f15953;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public boolean f15954;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final C3589 f15955;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public MediaCodecRenderer$DecoderInitializationException f15956;

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public int f15957;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final C3589 f15958;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final C3851 f15959;

    /* renamed from: ˎי, reason: contains not printable characters */
    public boolean f15960;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public InterfaceC4129 f15961;

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean f15962;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public C2431 f15963;

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public boolean f15964;

    /* renamed from: יˆ, reason: contains not printable characters */
    public int f15965;

    /* renamed from: יˊ, reason: contains not printable characters */
    public boolean f15966;

    /* renamed from: יˋ, reason: contains not printable characters */
    public C2431 f15967;

    /* renamed from: יי, reason: contains not printable characters */
    public boolean f15968;

    /* renamed from: יᴵ, reason: contains not printable characters */
    public boolean f15969;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final long f15970;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public C5096 f15971;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public MediaCrypto f15972;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public ArrayDeque f15973;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public boolean f15974;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public boolean f15975;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean f15976;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C3589 f15977;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public float f15978;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public boolean f15979;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public float f15980;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean f15981;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public int f15982;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final InterfaceC4115 f15983;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public boolean f15984;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public ByteBuffer f15985;

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public boolean f15986;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean f15987;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public int f15988;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final ArrayDeque f15989;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public MediaFormat f15990;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public C5074 f15991;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public long f15992;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public boolean f15993;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final float f15994;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public boolean f15995;

    public AbstractC4126(int i, InterfaceC4118 interfaceC4118, InterfaceC4115 interfaceC4115, boolean z, float f) {
        super(i);
        this.f15933 = interfaceC4118;
        interfaceC4115.getClass();
        this.f15983 = interfaceC4115;
        this.f15981 = z;
        this.f15994 = f;
        this.f15955 = new C3589(0, 0);
        this.f15958 = new C3589(0, 0);
        this.f15977 = new C3589(2, 0);
        C4122 c4122 = new C4122(2, 0);
        c4122.f15921 = 32;
        this.f15944 = c4122;
        this.f15953 = new MediaCodec.BufferInfo();
        this.f15980 = 1.0f;
        this.f15978 = 1.0f;
        this.f15970 = -9223372036854775807L;
        this.f15989 = new ArrayDeque();
        this.f15948 = C4120.f15912;
        c4122.m8491(0);
        c4122.f13800.order(ByteOrder.nativeOrder());
        C3851 c3851 = new C3851();
        c3851.f14874 = InterfaceC1335.f5442;
        c3851.f14873 = 0;
        c3851.f14872 = 2;
        this.f15959 = c3851;
        this.f15932 = -1.0f;
        this.f15949 = 0;
        this.f15957 = 0;
        this.f15982 = -1;
        this.f15988 = -1;
        this.f15992 = -9223372036854775807L;
        this.f15939 = -9223372036854775807L;
        this.f15943 = -9223372036854775807L;
        this.f15946 = -9223372036854775807L;
        this.f15965 = 0;
        this.f15951 = 0;
        this.f15991 = new C5074();
    }

    /* renamed from: ʻʻ */
    public boolean mo8987(C2431 c2431) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04a1  */
    /* renamed from: ʻʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9444(p362.C4116 r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4126.m9444(ᵔᵢ.ˏʾ, android.media.MediaCrypto):void");
    }

    /* renamed from: ʻﹳ */
    public void mo3847(C3589 c3589) {
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m9445() throws MediaCryptoException, ExoPlaybackException {
        int i = this.f15951;
        if (i == 1) {
            m9454();
            return;
        }
        if (i == 2) {
            m9454();
            m9446();
        } else if (i != 3) {
            this.f15934 = true;
            mo8989();
        } else {
            m9455();
            m9458();
        }
    }

    /* renamed from: ʾʼ */
    public int mo3849(C3589 c3589) {
        return 0;
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public final void m9446() throws MediaCryptoException, ExoPlaybackException {
        InterfaceC4493 interfaceC4493 = this.f15940;
        interfaceC4493.getClass();
        InterfaceC3586 interfaceC3586Mo10249 = interfaceC4493.mo10249();
        if (interfaceC3586Mo10249 instanceof C4479) {
            try {
                MediaCrypto mediaCrypto = this.f15972;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C4479) interfaceC3586Mo10249).f17248);
            } catch (MediaCryptoException e) {
                throw m11339(e, this.f15967, false, 6006);
            }
        }
        m9453(this.f15940);
        this.f15965 = 0;
        this.f15951 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r4.mo10239(r3) != false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* renamed from: ʿˊ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p438.C5099 mo3850(p456.C5349 r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4126.mo3850(ﾞⁱ.ﹶﾞ):ﹶﾞ.ٴˎ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // p438.AbstractC5115
    /* renamed from: ʿˏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1115(p166.C2431[] r14, long r15, long r17) {
        /*
            r13 = this;
            r0 = r13
            ᵔᵢ.ˑי r1 = r0.f15948
            long r1 = r1.f15914
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L20
            ᵔᵢ.ˑי r1 = new ᵔᵢ.ˑי
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r13.m9461(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.f15989
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f15939
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.f15946
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            ᵔᵢ.ˑי r1 = new ᵔᵢ.ˑי
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r15
            r10 = r17
            r5.<init>(r6, r8, r10)
            r13.m9461(r1)
            ᵔᵢ.ˑי r1 = r0.f15948
            long r1 = r1.f15914
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L63
            r13.mo3862()
            goto L63
        L55:
            ᵔᵢ.ˑי r2 = new ᵔᵢ.ˑי
            long r7 = r0.f15939
            r6 = r2
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r1.add(r2)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4126.mo1115(ˊﹶ.ᵎـ[], long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031b  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9447(long r27, long r29) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4126.m9447(long, long):boolean");
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m9448() {
        this.f15937 = false;
        this.f15944.mo8492();
        this.f15977.mo8492();
        this.f15966 = false;
        this.f15984 = false;
        C3851 c3851 = this.f15959;
        c3851.getClass();
        c3851.f14874 = InterfaceC1335.f5442;
        c3851.f14873 = 0;
        c3851.f14872 = 2;
    }

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public final void m9449(long j) {
        C2431 c2431 = (C2431) this.f15948.f15916.m7565(j);
        if (c2431 == null && this.f15935 && this.f15990 != null) {
            c2431 = (C2431) this.f15948.f15916.m7569();
        }
        if (c2431 != null) {
            this.f15936 = c2431;
        } else if (!this.f15995 || this.f15936 == null) {
            return;
        }
        C2431 c24312 = this.f15936;
        c24312.getClass();
        mo3852(c24312, this.f15990);
        this.f15995 = false;
        this.f15935 = false;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˈٴ */
    public final int mo1118(C2431 c2431) throws ExoPlaybackException {
        try {
            return mo3864(this.f15983, c2431);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw m11339(e, c2431, false, 4002);
        }
    }

    /* renamed from: ˈﹳ */
    public void mo3851(C2431 c2431) {
    }

    /* renamed from: ˉᵎ */
    public abstract void mo3852(C2431 c2431, MediaFormat mediaFormat);

    @Override // p438.AbstractC5115
    /* renamed from: ˉⁱ */
    public boolean mo1119() {
        if (this.f15967 != null) {
            if (!m11337() && this.f15988 < 0) {
                if (this.f15992 != -9223372036854775807L) {
                    this.f19490.getClass();
                    if (SystemClock.elapsedRealtime() < this.f15992) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ˊᵔ */
    public abstract void mo3854(Exception exc);

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final boolean m9450(C2431 c2431) throws ExoPlaybackException {
        if (AbstractC4470.f17202 >= 23 && this.f15961 != null && this.f15951 != 3 && this.f19478 != 0) {
            float f = this.f15978;
            c2431.getClass();
            C2431[] c2431Arr = this.f19486;
            c2431Arr.getClass();
            float fMo3860 = mo3860(f, c2431Arr);
            float f2 = this.f15932;
            if (f2 == fMo3860) {
                return true;
            }
            if (fMo3860 == -1.0f) {
                if (this.f15986) {
                    this.f15965 = 1;
                    this.f15951 = 3;
                    return false;
                }
                m9455();
                m9458();
                return false;
            }
            if (f2 == -1.0f && fMo3860 <= this.f15994) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo3860);
            InterfaceC4129 interfaceC4129 = this.f15961;
            interfaceC4129.getClass();
            interfaceC4129.mo5343(bundle);
            this.f15932 = fMo3860;
        }
        return true;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m9451() throws MediaCryptoException, ExoPlaybackException {
        InterfaceC4129 interfaceC4129 = this.f15961;
        if (interfaceC4129 == null || this.f15965 == 2 || this.f15960) {
            return false;
        }
        int i = this.f15982;
        C3589 c3589 = this.f15958;
        if (i < 0) {
            int iMo5356 = interfaceC4129.mo5356();
            this.f15982 = iMo5356;
            if (iMo5356 < 0) {
                return false;
            }
            c3589.f13800 = interfaceC4129.mo5349(iMo5356);
            c3589.mo8492();
        }
        if (this.f15965 == 1) {
            if (!this.f15979) {
                this.f15969 = true;
                interfaceC4129.mo5348(this.f15982, 0, 0L, 4);
                this.f15982 = -1;
                c3589.f13800 = null;
            }
            this.f15965 = 2;
            return false;
        }
        if (this.f15993) {
            this.f15993 = false;
            ByteBuffer byteBuffer = c3589.f13800;
            byteBuffer.getClass();
            byteBuffer.put(f15930);
            interfaceC4129.mo5348(this.f15982, 38, 0L, 0);
            this.f15982 = -1;
            c3589.f13800 = null;
            this.f15986 = true;
            return true;
        }
        if (this.f15957 == 1) {
            int i2 = 0;
            while (true) {
                C2431 c2431 = this.f15963;
                c2431.getClass();
                if (i2 >= c2431.f9674.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f15963.f9674.get(i2);
                ByteBuffer byteBuffer2 = c3589.f13800;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.f15957 = 2;
        }
        ByteBuffer byteBuffer3 = c3589.f13800;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        C5349 c5349 = this.f19479;
        c5349.m12099();
        try {
            int iM11336 = m11336(c5349, c3589, 0);
            if (iM11336 == -3) {
                if (m11335()) {
                    this.f15943 = this.f15939;
                }
                return false;
            }
            if (iM11336 == -5) {
                if (this.f15957 == 2) {
                    c3589.mo8492();
                    this.f15957 = 1;
                }
                mo3850(c5349);
                return true;
            }
            if (c3589.m4401(4)) {
                this.f15943 = this.f15939;
                if (this.f15957 == 2) {
                    c3589.mo8492();
                    this.f15957 = 1;
                }
                this.f15960 = true;
                if (!this.f15986) {
                    m9445();
                    return false;
                }
                try {
                    if (!this.f15979) {
                        this.f15969 = true;
                        interfaceC4129.mo5348(this.f15982, 0, 0L, 4);
                        this.f15982 = -1;
                        c3589.f13800 = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m11339(e, this.f15967, false, AbstractC4470.m10215(e.getErrorCode()));
                }
            }
            if (!this.f15986 && !c3589.m4401(1)) {
                c3589.mo8492();
                if (this.f15957 == 2) {
                    this.f15957 = 1;
                }
                return true;
            }
            boolean zM4401 = c3589.m4401(1073741824);
            if (zM4401) {
                C3583 c3583 = c3589.f13804;
                if (iPosition == 0) {
                    c3583.getClass();
                } else {
                    if (c3583.f13781 == null) {
                        int[] iArr = new int[1];
                        c3583.f13781 = iArr;
                        c3583.f13782.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c3583.f13781;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.f15987 && !zM4401) {
                ByteBuffer byteBuffer4 = c3589.f13800;
                byteBuffer4.getClass();
                int iPosition2 = byteBuffer4.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer4.clear();
                        break;
                    }
                    int i6 = byteBuffer4.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer4.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer4.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer4.position(0);
                            byteBuffer4.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                ByteBuffer byteBuffer5 = c3589.f13800;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                this.f15987 = false;
            }
            long j = c3589.f13807;
            if (this.f15964) {
                ArrayDeque arrayDeque = this.f15989;
                if (arrayDeque.isEmpty()) {
                    C3071 c3071 = this.f15948.f15916;
                    C2431 c24312 = this.f15967;
                    c24312.getClass();
                    c3071.m7566(j, c24312);
                } else {
                    C3071 c30712 = ((C4120) arrayDeque.peekLast()).f15916;
                    C2431 c24313 = this.f15967;
                    c24313.getClass();
                    c30712.m7566(j, c24313);
                }
                this.f15964 = false;
            }
            this.f15939 = Math.max(this.f15939, j);
            if (m11335() || c3589.m4401(536870912)) {
                this.f15943 = this.f15939;
            }
            c3589.m8494();
            if (c3589.m4401(268435456)) {
                mo3873(c3589);
            }
            mo3847(c3589);
            int iMo3849 = mo3849(c3589);
            try {
                if (zM4401) {
                    interfaceC4129.mo5347(this.f15982, c3589.f13804, j, iMo3849);
                } else {
                    int i7 = this.f15982;
                    ByteBuffer byteBuffer6 = c3589.f13800;
                    byteBuffer6.getClass();
                    interfaceC4129.mo5348(i7, byteBuffer6.limit(), j, iMo3849);
                }
                this.f15982 = -1;
                c3589.f13800 = null;
                this.f15986 = true;
                this.f15957 = 0;
                this.f15991.f19241++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw m11339(e2, this.f15967, false, AbstractC4470.m10215(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer$InsufficientCapacityException e3) {
            mo3854(e3);
            m9456(0);
            m9454();
            return true;
        }
    }

    /* renamed from: ˋﾞ */
    public abstract void mo3855(long j, long j2, String str);

    /* renamed from: ˎˉ */
    public void mo3856(long j) {
        this.f15946 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f15989;
            if (arrayDeque.isEmpty() || j < ((C4120) arrayDeque.peek()).f15915) {
                return;
            }
            C4120 c4120 = (C4120) arrayDeque.poll();
            c4120.getClass();
            m9461(c4120);
            mo3862();
        }
    }

    /* renamed from: ˎˑ */
    public abstract C5099 mo3857(C4116 c4116, C2431 c2431, C2431 c24312);

    /* renamed from: ˎᵔ */
    public abstract C4123 mo3859(C4116 c4116, C2431 c2431, MediaCrypto mediaCrypto, float f);

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final void m9452() {
        mo3869();
        this.f15947 = null;
        this.f15973 = null;
        this.f15942 = null;
        this.f15963 = null;
        this.f15990 = null;
        this.f15995 = false;
        this.f15945 = false;
        this.f15932 = -1.0f;
        this.f15949 = 0;
        this.f15987 = false;
        this.f15962 = false;
        this.f15931 = false;
        this.f15941 = false;
        this.f15954 = false;
        this.f15974 = false;
        this.f15979 = false;
        this.f15952 = false;
        this.f15957 = 0;
    }

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final void m9453(InterfaceC4493 interfaceC4493) {
        ᐧʻ.יʻ(this.f15950, interfaceC4493);
        this.f15950 = interfaceC4493;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ˑי */
    public void mo1126(boolean z, long j) throws ExoPlaybackException {
        this.f15960 = false;
        this.f15934 = false;
        this.f15968 = false;
        if (this.f15984) {
            this.f15944.mo8492();
            this.f15977.mo8492();
            this.f15966 = false;
            C3851 c3851 = this.f15959;
            c3851.getClass();
            c3851.f14874 = InterfaceC1335.f5442;
            c3851.f14873 = 0;
            c3851.f14872 = 2;
        } else if (m9457()) {
            m9458();
        }
        if (this.f15948.f15916.m7564() > 0) {
            this.f15964 = true;
        }
        this.f15948.f15916.m7570();
        this.f15989.clear();
    }

    /* renamed from: ˑⁱ */
    public abstract float mo3860(float f, C2431[] c2431Arr);

    /* renamed from: ˑﾞ */
    public boolean mo3861() {
        return false;
    }

    /* renamed from: יˋ */
    public abstract void mo3862();

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m9454() {
        try {
            InterfaceC4129 interfaceC4129 = this.f15961;
            AbstractC4464.m10146(interfaceC4129);
            interfaceC4129.flush();
        } finally {
            mo3869();
        }
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m9455() {
        try {
            InterfaceC4129 interfaceC4129 = this.f15961;
            if (interfaceC4129 != null) {
                interfaceC4129.mo5342();
                this.f15991.f19235++;
                C4116 c4116 = this.f15942;
                c4116.getClass();
                mo3868(c4116.f15902);
            }
            this.f15961 = null;
            try {
                MediaCrypto mediaCrypto = this.f15972;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f15961 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f15972;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: ٴᐧ */
    public abstract boolean mo3863(long j, long j2, InterfaceC4129 interfaceC4129, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2431 c2431);

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final boolean m9456(int i) throws MediaCryptoException, ExoPlaybackException {
        C5349 c5349 = this.f19479;
        c5349.m12099();
        C3589 c3589 = this.f15955;
        c3589.mo8492();
        int iM11336 = m11336(c5349, c3589, i | 4);
        if (iM11336 == -5) {
            mo3850(c5349);
            return true;
        }
        if (iM11336 != -4 || !c3589.m4401(4)) {
            return false;
        }
        this.f15960 = true;
        m9445();
        return false;
    }

    /* renamed from: ᐧʼ */
    public abstract int mo3864(InterfaceC4115 interfaceC4115, C2431 c2431);

    /* renamed from: ᐧˋ */
    public MediaCodecDecoderException mo3865(IllegalStateException illegalStateException, C4116 c4116) {
        return new MediaCodecDecoderException(illegalStateException, c4116);
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᐧⁱ */
    public final int mo1130() {
        return 8;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean m9457() throws MediaCryptoException {
        if (this.f15961 == null) {
            return false;
        }
        int i = this.f15951;
        if (i == 3 || this.f15962 || ((this.f15931 && !this.f15945) || (this.f15941 && this.f15969))) {
            m9455();
            return true;
        }
        if (i == 2) {
            int i2 = AbstractC4470.f17202;
            AbstractC4464.m10132(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m9446();
                } catch (ExoPlaybackException e) {
                    AbstractC4464.m10127("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m9455();
                    return true;
                }
            }
        }
        m9454();
        return false;
    }

    @Override // p438.AbstractC5115
    /* renamed from: ᴵʿ */
    public void mo1131() throws MediaCryptoException {
        this.f15967 = null;
        m9461(C4120.f15912);
        this.f15989.clear();
        m9457();
    }

    /* renamed from: ᵎʽ */
    public abstract void mo3868(String str);

    /* renamed from: ᵎʾ */
    public void mo3869() {
        this.f15982 = -1;
        this.f15958.f13800 = null;
        this.f15988 = -1;
        this.f15985 = null;
        this.f15992 = -9223372036854775807L;
        this.f15969 = false;
        this.f15986 = false;
        this.f15993 = false;
        this.f15938 = false;
        this.f15975 = false;
        this.f15976 = false;
        this.f15939 = -9223372036854775807L;
        this.f15943 = -9223372036854775807L;
        this.f15946 = -9223372036854775807L;
        this.f15965 = 0;
        this.f15951 = 0;
        this.f15957 = this.f15952 ? 1 : 0;
    }

    /* renamed from: ᵎᵢ */
    public void mo8989() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2 A[Catch: MediaCodecRenderer$DecoderInitializationException -> 0x00bc, TryCatch #1 {MediaCodecRenderer$DecoderInitializationException -> 0x00bc, blocks: (B:56:0x00ae, B:58:0x00b2, B:64:0x00bf), top: B:76:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* renamed from: ᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9458() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4126.m9458():void");
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final boolean m9459(long j, long j2) {
        C2431 c2431;
        return j2 < j && ((c2431 = this.f15936) == null || !Objects.equals(c2431.f9667, "audio/opus") || j - j2 > 80000);
    }

    /* renamed from: ᵔﹳ */
    public abstract void mo3873(C3589 c3589);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m9460() throws MediaCryptoException, ExoPlaybackException {
        if (this.f15986) {
            this.f15965 = 1;
            if (this.f15962 || this.f15941) {
                this.f15951 = 3;
                return false;
            }
            this.f15951 = 2;
        } else {
            m9446();
        }
        return true;
    }

    /* renamed from: ᵢٴ */
    public abstract ArrayList mo3875(InterfaceC4115 interfaceC4115, C2431 c2431, boolean z);

    /* renamed from: ⁱʿ */
    public void mo8991(long j) {
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final void m9461(C4120 c4120) {
        this.f15948 = c4120;
        long j = c4120.f15914;
        if (j != -9223372036854775807L) {
            this.f15935 = true;
            mo8991(j);
        }
    }

    @Override // p438.AbstractC5115
    /* renamed from: ﹳˑ */
    public void mo3877(float f, float f2) throws ExoPlaybackException {
        this.f15980 = f;
        this.f15978 = f2;
        m9450(this.f15963);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean m9462(long j, long j2) throws MediaCryptoException, ExoPlaybackException {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo3863;
        int iMo5346;
        InterfaceC4129 interfaceC4129 = this.f15961;
        interfaceC4129.getClass();
        boolean z3 = this.f15988 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f15953;
        if (!z3) {
            if (this.f15954 && this.f15969) {
                try {
                    iMo5346 = interfaceC4129.mo5346(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m9445();
                    if (this.f15934) {
                        m9455();
                    }
                    return false;
                }
            } else {
                iMo5346 = interfaceC4129.mo5346(bufferInfo2);
            }
            if (iMo5346 < 0) {
                if (iMo5346 != -2) {
                    if (this.f15979 && (this.f15960 || this.f15965 == 2)) {
                        m9445();
                    }
                    return false;
                }
                this.f15945 = true;
                InterfaceC4129 interfaceC41292 = this.f15961;
                interfaceC41292.getClass();
                MediaFormat mediaFormatMo5354 = interfaceC41292.mo5354();
                if (this.f15949 != 0 && mediaFormatMo5354.getInteger("width") == 32 && mediaFormatMo5354.getInteger("height") == 32) {
                    this.f15938 = true;
                } else {
                    this.f15990 = mediaFormatMo5354;
                    this.f15995 = true;
                }
                return true;
            }
            if (this.f15938) {
                this.f15938 = false;
                interfaceC4129.mo5345(iMo5346, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m9445();
                return false;
            }
            this.f15988 = iMo5346;
            ByteBuffer byteBufferMo5353 = interfaceC4129.mo5353(iMo5346);
            this.f15985 = byteBufferMo5353;
            if (byteBufferMo5353 != null) {
                byteBufferMo5353.position(bufferInfo2.offset);
                this.f15985.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f15974 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f15939 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.f15943;
            }
            long j3 = bufferInfo2.presentationTimeUs;
            this.f15975 = j3 < this.f19475;
            long j4 = this.f15943;
            this.f15976 = j4 != -9223372036854775807L && j4 <= j3;
            m9449(j3);
        }
        if (this.f15954 && this.f15969) {
            try {
                ByteBuffer byteBuffer = this.f15985;
                int i = this.f15988;
                int i2 = bufferInfo2.flags;
                long j5 = bufferInfo2.presentationTimeUs;
                boolean z4 = this.f15975;
                boolean z5 = this.f15976;
                C2431 c2431 = this.f15936;
                c2431.getClass();
                z = true;
                z2 = false;
                try {
                    zMo3863 = mo3863(j, j2, interfaceC4129, byteBuffer, i, i2, 1, j5, z4, z5, c2431);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    m9445();
                    if (this.f15934) {
                        m9455();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            ByteBuffer byteBuffer2 = this.f15985;
            int i3 = this.f15988;
            int i4 = bufferInfo2.flags;
            long j6 = bufferInfo2.presentationTimeUs;
            boolean z6 = this.f15975;
            boolean z7 = this.f15976;
            C2431 c24312 = this.f15936;
            c24312.getClass();
            bufferInfo = bufferInfo2;
            zMo3863 = mo3863(j, j2, interfaceC4129, byteBuffer2, i3, i4, 1, j6, z6, z7, c24312);
        }
        if (zMo3863) {
            mo3856(bufferInfo.presentationTimeUs);
            boolean z8 = (bufferInfo.flags & 4) != 0;
            this.f15988 = -1;
            this.f15985 = null;
            if (!z8) {
                return z;
            }
            m9445();
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075 A[LOOP:1: B:29:0x0050->B:39:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[LOOP:2: B:40:0x0076->B:50:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076 A[EDGE_INSN: B:87:0x0076->B:91:? BREAK  A[LOOP:1: B:29:0x0050->B:39:0x0075], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097 A[EDGE_INSN: B:89:0x0097->B:51:0x0097 BREAK  A[LOOP:2: B:40:0x0076->B:50:0x0096], SYNTHETIC] */
    @Override // p438.AbstractC5115
    /* renamed from: ﾞˊ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1138(long r12, long r14) throws android.media.MediaCryptoException, androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362.AbstractC4126.mo1138(long, long):void");
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m9463(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        String diagnosticInfo;
        C2431 c2431 = this.f15967;
        c2431.getClass();
        if (this.f15973 == null) {
            try {
                List listM9464 = m9464(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f15973 = arrayDeque;
                if (this.f15981) {
                    arrayDeque.addAll(listM9464);
                } else if (!listM9464.isEmpty()) {
                    this.f15973.add((C4116) listM9464.get(0));
                }
                this.f15956 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(c2431, e, z, -49998);
            }
        }
        if (this.f15973.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(c2431, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f15973;
        arrayDeque2.getClass();
        while (this.f15961 == null) {
            C4116 c4116 = (C4116) arrayDeque2.peekFirst();
            c4116.getClass();
            if (!mo3880(c4116)) {
                return;
            }
            try {
                m9444(c4116, mediaCrypto);
            } catch (Exception e2) {
                AbstractC4464.m10127("MediaCodecRenderer", "Failed to initialize decoder: " + c4116, e2);
                arrayDeque2.removeFirst();
                String str = "Decoder init failed: " + c4116.f15902 + ", " + c2431;
                if (AbstractC4470.f17202 >= 21) {
                    diagnosticInfo = e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(str, e2, c2431.f9667, z, c4116, diagnosticInfo);
                mo3854(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.f15956;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.f15956 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.f15956 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.f1439, mediaCodecRenderer$DecoderInitializationException2.f1436, mediaCodecRenderer$DecoderInitializationException2.f1437, mediaCodecRenderer$DecoderInitializationException2.f1438);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f15956;
                }
            }
        }
        this.f15973 = null;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final List m9464(boolean z) {
        C2431 c2431 = this.f15967;
        c2431.getClass();
        InterfaceC4115 interfaceC4115 = this.f15983;
        ArrayList arrayListMo3875 = mo3875(interfaceC4115, c2431, z);
        if (arrayListMo3875.isEmpty() && z) {
            arrayListMo3875 = mo3875(interfaceC4115, c2431, false);
            if (!arrayListMo3875.isEmpty()) {
                AbstractC4464.m10144("MediaCodecRenderer", "Drm session requires secure decoder for " + c2431.f9667 + ", but no secure decoder available. Trying to proceed with " + arrayListMo3875 + ".");
            }
        }
        return arrayListMo3875;
    }

    /* renamed from: ﾞﾞ */
    public boolean mo3880(C4116 c4116) {
        return true;
    }
}
