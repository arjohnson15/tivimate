package p123;

import java.util.HashMap;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˈـ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2001 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Integer f7609;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Long f7610;

    /* renamed from: ˉי, reason: contains not printable characters */
    public byte[] f7611;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String f7612;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1997 f7613;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f7614;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public HashMap f7615;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Integer f7616;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Long f7617;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public byte[] f7618;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2010 m5650() {
        String strConcat = this.f7614 == null ? " transportName" : "";
        if (this.f7613 == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (this.f7617 == null) {
            strConcat = ᐧʻ.ˉⁱ(strConcat, " eventMillis");
        }
        if (this.f7610 == null) {
            strConcat = ᐧʻ.ˉⁱ(strConcat, " uptimeMillis");
        }
        if (this.f7615 == null) {
            strConcat = ᐧʻ.ˉⁱ(strConcat, " autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new C2010(this.f7614, this.f7609, this.f7613, this.f7617.longValue(), this.f7610.longValue(), this.f7615, this.f7616, this.f7612, this.f7618, this.f7611);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5651(String str, String str2) {
        HashMap map = this.f7615;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }
}
