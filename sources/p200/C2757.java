package p200;

import java.util.Arrays;
import p013.AbstractC1036;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2757 implements Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ Object[] f10786;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public /* synthetic */ int f10787;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public /* synthetic */ int[] f10788;

    public C2757() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f10788 = new int[i4];
        this.f10786 = new Object[i4];
    }

    public final String toString() {
        int i = this.f10787;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f10787;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f10788[i3]);
            sb.append('=');
            Object obj = this.f10786[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7028(int i, Object obj) {
        int i2 = this.f10787;
        if (i2 != 0 && i <= this.f10788[i2 - 1]) {
            m7030(i, obj);
            return;
        }
        if (i2 >= this.f10788.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.f10788 = Arrays.copyOf(this.f10788, i6);
            this.f10786 = Arrays.copyOf(this.f10786, i6);
        }
        this.f10788[i2] = i;
        this.f10786[i2] = obj;
        this.f10787 = i2 + 1;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object m7029(int i) {
        Object obj;
        int iM9072 = AbstractC3876.m9072(this.f10787, i, this.f10788);
        if (iM9072 < 0 || (obj = this.f10786[iM9072]) == AbstractC2746.f10740) {
            return null;
        }
        return obj;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m7030(int i, Object obj) {
        int iM9072 = AbstractC3876.m9072(this.f10787, i, this.f10788);
        if (iM9072 >= 0) {
            this.f10786[iM9072] = obj;
            return;
        }
        int i2 = ~iM9072;
        int i3 = this.f10787;
        if (i2 < i3) {
            Object[] objArr = this.f10786;
            if (objArr[i2] == AbstractC2746.f10740) {
                this.f10788[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f10788.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.f10788 = Arrays.copyOf(this.f10788, i7);
            this.f10786 = Arrays.copyOf(this.f10786, i7);
        }
        int i8 = this.f10787;
        if (i8 - i2 != 0) {
            int[] iArr = this.f10788;
            int i9 = i2 + 1;
            AbstractC1036.m4004(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.f10786;
            AbstractC1036.m3991(i9, i2, this.f10787, objArr2, objArr2);
        }
        this.f10788[i2] = i;
        this.f10786[i2] = obj;
        this.f10787++;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2757 clone() {
        C2757 c2757 = (C2757) super.clone();
        c2757.f10788 = (int[]) this.f10788.clone();
        c2757.f10786 = (Object[]) this.f10786.clone();
        return c2757;
    }
}
