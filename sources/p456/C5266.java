package p456;

import com.google.android.gms.internal.measurement.C0462;
import com.google.android.gms.internal.measurement.C0532;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p134.AbstractC2092;
import p200.C2740;
import p200.C2741;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˊˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5266 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f20391;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final BitSet f20392;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ C5340 f20393;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0462 f20394;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f20395;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2741 f20396;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C2741 f20397;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final BitSet f20398;

    public C5266(C5340 c5340, String str) {
        this.f20393 = c5340;
        this.f20395 = str;
        this.f20391 = true;
        this.f20398 = new BitSet();
        this.f20392 = new BitSet();
        this.f20396 = new C2741(0);
        this.f20397 = new C2741(0);
    }

    public C5266(C5340 c5340, String str, C0462 c0462, BitSet bitSet, BitSet bitSet2, C2741 c2741, C2741 c27412) {
        this.f20393 = c5340;
        this.f20395 = str;
        this.f20398 = bitSet;
        this.f20392 = bitSet2;
        this.f20396 = c2741;
        this.f20397 = new C2741(0);
        Iterator it = ((C2740) c27412.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c27412.get(num));
            this.f20397.put(num, arrayList);
        }
        this.f20391 = false;
        this.f20394 = c0462;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11767(AbstractC2092 abstractC2092) {
        int iMo5936 = abstractC2092.mo5936();
        Boolean bool = (Boolean) abstractC2092.f8268;
        if (bool != null) {
            this.f20392.set(iMo5936, bool.booleanValue());
        }
        Boolean bool2 = (Boolean) abstractC2092.f8266;
        if (bool2 != null) {
            this.f20398.set(iMo5936, bool2.booleanValue());
        }
        if (((Long) abstractC2092.f8267) != null) {
            Integer numValueOf = Integer.valueOf(iMo5936);
            C2741 c2741 = this.f20396;
            Long l = (Long) c2741.get(numValueOf);
            long jLongValue = ((Long) abstractC2092.f8267).longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c2741.put(Integer.valueOf(iMo5936), Long.valueOf(jLongValue));
            }
        }
        if (((Long) abstractC2092.f8269) != null) {
            C2741 c27412 = this.f20397;
            List arrayList = (List) c27412.get(Integer.valueOf(iMo5936));
            if (arrayList == null) {
                arrayList = new ArrayList();
                c27412.put(Integer.valueOf(iMo5936), arrayList);
            }
            if (abstractC2092.mo5939()) {
                arrayList.clear();
            }
            C0532.m2431();
            C5340 c5340 = this.f20393;
            C5245 c5245 = ((C5236) ((ﹳﹳ) c5340).ᐧⁱ).f20123;
            C5250 c5250 = AbstractC5248.f20286;
            String str = this.f20395;
            if (c5245.m11727(str, c5250) && abstractC2092.mo5937()) {
                arrayList.clear();
            }
            C0532.m2431();
            if (!((C5236) ((ﹳﹳ) c5340).ᐧⁱ).f20123.m11727(str, c5250)) {
                arrayList.add(Long.valueOf(((Long) abstractC2092.f8269).longValue() / 1000));
                return;
            }
            long jLongValue2 = ((Long) abstractC2092.f8269).longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }
}
