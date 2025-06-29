package p071;

import java.util.HashMap;
import p286.AbstractC3390;

/* renamed from: ʿʼ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1567 extends AbstractC1570 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ String f6306;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3390 f6307;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6308;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1569 f6309;

    public /* synthetic */ C1567(AbstractC1569 abstractC1569, String str, AbstractC3390 abstractC3390, int i) {
        this.f6308 = i;
        this.f6309 = abstractC1569;
        this.f6306 = str;
        this.f6307 = abstractC3390;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m5157() {
        this.f6309.m5163(this.f6306);
    }

    @Override // p071.AbstractC1570
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5158(Object obj) throws Exception {
        switch (this.f6308) {
            case 0:
                AbstractC1569 abstractC1569 = this.f6309;
                HashMap map = abstractC1569.f6314;
                String str = this.f6306;
                Integer num = (Integer) map.get(str);
                AbstractC3390 abstractC3390 = this.f6307;
                if (num != null) {
                    abstractC1569.f6320.add(str);
                    try {
                        abstractC1569.mo5159(num.intValue(), abstractC3390, obj);
                        return;
                    } catch (Exception e) {
                        abstractC1569.f6320.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC3390 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                AbstractC1569 abstractC15692 = this.f6309;
                HashMap map2 = abstractC15692.f6314;
                String str2 = this.f6306;
                Integer num2 = (Integer) map2.get(str2);
                AbstractC3390 abstractC33902 = this.f6307;
                if (num2 != null) {
                    abstractC15692.f6320.add(str2);
                    try {
                        abstractC15692.mo5159(num2.intValue(), abstractC33902, obj);
                        return;
                    } catch (Exception e2) {
                        abstractC15692.f6320.remove(str2);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC33902 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
