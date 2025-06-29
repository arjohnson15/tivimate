package p376;

import java.io.IOException;
import p070.AbstractC1547;
import p070.C1551;
import p070.C1556;
import p070.C1561;
import p288.C3397;
import p338.InterfaceC3864;
import p366.C4149;

/* renamed from: ᵢˑ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4323 extends AbstractC1547 implements InterfaceC3864 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C1556 f16787;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C4149 f16788;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f16789;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ long f16790;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f16791;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C1551 f16792;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f16793;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1551 f16794;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1551 f16795;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4323(C1556 c1556, long j, C1551 c1551, C4149 c4149, C1551 c15512, C1551 c15513, C1561 c1561, C1561 c15612, C1561 c15613) {
        super(2);
        this.f16787 = c1556;
        this.f16790 = j;
        this.f16792 = c1551;
        this.f16788 = c4149;
        this.f16794 = c15512;
        this.f16795 = c15513;
        this.f16789 = c1561;
        this.f16791 = c15612;
        this.f16793 = c15613;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        C4149 c4149 = this.f16788;
        if (iIntValue == 1) {
            C1556 c1556 = this.f16787;
            if (c1556.f6294) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c1556.f6294 = true;
            if (jLongValue < this.f16790) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C1551 c1551 = this.f16792;
            long jM9552 = c1551.f6284;
            if (jM9552 == 4294967295L) {
                jM9552 = c4149.m9552();
            }
            c1551.f6284 = jM9552;
            C1551 c15512 = this.f16794;
            c15512.f6284 = c15512.f6284 == 4294967295L ? c4149.m9552() : 0L;
            C1551 c15513 = this.f16795;
            c15513.f6284 = c15513.f6284 == 4294967295L ? c4149.m9552() : 0L;
        } else if (iIntValue == 10) {
            if (jLongValue < 4) {
                throw new IOException("bad zip: NTFS extra too short");
            }
            c4149.skip(4L);
            AbstractC4318.m9810(c4149, (int) (jLongValue - 4), new C4322(this.f16789, c4149, this.f16791, this.f16793));
        }
        return C3397.f13249;
    }
}
