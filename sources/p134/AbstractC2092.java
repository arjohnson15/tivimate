package p134;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser$MissingFieldException;
import com.google.android.gms.internal.measurement.C0314;
import com.google.android.gms.internal.measurement.C0388;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p080.AbstractC1702;
import p334.C3789;
import p417.AbstractC4753;
import p456.AbstractC5355;
import p456.C5292;
import p456.C5301;

/* renamed from: ˉʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2092 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f8266;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f8267;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f8268;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Serializable f8269 = new LinkedList();

    public AbstractC2092(AbstractC2092 abstractC2092, String str, String str2) {
        this.f8267 = abstractC2092;
        this.f8268 = str;
        this.f8266 = str2;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static Boolean m5927(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static long m5928(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e) {
            throw ParserException.m1095(null, e);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static Boolean m5929(String str, C0314 c0314, C5301 c5301) {
        List listM1824;
        AbstractC4753.m10683(c0314);
        if (str == null || !c0314.m1827() || c0314.m1826() == 1) {
            return null;
        }
        if (c0314.m1826() == 7) {
            if (c0314.m1828() == 0) {
                return null;
            }
        } else if (!c0314.m1830()) {
            return null;
        }
        int iM1826 = c0314.m1826();
        boolean zM1825 = c0314.m1825();
        String strM1829 = (zM1825 || iM1826 == 2 || iM1826 == 7) ? c0314.m1829() : c0314.m1829().toUpperCase(Locale.ENGLISH);
        if (c0314.m1828() == 0) {
            listM1824 = null;
        } else {
            listM1824 = c0314.m1824();
            if (!zM1825) {
                ArrayList arrayList = new ArrayList(listM1824.size());
                Iterator it = listM1824.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listM1824 = DesugarCollections.unmodifiableList(arrayList);
            }
        }
        String str2 = iM1826 == 2 ? strM1829 : null;
        if (iM1826 == 7) {
            if (listM1824 == null || listM1824.isEmpty()) {
                return null;
            }
        } else if (strM1829 == null) {
            return null;
        }
        if (!zM1825 && iM1826 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (AbstractC5355.f20780[AbstractC1702.m5411(iM1826)]) {
            case 1:
                if (str2 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        c5301.f20568.m4531(str2, "Invalid regular expression in REGEXP audience filter. expression");
                        return null;
                    }
                }
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                if (listM1824 != null) {
                    break;
                }
                break;
        }
        return null;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m5930(XmlPullParser xmlPullParser, String str) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw ParserException.m1095(null, e);
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static Boolean m5931(long j, C0388 c0388) {
        try {
            return m5932(new BigDecimal(j), c0388, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static Boolean m5932(BigDecimal bigDecimal, C0388 c0388, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC4753.m10683(c0388);
        if (c0388.m2120()) {
            if (c0388.m2116() != 1) {
                if (c0388.m2116() == 5) {
                    if (!c0388.m2112() || !c0388.m2118()) {
                        return null;
                    }
                } else if (!c0388.m2119()) {
                    return null;
                }
                int iM2116 = c0388.m2116();
                if (c0388.m2116() == 5) {
                    if (C5292.m11877(c0388.m2111()) && C5292.m11877(c0388.m2117())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c0388.m2111());
                            bigDecimal4 = new BigDecimal(c0388.m2117());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C5292.m11877(c0388.m2115())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c0388.m2115());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iM2116 == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 != null) {
                }
                int i = AbstractC5355.f20779[AbstractC1702.m5411(iM2116)];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && bigDecimal3 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                            }
                            return null;
                        }
                        if (bigDecimal2 != null) {
                            if (d != 0.0d) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                            }
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                    } else if (bigDecimal2 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
            }
        }
        return null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m5933(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new SsManifestParser$MissingFieldException(str);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw ParserException.m1095(null, e);
        }
    }

    /* renamed from: ʽᐧ */
    public abstract Object mo5920();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object m5934(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            AbstractC2092 c2087 = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (((String) this.f8266).equals(name)) {
                    mo5921(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (mo5924(name)) {
                        mo5921(xmlPullParser);
                    } else {
                        boolean zEquals = "QualityLevel".equals(name);
                        String str = (String) this.f8268;
                        if (zEquals) {
                            c2087 = new C2090(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            c2087 = new C2086(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            c2087 = new C2087(this, str);
                        }
                        if (c2087 == null) {
                            i = 1;
                        } else {
                            mo5925(c2087.m5934(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    mo5922(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                mo5923(xmlPullParser);
                if (!mo5924(name2)) {
                    return mo5920();
                }
            }
            xmlPullParser.next();
        }
    }

    /* renamed from: ˉי */
    public abstract void mo5921(XmlPullParser xmlPullParser);

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m5935(Object obj, String str) {
        ((LinkedList) this.f8269).add(Pair.create(str, obj));
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public abstract int mo5936();

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public abstract boolean mo5937();

    /* renamed from: ˏʾ */
    public void mo5922(XmlPullParser xmlPullParser) {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object m5938(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = (LinkedList) this.f8269;
            if (i >= linkedList.size()) {
                AbstractC2092 abstractC2092 = (AbstractC2092) this.f8267;
                if (abstractC2092 == null) {
                    return null;
                }
                return abstractC2092.m5938(str);
            }
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i++;
        }
    }

    /* renamed from: ـﹶ */
    public void mo5925(Object obj) {
    }

    /* renamed from: ٴˎ */
    public void mo5923(XmlPullParser xmlPullParser) {
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public abstract boolean mo5939();

    /* renamed from: ﹳﹳ */
    public boolean mo5924(String str) {
        return false;
    }
}
