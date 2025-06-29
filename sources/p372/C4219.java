package p372;

import com.bumptech.glide.ﹳﹳ;
import java.util.Arrays;
import p256.AbstractC3191;

/* renamed from: ᵢˆ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4219 extends AbstractC3191 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public byte[] f16265;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public byte[] f16266;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public volatile boolean f16267;

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳˎ */
    public final void mo5325() {
        this.f16267 = true;
    }

    @Override // p076.InterfaceC1656
    /* renamed from: ﹳﹳ */
    public final void mo5326() {
        try {
            this.f12394.mo3680(this.f12390);
            int iMo3679 = 0;
            int i = 0;
            while (iMo3679 != -1 && !this.f16267) {
                byte[] bArr = this.f16266;
                if (bArr.length < i + 16384) {
                    this.f16266 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                iMo3679 = this.f12394.mo3679(this.f16266, i, 16384);
                if (iMo3679 != -1) {
                    i += iMo3679;
                }
            }
            if (!this.f16267) {
                this.f16265 = Arrays.copyOf(this.f16266, i);
            }
            ﹳﹳ.ﹶˆ(this.f12394);
        } catch (Throwable th) {
            ﹳﹳ.ﹶˆ(this.f12394);
            throw th;
        }
    }
}
