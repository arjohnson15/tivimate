package p254;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import p208.AbstractC2793;
import p208.C2796;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: יי.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3181 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12290;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f12291;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f12292;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String f12293;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final float f12294;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f12295;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12296;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f12297;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f12298;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f12299;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f12300;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f12301;

    public C3181(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f12297 = arrayList;
        this.f12290 = i;
        this.f12296 = i2;
        this.f12300 = i3;
        this.f12291 = i4;
        this.f12298 = i5;
        this.f12299 = i6;
        this.f12295 = i7;
        this.f12301 = i8;
        this.f12292 = i9;
        this.f12294 = f;
        this.f12293 = str;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3181 m7849(C4457 c4457) throws ParserException {
        byte[] bArr;
        String strM10138;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            c4457.m10085(4);
            int iM10086 = (c4457.m10086() & 3) + 1;
            if (iM10086 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM100862 = c4457.m10086() & 31;
            int i9 = 0;
            while (true) {
                bArr = AbstractC4464.f17181;
                if (i9 >= iM100862) {
                    break;
                }
                int iM10100 = c4457.m10100();
                int i10 = c4457.f17169;
                c4457.m10085(iM10100);
                byte[] bArr2 = c4457.f17171;
                byte[] bArr3 = new byte[iM10100 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i10, bArr3, 4, iM10100);
                arrayList.add(bArr3);
                i9++;
            }
            int iM100863 = c4457.m10086();
            for (int i11 = 0; i11 < iM100863; i11++) {
                int iM101002 = c4457.m10100();
                int i12 = c4457.f17169;
                c4457.m10085(iM101002);
                byte[] bArr4 = c4457.f17171;
                byte[] bArr5 = new byte[iM101002 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i12, bArr5, 4, iM101002);
                arrayList.add(bArr5);
            }
            if (iM100862 > 0) {
                C2796 c2796M7076 = AbstractC2793.m7076((byte[]) arrayList.get(0), iM10086, ((byte[]) arrayList.get(0)).length);
                int i13 = c2796M7076.f10885;
                int i14 = c2796M7076.f10896;
                int i15 = c2796M7076.f10892 + 8;
                int i16 = c2796M7076.f10902 + 8;
                int i17 = c2796M7076.f10894;
                int i18 = c2796M7076.f10900;
                int i19 = c2796M7076.f10889;
                int i20 = c2796M7076.f10899;
                float f2 = c2796M7076.f10897;
                strM10138 = AbstractC4464.m10138(c2796M7076.f10895, c2796M7076.f10884, c2796M7076.f10893);
                i6 = i18;
                i7 = i19;
                i8 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i4 = i16;
                i5 = i17;
                i = i13;
            } else {
                strM10138 = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new C3181(arrayList, iM10086, i, i2, i3, i4, i5, i6, i7, i8, f, strM10138);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.m1097("Error parsing AVC config", e);
        }
    }
}
