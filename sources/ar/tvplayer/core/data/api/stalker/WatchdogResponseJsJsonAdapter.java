package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class WatchdogResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2049;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2050 = C3759.m8745("data");

    public WatchdogResponseJsJsonAdapter(C5054 c5054) {
        this.f2049 = c5054.m11213(WatchdogData.class, C1038.f4437, "data");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(40, "GeneratedJsonAdapter(WatchdogResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        WatchdogData watchdogData = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2050);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                watchdogData = (WatchdogData) this.f2049.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        return new WatchdogResponseJs(watchdogData);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        WatchdogResponseJs watchdogResponseJs = (WatchdogResponseJs) obj;
        if (watchdogResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("data");
        this.f2049.mo1391(abstractC5048, watchdogResponseJs.f2048);
        abstractC5048.mo11178();
    }
}
