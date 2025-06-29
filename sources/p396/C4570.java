package p396;

import androidx.leanback.widget.ʿˏ;
import com.bumptech.glide.ˑʽ;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p035.C1232;
import p237.C3093;
import p260.C3222;
import p331.C3761;
import p430.AbstractC4996;
import p430.C4991;
import p430.C5002;
import p430.C5004;
import p430.C5014;
import p430.C5015;
import p430.C5017;
import ᵎﹳ.ᐧʻ;

/* renamed from: ⁱᴵ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4570 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final char[] f17493 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final Pattern f17494 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5004 f17495;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ʿˏ f17496 = new ʿˏ();

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C3761 f17497;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public AbstractC4996 f17498;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f17499;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f17500;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f17501;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1232 f17502;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C5002 f17503;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C3093 f17504;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3222 f17505;

    public C4570(String str, C5004 c5004, String str2, C5014 c5014, C5002 c5002, boolean z, boolean z2, boolean z3) {
        this.f17501 = str;
        this.f17495 = c5004;
        this.f17500 = str2;
        this.f17503 = c5002;
        this.f17499 = z;
        if (c5014 != null) {
            this.f17502 = c5014.m11106();
        } else {
            this.f17502 = new C1232(1);
        }
        if (z2) {
            this.f17497 = new C3761(19);
            return;
        }
        if (z3) {
            C3222 c3222 = new C3222(19);
            this.f17505 = c3222;
            C5002 c50022 = C5017.f19035;
            if (c50022.f18948.equals("multipart")) {
                c3222.f12539 = c50022;
            } else {
                throw new IllegalArgumentException(("multipart != " + c50022).toString());
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10456(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = C5002.f18947;
                this.f17503 = ˑʽ.ˋⁱ(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ᐧʻ.ﾞˊ("Malformed content type: ", str2), e);
            }
        }
        C1232 c1232 = this.f17502;
        if (z) {
            c1232.m4426(str, str2);
        } else {
            c1232.m4427(str, str2);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10457(C5014 c5014, AbstractC4996 abstractC4996) {
        C3222 c3222 = this.f17505;
        c3222.getClass();
        if (c5014.m11104("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c5014.m11104("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) c3222.f12540).add(new C5015(c5014, abstractC4996));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10458(String str, String str2, boolean z) {
        C3761 c3761 = this.f17497;
        if (z) {
            ((ArrayList) c3761.f14527).add(C4991.m11077(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            ((ArrayList) c3761.f14528).add(C4991.m11077(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
        } else {
            ((ArrayList) c3761.f14527).add(C4991.m11077(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
            ((ArrayList) c3761.f14528).add(C4991.m11077(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10459(String str, String str2, boolean z) {
        String str3 = this.f17500;
        if (str3 != null) {
            C5004 c5004 = this.f17495;
            C3093 c3093M11095 = c5004.m11095(str3);
            this.f17504 = c3093M11095;
            if (c3093M11095 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c5004 + ", Relative: " + this.f17500);
            }
            this.f17500 = null;
        }
        if (z) {
            C3093 c3093 = this.f17504;
            if (((ArrayList) c3093.f11936) == null) {
                c3093.f11936 = new ArrayList();
            }
            ((ArrayList) c3093.f11936).add(C4991.m11077(str, 0, 0, " \"'<>#&=", true, false, true, false, 211));
            ((ArrayList) c3093.f11936).add(str2 != null ? C4991.m11077(str2, 0, 0, " \"'<>#&=", true, false, true, false, 211) : null);
            return;
        }
        C3093 c30932 = this.f17504;
        if (((ArrayList) c30932.f11936) == null) {
            c30932.f11936 = new ArrayList();
        }
        ((ArrayList) c30932.f11936).add(C4991.m11077(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        ((ArrayList) c30932.f11936).add(str2 != null ? C4991.m11077(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
    }
}
