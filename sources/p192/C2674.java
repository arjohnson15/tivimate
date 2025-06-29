package p192;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import ᵔʼ.ˑʽ;

/* renamed from: ˎˉ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2674 implements Spannable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Spannable f10570;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f10571 = false;

    public C2674(Spannable spannable) {
        this.f10570 = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f10570.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return IntStream.VivifiedWrapper.convert(this.f10570.chars());
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f10570.chars()));
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return IntStream.VivifiedWrapper.convert(this.f10570.codePoints());
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f10570.codePoints()));
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f10570.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f10570.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f10570.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f10570.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f10570.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f10570.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m6852();
        this.f10570.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m6852();
        this.f10570.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f10570.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f10570.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6852() {
        Spannable spannable = this.f10570;
        if (!this.f10571) {
            if ((Build.VERSION.SDK_INT < 28 ? new ˑʽ() : new C2666()).יʻ(spannable)) {
                this.f10570 = new SpannableString(spannable);
            }
        }
        this.f10571 = true;
    }
}
