package p140;

import androidx.lifecycle.C0248;
import p097.C1769;
import p097.EnumC1768;
import p280.C3375;
import p331.C3761;
import ˎˊ.ˏʾ;

/* renamed from: ˉˏ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2172 implements InterfaceC2162 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2171 f8536;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f8537;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ThreadLocal f8538 = new ThreadLocal();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2171 f8539;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3375 f8540;

    public C2172(C3761 c3761) {
        C3375 c3375 = new C3375();
        c3375.f13201 = 0;
        this.f8540 = c3375;
        int i = C1769.f6845;
        this.f8537 = ˏʾ.ˑﾞ(30, EnumC1768.SECONDS);
        C2171 c2171 = new C2171(1, new C0248(6, c3761));
        this.f8539 = c2171;
        this.f8536 = c2171;
    }

    public C2172(C3761 c3761, String str, int i) {
        int i2 = 1;
        int i3 = 0;
        C3375 c3375 = new C3375();
        c3375.f13201 = 0;
        this.f8540 = c3375;
        int i4 = C1769.f6845;
        this.f8537 = ˏʾ.ˑﾞ(30, EnumC1768.SECONDS);
        if (i <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        this.f8539 = new C2171(i, new C2173(c3761, str, i3));
        this.f8536 = new C2171(1, new C2173(c3761, str, i2));
    }

    @Override // p140.InterfaceC2162
    public final void close() {
        C3375 c3375 = this.f8540;
        c3375.getClass();
        if (C3375.f13200.compareAndSet(c3375, 0, 1)) {
            C2171 c2171 = this.f8539;
            c2171.f8532.m10998(null);
            for (C2183 c2183 : c2171.f8535) {
                if (c2183 != null) {
                    c2183.close();
                }
            }
            C2171 c21712 = this.f8536;
            c21712.f8532.m10998(null);
            for (C2183 c21832 : c21712.f8535) {
                if (c21832 != null) {
                    c21832.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011b A[Catch: all -> 0x012c, TryCatch #5 {all -> 0x012c, blocks: (B:67:0x0115, B:69:0x011b, B:74:0x0128, B:78:0x0132, B:82:0x013c, B:94:0x0186, B:95:0x018d, B:96:0x018e, B:97:0x018f, B:98:0x0195), top: B:131:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016e A[Catch: all -> 0x0185, TRY_LEAVE, TryCatch #2 {all -> 0x0185, blocks: (B:86:0x0168, B:88:0x016e, B:91:0x017f, B:92:0x0182), top: B:125:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018f A[Catch: all -> 0x012c, TryCatch #5 {all -> 0x012c, blocks: (B:67:0x0115, B:69:0x011b, B:74:0x0128, B:78:0x0132, B:82:0x013c, B:94:0x0186, B:95:0x018d, B:96:0x018e, B:97:0x018f, B:98:0x0195), top: B:131:0x0115 }] */
    @Override // p140.InterfaceC2162
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo6091(boolean r17, p338.InterfaceC3864 r18, p185.AbstractC2562 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p140.C2172.mo6091(boolean, ᵎˈ.ˑי, ˎʻ.ˑʽ):java.lang.Object");
    }
}
