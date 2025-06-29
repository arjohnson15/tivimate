package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC0293;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p003.C0893;
import p329.AbstractC3737;
import p329.C3743;

/* renamed from: com.bumptech.glide.load.data.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0272 implements InterfaceC0270 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f2312;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public volatile boolean f2313;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public HttpURLConnection f2314;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InputStream f2315;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0893 f2316;

    public C0272(C0893 c0893, int i) {
        this.f2316 = c0893;
        this.f2312 = i;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m1534(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            return Log.isLoggable("HttpUrlFetcher", 3) ? -1 : -1;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    public final void cancel() {
        this.f2313 = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ʽᐧ */
    public final void mo1527() throws IOException {
        InputStream inputStream = this.f2315;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2314;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2314 = null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InputStream m1535(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.f2312;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f2314 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f2315 = this.f2314.getInputStream();
                if (this.f2313) {
                    return null;
                }
                int iM1534 = m1534(this.f2314);
                int i3 = iM1534 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f2314;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f2315 = new C3743(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                String str = "Got non empty content encoding: " + httpURLConnection2.getContentEncoding();
                            }
                            this.f2315 = httpURLConnection2.getInputStream();
                        }
                        return this.f2315;
                    } catch (IOException e) {
                        throw new HttpException(m1534(httpURLConnection2), e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (iM1534 == -1) {
                        throw new HttpException(iM1534, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(iM1534, null, this.f2314.getResponseMessage());
                    } catch (IOException e2) {
                        throw new HttpException(iM1534, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.f2314.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(iM1534, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo1527();
                    return m1535(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(iM1534, e3, ᵎﹳ.ᐧʻ.ﾞˊ("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                throw new HttpException(m1534(this.f2314), e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new HttpException(0, e5, "URL.openConnection threw");
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ـﹶ */
    public final Class mo1533() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ٴˎ */
    public final void mo1529(EnumC0293 enumC0293, InterfaceC0281 interfaceC0281) {
        StringBuilder sb;
        C0893 c0893 = this.f2316;
        int i = AbstractC3737.f14494;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (c0893.f4028 == null) {
                    c0893.f4028 = new URL(c0893.m3714());
                }
                interfaceC0281.mo1540(m1535(c0893.f4028, 0, null, c0893.f4024.m3728()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                }
                interfaceC0281.mo1541(e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(AbstractC3737.m8704(jElapsedRealtimeNanos));
                sb.toString();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                String str = "Finished http url fetcher fetch in " + AbstractC3737.m8704(jElapsedRealtimeNanos);
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0270
    /* renamed from: ﹳﹳ */
    public final int mo1531() {
        return 2;
    }
}
