package p222;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p004.InterfaceC0925;
import p036.C1262;
import p331.C3762;
import ˈⁱ.ﹳﹳ;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᴵ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2917 extends MultiAutoCompleteTextView implements InterfaceC0925 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final int[] f11300 = {R.attr.popupBackground};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2941 f11301;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2883 f11302;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1262 f11303;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2917(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04004d);
        AbstractC2902.m7248(context);
        AbstractC2873.m7187(getContext(), this);
        C3762 c3762M8778 = C3762.m8778(getContext(), attributeSet, f11300, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04004d);
        if (((TypedArray) c3762M8778.f14531).hasValue(0)) {
            setDropDownBackgroundDrawable(c3762M8778.m8784(0));
        }
        c3762M8778.m8783();
        C1262 c1262 = new C1262(this);
        this.f11303 = c1262;
        c1262.m4491(attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04004d);
        C2941 c2941 = new C2941(this);
        this.f11301 = c2941;
        c2941.m7308(attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04004d);
        c2941.m7301();
        C2883 c2883 = new C2883(this);
        this.f11302 = c2883;
        c2883.mo7192(attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f04004d);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM7206 = c2883.m7206(keyListener);
        if (keyListenerM7206 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM7206);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262 c1262 = this.f11303;
        if (c1262 != null) {
            c1262.m4520();
        }
        C2941 c2941 = this.f11301;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262 c1262 = this.f11303;
        if (c1262 != null) {
            return c1262.m4505();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262 c1262 = this.f11303;
        if (c1262 != null) {
            return c1262.m4514();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11301.m7311();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11301.m7302();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ﹳﹳ.ˆᵔ(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f11302.m7205(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262 c1262 = this.f11303;
        if (c1262 != null) {
            c1262.m4506();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262 c1262 = this.f11303;
        if (c1262 != null) {
            c1262.m4517(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11301;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2941 c2941 = this.f11301;
        if (c2941 != null) {
            c2941.m7301();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ٴˎ.ˏᵢ(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f11302.m7207(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11302.m7206(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262 c1262 = this.f11303;
        if (c1262 != null) {
            c1262.m4510(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262 c1262 = this.f11303;
        if (c1262 != null) {
            c1262.m4493(mode);
        }
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2941 c2941 = this.f11301;
        c2941.m7304(colorStateList);
        c2941.m7301();
    }

    @Override // p004.InterfaceC0925
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2941 c2941 = this.f11301;
        c2941.m7305(mode);
        c2941.m7301();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2941 c2941 = this.f11301;
        if (c2941 != null) {
            c2941.m7309(context, i);
        }
    }
}
