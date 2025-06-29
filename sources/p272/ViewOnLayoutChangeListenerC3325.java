package p272;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.ui.SubtitleView;
import ar.tvplayer.tv.player.ui.CustomPlayerView;
import java.util.List;
import p112.C1811;
import p166.C2396;
import p166.C2397;
import p166.C2401;
import p166.C2402;
import p166.C2409;
import p166.C2410;
import p166.C2412;
import p166.C2421;
import p166.C2427;
import p166.C2437;
import p166.C2441;
import p166.InterfaceC2419;
import p166.InterfaceC2446;
import p383.AbstractC4470;
import p438.C5118;

/* renamed from: ـᐧ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC3325 implements InterfaceC2446, View.OnLayoutChangeListener, View.OnClickListener, InterfaceC3310, InterfaceC3338 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f12890;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ CustomPlayerView f12891;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2412 f12892 = new C2412();

    public ViewOnLayoutChangeListenerC3325(CustomPlayerView customPlayerView) {
        this.f12891 = customPlayerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12891.m8147();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractC3332.m8142((TextureView) view, this.f12891.f12987);
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʾʼ */
    public final void mo4340(C2437 c2437) {
        CustomPlayerView customPlayerView;
        InterfaceC2419 interfaceC2419;
        if (c2437.equals(C2437.f9721) || (interfaceC2419 = (customPlayerView = this.f12891).f13012) == null || ((C5118) interfaceC2419).m11361() == 1) {
            return;
        }
        customPlayerView.m8156();
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʿʼ */
    public final /* synthetic */ void mo4341(C2427 c2427) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ʿˏ */
    public final void mo4342(int i, boolean z) {
        CustomPlayerView customPlayerView = this.f12891;
        customPlayerView.ˏᴵ();
        if (!customPlayerView.m8155() || !customPlayerView.f12986) {
            customPlayerView.m8151(false);
            return;
        }
        C3328 c3328 = customPlayerView.f12988;
        if (c3328 != null) {
            c3328.m8133();
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˉי */
    public final /* synthetic */ void mo4343(int i) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋˉ */
    public final /* synthetic */ void mo4344(ExoPlaybackException exoPlaybackException) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋˊ */
    public final /* synthetic */ void mo4345(float f) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˋⁱ */
    public final /* synthetic */ void mo4346(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˎٴ */
    public final /* synthetic */ void mo4347(List list) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏʾ */
    public final void mo4349(int i, C2396 c2396, C2396 c23962) {
        C3328 c3328;
        CustomPlayerView customPlayerView = this.f12891;
        if (customPlayerView.m8155() && customPlayerView.f12986 && (c3328 = customPlayerView.f12988) != null) {
            c3328.m8133();
        }
        if (i == 1 || i == 4) {
            customPlayerView.ˏᴵ();
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏᴵ */
    public final void mo4350() {
        CustomPlayerView customPlayerView = this.f12891;
        customPlayerView.f13004 = true;
        View view = customPlayerView.f12998;
        if (view != null && view.getVisibility() == 0) {
            view.animate().alpha(0.0f).withLayer().setDuration(150L).withEndAction(new RunnableC3335(customPlayerView, 0));
        }
        customPlayerView.f13006 = false;
        if (!customPlayerView.m8160()) {
            customPlayerView.m8154();
            return;
        }
        ImageView imageView = customPlayerView.f13017;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˏᵢ */
    public final /* synthetic */ void mo4351(C2409 c2409) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑʽ */
    public final /* synthetic */ void mo4352(int i) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑי */
    public final /* synthetic */ void mo4353(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ˑﾞ */
    public final /* synthetic */ void mo4355(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ـˆ */
    public final /* synthetic */ void mo4356(C2402 c2402, int i) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ـﹶ */
    public final /* synthetic */ void mo4357(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    @Override // p166.InterfaceC2446
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4358(p166.C2398 r8) {
        /*
            r7 = this;
            ar.tvplayer.tv.player.ui.CustomPlayerView r8 = r7.f12891
            ˊﹶ.ˑﾞ r0 = r8.f13012
            r0.getClass()
            r1 = r0
            ʿﾞ.ﹳﹳ r1 = (ʿﾞ.ﹳﹳ) r1
            r2 = 17
            boolean r2 = r1.ٴᐧ(r2)
            if (r2 == 0) goto L1a
            r2 = r0
            ﹶﾞ.ﾞʽ r2 = (p438.C5118) r2
            ˊﹶ.ʻʿ r2 = r2.m11369()
            goto L1c
        L1a:
            ˊﹶ.ᵢٴ r2 = p166.AbstractC2394.f9448
        L1c:
            boolean r3 = r2.m6477()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L27
            r7.f12890 = r5
            goto L6a
        L27:
            r3 = 30
            boolean r1 = r1.ٴᐧ(r3)
            ˊﹶ.ˎᵔ r3 = r7.f12892
            if (r1 == 0) goto L4e
            r1 = r0
            ﹶﾞ.ﾞʽ r1 = (p438.C5118) r1
            ˊﹶ.ʿˊ r6 = r1.m11367()
            ᵎᴵ.ﹳﹶ r6 = r6.f9466
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L4e
            int r0 = r1.m11377()
            r1 = 1
            ˊﹶ.ˎᵔ r0 = r2.mo6180(r0, r3, r1)
            java.lang.Object r0 = r0.f9574
            r7.f12890 = r0
            goto L6a
        L4e:
            java.lang.Object r1 = r7.f12890
            if (r1 == 0) goto L6a
            int r1 = r2.mo6469(r1)
            r6 = -1
            if (r1 == r6) goto L68
            ˊﹶ.ˎᵔ r1 = r2.mo6180(r1, r3, r4)
            int r1 = r1.f9576
            ﹶﾞ.ﾞʽ r0 = (p438.C5118) r0
            int r0 = r0.m11386()
            if (r0 != r1) goto L68
            return
        L68:
            r7.f12890 = r5
        L6a:
            r8.m8148(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p272.ViewOnLayoutChangeListenerC3325.mo4358(ˊﹶ.ʿˊ):void");
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᐧˋ */
    public final /* synthetic */ void mo4359(boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᐧⁱ */
    public final void mo4360(int i) {
        CustomPlayerView customPlayerView = this.f12891;
        customPlayerView.ˏᴵ();
        customPlayerView.m8158();
        if (!customPlayerView.m8155() || !customPlayerView.f12986) {
            customPlayerView.m8151(false);
            return;
        }
        C3328 c3328 = customPlayerView.f12988;
        if (c3328 != null) {
            c3328.m8133();
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᴵʿ */
    public final /* synthetic */ void mo4361(C2441 c2441) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᵎـ */
    public final /* synthetic */ void mo4362(ExoPlaybackException exoPlaybackException) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ᵢʿ */
    public final void mo4365(int i, int i2) {
        if (AbstractC4470.f17202 == 34) {
            CustomPlayerView customPlayerView = this.f12891;
            View view = customPlayerView.f13007;
            if (view instanceof SurfaceView) {
                C3302 c3302 = customPlayerView.f13014;
                c3302.getClass();
                c3302.m8106(customPlayerView.f13015, (SurfaceView) view, new RunnableC3335(customPlayerView, 1));
            }
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳˎ */
    public final /* synthetic */ void mo4367(int i, boolean z) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳˑ */
    public final /* synthetic */ void mo4368(C2401 c2401) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo4369(C2421 c2421) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﹶˆ */
    public final void mo4370(C1811 c1811) {
        SubtitleView subtitleView = this.f12891.f13003;
        if (subtitleView != null) {
            subtitleView.setCues(c1811.f7009);
        }
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﾞʽ */
    public final /* synthetic */ void mo4371(C2397 c2397) {
    }

    @Override // p166.InterfaceC2446
    /* renamed from: ﾞᐧ */
    public final /* synthetic */ void mo4372(C2410 c2410) {
    }
}
