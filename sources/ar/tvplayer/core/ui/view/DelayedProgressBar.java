package ar.tvplayer.core.ui.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p385.RunnableC4478;

/* loaded from: classes.dex */
public final class DelayedProgressBar extends ProgressBar {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ int f2280 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final RunnableC4478 f2281;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f2282;

    public DelayedProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.progressBarStyle);
        this.f2281 = new RunnableC4478(1, this);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m1477(DelayedProgressBar delayedProgressBar) {
        RunnableC4478 runnableC4478 = delayedProgressBar.f2281;
        delayedProgressBar.removeCallbacks(runnableC4478);
        delayedProgressBar.postDelayed(runnableC4478, 1000L);
        delayedProgressBar.f2282 = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2281);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1478() {
        removeCallbacks(this.f2281);
        setVisibility(8);
        this.f2282 = false;
    }
}
