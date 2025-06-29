package p457;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ﾞﹶ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC5364 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5364[] f20822;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC5364 f20823;

    static {
        EnumC5364 enumC5364 = new EnumC5364("INSTANCE", 0);
        f20823 = enumC5364;
        f20822 = new EnumC5364[]{enumC5364};
    }

    public static EnumC5364 valueOf(String str) {
        return (EnumC5364) Enum.valueOf(EnumC5364.class, str);
    }

    public static EnumC5364[] values() {
        return (EnumC5364[]) f20822.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
