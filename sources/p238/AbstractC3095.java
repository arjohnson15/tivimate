package p238;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p009.C0995;
import p305.AbstractC3537;
import p305.C3532;
import p417.AbstractC4753;
import p436.C5068;

/* renamed from: ˑᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3095 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Boolean f11945;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int f11946;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Boolean f11947;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Boolean f11949;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String f11950;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Boolean f11951;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f11948 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final char[] f11944 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m7610() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m7611(int i, Context context, String str) {
        C0995 c0995M11225 = C5068.m11225(context);
        c0995M11225.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c0995M11225.f4341.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m7612(Context context, int i) throws PackageManager.NameNotFoundException {
        if (m7611(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C3532 c3532M8417 = C3532.m8417(context);
                c3532M8417.getClass();
                if (packageInfo == null) {
                    return false;
                }
                return C3532.m8418(packageInfo, false) || (C3532.m8418(packageInfo, true) && AbstractC3537.m8428((Context) c3532M8417.f13664));
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                }
            }
        }
        return false;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m7613() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f11950 == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f11950 = Application.getProcessName();
            } else {
                int iMyPid = f11946;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f11946 = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        str = "/proc/" + iMyPid + "/cmdline";
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String line = bufferedReader.readLine();
                            AbstractC4753.m10683(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            f11950 = strTrim;
                            return f11950;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                        }
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f11950 = strTrim;
            }
        }
        return f11950;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m7614(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11947 == null) {
            f11947 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f11947.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f11951 == null) {
            f11951 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f11951.booleanValue()) {
            return !m7610() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
