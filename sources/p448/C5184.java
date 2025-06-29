package p448;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import p061.InterpolatorC1381;
import p378.AbstractC4345;
import p413.RunnableC4710;
import ˈⁱ.ˉⁱ;

/* renamed from: ﾞˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5184 {

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static final InterpolatorC1381 f19956 = new InterpolatorC1381(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f19957;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float[] f19958;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int[] f19960;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public VelocityTracker f19961;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final float f19962;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public View f19963;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f19964;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int f19965;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int[] f19966;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final OverScroller f19968;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f19969;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float[] f19970;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float[] f19971;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final float f19972;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f19973;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final ˉⁱ f19974;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final CoordinatorLayout f19975;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float[] f19976;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int[] f19977;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f19967 = -1;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final RunnableC4710 f19959 = new RunnableC4710(2, this);

    public C5184(Context context, CoordinatorLayout coordinatorLayout, ˉⁱ r5) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (r5 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f19975 = coordinatorLayout;
        this.f19974 = r5;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f19965 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f19957 = viewConfiguration.getScaledTouchSlop();
        this.f19962 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19972 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f19968 = new OverScroller(context, f19956);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11566(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f19975;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f19963 = view;
        this.f19967 = i;
        this.f19974.ᵎـ(view, i);
        m11579(1);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m11567(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f19975.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m11568(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m11576();
        }
        if (this.f19961 == null) {
            this.f19961 = VelocityTracker.obtain();
        }
        this.f19961.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM11578 = m11578((int) x, (int) y);
            m11569(x, y, pointerId);
            m11580(viewM11578, pointerId);
            int i3 = this.f19966[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f19969 == 1) {
                m11571();
            }
            m11576();
            return;
        }
        ˉⁱ r5 = this.f19974;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f19969 == 1) {
                    this.f19973 = true;
                    r5.ﹳˎ(this.f19963, 0.0f, 0.0f);
                    this.f19973 = false;
                    if (this.f19969 == 1) {
                        m11579(0);
                    }
                }
                m11576();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m11569(x2, y2, pointerId2);
                if (this.f19969 == 0) {
                    m11580(m11578((int) x2, (int) y2), pointerId2);
                    int i4 = this.f19966[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f19963;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m11580(this.f19963, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f19969 == 1 && pointerId3 == this.f19967) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f19967) {
                        View viewM115782 = m11578((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f19963;
                        if (viewM115782 == view2 && m11580(view2, pointerId4)) {
                            i = this.f19967;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m11571();
                }
            }
            m11581(pointerId3);
            return;
        }
        if (this.f19969 == 1) {
            if (m11582(this.f19967)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f19967);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f19970;
                int i7 = this.f19967;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f19971[i7]);
                int left = this.f19963.getLeft() + i8;
                int top = this.f19963.getTop() + i9;
                int left2 = this.f19963.getLeft();
                int top2 = this.f19963.getTop();
                if (i8 != 0) {
                    left = r5.ˑʽ(this.f19963, left);
                    AbstractC4345.m9876(this.f19963, left - left2);
                }
                if (i9 != 0) {
                    top = r5.ﹳﹳ(this.f19963, top);
                    AbstractC4345.m9880(this.f19963, top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    r5.ᵎˏ(this.f19963, left, top);
                }
                m11570(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m11582(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f19976[pointerId5];
                float f2 = y4 - this.f19958[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f19966[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f19966[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f19966[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f19966[pointerId5];
                if (this.f19969 != 1) {
                    View viewM115783 = m11578((int) x4, (int) y4);
                    if (m11574(viewM115783, f, f2) && m11580(viewM115783, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m11570(motionEvent);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m11569(float f, float f2, int i) {
        float[] fArr = this.f19976;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f19958;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f19970;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f19971;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f19966;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f19977;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f19960;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f19976 = fArr2;
            this.f19958 = fArr3;
            this.f19970 = fArr4;
            this.f19971 = fArr5;
            this.f19966 = iArr;
            this.f19977 = iArr2;
            this.f19960 = iArr3;
        }
        float[] fArr9 = this.f19976;
        this.f19970[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f19958;
        this.f19971[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f19966;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f19975;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f19965;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f19964 |= 1 << i;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m11570(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m11582(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f19970[pointerId] = x;
                this.f19971[pointerId] = y;
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m11571() {
        VelocityTracker velocityTracker = this.f19961;
        float f = this.f19962;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f19961.getXVelocity(this.f19967);
        float f2 = this.f19972;
        float fAbs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f19961.getYVelocity(this.f19967);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f2) {
            if (fAbs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.f19973 = true;
        this.f19974.ﹳˎ(this.f19963, xVelocity, f3);
        this.f19973 = false;
        if (this.f19969 == 1) {
            m11579(0);
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m11572(int i, int i2) {
        if (this.f19973) {
            return m11573(i, i2, (int) this.f19961.getXVelocity(this.f19967), (int) this.f19961.getYVelocity(this.f19967));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m11573(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f19963.getLeft();
        int top = this.f19963.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f19968;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m11579(0);
            return false;
        }
        View view = this.f19963;
        int i7 = (int) this.f19972;
        int i8 = (int) this.f19962;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        ˉⁱ r6 = this.f19974;
        overScroller.startScroll(left, top, i5, i6, (int) ((m11567(i6, i4, r6.ᴵʿ()) * f6) + (m11567(i5, i3, r6.ˋⁱ(view)) * f5)));
        m11579(2);
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m11574(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        ˉⁱ r1 = this.f19974;
        boolean z = r1.ˋⁱ(view) > 0;
        boolean z2 = r1.ᴵʿ() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f19957) : z2 && Math.abs(f2) > ((float) this.f19957);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f19957;
        return f3 > ((float) (i * i));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* renamed from: ˑי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11575(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p448.C5184.m11575(android.view.MotionEvent):boolean");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11576() {
        this.f19967 = -1;
        float[] fArr = this.f19976;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f19958, 0.0f);
            Arrays.fill(this.f19970, 0.0f);
            Arrays.fill(this.f19971, 0.0f);
            Arrays.fill(this.f19966, 0);
            Arrays.fill(this.f19977, 0);
            Arrays.fill(this.f19960, 0);
            this.f19964 = 0;
        }
        VelocityTracker velocityTracker = this.f19961;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19961 = null;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m11577() {
        if (this.f19969 == 2) {
            OverScroller overScroller = this.f19968;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f19963.getLeft();
            int top = currY - this.f19963.getTop();
            if (left != 0) {
                AbstractC4345.m9876(this.f19963, left);
            }
            if (top != 0) {
                AbstractC4345.m9880(this.f19963, top);
            }
            if (left != 0 || top != 0) {
                this.f19974.ᵎˏ(this.f19963, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f19975.post(this.f19959);
            }
        }
        return this.f19969 == 2;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final View m11578(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f19975;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f19974.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m11579(int i) {
        this.f19975.removeCallbacks(this.f19959);
        if (this.f19969 != i) {
            this.f19969 = i;
            this.f19974.ˎٴ(i);
            if (this.f19969 == 0) {
                this.f19963 = null;
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final boolean m11580(View view, int i) {
        if (view == this.f19963 && this.f19967 == i) {
            return true;
        }
        if (view == null || !this.f19974.ᐧˋ(view, i)) {
            return false;
        }
        this.f19967 = i;
        m11566(view, i);
        return true;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m11581(int i) {
        float[] fArr = this.f19976;
        if (fArr != null) {
            int i2 = this.f19964;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f19958[i] = 0.0f;
                this.f19970[i] = 0.0f;
                this.f19971[i] = 0.0f;
                this.f19966[i] = 0;
                this.f19977[i] = 0;
                this.f19960[i] = 0;
                this.f19964 = (~i3) & i2;
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m11582(int i) {
        if ((this.f19964 & (1 << i)) != 0) {
            return true;
        }
        String str = "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.";
        return false;
    }
}
