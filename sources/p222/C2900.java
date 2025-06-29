package p222;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.leanback.widget.ﾞᐧ;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p004.AbstractC0919;
import p004.AbstractC0924;
import p004.InterfaceC0925;
import p036.C1262;
import p243.AbstractC3108;
import p243.C3113;
import p421.AbstractC4863;
import ˈⁱ.ˉⁱ;
import ˈⁱ.ﹳﹳ;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᴵ.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2900 extends TextView implements InterfaceC0925 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2941 f11226;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f11227;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2883 f11228;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2972 f11229;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1262 f11230;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public ﾞᐧ f11231;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Future f11232;

    public C2900(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2900(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2902.m7248(context);
        this.f11227 = false;
        this.f11231 = null;
        AbstractC2873.m7187(getContext(), this);
        C1262 c1262 = new C1262(this);
        this.f11230 = c1262;
        c1262.m4491(attributeSet, i);
        C2941 c2941 = new C2941(this);
        this.f11226 = c2941;
        c2941.m7308(attributeSet, i);
        c2941.m7301();
        C2883 c2883 = new C2883();
        c2883.f11167 = this;
        this.f11228 = c2883;
        getEmojiTextViewHelper().m7344(attributeSet, i);
    }

    private C2972 getEmojiTextViewHelper() {
        if (this.f11229 == null) {
            this.f11229 = new C2972(this);
        }
        return this.f11229;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1262 c1262 = this.f11230;
        if (c1262 != null) {
            c1262.m4520();
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeMaxTextSize();
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            return Math.round(c2941.f11377.f11342);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeMinTextSize();
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            return Math.round(c2941.f11377.f11350);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeStepGranularity();
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            return Math.round(c2941.f11377.f11346);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2941 c2941 = this.f11226;
        return c2941 != null ? c2941.f11377.f11348 : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC2926.f11334) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            return c2941.f11377.f11347;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ˉⁱ.ˆᵔ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2874 getSuperCaller() {
        if (this.f11231 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f11231 = new C2960(this);
            } else if (i >= 28) {
                this.f11231 = new C2889(this);
            } else if (i >= 26) {
                this.f11231 = new ﾞᐧ(28, this);
            }
        }
        return this.f11231;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f11230;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f11230;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11226.m7311();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11226.m7302();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m7245();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2883 c2883;
        if (Build.VERSION.SDK_INT >= 28 || (c2883 = this.f11228) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2883.f11168;
        return textClassifier == null ? AbstractC2951.m7317((TextView) c2883.f11167) : textClassifier;
    }

    public C3113 getTextMetricsParamsCompat() {
        return ˉⁱ.ˉⁱ(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11226.getClass();
        C2941.m7299(editorInfo, inputConnectionOnCreateInputConnection, this);
        ﹳﹳ.ˆᵔ(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2941 c2941 = this.f11226;
        if (c2941 == null || AbstractC2926.f11334) {
            return;
        }
        c2941.f11377.m7289();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m7245();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C2941 c2941 = this.f11226;
        if (c2941 == null || AbstractC2926.f11334) {
            return;
        }
        C2929 c2929 = c2941.f11377;
        if (c2929.m7290()) {
            c2929.m7289();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7345(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC2926.f11334) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7312(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC2926.f11334) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7303(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC2926.f11334) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7306(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f11230;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f11230;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ٴˎ.ˏᵢ(context, i) : null, i2 != 0 ? ٴˎ.ˏᵢ(context, i2) : null, i3 != 0 ? ٴˎ.ˏᵢ(context, i3) : null, i4 != 0 ? ٴˎ.ˏᵢ(context, i4) : null);
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ٴˎ.ˏᵢ(context, i) : null, i2 != 0 ? ٴˎ.ˏᵢ(context, i2) : null, i3 != 0 ? ٴˎ.ˏᵢ(context, i3) : null, i4 != 0 ? ٴˎ.ˏᵢ(context, i4) : null);
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ˉⁱ.ᵢʿ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7347(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m7346(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m7189(i);
        } else {
            ˉⁱ.ﾞˊ(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m7191(i);
        } else {
            ˉⁱ.ﾞʽ(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ˉⁱ.יʻ(this, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().m7190(i, f);
        } else if (i2 >= 34) {
            AbstractC0924.m3780(this, i, f);
        } else {
            ˉⁱ.יʻ(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(AbstractC3108 abstractC3108) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        ˉⁱ.ˉⁱ(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f11230;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f11230;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2941 c2941 = this.f11226;
        c2941.m7304(colorStateList);
        c2941.m7301();
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2941 c2941 = this.f11226;
        c2941.m7305(mode);
        c2941.m7301();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2941 c2941 = this.f11226;
        if (c2941 != null) {
            c2941.m7309(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2883 c2883;
        if (Build.VERSION.SDK_INT >= 28 || (c2883 = this.f11228) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2883.f11168 = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC3108> future) {
        this.f11232 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C3113 c3113) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c3113.f12006;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        int i2 = Build.VERSION.SDK_INT;
        TextPaint textPaint = c3113.f12008;
        if (i2 >= 23) {
            getPaint().set(textPaint);
            AbstractC0919.m3756(this, c3113.f12007);
            AbstractC0919.m3743(this, c3113.f12009);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = AbstractC2926.f11334;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C2941 c2941 = this.f11226;
        if (c2941 == null || z) {
            return;
        }
        C2929 c2929 = c2941.f11377;
        if (c2929.m7290()) {
            return;
        }
        c2929.m7291(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f11227) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            ʼˉ.ٴˎ r1 = AbstractC4863.f18370;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f11227 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f11227 = false;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m7245() {
        Future future = this.f11232;
        if (future == null) {
            return;
        }
        try {
            this.f11232 = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            ˉⁱ.ˉⁱ(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}
