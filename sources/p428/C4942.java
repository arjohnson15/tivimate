package p428;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p007.C0937;
import p084.C1714;
import p147.C2250;
import p147.C2251;
import p147.InterfaceC2254;
import p181.C2511;

/* renamed from: ﹶˊ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4942 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f18694;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C0937 f18695;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f18696;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2511 f18697;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4929 f18698;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC2254 f18699;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final Pattern f18693 = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final String f18692 = Pattern.quote("/");

    public C4942(Context context, String str, InterfaceC2254 interfaceC2254, C0937 c0937) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f18694 = context;
        this.f18696 = str;
        this.f18699 = interfaceC2254;
        this.f18695 = c0937;
        this.f18697 = new C2511(3);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4943 m11066(boolean z) {
        String str;
        InterfaceC2254 interfaceC2254 = this.f18699;
        String str2 = null;
        if (z) {
            try {
                str = ((C2251) AbstractC4939.m11064(((C2250) interfaceC2254).m6242())).f8967;
            } catch (Exception e) {
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) AbstractC4939.m11064(((C2250) interfaceC2254).m6252());
        } catch (Exception e2) {
        }
        return new C4943(str2, str);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized C4929 m11067() {
        String str;
        C4929 c4929 = this.f18698;
        if (c4929 != null && (c4929.f18651 != null || !this.f18695.m3801())) {
            return this.f18698;
        }
        C1714 c1714 = C1714.f6685;
        c1714.m5438("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f18694.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c1714.m5438("Cached Firebase Installation ID: " + string);
        if (this.f18695.m3801()) {
            C4943 c4943M11066 = m11066(false);
            c1714.m5438("Fetched Firebase Installation ID: " + c4943M11066.f18701);
            if (c4943M11066.f18701 == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                c4943M11066 = new C4943(str, null);
            }
            if (Objects.equals(c4943M11066.f18701, string)) {
                this.f18698 = new C4929(sharedPreferences.getString("crashlytics.installation.id", null), c4943M11066.f18701, c4943M11066.f18700);
            } else {
                this.f18698 = new C4929(m11068(sharedPreferences, c4943M11066.f18701), c4943M11066.f18701, c4943M11066.f18700);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f18698 = new C4929(m11068(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f18698 = new C4929(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        c1714.m5438("Install IDs: " + this.f18698);
        return this.f18698;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized String m11068(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f18693.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m11069() {
        String str;
        C2511 c2511 = this.f18697;
        Context context = this.f18694;
        synchronized (c2511) {
            try {
                if (c2511.f9987 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c2511.f9987 = installerPackageName;
                }
                str = "".equals(c2511.f9987) ? null : c2511.f9987;
            } finally {
            }
        }
        return str;
    }
}
