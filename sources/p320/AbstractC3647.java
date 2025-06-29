package p320;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: ᴵʿ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3647 implements InterfaceC3653, InterfaceC3641, AdapterView.OnItemClickListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Rect f13957;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static boolean m8605(MenuC3643 menuC3643) {
        int size = menuC3643.f13915.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC3643.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m8606(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C3656) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C3656) listAdapter).f13993.m8596((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC3662) ? 0 : 4);
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ʿʼ */
    public final void mo7195(Context context, MenuC3643 menuC3643) {
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public abstract void mo8607(MenuC3643 menuC3643);

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public abstract void mo8608(PopupWindow.OnDismissListener onDismissListener);

    @Override // p320.InterfaceC3641
    /* renamed from: ˏʾ */
    public final boolean mo7197(C3644 c3644) {
        return false;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public abstract void mo8609(boolean z);

    /* renamed from: ˑי, reason: contains not printable characters */
    public abstract void mo8610(int i);

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public abstract void mo8611(View view);

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public abstract void mo8612(boolean z);

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public abstract void mo8613(int i);

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public abstract void mo8614(int i);

    @Override // p320.InterfaceC3641
    /* renamed from: ﹶˆ */
    public final boolean mo7201(C3644 c3644) {
        return false;
    }
}
