package p225;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.bumptech.glide.ﹳﹳ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p222.AbstractC2897;
import p222.AbstractC2926;
import p320.InterfaceC3660;
import p320.MenuC3643;
import p378.AbstractC4342;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p378.C4335;
import p378.C4348;
import p378.C4369;
import p378.C4375;
import p378.InterfaceC4359;
import p421.C4861;

/* renamed from: ˏᵢ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2986 implements InterfaceC4359, InterfaceC3660 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C3017 f11486;

    public /* synthetic */ C2986(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017) {
        this.f11486 = layoutInflaterFactory2C3017;
    }

    @Override // p320.InterfaceC3660
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean mo7407(MenuC3643 menuC3643) {
        Window.Callback callback = this.f11486.f11616.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC3643);
        return true;
    }

    @Override // p320.InterfaceC3660
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo7408(MenuC3643 menuC3643, boolean z) {
        this.f11486.m7476(menuC3643);
    }

    @Override // p378.InterfaceC4359
    /* renamed from: ٴˎ */
    public C4369 mo2871(View view, C4369 c4369) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        C4369 c4369Mo9867;
        boolean z2;
        boolean z3;
        int iM9955 = c4369.m9955();
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = this.f11486;
        layoutInflaterFactory2C3017.getClass();
        int iM99552 = c4369.m9955();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C3017.f11623;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C3017.f11623.getLayoutParams();
            if (layoutInflaterFactory2C3017.f11623.isShown()) {
                if (layoutInflaterFactory2C3017.f11642 == null) {
                    layoutInflaterFactory2C3017.f11642 = new Rect();
                    layoutInflaterFactory2C3017.f11654 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C3017.f11642;
                Rect rect2 = layoutInflaterFactory2C3017.f11654;
                rect.set(c4369.m9951(), c4369.m9955(), c4369.m9952(), c4369.m9953());
                ViewGroup viewGroup = layoutInflaterFactory2C3017.f11652;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = AbstractC2926.f11335;
                    AbstractC2897.m7240(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC2926.f11335) {
                        AbstractC2926.f11335 = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC2926.f11333 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC2926.f11333.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = AbstractC2926.f11333;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C4369 c4369M9882 = AbstractC4345.m9882(layoutInflaterFactory2C3017.f11652);
                int iM9951 = c4369M9882 == null ? 0 : c4369M9882.m9951();
                int iM9952 = c4369M9882 == null ? 0 : c4369M9882.m9952();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z3 = true;
                }
                Context context = layoutInflaterFactory2C3017.f11657;
                if (i <= 0 || layoutInflaterFactory2C3017.f11633 != null) {
                    View view2 = layoutInflaterFactory2C3017.f11633;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM9951 || marginLayoutParams2.rightMargin != iM9952) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM9951;
                            marginLayoutParams2.rightMargin = iM9952;
                            layoutInflaterFactory2C3017.f11633.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C3017.f11633 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM9951;
                    layoutParams.rightMargin = iM9952;
                    layoutInflaterFactory2C3017.f11652.addView(layoutInflaterFactory2C3017.f11633, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C3017.f11633;
                boolean z5 = view4 != null;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C3017.f11633;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? ﹳﹳ.ˏᴵ(context, R.color._2_res_0x7f060006) : ﹳﹳ.ˏᴵ(context, R.color._2_res_0x7f060005));
                }
                if (!layoutInflaterFactory2C3017.f11636 && z5) {
                    iM99552 = 0;
                }
                z = z5;
                z2 = z3;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                layoutInflaterFactory2C3017.f11623.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C3017.f11633;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iM9955 != iM99552) {
            int iM99512 = c4369.m9951();
            int iM99522 = c4369.m9952();
            int iM9953 = c4369.m9953();
            int i6 = Build.VERSION.SDK_INT;
            AbstractC4342 c4335 = i6 >= 30 ? new C4335(c4369) : i6 >= 29 ? new C4375(c4369) : new C4348(c4369);
            c4335.mo9872(C4861.m10935(iM99512, iM99552, iM99522, iM9953));
            c4369Mo9867 = c4335.mo9867();
        } else {
            c4369Mo9867 = c4369;
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        WindowInsets windowInsetsM9954 = c4369Mo9867.m9954();
        if (windowInsetsM9954 == null) {
            return c4369Mo9867;
        }
        WindowInsets windowInsetsM9943 = AbstractC4362.m9943(view, windowInsetsM9954);
        return !windowInsetsM9943.equals(windowInsetsM9954) ? C4369.m9950(view, windowInsetsM9943) : c4369Mo9867;
    }
}
