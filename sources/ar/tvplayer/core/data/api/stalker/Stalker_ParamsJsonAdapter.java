package ar.tvplayer.core.data.api.stalker;

import java.lang.reflect.Constructor;
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
public final class Stalker_ParamsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1973;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1974;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1975 = C3759.m8745("s", "rs", "ua", "l", "sv", "u", "p", "m", "di", "di2", "sn", "adid");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile Constructor f1976;

    public Stalker_ParamsJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1973 = c5054.m11213(String.class, c1038, "serverAddress");
        this.f1974 = c5054.m11213(Integer.TYPE, c1038, "userAgentVariant");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(36, "GeneratedJsonAdapter(Stalker.Params)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws NoSuchMethodException, SecurityException {
        Integer num = 0;
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i = -1;
        while (abstractC5050.mo11191()) {
            switch (abstractC5050.mo11194(this.f1975)) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    break;
                case 0:
                    str = (String) this.f1973.mo1390(abstractC5050);
                    if (str == null) {
                        throw AbstractC2458.m6574("serverAddress", "s", abstractC5050);
                    }
                    break;
                case 1:
                    str2 = (String) this.f1973.mo1390(abstractC5050);
                    if (str2 == null) {
                        throw AbstractC2458.m6574("redirectedServerAddress", "rs", abstractC5050);
                    }
                    i &= -5;
                    break;
                case 2:
                    num = (Integer) this.f1974.mo1390(abstractC5050);
                    if (num == null) {
                        throw AbstractC2458.m6574("userAgentVariant", "ua", abstractC5050);
                    }
                    i &= -9;
                    break;
                case 3:
                    str3 = (String) this.f1973.mo1390(abstractC5050);
                    if (str3 == null) {
                        throw AbstractC2458.m6574("loader", "l", abstractC5050);
                    }
                    i &= -17;
                    break;
                case 4:
                    str4 = (String) this.f1973.mo1390(abstractC5050);
                    if (str4 == null) {
                        throw AbstractC2458.m6574("stalkerVersion", "sv", abstractC5050);
                    }
                    i &= -33;
                    break;
                case 5:
                    str5 = (String) this.f1973.mo1390(abstractC5050);
                    if (str5 == null) {
                        throw AbstractC2458.m6574("username", "u", abstractC5050);
                    }
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str6 = (String) this.f1973.mo1390(abstractC5050);
                    if (str6 == null) {
                        throw AbstractC2458.m6574("password", "p", abstractC5050);
                    }
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    str7 = (String) this.f1973.mo1390(abstractC5050);
                    if (str7 == null) {
                        throw AbstractC2458.m6574("macAddress", "m", abstractC5050);
                    }
                    break;
                case 8:
                    str8 = (String) this.f1973.mo1390(abstractC5050);
                    if (str8 == null) {
                        throw AbstractC2458.m6574("deviceId", "di", abstractC5050);
                    }
                    i &= -513;
                    break;
                case 9:
                    str9 = (String) this.f1973.mo1390(abstractC5050);
                    if (str9 == null) {
                        throw AbstractC2458.m6574("deviceId2", "di2", abstractC5050);
                    }
                    i &= -1025;
                    break;
                case 10:
                    str10 = (String) this.f1973.mo1390(abstractC5050);
                    if (str10 == null) {
                        throw AbstractC2458.m6574("serialNumber", "sn", abstractC5050);
                    }
                    i &= -2049;
                    break;
                case 11:
                    str11 = (String) this.f1973.mo1390(abstractC5050);
                    if (str11 == null) {
                        throw AbstractC2458.m6574("adid", "adid", abstractC5050);
                    }
                    i &= -4097;
                    break;
            }
        }
        abstractC5050.mo11198();
        if (i == -7741) {
            if (str == null) {
                throw AbstractC2458.m6573("serverAddress", "s", abstractC5050);
            }
            int iIntValue = num.intValue();
            if (str5 == null) {
                throw AbstractC2458.m6573("username", "u", abstractC5050);
            }
            if (str6 == null) {
                throw AbstractC2458.m6573("password", "p", abstractC5050);
            }
            if (str7 != null) {
                return new Stalker$Params(0L, str, str2, iIntValue, str3, str4, str5, str6, str7, str8, str9, str10, str11, 1, null);
            }
            throw AbstractC2458.m6573("macAddress", "m", abstractC5050);
        }
        Constructor declaredConstructor = this.f1976;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Stalker$Params.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, AbstractC2458.f9786);
            this.f1976 = declaredConstructor;
        }
        if (str == null) {
            throw AbstractC2458.m6573("serverAddress", "s", abstractC5050);
        }
        if (str5 == null) {
            throw AbstractC2458.m6573("username", "u", abstractC5050);
        }
        if (str6 == null) {
            throw AbstractC2458.m6573("password", "p", abstractC5050);
        }
        if (str7 != null) {
            return (Stalker$Params) declaredConstructor.newInstance(0L, str, str2, num, str3, str4, str5, str6, str7, str8, str9, str10, str11, Integer.valueOf(i), null);
        }
        throw AbstractC2458.m6573("macAddress", "m", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        Stalker$Params stalker$Params = (Stalker$Params) obj;
        if (stalker$Params == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("s");
        AbstractC5044 abstractC5044 = this.f1973;
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1939);
        abstractC5048.mo11174("rs");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1948);
        abstractC5048.mo11174("ua");
        this.f1974.mo1391(abstractC5048, Integer.valueOf(stalker$Params.f1957));
        abstractC5048.mo11174("l");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1940);
        abstractC5048.mo11174("sv");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1951);
        abstractC5048.mo11174("u");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1952);
        abstractC5048.mo11174("p");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1947);
        abstractC5048.mo11174("m");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1958);
        abstractC5048.mo11174("di");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1941);
        abstractC5048.mo11174("di2");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1945);
        abstractC5048.mo11174("sn");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1942);
        abstractC5048.mo11174("adid");
        abstractC5044.mo1391(abstractC5048, stalker$Params.f1943);
        abstractC5048.mo11178();
    }
}
