package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.bumptech.glide.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0293 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC0293 f2386;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0293[] f2387;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC0293 f2388;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final EnumC0293 f2389;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC0293 f2390;

    static {
        EnumC0293 enumC0293 = new EnumC0293("IMMEDIATE", 0);
        f2390 = enumC0293;
        EnumC0293 enumC02932 = new EnumC0293("HIGH", 1);
        f2386 = enumC02932;
        EnumC0293 enumC02933 = new EnumC0293("NORMAL", 2);
        f2388 = enumC02933;
        EnumC0293 enumC02934 = new EnumC0293("LOW", 3);
        f2389 = enumC02934;
        f2387 = new EnumC0293[]{enumC0293, enumC02932, enumC02933, enumC02934};
    }

    public static EnumC0293 valueOf(String str) {
        return (EnumC0293) Enum.valueOf(EnumC0293.class, str);
    }

    public static EnumC0293[] values() {
        return (EnumC0293[]) f2387.clone();
    }
}
