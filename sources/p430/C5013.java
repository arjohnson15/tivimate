package p430;

import p035.C1232;
import p041.C1273;

/* renamed from: ﹶˏ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5013 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public EnumC5022 f19017;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C5000 f19018;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C4994 f19019;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f19020;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C1273 f19021;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f19022;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C4994 f19023;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C5021 f19025;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public AbstractC5001 f19027;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public String f19028;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C4994 f19029;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f19024 = -1;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1232 f19026 = new C1232(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m11100(String str, C4994 c4994) {
        if (c4994 != null) {
            if (c4994.f18890 != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c4994.f18882 != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c4994.f18885 != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c4994.f18888 != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4994 m11101() {
        int i = this.f19024;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f19024).toString());
        }
        C5021 c5021 = this.f19025;
        if (c5021 == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC5022 enumC5022 = this.f19017;
        if (enumC5022 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f19028;
        if (str != null) {
            return new C4994(c5021, enumC5022, str, i, this.f19018, this.f19026.m4429(), this.f19027, this.f19023, this.f19029, this.f19019, this.f19022, this.f19020, this.f19021);
        }
        throw new IllegalStateException("message == null");
    }
}
