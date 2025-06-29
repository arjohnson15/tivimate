package p142;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.leanback.widget.RunnableC0183;
import p131.C2068;
import ˆˑ.ﹳﹳ;

/* renamed from: ˉי.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2224 extends Drawable implements Drawable.Callback {

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static final /* synthetic */ int f8837 = 0;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public C2068 f8838;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Rect f8839;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f8840;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f8841;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Drawable f8842;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public RunnableC0183 f8843;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Drawable f8844;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C2220 f8845;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public long f8846;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f8847;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f8848;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public long f8849;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        C2220 c2220 = this.f8845;
        if (theme == null) {
            c2220.getClass();
            return;
        }
        c2220.m6192();
        int i = c2220.f8805;
        Drawable[] drawableArr = c2220.f8812;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                c2220.f8791 |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c2220.f8790 = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = c2220.f8806;
            c2220.f8806 = i3;
            if (i4 != i3) {
                c2220.f8800 = false;
                c2220.f8796 = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f8845.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f8842;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f8844;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8840;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f8845.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        C2220 c2220 = this.f8845;
        if (!c2220.f8792) {
            c2220.m6192();
            c2220.f8792 = true;
            int i = c2220.f8805;
            Drawable[] drawableArr = c2220.f8812;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    c2220.f8799 = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    c2220.f8799 = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = c2220.f8799;
        }
        if (!z) {
            return null;
        }
        this.f8845.f8821 = getChangingConfigurations();
        return this.f8845;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f8842;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f8839;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C2220 c2220 = this.f8845;
        if (c2220.f8797) {
            if (!c2220.f8800) {
                c2220.m6190();
            }
            return c2220.f8804;
        }
        Drawable drawable = this.f8842;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C2220 c2220 = this.f8845;
        if (c2220.f8797) {
            if (!c2220.f8800) {
                c2220.m6190();
            }
            return c2220.f8815;
        }
        Drawable drawable = this.f8842;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C2220 c2220 = this.f8845;
        if (c2220.f8797) {
            if (!c2220.f8800) {
                c2220.m6190();
            }
            return c2220.f8817;
        }
        Drawable drawable = this.f8842;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C2220 c2220 = this.f8845;
        if (c2220.f8797) {
            if (!c2220.f8800) {
                c2220.m6190();
            }
            return c2220.f8807;
        }
        Drawable drawable = this.f8842;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f8842;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C2220 c2220 = this.f8845;
        if (c2220.f8802) {
            return c2220.f8816;
        }
        c2220.m6192();
        int i = c2220.f8805;
        Drawable[] drawableArr = c2220.f8812;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        c2220.f8816 = opacity;
        c2220.f8802 = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f8842;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C2220 c2220 = this.f8845;
        boolean padding = false;
        Rect rect2 = null;
        if (!c2220.f8823) {
            Rect rect3 = c2220.f8803;
            if (rect3 != null || c2220.f8796) {
                rect2 = rect3;
            } else {
                c2220.m6192();
                Rect rect4 = new Rect();
                int i = c2220.f8805;
                Drawable[] drawableArr = c2220.f8812;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                c2220.f8796 = true;
                c2220.f8803 = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f8842;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f8845.f8795 && ﹳﹳ.ᴵʿ(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C2220 c2220 = this.f8845;
        if (c2220 != null) {
            c2220.f8802 = false;
            c2220.f8819 = false;
        }
        if (drawable != this.f8842 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f8845.f8795;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f8844;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f8844 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f8842;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f8847) {
                this.f8842.setAlpha(this.f8840);
            }
        }
        if (this.f8849 != 0) {
            this.f8849 = 0L;
            z = true;
        }
        if (this.f8846 != 0) {
            this.f8846 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f8841 && super.mutate() == this) {
            C2221 c2221 = (C2221) this;
            C2220 c2220 = new C2220(c2221.f8827, c2221, null);
            c2220.f8798 = c2220.f8798.clone();
            c2220.f8809 = c2220.f8809.clone();
            mo6198(c2220);
            this.f8841 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8844;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f8842;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        C2220 c2220 = this.f8845;
        int i2 = this.f8848;
        int i3 = c2220.f8805;
        Drawable[] drawableArr = c2220.f8812;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean z2 = Build.VERSION.SDK_INT >= 23 ? ﹳﹳ.ˈٴ(drawable, i) : false;
                if (i4 == i2) {
                    z = z2;
                }
            }
        }
        c2220.f8824 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f8844;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f8842;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f8842 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f8847 && this.f8840 == i) {
            return;
        }
        this.f8847 = true;
        this.f8840 = i;
        Drawable drawable = this.f8842;
        if (drawable != null) {
            if (this.f8846 == 0) {
                drawable.setAlpha(i);
            } else {
                m6207(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        C2220 c2220 = this.f8845;
        if (c2220.f8795 != z) {
            c2220.f8795 = z;
            Drawable drawable = this.f8842;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C2220 c2220 = this.f8845;
        c2220.f8793 = true;
        if (c2220.f8814 != colorFilter) {
            c2220.f8814 = colorFilter;
            Drawable drawable = this.f8842;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        C2220 c2220 = this.f8845;
        if (c2220.f8825 != z) {
            c2220.f8825 = z;
            Drawable drawable = this.f8842;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f8842;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f8839;
        if (rect == null) {
            this.f8839 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f8842;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C2220 c2220 = this.f8845;
        c2220.f8794 = true;
        if (c2220.f8801 != colorStateList) {
            c2220.f8801 = colorStateList;
            this.f8842.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C2220 c2220 = this.f8845;
        c2220.f8818 = true;
        if (c2220.f8813 != mode) {
            c2220.f8813 = mode;
            this.f8842.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f8844;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f8842;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f8842 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6205(Drawable drawable) {
        if (this.f8838 == null) {
            this.f8838 = new C2068();
        }
        C2068 c2068 = this.f8838;
        c2068.f7845 = drawable.getCallback();
        drawable.setCallback(c2068);
        try {
            if (this.f8845.f8808 <= 0 && this.f8847) {
                drawable.setAlpha(this.f8840);
            }
            C2220 c2220 = this.f8845;
            if (c2220.f8793) {
                drawable.setColorFilter(c2220.f8814);
            } else {
                if (c2220.f8794) {
                    drawable.setTintList(c2220.f8801);
                }
                C2220 c22202 = this.f8845;
                if (c22202.f8818) {
                    drawable.setTintMode(c22202.f8813);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f8845.f8825);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                ﹳﹳ.ˈٴ(drawable, ﹳﹳ.ᴵʿ(this));
            }
            drawable.setAutoMirrored(this.f8845.f8795);
            Rect rect = this.f8839;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            C2068 c20682 = this.f8838;
            Drawable.Callback callback = (Drawable.Callback) c20682.f7845;
            c20682.f7845 = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C2068 c20683 = this.f8838;
            Drawable.Callback callback2 = (Drawable.Callback) c20683.f7845;
            c20683.f7845 = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6206(int r10) {
        /*
            r9 = this;
            int r0 = r9.f8848
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            ˉי.ʽᐧ r0 = r9.f8845
            int r0 = r0.f8820
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f8844
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f8842
            if (r0 == 0) goto L29
            r9.f8844 = r0
            ˉי.ʽᐧ r0 = r9.f8845
            int r0 = r0.f8820
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f8849 = r0
            goto L35
        L29:
            r9.f8844 = r4
            r9.f8849 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f8842
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            ˉי.ʽᐧ r0 = r9.f8845
            int r1 = r0.f8805
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m6195(r10)
            r9.f8842 = r0
            r9.f8848 = r10
            if (r0 == 0) goto L5a
            ˉי.ʽᐧ r10 = r9.f8845
            int r10 = r10.f8808
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f8846 = r2
        L51:
            r9.m6205(r0)
            goto L5a
        L55:
            r9.f8842 = r4
            r10 = -1
            r9.f8848 = r10
        L5a:
            long r0 = r9.f8846
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f8849
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7e
        L67:
            androidx.leanback.widget.ᴵʿ r0 = r9.f8843
            if (r0 != 0) goto L78
            androidx.leanback.widget.ᴵʿ r0 = new androidx.leanback.widget.ᴵʿ
            r1 = r9
            ˉי.ʿʼ r1 = (p142.C2221) r1
            r2 = 8
            r0.<init>(r2, r1)
            r9.f8843 = r0
            goto L7b
        L78:
            r9.unscheduleSelf(r0)
        L7b:
            r9.m6207(r10)
        L7e:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p142.AbstractC2224.m6206(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6207(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f8847 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f8842
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f8846
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f8840
            r3.setAlpha(r9)
            r13.f8846 = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            ˉי.ʽᐧ r9 = r13.f8845
            int r9 = r9.f8808
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f8840
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f8846 = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f8844
            if (r9 == 0) goto L65
            long r10 = r13.f8849
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f8844 = r0
            r13.f8849 = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            ˉי.ʽᐧ r4 = r13.f8845
            int r4 = r4.f8820
            int r3 = r3 / r4
            int r4 = r13.f8840
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f8849 = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            androidx.leanback.widget.ᴵʿ r14 = r13.f8843
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p142.AbstractC2224.m6207(boolean):void");
    }

    /* renamed from: ﹳﹳ */
    public abstract void mo6198(C2220 c2220);
}
