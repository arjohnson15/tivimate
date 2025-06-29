package p357;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.ViewOnClickListenerC0689;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ᵔˎ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4066 extends AbstractC4065 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f15686;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public EditText f15687;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ViewOnClickListenerC0689 f15688;

    public C4066(C4055 c4055, int i) {
        super(c4055);
        this.f15686 = R.drawable._2_res_0x7f0800b5;
        this.f15688 = new ViewOnClickListenerC0689(14, this);
        if (i != 0) {
            this.f15686 = i;
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ʽᐧ */
    public final void mo9359() {
        m9361();
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˉⁱ */
    public final boolean mo9313() {
        EditText editText = this.f15687;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˋⁱ */
    public final void mo9314(EditText editText) {
        this.f15687 = editText;
        m9361();
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˎٴ */
    public final void mo9315() {
        EditText editText = this.f15687;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f15687.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˏʾ */
    public final boolean mo9360() {
        return true;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ˑʽ */
    public final int mo9318() {
        return R.string._2_res_0x7f130182;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ٴˎ */
    public final View.OnClickListener mo9320() {
        return this.f15688;
    }

    @Override // p357.AbstractC4065
    /* renamed from: ᵎˏ */
    public final void mo9322() {
        EditText editText = this.f15687;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p357.AbstractC4065
    /* renamed from: ﹳﹳ */
    public final int mo9324() {
        return this.f15686;
    }
}
