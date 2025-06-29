package p000;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import p166.AbstractC2426;
import p383.AbstractC4464;
import p447.AbstractC5179;

/* renamed from: ʻ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0882 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f4000;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f4001;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f4002;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final byte[] f4003;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Uri f4004;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f4005;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f4006;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Map f4007;

    static {
        AbstractC2426.m6526("media3.datasource");
    }

    public C0882(Uri uri, int i, byte[] bArr, Map map, long j, long j2, String str, int i2) {
        AbstractC4464.m10142(j >= 0);
        AbstractC4464.m10142(j >= 0);
        AbstractC4464.m10142(j2 > 0 || j2 == -1);
        uri.getClass();
        this.f4004 = uri;
        this.f4000 = i;
        this.f4003 = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f4007 = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f4001 = j;
        this.f4005 = j2;
        this.f4006 = str;
        this.f4002 = i2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m3698(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(m3698(this.f4000));
        sb.append(" ");
        sb.append(this.f4004);
        sb.append(", ");
        sb.append(this.f4001);
        sb.append(", ");
        sb.append(this.f4005);
        sb.append(", ");
        sb.append(this.f4006);
        sb.append(", ");
        return AbstractC5179.m11550(sb, this.f4002, "]");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0882 m3699(long j) {
        long j2 = this.f4005;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new C0882(this.f4004, this.f4000, this.f4003, this.f4007, this.f4001 + j, j3, this.f4006, this.f4002);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0871 m3700() {
        C0871 c0871 = new C0871();
        c0871.f3954 = this.f4004;
        c0871.f3957 = this.f4000;
        c0871.f3958 = this.f4003;
        c0871.f3959 = this.f4007;
        c0871.f3953 = this.f4001;
        c0871.f3960 = this.f4005;
        c0871.f3955 = this.f4006;
        c0871.f3956 = this.f4002;
        return c0871;
    }
}
