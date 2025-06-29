package p399;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import androidx.leanback.widget.RunnableC0183;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import ar.tvplayer.tv.settings.ui.tvguide.TvGuideUrlActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.lsposed.hiddenapibypass.library.R;
import p013.AbstractC1036;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p070.AbstractC1549;
import p071.AbstractC1570;
import p072.AbstractC1642;
import p149.C2311;
import p186.C2587;
import p252.AbstractC3139;
import p278.AbstractC3362;
import p286.C3389;
import p288.C3395;
import p288.C3406;
import p330.InterfaceC3746;
import p362.C4125;
import p395.AbstractC4535;
import ʽᵔ.ʻʻ;
import ʽᵔ.ʽⁱ;
import ˈⁱ.ﹳﹳ;
import ˉﾞ.יˆ;
import ˎˊ.ˏʾ;
import יˏ.ʾˈ;
import ـˈ.ˑי;
import ᴵˆ.ـﹶ;
import ᴵי.ˏᴵ;
import ᴵﹳ.ٴˎ;

/* renamed from: ⁱᵢ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4615 extends ˑי {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f17648;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final AbstractC1570 f17649;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public long f17650;

    /* JADX WARN: Multi-variable type inference failed */
    public C4615() {
        ˏᴵ r0 = new ˏᴵ(4, this);
        boolean z = AbstractC3139.f12115;
        this.f17648 = ﹳﹳ.ᐧⁱ(3, r0);
        this.f17649 = registerForActivityResult(new C3389(2), new C4125(6, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onCreate(bundle);
        if (bundle != null) {
            this.f17650 = bundle.getLong("source_id_to_select");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onSaveInstanceState(bundle);
        bundle.putLong("source_id_to_select", this.f17650);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        postponeEnterTransition(500L, TimeUnit.MILLISECONDS);
        m10500().ʽᐧ.m1042(getViewLifecycleOwner(), new ʻʻ(21, new ʿˏ(this, 0)));
        m10500().ˑʽ.m1042(getViewLifecycleOwner(), new ʻʻ(21, new ʿˏ(this, 1)));
        m10500().ﹳﹳ.m1042(getViewLifecycleOwner(), new ʻʻ(21, new ʿˏ(this, 2)));
        m10500().ʿʼ.ʿʼ(getViewLifecycleOwner(), new ʻʻ(21, new ʿˏ(this, 3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m10499(Preference preference) {
        String str = preference.f1558;
        if (AbstractC1549.m5138(str, "addSource")) {
            Intent intent = new Intent(getContext(), (Class<?>) TvGuideUrlActivity.class);
            intent.putExtra("ar.tvplayer.tv.settings.Args", (Parcelable) new ˎˑ(""));
            this.f17649.mo5158(intent);
        } else {
            if (AbstractC1549.m5138(str, "unlockPremium")) {
                AbstractC4535.m10353(this);
                return;
            }
            this.f17650 = Long.parseLong(preference.f1558);
            ـﹶ parentFragment = getParentFragment();
            ـﹶ r5 = parentFragment instanceof ـﹶ ? parentFragment : null;
            if (r5 != null) {
                long j = this.f17650;
                ˑי sharedPreferencesOnSharedPreferenceChangeListenerC4614 = new SharedPreferencesOnSharedPreferenceChangeListenerC4614();
                sharedPreferencesOnSharedPreferenceChangeListenerC4614.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ˋⁱ(j))}));
                r5.m8889(sharedPreferencesOnSharedPreferenceChangeListenerC4614);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final ᐧⁱ m10500() {
        return (ᐧⁱ) this.f17648.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m10501() {
        List list;
        List list2;
        Drawable drawable;
        Drawable drawable2;
        List list3 = (List) m10500().ʽᐧ.m1049();
        if (list3 == null || (list = (List) m10500().ˑʽ.m1049()) == null || (list2 = (List) m10500().ﹳﹳ.m1049()) == null) {
            return;
        }
        C3406 c3406 = C2587.f10275;
        boolean zM6723 = C2587.m6723();
        if (((PreferenceScreen) this.f9034.f9116).f1585.size() == 0) {
            AbstractC3362.m8216(this, "premiumSetting", getString(R.string._2_res_0x7f1301c6));
            AbstractC3362.m8198(this, "unlockPremium", getString(R.string._2_res_0x7f13043e), null, ⁱʿ(), false, false, 0, 244);
            AbstractC3362.m8198(this, "addSource", getString(R.string._2_res_0x7f13024d), null, null, false, false, 2147483643, 124);
            AbstractC3362.m8180(this, "sourcesHint", getString(R.string._2_res_0x7f1302b4), null, 2147483644, 4);
        }
        Preference preferenceM6301 = m6301("premiumSetting");
        if (preferenceM6301 != null) {
            preferenceM6301.m1184(!zM6723);
        }
        Preference preferenceM63012 = m6301("unlockPremium");
        if (preferenceM63012 != null) {
            preferenceM63012.m1184(!zM6723);
        }
        Preference preferenceM63013 = m6301("addSource");
        Drawable drawable3 = null;
        if (preferenceM63013 != null) {
            boolean z = zM6723 || list3.isEmpty();
            AbstractC3362.m8181(preferenceM63013, z);
            preferenceM63013.m1201(z ? null : ˎˉ());
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"premiumSetting", "unlockPremium", "addSource", "sourcesHint"};
        int size = ((PreferenceScreen) this.f9034.f9116).f1585.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceM1202 = ((PreferenceScreen) this.f9034.f9116).m1202(i);
            if (!AbstractC1036.m3997(strArr, preferenceM1202.f1558)) {
                arrayList.add(preferenceM1202);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            PreferenceScreen preferenceScreen = (PreferenceScreen) this.f9034.f9116;
            preferenceScreen.m1204(preference);
            C2311 c2311 = preferenceScreen.f1561;
            if (c2311 != null) {
                Handler handler = c2311.f9125;
                RunnableC0183 runnableC0183 = c2311.f9129;
                handler.removeCallbacks(runnableC0183);
                handler.post(runnableC0183);
            }
        }
        List<יˆ> list4 = list3;
        ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(list4, 10));
        for (יˆ r2 : list4) {
            String str = ٴˎ.ﹶˆ(r2, list);
            String str2 = r2.ʿʼ;
            arrayList2.add(new יˆ(r2.ـﹶ, r2.ʽᐧ, r2.ˑʽ, str, "", r2.ٴˎ));
        }
        long j = 0;
        for (יˆ r0 : AbstractC1041.m4018(arrayList2, new ʽⁱ(19))) {
            if (r0.ـﹶ(list2)) {
                drawable = ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f080126);
                if (drawable != null) {
                    drawable.setTintList(com.bumptech.glide.ﹳﹳ.ˑי(requireContext(), R.color._2_res_0x7f0603c9));
                    drawable2 = drawable;
                }
                drawable2 = drawable3;
            } else {
                drawable = ʾˈ.ﾞʽ(this, R.drawable._2_res_0x7f080112);
                if (drawable != null) {
                    drawable.setTintList(com.bumptech.glide.ﹳﹳ.ˑי(requireContext(), R.color._2_res_0x7f0603c8));
                    drawable2 = drawable;
                }
                drawable2 = drawable3;
            }
            long j2 = r0.ـﹶ;
            AbstractC3362.m8198(this, String.valueOf(j2), r0.ﹳﹳ, r0.ʽᐧ() ? getString(R.string._2_res_0x7f1303a5) : r0.ʿʼ, drawable2, false, true, 0, 176);
            if (j2 > j) {
                j = j2;
            }
            drawable3 = null;
        }
        if (this.f17650 == Long.MAX_VALUE) {
            if (j == 0) {
                j = 0;
            }
            this.f17650 = j;
        }
        long j3 = this.f17650;
        if (j3 != 0) {
            this.f17650 = 0L;
            AbstractC1642.m5294(AbstractC3139.m7770(this), null, 0, new ˋˊ(this, j3, (InterfaceC3746) null), 3);
        }
        startPostponedEnterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m10502(String str) {
        PreferenceScreen preferenceScreenM6354 = this.f9034.m6354(requireContext());
        preferenceScreenM6354.m1197(getString(R.string._2_res_0x7f1302b3));
        m6305(preferenceScreenM6354);
    }
}
