package p378;

import android.view.View;
import android.view.Window;

/* renamed from: ᵢٴ.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4376 extends C4379 {
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m9960(boolean z) {
        if (!z) {
            m9947(16);
            return;
        }
        Window window = this.f16867;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
