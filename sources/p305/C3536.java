package p305;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import p238.AbstractC3095;
import p436.C5068;

/* renamed from: ᐧˆ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3536 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3536 f13675;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int f13676;

    static {
        int i = AbstractC3537.f13678;
        f13676 = 12451000;
        f13675 = new C3536();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01af A[EDGE_INSN: B:100:0x01af->B:111:0x01eb BREAK  A[LOOP:0: B:104:0x01c3->B:129:?]] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m8426(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305.C3536.m8426(android.content.Context, int):int");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Intent m8427(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && AbstractC3095.m7614(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f13676);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C5068.m11225(context).m3955(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }
}
