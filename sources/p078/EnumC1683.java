package p078;

/* renamed from: ʿˋ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC1683 {
    f6540("SMB2_NEGOTIATE"),
    f6543("SMB2_SESSION_SETUP"),
    f6548("SMB2_LOGOFF"),
    f6541("SMB2_TREE_CONNECT"),
    f6551("SMB2_TREE_DISCONNECT"),
    f6553("SMB2_CREATE"),
    f6542("SMB2_CLOSE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("SMB2_FLUSH"),
    f6547("SMB2_READ"),
    f6549("SMB2_WRITE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("SMB2_LOCK"),
    f6554("SMB2_IOCTL"),
    f6539("SMB2_CANCEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("SMB2_ECHO"),
    f6546("SMB2_QUERY_DIRECTORY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("SMB2_CHANGE_NOTIFY"),
    f6545("SMB2_QUERY_INFO"),
    f6552("SMB2_SET_INFO"),
    /* JADX INFO: Fake field, exist only in values array */
    EF198("SMB2_OPLOCK_BREAK");


    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static final EnumC1683[] f6544 = new EnumC1683[19];

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f6555;

    static {
        for (EnumC1683 enumC1683 : values()) {
            f6544[enumC1683.f6555] = enumC1683;
        }
    }

    EnumC1683(String str) {
        this.f6555 = i;
    }
}
