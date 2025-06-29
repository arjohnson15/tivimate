package p305;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p062.AbstractBinderC1444;
import p113.BinderC1816;
import p113.InterfaceC1818;
import p195.AbstractC2710;
import p417.AbstractC4753;
import p417.InterfaceC4770;

/* renamed from: ᐧˆ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3528 extends AbstractBinderC1444 implements InterfaceC4770 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f13656;

    public AbstractBinderC3528(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        AbstractC4753.m10685(bArr.length == 25);
        this.f13656 = Arrays.hashCode(bArr);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static byte[] m8413(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC1818 interfaceC1818Mo8415;
        if (obj != null && (obj instanceof InterfaceC4770)) {
            try {
                InterfaceC4770 interfaceC4770 = (InterfaceC4770) obj;
                if (interfaceC4770.mo8414() == this.f13656 && (interfaceC1818Mo8415 = interfaceC4770.mo8415()) != null) {
                    return Arrays.equals(mo8412(), (byte[]) BinderC1816.m5558(interfaceC1818Mo8415));
                }
                return false;
            } catch (RemoteException e) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13656;
    }

    @Override // p417.InterfaceC4770
    /* renamed from: ˉי, reason: contains not printable characters */
    public final int mo8414() {
        return this.f13656;
    }

    /* renamed from: ˋˉ */
    public abstract byte[] mo8412();

    @Override // p062.AbstractBinderC1444
    /* renamed from: ᵢʿ */
    public final boolean mo4997(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC1818 interfaceC1818Mo8415 = mo8415();
            parcel2.writeNoException();
            AbstractC2710.m6873(parcel2, interfaceC1818Mo8415);
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f13656);
        }
        return true;
    }

    @Override // p417.InterfaceC4770
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC1818 mo8415() {
        return new BinderC1816(mo8412());
    }
}
