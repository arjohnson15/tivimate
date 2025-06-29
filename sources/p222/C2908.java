package p222;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.leanback.widget.ﾞᐧ;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p320.AbstractC3647;
import p320.ActionProviderVisibilityListenerC3646;
import p320.C3644;
import p320.InterfaceC3641;
import p320.InterfaceC3645;
import p320.InterfaceC3660;
import p320.InterfaceC3665;
import p320.MenuC3643;
import p320.SubMenuC3642;

/* renamed from: ˏᴵ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2908 implements InterfaceC3641 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f11263;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Context f11264;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC3660 f11265;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public C2932 f11266;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC3665 f11267;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public MenuC3643 f11269;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f11270;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f11271;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f11272;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C2888 f11273;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final LayoutInflater f11274;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f11275;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public Drawable f11276;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C2928 f11277;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C2928 f11278;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f11279;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f11281;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public RunnableC2910 f11283;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f11284;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f11280 = R.layout._2_res_0x7f0e0003;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f11282 = R.layout._2_res_0x7f0e0002;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final SparseBooleanArray f11262 = new SparseBooleanArray();

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final ﾞᐧ f11268 = new ﾞᐧ(27, this);

    public C2908(Context context) {
        this.f11275 = context;
        this.f11274 = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ᴵʿ.ˋˊ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final View m7253(C3644 c3644, View view, ViewGroup viewGroup) {
        View actionView = c3644.getActionView();
        if (actionView == null || c3644.m8601()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC3645 ? (InterfaceC3645) view : (InterfaceC3645) this.f11274.inflate(this.f11282, viewGroup, false);
            actionMenuItemView.mo106(c3644);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f11267);
            if (this.f11266 == null) {
                this.f11266 = new C2932(this);
            }
            actionMenuItemView2.setPopupCallback(this.f11266);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c3644.f13928 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2898)) {
            actionView.setLayoutParams(ActionMenuView.m133(layoutParams));
        }
        return actionView;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ʿʼ */
    public final void mo7195(Context context, MenuC3643 menuC3643) {
        this.f11264 = context;
        LayoutInflater.from(context);
        this.f11269 = menuC3643;
        Resources resources = context.getResources();
        if (!this.f11272) {
            this.f11263 = true;
        }
        int i = 2;
        this.f11271 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f11270 = i;
        int measuredWidth = this.f11271;
        if (this.f11263) {
            if (this.f11273 == null) {
                C2888 c2888 = new C2888(this, this.f11275);
                this.f11273 = c2888;
                if (this.f11284) {
                    c2888.setImageDrawable(this.f11276);
                    this.f11276 = null;
                    this.f11284 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f11273.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f11273.getMeasuredWidth();
        } else {
            this.f11273 = null;
        }
        this.f11281 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˉי */
    public final boolean mo7196() {
        ArrayList arrayListM8587;
        int size;
        int i;
        boolean z;
        MenuC3643 menuC3643 = this.f11269;
        if (menuC3643 != null) {
            arrayListM8587 = menuC3643.m8587();
            size = arrayListM8587.size();
        } else {
            arrayListM8587 = null;
            size = 0;
        }
        int i2 = this.f11270;
        int i3 = this.f11281;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f11267;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C3644 c3644 = (C3644) arrayListM8587.get(i4);
            int i7 = c3644.f13940;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.f11279 && c3644.f13928) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f11263 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f11262;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C3644 c36442 = (C3644) arrayListM8587.get(i9);
            int i11 = c36442.f13940;
            boolean z3 = (i11 & 2) == i;
            int i12 = c36442.f13925;
            if (z3) {
                View viewM7253 = m7253(c36442, null, viewGroup);
                viewM7253.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM7253.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c36442.m8603(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = (i8 > 0 || z4) && i3 > 0;
                if (z5) {
                    View viewM72532 = m7253(c36442, null, viewGroup);
                    viewM72532.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM72532.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        C3644 c36443 = (C3644) arrayListM8587.get(i13);
                        if (c36443.f13925 == i12) {
                            if (c36443.m8602()) {
                                i8++;
                            }
                            c36443.m8603(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c36442.m8603(z5);
            } else {
                c36442.m8603(false);
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return true;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean m7254() {
        MenuC3643 menuC3643;
        if (!this.f11263 || m7256() || (menuC3643 = this.f11269) == null || this.f11267 == null || this.f11283 != null) {
            return false;
        }
        menuC3643.m8598();
        if (menuC3643.f13904.isEmpty()) {
            return false;
        }
        RunnableC2910 runnableC2910 = new RunnableC2910(this, new C2928(this, this.f11264, this.f11269, this.f11273));
        this.f11283 = runnableC2910;
        ((View) this.f11267).post(runnableC2910);
        return true;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˏʾ */
    public final boolean mo7197(C3644 c3644) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p320.InterfaceC3641
    /* renamed from: ˏᵢ */
    public final boolean mo7198(SubMenuC3642 subMenuC3642) {
        boolean z;
        if (!subMenuC3642.hasVisibleItems()) {
            return false;
        }
        SubMenuC3642 subMenuC36422 = subMenuC3642;
        while (true) {
            MenuC3643 menuC3643 = subMenuC36422.f13899;
            if (menuC3643 == this.f11269) {
                break;
            }
            subMenuC36422 = (SubMenuC3642) menuC3643;
        }
        ViewGroup viewGroup = (ViewGroup) this.f11267;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC3645) && ((InterfaceC3645) childAt).getItemData() == subMenuC36422.f13898) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC3642.f13898.getClass();
        int size = subMenuC3642.f13915.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = subMenuC3642.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C2928 c2928 = new C2928(this, this.f11264, subMenuC3642, view);
        this.f11277 = c2928;
        c2928.f14005 = z;
        AbstractC3647 abstractC3647 = c2928.f14007;
        if (abstractC3647 != null) {
            abstractC3647.mo8609(z);
        }
        C2928 c29282 = this.f11277;
        if (!c29282.m8618()) {
            if (c29282.f13998 == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c29282.m8620(0, 0, false, false);
        }
        InterfaceC3660 interfaceC3660 = this.f11265;
        if (interfaceC3660 != null) {
            interfaceC3660.mo7407(subMenuC3642);
        }
        return true;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo7255(InterfaceC3660 interfaceC3660) {
        throw null;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ـﹶ */
    public final void mo7199(MenuC3643 menuC3643, boolean z) {
        m7257();
        C2928 c2928 = this.f11277;
        if (c2928 != null && c2928.m8618()) {
            c2928.f14007.dismiss();
        }
        InterfaceC3660 interfaceC3660 = this.f11265;
        if (interfaceC3660 != null) {
            interfaceC3660.mo7408(menuC3643, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p320.InterfaceC3641
    /* renamed from: ٴˎ */
    public final void mo7200() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f11267;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC3643 menuC3643 = this.f11269;
            if (menuC3643 != null) {
                menuC3643.m8598();
                ArrayList arrayListM8587 = this.f11269.m8587();
                int size = arrayListM8587.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C3644 c3644 = (C3644) arrayListM8587.get(i2);
                    if (c3644.m8602()) {
                        View childAt = viewGroup.getChildAt(i);
                        C3644 itemData = childAt instanceof InterfaceC3645 ? ((InterfaceC3645) childAt).getItemData() : null;
                        View viewM7253 = m7253(c3644, childAt, viewGroup);
                        if (c3644 != itemData) {
                            viewM7253.setPressed(false);
                            viewM7253.jumpDrawablesToCurrentState();
                        }
                        if (viewM7253 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM7253.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM7253);
                            }
                            ((ViewGroup) this.f11267).addView(viewM7253, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f11273) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f11267).requestLayout();
        MenuC3643 menuC36432 = this.f11269;
        if (menuC36432 != null) {
            menuC36432.m8598();
            ArrayList arrayList2 = menuC36432.f13922;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC3646 actionProviderVisibilityListenerC3646 = ((C3644) arrayList2.get(i3)).f13929;
            }
        }
        MenuC3643 menuC36433 = this.f11269;
        if (menuC36433 != null) {
            menuC36433.m8598();
            arrayList = menuC36433.f13904;
        }
        if (this.f11263 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C3644) arrayList.get(0)).f13928;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f11273 == null) {
                this.f11273 = new C2888(this, this.f11275);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f11273.getParent();
            if (viewGroup3 != this.f11267) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f11273);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f11267;
                C2888 c2888 = this.f11273;
                actionMenuView.getClass();
                C2898 c2898M132 = ActionMenuView.m132();
                c2898M132.f11223 = true;
                actionMenuView.addView(c2888, c2898M132);
            }
        } else {
            C2888 c28882 = this.f11273;
            if (c28882 != null) {
                Object parent = c28882.getParent();
                Object obj = this.f11267;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f11273);
                }
            }
        }
        ((ActionMenuView) this.f11267).setOverflowReserved(this.f11263);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m7256() {
        C2928 c2928 = this.f11278;
        return c2928 != null && c2928.m8618();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m7257() {
        Object obj;
        RunnableC2910 runnableC2910 = this.f11283;
        if (runnableC2910 != null && (obj = this.f11267) != null) {
            ((View) obj).removeCallbacks(runnableC2910);
            this.f11283 = null;
            return true;
        }
        C2928 c2928 = this.f11278;
        if (c2928 == null) {
            return false;
        }
        if (c2928.m8618()) {
            c2928.f14007.dismiss();
        }
        return true;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ﹶˆ */
    public final boolean mo7201(C3644 c3644) {
        return false;
    }
}
