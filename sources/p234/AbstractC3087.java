package p234;

import android.graphics.Color;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ˑˏ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3087 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Map f11913;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Map f11915;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Pattern f11914 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Pattern f11912 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f11913 = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f11915 = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m7582(java.util.List r8, java.lang.String r9, p234.C3084 r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L78
            java.lang.Object r3 = r8.get(r2)
            ˑˏ.ˑʽ r3 = (p234.C3082) r3
            java.lang.String r4 = r10.f11905
            java.lang.String r5 = r3.f11895
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f11885
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.f11893
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f11900
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6b
        L3a:
            java.lang.String r5 = r3.f11895
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = p234.C3082.m7580(r1, r6, r5, r9)
            java.lang.String r6 = r3.f11885
            r7 = 2
            int r4 = p234.C3082.m7580(r5, r7, r6, r4)
            java.lang.String r5 = r3.f11900
            java.lang.String r6 = r10.f11904
            r7 = 4
            int r4 = p234.C3082.m7580(r4, r7, r5, r6)
            r5 = -1
            if (r4 == r5) goto L6a
            java.util.Set r5 = r3.f11893
            java.util.Set r6 = r10.f11906
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L6a
        L60:
            java.util.Set r5 = r3.f11893
            int r5 = r5.size()
            int r5 = r5 * 4
            int r4 = r4 + r5
            goto L6b
        L6a:
            r4 = 0
        L6b:
            if (r4 <= 0) goto L75
            ˑˏ.ᐧʻ r5 = new ˑˏ.ᐧʻ
            r5.<init>(r4, r3)
            r0.add(r5)
        L75:
            int r2 = r2 + 1
            goto L7
        L78:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p234.AbstractC3087.m7582(java.util.List, java.lang.String, ˑˏ.ٴˎ):java.util.ArrayList");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7583(java.lang.String r18, p234.C3081 r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p234.AbstractC3087.m7583(java.lang.String, ˑˏ.ˏᵢ):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m7584(List list, String str, C3084 c3084) {
        ArrayList arrayListM7582 = m7582(list, str, c3084);
        for (int i = 0; i < arrayListM7582.size(); i++) {
            int i2 = ((C3085) arrayListM7582.get(i)).f11907.f11894;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7585(java.lang.String r18, p234.C3084 r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p234.AbstractC3087.m7585(java.lang.String, ˑˏ.ٴˎ, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString m7586(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p234.AbstractC3087.m7586(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m7587(String str, C3081 c3081) {
        String strSubstring;
        int i = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    AbstractC4464.m10144("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c3081.f11882 = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c3081.f11875 = AbstractC3080.m7575(str);
            c3081.f11881 = 0;
        } else {
            c3081.f11875 = Integer.parseInt(str);
            c3081.f11881 = 1;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C3086 m7588(String str, Matcher matcher, C4457 c4457, ArrayList arrayList) {
        C3081 c3081 = new C3081();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c3081.f11880 = AbstractC3080.m7576(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c3081.f11874 = AbstractC3080.m7576(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m7583(strGroup3, c3081);
            StringBuilder sb = new StringBuilder();
            c4457.getClass();
            String strM10109 = c4457.m10109(AbstractC4010.f15450);
            while (!TextUtils.isEmpty(strM10109)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM10109.trim());
                strM10109 = c4457.m10109(AbstractC4010.f15450);
            }
            c3081.f11879 = m7586(str, sb.toString(), arrayList);
            return new C3086(c3081.m7579().m5556(), c3081.f11880, c3081.f11874);
        } catch (NumberFormatException unused) {
            AbstractC4464.m10144("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }
}
