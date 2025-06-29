package p078;

import p180.InterfaceC2499;

/* renamed from: ʿˋ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC1690 implements InterfaceC2499 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("SMB2_SHARE_CAP_DFS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("SMB2_SHARE_CAP_CONTINUOUS_AVAILABILITY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("SMB2_SHARE_CAP_SCALEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("SMB2_SHARE_CAP_CLUSTER"),
    f6584("SMB2_SHARE_CAP_ASYMMETRIC");


    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f6586;

    EnumC1690(String str) {
        this.f6586 = j;
    }

    @Override // p180.InterfaceC2499
    public final long getValue() {
        return this.f6586;
    }
}
