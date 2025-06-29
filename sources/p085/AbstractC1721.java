package p085;

import android.database.Cursor;
import android.os.Build;
import android.support.v4.media.session.AbstractC0002;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import p013.AbstractC1041;
import p065.AbstractC1502;
import p065.C1529;
import p331.C3759;
import p331.C3761;
import p331.C3768;
import p331.C3770;
import p334.C3789;
import p457.C5391;
import ᴵﹳ.ﹶˆ;
import ﹶⁱ.ـﹶ;

/* renamed from: ʿᐧ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1721 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f6701 = C5391.m12164("DiagnosticsWrkr");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String m5452(C3761 c3761, C3759 c3759, ﹶˆ r19, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t " + (Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id") + "\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3768 c3768 = (C3768) it.next();
            C3770 c3770 = r19.ﹳˎ(ـﹶ.ˋˊ(c3768));
            Integer numValueOf = c3770 != null ? Integer.valueOf(c3770.f14589) : null;
            c3761.getClass();
            TreeMap treeMap = C1529.f6210;
            C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = c3768.f14575;
            c1529M5069.mo4420(1, str2);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c3761.f14527;
            workDatabase_Impl.m5041();
            Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
            try {
                ArrayList arrayList2 = new ArrayList(cursorM5052.getCount());
                while (cursorM5052.moveToNext()) {
                    arrayList2.add(cursorM5052.getString(0));
                }
                cursorM5052.close();
                c1529M5069.m5111();
                String strM4033 = AbstractC1041.m4033(arrayList2, ",", null, null, null, 62);
                String strM40332 = AbstractC1041.m4033(c3759.m8756(str2), ",", null, null, null, 62);
                StringBuilder sbM50 = AbstractC0002.m50("\n", str2, "\t ");
                sbM50.append(c3768.f14573);
                sbM50.append("\t ");
                sbM50.append(numValueOf);
                sbM50.append("\t ");
                switch (c3768.f14562) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbM50.append(str);
                sbM50.append("\t ");
                sbM50.append(strM4033);
                sbM50.append("\t ");
                sbM50.append(strM40332);
                sbM50.append('\t');
                sb.append(sbM50.toString());
            } catch (Throwable th) {
                cursorM5052.close();
                c1529M5069.m5111();
                throw th;
            }
        }
        return sb.toString();
    }
}
