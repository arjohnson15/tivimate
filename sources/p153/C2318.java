package p153;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p112.C1808;

/* renamed from: ˊˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2318 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f9143;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9144;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f9145;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final StringBuilder f9146;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f9147;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f9148;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f9149;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f9150;

    public C2318(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f9147 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9143 = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f9146 = sb;
        this.f9149 = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f9150 = 15;
        this.f9144 = 0;
        this.f9148 = 0;
        this.f9145 = i2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6367() {
        StringBuilder sb = this.f9146;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f9147;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2323 c2323 = (C2323) arrayList.get(size);
                int i = c2323.f9217;
                if (i != length) {
                    return;
                }
                c2323.f9217 = i - 1;
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m6368() {
        return this.f9147.isEmpty() && this.f9143.isEmpty() && this.f9146.length() == 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1808 m6369(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f9143;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m6371());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f9144 + this.f9148;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i != Integer.MIN_VALUE ? i : (this.f9149 != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.f9149 != 2 || i4 <= 0) ? 0 : 2 : 1;
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.f9150;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.f9149 == 1) {
            i6 -= this.f9145 - 1;
        }
        return new C1808(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6370(char c) {
        StringBuilder sb = this.f9146;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final SpannableString m6371() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9146);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f9147;
            if (i >= arrayList.size()) {
                break;
            }
            C2323 c2323 = (C2323) arrayList.get(i);
            boolean z2 = c2323.f9216;
            int i7 = c2323.f9218;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i6 = C2322.f9195[i7];
                }
                z = z3;
            }
            int i8 = c2323.f9217;
            i++;
            if (i8 != (i < arrayList.size() ? ((C2323) arrayList.get(i)).f9217 : length)) {
                if (i2 != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i3 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                    i3 = -1;
                } else if (i3 == -1 && z) {
                    i3 = i8;
                }
                if (i6 != i5) {
                    if (i5 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                    }
                    i5 = i6;
                    i4 = i8;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
        }
        if (i4 != length && i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
