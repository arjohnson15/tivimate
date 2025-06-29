package p361;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p281.C3376;

/* renamed from: ᵔᵔ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4098 extends Drawable.ConstantState {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4103 f15807;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public ColorStateList f15808;

    /* renamed from: ˉי, reason: contains not printable characters */
    public float f15809;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f15810;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public float f15811;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public float f15812;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f15813;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Rect f15814;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C3376 f15815;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f15816;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4089 f15817;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public ColorStateList f15818;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public PorterDuff.Mode f15819;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public float f15820;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final Paint.Style f15821;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public ColorStateList f15822;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final float f15823;

    public C4098(C4089 c4089) {
        this.f15822 = null;
        this.f15808 = null;
        this.f15818 = null;
        this.f15819 = PorterDuff.Mode.SRC_IN;
        this.f15814 = null;
        this.f15823 = 1.0f;
        this.f15809 = 1.0f;
        this.f15810 = 255;
        this.f15811 = 0.0f;
        this.f15820 = 0.0f;
        this.f15813 = 0;
        this.f15816 = 0;
        this.f15821 = Paint.Style.FILL_AND_STROKE;
        this.f15817 = c4089;
        this.f15815 = null;
    }

    public C4098(C4098 c4098) {
        this.f15822 = null;
        this.f15808 = null;
        this.f15818 = null;
        this.f15819 = PorterDuff.Mode.SRC_IN;
        this.f15814 = null;
        this.f15823 = 1.0f;
        this.f15809 = 1.0f;
        this.f15810 = 255;
        this.f15811 = 0.0f;
        this.f15820 = 0.0f;
        this.f15813 = 0;
        this.f15816 = 0;
        this.f15821 = Paint.Style.FILL_AND_STROKE;
        this.f15817 = c4098.f15817;
        this.f15807 = c4098.f15807;
        this.f15815 = c4098.f15815;
        this.f15812 = c4098.f15812;
        this.f15822 = c4098.f15822;
        this.f15808 = c4098.f15808;
        this.f15819 = c4098.f15819;
        this.f15818 = c4098.f15818;
        this.f15810 = c4098.f15810;
        this.f15823 = c4098.f15823;
        this.f15816 = c4098.f15816;
        this.f15809 = c4098.f15809;
        this.f15811 = c4098.f15811;
        this.f15820 = c4098.f15820;
        this.f15813 = c4098.f15813;
        this.f15821 = c4098.f15821;
        if (c4098.f15814 != null) {
            this.f15814 = new Rect(c4098.f15814);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C4105 c4105 = new C4105(this);
        c4105.f15867 = true;
        c4105.f15870 = true;
        return c4105;
    }
}
