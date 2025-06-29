package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import java.util.List;
import p334.C3789;

/* renamed from: androidx.datastore.preferences.protobuf.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0024 implements InterfaceC0017 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f383;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f384;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0080 f385;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f386 = 0;

    public C0024(AbstractC0080 abstractC0080) {
        Charset charset = AbstractC0077.f505;
        this.f385 = abstractC0080;
        abstractC0080.f507 = this;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m290(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m219();
        }
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static void m291(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m219();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(1);
        return this.f385.mo446();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(5);
        return this.f385.mo444();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m292(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f383 & 7) != i) {
            throw InvalidProtocolBufferException.m218();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ʽᐧ */
    public final void mo240(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0082;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo442();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo442();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0080.mo442()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Integer.valueOf(abstractC0080.mo442()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ʾʼ */
    public final Object mo241(InterfaceC0025 interfaceC0025, C0062 c0062) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(3);
        return m294(interfaceC0025, c0062);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ʿʼ */
    public final long mo242() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo464();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ʿˏ */
    public final void mo243(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0071;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo464();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo464();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC0080.mo464()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Long.valueOf(abstractC0080.mo464()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˆʿ */
    public final void mo244(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo455;
        if ((this.f383 & 7) != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        do {
            list.add(mo277());
            AbstractC0080 abstractC0080 = this.f385;
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == this.f383);
        this.f386 = iMo455;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˆᵔ */
    public final void mo245(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0071;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo469();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo469();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC0080.mo469()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Long.valueOf(abstractC0080.mo469()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˈٴ */
    public final void mo246(List list, InterfaceC0025 interfaceC0025, C0062 c0062) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo455;
        int i = this.f383;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.m218();
        }
        do {
            list.add(m294(interfaceC0025, c0062));
            AbstractC0080 abstractC0080 = this.f385;
            if (abstractC0080.mo454() || this.f386 != 0) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == i);
        this.f386 = iMo455;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˉי */
    public final void mo247(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0071;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo456();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo456();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC0080.mo456()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Long.valueOf(abstractC0080.mo456()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˉⁱ */
    public final long mo248() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo456();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˋˉ */
    public final String mo249() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(2);
        return this.f385.mo445();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˋˊ */
    public final void mo250(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m293(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˋⁱ */
    public final void mo251(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0082;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo441();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo441();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0080.mo441()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Integer.valueOf(abstractC0080.mo441()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˎˑ */
    public final void mo252(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0026;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 1) {
                abstractC0080.mo446();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            m291(abstractC0080.mo441());
            abstractC0080.mo446();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(abstractC0080.mo446()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo441 = abstractC0080.mo441();
        m291(iMo441);
        int iMo453 = abstractC0080.mo453() + iMo441;
        do {
            list.add(Double.valueOf(abstractC0080.mo446()));
        } while (abstractC0080.mo453() < iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˎٴ */
    public final int mo253() {
        int i = this.f386;
        if (i != 0) {
            this.f383 = i;
            this.f386 = 0;
        } else {
            this.f383 = this.f385.mo455();
        }
        int i2 = this.f383;
        if (i2 == 0 || i2 == this.f384) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final void m293(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo455;
        int iMo4552;
        if ((this.f383 & 7) != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        boolean z2 = list instanceof InterfaceC0019;
        AbstractC0080 abstractC0080 = this.f385;
        if (!z2 || z) {
            do {
                list.add(z ? mo249() : mo255());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        InterfaceC0019 interfaceC0019 = (InterfaceC0019) list;
        do {
            interfaceC0019.mo284(mo277());
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo4552 = abstractC0080.mo455();
            }
        } while (iMo4552 == this.f383);
        this.f386 = iMo4552;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r1.mo443(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˏʾ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo254(androidx.datastore.preferences.protobuf.C0085 r10, androidx.datastore.preferences.protobuf.C0050 r11, androidx.datastore.preferences.protobuf.C0062 r12) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.m292(r0)
            androidx.datastore.preferences.protobuf.ﹶˆ r1 = r9.f385
            int r2 = r1.mo441()
            int r2 = r1.mo458(r2)
            java.lang.String r3 = ""
            ᵎʽ.ﹶˆ r4 = r11.f456
            r5 = r4
        L13:
            int r6 = r9.mo253()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L59
            boolean r7 = r1.mo454()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L59
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L44
            if (r6 == r0) goto L39
            boolean r6 = r9.m296()     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            if (r6 == 0) goto L31
            goto L13
        L31:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            throw r6     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
        L37:
            r10 = move-exception
            goto L60
        L39:
            androidx.datastore.preferences.protobuf.ʽⁱ r6 = r11.f455     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            java.lang.Object r5 = r9.m295(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            goto L13
        L44:
            androidx.datastore.preferences.protobuf.ˏ r6 = r11.f457     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            r7 = 0
            java.lang.Object r3 = r9.m295(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            goto L13
        L4c:
            boolean r6 = r9.m296()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L53
            goto L13
        L53:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r10 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L59:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L37
            r1.mo443(r2)
            return
        L60:
            r1.mo443(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0024.mo254(androidx.datastore.preferences.protobuf.ﾞᐧ, androidx.datastore.preferences.protobuf.ـˆ, androidx.datastore.preferences.protobuf.ᴵʿ):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˏᴵ */
    public final String mo255() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(2);
        return this.f385.mo440();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˏᵢ */
    public final void mo256(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0082;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 2) {
                m290(abstractC0080.mo441());
                abstractC0080.mo451();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo451();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 2) {
            int iMo441 = abstractC0080.mo441();
            m290(iMo441);
            int iMo453 = abstractC0080.mo453() + iMo441;
            do {
                list.add(Integer.valueOf(abstractC0080.mo451()));
            } while (abstractC0080.mo453() < iMo453);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m218();
        }
        do {
            list.add(Integer.valueOf(abstractC0080.mo451()));
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == this.f383);
        this.f386 = iMo455;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˑʽ */
    public final int mo257() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo459();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ˑי */
    public final int mo258() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(5);
        return this.f385.mo466();
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final Object m294(InterfaceC0025 interfaceC0025, C0062 c0062) {
        int i = this.f384;
        this.f384 = ((this.f383 >>> 3) << 3) | 4;
        try {
            Object objMo302 = interfaceC0025.mo302();
            interfaceC0025.mo306(objMo302, this, c0062);
            interfaceC0025.mo303(objMo302);
            if (this.f383 == this.f384) {
                return objMo302;
            }
            throw InvalidProtocolBufferException.m219();
        } finally {
            this.f384 = i;
        }
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Object m295(EnumC0059 enumC0059, Class cls, C0062 c0062) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (enumC0059.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(mo274());
            case 3:
                return Long.valueOf(mo242());
            case 4:
                return Integer.valueOf(mo272());
            case 5:
                return Long.valueOf(mo263());
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(mo258());
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(mo269());
            case 8:
                return mo249();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m292(2);
                return m298(C0028.f387.m308(cls), c0062);
            case 11:
                return mo277();
            case 12:
                return Integer.valueOf(mo259());
            case 13:
                return Integer.valueOf(mo257());
            case 14:
                return Integer.valueOf(mo265());
            case 15:
                return Long.valueOf(mo271());
            case 16:
                return Integer.valueOf(mo275());
            case 17:
                return Long.valueOf(mo248());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: יʻ */
    public final int mo259() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo441();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ـˆ */
    public final void mo260(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0071;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 1) {
                abstractC0080.mo439();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            m291(abstractC0080.mo441());
            abstractC0080.mo439();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC0080.mo439()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo441 = abstractC0080.mo441();
        m291(iMo441);
        int iMo453 = abstractC0080.mo453() + iMo441;
        do {
            list.add(Long.valueOf(abstractC0080.mo439()));
        } while (abstractC0080.mo453() < iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ـﹶ */
    public final Object mo261(InterfaceC0025 interfaceC0025, C0062 c0062) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(2);
        return m298(interfaceC0025, c0062);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ٴˎ */
    public final void mo262(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0082;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 2) {
                m290(abstractC0080.mo441());
                abstractC0080.mo466();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo466();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 2) {
            int iMo441 = abstractC0080.mo441();
            m290(iMo441);
            int iMo453 = abstractC0080.mo453() + iMo441;
            do {
                list.add(Integer.valueOf(abstractC0080.mo466()));
            } while (abstractC0080.mo453() < iMo453);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m218();
        }
        do {
            list.add(Integer.valueOf(abstractC0080.mo466()));
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == this.f383);
        this.f386 = iMo455;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᐧʻ */
    public final long mo263() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(1);
        return this.f385.mo439();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᐧˋ */
    public final void mo264(List list, InterfaceC0025 interfaceC0025, C0062 c0062) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo455;
        int i = this.f383;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        do {
            list.add(m298(interfaceC0025, c0062));
            AbstractC0080 abstractC0080 = this.f385;
            if (abstractC0080.mo454() || this.f386 != 0) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == i);
        this.f386 = iMo455;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᐧⁱ */
    public final int mo265() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(5);
        return this.f385.mo451();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᴵʼ */
    public final void mo266(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0082;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo470();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo470();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0080.mo470()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Integer.valueOf(abstractC0080.mo470()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᴵʿ */
    public final void mo267(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0078;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo448();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo448();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC0080.mo448()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Boolean.valueOf(abstractC0080.mo448()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᵎˏ */
    public final void mo268(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m293(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᵎـ */
    public final boolean mo269() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo448();
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final boolean m296() {
        int i;
        AbstractC0080 abstractC0080 = this.f385;
        if (abstractC0080.mo454() || (i = this.f383) == this.f384) {
            return false;
        }
        return abstractC0080.mo468(i);
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m297(int i) throws InvalidProtocolBufferException {
        if (this.f385.mo453() != i) {
            throw InvalidProtocolBufferException.m222();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ᵢʿ */
    public final void mo270(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0071;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 1) {
                abstractC0080.mo467();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            m291(abstractC0080.mo441());
            abstractC0080.mo467();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC0080.mo467()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo441 = abstractC0080.mo441();
        m291(iMo441);
        int iMo453 = abstractC0080.mo453() + iMo441;
        do {
            list.add(Long.valueOf(abstractC0080.mo467()));
        } while (abstractC0080.mo453() < iMo453);
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final Object m298(InterfaceC0025 interfaceC0025, C0062 c0062) throws InvalidProtocolBufferException {
        AbstractC0080 abstractC0080 = this.f385;
        int iMo441 = abstractC0080.mo441();
        if (abstractC0080.f508 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo458 = abstractC0080.mo458(iMo441);
        Object objMo302 = interfaceC0025.mo302();
        abstractC0080.f508++;
        interfaceC0025.mo306(objMo302, this, c0062);
        interfaceC0025.mo303(objMo302);
        abstractC0080.mo437(0);
        abstractC0080.f508--;
        abstractC0080.mo443(iMo458);
        return objMo302;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﹳˎ */
    public final long mo271() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(1);
        return this.f385.mo467();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﹳˑ */
    public final int mo272() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo470();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﹳﹳ */
    public final int mo273() {
        return this.f383;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﹳﹶ */
    public final long mo274() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo469();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﹶˆ */
    public final int mo275() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(0);
        return this.f385.mo442();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﾞʽ */
    public final void mo276(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0065;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 2) {
                m290(abstractC0080.mo441());
                abstractC0080.mo444();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo444();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 2) {
            int iMo441 = abstractC0080.mo441();
            m290(iMo441);
            int iMo453 = abstractC0080.mo453() + iMo441;
            do {
                list.add(Float.valueOf(abstractC0080.mo444()));
            } while (abstractC0080.mo453() < iMo453);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m218();
        }
        do {
            list.add(Float.valueOf(abstractC0080.mo444()));
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == this.f383);
        this.f386 = iMo455;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﾞˊ */
    public final C0056 mo277() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m292(2);
        return this.f385.mo460();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0017
    /* renamed from: ﾞᐧ */
    public final void mo278(List list) throws InvalidProtocolBufferException {
        int iMo455;
        boolean z = list instanceof AbstractC0082;
        AbstractC0080 abstractC0080 = this.f385;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f383 & 7;
            if (i == 0) {
                abstractC0080.mo459();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m218();
            }
            abstractC0080.mo441();
            abstractC0080.mo459();
            throw null;
        }
        int i2 = this.f383 & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0080.mo459()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f383);
            this.f386 = iMo455;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m218();
        }
        int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            list.add(Integer.valueOf(abstractC0080.mo459()));
        } while (abstractC0080.mo453() < iMo453);
        m297(iMo453);
    }
}
