package p131;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.leanback.widget.C0168;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p063.C1453;
import ˆˑ.ﹳﹳ;

/* renamed from: ˉʻ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2061 extends AbstractC2067 implements Animatable {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f7801 = 0;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Context f7804;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C0168 f7805 = null;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public ArrayList f7803 = null;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2068 f7806 = new C2068(this);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2075 f7802 = new C2075();

    public C2061(Context context) {
        this.f7804 = context;
    }

    @Override // p131.AbstractC2067, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C2075 c2075 = this.f7802;
        c2075.f7888.draw(canvas);
        if (c2075.f7886.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getAlpha() : this.f7802.f7888.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f7802.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getColorFilter() : this.f7802.f7888.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7844 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1453(1, this.f7844.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f7802.f7888.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f7802.f7888.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getOpacity() : this.f7802.f7888.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
    
        if (r8.f7886 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        r8.f7886 = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
    
        r8.f7886.playTogether(r8.f7887);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0181, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.C2061.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.isAutoMirrored() : this.f7802.f7888.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f7844;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f7802.f7886.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.isStateful() : this.f7802.f7888.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7802.f7888.setBounds(rect);
        }
    }

    @Override // p131.AbstractC2067, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.setLevel(i) : this.f7802.f7888.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.setState(iArr) : this.f7802.f7888.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f7802.f7888.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f7802.f7888.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7802.f7888.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            ﹳﹳ.ᐧⁱ(drawable, i);
        } else {
            this.f7802.f7888.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f7802.f7888.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f7802.f7888.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f7802.f7888.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C2075 c2075 = this.f7802;
        if (c2075.f7886.isStarted()) {
            return;
        }
        c2075.f7886.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7802.f7886.end();
        }
    }
}
