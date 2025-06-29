package p378;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.internal.play_billing.ˎˑ;
import p293.C3474;

/* renamed from: ᵢٴ.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4358 extends ˎˑ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Window f16863;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final WindowInsetsController f16864;

    public C4358(WindowInsetsController windowInsetsController, C3474 c3474) {
        this.f16864 = windowInsetsController;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m9933(boolean z) {
        Window window = this.f16863;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f16864.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f16864.setSystemBarsAppearance(0, 16);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m9934(boolean z) {
        Window window = this.f16863;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f16864.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f16864.setSystemBarsAppearance(0, 8);
    }
}
