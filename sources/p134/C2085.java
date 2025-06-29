package p134;

import java.util.ArrayList;
import p166.C2431;

/* renamed from: ˉʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2085 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f8212;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f8213;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2431[] f8214;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String f8215;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final String f8216;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f8217;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final long[] f8218;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f8219;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f8220;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final long f8221;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f8222;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f8223;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f8224;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final ArrayList f8225;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f8226;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f8227;

    public C2085(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C2431[] c2431Arr, ArrayList arrayList, long[] jArr, long j2) {
        this.f8215 = str;
        this.f8216 = str2;
        this.f8222 = i;
        this.f8212 = str3;
        this.f8220 = j;
        this.f8226 = str4;
        this.f8213 = i2;
        this.f8223 = i3;
        this.f8224 = i4;
        this.f8219 = i5;
        this.f8227 = str5;
        this.f8214 = c2431Arr;
        this.f8225 = arrayList;
        this.f8218 = jArr;
        this.f8221 = j2;
        this.f8217 = arrayList.size();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long m5918(int i) {
        if (i == this.f8217 - 1) {
            return this.f8221;
        }
        long[] jArr = this.f8218;
        return jArr[i + 1] - jArr[i];
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2085 m5919(C2431[] c2431Arr) {
        long[] jArr = this.f8218;
        return new C2085(this.f8215, this.f8216, this.f8222, this.f8212, this.f8220, this.f8226, this.f8213, this.f8223, this.f8224, this.f8219, this.f8227, c2431Arr, this.f8225, jArr, this.f8221);
    }
}
