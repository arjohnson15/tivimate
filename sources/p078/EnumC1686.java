package p078;

import p180.InterfaceC2499;

/* renamed from: ʿˋ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC1686 implements InterfaceC2499 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("SMB2_FLAGS_SERVER_TO_REDIR"),
    f6561("SMB2_FLAGS_ASYNC_COMMAND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("SMB2_FLAGS_RELATED_OPERATIONS"),
    f6562("SMB2_FLAGS_SIGNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("SMB2_FLAGS_PRIORITY_MASK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF62("SMB2_FLAGS_DFS_OPERATIONS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF73("SMB2_FLAGS_REPLAY_OPERATION");


    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f6564;

    EnumC1686(String str) {
        this.f6564 = j;
    }

    @Override // p180.InterfaceC2499
    public final long getValue() {
        return this.f6564;
    }
}
