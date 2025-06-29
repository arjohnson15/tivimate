package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class q implements InterfaceC5410f {
    public static final q INSENSITIVE;
    public static final q LENIENT;
    public static final q SENSITIVE;
    public static final q STRICT;
    private static final /* synthetic */ q[] a;

    static {
        q qVar = new q("SENSITIVE", 0);
        SENSITIVE = qVar;
        q qVar2 = new q("INSENSITIVE", 1);
        INSENSITIVE = qVar2;
        q qVar3 = new q("STRICT", 2);
        STRICT = qVar3;
        q qVar4 = new q("LENIENT", 3);
        LENIENT = qVar4;
        a = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) a.clone();
    }

    @Override // j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.InterfaceC5410f
    public final int p(w wVar, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            wVar.m(true);
        } else if (iOrdinal == 1) {
            wVar.m(false);
        } else if (iOrdinal == 2) {
            wVar.q(true);
        } else if (iOrdinal == 3) {
            wVar.q(false);
        }
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
