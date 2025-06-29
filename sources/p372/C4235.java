package p372;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2430;
import p234.AbstractC3080;
import p234.AbstractC3087;
import p254.C3159;
import p254.C3176;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p260.C3222;
import p293.C3474;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p353.AbstractC4010;
import p383.C4457;
import p383.C4458;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᵢˆ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4235 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4458 f16437;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f16438;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f16439;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f16441;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3177 f16442;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3474 f16444;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final Pattern f16436 = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final Pattern f16435 = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f16440 = new C4457();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public byte[] f16443 = new byte[1024];

    public C4235(String str, C4458 c4458, C3474 c3474, boolean z) {
        this.f16441 = str;
        this.f16437 = c4458;
        this.f16444 = c3474;
        this.f16438 = z;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        C3159 c3159 = (C3159) interfaceC3168;
        c3159.mo4875(this.f16443, 0, 6, false);
        byte[] bArr = this.f16443;
        C4457 c4457 = this.f16440;
        c4457.m10081(6, bArr);
        if (AbstractC3080.m7577(c4457)) {
            return true;
        }
        c3159.mo4875(this.f16443, 6, 3, false);
        c4457.m10081(9, this.f16443);
        return AbstractC3080.m7577(c4457);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) throws EOFException, InterruptedIOException {
        this.f16442.getClass();
        int i = (int) ((C3159) interfaceC3168).f12216;
        int i2 = this.f16439;
        byte[] bArr = this.f16443;
        if (i2 == bArr.length) {
            this.f16443 = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f16443;
        int i3 = this.f16439;
        int iMo3679 = ((C3159) interfaceC3168).mo3679(bArr2, i3, bArr2.length - i3);
        if (iMo3679 != -1) {
            int i4 = this.f16439 + iMo3679;
            this.f16439 = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        try {
            m9695();
        } catch (ParserException unused) {
        }
        return -1;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3178 m9694(long j) {
        InterfaceC3178 interfaceC3178Mo4851 = this.f16442.mo4851(0, 3);
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("text/vtt");
        c2417.f9625 = this.f16441;
        c2417.f9621 = j;
        ᐧʻ.ˋˊ(c2417, interfaceC3178Mo4851);
        this.f16442.mo4850();
        return interfaceC3178Mo4851;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m9695() throws ParserException {
        String strM10109;
        C4457 c4457 = new C4457(this.f16443);
        AbstractC3080.m7578(c4457);
        String strM101092 = c4457.m10109(AbstractC4010.f15450);
        long j = 0;
        long jM7576 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strM101092)) {
                while (true) {
                    String strM101093 = c4457.m10109(AbstractC4010.f15450);
                    if (strM101093 == null) {
                        break;
                    }
                    if (AbstractC3080.f11873.matcher(strM101093).matches()) {
                        do {
                            strM10109 = c4457.m10109(AbstractC4010.f15450);
                            if (strM10109 != null) {
                            }
                        } while (!strM10109.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC3087.f11914.matcher(strM101093);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    m9694(0L);
                    return;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jM75762 = AbstractC3080.m7576(strGroup);
                long jM10112 = this.f16437.m10112(((((j + jM75762) - jM7576) * 90000) / 1000000) % 8589934592L);
                InterfaceC3178 interfaceC3178M9694 = m9694(jM10112 - jM75762);
                byte[] bArr = this.f16443;
                int i = this.f16439;
                C4457 c44572 = this.f16440;
                c44572.m10081(i, bArr);
                interfaceC3178M9694.mo7841(this.f16439, c44572);
                interfaceC3178M9694.mo7842(jM10112, 1, this.f16439, 0, null);
                return;
            }
            if (strM101092.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f16436.matcher(strM101092);
                if (!matcher3.find()) {
                    throw ParserException.m1097("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM101092), null);
                }
                Matcher matcher4 = f16435.matcher(strM101092);
                if (!matcher4.find()) {
                    throw ParserException.m1097("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM101092), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jM7576 = AbstractC3080.m7576(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strM101092 = c4457.m10109(AbstractC4010.f15450);
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f16442 = this.f16438 ? new C3222(interfaceC3177, this.f16444) : interfaceC3177;
        interfaceC3177.mo4858(new C3176(-9223372036854775807L));
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
