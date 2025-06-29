package p125;

import java.io.EOFException;
import java.rmi.UnmarshalException;
import p352.EnumC4008;
import p456.C5349;
import ˈי.ʾˈ;

/* renamed from: ˈᵎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2016 extends ʾˈ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f7662;

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.rmi.UnmarshalException */
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m5658(C5349 c5349) throws UnmarshalException {
        mo3981(c5349);
        c5349.m12092(EnumC4008.FOUR);
        this.f7662 = c5349.m12101();
        try {
            c5349.m12111();
            throw new UnmarshalException("At least one byte remained after reading the return code. Is this response aligned properly?");
        } catch (EOFException unused) {
        }
    }

    /* renamed from: ﾞˊ */
    public abstract void mo3981(C5349 c5349);
}
