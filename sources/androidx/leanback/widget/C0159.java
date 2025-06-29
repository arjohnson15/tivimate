package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.transition.C0124;
import androidx.leanback.transition.C0126;
import androidx.leanback.transition.FadeAndShortSlide;
import com.google.android.gms.internal.measurement.C0559;
import org.lsposed.hiddenapibypass.library.R;
import p291.C3435;
import p348.AbstractC3996;

/* renamed from: androidx.leanback.widget.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0159 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final ʾי.ˑʽ f1090;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public VerticalGridView f1091;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public View f1092;

    /* renamed from: ˉי, reason: contains not printable characters */
    public float f1093;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public float f1094;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f1095;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public C0203 f1096 = null;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public float f1097;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f1098;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f1099;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public VerticalGridView f1100;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f1101;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ViewGroup f1102;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f1103;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f1104;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f1105;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public TransitionSet f1106;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f1107;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public float f1108;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public View f1109;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public float f1110;

    static {
        ʾי.ˑʽ r2 = new ʾי.ˑʽ(2, false);
        r2.ˆʿ = new C0189[]{new C0189()};
        f1090 = r2;
        C0189 c0189 = new C0189();
        c0189.f1171 = R.id._2_res_0x7f0b01c0;
        c0189.f1169 = true;
        c0189.f1168 = 0;
        c0189.f1172 = true;
        c0189.m982(0.0f);
        r2.ˆʿ = new C0189[]{c0189};
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m945(C0193 c0193, boolean z) throws Resources.NotFoundException {
        c0193.m983(z);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m946(C0193 c0193, boolean z, boolean z2) {
        if (z) {
            m947(c0193, z2);
            c0193.f5618.setFocusable(false);
            View view = c0193.f1175;
            view.requestFocus();
            view.setOnClickListener(new ViewOnClickListenerC0182(this, c0193));
            return;
        }
        c0193.getClass();
        View view2 = c0193.f5618;
        view2.setFocusable(true);
        view2.requestFocus();
        m947(null, z2);
        View view3 = c0193.f1175;
        view3.setOnClickListener(null);
        view3.setClickable(false);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m947(C0193 c0193, boolean z) {
        C0193 c01932;
        int childCount = this.f1091.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                c01932 = null;
                break;
            }
            VerticalGridView verticalGridView = this.f1091;
            c01932 = (C0193) verticalGridView.m1331(verticalGridView.getChildAt(i));
            if ((c0193 == null && c01932.f5618.getVisibility() == 0) || (c0193 != null && c01932.f1184 == c0193.f1184)) {
                break;
            } else {
                i++;
            }
        }
        if (c01932 == null) {
            return;
        }
        c01932.f1184.getClass();
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(112);
            fadeAndShortSlide.f738 = c01932.f5618.getHeight() * 0.5f;
            fadeAndShortSlide.setEpicenterCallback(new C3435(2, new C0559(this)));
            ChangeTransform changeTransform = new ChangeTransform();
            C0126 c0126 = new C0126();
            c0126.setReparent(false);
            Fade fade = new Fade(3);
            C0126 c01262 = new C0126();
            c01262.setReparent(false);
            if (c0193 == null) {
                fadeAndShortSlide.setStartDelay(150L);
                changeTransform.setStartDelay(100L);
                c0126.setStartDelay(100L);
                c01262.setStartDelay(100L);
            } else {
                fade.setStartDelay(100L);
                c01262.setStartDelay(50L);
                changeTransform.setStartDelay(50L);
                c0126.setStartDelay(50L);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                VerticalGridView verticalGridView2 = this.f1091;
                C0193 c01933 = (C0193) verticalGridView2.m1331(verticalGridView2.getChildAt(i2));
                if (c01933 != c01932) {
                    fadeAndShortSlide.addTarget(c01933.f5618);
                    fade.excludeTarget(c01933.f5618, true);
                }
            }
            c01262.addTarget(this.f1100);
            c01262.addTarget(this.f1109);
            transitionSet.addTransition(fadeAndShortSlide);
            transitionSet.addTransition(fade);
            transitionSet.addTransition(c01262);
            this.f1106 = transitionSet;
            transitionSet.addListener((Transition.TransitionListener) new C0124(0, new ﾞᐧ(0, this)));
            TransitionManager.beginDelayedTransition(this.f1102, this.f1106);
        }
        if (c0193 == null) {
            this.f1096 = null;
            this.f1091.setPruneChild(true);
        } else {
            C0203 c0203 = c0193.f1184;
            if (c0203 != this.f1096) {
                this.f1096 = c0203;
                this.f1091.setPruneChild(false);
            }
        }
        this.f1091.setAnimateChildLayout(false);
        int childCount2 = this.f1091.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            VerticalGridView verticalGridView3 = this.f1091;
            m953((C0193) verticalGridView3.m1331(verticalGridView3.getChildAt(i3)));
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ViewGroup m948(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        float f = layoutInflater.getContext().getTheme().obtainStyledAttributes(AbstractC3996.f15430).getFloat(46, 40.0f);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(this.f1103 ? R.layout._2_res_0x7f0e00a5 : R.layout._2_res_0x7f0e00a2, viewGroup, false);
        this.f1102 = viewGroup2;
        this.f1092 = viewGroup2.findViewById(this.f1103 ? R.id._2_res_0x7f0b01ba : R.id._2_res_0x7f0b01b9);
        ViewGroup viewGroup3 = this.f1102;
        if (viewGroup3 instanceof VerticalGridView) {
            this.f1091 = (VerticalGridView) viewGroup3;
        } else {
            VerticalGridView verticalGridView = (VerticalGridView) viewGroup3.findViewById(this.f1103 ? R.id._2_res_0x7f0b01c2 : R.id._2_res_0x7f0b01c1);
            this.f1091 = verticalGridView;
            if (verticalGridView == null) {
                throw new IllegalStateException("No ListView exists.");
            }
            verticalGridView.setWindowAlignmentOffsetPercent(f);
            this.f1091.setWindowAlignment(0);
            if (!this.f1103) {
                this.f1100 = (VerticalGridView) this.f1102.findViewById(R.id._2_res_0x7f0b01c7);
                this.f1109 = this.f1102.findViewById(R.id._2_res_0x7f0b01c8);
            }
        }
        this.f1091.setFocusable(false);
        this.f1091.setFocusableInTouchMode(false);
        Context context = this.f1102.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402a4, typedValue, true);
        this.f1097 = typedValue.getFloat();
        context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402a3, typedValue, true);
        this.f1094 = typedValue.getFloat();
        context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402ae, typedValue, true);
        this.f1095 = context.getResources().getInteger(typedValue.resourceId);
        context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402ad, typedValue, true);
        this.f1105 = context.getResources().getInteger(typedValue.resourceId);
        context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402a2, typedValue, true);
        this.f1098 = context.getResources().getInteger(typedValue.resourceId);
        context.getTheme().resolveAttribute(R.attr._2_res_0x7f0402b1, typedValue, true);
        this.f1101 = context.getResources().getDimensionPixelSize(typedValue.resourceId);
        this.f1107 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        context.getResources().getValue(R.dimen._2_res_0x7f07014b, typedValue, true);
        this.f1104 = typedValue.getFloat();
        context.getResources().getValue(R.dimen._2_res_0x7f07013f, typedValue, true);
        this.f1099 = typedValue.getFloat();
        context.getResources().getValue(R.dimen._2_res_0x7f07014a, typedValue, true);
        this.f1110 = typedValue.getFloat();
        context.getResources().getValue(R.dimen._2_res_0x7f07013e, typedValue, true);
        this.f1093 = typedValue.getFloat();
        this.f1108 = GuidanceStylingRelativeLayout.m864(context);
        View view = this.f1092;
        if (view instanceof GuidedActionsRelativeLayout) {
            ((GuidedActionsRelativeLayout) view).f839 = new C0172(this);
        }
        return this.f1102;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m949(boolean z) {
        if (this.f1106 == null && this.f1096 != null) {
            C0180 c0180 = (C0180) this.f1091.getAdapter();
            int iIndexOf = c0180.f1143.indexOf(this.f1096);
            if (iIndexOf < 0) {
                return;
            }
            if (this.f1096.m991()) {
                m951((C0193) this.f1091.m1292(iIndexOf, false), false, z);
            } else {
                m947(null, z);
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int m950() {
        return R.layout._2_res_0x7f0e00a4;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m951(C0193 c0193, boolean z, boolean z2) {
        if (z == (c0193.f1181 != 0) || this.f1106 != null) {
            return;
        }
        C0203 c0203 = c0193.f1184;
        View view = c0193.f1175;
        TextView textView = c0193.f1179;
        TextView textView2 = c0193.f1182;
        if (!z) {
            if (textView != null) {
                textView.setText(c0203.f1208);
            }
            if (textView2 != null) {
                textView2.setText(c0203.f1212);
            }
            int i = c0193.f1181;
            if (i == 2) {
                if (textView2 != null) {
                    textView2.setVisibility(TextUtils.isEmpty(c0203.f1212) ? 8 : 0);
                    textView2.setInputType(c0203.f1203);
                }
            } else if (i == 1) {
                if (textView != null) {
                    textView.setInputType(c0203.f1213);
                }
            } else if (i == 3 && view != null) {
                m946(c0193, z, z2);
            }
            c0193.f1181 = 0;
            return;
        }
        CharSequence charSequence = c0203.f1210;
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        CharSequence charSequence2 = c0203.f1211;
        if (textView2 != null && charSequence2 != null) {
            textView2.setText(charSequence2);
        }
        if (c0203.f1207 == 2) {
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setInputType(c0203.f1204);
                textView2.requestFocusFromTouch();
            }
            c0193.f1181 = 2;
            return;
        }
        if (c0203.m994()) {
            if (textView != null) {
                textView.setInputType(c0203.f1206);
                textView.requestFocusFromTouch();
            }
            c0193.f1181 = 1;
            return;
        }
        if (view != null) {
            m946(c0193, z, z2);
            c0193.f1181 = 3;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C0193 m952(ViewGroup viewGroup) {
        return new C0193(LayoutInflater.from(viewGroup.getContext()).inflate(m950(), viewGroup, false), viewGroup == this.f1100);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m953(C0193 c0193) {
        float f = 0.0f;
        if (!c0193.f1174) {
            C0203 c0203 = this.f1096;
            View view = c0193.f1175;
            View view2 = c0193.f5618;
            if (c0203 == null) {
                view2.setVisibility(0);
                view2.setTranslationY(0.0f);
                if (view != null) {
                    c0193.f1175.setActivated(false);
                    if (view2 instanceof GuidedActionItemContainer) {
                        ((GuidedActionItemContainer) view2).f837 = true;
                    }
                }
            } else if (c0193.f1184 == c0203) {
                view2.setVisibility(0);
                c0193.f1184.getClass();
                if (view != null) {
                    view2.setTranslationY(0.0f);
                    c0193.f1175.setActivated(true);
                    if (view2 instanceof GuidedActionItemContainer) {
                        ((GuidedActionItemContainer) view2).f837 = false;
                    }
                }
            } else {
                view2.setVisibility(4);
                view2.setTranslationY(0.0f);
            }
        }
        ImageView imageView = c0193.f1180;
        if (imageView != null) {
            C0203 c02032 = c0193.f1184;
            boolean z = (c02032.f1202 & 4) == 4;
            if (!z) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            imageView.setAlpha(c02032.m988() ? this.f1097 : this.f1094);
            if (!z) {
                if (c02032 == this.f1096) {
                    imageView.setRotation(270.0f);
                    return;
                } else {
                    imageView.setRotation(90.0f);
                    return;
                }
            }
            ViewGroup viewGroup = this.f1102;
            if (viewGroup != null && viewGroup.getLayoutDirection() == 1) {
                f = 180.0f;
            }
            imageView.setRotation(f);
        }
    }
}
