package p255;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p204.C2772;
import p204.C2784;
import p448.AbstractC5181;

/* renamed from: יـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3186 extends AbstractC5181 {

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final /* synthetic */ Chip f12323;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3186(Chip chip, Chip chip2) {
        super(chip2);
        this.f12323 = chip;
    }

    @Override // p448.AbstractC5181
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo7854(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.f3233;
        Chip chip = this.f12323;
        if (chip.m2849()) {
            C3189 c3189 = chip.f3237;
            if (c3189 != null && c3189.f12349) {
                z = true;
            }
            if (!z || chip.f3239 == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p448.AbstractC5181
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void mo7855(int i, C2784 c2784) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2784.f10848;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f3233);
            return;
        }
        Chip chip = this.f12323;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string._2_res_0x7f130137, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c2784.m7051(C2772.f10828);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
