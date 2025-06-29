package p438;

import android.media.AudioManager;
import android.os.Handler;
import p290.RunnableC3408;

/* renamed from: ﹶﾞ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5072 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C5092 f19229;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Handler f19230;

    public C5072(C5092 c5092, Handler handler) {
        this.f19229 = c5092;
        this.f19230 = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f19230.post(new RunnableC3408(i, 2, this));
    }
}
