package p048;

import android.net.Uri;
import androidx.leanback.widget.ʿˏ;
import androidx.leanback.widget.ﾞᐧ;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import p000.AbstractC0863;
import p000.AbstractC0879;
import p000.C0882;
import p035.C1232;
import p041.C1274;
import p166.AbstractC2426;
import p237.C3093;
import p331.C3758;
import p383.AbstractC4470;
import p395.C4544;
import p405.AbstractC4639;
import p430.AbstractC4996;
import p430.AbstractC5001;
import p430.C4994;
import p430.C4999;
import p430.C5004;
import p430.C5014;
import p430.C5021;

/* renamed from: ʽⁱ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1307 extends AbstractC0863 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f5334;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4999 f5335;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C3758 f5336;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public long f5337;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C4994 f5338;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public InputStream f5339;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3758 f5340;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final String f5341;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f5342;

    static {
        AbstractC2426.m6526("media3.datasource.okhttp");
    }

    public C1307(C4999 c4999, String str, C3758 c3758) {
        super(true);
        c4999.getClass();
        this.f5335 = c4999;
        this.f5341 = str;
        this.f5336 = c3758;
        this.f5340 = new C3758(2);
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        if (this.f5342) {
            this.f5342 = false;
            m3675();
            m4609();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo3679(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L32
        L4:
            long r0 = r6.f5334     // Catch: java.io.IOException -> L33
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r2 = r6.f5337     // Catch: java.io.IOException -> L33
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
        L16:
            r7 = -1
            goto L32
        L18:
            long r2 = (long) r9     // Catch: java.io.IOException -> L33
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.io.IOException -> L33
            int r9 = (int) r0     // Catch: java.io.IOException -> L33
        L1e:
            java.io.InputStream r0 = r6.f5339     // Catch: java.io.IOException -> L33
            int r1 = p383.AbstractC4470.f17202     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r4) goto L29
            goto L16
        L29:
            long r8 = r6.f5337     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f5337 = r8     // Catch: java.io.IOException -> L33
            r6.m3676(r7)     // Catch: java.io.IOException -> L33
        L32:
            return r7
        L33:
            r7 = move-exception
            int r8 = p383.AbstractC4470.f17202
            r8 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r7 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.m1098(r8, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p048.C1307.mo3679(byte[], int, int):int");
    }

    @Override // p000.AbstractC0863, p000.InterfaceC0875
    /* renamed from: ˉי */
    public final Map mo3674() {
        C4994 c4994 = this.f5338;
        return c4994 == null ? Collections.emptyMap() : c4994.f18889.m11102();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m4609() {
        C4994 c4994 = this.f5338;
        if (c4994 != null) {
            AbstractC5001 abstractC5001 = c4994.f18890;
            abstractC5001.getClass();
            abstractC5001.close();
            this.f5338 = null;
        }
        this.f5339 = null;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws IOException {
        C5004 c5004M7602;
        long j = 0;
        this.f5337 = 0L;
        this.f5334 = 0L;
        m3673();
        long j2 = c0882.f4001;
        String string = c0882.f4004.toString();
        try {
            C3093 c3093 = new C3093();
            c3093.m7601(null, string);
            c5004M7602 = c3093.m7602();
        } catch (IllegalArgumentException unused) {
            c5004M7602 = null;
        }
        if (c5004M7602 == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", 1004);
        }
        ʿˏ r8 = new ʿˏ();
        r8.ᐧⁱ = c5004M7602;
        HashMap map = new HashMap();
        C3758 c3758 = this.f5336;
        if (c3758 != null) {
            map.putAll(c3758.m8734());
        }
        map.putAll(this.f5340.m8734());
        map.putAll(c0882.f4007);
        for (Map.Entry entry : map.entrySet()) {
            r8.ˉⁱ((String) entry.getKey(), (String) entry.getValue());
        }
        long j3 = c0882.f4005;
        String strM3697 = AbstractC0879.m3697(j2, j3);
        if (strM3697 != null) {
            ((C1232) r8.ˎˑ).m4427("Range", strM3697);
        }
        String str = this.f5341;
        if (str != null) {
            ((C1232) r8.ˎˑ).m4427("User-Agent", str);
        }
        if ((c0882.f4002 & 1) != 1) {
            ((C1232) r8.ˎˑ).m4427("Accept-Encoding", "identity");
        }
        int i = c0882.f4000;
        byte[] bArr = c0882.f4003;
        r8.ˋⁱ(C0882.m3698(i), bArr != null ? AbstractC4996.create(bArr) : i == 2 ? AbstractC4996.create(AbstractC4470.f17203) : null);
        C5021 c5021 = r8.ˏᵢ();
        C4999 c4999 = this.f5335;
        c4999.getClass();
        C1274 c1274 = new C1274(c4999, c5021);
        try {
            C4544 c4544 = new C4544();
            c1274.m4543(new ﾞᐧ(8, c4544));
            try {
                C4994 c4994 = (C4994) c4544.get();
                this.f5338 = c4994;
                AbstractC5001 abstractC5001 = c4994.f18890;
                abstractC5001.getClass();
                this.f5339 = abstractC5001.mo5667().mo9494();
                boolean zM11083 = c4994.m11083();
                long j4 = c0882.f4001;
                int i2 = c4994.f18886;
                if (zM11083) {
                    abstractC5001.mo5666();
                    if (i2 == 200 && j4 != 0) {
                        j = j4;
                    }
                    if (j3 != -1) {
                        this.f5334 = j3;
                    } else {
                        long jMo5668 = abstractC5001.mo5668();
                        this.f5334 = jMo5668 != -1 ? jMo5668 - j : -1L;
                    }
                    this.f5342 = true;
                    m3677(c0882);
                    try {
                        m4610(j);
                        return this.f5334;
                    } catch (HttpDataSource$HttpDataSourceException e) {
                        m4609();
                        throw e;
                    }
                }
                C5014 c5014 = c4994.f18889;
                if (i2 == 416 && j4 == AbstractC0879.m3696(c5014.m11104("Content-Range"))) {
                    this.f5342 = true;
                    m3677(c0882);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                try {
                    InputStream inputStream = this.f5339;
                    inputStream.getClass();
                    AbstractC4639.m10547(inputStream);
                } catch (IOException unused2) {
                    int i3 = AbstractC4470.f17202;
                }
                TreeMap treeMapM11102 = c5014.m11102();
                m4609();
                throw new HttpDataSource$InvalidResponseCodeException(i2, i2 == 416 ? new DataSourceException(2008) : null, treeMapM11102);
            } catch (InterruptedException unused3) {
                c1274.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw HttpDataSource$HttpDataSourceException.m1098(1, e3);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        C4994 c4994 = this.f5338;
        if (c4994 == null) {
            return null;
        }
        return Uri.parse(c4994.f18887.f19052.f18962);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m4610(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096);
                InputStream inputStream = this.f5339;
                int i = AbstractC4470.f17202;
                int i2 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i2 == -1) {
                    throw new HttpDataSource$HttpDataSourceException(2008);
                }
                j -= i2;
                m3676(i2);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }
}
