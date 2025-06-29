package p442;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p345.AbstractC3980;
import p353.AbstractC4010;
import p362.C4125;
import p383.AbstractC4464;
import p383.C4457;
import p383.InterfaceC4462;
import p397.C4598;
import p397.C4601;
import p397.InterfaceC4599;
import p397.InterfaceC4602;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5141 implements InterfaceC4602 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final Pattern f19656 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final Pattern f19655 = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final StringBuilder f19659 = new StringBuilder();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f19657 = new ArrayList();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4457 f19658 = new C4457();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p112.C1808 m11442(android.text.Spanned r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p442.C5141.m11442(android.text.Spanned, java.lang.String):ˆﾞ.ʽᐧ");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static long m11443(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // p397.InterfaceC4602
    /* renamed from: ˏʾ */
    public final int mo2490() {
        return 1;
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
    public final void mo2508(byte[] bArr, int i, int i2, C4601 c4601, InterfaceC4462 interfaceC4462) throws NumberFormatException {
        long j;
        String str;
        String strM10109;
        String str2;
        InterfaceC4462 interfaceC44622;
        C5141 c5141 = this;
        InterfaceC4462 interfaceC44623 = interfaceC4462;
        String str3 = "SubripParser";
        C4457 c4457 = c5141.f19658;
        c4457.m10081(i + i2, bArr);
        c4457.m10108(i);
        Charset charsetM10088 = c4457.m10088();
        if (charsetM10088 == null) {
            charsetM10088 = AbstractC4010.f15450;
        }
        long j2 = c4601.f17606;
        long j3 = -9223372036854775807L;
        ArrayList arrayList = (j2 == -9223372036854775807L || !c4601.f17605) ? null : new ArrayList();
        while (true) {
            String strM101092 = c4457.m10109(charsetM10088);
            if (strM101092 == null) {
                break;
            }
            if (strM101092.length() != 0) {
                try {
                    Integer.parseInt(strM101092);
                    strM10109 = c4457.m10109(charsetM10088);
                } catch (NumberFormatException unused) {
                    j = j3;
                    str = str3;
                    AbstractC4464.m10144(str, "Skipping invalid index: ".concat(strM101092));
                    interfaceC44623 = interfaceC44623;
                    c5141 = this;
                }
                if (strM10109 == null) {
                    AbstractC4464.m10144(str3, "Unexpected end");
                    break;
                }
                Matcher matcher = f19656.matcher(strM10109);
                if (matcher.matches()) {
                    long jM11443 = m11443(matcher, 1);
                    long jM114432 = m11443(matcher, 6);
                    StringBuilder sb = c5141.f19659;
                    sb.setLength(0);
                    ArrayList arrayList2 = c5141.f19657;
                    arrayList2.clear();
                    String strM101093 = c4457.m10109(charsetM10088);
                    while (!TextUtils.isEmpty(strM101093)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strM101093.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = f19655.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            Matcher matcher3 = matcher2;
                            int iStart = matcher2.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            matcher2 = matcher3;
                            str3 = str3;
                        }
                        sb.append(sb2.toString());
                        strM101093 = c4457.m10109(charsetM10088);
                        str3 = str3;
                    }
                    String str4 = str3;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str2 = null;
                            break;
                        }
                        str2 = (String) arrayList2.get(i4);
                        if (str2.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j2 == -9223372036854775807L || jM11443 >= j2) {
                        C4598 c4598 = new C4598(AbstractC3980.m9207(m11442(spannedFromHtml, str2)), jM11443, jM114432 - jM11443);
                        interfaceC44622 = interfaceC4462;
                        interfaceC44622.mo4264(c4598);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new C4598(AbstractC3980.m9207(m11442(spannedFromHtml, str2)), jM11443, jM114432 - jM11443));
                        }
                        interfaceC44622 = interfaceC4462;
                    }
                    interfaceC44623 = interfaceC44622;
                    j3 = -9223372036854775807L;
                    str3 = str4;
                    c5141 = this;
                } else {
                    String str5 = str3;
                    long j4 = j3;
                    str = str5;
                    AbstractC4464.m10144(str, "Skipping invalid timing: ".concat(strM10109));
                    interfaceC44623 = interfaceC44623;
                    c5141 = this;
                    j = j4;
                    str3 = str;
                    j3 = j;
                }
            }
        }
        InterfaceC4462 interfaceC44624 = interfaceC44623;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC44624.mo4264((C4598) it.next());
            }
        }
    }
}
