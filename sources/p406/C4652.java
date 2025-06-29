package p406;

import android.content.Context;
import android.support.v4.media.session.AbstractC0001;
import java.util.UUID;
import p031.C1195;
import p065.ExecutorC1522;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p331.C3768;
import p338.InterfaceC3864;
import p410.C4681;
import p414.AbstractC4730;
import p457.AbstractC5366;
import p457.C5367;
import p457.C5391;
import ˆʽ.ᵎˏ;
import ˈⁱ.ˉⁱ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ﹳʿ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4652 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f17769;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C4647 f17770;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ Context f17771;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5366 f17772;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3768 f17773;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4652(AbstractC5366 abstractC5366, C3768 c3768, C4647 c4647, Context context, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f17772 = abstractC5366;
        this.f17773 = c3768;
        this.f17770 = c4647;
        this.f17771 = context;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4652) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) throws Throwable {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f17769;
        AbstractC5366 abstractC5366 = this.f17772;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C4681 c4681Mo1368 = abstractC5366.mo1368();
            this.f17769 = 1;
            obj = AbstractC4730.m10644(c4681Mo1368, abstractC5366, this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ˉⁱ.ˆʿ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        C5367 c5367 = (C5367) obj;
        C3768 c3768 = this.f17773;
        if (c5367 == null) {
            throw new IllegalStateException(ᵎˏ.ˎٴ(new StringBuilder("Worker was marked important ("), c3768.f14573, ") but did not provide ForegroundInfo"));
        }
        String str = AbstractC4663.f17793;
        C5391.m12163().m12168(str, "Updating notification for " + c3768.f14573);
        UUID uuid = abstractC5366.f20826.f1757;
        C4647 c4647 = this.f17770;
        C4681 c4681 = ᵢʿ.ᴵʿ(new C1195((ExecutorC1522) c4647.f17765.ᐧⁱ, 17, new C4665(c4647, uuid, c5367, this.f17771)));
        this.f17769 = 2;
        obj = AbstractC0001.m25(c4681, this);
        return obj == enumC2332 ? enumC2332 : obj;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C4652(this.f17772, this.f17773, this.f17770, this.f17771, interfaceC3746);
    }
}
