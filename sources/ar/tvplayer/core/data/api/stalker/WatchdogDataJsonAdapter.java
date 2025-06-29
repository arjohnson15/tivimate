package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class WatchdogDataJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2045;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2046 = C3759.m8745("msgs");

    public WatchdogDataJsonAdapter(C5054 c5054) {
        this.f2045 = c5054.m11213(Integer.class, C1038.f4437, "msgs");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(34, "GeneratedJsonAdapter(WatchdogData)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2046);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                num = (Integer) this.f2045.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        return new WatchdogData(num);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        WatchdogData watchdogData = (WatchdogData) obj;
        if (watchdogData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("msgs");
        this.f2045.mo1391(abstractC5048, watchdogData.f2044);
        abstractC5048.mo11178();
    }
}
