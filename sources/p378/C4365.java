package p378;

import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.play_billing.ˎˑ;
import p293.C3474;

/* renamed from: ᵢٴ.ـᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4365 extends ˎˑ {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Window f16867;

    public C4365(Window window, C3474 c3474) {
        this.f16867 = window;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m9947(int i) {
        View decorView = this.f16867.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
