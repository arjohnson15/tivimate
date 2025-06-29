package p031;

import com.bumptech.glide.ﹳﹳ;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: ʼـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1185 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashSet f4902;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f4903;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashSet f4904;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f4905 = null;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC1197 f4906;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final HashSet f4907;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f4908;

    public C1185(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f4902 = hashSet;
        this.f4904 = new HashSet();
        this.f4908 = 0;
        this.f4903 = 0;
        this.f4907 = new HashSet();
        hashSet.add(C1200.m4252(cls));
        for (Class cls2 : clsArr) {
            ﹳﹳ.ᐧʻ(cls2, "Null interface");
            this.f4902.add(C1200.m4252(cls2));
        }
    }

    public C1185(C1200 c1200, C1200[] c1200Arr) {
        HashSet hashSet = new HashSet();
        this.f4902 = hashSet;
        this.f4904 = new HashSet();
        this.f4908 = 0;
        this.f4903 = 0;
        this.f4907 = new HashSet();
        hashSet.add(c1200);
        for (C1200 c12002 : c1200Arr) {
            ﹳﹳ.ᐧʻ(c12002, "Null interface");
        }
        Collections.addAll(this.f4902, c1200Arr);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1194 m4238() {
        if (this.f4906 != null) {
            return new C1194(this.f4905, new HashSet(this.f4902), new HashSet(this.f4904), this.f4908, this.f4903, this.f4906, this.f4907);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4239() {
        if (!(this.f4908 == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f4908 = 2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4240(C1188 c1188) {
        if (this.f4902.contains(c1188.f4916)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f4904.add(c1188);
    }
}
