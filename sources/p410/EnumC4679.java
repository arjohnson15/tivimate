package p410;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ﹳˎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC4679 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4679[] f17813;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC4679 f17814;

    static {
        EnumC4679 enumC4679 = new EnumC4679("INSTANCE", 0);
        f17814 = enumC4679;
        f17813 = new EnumC4679[]{enumC4679};
    }

    public static EnumC4679 valueOf(String str) {
        return (EnumC4679) Enum.valueOf(EnumC4679.class, str);
    }

    public static EnumC4679[] values() {
        return (EnumC4679[]) f17813.clone();
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
