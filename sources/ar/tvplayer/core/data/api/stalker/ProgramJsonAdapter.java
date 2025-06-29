package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class ProgramJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1916;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1917;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1918 = C3759.m8745("name", "descr", "start_timestamp", "stop_timestamp");

    public ProgramJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1916 = c5054.m11213(String.class, c1038, "name");
        this.f1917 = c5054.m11213(Long.class, c1038, "startSeconds");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(29, "GeneratedJsonAdapter(Program)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1918);
            if (iMo11194 != -1) {
                AbstractC5044 abstractC5044 = this.f1916;
                if (iMo11194 == 0) {
                    str = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 != 1) {
                    AbstractC5044 abstractC50442 = this.f1917;
                    if (iMo11194 == 2) {
                        l = (Long) abstractC50442.mo1390(abstractC5050);
                    } else if (iMo11194 == 3) {
                        l2 = (Long) abstractC50442.mo1390(abstractC5050);
                    }
                } else {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                }
            } else {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            }
        }
        abstractC5050.mo11198();
        return new Program(str, str2, l, l2);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        Program program = (Program) obj;
        if (program == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("name");
        AbstractC5044 abstractC5044 = this.f1916;
        abstractC5044.mo1391(abstractC5048, program.f1909);
        abstractC5048.mo11174("descr");
        abstractC5044.mo1391(abstractC5048, program.f1907);
        abstractC5048.mo11174("start_timestamp");
        AbstractC5044 abstractC50442 = this.f1917;
        abstractC50442.mo1391(abstractC5048, program.f1908);
        abstractC5048.mo11174("stop_timestamp");
        abstractC50442.mo1391(abstractC5048, program.f1910);
        abstractC5048.mo11178();
    }
}
