package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import p334.C3789;

/* loaded from: classes2.dex */
final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public t() {
    }

    t(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                e eVar = e.c;
                return e.A(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.W(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.j0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.a0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.j0(objectInput));
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return ZonedDateTime.W(objectInput);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = y.d;
                return ZoneId.U(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.f0(objectInput);
            case 9:
                return r.U(objectInput);
            case 10:
                return OffsetDateTime.W(objectInput);
            case 11:
                int i2 = v.b;
                return v.S(objectInput.readInt());
            case 12:
                int i3 = x.c;
                return x.T(objectInput.readInt(), objectInput.readByte());
            case 13:
                return o.S(objectInput);
            case 14:
                return s.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((e) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).a0(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).t0(objectOutput);
                return;
            case 4:
                ((k) obj).r0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).h0(objectOutput);
                return;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ZonedDateTime) obj).Z(objectOutput);
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                ((y) obj).Z(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).g0(objectOutput);
                return;
            case 9:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((v) obj).W(objectOutput);
                return;
            case 12:
                ((x) obj).Z(objectOutput);
                return;
            case 13:
                ((o) obj).T(objectOutput);
                return;
            case 14:
                ((s) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
