package p372;

import android.net.Uri;
import com.bumptech.glide.ﹳﹳ;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C0882;
import p000.InterfaceC0875;
import p033.C1215;
import p166.C2405;
import p166.C2431;
import p254.C3159;
import p254.InterfaceC3165;
import p256.AbstractC3193;
import p323.C3683;
import p341.C3880;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p380.C4437;
import p383.AbstractC4464;
import p383.C4457;
import p383.C4458;
import p395.AbstractC4535;

/* renamed from: ᵢˆ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4220 extends AbstractC3193 {

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public static final AtomicInteger f16268 = new AtomicInteger();

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final C4218 f16269;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public C4234 f16270;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public boolean f16271;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f16272;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C4437 f16273;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public int f16274;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final C4457 f16275;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final InterfaceC4237 f16276;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final List f16277;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final boolean f16278;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final InterfaceC0875 f16279;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final boolean f16280;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Uri f16281;

    /* renamed from: יˋ, reason: contains not printable characters */
    public C4218 f16282;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public C3932 f16283;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public volatile boolean f16284;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public boolean f16285;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C2405 f16286;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public boolean f16287;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public boolean f16288;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean f16289;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final boolean f16290;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C0882 f16291;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f16292;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final boolean f16293;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final C4458 f16294;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int f16295;

    public C4220(InterfaceC4237 interfaceC4237, InterfaceC0875 interfaceC0875, C0882 c0882, C2431 c2431, boolean z, InterfaceC0875 interfaceC08752, C0882 c08822, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C4458 c4458, C2405 c2405, C4218 c4218, C4437 c4437, C4457 c4457, boolean z6, C1215 c1215) {
        super(interfaceC0875, c0882, c2431, i, obj, j, j2, j3);
        this.f16293 = z;
        this.f16292 = i2;
        this.f16287 = z3;
        this.f16272 = i3;
        this.f16291 = c08822;
        this.f16279 = interfaceC08752;
        this.f16271 = c08822 != null;
        this.f16278 = z2;
        this.f16281 = uri;
        this.f16290 = z5;
        this.f16294 = c4458;
        this.f16289 = z4;
        this.f16276 = interfaceC4237;
        this.f16277 = list;
        this.f16286 = c2405;
        this.f16269 = c4218;
        this.f16273 = c4437;
        this.f16275 = c4457;
        this.f16280 = z6;
        C3928 c3928 = AbstractC3980.f15360;
        this.f16283 = C3932.f15274;
        this.f16295 = f16268.getAndIncrement();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static byte[] m9664(String str) {
        if (AbstractC4535.m10327(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p256.AbstractC3193
    /* renamed from: ʽᐧ */
    public final boolean mo7891() {
        throw null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9665(InterfaceC0875 interfaceC0875, C0882 c0882, boolean z, boolean z2) {
        C0882 c0882M3699;
        long j;
        long j2;
        if (z) {
            z = this.f16274 != 0;
            c0882M3699 = c0882;
        } else {
            c0882M3699 = c0882.m3699(this.f16274);
        }
        try {
            C3159 c3159M9667 = m9667(interfaceC0875, c0882M3699, z2);
            if (z) {
                c3159M9667.mo4854(this.f16274);
            }
            while (!this.f16284) {
                try {
                    try {
                        if (this.f16282.f16263.mo4075(c3159M9667, C4218.f16259) != 0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.f12395.f9678 & 16384) == 0) {
                            throw e;
                        }
                        this.f16282.f16263.mo4082(0L, 0L);
                        j = c3159M9667.f12217;
                        j2 = c0882.f4001;
                    }
                } catch (Throwable th) {
                    this.f16274 = (int) (c3159M9667.f12217 - c0882.f4001);
                    throw th;
                }
            }
            j = c3159M9667.f12217;
            j2 = c0882.f4001;
            this.f16274 = (int) (j - j2);
        } finally {
            ﹳﹳ.ﹶˆ(interfaceC0875);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m9666(int i) {
        AbstractC4464.m10132(!this.f16280);
        if (i >= this.f16283.size()) {
            return 0;
        }
        return ((Integer) this.f16283.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Type inference failed for: r8v23, types: [ٴᵎ.ـﹶ] */
    /* JADX WARN: Type inference failed for: r8v9, types: [ٴᵎ.ـﹶ] */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p254.C3159 m9667(p000.InterfaceC0875 r35, p000.C0882 r36, boolean r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372.C4220.m9667(ʻ.ٴˎ, ʻ.ﹶˆ, boolean):יי.ˉⁱ");
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
        this.f16284 = true;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() {
        C4218 c4218;
        this.f16270.getClass();
        if (this.f16282 == null && (c4218 = this.f16269) != null) {
            InterfaceC3165 interfaceC3165Mo4086 = c4218.f16263.mo4086();
            if ((interfaceC3165Mo4086 instanceof C3880) || (interfaceC3165Mo4086 instanceof C3683)) {
                this.f16282 = this.f16269;
                this.f16271 = false;
            }
        }
        if (this.f16271) {
            InterfaceC0875 interfaceC0875 = this.f16279;
            interfaceC0875.getClass();
            C0882 c0882 = this.f16291;
            c0882.getClass();
            m9665(interfaceC0875, c0882, this.f16278, false);
            this.f16274 = 0;
            this.f16271 = false;
        }
        if (this.f16284) {
            return;
        }
        if (!this.f16289) {
            m9665(this.f12394, this.f12390, this.f16293, true);
        }
        this.f16285 = !this.f16284;
    }
}
