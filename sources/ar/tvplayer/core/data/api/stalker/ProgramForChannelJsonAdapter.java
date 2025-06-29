package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class ProgramForChannelJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1913;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1914;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1915 = C3759.m8745("id", "start_timestamp");

    public ProgramForChannelJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1913 = c5054.m11213(String.class, c1038, "id");
        this.f1914 = c5054.m11213(Long.TYPE, c1038, "startSeconds");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(39, "GeneratedJsonAdapter(ProgramForChannel)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        Long l = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1915);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f1913.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("id", "id", abstractC5050);
                }
            } else if (iMo11194 == 1 && (l = (Long) this.f1914.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("startSeconds", "start_timestamp", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (str == null) {
            throw AbstractC2458.m6573("id", "id", abstractC5050);
        }
        if (l != null) {
            return new ProgramForChannel(str, l.longValue());
        }
        throw AbstractC2458.m6573("startSeconds", "start_timestamp", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        ProgramForChannel programForChannel = (ProgramForChannel) obj;
        if (programForChannel == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1913.mo1391(abstractC5048, programForChannel.f1912);
        abstractC5048.mo11174("start_timestamp");
        this.f1914.mo1391(abstractC5048, Long.valueOf(programForChannel.f1911));
        abstractC5048.mo11178();
    }
}
