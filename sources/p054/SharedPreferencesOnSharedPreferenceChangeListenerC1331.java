package p054;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC0224;
import androidx.preference.Preference;
import com.google.android.gms.internal.measurement.C0367;
import com.google.android.gms.internal.measurement.C0508;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.parse.ParseUser;
import org.lsposed.hiddenapibypass.library.R;
import p001.C0884;
import p072.AbstractC1586;
import p072.AbstractC1642;
import p132.C2077;
import p176.InterfaceC2490;
import p186.C2587;
import p186.C2599;
import p252.AbstractC3139;
import p253.C3150;
import p253.ExecutorC3146;
import p278.AbstractC3362;
import p288.C3406;
import p330.InterfaceC3746;
import p395.AbstractC4535;
import p395.RunnableC4533;
import ʼʽ.ˉי;
import ʼˈ.ـﹶ;
import ʼᐧ.ʽᐧ;
import ʼᐧ.ˏᴵ;
import ˈⁱ.ﹳﹳ;
import ˉʼ.ﹶˆ;
import יˏ.ʾˈ;
import ـˈ.ˑי;

/* renamed from: ʾʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1331 extends ˑי implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f5413;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1331() {
        ـﹶ r0 = new ـﹶ(10, this);
        boolean z = AbstractC3139.f12115;
        this.f5413 = ﹳﹳ.ᐧⁱ(3, r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onCreate(bundle);
        C2599.f10350.ﾞﾞ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*androidx.fragment.app.ˏᴵ*/.onDestroy();
        C2599.f10350.ʻ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        View view = getView();
        if (view != null) {
            view.post(new RunnableC4533(this, 6, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ﹶˆ) this.f5413.getValue()).ʽᐧ.ʿʼ(getViewLifecycleOwner(), new ʽᐧ(3, this));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m4638(Preference preference) {
        String str = preference.f1558;
        if (str != null) {
            int iHashCode = str.hashCode();
            ?? r4 = this.f5413;
            switch (iHashCode) {
                case -498103322:
                    if (str.equals("aboutUnlockPremium")) {
                        AbstractC4535.m10353(this);
                        break;
                    }
                    break;
                case 1247216983:
                    if (str.equals("sendLogs")) {
                        m4639(true);
                        ﹶˆ r8 = (ﹶˆ) r4.getValue();
                        int iIntValue = ((Number) AbstractC3139.f12122.getValue()).intValue();
                        r8.getClass();
                        C0884 c0884M1023 = AbstractC0224.m1023(r8);
                        C3150 c3150 = AbstractC1586.f6345;
                        AbstractC1642.m5294(c0884M1023, ExecutorC3146.f12150, 0, new ˏᵢ(iIntValue, r8, (InterfaceC3746) null), 2);
                        break;
                    }
                    break;
                case 1539108570:
                    if (str.equals("privacyPolicy")) {
                        ⁱـ.ˑי.ﾞʽ(requireContext(), "https://sites.google.com/view/tivimateprivacy");
                        break;
                    }
                    break;
                case 2032964299:
                    if (str.equals("sendStatistics")) {
                        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(ˈʼ.ﹳﹳ.ـﹶ());
                        C2077 c2077 = C2077.f7939;
                        c2077.getClass();
                        Boolean boolValueOf = Boolean.valueOf(ﹶˆ.ʽᐧ(((Boolean) C2077.f8109.ʿˏ(c2077, C2077.f7994[209])).booleanValue()));
                        C0367 c0367 = firebaseAnalytics.f3650;
                        c0367.getClass();
                        c0367.m2048(new C0508(c0367, boolValueOf, 1));
                        break;
                    }
                    break;
                case 2054320281:
                    if (str.equals("checkForNewVersion") && AbstractC3139.m7731()) {
                        m4640(true);
                        ﹶˆ r82 = (ﹶˆ) r4.getValue();
                        int iIntValue2 = ((Number) AbstractC3139.f12122.getValue()).intValue();
                        r82.getClass();
                        ˉי.ـﹶ(iIntValue2, "", false, new ˏᴵ(2, r82));
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m4639(boolean z) {
        Drawable drawable;
        Preference preferenceM6301 = m6301("sendLogs");
        if (preferenceM6301 != null) {
            AbstractC3362.m8181(preferenceM6301, !z);
            if (z) {
                Drawable drawable2 = ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f080083);
                ((Animatable) drawable2).start();
                drawable = drawable2;
            } else {
                drawable = null;
            }
            preferenceM6301.m1201(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final void m4640(boolean z) {
        Drawable drawable;
        Preference preferenceM6301 = m6301("checkForNewVersion");
        if (preferenceM6301 != null) {
            AbstractC3362.m8181(preferenceM6301, !z);
            if (z) {
                Drawable drawable2 = ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f080083);
                ((Animatable) drawable2).start();
                drawable = drawable2;
            } else {
                drawable = null;
            }
            preferenceM6301.m1201(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m4641() {
        String string;
        ParseUser currentUser;
        C3406 c3406 = C2587.f10275;
        boolean zM6723 = C2587.m6723();
        Preference preferenceM6301 = m6301("privacyPolicy");
        if (preferenceM6301 != null) {
            preferenceM6301.f1568.m1204(preferenceM6301);
        }
        Preference preferenceM63012 = m6301("sendStatistics");
        if (preferenceM63012 != null) {
            preferenceM63012.f1568.m1204(preferenceM63012);
        }
        Preference preferenceM63013 = m6301("autoUpdateApp");
        if (preferenceM63013 != null) {
            preferenceM63013.m1184(!AbstractC3139.m7781());
            preferenceM63013.f1568.m1204(preferenceM63013);
        }
        Preference preferenceM63014 = m6301("joinBetaTesting");
        if (preferenceM63014 != null) {
            preferenceM63014.m1184(!AbstractC3139.m7781());
            preferenceM63014.f1568.m1204(preferenceM63014);
        }
        Preference preferenceM63015 = m6301("checkForNewVersion");
        if (preferenceM63015 != null) {
            preferenceM63015.m1184(!AbstractC3139.m7781());
            preferenceM63015.f1568.m1204(preferenceM63015);
        }
        Preference preferenceM63016 = m6301("sendLogs");
        boolean z = false;
        if (preferenceM63016 != null) {
            preferenceM63016.m1184(false);
            preferenceM63016.f1568.m1204(preferenceM63016);
        }
        Preference preferenceM63017 = m6301("account");
        if (preferenceM63017 != null) {
            C2599 c2599 = C2599.f10350;
            if (c2599.m6774().length() == 0 && (currentUser = ParseUser.getCurrentUser()) != null) {
                C2599.m6767(currentUser.getEmail());
            }
            preferenceM63017.m1184(c2599.m6774().length() > 0);
            preferenceM63017.mo1175(c2599.m6774());
            preferenceM63017.f1568.m1204(preferenceM63017);
        }
        Preference preferenceM63018 = m6301("deviceName");
        if (preferenceM63018 != null) {
            C2599 c25992 = C2599.f10350;
            c25992.getClass();
            InterfaceC2490[] interfaceC2490Arr = C2599.f10353;
            InterfaceC2490 interfaceC2490 = interfaceC2490Arr[14];
            ᴵﹳ.ﹶˆ r8 = C2599.f10348;
            preferenceM63018.m1184(ﹶˆ.ᐧʻ((String) r8.ʿˏ(c25992, interfaceC2490)).length() > 0);
            preferenceM63018.mo1175(ﹶˆ.ᐧʻ((String) r8.ʿˏ(c25992, interfaceC2490Arr[14])));
            preferenceM63018.f1568.m1204(preferenceM63018);
        }
        Preference preferenceM63019 = m6301("version");
        if (preferenceM63019 != null) {
            if (zM6723) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) AbstractC3139.f12103.getValue());
                sb.append(" (");
                getString(R.string._2_res_0x7f1301b9);
                sb.append("X Premium");
                sb.append(')');
                string = sb.toString();
            } else {
                string = (String) AbstractC3139.f12103.getValue();
            }
            preferenceM63019.mo1175(string);
        }
        Preference preferenceM630110 = m6301("cancelSubscription");
        if (preferenceM630110 != null) {
            if (AbstractC3139.m7781() && C2599.f10350.m6772().length() > 0) {
                z = true;
            }
            preferenceM630110.m1184(z);
            String str = getString(R.string._2_res_0x7f1301c8) + "\n\nhttps://play.google.com/store/account/subscriptions";
            preferenceM630110.mo1175("");
        }
        Preference preferenceM630111 = m6301("aboutPremiumSettings");
        if (preferenceM630111 != null) {
            preferenceM630111.m1184(!zM6723);
            preferenceM630111.f1568.m1204(preferenceM630111);
        }
        Preference preferenceM630112 = m6301("aboutUnlockPremium");
        if (preferenceM630112 != null) {
            preferenceM630112.m1184(!zM6723);
            preferenceM630112.m1201(ⁱʿ());
            preferenceM630112.f1568.m1204(preferenceM630112);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m4642(String str) throws Resources.NotFoundException {
        m6302(R.xml.settings_about, str);
        m4641();
    }
}
