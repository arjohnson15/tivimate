package p078;

import j$.util.DesugarCollections;
import java.util.EnumSet;
import java.util.Set;
import p180.InterfaceC2499;

/* renamed from: ʿˋ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC1687 implements InterfaceC2499 {
    f6565("FILE_SHARE_READ"),
    f6567("FILE_SHARE_WRITE"),
    f6568("FILE_SHARE_DELETE");


    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final Set f6566 = DesugarCollections.unmodifiableSet(EnumSet.allOf(EnumC1687.class));

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f6570;

    EnumC1687(String str) {
        this.f6570 = j;
    }

    @Override // p180.InterfaceC2499
    public final long getValue() {
        return this.f6570;
    }
}
