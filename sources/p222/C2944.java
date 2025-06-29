package p222;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import p300.AbstractC3505;
import p331.C3762;
import p378.AbstractC4345;
import ˆˑ.ﹳﹳ;
import ᴵﹳ.ٴˎ;

/* renamed from: ˏᴵ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2944 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f11380;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final TextView f11383;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ColorStateList f11382 = null;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public PorterDuff.Mode f11379 = null;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f11381 = false;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f11384 = false;

    public /* synthetic */ C2944(TextView textView) {
        this.f11383 = textView;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m7313() {
        C2903 c2903 = (C2903) this.f11383;
        Drawable checkMarkDrawable = c2903.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f11381 || this.f11384) {
                Drawable drawableMutate = ﹳﹳ.ᵢʿ(checkMarkDrawable).mutate();
                if (this.f11381) {
                    drawableMutate.setTintList(this.f11382);
                }
                if (this.f11384) {
                    drawableMutate.setTintMode(this.f11379);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c2903.getDrawableState());
                }
                c2903.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m7314(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f11383;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC3505.f13580;
        C3762 c3762M8778 = C3762.m8778(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        AbstractC4345.m9881(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c3762M8778.f14531, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ٴˎ.ˏᵢ(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(ٴˎ.ˏᵢ(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c3762M8778.m8782(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC2962.m7331(typedArray.getInt(3, -1), null));
            }
        } finally {
            c3762M8778.m8783();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m7315() {
        CompoundButton compoundButton = (CompoundButton) this.f11383;
        Drawable drawable = ʼˉ.ٴˎ.ˑי(compoundButton);
        if (drawable != null) {
            if (this.f11381 || this.f11384) {
                Drawable drawableMutate = ﹳﹳ.ᵢʿ(drawable).mutate();
                if (this.f11381) {
                    drawableMutate.setTintList(this.f11382);
                }
                if (this.f11384) {
                    drawableMutate.setTintMode(this.f11379);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }
}
