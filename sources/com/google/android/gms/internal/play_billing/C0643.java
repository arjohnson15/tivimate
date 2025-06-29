package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.ᐧʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0643 extends AbstractC0596 {
    public C0643(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0596
    /* renamed from: ʽᐧ */
    public final float mo2562(long j, Object obj) {
        return Float.intBitsToFloat(this.f2963.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0596
    /* renamed from: ʿʼ */
    public final void mo2563(Object obj, long j, double d) {
        this.f2963.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0596
    /* renamed from: ˑʽ */
    public final void mo2564(Object obj, long j, boolean z) {
        if (AbstractC0603.f2973) {
            AbstractC0603.m2581(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC0603.m2591(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0596
    /* renamed from: ـﹶ */
    public final double mo2565(long j, Object obj) {
        return Double.longBitsToDouble(this.f2963.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0596
    /* renamed from: ٴˎ */
    public final void mo2566(Object obj, long j, float f) {
        this.f2963.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0596
    /* renamed from: ᐧʻ */
    public final boolean mo2567(long j, Object obj) {
        return AbstractC0603.f2973 ? AbstractC0603.m2598(j, obj) : AbstractC0603.m2587(j, obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0596
    /* renamed from: ﹳﹳ */
    public final void mo2568(Object obj, long j, byte b) {
        if (AbstractC0603.f2973) {
            AbstractC0603.m2581(obj, j, b);
        } else {
            AbstractC0603.m2591(obj, j, b);
        }
    }
}
