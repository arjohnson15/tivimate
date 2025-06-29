package p047;

import p395.AbstractC4535;

/* renamed from: ʽᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1306 extends AbstractC4535 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final char[] f5330 = {'+'};

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final char[] f5331 = "0123456789ABCDEF".toCharArray();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f5332;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean[] f5333;

    public C1306(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f5332 = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.f5333 = zArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe  */
    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m4608(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p047.C1306.m4608(java.lang.String):java.lang.String");
    }
}
