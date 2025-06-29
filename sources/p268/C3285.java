package p268;

import android.os.Bundle;
import android.support.v4.media.session.AbstractC0001;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.lifecycle.AbstractC0224;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import ar.tvplayer.core.data.api.xtreamcodes.XtreamCodes$Params;
import org.lsposed.hiddenapibypass.library.R;
import p070.AbstractC1549;
import p072.AbstractC1642;
import p252.AbstractC3139;
import p278.AbstractC3362;
import p288.C3395;
import p317.AbstractC3616;
import p330.InterfaceC3746;
import ˈⁱ.ﹳﹳ;
import ˎˊ.ˏʾ;
import ˏʼ.ʽᐧ;
import ـˈ.ˑי;
import ᴵˆ.ـﹶ;
import ᵔʼ.ˑʽ;

/* renamed from: ـˏ.ﾞי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3285 extends ˑי implements ʽᐧ {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f12803;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f12804;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f12805;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public String f12806;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public String f12807;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public String f12808;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public String f12809;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Object f12810;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f12811;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public String f12812;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f12813;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public String f12814;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public String f12815;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public String f12816;

    public C3285() {
        ᵢⁱ r0 = new ᵢⁱ(this, 0);
        boolean z = AbstractC3139.f12115;
        this.f12804 = ﹳﹳ.ᐧⁱ(3, r0);
        this.f12810 = ﹳﹳ.ᐧⁱ(3, new ᵢⁱ(this, 1));
        this.f12809 = "";
        this.f12815 = "";
        this.f12808 = "";
        this.f12814 = "";
        this.f12812 = "";
        this.f12816 = "";
        this.f12806 = "";
        this.f12807 = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            XtreamCodes$Params xtreamCodes$Params = ˑʽ.ᵎˏ(m8098().ˆʿ, m8098().ᐧⁱ);
            if (xtreamCodes$Params != null) {
                this.f12809 = AbstractC3616.m8537(xtreamCodes$Params.f2193, "/");
                this.f12815 = xtreamCodes$Params.f2196;
                this.f12808 = xtreamCodes$Params.f2200;
                this.f12814 = ((Boolean) xtreamCodes$Params.f2195.getValue()).booleanValue() ? "MPEG-TS" : "HLS";
                this.f12803 = m8098().ˎˑ;
                boolean z = m8098().ᐧˋ;
                this.f12813 = z;
                this.f12812 = this.f12809;
                this.f12816 = this.f12815;
                this.f12806 = this.f12808;
                this.f12807 = this.f12814;
                this.f12811 = this.f12803;
                this.f12805 = z;
            }
        } else {
            this.f12809 = bundle.getString("original_server_address");
            this.f12815 = bundle.getString("original_username");
            this.f12808 = bundle.getString("original_password");
            this.f12814 = bundle.getString("original_output");
            boolean z2 = AbstractC3139.f12115;
            this.f12803 = bundle.getInt("original_include_tv_channels") != 0;
            this.f12813 = bundle.getInt("original_include_vod") != 0;
            this.f12812 = bundle.getString("server_address");
            this.f12816 = bundle.getString("username");
            this.f12806 = bundle.getString("password");
            this.f12807 = bundle.getString("output");
            this.f12811 = bundle.getInt("include_tv_channels") != 0;
            this.f12805 = bundle.getInt("include_vod") != 0;
        }
        super/*ˊʾ.ʿˏ*/.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onSaveInstanceState(bundle);
        bundle.putString("original_server_address", this.f12809);
        bundle.putString("original_username", this.f12815);
        bundle.putString("original_password", this.f12808);
        bundle.putString("original_output", this.f12814);
        boolean z = this.f12803;
        boolean z2 = AbstractC3139.f12115;
        bundle.putInt("original_include_tv_channels", z ? 1 : 0);
        bundle.putInt("original_include_vod", this.f12813 ? 1 : 0);
        bundle.putString("server_address", this.f12812);
        bundle.putString("username", this.f12816);
        bundle.putString("password", this.f12806);
        bundle.putString("output", this.f12807);
        bundle.putInt("include_tv_channels", this.f12811 ? 1 : 0);
        bundle.putInt("include_vod", this.f12805 ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ᵢᴵ) this.f12810.getValue()).ʽᐧ.ʿʼ(getViewLifecycleOwner(), new ˋˉ(7, this));
        String str = AbstractC0001.f41;
        if (str != null) {
            this.f12807 = str;
            Preference preferenceM6301 = m6301("output");
            if (preferenceM6301 != null) {
                preferenceM6301.mo1175(this.f12807);
            }
            m8099();
            AbstractC0001.f41 = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m8095(Preference preference) {
        String str = preference.f1558;
        if (str != null) {
            switch (str.hashCode()) {
                case -1507298502:
                    if (str.equals("includeTvChannels")) {
                        this.f12811 = ((SwitchPreference) preference).f1608;
                        m8099();
                        break;
                    }
                    break;
                case -1005512447:
                    if (str.equals("output")) {
                        ـﹶ parentFragment = getParentFragment();
                        ـﹶ r6 = parentFragment instanceof ـﹶ ? parentFragment : null;
                        if (r6 != null) {
                            String str2 = this.f12807;
                            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = new ʻٴ();
                            abstractComponentCallbacksC0100.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ˆˋ(str2))}));
                            r6.m8889(abstractComponentCallbacksC0100);
                            break;
                        }
                    }
                    break;
                case 605052789:
                    if (str.equals("applyChanges")) {
                        m8097(true);
                        break;
                    }
                    break;
                case 840162051:
                    if (str.equals("includeVod")) {
                        this.f12805 = ((SwitchPreference) preference).f1608;
                        m8099();
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8096() {
        m8097(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m8097(boolean z) {
        boolean z2 = this.f12803 && !this.f12811;
        boolean z3 = this.f12813 && !this.f12805;
        if (z && (z2 || z3)) {
            ﹶⁱ.ـﹶ.ˋˉ(getChildFragmentManager(), z2, z3, false);
            return;
        }
        boolean z4 = AbstractC1549.m5138(this.f12812, this.f12809) && AbstractC1549.m5138(this.f12816, this.f12815) && AbstractC1549.m5138(this.f12806, this.f12808) && this.f12811 == this.f12803 && this.f12805 == this.f12813;
        if (!z4) {
            ˏʾ.ᴵʼ(getChildFragmentManager(), getString(R.string._2_res_0x7f130332), false, 2);
        }
        long j = m8098().ᐧⁱ;
        String str = this.f12812;
        String str2 = this.f12816;
        String str3 = this.f12806;
        String str4 = this.f12807;
        String strM8537 = AbstractC3616.m8537(AbstractC3616.m8539(str).toString(), "/");
        if (!AbstractC3139.m7726(strM8537)) {
            strM8537 = "http://".concat(strM8537);
        }
        String strM1412 = new XtreamCodes$Params(j, strM8537, AbstractC3616.m8539(str2).toString(), AbstractC3616.m8539(str3).toString(), AbstractC3616.m8533(str4, "ts", true) ? "ts" : "m3u8").m1412();
        ᵢᴵ r10 = (ᵢᴵ) this.f12810.getValue();
        long j2 = m8098().ᐧⁱ;
        boolean z5 = this.f12811;
        boolean z6 = this.f12805;
        r10.getClass();
        AbstractC1642.m5294(AbstractC0224.m1023(r10), null, 0, new ˏʻ(z4, j2, strM1412, z5, z6, r10, (InterfaceC3746) null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final ٴᵔ m8098() {
        return (ٴᵔ) this.f12804.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m8099() {
        boolean z = (AbstractC1549.m5138(this.f12812, this.f12809) && AbstractC1549.m5138(this.f12816, this.f12815) && AbstractC1549.m5138(this.f12806, this.f12808) && AbstractC1549.m5138(this.f12807, this.f12814) && this.f12811 == this.f12803 && this.f12805 == this.f12813) ? false : true;
        Preference preferenceM6301 = m6301("applyChanges");
        if (preferenceM6301 != null) {
            AbstractC3362.m8181(preferenceM6301, (!z || AbstractC3616.m8523(this.f12812) || AbstractC3616.m8523(this.f12816) || AbstractC3616.m8523(this.f12806)) ? false : true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m8100(String str) {
        String string;
        PreferenceScreen preferenceScreenM6354 = this.f9034.m6354(requireContext());
        preferenceScreenM6354.m1197(getString(R.string._2_res_0x7f1303e1));
        m6305(preferenceScreenM6354);
        יⁱ.ˑʽ r10 = new יⁱ.ˑʽ(this, 3);
        getString(R.string._2_res_0x7f130220);
        AbstractC3362.m8204(this, "username", getString(R.string._2_res_0x7f130449), r10, false, 8);
        AbstractC3362.m8204(this, "password", getString(R.string._2_res_0x7f130181), r10, false, 8);
        AbstractC3362.m8198(this, "output", getString(R.string._2_res_0x7f130315), this.f12807, null, false, false, 0, 248);
        AbstractC3362.m8182(this, "includeTvChannels", getString(R.string._2_res_0x7f1302d7), null, null, this.f12811, false, 444);
        AbstractC3362.m8182(this, "includeVod", getString(R.string._2_res_0x7f1302d8), null, null, this.f12805, false, 444);
        AbstractC3362.m8198(this, "applyChanges", getString(R.string._2_res_0x7f130023), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "expirationDate", getString(R.string._2_res_0x7f1302ba), null, null, false, false, 0, 220);
        AbstractC3362.m8198(this, "maxConnections", getString(R.string._2_res_0x7f130310), null, null, false, false, 0, 220);
        Preference preferenceM6301 = m6301("expirationDate");
        String str2 = "—";
        if (preferenceM6301 != null) {
            Long l = m8098().ˆᵔ;
            preferenceM6301.mo1175(l != null ? ʽᐧ.ᐧʻ(l.longValue() * 1000) : "—");
        }
        Preference preferenceM63012 = m6301("maxConnections");
        if (preferenceM63012 != null) {
            Integer num = m8098().ᵢʿ;
            if (num != null && (string = num.toString()) != null) {
                str2 = string;
            }
            preferenceM63012.mo1175(str2);
        }
        m8099();
    }
}
