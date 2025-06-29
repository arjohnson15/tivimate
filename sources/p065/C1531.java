package p065;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p013.C1038;
import p057.C1342;
import p317.AbstractC3629;
import p395.AbstractC4535;

/* renamed from: ʾᵔ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1531 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f6222;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String[] f6223;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC1487 f6224;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Set f6225;

    public C1531(AbstractC1487 abstractC1487, int[] iArr, String[] strArr) {
        this.f6224 = abstractC1487;
        this.f6222 = iArr;
        this.f6223 = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f6225 = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : C1038.f4437;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5112(Set set) {
        String[] strArr = this.f6223;
        int length = strArr.length;
        Set setM10326 = C1038.f4437;
        if (length != 0) {
            if (length != 1) {
                C1342 c1342 = new C1342();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length2) {
                            String str2 = strArr[i];
                            if (AbstractC3629.m8562(str2, str)) {
                                c1342.add(str2);
                                break;
                            }
                            i++;
                        }
                    }
                }
                setM10326 = AbstractC4535.m10326(c1342);
            } else if (!set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (AbstractC3629.m8562((String) it2.next(), strArr[0])) {
                        setM10326 = this.f6225;
                        break;
                    }
                }
            }
        }
        if (setM10326.isEmpty()) {
            return;
        }
        this.f6224.mo5057(setM10326);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5113(Set set) {
        int[] iArr = this.f6222;
        int length = iArr.length;
        Set setM10326 = C1038.f4437;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                C1342 c1342 = new C1342();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        c1342.add(this.f6223[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                setM10326 = AbstractC4535.m10326(c1342);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setM10326 = this.f6225;
            }
        }
        if (setM10326.isEmpty()) {
            return;
        }
        this.f6224.mo5057(setM10326);
    }
}
