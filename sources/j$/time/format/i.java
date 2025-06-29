package j$.time.format;

/* loaded from: classes2.dex */
final class i implements InterfaceC5410f {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    static int b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    @Override // j$.time.format.InterfaceC5410f
    public final boolean n(z zVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lE = zVar.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (lE != null) {
                    sb.append("GMT");
                    int i = j$.com.android.tools.r8.a.i(lE.longValue());
                    if (i != 0) {
                        int iAbs = Math.abs((i / 3600) % 100);
                        int iAbs2 = Math.abs((i / 60) % 60);
                        int iAbs3 = Math.abs(i % 60);
                        sb.append(i < 0 ? "-" : "+");
                        if (((TextStyle) this.b) != TextStyle.FULL) {
                            if (iAbs >= 10) {
                                sb.append((char) ((iAbs / 10) + 48));
                            }
                            sb.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs2);
                                if (iAbs3 != 0) {
                                    sb.append(':');
                                    a(sb, iAbs3);
                                    break;
                                }
                            }
                        } else {
                            a(sb, iAbs);
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sb.append((String) this.b);
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0121 A[PHI: r2 r7
  0x0121: PHI (r2v6 int) = (r2v5 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int) binds: [B:50:0x00cb, B:55:0x00db, B:57:0x00e1, B:58:0x00e3, B:60:0x00e9, B:62:0x00f5, B:63:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x0121: PHI (r7v1 int) = (r7v0 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:50:0x00cb, B:55:0x00db, B:57:0x00e1, B:58:0x00e3, B:60:0x00e9, B:62:0x00f5, B:63:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // j$.time.format.InterfaceC5410f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(j$.time.format.w r13, java.lang.CharSequence r14, int r15) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.p(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) this.b) + ")";
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }
}
