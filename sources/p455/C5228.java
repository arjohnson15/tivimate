package p455;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p417.AbstractC4753;
import p417.ServiceConnectionC4766;
import p436.C5068;

/* renamed from: ﾞᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5228 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f20026 = new Object();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static volatile C5228 f20027;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ConcurrentHashMap f20028 = new ConcurrentHashMap();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C5228 m11592() {
        if (f20027 == null) {
            synchronized (f20026) {
                try {
                    if (f20027 == null) {
                        f20027 = new C5228();
                    }
                } finally {
                }
            }
        }
        C5228 c5228 = f20027;
        AbstractC4753.m10683(c5228);
        return c5228;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11593(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ServiceConnectionC4766)) {
            ConcurrentHashMap concurrentHashMap = this.f20028;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m11594(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C5068.m11225(context).f4341.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof ServiceConnectionC4766) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f20028;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
