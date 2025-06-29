package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ᵢˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0524 extends AbstractC0486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f2868;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0524(Unsafe unsafe, int i) {
        super(unsafe);
        this.f2868 = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0486
    /* renamed from: ʿʼ */
    public final void mo2294(Object obj, long j, float f) {
        switch (this.f2868) {
            case 0:
                m2293(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m2293(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0486
    /* renamed from: ˏʾ */
    public final boolean mo2298(long j, Object obj) {
        switch (this.f2868) {
            case 0:
                if (AbstractC0547.f2893) {
                    if (((byte) (AbstractC0547.f2890.m2296((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) != 0) {
                    }
                } else {
                    if (((byte) (AbstractC0547.f2890.m2296((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) != 0) {
                    }
                }
                break;
            default:
                if (AbstractC0547.f2893) {
                    if (((byte) (AbstractC0547.f2890.m2296((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) != 0) {
                    }
                } else {
                    if (((byte) (AbstractC0547.f2890.m2296((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) != 0) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0486
    /* renamed from: ˑʽ */
    public final void mo2300(Object obj, long j, byte b) {
        switch (this.f2868) {
            case 0:
                if (!AbstractC0547.f2893) {
                    AbstractC0547.m2456(obj, j, b);
                    break;
                } else {
                    AbstractC0547.m2457(obj, j, b);
                    break;
                }
            default:
                if (!AbstractC0547.f2893) {
                    AbstractC0547.m2456(obj, j, b);
                    break;
                } else {
                    AbstractC0547.m2457(obj, j, b);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0486
    /* renamed from: ـﹶ */
    public final double mo2301(long j, Object obj) {
        switch (this.f2868) {
        }
        return Double.longBitsToDouble(m2297(j, obj));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0486
    /* renamed from: ᐧʻ */
    public final void mo2303(Object obj, long j, boolean z) {
        switch (this.f2868) {
            case 0:
                if (!AbstractC0547.f2893) {
                    AbstractC0547.m2456(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC0547.m2457(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!AbstractC0547.f2893) {
                    AbstractC0547.m2456(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    AbstractC0547.m2457(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0486
    /* renamed from: ﹳﹳ */
    public final void mo2304(Object obj, long j, double d) {
        switch (this.f2868) {
            case 0:
                m2302(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m2302(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0486
    /* renamed from: ﹶˆ */
    public final float mo2305(long j, Object obj) {
        switch (this.f2868) {
        }
        return Float.intBitsToFloat(m2296(j, obj));
    }
}
