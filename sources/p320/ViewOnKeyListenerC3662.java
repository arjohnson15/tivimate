package p320;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.lsposed.hiddenapibypass.library.R;
import p222.AbstractC2939;
import p222.AbstractC2940;
import p222.C2864;
import p222.C2882;
import p222.C2920;
import p222.C2965;
import p222.ViewTreeObserverOnGlobalLayoutListenerC2967;
import p291.ViewOnAttachStateChangeListenerC3460;
import ˊﹶ.ˋˉ;
import ـˈ.ˉᵎ;

/* renamed from: ᴵʿ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC3662 extends AbstractC3647 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f14029;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public C2864 f14031;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Context f14032;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f14033;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public boolean f14034;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f14035;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public InterfaceC3660 f14037;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f14038;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f14039;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public View f14040;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f14043;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public ViewTreeObserver f14045;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int f14046;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f14047;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f14048;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Handler f14049;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public View f14050;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ArrayList f14051 = new ArrayList();

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ArrayList f14036 = new ArrayList();

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2967 f14042 = new ViewTreeObserverOnGlobalLayoutListenerC2967(2, this);

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC3460 f14044 = new ViewOnAttachStateChangeListenerC3460(1, this);

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ˋˉ f14053 = new ˋˉ(22, this);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f14030 = 0;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f14041 = 0;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public boolean f14052 = false;

    public ViewOnKeyListenerC3662(Context context, View view, int i, boolean z) {
        this.f14032 = context;
        this.f14040 = view;
        this.f14043 = i;
        this.f14033 = z;
        this.f14039 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f14038 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen._2_res_0x7f070017));
        this.f14049 = new Handler();
    }

    @Override // p320.InterfaceC3653
    public final void dismiss() {
        ArrayList arrayList = this.f14036;
        int size = arrayList.size();
        if (size > 0) {
            C3651[] c3651Arr = (C3651[]) arrayList.toArray(new C3651[size]);
            for (int i = size - 1; i >= 0; i--) {
                C3651 c3651 = c3651Arr[i];
                if (c3651.f13965.f11410.isShowing()) {
                    c3651.f13965.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C3651 c3651;
        ArrayList arrayList = this.f14036;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c3651 = null;
                break;
            }
            c3651 = (C3651) arrayList.get(i);
            if (!c3651.f13965.f11410.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c3651 != null) {
            c3651.f13963.m8591(false);
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
        ArrayList arrayList = this.f14036;
        return arrayList.size() > 0 && ((C3651) arrayList.get(0)).f13965.f11410.isShowing();
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˉי */
    public final boolean mo7196() {
        return false;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˉⁱ */
    public final void mo8607(MenuC3643 menuC3643) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC3643.m8585(this, this.f14032);
        if (mo7318()) {
            m8621(menuC3643);
        } else {
            this.f14051.add(menuC3643);
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m8621(MenuC3643 menuC3643) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View childAt;
        C3651 c3651;
        char c;
        int i;
        int i2;
        MenuItem item;
        C3656 c3656;
        int headersCount;
        int i3;
        int firstVisiblePosition;
        Context context = this.f14032;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C3656 c36562 = new C3656(menuC3643, layoutInflaterFrom, this.f14033, R.layout._2_res_0x7f0e000b);
        if (!mo7318() && this.f14052) {
            c36562.f13992 = true;
        } else if (mo7318()) {
            c36562.f13992 = AbstractC3647.m8605(menuC3643);
        }
        int iM8606 = AbstractC3647.m8606(c36562, context, this.f14038);
        C2920 c2920 = new C2920(context, null, this.f14043);
        C2965 c2965 = c2920.f11410;
        c2920.f11318 = this.f14053;
        c2920.f11415 = this;
        c2965.setOnDismissListener(this);
        c2920.f11427 = this.f14040;
        c2920.f11406 = this.f14041;
        c2920.f11407 = true;
        c2965.setFocusable(true);
        c2965.setInputMethodMode(2);
        c2920.mo7261(c36562);
        c2920.m7324(iM8606);
        c2920.f11406 = this.f14041;
        ArrayList arrayList = this.f14036;
        if (arrayList.size() > 0) {
            c3651 = (C3651) ˉᵎ.ﹶˆ(1, arrayList);
            MenuC3643 menuC36432 = c3651.f13963;
            int size = menuC36432.f13915.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    item = null;
                    break;
                }
                item = menuC36432.getItem(i4);
                if (item.hasSubMenu() && menuC3643 == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C2882 c2882 = c3651.f13965.f11414;
                ListAdapter adapter = c2882.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c3656 = (C3656) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c3656 = (C3656) adapter;
                    headersCount = 0;
                }
                int count = c3656.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i3 = -1;
                        i5 = -1;
                        break;
                    } else {
                        if (item == c3656.getItem(i5)) {
                            i3 = -1;
                            break;
                        }
                        i5++;
                    }
                }
                childAt = (i5 != i3 && (firstVisiblePosition = (i5 + headersCount) - c2882.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c2882.getChildCount()) ? c2882.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            childAt = null;
            c3651 = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C2920.f11317;
                if (method != null) {
                    try {
                        method.invoke(c2965, Boolean.FALSE);
                    } catch (Exception unused) {
                    }
                }
            } else {
                AbstractC2940.m7298(c2965, false);
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 23) {
                AbstractC2939.m7297(c2965, null);
            }
            C2882 c28822 = ((C3651) ˉᵎ.ﹶˆ(1, arrayList)).f13965.f11414;
            int[] iArr = new int[2];
            c28822.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f14050.getWindowVisibleDisplayFrame(rect);
            int i7 = (this.f14039 != 1 ? iArr[0] - iM8606 >= 0 : (c28822.getWidth() + iArr[0]) + iM8606 > rect.right) ? 0 : 1;
            boolean z = i7 == 1;
            this.f14039 = i7;
            if (i6 >= 26) {
                c2920.f11427 = childAt;
                i2 = 0;
                i = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f14040.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f14041 & 7) == 5) {
                    c = 0;
                    iArr2[0] = this.f14040.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c = 0;
                }
                i = iArr3[c] - iArr2[c];
                i2 = iArr3[1] - iArr2[1];
            }
            c2920.f11426 = (this.f14041 & 5) == 5 ? z ? i + iM8606 : i - childAt.getWidth() : z ? i + childAt.getWidth() : i - iM8606;
            c2920.f11430 = true;
            c2920.f11421 = true;
            c2920.m7327(i2);
        } else {
            if (this.f14048) {
                c2920.f11426 = this.f14047;
            }
            if (this.f14029) {
                c2920.m7327(this.f14046);
            }
            Rect rect2 = this.f13957;
            c2920.f11422 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C3651(c2920, menuC3643, this.f14039));
        c2920.mo7326();
        C2882 c28823 = c2920.f11414;
        c28823.setOnKeyListener(this);
        if (c3651 == null && this.f14035 && menuC3643.f13907 != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout._2_res_0x7f0e0012, (ViewGroup) c28823, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC3643.f13907);
            c28823.addHeaderView(frameLayout, null, false);
            c2920.mo7326();
        }
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˎٴ */
    public final void mo8608(PopupWindow.OnDismissListener onDismissListener) {
        this.f14031 = (C2864) onDismissListener;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˏᴵ */
    public final void mo8609(boolean z) {
        this.f14052 = z;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˏᵢ */
    public final boolean mo7198(SubMenuC3642 subMenuC3642) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.f14036.iterator();
        while (it.hasNext()) {
            C3651 c3651 = (C3651) it.next();
            if (subMenuC3642 == c3651.f13963) {
                c3651.f13965.f11414.requestFocus();
                return true;
            }
        }
        if (!subMenuC3642.hasVisibleItems()) {
            return false;
        }
        mo8607(subMenuC3642);
        InterfaceC3660 interfaceC3660 = this.f14037;
        if (interfaceC3660 != null) {
            interfaceC3660.mo7407(subMenuC3642);
        }
        return true;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˑʽ */
    public final void mo7255(InterfaceC3660 interfaceC3660) {
        this.f14037 = interfaceC3660;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ˑי */
    public final void mo8610(int i) {
        if (this.f14030 != i) {
            this.f14030 = i;
            this.f14041 = Gravity.getAbsoluteGravity(i, this.f14040.getLayoutDirection());
        }
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ـﹶ */
    public final void mo7199(MenuC3643 menuC3643, boolean z) {
        ArrayList arrayList = this.f14036;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC3643 == ((C3651) arrayList.get(i)).f13963) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C3651) arrayList.get(i2)).f13963.m8591(false);
        }
        C3651 c3651 = (C3651) arrayList.remove(i);
        c3651.f13963.m8589(this);
        boolean z2 = this.f14034;
        C2920 c2920 = c3651.f13965;
        if (z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC2939.m7296(c2920.f11410, null);
            }
            c2920.f11410.setAnimationStyle(0);
        }
        c2920.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f14039 = ((C3651) arrayList.get(size2 - 1)).f13964;
        } else {
            this.f14039 = this.f14040.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C3651) arrayList.get(0)).f13963.m8591(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC3660 interfaceC3660 = this.f14037;
        if (interfaceC3660 != null) {
            interfaceC3660.mo7408(menuC3643, true);
        }
        ViewTreeObserver viewTreeObserver = this.f14045;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f14045.removeGlobalOnLayoutListener(this.f14042);
            }
            this.f14045 = null;
        }
        this.f14050.removeOnAttachStateChangeListener(this.f14044);
        this.f14031.onDismiss();
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ٴˎ */
    public final void mo7200() {
        Iterator it = this.f14036.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C3651) it.next()).f13965.f11414.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C3656) adapter).notifyDataSetChanged();
        }
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ᐧʻ */
    public final C2882 mo7325() {
        ArrayList arrayList = this.f14036;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C3651) ˉᵎ.ﹶˆ(1, arrayList)).f13965.f11414;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ᴵʿ */
    public final void mo8611(View view) {
        if (this.f14040 != view) {
            this.f14040 = view;
            this.f14041 = Gravity.getAbsoluteGravity(this.f14030, view.getLayoutDirection());
        }
    }

    @Override // p320.AbstractC3647
    /* renamed from: ᵎˏ */
    public final void mo8612(boolean z) {
        this.f14035 = z;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ᵎـ */
    public final void mo8613(int i) {
        this.f14048 = true;
        this.f14047 = i;
    }

    @Override // p320.AbstractC3647
    /* renamed from: ﹳˎ */
    public final void mo8614(int i) {
        this.f14029 = true;
        this.f14046 = i;
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ﹳﹳ */
    public final void mo7326() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo7318()) {
            return;
        }
        ArrayList arrayList = this.f14051;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m8621((MenuC3643) it.next());
        }
        arrayList.clear();
        View view = this.f14040;
        this.f14050 = view;
        if (view != null) {
            boolean z = this.f14045 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f14045 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14042);
            }
            this.f14050.addOnAttachStateChangeListener(this.f14044);
        }
    }
}
