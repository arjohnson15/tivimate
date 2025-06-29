package p418;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0754;

/* renamed from: ﹳᵔ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC4829 implements InterfaceC0754 {
    f18340("UNKNOWN_STATUS"),
    f18342("ENABLED"),
    f18343("DISABLED"),
    f18341("DESTROYED"),
    f18344("UNRECOGNIZED");


    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18346;

    EnumC4829(String str) {
        this.f18346 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m10863() {
        if (this != f18344) {
            return this.f18346;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
