package p225;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p182.AbstractC2517;
import p182.C2529;
import p182.C2530;
import p200.C2755;
import p222.AbstractC2926;
import p222.C2881;
import p222.C2885;
import p222.C2908;
import p222.C2928;
import p222.C2964;
import p222.InterfaceC2942;
import p222.InterfaceC2946;
import p266.C3262;
import p300.AbstractC3505;
import p307.AbstractC3569;
import p320.C3644;
import p320.C3655;
import p320.InterfaceC3650;
import p320.MenuC3643;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.C4361;
import p453.C5201;
import p453.InterfaceC5199;

/* renamed from: ˏᵢ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C3017 extends AbstractC3014 implements InterfaceC3650, LayoutInflater.Factory2 {

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public static final C2755 f11606 = new C2755(0);

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static final int[] f11607 = {R.attr.windowBackground};

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public static final boolean f11608 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: ʻ, reason: contains not printable characters */
    public C2987 f11609;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean f11610;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public InterfaceC2946 f11611;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f11612;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public boolean f11613;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public boolean f11614;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public C2987 f11615;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public Window f11616;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public final int f11617;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f11619;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f11620;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public boolean f11621;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public boolean f11622;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public ActionBarContextView f11623;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public Configuration f11624;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public PopupWindow f11625;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public TextView f11626;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C2530 f11627;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public C2988[] f11628;

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean f11629;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public C2988 f11630;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final Object f11631;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public WindowCallbackC3011 f11632;

    /* renamed from: יˋ, reason: contains not printable characters */
    public View f11633;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f11634;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean f11635;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public boolean f11636;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public boolean f11637;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public int f11638;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Object f11639;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public RunnableC3018 f11640;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public boolean f11641;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public Rect f11642;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public boolean f11643;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C2993 f11644;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public C3006 f11645;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C2986 f11646;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public CharSequence f11647;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public OnBackInvokedCallback f11648;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public C3016 f11649;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public int f11650;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f11651;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public ViewGroup f11652;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public boolean f11653;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public Rect f11654;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public AbstractC2517 f11656;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final Context f11657;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public boolean f11658;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public C4361 f11618 = null;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final RunnableC3018 f11655 = new RunnableC3018(this, 0);

    public LayoutInflaterFactory2C3017(Context context, Window window, InterfaceC2999 interfaceC2999, Object obj) {
        AbstractActivityC3013 abstractActivityC3013 = null;
        this.f11617 = -100;
        this.f11657 = context;
        this.f11631 = interfaceC2999;
        this.f11639 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC3013)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC3013 = (AbstractActivityC3013) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC3013 != null) {
                this.f11617 = ((LayoutInflaterFactory2C3017) abstractActivityC3013.getDelegate()).f11617;
            }
        }
        if (this.f11617 == -100) {
            C2755 c2755 = f11606;
            Integer num = (Integer) c2755.get(this.f11639.getClass().getName());
            if (num != null) {
                this.f11617 = num.intValue();
                c2755.remove(this.f11639.getClass().getName());
            }
        }
        if (window != null) {
            m7475(window);
        }
        C2964.m7340();
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static C5201 m7460(Context context) {
        C5201 c5201;
        C5201 c5201M11590;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c5201 = AbstractC3014.f11574) == null) {
            return null;
        }
        C5201 c5201M7461 = m7461(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC5199 interfaceC5199 = c5201.f20024;
        int i2 = 0;
        if (i < 24) {
            c5201M11590 = interfaceC5199.isEmpty() ? C5201.f20023 : C5201.m11590(AbstractC3023.m7517(interfaceC5199.get(0)));
        } else if (interfaceC5199.isEmpty()) {
            c5201M11590 = C5201.f20023;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < c5201M7461.f20024.size() + interfaceC5199.size()) {
                Locale locale = i2 < interfaceC5199.size() ? interfaceC5199.get(i2) : c5201M7461.f20024.get(i2 - interfaceC5199.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c5201M11590 = C5201.m11591((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c5201M11590.f20024.isEmpty() ? c5201M7461 : c5201M11590;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C5201 m7461(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC3005.m7431(configuration) : C5201.m11590(AbstractC3023.m7517(configuration.locale));
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static Configuration m7462(Context context, int i, C5201 c5201, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c5201 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC3005.m7434(configuration2, c5201);
            } else {
                InterfaceC5199 interfaceC5199 = c5201.f20024;
                configuration2.setLocale(interfaceC5199.get(0));
                configuration2.setLayoutDirection(interfaceC5199.get(0));
            }
        }
        return configuration2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.LayoutInflaterFactory2C3017.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p225.AbstractC3014
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7445() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f11639
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p225.AbstractC3014.f11573
            monitor-enter(r0)
            p225.AbstractC3014.m7444(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f11622
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f11616
            android.view.View r0 = r0.getDecorView()
            ˏᵢ.ﹳˎ r1 = r3.f11655
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f11637 = r0
            int r0 = r3.f11617
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f11639
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            ˎٴ.ᵎˏ r0 = p225.LayoutInflaterFactory2C3017.f11606
            java.lang.Object r1 = r3.f11639
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f11617
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            ˎٴ.ᵎˏ r0 = p225.LayoutInflaterFactory2C3017.f11606
            java.lang.Object r1 = r3.f11639
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            ˏᵢ.ˆʿ r0 = r3.f11609
            if (r0 == 0) goto L63
            r0.m7420()
        L63:
            ˏᵢ.ˆʿ r0 = r3.f11615
            if (r0 == 0) goto L6a
            r0.m7420()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.LayoutInflaterFactory2C3017.mo7445():void");
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m7463(int i) {
        C2988 c2988M7479 = m7479(i);
        if (c2988M7479.f11497 != null) {
            Bundle bundle = new Bundle();
            c2988M7479.f11497.m8597(bundle);
            if (bundle.size() > 0) {
                c2988M7479.f11499 = bundle;
            }
            c2988M7479.f11497.m8599();
            c2988M7479.f11497.clear();
        }
        c2988M7479.f11496 = true;
        c2988M7479.f11503 = true;
        if ((i == 108 || i == 0) && this.f11611 != null) {
            C2988 c2988M74792 = m7479(0);
            c2988M74792.f11495 = false;
            m7477(c2988M74792, null);
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int m7464(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m7481(context).mo7410();
                }
                return -1;
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f11615 == null) {
                    this.f11615 = new C2987(this, context);
                }
                return this.f11615.mo7410();
            }
        }
        return i;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean m7465(C2988 c2988, int i, KeyEvent keyEvent) {
        MenuC3643 menuC3643;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c2988.f11495 || m7477(c2988, keyEvent)) && (menuC3643 = c2988.f11497) != null) {
            return menuC3643.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m7466() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m7468();
        if (this.f11614 && this.f11649 == null) {
            Object obj = this.f11639;
            if (obj instanceof Activity) {
                this.f11649 = new C3016((Activity) obj, this.f11635);
            } else if (obj instanceof Dialog) {
                this.f11649 = new C3016((Dialog) obj);
            }
            C3016 c3016 = this.f11649;
            if (c3016 != null) {
                c3016.m7459(this.f11613);
            }
        }
    }

    @Override // p225.AbstractC3014
    /* renamed from: ˉי */
    public final void mo7446(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m7468();
        ViewGroup viewGroup = (ViewGroup) this.f11652.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f11632.m7439(this.f11616.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m7256() != false) goto L20;
     */
    @Override // p320.InterfaceC3650
    /* renamed from: ˉⁱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6654(p320.MenuC3643 r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.LayoutInflaterFactory2C3017.mo6654(ᴵʿ.ˉי):void");
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m7467() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f11651 != null && (m7479(0).f11494 || this.f11656 != null)) {
                z = true;
            }
            if (z && this.f11648 == null) {
                this.f11648 = AbstractC2989.m7412(this.f11651, this);
            } else {
                if (z || (onBackInvokedCallback = this.f11648) == null) {
                    return;
                }
                AbstractC2989.m7413(this.f11651, onBackInvokedCallback);
                this.f11648 = null;
            }
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m7468() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.f11621) {
            return;
        }
        int[] iArr = AbstractC3505.f13577;
        Context context = this.f11657;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo7451(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo7451(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo7451(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo7451(10);
        }
        this.f11634 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m7482();
        this.f11616.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f11643) {
            viewGroup = this.f11636 ? (ViewGroup) layoutInflaterFrom.inflate(org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e0016, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e0015, (ViewGroup) null);
        } else if (this.f11634) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e000c, (ViewGroup) null);
            this.f11635 = false;
            this.f11614 = false;
        } else if (this.f11614) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04000b, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C2529(context, typedValue.resourceId) : context).inflate(org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e0017, (ViewGroup) null);
            InterfaceC2946 interfaceC2946 = (InterfaceC2946) viewGroup.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b0111);
            this.f11611 = interfaceC2946;
            interfaceC2946.setWindowCallback(this.f11616.getCallback());
            if (this.f11635) {
                ((ActionBarOverlayLayout) this.f11611).m123(109);
            }
            if (this.f11612) {
                ((ActionBarOverlayLayout) this.f11611).m123(2);
            }
            if (this.f11620) {
                ((ActionBarOverlayLayout) this.f11611).m123(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f11614 + ", windowActionBarOverlay: " + this.f11635 + ", android:windowIsFloating: " + this.f11634 + ", windowActionModeOverlay: " + this.f11636 + ", windowNoTitle: " + this.f11643 + " }");
        }
        C2986 c2986 = new C2986(this);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4339.m9855(viewGroup, c2986);
        if (this.f11611 == null) {
            this.f11626 = (TextView) viewGroup.findViewById(org.lsposed.hiddenapibypass.library.R.id.title);
        }
        boolean z = AbstractC2926.f11335;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
        } catch (NoSuchMethodException unused) {
        } catch (InvocationTargetException e2) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b003c);
        ViewGroup viewGroup2 = (ViewGroup) this.f11616.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f11616.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C2993(this));
        this.f11652 = viewGroup;
        Object obj = this.f11639;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f11647;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC2946 interfaceC29462 = this.f11611;
            if (interfaceC29462 != null) {
                interfaceC29462.setWindowTitle(title);
            } else {
                C3016 c3016 = this.f11649;
                if (c3016 != null) {
                    C2885 c2885 = (C2885) c3016.f11583;
                    if (!c2885.f11181) {
                        c2885.f11177 = title;
                        if ((c2885.f11170 & 8) != 0) {
                            Toolbar toolbar = c2885.f11179;
                            toolbar.setTitle(title);
                            if (c2885.f11181) {
                                AbstractC4345.m9890(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f11626;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f11652.findViewById(R.id.content);
        View decorView = this.f11616.getDecorView();
        contentFrameLayout2.f159.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(ModuleDescriptor.MODULE_VERSION)) {
            typedArrayObtainStyledAttributes2.getValue(ModuleDescriptor.MODULE_VERSION, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f11621 = true;
        C2988 c2988M7479 = m7479(0);
        if (this.f11637 || c2988M7479.f11497 != null) {
            return;
        }
        m7474(108);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7469(boolean r20, boolean r21) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.LayoutInflaterFactory2C3017.m7469(boolean, boolean):boolean");
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean m7470() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC2942 interfaceC2942;
        C2881 c2881;
        boolean z = this.f11653;
        this.f11653 = false;
        C2988 c2988M7479 = m7479(0);
        if (c2988M7479.f11494) {
            if (!z) {
                m7471(c2988M7479, true);
            }
            return true;
        }
        AbstractC2517 abstractC2517 = this.f11656;
        if (abstractC2517 != null) {
            abstractC2517.mo6649();
            return true;
        }
        m7466();
        C3016 c3016 = this.f11649;
        if (c3016 == null || (interfaceC2942 = c3016.f11583) == null || (c2881 = ((C2885) interfaceC2942).f11179.f224) == null || c2881.f11151 == null) {
            return false;
        }
        C2881 c28812 = ((C2885) interfaceC2942).f11179.f224;
        C3644 c3644 = c28812 == null ? null : c28812.f11151;
        if (c3644 != null) {
            c3644.collapseActionView();
        }
        return true;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m7471(C2988 c2988, boolean z) {
        C3010 c3010;
        InterfaceC2946 interfaceC2946;
        C2908 c2908;
        if (z && c2988.f11500 == 0 && (interfaceC2946 = this.f11611) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2946;
            actionBarOverlayLayout.m125();
            ActionMenuView actionMenuView = ((C2885) actionBarOverlayLayout.f110).f11179.f235;
            if (actionMenuView != null && (c2908 = actionMenuView.f141) != null && c2908.m7256()) {
                m7476(c2988.f11497);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f11657.getSystemService("window");
        if (windowManager != null && c2988.f11494 && (c3010 = c2988.f11491) != null) {
            windowManager.removeView(c3010);
            if (z) {
                m7472(c2988.f11500, c2988, null);
            }
        }
        c2988.f11495 = false;
        c2988.f11493 = false;
        c2988.f11494 = false;
        c2988.f11501 = null;
        c2988.f11503 = true;
        if (this.f11630 == c2988) {
            this.f11630 = null;
        }
        if (c2988.f11500 == 0) {
            m7467();
        }
    }

    @Override // p225.AbstractC3014
    /* renamed from: ˏʾ */
    public final void mo7447(CharSequence charSequence) {
        this.f11647 = charSequence;
        InterfaceC2946 interfaceC2946 = this.f11611;
        if (interfaceC2946 != null) {
            interfaceC2946.setWindowTitle(charSequence);
            return;
        }
        C3016 c3016 = this.f11649;
        if (c3016 == null) {
            TextView textView = this.f11626;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C2885 c2885 = (C2885) c3016.f11583;
        if (c2885.f11181) {
            return;
        }
        c2885.f11177 = charSequence;
        if ((c2885.f11170 & 8) != 0) {
            Toolbar toolbar = c2885.f11179;
            toolbar.setTitle(charSequence);
            if (c2885.f11181) {
                AbstractC4345.m9890(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p225.AbstractC3014
    /* renamed from: ˏᵢ */
    public final void mo7448(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m7468();
        ViewGroup viewGroup = (ViewGroup) this.f11652.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f11657).inflate(i, viewGroup);
        this.f11632.m7439(this.f11616.getCallback());
    }

    @Override // p225.AbstractC3014
    /* renamed from: ˑʽ */
    public final void mo7449() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strM8462;
        this.f11658 = true;
        m7469(false, true);
        m7482();
        Object obj = this.f11639;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM8462 = AbstractC3569.m8462(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM8462 = null;
            }
            if (strM8462 != null) {
                C3016 c3016 = this.f11649;
                if (c3016 == null) {
                    this.f11613 = true;
                } else {
                    c3016.m7459(true);
                }
            }
            synchronized (AbstractC3014.f11573) {
                AbstractC3014.m7444(this);
                AbstractC3014.f11579.add(new WeakReference(this));
            }
        }
        this.f11624 = new Configuration(this.f11657.getResources().getConfiguration());
        this.f11610 = true;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m7472(int i, C2988 c2988, MenuC3643 menuC3643) {
        if (menuC3643 == null) {
            if (c2988 == null && i >= 0) {
                C2988[] c2988Arr = this.f11628;
                if (i < c2988Arr.length) {
                    c2988 = c2988Arr[i];
                }
            }
            if (c2988 != null) {
                menuC3643 = c2988.f11497;
            }
        }
        if ((c2988 == null || c2988.f11494) && !this.f11637) {
            WindowCallbackC3011 windowCallbackC3011 = this.f11632;
            Window.Callback callback = this.f11616.getCallback();
            windowCallbackC3011.getClass();
            try {
                windowCallbackC3011.f11569 = true;
                callback.onPanelClosed(i, menuC3643);
            } finally {
                windowCallbackC3011.f11569 = false;
            }
        }
    }

    @Override // p225.AbstractC3014
    /* renamed from: ـﹶ */
    public final void mo7450() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f11657);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C3017) {
        }
    }

    @Override // p225.AbstractC3014
    /* renamed from: ᐧʻ */
    public final boolean mo7451(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f11643 && i == 108) {
            return false;
        }
        if (this.f11614 && i == 1) {
            this.f11614 = false;
        }
        if (i == 1) {
            m7480();
            this.f11643 = true;
            return true;
        }
        if (i == 2) {
            m7480();
            this.f11612 = true;
            return true;
        }
        if (i == 5) {
            m7480();
            this.f11620 = true;
            return true;
        }
        if (i == 10) {
            m7480();
            this.f11636 = true;
            return true;
        }
        if (i == 108) {
            m7480();
            this.f11614 = true;
            return true;
        }
        if (i != 109) {
            return this.f11616.requestFeature(i);
        }
        m7480();
        this.f11635 = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0172, code lost:
    
        if (r3.f13989.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7473(p225.C2988 r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.LayoutInflaterFactory2C3017.m7473(ˏᵢ.ˆᵔ, android.view.KeyEvent):void");
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m7474(int i) {
        this.f11638 = (1 << i) | this.f11638;
        if (this.f11622) {
            return;
        }
        View decorView = this.f11616.getDecorView();
        RunnableC3018 runnableC3018 = this.f11655;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        decorView.postOnAnimation(runnableC3018);
        this.f11622 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7475(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f11616
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof p225.WindowCallbackC3011
            if (r2 != 0) goto L7a
            ˏᵢ.ᐧⁱ r1 = new ˏᵢ.ᐧⁱ
            r1.<init>(r7, r0)
            r7.f11632 = r1
            r8.setCallback(r1)
            int[] r0 = p225.LayoutInflaterFactory2C3017.f11607
            android.content.Context r1 = r7.f11657
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            ˏᴵ.ﹳˎ r4 = p222.C2964.m7339()
            monitor-enter(r4)
            ˏᴵ.ˉʾ r5 = r4.f11437     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.m7222(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f11616 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f11651
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f11648
            if (r0 == 0) goto L5f
            p225.AbstractC2989.m7413(r8, r0)
            r7.f11648 = r2
        L5f:
            java.lang.Object r8 = r7.f11639
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = p225.AbstractC2989.m7414(r8)
            r7.f11651 = r8
            goto L76
        L74:
            r7.f11651 = r2
        L76:
            r7.m7467()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.LayoutInflaterFactory2C3017.m7475(android.view.Window):void");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m7476(MenuC3643 menuC3643) {
        C2908 c2908;
        if (this.f11641) {
            return;
        }
        this.f11641 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f11611;
        actionBarOverlayLayout.m125();
        ActionMenuView actionMenuView = ((C2885) actionBarOverlayLayout.f110).f11179.f235;
        if (actionMenuView != null && (c2908 = actionMenuView.f141) != null) {
            c2908.m7257();
            C2928 c2928 = c2908.f11277;
            if (c2928 != null && c2928.m8618()) {
                c2928.f14007.dismiss();
            }
        }
        Window.Callback callback = this.f11616.getCallback();
        if (callback != null && !this.f11637) {
            callback.onPanelClosed(108, menuC3643);
        }
        this.f11641 = false;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m7477(C2988 c2988, KeyEvent keyEvent) {
        InterfaceC2946 interfaceC2946;
        InterfaceC2946 interfaceC29462;
        Resources.Theme themeNewTheme;
        InterfaceC2946 interfaceC29463;
        InterfaceC2946 interfaceC29464;
        if (this.f11637) {
            return false;
        }
        if (c2988.f11495) {
            return true;
        }
        C2988 c29882 = this.f11630;
        if (c29882 != null && c29882 != c2988) {
            m7471(c29882, false);
        }
        Window.Callback callback = this.f11616.getCallback();
        int i = c2988.f11500;
        if (callback != null) {
            c2988.f11502 = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC29464 = this.f11611) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC29464;
            actionBarOverlayLayout.m125();
            ((C2885) actionBarOverlayLayout.f110).f11173 = true;
        }
        if (c2988.f11502 == null) {
            MenuC3643 menuC3643 = c2988.f11497;
            if (menuC3643 == null || c2988.f11496) {
                if (menuC3643 == null) {
                    Context context = this.f11657;
                    if ((i == 0 || i == 108) && this.f11611 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04000b, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04000c, typedValue, true);
                        } else {
                            theme.resolveAttribute(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04000c, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C2529 c2529 = new C2529(context, 0);
                            c2529.getTheme().setTo(themeNewTheme);
                            context = c2529;
                        }
                    }
                    MenuC3643 menuC36432 = new MenuC3643(context);
                    menuC36432.f13902 = this;
                    MenuC3643 menuC36433 = c2988.f11497;
                    if (menuC36432 != menuC36433) {
                        if (menuC36433 != null) {
                            menuC36433.m8589(c2988.f11505);
                        }
                        c2988.f11497 = menuC36432;
                        C3655 c3655 = c2988.f11505;
                        if (c3655 != null) {
                            menuC36432.m8585(c3655, menuC36432.f13914);
                        }
                    }
                    if (c2988.f11497 == null) {
                        return false;
                    }
                }
                if (z && (interfaceC29462 = this.f11611) != null) {
                    if (this.f11646 == null) {
                        this.f11646 = new C2986(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC29462).m124(c2988.f11497, this.f11646);
                }
                c2988.f11497.m8599();
                if (!callback.onCreatePanelMenu(i, c2988.f11497)) {
                    MenuC3643 menuC36434 = c2988.f11497;
                    if (menuC36434 != null) {
                        if (menuC36434 != null) {
                            menuC36434.m8589(c2988.f11505);
                        }
                        c2988.f11497 = null;
                    }
                    if (z && (interfaceC2946 = this.f11611) != null) {
                        ((ActionBarOverlayLayout) interfaceC2946).m124(null, this.f11646);
                    }
                    return false;
                }
                c2988.f11496 = false;
            }
            c2988.f11497.m8599();
            Bundle bundle = c2988.f11499;
            if (bundle != null) {
                c2988.f11497.m8595(bundle);
                c2988.f11499 = null;
            }
            if (!callback.onPreparePanel(0, c2988.f11502, c2988.f11497)) {
                if (z && (interfaceC29463 = this.f11611) != null) {
                    ((ActionBarOverlayLayout) interfaceC29463).m124(null, this.f11646);
                }
                c2988.f11497.m8588();
                return false;
            }
            c2988.f11497.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c2988.f11497.m8588();
        }
        c2988.f11495 = true;
        c2988.f11493 = false;
        this.f11630 = c2988;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7478(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p225.LayoutInflaterFactory2C3017.m7478(android.view.KeyEvent):boolean");
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final C2988 m7479(int i) {
        C2988[] c2988Arr = this.f11628;
        if (c2988Arr == null || c2988Arr.length <= i) {
            C2988[] c2988Arr2 = new C2988[i + 1];
            if (c2988Arr != null) {
                System.arraycopy(c2988Arr, 0, c2988Arr2, 0, c2988Arr.length);
            }
            this.f11628 = c2988Arr2;
            c2988Arr = c2988Arr2;
        }
        C2988 c2988 = c2988Arr[i];
        if (c2988 != null) {
            return c2988;
        }
        C2988 c29882 = new C2988();
        c29882.f11500 = i;
        c29882.f11503 = false;
        c2988Arr[i] = c29882;
        return c29882;
    }

    @Override // p320.InterfaceC3650
    /* renamed from: ﹳﹳ */
    public final boolean mo6655(MenuC3643 menuC3643, MenuItem menuItem) {
        C2988 c2988;
        Window.Callback callback = this.f11616.getCallback();
        if (callback != null && !this.f11637) {
            MenuC3643 menuC3643Mo8580 = menuC3643.mo8580();
            C2988[] c2988Arr = this.f11628;
            int length = c2988Arr != null ? c2988Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c2988 = c2988Arr[i];
                    if (c2988 != null && c2988.f11497 == menuC3643Mo8580) {
                        break;
                    }
                    i++;
                } else {
                    c2988 = null;
                    break;
                }
            }
            if (c2988 != null) {
                return callback.onMenuItemSelected(c2988.f11500, menuItem);
            }
        }
        return false;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m7480() {
        if (this.f11621) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // p225.AbstractC3014
    /* renamed from: ﹶˆ */
    public final void mo7452(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m7468();
        ViewGroup viewGroup = (ViewGroup) this.f11652.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f11632.m7439(this.f11616.getCallback());
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final AbstractC2995 m7481(Context context) {
        if (this.f11609 == null) {
            if (C3262.f12723 == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                C3262 c3262 = new C3262();
                c3262.f12725 = new C3004();
                c3262.f12726 = applicationContext;
                c3262.f12724 = locationManager;
                C3262.f12723 = c3262;
            }
            this.f11609 = new C2987(this, C3262.f12723);
        }
        return this.f11609;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m7482() {
        if (this.f11616 == null) {
            Object obj = this.f11639;
            if (obj instanceof Activity) {
                m7475(((Activity) obj).getWindow());
            }
        }
        if (this.f11616 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }
}
