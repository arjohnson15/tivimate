package p266;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.AbstractC0001;
import android.support.v4.media.session.AbstractC0002;
import android.text.TextUtils;
import android.view.Surface;
import androidx.leanback.widget.RunnableC0183;
import androidx.lifecycle.C0236;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.RunnableC0237;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0282;
import com.bumptech.glide.ﹳﹳ;
import com.hierynomus.protocol.transport.TransportException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.ReferenceQueue;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.lingala.zip4j.exception.ZipException;
import p000.C0882;
import p000.InterfaceC0864;
import p005.C0934;
import p007.C0959;
import p008.C0974;
import p008.C0979;
import p008.InterfaceC0978;
import p016.C1071;
import p016.C1077;
import p016.C1085;
import p023.C1147;
import p064.AbstractC1468;
import p064.C1461;
import p102.C1784;
import p123.C1995;
import p137.C2106;
import p166.AbstractC2424;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p183.EnumC2533;
import p188.C2639;
import p188.InterfaceC2612;
import p196.C2711;
import p223.AbstractC2978;
import p223.AbstractC2980;
import p245.C3115;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p260.C3222;
import p261.C3226;
import p261.C3233;
import p261.C3234;
import p261.C3245;
import p261.C3246;
import p261.InterfaceC3251;
import p261.ThreadFactoryC3241;
import p267.C3267;
import p267.C3270;
import p267.C3279;
import p280.C3374;
import p280.C3375;
import p298.C3493;
import p298.C3496;
import p298.C3497;
import p298.C3498;
import p298.C3499;
import p298.C3502;
import p298.C3503;
import p306.InterfaceC3553;
import p312.C3583;
import p341.C3898;
import p341.InterfaceC3904;
import p344.InterfaceC3918;
import p345.C3930;
import p346.C3993;
import p358.InterfaceC4073;
import p362.C4117;
import p362.C4121;
import p362.InterfaceC4129;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.C4458;
import p385.C4484;
import p385.C4495;
import p385.InterfaceC4490;
import p411.InterfaceC4690;
import p429.C4945;
import p429.C4969;
import p444.C5149;
import p444.C5150;
import p452.InterfaceC5193;
import p456.InterfaceC5293;
import ʾי.ˑʽ;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;
import ٴᐧ.ᐧⁱ;
import ⁱـ.ˑי;
import ﹶˋ.ـﹶ;

