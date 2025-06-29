package p063;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import p329.AbstractC3740;

/* renamed from: ʾᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1457 extends Drawable implements InterfaceC1452, Animatable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f5959;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f5961;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f5962;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public Paint f5963;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f5964;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1453 f5965;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public Rect f5966;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f5967;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f5960 = true;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f5968 = -1;

    public C1457(C1453 c1453) {
        AbstractC3740.m8706(c1453, "Argument must not be null");
        this.f5965 = c1453;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f5964) {
            return;
        }
        if (this.f5961) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f5966 == null) {
                this.f5966 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f5966);
            this.f5961 = false;
        }
        C1448 c1448 = (C1448) this.f5965.f5948;
        C1456 c1456 = c1448.f5940;
        Bitmap bitmap = c1456 != null ? c1456.f5958 : c1448.f5928;
        if (this.f5966 == null) {
            this.f5966 = new Rect();
        }
        Rect rect = this.f5966;
        if (this.f5963 == null) {
            this.f5963 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f5963);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5965;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C1448) this.f5965.f5948).f5934;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C1448) this.f5965.f5948).f5931;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f5959;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5961 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f5963 == null) {
            this.f5963 = new Paint(2);
        }
        this.f5963.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5963 == null) {
            this.f5963 = new Paint(2);
        }
        this.f5963.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC3740.m8707("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f5964);
        this.f5960 = z;
        if (!z) {
            this.f5959 = false;
            C1448 c1448 = (C1448) this.f5965.f5948;
            ArrayList arrayList = c1448.f5933;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c1448.f5936 = false;
            }
        } else if (this.f5962) {
            m5012();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f5962 = true;
        this.f5967 = 0;
        if (this.f5960) {
            m5012();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f5962 = false;
        this.f5959 = false;
        C1448 c1448 = (C1448) this.f5965.f5948;
        ArrayList arrayList = c1448.f5933;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c1448.f5936 = false;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5012() {
        AbstractC3740.m8707("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f5964);
        C1448 c1448 = (C1448) this.f5965.f5948;
        if (c1448.f5935.f9280.f9256 == 1) {
            invalidateSelf();
            return;
        }
        if (this.f5959) {
            return;
        }
        this.f5959 = true;
        if (c1448.f5927) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c1448.f5933;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c1448.f5936) {
            c1448.f5936 = true;
            c1448.f5927 = false;
            c1448.m5006();
        }
        invalidateSelf();
    }
}
