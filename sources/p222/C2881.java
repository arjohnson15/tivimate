package p222;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p182.InterfaceC2524;
import p320.C3644;
import p320.C3657;
import p320.InterfaceC3641;
import p320.MenuC3643;
import p320.SubMenuC3642;

/* renamed from: ˏᴵ.ˆﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2881 implements InterfaceC3641 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3644 f11151;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f11152;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public MenuC3643 f11153;

    public C2881(Toolbar toolbar) {
        this.f11152 = toolbar;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo7195(Context context, MenuC3643 menuC3643) {
        C3644 c3644;
        MenuC3643 menuC36432 = this.f11153;
        if (menuC36432 != null && (c3644 = this.f11151) != null) {
            menuC36432.mo8584(c3644);
        }
        this.f11153 = menuC3643;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean mo7196() {
        return false;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean mo7197(C3644 c3644) {
        Toolbar toolbar = this.f11152;
        KeyEvent.Callback callback = toolbar.f229;
        if (callback instanceof InterfaceC2524) {
            ((C3657) ((InterfaceC2524) callback)).f13996.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f229);
        toolbar.removeView(toolbar.f219);
        toolbar.f229 = null;
        ArrayList arrayList = toolbar.f216;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f11151 = null;
        toolbar.requestLayout();
        c3644.f13928 = false;
        c3644.f13945.m8592(false);
        toolbar.m149();
        return true;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean mo7198(SubMenuC3642 subMenuC3642) {
        return false;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7199(MenuC3643 menuC3643, boolean z) {
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo7200() {
        if (this.f11151 != null) {
            MenuC3643 menuC3643 = this.f11153;
            if (menuC3643 != null) {
                int size = menuC3643.f13915.size();
                for (int i = 0; i < size; i++) {
                    if (this.f11153.getItem(i) == this.f11151) {
                        return;
                    }
                }
            }
            mo7197(this.f11151);
        }
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean mo7201(C3644 c3644) {
        Toolbar toolbar = this.f11152;
        toolbar.m154();
        ViewParent parent = toolbar.f219.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f219);
            }
            toolbar.addView(toolbar.f219);
        }
        View actionView = c3644.getActionView();
        toolbar.f229 = actionView;
        this.f11151 = c3644;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f229);
            }
            C2878 c2878M145 = Toolbar.m145();
            c2878M145.f11142 = (toolbar.f226 & 112) | 8388611;
            c2878M145.f11141 = 2;
            toolbar.f229.setLayoutParams(c2878M145);
            toolbar.addView(toolbar.f229);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C2878) childAt.getLayoutParams()).f11141 != 2 && childAt != toolbar.f235) {
                toolbar.removeViewAt(childCount);
                toolbar.f216.add(childAt);
            }
        }
        toolbar.requestLayout();
        c3644.f13928 = true;
        c3644.f13945.m8592(false);
        KeyEvent.Callback callback = toolbar.f229;
        if (callback instanceof InterfaceC2524) {
            ((C3657) ((InterfaceC2524) callback)).f13996.onActionViewExpanded();
        }
        toolbar.m149();
        return true;
    }
}
