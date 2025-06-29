package p337;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.support.v4.media.session.AbstractC0001;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p033.AbstractC1214;
import p166.C2397;
import p220.AbstractC2850;
import p345.AbstractC3980;
import p345.C3961;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3846 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3818 m9053(AudioManager audioManager, C2397 c2397) {
        try {
            audioManager.getClass();
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c2397.m6485().ˆʿ);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C3818(AbstractC2850.m7150(audioDevicesForAttributes.get(0)));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3835 m9054(AudioManager audioManager, C2397 c2397) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c2397.m6485().ˆʿ);
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC0001.m13(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfileM4315 = AbstractC1214.m4315(directProfilesForAttributes.get(i));
            if (audioProfileM4315.getEncapsulationType() != 1) {
                int format = audioProfileM4315.getFormat();
                if (AbstractC4470.m10190(format) || C3835.f14732.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC0001.m13(audioProfileM4315.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC0001.m13(audioProfileM4315.getChannelMasks())));
                    }
                }
            }
        }
        C3961 c3961M9205 = AbstractC3980.m9205();
        for (Map.Entry entry : map.entrySet()) {
            c3961M9205.m9172(new C3813(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C3835(c3961M9205.m9167());
    }
}
