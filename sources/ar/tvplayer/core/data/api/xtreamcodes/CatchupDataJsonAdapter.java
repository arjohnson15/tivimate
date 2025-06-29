package ar.tvplayer.core.data.api.xtreamcodes;

import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class CatchupDataJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2056;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2057;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2058 = C3759.m8745("stream_id", "tv_archive_duration");

    public CatchupDataJsonAdapter(C5054 c5054) {
        Class cls = Integer.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f2056 = c5054.m11213(cls, c1038, "streamId");
        this.f2057 = c5054.m11213(Integer.class, c1038, "tvArchiveDuration");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(33, "GeneratedJsonAdapter(CatchupData)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        Integer num2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2058);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                num = (Integer) this.f2056.mo1390(abstractC5050);
                if (num == null) {
                    throw AbstractC2458.m6574("streamId", "stream_id", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                num2 = (Integer) this.f2057.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (num != null) {
            return new CatchupData(num.intValue(), num2);
        }
        throw AbstractC2458.m6573("streamId", "stream_id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        CatchupData catchupData = (CatchupData) obj;
        if (catchupData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("stream_id");
        this.f2056.mo1391(abstractC5048, Integer.valueOf(catchupData.f2055));
        abstractC5048.mo11174("tv_archive_duration");
        this.f2057.mo1391(abstractC5048, catchupData.f2053);
        abstractC5048.mo11178();
    }
}
