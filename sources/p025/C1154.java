package p025;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.leanback.app.C0120;
import androidx.leanback.widget.C0153;
import androidx.leanback.widget.C0180;
import androidx.leanback.widget.C0203;
import androidx.lifecycle.AbstractC0224;
import ar.tvplayer.core.data.api.xtreamcodes.XtreamCodes$Params;
import com.andyhax.haxsplash.AndyHax;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import org.lsposed.hiddenapibypass.library.R;
import p053.C1330;
import p070.C1561;
import p072.AbstractC1642;
import p080.AbstractC1702;
import p252.AbstractC3139;
import p288.C3395;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p330.InterfaceC3746;
import ˈⁱ.ﹳﹳ;
import ˎˊ.ˏʾ;
import יˏ.ʾˈ;
import ـˈ.ˉᵎ;
import ـˈ.ᴵʿ;
import ٴⁱ.ﹶˆ;
import ᵎﹳ.ـﹶ;
import ᵔʼ.ˑʽ;

/* renamed from: ʼˈ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1154 extends ᴵʿ {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public ـﹶ f4808;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f4809;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f4810;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final Object f4811;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Object f4812;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public String f4813;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f4814;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final Object f4815;

    public C1154() {
        ᵎˏ r2 = new ᵎˏ(this, 0);
        boolean z = AbstractC3139.f12115;
        this.f4809 = ﹳﹳ.ᐧⁱ(3, r2);
        this.f4812 = ﹳﹳ.ᐧⁱ(3, new ᵎˏ(this, 1));
        this.f4811 = ﹳﹳ.ᐧⁱ(3, new ᵎˏ(this, 2));
        this.f4815 = ﹳﹳ.ᐧⁱ(3, new ᵎˏ(this, 3));
        this.f4814 = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public static final void m4180(C1561 c1561, C1154 c1154, int i, int i2) {
        if (i > 0) {
            if (((CharSequence) c1561.f6302).length() > 0) {
                c1561.f6302 = ˉᵎ.ˑי(new StringBuilder(), (String) c1561.f6302, '\n');
            }
            c1561.f6302 = ((String) c1561.f6302) + c1154.getString(i2, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        ﹶˆ r0 = ﹶˆ.ـﹶ;
        this.f4810 = ﹶˆ.ˎˑ(m4184().ᐧⁱ) ? 3 : (!AbstractC3629.m8560(m4184().ᐧⁱ, "xc:{", false) && (m4187() != 0 || ˑʽ.ˎٴ(m4184().ᐧⁱ) == null)) ? 1 : 2;
        super/*androidx.leanback.app.ˑʽ*/.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, ٴˑ.ˑʽ] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m4189();
        ((ـˆ) this.f4812.getValue()).ʽᐧ.m1042(getViewLifecycleOwner(), new ﾞˊ(this, 0));
        ((ˆᵔ) this.f4811.getValue()).ʽᐧ.ʿʼ(getViewLifecycleOwner(), new ﾞˊ(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m4181(C0203 c0203) {
        XtreamCodes$Params xtreamCodes$Params;
        CharSequence charSequence;
        String string;
        long j = c0203.f1209;
        if (j == 101 || j == 102) {
            m4191();
            ArrayList arrayList = new ArrayList();
            m4182(arrayList);
            this.f724 = arrayList;
            C0180 c0180 = this.f726;
            if (c0180 != null) {
                c0180.m973(arrayList);
                return;
            }
            return;
        }
        if (j != 4) {
            super.ʻʻ(c0203);
            return;
        }
        int i = this.f4810;
        if (i == 0) {
            i = 0;
        }
        ?? r5 = this.f4811;
        if (i == 1 && !m4188()) {
            ـﹶ r14 = this.f4808;
            if (r14 != null) {
                ˆᵔ r15 = (ˆᵔ) r5.getValue();
                long jM4187 = m4187();
                String str = m4184().ᐧⁱ;
                boolean z = m4184().ˆʿ;
                boolean z2 = m4184().ˎˑ;
                boolean z3 = m4184().ᐧˋ;
                r15.getClass();
                AbstractC1642.m5294(AbstractC0224.m1023(r15), null, 0, new ᐧˋ(jM4187, str, z, z2, z3, r14, r15, (InterfaceC3746) null), 3);
                this.f4814 = 4;
                m4189();
                return;
            }
            return;
        }
        ـﹶ r142 = this.f4808;
        if (r142 != null) {
            C0203 c0203M768 = m768(100L);
            String string2 = (c0203M768 == null || (charSequence = c0203M768.f1212) == null || (string = charSequence.toString()) == null) ? null : AbstractC3616.m8539(string).toString();
            String str2 = "";
            String str3 = string2 == null ? "" : string2;
            ˆᵔ r152 = (ˆᵔ) r5.getValue();
            String str4 = m4184().ᐧⁱ;
            boolean zM4188 = m4188();
            if ((r142 instanceof C1330) && (xtreamCodes$Params = ˑʽ.ᵎˏ(((C1330) r142).f5407, 0L)) != null) {
                String str5 = xtreamCodes$Params.f2193 + "/xmltv.php?username=" + xtreamCodes$Params.m1413() + "&password=" + xtreamCodes$Params.m1411();
                if (str5 != null) {
                    str2 = str5;
                }
            }
            boolean z4 = m4184().ˎˑ;
            boolean z5 = m4184().ᐧˋ;
            r152.getClass();
            AbstractC1642.m5294(AbstractC0224.m1023(r152), null, 0, new C1152(str3, str4, zM4188, str2, z4, z5, r142, r152, null), 3);
            this.f4814 = 5;
            m4189();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* renamed from: ʽⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4182(java.util.ArrayList r14) {
        /*
            r13 = this;
            long r0 = r13.m4187()
            r2 = 0
            r3 = 0
            r5 = -1
            r7 = 112(0x70, float:1.57E-43)
            r8 = 524289(0x80001, float:7.34685E-40)
            r9 = 1
            r10 = 0
            int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r11 != 0) goto L5e
            int r0 = r13.f4810
            if (r0 != 0) goto L19
            r0 = 0
        L19:
            if (r0 != r9) goto L5e
            boolean r0 = r13.m4188()
            if (r0 == 0) goto L22
            goto L5e
        L22:
            android.content.Context r0 = r13.getContext()
            r1 = 2131951988(0x7f130174, float:1.9540406E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = 4
            int r3 = ~r1
            r3 = r3 & r7
            r1 = r1 & r1
            r1 = r1 | r3
            androidx.leanback.widget.ﾞˊ r3 = new androidx.leanback.widget.ﾞˊ
            r3.<init>()
            r3.f1209 = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11 = 2
            r3.f1209 = r11
            r3.f1208 = r0
            r3.f1210 = r10
            r3.f1212 = r10
            r3.f1211 = r10
            r3.f1201 = r10
            r3.f1207 = r2
            r3.f1213 = r8
            r3.f1203 = r8
            r3.f1206 = r9
            r3.f1204 = r9
            r3.f1202 = r1
            r3.f1205 = r2
            r14.add(r3)
            goto L94
        L5e:
            android.content.Context r0 = r13.getContext()
            r1 = 2131951752(0x7f130088, float:1.9539927E38)
            java.lang.String r0 = r0.getString(r1)
            androidx.leanback.widget.ﾞˊ r1 = new androidx.leanback.widget.ﾞˊ
            r1.<init>()
            r1.f1209 = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3 = 4
            r1.f1209 = r3
            r1.f1208 = r0
            r1.f1210 = r10
            r1.f1212 = r10
            r1.f1211 = r10
            r1.f1201 = r10
            r1.f1207 = r2
            r1.f1213 = r8
            r1.f1203 = r8
            r1.f1206 = r9
            r1.f1204 = r9
            r1.f1202 = r7
            r1.f1205 = r2
            r14.add(r1)
        L94:
            android.content.Context r0 = r13.getContext()
            r1 = 2131951654(0x7f130026, float:1.9539729E38)
            java.lang.String r0 = r0.getString(r1)
            androidx.leanback.widget.ﾞˊ r1 = new androidx.leanback.widget.ﾞˊ
            r1.<init>()
            r1.f1209 = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3 = 3
            r1.f1209 = r3
            r1.f1208 = r0
            r1.f1210 = r10
            r1.f1212 = r10
            r1.f1211 = r10
            r1.f1201 = r10
            r1.f1207 = r2
            r1.f1213 = r8
            r1.f1203 = r8
            r1.f1206 = r9
            r1.f1204 = r9
            r1.f1202 = r7
            r1.f1205 = r2
            r14.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p025.C1154.m4182(java.util.ArrayList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final ᴵﹳ.ﹶˆ m4183() {
        return new ᴵﹳ.ﹶˆ("", "", "", ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f080131));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ˊˆ, reason: contains not printable characters */
    public final ﹳˎ m4184() {
        return (ﹳˎ) this.f4809.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final C0120 m4185() {
        CharSequence charSequence;
        String string;
        C0203 c0203M768 = m768(100L);
        String string2 = (c0203M768 == null || (charSequence = c0203M768.f1212) == null || (string = charSequence.toString()) == null) ? null : AbstractC3616.m8539(string).toString();
        if (string2 == null) {
            string2 = "";
        }
        String str = m4184().ᐧⁱ;
        ˏᴵ r2 = new ˏᴵ();
        r2.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ᐧʻ(str, string2))}));
        return r2;
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public final void m4186(ArrayList arrayList) {
        if (m4187() == 0) {
            m4182(arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public final long m4187() {
        return ((Number) this.f4815.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final boolean m4188() {
        C0203 c0203M768 = m768(102L);
        if (c0203M768 != null) {
            return c0203M768.m990();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final void m4189() {
        long j;
        boolean z;
        long j2;
        m4191();
        boolean z2 = true;
        if (m4187() != 0) {
            ʾˈ(this.f4814 == 2, 4L);
            int i = this.f4814;
            ʾˈ(i == 2 || i == 3, 3L);
        } else if (this.f4814 == 2) {
            int iM757 = m757(100L);
            CharSequence charSequence = ((C0203) this.f721.get(iM757)).f1212;
            if (charSequence == null || charSequence.length() == 0) {
                C0203 c0203 = (C0203) this.f721.get(iM757);
                this.f4808.ـﹶ(m4184().ᐧⁱ);
                c0203.f1212 = AndyHax.GetById(AndyHax.current_id).name_doQhQ7J9PskxUJv5;
            }
            ʾˈ(true, 100L);
            ʾˈ(true, 101L);
            ʾˈ(true, 102L);
        } else {
            ʾˈ(false, 100L);
            ʾˈ(false, 101L);
            ʾˈ(false, 102L);
        }
        if (m4187() == 0) {
            int i2 = this.f4810;
            if (i2 == 0) {
                i2 = 0;
            }
            if (i2 == 1) {
                ˆﾞ(this.f4814 == 2, 2L);
            } else {
                if (this.f4814 == 2) {
                    j = 4;
                    z = true;
                } else {
                    j = 4;
                    z = false;
                }
                ˆﾞ(z, j);
            }
            int i3 = this.f4814;
            if (i3 == 2 || i3 == 3) {
                j2 = 3;
            } else {
                j2 = 3;
                z2 = false;
            }
            ˆﾞ(z2, j2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m4190(ArrayList arrayList) {
        if (m4187() != 0) {
            m4182(arrayList);
            return;
        }
        String string = getContext().getString(R.string._2_res_0x7f13032e);
        if ((112 & 1) == 1) {
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }
        C0203 c0203 = new C0203();
        c0203.f1209 = -1L;
        new ArrayList();
        c0203.f1209 = 100L;
        c0203.f1208 = string;
        c0203.f1210 = null;
        c0203.f1212 = null;
        c0203.f1211 = null;
        c0203.f1201 = null;
        c0203.f1207 = 2;
        c0203.f1213 = 524289;
        c0203.f1203 = 524289;
        c0203.f1206 = 1;
        c0203.f1204 = 1;
        c0203.f1202 = 112;
        c0203.f1205 = 0;
        arrayList.add(c0203);
        int i = this.f4810;
        if (i == 0) {
            i = 0;
        }
        if (i == 1) {
            C0153 c0153 = new C0153(getContext());
            c0153.f1071 = 101L;
            c0153.m934(R.string._2_res_0x7f1303ba);
            c0153.m930(1);
            c0153.m932(true);
            arrayList.add(c0153.m933());
            C0153 c01532 = new C0153(getContext());
            c01532.f1071 = 102L;
            c01532.m934(R.string._2_res_0x7f1303df);
            c01532.m930(1);
            c01532.m932(false);
            arrayList.add(c01532.m933());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final void m4191() {
        TextView textView = (TextView) this.f717.ˆʿ;
        if (textView != null) {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        int iM5411 = AbstractC1702.m5411(this.f4814);
        if (iM5411 == 0) {
            TextView textView2 = (TextView) this.f717.ᐧⁱ;
            if (textView2 != null) {
                textView2.setText(R.string._2_res_0x7f130330);
            }
            ˏ();
            return;
        }
        if (iM5411 == 1) {
            TextView textView3 = (TextView) this.f717.ᐧⁱ;
            if (textView3 != null) {
                textView3.setText(R.string._2_res_0x7f13032f);
            }
            TextView textView4 = (TextView) this.f717.ˆʿ;
            if (textView4 != null) {
                textView4.setText(m4192());
            }
            ʻ();
            return;
        }
        if (iM5411 == 2) {
            String string = this.f4813;
            if (string == null) {
                string = getString(R.string._2_res_0x7f13032d);
            }
            TextView textView5 = (TextView) this.f717.ᐧⁱ;
            if (textView5 != null) {
                textView5.setText(R.string._2_res_0x7f13032c);
            }
            TextView textView6 = (TextView) this.f717.ˆʿ;
            if (textView6 != null) {
                textView6.setText(string);
            }
            ʻ();
            return;
        }
        if (iM5411 != 3 && iM5411 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        TextView textView7 = (TextView) this.f717.ᐧⁱ;
        if (textView7 != null) {
            textView7.setText(R.string._2_res_0x7f13032f);
        }
        TextView textView8 = (TextView) this.f717.ˆʿ;
        if (textView8 != null) {
            textView8.setText(m4192() + "\n\n" + getString(R.string._2_res_0x7f1301b7));
        }
        ˏ();
    }

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final String m4192() {
        C1561 c1561 = new C1561();
        c1561.f6302 = "";
        boolean zM4188 = m4187() == 0 ? m4188() : m4184().ˆʿ;
        m4180(c1561, this, this.f4808.ﹶˆ(zM4188), R.string._2_res_0x7f13026c);
        m4180(c1561, this, this.f4808.ٴˎ(zM4188), R.string._2_res_0x7f130311);
        m4180(c1561, this, this.f4808.ˑʽ(), R.string._2_res_0x7f130385);
        return (String) c1561.f6302;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final Long m4193() {
        return m4187() == 0 ? 100L : null;
    }
}
