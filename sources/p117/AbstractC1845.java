package p117;

import com.hierynomus.asn1.ASN1ParseException;
import j$.util.Objects;
import java.util.EnumSet;
import java.util.HashMap;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ᵎˏ;
import ﹳᴵ.ˉי;

/* renamed from: ˈˆ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1845 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final HashMap f7072;

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C1842 f7073;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C1842 f7074;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final C1842 f7075;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C1842 f7076;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1842 f7077;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1842 f7078;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1842 f7079;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C1842 f7080;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f7081;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final EnumSet f7082;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EnumC1846 f7083;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final EnumC1844 f7084;

    static {
        HashMap map = new HashMap();
        f7072 = map;
        EnumC1846 enumC1846 = EnumC1846.f7085;
        EnumC1844 enumC1844 = EnumC1844.f7068;
        C1842 c1842 = new C1842(1, enumC1844, 0);
        f7078 = c1842;
        C1842 c18422 = new C1842(2, enumC1844, 1);
        f7079 = c18422;
        EnumC1844 enumC18442 = EnumC1844.f7069;
        C1842 c18423 = new C1842(enumC1846, 3, enumC1844, EnumSet.of(enumC1844, enumC18442));
        C1842 c18424 = new C1842(enumC1846, 4, EnumSet.of(enumC1844, enumC18442));
        f7077 = c18424;
        C1842 c18425 = new C1842(5, enumC1844, 4);
        f7080 = c18425;
        C1842 c18426 = new C1842(6, enumC1844, 5);
        f7073 = c18426;
        C1842 c18427 = new C1842(10, enumC1844, 6);
        f7076 = c18427;
        C1842 c18428 = new C1842(17, enumC18442, 7);
        f7074 = c18428;
        C1842 c18429 = new C1842(16, enumC18442, 8);
        f7075 = c18429;
        map.put(1, c1842);
        map.put(2, c18422);
        map.put(3, c18423);
        map.put(4, c18424);
        map.put(5, c18425);
        map.put(6, c18426);
        map.put(10, c18427);
        map.put(17, c18428);
        map.put(16, c18429);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1845(EnumC1846 enumC1846, int i, EnumSet enumSet) {
        EnumC1844 enumC1844 = EnumC1844.f7068;
        this(enumC1846, i, enumSet.contains(enumC1844) ? enumC1844 : EnumC1844.f7069, enumSet);
    }

    public AbstractC1845(EnumC1846 enumC1846, int i, EnumC1844 enumC1844, EnumSet enumSet) {
        this.f7083 = enumC1846;
        this.f7081 = i;
        this.f7082 = enumSet;
        this.f7084 = enumC1844;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static AbstractC1845 m5606(EnumC1846 enumC1846, int i) {
        int iOrdinal = enumC1846.ordinal();
        HashMap map = f7072;
        if (iOrdinal == 0) {
            for (AbstractC1845 abstractC1845 : map.values()) {
                if (abstractC1845.f7081 == i && enumC1846 == abstractC1845.f7083) {
                    return abstractC1845;
                }
            }
        } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C1847(enumC1846, i, EnumSet.of(EnumC1844.f7068, EnumC1844.f7069));
        }
        throw new ASN1ParseException(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", enumC1846, Integer.valueOf(i), map));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1845 abstractC1845 = (AbstractC1845) obj;
        return this.f7081 == abstractC1845.f7081 && this.f7083 == abstractC1845.f7083 && this.f7084 == abstractC1845.f7084;
    }

    public final int hashCode() {
        return Objects.hash(this.f7083, Integer.valueOf(this.f7081), this.f7084);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ASN1Tag[");
        sb.append(this.f7083);
        sb.append(",");
        sb.append(this.f7084);
        sb.append(",");
        return ᵎˏ.ᵎـ(sb, this.f7081, ']');
    }

    /* renamed from: ˑʽ */
    public abstract ﹳﹳ mo5604(ˉי r1);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC1845 m5607(EnumC1844 enumC1844) {
        if (this.f7084 == enumC1844) {
            return this;
        }
        if (this.f7082.contains(enumC1844)) {
            return new C1843(this, this.f7083, this.f7081, enumC1844, this.f7082);
        }
        throw new IllegalArgumentException(String.format("The ASN.1 tag %s does not support encoding as %s", this, enumC1844));
    }

    /* renamed from: ﹳﹳ */
    public abstract ﹳﹳ mo5605(ˈˉ.ﹳﹳ r1);
}
