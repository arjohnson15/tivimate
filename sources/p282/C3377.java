package p282;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.leanback.app.C0120;
import androidx.leanback.widget.C0203;
import ar.tvplayer.tv.LibTvPlayerApplication;
import ar.tvplayer.tv.ProtectedTvPlayerApplication;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.ui.login.ParseLoginBuilder;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.lsposed.hiddenapibypass.library.R;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p013.C1053;
import p015.C1067;
import p071.AbstractC1570;
import p080.AbstractC1702;
import p186.C2586;
import p252.AbstractC3139;
import p286.C3389;
import p288.C3395;
import p338.InterfaceC3865;
import ʼʽ.ᐧʻ;
import ʽᵔ.ʽⁱ;
import ˆʽ.ﾞﾞ;
import ˈⁱ.ﹳﹳ;
import ˎˊ.ˏʾ;
import יˏ.ʾˈ;
import ـˈ.ᴵʿ;
import ـˈ.ᵔˊ;
import ـˏ.ˋˉ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ٴʾ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3377 extends ᴵʿ {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f13208;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public List f13209;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f13210;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public ˉי f13211;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final AbstractC1570 f13212;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public String f13213;

    /* JADX WARN: Multi-variable type inference failed */
    public C3377() {
        ᵔˊ r0 = new ᵔˊ(12, this);
        boolean z = AbstractC3139.f12115;
        this.f13208 = ﹳﹳ.ᐧⁱ(3, r0);
        this.f13213 = "";
        this.f13212 = registerForActivityResult(new C3389(2), new C1067(19, this));
    }

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public static /* synthetic */ void m8230(C3377 c3377, boolean z, int i) throws InterruptedException {
        if ((i & 2) != 0) {
            z = false;
        }
        c3377.m8233(null, z, (i & 4) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) throws InterruptedException {
        ˉי r3;
        super/*androidx.leanback.app.ˑʽ*/.onCreate(bundle);
        if (bundle != null) {
            this.f13211 = bundle.getSerializable("state");
            boolean z = AbstractC3139.f12115;
            this.f13210 = bundle.getInt("is_in_progress") != 0;
            this.f13213 = bundle.getString("error_message");
        }
        if (bundle == null) {
            if (ParseUser.getCurrentUser() == null) {
                r3 = ˉי.ᐧⁱ;
            } else {
                m8230(this, false, 3);
                r3 = ˉי.ˆʿ;
            }
            this.f13211 = r3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(Bundle bundle) {
        super/*androidx.leanback.app.ˑʽ*/.onSaveInstanceState(bundle);
        Serializable serializable = this.f13211;
        if (serializable == null) {
            serializable = null;
        }
        bundle.putSerializable("state", serializable);
        boolean z = this.f13210;
        boolean z2 = AbstractC3139.f12115;
        bundle.putInt("is_in_progress", z ? 1 : 0);
        bundle.putString("error_message", this.f13213);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m8232();
        ((ᵎˏ) this.f13208.getValue()).ʽᐧ.ʿʼ(getViewLifecycleOwner(), new ˋˉ(9, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m8231(C0203 c0203) throws InterruptedException {
        long j = c0203.f1209;
        if (j == 3) {
            super.ʻʻ(c0203);
            return;
        }
        if (j == 102) {
            this.f13210 = true;
            this.f13213 = "";
            ᵎˏ r9 = (ᵎˏ) this.f13208.getValue();
            r9.getClass();
            ParseUser.logOutInBackground(new C1067(20, r9));
            m8232();
            return;
        }
        ˉי r0 = this.f13211;
        if ((r0 == null ? null : r0) == ˉי.ᐧⁱ) {
            this.f13212.mo5158(new ParseLoginBuilder(requireContext()).build());
            return;
        }
        if ((r0 == null ? null : r0) != ˉי.ˎˑ) {
            if (r0 == null) {
                r0 = null;
            }
            if (r0 == ˉי.ᐧˋ) {
                if (this.f13209 != null) {
                    m8235();
                    return;
                } else {
                    m8230(this, true, 5);
                    return;
                }
            }
            return;
        }
        if (!AbstractC3139.m7781()) {
            m8230(this, true, 5);
            return;
        }
        C2586 c2586 = C2586.f10269;
        if (C2586.f10263) {
            this.f13211 = ˉי.ˆᵔ;
            m8232();
            return;
        }
        if (!AbstractC3139.m7731()) {
            ʾˈ.ˋˉ(getContext(), R.string._2_res_0x7f130177);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = AbstractC3139.f12124;
        if (j2 > jCurrentTimeMillis) {
            j2 = 0;
        }
        if (jCurrentTimeMillis - j2 > 1000) {
            AbstractC3139.f12124 = jCurrentTimeMillis;
            C2586 c25862 = C2586.f10269;
            C2586.m6708(true, new ﾞﾞ(3, requireActivity(), c0203.f1209 == 100));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public final void m8232() {
        String string;
        String string2;
        final int i = 1;
        final int i2 = 0;
        ArrayList arrayList = new ArrayList();
        Enum r5 = this.f13211;
        if (r5 == null) {
            r5 = null;
        }
        int iOrdinal = r5.ordinal();
        String str = "?";
        if (iOrdinal == 0) {
            if (AbstractC3139.m7781()) {
                C2586 c2586 = C2586.f10269;
                String str2 = C2586.f10271;
                if (str2.length() == 0) {
                    final ﹶˆ r9 = new ﹶˆ(new WeakReference(this), 1);
                    C2586.m6708(false, new InterfaceC3865() { // from class: ˎʼ.ﹶˆ
                        @Override // p338.InterfaceC3865
                        /* renamed from: ـﹶ */
                        public final Object mo1053() {
                            switch (LibTvPlayerApplication.m1480i(257, (Object) this)) {
                                case 0:
                                    Object objM1488i = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(832));
                                    Object objM1484i = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i, objM1488i);
                                    Object objM1484i2 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i2, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i2, (Object) ProtectedTvPlayerApplication.s("°"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i2, objM1484i);
                                    Object objM1484i3 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i3, 0, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i2, objM1484i3);
                                    break;
                                default:
                                    Object objM1488i2 = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(614));
                                    Object objM1484i4 = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i4, objM1488i2);
                                    Object objM1484i5 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i5, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i5, (Object) ProtectedTvPlayerApplication.s("¯"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i5, objM1484i4);
                                    Object objM1484i6 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i6, 1, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i5, objM1484i6);
                                    break;
                            }
                            return LibTvPlayerApplication.m1484i(184);
                        }
                    });
                    str2 = "?";
                }
                String str3 = C2586.f10267;
                if (str3.length() == 0) {
                    final ﹶˆ r10 = new ﹶˆ(new WeakReference(this), 0);
                    C2586.m6708(false, new InterfaceC3865() { // from class: ˎʼ.ﹶˆ
                        @Override // p338.InterfaceC3865
                        /* renamed from: ـﹶ */
                        public final Object mo1053() {
                            switch (LibTvPlayerApplication.m1480i(257, (Object) this)) {
                                case 0:
                                    Object objM1488i = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(832));
                                    Object objM1484i = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i, objM1488i);
                                    Object objM1484i2 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i2, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i2, (Object) ProtectedTvPlayerApplication.s("°"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i2, objM1484i);
                                    Object objM1484i3 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i3, 0, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i2, objM1484i3);
                                    break;
                                default:
                                    Object objM1488i2 = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(614));
                                    Object objM1484i4 = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i4, objM1488i2);
                                    Object objM1484i5 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i5, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i5, (Object) ProtectedTvPlayerApplication.s("¯"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i5, objM1484i4);
                                    Object objM1484i6 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i6, 1, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i5, objM1484i6);
                                    break;
                            }
                            return LibTvPlayerApplication.m1484i(184);
                        }
                    });
                } else {
                    str = str3;
                }
                string = getString(R.string._2_res_0x7f1301d1, str2, str);
            } else {
                string = getString(R.string._2_res_0x7f1301d2);
            }
            StringBuilder sbM5409 = AbstractC1702.m5409(string, "\n\n");
            sbM5409.append(getString(R.string._2_res_0x7f1301ca));
            string2 = sbM5409.toString();
            String string3 = getContext().getString(R.string._2_res_0x7f13001b);
            C0203 c0203 = new C0203();
            c0203.f1209 = -1L;
            new ArrayList();
            c0203.f1209 = 0L;
            c0203.f1208 = string3;
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
            String string4 = getContext().getString(R.string._2_res_0x7f130026);
            C0203 c02032 = new C0203();
            c02032.f1209 = -1L;
            new ArrayList();
            c02032.f1209 = 3L;
            c02032.f1208 = string4;
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
        } else if (iOrdinal == 1) {
            String string5 = getContext().getString(R.string._2_res_0x7f130026);
            C0203 c02033 = new C0203();
            c02033.f1209 = -1L;
            new ArrayList();
            c02033.f1209 = 3L;
            c02033.f1208 = string5;
            c02033.f1210 = null;
            c02033.f1212 = null;
            c02033.f1211 = null;
            c02033.f1201 = null;
            c02033.f1207 = 0;
            c02033.f1213 = 524289;
            c02033.f1203 = 524289;
            c02033.f1206 = 1;
            c02033.f1204 = 1;
            c02033.f1202 = 112;
            c02033.f1205 = 0;
            arrayList.add(c02033);
            string2 = "";
        } else if (iOrdinal == 2) {
            if (AbstractC3139.m7781()) {
                C2586 c25862 = C2586.f10269;
                String str4 = C2586.f10271;
                if (str4.length() == 0) {
                    final ﹶˆ r92 = new ﹶˆ(new WeakReference(this), 1);
                    C2586.m6708(false, new InterfaceC3865() { // from class: ˎʼ.ﹶˆ
                        @Override // p338.InterfaceC3865
                        /* renamed from: ـﹶ */
                        public final Object mo1053() {
                            switch (LibTvPlayerApplication.m1480i(257, (Object) this)) {
                                case 0:
                                    Object objM1488i = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(832));
                                    Object objM1484i = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i, objM1488i);
                                    Object objM1484i2 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i2, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i2, (Object) ProtectedTvPlayerApplication.s("°"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i2, objM1484i);
                                    Object objM1484i3 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i3, 0, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i2, objM1484i3);
                                    break;
                                default:
                                    Object objM1488i2 = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(614));
                                    Object objM1484i4 = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i4, objM1488i2);
                                    Object objM1484i5 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i5, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i5, (Object) ProtectedTvPlayerApplication.s("¯"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i5, objM1484i4);
                                    Object objM1484i6 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i6, 1, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i5, objM1484i6);
                                    break;
                            }
                            return LibTvPlayerApplication.m1484i(184);
                        }
                    });
                    str4 = "?";
                }
                String str5 = C2586.f10267;
                if (str5.length() == 0) {
                    final ﹶˆ r102 = new ﹶˆ(new WeakReference(this), 0);
                    C2586.m6708(false, new InterfaceC3865() { // from class: ˎʼ.ﹶˆ
                        @Override // p338.InterfaceC3865
                        /* renamed from: ـﹶ */
                        public final Object mo1053() {
                            switch (LibTvPlayerApplication.m1480i(257, (Object) this)) {
                                case 0:
                                    Object objM1488i = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(832));
                                    Object objM1484i = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i, objM1488i);
                                    Object objM1484i2 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i2, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i2, (Object) ProtectedTvPlayerApplication.s("°"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i2, objM1484i);
                                    Object objM1484i3 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i3, 0, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i2, objM1484i3);
                                    break;
                                default:
                                    Object objM1488i2 = LibTvPlayerApplication.m1488i(173, LibTvPlayerApplication.m1484i(614));
                                    Object objM1484i4 = LibTvPlayerApplication.m1484i(7);
                                    LibTvPlayerApplication.m1502i(92, objM1484i4, objM1488i2);
                                    Object objM1484i5 = LibTvPlayerApplication.m1484i(167);
                                    LibTvPlayerApplication.i(150, objM1484i5, 9, false);
                                    LibTvPlayerApplication.m1502i(137, objM1484i5, (Object) ProtectedTvPlayerApplication.s("¯"));
                                    LibTvPlayerApplication.m1502i(171, objM1484i5, objM1484i4);
                                    Object objM1484i6 = LibTvPlayerApplication.m1484i(180);
                                    LibTvPlayerApplication.m1500i(128, objM1484i6, 1, LibTvPlayerApplication.m1488i(103, (Object) this));
                                    LibTvPlayerApplication.m1504i(90, LibTvPlayerApplication.m1484i(152), objM1484i5, objM1484i6);
                                    break;
                            }
                            return LibTvPlayerApplication.m1484i(184);
                        }
                    });
                } else {
                    str = str5;
                }
                string2 = getString(R.string._2_res_0x7f1301d1, str4, str) + "\n\n" + getString(R.string._2_res_0x7f1301cb) + "\n\n" + getString(R.string._2_res_0x7f1301c7) + "\nhttps://play.google.com/store/account/subscriptions";
                getContext();
                String string6 = getString(R.string._2_res_0x7f1301d4, str4);
                C0203 c02034 = new C0203();
                c02034.f1209 = -1L;
                new ArrayList();
                c02034.f1209 = 100L;
                c02034.f1208 = string6;
                c02034.f1210 = null;
                c02034.f1212 = null;
                c02034.f1211 = null;
                c02034.f1201 = null;
                c02034.f1207 = 0;
                c02034.f1213 = 524289;
                c02034.f1203 = 524289;
                c02034.f1206 = 1;
                c02034.f1204 = 1;
                c02034.f1202 = 112;
                c02034.f1205 = 0;
                arrayList.add(c02034);
                getContext();
                String string7 = getString(R.string._2_res_0x7f1301cd, str);
                C0203 c02035 = new C0203();
                c02035.f1209 = -1L;
                new ArrayList();
                c02035.f1209 = 101L;
                c02035.f1208 = string7;
                c02035.f1210 = null;
                c02035.f1212 = null;
                c02035.f1211 = null;
                c02035.f1201 = null;
                c02035.f1207 = 0;
                c02035.f1213 = 524289;
                c02035.f1203 = 524289;
                c02035.f1206 = 1;
                c02035.f1204 = 1;
                c02035.f1202 = 112;
                c02035.f1205 = 0;
                arrayList.add(c02035);
            } else {
                string2 = getString(R.string._2_res_0x7f1301d2) + "\n\n" + getString(R.string._2_res_0x7f1301cc);
                String string8 = getContext().getString(R.string._2_res_0x7f130174);
                C0203 c02036 = new C0203();
                c02036.f1209 = -1L;
                new ArrayList();
                c02036.f1209 = 0L;
                c02036.f1208 = string8;
                c02036.f1210 = null;
                c02036.f1212 = null;
                c02036.f1211 = null;
                c02036.f1201 = null;
                c02036.f1207 = 0;
                c02036.f1213 = 524289;
                c02036.f1203 = 524289;
                c02036.f1206 = 1;
                c02036.f1204 = 1;
                c02036.f1202 = 112;
                c02036.f1205 = 0;
                arrayList.add(c02036);
            }
            String string9 = getContext().getString(R.string._2_res_0x7f130101);
            C0203 c02037 = new C0203();
            c02037.f1209 = -1L;
            new ArrayList();
            c02037.f1209 = 102L;
            c02037.f1208 = string9;
            c02037.f1210 = null;
            c02037.f1212 = null;
            c02037.f1211 = null;
            c02037.f1201 = null;
            c02037.f1207 = 0;
            c02037.f1213 = 524289;
            c02037.f1203 = 524289;
            c02037.f1206 = 1;
            c02037.f1204 = 1;
            c02037.f1202 = 112;
            c02037.f1205 = 0;
            arrayList.add(c02037);
            String string10 = getContext().getString(R.string._2_res_0x7f130026);
            C0203 c02038 = new C0203();
            c02038.f1209 = -1L;
            new ArrayList();
            c02038.f1209 = 3L;
            c02038.f1208 = string10;
            c02038.f1210 = null;
            c02038.f1212 = null;
            c02038.f1211 = null;
            c02038.f1201 = null;
            c02038.f1207 = 0;
            c02038.f1213 = 524289;
            c02038.f1203 = 524289;
            c02038.f1206 = 1;
            c02038.f1204 = 1;
            c02038.f1202 = 112;
            c02038.f1205 = 0;
            arrayList.add(c02038);
        } else if (iOrdinal == 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string._2_res_0x7f1301c9));
            sb.append("\n\n");
            sb.append(getString(R.string._2_res_0x7f13001b));
            sb.append(": ");
            ParseUser currentUser = ParseUser.getCurrentUser();
            sb.append(currentUser != null ? currentUser.getEmail() : null);
            string2 = sb.toString();
            String string11 = getContext().getString(R.string._2_res_0x7f130174);
            C0203 c02039 = new C0203();
            c02039.f1209 = -1L;
            new ArrayList();
            c02039.f1209 = 0L;
            c02039.f1208 = string11;
            c02039.f1210 = null;
            c02039.f1212 = null;
            c02039.f1211 = null;
            c02039.f1201 = null;
            c02039.f1207 = 0;
            c02039.f1213 = 524289;
            c02039.f1203 = 524289;
            c02039.f1206 = 1;
            c02039.f1204 = 1;
            c02039.f1202 = 112;
            c02039.f1205 = 0;
            arrayList.add(c02039);
            String string12 = getContext().getString(R.string._2_res_0x7f130101);
            C0203 c020310 = new C0203();
            c020310.f1209 = -1L;
            new ArrayList();
            c020310.f1209 = 102L;
            c020310.f1208 = string12;
            c020310.f1210 = null;
            c020310.f1212 = null;
            c020310.f1211 = null;
            c020310.f1201 = null;
            c020310.f1207 = 0;
            c020310.f1213 = 524289;
            c020310.f1203 = 524289;
            c020310.f1206 = 1;
            c020310.f1204 = 1;
            c020310.f1202 = 112;
            c020310.f1205 = 0;
            String string13 = getContext().getString(R.string._2_res_0x7f130026);
            C0203 c020311 = new C0203();
            c020311.f1209 = -1L;
            new ArrayList();
            c020311.f1209 = 3L;
            c020311.f1208 = string13;
            c020311.f1210 = null;
            c020311.f1212 = null;
            c020311.f1211 = null;
            c020311.f1201 = null;
            c020311.f1207 = 0;
            c020311.f1213 = 524289;
            c020311.f1203 = 524289;
            c020311.f1206 = 1;
            c020311.f1204 = 1;
            c020311.f1202 = 112;
            c020311.f1205 = 0;
            arrayList.add(c020311);
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = getString(R.string._2_res_0x7f1301d0);
            String string14 = getContext().getString(R.string._2_res_0x7f130026);
            C0203 c020312 = new C0203();
            c020312.f1209 = -1L;
            new ArrayList();
            c020312.f1209 = 3L;
            c020312.f1208 = string14;
            c020312.f1210 = null;
            c020312.f1212 = null;
            c020312.f1211 = null;
            c020312.f1201 = null;
            c020312.f1207 = 0;
            c020312.f1213 = 524289;
            c020312.f1203 = 524289;
            c020312.f1206 = 1;
            c020312.f1204 = 1;
            c020312.f1202 = 112;
            c020312.f1205 = 0;
            arrayList.add(c020312);
        }
        if (this.f13210) {
            StringBuilder sbM54092 = AbstractC1702.m5409(string2, "\n\n");
            sbM54092.append(getString(R.string._2_res_0x7f1301b7));
            string2 = sbM54092.toString();
        } else if (this.f13213.length() > 0) {
            StringBuilder sbM54093 = AbstractC1702.m5409(string2, "\n\n");
            sbM54093.append(this.f13213);
            string2 = sbM54093.toString();
        }
        TextView textView = (TextView) this.f717.ˆʿ;
        if (textView != null) {
            textView.setText(string2);
        }
        TextView textView2 = (TextView) this.f717.ˆʿ;
        if (textView2 != null) {
            textView2.setMaxLines(Integer.MAX_VALUE);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0203) it.next()).m989(!this.f13210);
        }
        this.f718.f1151 = null;
        m765(arrayList);
        if (this.f13210) {
            ˏ();
        } else {
            ʻ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ʽⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8233(com.android.billingclient.api.Purchase r16, boolean r17, boolean r18) throws java.lang.InterruptedException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 0
            r3 = 1
            r0.f13210 = r3
            java.lang.String r4 = ""
            r0.f13213 = r4
            java.lang.Object r5 = r0.f13208
            java.lang.Object r5 = r5.getValue()
            ٴʾ.ᵎˏ r5 = (ٴʾ.ᵎˏ) r5
            boolean r6 = r5.ˑʽ
            if (r6 == 0) goto L19
            goto Lb8
        L19:
            r5.ˑʽ = r3
            ٴˑ.ﹶˆ r6 = ʼʽ.ˉי.ـﹶ
            java.lang.String r6 = "purchaseToken"
            r7 = 0
            if (r1 == 0) goto L2f
            org.json.JSONObject r8 = r1.f2294
            java.lang.String r9 = r8.optString(r6)
            java.lang.String r10 = "token"
            java.lang.String r8 = r8.optString(r10, r9)
            goto L30
        L2f:
            r8 = r7
        L30:
            if (r8 != 0) goto L33
            r8 = r4
        L33:
            java.lang.String r9 = "purchaseTime"
            if (r1 == 0) goto L3e
            org.json.JSONObject r10 = r1.f2294
            long r10 = r10.optLong(r9)
            goto L40
        L3e:
            r10 = 0
        L40:
            java.lang.String r12 = "orderId"
            if (r1 == 0) goto L50
            org.json.JSONObject r13 = r1.f2294
            java.lang.String r13 = r13.optString(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L51
        L50:
            r13 = r7
        L51:
            if (r13 != 0) goto L54
            r13 = r4
        L54:
            if (r1 == 0) goto L61
            java.util.ArrayList r1 = r16.m1522()
            java.lang.Object r1 = p013.AbstractC1041.m4031(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
        L61:
            if (r7 != 0) goto L64
            goto L65
        L64:
            r4 = r7
        L65:
            ٴʾ.ᴵʿ r1 = new ٴʾ.ᴵʿ
            r7 = r17
            r1.<init>(r5, r7)
            java.util.concurrent.CountDownLatch r5 = ʼʽ.ˉי.ʽᐧ
            r5.await()
            ٴˑ.ʿʼ r5 = new ٴˑ.ʿʼ
            r5.<init>(r6, r8)
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            ٴˑ.ʿʼ r7 = new ٴˑ.ʿʼ
            r7.<init>(r9, r6)
            ٴˑ.ʿʼ r6 = new ٴˑ.ʿʼ
            r6.<init>(r12, r13)
            ٴˑ.ʿʼ r8 = new ٴˑ.ʿʼ
            java.lang.String r9 = "productId"
            r8.<init>(r9, r4)
            android.content.Context r4 = ˈʼ.ﹳﹳ.ـﹶ()
            java.lang.String r4 = r4.getPackageName()
            ٴˑ.ʿʼ r9 = new ٴˑ.ʿʼ
            java.lang.String r10 = "packageName"
            r9.<init>(r10, r4)
            r4 = 5
            ٴˑ.ʿʼ[] r4 = new p288.C3395[r4]
            r4[r2] = r5
            r4[r3] = r7
            r3 = 2
            r4[r3] = r6
            r3 = 3
            r4[r3] = r8
            r3 = 4
            r4[r3] = r9
            java.util.Map r3 = p013.AbstractC1035.m3988(r4)
            ʼʽ.ʽᐧ r4 = new ʼʽ.ʽᐧ
            r4.<init>(r1, r2)
            java.lang.String r1 = "getDevices_v3"
            com.parse.ParseCloud.callFunctionInBackground(r1, r3, r4)
        Lb8:
            if (r18 == 0) goto Lbd
            r15.m8232()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p282.C3377.m8233(com.android.billingclient.api.Purchase, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final ﹶˆ m8234() {
        return new ﹶˆ(getString(R.string._2_res_0x7f1301cf), "", "", ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f080147));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public final void m8235() {
        Iterable iterable = this.f13209;
        if (iterable == null) {
            iterable = C1053.f4449;
        }
        Iterable<ᐧʻ> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC1039.m4012(iterable2, 10));
        for (ᐧʻ r2 : iterable2) {
            arrayList.add(new ˏᵢ(r2.ـﹶ, r2.ʽᐧ));
        }
        List listM4018 = AbstractC1041.m4018(arrayList, new ʽⁱ(15));
        ʿʼ r1 = new ʿʼ();
        r1.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ʽᐧ(listM4018))}));
        C0120.m748(getParentFragmentManager(), r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final void m8236(ParseException parseException) {
        if (parseException.getCode() != 209) {
            this.f13213 = getString(R.string._2_res_0x7f1301c5, parseException.getMessage(), Integer.valueOf(parseException.getCode()));
        } else {
            ParseUser.logOut();
            this.f13211 = ˉי.ᐧⁱ;
        }
    }
}
