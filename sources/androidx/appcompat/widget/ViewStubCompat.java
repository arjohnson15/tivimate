package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p222.InterfaceC2956;
import p300.AbstractC3505;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f251;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public WeakReference f252;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public LayoutInflater f253;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f254;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f254 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13576, 0, 0);
        this.f251 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f254 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f251;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f253;
    }

    public int getLayoutResource() {
        return this.f254;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f251 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f253 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f254 = i;
    }

    public void setOnInflateListener(InterfaceC2956 interfaceC2956) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f252;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m164();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final View m164() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f254 == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f253;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f254, viewGroup, false);
        int i = this.f251;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f252 = new WeakReference(viewInflate);
        return viewInflate;
    }
}
