package p204;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: ˎᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2780 extends ClickableSpan {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2784 f10843;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f10844;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f10845;

    public C2780(int i, C2784 c2784, int i2) {
        this.f10845 = i;
        this.f10843 = c2784;
        this.f10844 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f10845);
        this.f10843.f10848.performAction(this.f10844, bundle);
    }
}
