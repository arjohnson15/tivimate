package p065;

import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p034.InterfaceC1224;
import p080.AbstractC1702;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p331.C3759;
import p338.InterfaceC3856;
import p396.C4554;
import p415.C4742;
import ٴᐧ.ᐧⁱ;
import ᵢ.ʿʼ;

/* renamed from: ʾᵔ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1500 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f6093;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f6094;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public Object f6095;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f6096;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f6097;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f6098;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Object f6099;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f6100;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object f6101;

    public C1500(AbstractC1484 abstractC1484, HashMap map, HashMap map2, String... strArr) {
        this.f6097 = abstractC1484;
        this.f6093 = strArr;
        C1512 c1512 = new C1512(abstractC1484, map, map2, strArr);
        this.f6096 = c1512;
        this.f6100 = new C1501(this, 2);
        this.f6094 = new C1501(this, 1);
        this.f6098 = new C3759(abstractC1484);
        this.f6101 = new Object();
        c1512.f6155 = new C1501(this, 0);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m5062(JSONObject jSONObject, String str) {
        StringBuilder sbM5407 = AbstractC1702.m5407(str);
        sbM5407.append(jSONObject.toString());
        sbM5407.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4742 m5063(int i) {
        C4742 c4742 = null;
        try {
            if (!AbstractC1702.m5410(2, i)) {
                JSONObject jSONObject = ((ʿʼ) this.f6094).ᴵʿ();
                if (jSONObject != null) {
                    C4742 c4742M10427 = ((C4554) this.f6096).m10427(jSONObject);
                    m5062(jSONObject, "Loaded cached settings: ");
                    ((ᐧⁱ) this.f6100).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (AbstractC1702.m5410(3, i) || c4742M10427.f18191 >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            }
                            c4742 = c4742M10427;
                        } catch (Exception e) {
                            c4742 = c4742M10427;
                            return c4742;
                        }
                    } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
            }
        } catch (Exception e2) {
        }
        return c4742;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m5064() {
        C1530 c1530 = (C1530) this.f6099;
        if (c1530 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C1526 c1526 = new C1526(c1530.f6221, c1530.f6219, this);
        if (c1526.f6200.compareAndSet(true, false)) {
            c1526.f6203.bindService(c1530.f6220, c1526.f6201, 1);
            C1497 c1497 = c1526.f6202;
            if (!(c1497 instanceof C1497)) {
                throw new IllegalStateException("isRemote was false of observer argument");
            }
            ((C1512) this.f6096).m5089(c1497);
        }
        this.f6095 = c1526;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C4742 m5065() {
        return (C4742) ((AtomicReference) this.f6095).get();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C1505 m5066(String[] strArr, InterfaceC3856 interfaceC3856) {
        ((C1512) this.f6096).m5087(strArr);
        C3759 c3759 = (C3759) this.f6098;
        return new C1505((AbstractC1484) c3759.f14522, c3759, false, null, interfaceC3856, strArr);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object m5067(AbstractC2567 abstractC2567) {
        AbstractC1484 abstractC1484 = (AbstractC1484) this.f6097;
        boolean zM5051 = abstractC1484.m5051();
        C3397 c3397 = C3397.f13249;
        if (zM5051) {
            C1514 c1514 = abstractC1484.f6049;
            if (c1514 == null) {
                c1514 = null;
            }
            InterfaceC1224 interfaceC1224 = (InterfaceC1224) c1514.f6166;
            if (!(interfaceC1224 != null ? interfaceC1224.isOpen() : false)) {
                return c3397;
            }
        }
        Object objM5091 = ((C1512) this.f6096).m5091(abstractC2567);
        return objM5091 == EnumC2332.f9250 ? objM5091 : c3397;
    }
}
