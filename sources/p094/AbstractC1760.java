package p094;

/* renamed from: ˆʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1760 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String[] f6815 = {"\uda46⯻ꈽ叫\uda3c⯽ꉡ口\uda2b\uda4b⯻ꈽ叫\uda3c⯽\uda46⯻ꈽ叫\uda3c⯠ꈯ口\uda2b\uda46⯾ꈯ叽\uda3d⯹ꈡ叼\uda2a\uda4b⯢ꈡ叩\uda27⯠\uda46⯯ꈻ叺\uda26⯊ꈯ叺\uda2f\uda6c⯭ꈡ叻\uda22⯪ꉮ叠\uda21⯺ꉮ叽\uda2b⯼ꈧ可\uda22⯧ꈴ叫\uda6e⯡ꈬ古\uda2b⯭ꈺ厮\uda3a⯡ꉮ叄\uda1d⯁ꈀ\uda4b⯻ꈽ叫\uda3c⯽\uda4e\uda4b⯫ꈣ可\uda27⯢\uda5a⯼ꈫ叿\uda3b⯫ꈽ叺\uda1e⯯ꈽ叽\uda39⯡ꈼ只\uda1c⯫ꈽ叫\uda3a\uda57⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯜ꈫ司\uda21⯭ꈯ召\uda22⯫ꉣ叝\uda2b⯽ꈽ叧\uda21⯠\uda4f⮿\uda5e⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯚ꈣ厣\uda1a⯡ꈥ叫\uda20\uda4a⯕ꈩ叓\uda74\uda59⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯉ꉣ反\uda2f⯾ꈺ叭\uda26⯯ꉣ叚\uda21⯥ꈫ叠\uda4a⯕ꈦ叓\uda74\uda59⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯆ꉣ反\uda2f⯾ꈺ叭\uda26⯯ꉣ叚\uda21⯥ꈫ叠\uda46⯻ꈽ叫\uda3c⯠ꈯ口\uda2b\uda46⯾ꈯ叽\uda3d⯹ꈡ叼\uda2a\uda4f⮾\uda4f⮾\uda4c⮼ꉷ\uda4c⮺ꉷ\uda4c⮸ꉽ\uda4c⮽ꉹ\uda4c⮿ꉻ\uda4c⮹ꉶ\uda4c⮺ꉼ\uda4c⮷ꉹ\uda4c⮺ꉿ\uda4c⮽ꉹ\uda4c⮼ꉾ\uda4c⮹ꉽ\uda4c⮹ꉶ\uda4c⮻ꉿ\uda4c⮷ꉾ\uda4c⮹ꉺ\uda4c⮼ꉼ\uda4c⮹ꉽ\uda4c⮻ꉼ\uda4c⮿ꉺ\uda4c⮷ꉻ\uda4c⮽ꉻ\uda4c⮻ꉼ\uda4c⮹ꉸ\uda4c⮿ꉸ\uda4c⮿ꉺ\uda4c⮷ꉶ\uda4c⮺ꉺ\uda4c⮽ꉾ\uda4c⮿ꉾ\uda4c⮹ꉽ\uda4c⮺ꉾ\uda4c⮷ꉷ\uda4c⮹ꉼ\uda4c⮺ꉽ\uda4c⮼ꉾ\uda4c⮺ꉼ\uda4c⮸ꉺ\uda4c⮽ꉹ\uda4c⮷ꉿ\uda4c⮽ꉽ\uda4e\uda57⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯜ꈫ司\uda21⯭ꈯ召\uda22⯫ꉣ叝\uda2b⯽ꈽ叧\uda21⯠\uda5e⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯚ꈣ厣\uda1a⯡ꈥ叫\uda20\uda59⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯉ꉣ反\uda2f⯾ꈺ叭\uda26⯯ꉣ叚\uda21⯥ꈫ叠\uda59⯖ꉣ叞\uda2f⯼ꈽ叫\uda63⯆ꉣ反\uda2f⯾ꈺ叭\uda26⯯ꉣ叚\uda21⯥ꈫ叠\uda4f⮿"};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static long m5476(long j) {
        short s = (short) (j & 65535);
        short s2 = (short) ((j >>> 16) & 65535);
        short s3 = (short) (s + s2);
        short s4 = (short) (s2 ^ s);
        return ((((short) ((s4 >>> 22) | (s4 << 10))) | (((short) (((short) ((s3 >>> 23) | (s3 << 9))) + s)) << 16)) << 16) | ((short) (((short) (((short) ((s << 13) | (s >>> 19))) ^ s4)) ^ (s4 << 5)));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m5477(long j) {
        String[] strArr = f6815;
        long j2 = 4294967295L & j;
        long j3 = (j2 ^ (j2 >>> 33)) * 7109453100751455733L;
        long jM5476 = m5476(((j3 ^ (j3 >>> 28)) * (-3808689974395783757L)) >>> 32);
        long j4 = (jM5476 >>> 32) & 65535;
        long jM54762 = m5476(jM5476);
        int i = (int) (((j >>> 32) ^ j4) ^ ((jM54762 >>> 16) & (-65536)));
        long jM54763 = m5476(jM54762) ^ (strArr[i / 8191].charAt(i % 8191) << 32);
        int i2 = (int) ((jM54763 >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3 + 1;
            jM54763 = m5476(jM54763) ^ (strArr[i4 / 8191].charAt(i4 % 8191) << 32);
            cArr[i3] = (char) ((jM54763 >>> 32) & 65535);
        }
        return new String(cArr);
    }
}
