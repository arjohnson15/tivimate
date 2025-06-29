package p012;

import java.util.HashMap;

/* renamed from: ʻˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC1031 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NetrConnectionEnum"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NetrFileEnum"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("NetrFileGetInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("NetrFileClose"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("NetrSessionEnum"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("NetrSessionDel"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NetrShareAdd"),
    f4429("NetrShareEnum"),
    /* JADX INFO: Fake field, exist only in values array */
    EF88("NetrShareEnumSticky"),
    /* JADX INFO: Fake field, exist only in values array */
    EF97("NetrShareGetInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    EF106("NetrShareSetInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    EF115("NetrShareDel"),
    /* JADX INFO: Fake field, exist only in values array */
    EF124("NetrShareDelSticky"),
    /* JADX INFO: Fake field, exist only in values array */
    EF137("NetrShareDelStart"),
    /* JADX INFO: Fake field, exist only in values array */
    EF150("NetrShareDelCommit"),
    /* JADX INFO: Fake field, exist only in values array */
    EF163("NetrShareCheck"),
    /* JADX INFO: Fake field, exist only in values array */
    EF176("NetrServerGetInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    EF189("NetrServerSetInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    EF202("NetrServerDiskEnum"),
    /* JADX INFO: Fake field, exist only in values array */
    EF215("NetrServerStatisticsGet"),
    /* JADX INFO: Fake field, exist only in values array */
    EF228("NetrRemoteTOD"),
    /* JADX INFO: Fake field, exist only in values array */
    EF241("NetrServerTransportAdd"),
    /* JADX INFO: Fake field, exist only in values array */
    EF254("NetrServerTransportAddEx"),
    /* JADX INFO: Fake field, exist only in values array */
    EF267("NetrServerTransportEnum"),
    /* JADX INFO: Fake field, exist only in values array */
    EF280("NetrServerTransportDel"),
    /* JADX INFO: Fake field, exist only in values array */
    EF293("NetrServerTransportDelEx"),
    /* JADX INFO: Fake field, exist only in values array */
    EF306("NetrpGetFileSecurity"),
    /* JADX INFO: Fake field, exist only in values array */
    EF319("NetrpSetFileSecurity"),
    /* JADX INFO: Fake field, exist only in values array */
    EF332("NetprPathType"),
    /* JADX INFO: Fake field, exist only in values array */
    EF345("NetprPathCanonicalize"),
    /* JADX INFO: Fake field, exist only in values array */
    EF358("NetprPathCompare"),
    /* JADX INFO: Fake field, exist only in values array */
    EF371("NetprNameValidate"),
    /* JADX INFO: Fake field, exist only in values array */
    EF384("NetprNameCanonicalize"),
    /* JADX INFO: Fake field, exist only in values array */
    EF397("NetprNameCompare"),
    /* JADX INFO: Fake field, exist only in values array */
    EF410("NetrDfsGetVersion"),
    /* JADX INFO: Fake field, exist only in values array */
    EF423("NetrDfsCreateLocalPartition"),
    /* JADX INFO: Fake field, exist only in values array */
    EF436("NetrDfsDeleteLocalPartition"),
    /* JADX INFO: Fake field, exist only in values array */
    EF449("NetrDfsSetLocalVolumeState"),
    /* JADX INFO: Fake field, exist only in values array */
    EF462("NetrDfsCreateExitPoint"),
    /* JADX INFO: Fake field, exist only in values array */
    EF475("NetrDfsModifyPrefix"),
    /* JADX INFO: Fake field, exist only in values array */
    EF488("NetrDfsDeleteExitPoint"),
    /* JADX INFO: Fake field, exist only in values array */
    EF501("NetrDfsFixLocalVolume"),
    /* JADX INFO: Fake field, exist only in values array */
    EF514("NetrDfsManagerReportSiteInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    EF527("NetrServerAliasAdd"),
    /* JADX INFO: Fake field, exist only in values array */
    EF540("NetrServerAliasEnum"),
    /* JADX INFO: Fake field, exist only in values array */
    EF553("NetrServerAliasDel"),
    /* JADX INFO: Fake field, exist only in values array */
    EF566("NetrShareDelEx");


    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final HashMap f4430 = new HashMap();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final short f4432;

    static {
        for (EnumC1031 enumC1031 : values()) {
            f4430.put(Short.valueOf(enumC1031.f4432), enumC1031);
        }
    }

    EnumC1031(String str) {
        this.f4432 = (short) i;
    }
}
