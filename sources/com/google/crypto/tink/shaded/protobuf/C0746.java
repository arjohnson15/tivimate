package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0080;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0746 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f3586;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f3587;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0080 f3588;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f3589 = 0;

    public C0746(AbstractC0080 abstractC0080) {
        AbstractC0731.m2954(abstractC0080, "input");
        this.f3588 = abstractC0080;
        abstractC0080.f507 = this;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static void m3103(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m2925();
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static void m3104(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m2925();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3105(Object obj, InterfaceC0727 interfaceC0727, C0747 c0747) {
        int i = this.f3587;
        this.f3587 = ((this.f3586 >>> 3) << 3) | 4;
        try {
            interfaceC0727.mo2940(obj, this, c0747);
            if (this.f3586 == this.f3587) {
            } else {
                throw InvalidProtocolBufferException.m2925();
            }
        } finally {
            this.f3587 = i;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC0748 m3106() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m3110(2);
        return this.f3588.mo574();
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m3107(int i) throws InvalidProtocolBufferException {
        if (this.f3588.mo453() != i) {
            throw InvalidProtocolBufferException.m2926();
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m3108(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0782;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0080.mo439()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo441 = abstractC0080.mo441();
            m3103(iMo441);
            int iMo453 = abstractC0080.mo453() + iMo441;
            do {
                list.add(Long.valueOf(abstractC0080.mo439()));
            } while (abstractC0080.mo453() < iMo453);
            return;
        }
        AbstractC0782 abstractC0782 = (AbstractC0782) list;
        int i2 = this.f3586 & 7;
        if (i2 == 1) {
            do {
                abstractC0782.m3222(abstractC0080.mo439());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4412 = abstractC0080.mo441();
        m3103(iMo4412);
        int iMo4532 = abstractC0080.mo453() + iMo4412;
        do {
            abstractC0782.m3222(abstractC0080.mo439());
        } while (abstractC0080.mo453() < iMo4532);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m3109(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0784;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0080.mo470()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Integer.valueOf(abstractC0080.mo470()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0784 abstractC0784 = (AbstractC0784) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0784.m3230(abstractC0080.mo470());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0784.m3230(abstractC0080.mo470());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m3110(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f3586 & 7) != i) {
            throw InvalidProtocolBufferException.m2923();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m3111(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0782;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0080.mo469()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Long.valueOf(abstractC0080.mo469()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0782 abstractC0782 = (AbstractC0782) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0782.m3222(abstractC0080.mo469());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0782.m3222(abstractC0080.mo469());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m3112(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo440;
        int iMo455;
        int iMo4552;
        if ((this.f3586 & 7) != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        boolean z2 = list instanceof InterfaceC0742;
        AbstractC0080 abstractC0080 = this.f3588;
        if (z2 && !z) {
            InterfaceC0742 interfaceC0742 = (InterfaceC0742) list;
            do {
                interfaceC0742.mo2931(m3106());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        do {
            if (z) {
                m3110(2);
                strMo440 = abstractC0080.mo445();
            } else {
                m3110(2);
                strMo440 = abstractC0080.mo440();
            }
            list.add(strMo440);
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == this.f3586);
        this.f3589 = iMo455;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m3113(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0769;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 2) {
                int iMo441 = abstractC0080.mo441();
                m3104(iMo441);
                int iMo453 = abstractC0080.mo453() + iMo441;
                do {
                    list.add(Float.valueOf(abstractC0080.mo444()));
                } while (abstractC0080.mo453() < iMo453);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m2923();
            }
            do {
                list.add(Float.valueOf(abstractC0080.mo444()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f3586);
            this.f3589 = iMo455;
            return;
        }
        AbstractC0769 abstractC0769 = (AbstractC0769) list;
        int i2 = this.f3586 & 7;
        if (i2 == 2) {
            int iMo4412 = abstractC0080.mo441();
            m3104(iMo4412);
            int iMo4532 = abstractC0080.mo453() + iMo4412;
            do {
                abstractC0769.m3202(abstractC0080.mo444());
            } while (abstractC0080.mo453() < iMo4532);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m2923();
        }
        do {
            abstractC0769.m3202(abstractC0080.mo444());
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo4552 = abstractC0080.mo455();
            }
        } while (iMo4552 == this.f3586);
        this.f3589 = iMo4552;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m3114(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0782;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0080.mo467()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo441 = abstractC0080.mo441();
            m3103(iMo441);
            int iMo453 = abstractC0080.mo453() + iMo441;
            do {
                list.add(Long.valueOf(abstractC0080.mo467()));
            } while (abstractC0080.mo453() < iMo453);
            return;
        }
        AbstractC0782 abstractC0782 = (AbstractC0782) list;
        int i2 = this.f3586 & 7;
        if (i2 == 1) {
            do {
                abstractC0782.m3222(abstractC0080.mo467());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4412 = abstractC0080.mo441();
        m3103(iMo4412);
        int iMo4532 = abstractC0080.mo453() + iMo4412;
        do {
            abstractC0782.m3222(abstractC0080.mo467());
        } while (abstractC0080.mo453() < iMo4532);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m3115(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0784;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0080.mo459()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Integer.valueOf(abstractC0080.mo459()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0784 abstractC0784 = (AbstractC0784) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0784.m3230(abstractC0080.mo459());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0784.m3230(abstractC0080.mo459());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m3116(Object obj, InterfaceC0727 interfaceC0727, C0747 c0747) throws InvalidProtocolBufferException {
        AbstractC0080 abstractC0080 = this.f3588;
        int iMo441 = abstractC0080.mo441();
        if (abstractC0080.f508 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo458 = abstractC0080.mo458(iMo441);
        abstractC0080.f508++;
        interfaceC0727.mo2940(obj, this, c0747);
        abstractC0080.mo437(0);
        abstractC0080.f508--;
        abstractC0080.mo443(iMo458);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m3117(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0784;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0080.mo442()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Integer.valueOf(abstractC0080.mo442()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0784 abstractC0784 = (AbstractC0784) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0784.m3230(abstractC0080.mo442());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0784.m3230(abstractC0080.mo442());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m3118() {
        int i = this.f3589;
        if (i != 0) {
            this.f3586 = i;
            this.f3589 = 0;
        } else {
            this.f3586 = this.f3588.mo455();
        }
        int i2 = this.f3586;
        if (i2 == 0 || i2 == this.f3587) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m3119(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo455;
        if ((this.f3586 & 7) != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        do {
            list.add(m3106());
            AbstractC0080 abstractC0080 = this.f3588;
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == this.f3586);
        this.f3589 = iMo455;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m3120(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0739;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC0080.mo446()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo441 = abstractC0080.mo441();
            m3103(iMo441);
            int iMo453 = abstractC0080.mo453() + iMo441;
            do {
                list.add(Double.valueOf(abstractC0080.mo446()));
            } while (abstractC0080.mo453() < iMo453);
            return;
        }
        AbstractC0739 abstractC0739 = (AbstractC0739) list;
        int i2 = this.f3586 & 7;
        if (i2 == 1) {
            do {
                abstractC0739.m3052(abstractC0080.mo446());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4412 = abstractC0080.mo441();
        m3103(iMo4412);
        int iMo4532 = abstractC0080.mo453() + iMo4412;
        do {
            abstractC0739.m3052(abstractC0080.mo446());
        } while (abstractC0080.mo453() < iMo4532);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m3121(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0784;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 2) {
                int iMo441 = abstractC0080.mo441();
                m3104(iMo441);
                int iMo453 = abstractC0080.mo453() + iMo441;
                do {
                    list.add(Integer.valueOf(abstractC0080.mo451()));
                } while (abstractC0080.mo453() < iMo453);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m2923();
            }
            do {
                list.add(Integer.valueOf(abstractC0080.mo451()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f3586);
            this.f3589 = iMo455;
            return;
        }
        AbstractC0784 abstractC0784 = (AbstractC0784) list;
        int i2 = this.f3586 & 7;
        if (i2 == 2) {
            int iMo4412 = abstractC0080.mo441();
            m3104(iMo4412);
            int iMo4532 = abstractC0080.mo453() + iMo4412;
            do {
                abstractC0784.m3230(abstractC0080.mo451());
            } while (abstractC0080.mo453() < iMo4532);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m2923();
        }
        do {
            abstractC0784.m3230(abstractC0080.mo451());
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo4552 = abstractC0080.mo455();
            }
        } while (iMo4552 == this.f3586);
        this.f3589 = iMo4552;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m3122(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0784;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0080.mo441()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Integer.valueOf(abstractC0080.mo441()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0784 abstractC0784 = (AbstractC0784) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0784.m3230(abstractC0080.mo441());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0784.m3230(abstractC0080.mo441());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m3123(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0782;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0080.mo456()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Long.valueOf(abstractC0080.mo456()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0782 abstractC0782 = (AbstractC0782) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0782.m3222(abstractC0080.mo456());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0782.m3222(abstractC0080.mo456());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m3124(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0782;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0080.mo464()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Long.valueOf(abstractC0080.mo464()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0782 abstractC0782 = (AbstractC0782) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0782.m3222(abstractC0080.mo464());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0782.m3222(abstractC0080.mo464());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m3125(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0781;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC0080.mo448()));
                    if (abstractC0080.mo454()) {
                        return;
                    } else {
                        iMo455 = abstractC0080.mo455();
                    }
                } while (iMo455 == this.f3586);
                this.f3589 = iMo455;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m2923();
            }
            int iMo453 = abstractC0080.mo453() + abstractC0080.mo441();
            do {
                list.add(Boolean.valueOf(abstractC0080.mo448()));
            } while (abstractC0080.mo453() < iMo453);
            m3107(iMo453);
            return;
        }
        AbstractC0781 abstractC0781 = (AbstractC0781) list;
        int i2 = this.f3586 & 7;
        if (i2 == 0) {
            do {
                abstractC0781.m3221(abstractC0080.mo448());
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo4552 = abstractC0080.mo455();
                }
            } while (iMo4552 == this.f3586);
            this.f3589 = iMo4552;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        int iMo4532 = abstractC0080.mo453() + abstractC0080.mo441();
        do {
            abstractC0781.m3221(abstractC0080.mo448());
        } while (abstractC0080.mo453() < iMo4532);
        m3107(iMo4532);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m3126(List list) throws InvalidProtocolBufferException {
        int iMo455;
        int iMo4552;
        boolean z = list instanceof AbstractC0784;
        AbstractC0080 abstractC0080 = this.f3588;
        if (!z) {
            int i = this.f3586 & 7;
            if (i == 2) {
                int iMo441 = abstractC0080.mo441();
                m3104(iMo441);
                int iMo453 = abstractC0080.mo453() + iMo441;
                do {
                    list.add(Integer.valueOf(abstractC0080.mo466()));
                } while (abstractC0080.mo453() < iMo453);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m2923();
            }
            do {
                list.add(Integer.valueOf(abstractC0080.mo466()));
                if (abstractC0080.mo454()) {
                    return;
                } else {
                    iMo455 = abstractC0080.mo455();
                }
            } while (iMo455 == this.f3586);
            this.f3589 = iMo455;
            return;
        }
        AbstractC0784 abstractC0784 = (AbstractC0784) list;
        int i2 = this.f3586 & 7;
        if (i2 == 2) {
            int iMo4412 = abstractC0080.mo441();
            m3104(iMo4412);
            int iMo4532 = abstractC0080.mo453() + iMo4412;
            do {
                abstractC0784.m3230(abstractC0080.mo466());
            } while (abstractC0080.mo453() < iMo4532);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m2923();
        }
        do {
            abstractC0784.m3230(abstractC0080.mo466());
            if (abstractC0080.mo454()) {
                return;
            } else {
                iMo4552 = abstractC0080.mo455();
            }
        } while (iMo4552 == this.f3586);
        this.f3589 = iMo4552;
    }
}
