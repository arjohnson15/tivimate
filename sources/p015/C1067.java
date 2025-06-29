package p015;

import android.database.Cursor;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.leanback.widget.InterfaceC0165;
import androidx.leanback.widget.InterfaceC0184;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.preference.PreferenceScreen;
import ar.tvplayer.tv.base.ui.UpdateAppActivity;
import ar.tvplayer.tv.base.ui.view.CustomHorizontalGridView;
import ar.tvplayer.tv.base.ui.view.CustomVerticalGridView;
import com.google.firebase.encoders.EncodingException;
import com.parse.AbstractC0800;
import com.parse.LogOutCallback;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p013.C1034;
import p031.InterfaceC1197;
import p033.C1213;
import p033.C1218;
import p036.C1245;
import p036.C1247;
import p036.C1255;
import p036.InterfaceC1249;
import p043.C1290;
import p043.C1294;
import p061.AbstractC1373;
import p070.AbstractC1549;
import p071.C1571;
import p071.InterfaceC1566;
import p084.C1713;
import p121.C1868;
import p121.C1876;
import p135.C2093;
import p135.C2095;
import p166.C2433;
import p175.C2484;
import p186.C2599;
import p191.EnumC2648;
import p254.C3179;
import p254.InterfaceC3172;
import p268.C3282;
import p278.AbstractC3362;
import p282.C3377;
import p306.C3554;
import p306.InterfaceC3552;
import p323.C3683;
import p323.C3697;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3961;
import p353.InterfaceC4019;
import p374.C4261;
import p383.AbstractC4470;
import p383.InterfaceC4461;
import p395.AbstractC4535;
import p438.C5074;
import p450.InterfaceC5190;
import p450.InterfaceC5191;
import ˆٴ.ˉⁱ;
import ˈⁱ.ﹳﹳ;
import ˈﾞ.ˈﹳ;
import ˈﾞ.ᵢٴ;
import ˈﾞ.ᵢᵢ;
import ˉʿ.ˑʽ;
import ˉﾞ.ᴵᴵ;
import ˏʼ.ʽᐧ;
import ـˏ.ˉˑ;
import ـˏ.ﾞᐧ;
import ٴʾ.ˉי;
import ٴʾ.ˑי;
import ٴʾ.ᵎˏ;
import ᐧ.ʿʼ;

