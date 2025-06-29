package p078;

import p180.InterfaceC2499;

/* renamed from: ʿˋ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC1688 implements InterfaceC2499 {
    f6571("SMB2_GLOBAL_CAP_DFS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("SMB2_GLOBAL_CAP_LEASING"),
    f6572("SMB2_GLOBAL_CAP_LARGE_MTU"),
    /* JADX INFO: Fake field, exist only in values array */
    EF41("SMB2_GLOBAL_CAP_MULTI_CHANNEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("SMB2_GLOBAL_CAP_PERSISTENT_HANDLES"),
    /* JADX INFO: Fake field, exist only in values array */
    EF61("SMB2_GLOBAL_CAP_DIRECTORY_LEASING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF71("SMB2_GLOBAL_CAP_ENCRYPTION");


    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f6574;

    EnumC1688(String str) {
        this.f6574 = j;
    }

    @Override // p180.InterfaceC2499
    public final long getValue() {
        return this.f6574;
    }
}
