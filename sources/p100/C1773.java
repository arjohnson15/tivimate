package p100;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import p254.C3159;
import p254.C3164;
import p254.InterfaceC3157;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p353.AbstractC4010;
import p383.AbstractC4470;

/* renamed from: ˆˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1773 implements InterfaceC3165 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final byte[] f6854;

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final int[] f6855 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final byte[] f6856;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final int[] f6857;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final int f6858;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f6860;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f6861;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public InterfaceC3177 f6862;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public InterfaceC3178 f6863;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f6864;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f6865;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f6866;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f6867;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f6869;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f6870;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public InterfaceC3157 f6871;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f6872;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f6859 = 0;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f6868 = new byte[1];

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f6873 = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f6857 = iArr;
        int i = AbstractC4470.f17202;
        Charset charset = AbstractC4010.f15450;
        f6854 = "#!AMR\n".getBytes(charset);
        f6856 = "#!AMR-WB\n".getBytes(charset);
        f6858 = iArr[8];
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        return m5491((C3159) interfaceC3168);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r20, p166.C2430 r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p100.C1773.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m5490(C3159 c3159) throws ParserException {
        boolean z;
        c3159.f12219 = 0;
        byte[] bArr = this.f6868;
        c3159.mo4875(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.m1097("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f6867) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f6857[i] : f6855[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f6867 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.m1097(sb.toString(), null);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        this.f6872 = 0L;
        this.f6860 = 0;
        this.f6869 = 0;
        if (j != 0) {
            InterfaceC3157 interfaceC3157 = this.f6871;
            if (interfaceC3157 instanceof C3164) {
                this.f6864 = (Math.max(0L, j - ((C3164) interfaceC3157).f12233) * 8000000) / r0.f12234;
                return;
            }
        }
        this.f6864 = 0L;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m5491(C3159 c3159) throws EOFException, InterruptedIOException {
        c3159.f12219 = 0;
        byte[] bArr = f6854;
        byte[] bArr2 = new byte[bArr.length];
        c3159.mo4875(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f6867 = false;
            c3159.mo4854(bArr.length);
            return true;
        }
        c3159.f12219 = 0;
        byte[] bArr3 = f6856;
        byte[] bArr4 = new byte[bArr3.length];
        c3159.mo4875(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f6867 = true;
        c3159.mo4854(bArr3.length);
        return true;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f6862 = interfaceC3177;
        this.f6863 = interfaceC3177.mo4851(0, 1);
        interfaceC3177.mo4850();
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
