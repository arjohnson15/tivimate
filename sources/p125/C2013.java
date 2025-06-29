package p125;

import java.io.IOException;
import p405.C4640;
import p449.AbstractC5188;
import p456.C5349;

/* renamed from: ˈᵎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2013 extends AbstractC5188 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public byte[] f7655;

    @Override // p449.AbstractC5188
    /* renamed from: ﾞˊ */
    public final void mo5656(C5349 c5349) throws IOException {
        super.mo5656(c5349);
        this.f7655 = new byte[(this.f20004 - this.f20001) - 24];
        c5349.m12098(8);
        ((C4640) c5349.f20757).readFully(this.f7655);
        c5349.m12098(this.f20001);
    }
}
