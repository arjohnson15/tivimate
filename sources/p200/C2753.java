package p200;

import java.util.NoSuchElementException;
import p013.AbstractC1036;
import p078.EnumC1689;
import p435.C5040;
import ˆʽ.ᵎˏ;

/* renamed from: ˎٴ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2753 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f10766;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f10767;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f10768;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10769;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10770;

    public /* synthetic */ C2753(int i) {
        this.f10769 = i;
    }

    public String toString() {
        switch (this.f10769) {
            case 1:
                StringBuilder sb = new StringBuilder("NegotiatedProtocol{dialect=");
                sb.append((EnumC1689) this.f10767);
                sb.append(", maxTransactSize=");
                sb.append(this.f10766);
                sb.append(", maxReadSize=");
                sb.append(this.f10768);
                sb.append(", maxWriteSize=");
                return ᵎˏ.ᵎـ(sb, this.f10770, '}');
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m7002() {
        Object[] objArr = (Object[]) this.f10767;
        int length = objArr.length;
        int i = this.f10766;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i3];
        AbstractC1036.m3991(0, i, length, objArr, objArr2);
        AbstractC1036.m3991(i2, 0, this.f10766, (Object[]) this.f10767, objArr2);
        this.f10767 = objArr2;
        this.f10766 = 0;
        this.f10768 = length;
        this.f10770 = i3 - 1;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m7003(int i) {
        if (i <= 0) {
            return;
        }
        if (i > m7006()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = ((Object[]) this.f10767).length;
        int i2 = this.f10766;
        if (i < length - i2) {
            length = i2 + i;
        }
        while (i2 < length) {
            ((Object[]) this.f10767)[i2] = null;
            i2++;
        }
        int i3 = this.f10766;
        int i4 = length - i3;
        int i5 = i - i4;
        this.f10766 = this.f10770 & (i3 + i4);
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                ((Object[]) this.f10767)[i6] = null;
            }
            this.f10766 = i5;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long m7004() {
        int i = this.f10768;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f10766;
        long j = ((long[]) this.f10767)[i2];
        this.f10766 = (i2 + 1) & this.f10770;
        this.f10768 = i - 1;
        return j;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m7005(C5040 c5040) {
        c5040.f19124 = null;
        c5040.f19127 = null;
        c5040.f19121 = null;
        c5040.f19125 = 1;
        int i = this.f10766;
        if (i > 0) {
            int i2 = this.f10770;
            if ((i2 & 1) == 0) {
                this.f10770 = i2 + 1;
                this.f10766 = i - 1;
                this.f10768++;
            }
        }
        c5040.f19127 = (C5040) this.f10767;
        this.f10767 = c5040;
        int i3 = this.f10770;
        int i4 = i3 + 1;
        this.f10770 = i4;
        int i5 = this.f10766;
        if (i5 > 0 && (i4 & 1) == 0) {
            this.f10770 = i3 + 2;
            this.f10766 = i5 - 1;
            this.f10768++;
        }
        int i6 = 4;
        while (true) {
            int i7 = i6 - 1;
            if ((this.f10770 & i7) != i7) {
                return;
            }
            int i8 = this.f10768;
            if (i8 == 0) {
                C5040 c50402 = (C5040) this.f10767;
                C5040 c50403 = c50402.f19127;
                C5040 c50404 = c50403.f19127;
                c50403.f19127 = c50404.f19127;
                this.f10767 = c50403;
                c50403.f19121 = c50404;
                c50403.f19124 = c50402;
                c50403.f19125 = c50402.f19125 + 1;
                c50404.f19127 = c50403;
                c50402.f19127 = c50403;
            } else if (i8 == 1) {
                C5040 c50405 = (C5040) this.f10767;
                C5040 c50406 = c50405.f19127;
                this.f10767 = c50406;
                c50406.f19124 = c50405;
                c50406.f19125 = c50405.f19125 + 1;
                c50405.f19127 = c50406;
                this.f10768 = 0;
            } else if (i8 == 2) {
                this.f10768 = 0;
            }
            i6 *= 2;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int m7006() {
        return (this.f10768 - this.f10766) & this.f10770;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m7007(int i) {
        if (i <= 0) {
            return;
        }
        if (i > m7006()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f10768;
        int i3 = i < i2 ? i2 - i : 0;
        for (int i4 = i3; i4 < i2; i4++) {
            ((Object[]) this.f10767)[i4] = null;
        }
        int i5 = this.f10768;
        int i6 = i5 - i3;
        int i7 = i - i6;
        this.f10768 = i5 - i6;
        if (i7 > 0) {
            int length = ((Object[]) this.f10767).length;
            this.f10768 = length;
            int i8 = length - i7;
            for (int i9 = i8; i9 < length; i9++) {
                ((Object[]) this.f10767)[i9] = null;
            }
            this.f10768 = i8;
        }
    }
}
