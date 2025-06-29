package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class GetProfileResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1893;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1894;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1895 = C3759.m8745("status", "msg", "block_msg");

    public GetProfileResponseJsJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1893 = c5054.m11213(Integer.class, c1038, "status");
        this.f1894 = c5054.m11213(String.class, c1038, "msg");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(42, "GeneratedJsonAdapter(GetProfileResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        String str = null;
        String str2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1895);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 != 0) {
                AbstractC5044 abstractC5044 = this.f1894;
                if (iMo11194 == 1) {
                    str = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 2) {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                }
            } else {
                num = (Integer) this.f1893.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        return new GetProfileResponseJs(num, str, str2);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        GetProfileResponseJs getProfileResponseJs = (GetProfileResponseJs) obj;
        if (getProfileResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("status");
        this.f1893.mo1391(abstractC5048, getProfileResponseJs.f1891);
        abstractC5048.mo11174("msg");
        AbstractC5044 abstractC5044 = this.f1894;
        abstractC5044.mo1391(abstractC5048, getProfileResponseJs.f1889);
        abstractC5048.mo11174("block_msg");
        abstractC5044.mo1391(abstractC5048, getProfileResponseJs.f1890);
        abstractC5048.mo11178();
    }
}
