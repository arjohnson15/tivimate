package p225;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p065.ExecutorC1522;
import p150.ExecutorC2314;
import p200.C2751;
import p200.C2752;
import p453.C5201;

/* renamed from: ˏᵢ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3014 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final ExecutorC1522 f11577 = new ExecutorC1522(new ExecutorC2314(1));

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final int f11571 = -100;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C5201 f11574 = null;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C5201 f11576 = null;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static Boolean f11572 = null;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static boolean f11578 = false;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C2752 f11579 = new C2752(0);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final Object f11573 = new Object();

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final Object f11575 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m7443(Context context) {
        if (f11572 == null) {
            try {
                int i = AbstractServiceC3025.f11699;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC3025.class), Build.VERSION.SDK_INT >= 24 ? AbstractC3012.m7441() | 128 : 640).metaData;
                if (bundle != null) {
                    f11572 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f11572 = Boolean.FALSE;
            }
        }
        return f11572.booleanValue();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m7444(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017) {
        synchronized (f11573) {
            try {
                C2752 c2752 = f11579;
                c2752.getClass();
                C2751 c2751 = new C2751(c2752);
                while (c2751.hasNext()) {
                    AbstractC3014 abstractC3014 = (AbstractC3014) ((WeakReference) c2751.next()).get();
                    if (abstractC3014 == layoutInflaterFactory2C3017 || abstractC3014 == null) {
                        c2751.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract void mo7445();

    /* renamed from: ˉי, reason: contains not printable characters */
    public abstract void mo7446(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public abstract void mo7447(CharSequence charSequence);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract void mo7448(int i);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract void mo7449();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract void mo7450();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public abstract boolean mo7451(int i);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public abstract void mo7452(View view);
}
