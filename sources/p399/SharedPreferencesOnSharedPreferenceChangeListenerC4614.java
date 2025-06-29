package p399;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import ar.tvplayer.tv.settings.ui.tvguide.DeleteTvGuideSourceActivity;
import ar.tvplayer.tv.settings.ui.tvguide.TvGuideSourceNameActivity;
import ar.tvplayer.tv.settings.ui.tvguide.TvGuideUrlActivity;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.lsposed.hiddenapibypass.library.R;
import p071.AbstractC1570;
import p132.C2077;
import p252.AbstractC3139;
import p278.AbstractC3362;
import p286.C3389;
import ʽᵔ.ʻʻ;
import ˈⁱ.ﹳﹳ;
import ˉʼ.ﹶˆ;
import ˉﾞ.יˆ;
import ˎˊ.ˆʿ;
import ˏʼ.ʽᐧ;
import יˏ.ʾˈ;
import ـˈ.ˑי;
import ᴵˆ.ـﹶ;
import ᴵˎ.ᴵʽ;
import ᴵﹳ.ٴˎ;

/* renamed from: ⁱᵢ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4614 extends ˑי implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f17643;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final AbstractC1570 f17644;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final AbstractC1570 f17645;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Object f17646;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final AbstractC1570 f17647;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedPreferencesOnSharedPreferenceChangeListenerC4614() {
        ˉי r2 = new ˉי(this, 0);
        boolean z = AbstractC3139.f12115;
        this.f17643 = ﹳﹳ.ᐧⁱ(3, r2);
        this.f17646 = ﹳﹳ.ᐧⁱ(3, new ˉי(this, 1));
        this.f17645 = registerForActivityResult(new C3389(2), new ˏʾ(this, 0));
        this.f17647 = registerForActivityResult(new C3389(2), new ˏʾ(this, 1));
        this.f17644 = registerForActivityResult(new C3389(2), new ˏʾ(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onCreate(bundle);
        C2077.f7939.ﾞﾞ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*androidx.fragment.app.ˏᴵ*/.onDestroy();
        C2077.f7939.ʻ(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        m10497();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        postponeEnterTransition(500L, TimeUnit.MILLISECONDS);
        m10496().ʽᐧ.m1042(getViewLifecycleOwner(), new ʻʻ(20, new ˉⁱ(this, 0)));
        m10496().ˑʽ.m1042(getViewLifecycleOwner(), new ʻʻ(20, new ˉⁱ(this, 1)));
        m10496().ﹳﹳ.m1042(getViewLifecycleOwner(), new ʻʻ(20, new ˉⁱ(this, 2)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m10495(Preference preference) {
        יˆ r6;
        String str = preference.f1558;
        if (str != null) {
            switch (str.hashCode()) {
                case -1111633594:
                    if (str.equals("sourceName")) {
                        String strValueOf = String.valueOf(preference.mo1177());
                        Intent intent = new Intent(getContext(), (Class<?>) TvGuideSourceNameActivity.class);
                        intent.putExtra("ar.tvplayer.tv.settings.Args", (Parcelable) new ˏᵢ(strValueOf));
                        this.f17645.mo5158(intent);
                        break;
                    }
                    break;
                case -1101254283:
                    if (str.equals("tvGuideUrl")) {
                        String strValueOf2 = String.valueOf(preference.mo1177());
                        Intent intent2 = new Intent(getContext(), (Class<?>) TvGuideUrlActivity.class);
                        intent2.putExtra("ar.tvplayer.tv.settings.Args", (Parcelable) new ˎˑ(strValueOf2));
                        this.f17647.mo5158(intent2);
                        break;
                    }
                    break;
                case -764564058:
                    if (str.equals("deleteSource")) {
                        this.f17644.mo5158(new Intent(getContext(), (Class<?>) DeleteTvGuideSourceActivity.class));
                        break;
                    }
                    break;
                case 665490880:
                    if (str.equals("timeOffset") && (r6 = (יˆ) m10496().ʽᐧ.m1049()) != null) {
                        ـﹶ parentFragment = getParentFragment();
                        ـﹶ r0 = parentFragment instanceof ـﹶ ? parentFragment : null;
                        if (r0 != null) {
                            r0.m8889(ˆʿ.ᐧʻ(3, Long.valueOf(r6.ـﹶ), (ᵎﹳ.ﹳﹳ) null, r6.ٴˎ, false));
                            break;
                        }
                    }
                    break;
                case 969258428:
                    if (str.equals("defaultSource")) {
                        if (!((SwitchPreference) preference).f1608) {
                            C2077.f7939.getClass();
                            ﹶˆ.ˉי(0L, new ˉʼ.ـﹶ(19));
                            break;
                        } else {
                            יˆ r62 = (יˆ) m10496().ʽᐧ.m1049();
                            if (r62 != null) {
                                C2077.f7939.getClass();
                                ﹶˆ.ˉי(r62.ـﹶ, new ˉʼ.ـﹶ(19));
                                ᴵʽ.ʽᐧ(true);
                                break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final ﹳˎ m10496() {
        return (ﹳˎ) this.f17646.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m10497() {
        List list;
        List list2;
        יˆ r0 = (יˆ) m10496().ʽᐧ.m1049();
        if (r0 == null || (list = (List) m10496().ˑʽ.m1049()) == null || (list2 = (List) m10496().ﹳﹳ.m1049()) == null) {
            return;
        }
        ˉᵎ(ٴˎ.ﹶˆ(r0, list));
        if (r0.ʽᐧ()) {
            Preference preferenceM6301 = m6301("timeOffset");
            if (preferenceM6301 != null) {
                preferenceM6301.m1184(true);
            }
        } else {
            AbstractC3362.m8221(this, true);
        }
        Preference preferenceM63012 = m6301("sourceName");
        if (preferenceM63012 != null) {
            preferenceM63012.mo1175(r0.ﹳﹳ);
        }
        Preference preferenceM63013 = m6301("tvGuideUrl");
        if (preferenceM63013 != null) {
            preferenceM63013.mo1175(r0.ʿʼ);
        }
        Preference preferenceM63014 = m6301("timeOffset");
        if (preferenceM63014 != null) {
            preferenceM63014.mo1175(ʽᐧ.ˉי(Integer.valueOf(r0.ٴˎ)));
        }
        Preference preferenceM63015 = m6301("sourceAlert");
        if (preferenceM63015 != null) {
            preferenceM63015.m1184(!r0.ـﹶ(list2));
        }
        startPostponedEnterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m10498(String str) {
        m6305(this.f9034.m6354(requireContext()));
        AbstractC3362.m8198(this, "sourceName", getString(R.string._2_res_0x7f1303a3), null, null, false, false, 0, 252);
        getString(R.string._2_res_0x7f1302b7);
        AbstractC3362.m8198(this, "timeOffset", getString(R.string._2_res_0x7f1303b0), null, null, false, false, 0, 252);
        AbstractC3362.m8182(this, "defaultSource", getString(R.string._2_res_0x7f130295), null, null, ((ˋⁱ) this.f17643.getValue()).ᐧⁱ == C2077.f7939.m5788(), false, 444);
        AbstractC3362.m8198(this, "deleteSource", getString(R.string._2_res_0x7f13029e), null, null, false, false, 0, 252);
        AbstractC3362.m8180(this, "sourceAlert", getString(R.string._2_res_0x7f1303a2), ʾˈ.ﾞʽ(this, R.drawable._2_res_0x7f080112), 0, 8);
        AbstractC3362.m8221(this, false);
    }
}
