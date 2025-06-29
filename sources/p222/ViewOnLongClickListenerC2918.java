package p222;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p004.AbstractC0921;
import p378.AbstractC4345;
import p378.AbstractC4364;

/* renamed from: ˏᴵ.יʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC2918 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static ViewOnLongClickListenerC2918 f11304;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static ViewOnLongClickListenerC2918 f11305;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final CharSequence f11306;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final RunnableC2974 f11307;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C2907 f11308;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f11309;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f11310;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final RunnableC2974 f11311;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final View f11312;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f11313;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f11314;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f11315;

    /* JADX WARN: Type inference failed for: r0v0, types: [ˏᴵ.ﾞי] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ˏᴵ.ﾞי] */
    public ViewOnLongClickListenerC2918(View view, CharSequence charSequence) {
        final int i = 0;
        this.f11311 = new Runnable(this) { // from class: ˏᴵ.ﾞי

            /* renamed from: ˆʿ, reason: contains not printable characters */
            public final /* synthetic */ ViewOnLongClickListenerC2918 f11448;

            {
                this.f11448 = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        this.f11448.m7266(false);
                        break;
                    default:
                        this.f11448.m7267();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f11307 = new Runnable(this) { // from class: ˏᴵ.ﾞי

            /* renamed from: ˆʿ, reason: contains not printable characters */
            public final /* synthetic */ ViewOnLongClickListenerC2918 f11448;

            {
                this.f11448 = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.f11448.m7266(false);
                        break;
                    default:
                        this.f11448.m7267();
                        break;
                }
            }
        };
        this.f11312 = view;
        this.f11306 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC4364.f16866;
        this.f11309 = Build.VERSION.SDK_INT >= 28 ? AbstractC0921.m3764(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f11313 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7265(ViewOnLongClickListenerC2918 viewOnLongClickListenerC2918) {
        ViewOnLongClickListenerC2918 viewOnLongClickListenerC29182 = f11305;
        if (viewOnLongClickListenerC29182 != null) {
            viewOnLongClickListenerC29182.f11312.removeCallbacks(viewOnLongClickListenerC29182.f11311);
        }
        f11305 = viewOnLongClickListenerC2918;
        if (viewOnLongClickListenerC2918 != null) {
            viewOnLongClickListenerC2918.f11312.postDelayed(viewOnLongClickListenerC2918.f11311, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            ˏᴵ.ˏʻ r4 = r3.f11308
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f11310
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f11312
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f11313 = r4
            r3.m7267()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            ˏᴵ.ˏʻ r4 = r3.f11308
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f11313
            if (r1 != 0) goto L66
            int r1 = r3.f11314
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f11309
            if (r1 > r2) goto L66
            int r1 = r3.f11315
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f11314 = r4
            r3.f11315 = r5
            r3.f11313 = r0
            m7265(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.ViewOnLongClickListenerC2918.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f11314 = view.getWidth() / 2;
        this.f11315 = view.getHeight() / 2;
        m7266(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m7267();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7266(boolean z) throws Resources.NotFoundException {
        int height;
        int i;
        String str;
        int i2;
        String str2;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f11312;
        if (view.isAttachedToWindow()) {
            m7265(null);
            ViewOnLongClickListenerC2918 viewOnLongClickListenerC2918 = f11304;
            if (viewOnLongClickListenerC2918 != null) {
                viewOnLongClickListenerC2918.m7267();
            }
            f11304 = this;
            this.f11310 = z;
            C2907 c2907 = new C2907(view.getContext());
            this.f11308 = c2907;
            int width = this.f11314;
            int i3 = this.f11315;
            boolean z2 = this.f11310;
            View view2 = (View) c2907.f11255;
            ViewParent parent = view2.getParent();
            Context context = (Context) c2907.f11258;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c2907.f11257).setText(this.f11306);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c2907.f11261;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen._2_res_0x7f07047f);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen._2_res_0x7f07047e);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen._2_res_0x7f070482 : R.dimen._2_res_0x7f070481);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                str2 = "window";
            } else {
                Rect rect = (Rect) c2907.f11256;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c2907.f11260;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c2907.f11259;
                view.getLocationOnScreen(iArr2);
                int i4 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i4;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i5 = iArr2[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= rect.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f11310) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC2974 runnableC2974 = this.f11307;
            view.removeCallbacks(runnableC2974);
            view.postDelayed(runnableC2974, j2);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7267() {
        ViewOnLongClickListenerC2918 viewOnLongClickListenerC2918 = f11304;
        View view = this.f11312;
        if (viewOnLongClickListenerC2918 == this) {
            f11304 = null;
            C2907 c2907 = this.f11308;
            if (c2907 != null) {
                View view2 = (View) c2907.f11255;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c2907.f11258).getSystemService("window")).removeView(view2);
                }
                this.f11308 = null;
                this.f11313 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f11305 == this) {
            m7265(null);
        }
        view.removeCallbacks(this.f11307);
    }
}
