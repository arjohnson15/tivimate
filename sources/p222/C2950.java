package p222;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p320.C3644;
import p320.C3656;
import p320.MenuC3643;

/* renamed from: ˏᴵ.ᵔᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2950 extends C2882 {

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public C3644 f11394;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int f11395;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final int f11396;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public InterfaceC2953 f11397;

    public C2950(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f11396 = 21;
            this.f11395 = 22;
        } else {
            this.f11396 = 22;
            this.f11395 = 21;
        }
    }

    @Override // p222.C2882, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C3656 c3656;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f11397 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c3656 = (C3656) headerViewListAdapter.getWrappedAdapter();
            } else {
                c3656 = (C3656) adapter;
                headersCount = 0;
            }
            C3644 c3644M8616 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c3656.getCount()) ? null : c3656.getItem(i);
            C3644 c3644 = this.f11394;
            if (c3644 != c3644M8616) {
                MenuC3643 menuC3643 = c3656.f13993;
                if (c3644 != null) {
                    this.f11397.mo7269(menuC3643, c3644);
                }
                this.f11394 = c3644M8616;
                if (c3644M8616 != null) {
                    this.f11397.mo7271(menuC3643, c3644M8616);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f11396) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f11395) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C3656) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C3656) adapter).f13993.m8591(false);
        return true;
    }

    public void setHoverListener(InterfaceC2953 interfaceC2953) {
        this.f11397 = interfaceC2953;
    }

    @Override // p222.C2882, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
