package p148;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p072.AbstractC1598;
import p072.AbstractC1608;
import p072.AbstractC1628;
import p072.AbstractC1636;
import p072.AbstractC1642;
import p072.C1626;
import p185.AbstractC2562;
import p185.InterfaceC2566;
import p288.AbstractC3404;
import p330.InterfaceC3746;
import p330.InterfaceC3747;

/* renamed from: ˊʻ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2257 extends AbstractC1598 implements InterfaceC2566, InterfaceC3746 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8977 = AtomicReferenceFieldUpdater.newUpdater(C2257.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final AbstractC2562 f8978;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AbstractC1636 f8979;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object f8980;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Object f8981;

    public C2257(AbstractC1636 abstractC1636, AbstractC2562 abstractC2562) {
        super(-1);
        this.f8979 = abstractC1636;
        this.f8978 = abstractC2562;
        this.f8980 = AbstractC2269.f9000;
        this.f8981 = abstractC2562.mo3963().mo3968(0, AbstractC2269.f9001);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f8979 + ", " + AbstractC1642.m5287(this.f8978) + ']';
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        Throwable thM8265 = AbstractC3404.m8265(obj);
        Object c1626 = thM8265 == null ? obj : new C1626(thM8265, false);
        AbstractC2562 abstractC2562 = this.f8978;
        InterfaceC3747 interfaceC3747Mo3963 = abstractC2562.mo3963();
        AbstractC1636 abstractC1636 = this.f8979;
        if (abstractC1636.mo5276(interfaceC3747Mo3963)) {
            this.f8980 = c1626;
            this.f6358 = 0;
            abstractC1636.mo5198(abstractC2562.mo3963(), this);
            return;
        }
        AbstractC1608 abstractC1608M5245 = AbstractC1628.m5245();
        if (abstractC1608M5245.m5225()) {
            this.f8980 = c1626;
            this.f6358 = 0;
            abstractC1608M5245.m5228(this);
            return;
        }
        abstractC1608M5245.m5224(true);
        try {
            InterfaceC3747 interfaceC3747Mo39632 = abstractC2562.mo3963();
            Object objM6280 = AbstractC2269.m6280(interfaceC3747Mo39632, this.f8981);
            try {
                abstractC2562.mo3974(obj);
                while (abstractC1608M5245.m5230()) {
                }
            } finally {
                AbstractC2269.m6288(interfaceC3747Mo39632, objM6280);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p072.AbstractC1598
    /* renamed from: ˏʾ */
    public final Object mo5192() {
        Object obj = this.f8980;
        this.f8980 = AbstractC2269.f9000;
        return obj;
    }

    @Override // p072.AbstractC1598
    /* renamed from: ˑʽ */
    public final InterfaceC3746 mo5194() {
        return this;
    }

    @Override // p185.InterfaceC2566
    /* renamed from: ٴˎ */
    public final InterfaceC2566 mo3962() {
        return this.f8978;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return this.f8978.mo3963();
    }
}
