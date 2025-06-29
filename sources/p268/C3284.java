package p268;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC0224;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import ar.tvplayer.core.data.api.stalker.Stalker$Params;
import org.lsposed.hiddenapibypass.library.R;
import p070.AbstractC1549;
import p072.AbstractC1642;
import p252.AbstractC3139;
import p278.AbstractC3362;
import p317.AbstractC3616;
import p330.InterfaceC3746;
import ˈⁱ.ﹳﹳ;
import ˎˊ.ˏʾ;
import ˏʼ.ʽᐧ;
import יⁱ.ˑʽ;
import ـˈ.ˑי;
import ٴⁱ.ˏᴵ;
import ٴⁱ.ﹶˆ;
import ﹶⁱ.ـﹶ;

/* renamed from: ـˏ.ˑˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3284 extends ˑי implements ʽᐧ {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public String f12783;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f12784;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f12785;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public String f12786;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public boolean f12787;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public String f12788;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f12789;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public String f12790;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public String f12791;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public String f12792;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public String f12793;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Object f12794;

    /* renamed from: יˋ, reason: contains not printable characters */
    public String f12795;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public String f12796;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public String f12797;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public String f12798;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public String f12799;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public String f12800;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public String f12801;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public boolean f12802;

    public C3284() {
        ʼﹶ r0 = new ʼﹶ(this, 0);
        boolean z = AbstractC3139.f12115;
        this.f12785 = ﹳﹳ.ᐧⁱ(3, r0);
        this.f12794 = ﹳﹳ.ᐧⁱ(3, new ʼﹶ(this, 1));
        this.f12793 = "";
        this.f12800 = "";
        this.f12792 = "";
        this.f12799 = "";
        this.f12783 = "";
        this.f12798 = "";
        this.f12797 = "";
        this.f12790 = "";
        this.f12796 = "";
        this.f12786 = "";
        this.f12788 = "";
        this.f12801 = "";
        this.f12791 = "";
        this.f12795 = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            Stalker$Params stalker$Params = ˏᴵ.ʽᐧ(m8092().ˆʿ, 0L);
            if (stalker$Params != null) {
                this.f12793 = stalker$Params.f1939;
                this.f12800 = stalker$Params.f1952;
                this.f12792 = stalker$Params.f1947;
                this.f12799 = stalker$Params.f1958;
                this.f12783 = stalker$Params.f1941;
                this.f12798 = stalker$Params.f1945;
                this.f12797 = stalker$Params.f1942;
                this.f12802 = m8092().ˎˑ;
                boolean z = m8092().ᐧˋ;
                this.f12789 = z;
                this.f12790 = this.f12793;
                this.f12796 = this.f12800;
                this.f12786 = this.f12792;
                this.f12788 = this.f12799;
                this.f12801 = this.f12783;
                this.f12791 = this.f12798;
                this.f12795 = this.f12797;
                this.f12784 = this.f12802;
                this.f12787 = z;
            }
        } else {
            this.f12793 = bundle.getString("original_server_address");
            this.f12800 = bundle.getString("original_username");
            this.f12792 = bundle.getString("original_password");
            this.f12799 = bundle.getString("original_mac_address");
            this.f12783 = bundle.getString("original_device_id");
            this.f12798 = bundle.getString("original_device_id2");
            this.f12797 = bundle.getString("original_serial_number");
            boolean z2 = AbstractC3139.f12115;
            this.f12802 = bundle.getInt("original_include_tv_channels") != 0;
            this.f12789 = bundle.getInt("original_include_vod") != 0;
            this.f12790 = bundle.getString("server_address");
            this.f12796 = bundle.getString("username");
            this.f12786 = bundle.getString("password");
            this.f12788 = bundle.getString("mac_address");
            this.f12801 = bundle.getString("device_id");
            this.f12791 = bundle.getString("device_id2");
            this.f12795 = bundle.getString("serial_number");
            this.f12784 = bundle.getInt("include_tv_channels") != 0;
            this.f12787 = bundle.getInt("include_vod") != 0;
        }
        super/*ˊʾ.ʿˏ*/.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onSaveInstanceState(bundle);
        bundle.putString("original_server_address", this.f12793);
        bundle.putString("original_username", this.f12800);
        bundle.putString("original_password", this.f12792);
        bundle.putString("original_mac_address", this.f12799);
        bundle.putString("original_device_id", this.f12783);
        bundle.putString("original_device_id2", this.f12798);
        bundle.putString("original_serial_number", this.f12797);
        boolean z = this.f12802;
        boolean z2 = AbstractC3139.f12115;
        bundle.putInt("original_include_tv_channels", z ? 1 : 0);
        bundle.putInt("original_include_vod", this.f12789 ? 1 : 0);
        bundle.putString("server_address", this.f12790);
        bundle.putString("username", this.f12796);
        bundle.putString("password", this.f12786);
        bundle.putString("mac_address", this.f12788);
        bundle.putString("device_id", this.f12801);
        bundle.putString("device_id2", this.f12791);
        bundle.putString("serial_number", this.f12795);
        bundle.putInt("include_tv_channels", this.f12784 ? 1 : 0);
        bundle.putInt("include_vod", this.f12787 ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ˆﹶ) this.f12794.getValue()).ʽᐧ.ʿʼ(getViewLifecycleOwner(), new ˋˉ(6, this));
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m8089(Preference preference) {
        String str = preference.f1558;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1507298502) {
                if (str.equals("includeTvChannels")) {
                    this.f12784 = ((SwitchPreference) preference).f1608;
                    m8093();
                    return;
                }
                return;
            }
            if (iHashCode == 605052789) {
                if (str.equals("applyChanges")) {
                    m8091(true);
                }
            } else if (iHashCode == 840162051 && str.equals("includeVod")) {
                this.f12787 = ((SwitchPreference) preference).f1608;
                m8093();
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8090() {
        m8091(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m8091(boolean z) {
        boolean z2 = this.f12802 && !this.f12784;
        boolean z3 = this.f12789 && !this.f12787;
        if (z && (z2 || z3)) {
            ـﹶ.ˋˉ(getChildFragmentManager(), z2, z3, false);
            return;
        }
        ˏʾ.ᴵʼ(getChildFragmentManager(), getString(R.string._2_res_0x7f130332), false, 2);
        ﹶˆ r1 = ﹶˆ.ـﹶ;
        long j = m8092().ᐧⁱ;
        String str = m8092().ˆʿ;
        Stalker$Params stalker$ParamsCopy = ﹶˆ.ᵎˏ(this.f12790, this.f12796, this.f12786, this.f12788, this.f12801, this.f12791, this.f12795);
        Stalker$Params stalker$Params = ˏᴵ.ʽᐧ(str, j);
        if (stalker$Params != null) {
            stalker$ParamsCopy = stalker$ParamsCopy.copy((4034 & 1) != 0 ? stalker$ParamsCopy.f1950 : stalker$Params.f1950, stalker$ParamsCopy.f1939, (4034 & 4) != 0 ? stalker$ParamsCopy.f1948 : stalker$Params.f1948, (4034 & 8) != 0 ? stalker$ParamsCopy.f1957 : stalker$Params.f1957, (4034 & 16) != 0 ? stalker$ParamsCopy.f1940 : stalker$Params.f1940, (4034 & 32) != 0 ? stalker$ParamsCopy.f1951 : stalker$Params.f1951, stalker$ParamsCopy.f1952, stalker$ParamsCopy.f1947, stalker$ParamsCopy.f1958, stalker$ParamsCopy.f1941, stalker$ParamsCopy.f1945, stalker$ParamsCopy.f1942, (4034 & 4096) != 0 ? stalker$ParamsCopy.f1943 : stalker$Params.f1943);
        }
        String strM1398 = stalker$ParamsCopy.m1398();
        ˆﹶ r10 = (ˆﹶ) this.f12794.getValue();
        long j2 = m8092().ᐧⁱ;
        boolean z4 = this.f12784;
        boolean z5 = this.f12787;
        r10.getClass();
        AbstractC1642.m5294(AbstractC0224.m1023(r10), null, 0, new ﹳ(j2, strM1398, z4, z5, r10, (InterfaceC3746) null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final ʿˉ m8092() {
        return (ʿˉ) this.f12785.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m8093() {
        boolean z = (AbstractC1549.m5138(this.f12790, this.f12793) && AbstractC1549.m5138(this.f12796, this.f12800) && AbstractC1549.m5138(this.f12786, this.f12792) && AbstractC1549.m5138(this.f12788, this.f12799) && AbstractC1549.m5138(this.f12801, this.f12783) && AbstractC1549.m5138(this.f12791, this.f12798) && AbstractC1549.m5138(this.f12795, this.f12797) && this.f12784 == this.f12802 && this.f12787 == this.f12789) ? false : true;
        Preference preferenceM6301 = m6301("applyChanges");
        if (preferenceM6301 != null) {
            AbstractC3362.m8181(preferenceM6301, z && !AbstractC3616.m8523(this.f12790));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m8094(String str) {
        PreferenceScreen preferenceScreenM6354 = this.f9034.m6354(requireContext());
        preferenceScreenM6354.m1197(getString(R.string._2_res_0x7f1303a6));
        m6305(preferenceScreenM6354);
        ˑʽ r10 = new ˑʽ(this, 2);
        getString(R.string._2_res_0x7f130220);
        AbstractC3362.m8204(this, "username", getString(R.string._2_res_0x7f130449), r10, false, 8);
        AbstractC3362.m8204(this, "password", getString(R.string._2_res_0x7f130181), r10, false, 8);
        AbstractC3362.m8204(this, "macAddress", getString(R.string._2_res_0x7f130112), r10, false, 8);
        AbstractC3362.m8204(this, "deviceId", getString(R.string._2_res_0x7f130086), r10, false, 8);
        AbstractC3362.m8204(this, "deviceId2", getString(R.string._2_res_0x7f130086) + " 2", r10, false, 8);
        AbstractC3362.m8204(this, "serialNumber", getString(R.string._2_res_0x7f13021f), r10, false, 8);
        AbstractC3362.m8182(this, "includeTvChannels", getString(R.string._2_res_0x7f1302d7), null, null, this.f12784, false, 444);
        AbstractC3362.m8182(this, "includeVod", getString(R.string._2_res_0x7f1302d8), null, null, this.f12787, false, 444);
        AbstractC3362.m8198(this, "applyChanges", getString(R.string._2_res_0x7f130023), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "expirationDate", getString(R.string._2_res_0x7f1302ba), null, null, false, false, 0, 220);
        Preference preferenceM6301 = m6301("expirationDate");
        if (preferenceM6301 != null) {
            Long l = m8092().ˆᵔ;
            preferenceM6301.mo1175(l != null ? ʽᐧ.ᐧʻ(l.longValue() * 1000) : "—");
        }
        m8093();
    }
}
