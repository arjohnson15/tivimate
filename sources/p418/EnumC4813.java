package p418;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0754;

/* renamed from: ﹳᵔ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC4813 implements InterfaceC0754 {
    f18330("UNKNOWN_HASH"),
    f18333("SHA1"),
    f18335("SHA384"),
    f18331("SHA256"),
    f18336("SHA512"),
    f18337("SHA224"),
    f18332("UNRECOGNIZED");


    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18338;

    EnumC4813(String str) {
        this.f18338 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m10824() {
        if (this != f18332) {
            return this.f18338;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
