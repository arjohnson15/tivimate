package p188;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p137.InterfaceC2105;
import p314.InterfaceC3594;

/* renamed from: ˎʾ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2632 extends AbstractC2636 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f10434 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC3594.f13813);

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        return obj instanceof C2632;
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        return 1572326941;
    }

    @Override // p188.AbstractC2636
    /* renamed from: ˑʽ */
    public final Bitmap mo6804(InterfaceC2105 interfaceC2105, Bitmap bitmap, int i, int i2) {
        return AbstractC2626.m6807(interfaceC2105, bitmap, i, i2);
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        messageDigest.update(f10434);
    }
}
