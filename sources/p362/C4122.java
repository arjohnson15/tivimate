package p362;

import java.nio.ByteBuffer;
import p312.C3589;
import p383.AbstractC4464;

/* renamed from: ᵔᵢ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4122 extends C3589 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f15920;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f15921;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public long f15922;

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m9440() {
        return this.f15920 > 0;
    }

    @Override // p312.C3589
    /* renamed from: ᵎˏ */
    public final void mo8492() {
        super.mo8492();
        this.f15920 = 0;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m9441(C3589 c3589) {
        ByteBuffer byteBuffer;
        AbstractC4464.m10142(!c3589.m4401(1073741824));
        AbstractC4464.m10142(!c3589.m4401(268435456));
        AbstractC4464.m10142(!c3589.m4401(4));
        if (m9440()) {
            if (this.f15920 >= this.f15921) {
                return false;
            }
            ByteBuffer byteBuffer2 = c3589.f13800;
            if (byteBuffer2 != null && (byteBuffer = this.f13800) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f15920;
        this.f15920 = i + 1;
        if (i == 0) {
            this.f13807 = c3589.f13807;
            if (c3589.m4401(1)) {
                this.f5033 = 1;
            }
        }
        ByteBuffer byteBuffer3 = c3589.f13800;
        if (byteBuffer3 != null) {
            m8491(byteBuffer3.remaining());
            this.f13800.put(byteBuffer3);
        }
        this.f15922 = c3589.f13807;
        return true;
    }
}
