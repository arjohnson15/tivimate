package p314;

import android.text.TextUtils;
import p293.C3474;
import ˆʽ.ᵎˏ;

/* renamed from: ᐧᵢ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3602 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C3474 f13820 = new C3474(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3601 f13821;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f13822;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f13823;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile byte[] f13824;

    public C3602(String str, Object obj, InterfaceC3601 interfaceC3601) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f13822 = str;
        this.f13823 = obj;
        this.f13821 = interfaceC3601;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3602 m8503(Object obj, String str) {
        return new C3602(str, obj, f13820);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3602) {
            return this.f13822.equals(((C3602) obj).f13822);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13822.hashCode();
    }

    public final String toString() {
        return ᵎˏ.ˎٴ(new StringBuilder("Option{key='"), this.f13822, "'}");
    }
}
