package p361;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.StateSet;
import j$.util.Objects;
import java.util.BitSet;
import p086.C1730;
import p171.InterfaceC2463;
import p278.AbstractC3362;
import p281.C3376;
import p389.C4509;
import p389.C4512;
import p391.AbstractC4517;
import p391.AbstractC4518;
import p421.AbstractC4862;
import ˈי.ʾˈ;
import ˈⁱ.ﹳﹳ;
import ˊﹶ.ˋˉ;
import ˏᵢ.ᵢٴ;

/* renamed from: ᵔᵔ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4105 extends Drawable implements InterfaceC2463, InterfaceC4106 {

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final C4093[] f15843;

    /* renamed from: יˋ, reason: contains not printable characters */
    public static final Paint f15844;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final ˋˉ f15845;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final RectF f15846;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public C4512 f15847;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C4098 f15848;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final BitSet f15849;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final C4509[] f15850;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final RectF f15851;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Matrix f15852;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final boolean f15853;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public float[] f15854;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC4088[] f15855;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final Paint f15856;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final Region f15857;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Region f15858;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Path f15859;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AbstractC4088[] f15860;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ᵢٴ f15861;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Path f15862;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public C4089 f15863;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public PorterDuffColorFilter f15864;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C4092 f15865;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C1730 f15866;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f15867;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final Paint f15868;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public float[] f15869;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f15870;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public PorterDuffColorFilter f15871;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final RectF f15872;

    static {
        ٴˎ r1 = new ٴˎ(0);
        ٴˎ r2 = new ٴˎ(0);
        ٴˎ r3 = new ٴˎ(0);
        ٴˎ r4 = new ٴˎ(0);
        int i = 0;
        ʾˈ r6 = ﹳﹳ.ᐧʻ(0);
        C4087.m9374(r6);
        C4087.m9374(r6);
        C4087.m9374(r6);
        C4087.m9374(r6);
        C4097 c4097 = new C4097(0.0f);
        C4097 c40972 = new C4097(0.0f);
        C4097 c40973 = new C4097(0.0f);
        C4097 c40974 = new C4097(0.0f);
        C4089 c4089 = new C4089();
        c4089.f15778 = r6;
        c4089.f15771 = r6;
        c4089.f15777 = r6;
        c4089.f15781 = r6;
        c4089.f15772 = c4097;
        c4089.f15779 = c40972;
        c4089.f15780 = c40973;
        c4089.f15776 = c40974;
        c4089.f15782 = r1;
        c4089.f15773 = r2;
        c4089.f15775 = r3;
        c4089.f15774 = r4;
        Paint paint = new Paint(1);
        f15844 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f15843 = new C4093[4];
        while (true) {
            C4093[] c4093Arr = f15843;
            if (i >= c4093Arr.length) {
                return;
            }
            c4093Arr[i] = new C4093(i);
            i++;
        }
    }

    public C4105() {
        this(new C4089());
    }

    public C4105(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C4089.m9377(context, attributeSet, i, i2).m9375());
    }

    public C4105(C4089 c4089) {
        this(new C4098(c4089));
    }

    public C4105(C4098 c4098) {
        this.f15861 = new ᵢٴ(16, this);
        this.f15855 = new AbstractC4088[4];
        this.f15860 = new AbstractC4088[4];
        this.f15849 = new BitSet(8);
        this.f15852 = new Matrix();
        this.f15859 = new Path();
        this.f15862 = new Path();
        this.f15872 = new RectF();
        this.f15846 = new RectF();
        this.f15858 = new Region();
        this.f15857 = new Region();
        Paint paint = new Paint(1);
        this.f15868 = paint;
        Paint paint2 = new Paint(1);
        this.f15856 = paint2;
        this.f15866 = new C1730();
        this.f15865 = Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC4099.f15824 : new C4092();
        this.f15851 = new RectF();
        this.f15853 = true;
        this.f15850 = new C4509[4];
        this.f15848 = c4098;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m9417();
        m9410(getState());
        this.f15845 = new ˋˉ(28, this);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static float m9403(RectF rectF, C4089 c4089, float[] fArr) {
        if (fArr == null) {
            if (c4089.m9380(rectF)) {
                return c4089.f15772.mo9371(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (c4089.m9382()) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[EDGE_INSN: B:62:0x0095->B:28:0x0095 BREAK  A[LOOP:1: B:19:0x007c->B:24:0x0086]] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361.C4105.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15848.f15810;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f15848;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f15848.getClass();
        RectF rectFM9415 = m9415();
        if (rectFM9415.isEmpty()) {
            return;
        }
        float fM9403 = m9403(rectFM9415, this.f15848.f15817, this.f15869);
        if (fM9403 >= 0.0f) {
            outline.setRoundRect(getBounds(), fM9403 * this.f15848.f15809);
            return;
        }
        boolean z = this.f15867;
        Path path = this.f15859;
        if (z) {
            m9414(rectFM9415, path);
            this.f15867 = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC4518.m10280(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC4517.m10279(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC4517.m10279(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f15848.f15814;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f15858;
        region.set(bounds);
        RectF rectFM9415 = m9415();
        Path path = this.f15859;
        m9414(rectFM9415, path);
        Region region2 = this.f15857;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f15867 = true;
        this.f15870 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C4103 c4103;
        if (!super.isStateful() && ((colorStateList = this.f15848.f15818) == null || !colorStateList.isStateful())) {
            this.f15848.getClass();
            ColorStateList colorStateList3 = this.f15848.f15808;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && (((colorStateList2 = this.f15848.f15822) == null || !colorStateList2.isStateful()) && ((c4103 = this.f15848.f15807) == null || !c4103.m9402()))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f15848 = new C4098(this.f15848);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f15867 = true;
        this.f15870 = true;
        super.onBoundsChange(rect);
        if (this.f15848.f15807 == null || rect.isEmpty()) {
            return;
        }
        m9413(true, getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f15848.f15807 != null) {
            m9413(false, iArr);
        }
        boolean z = m9410(iArr) || m9417();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C4098 c4098 = this.f15848;
        if (c4098.f15810 != i) {
            c4098.f15810 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15848.getClass();
        super.invalidateSelf();
    }

    @Override // p361.InterfaceC4106
    public final void setShapeAppearanceModel(C4089 c4089) {
        C4098 c4098 = this.f15848;
        c4098.f15817 = c4089;
        c4098.f15807 = null;
        this.f15869 = null;
        this.f15854 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f15848.f15818 = colorStateList;
        m9417();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C4098 c4098 = this.f15848;
        if (c4098.f15819 != mode) {
            c4098.f15819 = mode;
            m9417();
            super.invalidateSelf();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9404(Canvas canvas, Paint paint, Path path, C4089 c4089, float[] fArr, RectF rectF) {
        float fM9403 = m9403(rectF, c4089, fArr);
        if (fM9403 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fM9403 * this.f15848.f15809;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m9405(Context context) {
        this.f15848.f15815 = new C3376(context);
        m9408();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m9406(float f) {
        C4098 c4098 = this.f15848;
        if (c4098.f15820 != f) {
            c4098.f15820 = f;
            m9408();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m9407(ColorStateList colorStateList) {
        C4098 c4098 = this.f15848;
        if (c4098.f15822 != colorStateList) {
            c4098.f15822 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m9408() {
        C4098 c4098 = this.f15848;
        float f = c4098.f15820 + 0.0f;
        c4098.f15813 = (int) Math.ceil(0.75f * f);
        this.f15848.f15816 = (int) Math.ceil(f * 0.25f);
        m9417();
        super.invalidateSelf();
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m9409(C4512 c4512) {
        if (this.f15847 == c4512) {
            return;
        }
        this.f15847 = c4512;
        int i = 0;
        while (true) {
            C4509[] c4509Arr = this.f15850;
            if (i >= c4509Arr.length) {
                m9413(true, getState());
                invalidateSelf();
                return;
            }
            if (c4509Arr[i] == null) {
                c4509Arr[i] = new C4509(this, f15843[i]);
            }
            C4509 c4509 = c4509Arr[i];
            C4512 c45122 = new C4512();
            c45122.m10277((float) c4512.f17362);
            double d = c4512.f17367;
            c45122.m10275((float) (d * d));
            c4509.f17344 = c45122;
            i++;
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m9410(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f15848.f15822 == null || color2 == (colorForState2 = this.f15848.f15822.getColorForState(iArr, (color2 = (paint2 = this.f15868).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f15848.f15808 == null || color == (colorForState = this.f15848.f15808.getColorForState(iArr, (color = (paint = this.f15856).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final float m9411() {
        if (m9419()) {
            return this.f15856.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m9412(int i) {
        int i2;
        C4098 c4098 = this.f15848;
        float f = c4098.f15820 + 0.0f + c4098.f15811;
        C3376 c3376 = c4098.f15815;
        if (c3376 == null || !c3376.f13206 || AbstractC4862.m10942(i, 255) != c3376.f13207) {
            return i;
        }
        float fMin = (c3376.f13204 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM8206 = AbstractC3362.m8206(fMin, AbstractC4862.m10942(i, 255), c3376.f13203);
        if (fMin > 0.0f && (i2 = c3376.f13205) != 0) {
            iM8206 = AbstractC4862.m10939(AbstractC4862.m10942(i2, C3376.f13202), iM8206);
        }
        return AbstractC4862.m10942(iM8206, iAlpha);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m9413(boolean z, int[] iArr) {
        int i;
        int[][] iArr2;
        C4089 c4089M9375;
        RectF rectFM9415 = m9415();
        if (this.f15848.f15807 == null || rectFM9415.isEmpty()) {
            return;
        }
        int i2 = 0;
        boolean z2 = z | (this.f15847 == null);
        if (this.f15869 == null) {
            this.f15869 = new float[4];
        }
        C4103 c4103 = this.f15848.f15807;
        int i3 = 0;
        while (true) {
            int i4 = c4103.f15839;
            i = -1;
            iArr2 = c4103.f15838;
            if (i3 >= i4) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i5 = 0;
            while (true) {
                if (i5 >= c4103.f15839) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i5], iArr3)) {
                    i = i5;
                    break;
                }
                i5++;
            }
            i3 = i;
        }
        C4089[] c4089Arr = c4103.f15842;
        C4096 c4096 = c4103.f15837;
        C4096 c40962 = c4103.f15841;
        C4096 c40963 = c4103.f15840;
        C4096 c40964 = c4103.f15836;
        if (c40964 == null && c40963 == null && c40962 == null && c4096 == null) {
            c4089M9375 = c4089Arr[i3];
        } else {
            C4087 c4087M9381 = c4089Arr[i3].m9381();
            if (c40964 != null) {
                c4087M9381.f15758 = c40964.m9396(iArr);
            }
            if (c40963 != null) {
                c4087M9381.f15765 = c40963.m9396(iArr);
            }
            if (c40962 != null) {
                c4087M9381.f15762 = c40962.m9396(iArr);
            }
            if (c4096 != null) {
                c4087M9381.f15766 = c4096.m9396(iArr);
            }
            c4089M9375 = c4087M9381.m9375();
        }
        while (i2 < 4) {
            this.f15865.getClass();
            float fMo9371 = (i2 != 1 ? i2 != 2 ? i2 != 3 ? c4089M9375.f15779 : c4089M9375.f15772 : c4089M9375.f15776 : c4089M9375.f15780).mo9371(rectFM9415);
            if (z2) {
                this.f15869[i2] = fMo9371;
            }
            C4509[] c4509Arr = this.f15850;
            C4509 c4509 = c4509Arr[i2];
            if (c4509 != null) {
                c4509.m10272(fMo9371);
                if (z2) {
                    C4509 c45092 = c4509Arr[i2];
                    if (c45092.f17344.f17362 <= 0.0d) {
                        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
                    }
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        throw new AndroidRuntimeException("Animations may only be started on the main thread");
                    }
                    if (c45092.f17350) {
                        c45092.f17346 = true;
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9414(RectF rectF, Path path) {
        C4098 c4098 = this.f15848;
        this.f15865.m9385(c4098.f15817, this.f15869, c4098.f15809, rectF, this.f15845, path);
        if (this.f15848.f15823 != 1.0f) {
            Matrix matrix = this.f15852;
            matrix.reset();
            float f = this.f15848.f15823;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f15851, true);
    }

    /* renamed from: ٴˎ */
    public void mo9357(Canvas canvas) {
        Paint paint = this.f15856;
        Path path = this.f15862;
        C4089 c4089 = this.f15863;
        float[] fArr = this.f15854;
        RectF rectF = this.f15846;
        rectF.set(m9415());
        float fM9411 = m9411();
        rectF.inset(fM9411, fM9411);
        m9404(canvas, paint, path, c4089, fArr, rectF);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final RectF m9415() {
        RectF rectF = this.f15872;
        rectF.set(getBounds());
        return rectF;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m9416(C4103 c4103) {
        C4098 c4098 = this.f15848;
        if (c4098.f15807 != c4103) {
            c4098.f15807 = c4103;
            m9413(true, getState());
            invalidateSelf();
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final boolean m9417() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f15864;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f15871;
        C4098 c4098 = this.f15848;
        ColorStateList colorStateList = c4098.f15818;
        PorterDuff.Mode mode = c4098.f15819;
        Paint paint = this.f15868;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iM9412 = m9412(color);
            porterDuffColorFilter = iM9412 != color ? new PorterDuffColorFilter(iM9412, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m9412(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f15864 = porterDuffColorFilter;
        this.f15848.getClass();
        this.f15871 = null;
        this.f15848.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f15864) && Objects.equals(porterDuffColorFilter3, this.f15871)) ? false : true;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9418(Canvas canvas) {
        if (this.f15849.cardinality() > 0) {
        }
        int i = this.f15848.f15816;
        Path path = this.f15859;
        C1730 c1730 = this.f15866;
        if (i != 0) {
            canvas.drawPath(path, c1730.f6735);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC4088 abstractC4088 = this.f15855[i2];
            int i3 = this.f15848.f15813;
            Matrix matrix = AbstractC4088.f15769;
            abstractC4088.mo9376(matrix, c1730, i3, canvas);
            this.f15860[i2].mo9376(matrix, c1730, this.f15848.f15813, canvas);
        }
        if (this.f15853) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * this.f15848.f15816);
            int iCos = (int) (Math.cos(Math.toRadians(d)) * this.f15848.f15816);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f15844);
            canvas.translate(iSin, iCos);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m9419() {
        Paint.Style style = this.f15848.f15821;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f15856.getStrokeWidth() > 0.0f;
    }
}
