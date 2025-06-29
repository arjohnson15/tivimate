package p374;

import p166.C2433;
import p345.AbstractC3980;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ᵢˎ.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4241 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4241 f16463 = new C4241(new C2433[0]);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3932 f16464;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f16465;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f16466;

    static {
        AbstractC4470.m10164(0);
    }

    public C4241(C2433... c2433Arr) {
        this.f16464 = AbstractC3980.m9210(c2433Arr);
        this.f16466 = c2433Arr.length;
        int i = 0;
        while (true) {
            C3932 c3932 = this.f16464;
            if (i >= c3932.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < c3932.size(); i3++) {
                if (((C2433) c3932.get(i)).equals(c3932.get(i3))) {
                    AbstractC4464.m10147("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4241.class != obj.getClass()) {
            return false;
        }
        C4241 c4241 = (C4241) obj;
        return this.f16466 == c4241.f16466 && this.f16464.equals(c4241.f16464);
    }

    public final int hashCode() {
        if (this.f16465 == 0) {
            this.f16465 = this.f16464.hashCode();
        }
        return this.f16465;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m9703(C2433 c2433) {
        int iIndexOf = this.f16464.indexOf(c2433);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2433 m9704(int i) {
        return (C2433) this.f16464.get(i);
    }
}
