package p010;

import p070.AbstractC1549;
import p072.AbstractC1642;
import p155.EnumC2332;
import p184.InterfaceC2552;
import p185.AbstractC2562;
import p185.InterfaceC2566;
import p288.AbstractC3404;
import p288.C3397;
import p317.AbstractC3617;
import p330.C3749;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p338.InterfaceC3864;

/* renamed from: ʻˎ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1009 extends AbstractC2562 implements InterfaceC2552 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC3747 f4372;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC3746 f4373;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC2552 f4374;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f4375;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InterfaceC3747 f4376;

    public C1009(InterfaceC2552 interfaceC2552, InterfaceC3747 interfaceC3747) {
        super(C1019.f4398, C3749.f14510);
        this.f4374 = interfaceC2552;
        this.f4372 = interfaceC3747;
        this.f4375 = ((Number) interfaceC3747.mo3968(0, new C1021(0))).intValue();
    }

    @Override // p184.InterfaceC2552
    /* renamed from: ˏʾ */
    public final Object mo3959(Object obj, InterfaceC3746 interfaceC3746) {
        try {
            Object objM3964 = m3964(interfaceC3746, obj);
            return objM3964 == EnumC2332.f9250 ? objM3964 : C3397.f13249;
        } catch (Throwable th) {
            this.f4376 = new C1010(th, interfaceC3746.mo3963());
            throw th;
        }
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final StackTraceElement mo3961() {
        return null;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        Throwable thM8265 = AbstractC3404.m8265(obj);
        if (thM8265 != null) {
            this.f4376 = new C1010(thM8265, mo3963());
        }
        InterfaceC3746 interfaceC3746 = this.f4373;
        if (interfaceC3746 != null) {
            interfaceC3746.mo3974(obj);
        }
        return EnumC2332.f9250;
    }

    @Override // p185.AbstractC2563, p185.InterfaceC2566
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC2566 mo3962() {
        InterfaceC3746 interfaceC3746 = this.f4373;
        if (interfaceC3746 instanceof InterfaceC2566) {
            return (InterfaceC2566) interfaceC3746;
        }
        return null;
    }

    @Override // p185.AbstractC2562, p330.InterfaceC3746
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC3747 mo3963() {
        InterfaceC3747 interfaceC3747 = this.f4376;
        return interfaceC3747 == null ? C3749.f14510 : interfaceC3747;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final Object m3964(InterfaceC3746 interfaceC3746, Object obj) {
        InterfaceC3747 interfaceC3747Mo3963 = interfaceC3746.mo3963();
        AbstractC1642.m5298(interfaceC3747Mo3963);
        InterfaceC3747 interfaceC3747 = this.f4376;
        if (interfaceC3747 != interfaceC3747Mo3963) {
            if (interfaceC3747 instanceof C1010) {
                throw new IllegalStateException(AbstractC3617.m8553("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C1010) interfaceC3747).f4377 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            final int i = 0;
            if (((Number) interfaceC3747Mo3963.mo3968(0, new InterfaceC3864() { // from class: ʻˎ.ʿˏ
                /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
                @Override // p338.InterfaceC3864
                /* renamed from: ʿʼ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object mo1054(java.lang.Object r11, java.lang.Object r12) {
                    /*
                        Method dump skipped, instructions count: 440
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p010.C1004.mo1054(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            })).intValue() != this.f4375) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4372 + ",\n\t\tbut emission happened in " + interfaceC3747Mo3963 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f4376 = interfaceC3747Mo3963;
        }
        this.f4373 = interfaceC3746;
        AbstractC1022.f4401.getClass();
        Object objMo3959 = this.f4374.mo3959(obj, this);
        if (!AbstractC1549.m5138(objMo3959, EnumC2332.f9250)) {
            this.f4373 = null;
        }
        return objMo3959;
    }
}
