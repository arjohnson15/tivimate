package p379;

import java.io.IOException;
import p363.AbstractC4133;
import p366.C4143;

/* renamed from: ᵢᐧ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4404 extends AbstractC4133 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C4413 f16965;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ int f16966;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ int f16967;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ C4143 f16968;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4404(String str, C4413 c4413, int i, C4143 c4143, int i2, boolean z) {
        super(str, true);
        this.f16965 = c4413;
        this.f16967 = i;
        this.f16968 = c4143;
        this.f16966 = i2;
    }

    @Override // p363.AbstractC4133
    /* renamed from: ـﹶ */
    public final long mo4576() {
        try {
            C4409 c4409 = this.f16965.f17025;
            C4143 c4143 = this.f16968;
            int i = this.f16966;
            c4409.getClass();
            c4143.skip(i);
            this.f16965.f17008.m10032(this.f16967, 9);
            synchronized (this.f16965) {
                this.f16965.f17003.remove(Integer.valueOf(this.f16967));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
