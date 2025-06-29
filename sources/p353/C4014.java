package p353;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p080.AbstractC1702;
import ˏᵢ.ᵢٴ;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵔʿ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4014 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public String f15458;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final CharSequence f15460;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4022 f15461;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f15463;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ ᵢٴ f15464;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f15462 = 2;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f15459 = 0;

    public C4014(ᵢٴ r1, ᐧʻ r2, CharSequence charSequence) {
        this.f15464 = r1;
        this.f15461 = (C4022) r2.ˎˑ;
        this.f15463 = r2.ˆʿ;
        this.f15460 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i = this.f15462;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iM5411 = AbstractC1702.m5411(i);
        if (iM5411 == 0) {
            return true;
        }
        if (iM5411 == 2) {
            return false;
        }
        this.f15462 = 4;
        int i2 = this.f15459;
        while (true) {
            int length = this.f15459;
            if (length == -1) {
                this.f15462 = 3;
                string = null;
                break;
            }
            C4017 c4017 = (C4017) this.f15464.ˆʿ;
            CharSequence charSequence = this.f15460;
            int length2 = charSequence.length();
            ـﹶ.ﹶˆ(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c4017.mo9267(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f15459 = -1;
            } else {
                this.f15459 = length + 1;
            }
            int i3 = this.f15459;
            if (i3 == i2) {
                int i4 = i3 + 1;
                this.f15459 = i4;
                if (i4 > charSequence.length()) {
                    this.f15459 = -1;
                }
            } else {
                C4022 c4022 = this.f15461;
                if (i2 < length) {
                    charSequence.charAt(i2);
                    c4022.getClass();
                }
                if (length > i2) {
                    charSequence.charAt(length - 1);
                    c4022.getClass();
                }
                int i5 = this.f15463;
                if (i5 == 1) {
                    length = charSequence.length();
                    this.f15459 = -1;
                    if (length > i2) {
                        charSequence.charAt(length - 1);
                        c4022.getClass();
                    }
                } else {
                    this.f15463 = i5 - 1;
                }
                string = charSequence.subSequence(i2, length).toString();
            }
        }
        this.f15458 = string;
        if (this.f15462 == 3) {
            return false;
        }
        this.f15462 = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15462 = 2;
        String str = this.f15458;
        this.f15458 = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
