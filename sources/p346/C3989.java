package p346;

import ـˈ.ˉᵎ;

/* renamed from: ᵎᵎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3989 implements InterfaceC3994, InterfaceC3990 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f15373;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public volatile C3993 f15375;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3994 f15376;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f15378;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile InterfaceC3990 f15379;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f15374 = 3;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f15377 = 3;

    public C3989(Object obj, InterfaceC3994 interfaceC3994) {
        this.f15373 = obj;
        this.f15376 = interfaceC3994;
    }

    @Override // p346.InterfaceC3990
    public final void clear() {
        synchronized (this.f15373) {
            this.f15378 = false;
            this.f15374 = 3;
            this.f15377 = 3;
            this.f15379.clear();
            this.f15375.clear();
        }
    }

    @Override // p346.InterfaceC3990
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f15373) {
            z = true;
            if (this.f15374 != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p346.InterfaceC3994
    /* renamed from: ʽᐧ */
    public final void mo9218(InterfaceC3990 interfaceC3990) {
        synchronized (this.f15373) {
            try {
                if (interfaceC3990.equals(this.f15379)) {
                    this.f15377 = 4;
                    return;
                }
                this.f15374 = 4;
                InterfaceC3994 interfaceC3994 = this.f15376;
                if (interfaceC3994 != null) {
                    interfaceC3994.mo9218(this);
                }
                if (!ˉᵎ.ﹳﹳ(this.f15377)) {
                    this.f15379.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3994
    /* renamed from: ʿʼ */
    public final boolean mo9219(InterfaceC3990 interfaceC3990) {
        boolean z;
        synchronized (this.f15373) {
            try {
                InterfaceC3994 interfaceC3994 = this.f15376;
                z = (interfaceC3994 == null || interfaceC3994.mo9219(this)) && interfaceC3990.equals(this.f15375) && !mo9225();
            } finally {
            }
        }
        return z;
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˉי */
    public final void mo9220() {
        synchronized (this.f15373) {
            try {
                this.f15378 = true;
                try {
                    if (this.f15374 != 4 && this.f15377 != 1) {
                        this.f15377 = 1;
                        this.f15379.mo9220();
                    }
                    if (this.f15378 && this.f15374 != 1) {
                        this.f15374 = 1;
                        this.f15375.mo9220();
                    }
                    this.f15378 = false;
                } catch (Throwable th) {
                    this.f15378 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˉⁱ */
    public final boolean mo9221() {
        boolean z;
        synchronized (this.f15373) {
            z = this.f15374 == 4;
        }
        return z;
    }

    @Override // p346.InterfaceC3994
    /* renamed from: ˏʾ */
    public final void mo9222(InterfaceC3990 interfaceC3990) {
        synchronized (this.f15373) {
            try {
                if (!interfaceC3990.equals(this.f15375)) {
                    this.f15377 = 5;
                    return;
                }
                this.f15374 = 5;
                InterfaceC3994 interfaceC3994 = this.f15376;
                if (interfaceC3994 != null) {
                    interfaceC3994.mo9222(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˏᵢ */
    public final boolean mo9223(InterfaceC3990 interfaceC3990) {
        if (!(interfaceC3990 instanceof C3989)) {
            return false;
        }
        C3989 c3989 = (C3989) interfaceC3990;
        if (this.f15375 == null) {
            if (c3989.f15375 != null) {
                return false;
            }
        } else if (!this.f15375.mo9223(c3989.f15375)) {
            return false;
        }
        if (this.f15379 == null) {
            if (c3989.f15379 != null) {
                return false;
            }
        } else if (!this.f15379.mo9223(c3989.f15379)) {
            return false;
        }
        return true;
    }

    @Override // p346.InterfaceC3994
    /* renamed from: ˑʽ */
    public final boolean mo9224(InterfaceC3990 interfaceC3990) {
        boolean z;
        synchronized (this.f15373) {
            try {
                InterfaceC3994 interfaceC3994 = this.f15376;
                z = (interfaceC3994 == null || interfaceC3994.mo9224(this)) && (interfaceC3990.equals(this.f15375) || this.f15374 != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // p346.InterfaceC3994, p346.InterfaceC3990
    /* renamed from: ـﹶ */
    public final boolean mo9225() {
        boolean z;
        synchronized (this.f15373) {
            try {
                z = this.f15379.mo9225() || this.f15375.mo9225();
            } finally {
            }
        }
        return z;
    }

    @Override // p346.InterfaceC3994
    /* renamed from: ٴˎ */
    public final boolean mo9226(InterfaceC3990 interfaceC3990) {
        boolean z;
        synchronized (this.f15373) {
            try {
                InterfaceC3994 interfaceC3994 = this.f15376;
                z = (interfaceC3994 == null || interfaceC3994.mo9226(this)) && interfaceC3990.equals(this.f15375) && this.f15374 != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ᐧʻ */
    public final boolean mo9227() {
        boolean z;
        synchronized (this.f15373) {
            z = this.f15374 == 3;
        }
        return z;
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ﹳﹳ */
    public final void mo9228() {
        synchronized (this.f15373) {
            try {
                if (!ˉᵎ.ﹳﹳ(this.f15377)) {
                    this.f15377 = 2;
                    this.f15379.mo9228();
                }
                if (!ˉᵎ.ﹳﹳ(this.f15374)) {
                    this.f15374 = 2;
                    this.f15375.mo9228();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3994
    /* renamed from: ﹶˆ */
    public final InterfaceC3994 mo9229() {
        InterfaceC3994 interfaceC3994Mo9229;
        synchronized (this.f15373) {
            try {
                InterfaceC3994 interfaceC3994 = this.f15376;
                interfaceC3994Mo9229 = interfaceC3994 != null ? interfaceC3994.mo9229() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3994Mo9229;
    }
}
