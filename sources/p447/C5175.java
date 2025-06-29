package p447;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p080.AbstractC1702;
import p080.C1703;
import p334.C3789;
import p441.AbstractC5133;
import p441.C5138;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞˊ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5175 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f19879;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f19880;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f19882;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C5175 f19884;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5171 f19886;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C1703 f19887;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public HashSet f19883 = null;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f19885 = 0;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f19881 = Integer.MIN_VALUE;

    public C5175(C5171 c5171, int i) {
        this.f19886 = c5171;
        this.f19880 = i;
    }

    public final String toString() {
        return this.f19886.f19811 + ":" + ᐧʻ.ﾞʽ(this.f19880);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m11522(C5175 c5175, int i, int i2, boolean z) {
        if (c5175 == null) {
            m11524();
            return true;
        }
        if (!z && !m11533(c5175)) {
            return false;
        }
        this.f19884 = c5175;
        if (c5175.f19883 == null) {
            c5175.f19883 = new HashSet();
        }
        HashSet hashSet = this.f19884.f19883;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f19885 = i;
        this.f19881 = i2;
        return true;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m11523() {
        C5175 c5175;
        if (this.f19886.f19774 == 8) {
            return 0;
        }
        int i = this.f19881;
        return (i == Integer.MIN_VALUE || (c5175 = this.f19884) == null || c5175.f19886.f19774 != 8) ? this.f19885 : i;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m11524() {
        HashSet hashSet;
        C5175 c5175 = this.f19884;
        if (c5175 != null && (hashSet = c5175.f19883) != null) {
            hashSet.remove(this);
            if (this.f19884.f19883.size() == 0) {
                this.f19884.f19883 = null;
            }
        }
        this.f19883 = null;
        this.f19884 = null;
        this.f19885 = 0;
        this.f19881 = Integer.MIN_VALUE;
        this.f19882 = false;
        this.f19879 = 0;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m11525(int i) {
        this.f19879 = i;
        this.f19882 = true;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m11526() {
        C1703 c1703 = this.f19887;
        if (c1703 == null) {
            this.f19887 = new C1703(1);
        } else {
            c1703.m5414();
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m11527() {
        return this.f19884 != null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11528(int i, ArrayList arrayList, C5138 c5138) {
        HashSet hashSet = this.f19883;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC5133.m11424(((C5175) it.next()).f19886, i, arrayList, c5138);
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11529(C5175 c5175, int i) {
        m11522(c5175, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C5175 m11530() {
        int i = this.f19880;
        int iM5411 = AbstractC1702.m5411(i);
        C5171 c5171 = this.f19886;
        switch (iM5411) {
            case 0:
            case 5:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return null;
            case 1:
                return c5171.f19816;
            case 2:
                return c5171.f19838;
            case 3:
                return c5171.f19788;
            case 4:
                return c5171.f19807;
            default:
                throw new AssertionError(ᐧʻ.ﾞʽ(i));
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m11531() {
        HashSet hashSet = this.f19883;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C5175) it.next()).m11530().m11527()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m11532() {
        if (this.f19882) {
            return this.f19879;
        }
        return 0;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m11533(C5175 c5175) {
        if (c5175 == null) {
            return false;
        }
        int i = this.f19880;
        C5171 c5171 = c5175.f19886;
        int i2 = c5175.f19880;
        if (i2 == i) {
            return i != 6 || (c5171.f19814 && this.f19886.f19814);
        }
        switch (AbstractC1702.m5411(i)) {
            case 0:
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (c5171 instanceof C5180) {
                    return z || i2 == 8;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = i2 == 3 || i2 == 5;
                if (c5171 instanceof C5180) {
                    return z2 || i2 == 9;
                }
                return z2;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(ᐧʻ.ﾞʽ(i));
        }
    }
}
