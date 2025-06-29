package p357;

import android.view.View;
import com.google.android.gms.internal.play_billing.ˎˑ;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: ᵔˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4069 extends AbstractC4065 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f15702;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4069(C4055 c4055, int i) {
        super(c4055);
        this.f15702 = i;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˎٴ */
    public void mo9315() {
        switch (this.f15702) {
            case 0:
                C4055 c4055 = this.f15682;
                c4055.f15621 = null;
                CheckableImageButton checkableImageButton = c4055.f15622;
                checkableImageButton.setOnLongClickListener(null);
                ˎˑ.ﾞˊ(checkableImageButton, (View.OnLongClickListener) null);
                break;
        }
    }
}
