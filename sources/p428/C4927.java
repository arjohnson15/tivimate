package p428;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ar.tvplayer.tv.ProtectedTvPlayerApplication;
import com.bumptech.glide.C0295;
import com.google.android.gms.internal.measurement.C0559;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import p007.C0937;
import p041.C1281;
import p065.C1500;
import p084.C1713;
import p084.C1714;
import p106.ExecutorC1797;
import p122.AbstractC1920;
import p122.C1911;
import p122.C1918;
import p122.C1927;
import p122.C1935;
import p122.C1941;
import p122.C1948;
import p122.C1952;
import p122.C1958;
import p122.C1959;
import p122.C1964;
import p122.C1968;
import p136.C2096;
import p136.C2098;
import p222.C2907;
import p251.AbstractC3132;
import p251.C3130;
import p251.C3131;
import p251.C3136;
import p310.C3580;
import p331.C3758;
import p331.C3761;
import p351.C4005;
import p369.C4183;
import p369.C4185;
import p369.C4192;
import p369.C4194;
import p369.InterfaceC4189;
import p375.C4305;
import p456.C5349;
import ˉˆ.ﹳﹳ;
import ˎˊ.ˏʾ;
import ـˊ.ʿʼ;
import ᴵﹳ.ﹶˆ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶˊ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4927 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final C2098 f18632 = new C2098(3);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0937 f18633;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ﹶˆ f18634;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C1713 f18635;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C4921 f18636;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C4305 f18637;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4005 f18638;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4932 f18640;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0559 f18641;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f18643;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4942 f18644;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ﹳﹳ f18645;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C4938 f18646;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2907 f18648;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4183 f18649;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C3136 f18639 = new C3136();

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C3136 f18642 = new C3136();

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C3136 f18647 = new C3136();

    public C4927(Context context, ﹶˆ r4, C4942 c4942, C0937 c0937, ﹳﹳ r7, C0559 c0559, C4932 c4932, C2907 c2907, C4183 c4183, C4305 c4305, C1713 c1713, C4005 c4005, C4921 c4921) {
        new AtomicBoolean(false);
        this.f18643 = context;
        this.f18634 = r4;
        this.f18644 = c4942;
        this.f18633 = c0937;
        this.f18645 = r7;
        this.f18641 = c0559;
        this.f18640 = c4932;
        this.f18648 = c2907;
        this.f18649 = c4183;
        this.f18635 = c1713;
        this.f18638 = c4005;
        this.f18636 = c4921;
        this.f18637 = c4305;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3130 m11040(C4927 c4927) throws NumberFormatException, ClassNotFoundException {
        C3130 c3130;
        c4927.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ﹳﹳ.ﹶˆ(((File) c4927.f18645.ˎˑ).listFiles(f18632))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    c3130 = ˏʾ.ˏᴵ((Object) null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    c3130 = ˏʾ.ˏᵢ(new CallableC4935(c4927, j), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(c3130);
            } catch (NumberFormatException unused2) {
                String str = "Could not parse app exception timestamp from file " + file.getName();
            }
            file.delete();
        }
        return ˏʾ.ˎᵔ(arrayList);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m11041() throws IOException {
        InputStream inputStreamACpAu;
        ClassLoader classLoader = C4927.class.getClassLoader();
        if (classLoader == null || (inputStreamACpAu = ProtectedTvPlayerApplication.ACpAu(classLoader, "META-INF/version-control-info.textproto")) == null) {
            inputStreamACpAu = null;
        }
        if (inputStreamACpAu == null) {
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamACpAu.read(bArr);
            if (i == -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m11042(C4927 c4927, String str, Boolean bool) throws IOException {
        String str2;
        Integer num;
        c4927.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ᐧʻ.ﾞˊ("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        Locale locale = Locale.US;
        C4942 c4942 = c4927.f18644;
        C4932 c4932 = c4927.f18640;
        C1964 c1964 = new C1964(c4942.f18696, c4932.f18662, c4932.f18663, c4942.m11067().f18653, ᐧʻ.ᐧʻ(c4932.f18664 != null ? 4 : 1), c4932.f18659);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        C1941 c1941 = new C1941(str3, str4, AbstractC4928.m11050());
        Context context = c4927.f18643;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        EnumC4934 enumC4934 = EnumC4934.f18669;
        String str5 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str5);
        EnumC4934 enumC49342 = EnumC4934.f18669;
        if (!zIsEmpty) {
            EnumC4934 enumC49343 = (EnumC4934) EnumC4934.f18667.get(str5.toLowerCase(locale));
            if (enumC49343 != null) {
                enumC49342 = enumC49343;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        int iOrdinal = enumC49342.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM11047 = AbstractC4928.m11047(context);
        boolean zM11054 = AbstractC4928.m11054();
        int iM11055 = AbstractC4928.m11055();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        c4927.f18635.m5432(str, jCurrentTimeMillis, new C1968(c1964, c1941, new C1935(iOrdinal, str6, iAvailableProcessors, jM11047, blockCount, zM11054, iM11055, str7, str8)));
        if (!bool.booleanValue() || str == null) {
            str2 = str3;
        } else {
            C2907 c2907 = c4927.f18648;
            synchronized (((String) c2907.f11257)) {
                try {
                    c2907.f11257 = str;
                    Map mapM9623 = ((C4194) ((AtomicMarkableReference) ((C0295) c2907.f11261).f2402).getReference()).m9623();
                    List listM4569 = ((C1281) c2907.f11259).m4569();
                    if (((String) ((AtomicMarkableReference) c2907.f11260).getReference()) != null) {
                        str2 = str3;
                        ((C4192) c2907.f11258).m9620(str, (String) ((AtomicMarkableReference) c2907.f11260).getReference());
                    } else {
                        str2 = str3;
                    }
                    if (!mapM9623.isEmpty()) {
                        ((C4192) c2907.f11258).m9618(str, mapM9623, false);
                    }
                    if (!listM4569.isEmpty()) {
                        ((C4192) c2907.f11258).m9616(str, listM4569);
                    }
                } finally {
                }
            }
        }
        C4183 c4183 = c4927.f18649;
        ((InterfaceC4189) c4183.f16137).mo9594();
        c4183.f16137 = C4183.f16136;
        if (str != null) {
            c4183.f16137 = new C4185(((ﹳﹳ) c4183.f16138).ﹳﹳ(str, "userlog"));
        }
        c4927.f18636.m11036(str);
        C4305 c4305 = c4927.f18637;
        C4936 c4936 = (C4936) c4305.f16748;
        Charset charset = AbstractC1920.f7288;
        C1918 c1918 = new C1918();
        c1918.f7281 = "19.0.3";
        C4932 c49322 = c4936.f18676;
        String str9 = c49322.f18661;
        if (str9 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c1918.f7273 = str9;
        C4942 c49422 = c4936.f18674;
        String str10 = c49422.m11067().f18653;
        if (str10 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c1918.f7284 = str10;
        c1918.f7274 = c49422.m11067().f18651;
        c1918.f7282 = c49422.m11067().f18652;
        String str11 = c49322.f18662;
        if (str11 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c1918.f7279 = str11;
        String str12 = c49322.f18663;
        if (str12 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c1918.f7285 = str12;
        c1918.f7280 = 4;
        c1918.f7277 = (byte) (c1918.f7277 | 1);
        C1927 c1927 = new C1927();
        c1927.f7329 = false;
        byte b = (byte) (c1927.f7324 | 2);
        c1927.f7331 = jCurrentTimeMillis;
        c1927.f7324 = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        c1927.f7320 = str;
        String str13 = C4936.f18673;
        if (str13 == null) {
            throw new NullPointerException("Null generator");
        }
        c1927.f7328 = str13;
        String str14 = c49422.f18696;
        if (str14 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str15 = c49422.m11067().f18653;
        C3761 c3761 = c49322.f18659;
        if (((C3758) c3761.f14528) == null) {
            c3761.f14528 = new C3758(c3761);
        }
        C3758 c3758 = (C3758) c3761.f14528;
        String str16 = (String) c3758.f14519;
        if (c3758 == null) {
            c3761.f14528 = new C3758(c3761);
        }
        c1927.f7330 = new C1959(str14, str11, str12, str15, str16, (String) ((C3758) c3761.f14528).f14520);
        C1952 c1952 = new C1952();
        c1952.f7452 = 3;
        c1952.f7450 = (byte) (c1952.f7450 | 1);
        c1952.f7449 = str2;
        c1952.f7451 = str4;
        c1952.f7453 = AbstractC4928.m11050();
        c1952.f7450 = (byte) (c1952.f7450 | 2);
        c1927.f7332 = c1952.m5641();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str5) && (num = (Integer) C4936.f18672.get(str5.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM110472 = AbstractC4928.m11047(c4936.f18677);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zM110542 = AbstractC4928.m11054();
        int iM110552 = AbstractC4928.m11055();
        C1911 c1911 = new C1911();
        c1911.f7247 = iIntValue;
        byte b2 = (byte) (c1911.f7244 | 1);
        c1911.f7242 = str6;
        c1911.f7246 = iAvailableProcessors2;
        c1911.f7250 = jM110472;
        c1911.f7243 = blockCount2;
        c1911.f7248 = zM110542;
        c1911.f7249 = iM110552;
        c1911.f7244 = (byte) (((byte) (((byte) (((byte) (((byte) (2 | b2)) | 4)) | 8)) | 16)) | 32);
        c1911.f7245 = str7;
        c1911.f7251 = str8;
        c1927.f7322 = c1911.m5632();
        c1927.f7323 = 3;
        c1927.f7324 = (byte) (c1927.f7324 | 4);
        c1918.f7275 = c1927.m5637();
        C1958 c1958M5634 = c1918.m5634();
        ﹳﹳ r1 = ((C2096) c4305.f16745).f8291;
        C1948 c1948 = c1958M5634.f7474;
        if (c1948 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                return;
            } else {
                return;
            }
        }
        String str17 = c1948.f7429;
        try {
            C2096.f8289.getClass();
            C2096.m5945(r1.ﹳﹳ(str17, "report"), C3580.f13770.ˎٴ(c1958M5634));
            File file = r1.ﹳﹳ(str17, "start-time");
            long j = c1948.f7439;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), C2096.f8286);
            try {
                outputStreamWriter.write("");
                file.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            ᐧʻ.ﾞˊ("Could not persist report for session ", str17);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11043(boolean r30, p065.C1500 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p428.C4927.m11043(boolean, ʾᵔ.ˏᴵ):void");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m11044() {
        try {
            String strM11041 = m11041();
            if (strM11041 != null) {
                try {
                    this.f18648.m7250(strM11041);
                } catch (IllegalArgumentException e) {
                    Context context = this.f18643;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                }
            }
        } catch (IOException e2) {
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3130 m11045(C3130 c3130) {
        C3130 c31302;
        C3130 c31303;
        int i = 6;
        ﹳﹳ r1 = ((C2096) this.f18637.f16745).f8291;
        boolean zIsEmpty = ﹳﹳ.ﹶˆ(((File) r1.ˆᵔ).listFiles()).isEmpty();
        C3136 c3136 = this.f18639;
        if (zIsEmpty && ﹳﹳ.ﹶˆ(((File) r1.ᵢʿ).listFiles()).isEmpty() && ﹳﹳ.ﹶˆ(((File) r1.ﹳﹶ).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            }
            c3136.m7702(Boolean.FALSE);
            return ˏʾ.ˏᴵ((Object) null);
        }
        C1714 c1714 = C1714.f6685;
        c1714.m5438("Crash reports are available to be sent.");
        C0937 c0937 = this.f18633;
        if (c0937.m3801()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            c3136.m7702(Boolean.FALSE);
            c31303 = ˏʾ.ˏᴵ(Boolean.TRUE);
        } else {
            c1714.m5437("Automatic data collection is disabled.");
            c1714.m5438("Notifying that unsent reports are available.");
            c3136.m7702(Boolean.TRUE);
            synchronized (c0937.f4126) {
                c31302 = ((C3136) c0937.f4127).f12093;
            }
            ʿʼ r3 = new ʿʼ(12);
            c31302.getClass();
            ExecutorC1797 executorC1797 = AbstractC3132.f12092;
            C3130 c31304 = new C3130();
            c31302.f12081.ᴵʿ(new C3131(executorC1797, r3, c31304, i));
            c31302.m7687();
            c1714.m5437("Waiting for send/deleteUnsentReports to be called.");
            C3130 c31305 = this.f18642.f12093;
            ExecutorService executorService = AbstractC4939.f18686;
            C3136 c31362 = new C3136();
            C4931 c4931 = new C4931(c31362, 1);
            c31304.m7690(executorC1797, c4931);
            c31305.getClass();
            c31305.m7690(executorC1797, c4931);
            c31303 = c31362.f12093;
        }
        C5349 c5349 = new C5349(this, 18, c3130);
        c31303.getClass();
        ExecutorC1797 executorC17972 = AbstractC3132.f12092;
        C3130 c31306 = new C3130();
        c31303.f12081.ᴵʿ(new C3131(executorC17972, c5349, c31306, i));
        c31303.m7687();
        return c31306;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m11046(C1500 c1500) throws Throwable {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.f18634.ᐧˋ).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        C4938 c4938 = this.f18646;
        if (c4938 != null && c4938.f18682.get()) {
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        try {
            m11043(true, c1500);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
