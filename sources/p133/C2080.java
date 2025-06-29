package p133;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p112.C1812;

/* renamed from: ˉʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2080 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f8167;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f8168;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2080 f8169;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final HashMap f8170;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public ArrayList f8171;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final HashMap f8172;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f8173;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f8174;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8175;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2083 f8176;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String[] f8177;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f8178;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f8179;

    public C2080(String str, String str2, long j, long j2, C2083 c2083, String[] strArr, String str3, String str4, C2080 c2080) {
        this.f8175 = str;
        this.f8167 = str2;
        this.f8179 = str4;
        this.f8176 = c2083;
        this.f8177 = strArr;
        this.f8174 = str2 != null;
        this.f8178 = j;
        this.f8168 = j2;
        str3.getClass();
        this.f8173 = str3;
        this.f8169 = c2080;
        this.f8172 = new HashMap();
        this.f8170 = new HashMap();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static SpannableStringBuilder m5908(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C1812 c1812 = new C1812();
            c1812.f7020 = new SpannableStringBuilder();
            treeMap.put(str, c1812);
        }
        CharSequence charSequence = ((C1812) treeMap.get(str)).f7020;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2080 m5909(String str) {
        return new C2080(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2080 m5910(int i) {
        ArrayList arrayList = this.f8171;
        if (arrayList != null) {
            return (C2080) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5911(long r18, java.util.Map r20, java.util.HashMap r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p133.C2080.m5911(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m5912() {
        ArrayList arrayList = this.f8171;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m5913(long j) {
        long j2 = this.f8168;
        long j3 = this.f8178;
        return (j3 == -9223372036854775807L && j2 == -9223372036854775807L) || (j3 <= j && j2 == -9223372036854775807L) || ((j3 == -9223372036854775807L && j < j2) || (j3 <= j && j < j2));
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m5914(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f8173;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m5913(j) && "div".equals(this.f8175) && (str2 = this.f8179) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m5912(); i++) {
            m5910(i).m5914(j, str, arrayList);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5915(TreeSet treeSet, boolean z) {
        String str = this.f8175;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f8179 != null)) {
            long j = this.f8178;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f8168;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f8171 == null) {
            return;
        }
        for (int i = 0; i < this.f8171.size(); i++) {
            ((C2080) this.f8171.get(i)).m5915(treeSet, z || zEquals);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m5916(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f8172;
        map.clear();
        HashMap map2 = this.f8170;
        map2.clear();
        String str2 = this.f8175;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f8173;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f8174 && z) {
            SpannableStringBuilder spannableStringBuilderM5908 = m5908(str4, treeMap);
            String str5 = this.f8167;
            str5.getClass();
            spannableStringBuilderM5908.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m5908(str4, treeMap).append('\n');
            return;
        }
        if (m5913(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C1812) entry.getValue()).f7020;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < m5912(); i++) {
                m5910(i).m5916(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM59082 = m5908(str4, treeMap);
                int length = spannableStringBuilderM59082.length() - 1;
                while (length >= 0 && spannableStringBuilderM59082.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM59082.charAt(length) != '\n') {
                    spannableStringBuilderM59082.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C1812) entry2.getValue()).f7020;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
