package p222;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p149.C2280;
import p300.AbstractC3505;
import p320.InterfaceC3653;
import ˈⁱ.ﹳﹳ;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᴵ.ᵢﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2959 implements InterfaceC3653 {

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static final Method f11402;

    /* renamed from: יˋ, reason: contains not printable characters */
    public static final Method f11403;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public static final Method f11404;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f11407;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ListAdapter f11408;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final C2965 f11410;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final Handler f11411;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C2882 f11414;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f11415;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C2943 f11416;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f11418;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f11420;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f11421;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public Rect f11422;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public AdapterView.OnItemSelectedListener f11425;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f11426;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public View f11427;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f11428;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f11430;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f11419 = -2;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f11409 = -2;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f11412 = 1002;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f11406 = 0;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final int f11417 = Integer.MAX_VALUE;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final RunnableC2865 f11405 = new RunnableC2865(this, 1);

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final ViewOnTouchListenerC2948 f11424 = new ViewOnTouchListenerC2948(this);

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final C2968 f11423 = new C2968(this);

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final RunnableC2865 f11429 = new RunnableC2865(this, 0);

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final Rect f11413 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f11404 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f11403 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f11402 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C2959(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f11420 = context;
        this.f11411 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13583, i, 0);
        this.f11426 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f11428 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11418 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2965 c2965 = new C2965(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13592, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            ﹳﹳ.ˑⁱ(c2965, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c2965.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : ٴˎ.ˏᵢ(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f11410 = c2965;
        c2965.setInputMethodMode(1);
    }

    @Override // p320.InterfaceC3653
    public final void dismiss() {
        C2965 c2965 = this.f11410;
        c2965.dismiss();
        c2965.setContentView(null);
        this.f11414 = null;
        this.f11411.removeCallbacks(this.f11405);
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo7318() {
        return this.f11410.isShowing();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Drawable m7319() {
        return this.f11410.getBackground();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m7320() {
        if (this.f11418) {
            return this.f11428;
        }
        return 0;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m7321(int i) {
        this.f11426 = i;
    }

    /* renamed from: ˏᴵ */
    public void mo7261(ListAdapter listAdapter) {
        C2943 c2943 = this.f11416;
        if (c2943 == null) {
            this.f11416 = new C2943(this);
        } else {
            ListAdapter listAdapter2 = this.f11408;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2943);
            }
        }
        this.f11408 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f11416);
        }
        C2882 c2882 = this.f11414;
        if (c2882 != null) {
            c2882.setAdapter(this.f11408);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m7322(Drawable drawable) {
        this.f11410.setBackgroundDrawable(drawable);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m7323() {
        return this.f11426;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m7324(int i) {
        Drawable background = this.f11410.getBackground();
        if (background == null) {
            this.f11409 = i;
            return;
        }
        Rect rect = this.f11413;
        background.getPadding(rect);
        this.f11409 = rect.left + rect.right + i;
    }

    /* renamed from: ـﹶ */
    public C2882 mo7270(Context context, boolean z) {
        return new C2882(context, z);
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C2882 mo7325() {
        return this.f11414;
    }

    @Override // p320.InterfaceC3653
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo7326() {
        int i;
        int iM7295;
        int paddingBottom;
        C2882 c2882;
        int i2 = 1;
        C2882 c28822 = this.f11414;
        C2965 c2965 = this.f11410;
        Context context = this.f11420;
        if (c28822 == null) {
            C2882 c2882Mo7270 = mo7270(context, !this.f11407);
            this.f11414 = c2882Mo7270;
            c2882Mo7270.setAdapter(this.f11408);
            this.f11414.setOnItemClickListener(this.f11415);
            this.f11414.setFocusable(true);
            this.f11414.setFocusableInTouchMode(true);
            this.f11414.setOnItemSelectedListener(new C2280(i2, this));
            this.f11414.setOnScrollListener(this.f11423);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f11425;
            if (onItemSelectedListener != null) {
                this.f11414.setOnItemSelectedListener(onItemSelectedListener);
            }
            c2965.setContentView(this.f11414);
        }
        Drawable background = c2965.getBackground();
        Rect rect = this.f11413;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.f11418) {
                this.f11428 = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = c2965.getInputMethodMode() == 2;
        View view = this.f11427;
        int i4 = this.f11428;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f11402;
            if (method != null) {
                try {
                    iM7295 = ((Integer) method.invoke(c2965, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            } else {
                iM7295 = c2965.getMaxAvailableHeight(view, i4);
            }
        } else {
            iM7295 = AbstractC2935.m7295(c2965, view, i4, z);
        }
        int i5 = this.f11419;
        if (i5 == -1) {
            paddingBottom = iM7295 + i;
        } else {
            int i6 = this.f11409;
            int iM7203 = this.f11414.m7203(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM7295);
            paddingBottom = iM7203 + (iM7203 > 0 ? this.f11414.getPaddingBottom() + this.f11414.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f11410.getInputMethodMode() == 2;
        ﹳﹳ.ˎᵔ(c2965, this.f11412);
        if (c2965.isShowing()) {
            if (this.f11427.isAttachedToWindow()) {
                int width = this.f11409;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f11427.getWidth();
                }
                if (i5 == -1) {
                    i5 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c2965.setWidth(this.f11409 == -1 ? -1 : 0);
                        c2965.setHeight(0);
                    } else {
                        c2965.setWidth(this.f11409 == -1 ? -1 : 0);
                        c2965.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                c2965.setOutsideTouchable(true);
                c2965.update(this.f11427, this.f11426, this.f11428, width < 0 ? -1 : width, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int width2 = this.f11409;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f11427.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        c2965.setWidth(width2);
        c2965.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f11404;
            if (method2 != null) {
                try {
                    method2.invoke(c2965, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC2970.m7342(c2965, true);
        }
        c2965.setOutsideTouchable(true);
        c2965.setTouchInterceptor(this.f11424);
        if (this.f11430) {
            ﹳﹳ.ˑⁱ(c2965, this.f11421);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f11403;
            if (method3 != null) {
                try {
                    method3.invoke(c2965, this.f11422);
                } catch (Exception e) {
                }
            }
        } else {
            AbstractC2970.m7343(c2965, this.f11422);
        }
        c2965.showAsDropDown(this.f11427, this.f11426, this.f11428, this.f11406);
        this.f11414.setSelection(-1);
        if ((!this.f11407 || this.f11414.isInTouchMode()) && (c2882 = this.f11414) != null) {
            c2882.setListSelectionHidden(true);
            c2882.requestLayout();
        }
        if (this.f11407) {
            return;
        }
        this.f11411.post(this.f11429);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m7327(int i) {
        this.f11428 = i;
        this.f11418 = true;
    }
}
