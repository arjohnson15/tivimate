package p393;

import com.bumptech.glide.C0295;
import java.io.File;

/* renamed from: ⁱˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4521 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long[] f17379;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f17380;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final File[] f17381;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f17382;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C0295 f17383;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ C4523 f17384;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final File[] f17385;

    public C4521(C4523 c4523, String str) {
        this.f17384 = c4523;
        this.f17382 = str;
        int i = c4523.f17402;
        this.f17379 = new long[i];
        this.f17381 = new File[i];
        this.f17385 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c4523.f17402; i2++) {
            sb.append(i2);
            File[] fileArr = this.f17381;
            String string = sb.toString();
            File file = c4523.f17399;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.f17385[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m10284() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f17379) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
