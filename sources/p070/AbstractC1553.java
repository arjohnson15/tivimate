package p070;

import p024.C1151;
import p176.InterfaceC2489;
import p176.InterfaceC2490;
import ˆʽ.ᵎˏ;

/* renamed from: ʿ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1553 extends AbstractC1555 implements InterfaceC2490 {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean f6285;

    public AbstractC1553(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f6285 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1553) {
            AbstractC1553 abstractC1553 = (AbstractC1553) obj;
            return m5150().equals(abstractC1553.m5150()) && this.f6291.equals(abstractC1553.f6291) && this.f6289.equals(abstractC1553.f6289) && AbstractC1549.m5138(this.f6288, abstractC1553.f6288);
        }
        if (obj instanceof InterfaceC2490) {
            return obj.equals(m5149());
        }
        return false;
    }

    public final int hashCode() {
        return this.f6289.hashCode() + ᵎˏ.ˏʾ(m5150().hashCode() * 31, 31, this.f6291);
    }

    public final String toString() {
        InterfaceC2489 interfaceC2489M5149 = m5149();
        return interfaceC2489M5149 != this ? interfaceC2489M5149.toString() : ᵎˏ.ˎٴ(new StringBuilder("property "), this.f6291, " (Kotlin reflection is not available)");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final InterfaceC2490 m5148() {
        if (this.f6285) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC2489 interfaceC2489M5149 = m5149();
        if (interfaceC2489M5149 != this) {
            return (InterfaceC2490) interfaceC2489M5149;
        }
        throw new C1151("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final InterfaceC2489 m5149() {
        if (this.f6285) {
            return this;
        }
        InterfaceC2489 interfaceC2489 = this.f6292;
        if (interfaceC2489 != null) {
            return interfaceC2489;
        }
        InterfaceC2489 interfaceC2489Mo5147 = mo5147();
        this.f6292 = interfaceC2489Mo5147;
        return interfaceC2489Mo5147;
    }
}
