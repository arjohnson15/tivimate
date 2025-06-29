package p117;

import java.util.EnumSet;
import p087.C1731;
import p087.C1735;
import p334.C3789;
import ʿﾞ.ﹳﹳ;
import ﹳᴵ.ˉי;

/* renamed from: ˈˆ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1842 extends AbstractC1845 {

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final /* synthetic */ int f7066;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842(int i, EnumC1844 enumC1844, int i2) {
        super(EnumC1846.f7085, i, enumC1844, EnumSet.of(enumC1844));
        this.f7066 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1842(EnumC1846 enumC1846, int i, EnumSet enumSet) {
        super(enumC1846, i, enumSet);
        this.f7066 = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1842(EnumC1846 enumC1846, int i, EnumC1844 enumC1844, EnumSet enumSet) {
        super(enumC1846, i, enumC1844, enumSet);
        this.f7066 = 2;
    }

    @Override // p117.AbstractC1845
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ﹳﹳ mo5604(ˉי r3) {
        switch (this.f7066) {
            case 0:
                return new C1735(r3, 0);
            case 1:
                return new C1735(r3, 2);
            case 2:
                return new C1735(r3, 5);
            case 3:
                return new C1735(r3, 6);
            case 4:
                return new C1735(r3, 3);
            case 5:
                return new C1735(r3, 4);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1735(r3, 1);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1735(r3, 8);
            default:
                return new C1735(r3, 7);
        }
    }

    @Override // p117.AbstractC1845
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ﹳﹳ mo5605(ˈˉ.ﹳﹳ r3) {
        switch (this.f7066) {
            case 0:
                return new C1731(r3, 0);
            case 1:
                return new C1731(r3, 2);
            case 2:
                return new C1731(r3, 5);
            case 3:
                return new C1731(r3, 6);
            case 4:
                return new C1731(r3, 3);
            case 5:
                return new C1731(r3, 4);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1731(r3, 1);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1731(r3, 8);
            default:
                return new C1731(r3, 7);
        }
    }
}
