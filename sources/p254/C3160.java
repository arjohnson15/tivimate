package p254;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p166.C2401;
import p166.InterfaceC2425;
import p380.C4423;
import p380.C4425;
import p383.AbstractC4470;

/* renamed from: יי.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3160 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Pattern f12221 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f12223 = -1;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f12222 = -1;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7831(C2401 c2401) {
        int i = 0;
        while (true) {
            InterfaceC2425[] interfaceC2425Arr = c2401.f9491;
            if (i >= interfaceC2425Arr.length) {
                return;
            }
            InterfaceC2425 interfaceC2425 = interfaceC2425Arr[i];
            if (interfaceC2425 instanceof C4423) {
                C4423 c4423 = (C4423) interfaceC2425;
                if ("iTunSMPB".equals(c4423.f17061) && m7832(c4423.f17062)) {
                    return;
                }
            } else if (interfaceC2425 instanceof C4425) {
                C4425 c4425 = (C4425) interfaceC2425;
                if ("com.apple.iTunes".equals(c4425.f17064) && "iTunSMPB".equals(c4425.f17065) && m7832(c4425.f17066)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m7832(String str) throws NumberFormatException {
        Matcher matcher = f12221.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = AbstractC4470.f17202;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f12223 = i2;
            this.f12222 = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
