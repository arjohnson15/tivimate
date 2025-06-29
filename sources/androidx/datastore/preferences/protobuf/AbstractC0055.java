package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0055 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract C0051 mo482();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m483(Object obj, InterfaceC0017 interfaceC0017) throws InvalidProtocolBufferException {
        int iMo273 = interfaceC0017.mo273();
        int i = iMo273 >>> 3;
        int i2 = iMo273 & 7;
        if (i2 == 0) {
            ((C0051) obj).m476(i << 3, Long.valueOf(interfaceC0017.mo274()));
            return true;
        }
        if (i2 == 1) {
            ((C0051) obj).m476((i << 3) | 1, Long.valueOf(interfaceC0017.mo263()));
            return true;
        }
        if (i2 == 2) {
            ((C0051) obj).m476((i << 3) | 2, interfaceC0017.mo277());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m218();
            }
            ((C0051) obj).m476((i << 3) | 5, Integer.valueOf(interfaceC0017.mo258()));
            return true;
        }
        C0051 c0051M475 = C0051.m475();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (interfaceC0017.mo253() != Integer.MAX_VALUE && m483(c0051M475, interfaceC0017)) {
        }
        if (i4 != interfaceC0017.mo273()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c0051M475.f460 = false;
        ((C0051) obj).m476(i3 | 3, c0051M475);
        return true;
    }
}
