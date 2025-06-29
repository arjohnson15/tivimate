package p133;

import androidx.leanback.widget.ʿˏ;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p033.C1212;
import p278.AbstractC3362;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.InterfaceC4462;
import p397.C4601;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import p447.AbstractC5179;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˉʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2079 implements InterfaceC4602 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final XmlPullParserFactory f8166;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final Pattern f8158 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final Pattern f8161 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final Pattern f8163 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final Pattern f8159 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final Pattern f8164 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final Pattern f8165 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final Pattern f8160 = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final C2084 f8162 = new C2084(30.0f, 1, 1);

    public C2079() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f8166 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C2083 m5898(C2083 c2083) {
        return c2083 == null ? new C2083() : c2083;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m5899(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f8160.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC4464.m10144("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            AbstractC4464.m10124("Invalid cell resolution " + i + " " + i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            AbstractC4464.m10144("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024d A[LOOP:0: B:3:0x000a->B:104:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5900(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, p033.C1212 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p133.C2079.m5900(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, ʼᵎ.ˉⁱ, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p133.C2080 m5901(org.xmlpull.v1.XmlPullParser r21, p133.C2080 r22, java.util.HashMap r23, p133.C2084 r24) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p133.C2079.m5901(org.xmlpull.v1.XmlPullParser, ˉʽ.ˑʽ, java.util.HashMap, ˉʽ.ﹳﹳ):ˉʽ.ˑʽ");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Type inference failed for: r11v84, types: [ˉʽ.ʽᐧ] */
    /* JADX WARN: Type inference failed for: r12v46, types: [ˉʽ.ʽᐧ] */
    /* JADX WARN: Type inference failed for: r12v55, types: [ˉʽ.ʽᐧ] */
    /* JADX WARN: Type inference failed for: r1v50, types: [ˉʽ.ʽᐧ] */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p133.C2083 m5902(org.xmlpull.v1.XmlPullParser r19, p133.C2083 r20) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p133.C2079.m5902(org.xmlpull.v1.XmlPullParser, ˉʽ.ᐧʻ):ˉʽ.ᐧʻ");
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static C1212 m5903(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strM10149 = AbstractC4464.m10149(xmlPullParser, "extent");
        if (strM10149 == null) {
            return null;
        }
        Matcher matcher = f8165.matcher(strM10149);
        if (!matcher.matches()) {
            AbstractC4464.m10144("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM10149));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C1212(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            AbstractC4464.m10144("TtmlParser", "Ignoring malformed tts extent: ".concat(strM10149));
            return null;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m5904(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m5905(String str, C2083 c2083) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        int i = AbstractC4470.f17202;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f8163;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(AbstractC5179.m11550(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC4464.m10144("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(ᵎˏ.ˑי("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c2083.f8192 = 3;
                break;
            case "em":
                c2083.f8192 = 2;
                break;
            case "px":
                c2083.f8192 = 1;
                break;
            default:
                throw new SubtitleDecoderException(ᵎˏ.ˑי("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c2083.f8196 = Float.parseFloat(strGroup2);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C2084 m5906(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = AbstractC4470.f17202;
            AbstractC4464.m10124("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        C2084 c2084 = f8162;
        int i3 = c2084.f8209;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C2084(i * f, i3, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c2084.f8210);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m5907(java.lang.String r13, p133.C2084 r14) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p133.C2079.m5907(java.lang.String, ˉʽ.ﹳﹳ):long");
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏʾ */
    public final int mo2490() {
        return 1;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏᵢ */
    public final InterfaceC4599 mo2492(byte[] bArr, int i, int i2) throws XmlPullParserException, NumberFormatException, IOException {
        C2084 c2084;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f8166.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C2082("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C1212 c1212M5903 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C2084 c2084M5906 = f8162;
            int iM5899 = 15;
            ʿˏ r13 = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C2080 c2080 = (C2080) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c2084M5906 = m5906(xmlPullParserNewPullParser);
                            iM5899 = m5899(xmlPullParserNewPullParser);
                            c1212M5903 = m5903(xmlPullParserNewPullParser);
                        }
                        C1212 c1212 = c1212M5903;
                        C2084 c20842 = c2084M5906;
                        int i4 = iM5899;
                        if (m5904(name)) {
                            if ("head".equals(name)) {
                                c2084 = c20842;
                                m5900(xmlPullParserNewPullParser, map, i4, c1212, map2, map3);
                            } else {
                                c2084 = c20842;
                                try {
                                    C2080 c2080M5901 = m5901(xmlPullParserNewPullParser, c2080, map2, c2084);
                                    arrayDeque.push(c2080M5901);
                                    if (c2080 != null) {
                                        if (c2080.f8171 == null) {
                                            c2080.f8171 = new ArrayList();
                                        }
                                        c2080.f8171.add(c2080M5901);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    AbstractC4464.m10127("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            c2084M5906 = c2084;
                        } else {
                            AbstractC4464.m10131("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            c2084M5906 = c20842;
                        }
                        c1212M5903 = c1212;
                        iM5899 = i4;
                    } else if (eventType == 4) {
                        c2080.getClass();
                        C2080 c2080M5909 = C2080.m5909(xmlPullParserNewPullParser.getText());
                        if (c2080.f8171 == null) {
                            c2080.f8171 = new ArrayList();
                        }
                        c2080.f8171.add(c2080M5909);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C2080 c20802 = (C2080) arrayDeque.peek();
                            c20802.getClass();
                            r13 = new ʿˏ(c20802, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            r13.getClass();
            return r13;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ـﹶ */
    public final /* synthetic */ void mo2495() {
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹳﹳ */
    public final /* synthetic */ void mo2506(byte[] bArr, C4601 c4601, C4125 c4125) {
        ᐧʻ.ـﹶ(this, bArr, c4601, c4125);
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ﹶˆ */
    public final void mo2508(byte[] bArr, int i, int i2, C4601 c4601, InterfaceC4462 interfaceC4462) {
        AbstractC3362.m8194(mo2492(bArr, i, i2), c4601, interfaceC4462);
    }
}
