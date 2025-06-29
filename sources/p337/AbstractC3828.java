package p337;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import p166.C2397;
import p345.AbstractC3980;
import p345.AbstractC3986;
import p345.C3961;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3828 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m8942(int i, int i2, C2397 c2397) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM10202 = AbstractC4470.m10202(i3);
            if (iM10202 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM10202).build(), (AudioAttributes) c2397.m6485().ˆʿ)) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static AbstractC3980 m8943(C2397 c2397) {
        C3961 c3961M9205 = AbstractC3980.m9205();
        AbstractC3986 it = C3835.f14732.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (AbstractC4470.f17202 >= AbstractC4470.m10203(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) c2397.m6485().ˆʿ)) {
                c3961M9205.m9172(num);
            }
        }
        c3961M9205.m9172(2);
        return c3961M9205.m9167();
    }
}
