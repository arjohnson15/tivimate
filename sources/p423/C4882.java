package p423;

import p155.EnumC2332;
import p185.AbstractC2562;

/* renamed from: ﹶʻ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4882 extends AbstractC2562 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C4883 f18405;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public /* synthetic */ Object f18406;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f18407;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4882(C4883 c4883, AbstractC2562 abstractC2562) {
        super(abstractC2562);
        this.f18405 = c4883;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        this.f18406 = obj;
        this.f18407 |= Integer.MIN_VALUE;
        Object objM10977 = this.f18405.m10977(null, 0, 0L, this);
        return objM10977 == EnumC2332.f9250 ? objM10977 : new C4877(objM10977);
    }
}
