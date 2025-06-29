package p337;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import p345.AbstractC3985;
import p345.C3963;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3811 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m8899(AudioManager audioManager, C3818 c3818) {
        AudioDeviceInfo[] devices;
        if (c3818 == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c3818.f14697};
        }
        AbstractC3985 abstractC3985M8900 = m8900();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC3985M8900.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private static AbstractC3985 m8900() {
        C3963 c3963 = new C3963(4);
        c3963.m9170(8, 7);
        int i = AbstractC4470.f17202;
        if (i >= 31) {
            c3963.m9170(26, 27);
        }
        if (i >= 33) {
            c3963.m9172(30);
        }
        return c3963.m9175();
    }
}
