package p116;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import p007.ExecutorC0955;
import p072.C1602;
import p155.EnumC2332;
import p288.C3397;
import p330.InterfaceC3746;
import p453.C5194;
import ⁱـ.ˑי;

/* renamed from: ˈʾ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1838 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final MeasurementManager f7064;

    public C1838(Context context) {
        this.f7064 = AbstractC1836.m5592(context.getSystemService(AbstractC1836.m5595()));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object m5597(InterfaceC3746<? super Integer> interfaceC3746) {
        C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
        c1602.m5205();
        this.f7064.getMeasurementApiStatus(new ExecutorC0955(1), new C5194(c1602));
        return c1602.m5203();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object m5598(AbstractC1840 abstractC1840, InterfaceC3746<? super C3397> interfaceC3746) {
        new C1602(1, ˑי.ˏᴵ(interfaceC3746)).m5205();
        AbstractC1836.m5587();
        throw null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object m5599(Uri uri, InputEvent inputEvent, InterfaceC3746<? super C3397> interfaceC3746) {
        C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
        c1602.m5205();
        this.f7064.registerSource(uri, inputEvent, new ExecutorC0955(1), new C5194(c1602));
        Object objM5203 = c1602.m5203();
        return objM5203 == EnumC2332.f9250 ? objM5203 : C3397.f13249;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object m5600(AbstractC1839 abstractC1839, InterfaceC3746<? super C3397> interfaceC3746) {
        new C1602(1, ˑי.ˏᴵ(interfaceC3746)).m5205();
        AbstractC1836.m5585();
        throw null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object m5601(AbstractC1837 abstractC1837, InterfaceC3746<? super C3397> interfaceC3746) {
        new C1602(1, ˑי.ˏᴵ(interfaceC3746)).m5205();
        AbstractC1836.m5588();
        throw null;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object m5602(Uri uri, InterfaceC3746<? super C3397> interfaceC3746) {
        C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
        c1602.m5205();
        this.f7064.registerTrigger(uri, new ExecutorC0955(1), new C5194(c1602));
        Object objM5203 = c1602.m5203();
        return objM5203 == EnumC2332.f9250 ? objM5203 : C3397.f13249;
    }
}
