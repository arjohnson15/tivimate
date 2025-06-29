package androidx.datastore.preferences.protobuf;

import p080.AbstractC1702;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0036 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC0036 f411;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0036[] f412;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC0036 f413;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final EnumC0036[] f414;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f415;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0036 EF6;

    static {
        EnumC0022 enumC0022 = EnumC0022.DOUBLE;
        EnumC0036 enumC0036 = new EnumC0036("DOUBLE", 0, 0, 1, enumC0022);
        EnumC0022 enumC00222 = EnumC0022.FLOAT;
        EnumC0036 enumC00362 = new EnumC0036("FLOAT", 1, 1, 1, enumC00222);
        EnumC0022 enumC00223 = EnumC0022.LONG;
        EnumC0036 enumC00363 = new EnumC0036("INT64", 2, 2, 1, enumC00223);
        EnumC0036 enumC00364 = new EnumC0036("UINT64", 3, 3, 1, enumC00223);
        EnumC0022 enumC00224 = EnumC0022.INT;
        EnumC0036 enumC00365 = new EnumC0036("INT32", 4, 4, 1, enumC00224);
        EnumC0036 enumC00366 = new EnumC0036("FIXED64", 5, 5, 1, enumC00223);
        EnumC0036 enumC00367 = new EnumC0036("FIXED32", 6, 6, 1, enumC00224);
        EnumC0022 enumC00225 = EnumC0022.BOOLEAN;
        EnumC0036 enumC00368 = new EnumC0036("BOOL", 7, 7, 1, enumC00225);
        EnumC0022 enumC00226 = EnumC0022.STRING;
        EnumC0036 enumC00369 = new EnumC0036("STRING", 8, 8, 1, enumC00226);
        EnumC0022 enumC00227 = EnumC0022.MESSAGE;
        EnumC0036 enumC003610 = new EnumC0036("MESSAGE", 9, 9, 1, enumC00227);
        EnumC0022 enumC00228 = EnumC0022.BYTE_STRING;
        EnumC0036 enumC003611 = new EnumC0036("BYTES", 10, 10, 1, enumC00228);
        EnumC0036 enumC003612 = new EnumC0036("UINT32", 11, 11, 1, enumC00224);
        EnumC0022 enumC00229 = EnumC0022.ENUM;
        EnumC0036 enumC003613 = new EnumC0036("ENUM", 12, 12, 1, enumC00229);
        EnumC0036 enumC003614 = new EnumC0036("SFIXED32", 13, 13, 1, enumC00224);
        EnumC0036 enumC003615 = new EnumC0036("SFIXED64", 14, 14, 1, enumC00223);
        EnumC0036 enumC003616 = new EnumC0036("SINT32", 15, 15, 1, enumC00224);
        EnumC0036 enumC003617 = new EnumC0036("SINT64", 16, 16, 1, enumC00223);
        EnumC0036 enumC003618 = new EnumC0036("GROUP", 17, 17, 1, enumC00227);
        EnumC0036 enumC003619 = new EnumC0036("DOUBLE_LIST", 18, 18, 2, enumC0022);
        EnumC0036 enumC003620 = new EnumC0036("FLOAT_LIST", 19, 19, 2, enumC00222);
        EnumC0036 enumC003621 = new EnumC0036("INT64_LIST", 20, 20, 2, enumC00223);
        EnumC0036 enumC003622 = new EnumC0036("UINT64_LIST", 21, 21, 2, enumC00223);
        EnumC0036 enumC003623 = new EnumC0036("INT32_LIST", 22, 22, 2, enumC00224);
        EnumC0036 enumC003624 = new EnumC0036("FIXED64_LIST", 23, 23, 2, enumC00223);
        EnumC0036 enumC003625 = new EnumC0036("FIXED32_LIST", 24, 24, 2, enumC00224);
        EnumC0036 enumC003626 = new EnumC0036("BOOL_LIST", 25, 25, 2, enumC00225);
        EnumC0036 enumC003627 = new EnumC0036("STRING_LIST", 26, 26, 2, enumC00226);
        EnumC0036 enumC003628 = new EnumC0036("MESSAGE_LIST", 27, 27, 2, enumC00227);
        EnumC0036 enumC003629 = new EnumC0036("BYTES_LIST", 28, 28, 2, enumC00228);
        EnumC0036 enumC003630 = new EnumC0036("UINT32_LIST", 29, 29, 2, enumC00224);
        EnumC0036 enumC003631 = new EnumC0036("ENUM_LIST", 30, 30, 2, enumC00229);
        EnumC0036 enumC003632 = new EnumC0036("SFIXED32_LIST", 31, 31, 2, enumC00224);
        EnumC0036 enumC003633 = new EnumC0036("SFIXED64_LIST", 32, 32, 2, enumC00223);
        EnumC0036 enumC003634 = new EnumC0036("SINT32_LIST", 33, 33, 2, enumC00224);
        EnumC0036 enumC003635 = new EnumC0036("SINT64_LIST", 34, 34, 2, enumC00223);
        EnumC0036 enumC003636 = new EnumC0036("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0022);
        f411 = enumC003636;
        EnumC0036 enumC003637 = new EnumC0036("FLOAT_LIST_PACKED", 36, 36, 3, enumC00222);
        EnumC0036 enumC003638 = new EnumC0036("INT64_LIST_PACKED", 37, 37, 3, enumC00223);
        EnumC0036 enumC003639 = new EnumC0036("UINT64_LIST_PACKED", 38, 38, 3, enumC00223);
        EnumC0036 enumC003640 = new EnumC0036("INT32_LIST_PACKED", 39, 39, 3, enumC00224);
        EnumC0036 enumC003641 = new EnumC0036("FIXED64_LIST_PACKED", 40, 40, 3, enumC00223);
        EnumC0036 enumC003642 = new EnumC0036("FIXED32_LIST_PACKED", 41, 41, 3, enumC00224);
        EnumC0036 enumC003643 = new EnumC0036("BOOL_LIST_PACKED", 42, 42, 3, enumC00225);
        EnumC0036 enumC003644 = new EnumC0036("UINT32_LIST_PACKED", 43, 43, 3, enumC00224);
        EnumC0036 enumC003645 = new EnumC0036("ENUM_LIST_PACKED", 44, 44, 3, enumC00229);
        EnumC0036 enumC003646 = new EnumC0036("SFIXED32_LIST_PACKED", 45, 45, 3, enumC00224);
        EnumC0036 enumC003647 = new EnumC0036("SFIXED64_LIST_PACKED", 46, 46, 3, enumC00223);
        EnumC0036 enumC003648 = new EnumC0036("SINT32_LIST_PACKED", 47, 47, 3, enumC00224);
        EnumC0036 enumC003649 = new EnumC0036("SINT64_LIST_PACKED", 48, 48, 3, enumC00223);
        f413 = enumC003649;
        f412 = new EnumC0036[]{enumC0036, enumC00362, enumC00363, enumC00364, enumC00365, enumC00366, enumC00367, enumC00368, enumC00369, enumC003610, enumC003611, enumC003612, enumC003613, enumC003614, enumC003615, enumC003616, enumC003617, enumC003618, enumC003619, enumC003620, enumC003621, enumC003622, enumC003623, enumC003624, enumC003625, enumC003626, enumC003627, enumC003628, enumC003629, enumC003630, enumC003631, enumC003632, enumC003633, enumC003634, enumC003635, enumC003636, enumC003637, enumC003638, enumC003639, enumC003640, enumC003641, enumC003642, enumC003643, enumC003644, enumC003645, enumC003646, enumC003647, enumC003648, enumC003649, new EnumC0036("GROUP_LIST", 49, 49, 2, enumC00227), new EnumC0036("MAP", 50, 50, 4, EnumC0022.VOID)};
        EnumC0036[] enumC0036ArrValues = values();
        f414 = new EnumC0036[enumC0036ArrValues.length];
        for (EnumC0036 enumC003650 : enumC0036ArrValues) {
            f414[enumC003650.f415] = enumC003650;
        }
    }

    public EnumC0036(String str, int i, int i2, int i3, EnumC0022 enumC0022) {
        this.f415 = i2;
        int iM5411 = AbstractC1702.m5411(i3);
        if (iM5411 == 1 || iM5411 == 3) {
            enumC0022.getClass();
        }
        if (i3 == 1) {
            enumC0022.ordinal();
        }
    }

    public static EnumC0036 valueOf(String str) {
        return (EnumC0036) Enum.valueOf(EnumC0036.class, str);
    }

    public static EnumC0036[] values() {
        return (EnumC0036[]) f412.clone();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m354() {
        return this.f415;
    }
}
