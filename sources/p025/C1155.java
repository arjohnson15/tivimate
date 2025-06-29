package p025;

import androidx.fragment.app.AbstractActivityC0113;
import androidx.leanback.app.C0120;
import androidx.leanback.widget.C0153;
import androidx.leanback.widget.C0203;
import androidx.lifecycle.C0241;
import ar.tvplayer.core.data.api.xtreamcodes.XtreamCodes$Params;
import com.andyhax.haxsplash.AndyHax;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p252.AbstractC3139;
import p317.AbstractC3616;
import יˏ.ʾˈ;
import ـˈ.ᴵʿ;
import ᴵﹳ.ﹶˆ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ʼˈ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1155 extends ᴵʿ {
    public int service_id;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m4194(C0203 c0203) {
        AbstractActivityC0113 activity;
        C0241 viewModelStore;
        long j = c0203.f1209;
        if (j == 103) {
            ˊﹶ(AbstractC3139.m7748(), 100L);
            return;
        }
        if (j == 104) {
            ˊﹶ(AbstractC3139.m7748(), 101L);
            return;
        }
        if (j == 105) {
            ˊﹶ(AbstractC3139.m7748(), 102L);
            return;
        }
        if (j == 2 && (activity = getActivity()) != null && (viewModelStore = activity.getViewModelStore()) != null) {
            viewModelStore.m1039();
        }
        super.ʻʻ(c0203);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final ﹶˆ m4195() {
        getString(R.string._2_res_0x7f1303e0);
        return new ﹶˆ("Your Login Details", "", "", ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f080149));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final C0120 m4196() {
        String strM7706 = AbstractC3139.m7706(ⁱⁱ(100L));
        String str = ⁱⁱ(101L);
        String str2 = ⁱⁱ(102L);
        String strM8537 = AbstractC3616.m8537(AbstractC3616.m8539(strM7706).toString(), "/");
        if (!AbstractC3139.m7726(strM8537)) {
            strM8537 = "http://".concat(strM8537);
        }
        String strM1412 = new XtreamCodes$Params(0L, AndyHax.GetById(AndyHax.current_id).url_rH6MnarmmBvhjdPh, AbstractC3616.m8539(str).toString(), AbstractC3616.m8539(str2).toString(), AbstractC3616.m8533("ts", "ts", true) ? "ts" : "m3u8").m1412();
        C0203 c0203M768 = m768(106L);
        boolean z = c0203M768 != null && c0203M768.m990();
        C0203 c0203M7682 = m768(107L);
        return ᵢʿ.ٴˎ(strM1412, false, z, c0203M7682 != null && c0203M7682.m990());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: יˋ, reason: contains not printable characters */
    public final void m4197(ArrayList arrayList) {
        String string = getContext().getString(R.string._2_res_0x7f130174);
        int i = (4 & 4) | ((~4) & 112);
        C0203 c0203 = new C0203();
        c0203.f1209 = -1L;
        new ArrayList();
        c0203.f1209 = 2L;
        c0203.f1208 = string;
        c0203.f1210 = null;
        c0203.f1212 = null;
        c0203.f1211 = null;
        c0203.f1201 = null;
        c0203.f1207 = 0;
        c0203.f1213 = 524289;
        c0203.f1203 = 524289;
        c0203.f1206 = 1;
        c0203.f1204 = 1;
        c0203.f1202 = i;
        c0203.f1205 = 0;
        arrayList.add(c0203);
        String string2 = getContext().getString(R.string._2_res_0x7f130026);
        C0203 c02032 = new C0203();
        c02032.f1209 = -1L;
        new ArrayList();
        c02032.f1209 = 3L;
        c02032.f1208 = string2;
        c02032.f1210 = null;
        c02032.f1212 = null;
        c02032.f1211 = null;
        c02032.f1201 = null;
        c02032.f1207 = 0;
        c02032.f1213 = 524289;
        c02032.f1203 = 524289;
        c02032.f1206 = 1;
        c02032.f1204 = 1;
        c02032.f1202 = 112;
        c02032.f1205 = 0;
        arrayList.add(c02032);
    }

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final void m4198() {
        ˆﾞ(AbstractC3139.m7706(ⁱⁱ(100L)).length() > 0 && ⁱⁱ(101L).length() > 0 && ⁱⁱ(102L).length() > 0, 2L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m4199(ArrayList arrayList) {
        String string = getContext().getString(R.string._2_res_0x7f130220);
        if ((112 & 1) == 1) {
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }
        C0203 c0203 = new C0203();
        c0203.f1209 = -1L;
        new ArrayList();
        c0203.f1209 = 100L;
        c0203.f1208 = string;
        int i = this.service_id;
        AndyHax.current_id = i;
        c0203.f1210 = AndyHax.GetById(i).name_doQhQ7J9PskxUJv5;
        c0203.f1212 = AndyHax.GetById(this.service_id).name_doQhQ7J9PskxUJv5;
        c0203.f1211 = AndyHax.GetById(this.service_id).name_doQhQ7J9PskxUJv5;
        c0203.f1201 = null;
        c0203.f1207 = 2;
        c0203.f1213 = 0;
        c0203.f1203 = 0;
        c0203.f1206 = 1;
        c0203.f1204 = 1;
        c0203.f1202 = 0;
        c0203.f1205 = 0;
        arrayList.add(c0203);
        String string2 = getContext().getString(R.string._2_res_0x7f130449);
        if ((112 & 1) == 1) {
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }
        C0203 c02032 = new C0203();
        c02032.f1209 = -1L;
        new ArrayList();
        c02032.f1209 = 101L;
        c02032.f1208 = string2;
        c02032.f1210 = null;
        c02032.f1212 = null;
        c02032.f1211 = null;
        c02032.f1201 = null;
        c02032.f1207 = 2;
        c02032.f1213 = 524289;
        c02032.f1203 = 524289;
        c02032.f1206 = 1;
        c02032.f1204 = 1;
        c02032.f1202 = 112;
        c02032.f1205 = 0;
        arrayList.add(c02032);
        String string3 = getContext().getString(R.string._2_res_0x7f130181);
        if ((112 & 1) == 1) {
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }
        C0203 c02033 = new C0203();
        c02033.f1209 = -1L;
        new ArrayList();
        c02033.f1209 = 102L;
        c02033.f1208 = string3;
        c02033.f1210 = null;
        c02033.f1212 = null;
        c02033.f1211 = null;
        c02033.f1201 = null;
        c02033.f1207 = 2;
        c02033.f1213 = 524289;
        c02033.f1203 = 524289;
        c02033.f1206 = 1;
        c02033.f1204 = 144;
        c02033.f1202 = 112;
        c02033.f1205 = 0;
        arrayList.add(c02033);
        C0153 c0153 = new C0153(getContext());
        c0153.f1071 = 106L;
        c0153.m934(R.string._2_res_0x7f1302d7);
        c0153.m930(-1);
        c0153.m932(true);
        arrayList.add(c0153.m933());
        C0153 c01532 = new C0153(getContext());
        c01532.f1071 = 107L;
        c01532.m934(R.string._2_res_0x7f1302d8);
        c01532.m930(-1);
        c01532.m932(true);
        arrayList.add(c01532.m933());
    }
}
