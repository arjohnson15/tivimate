package p254;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;
import p208.AbstractC2793;
import p208.C2792;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: יי.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3185 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12313;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f12314;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final String f12315;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final float f12316;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12317;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f12318;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f12319;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f12320;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f12321;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f12322;

    public C3185(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, String str) {
        this.f12318 = list;
        this.f12313 = i;
        this.f12317 = i2;
        this.f12321 = i3;
        this.f12314 = i4;
        this.f12319 = i5;
        this.f12320 = i6;
        this.f12316 = f;
        this.f12322 = i7;
        this.f12315 = str;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3185 m7853(C4457 c4457) throws ParserException {
        int i;
        int i2;
        try {
            c4457.m10085(21);
            int iM10086 = c4457.m10086() & 3;
            int iM100862 = c4457.m10086();
            int i3 = c4457.f17169;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iM100862; i6++) {
                c4457.m10085(1);
                int iM10100 = c4457.m10100();
                for (int i7 = 0; i7 < iM10100; i7++) {
                    int iM101002 = c4457.m10100();
                    i5 += iM101002 + 4;
                    c4457.m10085(iM101002);
                }
            }
            c4457.m10108(i3);
            byte[] bArr = new byte[i5];
            String strM10151 = null;
            int i8 = 0;
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            float f = 1.0f;
            int i15 = -1;
            while (i8 < iM100862) {
                int iM100863 = c4457.m10086() & 63;
                int iM101003 = c4457.m10100();
                int i16 = 0;
                while (i16 < iM101003) {
                    int iM101004 = c4457.m10100();
                    int i17 = iM100862;
                    System.arraycopy(AbstractC2793.f10876, i4, bArr, i9, 4);
                    int i18 = i9 + 4;
                    System.arraycopy(c4457.f17171, c4457.f17169, bArr, i18, iM101004);
                    if (iM100863 == 33 && i16 == 0) {
                        C2792 c2792M7073 = AbstractC2793.m7073(bArr, i18, i18 + iM101004);
                        int i19 = c2792M7073.f10860 + 8;
                        i11 = c2792M7073.f10869 + 8;
                        i12 = c2792M7073.f10863;
                        int i20 = c2792M7073.f10871;
                        int i21 = c2792M7073.f10865;
                        float f2 = c2792M7073.f10864;
                        int i22 = c2792M7073.f10862;
                        i = iM100863;
                        i2 = iM101003;
                        i10 = i19;
                        strM10151 = AbstractC4464.m10151(c2792M7073.f10868, c2792M7073.f10859, c2792M7073.f10867, c2792M7073.f10872, c2792M7073.f10870, c2792M7073.f10866);
                        i14 = i21;
                        i13 = i20;
                        i15 = i22;
                        f = f2;
                    } else {
                        i = iM100863;
                        i2 = iM101003;
                    }
                    i9 = i18 + iM101004;
                    c4457.m10085(iM101004);
                    i16++;
                    iM100862 = i17;
                    iM100863 = i;
                    iM101003 = i2;
                    i4 = 0;
                }
                i8++;
                i4 = 0;
            }
            return new C3185(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iM10086 + 1, i10, i11, i12, i13, i14, f, i15, strM10151);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.m1097("Error parsing HEVC config", e);
        }
    }
}
