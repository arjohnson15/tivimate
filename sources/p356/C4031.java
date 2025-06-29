package p356;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000.C0876;
import p076.InterfaceC1668;
import p260.C3222;
import p345.AbstractC3968;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p395.AbstractC4535;

/* renamed from: ᵔˋ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4031 extends DefaultHandler implements InterfaceC1668 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final XmlPullParserFactory f15509;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final Pattern f15505 = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final Pattern f15507 = Pattern.compile("CC([1-4])=.*");

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final Pattern f15508 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final int[] f15506 = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public C4031() {
        try {
            this.f15509 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m9272(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (AbstractC4464.m10153(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (AbstractC4464.m10153(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static ArrayList m9273(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                m9272(xmlPullParser);
            }
        } while (!AbstractC4464.m10154(xmlPullParser, "BaseURL"));
        if (text != null && AbstractC4464.m10125(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC3968.m9188(new C4030(i, i2, text, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C4030 c4030 = (C4030) list.get(i3);
            String strM10145 = AbstractC4464.m10145(c4030.f15503, text);
            String str = attributeValue3 == null ? strM10145 : attributeValue3;
            if (z) {
                i = c4030.f15502;
                i2 = c4030.f15504;
                str = c4030.f15501;
            }
            arrayList.add(new C4030(i, i2, strM10145, str));
        }
        return arrayList;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static float m9274(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f15505.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static long m9275(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125 A[SYNTHETIC] */
    /* renamed from: ˋˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p260.C3222 m9276(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, p260.C3222 r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p356.C4031.m9276(org.xmlpull.v1.XmlPullParser, java.lang.String, יﹶ.ـﹶ):יﹶ.ـﹶ");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0c5c A[LOOP:11: B:193:0x0691->B:435:0x0c5c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0f86 A[LOOP:5: B:129:0x03e3->B:533:0x0f86, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x136f A[LOOP:1: B:43:0x00cf->B:634:0x136f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x133b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0dfa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x08ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x09b7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p356.C4039 m9277(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 5048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p356.C4031.m9277(org.xmlpull.v1.XmlPullParser, android.net.Uri):ᵔˋ.ˑʽ");
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C4037 m9278(XmlPullParser xmlPullParser, C4037 c4037, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException, NumberFormatException {
        long jM9275 = m9275(xmlPullParser, "timescale", c4037 != null ? c4037.f15564 : 1L);
        long jM92752 = m9275(xmlPullParser, "presentationTimeOffset", c4037 != null ? c4037.f15565 : 0L);
        long jM92753 = m9275(xmlPullParser, "duration", c4037 != null ? c4037.f15558 : -9223372036854775807L);
        long jM92754 = m9275(xmlPullParser, "startNumber", c4037 != null ? c4037.f15562 : 1L);
        long j6 = j4 == -9223372036854775807L ? j3 : j4;
        long j7 = j6 == Long.MAX_VALUE ? -9223372036854775807L : j6;
        List arrayList = null;
        C4032 c4032M9287 = null;
        List listM9290 = null;
        do {
            xmlPullParser.next();
            if (AbstractC4464.m10140(xmlPullParser, "Initialization")) {
                c4032M9287 = m9287(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC4464.m10140(xmlPullParser, "SegmentTimeline")) {
                listM9290 = m9290(xmlPullParser, jM9275, j2);
            } else if (AbstractC4464.m10140(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m9287(xmlPullParser, "media", "mediaRange"));
            } else {
                m9272(xmlPullParser);
            }
        } while (!AbstractC4464.m10154(xmlPullParser, "SegmentList"));
        if (c4037 != null) {
            if (c4032M9287 == null) {
                c4032M9287 = c4037.f15566;
            }
            if (listM9290 == null) {
                listM9290 = c4037.f15560;
            }
            if (arrayList == null) {
                arrayList = c4037.f15524;
            }
        }
        return new C4037(c4032M9287, jM9275, jM92752, jM92754, jM92753, listM9290, j7, arrayList, AbstractC4470.m10206(j5), AbstractC4470.m10206(j));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static int m9279(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m9280(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C4042 m9281(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC4464.m10154(xmlPullParser, str));
        return new C4042(attributeValue, attributeValue2, str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m9282(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p356.C4031.m9282(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m9283(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (AbstractC4535.m10360("http://dashif.org/guidelines/trickmode", ((C4042) arrayList.get(i2)).f15553)) {
                i = 16384;
            }
        }
        return i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static long m9284(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = AbstractC4470.f17202;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new C4046(j, j2));
            j += j2;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair m9285(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p356.C4031.m9285(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m9286(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static C4032 m9287(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new C4032(j, j2, attributeValue);
        }
        j = 0;
        j2 = -1;
        return new C4032(j, j2, attributeValue);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static C4040 m9288(XmlPullParser xmlPullParser, C4040 c4040, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long jM9275 = m9275(xmlPullParser, "timescale", c4040 != null ? c4040.f15564 : 1L);
        long jM92752 = m9275(xmlPullParser, "presentationTimeOffset", c4040 != null ? c4040.f15565 : 0L);
        long jM92753 = m9275(xmlPullParser, "duration", c4040 != null ? c4040.f15558 : -9223372036854775807L);
        long jM92754 = m9275(xmlPullParser, "startNumber", c4040 != null ? c4040.f15562 : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            C4042 c4042 = (C4042) list.get(i);
            if (AbstractC4535.m10360("http://dashif.org/guidelines/last-segment-number", c4042.f15553)) {
                j6 = Long.parseLong(c4042.f15551);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == -9223372036854775807L ? j3 : j4;
        long j9 = j8 == Long.MAX_VALUE ? -9223372036854775807L : j8;
        C4032 c4032M9287 = null;
        C3222 c3222M9276 = m9276(xmlPullParser, "media", c4040 != null ? c4040.f15544 : null);
        C3222 c3222M92762 = m9276(xmlPullParser, "initialization", c4040 != null ? c4040.f15542 : null);
        List listM9290 = null;
        do {
            xmlPullParser.next();
            if (AbstractC4464.m10140(xmlPullParser, "Initialization")) {
                c4032M9287 = m9287(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC4464.m10140(xmlPullParser, "SegmentTimeline")) {
                listM9290 = m9290(xmlPullParser, jM9275, j2);
            } else {
                m9272(xmlPullParser);
            }
        } while (!AbstractC4464.m10154(xmlPullParser, "SegmentTemplate"));
        if (c4040 != null) {
            if (c4032M9287 == null) {
                c4032M9287 = c4040.f15566;
            }
            if (listM9290 == null) {
                listM9290 = c4040.f15560;
            }
        }
        return new C4040(c4032M9287, jM9275, jM92752, jM92754, j7, jM92753, listM9290, j9, c3222M92762, c3222M9276, AbstractC4470.m10206(j5), AbstractC4470.m10206(j));
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static C4035 m9289(XmlPullParser xmlPullParser, C4035 c4035) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jM9275 = m9275(xmlPullParser, "timescale", c4035 != null ? c4035.f15564 : 1L);
        long jM92752 = m9275(xmlPullParser, "presentationTimeOffset", c4035 != null ? c4035.f15565 : 0L);
        long j3 = c4035 != null ? c4035.f15522 : 0L;
        long j4 = c4035 != null ? c4035.f15521 : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j5 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            j2 = j5;
        } else {
            j = j4;
            j2 = j3;
        }
        C4032 c4032M9287 = c4035 != null ? c4035.f15566 : null;
        do {
            xmlPullParser.next();
            if (AbstractC4464.m10140(xmlPullParser, "Initialization")) {
                c4032M9287 = m9287(xmlPullParser, "sourceURL", "range");
            } else {
                m9272(xmlPullParser);
            }
        } while (!AbstractC4464.m10154(xmlPullParser, "SegmentBase"));
        return new C4035(c4032M9287, jM9275, jM92752, j2, j);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static ArrayList m9290(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jM9284 = 0;
        long jM9275 = -9223372036854775807L;
        boolean z = false;
        int iM9279 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC4464.m10140(xmlPullParser, "S")) {
                long jM92752 = m9275(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jM9284 = m9284(arrayList, jM9284, jM9275, iM9279, jM92752);
                }
                if (jM92752 == -9223372036854775807L) {
                    jM92752 = jM9284;
                }
                jM9275 = m9275(xmlPullParser, "d", -9223372036854775807L);
                iM9279 = m9279(xmlPullParser, "r", 0);
                jM9284 = jM92752;
                z = true;
            } else {
                m9272(xmlPullParser);
            }
        } while (!AbstractC4464.m10154(xmlPullParser, "SegmentTimeline"));
        if (z) {
            int i = AbstractC4470.f17202;
            m9284(arrayList, jM9284, jM9275, iM9279, AbstractC4470.m10166(j2, j, 1000L, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static long m9291(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static long m9292(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = AbstractC4470.f17207.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    @Override // p076.InterfaceC1668
    /* renamed from: ʿˏ */
    public final Object mo5358(Uri uri, C0876 c0876) throws XmlPullParserException, ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f15509.newPullParser();
            xmlPullParserNewPullParser.setInput(c0876, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m9277(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.m1095("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw ParserException.m1095(null, e);
        }
    }
}
