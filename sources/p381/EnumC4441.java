package p381;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ᵢᵎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC4441 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final Handler f17118;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4441[] f17119;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final EnumC4441 f17120;

    static {
        EnumC4441 enumC4441 = new EnumC4441("INSTANCE", 0);
        f17120 = enumC4441;
        f17119 = new EnumC4441[]{enumC4441};
        f17118 = new Handler(Looper.getMainLooper());
    }

    public static EnumC4441 valueOf(String str) {
        return (EnumC4441) Enum.valueOf(EnumC4441.class, str);
    }

    public static EnumC4441[] values() {
        return (EnumC4441[]) f17119.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f17118.post(runnable);
    }
}
