package p061;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p080.AbstractC1702;
import p378.AbstractC4345;

/* renamed from: ʾـ.ˊˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1375 {

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final List f5606 = Collections.emptyList();

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public RecyclerView f5607;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public WeakReference f5609;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final View f5618;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f5619;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public AbstractC1373 f5620;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f5612 = -1;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f5617 = -1;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f5610 = -1;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f5622 = -1;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f5624 = -1;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public AbstractC1375 f5611 = null;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public AbstractC1375 f5616 = null;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public ArrayList f5625 = null;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public List f5608 = null;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f5615 = 0;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C1429 f5614 = null;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f5623 = false;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f5613 = 0;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f5621 = -1;

    public AbstractC1375(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f5618 = view;
    }

    public final String toString() {
        StringBuilder sbM5409 = AbstractC1702.m5409(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM5409.append(Integer.toHexString(hashCode()));
        sbM5409.append(" position=");
        sbM5409.append(this.f5612);
        sbM5409.append(" id=");
        sbM5409.append(this.f5610);
        sbM5409.append(", oldPos=");
        sbM5409.append(this.f5617);
        sbM5409.append(", pLpos:");
        sbM5409.append(this.f5624);
        StringBuilder sb = new StringBuilder(sbM5409.toString());
        if (m4769()) {
            sb.append(" scrap ");
            sb.append(this.f5623 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m4784()) {
            sb.append(" invalid");
        }
        if (!m4774()) {
            sb.append(" unbound");
        }
        if ((this.f5619 & 2) != 0) {
            sb.append(" update");
        }
        if (m4772()) {
            sb.append(" removed");
        }
        if (m4771()) {
            sb.append(" ignored");
        }
        if (m4770()) {
            sb.append(" tmpDetached");
        }
        if (!m4768()) {
            sb.append(" not recyclable(" + this.f5615 + ")");
        }
        if ((this.f5619 & 512) != 0 || m4784()) {
            sb.append(" undefined adapter position");
        }
        if (this.f5618.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m4766() {
        RecyclerView recyclerView = this.f5607;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m1308(this);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final List m4767() {
        ArrayList arrayList;
        return ((this.f5619 & 1024) != 0 || (arrayList = this.f5625) == null || arrayList.size() == 0) ? f5606 : this.f5608;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m4768() {
        if ((this.f5619 & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            if (!this.f5618.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean m4769() {
        return this.f5614 != null;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m4770() {
        return (this.f5619 & 256) != 0;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final boolean m4771() {
        return (this.f5619 & 128) != 0;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m4772() {
        return (this.f5619 & 8) != 0;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m4773(int i, boolean z) {
        if (this.f5617 == -1) {
            this.f5617 = this.f5612;
        }
        if (this.f5624 == -1) {
            this.f5624 = this.f5612;
        }
        if (z) {
            this.f5624 += i;
        }
        this.f5612 += i;
        View view = this.f5618;
        if (view.getLayoutParams() != null) {
            ((C1398) view.getLayoutParams()).f5701 = true;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m4774() {
        return (this.f5619 & 1) != 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m4775() {
        RecyclerView recyclerView;
        AbstractC1373 adapter;
        int iM1308;
        if (this.f5620 == null || (recyclerView = this.f5607) == null || (adapter = recyclerView.getAdapter()) == null || (iM1308 = this.f5607.m1308(this)) == -1 || this.f5620 != adapter) {
            return -1;
        }
        return iM1308;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m4776() {
        if (RecyclerView.f1643 && m4770()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f5619 = 0;
        this.f5612 = -1;
        this.f5617 = -1;
        this.f5610 = -1L;
        this.f5624 = -1;
        this.f5615 = 0;
        this.f5611 = null;
        this.f5616 = null;
        ArrayList arrayList = this.f5625;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5619 &= -1025;
        this.f5613 = 0;
        this.f5621 = -1;
        RecyclerView.m1272(this);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4777(int i) {
        this.f5619 = i | this.f5619;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m4778(int i) {
        return (i & this.f5619) != 0;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m4779() {
        View view = this.f5618;
        return (view.getParent() == null || view.getParent() == this.f5607) ? false : true;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean m4780() {
        return (this.f5619 & 2) != 0;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean m4781() {
        return (this.f5619 & 32) != 0;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m4782(boolean z) {
        int i = this.f5615;
        int i2 = z ? i - 1 : i + 1;
        this.f5615 = i2;
        if (i2 < 0) {
            this.f5615 = 0;
            if (RecyclerView.f1643) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
        } else if (!z && i2 == 1) {
            this.f5619 |= 16;
        } else if (z && i2 == 0) {
            this.f5619 &= -17;
        }
        if (RecyclerView.f1644) {
            String str2 = "setIsRecyclable val:" + z + ":" + this;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m4783() {
        int i = this.f5624;
        return i == -1 ? this.f5612 : i;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m4784() {
        return (this.f5619 & 4) != 0;
    }
}
