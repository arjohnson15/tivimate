package p389;

import p162.C2355;

/* renamed from: ⁱʿ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4512 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public double f17362;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public double f17363;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2355 f17364;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public double f17365;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f17366;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public double f17367;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public double f17368;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public double f17369;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public double f17370;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public double f17371;

    public C4512() {
        this.f17367 = Math.sqrt(1500.0d);
        this.f17362 = 0.5d;
        this.f17366 = false;
        this.f17371 = Double.MAX_VALUE;
        this.f17364 = new C2355();
    }

    public C4512(float f) {
        this.f17367 = Math.sqrt(1500.0d);
        this.f17362 = 0.5d;
        this.f17366 = false;
        this.f17364 = new C2355();
        this.f17371 = f;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10275(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f17367 = Math.sqrt(f);
        this.f17366 = false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2355 m10276(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f17366) {
            if (this.f17371 == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f17362;
            if (d3 > 1.0d) {
                double d4 = this.f17367;
                this.f17368 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f17362;
                double d6 = this.f17367;
                this.f17369 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f17365 = Math.sqrt(1.0d - (d3 * d3)) * this.f17367;
            }
            this.f17366 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f17371;
        double d9 = this.f17362;
        if (d9 > 1.0d) {
            double d10 = this.f17369;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f17368);
            double d12 = d8 - d11;
            dPow = (Math.pow(2.718281828459045d, this.f17368 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f17369;
            double dPow2 = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f17368;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow2;
        } else if (d9 == 1.0d) {
            double d15 = this.f17367;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f17367) * d7) * d17;
            double d18 = -this.f17367;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow4 * d18);
            dPow = dPow3;
        } else {
            double d19 = 1.0d / this.f17365;
            double d20 = this.f17367;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            double dSin = ((Math.sin(this.f17365 * d7) * d21) + (Math.cos(this.f17365 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f17367;
            double d23 = this.f17362;
            double d24 = (-d22) * dSin * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f17365;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f17365;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow5) + d24;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f17371);
        C2355 c2355 = this.f17364;
        c2355.f9324 = f;
        c2355.f9323 = (float) dCos;
        return c2355;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10277(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f17362 = f;
        this.f17366 = false;
    }
}
