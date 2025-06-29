package p222;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ˏᴵ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2916 extends C2959 implements InterfaceC2955 {

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public CharSequence f11295;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final Rect f11296;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public C2937 f11297;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public int f11298;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2904 f11299;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2916(C2904 c2904, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f04053a);
        this.f11299 = c2904;
        this.f11296 = new Rect();
        this.f11427 = c2904;
        this.f11407 = true;
        this.f11410.setFocusable(true);
        this.f11415 = new C2975(0, this);
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo7259(int i) {
        this.f11298 = i;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo7260(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C2965 c2965 = this.f11410;
        boolean zIsShowing = c2965.isShowing();
        m7264();
        this.f11410.setInputMethodMode(2);
        mo7326();
        C2882 c2882 = this.f11414;
        c2882.setChoiceMode(1);
        c2882.setTextDirection(i);
        c2882.setTextAlignment(i2);
        C2904 c2904 = this.f11299;
        int selectedItemPosition = c2904.getSelectedItemPosition();
        C2882 c28822 = this.f11414;
        if (c2965.isShowing() && c28822 != null) {
            c28822.setListSelectionHidden(false);
            c28822.setSelection(selectedItemPosition);
            if (c28822.getChoiceMode() != 0) {
                c28822.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c2904.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2967 viewTreeObserverOnGlobalLayoutListenerC2967 = new ViewTreeObserverOnGlobalLayoutListenerC2967(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2967);
        this.f11410.setOnDismissListener(new C2870(this, viewTreeObserverOnGlobalLayoutListenerC2967));
    }

    @Override // p222.C2959, p222.InterfaceC2955
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void mo7261(ListAdapter listAdapter) {
        super.mo7261(listAdapter);
        this.f11297 = (C2937) listAdapter;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo7262(CharSequence charSequence) {
        this.f11295 = charSequence;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final CharSequence mo7263() {
        return this.f11295;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m7264() {
        int i;
        C2965 c2965 = this.f11410;
        Drawable background = c2965.getBackground();
        C2904 c2904 = this.f11299;
        if (background != null) {
            background.getPadding(c2904.f11241);
            boolean z = AbstractC2926.f11335;
            int layoutDirection = c2904.getLayoutDirection();
            Rect rect = c2904.f11241;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c2904.f11241;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c2904.getPaddingLeft();
        int paddingRight = c2904.getPaddingRight();
        int width = c2904.getWidth();
        int i2 = c2904.f11246;
        if (i2 == -2) {
            int iM7249 = c2904.m7249(this.f11297, c2965.getBackground());
            int i3 = c2904.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c2904.f11241;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (iM7249 > i4) {
                iM7249 = i4;
            }
            m7324(Math.max(iM7249, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m7324((width - paddingLeft) - paddingRight);
        } else {
            m7324(i2);
        }
        boolean z2 = AbstractC2926.f11335;
        this.f11426 = c2904.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f11409) - this.f11298) + i : paddingLeft + this.f11298 + i;
    }
}
