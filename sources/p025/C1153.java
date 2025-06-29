package p025;

import android.content.Context;
import androidx.fragment.app.AbstractC0104;
import androidx.leanback.app.C0120;
import androidx.leanback.widget.C0203;
import com.andyhax.haxsplash.AndyHax;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import יˏ.ʾˈ;
import ـˈ.ᴵʿ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ʼˈ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1153 extends ᴵʿ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.leanback.app.ˑʽ, ʼˈ.ﾞᐧ] */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m4176(C0203 c0203) {
        long j = c0203.f1209;
        if (j == 100) {
        }
        AbstractC0104 parentFragmentManager = getParentFragmentManager();
        ?? c1155 = new C1155();
        c1155.service_id = (int) j;
        C0120.m748(parentFragmentManager, c1155);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final ﹶˆ m4177() {
        getString(R.string._2_res_0x7f130331);
        return new ﹶˆ("Service", "", "", ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f08015c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: יˋ, reason: contains not printable characters */
    public final void m4178(ArrayList arrayList) {
        String string = getContext().getString(R.string._2_res_0x7f130034);
        C0203 c0203 = new C0203();
        c0203.f1209 = -1L;
        new ArrayList();
        c0203.f1209 = 1L;
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
        c0203.f1202 = 112;
        c0203.f1205 = 0;
        arrayList.add(c0203);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m4179(ArrayList arrayList) {
        Context context = getContext();
        AndyHax.Go("", context);
        String string = context.getString(R.string._2_res_0x7f13030d);
        C0203 c0203 = new C0203();
        c0203.f1209 = -1L;
        new ArrayList();
        c0203.f1209 = 100L;
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
        c0203.f1202 = 112;
        c0203.f1205 = 0;
        for (int i = 0; i < AndyHax._portals.size(); i++) {
            String str = AndyHax._portals.get(i).name_doQhQ7J9PskxUJv5;
            C0203 c02032 = new C0203();
            c02032.f1209 = -1L;
            new ArrayList();
            c02032.f1209 = r9.id_bClNU2OajLbxJWVW;
            c02032.f1208 = str;
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
    }
}
