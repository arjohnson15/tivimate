package p438;

import android.text.TextUtils;
import p166.C2431;
import p383.AbstractC4464;
import ˆʽ.ᵎˏ;

/* renamed from: ﹶﾞ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5099 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2431 f19402;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f19403;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2431 f19404;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f19405;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f19406;

    public C5099(String str, C2431 c2431, C2431 c24312, int i, int i2) {
        AbstractC4464.m10142(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f19405 = str;
        c2431.getClass();
        this.f19402 = c2431;
        c24312.getClass();
        this.f19404 = c24312;
        this.f19406 = i;
        this.f19403 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5099.class != obj.getClass()) {
            return false;
        }
        C5099 c5099 = (C5099) obj;
        return this.f19406 == c5099.f19406 && this.f19403 == c5099.f19403 && this.f19405.equals(c5099.f19405) && this.f19402.equals(c5099.f19402) && this.f19404.equals(c5099.f19404);
    }

    public final int hashCode() {
        return this.f19404.hashCode() + ((this.f19402.hashCode() + ᵎˏ.ˏʾ((((527 + this.f19406) * 31) + this.f19403) * 31, 31, this.f19405)) * 31);
    }
}
