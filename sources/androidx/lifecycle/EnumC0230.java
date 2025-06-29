package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0230 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final EnumC0230 f1250;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final EnumC0230 f1251;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final EnumC0230 f1252;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final EnumC0230 f1253;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC0230 f1254;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0230[] f1255;

    static {
        EnumC0230 enumC0230 = new EnumC0230("DESTROYED", 0);
        f1254 = enumC0230;
        EnumC0230 enumC02302 = new EnumC0230("INITIALIZED", 1);
        f1250 = enumC02302;
        EnumC0230 enumC02303 = new EnumC0230("CREATED", 2);
        f1252 = enumC02303;
        EnumC0230 enumC02304 = new EnumC0230("STARTED", 3);
        f1253 = enumC02304;
        EnumC0230 enumC02305 = new EnumC0230("RESUMED", 4);
        f1251 = enumC02305;
        f1255 = new EnumC0230[]{enumC0230, enumC02302, enumC02303, enumC02304, enumC02305};
    }

    public static EnumC0230 valueOf(String str) {
        return (EnumC0230) Enum.valueOf(EnumC0230.class, str);
    }

    public static EnumC0230[] values() {
        return (EnumC0230[]) f1255.clone();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m1030(EnumC0230 enumC0230) {
        return compareTo(enumC0230) >= 0;
    }
}
