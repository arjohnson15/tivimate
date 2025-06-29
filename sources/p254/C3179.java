package p254;

import java.util.Collections;
import p153.C2324;
import p166.AbstractC2435;
import p166.C2401;
import p166.C2417;
import p166.C2431;
import p331.C3761;
import p383.AbstractC4470;

/* renamed from: יי.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3179 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12276;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f12277;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long f12278;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C2401 f12279;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C3761 f12280;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f12281;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12282;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f12283;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f12284;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f12285;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f12286;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f12287;

    public C3179(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C3761 c3761, C2401 c2401) {
        this.f12283 = i;
        this.f12276 = i2;
        this.f12282 = i3;
        this.f12286 = i4;
        this.f12277 = i5;
        this.f12284 = m7846(i5);
        this.f12285 = i6;
        this.f12281 = i7;
        this.f12287 = m7845(i7);
        this.f12278 = j;
        this.f12280 = c3761;
        this.f12279 = c2401;
    }

    public C3179(int i, byte[] bArr) {
        C2324 c2324 = new C2324(bArr.length, bArr);
        c2324.m6407(i * 8);
        this.f12283 = c2324.m6410(16);
        this.f12276 = c2324.m6410(16);
        this.f12282 = c2324.m6410(24);
        this.f12286 = c2324.m6410(24);
        int iM6410 = c2324.m6410(20);
        this.f12277 = iM6410;
        this.f12284 = m7846(iM6410);
        this.f12285 = c2324.m6410(3) + 1;
        int iM64102 = c2324.m6410(5) + 1;
        this.f12281 = iM64102;
        this.f12287 = m7845(iM64102);
        this.f12278 = c2324.m6397(36);
        this.f12280 = null;
        this.f12279 = null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m7845(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m7846(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long m7847() {
        long j = this.f12278;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f12277;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2431 m7848(byte[] bArr, C2401 c2401) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f12286;
        if (i <= 0) {
            i = -1;
        }
        C2401 c24012 = this.f12279;
        if (c24012 != null) {
            c2401 = c24012.m6492(c2401);
        }
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("audio/flac");
        c2417.f9605 = i;
        c2417.f9624 = this.f12285;
        c2417.f9600 = this.f12277;
        c2417.f9618 = AbstractC4470.m10198(this.f12281);
        c2417.f9609 = Collections.singletonList(bArr);
        c2417.f9601 = c2401;
        return new C2431(c2417);
    }
}
