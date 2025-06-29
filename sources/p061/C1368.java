package p061;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.leanback.widget.RunnableC0183;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p378.AbstractC4345;

/* renamed from: ʾـ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1368 extends AbstractC1360 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final int[] f5553 = {R.attr.state_pressed};

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final int[] f5554 = new int[0];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f5555;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f5556;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public int f5558;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f5559;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f5560;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public float f5562;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f5564;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f5565;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Drawable f5566;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final StateListDrawable f5567;

    /* renamed from: ˑי, reason: contains not printable characters */
    public float f5568;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f5570;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f5571;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final StateListDrawable f5572;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final RunnableC0183 f5573;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f5574;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final RecyclerView f5575;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final ValueAnimator f5578;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Drawable f5579;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f5580;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f5576 = 0;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f5563 = 0;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f5577 = false;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f5557 = false;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f5561 = 0;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public int f5582 = 0;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int[] f5581 = new int[2];

    /* renamed from: יʻ, reason: contains not printable characters */
    public final int[] f5569 = new int[2];

    public C1368(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5578 = valueAnimatorOfFloat;
        this.f5558 = 0;
        RunnableC0183 runnableC0183 = new RunnableC0183(5, this);
        this.f5573 = runnableC0183;
        AbstractC1413 abstractC1413 = new ˆʿ(0, this);
        this.f5567 = stateListDrawable;
        this.f5579 = drawable;
        this.f5572 = stateListDrawable2;
        this.f5566 = drawable2;
        this.f5556 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5571 = Math.max(i, drawable.getIntrinsicWidth());
        this.f5580 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5559 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5570 = i2;
        this.f5555 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new ˎˑ(this));
        valueAnimatorOfFloat.addUpdateListener(new C1405(0 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f5575;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC1402 abstractC1402 = recyclerView2.f1683;
            if (abstractC1402 != null) {
                abstractC1402.mo1250("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1708;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1280();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f5575;
            recyclerView3.f1650.remove(this);
            if (recyclerView3.f1706 == this) {
                recyclerView3.f1706 = null;
            }
            ArrayList arrayList2 = this.f5575.f1710;
            if (arrayList2 != null) {
                arrayList2.remove(abstractC1413);
            }
            this.f5575.removeCallbacks(runnableC0183);
        }
        this.f5575 = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1327(this);
            this.f5575.f1650.add(this);
            this.f5575.m1289(abstractC1413);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m4742(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m4743(float f, float f2) {
        RecyclerView recyclerView = this.f5575;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.f5556;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f5576 - i) {
            return false;
        }
        int i2 = this.f5560;
        int i3 = this.f5564 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m4744() {
        int i = this.f5558;
        ValueAnimator valueAnimator = this.f5578;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f5558 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p061.AbstractC1360
    /* renamed from: ˑʽ */
    public final void mo4727(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f5576;
        RecyclerView recyclerView2 = this.f5575;
        if (i != recyclerView2.getWidth() || this.f5563 != recyclerView2.getHeight()) {
            this.f5576 = recyclerView2.getWidth();
            this.f5563 = recyclerView2.getHeight();
            m4745(0);
            return;
        }
        if (this.f5558 != 0) {
            if (this.f5577) {
                int i2 = this.f5576;
                int i3 = this.f5556;
                int i4 = i2 - i3;
                int i5 = this.f5560;
                int i6 = this.f5564;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f5567;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f5563;
                int i9 = this.f5571;
                Drawable drawable = this.f5579;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f5557) {
                int i10 = this.f5563;
                int i11 = this.f5580;
                int i12 = i10 - i11;
                int i13 = this.f5565;
                int i14 = this.f5574;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f5572;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f5576;
                int i17 = this.f5559;
                Drawable drawable2 = this.f5566;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4745(int i) {
        RunnableC0183 runnableC0183 = this.f5573;
        StateListDrawable stateListDrawable = this.f5567;
        if (i == 2 && this.f5561 != 2) {
            stateListDrawable.setState(f5553);
            this.f5575.removeCallbacks(runnableC0183);
        }
        if (i == 0) {
            this.f5575.invalidate();
        } else {
            m4744();
        }
        if (this.f5561 == 2 && i != 2) {
            stateListDrawable.setState(f5554);
            this.f5575.removeCallbacks(runnableC0183);
            this.f5575.postDelayed(runnableC0183, 1200);
        } else if (i == 1) {
            this.f5575.removeCallbacks(runnableC0183);
            this.f5575.postDelayed(runnableC0183, 1500);
        }
        this.f5561 = i;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m4746(float f, float f2) {
        if (f2 >= this.f5563 - this.f5580) {
            int i = this.f5565;
            int i2 = this.f5574;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }
}
