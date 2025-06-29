package androidx.lifecycle;

import p334.C3789;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0247 {
    private static final /* synthetic */ EnumC0247[] $VALUES;
    public static final C0220 Companion;
    public static final EnumC0247 ON_ANY;
    public static final EnumC0247 ON_CREATE;
    public static final EnumC0247 ON_DESTROY;
    public static final EnumC0247 ON_PAUSE;
    public static final EnumC0247 ON_RESUME;
    public static final EnumC0247 ON_START;
    public static final EnumC0247 ON_STOP;

    static {
        EnumC0247 enumC0247 = new EnumC0247("ON_CREATE", 0);
        ON_CREATE = enumC0247;
        EnumC0247 enumC02472 = new EnumC0247("ON_START", 1);
        ON_START = enumC02472;
        EnumC0247 enumC02473 = new EnumC0247("ON_RESUME", 2);
        ON_RESUME = enumC02473;
        EnumC0247 enumC02474 = new EnumC0247("ON_PAUSE", 3);
        ON_PAUSE = enumC02474;
        EnumC0247 enumC02475 = new EnumC0247("ON_STOP", 4);
        ON_STOP = enumC02475;
        EnumC0247 enumC02476 = new EnumC0247("ON_DESTROY", 5);
        ON_DESTROY = enumC02476;
        EnumC0247 enumC02477 = new EnumC0247("ON_ANY", 6);
        ON_ANY = enumC02477;
        $VALUES = new EnumC0247[]{enumC0247, enumC02472, enumC02473, enumC02474, enumC02475, enumC02476, enumC02477};
        Companion = new C0220();
    }

    public static EnumC0247 valueOf(String str) {
        return (EnumC0247) Enum.valueOf(EnumC0247.class, str);
    }

    public static EnumC0247[] values() {
        return (EnumC0247[]) $VALUES.clone();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EnumC0230 m1052() {
        switch (AbstractC0223.f1236[ordinal()]) {
            case 1:
            case 2:
                return EnumC0230.f1252;
            case 3:
            case 4:
                return EnumC0230.f1253;
            case 5:
                return EnumC0230.f1251;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0230.f1254;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
