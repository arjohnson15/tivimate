package p359;

import p180.InterfaceC2499;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ᵔי.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC4079 implements InterfaceC2499 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4079[] f15746;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f15747;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4079 EF1;

    static {
        EnumC4079 enumC4079 = new EnumC4079("NTLMSSP_REVISION_W2K3", 0);
        enumC4079.f15747 = 15;
        f15746 = new EnumC4079[]{enumC4079};
    }

    public static EnumC4079 valueOf(String str) {
        return (EnumC4079) Enum.valueOf(EnumC4079.class, str);
    }

    public static EnumC4079[] values() {
        return (EnumC4079[]) f15746.clone();
    }

    @Override // p180.InterfaceC2499
    public final long getValue() {
        return this.f15747;
    }
}
