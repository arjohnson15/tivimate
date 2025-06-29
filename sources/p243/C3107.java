package p243;

import android.text.SpannableStringBuilder;
import p166.C2428;

/* renamed from: ˑﾞ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3107 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String f11991;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C3107 f11992;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String f11993;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3107 f11994;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f11995;

    static {
        C2428 c2428 = AbstractC3112.f12003;
        f11991 = Character.toString((char) 8206);
        f11993 = Character.toString((char) 8207);
        f11994 = new C3107(false);
        f11992 = new C3107(true);
    }

    public C3107(boolean z) {
        C2428 c2428 = AbstractC3112.f12004;
        this.f11995 = z;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m7622(CharSequence charSequence) {
        C3110 c3110 = new C3110(charSequence);
        c3110.f11998 = c3110.f11997;
        int i = 0;
        int i2 = 0;
        while (c3110.f11998 > 0) {
            byte bM7644 = c3110.m7644();
            if (bM7644 != 0) {
                if (bM7644 == 1 || bM7644 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (bM7644 != 9) {
                    switch (bM7644) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r0.f11998 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        switch(r0.m7644()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 0;
     */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m7623(java.lang.CharSequence r9) {
        /*
            ˑﾞ.ـﹶ r0 = new ˑﾞ.ـﹶ
            r0.<init>(r9)
            r9 = 0
            r0.f11998 = r9
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.f11998
            int r5 = r0.f11997
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L70
            if (r1 != 0) goto L70
            java.lang.CharSequence r5 = r0.f11999
            char r4 = r5.charAt(r4)
            r0.f12000 = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f11998
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f11998
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f11998 = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f11998
            int r4 = r4 + r6
            r0.f11998 = r4
            char r4 = r0.f12000
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = p243.C3110.f11996
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L6a
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6e
        L5a:
            int r3 = r3 + (-1)
            r2 = 0
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = 1
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = -1
            goto Lb
        L66:
            if (r3 != 0) goto L6e
        L68:
            r9 = 1
            goto L8f
        L6a:
            if (r3 != 0) goto L6e
        L6c:
            r9 = -1
            goto L8f
        L6e:
            r1 = r3
            goto Lb
        L70:
            if (r1 != 0) goto L73
            goto L8f
        L73:
            if (r2 == 0) goto L77
            r9 = r2
            goto L8f
        L77:
            int r2 = r0.f11998
            if (r2 <= 0) goto L8f
            byte r2 = r0.m7644()
            switch(r2) {
                case 14: goto L8c;
                case 15: goto L8c;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r3 = r3 + 1
            goto L77
        L86:
            if (r1 != r3) goto L89
            goto L68
        L89:
            int r3 = r3 + (-1)
            goto L77
        L8c:
            if (r1 != r3) goto L89
            goto L6c
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p243.C3107.m7623(java.lang.CharSequence):int");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final SpannableStringBuilder m7624(CharSequence charSequence) {
        C2428 c2428 = AbstractC3112.f12003;
        if (charSequence == null) {
            return null;
        }
        boolean zM6529 = c2428.m6529(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM65292 = (zM6529 ? AbstractC3112.f12002 : AbstractC3112.f12004).m6529(charSequence, charSequence.length());
        String str = "";
        String str2 = f11993;
        String str3 = f11991;
        boolean z = this.f11995;
        spannableStringBuilder.append((CharSequence) ((z || !(zM65292 || m7623(charSequence) == 1)) ? (!z || (zM65292 && m7623(charSequence) != -1)) ? "" : str2 : str3));
        if (zM6529 != z) {
            spannableStringBuilder.append(zM6529 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM65293 = (zM6529 ? AbstractC3112.f12002 : AbstractC3112.f12004).m6529(charSequence, charSequence.length());
        if (!z && (zM65293 || m7622(charSequence) == 1)) {
            str = str3;
        } else if (z && (!zM65293 || m7622(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
