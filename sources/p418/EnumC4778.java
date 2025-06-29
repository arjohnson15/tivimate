package p418;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0754;

/* renamed from: ﹳᵔ.ʻʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC4778 implements InterfaceC0754 {
    f18314("UNKNOWN_PREFIX"),
    f18317("TINK"),
    f18318("LEGACY"),
    f18315("RAW"),
    f18319("CRUNCHY"),
    f18320("UNRECOGNIZED");


    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18321;

    EnumC4778(String str) {
        this.f18321 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static EnumC4778 m10703(int i) {
        if (i == 0) {
            return f18314;
        }
        if (i == 1) {
            return f18317;
        }
        if (i == 2) {
            return f18318;
        }
        if (i == 3) {
            return f18315;
        }
        if (i != 4) {
            return null;
        }
        return f18319;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m10704() {
        if (this != f18320) {
            return this.f18321;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
