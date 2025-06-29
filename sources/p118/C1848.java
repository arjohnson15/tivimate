package p118;

import com.parse.ParseException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p148.AbstractC2269;
import p282.C3378;
import p288.C3397;
import p330.InterfaceC3747;
import p338.InterfaceC3856;
import p338.InterfaceC3870;
import ٴʾ.ٴˎ;

/* renamed from: ˈˈ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1848 implements InterfaceC3870 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f7090;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7091;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f7092;

    public /* synthetic */ C1848(Object obj, int i, Object obj2) {
        this.f7092 = i;
        this.f7090 = obj;
        this.f7091 = obj2;
    }

    @Override // p338.InterfaceC3870
    /* renamed from: ﹳﹳ */
    public final Object mo3975(Object obj, Object obj2, Object obj3) {
        switch (this.f7092) {
            case 0:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1856.f7105;
                ((C1852) this.f7091).getClass();
                C1856 c1856 = (C1856) this.f7090;
                atomicReferenceFieldUpdater.set(c1856, null);
                c1856.mo5615(null);
                break;
            case 1:
                ((C3378) this.f7090).f13214.ˏʾ(new ٴˎ((String) this.f7091, (String) obj, (String) obj2, (ParseException) obj3));
                break;
            default:
                AbstractC2269.m6284((InterfaceC3856) this.f7090, this.f7091, (InterfaceC3747) obj3);
                break;
        }
        return C3397.f13249;
    }
}
