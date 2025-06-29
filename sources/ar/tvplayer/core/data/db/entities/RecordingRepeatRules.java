package ar.tvplayer.core.data.db.entities;

import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ˉﾞ.ⁱⁱ;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class RecordingRepeatRules {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final transient C3406 f2248 = new C3406(new ⁱⁱ(0, this));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2249;

    public RecordingRepeatRules(@InterfaceC5065(name = "days") String str) {
        this.f2249 = str;
    }

    public final RecordingRepeatRules copy(@InterfaceC5065(name = "days") String str) {
        return new RecordingRepeatRules(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecordingRepeatRules) && AbstractC1549.m5138(this.f2249, ((RecordingRepeatRules) obj).f2249);
    }

    public final int hashCode() {
        return this.f2249.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ˑי(new StringBuilder("RecordingRepeatRules(daysStr="), this.f2249, ')');
    }
}
