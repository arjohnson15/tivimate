package androidx.leanback.widget;

import p061.C1423;

/* renamed from: androidx.leanback.widget.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0154 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ʾי.ˑʽ f1078;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f1079;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C1423[] f1080;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f1081;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f1085;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object[] f1082 = new Object[1];

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f1083 = -1;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f1084 = -1;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f1086 = -1;

    /* renamed from: ʽᐧ */
    public abstract boolean mo912(int i, boolean z);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void mo936(int i, int i2, C1423 c1423) {
    }

    /* renamed from: ˉי */
    public abstract C1423[] mo914(int i, int i2);

    /* renamed from: ˉⁱ */
    public void mo915(int i) {
        int i2;
        if (i >= 0 && (i2 = this.f1084) >= 0) {
            if (i2 >= i) {
                this.f1084 = i - 1;
            }
            if (this.f1084 < this.f1083) {
                this.f1084 = -1;
                this.f1083 = -1;
            }
            if (this.f1083 < 0) {
                this.f1086 = i;
            }
        }
    }

    /* renamed from: ˋⁱ */
    public abstract boolean mo917(int i, boolean z);

    /* renamed from: ˏʾ */
    public abstract ˉⁱ mo919(int i);

    /* renamed from: ˏᵢ */
    public abstract int mo921(int i, boolean z, int[] iArr);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m937(int i) {
        if (this.f1084 < 0) {
            return false;
        }
        if (this.f1081) {
            if (m942(true, null) > i + this.f1085) {
                return false;
            }
        } else if (m939(false, null) < i - this.f1085) {
            return false;
        }
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m938() {
        return mo912(this.f1081 ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    /* renamed from: ٴˎ */
    public abstract int mo924(int i, boolean z, int[] iArr);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m939(boolean z, int[] iArr) {
        return mo924(this.f1081 ? this.f1083 : this.f1084, z, iArr);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m940(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f1079 == i) {
            return;
        }
        this.f1079 = i;
        this.f1080 = new C1423[i];
        for (int i2 = 0; i2 < this.f1079; i2++) {
            this.f1080[i2] = new C1423();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m941(int i) {
        if (this.f1084 < 0) {
            return false;
        }
        if (this.f1081) {
            if (m939(false, null) < i - this.f1085) {
                return false;
            }
        } else if (m942(true, null) > i + this.f1085) {
            return false;
        }
        return true;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int m942(boolean z, int[] iArr) {
        return mo921(this.f1081 ? this.f1084 : this.f1083, z, iArr);
    }
}
