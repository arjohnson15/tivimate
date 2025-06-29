package p272;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.datepicker.ViewOnClickListenerC0689;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1375;
import p383.AbstractC4470;

/* renamed from: ـᐧ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3308 extends AbstractC1375 {

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final TextView f12861;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final ImageView f12862;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final /* synthetic */ C3328 f12863;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final TextView f12864;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3308(C3328 c3328, View view) {
        super(view);
        this.f12863 = c3328;
        if (AbstractC4470.f17202 < 26) {
            view.setFocusable(true);
        }
        this.f12864 = (TextView) view.findViewById(R.id._2_res_0x7f0b016b);
        this.f12861 = (TextView) view.findViewById(R.id._2_res_0x7f0b0181);
        this.f12862 = (ImageView) view.findViewById(R.id._2_res_0x7f0b0169);
        view.setOnClickListener(new ViewOnClickListenerC0689(9, this));
    }
}
