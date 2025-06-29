package p134;

import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser$MissingFieldException;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import p166.C2405;
import p166.C2413;
import p166.C2417;
import p166.C2431;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˉʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2091 extends AbstractC2092 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final LinkedList f8257;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f8258;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f8259;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C2089 f8260;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f8261;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f8262;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f8263;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f8264;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f8265;

    public C2091(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f8261 = -1;
        this.f8260 = null;
        this.f8257 = new LinkedList();
    }

    @Override // p134.AbstractC2092
    /* renamed from: ʽᐧ */
    public final Object mo5920() {
        boolean z;
        C2089 c2089;
        int i;
        long jM10166;
        long jM101662;
        LinkedList linkedList = this.f8257;
        int size = linkedList.size();
        C2085[] c2085Arr = new C2085[size];
        linkedList.toArray(c2085Arr);
        C2089 c20892 = this.f8260;
        if (c20892 != null) {
            C2405 c2405 = new C2405(new C2413(c20892.f8255, null, "video/mp4", c20892.f8253));
            for (int i2 = 0; i2 < size; i2++) {
                C2085 c2085 = c2085Arr[i2];
                int i3 = c2085.f8222;
                if (i3 == 2 || i3 == 1) {
                    int i4 = 0;
                    while (true) {
                        C2431[] c2431Arr = c2085.f8214;
                        if (i4 < c2431Arr.length) {
                            C2417 c2417M6541 = c2431Arr[i4].m6541();
                            c2417M6541.f9612 = c2405;
                            c2431Arr[i4] = new C2431(c2417M6541);
                            i4++;
                        }
                    }
                }
            }
        }
        int i5 = this.f8263;
        int i6 = this.f8264;
        long j = this.f8262;
        long j2 = this.f8265;
        long j3 = this.f8258;
        int i7 = this.f8261;
        boolean z2 = this.f8259;
        C2089 c20893 = this.f8260;
        if (j2 == 0) {
            z = z2;
            c2089 = c20893;
            i = i7;
            jM10166 = -9223372036854775807L;
        } else {
            int i8 = AbstractC4470.f17202;
            z = z2;
            c2089 = c20893;
            i = i7;
            jM10166 = AbstractC4470.m10166(j2, 1000000L, j, RoundingMode.FLOOR);
        }
        if (j3 == 0) {
            jM101662 = -9223372036854775807L;
        } else {
            int i9 = AbstractC4470.f17202;
            jM101662 = AbstractC4470.m10166(j3, 1000000L, j, RoundingMode.FLOOR);
        }
        return new C2088(i5, i6, jM10166, jM101662, i, z, c2089, c2085Arr);
    }

    @Override // p134.AbstractC2092
    /* renamed from: ˉי */
    public final void mo5921(XmlPullParser xmlPullParser) throws ParserException {
        this.f8263 = AbstractC2092.m5933(xmlPullParser, "MajorVersion");
        this.f8264 = AbstractC2092.m5933(xmlPullParser, "MinorVersion");
        this.f8262 = AbstractC2092.m5928(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new SsManifestParser$MissingFieldException("Duration");
        }
        try {
            this.f8265 = Long.parseLong(attributeValue);
            this.f8258 = AbstractC2092.m5928(xmlPullParser, "DVRWindowLength", 0L);
            this.f8261 = AbstractC2092.m5930(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f8259 = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            m5935(Long.valueOf(this.f8262), "TimeScale");
        } catch (NumberFormatException e) {
            throw ParserException.m1095(null, e);
        }
    }

    @Override // p134.AbstractC2092
    /* renamed from: ـﹶ */
    public final void mo5925(Object obj) {
        if (obj instanceof C2085) {
            this.f8257.add((C2085) obj);
        } else if (obj instanceof C2089) {
            AbstractC4464.m10132(this.f8260 == null);
            this.f8260 = (C2089) obj;
        }
    }
}
