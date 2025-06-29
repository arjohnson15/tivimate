package p222;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import p036.C1262;
import p220.AbstractC2850;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᴵ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2904 extends Spinner {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final int[] f11238 = {R.attr.spinnerMode};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Context f11239;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f11240;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Rect f11241;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2952 f11242;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public SpinnerAdapter f11243;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1262 f11244;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final InterfaceC2955 f11245;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f11246;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2904(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969914(0x7f04053a, float:1.7548523E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f11241 = r1
            android.content.Context r1 = r12.getContext()
            p222.AbstractC2873.m7187(r1, r12)
            int[] r1 = p300.AbstractC3505.f13575
            ᴵﹳ.ˋⁱ r2 = p331.C3762.m8778(r13, r14, r1, r0)
            ʼﹶ.ﾞˊ r3 = new ʼﹶ.ﾞˊ
            r3.<init>(r12)
            r12.f11244 = r3
            java.lang.Object r3 = r2.f14531
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            ˋⁱ.ﹳﹳ r6 = new ˋⁱ.ﹳﹳ
            r6.<init>(r13, r4)
            r12.f11239 = r6
            goto L37
        L35:
            r12.f11239 = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = p222.C2904.f11238     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld3
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L61
        L54:
            r13 = move-exception
            goto Ld3
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            if (r7 == 0) goto L61
            goto L50
        L61:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9b
            if (r4 == r8) goto L68
            goto La8
        L68:
            ˏᴵ.ˑﾞ r4 = new ˏᴵ.ˑﾞ
            android.content.Context r9 = r12.f11239
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f11239
            ᴵﹳ.ˋⁱ r1 = p331.C3762.m8778(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f14531
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f11246 = r9
            android.graphics.drawable.Drawable r9 = r1.m8784(r8)
            r4.m7322(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f11295 = r7
            r1.m8783()
            r12.f11245 = r4
            ˏᴵ.ᵢʿ r1 = new ˏᴵ.ᵢʿ
            r1.<init>(r12, r12, r4)
            r12.f11242 = r1
            goto La8
        L9b:
            ˏᴵ.ـˆ r1 = new ˏᴵ.ـˆ
            r1.<init>(r12)
            r12.f11245 = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f11330 = r4
        La8:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lbf
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131624240(0x7f0e0130, float:1.8875654E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lbf:
            r2.m8783()
            r12.f11240 = r8
            android.widget.SpinnerAdapter r13 = r12.f11243
            if (r13 == 0) goto Lcd
            r12.setAdapter(r13)
            r12.f11243 = r6
        Lcd:
            ʼﹶ.ﾞˊ r13 = r12.f11244
            r13.m4491(r14, r0)
            return
        Ld3:
            if (r6 == 0) goto Ld8
            r6.recycle()
        Ld8:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.C2904.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262 c1262 = this.f11244;
        if (c1262 != null) {
            c1262.m4520();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC2955 interfaceC2955 = this.f11245;
        return interfaceC2955 != null ? interfaceC2955.mo7279() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC2955 interfaceC2955 = this.f11245;
        return interfaceC2955 != null ? interfaceC2955.mo7276() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f11245 != null ? this.f11246 : super.getDropDownWidth();
    }

    public final InterfaceC2955 getInternalPopup() {
        return this.f11245;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC2955 interfaceC2955 = this.f11245;
        return interfaceC2955 != null ? interfaceC2955.mo7275() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f11239;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC2955 interfaceC2955 = this.f11245;
        return interfaceC2955 != null ? interfaceC2955.mo7263() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f11244;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f11244;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2955 interfaceC2955 = this.f11245;
        if (interfaceC2955 == null || !interfaceC2955.mo7274()) {
            return;
        }
        interfaceC2955.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11245 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m7249(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C2915 c2915 = (C2915) parcelable;
        super.onRestoreInstanceState(c2915.getSuperState());
        if (!c2915.f11294 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2967(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2915 c2915 = new C2915(super.onSaveInstanceState());
        InterfaceC2955 interfaceC2955 = this.f11245;
        c2915.f11294 = interfaceC2955 != null && interfaceC2955.mo7274();
        return c2915;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2952 c2952 = this.f11242;
        if (c2952 == null || !c2952.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC2955 interfaceC2955 = this.f11245;
        if (interfaceC2955 == null) {
            return super.performClick();
        }
        if (interfaceC2955.mo7274()) {
            return true;
        }
        this.f11245.mo7260(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f11240) {
            this.f11243 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC2955 interfaceC2955 = this.f11245;
        if (interfaceC2955 != null) {
            Context context = this.f11239;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C2937 c2937 = new C2937();
            c2937.f11364 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c2937.f11363 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && AbstractC2850.m7153(spinnerAdapter)) {
                AbstractC2894.m7238(AbstractC2850.m7152(spinnerAdapter), theme);
            }
            interfaceC2955.mo7261(c2937);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f11244;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f11244;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC2955 interfaceC2955 = this.f11245;
        if (interfaceC2955 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC2955.mo7259(i);
            interfaceC2955.mo7277(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC2955 interfaceC2955 = this.f11245;
        if (interfaceC2955 != null) {
            interfaceC2955.mo7280(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f11245 != null) {
            this.f11246 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC2955 interfaceC2955 = this.f11245;
        if (interfaceC2955 != null) {
            interfaceC2955.mo7278(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ٴˎ.ˏᵢ(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC2955 interfaceC2955 = this.f11245;
        if (interfaceC2955 != null) {
            interfaceC2955.mo7262(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f11244;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f11244;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7249(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f11241;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }
}
