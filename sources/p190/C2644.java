package p190;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import org.lsposed.hiddenapibypass.library.R;
import p044.AbstractC1298;
import p044.C1295;
import p044.C1297;
import p278.AbstractC3362;
import p361.C4089;
import p361.C4098;
import p361.C4103;
import p361.C4105;
import p361.InterfaceC4106;
import p389.C4512;

/* renamed from: ˎˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2644 {

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final boolean f10481;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final boolean f10482;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4089 f10483;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10484;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public LayerDrawable f10485;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f10486;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public ColorStateList f10487;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f10488;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ColorStateList f10489;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public PorterDuff.Mode f10491;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public Drawable f10492;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f10493;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C4103 f10494;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final MaterialButton f10496;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f10497;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f10498;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public ColorStateList f10499;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f10500;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C4512 f10503;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f10504;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f10495 = false;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f10501 = false;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f10490 = false;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f10502 = true;

    static {
        int i = Build.VERSION.SDK_INT;
        f10482 = true;
        f10481 = i <= 22;
    }

    public C2644(MaterialButton materialButton, C4089 c4089) {
        this.f10496 = materialButton;
        this.f10483 = c4089;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6825(int i, int i2) {
        MaterialButton materialButton = this.f10496;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f10498;
        int i4 = this.f10493;
        this.f10493 = i2;
        this.f10498 = i;
        if (!this.f10501) {
            m6827();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6826() {
        C4105 c4105M6828 = m6828(false);
        C4105 c4105M68282 = m6828(true);
        if (c4105M6828 != null) {
            float f = this.f10486;
            ColorStateList colorStateList = this.f10489;
            c4105M6828.f15848.f15812 = f;
            c4105M6828.invalidateSelf();
            C4098 c4098 = c4105M6828.f15848;
            if (c4098.f15808 != colorStateList) {
                c4098.f15808 = colorStateList;
                c4105M6828.onStateChange(c4105M6828.getState());
            }
            if (c4105M68282 != null) {
                float f2 = this.f10486;
                int iM8199 = this.f10495 ? AbstractC3362.m8199(this.f10496, R.attr._2_res_0x7f040169) : 0;
                c4105M68282.f15848.f15812 = f2;
                c4105M68282.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM8199);
                C4098 c40982 = c4105M68282.f15848;
                if (c40982.f15808 != colorStateListValueOf) {
                    c40982.f15808 = colorStateListValueOf;
                    c4105M68282.onStateChange(c4105M68282.getState());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6827() {
        InsetDrawable insetDrawable;
        C4105 c4105 = new C4105(this.f10483);
        C4103 c4103 = this.f10494;
        if (c4103 != null) {
            c4105.m9416(c4103);
        }
        C4512 c4512 = this.f10503;
        if (c4512 != null) {
            c4105.m9409(c4512);
        }
        MaterialButton materialButton = this.f10496;
        c4105.m9405(materialButton.getContext());
        c4105.setTintList(this.f10487);
        PorterDuff.Mode mode = this.f10491;
        if (mode != null) {
            c4105.setTintMode(mode);
        }
        float f = this.f10486;
        ColorStateList colorStateList = this.f10489;
        c4105.f15848.f15812 = f;
        c4105.invalidateSelf();
        C4098 c4098 = c4105.f15848;
        if (c4098.f15808 != colorStateList) {
            c4098.f15808 = colorStateList;
            c4105.onStateChange(c4105.getState());
        }
        C4105 c41052 = new C4105(this.f10483);
        C4103 c41032 = this.f10494;
        if (c41032 != null) {
            c41052.m9416(c41032);
        }
        C4512 c45122 = this.f10503;
        if (c45122 != null) {
            c41052.m9409(c45122);
        }
        c41052.setTint(0);
        float f2 = this.f10486;
        int iM8199 = this.f10495 ? AbstractC3362.m8199(materialButton, R.attr._2_res_0x7f040169) : 0;
        c41052.f15848.f15812 = f2;
        c41052.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM8199);
        C4098 c40982 = c41052.f15848;
        if (c40982.f15808 != colorStateListValueOf) {
            c40982.f15808 = colorStateListValueOf;
            c41052.onStateChange(c41052.getState());
        }
        if (f10482) {
            C4105 c41053 = new C4105(this.f10483);
            this.f10492 = c41053;
            C4103 c41033 = this.f10494;
            if (c41033 != null) {
                c41053.m9416(c41033);
            }
            C4512 c45123 = this.f10503;
            if (c45123 != null) {
                ((C4105) this.f10492).m9409(c45123);
            }
            this.f10492.setTint(-1);
            ?? rippleDrawable = new RippleDrawable(AbstractC1298.m4597(this.f10499), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c41052, c4105}), this.f10484, this.f10498, this.f10497, this.f10493), this.f10492);
            this.f10485 = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            C4105 c41054 = new C4105(this.f10483);
            C1297 c1297 = new C1297();
            c1297.f5318 = c41054;
            c1297.f5317 = false;
            C1295 c1295 = new C1295(c1297);
            this.f10492 = c1295;
            C4103 c41034 = this.f10494;
            if (c41034 != null) {
                c1295.f5316.f5318.m9416(c41034);
            }
            C4512 c45124 = this.f10503;
            if (c45124 != null) {
                ((C1295) this.f10492).f5316.f5318.m9409(c45124);
            }
            this.f10492.setTintList(AbstractC1298.m4597(this.f10499));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c41052, c4105, this.f10492});
            this.f10485 = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f10484, this.f10498, this.f10497, this.f10493);
        }
        materialButton.setInternalBackground(insetDrawable);
        C4105 c4105M6828 = m6828(false);
        if (c4105M6828 != null) {
            c4105M6828.m9406(this.f10488);
            c4105M6828.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4105 m6828(boolean z) {
        LayerDrawable layerDrawable = this.f10485;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f10482 ? (C4105) ((LayerDrawable) ((InsetDrawable) this.f10485.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (C4105) this.f10485.getDrawable(!z ? 1 : 0);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6829() {
        if (f10481 && !this.f10501) {
            MaterialButton materialButton = this.f10496;
            int paddingStart = materialButton.getPaddingStart();
            int paddingTop = materialButton.getPaddingTop();
            int paddingEnd = materialButton.getPaddingEnd();
            int paddingBottom = materialButton.getPaddingBottom();
            m6827();
            materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        C4105 c4105M6828 = m6828(false);
        if (c4105M6828 != null) {
            C4103 c4103 = this.f10494;
            if (c4103 != null) {
                c4105M6828.m9416(c4103);
            } else {
                c4105M6828.setShapeAppearanceModel(this.f10483);
            }
            C4512 c4512 = this.f10503;
            if (c4512 != null) {
                c4105M6828.m9409(c4512);
            }
        }
        C4105 c4105M68282 = m6828(true);
        if (c4105M68282 != null) {
            C4103 c41032 = this.f10494;
            if (c41032 != null) {
                c4105M68282.m9416(c41032);
            } else {
                c4105M68282.setShapeAppearanceModel(this.f10483);
            }
            C4512 c45122 = this.f10503;
            if (c45122 != null) {
                c4105M68282.m9409(c45122);
            }
        }
        LayerDrawable layerDrawable = this.f10485;
        InterfaceC4106 interfaceC4106 = (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) ? null : this.f10485.getNumberOfLayers() > 2 ? (InterfaceC4106) this.f10485.getDrawable(2) : (InterfaceC4106) this.f10485.getDrawable(1);
        if (interfaceC4106 != null) {
            interfaceC4106.setShapeAppearanceModel(this.f10483);
            if (interfaceC4106 instanceof C4105) {
                C4105 c4105 = (C4105) interfaceC4106;
                C4103 c41033 = this.f10494;
                if (c41033 != null) {
                    c4105.m9416(c41033);
                }
                C4512 c45123 = this.f10503;
                if (c45123 != null) {
                    c4105.m9409(c45123);
                }
            }
        }
    }
}
