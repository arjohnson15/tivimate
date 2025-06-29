package p396;

import java.io.IOException;
import p366.AbstractC4153;
import p366.C4143;
import p366.InterfaceC4161;

/* renamed from: ⁱᴵ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4595 extends AbstractC4153 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C4594 f17593;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4595(C4594 c4594, InterfaceC4161 interfaceC4161) {
        super(interfaceC4161);
        this.f17593 = c4594;
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws IOException {
        try {
            return this.f16062.mo4577(c4143, 8192L);
        } catch (IOException e) {
            this.f17593.f17591 = e;
            throw e;
        }
    }
}
