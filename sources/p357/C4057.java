package p357;

import android.text.Editable;
import p220.AbstractC2844;

/* renamed from: ᵔˎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4057 extends AbstractC2844 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C4055 f15633;

    public C4057(C4055 c4055) {
        this.f15633 = c4055;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f15633.m9327().mo9319();
    }

    @Override // p220.AbstractC2844, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f15633.m9327().mo9359();
    }
}
