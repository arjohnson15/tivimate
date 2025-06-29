package p257;

import android.support.v4.media.session.AbstractC0002;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import p112.C1808;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p353.AbstractC4010;
import p362.C4125;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.InterfaceC4462;
import p397.C4598;
import p397.C4601;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: יᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3204 implements InterfaceC4602 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f12464;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f12465;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f12466;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f12467;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4457 f12468 = new C4457();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final float f12469;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f12470;

    public C3204(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f12466 = 0;
            this.f12467 = -1;
            this.f12465 = "sans-serif";
            this.f12464 = false;
            this.f12469 = 0.85f;
            this.f12470 = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f12466 = bArr[24];
        this.f12467 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f12465 = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC4010.f15450)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f12470 = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f12464 = z;
        if (z) {
            this.f12469 = AbstractC4470.m10214(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f12469 = 0.85f;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7906(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7907(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏʾ */
    public final int mo2490() {
        return 2;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏᵢ */
    public final /* synthetic */ InterfaceC4599 mo2492(byte[] bArr, int i, int i2) {
        return ᐧʻ.ʽᐧ(this, bArr, i2);
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
        String strM10105;
        int i3 = 1;
        C4457 c4457 = this.f12468;
        c4457.m10081(i + i2, bArr);
        c4457.m10108(i);
        int i4 = 2;
        AbstractC4464.m10142(c4457.m10096() >= 2);
        int iM10100 = c4457.m10100();
        if (iM10100 == 0) {
            strM10105 = "";
        } else {
            int i5 = c4457.f17169;
            Charset charsetM10088 = c4457.m10088();
            int i6 = iM10100 - (c4457.f17169 - i5);
            if (charsetM10088 == null) {
                charsetM10088 = AbstractC4010.f15450;
            }
            strM10105 = c4457.m10105(i6, charsetM10088);
        }
        if (strM10105.isEmpty()) {
            C3928 c3928 = AbstractC3980.f15360;
            interfaceC4462.mo4264(new C4598(C3932.f15274, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM10105);
        m7907(spannableStringBuilder, this.f12466, 0, 0, spannableStringBuilder.length(), 16711680);
        m7906(spannableStringBuilder, this.f12467, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f12465;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM10214 = this.f12469;
        while (c4457.m10096() >= 8) {
            int i7 = c4457.f17169;
            int iM10092 = c4457.m10092();
            int iM100922 = c4457.m10092();
            if (iM100922 == 1937013100) {
                AbstractC4464.m10142(c4457.m10096() >= i4);
                int iM101002 = c4457.m10100();
                int i8 = 0;
                while (i8 < iM101002) {
                    AbstractC4464.m10142(c4457.m10096() >= 12);
                    int iM101003 = c4457.m10100();
                    int iM101004 = c4457.m10100();
                    c4457.m10085(i4);
                    int iM10086 = c4457.m10086();
                    c4457.m10085(i3);
                    int iM100923 = c4457.m10092();
                    if (iM101004 > spannableStringBuilder.length()) {
                        StringBuilder sbM40 = AbstractC0002.m40(iM101004, "Truncating styl end (", ") to cueText.length() (");
                        sbM40.append(spannableStringBuilder.length());
                        sbM40.append(").");
                        AbstractC4464.m10144("Tx3gParser", sbM40.toString());
                        iM101004 = spannableStringBuilder.length();
                    }
                    if (iM101003 >= iM101004) {
                        AbstractC4464.m10144("Tx3gParser", ˉᵎ.ˋⁱ("Ignoring styl with start (", iM101003, ") >= end (", iM101004, ")."));
                    } else {
                        int i9 = iM101004;
                        m7907(spannableStringBuilder, iM10086, this.f12466, iM101003, i9, 0);
                        m7906(spannableStringBuilder, iM100923, this.f12467, iM101003, i9, 0);
                    }
                    i3 = 1;
                    i8++;
                    i4 = 2;
                }
            } else if (iM100922 == 1952608120 && this.f12464) {
                i4 = 2;
                AbstractC4464.m10142(c4457.m10096() >= 2);
                fM10214 = AbstractC4470.m10214(c4457.m10100() / this.f12470, 0.0f, 0.95f);
            } else {
                i4 = 2;
            }
            c4457.m10108(i7 + iM10092);
        }
        interfaceC4462.mo4264(new C4598(AbstractC3980.m9207(new C1808(spannableStringBuilder, null, null, null, fM10214, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
