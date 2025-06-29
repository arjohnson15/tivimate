package p052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p353.AbstractC4010;
import p383.C4456;
import p383.C4457;

/* renamed from: ʾʼ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1329 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f5396;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f5397;

    public C1329() {
        this.f5397 = 1;
        this.f5396 = Collections.singletonList(null);
    }

    public C1329(int i, List list) {
        this.f5397 = i;
        this.f5396 = list;
    }

    public C1329(ArrayList arrayList) {
        this.f5397 = 0;
        this.f5396 = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public List m4626(C4456 c4456) {
        String str;
        int i;
        boolean zM4627 = m4627(32);
        List list = this.f5396;
        if (zM4627) {
            return list;
        }
        try {
            C4457 c4457 = new C4457((byte[]) c4456.f17162);
            ?? arrayList = list;
            while (c4457.m10096() > 0) {
                int iM10086 = c4457.m10086();
                int iM100862 = c4457.f17169 + c4457.m10086();
                if (iM10086 == 134) {
                    arrayList = new ArrayList();
                    int iM100863 = c4457.m10086() & 31;
                    for (int i2 = 0; i2 < iM100863; i2++) {
                        String strM10105 = c4457.m10105(3, AbstractC4010.f15450);
                        int iM100864 = c4457.m10086();
                        boolean z = (iM100864 & 128) != 0;
                        if (z) {
                            str = "application/cea-708";
                            i = iM100864 & 63;
                        } else {
                            str = "application/cea-608";
                            i = 1;
                        }
                        byte bM10086 = (byte) c4457.m10086();
                        c4457.m10085(1);
                        List listSingletonList = z ? Collections.singletonList((bM10086 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                        C2417 c2417 = new C2417();
                        c2417.f9602 = AbstractC2435.m6559(str);
                        c2417.f9625 = strM10105;
                        c2417.f9617 = i;
                        c2417.f9609 = listSingletonList;
                        arrayList.add(new C2431(c2417));
                    }
                }
                c4457.m10108(iM100862);
                arrayList = arrayList;
            }
            return arrayList;
        } catch (Exception unused) {
            return list;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean m4627(int i) {
        return (i & this.f5397) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p341.InterfaceC3881 m4628(int r6, p383.C4456 r7) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p052.C1329.m4628(int, ᵢᵢ.ˉⁱ):ᵎˑ.ˆᵔ");
    }
}
