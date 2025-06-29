package p317;

import java.util.List;
import java.util.regex.Matcher;

/* renamed from: ᴵ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3615 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f13857;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C3632 f13858;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Matcher f13859;

    public C3615(Matcher matcher, String str) {
        this.f13859 = matcher;
        this.f13857 = str;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List m8511() {
        if (this.f13858 == null) {
            this.f13858 = new C3632(this);
        }
        return this.f13858;
    }
}
