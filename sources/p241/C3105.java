package p241;

import android.support.v4.media.session.AbstractC0002;
import androidx.datastore.preferences.protobuf.AbstractC0080;
import java.security.GeneralSecurityException;
import p225.AbstractC2995;

/* renamed from: ˑﹳ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3105 extends AbstractC2995 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f11990;

    public C3105(int i, byte[] bArr) throws GeneralSecurityException {
        this.f11990 = i;
        if (!AbstractC0002.m34(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f11517 = mo7417(1, bArr);
        this.f11516 = mo7417(0, bArr);
    }

    @Override // p225.AbstractC2995
    /* renamed from: ˉי */
    public final AbstractC0080 mo7417(int i, byte[] bArr) {
        switch (this.f11990) {
            case 0:
                return new C3103(bArr, i, 0);
            default:
                return new C3103(bArr, i, 1);
        }
    }
}
