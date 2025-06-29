package p414;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p331.C3768;
import p331.C3772;
import p457.C5357;
import p457.C5368;
import p457.C5391;

/* renamed from: ﹳـ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4723 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f18132 = C5391.m12164("Schedulers");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m10640(C5357 c5357, WorkDatabase workDatabase, List list) {
        ArrayList arrayListM8831;
        if (list == null || list.size() == 0) {
            return;
        }
        C3772 c3772Mo1374 = workDatabase.mo1374();
        workDatabase.m5048();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                arrayListM8831 = c3772Mo1374.m8831();
                m10641(c3772Mo1374, c5357.f20795, arrayListM8831);
            } else {
                arrayListM8831 = null;
            }
            ArrayList arrayListM8821 = c3772Mo1374.m8821(c5357.f20789);
            m10641(c3772Mo1374, c5357.f20795, arrayListM8821);
            if (arrayListM8831 != null) {
                arrayListM8821.addAll(arrayListM8831);
            }
            ArrayList arrayListM8835 = c3772Mo1374.m8835();
            workDatabase.m5055();
            workDatabase.m5046();
            if (arrayListM8821.size() > 0) {
                C3768[] c3768Arr = (C3768[]) arrayListM8821.toArray(new C3768[arrayListM8821.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC4728 interfaceC4728 = (InterfaceC4728) it.next();
                    if (interfaceC4728.mo7036()) {
                        interfaceC4728.mo7032(c3768Arr);
                    }
                }
            }
            if (arrayListM8835.size() > 0) {
                C3768[] c3768Arr2 = (C3768[]) arrayListM8835.toArray(new C3768[arrayListM8835.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC4728 interfaceC47282 = (InterfaceC4728) it2.next();
                    if (!interfaceC47282.mo7036()) {
                        interfaceC47282.mo7032(c3768Arr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.m5046();
            throw th;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10641(C3772 c3772, C5368 c5368, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            c5368.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c3772.m8823(((C3768) it.next()).f14575, jCurrentTimeMillis);
            }
        }
    }
}
