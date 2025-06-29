package p141;

import android.net.Uri;
import p383.AbstractC4464;

/* renamed from: ˉˑ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2189 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f8607;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Uri f8608;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f8609;

    public C2189(int i, long j, Uri uri) {
        this.f8609 = j;
        this.f8607 = i;
        this.f8608 = uri;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Uri m6121(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        AbstractC4464.m10142(scheme.equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        String host = uri3.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? uri3 : string.endsWith("/") ? AbstractC4464.m10126(string, str) : AbstractC4464.m10126(string.concat("/"), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p345.C3932 m6122(android.net.Uri r18, java.lang.String r19) throws androidx.media3.common.ParserException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p141.C2189.m6122(android.net.Uri, java.lang.String):ᵎᴵ.ˉᵎ");
    }
}
