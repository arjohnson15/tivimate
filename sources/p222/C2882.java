package p222;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.leanback.widget.RunnableC0183;
import java.lang.reflect.InvocationTargetException;
import org.lsposed.hiddenapibypass.library.R;
import p004.ViewOnTouchListenerC0920;

/* renamed from: ˏᴵ.ˆﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2882 extends ListView {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public RunnableC0183 f11154;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f11155;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f11156;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f11157;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f11158;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean f11159;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f11160;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Rect f11161;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f11162;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f11163;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C2893 f11164;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public ViewOnTouchListenerC0920 f11165;

    public C2882(Context context, boolean z) {
        super(context, null, R.attr._2_res_0x7f0401fc);
        this.f11161 = new Rect();
        this.f11155 = 0;
        this.f11158 = 0;
        this.f11160 = 0;
        this.f11156 = 0;
        this.f11159 = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f11161;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f11154 != null) {
            return;
        }
        super.drawableStateChanged();
        C2893 c2893 = this.f11164;
        if (c2893 != null) {
            c2893.f11212 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f11162 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f11159 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f11159 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f11159 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f11159 && this.f11157) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f11154 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f11154 == null) {
            RunnableC0183 runnableC0183 = new RunnableC0183(14, this);
            this.f11154 = runnableC0183;
            post(runnableC0183);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC2858.f11113) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC2858.f11112.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC2858.f11110.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC2858.f11111.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f11162 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11163 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0183 runnableC0183 = this.f11154;
        if (runnableC0183 != null) {
            C2882 c2882 = (C2882) runnableC0183.f1158;
            c2882.f11154 = null;
            c2882.removeCallbacks(runnableC0183);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f11157 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C2893 c2893;
        if (drawable != null) {
            c2893 = new C2893();
            Drawable drawable2 = c2893.f11213;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c2893.f11213 = drawable;
            if (drawable != null) {
                drawable.setCallback(c2893);
            }
            c2893.f11212 = true;
        } else {
            c2893 = null;
        }
        this.f11164 = c2893;
        super.setSelector(c2893);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f11155 = rect.left;
        this.f11158 = rect.top;
        this.f11160 = rect.right;
        this.f11156 = rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7202(android.view.MotionEvent r17, int r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.C2882.m7202(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7203(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }
}
