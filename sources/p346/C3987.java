package p346;

/* renamed from: ᵎᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3987 implements InterfaceC3994, InterfaceC3990 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f15367;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public volatile InterfaceC3990 f15369;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f15370;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile InterfaceC3990 f15372;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f15368 = 3;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f15371 = 3;

    public C3987(Object obj, InterfaceC3994 interfaceC3994) {
        this.f15370 = obj;
        this.f15367 = interfaceC3994;
    }

    @Override // p346.InterfaceC3990
    public final void clear() {
        synchronized (this.f15370) {
            try {
                this.f15368 = 3;
                this.f15369.clear();
                if (this.f15371 != 3) {
                    this.f15371 = 3;
                    this.f15372.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3990
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f15370) {
            try {
                z = true;
                if (this.f15368 != 1 && this.f15371 != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ᵎᵎ.ﹳﹳ] */
    @Override // p346.InterfaceC3994
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo9218(InterfaceC3990 interfaceC3990) {
        synchronized (this.f15370) {
            try {
                if (interfaceC3990.equals(this.f15369)) {
                    this.f15368 = 4;
                } else if (interfaceC3990.equals(this.f15372)) {
                    this.f15371 = 4;
                }
                ?? r4 = this.f15367;
                if (r4 != 0) {
                    r4.mo9218(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ᵎᵎ.ﹳﹳ] */
    @Override // p346.InterfaceC3994
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean mo9219(InterfaceC3990 interfaceC3990) {
        boolean z;
        int i;
        synchronized (this.f15370) {
            ?? r1 = this.f15367;
            z = false;
            if (r1 == 0 || r1.mo9219(this)) {
                if (this.f15368 != 5 ? interfaceC3990.equals(this.f15369) : interfaceC3990.equals(this.f15372) && ((i = this.f15371) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo9220() {
        synchronized (this.f15370) {
            try {
                if (this.f15368 != 1) {
                    this.f15368 = 1;
                    this.f15369.mo9220();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean mo9221() {
        boolean z;
        synchronized (this.f15370) {
            try {
                z = this.f15368 == 4 || this.f15371 == 4;
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ᵎᵎ.ﹳﹳ] */
    @Override // p346.InterfaceC3994
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo9222(InterfaceC3990 interfaceC3990) {
        synchronized (this.f15370) {
            try {
                if (interfaceC3990.equals(this.f15372)) {
                    this.f15371 = 5;
                    ?? r3 = this.f15367;
                    if (r3 != 0) {
                        r3.mo9222(this);
                    }
                    return;
                }
                this.f15368 = 5;
                if (this.f15371 != 1) {
                    this.f15371 = 1;
                    this.f15372.mo9220();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean mo9223(InterfaceC3990 interfaceC3990) {
        if (!(interfaceC3990 instanceof C3987)) {
            return false;
        }
        C3987 c3987 = (C3987) interfaceC3990;
        return this.f15369.mo9223(c3987.f15369) && this.f15372.mo9223(c3987.f15372);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ᵎᵎ.ﹳﹳ] */
    @Override // p346.InterfaceC3994
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo9224(InterfaceC3990 interfaceC3990) {
        boolean z;
        synchronized (this.f15370) {
            ?? r0 = this.f15367;
            z = r0 == 0 || r0.mo9224(this);
        }
        return z;
    }

    @Override // p346.InterfaceC3994, p346.InterfaceC3990
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo9225() {
        boolean z;
        synchronized (this.f15370) {
            try {
                z = this.f15369.mo9225() || this.f15372.mo9225();
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ᵎᵎ.ﹳﹳ] */
    @Override // p346.InterfaceC3994
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo9226(InterfaceC3990 interfaceC3990) {
        boolean z;
        synchronized (this.f15370) {
            ?? r1 = this.f15367;
            z = (r1 == 0 || r1.mo9226(this)) && interfaceC3990.equals(this.f15369);
        }
        return z;
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo9227() {
        boolean z;
        synchronized (this.f15370) {
            try {
                z = this.f15368 == 3 && this.f15371 == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // p346.InterfaceC3990
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo9228() {
        synchronized (this.f15370) {
            try {
                if (this.f15368 == 1) {
                    this.f15368 = 2;
                    this.f15369.mo9228();
                }
                if (this.f15371 == 1) {
                    this.f15371 = 2;
                    this.f15372.mo9228();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ᵎᵎ.ﹳﹳ] */
    @Override // p346.InterfaceC3994
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final InterfaceC3994 mo9229() {
        InterfaceC3994 interfaceC3994Mo9229;
        synchronized (this.f15370) {
            try {
                ?? r1 = this.f15367;
                interfaceC3994Mo9229 = r1 != 0 ? r1.mo9229() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3994Mo9229;
    }
}
