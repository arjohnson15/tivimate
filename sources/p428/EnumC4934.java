package p428;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ﹶˊ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC4934 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final HashMap f18667;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4934[] f18668;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC4934 f18669;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4934 EF10;

    static {
        EnumC4934 enumC4934 = new EnumC4934("X86_32", 0);
        EnumC4934 enumC49342 = new EnumC4934("X86_64", 1);
        EnumC4934 enumC49343 = new EnumC4934("ARM_UNKNOWN", 2);
        EnumC4934 enumC49344 = new EnumC4934("PPC", 3);
        EnumC4934 enumC49345 = new EnumC4934("PPC64", 4);
        EnumC4934 enumC49346 = new EnumC4934("ARMV6", 5);
        EnumC4934 enumC49347 = new EnumC4934("ARMV7", 6);
        EnumC4934 enumC49348 = new EnumC4934("UNKNOWN", 7);
        f18669 = enumC49348;
        EnumC4934 enumC49349 = new EnumC4934("ARMV7S", 8);
        EnumC4934 enumC493410 = new EnumC4934("ARM64", 9);
        f18668 = new EnumC4934[]{enumC4934, enumC49342, enumC49343, enumC49344, enumC49345, enumC49346, enumC49347, enumC49348, enumC49349, enumC493410};
        HashMap map = new HashMap(4);
        f18667 = map;
        map.put("armeabi-v7a", enumC49347);
        map.put("armeabi", enumC49346);
        map.put("arm64-v8a", enumC493410);
        map.put("x86", enumC4934);
    }

    public static EnumC4934 valueOf(String str) {
        return (EnumC4934) Enum.valueOf(EnumC4934.class, str);
    }

    public static EnumC4934[] values() {
        return (EnumC4934[]) f18668.clone();
    }
}
