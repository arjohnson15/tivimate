package p438;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p166.C2397;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p396.AbstractC4569;

/* renamed from: ﹶﾞ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5092 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5072 f19366;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f19367;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public AudioFocusRequest f19368;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public SurfaceHolderCallbackC5075 f19369;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AudioManager f19370;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f19371;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f19372 = 1.0f;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2397 f19373;

    public C5092(Context context, Handler handler, SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f19370 = audioManager;
        this.f19369 = surfaceHolderCallbackC5075;
        this.f19366 = new C5072(this, handler);
        this.f19367 = 0;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11292(C2397 c2397) {
        if (AbstractC4470.m10194(this.f19373, c2397)) {
            return;
        }
        this.f19373 = c2397;
        int i = c2397 == null ? 0 : 1;
        this.f19371 = i;
        AbstractC4464.m10124("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11293(int i) {
        if (this.f19367 == i) {
            return;
        }
        this.f19367 = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f19372 == f) {
            return;
        }
        this.f19372 = f;
        SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075 = this.f19369;
        if (surfaceHolderCallbackC5075 != null) {
            C5118 c5118 = surfaceHolderCallbackC5075.f19247;
            c5118.m11359(1, 2, Float.valueOf(c5118.f19561 * c5118.f19573.f19372));
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11294() {
        int i = this.f19367;
        if (i == 1 || i == 0) {
            return;
        }
        int i2 = AbstractC4470.f17202;
        AudioManager audioManager = this.f19370;
        if (i2 < 26) {
            audioManager.abandonAudioFocus(this.f19366);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f19368;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m11295(int i, boolean z) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderM10450;
        boolean z2 = false;
        if (i == 1 || this.f19371 != 1) {
            m11294();
            m11293(0);
            return 1;
        }
        if (!z) {
            int i2 = this.f19367;
            if (i2 != 1) {
                return i2 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f19367 == 2) {
            return 1;
        }
        int i3 = AbstractC4470.f17202;
        AudioManager audioManager = this.f19370;
        C5072 c5072 = this.f19366;
        if (i3 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f19368;
            if (audioFocusRequest == null) {
                if (audioFocusRequest == null) {
                    AbstractC4569.m10440();
                    builderM10450 = AbstractC4569.m10438(this.f19371);
                } else {
                    AbstractC4569.m10440();
                    builderM10450 = AbstractC4569.m10450(this.f19368);
                }
                C2397 c2397 = this.f19373;
                if (c2397 != null && c2397.f9464 == 1) {
                    z2 = true;
                }
                c2397.getClass();
                this.f19368 = builderM10450.setAudioAttributes((AudioAttributes) c2397.m6485().ˆʿ).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(c5072).build();
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(this.f19368);
        } else {
            this.f19373.getClass();
            iRequestAudioFocus = audioManager.requestAudioFocus(c5072, 3, this.f19371);
        }
        if (iRequestAudioFocus == 1) {
            m11293(2);
            return 1;
        }
        m11293(1);
        return -1;
    }
}
