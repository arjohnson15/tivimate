package p031;

import com.bumptech.glide.ﹳﹳ;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ʼـ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1194 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Set f4926;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f4927;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Set f4928;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f4929;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC1197 f4930;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Set f4931;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f4932;

    public C1194(String str, Set set, Set set2, int i, int i2, InterfaceC1197 interfaceC1197, Set set3) {
        this.f4929 = str;
        this.f4926 = DesugarCollections.unmodifiableSet(set);
        this.f4928 = DesugarCollections.unmodifiableSet(set2);
        this.f4932 = i;
        this.f4927 = i2;
        this.f4930 = interfaceC1197;
        this.f4931 = DesugarCollections.unmodifiableSet(set3);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C1185 m4245(C1200 c1200) {
        return new C1185(c1200, new C1200[0]);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C1194 m4246(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1200.m4252(cls));
        for (Class cls2 : clsArr) {
            ﹳﹳ.ᐧʻ(cls2, "Null interface");
            hashSet.add(C1200.m4252(cls2));
        }
        return new C1194(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C1196(obj), hashSet3);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1185 m4247(Class cls) {
        return new C1185(cls, new Class[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f4926.toArray()) + ">{" + this.f4932 + ", type=" + this.f4927 + ", deps=" + Arrays.toString(this.f4928.toArray()) + "}";
    }
}
