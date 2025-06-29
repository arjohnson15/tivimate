package p268;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC0224;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.lsposed.hiddenapibypass.library.R;
import p010.C1021;
import p013.AbstractC1041;
import p070.AbstractC1549;
import p072.AbstractC1642;
import p132.C2077;
import p252.AbstractC3139;
import p278.AbstractC3362;
import p288.C3395;
import p330.InterfaceC3746;
import p399.C4615;
import ʽᵔ.ʻʻ;
import ʽᵔ.ˊﹶ;
import ˈⁱ.ﹳﹳ;
import ˈﾞ.ˋˉ;
import ˉﾞ.יˆ;
import ˉﾞ.ٴᐧ;
import ˎˊ.ˏʾ;
import ـˈ.ˉᵎ;
import ـˈ.ˑי;
import ᴵˆ.ـﹶ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ـˏ.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3283 extends ˑי {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f12781;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Object f12782;

    public C3283() {
        ـᵎ r0 = new ـᵎ(this, 0);
        boolean z = AbstractC3139.f12115;
        this.f12781 = ﹳﹳ.ᐧⁱ(3, r0);
        this.f12782 = ﹳﹳ.ᐧⁱ(3, new ـᵎ(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ٴˑ.ˑʽ] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        postponeEnterTransition(500L, TimeUnit.MILLISECONDS);
        ?? r5 = this.f12782;
        ((ᐧᴵ) r5.getValue()).ˑʽ.m1042(getViewLifecycleOwner(), new ʻʻ(13, new ٴﹶ(this, 0)));
        ((ᐧᴵ) r5.getValue()).ﹳﹳ.m1042(getViewLifecycleOwner(), new ʻʻ(13, new ٴﹶ(this, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m8085(Preference preference) {
        ـﹶ r4;
        String str = preference.f1558;
        if (AbstractC1549.m5138(str, "manageSources")) {
            ـﹶ parentFragment = getParentFragment();
            r4 = parentFragment instanceof ـﹶ ? parentFragment : null;
            if (r4 != null) {
                r4.m8889(new C4615());
                return;
            }
            return;
        }
        if (AbstractC1549.m5138(str, "changePriority")) {
            ـﹶ parentFragment2 = getParentFragment();
            r4 = parentFragment2 instanceof ـﹶ ? parentFragment2 : null;
            if (r4 != null) {
                long j = m8086().ᐧⁱ;
                String str2 = m8086().ˆʿ;
                boolean z = m8086().ˎˑ;
                ˋˉ c3282 = new C3282();
                c3282.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ʻʻ(j, str2, z))}));
                r4.m8889(c3282);
                return;
            }
            return;
        }
        if (preference instanceof SwitchPreference) {
            SwitchPreference switchPreference = (SwitchPreference) preference;
            Long lValueOf = AbstractC1549.m5138(switchPreference.f1558, "default") ? null : Long.valueOf(Long.parseLong(switchPreference.f1558));
            ᐧᴵ r3 = (ᐧᴵ) this.f12782.getValue();
            boolean z2 = switchPreference.f1608;
            r3.getClass();
            AbstractC1642.m5294(AbstractC0224.m1023(r3), null, 0, new ˊˆ(r3, lValueOf, z2, (InterfaceC3746) null), 3);
            if (m8086().ˎˑ) {
                ᵢʿ.ᐧʻ = true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final ᵎᵢ m8086() {
        return (ᵎᵢ) this.f12781.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m8087() {
        List<ٴᐧ> list;
        Object next;
        String str;
        String str2;
        Object next2;
        ?? r0 = this.f12782;
        List list2 = (List) ((ᐧᴵ) r0.getValue()).ˑʽ.m1049();
        if (list2 == null || (list = (List) ((ᐧᴵ) r0.getValue()).ﹳﹳ.m1049()) == null) {
            return;
        }
        ((PreferenceScreen) this.f9034.f9116).m1203();
        AbstractC3362.m8198(this, "manageSources", getString(R.string._2_res_0x7f13030f), null, null, false, false, 0, 252);
        boolean z = false;
        AbstractC3362.m8198(this, "changePriority", getString(R.string._2_res_0x7f13026b), null, null, list.size() > 1, false, 0, 236);
        if (!list.isEmpty()) {
            AbstractC3362.m8216(this, "assignedSources", getString(R.string._2_res_0x7f130256));
            for (ٴᐧ r02 : list) {
                if (r02.ˑʽ != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        long j = ((יˆ) next2).ـﹶ;
                        Long l = r02.ˑʽ;
                        if (l != null && j == l.longValue()) {
                            break;
                        }
                    }
                    יˆ r2 = (יˆ) next2;
                    if (r2 != null) {
                        String strValueOf = String.valueOf(r2.ـﹶ);
                        String str3 = r2.ʽᐧ() ? m8086().ˆʿ : r2.ﹳﹳ;
                        String string = r2.ʽᐧ() ? getString(R.string._2_res_0x7f1303a5) : r2.ʿʼ;
                        str2 = str3;
                        str = strValueOf;
                    }
                } else {
                    str = "default";
                    str2 = "";
                    z = true;
                }
                AbstractC3362.m8182(this, str, str2, "", null, true, true, 184);
            }
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            יˆ r3 = (יˆ) obj;
            if (r3.ʽᐧ()) {
                long j2 = m8086().ᐧⁱ;
                Long l2 = r3.ʽᐧ;
                if (l2 != null && l2.longValue() == j2) {
                }
            }
            long jM5788 = C2077.f7939.m5788();
            long j3 = r3.ـﹶ;
            if (j3 != jM5788) {
                List list4 = list;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        Long l3 = ((ٴᐧ) it2.next()).ˑʽ;
                        if (l3 != null && l3.longValue() == j3) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        List<יˆ> listM4018 = AbstractC1041.m4018(arrayList, new ˊﹶ(29, new C1021(15)));
        if (!listM4018.isEmpty() || !z) {
            AbstractC3362.m8216(this, "unassignedSources", getString(R.string._2_res_0x7f1303bf));
            if (!z) {
                AbstractC3362.m8182(this, "default", "", "", null, false, true, 184);
            }
            for (יˆ r03 : listM4018) {
                String strValueOf2 = String.valueOf(r03.ـﹶ);
                String str4 = r03.ʽᐧ() ? m8086().ˆʿ : r03.ﹳﹳ;
                String string2 = r03.ʽᐧ() ? getString(R.string._2_res_0x7f1303a5) : r03.ʿʼ;
                AbstractC3362.m8182(this, strValueOf2, str4, "", null, false, true, 184);
            }
        }
        Preference preferenceM6301 = m6301("default");
        if (preferenceM6301 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((יˆ) next).ـﹶ == C2077.f7939.m5788()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            יˆ r22 = (יˆ) next;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string._2_res_0x7f130083));
            String str5 = r22 != null ? ˉᵎ.ˑי(new StringBuilder(" ("), r22.ﹳﹳ, ')') : null;
            if (str5 == null) {
                str5 = "";
            }
            sb.append(str5);
            preferenceM6301.m1197(sb.toString());
            if (r22 == null || r22.ʿʼ == null) {
            }
            preferenceM6301.mo1175("");
        }
        startPostponedEnterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m8088(String str) {
        PreferenceScreen preferenceScreenM6354 = this.f9034.m6354(requireContext());
        preferenceScreenM6354.m1197(getString(R.string._2_res_0x7f1302b3) + " (" + m8086().ˆʿ + ')');
        m6305(preferenceScreenM6354);
    }
}
