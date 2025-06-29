package p252;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.Parcelable;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import android.support.v4.media.session.AbstractC0001;
import android.text.Html;
import android.text.Spanned;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.content.FileProvider;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0105;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;
import androidx.leanback.widget.ʿˏ;
import androidx.lifecycle.AbstractC0224;
import androidx.lifecycle.C0227;
import androidx.lifecycle.InterfaceC0221;
import com.hierynomus.smbj.common.SMBRuntimeException;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.CookieManager;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.lsposed.hiddenapibypass.library.R;
import p004.AbstractC0933;
import p013.AbstractC1036;
import p013.AbstractC1037;
import p013.AbstractC1039;
import p013.C1053;
import p035.C1232;
import p038.C1268;
import p038.C1269;
import p041.C1274;
import p055.InterfaceC1332;
import p065.AbstractC1524;
import p065.C1504;
import p065.C1505;
import p065.C1514;
import p071.AbstractC1570;
import p078.EnumC1681;
import p078.EnumC1687;
import p078.EnumC1689;
import p110.C1806;
import p126.C2020;
import p127.C2034;
import p132.C2077;
import p143.C2227;
import p158.AbstractC2339;
import p180.InterfaceC2502;
import p186.AbstractC2593;
import p186.C2587;
import p215.EnumC2820;
import p225.AbstractC3019;
import p237.C3093;
import p245.C3115;
import p260.C3222;
import p260.C3223;
import p260.C3225;
import p278.AbstractC3362;
import p288.C3395;
import p288.C3406;
import p288.InterfaceC3401;
import p289.AbstractC3407;
import p293.C3474;
import p296.C3486;
import p307.C3563;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p331.C3758;
import p331.C3767;
import p331.C3768;
import p338.InterfaceC3856;
import p338.InterfaceC3865;
import p342.EnumC3910;
import p366.AbstractC4147;
import p366.C4144;
import p366.C4155;
import p366.C4156;
import p366.C4157;
import p366.C4167;
import p390.C4514;
import p395.AbstractC4535;
import p396.C4554;
import p430.C4993;
import p430.C4994;
import p430.C4999;
import p430.C5004;
import p430.C5020;
import p430.C5021;
import p446.C5158;
import p446.C5163;
import p446.C5166;
import p446.C5168;
import p457.C5367;
import ʻ.ˏʾ;
import ˈʼ.ﹳﹳ;
import ˉﾞ.ⁱⁱ;
import ˊﹶ.ˋˉ;
import יˈ.ʽᐧ;
import ᵔᵔ.ٴˎ;
import ᵢˈ.ˋˊ;
import ﹳᴵ.ˉי;
import ﹶˋ.ـﹶ;

