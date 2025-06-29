package p222;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import org.lsposed.hiddenapibypass.library.R;
import p004.InterfaceC0925;
import p004.InterfaceC0931;
import p036.C1262;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᴵ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2936 extends RadioButton implements InterfaceC0931, InterfaceC0925 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1262 f11359;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2941 f11360;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2972 f11361;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2944 f11362;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2936(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0404b5);
        AbstractC2902.m7248(context);
        AbstractC2873.m7187(getContext(), this);
        C2944 c2944 = new C2944(this);
        this.f11362 = c2944;
        c2944.m7314(attributeSet, R.attr._2_res_0x7f0404b5);
        C1262 c1262 = new C1262(this);
        this.f11359 = c1262;
        c1262.m4491(attributeSet, R.attr._2_res_0x7f0404b5);
        C2941 c2941 = new C2941(this);
        this.f11360 = c2941;
        c2941.m7308(attributeSet, R.attr._2_res_0x7f0404b5);
        getEmojiTextViewHelper().m7344(attributeSet, R.attr._2_res_0x7f0404b5);
    }

    private C2972 getEmojiTextViewHelper() {
        if (this.f11361 == null) {
            this.f11361 = new C2972(this);
        }
        return this.f11361;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262 c1262 = this.f11359;
        if (c1262 != null) {
            c1262.m4520();
        }
        C2941 c2941 = this.f11360;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f11359;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f11359;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    @Override // p004.InterfaceC0931
    public ColorStateList getSupportButtonTintList() {
        C2944 c2944 = this.f11362;
        if (c2944 != null) {
            return c2944.f11382;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2944 c2944 = this.f11362;
        if (c2944 != null) {
            return c2944.f11379;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11360.m7311();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11360.m7302();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7345(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f11359;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f11359;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ٴˎ.ˏᵢ(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2944 c2944 = this.f11362;
        if (c2944 != null) {
            if (c2944.f11380) {
                c2944.f11380 = false;
            } else {
                c2944.f11380 = true;
                c2944.m7315();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11360;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11360;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7347(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m7346(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f11359;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f11359;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    @Override // p004.InterfaceC0931
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2944 c2944 = this.f11362;
        if (c2944 != null) {
            c2944.f11382 = colorStateList;
            c2944.f11381 = true;
            c2944.m7315();
        }
    }

    @Override // p004.InterfaceC0931
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2944 c2944 = this.f11362;
        if (c2944 != null) {
            c2944.f11379 = mode;
            c2944.f11384 = true;
            c2944.m7315();
        }
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2941 c2941 = this.f11360;
        c2941.m7304(colorStateList);
        c2941.m7301();
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2941 c2941 = this.f11360;
        c2941.m7305(mode);
        c2941.m7301();
    }
}
