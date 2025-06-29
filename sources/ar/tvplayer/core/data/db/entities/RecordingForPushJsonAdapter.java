package ar.tvplayer.core.data.db.entities;

import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p334.C3789;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class RecordingForPushJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2243;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f2244;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2245;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2246 = C3759.m8745("s1", "s2", "fp", "cu", "ocn", "ps1", "ps2", "pt", "pd", "crn", "rr");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2247;

    public RecordingForPushJsonAdapter(C5054 c5054) {
        Class cls = Long.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f2243 = c5054.m11213(cls, c1038, "startSeconds");
        this.f2245 = c5054.m11213(String.class, c1038, "filePath");
        this.f2247 = c5054.m11213(String.class, c1038, "channelUrl");
        this.f2244 = c5054.m11213(Long.class, c1038, "programStartSeconds");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(38, "GeneratedJsonAdapter(RecordingForPush)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Long l4 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (true) {
            Long l5 = l4;
            Long l6 = l3;
            if (!abstractC5050.mo11191()) {
                Long l7 = l2;
                String str8 = str;
                String str9 = str2;
                String str10 = str3;
                abstractC5050.mo11198();
                if (l == null) {
                    throw AbstractC2458.m6573("startSeconds", "s1", abstractC5050);
                }
                long jLongValue = l.longValue();
                if (l7 == null) {
                    throw AbstractC2458.m6573("stopSeconds", "s2", abstractC5050);
                }
                long jLongValue2 = l7.longValue();
                if (str8 == null) {
                    throw AbstractC2458.m6573("filePath", "fp", abstractC5050);
                }
                if (str10 != null) {
                    return new RecordingForPush(jLongValue, jLongValue2, str8, null, null, str9, str10, l6, l5, str4, str5, str6, str7, 24, null);
                }
                throw AbstractC2458.m6573("originalChannelName", "ocn", abstractC5050);
            }
            int iMo11194 = abstractC5050.mo11194(this.f2246);
            String str11 = str2;
            AbstractC5044 abstractC5044 = this.f2243;
            String str12 = str3;
            AbstractC5044 abstractC50442 = this.f2245;
            String str13 = str;
            AbstractC5044 abstractC50443 = this.f2244;
            Long l8 = l2;
            AbstractC5044 abstractC50444 = this.f2247;
            switch (iMo11194) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case 0:
                    l = (Long) abstractC5044.mo1390(abstractC5050);
                    if (l == null) {
                        throw AbstractC2458.m6574("startSeconds", "s1", abstractC5050);
                    }
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case 1:
                    l2 = (Long) abstractC5044.mo1390(abstractC5050);
                    if (l2 == null) {
                        throw AbstractC2458.m6574("stopSeconds", "s2", abstractC5050);
                    }
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case 2:
                    str = (String) abstractC50442.mo1390(abstractC5050);
                    if (str == null) {
                        throw AbstractC2458.m6574("filePath", "fp", abstractC5050);
                    }
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                case 3:
                    str2 = (String) abstractC50444.mo1390(abstractC5050);
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str3 = str12;
                    str = str13;
                case 4:
                    str3 = (String) abstractC50442.mo1390(abstractC5050);
                    if (str3 == null) {
                        throw AbstractC2458.m6574("originalChannelName", "ocn", abstractC5050);
                    }
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str = str13;
                case 5:
                    l3 = (Long) abstractC50443.mo1390(abstractC5050);
                    l2 = l8;
                    l4 = l5;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    l4 = (Long) abstractC50443.mo1390(abstractC5050);
                    l2 = l8;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    str4 = (String) abstractC50444.mo1390(abstractC5050);
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case 8:
                    str5 = (String) abstractC50444.mo1390(abstractC5050);
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case 9:
                    str6 = (String) abstractC50444.mo1390(abstractC5050);
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                case 10:
                    str7 = (String) abstractC50444.mo1390(abstractC5050);
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
                default:
                    l2 = l8;
                    l4 = l5;
                    l3 = l6;
                    str2 = str11;
                    str3 = str12;
                    str = str13;
            }
        }
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        RecordingForPush recordingForPush = (RecordingForPush) obj;
        if (recordingForPush == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("s1");
        Long lValueOf = Long.valueOf(recordingForPush.f2238);
        AbstractC5044 abstractC5044 = this.f2243;
        abstractC5044.mo1391(abstractC5048, lValueOf);
        abstractC5048.mo11174("s2");
        abstractC5044.mo1391(abstractC5048, Long.valueOf(recordingForPush.f2230));
        abstractC5048.mo11174("fp");
        AbstractC5044 abstractC50442 = this.f2245;
        abstractC50442.mo1391(abstractC5048, recordingForPush.f2237);
        abstractC5048.mo11174("cu");
        AbstractC5044 abstractC50443 = this.f2247;
        abstractC50443.mo1391(abstractC5048, recordingForPush.f2239);
        abstractC5048.mo11174("ocn");
        abstractC50442.mo1391(abstractC5048, recordingForPush.f2240);
        abstractC5048.mo11174("ps1");
        AbstractC5044 abstractC50444 = this.f2244;
        abstractC50444.mo1391(abstractC5048, recordingForPush.f2236);
        abstractC5048.mo11174("ps2");
        abstractC50444.mo1391(abstractC5048, recordingForPush.f2242);
        abstractC5048.mo11174("pt");
        abstractC50443.mo1391(abstractC5048, recordingForPush.f2232);
        abstractC5048.mo11174("pd");
        abstractC50443.mo1391(abstractC5048, recordingForPush.f2235);
        abstractC5048.mo11174("crn");
        abstractC50443.mo1391(abstractC5048, recordingForPush.f2233);
        abstractC5048.mo11174("rr");
        abstractC50443.mo1391(abstractC5048, recordingForPush.f2234);
        abstractC5048.mo11178();
    }
}
