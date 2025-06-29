package p395;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ⁱـ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC4543 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4543[] f17443;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC4543 f17444;

    static {
        EnumC4543 enumC4543 = new EnumC4543("INSTANCE", 0);
        f17444 = enumC4543;
        f17443 = new EnumC4543[]{enumC4543};
    }

    public static EnumC4543 valueOf(String str) {
        return (EnumC4543) Enum.valueOf(EnumC4543.class, str);
    }

    public static EnumC4543[] values() {
        return (EnumC4543[]) f17443.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
