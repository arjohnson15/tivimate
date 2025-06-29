package p379;

import java.io.IOException;
import p070.C1561;
import p127.C2034;
import p363.AbstractC4133;

/* renamed from: ᵢᐧ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4406 extends AbstractC4133 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f16977;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ Object f16978;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ Object f16979;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4406(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f16977 = i;
        this.f16978 = obj;
        this.f16979 = obj2;
    }

    @Override // p363.AbstractC4133
    /* renamed from: ـﹶ */
    public final long mo4576() {
        long jM10027;
        C4401[] c4401Arr;
        int i = 0;
        switch (this.f16977) {
            case 0:
                ((C4413) this.f16978).f17015.mo4556((C4417) ((C1561) this.f16979).f6302);
                return -1L;
            case 1:
                try {
                    ((C4413) this.f16978).f17015.mo4548((C4401) this.f16979);
                    return -1L;
                } catch (IOException e) {
                    C2034 c2034 = C2034.f7700;
                    C2034 c20342 = C2034.f7700;
                    String str = "Http2Connection.Listener failure for " + ((C4413) this.f16978).f17009;
                    c20342.getClass();
                    C2034.m5684(4, str, e);
                    try {
                        ((C4401) this.f16979).m9997(2, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                C4399 c4399 = (C4399) this.f16978;
                C4417 c4417 = (C4417) this.f16979;
                C1561 c1561 = new C1561();
                C4413 c4413 = c4399.f16939;
                synchronized (c4413.f17008) {
                    synchronized (c4413) {
                        try {
                            C4417 c44172 = c4413.f17020;
                            C4417 c44173 = new C4417();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & c44172.f17043) != 0) {
                                    c44173.m10026(i2, c44172.f17042[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & c4417.f17043) != 0) {
                                    c44173.m10026(i3, c4417.f17042[i3]);
                                }
                            }
                            c1561.f6302 = c44173;
                            jM10027 = c44173.m10027() - c44172.m10027();
                            c4401Arr = (jM10027 == 0 || c4413.f17004.isEmpty()) ? null : (C4401[]) c4413.f17004.values().toArray(new C4401[0]);
                            c4413.f17020 = (C4417) c1561.f6302;
                            c4413.f17016.m9479(new C4406(c4413.f17009 + " onSettings", c4413, c1561, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c4413.f17008.m10035((C4417) c1561.f6302);
                    } catch (IOException e2) {
                        c4413.m10022(2, 2, e2);
                    }
                }
                if (c4401Arr == null) {
                    return -1L;
                }
                int length = c4401Arr.length;
                while (i < length) {
                    C4401 c4401 = c4401Arr[i];
                    synchronized (c4401) {
                        c4401.f16953 += jM10027;
                        if (jM10027 > 0) {
                            c4401.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
