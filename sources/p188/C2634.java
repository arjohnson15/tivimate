package p188;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ˎʾ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2634 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final boolean f10437;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static volatile C2634 f10438;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final boolean f10439;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final File f10440;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f10441;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f10442 = true;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AtomicBoolean f10444 = new AtomicBoolean(false);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f10443 = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f10437 = i < 29;
        f10439 = i >= 28;
        f10440 = new File("/proc/self/fd");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2634 m6817() {
        if (f10438 == null) {
            synchronized (C2634.class) {
                try {
                    if (f10438 == null) {
                        f10438 = new C2634();
                    }
                } finally {
                }
            }
        }
        return f10438;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6818() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f10443;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m6819(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
            }
            return false;
        }
        if (!f10439) {
            if (Log.isLoggable("HardwareConfig", 2)) {
            }
            return false;
        }
        if (f10437 && !this.f10444.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
            }
            return false;
        }
        if (i < 0 || i2 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
            }
            return false;
        }
        synchronized (this) {
            try {
                int i3 = this.f10441 + 1;
                this.f10441 = i3;
                if (i3 >= 50) {
                    this.f10441 = 0;
                    int length = f10440.list().length;
                    long jM6818 = m6818();
                    boolean z4 = ((long) length) < jM6818;
                    this.f10442 = z4;
                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                        String str = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM6818;
                    }
                }
                z3 = this.f10442;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
        }
        return false;
    }
}
