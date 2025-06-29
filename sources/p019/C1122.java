package p019;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import p192.AbstractC2669;

/* renamed from: ʻﹳ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1122 extends AbstractC2669 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final WeakReference f4743;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4744 = 0;

    public C1122(EditText editText) {
        this.f4743 = new WeakReference(editText);
    }

    public C1122(SwitchCompat switchCompat) {
        this.f4743 = new WeakReference(switchCompat);
    }

    @Override // p192.AbstractC2669
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo4132() {
        switch (this.f4744) {
            case 0:
                C1128.m4144((EditText) this.f4743.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f4743.get();
                if (switchCompat != null) {
                    switchCompat.m140();
                    break;
                }
                break;
        }
    }

    @Override // p192.AbstractC2669
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo4133() {
        switch (this.f4744) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f4743.get();
                if (switchCompat != null) {
                    switchCompat.m140();
                    break;
                }
                break;
        }
    }
}
