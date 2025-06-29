package p225;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import androidx.datastore.preferences.protobuf.AbstractC0080;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
import p009.C0996;
import p200.C2755;
import p265.InterfaceMenuItemC3260;
import p320.MenuItemC3659;
import ˈⁱ.ﹳﹳ;

/* renamed from: ˏᵢ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2995 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f11516;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f11517;

    public AbstractC2995(Context context) {
        this.f11517 = context;
    }

    public AbstractC2995(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017) {
        this.f11516 = layoutInflaterFactory2C3017;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static byte[] m7415(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte[] m7416(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC0080) this.f11516).m575(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(ﹳﹳ.ʿʼ(bArr4, m7415(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            AbstractC0080 abstractC0080 = (AbstractC0080) this.f11517;
            abstractC0080.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            abstractC0080.m571(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public abstract AbstractC0080 mo7417(int i, byte[] bArr);

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m7418() {
        m7420();
        IntentFilter intentFilterMo7411 = mo7411();
        if (intentFilterMo7411.countActions() == 0) {
            return;
        }
        if (((C0996) this.f11517) == null) {
            this.f11517 = new C0996(1, this);
        }
        ((LayoutInflaterFactory2C3017) this.f11516).f11657.registerReceiver((C0996) this.f11517, intentFilterMo7411);
    }

    /* renamed from: ˏʾ */
    public abstract void mo7409();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public MenuItem m7419(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC3260)) {
            return menuItem;
        }
        InterfaceMenuItemC3260 interfaceMenuItemC3260 = (InterfaceMenuItemC3260) menuItem;
        if (((C2755) this.f11516) == null) {
            this.f11516 = new C2755(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C2755) this.f11516).get(interfaceMenuItemC3260);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC3659 menuItemC3659 = new MenuItemC3659((Context) this.f11517, interfaceMenuItemC3260);
        ((C2755) this.f11516).put(interfaceMenuItemC3260, menuItemC3659);
        return menuItemC3659;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m7420() {
        C0996 c0996 = (C0996) this.f11517;
        if (c0996 != null) {
            try {
                ((LayoutInflaterFactory2C3017) this.f11516).f11657.unregisterReceiver(c0996);
            } catch (IllegalArgumentException unused) {
            }
            this.f11517 = null;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m7421(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        AbstractC0080 abstractC0080 = (AbstractC0080) this.f11517;
        abstractC0080.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        abstractC0080.m571(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((AbstractC0080) this.f11516).m575(0, bArr).get(bArr4);
        byte[] bArr5 = ﹳﹳ.ʿʼ(bArr4, m7415(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArr5);
    }

    /* renamed from: ᐧʻ */
    public abstract int mo7410();

    /* renamed from: ﹳﹳ */
    public abstract IntentFilter mo7411();
}
