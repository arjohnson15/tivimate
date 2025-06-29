package p052;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.leanback.widget.ﾞᐧ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p036.C1259;
import p061.C1424;
import p371.AbstractC4205;
import ʾי.ˑʽ;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾʼ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1324 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1424 f5386 = new C1424(2);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1259 f5385 = new C1259(8);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static ProviderInfo m4622(PackageManager packageManager, C1328 c1328, Resources resources) {
        Trace.beginSection(ˉⁱ.ˎˑ("FontProvider.getProvider"));
        try {
            List listM9644 = c1328.f5395;
            String str = c1328.f5394;
            String str2 = c1328.f5391;
            if (listM9644 == null) {
                listM9644 = AbstractC4205.m9644(resources, 0);
            }
            C1317 c1317 = new C1317();
            c1317.f5365 = str;
            c1317.f5363 = str2;
            c1317.f5364 = listM9644;
            C1424 c1424 = f5386;
            ProviderInfo providerInfo = (ProviderInfo) c1424.m4941(c1317);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            C1259 c1259 = f5385;
            Collections.sort(arrayList, c1259);
            for (int i = 0; i < listM9644.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM9644.get(i));
                Collections.sort(arrayList2, c1259);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    c1424.m4933(c1317, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C1319[] m4623(Context context, C1328 c1328, String str) {
        Trace.beginSection(ˉⁱ.ˎˑ("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ˑʽ r2 = Build.VERSION.SDK_INT < 24 ? new ˑʽ(context, uriBuild) : new ﾞᐧ(context, uriBuild);
            Cursor cursorM4625 = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(ˉⁱ.ˎˑ("ContentQueryWrapper.query"));
                try {
                    cursorM4625 = r2.m4625(uriBuild, strArr, new String[]{c1328.f5393});
                    Trace.endSection();
                    if (cursorM4625 != null && cursorM4625.getCount() > 0) {
                        int columnIndex = cursorM4625.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorM4625.getColumnIndex("_id");
                        int columnIndex3 = cursorM4625.getColumnIndex("file_id");
                        int columnIndex4 = cursorM4625.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorM4625.getColumnIndex("font_weight");
                        int columnIndex6 = cursorM4625.getColumnIndex("font_italic");
                        while (cursorM4625.moveToNext()) {
                            int i = columnIndex != -1 ? cursorM4625.getInt(columnIndex) : 0;
                            arrayList2.add(new C1319(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorM4625.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorM4625.getLong(columnIndex3)), columnIndex4 != -1 ? cursorM4625.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorM4625.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorM4625.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorM4625 != null) {
                        cursorM4625.close();
                    }
                    r2.close();
                    return (C1319[]) arrayList.toArray(new C1319[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursorM4625 != null) {
                    cursorM4625.close();
                }
                r2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1329 m4624(Context context, List list) {
        Trace.beginSection(ˉⁱ.ˎˑ("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C1328 c1328 = (C1328) list.get(i);
                ProviderInfo providerInfoM4622 = m4622(context.getPackageManager(), c1328, context.getResources());
                if (providerInfoM4622 == null) {
                    C1329 c1329 = new C1329();
                    Trace.endSection();
                    return c1329;
                }
                arrayList.add(m4623(context, c1328, providerInfoM4622.authority));
            }
            C1329 c13292 = new C1329(arrayList);
            Trace.endSection();
            return c13292;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
