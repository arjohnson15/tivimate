package p031;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.view.MenuItem;
import androidx.fragment.app.AbstractActivityC0113;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.leanback.widget.ʿˏ;
import androidx.lifecycle.AbstractC0224;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.lsposed.hiddenapibypass.library.R;
import p033.C1213;
import p033.C1218;
import p033.C1219;
import p036.InterfaceC1249;
import p060.C1354;
import p065.ExecutorC1522;
import p070.AbstractC1547;
import p072.AbstractC1642;
import p072.C1587;
import p123.C1995;
import p123.C2001;
import p141.RunnableC2187;
import p164.C2365;
import p166.C2431;
import p175.C2484;
import p176.InterfaceC2490;
import p181.C2510;
import p181.InterfaceC2504;
import p183.EnumC2533;
import p186.C2577;
import p186.C2582;
import p191.EnumC2648;
import p222.InterfaceC2887;
import p252.AbstractC3139;
import p288.C3397;
import p306.C3544;
import p306.C3548;
import p306.C3550;
import p306.C3554;
import p306.InterfaceC3552;
import p330.InterfaceC3746;
import p334.C3789;
import p338.InterfaceC3865;
import p374.C4290;
import p383.InterfaceC4461;
import p383.InterfaceC4472;
import p395.AbstractC4535;
import p406.C4665;
import p410.C4680;
import p410.C4682;
import p410.InterfaceC4689;
import p439.InterfaceC5123;
import p444.C5152;
import p450.InterfaceC5190;
import p450.InterfaceC5191;
import p457.EnumC5364;
import ʽᵔ.ʻ;
import ʽᵔ.ᵎˆ;
import ʽᵔ.ᵢﹶ;
import ʽᵔ.ﾞﾞ;
import ʿᴵ.ʾʼ;
import ʿᴵ.ˎٴ;
import ˈʼ.ﹳﹳ;
import ˉﾞ.ᐧʻ;
import ˉﾞ.ᵢᵢ;
import יˏ.ʾˈ;
import יⁱ.ˎˉ;
import יⁱ.ᵎʾ;
import ᴵˎ.ᵔᵢ;
import ᵎﹳ.ʽᐧ;

