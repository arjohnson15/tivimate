package p337;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.google.android.gms.internal.measurement.C0372;
import p166.C2397;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3827 extends AudioDeviceCallback {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0372 f14717;

    public C3827(C0372 c0372) {
        this.f14717 = c0372;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0372 c0372 = this.f14717;
        c0372.m2083(C3835.m8980((Context) c0372.f2629, (C2397) c0372.f2631, (C3818) c0372.f2638));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (AbstractC4470.m10174(audioDeviceInfoArr, (C3818) this.f14717.f2638)) {
            this.f14717.f2638 = null;
        }
        C0372 c0372 = this.f14717;
        c0372.m2083(C3835.m8980((Context) c0372.f2629, (C2397) c0372.f2631, (C3818) c0372.f2638));
    }
}
