package p134;

import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser$MissingFieldException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import p166.C2431;
import p383.AbstractC4470;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˉʾ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2087 extends AbstractC2092 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f8231;

    /* renamed from: ˉי, reason: contains not printable characters */
    public String f8232;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f8233;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f8234;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long f8235;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public String f8236;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f8237;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String f8238;

    /* renamed from: ˑי, reason: contains not printable characters */
    public String f8239;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final LinkedList f8240;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f8241;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f8242;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public ArrayList f8243;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f8244;

    public C2087(AbstractC2092 abstractC2092, String str) {
        super(abstractC2092, str, "StreamIndex");
        this.f8231 = str;
        this.f8240 = new LinkedList();
    }

    @Override // p134.AbstractC2092
    /* renamed from: ʽᐧ */
    public final Object mo5920() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i4;
        long[] jArr;
        int i5;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f8240;
        C2431[] c2431Arr = new C2431[linkedList.size()];
        linkedList.toArray(c2431Arr);
        String str = this.f8236;
        int i6 = this.f8241;
        String str2 = this.f8238;
        long j = this.f8244;
        String str3 = this.f8232;
        int i7 = this.f8233;
        int i8 = this.f8234;
        int i9 = this.f8242;
        int i10 = this.f8237;
        String str4 = this.f8239;
        ArrayList arrayList4 = this.f8243;
        long j2 = this.f8235;
        int i11 = AbstractC4470.f17202;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        if (j < 1000000 || j % 1000000 != 0) {
            i = i8;
            i2 = i9;
            i3 = i7;
            if (j >= 1000000 || 1000000 % j != 0) {
                int i12 = 0;
                while (i12 < size) {
                    long jLongValue = ((Long) arrayList4.get(i12)).longValue();
                    if (jLongValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i4 = size;
                        jArr = jArr3;
                        i5 = i12;
                    } else {
                        if (j < jLongValue || j % jLongValue != 0) {
                            arrayList = arrayList4;
                            if (j >= jLongValue || jLongValue % j != 0) {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i4 = size;
                                jArr = jArr3;
                                i5 = i12;
                                jArr[i5] = AbstractC4470.m10173(jLongValue, 1000000L, j, roundingMode);
                            } else {
                                jArr3[i12] = ᵢʿ.ﾞʽ(1000000L, ᵢʿ.ˏᵢ(jLongValue, j, RoundingMode.UNNECESSARY));
                            }
                        } else {
                            arrayList = arrayList4;
                            jArr3[i12] = ᵢʿ.ˏᵢ(1000000L, ᵢʿ.ˏᵢ(j, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        }
                        i4 = size;
                        jArr = jArr3;
                        i5 = i12;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i12 = i5 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i4;
                    jArr3 = jArr;
                }
            } else {
                long j3 = ᵢʿ.ˏᵢ(1000000L, j, RoundingMode.UNNECESSARY);
                for (int i13 = 0; i13 < size; i13++) {
                    jArr3[i13] = ᵢʿ.ﾞʽ(((Long) arrayList4.get(i13)).longValue(), j3);
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        } else {
            i = i8;
            long j4 = ᵢʿ.ˏᵢ(j, 1000000L, RoundingMode.UNNECESSARY);
            int i14 = 0;
            while (i14 < size) {
                jArr3[i14] = ᵢʿ.ˏᵢ(((Long) arrayList4.get(i14)).longValue(), j4, roundingMode2);
                i14++;
                i7 = i7;
                i9 = i9;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i2 = i9;
            i3 = i7;
        }
        return new C2085(this.f8231, str, i6, str2, j, str3, i3, i, i2, i10, str4, c2431Arr, arrayList3, jArr2, AbstractC4470.m10166(j2, 1000000L, j, RoundingMode.FLOOR));
    }

    @Override // p134.AbstractC2092
    /* renamed from: ˉי */
    public final void mo5921(XmlPullParser xmlPullParser) throws ParserException {
        int i = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new SsManifestParser$MissingFieldException("Type");
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw ParserException.m1095("Invalid key value[" + attributeValue + "]", null);
                    }
                    i = 3;
                }
            }
            this.f8241 = i;
            m5935(Integer.valueOf(i), "Type");
            if (this.f8241 == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new SsManifestParser$MissingFieldException("Subtype");
                }
                this.f8238 = attributeValue2;
            } else {
                this.f8238 = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m5935(this.f8238, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f8232 = attributeValue3;
            m5935(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new SsManifestParser$MissingFieldException("Url");
            }
            this.f8236 = attributeValue4;
            this.f8233 = AbstractC2092.m5930(xmlPullParser, "MaxWidth");
            this.f8234 = AbstractC2092.m5930(xmlPullParser, "MaxHeight");
            this.f8242 = AbstractC2092.m5930(xmlPullParser, "DisplayWidth");
            this.f8237 = AbstractC2092.m5930(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f8239 = attributeValue5;
            m5935(attributeValue5, "Language");
            long jM5930 = AbstractC2092.m5930(xmlPullParser, "TimeScale");
            this.f8244 = jM5930;
            if (jM5930 == -1) {
                this.f8244 = ((Long) m5938("TimeScale")).longValue();
            }
            this.f8243 = new ArrayList();
            return;
        }
        int size = this.f8243.size();
        long jM5928 = AbstractC2092.m5928(xmlPullParser, "t", -9223372036854775807L);
        if (jM5928 == -9223372036854775807L) {
            if (size == 0) {
                jM5928 = 0;
            } else {
                if (this.f8235 == -1) {
                    throw ParserException.m1095("Unable to infer start time", null);
                }
                jM5928 = this.f8235 + ((Long) this.f8243.get(size - 1)).longValue();
            }
        }
        this.f8243.add(Long.valueOf(jM5928));
        this.f8235 = AbstractC2092.m5928(xmlPullParser, "d", -9223372036854775807L);
        long jM59282 = AbstractC2092.m5928(xmlPullParser, "r", 1L);
        if (jM59282 > 1 && this.f8235 == -9223372036854775807L) {
            throw ParserException.m1095("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j = i;
            if (j >= jM59282) {
                return;
            }
            this.f8243.add(Long.valueOf((this.f8235 * j) + jM5928));
            i++;
        }
    }

    @Override // p134.AbstractC2092
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5925(Object obj) {
        if (obj instanceof C2431) {
            this.f8240.add((C2431) obj);
        }
    }

    @Override // p134.AbstractC2092
    /* renamed from: ﹳﹳ */
    public final boolean mo5924(String str) {
        return "c".equals(str);
    }
}
