package p438;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p166.AbstractC2394;
import p166.C2412;
import p166.C2434;
import p374.C4245;
import p383.AbstractC4470;

/* renamed from: ﹶﾞ.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5120 extends AbstractC2394 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final /* synthetic */ int f19583 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f19584;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f19585;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final HashMap f19586;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AbstractC2394[] f19587;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4245 f19588;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int[] f19589;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int[] f19590;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f19591;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Object[] f19592;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5120(List list, C4245 c4245) {
        AbstractC2394[] abstractC2394Arr = new AbstractC2394[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC2394Arr[i2] = ((InterfaceC5103) it.next()).mo11290();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC5103) it2.next()).mo11291();
            i++;
        }
        this(abstractC2394Arr, objArr, c4245);
    }

    public C5120(AbstractC2394[] abstractC2394Arr, Object[] objArr, C4245 c4245) {
        this.f19588 = c4245;
        this.f19584 = c4245.f16492.length;
        int length = abstractC2394Arr.length;
        this.f19587 = abstractC2394Arr;
        this.f19589 = new int[length];
        this.f19590 = new int[length];
        this.f19592 = objArr;
        this.f19586 = new HashMap();
        int length2 = abstractC2394Arr.length;
        int i = 0;
        int iMo6474 = 0;
        int iMo6475 = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC2394 abstractC2394 = abstractC2394Arr[i];
            this.f19587[i2] = abstractC2394;
            this.f19590[i2] = iMo6474;
            this.f19589[i2] = iMo6475;
            iMo6474 += abstractC2394.mo6474();
            iMo6475 += this.f19587[i2].mo6475();
            this.f19586.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f19591 = iMo6474;
        this.f19585 = iMo6475;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ʽᐧ */
    public final int mo6469(Object obj) {
        int iMo6469;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f19586.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iMo6469 = this.f19587[iIntValue].mo6469(obj3)) == -1) {
            return -1;
        }
        return this.f19589[iIntValue] + iMo6469;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ʿʼ */
    public final int mo6470(int i, boolean z, int i2) {
        int[] iArr = this.f19590;
        int iM10165 = AbstractC4470.m10165(iArr, i + 1, false, false);
        int i3 = iArr[iM10165];
        AbstractC2394[] abstractC2394Arr = this.f19587;
        int iMo6470 = abstractC2394Arr[iM10165].mo6470(i - i3, z, i2 != 2 ? i2 : 0);
        if (iMo6470 != -1) {
            return i3 + iMo6470;
        }
        int iM11397 = m11397(iM10165, z);
        while (iM11397 != -1 && abstractC2394Arr[iM11397].m6477()) {
            iM11397 = m11397(iM11397, z);
        }
        if (iM11397 != -1) {
            return abstractC2394Arr[iM11397].mo6478(z) + iArr[iM11397];
        }
        if (i2 == 2) {
            return mo6478(z);
        }
        return -1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˉⁱ */
    public final Object mo6472(int i) {
        int[] iArr = this.f19589;
        int iM10165 = AbstractC4470.m10165(iArr, i + 1, false, false);
        return Pair.create(this.f19592[iM10165], this.f19587[iM10165].mo6472(i - iArr[iM10165]));
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˋⁱ */
    public final C2434 mo6179(int i, C2434 c2434, long j) {
        int[] iArr = this.f19590;
        int iM10165 = AbstractC4470.m10165(iArr, i + 1, false, false);
        int i2 = iArr[iM10165];
        int i3 = this.f19589[iM10165];
        this.f19587[iM10165].mo6179(i - i2, c2434, j);
        Object objCreate = this.f19592[iM10165];
        if (!C2434.f9702.equals(c2434.f9713)) {
            objCreate = Pair.create(objCreate, c2434.f9713);
        }
        c2434.f9713 = objCreate;
        c2434.f9716 += i3;
        c2434.f9709 += i3;
        return c2434;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m11396(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        C4245 c4245 = this.f19588;
        int i2 = c4245.f16493[i] - 1;
        if (i2 >= 0) {
            return c4245.f16492[i2];
        }
        return -1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˏʾ */
    public final int mo6473(int i, boolean z, int i2) {
        int[] iArr = this.f19590;
        int iM10165 = AbstractC4470.m10165(iArr, i + 1, false, false);
        int i3 = iArr[iM10165];
        AbstractC2394[] abstractC2394Arr = this.f19587;
        int iMo6473 = abstractC2394Arr[iM10165].mo6473(i - i3, z, i2 != 2 ? i2 : 0);
        if (iMo6473 != -1) {
            return i3 + iMo6473;
        }
        int iM11396 = m11396(iM10165, z);
        while (iM11396 != -1 && abstractC2394Arr[iM11396].m6477()) {
            iM11396 = m11396(iM11396, z);
        }
        if (iM11396 != -1) {
            return abstractC2394Arr[iM11396].mo6476(z) + iArr[iM11396];
        }
        if (i2 == 2) {
            return mo6476(z);
        }
        return -1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˏᴵ */
    public final int mo6474() {
        return this.f19591;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˏᵢ */
    public final int mo6475() {
        return this.f19585;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˑʽ */
    public final int mo6476(boolean z) {
        int iM11396;
        int i = this.f19584;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f19588.f16492;
            iM11396 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iM11396 = i - 1;
        }
        do {
            AbstractC2394[] abstractC2394Arr = this.f19587;
            if (!abstractC2394Arr[iM11396].m6477()) {
                return abstractC2394Arr[iM11396].mo6476(z) + this.f19590[iM11396];
            }
            iM11396 = m11396(iM11396, z);
        } while (iM11396 != -1);
        return -1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ـﹶ */
    public final int mo6478(boolean z) {
        if (this.f19584 == 0) {
            return -1;
        }
        int iM11397 = 0;
        if (z) {
            int[] iArr = this.f19588.f16492;
            iM11397 = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            AbstractC2394[] abstractC2394Arr = this.f19587;
            if (!abstractC2394Arr[iM11397].m6477()) {
                return abstractC2394Arr[iM11397].mo6478(z) + this.f19590[iM11397];
            }
            iM11397 = m11397(iM11397, z);
        } while (iM11397 != -1);
        return -1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ٴˎ */
    public final C2412 mo6180(int i, C2412 c2412, boolean z) {
        int[] iArr = this.f19589;
        int iM10165 = AbstractC4470.m10165(iArr, i + 1, false, false);
        int i2 = this.f19590[iM10165];
        this.f19587[iM10165].mo6180(i - iArr[iM10165], c2412, z);
        c2412.f9576 += i2;
        if (z) {
            Object obj = this.f19592[iM10165];
            Object obj2 = c2412.f9574;
            obj2.getClass();
            c2412.f9574 = Pair.create(obj, obj2);
        }
        return c2412;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ᐧʻ */
    public final C2412 mo6479(Object obj, C2412 c2412) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f19586.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f19590[iIntValue];
        this.f19587[iIntValue].mo6479(obj3, c2412);
        c2412.f9576 += i;
        c2412.f9574 = obj;
        return c2412;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m11397(int i, boolean z) {
        if (!z) {
            if (i < this.f19584 - 1) {
                return i + 1;
            }
            return -1;
        }
        C4245 c4245 = this.f19588;
        int i2 = c4245.f16493[i] + 1;
        int[] iArr = c4245.f16492;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }
}
