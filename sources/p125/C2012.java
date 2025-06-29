package p125;

import java.io.IOException;
import p405.C4640;
import p449.AbstractC5188;
import p456.C5349;

/* renamed from: ˈᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2012 extends AbstractC5188 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public short f7654;

    @Override // p449.AbstractC5188
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void mo5656(C5349 c5349) throws IOException {
        super.mo5656(c5349);
        int iOrdinal = this.f20005.ordinal();
        if (iOrdinal == 12) {
            C4640 c4640 = (C4640) c5349.f20757;
            this.f7654 = (short) c4640.readUnsignedShort();
            c4640.readUnsignedShort();
            c5349.m12098(this.f20004 - 20);
            return;
        }
        if (iOrdinal == 13) {
            c5349.m12098(this.f20004 - 16);
        } else {
            throw new IOException("Invalid PDU type: " + this.f20005);
        }
    }
}