/* renamed from: ـˊ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3262 implements InterfaceC4073, InterfaceC2612, InterfaceC3918, InterfaceC3904, InterfaceC4129, InterfaceC4490, InterfaceC4690, InterfaceC5293 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C3262 f12723;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f12724;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f12725;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object f12726;

    public C3262(int i) {
        switch (i) {
            case 14:
                this.f12726 = new C3222(9);
                this.f12724 = new byte[8];
                this.f12725 = new byte[4];
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3241());
                this.f12726 = new HashMap();
                this.f12724 = new ReferenceQueue();
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0183(21, this));
                break;
        }
    }

    public /* synthetic */ C3262(Object obj, Object obj2, Object obj3) {
        this.f12725 = obj;
        this.f12726 = obj2;
        this.f12724 = obj3;
    }

    public C3262(String str) {
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559(str);
        this.f12726 = new C2431(c2417);
    }

    public C3262(C3233 c3233, C3993 c3993, C3246 c3246) {
        this.f12725 = c3233;
        this.f12724 = c3993;
        this.f12726 = c3246;
    }

    public /* synthetic */ C3262(boolean z, Object obj, Object obj2, Object obj3) {
        this.f12726 = obj;
        this.f12724 = obj2;
        this.f12725 = obj3;
    }

    public C3262(byte[] bArr) throws GeneralSecurityException {
        AbstractC1468.m5022(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12726 = secretKeySpec;
        if (!AbstractC0002.m34(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) C1461.f5979.f5981.mo5019("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArr2 = ﹳﹳ.ˋⁱ(cipher.doFinal(new byte[16]));
        this.f12724 = bArr2;
        this.f12725 = ﹳﹳ.ˋⁱ(bArr2);
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static C3503 m8020(C3496 c3496, int i, long j) {
        ArrayList arrayList;
        C3503 c3503 = new C3503();
        c3503.f5033 = 10;
        c3503.f13564 = 44L;
        C1147 c1147 = c3496.f13532;
        if (c1147 != null && (arrayList = c1147.f4789) != null && arrayList.size() > 0) {
            C3493 c3493 = (C3493) c3496.f13532.f4789.get(0);
            c3503.f13566 = c3493.f13513;
            c3503.f13562 = c3493.f13495;
        }
        C3498 c3498 = c3496.f13535;
        c3503.f13568 = c3498.f13546;
        c3503.f13569 = c3498.f13548;
        long size = c3496.f13532.f4789.size();
        c3503.f13563 = c3496.f13539 ? m8021(c3496.f13535.f13546, c3496.f13532.f4789) : size;
        c3503.f13565 = size;
        c3503.f13567 = i;
        c3503.f13570 = j;
        return c3503;
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static long m8021(int i, ArrayList arrayList) throws ZipException {
        if (arrayList == null) {
            throw new ZipException("file headers are null, cannot calculate number of entries on this disk");
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((C3493) it.next()).f13510 == i) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public static void m8022(C3496 c3496, int i, long j, ByteArrayOutputStream byteArrayOutputStream, C3222 c3222) throws IOException {
        long jM8021;
        byte[] bArr = new byte[8];
        c3222.m7953(byteArrayOutputStream, (int) 101010256);
        c3222.m7932(byteArrayOutputStream, c3496.f13535.f13546);
        c3222.m7932(byteArrayOutputStream, c3496.f13535.f13548);
        long size = c3496.f13532.f4789.size();
        if (c3496.f13539) {
            jM8021 = m8021(c3496.f13535.f13546, c3496.f13532.f4789);
        } else {
            jM8021 = size;
        }
        if (jM8021 > 65535) {
            jM8021 = 65535;
        }
        c3222.m7932(byteArrayOutputStream, (int) jM8021);
        if (size > 65535) {
            size = 65535;
        }
        c3222.m7932(byteArrayOutputStream, (int) size);
        c3222.m7953(byteArrayOutputStream, i);
        if (j > 4294967295L) {
            C3222.m7925(4294967295L, bArr);
            byteArrayOutputStream.write(bArr, 0, 4);
        } else {
            C3222.m7925(j, bArr);
            byteArrayOutputStream.write(bArr, 0, 4);
        }
        String str = c3496.f13535.f13547;
        if (!AbstractC2978.m7367(str)) {
            c3222.m7932(byteArrayOutputStream, 0);
            return;
        }
        byte[] bytes = str.getBytes(AbstractC2980.f11456);
        c3222.m7932(byteArrayOutputStream, bytes.length);
        byteArrayOutputStream.write(bytes);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:11|34|12|(1:24)|(2:26|27)(2:39|29)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r3 = r2.f1342;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r3 == 307) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = (java.lang.String) r3.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r15 = r15 + 1;
        r14 = r14.m3700();
        r14.f3954 = android.net.Uri.parse(r5);
        r14 = r14.m3689();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        p383.AbstractC4470.m10186(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r13 = move-exception;
     */
    /* renamed from: יˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m8023(p000.InterfaceC0864 r12, java.lang.String r13, byte[] r14, java.util.Map r15) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException {
        /*
            ʻ.ᵎˏ r0 = new ʻ.ᵎˏ
            ʻ.ٴˎ r12 = r12.mo900()
            r0.<init>(r12)
            java.util.Collections.emptyMap()
            android.net.Uri r2 = android.net.Uri.parse(r13)
            java.lang.String r12 = "The uri must be set."
            p383.AbstractC4464.m10136(r2, r12)
            ʻ.ﹶˆ r12 = new ʻ.ﹶˆ
            r10 = 0
            r11 = 1
            r3 = 2
            r6 = 0
            r8 = -1
            r1 = r12
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11)
            r13 = 0
            r15 = 0
            r14 = r12
        L27:
            ʻ.ᐧʻ r1 = new ʻ.ᐧʻ     // Catch: java.lang.Exception -> L34
            r1.<init>(r0, r14)     // Catch: java.lang.Exception -> L34
            byte[] r13 = p405.AbstractC4639.m10547(r1)     // Catch: java.lang.Throwable -> L37 androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException -> L39
            p383.AbstractC4470.m10186(r1)     // Catch: java.lang.Exception -> L34
            return r13
        L34:
            r13 = move-exception
            r9 = r13
            goto L7e
        L37:
            r13 = move-exception
            goto L7a
        L39:
            r2 = move-exception
            int r3 = r2.f1342     // Catch: java.lang.Throwable -> L37
            r4 = 307(0x133, float:4.3E-43)
            r5 = 0
            if (r3 == r4) goto L45
            r4 = 308(0x134, float:4.32E-43)
            if (r3 != r4) goto L63
        L45:
            r3 = 5
            if (r15 >= r3) goto L63
            java.util.Map r3 = r2.f1341     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L63
            java.lang.String r4 = "Location"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L37
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L63
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L63
            java.lang.Object r3 = r3.get(r13)     // Catch: java.lang.Throwable -> L37
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L37
        L63:
            if (r5 == 0) goto L79
            int r15 = r15 + 1
            ʻ.ˏᵢ r14 = r14.m3700()     // Catch: java.lang.Throwable -> L37
            android.net.Uri r2 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L37
            r14.f3954 = r2     // Catch: java.lang.Throwable -> L37
            ʻ.ﹶˆ r14 = r14.m3689()     // Catch: java.lang.Throwable -> L37
            p383.AbstractC4470.m10186(r1)     // Catch: java.lang.Exception -> L34
            goto L27
        L79:
            throw r2     // Catch: java.lang.Throwable -> L37
        L7a:
            p383.AbstractC4470.m10186(r1)     // Catch: java.lang.Exception -> L34
            throw r13     // Catch: java.lang.Exception -> L34
        L7e:
            androidx.media3.exoplayer.drm.MediaDrmCallbackException r13 = new androidx.media3.exoplayer.drm.MediaDrmCallbackException
            android.net.Uri r5 = r0.f3992
            r5.getClass()
            ʻ.ٴˎ r14 = r0.f3993
            java.util.Map r6 = r14.mo3674()
            long r7 = r0.f3991
            r3 = r13
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r9)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p266.C3262.m8023(ʻ.ʿʼ, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static void m8024(C3496 c3496, OutputStream outputStream) {
        int iMo3946;
        if (outputStream instanceof InterfaceC0978) {
            InterfaceC0978 interfaceC0978 = (InterfaceC0978) outputStream;
            c3496.f13535.f13550 = interfaceC0978.mo3944();
            iMo3946 = interfaceC0978.mo3946();
        } else {
            iMo3946 = 0;
        }
        if (c3496.f13536) {
            if (c3496.f13533 == null) {
                c3496.f13533 = new C3503();
            }
            if (c3496.f13537 == null) {
                c3496.f13537 = new C3497(2);
            }
            c3496.f13533.f13570 = c3496.f13535.f13550;
            C3497 c3497 = c3496.f13537;
            c3497.f13542 = iMo3946;
            c3497.f13541 = iMo3946 + 1;
        }
        C3498 c3498 = c3496.f13535;
        c3498.f13546 = iMo3946;
        c3498.f13548 = iMo3946;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final URL m8025(C3262 c3262) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority((String) c3262.f12725).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C4945 c4945 = (C4945) c3262.f12726;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c4945.f18705).appendPath("settings");
        C4969 c4969 = c4945.f18706;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c4969.f18787).appendQueryParameter("display_version", c4969.f18785).build().toString());
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static void m8026(C3503 c3503, ByteArrayOutputStream byteArrayOutputStream, C3222 c3222) {
        c3222.m7953(byteArrayOutputStream, (int) ˉᵎ.ʿʼ(c3503.f5033));
        c3222.m7952(byteArrayOutputStream, c3503.f13564);
        c3222.m7932(byteArrayOutputStream, c3503.f13566);
        c3222.m7932(byteArrayOutputStream, c3503.f13562);
        c3222.m7953(byteArrayOutputStream, c3503.f13568);
        c3222.m7953(byteArrayOutputStream, c3503.f13569);
        c3222.m7952(byteArrayOutputStream, c3503.f13563);
        c3222.m7952(byteArrayOutputStream, c3503.f13565);
        c3222.m7952(byteArrayOutputStream, c3503.f13567);
        c3222.m7952(byteArrayOutputStream, c3503.f13570);
    }

    @Override // p362.InterfaceC4129
    public void flush() {
        ((MediaCodec) this.f12726).flush();
    }

    @Override // p452.InterfaceC5193
    public Object get() {
        return new C5149((Context) ((C3263) this.f12726).f12727, (InterfaceC3553) ((InterfaceC5193) this.f12724).get(), (C5150) ((ᐧⁱ) this.f12725).get());
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ʻʿ */
    public void mo5507(Object... objArr) {
        m8037(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:6:0x000e, B:8:0x0017, B:10:0x001b, B:14:0x0026, B:18:0x003a, B:46:0x00c8, B:23:0x004b, B:25:0x004f, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006e, B:39:0x0088, B:41:0x008c, B:43:0x0099, B:45:0x00a7, B:42:0x0092, B:44:0x00a1, B:34:0x0079, B:36:0x007d, B:13:0x0022), top: B:56:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:6:0x000e, B:8:0x0017, B:10:0x001b, B:14:0x0026, B:18:0x003a, B:46:0x00c8, B:23:0x004b, B:25:0x004f, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006e, B:39:0x0088, B:41:0x008c, B:43:0x0099, B:45:0x00a7, B:42:0x0092, B:44:0x00a1, B:34:0x0079, B:36:0x007d, B:13:0x0022), top: B:56:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:6:0x000e, B:8:0x0017, B:10:0x001b, B:14:0x0026, B:18:0x003a, B:46:0x00c8, B:23:0x004b, B:25:0x004f, B:26:0x0056, B:28:0x005a, B:29:0x0062, B:31:0x006e, B:39:0x0088, B:41:0x008c, B:43:0x0099, B:45:0x00a7, B:42:0x0092, B:44:0x00a1, B:34:0x0079, B:36:0x007d, B:13:0x0022), top: B:56:0x000e }] */
    /* renamed from: ʻﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m8027(p298.C3496 r13, java.io.OutputStream r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p266.C3262.m8027(ٴﾞ.ˏʾ, java.io.OutputStream):void");
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public void m8028(EnumC0247 enumC0247) {
        RunnableC0237 runnableC0237 = (RunnableC0237) this.f12725;
        if (runnableC0237 != null) {
            runnableC0237.run();
        }
        RunnableC0237 runnableC02372 = new RunnableC0237((C0236) this.f12726, enumC0247);
        this.f12725 = runnableC02372;
        ((Handler) this.f12724).postAtFrontOfQueue(runnableC02372);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ʽᐧ */
    public void mo5342() {
        MediaCodec mediaCodec = (MediaCodec) this.f12726;
        this.f12724 = null;
        this.f12725 = null;
        try {
            int i = AbstractC4470.f17202;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ʾʼ */
    public void mo5509(Object obj, Object obj2, String str) {
        m8037(new Object[]{obj, obj2});
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ʿʼ */
    public void mo5343(Bundle bundle) {
        ((MediaCodec) this.f12726).setParameters(bundle);
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public C3267 m8029() throws GeneralSecurityException {
        ˑʽ r1;
        C0934 c0934M3799;
        C3270 c3270 = (C3270) this.f12726;
        if (c3270 == null || (r1 = (ˑʽ) this.f12724) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c3270.f12738 != ((C0934) r1.ˆʿ).f4123.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C3279 c3279 = C3279.f12762;
        C3279 c32792 = c3270.f12741;
        if (c32792 != c3279 && ((Integer) this.f12725) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c32792 == c3279 && ((Integer) this.f12725) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c32792 == c3279) {
            c0934M3799 = C0934.m3799(new byte[0]);
        } else if (c32792 == C3279.f12767 || c32792 == C3279.f12760) {
            c0934M3799 = C0934.m3799(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f12725).intValue()).array());
        } else {
            if (c32792 != C3279.f12759) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((C3270) this.f12726).f12741);
            }
            c0934M3799 = C0934.m3799(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f12725).intValue()).array());
        }
        return new C3267((C3270) this.f12726, c0934M3799);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ʿˏ */
    public void mo5510(String str, Throwable th) {
        m8037(null);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˆʿ */
    public void mo5511(Long l, IOException iOException) {
        m8037(new Object[]{l, iOException});
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ˆᵔ */
    public void mo5344(Surface surface) {
        ((MediaCodec) this.f12726).setOutputSurface(surface);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˈٴ */
    public void mo5512(Object obj, String str) {
        m8037(new Object[]{obj});
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public void m8030(ـﹶ r3) {
        Iterator it = ((Collection) this.f12724).iterator();
        while (it.hasNext()) {
            ((C3115) it.next()).m7645(r3);
        }
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˉי */
    public void mo5513(Object obj, String str) {
        m8037(new Object[]{obj});
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˉⁱ */
    public void mo5514() {
        m8037(null);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean m8031() {
        synchronized (this) {
            if (((C3375) this.f12725).m8229()) {
                return false;
            }
            C3374 c3374 = (C3374) this.f12724;
            c3374.getClass();
            C3374.f13198.incrementAndGet(c3374);
            return true;
        }
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˋˉ */
    public void mo5515(Exception exc) {
        m8037(null);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˋˊ */
    public void mo5516(Object obj, String str) {
        m8037(new Object[]{obj});
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ˋⁱ */
    public void mo5345(int i, boolean z) {
        ((MediaCodec) this.f12726).releaseOutputBuffer(i, z);
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public C1085 m8032() throws GeneralSecurityException {
        ˑʽ r1;
        C1077 c1077 = (C1077) this.f12726;
        if (c1077 == null || (r1 = (ˑʽ) this.f12724) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c1077.f4644 != ((C0934) r1.ˆʿ).f4123.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C1071 c1071 = C1071.f4618;
        C1071 c10712 = c1077.f4645;
        if (c10712 != c1071 && ((Integer) this.f12725) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c10712 == c1071 && ((Integer) this.f12725) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c10712 == c1071) {
            C0934.m3799(new byte[0]);
        } else if (c10712 == C1071.f4622) {
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f12725).intValue()).array());
        } else {
            if (c10712 != C1071.f4621) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((C1077) this.f12726).f4645);
            }
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f12725).intValue()).array());
        }
        return new C1085();
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˎˑ */
    public void mo5517(Object obj, String str) {
        m8037(new Object[]{obj});
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˎٴ */
    public void mo5518(Object obj, String str) {
        m8037(new Object[]{obj});
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˎᵔ */
    public void mo5519(TransportException transportException) {
        m8037(null);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˏʾ */
    public void mo5520(String str, Object... objArr) {
        m8037(objArr);
    }

    @Override // p385.InterfaceC4490
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public byte[] mo8033(UUID uuid, C4484 c4484) throws MediaDrmCallbackException {
        String str = c4484.f17257;
        if (TextUtils.isEmpty(str)) {
            str = (String) this.f12724;
        }
        if (TextUtils.isEmpty(str)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            AbstractC4464.m10136(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new C0882(uri, 1, null, mapEmptyMap, 0L, -1L, null, 0), uri, C3930.f15266, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC2424.f9642;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC2424.f9643.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f12725)) {
            map.putAll((HashMap) this.f12725);
        }
        return m8023((InterfaceC0864) this.f12726, str, c4484.f17258, map);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ˏᵢ */
    public int mo5346(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f12726;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && AbstractC4470.f17202 < 21) {
                this.f12725 = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˑʽ */
    public String mo5521() {
        return (String) this.f12726;
    }

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public void m8034(C3493 c3493, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr;
        List list = c3493.f13503;
        if (list == null || list.size() == 0) {
            return;
        }
        for (C3502 c3502 : c3493.f13503) {
            long j = c3502.f13560;
            if (j != 39169 && j != 1) {
                int i = (int) j;
                C3222 c3222 = (C3222) this.f12726;
                c3222.m7932(byteArrayOutputStream, i);
                c3222.m7932(byteArrayOutputStream, c3502.f13561);
                if (c3502.f13561 > 0 && (bArr = c3502.f13559) != null) {
                    byteArrayOutputStream.write(bArr);
                }
            }
        }
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˑי */
    public void mo5522(String str) {
        m8037(null);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ˑⁱ */
    public void mo5523(String str, Object obj, Number number) {
        m8037(new Object[]{obj, number});
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ˑﾞ */
    public ImageHeaderParser$ImageType mo6786() {
        C2639 c2639 = (C2639) ((C0282) this.f12726).f2327;
        c2639.reset();
        return ˑי.ˋⁱ((ArrayList) this.f12725, c2639, (C2106) this.f12724);
    }

    @Override // p188.InterfaceC2612
    /* renamed from: יʻ */
    public void mo6787() {
        C2639 c2639 = (C2639) ((C0282) this.f12726).f2327;
        synchronized (c2639) {
            c2639.f10449 = c2639.f10451.length;
        }
    }

    @Override // p358.InterfaceC4073
    /* renamed from: ـˆ, reason: contains not printable characters */
    public byte[] mo8035(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrM23;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!AbstractC0002.m34(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) C1461.f5979.f5981.mo5019("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f12726);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrM23 = AbstractC0001.m4(bArr, (iMax - 1) * 16, (byte[]) this.f12724, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = Byte.MIN_VALUE;
            bArrM23 = AbstractC0001.m23(bArrCopyOf, (byte[]) this.f12725);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(AbstractC0001.m4(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(AbstractC0001.m23(bArrM23, bArrDoFinal)), i);
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public void m8036(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f12726 = str;
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ـﹶ */
    public void mo5347(int i, C3583 c3583, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f12726).queueSecureInputBuffer(i, 0, c3583.f13782, j, i2);
    }

    @Override // p341.InterfaceC3904
    /* renamed from: ٴˎ */
    public void mo4798(C4457 c4457) {
        long jM10119;
        AbstractC4464.m10146((C4458) this.f12724);
        int i = AbstractC4470.f17202;
        C4458 c4458 = (C4458) this.f12724;
        synchronized (c4458) {
            try {
                long j = c4458.f17173;
                jM10119 = j != -9223372036854775807L ? j + c4458.f17172 : c4458.m10119();
            } finally {
            }
        }
        long jM10113 = ((C4458) this.f12724).m10113();
        if (jM10119 == -9223372036854775807L || jM10113 == -9223372036854775807L) {
            return;
        }
        C2431 c2431 = (C2431) this.f12726;
        if (jM10113 != c2431.f9669) {
            C2417 c2417M6541 = c2431.m6541();
            c2417M6541.f9621 = jM10113;
            C2431 c24312 = new C2431(c2417M6541);
            this.f12726 = c24312;
            ((InterfaceC3178) this.f12725).mo7840(c24312);
        }
        int iM10096 = c4457.m10096();
        ((InterfaceC3178) this.f12725).mo7841(iM10096, c4457);
        ((InterfaceC3178) this.f12725).mo7842(jM10119, 1, iM10096, 0, null);
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public void m8037(Object[] objArr) {
        C2711 c2711 = new C2711();
        System.currentTimeMillis();
        c2711.f10610 = (C1784) this.f12724;
        c2711.f10609 = objArr;
        Thread.currentThread().getName();
        ((LinkedBlockingQueue) this.f12725).add(c2711);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᐧʻ */
    public void mo5348(int i, int i2, long j, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f12726).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᐧˋ */
    public ByteBuffer mo5349(int i) {
        return AbstractC4470.f17202 >= 21 ? ((MediaCodec) this.f12726).getInputBuffer(i) : ((ByteBuffer[]) this.f12724)[i];
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ᐧⁱ */
    public int mo6788() {
        C2639 c2639 = (C2639) ((C0282) this.f12726).f2327;
        c2639.reset();
        return ˑי.ˉⁱ((ArrayList) this.f12725, c2639, (C2106) this.f12724);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᴵʼ */
    public void mo5350(int i, long j) {
        ((MediaCodec) this.f12726).releaseOutputBuffer(i, j);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ᴵʿ */
    public void mo5525(Object... objArr) {
        m8037(objArr);
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public C1995 m8038() {
        String strConcat = ((String) this.f12726) == null ? " backendName" : "";
        if (((EnumC2533) this.f12725) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C1995((String) this.f12726, (byte[]) this.f12724, (EnumC2533) this.f12725);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public void m8039(C3496 c3496, ByteArrayOutputStream byteArrayOutputStream, C3222 c3222) throws IOException {
        ArrayList arrayList;
        Iterator it;
        int i = 2;
        int i2 = 0;
        C1147 c1147 = c3496.f13532;
        if (c1147 == null || (arrayList = c1147.f4789) == null || arrayList.size() <= 0) {
            return;
        }
        Iterator it2 = c3496.f13532.f4789.iterator();
        while (it2.hasNext()) {
            C3493 c3493 = (C3493) it2.next();
            byte[] bArr = (byte[]) this.f12725;
            byte[] bArr2 = (byte[]) this.f12724;
            if (c3493 == null) {
                throw new ZipException("input parameters is null, cannot write local file header");
            }
            try {
                byte[] bArr3 = new byte[i];
                // fill-array-data instruction
                bArr3[0] = 0;
                bArr3[1] = 0;
                boolean z = c3493.f13494 >= 4294967295L || c3493.f13499 >= 4294967295L || c3493.f13512 >= 4294967295L || c3493.f13510 >= 65535;
                c3222.m7953(byteArrayOutputStream, (int) ˉᵎ.ʿʼ(c3493.f5033));
                c3222.m7932(byteArrayOutputStream, c3493.f13513);
                c3222.m7932(byteArrayOutputStream, c3493.f13495);
                byteArrayOutputStream.write(c3493.f13500);
                c3222.m7932(byteArrayOutputStream, ᵎˏ.ﹳﹳ(c3493.f13493));
                C3222.m7925(c3493.f13505, bArr2);
                byteArrayOutputStream.write(bArr2, i2, 4);
                C3222.m7925(c3493.f13507, bArr2);
                byteArrayOutputStream.write(bArr2, i2, 4);
                if (z) {
                    C3222.m7925(4294967295L, bArr2);
                    byteArrayOutputStream.write(bArr2, i2, 4);
                    byteArrayOutputStream.write(bArr2, i2, 4);
                    c3496.f13536 = true;
                } else {
                    C3222.m7925(c3493.f13494, bArr2);
                    byteArrayOutputStream.write(bArr2, i2, 4);
                    C3222.m7925(c3493.f13499, bArr2);
                    byteArrayOutputStream.write(bArr2, i2, 4);
                }
                byte[] bytes = new byte[i2];
                if (AbstractC2978.m7367(c3493.f13492)) {
                    bytes = c3493.f13492.getBytes(AbstractC2980.f11456);
                }
                c3222.m7932(byteArrayOutputStream, bytes.length);
                byte[] bArr4 = new byte[4];
                if (z) {
                    it = it2;
                    C3222.m7925(4294967295L, bArr2);
                    System.arraycopy(bArr2, 0, bArr4, 0, 4);
                } else {
                    it = it2;
                    C3222.m7925(c3493.f13512, bArr2);
                    System.arraycopy(bArr2, 0, bArr4, 0, 4);
                }
                int i3 = z ? 32 : 0;
                if (c3493.f13504 != null) {
                    i3 += 11;
                }
                List<C3502> list = c3493.f13503;
                if (list != null) {
                    for (C3502 c3502 : list) {
                        long j = c3502.f13560;
                        if (j != 39169 && j != 1) {
                            i3 += c3502.f13561 + 4;
                        }
                    }
                }
                c3222.m7932(byteArrayOutputStream, i3);
                String str = c3493.f13509;
                byte[] bytes2 = new byte[0];
                if (AbstractC2978.m7367(str)) {
                    bytes2 = str.getBytes(AbstractC2980.f11456);
                }
                c3222.m7932(byteArrayOutputStream, bytes2.length);
                if (z) {
                    C3222.m7926(65535, bArr);
                    byteArrayOutputStream.write(bArr, 0, 2);
                } else {
                    c3222.m7932(byteArrayOutputStream, c3493.f13510);
                }
                byteArrayOutputStream.write(bArr3);
                byteArrayOutputStream.write(c3493.f13511);
                byteArrayOutputStream.write(bArr4);
                if (bytes.length > 0) {
                    byteArrayOutputStream.write(bytes);
                }
                if (z) {
                    c3496.f13536 = true;
                    c3222.m7932(byteArrayOutputStream, (int) 1);
                    c3222.m7932(byteArrayOutputStream, 28);
                    c3222.m7952(byteArrayOutputStream, c3493.f13499);
                    c3222.m7952(byteArrayOutputStream, c3493.f13494);
                    c3222.m7952(byteArrayOutputStream, c3493.f13512);
                    c3222.m7953(byteArrayOutputStream, c3493.f13510);
                }
                C3499 c3499 = c3493.f13504;
                if (c3499 != null) {
                    c3222.m7932(byteArrayOutputStream, (int) ˉᵎ.ʿʼ(c3499.f5033));
                    c3222.m7932(byteArrayOutputStream, c3499.f13552);
                    c3222.m7932(byteArrayOutputStream, ᵎˏ.ﹶˆ(c3499.f13553));
                    byteArrayOutputStream.write(c3499.f13551.getBytes(AbstractC2980.f11456));
                    i2 = 0;
                    byteArrayOutputStream.write(new byte[]{(byte) ᵎˏ.ᐧʻ(c3499.f13554)});
                    c3222.m7932(byteArrayOutputStream, ᵎˏ.ﹳﹳ(c3499.f13555));
                } else {
                    i2 = 0;
                }
                m8034(c3493, byteArrayOutputStream);
                if (bytes2.length > 0) {
                    byteArrayOutputStream.write(bytes2);
                }
                it2 = it;
                i = 2;
            } catch (Exception e) {
                throw new ZipException(e);
            }
        }
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᵎˏ */
    public void mo5351(int i) {
        ((MediaCodec) this.f12726).setVideoScalingMode(i);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ᵎـ */
    public void mo5526(Object obj, Object obj2, String str) {
        m8037(new Object[]{obj, obj2});
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public void m8040() {
        synchronized (this) {
            C3374 c3374 = (C3374) this.f12724;
            c3374.getClass();
            C3374.f13198.decrementAndGet(c3374);
            if (((C3374) this.f12724).f13199 < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᵔٴ */
    public void mo5352(C0959 c0959, Handler handler) {
        ((MediaCodec) this.f12726).setOnFrameRenderedListener(new C4121(this, c0959, 1), handler);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ᵔﹳ */
    public void mo5527(Object... objArr) {
        m8037(objArr);
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ᵢʿ */
    public ByteBuffer mo5353(int i) {
        return AbstractC4470.f17202 >= 21 ? ((MediaCodec) this.f12726).getOutputBuffer(i) : ((ByteBuffer[]) this.f12725)[i];
    }

    @Override // p385.InterfaceC4490
    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public byte[] mo8041(C4495 c4495) {
        return m8023((InterfaceC0864) this.f12726, c4495.f17309 + "&signedRequest=" + AbstractC4470.m10188(c4495.f17310), null, Collections.emptyMap());
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public void m8042(C3226 c3226) {
        InterfaceC3251 interfaceC3251;
        synchronized (this) {
            ((HashMap) this.f12726).remove(c3226.f12544);
            if (c3226.f12542 && (interfaceC3251 = c3226.f12543) != null) {
                ((C3233) this.f12725).m7987(c3226.f12544, new C3245(interfaceC3251, true, false, c3226.f12544, (C3233) this.f12725));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:27:0x00ad, B:7:0x0021, B:9:0x0044, B:10:0x0050, B:12:0x005b, B:17:0x006a, B:18:0x0075, B:19:0x0076, B:21:0x008f, B:23:0x009a, B:25:0x00a5, B:26:0x00a9), top: B:34:0x0019, inners: #0 }] */
    @Override // p456.InterfaceC5293
    /* renamed from: ﹳˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo7954(java.lang.String r7, int r8, java.io.IOException r9, byte[] r10, java.util.Map r11) {
        /*
            r6 = this;
            java.lang.Object r7 = r6.f12725
            ﾞⁱ.ˋᴵ r7 = (p456.C5273) r7
            ﾞⁱ.ʿˊ r10 = r7.mo11648()
            r10.m11740()
            r7.m11794()
            java.lang.Object r10 = r6.f12724
            ʽˉ.ˏᴵ r10 = (p041.C1278) r10
            java.lang.Object r11 = r6.f12726
            java.lang.String r11 = (java.lang.String) r11
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            if (r8 == r0) goto L1f
            r0 = 204(0xcc, float:2.86E-43)
            if (r8 != r0) goto Lad
        L1f:
            if (r9 != 0) goto Lad
            ﾞⁱ.ﹶˆ r9 = r7.f20428     // Catch: java.lang.Throwable -> L67
            p456.C5273.m11792(r9)     // Catch: java.lang.Throwable -> L67
            long r2 = r10.f5257     // Catch: java.lang.Throwable -> L67
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L67
            r9.ʼᵎ()     // Catch: java.lang.Throwable -> L67
            r9.m11909()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.measurement.C0472.m2260()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r9.ᐧⁱ     // Catch: java.lang.Throwable -> L67
            ﾞⁱ.ʻﹳ r0 = (p456.C5236) r0     // Catch: java.lang.Throwable -> L67
            ﾞⁱ.ʿʼ r0 = r0.f20123     // Catch: java.lang.Throwable -> L67
            ﾞⁱ.ˆʿ r2 = p456.AbstractC5248.f20217     // Catch: java.lang.Throwable -> L67
            r3 = 0
            boolean r0 = r0.m11727(r3, r2)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L76
            android.database.sqlite.SQLiteDatabase r0 = r9.m12074()     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowid=?"
            int r10 = r0.delete(r4, r5, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r0 = 1
            if (r10 == r0) goto L76
            ﾞⁱ.ـˆ r10 = r9.ˏᵢ()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            ʽˉ.ʽᐧ r10 = r10.f20568     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            java.lang.String r0 = "Deleted fewer rows from upload_queue than expected"
            r10.m4533(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            goto L76
        L67:
            r8 = move-exception
            goto Ld3
        L69:
            r8 = move-exception
            ﾞⁱ.ـˆ r9 = r9.ˏᵢ()     // Catch: java.lang.Throwable -> L67
            ʽˉ.ʽᐧ r9 = r9.f20571     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "Failed to delete a MeasurementBatch in a upload_queue table"
            r9.m4531(r8, r10)     // Catch: java.lang.Throwable -> L67
            throw r8     // Catch: java.lang.Throwable -> L67
        L76:
            ﾞⁱ.ـˆ r9 = r7.mo11655()     // Catch: java.lang.Throwable -> L67
            ʽˉ.ʽᐧ r9 = r9.f20566     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L67
            r9.m4529(r11, r8, r10)     // Catch: java.lang.Throwable -> L67
            ﾞⁱ.ʿʼ r8 = r7.m11832()     // Catch: java.lang.Throwable -> L67
            boolean r8 = r8.m11727(r3, r2)     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto La9
            ﾞⁱ.ˑⁱ r8 = r7.f20420     // Catch: java.lang.Throwable -> L67
            p456.C5273.m11792(r8)     // Catch: java.lang.Throwable -> L67
            boolean r8 = r8.m11896()     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto La9
            ﾞⁱ.ﹶˆ r8 = r7.f20428     // Catch: java.lang.Throwable -> L67
            p456.C5273.m11792(r8)     // Catch: java.lang.Throwable -> L67
            boolean r8 = r8.m12082(r11)     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto La9
            r7.m11793(r11)     // Catch: java.lang.Throwable -> L67
            goto Lcd
        La9:
            r7.m11801()     // Catch: java.lang.Throwable -> L67
            goto Lcd
        Lad:
            ﾞⁱ.ـˆ r9 = r7.mo11655()     // Catch: java.lang.Throwable -> L67
            ʽˉ.ʽᐧ r9 = r9.f20566     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Network upload failed. Will retry later. appId, status"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L67
            r9.m4529(r11, r8, r0)     // Catch: java.lang.Throwable -> L67
            ﾞⁱ.ﹶˆ r8 = r7.f20428     // Catch: java.lang.Throwable -> L67
            p456.C5273.m11792(r8)     // Catch: java.lang.Throwable -> L67
            long r9 = r10.f5257     // Catch: java.lang.Throwable -> L67
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L67
            r8.m12060(r9)     // Catch: java.lang.Throwable -> L67
            r7.m11801()     // Catch: java.lang.Throwable -> L67
        Lcd:
            r7.f20446 = r1
            r7.m11810()
            return
        Ld3:
            r7.f20446 = r1
            r7.m11810()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p266.C3262.mo7954(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ﹳˑ */
    public MediaFormat mo5354() {
        return ((MediaCodec) this.f12726).getOutputFormat();
    }

    @Override // p341.InterfaceC3904
    /* renamed from: ﹳﹳ */
    public void mo4801(C4458 c4458, InterfaceC3177 interfaceC3177, C3898 c3898) {
        this.f12724 = c4458;
        c3898.m9092();
        c3898.m9091();
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(c3898.f15099, 5);
        this.f12725 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840((C2431) this.f12726);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ﹳﹶ */
    public void mo5528(String str) {
        m8037(null);
    }

    @Override // p188.InterfaceC2612
    /* renamed from: ﹶˆ */
    public Bitmap mo6789(BitmapFactory.Options options) {
        C2639 c2639 = (C2639) ((C0282) this.f12726).f2327;
        c2639.reset();
        return BitmapFactory.decodeStream(c2639, null, options);
    }

    @Override // p344.InterfaceC3918
    /* renamed from: ﾞʽ */
    public void mo5529(Object obj, Object obj2, String str) {
        m8037(new Object[]{obj, obj2});
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ﾞˊ */
    public /* synthetic */ boolean mo5355(C4117 c4117) {
        return false;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public synchronized void m8043(C3234 c3234, C3245 c3245) {
        C3226 c3226 = (C3226) ((HashMap) this.f12726).put(c3234, new C3226(c3234, c3245, (ReferenceQueue) this.f12724));
        if (c3226 != null) {
            c3226.f12543 = null;
            c3226.clear();
        }
    }

    @Override // p362.InterfaceC4129
    /* renamed from: ﾞᐧ */
    public int mo5356() {
        return ((MediaCodec) this.f12726).dequeueInputBuffer(0L);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m8044(C3496 c3496, OutputStream outputStream, byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new ZipException("invalid buff to write as zip headers");
        }
        if (outputStream instanceof C0979) {
            C0979 c0979 = (C0979) outputStream;
            int length = bArr.length;
            if (c0979.m3947()) {
                C0974 c0974 = c0979.f4320;
                if (length < 0) {
                    c0974.getClass();
                    throw new ZipException("negative buffersize for checkBufferSizeAndStartNextSplitFile");
                }
                long j = c0974.f4309;
                if (j >= 65536 && c0974.f4310 + length > j) {
                    try {
                        c0974.m3945();
                        c0974.f4310 = 0L;
                        m8027(c3496, outputStream);
                        return;
                    } catch (IOException e) {
                        throw new ZipException(e);
                    }
                }
            }
        }
        outputStream.write(bArr);
    }
}
