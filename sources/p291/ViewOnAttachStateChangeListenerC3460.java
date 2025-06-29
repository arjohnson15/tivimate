package p291;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p320.ViewOnKeyListenerC3661;
import p320.ViewOnKeyListenerC3662;
import p357.C4055;
import p378.AbstractC4345;
import p378.AbstractC4362;

/* renamed from: ٴᐧ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3460 implements View.OnAttachStateChangeListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f13391;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13392;

    public /* synthetic */ ViewOnAttachStateChangeListenerC3460(int i, Object obj) {
        this.f13392 = i;
        this.f13391 = obj;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m8305(View view) {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m8306(View view) {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m8307(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f13391;
        switch (this.f13392) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                AbstractC4362.m9944(view2);
                break;
            case 1:
            case 2:
                break;
            default:
                C4055 c4055 = (C4055) obj;
                if (c4055.f15623 != null && (accessibilityManager = c4055.f15617) != null && c4055.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(c4055.f15623);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f13392) {
            case 0:
                break;
            case 1:
                ViewOnKeyListenerC3662 viewOnKeyListenerC3662 = (ViewOnKeyListenerC3662) this.f13391;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC3662.f14045;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC3662.f14045 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC3662.f14045.removeGlobalOnLayoutListener(viewOnKeyListenerC3662.f14042);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ViewOnKeyListenerC3661 viewOnKeyListenerC3661 = (ViewOnKeyListenerC3661) this.f13391;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC3661.f14026;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC3661.f14026 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC3661.f14026.removeGlobalOnLayoutListener(viewOnKeyListenerC3661.f14019);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                C4055 c4055 = (C4055) this.f13391;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = c4055.f15623;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = c4055.f15617) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
        }
    }
}
