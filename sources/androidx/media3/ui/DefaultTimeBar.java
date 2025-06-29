package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.RunnableC0246;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p272.AbstractC3337;
import p272.C3322;
import p272.InterfaceC3317;
import p272.InterfaceC3318;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements InterfaceC3317 {

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static final /* synthetic */ int f1453 = 0;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public long f1454;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final int f1455;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public long f1456;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public Rect f1457;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Drawable f1458;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int f1459;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f1460;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Rect f1461;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final RectF f1462;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public final int f1463;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f1464;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final Point f1465;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final Formatter f1466;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public float f1467;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Paint f1468;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final RunnableC0246 f1469;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public int f1470;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Rect f1471;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final int f1472;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public boolean f1473;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public long f1474;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int f1475;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f1476;

    /* renamed from: יˋ, reason: contains not printable characters */
    public long f1477;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Paint f1478;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public boolean f1479;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final ValueAnimator f1480;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public float f1481;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public long f1482;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final RectF f1483;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Rect f1484;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Paint f1485;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public long f1486;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public boolean f1487;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public boolean f1488;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final int f1489;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final int f1490;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final int f1491;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Paint f1492;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f1493;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final float f1494;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public long f1495;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Paint f1496;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final StringBuilder f1497;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final Paint f1498;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public long f1499;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2, int i) {
        super(context, attributeSet, 0);
        this.f1467 = 1.0f;
        this.f1459 = -1;
        this.f1463 = -10066330;
        this.f1484 = new Rect();
        this.f1461 = new Rect();
        this.f1471 = new Rect();
        this.f1483 = new RectF();
        this.f1462 = new RectF();
        Paint paint = new Paint();
        this.f1492 = paint;
        Paint paint2 = new Paint();
        this.f1496 = paint2;
        Paint paint3 = new Paint();
        this.f1468 = paint3;
        Paint paint4 = new Paint();
        this.f1478 = paint4;
        Paint paint5 = new Paint();
        this.f1485 = paint5;
        Paint paint6 = new Paint();
        this.f1498 = paint6;
        paint6.setAntiAlias(true);
        this.f1460 = new CopyOnWriteArraySet();
        this.f1465 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f1494 = f;
        this.f1489 = m1150(-50, f);
        int iM1150 = m1150(3, f);
        int iM11502 = m1150(26, f);
        int iM11503 = m1150(4, f);
        int iM11504 = m1150(9, f);
        int iM11505 = m1150(0, f);
        int iM11506 = m1150(16, f);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, AbstractC3337.f13029, 0, i);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f1458 = drawable;
                if (drawable != null) {
                    int i2 = AbstractC4470.f17202;
                    if (i2 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i2 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iM11502 = Math.max(drawable.getMinimumHeight(), iM11502);
                }
                this.f1476 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM1150);
                this.f1475 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM11502);
                this.f1493 = typedArrayObtainStyledAttributes.getInt(2, 0);
                typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM11503);
                this.f1472 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM11504);
                this.f1491 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM11505);
                this.f1455 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM11506);
                int i3 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(13, -10066330);
                this.f1463 = i6;
                int i7 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f1476 = iM1150;
            this.f1475 = iM11502;
            this.f1493 = 0;
            this.f1472 = iM11504;
            this.f1491 = iM11505;
            this.f1455 = iM11506;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(-10066330);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f1458 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f1497 = sb;
        this.f1466 = new Formatter(sb, Locale.getDefault());
        this.f1469 = new RunnableC0246(14, this);
        Drawable drawable2 = this.f1458;
        if (drawable2 != null) {
            this.f1490 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f1490 = (Math.max(this.f1491, Math.max(this.f1472, this.f1455)) + 1) / 2;
        }
        this.f1481 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1480 = valueAnimator;
        valueAnimator.addUpdateListener(new C3322(this, 1));
        this.f1495 = -9223372036854775807L;
        this.f1477 = -9223372036854775807L;
        this.f1456 = -9223372036854775807L;
        this.f1470 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private String getProgressText() {
        return AbstractC4470.m10169(this.f1497, this.f1466, this.f1499);
    }

    private long getScrubberPosition() {
        if (this.f1461.width() <= 0 || this.f1495 == -9223372036854775807L) {
            return 0L;
        }
        return ((long) (this.f1483.width() * this.f1495)) / r0.width();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m1150(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1458;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // p272.InterfaceC3317
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f1461.width() / this.f1494);
        if (iWidth != 0) {
            long j = this.f1495;
            if (j != 0 && j != -9223372036854775807L) {
                return j / iWidth;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1458;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new C3322(this, 0));
        duration.start();
        if (z) {
            return;
        }
        m1156(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f1495 <= 0) {
            return;
        }
        if (AbstractC4470.f17202 >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L41
            r0 = 66
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L39
            switch(r4) {
                case 19: goto L25;
                case 20: goto L10;
                case 21: goto L10;
                case 22: goto L25;
                case 23: goto L39;
                default: goto Lf;
            }
        Lf:
            goto L41
        L10:
            r0 = 20
            if (r4 != r0) goto L19
            boolean r0 = r3.f1487
            if (r0 != 0) goto L19
            goto L41
        L19:
            long r0 = r3.m1151(r2)
            long r0 = -r0
            boolean r0 = r3.m1154(r0)
            if (r0 == 0) goto L41
            return r2
        L25:
            r0 = 19
            if (r4 != r0) goto L2e
            boolean r0 = r3.f1473
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            long r0 = r3.m1151(r1)
            boolean r0 = r3.m1154(r0)
            if (r0 == 0) goto L41
            return r2
        L39:
            boolean r0 = r3.f1488
            if (r0 == 0) goto L41
            r3.m1156(r1)
            return r2
        L41:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!isEnabled() || !this.f1488 || (i != 21 && i != 22 && ((i != 20 || !this.f1487) && (i != 19 || !this.f1473)))) {
            return super.onKeyUp(i, keyEvent);
        }
        m1153();
        return true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f1479 ? 0 : this.f1490;
        int i8 = this.f1493;
        int i9 = this.f1475;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i9;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i10 = this.f1476;
            iMax = (paddingBottom2 - i10) - Math.max(i7 - (i10 / 2), 0);
        } else {
            paddingBottom = (i6 - i9) / 2;
            iMax = (i6 - this.f1476) / 2;
        }
        Rect rect2 = this.f1484;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i9 + paddingBottom);
        this.f1461.set(rect2.left + i7, iMax, rect2.right - i7, this.f1476 + iMax);
        if (AbstractC4470.f17202 >= 29 && ((rect = this.f1457) == null || rect.width() != i5 || this.f1457.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f1457 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m1158();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f1475;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f1458;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f1458;
        if (drawable == null || AbstractC4470.f17202 < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.isEnabled()
            r1 = 0
            if (r0 == 0) goto Lc0
            long r2 = r14.f1495
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto Lc0
        L11:
            android.graphics.Point r0 = r14.f1465
            float r2 = r15.getX()
            int r2 = (int) r2
            float r3 = r15.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r15.getAction()
            android.graphics.Rect r4 = r14.f1461
            android.graphics.RectF r5 = r14.f1483
            r6 = 1
            if (r3 == 0) goto L9a
            r7 = 3
            if (r3 == r6) goto L8b
            r8 = 2
            if (r3 == r8) goto L39
            if (r3 == r7) goto L8b
            goto Lc0
        L39:
            boolean r15 = r14.f1488
            if (r15 == 0) goto Lc0
            int r15 = r14.f1489
            if (r0 >= r15) goto L54
            int r15 = r14.f1464
            int r2 = r2 - r15
            int r2 = r2 / r7
            int r2 = r2 + r15
            float r15 = (float) r2
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.right
            float r1 = (float) r1
            float r15 = p383.AbstractC4470.m10214(r15, r0, r1)
            r5.right = r15
            goto L63
        L54:
            r14.f1464 = r2
            float r15 = (float) r2
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.right
            float r1 = (float) r1
            float r15 = p383.AbstractC4470.m10214(r15, r0, r1)
            r5.right = r15
        L63:
            long r0 = r14.getScrubberPosition()
            r14.f1474 = r0
            java.util.concurrent.CopyOnWriteArraySet r15 = r14.f1460
            java.util.Iterator r15 = r15.iterator()
        L6f:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r15.next()
            r7 = r2
            ـᐧ.ˑﾞ r7 = (p272.InterfaceC3318) r7
            r12 = 0
            r8 = r0
            r10 = r0
            r7.mo8110(r8, r10, r12)
            goto L6f
        L84:
            r14.m1158()
            r14.invalidate()
            return r6
        L8b:
            boolean r0 = r14.f1488
            if (r0 == 0) goto Lc0
            int r15 = r15.getAction()
            if (r15 != r7) goto L96
            r1 = 1
        L96:
            r14.m1156(r1)
            return r6
        L9a:
            float r15 = (float) r2
            float r0 = (float) r0
            int r2 = (int) r15
            int r0 = (int) r0
            android.graphics.Rect r3 = r14.f1484
            boolean r0 = r3.contains(r2, r0)
            if (r0 == 0) goto Lc0
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.right
            float r1 = (float) r1
            float r15 = p383.AbstractC4470.m10214(r15, r0, r1)
            r5.right = r15
            long r0 = r14.getScrubberPosition()
            r14.m1155(r0)
            r14.m1158()
            r14.invalidate()
            return r6
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f1495 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m1157(-m1151(true))) {
                m1156(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m1157(m1151(false))) {
                m1156(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f1478.setColor(i);
        invalidate(this.f1484);
    }

    public void setBufferedColor(int i) {
        this.f1496.setColor(i);
        invalidate(this.f1484);
    }

    @Override // p272.InterfaceC3317
    public void setBufferedPosition(long j) {
        if (this.f1482 == j) {
            return;
        }
        this.f1482 = j;
        m1158();
    }

    @Override // p272.InterfaceC3317
    public void setDuration(long j) {
        if (this.f1495 == j) {
            return;
        }
        this.f1495 = j;
        if (j == -9223372036854775807L) {
            m1156(true);
        }
        if (this.f1488) {
            return;
        }
        m1158();
    }

    @Override // android.view.View, p272.InterfaceC3317
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m1156(true);
    }

    public void setKeyCountIncrement(int i) {
        AbstractC4464.m10142(i > 0);
        this.f1470 = i;
        this.f1477 = -9223372036854775807L;
        this.f1456 = -9223372036854775807L;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f1485.setColor(i);
        invalidate(this.f1484);
    }

    public void setPlayedColor(int i) {
        this.f1492.setColor(i);
        invalidate(this.f1484);
    }

    public void setScrubPosition(long j) {
        if (this.f1488) {
            this.f1474 = j;
            m1158();
        }
    }

    public void setScrubberColor(int i) {
        this.f1459 = i;
        if (isEnabled()) {
            this.f1498.setColor(i);
            invalidate(this.f1484);
        }
    }

    public void setScrubbingWithDownEnabled(boolean z) {
        this.f1487 = z;
    }

    public void setScrubbingWithUpEnabled(boolean z) {
        this.f1473 = z;
    }

    public void setUnplayedColor(int i) {
        this.f1468.setColor(i);
        invalidate(this.f1484);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long m1151(boolean z) {
        long j = z ? this.f1477 : this.f1456;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f1495;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.f1470;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m1152(long j, long j2) {
        if (this.f1499 == j && this.f1454 == j2) {
            return;
        }
        this.f1499 = j;
        this.f1454 = j2;
        setContentDescription(getProgressText());
        m1158();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m1153() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f1486 > jCurrentTimeMillis) {
            this.f1486 = 0L;
        }
        if (jCurrentTimeMillis - this.f1486 > 550) {
            m1156(false);
        }
        this.f1486 = jCurrentTimeMillis;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m1154(long j) {
        if (!m1157(j)) {
            return false;
        }
        RunnableC0246 runnableC0246 = this.f1469;
        removeCallbacks(runnableC0246);
        postDelayed(runnableC0246, 550L);
        return true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m1155(long j) {
        if (this.f1488) {
            return;
        }
        this.f1488 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f1460.iterator();
        while (it.hasNext()) {
            ((InterfaceC3318) it.next()).mo8109(j);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m1156(boolean z) {
        if (this.f1488) {
            this.f1488 = false;
            removeCallbacks(this.f1469);
            setPressed(false);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            invalidate();
            Iterator it = this.f1460.iterator();
            while (it.hasNext()) {
                ((InterfaceC3318) it.next()).mo8111(z, this.f1474);
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m1157(long j) {
        long jMin = this.f1495;
        if (jMin <= 0) {
            return false;
        }
        long j2 = this.f1488 ? this.f1474 : this.f1499;
        long j3 = j2 + j;
        long j4 = this.f1454;
        if (j4 > 0) {
            jMin = Math.min(j4, jMin);
        }
        long jM10184 = AbstractC4470.m10184(j3, 0L, jMin);
        if (jM10184 == j2 && j3 >= 0) {
            return false;
        }
        m1155(jM10184);
        this.f1474 = jM10184;
        Iterator it = this.f1460.iterator();
        while (it.hasNext()) {
            ((InterfaceC3318) it.next()).mo8110(j3, jM10184, j);
        }
        m1158();
        return true;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m1158() {
        Rect rect = this.f1471;
        Rect rect2 = this.f1461;
        rect.set(rect2);
        RectF rectF = this.f1483;
        rectF.set(rect2);
        RectF rectF2 = this.f1462;
        rectF2.set(rect2);
        if (this.f1495 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f1482) / this.f1495)), rect2.right);
            rectF.right = Math.min(rect2.left + (((this.f1488 ? this.f1474 : this.f1499) / this.f1495) * rect2.width()), rect2.right);
            rectF2.right = Math.min(rect2.left + ((this.f1454 / this.f1495) * rect2.width()), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            float f = i;
            rectF.right = f;
            rectF2.right = f;
        }
        invalidate(this.f1484);
    }
}
