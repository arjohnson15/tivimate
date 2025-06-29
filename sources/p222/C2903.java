package p222;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import org.lsposed.hiddenapibypass.library.R;
import p004.InterfaceC0925;
import p036.C1262;
import p300.AbstractC3505;
import p331.C3762;
import p378.AbstractC4345;
import ˈⁱ.ˉⁱ;
import ˈⁱ.ﹳﹳ;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᴵ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2903 extends CheckedTextView implements InterfaceC0925 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1262 f11234;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2941 f11235;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2972 f11236;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2944 f11237;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2903(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr._2_res_0x7f0400ee);
        AbstractC2902.m7248(context);
        AbstractC2873.m7187(getContext(), this);
        C2941 c2941 = new C2941(this);
        this.f11235 = c2941;
        c2941.m7308(attributeSet, R.attr._2_res_0x7f0400ee);
        c2941.m7301();
        C1262 c1262 = new C1262(this);
        this.f11234 = c1262;
        c1262.m4491(attributeSet, R.attr._2_res_0x7f0400ee);
        this.f11237 = new C2944(this);
        Context context2 = getContext();
        int[] iArr = AbstractC3505.f13578;
        C3762 c3762M8778 = C3762.m8778(context2, attributeSet, iArr, R.attr._2_res_0x7f0400ee);
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        AbstractC4345.m9881(this, getContext(), iArr, attributeSet, (TypedArray) c3762M8778.f14531, R.attr._2_res_0x7f0400ee);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(ٴˎ.ˏᵢ(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(ٴˎ.ˏᵢ(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c3762M8778.m8782(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC2962.m7331(typedArray.getInt(3, -1), null));
            }
            c3762M8778.m8783();
            getEmojiTextViewHelper().m7344(attributeSet, R.attr._2_res_0x7f0400ee);
        } catch (Throwable th) {
            c3762M8778.m8783();
            throw th;
        }
    }

    private C2972 getEmojiTextViewHelper() {
        if (this.f11236 == null) {
            this.f11236 = new C2972(this);
        }
        return this.f11236;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2941 c2941 = this.f11235;
        if (c2941 != null) {
            c2941.m7301();
        }
        C1262 c1262 = this.f11234;
        if (c1262 != null) {
            c1262.m4520();
        }
        C2944 c2944 = this.f11237;
        if (c2944 != null) {
            c2944.m7313();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ˉⁱ.ˆᵔ(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f11234;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f11234;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2944 c2944 = this.f11237;
        if (c2944 != null) {
            return c2944.f11382;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2944 c2944 = this.f11237;
        if (c2944 != null) {
            return c2944.f11379;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11235.m7311();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11235.m7302();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ﹳﹳ.ˆᵔ(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7345(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f11234;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f11234;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ٴˎ.ˏᵢ(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2944 c2944 = this.f11237;
        if (c2944 != null) {
            if (c2944.f11380) {
                c2944.f11380 = false;
            } else {
                c2944.f11380 = true;
                c2944.m7313();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11235;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11235;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f11234;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f11234;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2944 c2944 = this.f11237;
        if (c2944 != null) {
            c2944.f11382 = colorStateList;
            c2944.f11381 = true;
            c2944.m7313();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2944 c2944 = this.f11237;
        if (c2944 != null) {
            c2944.f11379 = mode;
            c2944.f11384 = true;
            c2944.m7313();
        }
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2941 c2941 = this.f11235;
        c2941.m7304(colorStateList);
        c2941.m7301();
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2941 c2941 = this.f11235;
        c2941.m7305(mode);
        c2941.m7301();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2941 c2941 = this.f11235;
        if (c2941 != null) {
            c2941.m7309(context, i);
        }
    }
}
