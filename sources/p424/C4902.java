package p424;

import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.IOException;
import p076.InterfaceC1662;

/* renamed from: ﹶʾ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4902 implements InterfaceC1662 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C4899 f18561;

    @Override // p076.InterfaceC1662
    /* renamed from: ـﹶ */
    public void mo5333() throws IOException {
        C4899 c4899 = this.f18561;
        c4899.f18546.mo5333();
        DashManifestStaleException dashManifestStaleException = c4899.f18533;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }
}
