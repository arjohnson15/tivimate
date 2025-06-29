package p337;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.C0372;
import ـˈ.ˎـ;

/* renamed from: ᵎˆ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3823 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0372 f14701;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C3815 f14702 = new AudioRouting.OnRoutingChangedListener() { // from class: ᵎˆ.ˆʿ
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.f14683.m8939(audioRouting);
        }
    };

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AudioTrack f14703;

    /* JADX WARN: Type inference failed for: r3v1, types: [ᵎˆ.ˆʿ] */
    public C3823(AudioTrack audioTrack, C0372 c0372) {
        this.f14703 = audioTrack;
        this.f14701 = c0372;
        ˎـ.ˑי(audioTrack, this.f14702, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m8939(AudioRouting audioRouting) {
        if (this.f14702 == null || ˎـ.ʿʼ(audioRouting) == null) {
            return;
        }
        this.f14701.m2082(ˎـ.ʿʼ(audioRouting));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m8941() {
        C3815 c3815 = this.f14702;
        c3815.getClass();
        ˎـ.ˏᴵ(this.f14703, c3815);
        this.f14702 = null;
    }
}
