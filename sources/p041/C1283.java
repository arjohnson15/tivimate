package p041;

import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p141.C2186;
import p141.C2204;
import p345.C3930;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p430.C5009;
import ـˈ.ˉᵎ;

/* renamed from: ʽˉ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1283 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5272;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f5273;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f5274;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5275;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5276;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Cloneable f5277;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f5278;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f5279;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object f5280;

    public C1283(int i, int i2, String str, String str2) {
        this.f5279 = str;
        this.f5276 = i;
        this.f5273 = str2;
        this.f5272 = i2;
        this.f5277 = new HashMap();
        this.f5275 = -1;
    }

    public C1283(C1278 c1278, C5009 c5009, C1274 c1274) {
        this.f5279 = c1278;
        this.f5273 = c5009;
        this.f5277 = c1274;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m4572(int i, int i2, int i3, String str) {
        int i4 = AbstractC4470.f17202;
        Locale locale = Locale.US;
        return i + " " + str + "/" + i2 + "/" + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p041.C1276 m4573(int r13, int r14, int r15, boolean r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p041.C1283.m4573(int, int, int, boolean, boolean):ʽˉ.ˋⁱ");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C2186 m4574() {
        String strM4572;
        C2204 c2204M6138;
        HashMap map = (HashMap) this.f5277;
        try {
            if (map.containsKey("rtpmap")) {
                String str = (String) map.get("rtpmap");
                int i = AbstractC4470.f17202;
                c2204M6138 = C2204.m6138(str);
            } else {
                int i2 = this.f5272;
                AbstractC4464.m10142(i2 < 96);
                if (i2 == 0) {
                    strM4572 = m4572(0, 8000, 1, "PCMU");
                } else if (i2 == 8) {
                    strM4572 = m4572(8, 8000, 1, "PCMA");
                } else if (i2 == 10) {
                    strM4572 = m4572(10, 44100, 2, "L16");
                } else {
                    if (i2 != 11) {
                        throw new IllegalStateException(ˉᵎ.ˉⁱ("Unsupported static paylod type ", i2));
                    }
                    strM4572 = m4572(11, 44100, 1, "L16");
                }
                c2204M6138 = C2204.m6138(strM4572);
            }
            return new C2186(this, C3930.m9140(map), c2204M6138);
        } catch (ParserException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m4575(IOException iOException) {
        this.f5280 = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f3911 == 8) {
            this.f5276++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f5272++;
        } else {
            this.f5275++;
        }
    }
}
