package p070;

import java.io.Serializable;
import p176.InterfaceC2489;

/* renamed from: ʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1555 implements InterfaceC2489, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f6288;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final String f6289;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Class f6290;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f6291;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public transient InterfaceC2489 f6292;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean f6293;

    public AbstractC1555(Object obj, Class cls, String str, String str2, boolean z) {
        this.f6288 = obj;
        this.f6290 = cls;
        this.f6291 = str;
        this.f6289 = str2;
        this.f6293 = z;
    }

    /* renamed from: ٴˎ */
    public abstract InterfaceC2489 mo5147();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final InterfaceC1564 m5150() {
        Class cls = this.f6290;
        if (!this.f6293) {
            return AbstractC1563.m5154(cls);
        }
        AbstractC1563.f6304.getClass();
        return new C1548(cls);
    }
}
