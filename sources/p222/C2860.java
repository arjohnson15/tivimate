package p222;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import p430.C5005;
import p430.C5020;
import p430.EnumC4995;

/* renamed from: ˏᴵ.ʻˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2860 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f11118;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f11119;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f11120 = true;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Serializable f11121;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m7178(String... strArr) {
        if (!this.f11120) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f11119 = (String[]) strArr.clone();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m7179(EnumC4995... enumC4995Arr) {
        if (!this.f11120) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC4995Arr.length);
        for (EnumC4995 enumC4995 : enumC4995Arr) {
            arrayList.add(enumC4995.f18898);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m7182((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m7180(C5005... c5005Arr) {
        if (!this.f11120) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c5005Arr.length);
        for (C5005 c5005 : c5005Arr) {
            arrayList.add(c5005.f18982);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m7178((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C5020 m7181() {
        return new C5020(this.f11120, this.f11118, (String[]) this.f11119, (String[]) this.f11121);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m7182(String... strArr) {
        if (!this.f11120) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f11121 = (String[]) strArr.clone();
    }
}
