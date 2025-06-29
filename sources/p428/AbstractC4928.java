package p428;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p181.ThreadFactoryC2513;

/* renamed from: ﹶˊ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4928 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f18650 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static synchronized long m11047(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m11048(Context context, String str, String str2) throws Resources.NotFoundException {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static String m11049(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m11050() {
        boolean zM11054 = m11054();
        String str = Build.TAGS;
        if ((zM11054 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM11054 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m11051(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static ExecutorService m11052(String str) {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2513(str, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new C4923(str, executorServiceUnconfigurableExecutorService, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for ".concat(str)));
        return executorServiceUnconfigurableExecutorService;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static String m11053(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f18650;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m11054() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m11055() {
        boolean zM11054 = m11054();
        ?? r0 = zM11054;
        if (m11050()) {
            r0 = (zM11054 ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static String m11056(String str) throws NoSuchAlgorithmException {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return m11053(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }
}
