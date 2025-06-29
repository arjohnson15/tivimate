package p376;

import java.io.IOException;
import p070.AbstractC1547;
import p070.C1561;
import p288.C3397;
import p338.InterfaceC3864;
import p366.C4149;

/* renamed from: ᵢˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4322 extends AbstractC1547 implements InterfaceC3864 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f16783;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f16784;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C4149 f16785;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f16786;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4322(C1561 c1561, C4149 c4149, C1561 c15612, C1561 c15613) {
        super(2);
        this.f16783 = c1561;
        this.f16785 = c4149;
        this.f16786 = c15612;
        this.f16784 = c15613;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            C1561 c1561 = this.f16783;
            if (c1561.f6302 != null) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (jLongValue != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            C4149 c4149 = this.f16785;
            c1561.f6302 = Long.valueOf(c4149.m9552());
            this.f16786.f6302 = Long.valueOf(c4149.m9552());
            this.f16784.f6302 = Long.valueOf(c4149.m9552());
        }
        return C3397.f13249;
    }
}
