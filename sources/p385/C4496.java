package p385;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;
import p166.AbstractC2424;
import p312.InterfaceC3586;

/* renamed from: ᵢﹶ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4496 implements InterfaceC4493 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final DrmSession$DrmSessionException f17311;

    public C4496(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.f17311 = drmSession$DrmSessionException;
    }

    @Override // p385.InterfaceC4493
    public final int getState() {
        return 1;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ʽᐧ */
    public final boolean mo10238() {
        return false;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ʿʼ */
    public final boolean mo10239(String str) {
        return false;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ˑʽ */
    public final void mo10246(C4480 c4480) {
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ـﹶ */
    public final void mo10247(C4480 c4480) {
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ٴˎ */
    public final DrmSession$DrmSessionException mo10248() {
        return this.f17311;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ᐧʻ */
    public final InterfaceC3586 mo10249() {
        return null;
    }

    @Override // p385.InterfaceC4493
    /* renamed from: ﹳﹳ */
    public final UUID mo10251() {
        return AbstractC2424.f9644;
    }
}
