package p291;

import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0090;
import java.util.ArrayList;
import java.util.Map;
import p071.C1571;
import p071.InterfaceC1566;

/* renamed from: ٴᐧ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3437 implements InterfaceC1566 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0104 f13332;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13333;

    public /* synthetic */ C3437(AbstractC0104 abstractC0104, int i) {
        this.f13333 = i;
        this.f13332 = abstractC0104;
    }

    @Override // p071.InterfaceC1566
    /* renamed from: ˉי */
    public final void mo4094(Object obj) {
        switch (this.f13333) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                AbstractC0104 abstractC0104 = this.f13332;
                C3427 c3427 = (C3427) abstractC0104.f600.pollFirst();
                if (c3427 == null) {
                    String str = "No permissions were requested for " + this;
                    break;
                } else {
                    C0090 c0090 = abstractC0104.f612;
                    String str2 = c3427.f13306;
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M595 = c0090.m595(str2);
                    if (abstractComponentCallbacksC0100M595 == null) {
                        String str3 = "Permission request result delivered for unknown Fragment " + str2;
                        break;
                    } else {
                        abstractComponentCallbacksC0100M595.onRequestPermissionsResult(c3427.f13305, strArr, iArr);
                        break;
                    }
                }
            default:
                C1571 c1571 = (C1571) obj;
                AbstractC0104 abstractC01042 = this.f13332;
                C3427 c34272 = (C3427) abstractC01042.f600.pollFirst();
                if (c34272 == null) {
                    String str4 = "No IntentSenders were started for " + this;
                    break;
                } else {
                    C0090 c00902 = abstractC01042.f612;
                    String str5 = c34272.f13306;
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M5952 = c00902.m595(str5);
                    if (abstractComponentCallbacksC0100M5952 == null) {
                        String str6 = "Intent Sender result delivered for unknown Fragment " + str5;
                        break;
                    } else {
                        abstractComponentCallbacksC0100M5952.onActivityResult(c34272.f13305, c1571.f6322, c1571.f6321);
                        break;
                    }
                }
        }
    }
}
