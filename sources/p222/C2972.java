package p222;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p300.AbstractC3505;
import ʾי.ˑʽ;
import ⁱـ.ˑי;

/* renamed from: ˏᴵ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2972 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˑʽ f11446;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TextView f11447;

    public C2972(TextView textView) {
        this.f11447 = textView;
        this.f11446 = new ˑʽ(textView);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7344(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f11447.getContext().obtainStyledAttributes(attributeSet, AbstractC3505.f13597, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m7347(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7345(boolean z) {
        ((ˑי) this.f11446.ˆʿ).ˋˊ(z);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InputFilter[] m7346(InputFilter[] inputFilterArr) {
        return ((ˑי) this.f11446.ˆʿ).ˉי(inputFilterArr);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7347(boolean z) {
        ((ˑי) this.f11446.ˆʿ).ﾞˊ(z);
    }
}
