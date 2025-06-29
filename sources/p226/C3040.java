package p226;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0213;
import androidx.lifecycle.InterfaceC0262;
import java.lang.reflect.Field;

/* renamed from: ˑʽ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3040 implements InterfaceC0213 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static Field f11730;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static int f11731;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static Field f11732;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static Field f11733;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public AbstractActivityC3030 f11734;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11735;

    public /* synthetic */ C3040() {
        this.f11735 = 4;
    }

    public /* synthetic */ C3040(AbstractActivityC3030 abstractActivityC3030, int i) {
        this.f11735 = i;
        this.f11734 = abstractActivityC3030;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        switch (this.f11735) {
            case 0:
                if (enumC0247 == EnumC0247.ON_DESTROY) {
                    this.f11734.mContextAwareHelper.f18355 = null;
                    if (!this.f11734.isChangingConfigurations()) {
                        this.f11734.getViewModelStore().m1039();
                    }
                    ViewTreeObserverOnDrawListenerC3034 viewTreeObserverOnDrawListenerC3034 = (ViewTreeObserverOnDrawListenerC3034) this.f11734.mReportFullyDrawnExecutor;
                    AbstractActivityC3030 abstractActivityC3030 = viewTreeObserverOnDrawListenerC3034.f11723;
                    abstractActivityC3030.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC3034);
                    abstractActivityC3030.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC3034);
                    return;
                }
                return;
            case 1:
                if (enumC0247 == EnumC0247.ON_STOP) {
                    Window window = this.f11734.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AbstractActivityC3030 abstractActivityC30302 = this.f11734;
                abstractActivityC30302.ensureViewModelStore();
                abstractActivityC30302.getLifecycle().mo1031(this);
                return;
            case 3:
                if (enumC0247 != EnumC0247.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                C3031 c3031 = this.f11734.mOnBackPressedDispatcher;
                c3031.f11708 = AbstractC3036.m7530((AbstractActivityC3030) interfaceC0262);
                c3031.m7524(c3031.f11712);
                return;
            default:
                if (enumC0247 != EnumC0247.ON_DESTROY) {
                    return;
                }
                if (f11731 == 0) {
                    try {
                        f11731 = 2;
                        Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                        f11730 = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                        f11733 = declaredField2;
                        declaredField2.setAccessible(true);
                        Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                        f11732 = declaredField3;
                        declaredField3.setAccessible(true);
                        f11731 = 1;
                    } catch (NoSuchFieldException unused) {
                    }
                }
                if (f11731 == 1) {
                    InputMethodManager inputMethodManager = (InputMethodManager) this.f11734.getSystemService("input_method");
                    try {
                        Object obj = f11732.get(inputMethodManager);
                        if (obj == null) {
                            return;
                        }
                        synchronized (obj) {
                            try {
                                View view = (View) f11730.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        f11733.set(inputMethodManager, null);
                                        inputMethodManager.isActive();
                                    }
                                }
                            } catch (IllegalAccessException unused2) {
                            } catch (ClassCastException unused3) {
                            } catch (IllegalAccessException unused4) {
                            } finally {
                            }
                        }
                        return;
                    } catch (IllegalAccessException unused5) {
                        return;
                    }
                }
                return;
        }
    }
}
