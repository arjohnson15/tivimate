package p305;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;
import java.util.logging.Logger;
import p202.C2766;
import p266.C3264;
import p329.AbstractC3740;
import p329.InterfaceC3741;
import p368.InterfaceC4180;
import p395.AbstractC4541;
import p417.AbstractC4753;
import ˏᵢ.ᵢٴ;
import ᵢ.ʿʼ;

/* renamed from: ᐧˆ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3532 implements InterfaceC3741 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C3532 f13662;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public volatile Object f13663;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f13664;

    public C3532() {
        this.f13664 = AbstractC4541.class.getName();
    }

    public C3532(Context context) {
        this.f13664 = context.getApplicationContext();
    }

    public /* synthetic */ C3532(Object obj) {
        this.f13664 = obj;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final AbstractBinderC3528 m8416(PackageInfo packageInfo, AbstractBinderC3528... abstractBinderC3528Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            BinderC3538 binderC3538 = new BinderC3538(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < abstractBinderC3528Arr.length; i++) {
                if (abstractBinderC3528Arr[i].equals(binderC3538)) {
                    return abstractBinderC3528Arr[i];
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C3532 m8417(Context context) {
        AbstractC4753.m10683(context);
        synchronized (C3532.class) {
            try {
                if (f13662 == null) {
                    AbstractC3534.m8424(context);
                    f13662 = new C3532(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13662;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final boolean m8418(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z ? m8416(packageInfo2, AbstractC3531.f13661) : m8416(packageInfo2, AbstractC3531.f13661[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p329.InterfaceC3741
    public Object get() {
        if (this.f13663 == null) {
            synchronized (this) {
                try {
                    if (this.f13663 == null) {
                        Object obj = ((InterfaceC3741) this.f13664).get();
                        AbstractC3740.m8706(obj, "Argument must not be null");
                        this.f13663 = obj;
                    }
                } finally {
                }
            }
        }
        return this.f13663;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC4180 m8419() {
        if (((InterfaceC4180) this.f13663) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC4180) this.f13663) == null) {
                        File cacheDir = ((Context) ((ʿʼ) ((ᵢٴ) this.f13664).ˆʿ).ˆʿ).getCacheDir();
                        C2766 c2766 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c2766 = new C2766(file);
                        }
                        this.f13663 = c2766;
                    }
                    if (((InterfaceC4180) this.f13663) == null) {
                        this.f13663 = new C3264(5);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC4180) this.f13663;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Logger m8420() {
        Logger logger = (Logger) this.f13663;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.f13663;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f13664);
                this.f13663 = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e9 A[EDGE_INSN: B:122:0x01e9->B:97:0x01e9 BREAK  A[LOOP:0: B:8:0x001d->B:94:0x01d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d6 A[LOOP:0: B:8:0x001d->B:94:0x01d6, LOOP_END] */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m8421(int r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305.C3532.m8421(int):boolean");
    }
}