/* renamed from: ʻٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1067 implements InterfaceC3172, InterfaceC4461, InterfaceC1249, InterfaceC5191, InterfaceC0184, InterfaceC1197, InterfaceC0165, InterfaceC1566, LogOutCallback, InterfaceC3552, SignUpCallback, InterfaceC4019 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f4608;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4609;

    public /* synthetic */ C1067(int i, Object obj) {
        this.f4609 = i;
        this.f4608 = obj;
    }

    public /* synthetic */ C1067(C1218 c1218, Object obj, int i) {
        this.f4609 = i;
        this.f4608 = obj;
    }

    public /* synthetic */ C1067(C1218 c1218, C4261 c4261, C2484 c2484, IOException iOException, boolean z) {
        this.f4609 = 3;
        this.f4608 = c2484;
    }

    @Override // p306.InterfaceC3552, p353.InterfaceC4019
    public Object apply(Object obj) {
        switch (this.f4609) {
            case 23:
                Cursor cursor = (Cursor) obj;
                C3554 c3554 = (C3554) this.f4608;
                c3554.getClass();
                while (cursor.moveToNext()) {
                    c3554.m8435(cursor.getInt(0), EnumC2648.f10512, cursor.getString(1));
                }
                return null;
            default:
                C3697 c3697 = (C3697) obj;
                ((C3683) this.f4608).getClass();
                return c3697;
        }
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        switch (this.f4609) {
            case 20:
                C2599.f10350.getClass();
                C2599.m6767("");
                ᵎˏ r0 = (ᵎˏ) this.f4608;
                r0.ʽᐧ.ˏʾ(new ˑי((ParseException) th));
                break;
            default:
                AbstractC0800.m3527(this, th);
                break;
        }
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo4092(Object obj) {
        C1213 c1213 = (C1213) obj;
        switch (this.f4609) {
            case 1:
                c1213.f4979 = (ExoPlaybackException) this.f4608;
                break;
            case 2:
                int i = c1213.f4986;
                C5074 c5074 = (C5074) this.f4608;
                c1213.f4986 = i + c5074.f19244;
                c1213.f4975 += c5074.f19236;
                break;
            default:
                c1213.getClass();
                c1213.f4967 = ((C2484) this.f4608).f9899;
                break;
        }
    }

    @Override // p036.InterfaceC1249
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C3932 mo4093(int i, C2433 c2433, int[] iArr) {
        C3961 c3961M9205 = AbstractC3980.m9205();
        for (int i2 = 0; i2 < c2433.f9699; i2++) {
            int i3 = i2;
            c3961M9205.m9172(new C1247(i, c2433, i3, (C1245) this.f4608, iArr[i2]));
        }
        return c3961M9205.m9167();
    }

    @Override // p071.InterfaceC1566
    /* renamed from: ˉי, reason: contains not printable characters */
    public void mo4094(Object obj) throws InterruptedException {
        ˉי r5;
        boolean zCanRequestPackageInstalls = false;
        Object obj2 = this.f4608;
        switch (this.f4609) {
            case 15:
                int i = UpdateAppActivity.ﹳﹶ;
                UpdateAppActivity updateAppActivity = (UpdateAppActivity) obj2;
                if (Build.VERSION.SDK_INT >= 26) {
                    zCanRequestPackageInstalls = updateAppActivity.getPackageManager().canRequestPackageInstalls();
                } else if (Settings.Secure.getInt(updateAppActivity.getContentResolver(), "install_non_market_apps") == 1) {
                    zCanRequestPackageInstalls = true;
                }
                if (!zCanRequestPackageInstalls) {
                    updateAppActivity.finish();
                    break;
                } else {
                    updateAppActivity.ᴵʿ();
                    break;
                }
            case 16:
            case 17:
            default:
                ((ʿʼ) obj2).ٴᐧ();
                break;
            case 18:
                ˉˑ r1 = (ˉˑ) obj2;
                r1.getClass();
                if (((C1571) obj).f6322 != -1) {
                    r1.ᵢٴ = 0L;
                    break;
                }
                break;
            case 19:
                C3377 c3377 = (C3377) obj2;
                c3377.getClass();
                ParseUser currentUser = ParseUser.getCurrentUser();
                if (currentUser != null) {
                    C2599 c2599 = C2599.f10350;
                    String email = currentUser.getEmail();
                    c2599.getClass();
                    C2599.m6767(email);
                    ʼʽ.ˉי.ʽᐧ.await();
                    ParseCloud.callFunctionInBackground("setUsersAcls", C1034.f4436);
                    if (ParseUser.getCurrentUser() == null) {
                        r5 = ˉי.ᐧⁱ;
                    } else {
                        C3377.m8230(c3377, false, 3);
                        r5 = ˉי.ˆʿ;
                    }
                    c3377.f13211 = r5;
                    c3377.m8232();
                    break;
                }
                break;
        }
    }

    @Override // p254.InterfaceC3172
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long mo4095(long j) {
        return AbstractC4470.m10184((j * r0.f12277) / 1000000, 0L, ((C3179) this.f4608).f12278 - 1);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ˑʽ m4096(Object obj) throws IOException {
        C2093 c2093 = (C2093) obj;
        C2095 c2095 = (C2095) this.f4608;
        URL url = c2093.f8272;
        if (Log.isLoggable(ﹳﹳ.יʻ("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        URL url2 = c2093.f8272;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://example.qtq").openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c2095.f8284);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c2093.f8271;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ʾי.ˑʽ r4 = c2095.f8282;
                    C1876 c1876 = c2093.f8270;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C1294 c1294 = (C1294) r4.ˆʿ;
                    C1290 c1290 = new C1290(bufferedWriter, c1294.f5314, c1294.f5312, c1294.f5313, c1294.f5315);
                    c1290.m4585(c1876);
                    c1290.m4584();
                    c1290.f5300.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(ﹳﹳ.יʻ("https://example.qtq"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    ﹳﹳ.ˋⁱ("https://example.qtq", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    ﹳﹳ.ˋⁱ("https://example.qtq", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new ˑʽ(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new ˑʽ(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            ˑʽ r6 = new ˑʽ(responseCode, (URL) null, C1868.m5631(new BufferedReader(new InputStreamReader(gZIPInputStream))).f7143);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return r6;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e) {
            e = e;
            ﹳﹳ.ᴵʿ("https://example.qtq", "Couldn't encode request, returning with 400", e);
            return new ˑʽ(400, (URL) null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            ﹳﹳ.ᴵʿ("https://example.qtq", "Couldn't open connection, returning with 500", e);
            return new ˑʽ(500, (URL) null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            ﹳﹳ.ᴵʿ("https://example.qtq", "Couldn't open connection, returning with 500", e);
            return new ˑʽ(500, (URL) null, 0L);
        } catch (IOException e4) {
            e = e4;
            ﹳﹳ.ᴵʿ("https://example.qtq", "Couldn't encode request, returning with 400", e);
            return new ˑʽ(400, (URL) null, 0L);
        }
    }

    @Override // androidx.leanback.widget.InterfaceC0165
    /* renamed from: ـﹶ */
    public boolean mo960(KeyEvent keyEvent) {
        Object obj = this.f4608;
        switch (this.f4609) {
            case 8:
                return ((ᵢٴ) obj).ٴﹶ(keyEvent);
            case 9:
                return ((ˈﹳ) obj).ٴﹶ(keyEvent);
            case 10:
                return ((ᵢᵢ) obj).ٴﹶ(keyEvent);
            case 16:
                return ((ﾞᐧ) obj).ٴﹶ(keyEvent);
            case 17:
                return ((C3282) obj).ٴﹶ(keyEvent);
            case 22:
                return ((ᐧ.ﾞᐧ) obj).ٴﹶ(keyEvent);
            case 28:
                int i = CustomHorizontalGridView.ˉʽ;
                CustomHorizontalGridView customHorizontalGridView = (CustomHorizontalGridView) obj;
                AbstractC1373 adapter = customHorizontalGridView.getAdapter();
                int iMo974 = adapter != null ? adapter.mo974() : 0;
                if (iMo974 < 2 || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() > 0) {
                    return false;
                }
                if (keyEvent.getKeyCode() == 21 && customHorizontalGridView.getSelectedPosition() == 0 && customHorizontalGridView.ﾞʾ) {
                    customHorizontalGridView.setSelectedPosition(iMo974 - 1);
                } else {
                    if (keyEvent.getKeyCode() != 22 || customHorizontalGridView.getSelectedPosition() != iMo974 - 1) {
                        return false;
                    }
                    customHorizontalGridView.setSelectedPosition(0);
                }
                return true;
            default:
                return CustomVerticalGridView.ʾˈ((CustomVerticalGridView) obj, keyEvent);
        }
    }

    @Override // androidx.leanback.widget.InterfaceC0184
    /* renamed from: ٴˎ */
    public void mo981(View view, int i) throws NumberFormatException {
        ˉⁱ r0 = (ˉⁱ) this.f4608;
        if (i == -1) {
            r0.getClass();
            return;
        }
        String str = ((PreferenceScreen) r0.f9034.f9116).m1202(i).f1558;
        if (AbstractC1549.m5138(r0.ʾʼ, str)) {
            return;
        }
        r0.ʾʼ = str;
        ᴵᴵ r2 = AbstractC3362.m8208(str);
        C1255 c1255 = ʽᐧ.ʿʼ;
        if (c1255 != null) {
            AbstractC4535.m10366(c1255, r2, 1);
        }
    }

    @Override // p450.InterfaceC5191
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void mo4097(InterfaceC5190 interfaceC5190) {
        C1713 c1713 = (C1713) this.f4608;
        c1713.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        c1713.f6682.set((C1713) interfaceC5190.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x041d  */
    @Override // p031.InterfaceC1197
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4098(androidx.leanback.widget.ʿˏ r45) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.C1067.mo4098(androidx.leanback.widget.ʿˏ):java.lang.Object");
    }
}
