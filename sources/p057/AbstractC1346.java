package p057;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import p378.AbstractC4345;
import p378.C4332;
import p378.C4366;
import ﹳᴵ.ˉי;

/* renamed from: ʾˉ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1346 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5489;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f5490;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f5491;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f5492;

    public AbstractC1346() {
        if (ˉי.ᐧˋ == null) {
            ˉי.ᐧˋ = new ˉי(27);
        }
    }

    public boolean hasNext() {
        return this.f5492 < ((C1347) this.f5491).f5504;
    }

    public void remove() {
        m4688();
        if (this.f5489 == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C1347 c1347 = (C1347) this.f5491;
        c1347.m4695();
        c1347.m4697(this.f5489);
        this.f5489 = -1;
        this.f5490 = c1347.f5497;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4688() {
        if (((C1347) this.f5491).f5497 != this.f5490) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract void mo4689(View view, Object obj);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public abstract boolean mo4690(Object obj, Object obj2);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract Object mo4691(View view);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int m4692(int i) {
        if (i < this.f5490) {
            return ((ByteBuffer) this.f5491).getShort(this.f5489 + i);
        }
        return 0;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m4693() {
        while (true) {
            int i = this.f5492;
            C1347 c1347 = (C1347) this.f5491;
            if (i >= c1347.f5504 || c1347.f5498[i] >= 0) {
                return;
            } else {
                this.f5492 = i + 1;
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m4694(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f5489) {
            mo4689(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f5489) {
            tag = mo4691(view);
        } else {
            tag = view.getTag(this.f5492);
            if (!((Class) this.f5491).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo4690(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM9883 = AbstractC4345.m9883(view);
            C4332 c4332 = accessibilityDelegateM9883 == null ? null : accessibilityDelegateM9883 instanceof C4366 ? ((C4366) accessibilityDelegateM9883).f16868 : new C4332(accessibilityDelegateM9883);
            if (c4332 == null) {
                c4332 = new C4332();
            }
            AbstractC4345.m9884(view, c4332);
            view.setTag(this.f5492, obj);
            AbstractC4345.m9892(view, this.f5490);
        }
    }
}
