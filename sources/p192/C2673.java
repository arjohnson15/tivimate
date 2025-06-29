package p192;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import ˈי.ʾˈ;

/* renamed from: ˎˉ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2673 extends SpannableStringBuilder {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f10568;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Class f10569;

    public C2673(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f10568 = new ArrayList();
        ʾˈ.ʿʼ(cls, "watcherClass cannot be null");
        this.f10569 = cls;
    }

    public C2673(Class cls, C2673 c2673, int i, int i2) {
        super(c2673, i, i2);
        this.f10568 = new ArrayList();
        ʾˈ.ʿʼ(cls, "watcherClass cannot be null");
        this.f10569 = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C2671 c2671M6849;
        if (m6851(obj) && (c2671M6849 = m6849(obj)) != null) {
            obj = c2671M6849;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C2671 c2671M6849;
        if (m6851(obj) && (c2671M6849 = m6849(obj)) != null) {
            obj = c2671M6849;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C2671 c2671M6849;
        if (m6851(obj) && (c2671M6849 = m6849(obj)) != null) {
            obj = c2671M6849;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f10569 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C2671[] c2671Arr = (C2671[]) super.getSpans(i, i2, C2671.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c2671Arr.length);
        for (int i3 = 0; i3 < c2671Arr.length; i3++) {
            objArr[i3] = c2671Arr[i3].f10566;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f10569 == cls) {
            cls = C2671.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C2671 c2671M6849;
        if (m6851(obj)) {
            c2671M6849 = m6849(obj);
            if (c2671M6849 != null) {
                obj = c2671M6849;
            }
        } else {
            c2671M6849 = null;
        }
        super.removeSpan(obj);
        if (c2671M6849 != null) {
            this.f10568.remove(c2671M6849);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m6850();
        super.replace(i, i2, charSequence);
        m6848();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m6850();
        super.replace(i, i2, charSequence, i3, i4);
        m6848();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m6851(obj)) {
            C2671 c2671 = new C2671(obj);
            this.f10568.add(c2671);
            obj = c2671;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C2673(this.f10569, this, i, i2);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6847() {
        m6848();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10568;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2671) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6848() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10568;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2671) arrayList.get(i)).f10565.decrementAndGet();
            i++;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2671 m6849(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10568;
            if (i >= arrayList.size()) {
                return null;
            }
            C2671 c2671 = (C2671) arrayList.get(i);
            if (c2671.f10566 == obj) {
                return c2671;
            }
            i++;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6850() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10568;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2671) arrayList.get(i)).f10565.incrementAndGet();
            i++;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m6851(Object obj) {
        if (obj != null) {
            if (this.f10569 == obj.getClass()) {
                return true;
            }
        }
        return false;
    }
}