/* renamed from: ʼـ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1195 implements InterfaceC5191, InterfaceC4472, InterfaceC4461, InterfaceC1249, InterfaceC2887, InterfaceC1197, InterfaceC2504, InterfaceC3552, InterfaceC4689, InterfaceC5123 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f4933;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4934;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4935;

    public /* synthetic */ C1195(Object obj, int i, Object obj2) {
        this.f4935 = i;
        this.f4933 = obj;
        this.f4934 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1195(ExecutorService executorService, InterfaceC3865 interfaceC3865) {
        this.f4935 = 18;
        this.f4933 = executorService;
        this.f4934 = (AbstractC1547) interfaceC3865;
    }

    @Override // p306.InterfaceC3552, p353.InterfaceC4019
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C3554 c3554 = (C3554) this.f4933;
        C3550 c3550 = c3554.f13722;
        int i = c3550.f13712;
        C1995 c1995 = (C1995) this.f4934;
        ArrayList arrayListM8439 = c3554.m8439(sQLiteDatabase, c1995, i);
        for (EnumC2533 enumC2533 : EnumC2533.values()) {
            if (enumC2533 != c1995.f7593) {
                int size = c3550.f13712 - arrayListM8439.size();
                if (size <= 0) {
                    break;
                }
                arrayListM8439.addAll(c3554.m8439(sQLiteDatabase, c1995.m5646(enumC2533), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayListM8439.size(); i2++) {
            sb.append(((C3544) arrayListM8439.get(i2)).f13700);
            if (i2 < arrayListM8439.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new C3548(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM8439.listIterator();
        while (listIterator.hasNext()) {
            C3544 c3544 = (C3544) listIterator.next();
            if (map.containsKey(Long.valueOf(c3544.f13700))) {
                C2001 c2001M5654 = c3544.f13699.m5654();
                long j2 = c3544.f13700;
                for (C3548 c3548 : (Set) map.get(Long.valueOf(j2))) {
                    c2001M5654.m5651(c3548.f13710, c3548.f13709);
                }
                listIterator.set(new C3544(j2, c3544.f13698, c2001M5654.m5650()));
            }
        }
        return arrayListM8439;
    }

    @Override // p222.InterfaceC2887
    public boolean onMenuItemClick(MenuItem menuItem) {
        boolean z = true;
        switch (this.f4935) {
            case 5:
                ﾞﾞ r4 = (ﾞﾞ) this.f4933;
                ᵢᵢ r5 = (ᵢᵢ) this.f4934;
                InterfaceC2490[] interfaceC2490Arr = ﾞﾞ.ˑʾ;
                if (!AbstractC3139.f12115) {
                    AbstractC4535.m10353(r4);
                    break;
                } else {
                    if (menuItem.getItemId() == 1) {
                        ᵢﹶ r11 = r4.ᵔᵢ();
                        long j = r5.ـﹶ;
                        r11.getClass();
                        AbstractC1642.m5294(AbstractC0224.m1023(r11), null, 0, new ʻ(j, (InterfaceC3746) null), 3);
                        r4.ˉᵎ = "";
                        r4.ٴᐧ = true;
                    } else {
                        z = false;
                    }
                    break;
                }
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                ﾞﾞ r42 = (ﾞﾞ) this.f4933;
                ᐧʻ r52 = (ᐧʻ) this.f4934;
                if (r42.getContext() != null) {
                    if (!AbstractC3139.f12115) {
                        AbstractC4535.m10353(r42);
                        break;
                    } else {
                        int itemId = menuItem.getItemId();
                        if (itemId == 1) {
                            InterfaceC2490[] interfaceC2490Arr2 = ﾞﾞ.ˑʾ;
                            ᵢﹶ r112 = r42.ᵔᵢ();
                            long j2 = r52.ـﹶ;
                            boolean z2 = !r52.יʻ;
                            r112.getClass();
                            AbstractC1642.m5294(AbstractC0224.m1023(r112), null, 0, new ᵎˆ(j2, z2, (InterfaceC3746) null), 3);
                            if (r52.יʻ) {
                                ʾˈ.ʽˆ(r42.getContext(), r42.getString(R.string._2_res_0x7f130422));
                            } else {
                                ʾˈ.ʽˆ(r42.getContext(), r42.getString(R.string._2_res_0x7f1303ef));
                            }
                        } else if (itemId == 2) {
                            ﾞﾞ.ˑˈ(r42, r52, (ʽᐧ) null, true, 2);
                        } else {
                            z = false;
                        }
                        break;
                    }
                }
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                ᵎʾ r43 = (ᵎʾ) this.f4933;
                ˉﾞ.ᵎʾ r53 = (ˉﾞ.ᵎʾ) this.f4934;
                InterfaceC2490[] interfaceC2490Arr3 = ᵎʾ.ʻﹳ;
                if (!AbstractC3139.f12115) {
                    AbstractC4535.m10353(r43);
                    break;
                } else {
                    if (menuItem.getItemId() == 1) {
                        AbstractC1642.m5294(AbstractC3139.m7770(r43), null, 0, new ˎˉ(r53, r43, (InterfaceC3746) null), 3);
                    } else {
                        z = false;
                    }
                    break;
                }
            case 8:
                ˎٴ r0 = (ˎٴ) this.f4933;
                ʿᴵ.ᐧʻ r44 = (ʿᴵ.ᐧʻ) this.f4934;
                if (!AbstractC3139.f12115) {
                    AbstractC4535.m10353(r0);
                    break;
                } else {
                    if (menuItem.getItemId() == 1) {
                        ᵔᵢ r113 = r44.ˊᵔ;
                        if (r113 != null) {
                            AbstractComponentCallbacksC0100 parentFragment = r0.getParentFragment();
                            ʾʼ r1 = parentFragment instanceof ʾʼ ? (ʾʼ) parentFragment : null;
                            if (r1 != null) {
                                r1.יˊ(r113, true);
                            }
                        }
                    } else {
                        z = false;
                    }
                    break;
                }
        }
        return z;
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public void mo4092(Object obj) {
        C1213 c1213 = (C1213) obj;
        c1213.getClass();
        C1218 c1218 = (C1218) this.f4933;
        C4290 c4290 = c1218.f5008;
        if (c4290 == null) {
            return;
        }
        C2484 c2484 = (C2484) this.f4934;
        C2431 c2431 = (C2431) c2484.f9900;
        c2431.getClass();
        c4290.getClass();
        com.google.android.gms.internal.play_billing.ᐧʻ r2 = new com.google.android.gms.internal.play_billing.ᐧʻ(c2431, c2484.f9898, c1213.f4961.m4379(c1218.f5000, c4290), 2);
        int i = c2484.f9896;
        if (i != 0) {
            if (i == 1) {
                c1213.f4974 = r2;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                c1213.f4981 = r2;
                return;
            }
        }
        c1213.f4971 = r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    @Override // p036.InterfaceC1249
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p345.C3932 mo4093(int r17, p166.C2433 r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031.C1195.mo4093(int, ˊﹶ.ᵔٴ, int[]):ᵎᴵ.ˉᵎ");
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04a6  */
    @Override // p383.InterfaceC4472
    /* renamed from: ˏᵢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4103(java.lang.Object r29, p166.C2414 r30) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031.C1195.mo4103(java.lang.Object, ˊﹶ.ˏᴵ):void");
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [ʿ.ˉי, ᵎˈ.ـﹶ] */
    @Override // p410.InterfaceC4689
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object mo4248(C4682 c4682) {
        switch (this.f4935) {
            case 14:
                C1587 c1587 = (C1587) this.f4933;
                c1587.mo5170(new C2365(c4682, 2, c1587));
                return this.f4934;
            case 15:
            case 16:
            default:
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final int i = 1;
                Runnable runnable = new Runnable() { // from class: ﾞﹶ.ˑי
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                atomicBoolean.set(true);
                                break;
                            default:
                                atomicBoolean.set(true);
                                break;
                        }
                    }
                };
                EnumC5364 enumC5364 = EnumC5364.f20823;
                C4680 c4680 = c4682.f17818;
                if (c4680 != null) {
                    c4680.mo10415(runnable, enumC5364);
                }
                ((ExecutorService) this.f4933).execute(new RunnableC2187(atomicBoolean, c4682, (AbstractC1547) this.f4934));
                return C3397.f13249;
            case 17:
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final int i2 = 0;
                Runnable runnable2 = new Runnable() { // from class: ﾞﹶ.ˑי
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                atomicBoolean2.set(true);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                break;
                        }
                    }
                };
                EnumC5364 enumC53642 = EnumC5364.f20823;
                C4680 c46802 = c4682.f17818;
                if (c46802 != null) {
                    c46802.mo10415(runnable2, enumC53642);
                }
                ((ExecutorC1522) this.f4933).execute(new RunnableC2187(atomicBoolean2, c4682, (C4665) this.f4934, 15));
                return "setForegroundAsync";
        }
    }

    @Override // p439.InterfaceC5123
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object mo4249() {
        switch (this.f4935) {
            case 15:
                C3554 c3554 = (C3554) ((C5152) this.f4933).f19692;
                c3554.getClass();
                Iterable iterable = (Iterable) this.f4934;
                if (iterable.iterator().hasNext()) {
                    c3554.m8438().compileStatement("DELETE FROM events WHERE _id in " + C3554.m8434(iterable)).execute();
                    break;
                }
                break;
            default:
                C5152 c5152 = (C5152) this.f4933;
                c5152.getClass();
                Iterator it = ((HashMap) this.f4934).entrySet().iterator();
                while (it.hasNext()) {
                    ((C3554) c5152.f19697).m8435(((Integer) r2.getValue()).intValue(), EnumC2648.f10516, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // p181.InterfaceC2504
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void mo4250(C2510 c2510, ArrayList arrayList) {
        AbstractC1642.m5294(ﹳﹳ.ʽᐧ(), null, 0, new C2582(c2510, arrayList, (String) this.f4933, (AbstractActivityC0113) this.f4934, null), 3);
    }

    @Override // p450.InterfaceC5191
    /* renamed from: ᐧʻ */
    public void mo4097(InterfaceC5190 interfaceC5190) {
        ((InterfaceC5191) this.f4933).mo4097(interfaceC5190);
        ((InterfaceC5191) this.f4934).mo4097(interfaceC5190);
    }

    @Override // p031.InterfaceC1197
    /* renamed from: ﹳﹳ */
    public Object mo4098(ʿˏ r4) {
        String strValueOf;
        switch (this.f4935) {
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context = (Context) r4.ـﹶ(Context.class);
                switch (((C1219) this.f4934).f5010) {
                    case 17:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 18:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        } else {
                            strValueOf = "";
                            break;
                        }
                        break;
                    case 19:
                        int i = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    strValueOf = "auto";
                                    break;
                                } else if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                    strValueOf = "embedded";
                                    break;
                                } else {
                                    strValueOf = "";
                                    break;
                                }
                            } else {
                                strValueOf = "watch";
                                break;
                            }
                        } else {
                            strValueOf = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = FirebaseCommonRegistrar.m3256(installerPackageName);
                            break;
                        }
                }
                return new C1354((String) this.f4933, strValueOf);
            default:
                String str = (String) this.f4933;
                C1194 c1194 = (C1194) this.f4934;
                try {
                    Trace.beginSection(str);
                    return c1194.f4930.mo4098(r4);
                } finally {
                    Trace.endSection();
                }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m4251() {
        AbstractC1642.m5294(ﹳﹳ.ʽᐧ(), null, 0, new C2577((String) this.f4933, (C2510) this.f4934, null), 3);
    }
}
