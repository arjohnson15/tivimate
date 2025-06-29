package p034;

import android.text.TextUtils;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p192.C2655;
import p192.InterfaceC2670;
import ـˈ.ˉᵎ;

/* renamed from: ʼᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1228 implements InterfaceC1226, InterfaceC2670 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f5035;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5036;

    public C1228(String str) {
        this.f5036 = 4;
        str.getClass();
        this.f5035 = str;
    }

    public /* synthetic */ C1228(String str, int i) {
        this.f5036 = i;
        this.f5035 = str;
    }

    public String toString() {
        switch (this.f5036) {
            case 1:
                return ˉᵎ.ˑי(new StringBuilder("<"), this.f5035, '>');
            default:
                return super.toString();
        }
    }

    @Override // p034.InterfaceC1226
    /* renamed from: ʽᐧ */
    public void mo4396(InterfaceC1230 interfaceC1230) {
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public String m4414(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        m4417(sb, it);
        return sb.toString();
    }

    @Override // p034.InterfaceC1226
    /* renamed from: ˑʽ */
    public String mo4397() {
        return this.f5035;
    }

    @Override // p192.InterfaceC2670
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object mo4415() {
        return this;
    }

    @Override // p192.InterfaceC2670
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean mo4416(CharSequence charSequence, int i, int i2, C2655 c2655) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f5035)) {
            return true;
        }
        c2655.f10532 = (c2655.f10532 & 3) | 4;
        return false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m4417(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f5035);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
