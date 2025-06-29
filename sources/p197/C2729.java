package p197;

/* renamed from: ˎˑ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2729 implements InterfaceC2724 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float[] f10681;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2729(float r27, float r28) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p197.C2729.<init>(float, float):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m6934(float f, float f2) {
        return Math.abs(f - f2) < 0.01f;
    }

    @Override // p197.InterfaceC2724
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = (this.f10681.length / 3) - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < m6935(i2)) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float fM6935 = m6935(length) - m6935(i);
        if (fM6935 == 0.0f) {
            return m6936(i);
        }
        float fM69352 = (f - m6935(i)) / fM6935;
        float fM6936 = m6936(i);
        return ((m6936(length) - fM6936) * fM69352) + fM6936;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float m6935(int i) {
        return this.f10681[(i * 3) + 1];
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float m6936(int i) {
        return this.f10681[(i * 3) + 2];
    }
}
