package p061;

import android.support.v4.media.session.AbstractC0002;
import android.view.View;
import java.util.Arrays;
import p383.AbstractC4464;
import p438.C5110;

/* renamed from: ʾـ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1440 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5905;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f5906;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f5907;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5908 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Object f5909;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f5910;

    public C1440() {
        m4995();
    }

    public C1440(int i) {
        this.f5905 = i;
        byte[] bArr = new byte[131];
        this.f5909 = bArr;
        bArr[2] = 1;
    }

    public C1440(C5110 c5110) {
        this.f5909 = c5110;
    }

    public String toString() {
        switch (this.f5908) {
            case 0:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.f5905);
                sb.append(", mCoordinate=");
                sb.append(this.f5906);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.f5907);
                sb.append(", mValid=");
                return AbstractC0002.m38(sb, this.f5910, '}');
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4989() {
        this.f5906 = this.f5907 ? ((AbstractC1420) this.f5909).mo4726() : ((AbstractC1420) this.f5909).mo4716();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean m4990(int i) {
        if (!this.f5907) {
            return false;
        }
        this.f5906 -= i;
        this.f5907 = false;
        this.f5910 = true;
        return true;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m4991(int i) {
        AbstractC4464.m10132(!this.f5907);
        boolean z = i == this.f5905;
        this.f5907 = z;
        if (z) {
            this.f5906 = 3;
            this.f5910 = false;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m4992(View view, int i) {
        if (this.f5907) {
            this.f5906 = ((AbstractC1420) this.f5909).m4916() + ((AbstractC1420) this.f5909).mo4725(view);
        } else {
            this.f5906 = ((AbstractC1420) this.f5909).mo4722(view);
        }
        this.f5905 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4993(byte[] bArr, int i, int i2) {
        if (this.f5907) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f5909;
            int length = bArr2.length;
            int i4 = this.f5906;
            if (length < i4 + i3) {
                this.f5909 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f5909, this.f5906, i3);
            this.f5906 += i3;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m4994(int i) {
        this.f5907 |= i > 0;
        this.f5905 += i;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m4995() {
        switch (this.f5908) {
            case 0:
                this.f5905 = -1;
                this.f5906 = Integer.MIN_VALUE;
                this.f5907 = false;
                this.f5910 = false;
                break;
            default:
                this.f5907 = false;
                this.f5910 = false;
                break;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m4996(View view, int i) {
        int iM4916 = ((AbstractC1420) this.f5909).m4916();
        if (iM4916 >= 0) {
            m4992(view, i);
            return;
        }
        this.f5905 = i;
        if (!this.f5907) {
            int iMo4722 = ((AbstractC1420) this.f5909).mo4722(view);
            int iMo4716 = iMo4722 - ((AbstractC1420) this.f5909).mo4716();
            this.f5906 = iMo4722;
            if (iMo4716 > 0) {
                int iMo4726 = (((AbstractC1420) this.f5909).mo4726() - Math.min(0, (((AbstractC1420) this.f5909).mo4726() - iM4916) - ((AbstractC1420) this.f5909).mo4725(view))) - (((AbstractC1420) this.f5909).mo4713(view) + iMo4722);
                if (iMo4726 < 0) {
                    this.f5906 -= Math.min(iMo4716, -iMo4726);
                    return;
                }
                return;
            }
            return;
        }
        int iMo47262 = (((AbstractC1420) this.f5909).mo4726() - iM4916) - ((AbstractC1420) this.f5909).mo4725(view);
        this.f5906 = ((AbstractC1420) this.f5909).mo4726() - iMo47262;
        if (iMo47262 > 0) {
            int iMo4713 = this.f5906 - ((AbstractC1420) this.f5909).mo4713(view);
            int iMo47162 = ((AbstractC1420) this.f5909).mo4716();
            int iMin = iMo4713 - (Math.min(((AbstractC1420) this.f5909).mo4722(view) - iMo47162, 0) + iMo47162);
            if (iMin < 0) {
                this.f5906 = Math.min(iMo47262, -iMin) + this.f5906;
            }
        }
    }
}
