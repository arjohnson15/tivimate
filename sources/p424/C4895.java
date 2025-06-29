package p424;

import java.io.IOException;
import p166.C2431;
import p312.C3589;
import p331.C3767;
import p356.C4043;
import p374.InterfaceC4254;
import p383.AbstractC4470;
import p456.C5349;

/* renamed from: ﹶʾ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4895 implements InterfaceC4254 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C4043 f18484;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long[] f18486;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f18487;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2431 f18488;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f18489;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f18490;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3767 f18483 = new C3767(11);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f18485 = -9223372036854775807L;

    public C4895(C4043 c4043, C2431 c2431, boolean z) {
        this.f18488 = c2431;
        this.f18484 = c4043;
        this.f18486 = c4043.f15554;
        m11016(c4043, z);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11016(C4043 c4043, boolean z) {
        int i = this.f18490;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.f18486[i - 1];
        this.f18487 = z;
        this.f18484 = c4043;
        long[] jArr = c4043.f15554;
        this.f18486 = jArr;
        long j3 = this.f18485;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.f18490 = AbstractC4470.m10163(jArr, j2, false);
            }
        } else {
            int iM10163 = AbstractC4470.m10163(jArr, j3, true);
            this.f18490 = iM10163;
            if (this.f18487 && iM10163 == this.f18486.length) {
                j = j3;
            }
            this.f18485 = j;
        }
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ */
    public final int mo4054(C5349 c5349, C3589 c3589, int i) throws IOException {
        int i2 = this.f18490;
        boolean z = i2 == this.f18486.length;
        if (z && !this.f18487) {
            c3589.f5033 = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f18489) {
            c5349.f20757 = this.f18488;
            this.f18489 = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f18490 = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrM8801 = this.f18483.m8801(this.f18484.f15556[i2]);
            c3589.m8491(bArrM8801.length);
            c3589.f13800.put(bArrM8801);
        }
        c3589.f13807 = this.f18486[i2];
        c3589.f5033 = 1;
        return -4;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ */
    public final boolean mo4058() {
        return true;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ */
    public final void mo4062() {
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ */
    public final int mo4066(long j) {
        int iMax = Math.max(this.f18490, AbstractC4470.m10163(this.f18486, j, true));
        int i = iMax - this.f18490;
        this.f18490 = iMax;
        return i;
    }
}
