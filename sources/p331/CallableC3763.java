package p331;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p065.C1529;
import p145.AbstractC2234;
import p457.C5358;
import p457.C5363;
import ﾞﹶ.ᵢʿ;

/* renamed from: ᴵﹳ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC3763 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C1529 f14534;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C3772 f14535;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f14536;

    public /* synthetic */ CallableC3763(C3772 c3772, C1529 c1529, int i) {
        this.f14536 = i;
        this.f14535 = c3772;
        this.f14534 = c1529;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean boolValueOf;
        switch (this.f14536) {
            case 0:
                C3772 c3772 = this.f14535;
                WorkDatabase_Impl workDatabase_Impl = c3772.f14601;
                workDatabase_Impl.m5048();
                try {
                    Cursor cursorM6225 = AbstractC2234.m6225(workDatabase_Impl, this.f14534);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorM6225.moveToNext()) {
                            String string = cursorM6225.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorM6225.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorM6225.moveToPosition(-1);
                        c3772.m8820(map);
                        c3772.m8830(map2);
                        ArrayList arrayList = new ArrayList(cursorM6225.getCount());
                        while (cursorM6225.moveToNext()) {
                            String string3 = cursorM6225.getString(0);
                            int i = ᵢʿ.ᵎˏ(cursorM6225.getInt(1));
                            C5363 c5363M12156 = C5363.m12156(cursorM6225.getBlob(2));
                            int i2 = cursorM6225.getInt(3);
                            int i3 = cursorM6225.getInt(4);
                            arrayList.add(new C3765(string3, i, c5363M12156, cursorM6225.getLong(14), cursorM6225.getLong(15), cursorM6225.getLong(16), new C5358(ᵢʿ.ˆʿ(cursorM6225.getBlob(6)), ᵢʿ.ᵎـ(cursorM6225.getInt(5)), cursorM6225.getInt(7) != 0, cursorM6225.getInt(8) != 0, cursorM6225.getInt(9) != 0, cursorM6225.getInt(10) != 0, cursorM6225.getLong(11), cursorM6225.getLong(12), ᵢʿ.ʽᐧ(cursorM6225.getBlob(13))), i2, ᵢʿ.ˑי(cursorM6225.getInt(17)), cursorM6225.getLong(18), cursorM6225.getLong(19), cursorM6225.getInt(20), i3, cursorM6225.getLong(21), cursorM6225.getInt(22), (ArrayList) map.get(cursorM6225.getString(0)), (ArrayList) map2.get(cursorM6225.getString(0))));
                        }
                        workDatabase_Impl.m5055();
                        cursorM6225.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorM6225.close();
                        throw th;
                    }
                } finally {
                    workDatabase_Impl.m5046();
                }
            default:
                Cursor cursorM5052 = this.f14535.f14601.m5052(this.f14534, null);
                try {
                    if (cursorM5052.moveToFirst()) {
                        boolValueOf = Boolean.valueOf(cursorM5052.getInt(0) != 0);
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    cursorM5052.close();
                    return boolValueOf;
                } finally {
                    cursorM5052.close();
                }
        }
    }

    public final void finalize() {
        switch (this.f14536) {
            case 0:
                this.f14534.m5111();
                break;
            default:
                this.f14534.m5111();
                break;
        }
    }
}
