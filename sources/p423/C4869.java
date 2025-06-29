package p423;

import p155.EnumC2332;
import p185.AbstractC2562;

/* renamed from: ﹶʻ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4869 extends AbstractC2562 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C4883 f18385;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public /* synthetic */ Object f18386;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f18387;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4869(C4883 c4883, AbstractC2562 abstractC2562) {
        super(abstractC2562);
        this.f18385 = c4883;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        this.f18386 = obj;
        this.f18387 |= Integer.MIN_VALUE;
        Object objM10973 = C4883.m10973(this.f18385, this);
        return objM10973 == EnumC2332.f9250 ? objM10973 : new C4877(objM10973);
    }
}
