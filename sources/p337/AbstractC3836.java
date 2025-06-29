package p337;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: ᵎˆ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3836 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8984(Context context, AudioDeviceCallback audioDeviceCallback) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8985(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }
}
