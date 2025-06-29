package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class G {
    public static final G ALWAYS;
    public static final G EXCEEDS_PAD;
    public static final G NEVER;
    public static final G NORMAL;
    public static final G NOT_NEGATIVE;
    private static final /* synthetic */ G[] a;

    static {
        G g = new G("NORMAL", 0);
        NORMAL = g;
        G g2 = new G("ALWAYS", 1);
        ALWAYS = g2;
        G g3 = new G("NEVER", 2);
        NEVER = g3;
        G g4 = new G("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = g4;
        G g5 = new G("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = g5;
        a = new G[]{g, g2, g3, g4, g5};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) a.clone();
    }

    final boolean n(boolean z, boolean z2, boolean z3) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return (z && z2) ? false : true;
        }
        if (iOrdinal == 1 || iOrdinal == 4) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }
}
