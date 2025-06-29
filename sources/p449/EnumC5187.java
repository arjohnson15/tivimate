package p449;

import java.util.HashMap;

/* renamed from: ﾞˏ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC5187 {
    f19995("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("NCA_S_FAULT_OTHER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF24("NCA_S_FAULT_ACCESS_DENIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF34("NCA_S_FAULT_NDR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF44("NCA_S_FAULT_CANT_PERFORM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF54("NCA_S_FAULT_INT_DIV_BY_ZERO"),
    /* JADX INFO: Fake field, exist only in values array */
    EF65("NCA_S_FAULT_ADDR_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF76("NCA_S_FAULT_FP_DIV_ZERO"),
    /* JADX INFO: Fake field, exist only in values array */
    EF88("NCA_S_FAULT_FP_UNDERFLOW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF100("NCA_S_FAULT_FP_OVERFLOW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF112("NCA_S_FAULT_INVALID_TAG"),
    /* JADX INFO: Fake field, exist only in values array */
    EF124("NCA_S_FAULT_INVALID_BOUND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF136("NCA_RPC_VERSION_MISMATCH"),
    /* JADX INFO: Fake field, exist only in values array */
    EF150("NCA_UNSPEC_REJECT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF164("NCA_S_BAD_ACTID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF178("NCA_WHO_ARE_YOU_FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF192("NCA_MANAGER_NOT_ENTERED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF206("NCA_S_FAULT_CANCEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF220("NCA_S_FAULT_ILL_INST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF234("NCA_S_FAULT_FP_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF248("NCA_S_FAULT_INT_OVERFLOW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF262("NCA_S_FAULT_PIPE_EMPTY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF276("NCA_S_FAULT_PIPE_CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF290("NCA_S_FAULT_PIPE_ORDER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF304("NCA_S_FAULT_PIPE_DISCIPLINE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF318("NCA_S_FAULT_PIPE_COMM_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF332("NCA_S_FAULT_PIPE_MEMORY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF346("NCA_S_FAULT_CONTEXT_MISMATCH"),
    /* JADX INFO: Fake field, exist only in values array */
    EF360("NCA_S_FAULT_REMOTE_NO_MEMORY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF374("NCA_INVALID_PRES_CONTEXT_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF388("NCA_UNSUPPORTED_AUTHN_LEVEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF402("NCA_INVALID_CHECKSUM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF416("NCA_INVALID_CRC"),
    /* JADX INFO: Fake field, exist only in values array */
    EF430("NCS_S_FAULT_USER_DEFINED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF444("NCA_S_FAULT_TX_OPEN_FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF458("NCA_S_FAULT_CODESET_CONV_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF472("NCA_S_FAULT_OBJECT_NOT_FOUND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF486("NCA_S_FAULT_NO_CLIENT_STUB"),
    /* JADX INFO: Fake field, exist only in values array */
    EF500("NCA_OP_RNG_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF514("NCA_UNK_IF"),
    /* JADX INFO: Fake field, exist only in values array */
    EF528("NCA_WRONG_BOOT_TIME"),
    /* JADX INFO: Fake field, exist only in values array */
    EF542("NCA_S_YOU_CRASHED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF556("NCA_PROTO_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF570("NCA_OUT_ARGS_TOO_BIG"),
    /* JADX INFO: Fake field, exist only in values array */
    EF584("NCA_SERVER_TOO_BUSY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF598("NCA_UNSUPPORTED_TYPE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF612("E_NOTIMPL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF626("E_POINTER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF640("E_AOBRT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF654("E_UNEXPECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF668("RPC_E_SERVERFAULT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF682("RPC_E_DISCONNECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF696("RPC_E_INVALID_IPID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF710("RPC_E_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF724("DISP_E_MEMBERNOTFOUND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF738("DISP_E_UNKNOWNNAME"),
    /* JADX INFO: Fake field, exist only in values array */
    EF752("DISP_E_BADPARAMCOUNT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF766("CBA_E_MALFORMED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF780("CBA_E_UNKNOWNOBJECT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF794("CBA_E_INVALIDID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF808("CBA_E_INVALIDCOOKIE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF822("CBA_E_QOSTYPEUNSUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF836("CBA_E_QOSVALUEUNSUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF850("CBA_E_NOTAPPLICABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF864("CBA_E_LIMITVIOLATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF878("CBA_E_QOSTYPENOTAPPLICABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF892("CBA_E_OUTOFPARTNERACCOS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF906("CBA_E_FLAGUNSUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF920("CBA_E_FRAMECOUNTUNSUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF934("CBA_E_MODECHANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF948("E_OUTOFMEMORY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF962("E_INVALIDARG"),
    /* JADX INFO: Fake field, exist only in values array */
    EF976("RPC_S_PROCNUM_OUT_OF_RANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF990("OR_INVALID_OXID");


    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final HashMap f19996 = new HashMap();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f19998;

    static {
        for (EnumC5187 enumC5187 : values()) {
            f19996.put(Integer.valueOf(enumC5187.f19998), enumC5187);
        }
    }

    EnumC5187(String str) {
        this.f19998 = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name().toLowerCase();
    }
}
