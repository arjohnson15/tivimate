package p430;

import java.io.Closeable;
import p041.C1273;

/* renamed from: ﹶˏ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4994 implements Closeable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final long f18879;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final EnumC5022 f18880;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C5000 f18881;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C4994 f18882;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f18883;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C1273 f18884;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C4994 f18885;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f18886;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C5021 f18887;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C4994 f18888;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C5014 f18889;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final AbstractC5001 f18890;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final long f18891;

    public C4994(C5021 c5021, EnumC5022 enumC5022, String str, int i, C5000 c5000, C5014 c5014, AbstractC5001 abstractC5001, C4994 c4994, C4994 c49942, C4994 c49943, long j, long j2, C1273 c1273) {
        this.f18887 = c5021;
        this.f18880 = enumC5022;
        this.f18883 = str;
        this.f18886 = i;
        this.f18881 = c5000;
        this.f18889 = c5014;
        this.f18890 = abstractC5001;
        this.f18882 = c4994;
        this.f18885 = c49942;
        this.f18888 = c49943;
        this.f18891 = j;
        this.f18879 = j2;
        this.f18884 = c1273;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC5001 abstractC5001 = this.f18890;
        if (abstractC5001 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC5001.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f18880 + ", code=" + this.f18886 + ", message=" + this.f18883 + ", url=" + this.f18887.f19052 + '}';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m11083() {
        int i = this.f18886;
        return 200 <= i && i < 300;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5013 m11084() {
        C5013 c5013 = new C5013();
        c5013.f19025 = this.f18887;
        c5013.f19017 = this.f18880;
        c5013.f19024 = this.f18886;
        c5013.f19028 = this.f18883;
        c5013.f19018 = this.f18881;
        c5013.f19026 = this.f18889.m11106();
        c5013.f19027 = this.f18890;
        c5013.f19023 = this.f18882;
        c5013.f19029 = this.f18885;
        c5013.f19019 = this.f18888;
        c5013.f19022 = this.f18891;
        c5013.f19020 = this.f18879;
        c5013.f19021 = this.f18884;
        return c5013;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m11085() {
        return this.f18886;
    }
}
