package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0761 extends AbstractC0771 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f3601;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0761(Unsafe unsafe, int i) {
        super(unsafe);
        this.f3601 = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ʿʼ */
    public final double mo3154(long j, Object obj) {
        switch (this.f3601) {
        }
        return Double.longBitsToDouble(m3206(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˉⁱ */
    public final void mo3155(Object obj, long j, byte b) {
        switch (this.f3601) {
            case 0:
                if (!AbstractC0768.f3626) {
                    AbstractC0768.m3198(obj, j, b);
                    break;
                } else {
                    AbstractC0768.m3192(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC0768.f3626) {
                    AbstractC0768.m3198(obj, j, b);
                    break;
                } else {
                    AbstractC0768.m3192(obj, j, b);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˋⁱ */
    public final void mo3156(Object obj, long j, double d) {
        switch (this.f3601) {
            case 0:
                m3207(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m3207(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˏʾ */
    public final void mo3158(Object obj, long j, boolean z) {
        switch (this.f3601) {
            case 0:
                if (!AbstractC0768.f3626) {
                    AbstractC0768.m3198(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC0768.m3192(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC0768.f3626) {
                    AbstractC0768.m3198(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC0768.m3192(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˑʽ */
    public final boolean mo3159(long j, Object obj) {
        switch (this.f3601) {
            case 0:
                if (AbstractC0768.f3626) {
                    if (AbstractC0768.m3190(j, obj) != 0) {
                    }
                } else if (AbstractC0768.m3201(j, obj) != 0) {
                }
                break;
            default:
                if (AbstractC0768.f3626) {
                    if (AbstractC0768.m3190(j, obj) != 0) {
                    }
                } else if (AbstractC0768.m3201(j, obj) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ٴˎ */
    public final float mo3160(long j, Object obj) {
        switch (this.f3601) {
        }
        return Float.intBitsToFloat(m3209(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ᴵʿ */
    public final void mo3161(Object obj, long j, float f) {
        switch (this.f3601) {
            case 0:
                m3205(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m3205(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ᵎˏ */
    public final boolean mo3162() {
        switch (this.f3601) {
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ﹳﹳ */
    public final byte mo3163(long j, Object obj) {
        switch (this.f3601) {
            case 0:
                if (!AbstractC0768.f3626) {
                    break;
                } else {
                    break;
                }
            default:
                if (!AbstractC0768.f3626) {
                    break;
                } else {
                    break;
                }
        }
        return AbstractC0768.m3201(j, obj);
    }
}
