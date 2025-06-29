package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p040.AbstractC1271;
import p291.C3419;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p378.C4369;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f522;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public View.OnApplyWindowInsetsListener f523;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f524;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f525;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f525 = new ArrayList();
        this.f522 = new ArrayList();
        this.f524 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1271.f5208, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC0104 abstractC0104) {
        View view;
        super(context, attributeSet);
        this.f525 = new ArrayList();
        this.f522 = new ArrayList();
        this.f524 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1271.f5208, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M655 = abstractC0104.m655(id);
        if (classAttribute != null && abstractComponentCallbacksC0100M655 == null) {
            if (id == -1) {
                throw new IllegalStateException(ˆʽ.ᵎˏ.ˑי("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C3419 c3419M677 = abstractC0104.m677();
            context.getClassLoader();
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M8291 = c3419M677.m8291(classAttribute);
            abstractComponentCallbacksC0100M8291.mFragmentId = id;
            abstractComponentCallbacksC0100M8291.mContainerId = id;
            abstractComponentCallbacksC0100M8291.mTag = string;
            abstractComponentCallbacksC0100M8291.mFragmentManager = abstractC0104;
            abstractComponentCallbacksC0100M8291.mHost = abstractC0104.f635;
            abstractComponentCallbacksC0100M8291.onInflate(context, attributeSet, (Bundle) null);
            C0105 c0105 = new C0105(abstractC0104);
            c0105.f647 = true;
            abstractComponentCallbacksC0100M8291.mContainer = this;
            abstractComponentCallbacksC0100M8291.mInDynamicContainer = true;
            c0105.m705(getId(), abstractComponentCallbacksC0100M8291, string, 1);
            if (c0105.f650) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0105.f645 = false;
            c0105.f642.m676(c0105, true);
        }
        Iterator it = abstractC0104.f612.m599().iterator();
        while (it.hasNext()) {
            C0109 c0109 = (C0109) it.next();
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c0109.f677;
            if (abstractComponentCallbacksC0100.mContainerId == getId() && (view = abstractComponentCallbacksC0100.mView) != null && view.getParent() == null) {
                abstractComponentCallbacksC0100.mContainer = this;
                c0109.m714();
                c0109.m719();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id._2_res_0x7f0b01a2);
        if ((tag instanceof AbstractComponentCallbacksC0100 ? (AbstractComponentCallbacksC0100) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C4369 c4369M9950;
        C4369 c4369M99502 = C4369.m9950(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f523;
        if (onApplyWindowInsetsListener != null) {
            c4369M9950 = C4369.m9950(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            WindowInsets windowInsetsM9954 = c4369M99502.m9954();
            if (windowInsetsM9954 != null) {
                WindowInsets windowInsetsM9943 = AbstractC4362.m9943(this, windowInsetsM9954);
                if (!windowInsetsM9943.equals(windowInsetsM9954)) {
                    c4369M99502 = C4369.m9950(this, windowInsetsM9943);
                }
            }
            c4369M9950 = c4369M99502;
        }
        if (!c4369M9950.f16871.mo9833()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = AbstractC4345.f16838;
                WindowInsets windowInsetsM99542 = c4369M9950.m9954();
                if (windowInsetsM99542 != null) {
                    WindowInsets windowInsetsM9945 = AbstractC4362.m9945(childAt, windowInsetsM99542);
                    if (!windowInsetsM9945.equals(windowInsetsM99542)) {
                        C4369.m9950(childAt, windowInsetsM9945);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f524) {
            Iterator it = this.f525.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f524) {
            ArrayList arrayList = this.f525;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f522.remove(view);
        if (this.f525.remove(view)) {
            this.f524 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0100> F getFragment() {
        AbstractActivityC0113 abstractActivityC0113;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100;
        AbstractC0104 supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC0113 = null;
            if (view == null) {
                abstractComponentCallbacksC0100 = null;
                break;
            }
            Object tag = view.getTag(R.id._2_res_0x7f0b01a2);
            abstractComponentCallbacksC0100 = tag instanceof AbstractComponentCallbacksC0100 ? (AbstractComponentCallbacksC0100) tag : null;
            if (abstractComponentCallbacksC0100 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0100 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0113) {
                    abstractActivityC0113 = (AbstractActivityC0113) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0113 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC0113.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC0100.isAdded()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0100 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC0100.getChildFragmentManager();
        }
        return (F) supportFragmentManager.m655(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            m587(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m587(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m587(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m587(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m587(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m587(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f524 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f523 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f522.add(view);
        }
        super.startViewTransition(view);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m587(View view) {
        if (this.f522.contains(view)) {
            this.f525.add(view);
        }
    }
}
