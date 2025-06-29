package p026;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p305.C3536;
import p417.AbstractC4753;
import ˈˉ.ﹳﹳ;
import ᵔʼ.ˑʽ;
import ᵔᵔ.ٴˎ;

/* renamed from: ʼˉ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1164 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String f4819 = null;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C1158 f4821 = null;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static C1159 f4822 = null;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static Boolean f4824 = null;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static boolean f4826 = false;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int f4827 = -1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Boolean f4828;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f4830;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final ThreadLocal f4829 = new ThreadLocal();

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C1160 f4820 = new C1160(0);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final ﹳﹳ f4823 = new ﹳﹳ(6);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ˑʽ f4818 = new ˑʽ();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ٴˎ f4825 = new ٴˎ(6);

    public C1164(Context context) {
        this.f4830 = context;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m4212(Context context, String str, boolean z, boolean z2) throws Throwable {
        boolean z3;
        try {
            try {
                boolean z4 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f4820.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z5 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (C1164.class) {
                                    try {
                                        f4819 = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f4827 = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = cursorQuery.getInt(columnIndex2) != 0;
                                            f4826 = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                C1165 c1165 = (C1165) f4829.get();
                                if (c1165 == null || c1165.f4831 != null) {
                                    z4 = false;
                                } else {
                                    c1165.f4831 = cursorQuery;
                                }
                                cursor = z4 ? null : cursorQuery;
                                z5 = z3;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z2 && z5) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i;
                        }
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof DynamiteModule$LoadingException) {
                            throw e;
                        }
                        throw new DynamiteModule$LoadingException("V2 version check failed: " + e.getMessage(), e);
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C1158 m4213(Context context) {
        C1158 c1158;
        synchronized (C1164.class) {
            C1158 c11582 = f4821;
            if (c11582 != null) {
                return c11582;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c1158 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c1158 = iInterfaceQueryLocalInterface instanceof C1158 ? (C1158) iInterfaceQueryLocalInterface : new C1158(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (c1158 != null) {
                    f4821 = c1158;
                    return c1158;
                }
            } catch (Exception e) {
                String str = "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage();
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r10 != 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: all -> 0x008b, TryCatch #7 {all -> 0x008b, blocks: (B:9:0x0053, B:13:0x007f, B:21:0x0095, B:24:0x009b, B:27:0x00ad, B:105:0x020c, B:106:0x0213, B:109:0x0216, B:110:0x0217, B:111:0x021e, B:112:0x021f, B:114:0x023b, B:116:0x0248), top: B:160:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #7 {all -> 0x008b, blocks: (B:9:0x0053, B:13:0x007f, B:21:0x0095, B:24:0x009b, B:27:0x00ad, B:105:0x020c, B:106:0x0213, B:109:0x0216, B:110:0x0217, B:111:0x021e, B:112:0x021f, B:114:0x023b, B:116:0x0248), top: B:160:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p026.C1164 m4214(android.content.Context r23, p026.InterfaceC1161 r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p026.C1164.m4214(android.content.Context, ʼˉ.ˑʽ, java.lang.String):ʼˉ.ﹳﹳ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m4215(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC4753.m10682(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String str2 = "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'";
            return 0;
        } catch (ClassNotFoundException unused) {
            String str3 = "Local module descriptor class for " + str + " not found.";
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m4216(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            C1159 c1159 = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c1159 = iInterfaceQueryLocalInterface instanceof C1159 ? (C1159) iInterfaceQueryLocalInterface : new C1159(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f4822 = c1159;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m4217(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f4824)) {
            return true;
        }
        boolean z = false;
        if (f4824 == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C3536.f13675.m8426(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f4824 = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f4826 = true;
            }
        }
        if (!z) {
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017a A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00e9, blocks: (B:3:0x0002, B:63:0x00de, B:65:0x00e4, B:72:0x0106, B:102:0x017a, B:110:0x018b, B:128:0x0204, B:129:0x0207, B:123:0x01fc, B:70:0x00ed, B:131:0x0209, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00db, B:21:0x004a, B:44:0x00a0, B:47:0x00a3, B:54:0x00bb, B:62:0x00dd, B:60:0x00c1), top: B:143:0x0002, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #11 {, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:147:0x0027, inners: #12 }] */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4218(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p026.C1164.m4218(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final IBinder m4219(String str) throws DynamiteModule$LoadingException {
        try {
            return (IBinder) this.f4830.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
