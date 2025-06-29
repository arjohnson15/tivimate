package p056;

import java.util.Arrays;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ʾˈ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1333 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1333 f5415 = new C1333(-1, -1, -1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f5416;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f5417;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f5418;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f5419;

    public C1333(int i, int i2, int i3) {
        this.f5418 = i;
        this.f5416 = i2;
        this.f5417 = i3;
        this.f5419 = AbstractC4470.m10190(i3) ? AbstractC4470.m10181(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1333)) {
            return false;
        }
        C1333 c1333 = (C1333) obj;
        return this.f5418 == c1333.f5418 && this.f5416 == c1333.f5416 && this.f5417 == c1333.f5417;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5418), Integer.valueOf(this.f5416), Integer.valueOf(this.f5417)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f5418);
        sb.append(", channelCount=");
        sb.append(this.f5416);
        sb.append(", encoding=");
        return ᵎˏ.ᵎـ(sb, this.f5417, ']');
    }
}
