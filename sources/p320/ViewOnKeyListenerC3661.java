package p320;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.lsposed.hiddenapibypass.library.R;
import p222.C2864;
import p222.C2882;
import p222.C2920;
import p222.ViewTreeObserverOnGlobalLayoutListenerC2967;
import p291.ViewOnAttachStateChangeListenerC3460;

/* renamed from: ᴵʿ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC3661 extends AbstractC3647 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f14010;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public View f14011;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Context f14012;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f14013;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C2920 f14014;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final MenuC3643 f14015;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f14016;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public InterfaceC3660 f14017;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public View f14018;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3656 f14020;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f14022;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f14024;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f14025;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public ViewTreeObserver f14026;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f14027;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C2864 f14028;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2967 f14019 = new ViewTreeObserverOnGlobalLayoutListenerC2967(3, this);

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC3460 f14021 = new ViewOnAttachStateChangeListenerC3460(2, this);

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f14023 = 0;

    public ViewOnKeyListenerC3661(int i, Context context, View view, MenuC3643 menuC3643, boolean z) {
        this.f14012 = context;
        this.f14015 = menuC3643;
        this.f14013 = z;
        this.f14020 = new C3656(menuC3643, LayoutInflater.from(context), z, R.layout._2_res_0x7f0e0013);
        this.f14027 = i;
        Resources resources = context.getResources();
        this.f14025 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen._2_res_0x7f070017));
        this.f14011 = view;
        this.f14014 = new C2920(context, null, i);
        menuC3643.m8585(this, context);
    }

    @Override // p320.InterfaceC3653
    public final void dismiss() {
        if (mo7318()) {
            this.f14014.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14016 = true;
        this.f14015.m8591(true);
        ViewTreeObserver viewTreeObserver = this.f14026;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f14026 = this.f14018.getViewTreeObserver();
            }
            this.f14026.removeGlobalOnLayoutListener(this.f14019);
            this.f14026 = null;
        }
        this.f14018.removeOnAttachStateChangeListener(this.f14021);
        C2864 c2864 = this.f14028;
        if (c2864 != null) {
            c2864.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ʽᐧ */
    public final boolean mo7318() {
        return !this.f14016 && this.f14014.f11410.isShowing();
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˉי */
    public final boolean mo7196() {
        return false;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˉⁱ */
    public final void mo8607(MenuC3643 menuC3643) {
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˎٴ */
    public final void mo8608(PopupWindow.OnDismissListener onDismissListener) {
        this.f14028 = (C2864) onDismissListener;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˏᴵ */
    public final void mo8609(boolean z) {
        this.f14020.f13992 = z;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˏᵢ */
    public final boolean mo7198(SubMenuC3642 subMenuC3642) {
        if (subMenuC3642.hasVisibleItems()) {
            View view = this.f14018;
            C3658 c3658 = new C3658(this.f14027, this.f14012, view, subMenuC3642, this.f14013);
            InterfaceC3660 interfaceC3660 = this.f14017;
            c3658.f14001 = interfaceC3660;
            AbstractC3647 abstractC3647 = c3658.f14007;
            if (abstractC3647 != null) {
                abstractC3647.mo7255(interfaceC3660);
            }
            boolean zM8605 = AbstractC3647.m8605(subMenuC3642);
            c3658.f14005 = zM8605;
            AbstractC3647 abstractC36472 = c3658.f14007;
            if (abstractC36472 != null) {
                abstractC36472.mo8609(zM8605);
            }
            c3658.f13999 = this.f14028;
            this.f14028 = null;
            this.f14015.m8591(false);
            C2920 c2920 = this.f14014;
            int width = c2920.f11426;
            int iM7320 = c2920.m7320();
            if ((Gravity.getAbsoluteGravity(this.f14023, this.f14011.getLayoutDirection()) & 7) == 5) {
                width += this.f14011.getWidth();
            }
            if (!c3658.m8618()) {
                if (c3658.f13998 != null) {
                    c3658.m8620(width, iM7320, true, true);
                }
            }
            InterfaceC3660 interfaceC36602 = this.f14017;
            if (interfaceC36602 != null) {
                interfaceC36602.mo7407(subMenuC3642);
            }
            return true;
        }
        return false;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˑʽ */
    public final void mo7255(InterfaceC3660 interfaceC3660) {
        this.f14017 = interfaceC3660;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˑי */
    public final void mo8610(int i) {
        this.f14023 = i;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ـﹶ */
    public final void mo7199(MenuC3643 menuC3643, boolean z) {
        if (menuC3643 != this.f14015) {
            return;
        }
        dismiss();
        InterfaceC3660 interfaceC3660 = this.f14017;
        if (interfaceC3660 != null) {
            interfaceC3660.mo7408(menuC3643, z);
        }
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ٴˎ */
    public final void mo7200() {
        this.f14024 = false;
        C3656 c3656 = this.f14020;
        if (c3656 != null) {
            c3656.notifyDataSetChanged();
        }
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ᐧʻ */
    public final C2882 mo7325() {
        return this.f14014.f11414;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ᴵʿ */
    public final void mo8611(View view) {
        this.f14011 = view;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ᵎˏ */
    public final void mo8612(boolean z) {
        this.f14022 = z;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ᵎـ */
    public final void mo8613(int i) {
        this.f14014.f11426 = i;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ﹳˎ */
    public final void mo8614(int i) {
        this.f14014.m7327(i);
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ﹳﹳ */
    public final void mo7326() {
        View view;
        if (mo7318()) {
            return;
        }
        if (this.f14016 || (view = this.f14011) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f14018 = view;
        C2920 c2920 = this.f14014;
        c2920.f11410.setOnDismissListener(this);
        c2920.f11415 = this;
        c2920.f11407 = true;
        c2920.f11410.setFocusable(true);
        View view2 = this.f14018;
        boolean z = this.f14026 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f14026 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f14019);
        }
        view2.addOnAttachStateChangeListener(this.f14021);
        c2920.f11427 = view2;
        c2920.f11406 = this.f14023;
        boolean z2 = this.f14024;
        Context context = this.f14012;
        C3656 c3656 = this.f14020;
        if (!z2) {
            this.f14010 = AbstractC3647.m8606(c3656, context, this.f14025);
            this.f14024 = true;
        }
        c2920.m7324(this.f14010);
        c2920.f11410.setInputMethodMode(2);
        Rect rect = this.f13957;
        c2920.f11422 = rect != null ? new Rect(rect) : null;
        c2920.mo7326();
        C2882 c2882 = c2920.f11414;
        c2882.setOnKeyListener(this);
        if (this.f14022) {
            MenuC3643 menuC3643 = this.f14015;
            if (menuC3643.f13907 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e0012, (ViewGroup) c2882, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC3643.f13907);
                }
                frameLayout.setEnabled(false);
                c2882.addHeaderView(frameLayout, null, false);
            }
        }
        c2920.mo7261(c3656);
        c2920.mo7326();
    }
}
