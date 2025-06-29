package p272;

import ar.tvplayer.tv.player.ui.CustomPlayerView;

/* renamed from: ـᐧ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3335 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ CustomPlayerView f13022;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13023;

    public /* synthetic */ RunnableC3335(CustomPlayerView customPlayerView, int i) {
        this.f13023 = i;
        this.f13022 = customPlayerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13023) {
            case 0:
                this.f13022.f12998.setVisibility(8);
                break;
            default:
                this.f13022.invalidate();
                break;
        }
    }
}
