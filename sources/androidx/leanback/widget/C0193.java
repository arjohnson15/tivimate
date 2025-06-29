package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1375;

/* renamed from: androidx.leanback.widget.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0193 extends AbstractC1375 implements InterfaceC0162 {

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final boolean f1174;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final View f1175;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public Animator f1176;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final ImageView f1177;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final View f1178;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final TextView f1179;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final ImageView f1180;

    /* renamed from: יˋ, reason: contains not printable characters */
    public int f1181;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final TextView f1182;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final ImageView f1183;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public C0203 f1184;

    public C0193(View view, boolean z) {
        super(view);
        this.f1181 = 0;
        C0169 c0169 = new C0169(0, this);
        this.f1178 = view.findViewById(R.id._2_res_0x7f0b01bd);
        this.f1179 = (TextView) view.findViewById(R.id._2_res_0x7f0b01c0);
        this.f1175 = view.findViewById(R.id._2_res_0x7f0b01b8);
        this.f1182 = (TextView) view.findViewById(R.id._2_res_0x7f0b01be);
        this.f1177 = (ImageView) view.findViewById(R.id._2_res_0x7f0b01bf);
        this.f1183 = (ImageView) view.findViewById(R.id._2_res_0x7f0b01bb);
        this.f1180 = (ImageView) view.findViewById(R.id._2_res_0x7f0b01bc);
        this.f1174 = z;
        view.setAccessibilityDelegate(c0169);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m983(boolean z) throws Resources.NotFoundException {
        Animator animator = this.f1176;
        if (animator != null) {
            animator.cancel();
            this.f1176 = null;
        }
        int i = z ? R.attr._2_res_0x7f0402ac : R.attr._2_res_0x7f0402b0;
        View view = this.f5618;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, typedValue.resourceId);
            this.f1176 = animatorLoadAnimator;
            animatorLoadAnimator.setTarget(view);
            this.f1176.addListener(new C0168(0, this));
            this.f1176.start();
        }
    }
}
