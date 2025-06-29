package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import p334.C3789;

/* loaded from: classes2.dex */
final class D implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private byte a;
    private Object b;

    public D() {
    }

    D(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objR;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                int i = AbstractC5396a.c;
                objR = AbstractC5396a.r(objectInput.readUTF());
                break;
            case 2:
                objR = ((ChronoLocalDate) objectInput.readObject()).y((j$.time.k) objectInput.readObject());
                break;
            case 3:
                objR = ((ChronoLocalDateTime) objectInput.readObject()).o((ZoneOffset) objectInput.readObject()).j((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = w.d;
                int i2 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                u.d.getClass();
                objR = new w(LocalDate.of(i2, b2, b3));
                break;
            case 5:
                x xVar = x.d;
                objR = x.u(objectInput.readByte());
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                n nVar = (n) objectInput.readObject();
                int i3 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                nVar.getClass();
                objR = p.Y(nVar, i3, b4, b5);
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                int i4 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                z.d.getClass();
                objR = new B(LocalDate.of(i4 + 1911, b6, b7));
                break;
            case 8:
                int i5 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                F.d.getClass();
                objR = new H(LocalDate.of(i5 - 543, b8, b9));
                break;
            case 9:
                int i6 = C5401f.e;
                objR = new C5401f(AbstractC5396a.r(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objR;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC5396a) obj).m());
                return;
            case 2:
                ((C5400e) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((j) obj).writeExternal(objectOutput);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(wVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(wVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(wVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((x) obj).G(objectOutput);
                return;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                ((p) obj).writeExternal(objectOutput);
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                B b2 = (B) obj;
                b2.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(b2, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(b2, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(b2, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                H h = (H) obj;
                h.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(h, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(h, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(h, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C5401f) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
