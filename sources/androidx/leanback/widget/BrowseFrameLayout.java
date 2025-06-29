package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class BrowseFrameLayout extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public InterfaceC0201 f775;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public View.OnKeyListener f776;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC0147 f777;

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f776;
        return (onKeyListener == null || zDispatchKeyEvent) ? zDispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewM908;
        InterfaceC0147 interfaceC0147 = this.f777;
        return (interfaceC0147 == null || (viewM908 = interfaceC0147.m908(view, i)) == null) ? super.focusSearch(view, i) : viewM908;
    }

    public InterfaceC0201 getOnChildFocusListener() {
        return this.f775;
    }

    public InterfaceC0147 getOnFocusSearchListener() {
        return this.f777;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        InterfaceC0201 interfaceC0201 = this.f775;
        if (interfaceC0201 == null) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        interfaceC0201.m986(i, rect);
        return true;
    }

    public void setOnChildFocusListener(InterfaceC0201 interfaceC0201) {
        this.f775 = interfaceC0201;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f776 = onKeyListener;
    }

    public void setOnFocusSearchListener(InterfaceC0147 interfaceC0147) {
        this.f777 = interfaceC0147;
    }
}
