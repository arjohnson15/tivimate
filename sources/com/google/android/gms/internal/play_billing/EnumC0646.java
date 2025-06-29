package com.google.android.gms.internal.play_billing;

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
/* renamed from: com.google.android.gms.internal.play_billing.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0646 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC0646 f3040;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0646[] f3041;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC0646 f3042;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final EnumC0646[] f3043;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f3044;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0646 EF6;

    static {
        EnumC0631 enumC0631 = EnumC0631.DOUBLE;
        EnumC0646 enumC0646 = new EnumC0646("DOUBLE", 0, 0, 1, enumC0631);
        EnumC0631 enumC06312 = EnumC0631.FLOAT;
        EnumC0646 enumC06462 = new EnumC0646("FLOAT", 1, 1, 1, enumC06312);
        EnumC0631 enumC06313 = EnumC0631.LONG;
        EnumC0646 enumC06463 = new EnumC0646("INT64", 2, 2, 1, enumC06313);
        EnumC0646 enumC06464 = new EnumC0646("UINT64", 3, 3, 1, enumC06313);
        EnumC0631 enumC06314 = EnumC0631.INT;
        EnumC0646 enumC06465 = new EnumC0646("INT32", 4, 4, 1, enumC06314);
        EnumC0646 enumC06466 = new EnumC0646("FIXED64", 5, 5, 1, enumC06313);
        EnumC0646 enumC06467 = new EnumC0646("FIXED32", 6, 6, 1, enumC06314);
        EnumC0631 enumC06315 = EnumC0631.BOOLEAN;
        EnumC0646 enumC06468 = new EnumC0646("BOOL", 7, 7, 1, enumC06315);
        EnumC0631 enumC06316 = EnumC0631.STRING;
        EnumC0646 enumC06469 = new EnumC0646("STRING", 8, 8, 1, enumC06316);
        EnumC0631 enumC06317 = EnumC0631.MESSAGE;
        EnumC0646 enumC064610 = new EnumC0646("MESSAGE", 9, 9, 1, enumC06317);
        EnumC0631 enumC06318 = EnumC0631.BYTE_STRING;
        EnumC0646 enumC064611 = new EnumC0646("BYTES", 10, 10, 1, enumC06318);
        EnumC0646 enumC064612 = new EnumC0646("UINT32", 11, 11, 1, enumC06314);
        EnumC0631 enumC06319 = EnumC0631.ENUM;
        EnumC0646 enumC064613 = new EnumC0646("ENUM", 12, 12, 1, enumC06319);
        EnumC0646 enumC064614 = new EnumC0646("SFIXED32", 13, 13, 1, enumC06314);
        EnumC0646 enumC064615 = new EnumC0646("SFIXED64", 14, 14, 1, enumC06313);
        EnumC0646 enumC064616 = new EnumC0646("SINT32", 15, 15, 1, enumC06314);
        EnumC0646 enumC064617 = new EnumC0646("SINT64", 16, 16, 1, enumC06313);
        EnumC0646 enumC064618 = new EnumC0646("GROUP", 17, 17, 1, enumC06317);
        EnumC0646 enumC064619 = new EnumC0646("DOUBLE_LIST", 18, 18, 2, enumC0631);
        EnumC0646 enumC064620 = new EnumC0646("FLOAT_LIST", 19, 19, 2, enumC06312);
        EnumC0646 enumC064621 = new EnumC0646("INT64_LIST", 20, 20, 2, enumC06313);
        EnumC0646 enumC064622 = new EnumC0646("UINT64_LIST", 21, 21, 2, enumC06313);
        EnumC0646 enumC064623 = new EnumC0646("INT32_LIST", 22, 22, 2, enumC06314);
        EnumC0646 enumC064624 = new EnumC0646("FIXED64_LIST", 23, 23, 2, enumC06313);
        EnumC0646 enumC064625 = new EnumC0646("FIXED32_LIST", 24, 24, 2, enumC06314);
        EnumC0646 enumC064626 = new EnumC0646("BOOL_LIST", 25, 25, 2, enumC06315);
        EnumC0646 enumC064627 = new EnumC0646("STRING_LIST", 26, 26, 2, enumC06316);
        EnumC0646 enumC064628 = new EnumC0646("MESSAGE_LIST", 27, 27, 2, enumC06317);
        EnumC0646 enumC064629 = new EnumC0646("BYTES_LIST", 28, 28, 2, enumC06318);
        EnumC0646 enumC064630 = new EnumC0646("UINT32_LIST", 29, 29, 2, enumC06314);
        EnumC0646 enumC064631 = new EnumC0646("ENUM_LIST", 30, 30, 2, enumC06319);
        EnumC0646 enumC064632 = new EnumC0646("SFIXED32_LIST", 31, 31, 2, enumC06314);
        EnumC0646 enumC064633 = new EnumC0646("SFIXED64_LIST", 32, 32, 2, enumC06313);
        EnumC0646 enumC064634 = new EnumC0646("SINT32_LIST", 33, 33, 2, enumC06314);
        EnumC0646 enumC064635 = new EnumC0646("SINT64_LIST", 34, 34, 2, enumC06313);
        EnumC0646 enumC064636 = new EnumC0646("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0631);
        f3040 = enumC064636;
        EnumC0646 enumC064637 = new EnumC0646("FLOAT_LIST_PACKED", 36, 36, 3, enumC06312);
        EnumC0646 enumC064638 = new EnumC0646("INT64_LIST_PACKED", 37, 37, 3, enumC06313);
        EnumC0646 enumC064639 = new EnumC0646("UINT64_LIST_PACKED", 38, 38, 3, enumC06313);
        EnumC0646 enumC064640 = new EnumC0646("INT32_LIST_PACKED", 39, 39, 3, enumC06314);
        EnumC0646 enumC064641 = new EnumC0646("FIXED64_LIST_PACKED", 40, 40, 3, enumC06313);
        EnumC0646 enumC064642 = new EnumC0646("FIXED32_LIST_PACKED", 41, 41, 3, enumC06314);
        EnumC0646 enumC064643 = new EnumC0646("BOOL_LIST_PACKED", 42, 42, 3, enumC06315);
        EnumC0646 enumC064644 = new EnumC0646("UINT32_LIST_PACKED", 43, 43, 3, enumC06314);
        EnumC0646 enumC064645 = new EnumC0646("ENUM_LIST_PACKED", 44, 44, 3, enumC06319);
        EnumC0646 enumC064646 = new EnumC0646("SFIXED32_LIST_PACKED", 45, 45, 3, enumC06314);
        EnumC0646 enumC064647 = new EnumC0646("SFIXED64_LIST_PACKED", 46, 46, 3, enumC06313);
        EnumC0646 enumC064648 = new EnumC0646("SINT32_LIST_PACKED", 47, 47, 3, enumC06314);
        EnumC0646 enumC064649 = new EnumC0646("SINT64_LIST_PACKED", 48, 48, 3, enumC06313);
        f3042 = enumC064649;
        f3041 = new EnumC0646[]{enumC0646, enumC06462, enumC06463, enumC06464, enumC06465, enumC06466, enumC06467, enumC06468, enumC06469, enumC064610, enumC064611, enumC064612, enumC064613, enumC064614, enumC064615, enumC064616, enumC064617, enumC064618, enumC064619, enumC064620, enumC064621, enumC064622, enumC064623, enumC064624, enumC064625, enumC064626, enumC064627, enumC064628, enumC064629, enumC064630, enumC064631, enumC064632, enumC064633, enumC064634, enumC064635, enumC064636, enumC064637, enumC064638, enumC064639, enumC064640, enumC064641, enumC064642, enumC064643, enumC064644, enumC064645, enumC064646, enumC064647, enumC064648, enumC064649, new EnumC0646("GROUP_LIST", 49, 49, 2, enumC06317), new EnumC0646("MAP", 50, 50, 4, EnumC0631.VOID)};
        EnumC0646[] enumC0646ArrValues = values();
        f3043 = new EnumC0646[enumC0646ArrValues.length];
        for (EnumC0646 enumC064650 : enumC0646ArrValues) {
            f3043[enumC064650.f3044] = enumC064650;
        }
    }

    public EnumC0646(String str, int i, int i2, int i3, EnumC0631 enumC0631) {
        this.f3044 = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            enumC0631.getClass();
        }
        if (i3 == 1) {
            EnumC0631 enumC06312 = EnumC0631.VOID;
            enumC0631.ordinal();
        }
    }

    public static EnumC0646[] values() {
        return (EnumC0646[]) f3041.clone();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m2661() {
        return this.f3044;
    }
}
