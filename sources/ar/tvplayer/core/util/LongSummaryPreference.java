package ar.tvplayer.core.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.lsposed.hiddenapibypass.library.R;
import p149.C2302;
import p186.AbstractC2593;
import p278.AbstractC3362;
import ˏʼ.ʽᐧ;
import יˏ.ʾˈ;
import יˏ.ˑⁱ;
import יˏ.ᵢٴ;

/* loaded from: classes.dex */
public final class LongSummaryPreference extends Preference {
    public LongSummaryPreference(Context context) {
        this(context, null, 0, 6, null);
    }

    public LongSummaryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LongSummaryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public /* synthetic */ LongSummaryPreference(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr._2_res_0x7f0404a3 : i);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᴵʿ */
    public final void mo1166(C2302 c2302) {
        super.mo1166(c2302);
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ˑⁱ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[209] & 255) + 54)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z = ʾˈ.ـﹶ;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ᵢٴ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[201] & 255) + 59)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (AbstractC3362.f13181 != null && AbstractC3362.f13181[360] != 31) {
            ʾˈ.ʿʼ = false;
            int i3 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i3 / (i3 - 12);
            AbstractC2593.f10315 = AbstractC3362.f13181[11160];
            boolean z3 = ʾˈ.ـﹶ;
        }
        View viewM6346 = c2302.m6346(android.R.id.summary);
        TextView textView = viewM6346 instanceof TextView ? (TextView) viewM6346 : null;
        if (textView != null) {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
    }
}
