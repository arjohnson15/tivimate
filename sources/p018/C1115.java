package p018;

import java.util.EnumSet;
import java.util.Set;
import p078.AbstractC1685;
import p078.EnumC1681;
import p078.EnumC1683;
import p078.EnumC1687;
import p078.EnumC1689;
import p180.AbstractC2497;
import p180.AbstractC2500;
import p283.C3380;
import p334.C3789;
import p342.EnumC3910;
import p408.C4672;

/* renamed from: ʻⁱ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1115 extends AbstractC1685 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f4726;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f4727;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Set f4728;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C4672 f4729;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Set f4730;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Set f4731;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final EnumSet f4732;

    public C1115(EnumC1689 enumC1689, long j, long j2, int i, EnumSet enumSet, EnumSet enumSet2, Set set, int i2, EnumSet enumSet3, C4672 c4672) {
        super(57, enumC1689, EnumC1683.f6553, j, j2);
        this.f4726 = i != 0 ? i : 2;
        this.f4732 = enumSet;
        this.f4730 = enumSet2 == null ? EnumSet.noneOf(EnumC3910.class) : enumSet2;
        this.f4731 = set == null ? EnumSet.noneOf(EnumC1687.class) : set;
        this.f4727 = i2 != 0 ? i2 : 1;
        this.f4728 = enumSet3 == null ? EnumSet.noneOf(EnumC1681.class) : enumSet3;
        this.f4729 = c4672;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        long j;
        long j2;
        byte[] bytes;
        int i = this.f6557;
        c3380.m8847(i);
        c3380.mo6214((byte) 0);
        c3380.mo6214((byte) 0);
        int i2 = this.f4726;
        if (i2 == 1) {
            j = 0;
        } else if (i2 == 2) {
            j = 1;
        } else if (i2 == 3) {
            j = 2;
        } else {
            if (i2 != 4) {
                throw null;
            }
            j = 3;
        }
        c3380.m8844(j);
        c3380.m8239(8);
        c3380.m8239(8);
        c3380.m8844(AbstractC2500.m6610(this.f4732));
        c3380.m8844(AbstractC2500.m6610(this.f4730));
        c3380.m8844(AbstractC2500.m6610(this.f4731));
        switch (this.f4727) {
            case 1:
                j2 = 0;
                break;
            case 2:
                j2 = 1;
                break;
            case 3:
                j2 = 2;
                break;
            case 4:
                j2 = 3;
                break;
            case 5:
                j2 = 4;
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                j2 = 5;
                break;
            default:
                throw null;
        }
        c3380.m8844(j2);
        c3380.m8844(AbstractC2500.m6610(this.f4728));
        int i3 = i + 63;
        String str = this.f4729.f17809;
        if (str == null || str.trim().length() == 0) {
            c3380.m8847(i3);
            c3380.m8847(0);
            bytes = new byte[1];
        } else {
            bytes = str.getBytes(AbstractC2497.f9929);
            c3380.m8847(i3);
            c3380.m8847(bytes.length);
        }
        c3380.m8844(0L);
        c3380.m8844(0L);
        c3380.mo6213(bytes.length, bytes);
    }
}
