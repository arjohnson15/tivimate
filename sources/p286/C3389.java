package p286;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.ﹳﹳ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p013.AbstractC1035;
import p013.AbstractC1036;
import p013.AbstractC1039;
import p013.C1034;
import p071.C1568;
import p071.C1571;
import p288.C3395;
import ˏᵢ.ᵢٴ;

/* renamed from: ٴˎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3389 extends AbstractC3390 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f13230;

    public /* synthetic */ C3389(int i) {
        this.f13230 = i;
    }

    @Override // p286.AbstractC3390
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ᵢٴ mo8248(Context context, Object obj) {
        switch (this.f13230) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new ᵢٴ(7, C1034.f4436);
                }
                for (String str : strArr) {
                    if (ﹳﹳ.ˏᵢ(context, str) != 0) {
                        return null;
                    }
                }
                int iM3985 = AbstractC1035.m3985(strArr.length);
                if (iM3985 < 16) {
                    iM3985 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM3985);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new ᵢٴ(7, linkedHashMap);
            case 1:
                if (ﹳﹳ.ˏᵢ(context, (String) obj) == 0) {
                    return new ᵢٴ(7, Boolean.TRUE);
                }
                return null;
            default:
                return super.mo8248(context, obj);
        }
    }

    @Override // p286.AbstractC3390
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object mo8249(Intent intent, int i) {
        switch (this.f13230) {
            case 0:
                C1034 c1034 = C1034.f4436;
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListM4001 = AbstractC1036.m4001(stringArrayExtra);
                        Iterator it = arrayListM4001.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1039.m4012(arrayListM4001, 10), AbstractC1039.m4012(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C3395(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (intArrayExtra2[i3] == 0) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return new C1571(intent, i);
    }

    @Override // p286.AbstractC3390
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Intent mo8250(Object obj) {
        Bundle bundleExtra;
        switch (this.f13230) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
            case 2:
                return (Intent) obj;
            case 3:
                return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (C1568) obj);
            default:
                C1568 c1568 = (C1568) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c1568.f6310;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c1568 = new C1568(c1568.f6313, null, c1568.f6311, c1568.f6312);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c1568);
                if (Log.isLoggable("FragmentManager", 2)) {
                    String str = "CreateIntent created the following intent: " + intent;
                }
                return intent;
        }
    }
}
