package p000;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import p331.C3758;
import p345.C3930;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʻ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0877 extends AbstractC0863 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f3981;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f3982;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C3758 f3983;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f3984;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public long f3985;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public HttpURLConnection f3986;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public InputStream f3987;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f3988;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3758 f3989;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f3990;

    public C0877(int i, int i2, C3758 c3758) {
        super(true);
        this.f3982 = i;
        this.f3988 = i2;
        this.f3989 = c3758;
        this.f3983 = new C3758(2);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m3691(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (httpURLConnection == null || AbstractC4470.f17202 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static String m3692(HttpURLConnection httpURLConnection, String str) {
        try {
            return httpURLConnection.getHeaderField(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        try {
            InputStream inputStream = this.f3987;
            if (inputStream != null) {
                long j = this.f3985;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f3984;
                }
                m3691(this.f3986, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = AbstractC4470.f17202;
                    throw new HttpDataSource$HttpDataSourceException(2000, 3, e);
                }
            }
        } finally {
            this.f3987 = null;
            m3694();
            if (this.f3990) {
                this.f3990 = false;
                m3675();
            }
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m3693(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f3987;
            int i = AbstractC4470.f17202;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(2000, 1, new InterruptedIOException());
            }
            if (i2 == -1) {
                throw new HttpDataSource$HttpDataSourceException(2008);
            }
            j -= i2;
            m3676(i2);
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
            long r0 = r6.f3985     // Catch: java.io.IOException -> L33
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r2 = r6.f3984     // Catch: java.io.IOException -> L33
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
            java.io.InputStream r0 = r6.f3987     // Catch: java.io.IOException -> L33
            int r1 = p383.AbstractC4470.f17202     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r4) goto L29
            goto L16
        L29:
            long r8 = r6.f3984     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f3984 = r8     // Catch: java.io.IOException -> L33
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0877.mo3679(byte[], int, int):int");
    }

    @Override // p000.AbstractC0863, p000.InterfaceC0875
    /* renamed from: ˉי */
    public final Map mo3674() {
        HttpURLConnection httpURLConnection = this.f3986;
        return httpURLConnection == null ? C3930.f15266 : new C0868(httpURLConnection.getHeaderFields());
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m3694() {
        HttpURLConnection httpURLConnection = this.f3986;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC4464.m10147("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f3986 = null;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final HttpURLConnection m3695(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                TrustManager[] trustManagerArr = {new ˏʾ(0)};
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, trustManagerArr, null);
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Exception unused) {
            }
        }
        httpURLConnection.setConnectTimeout(this.f3982);
        httpURLConnection.setReadTimeout(this.f3988);
        HashMap map2 = new HashMap();
        C3758 c3758 = this.f3989;
        if (c3758 != null) {
            map2.putAll(c3758.m8734());
        }
        map2.putAll(this.f3983.m8734());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strM3697 = AbstractC0879.m3697(j, j2);
        if (strM3697 != null) {
            httpURLConnection.setRequestProperty("Range", strM3697);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C0882.m3698(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152 A[Catch: IOException -> 0x015c, TRY_LEAVE, TryCatch #6 {IOException -> 0x015c, blocks: (B:54:0x014a, B:56:0x0152), top: B:111:0x014a }] */
    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo3680(p000.C0882 r23) throws java.security.NoSuchAlgorithmException, java.io.IOException, java.lang.NumberFormatException, java.security.KeyManagementException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0877.mo3680(ʻ.ﹶˆ):long");
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        HttpURLConnection httpURLConnection = this.f3986;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
