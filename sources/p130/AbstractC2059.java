package p130;

import androidx.media3.common.ParserException;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p061.C1403;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p345.C3961;
import p383.AbstractC4464;

/* renamed from: ˉ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2059 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String[] f7799 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String[] f7797 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String[] f7798 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3932 m5724(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C3961 c3961M9205 = AbstractC3980.m9205();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC4464.m10140(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM10149 = AbstractC4464.m10149(xmlPullParser, strConcat3);
                String strM101492 = AbstractC4464.m10149(xmlPullParser, strConcat4);
                String strM101493 = AbstractC4464.m10149(xmlPullParser, strConcat5);
                String strM101494 = AbstractC4464.m10149(xmlPullParser, strConcat6);
                if (strM10149 == null || strM101492 == null) {
                    return C3932.f15274;
                }
                c3961M9205.m9172(new C2056(strM101493 != null ? Long.parseLong(strM101493) : 0L, strM101494 != null ? Long.parseLong(strM101494) : 0L, strM10149));
            }
        } while (!AbstractC4464.m10154(xmlPullParser, strConcat2));
        return c3961M9205.m9167();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1403 m5725(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC4464.m10140(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.m1097("Couldn't find xmp metadata", null);
        }
        C3928 c3928 = AbstractC3980.f15360;
        C3932 c3932M5724 = C3932.f15274;
        long j2 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC4464.m10140(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f7799;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String strM10149 = AbstractC4464.m10149(xmlPullParserNewPullParser, strArr[i2]);
                    if (strM10149 == null) {
                        i2++;
                    } else if (Integer.parseInt(strM10149) == 1) {
                        String[] strArr2 = f7797;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String strM101492 = AbstractC4464.m10149(xmlPullParserNewPullParser, strArr2[i3]);
                            if (strM101492 != null) {
                                j = Long.parseLong(strM101492);
                                if (j == -1) {
                                    break;
                                }
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        String[] strArr3 = f7798;
                        while (true) {
                            if (i >= 2) {
                                C3928 c39282 = AbstractC3980.f15360;
                                c3932M5724 = C3932.f15274;
                                break;
                            }
                            String strM101493 = AbstractC4464.m10149(xmlPullParserNewPullParser, strArr3[i]);
                            if (strM101493 != null) {
                                c3932M5724 = AbstractC3980.m9211(new C2056(0L, 0L, "image/jpeg"), new C2056(Long.parseLong(strM101493), 0L, "video/mp4"));
                                break;
                            }
                            i++;
                        }
                        j2 = j;
                    }
                }
                return null;
            }
            if (AbstractC4464.m10140(xmlPullParserNewPullParser, "Container:Directory")) {
                c3932M5724 = m5724(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC4464.m10140(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c3932M5724 = m5724(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC4464.m10154(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c3932M5724.isEmpty()) {
            return null;
        }
        return new C1403(j2, c3932M5724, 1);
    }
}
