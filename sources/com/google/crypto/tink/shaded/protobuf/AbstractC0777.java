package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0777 {
    /* renamed from: ʽᐧ */
    public abstract void mo3135(Object obj);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m3215(Object obj, C0746 c0746) throws InvalidProtocolBufferException {
        int i = c0746.f3586;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            c0746.m3110(0);
            ((C0741) obj).m3058(i2 << 3, Long.valueOf(c0746.f3588.mo469()));
            return true;
        }
        if (i3 == 1) {
            c0746.m3110(1);
            ((C0741) obj).m3058((i2 << 3) | 1, Long.valueOf(c0746.f3588.mo439()));
            return true;
        }
        if (i3 == 2) {
            ((C0741) obj).m3058((i2 << 3) | 2, c0746.m3106());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.m2923();
            }
            c0746.m3110(5);
            ((C0741) obj).m3058((i2 << 3) | 5, Integer.valueOf(c0746.f3588.mo466()));
            return true;
        }
        C0741 c0741M3054 = C0741.m3054();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (c0746.m3118() != Integer.MAX_VALUE && m3215(c0741M3054, c0746)) {
        }
        if (i5 != c0746.f3586) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c0741M3054.f3560 = false;
        ((C0741) obj).m3058(i4 | 3, c0741M3054);
        return true;
    }

    /* renamed from: ـﹶ */
    public abstract C0741 mo3136(Object obj);
}