/* renamed from: יˏ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3139 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile boolean f12115;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Integer f12116;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Integer f12117;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static long f12124;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3406 f12102 = new C3406(new ʽᐧ(2));

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3406 f12113 = new C3406(new ʽᐧ(12));

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3406 f12122 = new C3406(new ʽᐧ(13));

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C3406 f12103 = new C3406(new ʽᐧ(14));

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C3406 f12112 = new C3406(new ʽᐧ(15));

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C3406 f12123 = new C3406(new ʽᐧ(16));

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C3406 f12105 = new C3406(new ʽᐧ(17));

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C3406 f12110 = new C3406(new ʽᐧ(18));

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C3406 f12106 = new C3406(new ʽᐧ(19));

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final C3406 f12108 = new C3406(new ʽᐧ(20));

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final C3406 f12118 = new C3406(new ʽᐧ(3));

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final C3406 f12111 = new C3406(new ʽᐧ(4));

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final C3406 f12114 = new C3406(new ʽᐧ(5));

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final C3406 f12120 = new C3406(new ʽᐧ(6));

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final C3406 f12109 = new C3406(new ʽᐧ(7));

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final C3406 f12119 = new C3406(new ʽᐧ(8));

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final C3406 f12121 = new C3406(new ʽᐧ(9));

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final C3406 f12104 = new C3406(new ʽᐧ(10));

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static final C3406 f12107 = new C3406(new ʽᐧ(11));

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m7705(Uri uri) {
        try {
            ContentResolver contentResolver = ﹳﹳ.ـﹶ().getContentResolver();
            if (contentResolver != null) {
                contentResolver.takePersistableUriPermission(uri, 3);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static final String m7706(String str) {
        return AbstractC3629.m8559(str, ". ", ".", false);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final boolean m7707(String str) {
        return AbstractC3629.m8560(str, "content://", true);
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final InterfaceC3401 m7708(InterfaceC3865 interfaceC3865) {
        return ˈⁱ.ﹳﹳ.ᐧⁱ(3, interfaceC3865);
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static final Float m7709(float f) {
        if (f == 0.0f) {
            return null;
        }
        return Float.valueOf(f);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String m7710(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            strValueOf = String.valueOf(cCharAt).toUpperCase(Locale.getDefault());
            if (strValueOf.length() > 1) {
                if (cCharAt != 329) {
                    strValueOf = strValueOf.charAt(0) + strValueOf.substring(1).toLowerCase(Locale.ROOT);
                }
            } else if (strValueOf.equals(String.valueOf(cCharAt).toUpperCase(Locale.ROOT))) {
                strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public static final String m7711(String str) {
        return str.toLowerCase(Locale.getDefault());
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final String m7712(String str) {
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[263] != 24 || ((Number) ˋˊ.ـˆ.ʽᐧ(263)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[267] & 255) + 16)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[6312];
            boolean z = ʾˈ.ـﹶ;
        }
        boolean z2 = AbstractC2593.f10313;
        if (AbstractC2593.f10308 != null && (AbstractC3616.m8540(AbstractC2593.f10319, AbstractC2593.f10307, 0, false, 6) != AbstractC2593.f10315 - AbstractC2593.f10302 || AbstractC2593.f10308.contains(AbstractC2593.m6746()) || AbstractC2593.m6749().length() != AbstractC2593.m6750())) {
            ʾˈ.ٴˎ = false;
            AbstractC1036.m4003(ˏʼ.ʽᐧ.ˏʾ);
            AbstractC1036.m3992(AbstractC3362.f13181);
            boolean z3 = ʾˈ.ـﹶ;
        }
        try {
            C3093 c3093 = new C3093();
            c3093.m7601(null, str);
            return c3093.m7602().f18961;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public static final AbstractC1524 m7713(AbstractC1524 abstractC1524) {
        if (Build.VERSION.SDK_INT < 31) {
            return abstractC1524;
        }
        C3768 c3768 = (C3768) abstractC1524.f6193;
        c3768.f14580 = true;
        c3768.f14569 = 1;
        return abstractC1524.mo5106();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final void m7714(File file, InputStream inputStream) throws IOException {
        file.createNewFile();
        C4156 c4156 = ˏʼ.ʽᐧ.ˎˑ(inputStream);
        try {
            C4144 c4144 = new C4144(ˏʼ.ʽᐧ.ﹳˑ(file));
            try {
                c4144.m9536(c4156);
                AbstractC0001.m5(c4144, null);
                AbstractC0001.m5(c4156, null);
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final boolean m7715() {
        PackageManager packageManager;
        return Build.VERSION.SDK_INT >= 26 && (packageManager = ﹳﹳ.ـﹶ().getPackageManager()) != null && packageManager.hasSystemFeature("android.software.picture_in_picture");
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final boolean m7716(String str, Bundle bundle) {
        return bundle.getInt(str) != 0;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final File m7717(Context context, String str) {
        File file = new File(context.getNoBackupFilesDir(), str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final String m7718(int i) {
        return Build.VERSION.SDK_INT < 33 ? "android.permission.READ_EXTERNAL_STORAGE" : i == 1 ? "android.permission.READ_MEDIA_IMAGES" : i == 2 ? "android.permission.READ_MEDIA_VIDEO" : i == 3 ? "android.permission.READ_MEDIA_AUDIO" : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˆﾞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7719(androidx.work.CoroutineWorker r7, p185.AbstractC2562 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof יˏ.ˈٴ
            if (r0 == 0) goto L13
            r0 = r8
            יˏ.ˈٴ r0 = (יˏ.ˈٴ) r0
            int r1 = r0.ᵢʿ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ᵢʿ = r1
            goto L18
        L13:
            יˏ.ˈٴ r0 = new יˏ.ˈٴ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.ˆᵔ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ᵢʿ
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            ˈⁱ.ˉⁱ.ˆʿ(r8)     // Catch: java.lang.Exception -> L78
            goto L85
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            androidx.work.CoroutineWorker r7 = r0.ᐧˋ
            ˈⁱ.ˉⁱ.ˆʿ(r8)     // Catch: java.lang.Exception -> L78
            goto L48
        L3a:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            r0.ᐧˋ = r7     // Catch: java.lang.Exception -> L78
            r0.ᵢʿ = r5     // Catch: java.lang.Exception -> L78
            java.lang.Object r8 = r7.mo1369()     // Catch: java.lang.Exception -> L78
            if (r8 != r1) goto L48
            return r1
        L48:
            ﾞﹶ.ˋⁱ r8 = (p457.C5367) r8     // Catch: java.lang.Exception -> L78
            r2 = 0
            r0.ᐧˋ = r2     // Catch: java.lang.Exception -> L78
            r0.ᵢʿ = r4     // Catch: java.lang.Exception -> L78
            androidx.work.WorkerParameters r2 = r7.f20826     // Catch: java.lang.Exception -> L78
            ﹳʿ.ʿˏ r4 = r2.f1761     // Catch: java.lang.Exception -> L78
            android.content.Context r7 = r7.f20828     // Catch: java.lang.Exception -> L78
            java.util.UUID r2 = r2.f1757     // Catch: java.lang.Exception -> L78
            ᴵﹳ.ﹶˆ r5 = r4.f17765     // Catch: java.lang.Exception -> L78
            java.lang.Object r5 = r5.ᐧⁱ     // Catch: java.lang.Exception -> L78
            ʾᵔ.ᵔﹳ r5 = (p065.ExecutorC1522) r5     // Catch: java.lang.Exception -> L78
            ﹳʿ.ﹳˎ r6 = new ﹳʿ.ﹳˎ     // Catch: java.lang.Exception -> L78
            r6.<init>(r4, r2, r8, r7)     // Catch: java.lang.Exception -> L78
            ʼـ.ˑי r7 = new ʼـ.ˑי     // Catch: java.lang.Exception -> L78
            r8 = 17
            r7.<init>(r5, r8, r6)     // Catch: java.lang.Exception -> L78
            ﹳˎ.ˏʾ r7 = ﾞﹶ.ᵢʿ.ᴵʿ(r7)     // Catch: java.lang.Exception -> L78
            java.lang.Object r7 = android.support.v4.media.session.AbstractC0001.m25(r7, r0)     // Catch: java.lang.Exception -> L78
            if (r7 != r1) goto L74
            goto L75
        L74:
            r7 = r3
        L75:
            if (r7 != r1) goto L85
            return r1
        L78:
            ˊﹶ.ˋˉ r7 = p289.AbstractC3407.f13261
            java.lang.String r8 = "CommonUtils"
            r7.ᴵʼ(r8)
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            ˊﹶ.ˋˉ.ˑﾞ(r7)
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p252.AbstractC3139.m7719(androidx.work.CoroutineWorker, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static final boolean m7720() {
        return ((Boolean) f12104.getValue()).booleanValue();
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static final Integer m7721(int i) {
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C4999 m7722(boolean z, boolean z2, boolean z3) throws NoSuchAlgorithmException, KeyManagementException {
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[184] != 50 || ((Number) ᐧʻ.ـˆ.ʽᐧ(184)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[185] & 255) + 21)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[9200];
            boolean z4 = ʾˈ.ـﹶ;
        }
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[184] != 50 || ((Number) ˏᵢ.ـˆ.ʽᐧ(184)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[188] & 255) + 54)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[9200];
            boolean z5 = ʾˈ.ـﹶ;
        }
        boolean z6 = AbstractC2593.f10313;
        if (AbstractC2593.f10308 != null && (AbstractC3616.m8540(AbstractC2593.f10319, AbstractC2593.f10307, 0, false, 6) != AbstractC2593.f10315 - AbstractC2593.f10302 || AbstractC2593.f10308.contains(AbstractC2593.m6741()) || AbstractC2593.m6749().length() != AbstractC2593.m6750())) {
            ʾˈ.ٴˎ = false;
            AbstractC1036.m4003(ˏʼ.ʽᐧ.ˏʾ);
            AbstractC1036.m3992(AbstractC3362.f13181);
            boolean z7 = ʾˈ.ـﹶ;
        }
        C4993 c4993 = new C4993();
        List listM4011 = AbstractC1037.m4011(C5020.f19042, C5020.f19043, C5020.f19044);
        listM4011.equals(c4993.f18868);
        c4993.f18868 = AbstractC2339.m6432(listM4011);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c4993.f18858 = AbstractC2339.m6427(timeUnit);
        c4993.f18861 = AbstractC2339.m6427(timeUnit);
        if (z) {
            X509TrustManager x509TrustManager = new ˏʾ(1);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            if (socketFactory.equals(c4993.f18872)) {
                x509TrustManager.equals(c4993.f18865);
            }
            c4993.f18872 = socketFactory;
            C2034 c2034 = C2034.f7700;
            c4993.f18875 = C2034.f7700.mo5676(x509TrustManager);
            c4993.f18865 = x509TrustManager;
            c4993.f18863 = new ʿʼ();
        }
        if (z2) {
            c4993.f18859 = new C4554((CookieManager) f12112.getValue());
        }
        if (z3) {
            c4993.f18876.add(new C2020());
        }
        return new C4999(c4993);
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static final boolean m7723(int i) {
        if (m7720()) {
            return Environment.isExternalStorageManager();
        }
        String strM7718 = m7718(i);
        return strM7718.length() <= 0 || com.bumptech.glide.ﹳﹳ.ˏᵢ(ﹳﹳ.ـﹶ(), strM7718) == 0;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C1269 m7724() {
        boolean z = false;
        C1268 c1268 = new C1268();
        ArrayList arrayList = c1268.f5187;
        EnumSet enumSet = c1268.f5197;
        UUID uuidRandomUUID = UUID.randomUUID();
        if (uuidRandomUUID == null) {
            throw new IllegalArgumentException("Client GUID may not be null");
        }
        c1268.f5188 = uuidRandomUUID;
        c1268.f5201 = new SecureRandom();
        boolean z2 = C1268.f5186;
        c1268.f5199 = z2 ? new ˈˉ.ﹳﹳ(24) : new ˉי(14);
        c1268.f5195 = new C1806();
        c1268.f5198 = false;
        c1268.f5194 = 1048576;
        c1268.f5189 = 1048576;
        c1268.f5190 = 1048576;
        ٴˎ r7 = C1268.f5184;
        if (r7 == null) {
            throw new IllegalArgumentException("Transport layer factory may not be null");
        }
        c1268.f5191 = r7;
        long millis = C1268.f5185.toMillis(0L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Socket timeout should be less than 2147483647ms");
        }
        c1268.f5196 = (int) millis;
        List<EnumC1689> listAsList = Arrays.asList(EnumC1689.f6580, EnumC1689.f6578);
        if (listAsList == null) {
            throw new IllegalArgumentException("Dialects may not be null");
        }
        enumSet.clear();
        for (EnumC1689 enumC1689 : listAsList) {
            if (enumC1689 == null) {
                throw new IllegalArgumentException("Dialect may not be null");
            }
            enumSet.add(enumC1689);
        }
        ArrayList arrayList2 = new ArrayList();
        if (!z2) {
            try {
                arrayList2.add((InterfaceC2502) C3223.class.newInstance());
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                throw new SMBRuntimeException(e);
            }
        }
        arrayList2.add(new C3225());
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            InterfaceC2502 interfaceC2502 = (InterfaceC2502) it.next();
            if (interfaceC2502 == null) {
                throw new IllegalArgumentException("Authenticator may not be null");
            }
            arrayList.add(interfaceC2502);
        }
        TimeUnit timeUnit = C1268.f5183;
        c1268.f5202 = timeUnit.toMillis(60L);
        c1268.f5192 = timeUnit.toMillis(60L);
        c1268.f5200 = timeUnit.toMillis(60L);
        c1268.f5193 = new ˈˉ.ﹳﹳ(8);
        c1268.f5198 = true;
        if (enumSet.isEmpty()) {
            throw new IllegalStateException("At least one SMB dialect should be specified");
        }
        C1268 c12682 = new C1268();
        c12682.f5197.addAll(enumSet);
        c12682.f5187.addAll(arrayList);
        c12682.f5195 = c1268.f5195;
        c12682.f5201 = c1268.f5201;
        c12682.f5188 = c1268.f5188;
        c12682.f5199 = c1268.f5199;
        c12682.f5194 = c1268.f5194;
        c12682.f5202 = c1268.f5202;
        c12682.f5189 = c1268.f5189;
        c12682.f5192 = c1268.f5192;
        c12682.f5190 = c1268.f5190;
        c12682.f5200 = c1268.f5200;
        c12682.f5191 = c1268.f5191;
        c12682.f5196 = c1268.f5196;
        c12682.f5198 = c1268.f5198;
        c12682.f5193 = c1268.f5193;
        ـﹶ r5 = new ـﹶ(new C3115(1));
        C4514 c4514 = new C4514();
        c4514.f17374 = r5;
        C1269 c1269 = new C1269();
        c1269.f5207 = new ConcurrentHashMap();
        c1269.f5204 = c12682;
        c1269.f5205 = c4514;
        c4514.m10278(c1269);
        ٴˎ r4 = InterfaceC1332.f5414;
        C3767 c3767 = new C3767(4, z);
        c3767.f14557 = r4;
        c3767.f14558 = new ˉי(8);
        c1269.f5206 = c3767;
        return c1269;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007f -> B:30:0x0080). Please report as a decompilation issue!!! */
    /* renamed from: ˊˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7725(long r7, long r9, long r11, p338.InterfaceC3865 r13, p330.InterfaceC3746 r14) {
        /*
            boolean r0 = r14 instanceof יˏ.ᐧⁱ
            if (r0 == 0) goto L13
            r0 = r14
            יˏ.ᐧⁱ r0 = (יˏ.ᐧⁱ) r0
            int r1 = r0.ـˆ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.ـˆ = r1
            goto L18
        L13:
            יˏ.ᐧⁱ r0 = new יˏ.ᐧⁱ
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.ˋˉ
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.ـˆ
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            long r7 = r0.ᵢʿ
            long r9 = r0.ˆᵔ
            long r11 = r0.ᐧˋ
            ᵎˈ.ـﹶ r13 = r0.ﹳﹶ
            ˈⁱ.ˉⁱ.ˆʿ(r14)
            goto L80
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            long r11 = r0.ˆᵔ
            long r7 = r0.ᐧˋ
            ᵎˈ.ـﹶ r13 = r0.ﹳﹶ
            ˈⁱ.ˉⁱ.ˆʿ(r14)
            goto L5c
        L46:
            ˈⁱ.ˉⁱ.ˆʿ(r14)
            int r14 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r14 <= 0) goto L5c
            r0.ﹳﹶ = r13
            r0.ᐧˋ = r7
            r0.ˆᵔ = r11
            r0.ـˆ = r6
            java.lang.Object r9 = p072.AbstractC1642.m5297(r9, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r9 = r11
            r11 = r7
        L5e:
            java.lang.Object r7 = r13.mo1053()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L83
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r7 >= 0) goto L83
            r0.ﹳﹶ = r13
            r0.ᐧˋ = r11
            r0.ˆᵔ = r9
            r0.ᵢʿ = r3
            r0.ـˆ = r5
            java.lang.Object r7 = p072.AbstractC1642.m5297(r11, r0)
            if (r7 != r1) goto L7f
            return r1
        L7f:
            r7 = r3
        L80:
            long r3 = r7 + r11
            goto L5e
        L83:
            ٴˑ.ˉⁱ r7 = p288.C3397.f13249
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p252.AbstractC3139.m7725(long, long, long, ᵎˈ.ـﹶ, ᴵⁱ.ʿʼ):java.lang.Object");
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static final boolean m7726(String str) {
        return AbstractC3629.m8560(str, "http", true);
    }

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public static final boolean m7727(File file) {
        StorageManager storageManager;
        StorageVolume storageVolume;
        return Build.VERSION.SDK_INT >= 24 && (storageManager = (StorageManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(ﹳﹳ.ـﹶ(), StorageManager.class)) != null && (storageVolume = storageManager.getStorageVolume(file)) != null && m7755(storageVolume);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final int m7728(Context context) {
        Integer numValueOf;
        Display defaultDisplay;
        if (f12117 == null) {
            WindowManager windowManager = (WindowManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(context, WindowManager.class);
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                numValueOf = Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                numValueOf = Integer.valueOf(Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels));
            }
            f12117 = numValueOf;
        }
        return f12117.intValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static final String m7729(boolean z) {
        String strM7710;
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[57] != -33 || ((Number) ˉⁱ.ـˆ.mo4036(57)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[59] & 255) + 48)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[-1881];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[12] != 2 || ((Number) ˋⁱ.ـˆ.mo4036(12)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[21] & 255) + 71)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[24];
            boolean z3 = ʾˈ.ـﹶ;
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (AbstractC3629.m8560(str2, str, true)) {
            strM7710 = m7710(str2);
        } else {
            strM7710 = m7710(str) + ' ' + str2;
        }
        if (!z) {
            return strM7710;
        }
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[12] != 2 || ((Number) ˏʾ.ـˆ.ʽᐧ(12)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[15] & 255) + 93)) {
            ʾˈ.ﹳﹳ = false;
            int i3 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i3 / (i3 - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[24];
            boolean z4 = ʾˈ.ـﹶ;
        }
        switch (strM7710.hashCode()) {
            case -1936569704:
                if (!strM7710.equals("Amazon AFTJMST12")) {
                }
                break;
            case -1907940553:
                if (!strM7710.equals("Amazon AFTKMST12")) {
                }
                break;
            case -1848907341:
                if (!strM7710.equals("Amazon AFTMM")) {
                }
                break;
            case -1848907180:
                if (!strM7710.equals("Amazon AFTRS")) {
                }
                break;
            case -395818369:
                if (!strM7710.equals("Amazon AFTEAMR311")) {
                }
                break;
            case 771641806:
                if (!strM7710.equals("Amazon AFTA")) {
                }
                break;
            case 771641807:
                if (!strM7710.equals("Amazon AFTB")) {
                }
                break;
            case 771641818:
                if (!strM7710.equals("Amazon AFTM")) {
                }
                break;
            case 771641819:
                if (!strM7710.equals("Amazon AFTN")) {
                }
                break;
            case 771641824:
                if (!strM7710.equals("Amazon AFTS")) {
                }
                break;
            case 771641825:
                if (!strM7710.equals("Amazon AFTT")) {
                }
                break;
            case 1236637884:
                if (!strM7710.equals("Amazon AFTBAMR311")) {
                }
                break;
        }
        return strM7710;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final void m7730(File file) throws FileNotFoundException {
        String str = C4167.f16083;
        m7760(C3474.m8338(file));
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final boolean m7731() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(ﹳﹳ.ـﹶ(), ConnectivityManager.class);
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static final boolean m7732() {
        return m7720() ? Environment.isExternalStorageManager() : Build.VERSION.SDK_INT >= 33 || com.bumptech.glide.ﹳﹳ.ˏᵢ(ﹳﹳ.ـﹶ(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final String m7734(String str) {
        try {
            int length = str.length();
            int i = 0;
            ArrayList arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
            int i2 = 0;
            while (i2 >= 0 && i2 < length) {
                int i3 = i2 + 2;
                arrayList.add(str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3).toString());
                i2 = i3;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ﹶⁱ.ـﹶ.ˏʾ(16);
                arrayList2.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
            }
            byte[] bArr = new byte[arrayList2.size()];
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr[i] = ((Number) it2.next()).byteValue();
                i++;
            }
            return Base64.encodeToString(bArr, 11);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static final int m7735() {
        return Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728;
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public static Object m7736(String str, InterfaceC3856 interfaceC3856) throws Exception {
        boolean z;
        try {
            C3486 c3486M4527 = m7724().m4527(AbstractC3616.m8531(AbstractC3616.m8538(str, "://", str), "/"));
            try {
                C2077 c2077 = C2077.f7939;
                C2227 c2227M8373 = c3486M4527.m8373(new C3222(c2077.m5753(), c2077.m5747().toCharArray()));
                String strM8538 = AbstractC3616.m8538(str, "://", str);
                C5168 c5168 = (C5168) c2227M8373.m6208(AbstractC3616.m8531(AbstractC3616.m8538(strM8538, "/", strM8538), "/"));
                try {
                    String strM85382 = AbstractC3616.m8538(str, "://", str);
                    String strM85383 = AbstractC3616.m8538(strM85382, "/", strM85382);
                    String strM85384 = AbstractC3616.m8538(strM85383, "/", strM85383);
                    EnumSet enumSetOf = EnumSet.of(EnumC2820.f10967);
                    EnumSet enumSetOf2 = EnumSet.of(EnumC3910.f15210);
                    EnumC1687 enumC1687 = EnumC1687.f6565;
                    C5158 c5158M11467 = c5168.m11467(strM85384, enumSetOf, enumSetOf2, 6, EnumSet.noneOf(EnumC1681.class));
                    try {
                        C5163 c5163M11456 = c5158M11467.m11456(false);
                        try {
                            Object objMo4036 = interfaceC3856.mo4036(c5163M11456);
                            AbstractC0001.m5(c5163M11456, null);
                            AbstractC0001.m5(c5158M11467, null);
                            AbstractC4535.m10390(c5168, null);
                            AbstractC0001.m5(c3486M4527, null);
                            return objMo4036;
                        } catch (Exception e) {
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        AbstractC0001.m5(c5163M11456, th);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            try {
                                                AbstractC0001.m5(c5158M11467, th);
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                try {
                                                    throw th;
                                                } catch (Throwable th6) {
                                                    try {
                                                        AbstractC4535.m10390(c5168, th);
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th8) {
                                                            try {
                                                                AbstractC0001.m5(c3486M4527, th);
                                                                throw th8;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                if (z) {
                                                                    throw e;
                                                                }
                                                                AbstractC3407.f13261.ᴵʼ("CommonUtils");
                                                                "Failed to perform action on OutputStream for SMB, filePath: ".concat(str);
                                                                ˋˉ.ˑﾞ(new Object[0]);
                                                                return interfaceC3856.mo4036(null);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            z = false;
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        z = false;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    z = false;
                }
            } catch (Throwable th12) {
                th = th12;
                z = false;
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final void m7737(Context context, boolean z) {
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[57] != -33 || ((Number) ˑי.ـˆ.ʽᐧ(57)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[65] & 255) + 15)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[-1881];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[12] != 2 || ((Number) ᵎـ.ـˆ.ʽᐧ(12)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[16] & 255) + 51)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[24];
            boolean z3 = ʾˈ.ـﹶ;
        }
        boolean z4 = AbstractC2593.f10313;
        if (AbstractC2593.f10308 != null && (AbstractC3616.m8540(AbstractC2593.f10319, AbstractC2593.f10307, 0, false, 6) != AbstractC2593.f10315 - AbstractC2593.f10302 || AbstractC2593.f10308.contains(AbstractC2593.m6746()) || AbstractC2593.m6749().length() != AbstractC2593.m6750())) {
            ʾˈ.ٴˎ = false;
            AbstractC1036.m4003(ˏʼ.ʽᐧ.ˏʾ);
            AbstractC1036.m3992(AbstractC3362.f13181);
            boolean z5 = ʾˈ.ـﹶ;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            launchIntentForPackage = context.getPackageManager().getLeanbackLaunchIntentForPackage(context.getPackageName());
        }
        if (launchIntentForPackage == null) {
            return;
        }
        if (z) {
            launchIntentForPackage.addFlags(32768);
        }
        context.startActivity(launchIntentForPackage);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C5021 m7738(String str, String str2, List list) {
        ʿˏ r0 = new ʿˏ();
        r0.ﾞˊ(str);
        if (str2.length() > 0) {
            ((C1232) r0.ˎˑ).m4428("User-Agent", str2);
        }
        String strM7774 = m7774(str);
        if (strM7774 != null) {
            ((C1232) r0.ˎˑ).m4428("Authorization", strM7774);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3395 c3395 = (C3395) it.next();
            r0.ˉⁱ((String) c3395.f13245, (String) c3395.f13244);
        }
        return r0.ˏᵢ();
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final void m7739(Uri uri, String str) throws Exception {
        C3758 c3758M8740 = C3758.m8722(ﹳﹳ.ـﹶ(), uri).m8740(str);
        if (c3758M8740 != null) {
            try {
                DocumentsContract.deleteDocument(((Context) c3758M8740.f14519).getContentResolver(), (Uri) c3758M8740.f14520);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C5367 m7740(int i) {
        return new C5367(i, m7778(ﹳﹳ.ـﹶ(), "Default"), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7741(AbstractC0104 abstractC0104, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        boolean z2 = (i2 & 2) != 0;
        int i3 = z;
        if ((i2 & 4) != 0) {
            i3 = 1;
        }
        try {
            if (abstractC0104.m650() <= 0 || abstractC0104.m657()) {
                return;
            }
            if (i == -1) {
                i = abstractC0104.m690(0).f654;
            }
            if (!z2) {
                abstractC0104.m683(i, false, i3);
            } else if (i >= 0) {
                abstractC0104.m649(i, i3);
            } else {
                throw new IllegalArgumentException("Bad id: " + i);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public static final void m7742(List list, int i, InterfaceC3856 interfaceC3856) {
        if (list.isEmpty()) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 * i;
            int iMin = Math.min(i3 + i, list.size());
            interfaceC3856.mo4036(list.subList(i3, iMin));
            if (iMin == list.size() || i2 == Integer.MAX_VALUE) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final void m7743(String str) {
        C3486 c3486M4527 = m7724().m4527(AbstractC3616.m8531(AbstractC3616.m8538(str, "://", str), "/"));
        try {
            C2077 c2077 = C2077.f7939;
            C2227 c2227M8373 = c3486M4527.m8373(new C3222(c2077.m5753(), c2077.m5747().toCharArray()));
            String strM8538 = AbstractC3616.m8538(str, "://", str);
            C5168 c5168 = (C5168) c2227M8373.m6208(AbstractC3616.m8531(AbstractC3616.m8538(strM8538, "/", strM8538), "/"));
            try {
                String strM85382 = AbstractC3616.m8538(str, "://", str);
                String strM85383 = AbstractC3616.m8538(strM85382, "/", strM85382);
                c5168.m11466(AbstractC3616.m8538(strM85383, "/", strM85383));
                AbstractC4535.m10390(c5168, null);
                AbstractC0001.m5(c3486M4527, null);
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static /* synthetic */ String m7744(ˋˊ r2, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            r2 = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m7745(r2, str, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /* renamed from: ˑﾞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m7745(ᵢˈ.ˋˊ r3, java.lang.String r4, boolean r5, boolean r6) {
        /*
            if (r3 == 0) goto Lc
            java.lang.String r3 = r3.ﹳﹳ
            int r0 = r3.length()
            if (r0 <= 0) goto Lc
        La:
            r4 = r3
            goto L64
        Lc:
            if (r4 == 0) goto L14
            int r3 = r4.length()
            if (r3 != 0) goto L64
        L14:
            ˉʼ.ᐧʻ r3 = p132.C2077.f7939
            r3.getClass()
            boolean r4 = p395.AbstractC4535.f17430
            java.lang.String r0 = ""
            r1 = 116(0x74, float:1.63E-43)
            if (r4 == 0) goto L32
            ˋי.ﹳﹳ[] r4 = p132.C2077.f7994
            r4 = r4[r1]
            ᴵﹳ.ﹶˆ r2 = p132.C2077.f7951
            java.lang.Object r4 = r2.ʿˏ(r3, r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = ˉʼ.ﹶˆ.ᐧʻ(r4)
            goto L33
        L32:
            r4 = r0
        L33:
            int r4 = r4.length()
            if (r4 <= 0) goto L50
            boolean r4 = p395.AbstractC4535.f17430
            if (r4 == 0) goto L4e
            ˋי.ﹳﹳ[] r4 = p132.C2077.f7994
            r4 = r4[r1]
            ᴵﹳ.ﹶˆ r5 = p132.C2077.f7951
            java.lang.Object r3 = r5.ʿˏ(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = ˉʼ.ﹶˆ.ᐧʻ(r3)
            goto La
        L4e:
            r4 = r0
            goto L64
        L50:
            if (r5 == 0) goto L55
            java.lang.String r4 = "Lavf53.32.100"
            goto L64
        L55:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TiviMate/5.1.0 (Android "
            r3.<init>(r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r5 = 41
            java.lang.String r4 = ـˈ.ˉᵎ.ˑי(r3, r4, r5)
        L64:
            if (r6 == 0) goto L7e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            r3.append(r4)
            java.lang.String r4 = r3.toString()
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p252.AbstractC3139.m7745(ᵢˈ.ˋˊ, java.lang.String, boolean, boolean):java.lang.String");
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final InterfaceC0221 m7746() {
        return (InterfaceC0221) f12110.getValue();
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public static final void m7747(AbstractC1570 abstractC1570, String str) {
        try {
            abstractC1570.mo5158(str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* renamed from: ـˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m7748() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p252.AbstractC3139.m7748():java.lang.String");
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public static boolean m7749(Context context, String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        boolean z = (i & 8) != 0;
        if ((i & 16) != 0) {
            str3 = "";
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        InterfaceC3401 interfaceC3401 = ˈⁱ.ﹳﹳ.ᐧⁱ(3, new ⁱⁱ(14, str));
        intent.setDataAndType(!AbstractC3629.m8560(str, "file://", true) ? Uri.parse(AbstractC3629.m8559(AbstractC3629.m8559(str, "HTTP://", "http://", true), "HTTPS://", "https://", true)) : Build.VERSION.SDK_INT >= 24 ? FileProvider.m196(context, str3.concat(".fileprovider"), (File) interfaceC3401.getValue()) : Uri.fromFile((File) interfaceC3401.getValue()), z ? "video/*" : null);
        if (str2.length() > 0) {
            intent.putExtra("title", str2);
            intent.putExtra("forcename", str2);
        }
        intent.addFlags(268435457);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Context m7750(android.content.Context r4, boolean r5) {
        /*
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r0.<init>(r1)
            int r1 = m7777(r4)
            float r1 = (float) r1
            r2 = 1141309440(0x44070000, float:540.0)
            float r1 = r1 / r2
            r2 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 * r2
            int r1 = ˈⁱ.ﹳﹳ.ﾞᐧ(r1)
            r0.densityDpi = r1
            android.content.SharedPreferences r1 = ˉʼ.ﹶˆ.ˑʽ(r4)
            java.lang.String r2 = "language"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 != 0) goto L2e
            goto L2f
        L2e:
            r3 = r1
        L2f:
            int r1 = r3.length()
            if (r1 <= 0) goto L98
            int r1 = r3.hashCode()
            r2 = -1957440337(0xffffffff8b53d4af, float:-4.0797127E-32)
            if (r1 == r2) goto L6d
            r2 = -979921671(0xffffffffc59794f9, float:-4850.6216)
            if (r1 == r2) goto L5a
            r2 = -704712386(0xffffffffd5fef13e, float:-3.503901E13)
            if (r1 == r2) goto L49
            goto L75
        L49:
            java.lang.String r1 = "zh-rCN"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L52
            goto L75
        L52:
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "zh"
            r1.<init>(r2)
            goto L90
        L5a:
            java.lang.String r1 = "pt-rBR"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L63
            goto L75
        L63:
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "pt"
            java.lang.String r3 = "BR"
            r1.<init>(r2, r3)
            goto L90
        L6d:
            java.lang.String r1 = "sr_Latn"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L7b
        L75:
            java.util.Locale r1 = new java.util.Locale
            r1.<init>(r3)
            goto L90
        L7b:
            java.util.Locale$Builder r1 = new java.util.Locale$Builder
            r1.<init>()
            java.lang.String r2 = "sr"
            java.util.Locale$Builder r1 = r1.setLanguage(r2)
            java.lang.String r2 = "Latn"
            java.util.Locale$Builder r1 = r1.setScript(r2)
            java.util.Locale r1 = r1.build()
        L90:
            r0.setLocale(r1)
            if (r5 == 0) goto L98
            java.util.Locale.setDefault(r1)
        L98:
            android.content.Context r4 = r4.createConfigurationContext(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p252.AbstractC3139.m7750(android.content.Context, boolean):android.content.Context");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final void m7751(File file, OutputStream outputStream) {
        if (!file.exists()) {
            return;
        }
        C4156 c4156 = ˏʼ.ʽᐧ.ˆʿ(file);
        try {
            C4144 c4144 = new C4144(ˏʼ.ʽᐧ.יʻ(outputStream));
            try {
                c4144.m9536(c4156);
                AbstractC0001.m5(c4144, null);
                AbstractC0001.m5(c4156, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0001.m5(c4156, th);
                throw th2;
            }
        }
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static final Integer m7752(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public static final Long m7753(long j) {
        if (j == 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final void m7754(String str, String str2) {
        m7776(new File(str), new File(str2));
    }

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public static final boolean m7755(StorageVolume storageVolume) {
        return storageVolume.isRemovable() && !storageVolume.isPrimary();
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final String m7756(StorageVolume storageVolume) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = storageVolume.getClass().getDeclaredField("mPath");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(storageVolume);
        File file = obj instanceof File ? (File) obj : null;
        if (file != null) {
            return file.toString();
        }
        return null;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final Spanned m7758(int i) {
        String string = ﹳﹳ.ـﹶ().getString(i);
        return Build.VERSION.SDK_INT >= 24 ? AbstractC0933.m3794(string) : Html.fromHtml(string);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final int m7759(String str, String str2, boolean z) {
        boolean zM8513;
        boolean zM85132;
        if (z && (zM8513 = AbstractC3616.m8513(str, '[')) != (zM85132 = AbstractC3616.m8513(str2, '['))) {
            if (zM8513) {
                str = AbstractC3616.m8539(AbstractC3616.m8519(str, ']', str)).toString();
            }
            if (zM85132) {
                str2 = AbstractC3616.m8539(AbstractC3616.m8519(str2, ']', str2)).toString();
            }
        }
        int iMin = Math.min(str.length(), str2.length());
        if (iMin == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < iMin && str.charAt(i2) == str2.charAt(i2); i2++) {
            i++;
        }
        return i;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final void m7760(C4167 c4167) throws FileNotFoundException {
        try {
            C4157 c4157 = AbstractC4147.f16047;
            Iterator it = ((ArrayList) c4157.m9574(c4167)).iterator();
            while (it.hasNext()) {
                C4167 c41672 = (C4167) it.next();
                C1514 c1514Mo9575 = c4157.mo9575(c41672);
                if (c1514Mo9575 == null) {
                    throw new FileNotFoundException("no such file: " + c41672);
                }
                if (c1514Mo9575.f6167) {
                    m7760(c41672);
                }
                c4157.m9573(c41672);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static final boolean m7761() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public static final Object m7762(String str, InterfaceC3856 interfaceC3856) throws Exception {
        boolean z;
        try {
            C3486 c3486M4527 = m7724().m4527(AbstractC3616.m8531(AbstractC3616.m8538(str, "://", str), "/"));
            try {
                C2077 c2077 = C2077.f7939;
                C2227 c2227M8373 = c3486M4527.m8373(new C3222(c2077.m5753(), c2077.m5747().toCharArray()));
                String strM8538 = AbstractC3616.m8538(str, "://", str);
                C5168 c5168 = (C5168) c2227M8373.m6208(AbstractC3616.m8531(AbstractC3616.m8538(strM8538, "/", strM8538), "/"));
                try {
                    String strM85382 = AbstractC3616.m8538(str, "://", str);
                    String strM85383 = AbstractC3616.m8538(strM85382, "/", strM85382);
                    String strM85384 = AbstractC3616.m8538(strM85383, "/", strM85383);
                    EnumSet enumSetOf = EnumSet.of(EnumC2820.f10962);
                    EnumC1687 enumC1687 = EnumC1687.f6565;
                    C5158 c5158M11467 = c5168.m11467(strM85384, enumSetOf, null, 2, null);
                    try {
                        C5168 c51682 = c5158M11467.f19732;
                        C5166 c5166 = new C5166(c5158M11467, c51682.f19720, c51682.f19721);
                        try {
                            Object objMo4036 = interfaceC3856.mo4036(c5166);
                            AbstractC0001.m5(c5166, null);
                            AbstractC0001.m5(c5158M11467, null);
                            AbstractC4535.m10390(c5168, null);
                            AbstractC0001.m5(c3486M4527, null);
                            return objMo4036;
                        } catch (Exception e) {
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        AbstractC0001.m5(c5166, th);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            try {
                                                AbstractC0001.m5(c5158M11467, th);
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                try {
                                                    throw th;
                                                } catch (Throwable th6) {
                                                    try {
                                                        AbstractC4535.m10390(c5168, th);
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th8) {
                                                            try {
                                                                AbstractC0001.m5(c3486M4527, th);
                                                                throw th8;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                if (z) {
                                                                    throw e;
                                                                }
                                                                AbstractC3407.f13261.ᴵʼ("CommonUtils");
                                                                "Failed to perform action on InputStream for SMB, filePath: ".concat(str);
                                                                ˋˉ.ˑﾞ(new Object[0]);
                                                                return interfaceC3856.mo4036(null);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            z = false;
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        z = false;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    z = false;
                }
            } catch (Throwable th12) {
                th = th12;
                z = false;
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final Parcelable m7763(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        return abstractComponentCallbacksC0100.getArguments().getParcelable("args");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final File m7764(String str, File file, String str2) {
        File file2;
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[57] != -33 || ((Number) ﹶˆ.ـˆ.ʽᐧ(57)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[60] & 255) + 54)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[-1881];
            boolean z = ʾˈ.ـﹶ;
        }
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[12] != 2 || ((Number) ˉי.ـˆ.ʽᐧ(12)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[13] & 255) + 92)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[24];
            boolean z2 = ʾˈ.ـﹶ;
        }
        boolean z3 = AbstractC2593.f10313;
        if (AbstractC2593.f10308 != null && (AbstractC3616.m8540(AbstractC2593.f10319, AbstractC2593.f10307, 0, false, 6) != AbstractC2593.f10315 - AbstractC2593.f10302 || AbstractC2593.f10308.contains(AbstractC2593.m6746()) || AbstractC2593.m6749().length() != AbstractC2593.m6750())) {
            ʾˈ.ٴˎ = false;
            AbstractC1036.m4003(ˏʼ.ʽᐧ.ˏʾ);
            AbstractC1036.m3992(AbstractC3362.f13181);
            boolean z4 = ʾˈ.ـﹶ;
        }
        if (!m7731()) {
            return null;
        }
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            C5021 c5021M7738 = m7738(str, "", C1053.f4449);
            C4999 c4999 = (C4999) f12123.getValue();
            c4999.getClass();
            C4994 c4994M4546 = new C1274(c4999, c5021M7738).m4546();
            try {
                if (c4994M4546.m11083()) {
                    file2 = new File(file, str2);
                    C4144 c4144 = new C4144(ˏʼ.ʽᐧ.ﹳˑ(file2));
                    try {
                        c4144.m9536(c4994M4546.f18890.mo5667());
                        AbstractC0001.m5(c4144, null);
                    } finally {
                    }
                } else {
                    file2 = null;
                }
                AbstractC0001.m5(c4994M4546, null);
                return file2;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public static final String m7765(String str) {
        if (AbstractC3616.m8546(str, '<')) {
            return (Build.VERSION.SDK_INT >= 24 ? AbstractC0933.m3798(str) : Html.fromHtml(str, null, null)).toString();
        }
        return str;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final boolean m7766() {
        return ((Boolean) f12111.getValue()).booleanValue();
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static final boolean m7767(String str) {
        C3406 c3406 = C2587.f10275;
        AbstractC2593.f10311 = C2587.m6720(ﹳﹳ.ـﹶ()).equals(C2587.m6725());
        if (!AbstractC2593.f10311) {
            return false;
        }
        if (!m7772(str)) {
            if (m7707(str)) {
                C3395 c3395M7780 = m7780(str);
                Uri uri = (Uri) c3395M7780.f13245;
                if (C3758.m8722(ﹳﹳ.ـﹶ(), uri).m8740((String) c3395M7780.f13244) == null) {
                    return false;
                }
            } else {
                File file = new File(str);
                if (!m7727(file)) {
                    return file.exists();
                }
                Uri uriM7779 = m7779(file.getParentFile());
                if (C3758.m8722(ﹳﹳ.ـﹶ(), uriM7779).m8740(file.getName()) == null) {
                    return false;
                }
            }
            return true;
        }
        C3486 c3486M4527 = m7724().m4527(AbstractC3616.m8531(AbstractC3616.m8538(str, "://", str), "/"));
        try {
            C2077 c2077 = C2077.f7939;
            C2227 c2227M8373 = c3486M4527.m8373(new C3222(c2077.m5753(), c2077.m5747().toCharArray()));
            String strM8538 = AbstractC3616.m8538(str, "://", str);
            C5168 c5168 = (C5168) c2227M8373.m6208(AbstractC3616.m8531(AbstractC3616.m8538(strM8538, "/", strM8538), "/"));
            try {
                String strM85382 = AbstractC3616.m8538(str, "://", str);
                String strM85383 = AbstractC3616.m8538(strM85382, "/", strM85382);
                boolean zM11470 = c5168.m11470(AbstractC3616.m8538(strM85383, "/", strM85383));
                AbstractC4535.m10390(c5168, null);
                AbstractC0001.m5(c3486M4527, null);
                return zM11470;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0001.m5(c3486M4527, th);
                throw th2;
            }
        }
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static final boolean m7768() {
        AlarmManager alarmManager;
        return (Build.VERSION.SDK_INT < 31 || (alarmManager = (AlarmManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(ﹳﹳ.ـﹶ(), AlarmManager.class)) == null || alarmManager.canScheduleExactAlarms()) ? false : true;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final ˋˉ m7769(C1505 c1505) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i = 0;
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[184] != 50 || ((Number) ˎٴ.ـˆ.ʽᐧ(184)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[193] & 255) + 98)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[9200];
            boolean z = ʾˈ.ـﹶ;
        }
        if (ˏʼ.ʽᐧ.ˏʾ != null && (ˏʼ.ʽᐧ.ˏʾ[184] != 50 || ((Number) ᵎˏ.ـˆ.ʽᐧ(184)).intValue() != (ˏʼ.ʽᐧ.ˏʾ[192] & 255) + 15)) {
            ʾˈ.ﹳﹳ = false;
            int i3 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i3 / (i3 - 8);
            AbstractC2593.f10302 = ˏʼ.ʽᐧ.ˏʾ[9200];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (AbstractC3362.f13181 != null && AbstractC3362.f13181[366] != -54) {
            ʾˈ.ʿʼ = false;
            int i4 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i4 / (i4 - 12);
            AbstractC2593.f10315 = AbstractC3362.f13181[-19764];
            boolean z3 = ʾˈ.ـﹶ;
        }
        Field declaredField = C1505.class.getDeclaredField("lambdaFunction");
        declaredField.setAccessible(true);
        declaredField.set(c1505, new C1504(i, (InterfaceC3856) declaredField.get(c1505)));
        ˋˉ r1 = new ˋˉ(0);
        r1.ˉⁱ(c1505, new ﹳﹶ(r1));
        return r1;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final C0227 m7770(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        return AbstractC0224.m1018(abstractComponentCallbacksC0100.getViewLifecycleOwner());
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static final void m7771(AbstractC0104 abstractC0104, Class cls, Parcelable parcelable) {
        String name = cls.getName();
        if (abstractC0104.m675(name) == null) {
            DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116 = (DialogInterfaceOnCancelListenerC0116) cls.newInstance();
            if (parcelable != null) {
                dialogInterfaceOnCancelListenerC0116.setArguments(ˎˊ.ˏʾ.ʿʼ(new C3395[]{new C3395("args", parcelable)}));
            }
            C0105 c0105 = new C0105(abstractC0104);
            c0105.m705(0, dialogInterfaceOnCancelListenerC0116, name, 1);
            c0105.m697(true);
        }
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static final boolean m7772(String str) {
        return AbstractC3629.m8560(str, "smb://", true);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final String m7774(String str) {
        C5004 c5004M7602;
        try {
            C3093 c3093 = new C3093();
            c3093.m7601(null, str);
            c5004M7602 = c3093.m7602();
        } catch (IllegalArgumentException unused) {
            c5004M7602 = null;
        }
        if (c5004M7602 == null) {
            return null;
        }
        String strM11091 = c5004M7602.m11091();
        String strM11094 = c5004M7602.m11094();
        if (strM11091.length() <= 0 || strM11094.length() <= 0) {
            return null;
        }
        return "Basic ".concat(new C4155((strM11091 + ':' + strM11094).getBytes(StandardCharsets.ISO_8859_1)).mo9568());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m7775(p430.C4994 r6) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p252.AbstractC3139.m7775(ﹶˏ.ˆʿ):java.lang.String");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final void m7776(File file, File file2) {
        if (!file.exists()) {
            return;
        }
        file2.createNewFile();
        C4156 c4156 = ˏʼ.ʽᐧ.ˆʿ(file);
        try {
            C4144 c4144 = new C4144(ˏʼ.ʽᐧ.ﹳˑ(file2));
            try {
                c4144.m9536(c4156);
                AbstractC0001.m5(c4144, null);
                AbstractC0001.m5(c4156, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0001.m5(c4156, th);
                throw th2;
            }
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final int m7777(Context context) {
        Integer numValueOf;
        Display defaultDisplay;
        if (f12116 == null) {
            WindowManager windowManager = (WindowManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(context, WindowManager.class);
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                numValueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                numValueOf = Integer.valueOf(Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels));
            }
            f12116 = numValueOf;
        }
        return f12116.intValue();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final Notification m7778(Context context, String str) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(context, NotificationManager.class)) != null && notificationManager.getNotificationChannel("default") == null) {
            AbstractC3019.m7498();
            notificationManager.createNotificationChannel(AbstractC3019.m7497(str));
        }
        C3563 c3563 = new C3563(context, "default");
        c3563.f13746.icon = R.drawable._2_res_0x7f080155;
        c3563.f13741 = C3563.m8449(context.getString(R.string._2_res_0x7f130020));
        c3563.f13751 = C3563.m8449(context.getString(R.string._2_res_0x7f130020));
        c3563.f13747 = -1;
        c3563.f13746.when = 0L;
        return c3563.m8451();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final Uri m7779(File file) {
        StorageManager storageManager;
        StorageVolume storageVolume;
        String strM7756;
        if (Build.VERSION.SDK_INT < 24 || (storageManager = (StorageManager) com.bumptech.glide.ﹳﹳ.ᵎˏ(ﹳﹳ.ـﹶ(), StorageManager.class)) == null || (storageVolume = storageManager.getStorageVolume(file)) == null || (strM7756 = m7756(storageVolume)) == null) {
            return null;
        }
        String path = file.getPath();
        String strM8538 = AbstractC3616.m8538(path, strM7756, path);
        if (AbstractC3629.m8560(strM8538, "/", false)) {
            strM8538 = strM8538.substring(1);
        }
        return Uri.parse("content://com.android.externalstorage.documents/tree/" + storageVolume.getUuid() + "%3A/document/" + storageVolume.getUuid() + "%3A" + AbstractC3629.m8559(strM8538, "/", "%2F", false));
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final C3395 m7780(String str) {
        String strM8559 = AbstractC3629.m8559(AbstractC3616.m8518(str, "%2F"), "/document/", "/tree/", false);
        return new C3395(Uri.parse(strM8559), AbstractC3616.m8521(str, "%2F"));
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static final boolean m7781() {
        return ((Boolean) f12102.getValue()).booleanValue();
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final C4999 m7782() {
        return (C4999) f12105.getValue();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final void m7783(AbstractC0104 abstractC0104) {
        try {
            if (abstractC0104.m657()) {
                return;
            }
            abstractC0104.m694();
        } catch (Exception unused) {
        }
    }
}
