package ar.tvplayer.tv;

import java.util.UUID;

/* loaded from: classes.dex */
public final class ProtectedTvPlayerApplication$ProtectedTvPlayerApplication$f {
    public static final String FvmA;
    public static String pjHCu;
    public final String AbE = FvmA;
    public final boolean anu;
    public final String by;
    public final boolean fb;
    public final int gvmoe;
    public final boolean hf;
    public final int mcGu;
    public final boolean nEmfB;
    public final boolean rhhkH;
    public final boolean vo;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        FvmA = new UUID((mostSignificantBits & 65535) | (System.currentTimeMillis() << 16), uuidRandomUUID.getLeastSignificantBits()).toString();
    }

    private ProtectedTvPlayerApplication$ProtectedTvPlayerApplication$f(String str, String str2, int i) {
        this.by = str2;
        this.mcGu = i;
        this.fb = (i & 1) != 0;
        this.anu = (i & 2) != 0;
        this.hf = (i & 4) != 0;
        this.vo = (i & 8) != 0;
        this.nEmfB = (i & 16) != 0;
        this.rhhkH = (i & 32) != 0;
        this.gvmoe = 2;
    }

    public static native ProtectedTvPlayerApplication$ProtectedTvPlayerApplication$f dwuezmF();

    public static void kdfszfiDz(String str) {
    }
}
