package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.TextView;
import p222.C2895;
import ˈⁱ.ˉⁱ;

/* loaded from: classes.dex */
public class GuidedActionAppCompatEditText extends C2895 implements InterfaceC0133, InterfaceC0192 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC0143 f829;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Drawable f830;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C0152 f831;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InterfaceC0191 f832;

    public GuidedActionAppCompatEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        this.f830 = getBackground();
        C0152 c0152 = new C0152();
        this.f831 = c0152;
        setBackground(c0152);
    }

    @Override // android.widget.TextView, android.view.View
    public final void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        InterfaceC0143 interfaceC0143 = this.f829;
        if (interfaceC0143 != null) {
            C0180 c0180 = ((C0198) interfaceC0143).f1197;
            c0180.f1145.ٴˎ(c0180, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setBackground(this.f830);
        } else {
            setBackground(this.f831);
        }
        if (z) {
            return;
        }
        setFocusable(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? C2895.class : TextView.class).getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        InterfaceC0191 interfaceC0191 = this.f832;
        boolean zM907 = interfaceC0191 != null ? ((C0145) interfaceC0191).m907(this, i, keyEvent) : false;
        return !zM907 ? super.onKeyPreIme(i, keyEvent) : zM907;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isInTouchMode() || isFocusableInTouchMode() || isTextSelectable()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // p222.C2895, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ˉⁱ.ᵢʿ(callback, this));
    }

    @Override // androidx.leanback.widget.InterfaceC0133
    public void setImeKeyListener(InterfaceC0191 interfaceC0191) {
        this.f832 = interfaceC0191;
    }

    @Override // androidx.leanback.widget.InterfaceC0192
    public void setOnAutofillListener(InterfaceC0143 interfaceC0143) {
        this.f829 = interfaceC0143;
    }
}
