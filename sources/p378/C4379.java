package p378;

import android.view.View;
import android.view.Window;

/* renamed from: ᵢٴ.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4379 extends C4365 {
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m9961(boolean z) {
        if (!z) {
            m9947(8192);
            return;
        }
        Window window = this.f16867;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}
