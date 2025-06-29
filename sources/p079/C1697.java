package p079;

import java.util.Hashtable;
import p120.InterfaceC1864;
import p432.AbstractC5026;

/* renamed from: ʿˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1697 implements InterfaceC1864 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f6610;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public AbstractC5026 f6611;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f6612;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC5026 f6613;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final byte[] f6614;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final byte[] f6615;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public AbstractC5026 f6616;

    static {
        Hashtable hashtable = new Hashtable();
        hashtable.put("GOST3411", 32);
        hashtable.put("MD2", 16);
        hashtable.put("MD4", 64);
        hashtable.put("MD5", 64);
        hashtable.put("RIPEMD128", 64);
        hashtable.put("RIPEMD160", 64);
        hashtable.put("SHA-1", 64);
        hashtable.put("SHA-224", 64);
        hashtable.put("SHA-256", 64);
        hashtable.put("SHA-384", 128);
        hashtable.put("SHA-512", 128);
        hashtable.put("Tiger", 64);
        hashtable.put("Whirlpool", 64);
    }

    public C1697(AbstractC5026 abstractC5026) {
        this.f6613 = abstractC5026;
        int iMo11116 = abstractC5026.mo11116();
        this.f6610 = iMo11116;
        this.f6612 = 64;
        this.f6614 = new byte[64];
        this.f6615 = new byte[64 + iMo11116];
    }
}
