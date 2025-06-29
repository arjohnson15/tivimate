package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p348.AbstractC3996;
import p378.AbstractC4339;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static final /* synthetic */ int f931 = 0;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C0160 f932;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public ValueAnimator f933;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final View f934;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Drawable f935;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f936;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final View f937;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C0160 f938;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f939;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f940;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int f941;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ImageView f942;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public View.OnClickListener f943;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final float f944;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public ValueAnimator f945;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C0166 f946;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ArgbEvaluator f947;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final float f948;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final float f949;

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._2_res_0x7f0404ef);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f947 = new ArgbEvaluator();
        this.f938 = new C0160(0, this);
        this.f932 = new C0160(1, this);
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f934 = viewInflate;
        this.f937 = viewInflate.findViewById(R.id._2_res_0x7f0b0333);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        this.f942 = imageView;
        this.f948 = context.getResources().getFraction(R.fraction._2_res_0x7f0a0007, 1, 1);
        this.f936 = context.getResources().getInteger(R.integer._2_res_0x7f0c0030);
        this.f941 = context.getResources().getInteger(R.integer._2_res_0x7f0c0031);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f0701c9);
        this.f949 = dimensionPixelSize;
        this.f944 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f0701cf);
        int[] iArr = AbstractC3996.f15432;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        setOrbIcon(drawable == null ? resources.getDrawable(R.drawable._2_res_0x7f080186) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color._2_res_0x7f0600d1));
        setOrbColors(new C0166(color, typedArrayObtainStyledAttributes.getColor(0, color), typedArrayObtainStyledAttributes.getColor(3, 0)));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        AbstractC4339.m9857(imageView, dimensionPixelSize);
    }

    public float getFocusedZoom() {
        return this.f948;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    public int getOrbColor() {
        return this.f946.f1123;
    }

    public C0166 getOrbColors() {
        return this.f946;
    }

    public Drawable getOrbIcon() {
        return this.f935;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f939 = true;
        m878();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f943;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f939 = false;
        m878();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        m879(z);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f943 = onClickListener;
    }

    public void setOrbColor(int i) {
        setOrbColors(new C0166(i, i, 0));
    }

    public void setOrbColors(C0166 c0166) {
        this.f946 = c0166;
        this.f942.setColorFilter(c0166.f1122);
        if (this.f933 == null) {
            setOrbViewColor(this.f946.f1123);
        } else {
            this.f940 = true;
            m878();
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f935 = drawable;
        this.f942.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i) {
        View view = this.f937;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i);
        }
    }

    public void setSearchOrbZ(float f) {
        float f2 = this.f949;
        float f3 = this.f944;
        float f4 = ᵎﹳ.ᐧʻ.ﹶˆ(f2, f3, f, f3);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4339.m9857(this.f937, f4);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m878() {
        ValueAnimator valueAnimator = this.f933;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f933 = null;
        }
        if (this.f940 && this.f939) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f947, Integer.valueOf(this.f946.f1123), Integer.valueOf(this.f946.f1121), Integer.valueOf(this.f946.f1123));
            this.f933 = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            this.f933.setDuration(this.f936 * 2);
            this.f933.addUpdateListener(this.f938);
            this.f933.start();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m879(boolean z) {
        float f = z ? this.f948 : 1.0f;
        ViewPropertyAnimator viewPropertyAnimatorScaleY = this.f934.animate().scaleX(f).scaleY(f);
        long j = this.f941;
        viewPropertyAnimatorScaleY.setDuration(j).start();
        if (this.f945 == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f945 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.f932);
        }
        if (z) {
            this.f945.start();
        } else {
            this.f945.reverse();
        }
        this.f945.setDuration(j);
        this.f940 = z;
        m878();
    }
}
