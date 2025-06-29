package p278;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import ar.tvplayer.core.data.api.stalker.VodItem;
import ar.tvplayer.core.data.api.xtreamcodes.SeriesInfo;
import ar.tvplayer.core.data.api.xtreamcodes.VodInfo;
import ar.tvplayer.core.data.api.xtreamcodes.XtreamCodes$Params;
import ar.tvplayer.core.util.LongSummaryPreference;
import com.bumptech.glide.C0290;
import com.bumptech.glide.ComponentCallbacks2C0283;
import com.bumptech.glide.ﹳﹳ;
import com.google.android.gms.internal.play_billing.C0615;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import p013.AbstractC1037;
import p036.C1250;
import p036.C1255;
import p041.C1281;
import p057.C1344;
import p080.AbstractC1702;
import p132.C2077;
import p149.AbstractC2282;
import p149.C2302;
import p176.InterfaceC2490;
import p186.AbstractC2593;
import p252.AbstractC3139;
import p278.AbstractC3362;
import p289.AbstractC3407;
import p317.AbstractC3616;
import p330.InterfaceC3747;
import p334.C3789;
import p335.AbstractC3794;
import p338.InterfaceC3864;
import p366.C4143;
import p366.C4155;
import p383.InterfaceC4462;
import p395.AbstractC4535;
import p397.C4598;
import p397.InterfaceC4599;
import p410.C4681;
import p421.AbstractC4862;
import p435.AbstractC5044;
import p435.C5054;
import p438.C5087;
import ˆٴ.ˎٴ;
import ˉʼ.ﹶˆ;
import ˉﾞ.ᴵᴵ;
import ˊﹶ.ˋˉ;
import ˏʼ.ʽᐧ;
import יˏ.ʻʿ;
import יˏ.ʾˈ;
import יˏ.ʿˊ;
import יˏ.ˉᵎ;
import יˏ.ˊᵔ;
import יˏ.ˋﾞ;
import יˏ.ˎˉ;
import יˏ.יˋ;
import יˏ.ᵎʽ;
import יˏ.ᵔ;
import יˏ.ᵔٴ;
import יˏ.ᵔﹳ;
import יˏ.ⁱʿ;
import יˏ.ﾞˎ;
import יᐧ.ˑʽ;
import יᐧ.ـﹶ;
import ـˈ.ˑי;
import ᴵﹳ.ٴˎ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ـﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3362 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Long f13165;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Long f13166;

    /* renamed from: ˉי, reason: contains not printable characters */
    public static volatile byte[] f13167;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static volatile byte[] f13168;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static volatile byte[] f13169;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static volatile byte[] f13170;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static volatile byte[] f13171;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static ᴵᴵ f13172;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Long f13173;

    /* renamed from: ˑי, reason: contains not printable characters */
    public static volatile byte[] f13174;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile long f13175;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C1255 f13176;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C1250 f13177;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static volatile byte[] f13178;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static volatile byte[] f13179;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Long f13180;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static volatile byte[] f13181;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8180(ˑי r10, String str, String str2, Drawable drawable, int i, int i2) {
        if ((i2 & 4) != 0) {
            drawable = null;
        }
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ᵔٴ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[206] & 255) + 67)) {
            ʾˈ.ﹳﹳ = false;
            int i3 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i3 / (i3 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z = ʾˈ.ـﹶ;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ᵔ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[207] & 255) + 28)) {
            ʾˈ.ﹳﹳ = false;
            int i4 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i4 / (i4 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (f13181 != null && f13181[361] != 123) {
            ʾˈ.ʿʼ = false;
            int i5 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i5 / (i5 - 12);
            AbstractC2593.f10315 = f13181[44403];
            boolean z3 = ʾˈ.ـﹶ;
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) r10.f9034.f9116;
        LongSummaryPreference longSummaryPreference = new LongSummaryPreference(r10.requireContext(), null, 0, 6, null);
        longSummaryPreference.f1570 = false;
        longSummaryPreference.m1192(str);
        longSummaryPreference.mo1175(str2);
        longSummaryPreference.m1201(drawable);
        if (longSummaryPreference.f1540) {
            longSummaryPreference.f1540 = false;
            longSummaryPreference.mo1168();
        }
        longSummaryPreference.m1198(i);
        preferenceScreen.m1205(longSummaryPreference);
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final void m8181(Preference preference, boolean z) {
        if (preference.f1572 != z) {
            preference.f1572 = z;
            preference.mo1189(preference.mo1169());
            preference.mo1168();
        }
        if (Build.VERSION.SDK_INT >= 28 || preference.f1540 == z) {
            return;
        }
        preference.f1540 = z;
        preference.mo1168();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m8182(AbstractC2282 abstractC2282, final String str, final String str2, String str3, Drawable drawable, boolean z, boolean z2, int i) {
        final String str4 = "";
        final String str5 = (i & 4) != 0 ? "" : str3;
        final Drawable drawable2 = (i & 32) != 0 ? null : drawable;
        final boolean z3 = (i & 64) != 0 ? false : z;
        final boolean z4 = (i & 256) != 0 ? false : z2;
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ˉᵎ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[203] & 255) + 29)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z5 = ʾˈ.ـﹶ;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ⁱʿ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[202] & 255) + 64)) {
            ʾˈ.ﹳﹳ = false;
            int i3 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i3 / (i3 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z6 = ʾˈ.ـﹶ;
        }
        if (f13181 != null && f13181[354] != -127) {
            ʾˈ.ʿʼ = false;
            int i4 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i4 / (i4 - 12);
            AbstractC2593.f10315 = f13181[-44958];
            boolean z7 = ʾˈ.ـﹶ;
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) abstractC2282.f9034.f9116;
        final Context contextRequireContext = abstractC2282.requireContext();
        final boolean z8 = true;
        preferenceScreen.m1205(new SwitchPreference(str, str2, str5, str4, str4, drawable2, z3, z8, z4, contextRequireContext) { // from class: ar.tvplayer.core.util.PreferenceUtilsKt$addSwitchPreference$13

            /* renamed from: ʽⁱ, reason: contains not printable characters */
            public final /* synthetic */ boolean f2284;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(contextRequireContext, null);
                this.f2284 = z4;
                this.f1570 = false;
                if (this.f1541) {
                    this.f1541 = false;
                    mo1168();
                }
                m1192(str);
                m1197(str2);
                mo1175(str5);
                this.f1612 = str4;
                if (this.f1608) {
                    mo1168();
                }
                this.f1611 = str4;
                if (!this.f1608) {
                    mo1168();
                }
                m1201(drawable2);
                m1210(z3);
                AbstractC3362.m8181(this, z8);
            }

            @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
            /* renamed from: ᴵʿ */
            public final void mo1166(C2302 c2302) {
                super.mo1166(c2302);
                if (this.f2284) {
                    View viewM6346 = c2302.m6346(R.id.summary);
                    TextView textView = viewM6346 instanceof TextView ? (TextView) viewM6346 : null;
                    if (textView != null) {
                        textView.setMaxLines(1);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            }
        });
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final String m8183(AbstractC3794 abstractC3794) {
        return C2077.f7939.m5835() == 0 ? abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f1302cd) : abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13039a);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final boolean m8184() {
        C2077 c2077 = C2077.f7939;
        return c2077.m5784() == 0 || c2077.m5784() == 1;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static List m8185(Object obj) {
        return Collections.singletonList(obj);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static VodInfo m8186(XtreamCodes$Params xtreamCodes$Params, int i) {
        if (!AbstractC3139.m7731()) {
            return null;
        }
        try {
            m8213();
            return (VodInfo) ٴˎ.ـﹶ(xtreamCodes$Params).ˉי(xtreamCodes$Params.m1414(), xtreamCodes$Params.f2196, xtreamCodes$Params.f2200, "get_vod_info", i).mo10464().f17537;
        } catch (Exception unused) {
            AbstractC3407.f13261.ᴵʼ("XtreamCodes");
            String str = xtreamCodes$Params.f2193;
            ˋˉ.ˑﾞ(new Object[0]);
            return null;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final ˎٴ m8187(Long l, Long l2, Long l3, Long l4, C1255 c1255, C1250 c1250, ᴵᴵ r6) {
        f13165 = l;
        f13173 = l2;
        f13180 = l3;
        f13166 = l4;
        f13176 = c1255;
        f13177 = c1250;
        f13172 = r6;
        return new ˎٴ();
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x034b  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ᴵˎ.ˏˋ m8188(ˉﾞ.ʼᵎ r33, ar.tvplayer.core.data.api.stalker.VodItem r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p278.AbstractC3362.m8188(ˉﾞ.ʼᵎ, ar.tvplayer.core.data.api.stalker.VodItem, java.util.List):ᴵˎ.ˏˋ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ef, code lost:
    
        continue;
     */
    /* renamed from: ˋˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p366.C4165 m8189(p366.C4155... r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p278.AbstractC3362.m8189(ᵔﾞ.ˏᵢ[]):ᵔﾞ.ᵎˏ");
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static Set m8190() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02b7  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ᴵˎ.ˏˋ m8191(ˉﾞ.ʼᵎ r40, ar.tvplayer.core.data.api.xtreamcodes.SeriesInfo r41) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p278.AbstractC3362.m8191(ˉﾞ.ʼᵎ, ar.tvplayer.core.data.api.xtreamcodes.SeriesInfo):ᴵˎ.ˏˋ");
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4681 m8192(InterfaceC3747 interfaceC3747, InterfaceC3864 interfaceC3864) {
        return ᵢʿ.ᴵʿ(new C5087(interfaceC3747, 1, interfaceC3864));
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final String m8193(AbstractC3794 abstractC3794) {
        C2077 c2077 = C2077.f7939;
        int iM5859 = c2077.m5859();
        if (iM5859 == 0) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13039e);
        }
        if (iM5859 == 1) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13039d);
        }
        if (iM5859 == 2) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f1303a0);
        }
        if (iM5859 == 3) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13039b);
        }
        throw new IllegalStateException("Unhandled channelsSorting: " + c2077.m5859());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: ˎᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m8194(p397.InterfaceC4599 r13, p397.C4601 r14, p383.InterfaceC4462 r15) {
        /*
            int r0 = r13.mo7949()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = r14.f17606
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L15
            r5 = 0
            goto L2f
        L15:
            int r5 = r13.mo7944(r0)
            r6 = -1
            if (r5 != r6) goto L21
            int r5 = r13.mo7949()
            goto L2f
        L21:
            if (r5 <= 0) goto L2f
            int r6 = r5 + (-1)
            long r6 = r13.mo7950(r6)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L2f
            int r5 = r5 + (-1)
        L2f:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L5a
            java.util.List r8 = r13.mo7939(r0)
            long r2 = r13.mo7950(r5)
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L5a
            int r6 = r13.mo7949()
            if (r5 >= r6) goto L5a
            long r9 = r14.f17606
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 >= 0) goto L5a
            ⁱᵎ.ʽᐧ r6 = new ⁱᵎ.ʽᐧ
            long r11 = r2 - r9
            r7 = r6
            r7.<init>(r8, r9, r11)
            r15.mo4264(r6)
            r2 = 1
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r3 = r5
        L5c:
            int r6 = r13.mo7949()
            if (r3 >= r6) goto L68
            m8203(r13, r3, r15)
            int r3 = r3 + 1
            goto L5c
        L68:
            boolean r14 = r14.f17605
            if (r14 == 0) goto L91
            if (r2 == 0) goto L70
            int r5 = r5 + (-1)
        L70:
            if (r4 >= r5) goto L78
            m8203(r13, r4, r15)
            int r4 = r4 + 1
            goto L70
        L78:
            if (r2 == 0) goto L91
            ⁱᵎ.ʽᐧ r14 = new ⁱᵎ.ʽᐧ
            java.util.List r7 = r13.mo7939(r0)
            long r8 = r13.mo7950(r5)
            long r2 = r13.mo7950(r5)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.mo4264(r14)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p278.AbstractC3362.m8194(ⁱᵎ.ʿʼ, ⁱᵎ.ˉⁱ, ᵢᵢ.ˑʽ):void");
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static AbstractC5044 m8195() {
        C1281 c1281 = new C1281(2);
        c1281.m4571(ـﹶ.ﹳﹳ);
        c1281.m4571(ـﹶ.ʿʼ);
        c1281.m4571(ـﹶ.ٴˎ);
        c1281.m4571(ـﹶ.ᐧʻ);
        c1281.m4571(ـﹶ.ʽᐧ);
        c1281.m4571(ـﹶ.ˑʽ);
        c1281.m4571(ـﹶ.ˏᵢ);
        c1281.m4571(יᐧ.ʽᐧ.ʽᐧ);
        c1281.m4571(ـﹶ.ﹶˆ);
        c1281.m4571(ˑʽ.ˑʽ);
        return new C5054(c1281).m11214(VodItem.class);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m8196(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValue = ⁱـ.ˑי.ᵎˏ(context, i);
        if (typedValue != null) {
            int i3 = typedValue.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? ﹳﹳ.ˏᴵ(context, i3) : typedValue.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m8197(long j, C4143 c4143, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        C4143 c41432;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((C4155) arrayList.get(i9)).mo9566() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C4155 c4155 = (C4155) arrayList.get(i2);
        C4155 c41552 = (C4155) arrayList.get(i3 - 1);
        if (i8 == c4155.mo9566()) {
            int iIntValue = ((Number) arrayList2.get(i2)).intValue();
            int i10 = i2 + 1;
            C4155 c41553 = (C4155) arrayList.get(i10);
            i4 = i10;
            i5 = iIntValue;
            c4155 = c41553;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c4155.mo9565(i8) == c41552.mo9565(i8)) {
            int iMin = Math.min(c4155.mo9566(), c41552.mo9566());
            int i11 = 0;
            for (int i12 = i8; i12 < iMin && c4155.mo9565(i12) == c41552.mo9565(i12); i12++) {
                i11++;
            }
            long j2 = 4;
            long j3 = (c4143.f16041 / j2) + j + 2 + i11 + 1;
            c4143.m9492(-i11);
            c4143.m9492(i5);
            int i13 = i11 + i8;
            while (i8 < i13) {
                c4143.m9492(c4155.mo9565(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i13 != ((C4155) arrayList.get(i4)).mo9566()) {
                    throw new IllegalStateException("Check failed.");
                }
                c4143.m9492(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                C4143 c41433 = new C4143();
                c4143.m9492(((int) ((c41433.f16041 / j2) + j3)) * (-1));
                m8197(j3, c41433, i13, arrayList, i4, i3, arrayList2);
                c4143.m9507(c41433);
                return;
            }
        }
        int i14 = 1;
        for (int i15 = i4 + 1; i15 < i3; i15++) {
            if (((C4155) arrayList.get(i15 - 1)).mo9565(i8) != ((C4155) arrayList.get(i15)).mo9565(i8)) {
                i14++;
            }
        }
        long j4 = 4;
        long j5 = (c4143.f16041 / j4) + j + 2 + (i14 * 2);
        c4143.m9492(i14);
        c4143.m9492(i5);
        for (int i16 = i4; i16 < i3; i16++) {
            int iMo9565 = ((C4155) arrayList.get(i16)).mo9565(i8);
            if (i16 == i4 || iMo9565 != ((C4155) arrayList.get(i16 - 1)).mo9565(i8)) {
                c4143.m9492(iMo9565 & 255);
            }
        }
        C4143 c41434 = new C4143();
        int i17 = i4;
        while (i17 < i3) {
            byte bMo9565 = ((C4155) arrayList.get(i17)).mo9565(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (bMo9565 != ((C4155) arrayList.get(i19)).mo9565(i8)) {
                        i6 = i19;
                        break;
                    }
                    i19++;
                }
            }
            if (i18 == i6 && i8 + 1 == ((C4155) arrayList.get(i17)).mo9566()) {
                c4143.m9492(((Number) arrayList2.get(i17)).intValue());
                i7 = i6;
                c41432 = c41434;
            } else {
                c4143.m9492(((int) ((c41434.f16041 / j4) + j5)) * (-1));
                i7 = i6;
                c41432 = c41434;
                m8197(j5, c41434, i8 + 1, arrayList, i17, i6, arrayList2);
            }
            c41434 = c41432;
            i17 = i7;
        }
        c4143.m9507(c41434);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m8198(AbstractC2282 abstractC2282, final String str, final String str2, CharSequence charSequence, Drawable drawable, boolean z, boolean z2, int i, int i2) {
        final CharSequence charSequence2 = (i2 & 4) != 0 ? "" : charSequence;
        final Drawable drawable2 = (i2 & 8) != 0 ? null : drawable;
        final boolean z3 = (i2 & 16) != 0 ? true : z;
        final boolean z4 = (i2 & 32) != 0;
        final boolean z5 = (i2 & 64) != 0 ? false : z2;
        final int i3 = (i2 & 128) != 0 ? Integer.MAX_VALUE : i;
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ˊᵔ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[204] & 255) + 89)) {
            ʾˈ.ﹳﹳ = false;
            int i4 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i4 / (i4 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z6 = ʾˈ.ـﹶ;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[202] != 63 || ((Number) ˋﾞ.ـˆ.ʽᐧ(202)).intValue() != (ʽᐧ.ˏʾ[204] & 255) + 34)) {
            ʾˈ.ﹳﹳ = false;
            int i5 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i5 / (i5 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[12726];
            boolean z7 = ʾˈ.ـﹶ;
        }
        if (f13181 != null && f13181[350] != 5) {
            ʾˈ.ʿʼ = false;
            int i6 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i6 / (i6 - 12);
            AbstractC2593.f10315 = f13181[1750];
            boolean z8 = ʾˈ.ـﹶ;
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) abstractC2282.f9034.f9116;
        final Context contextRequireContext = abstractC2282.requireContext();
        preferenceScreen.m1205(new Preference(str, str2, charSequence2, drawable2, z3, z4, i3, z5, contextRequireContext) { // from class: ar.tvplayer.core.util.PreferenceUtilsKt$addPreference$13

            /* renamed from: ʻʻ, reason: contains not printable characters */
            public final /* synthetic */ boolean f2283;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                boolean z9;
                super(contextRequireContext, null);
                this.f2283 = z5;
                boolean z10 = false;
                this.f1570 = false;
                if (this.f1541) {
                    this.f1541 = false;
                    mo1168();
                }
                m1192(str);
                m1197(str2);
                mo1175(charSequence2);
                m1201(drawable2);
                if (this.f1572 != z3) {
                    this.f1572 = z3;
                    mo1189(mo1169());
                    mo1168();
                }
                if (z4) {
                    if (ʽᐧ.ˏʾ == null || (ʽᐧ.ˏʾ[205] == -19 && ((Number) ﾞˎ.ـˆ.ʽᐧ(205)).intValue() == (ʽᐧ.ˏʾ[212] & 255) + 67)) {
                        z9 = true;
                    } else {
                        ʾˈ.ﹳﹳ = false;
                        int i7 = AbstractC2593.f10302;
                        AbstractC2593.f10302 = i7 / (i7 - 8);
                        AbstractC2593.f10302 = ʽᐧ.ˏʾ[-3895];
                        z9 = ʾˈ.ﹳﹳ;
                    }
                    if (z9) {
                        z10 = true;
                    }
                }
                if (this.f1540 != z10) {
                    this.f1540 = z10;
                    mo1168();
                }
                m1198(i3);
            }

            @Override // androidx.preference.Preference
            /* renamed from: ᴵʿ */
            public final void mo1166(C2302 c2302) {
                super.mo1166(c2302);
                if (this.f2283) {
                    View viewM6346 = c2302.m6346(R.id.summary);
                    TextView textView = viewM6346 instanceof TextView ? (TextView) viewM6346 : null;
                    if (textView != null) {
                        textView.setMaxLines(1);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            }
        });
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m8199(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValue = ⁱـ.ˑי.ʿˏ(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = typedValue.resourceId;
        return i2 != 0 ? ﹳﹳ.ˏᴵ(context, i2) : typedValue.data;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final boolean m8200(int i) {
        C2077 c2077 = C2077.f7939;
        if (!c2077.m5794() || c2077.m5798().length() == 0) {
            return false;
        }
        int iM5411 = AbstractC1702.m5411(i);
        if (iM5411 == 0) {
            return c2077.m5782();
        }
        if (iM5411 == 1) {
            return ﹶˆ.ʽᐧ(((Boolean) C2077.f7957.ʿˏ(c2077, C2077.f7994[190])).booleanValue());
        }
        if (iM5411 == 2) {
            return ﹶˆ.ʽᐧ(((Boolean) C2077.f7906.ʿˏ(c2077, C2077.f7994[191])).booleanValue());
        }
        if (iM5411 == 3) {
            return ﹶˆ.ʽᐧ(((Boolean) C2077.f7918.ʿˏ(c2077, C2077.f7994[193])).booleanValue());
        }
        if (iM5411 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ﹶˆ.ʽᐧ(((Boolean) C2077.f8124.ʿˏ(c2077, C2077.f7994[192])).booleanValue());
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static final boolean m8201(boolean z) {
        long millis;
        C2077 c2077 = C2077.f7939;
        int iM5797 = c2077.m5797();
        if (iM5797 == 0) {
            return true;
        }
        InterfaceC2490[] interfaceC2490Arr = C2077.f7994;
        if (ﹶˆ.ʽᐧ(((Boolean) C2077.f7904.ʿˏ(c2077, interfaceC2490Arr[197])).booleanValue()) && !z) {
            return true;
        }
        if (iM5797 == 1 || iM5797 == 2) {
            return ﹶˆ.ʿʼ(((Number) C2077.f8128.ʿˏ(c2077, interfaceC2490Arr[198])).longValue()) == 0;
        }
        if (iM5797 == 3) {
            millis = TimeUnit.MINUTES.toMillis(10L);
        } else if (iM5797 == 4) {
            millis = TimeUnit.MINUTES.toMillis(30L);
        } else if (iM5797 == 5) {
            millis = TimeUnit.HOURS.toMillis(1L);
        } else {
            if (iM5797 != 6) {
                throw new IllegalStateException(ـˈ.ˉᵎ.ˉⁱ("Unhandled dontRequirePinAfterUnlocking: ", iM5797));
            }
            millis = TimeUnit.HOURS.toMillis(2L);
        }
        long j = ﹶˆ.ʿʼ(((Number) C2077.f8128.ʿˏ(c2077, interfaceC2490Arr[198])).longValue());
        return System.currentTimeMillis() - (j <= System.currentTimeMillis() ? j : 0L) > millis;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final byte[] m8202() {
        return f13174;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static void m8203(InterfaceC4599 interfaceC4599, int i, InterfaceC4462 interfaceC4462) {
        long jMo7950 = interfaceC4599.mo7950(i);
        List listMo7939 = interfaceC4599.mo7939(jMo7950);
        if (listMo7939.isEmpty()) {
            return;
        }
        if (i == interfaceC4599.mo7949() - 1) {
            throw new IllegalStateException();
        }
        long jMo79502 = interfaceC4599.mo7950(i + 1) - interfaceC4599.mo7950(i);
        if (jMo79502 > 0) {
            interfaceC4462.mo4264(new C4598(listMo7939, jMo7950, jMo79502));
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8204(ˑי r7, String str, String str2, AbstractC4535 abstractC4535, boolean z, int i) {
        if ((i & 4) != 0) {
            abstractC4535 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ᵔﹳ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[201] & 255) + 83)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ʻʿ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[208] & 255) + 15)) {
            ʾˈ.ﹳﹳ = false;
            int i3 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i3 / (i3 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z3 = ʾˈ.ـﹶ;
        }
        if (f13181 != null && f13181[354] != -127) {
            ʾˈ.ʿʼ = false;
            int i4 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i4 / (i4 - 12);
            AbstractC2593.f10315 = f13181[-44958];
            boolean z4 = ʾˈ.ـﹶ;
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) r7.f9034.f9116;
        EditTextPreference editTextPreference = new EditTextPreference(r7.requireContext(), null);
        if (editTextPreference.f1541) {
            editTextPreference.f1541 = false;
            editTextPreference.mo1168();
        }
        editTextPreference.m1192(str);
        editTextPreference.m1197(str2);
        editTextPreference.f1522 = str2;
        editTextPreference.f1553 = abstractC4535;
        if (ˈˉ.ﹳﹳ.ˆʿ == null) {
            ˈˉ.ﹳﹳ.ˆʿ = new ˈˉ.ﹳﹳ(21);
        }
        editTextPreference.f1576 = ˈˉ.ﹳﹳ.ˆʿ;
        editTextPreference.mo1168();
        m8181(editTextPreference, z);
        preferenceScreen.m1205(editTextPreference);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C1344 m8205(C1344 c1344) {
        c1344.m4682();
        c1344.f5482 = true;
        return c1344.f5481 > 0 ? c1344 : C1344.f5480;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static int m8206(float f, int i, int i2) {
        return AbstractC4862.m10939(AbstractC4862.m10942(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static boolean m8207(int i) {
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC4862.f18368;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i);
            int iGreen = Color.green(i);
            int iBlue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d = iRed / 255.0d;
            double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = iGreen / 255.0d;
            double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = iBlue / 255.0d;
            double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d4 / 100.0d > 0.5d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static ᴵᴵ m8208(String str) throws NumberFormatException {
        if (str == null || !AbstractC3616.m8546(str, '|')) {
            return null;
        }
        int i = 0;
        int i2 = -100;
        int i3 = -100;
        int i4 = -100;
        for (Object obj : AbstractC3616.m8549(str, new String[]{"|"})) {
            int i5 = i + 1;
            if (i < 0) {
                AbstractC1037.m4008();
                throw null;
            }
            String str2 = (String) obj;
            if (i == 0) {
                i2 = Integer.parseInt(str2);
            } else if (i == 1) {
                i3 = Integer.parseInt(str2);
            } else if (i == 2) {
                try {
                    i4 = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
            }
            i = i5;
        }
        if (i2 == -100 || i3 == -100 || i4 == -100) {
            return null;
        }
        return new ᴵᴵ(i2, i3, i4);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final String m8209(AbstractC3794 abstractC3794) {
        C2077 c2077 = C2077.f7939;
        int iM5821 = c2077.m5821();
        if (iM5821 == 0) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13039e);
        }
        if (iM5821 == 1) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13039d);
        }
        throw new IllegalStateException("Unhandled groupsSorting: " + c2077.m5821());
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final String m8210(AbstractC3794 abstractC3794) {
        return C2077.f7939.m5887() == 0 ? abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f1302cd) : abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f13039a);
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static String m8211(C0615 c0615) {
        StringBuilder sb = new StringBuilder(c0615.mo2574());
        for (int i = 0; i < c0615.mo2574(); i++) {
            byte bMo2575 = c0615.mo2575(i);
            if (bMo2575 == 34) {
                sb.append("\\\"");
            } else if (bMo2575 == 39) {
                sb.append("\\'");
            } else if (bMo2575 != 92) {
                switch (bMo2575) {
                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo2575 < 32 || bMo2575 > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo2575 >>> 6) & 3) + 48));
                            sb.append((char) (((bMo2575 >>> 3) & 7) + 48));
                            sb.append((char) ((bMo2575 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo2575);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017d A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:87:0x0132, B:88:0x013e, B:90:0x0144, B:92:0x014e, B:93:0x0159, B:95:0x0162, B:98:0x016e, B:99:0x0171, B:101:0x017d, B:103:0x0185, B:105:0x0199, B:110:0x01af, B:112:0x01b5, B:113:0x01b8, B:115:0x01bc, B:117:0x01c2, B:119:0x01c6, B:120:0x01cb, B:125:0x01e9, B:126:0x01ec, B:128:0x0204, B:131:0x0212, B:132:0x0215, B:137:0x0231, B:138:0x0234, B:140:0x024c, B:145:0x025e, B:147:0x0265, B:142:0x0252, B:130:0x020c, B:108:0x01a7, B:84:0x0122), top: B:218:0x0122, inners: #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0265 A[Catch: Exception -> 0x012e, TRY_LEAVE, TryCatch #0 {Exception -> 0x012e, blocks: (B:87:0x0132, B:88:0x013e, B:90:0x0144, B:92:0x014e, B:93:0x0159, B:95:0x0162, B:98:0x016e, B:99:0x0171, B:101:0x017d, B:103:0x0185, B:105:0x0199, B:110:0x01af, B:112:0x01b5, B:113:0x01b8, B:115:0x01bc, B:117:0x01c2, B:119:0x01c6, B:120:0x01cb, B:125:0x01e9, B:126:0x01ec, B:128:0x0204, B:131:0x0212, B:132:0x0215, B:137:0x0231, B:138:0x0234, B:140:0x024c, B:145:0x025e, B:147:0x0265, B:142:0x0252, B:130:0x020c, B:108:0x01a7, B:84:0x0122), top: B:218:0x0122, inners: #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028a A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0291 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0298 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029f A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a6 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ad A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b4 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02bb A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c2 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c9 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d0 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d7 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e0 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02eb A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f4 A[Catch: Exception -> 0x0320, TryCatch #3 {Exception -> 0x0320, blocks: (B:150:0x026c, B:152:0x0272, B:157:0x0286, B:159:0x028a, B:162:0x0291, B:163:0x0294, B:165:0x0298, B:168:0x029f, B:169:0x02a2, B:171:0x02a6, B:174:0x02ad, B:175:0x02b0, B:177:0x02b4, B:180:0x02bb, B:181:0x02be, B:183:0x02c2, B:186:0x02c9, B:187:0x02cc, B:189:0x02d0, B:192:0x02d7, B:193:0x02da, B:195:0x02e0, B:197:0x02e7, B:199:0x02eb, B:202:0x02f4, B:205:0x02fd, B:207:0x0303, B:209:0x030a, B:156:0x027b), top: B:223:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa A[EDGE_INSN: B:253:0x00fa->B:77:0x00fa BREAK  A[LOOP:3: B:50:0x00a1->B:74:0x00df], EDGE_INSN: B:59:0x00c1->B:77:0x00fa BREAK  A[LOOP:3: B:50:0x00a1->B:74:0x00df]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011b A[Catch: Exception -> 0x0122, TRY_LEAVE, TryCatch #11 {Exception -> 0x0122, blocks: (B:80:0x0100, B:82:0x011b), top: B:238:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144 A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:87:0x0132, B:88:0x013e, B:90:0x0144, B:92:0x014e, B:93:0x0159, B:95:0x0162, B:98:0x016e, B:99:0x0171, B:101:0x017d, B:103:0x0185, B:105:0x0199, B:110:0x01af, B:112:0x01b5, B:113:0x01b8, B:115:0x01bc, B:117:0x01c2, B:119:0x01c6, B:120:0x01cb, B:125:0x01e9, B:126:0x01ec, B:128:0x0204, B:131:0x0212, B:132:0x0215, B:137:0x0231, B:138:0x0234, B:140:0x024c, B:145:0x025e, B:147:0x0265, B:142:0x0252, B:130:0x020c, B:108:0x01a7, B:84:0x0122), top: B:218:0x0122, inners: #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0162 A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:87:0x0132, B:88:0x013e, B:90:0x0144, B:92:0x014e, B:93:0x0159, B:95:0x0162, B:98:0x016e, B:99:0x0171, B:101:0x017d, B:103:0x0185, B:105:0x0199, B:110:0x01af, B:112:0x01b5, B:113:0x01b8, B:115:0x01bc, B:117:0x01c2, B:119:0x01c6, B:120:0x01cb, B:125:0x01e9, B:126:0x01ec, B:128:0x0204, B:131:0x0212, B:132:0x0215, B:137:0x0231, B:138:0x0234, B:140:0x024c, B:145:0x025e, B:147:0x0265, B:142:0x0252, B:130:0x020c, B:108:0x01a7, B:84:0x0122), top: B:218:0x0122, inners: #7, #10 }] */
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p053.C1330 m8212(long r27, java.lang.String r29, boolean r30, boolean r31) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p278.AbstractC3362.m8212(long, java.lang.String, boolean, boolean):ʾʾ.ˏᴵ");
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static void m8213() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - f13175;
        if (0 <= j) {
            long j2 = 1000;
            if (j < j2) {
                Thread.sleep(j2 - j);
                m8213();
                return;
            }
        }
        f13175 = jCurrentTimeMillis;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final String m8214(AbstractC3794 abstractC3794) {
        C2077 c2077 = C2077.f7939;
        int iM5814 = c2077.m5814();
        if (iM5814 == 0) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130175);
        }
        if (iM5814 == 1) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f130460);
        }
        if (iM5814 == 2) {
            return abstractC3794.getString(org.lsposed.hiddenapibypass.library.R.string._2_res_0x7f1302c5);
        }
        throw new IllegalStateException("Unhandled externalPlayerOption: " + c2077.m5814());
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static String m8215(String str) {
        XtreamCodes$Params xtreamCodes$Params = ᵔʼ.ˑʽ.ᵎˏ(str, 0L);
        if (xtreamCodes$Params != null) {
            String str2 = xtreamCodes$Params.f2193 + "/xmltv.php?username=" + xtreamCodes$Params.m1413() + "&password=" + xtreamCodes$Params.m1411();
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m8216(ˑי r5, String str, String str2) {
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ᵎʽ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[204] & 255) + 89)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z = ʾˈ.ـﹶ;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[202] != 63 || ((Number) ʿˊ.ـˆ.ʽᐧ(202)).intValue() != (ʽᐧ.ˏʾ[204] & 255) + 34)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[12726];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (f13181 != null && f13181[356] != 0) {
            ʾˈ.ʿʼ = false;
            int i3 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i3 / (i3 - 12);
            AbstractC2593.f10315 = f13181[0];
            boolean z3 = ʾˈ.ـﹶ;
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) r5.f9034.f9116;
        PreferenceCategory preferenceCategory = new PreferenceCategory(r5.requireContext(), null);
        preferenceCategory.f1570 = false;
        preferenceCategory.m1192(str);
        preferenceCategory.m1197(str2);
        preferenceCategory.m1198(Integer.MAX_VALUE);
        preferenceScreen.m1205(preferenceCategory);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static String m8217(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m8218(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final byte[] m8219() {
        return f13181;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static SeriesInfo m8220(XtreamCodes$Params xtreamCodes$Params, int i) {
        if (!AbstractC3139.m7731()) {
            return null;
        }
        try {
            m8213();
            return (SeriesInfo) ٴˎ.ـﹶ(xtreamCodes$Params).ˏᵢ(xtreamCodes$Params.m1414(), xtreamCodes$Params.f2196, xtreamCodes$Params.f2200, "get_series_info", i).mo10464().f17537;
        } catch (Exception unused) {
            AbstractC3407.f13261.ᴵʼ("XtreamCodes");
            ˋˉ.ˑﾞ(new Object[0]);
            return null;
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final void m8221(AbstractC2282 abstractC2282, boolean z) {
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) ˎˉ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[206] & 255) + 58)) {
            ʾˈ.ﹳﹳ = false;
            int i = AbstractC2593.f10302;
            AbstractC2593.f10302 = i / (i - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z2 = ʾˈ.ـﹶ;
        }
        if (ʽᐧ.ˏʾ != null && (ʽᐧ.ˏʾ[200] != 69 || ((Number) יˋ.ـˆ.ʽᐧ(200)).intValue() != (ʽᐧ.ˏʾ[209] & 255) + 16)) {
            ʾˈ.ﹳﹳ = false;
            int i2 = AbstractC2593.f10302;
            AbstractC2593.f10302 = i2 / (i2 - 8);
            AbstractC2593.f10302 = ʽᐧ.ˏʾ[13800];
            boolean z3 = ʾˈ.ـﹶ;
        }
        if (f13181 != null && f13181[368] != 27) {
            ʾˈ.ʿʼ = false;
            int i3 = AbstractC2593.f10315;
            AbstractC2593.f10315 = i3 / (i3 - 12);
            AbstractC2593.f10315 = f13181[9936];
            boolean z4 = ʾˈ.ـﹶ;
        }
        if (z) {
            int size = ((PreferenceScreen) abstractC2282.f9034.f9116).f1585.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((PreferenceScreen) abstractC2282.f9034.f9116).m1202(i4).f1544) {
                    return;
                }
            }
        }
        int size2 = ((PreferenceScreen) abstractC2282.f9034.f9116).f1585.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((PreferenceScreen) abstractC2282.f9034.f9116).m1202(i5).m1184(z);
        }
    }

    /* renamed from: ٴˎ */
    public void mo1524() {
    }

    /* renamed from: ᴵʼ */
    public void mo1479(Context context, ComponentCallbacks2C0283 componentCallbacks2C0283, C0290 c0290) {
    }
}
