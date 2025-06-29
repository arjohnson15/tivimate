package com.google.crypto.tink.shaded.protobuf;

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
/* renamed from: com.google.crypto.tink.shaded.protobuf.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0743 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC0743 f3564;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0743[] f3565;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC0743 f3566;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final EnumC0743[] f3567;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f3568;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0743 EF6;

    static {
        EnumC0764 enumC0764 = EnumC0764.DOUBLE;
        EnumC0743 enumC0743 = new EnumC0743("DOUBLE", 0, 0, 1, enumC0764);
        EnumC0764 enumC07642 = EnumC0764.FLOAT;
        EnumC0743 enumC07432 = new EnumC0743("FLOAT", 1, 1, 1, enumC07642);
        EnumC0764 enumC07643 = EnumC0764.LONG;
        EnumC0743 enumC07433 = new EnumC0743("INT64", 2, 2, 1, enumC07643);
        EnumC0743 enumC07434 = new EnumC0743("UINT64", 3, 3, 1, enumC07643);
        EnumC0764 enumC07644 = EnumC0764.INT;
        EnumC0743 enumC07435 = new EnumC0743("INT32", 4, 4, 1, enumC07644);
        EnumC0743 enumC07436 = new EnumC0743("FIXED64", 5, 5, 1, enumC07643);
        EnumC0743 enumC07437 = new EnumC0743("FIXED32", 6, 6, 1, enumC07644);
        EnumC0764 enumC07645 = EnumC0764.BOOLEAN;
        EnumC0743 enumC07438 = new EnumC0743("BOOL", 7, 7, 1, enumC07645);
        EnumC0764 enumC07646 = EnumC0764.STRING;
        EnumC0743 enumC07439 = new EnumC0743("STRING", 8, 8, 1, enumC07646);
        EnumC0764 enumC07647 = EnumC0764.MESSAGE;
        EnumC0743 enumC074310 = new EnumC0743("MESSAGE", 9, 9, 1, enumC07647);
        EnumC0764 enumC07648 = EnumC0764.BYTE_STRING;
        EnumC0743 enumC074311 = new EnumC0743("BYTES", 10, 10, 1, enumC07648);
        EnumC0743 enumC074312 = new EnumC0743("UINT32", 11, 11, 1, enumC07644);
        EnumC0764 enumC07649 = EnumC0764.ENUM;
        EnumC0743 enumC074313 = new EnumC0743("ENUM", 12, 12, 1, enumC07649);
        EnumC0743 enumC074314 = new EnumC0743("SFIXED32", 13, 13, 1, enumC07644);
        EnumC0743 enumC074315 = new EnumC0743("SFIXED64", 14, 14, 1, enumC07643);
        EnumC0743 enumC074316 = new EnumC0743("SINT32", 15, 15, 1, enumC07644);
        EnumC0743 enumC074317 = new EnumC0743("SINT64", 16, 16, 1, enumC07643);
        EnumC0743 enumC074318 = new EnumC0743("GROUP", 17, 17, 1, enumC07647);
        EnumC0743 enumC074319 = new EnumC0743("DOUBLE_LIST", 18, 18, 2, enumC0764);
        EnumC0743 enumC074320 = new EnumC0743("FLOAT_LIST", 19, 19, 2, enumC07642);
        EnumC0743 enumC074321 = new EnumC0743("INT64_LIST", 20, 20, 2, enumC07643);
        EnumC0743 enumC074322 = new EnumC0743("UINT64_LIST", 21, 21, 2, enumC07643);
        EnumC0743 enumC074323 = new EnumC0743("INT32_LIST", 22, 22, 2, enumC07644);
        EnumC0743 enumC074324 = new EnumC0743("FIXED64_LIST", 23, 23, 2, enumC07643);
        EnumC0743 enumC074325 = new EnumC0743("FIXED32_LIST", 24, 24, 2, enumC07644);
        EnumC0743 enumC074326 = new EnumC0743("BOOL_LIST", 25, 25, 2, enumC07645);
        EnumC0743 enumC074327 = new EnumC0743("STRING_LIST", 26, 26, 2, enumC07646);
        EnumC0743 enumC074328 = new EnumC0743("MESSAGE_LIST", 27, 27, 2, enumC07647);
        EnumC0743 enumC074329 = new EnumC0743("BYTES_LIST", 28, 28, 2, enumC07648);
        EnumC0743 enumC074330 = new EnumC0743("UINT32_LIST", 29, 29, 2, enumC07644);
        EnumC0743 enumC074331 = new EnumC0743("ENUM_LIST", 30, 30, 2, enumC07649);
        EnumC0743 enumC074332 = new EnumC0743("SFIXED32_LIST", 31, 31, 2, enumC07644);
        EnumC0743 enumC074333 = new EnumC0743("SFIXED64_LIST", 32, 32, 2, enumC07643);
        EnumC0743 enumC074334 = new EnumC0743("SINT32_LIST", 33, 33, 2, enumC07644);
        EnumC0743 enumC074335 = new EnumC0743("SINT64_LIST", 34, 34, 2, enumC07643);
        EnumC0743 enumC074336 = new EnumC0743("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0764);
        f3564 = enumC074336;
        EnumC0743 enumC074337 = new EnumC0743("FLOAT_LIST_PACKED", 36, 36, 3, enumC07642);
        EnumC0743 enumC074338 = new EnumC0743("INT64_LIST_PACKED", 37, 37, 3, enumC07643);
        EnumC0743 enumC074339 = new EnumC0743("UINT64_LIST_PACKED", 38, 38, 3, enumC07643);
        EnumC0743 enumC074340 = new EnumC0743("INT32_LIST_PACKED", 39, 39, 3, enumC07644);
        EnumC0743 enumC074341 = new EnumC0743("FIXED64_LIST_PACKED", 40, 40, 3, enumC07643);
        EnumC0743 enumC074342 = new EnumC0743("FIXED32_LIST_PACKED", 41, 41, 3, enumC07644);
        EnumC0743 enumC074343 = new EnumC0743("BOOL_LIST_PACKED", 42, 42, 3, enumC07645);
        EnumC0743 enumC074344 = new EnumC0743("UINT32_LIST_PACKED", 43, 43, 3, enumC07644);
        EnumC0743 enumC074345 = new EnumC0743("ENUM_LIST_PACKED", 44, 44, 3, enumC07649);
        EnumC0743 enumC074346 = new EnumC0743("SFIXED32_LIST_PACKED", 45, 45, 3, enumC07644);
        EnumC0743 enumC074347 = new EnumC0743("SFIXED64_LIST_PACKED", 46, 46, 3, enumC07643);
        EnumC0743 enumC074348 = new EnumC0743("SINT32_LIST_PACKED", 47, 47, 3, enumC07644);
        EnumC0743 enumC074349 = new EnumC0743("SINT64_LIST_PACKED", 48, 48, 3, enumC07643);
        f3566 = enumC074349;
        f3565 = new EnumC0743[]{enumC0743, enumC07432, enumC07433, enumC07434, enumC07435, enumC07436, enumC07437, enumC07438, enumC07439, enumC074310, enumC074311, enumC074312, enumC074313, enumC074314, enumC074315, enumC074316, enumC074317, enumC074318, enumC074319, enumC074320, enumC074321, enumC074322, enumC074323, enumC074324, enumC074325, enumC074326, enumC074327, enumC074328, enumC074329, enumC074330, enumC074331, enumC074332, enumC074333, enumC074334, enumC074335, enumC074336, enumC074337, enumC074338, enumC074339, enumC074340, enumC074341, enumC074342, enumC074343, enumC074344, enumC074345, enumC074346, enumC074347, enumC074348, enumC074349, new EnumC0743("GROUP_LIST", 49, 49, 2, enumC07647), new EnumC0743("MAP", 50, 50, 4, EnumC0764.VOID)};
        EnumC0743[] enumC0743ArrValues = values();
        f3567 = new EnumC0743[enumC0743ArrValues.length];
        for (EnumC0743 enumC074350 : enumC0743ArrValues) {
            f3567[enumC074350.f3568] = enumC074350;
        }
    }

    public EnumC0743(String str, int i, int i2, int i3, EnumC0764 enumC0764) {
        this.f3568 = i2;
        int iM5411 = AbstractC1702.m5411(i3);
        if (iM5411 == 1 || iM5411 == 3) {
            enumC0764.getClass();
        }
        if (i3 == 1) {
            enumC0764.ordinal();
        }
    }

    public static EnumC0743 valueOf(String str) {
        return (EnumC0743) Enum.valueOf(EnumC0743.class, str);
    }

    public static EnumC0743[] values() {
        return (EnumC0743[]) f3565.clone();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m3059() {
        return this.f3568;
    }
}
