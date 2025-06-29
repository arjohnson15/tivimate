package p018;

import com.hierynomus.security.SecurityException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.UUID;
import p078.AbstractC1685;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1689;
import p143.C2226;
import p143.C2228;
import p283.C3380;
import p283.InterfaceC3379;
import p332.C3779;

/* renamed from: ʻⁱ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1116 extends AbstractC1685 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Object f4733;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4734 = 0;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Object f4735;

    public /* synthetic */ C1116(int i, EnumC1689 enumC1689, EnumC1683 enumC1683, long j, long j2) {
        super(i, enumC1689, enumC1683, j, j2);
    }

    public C1116(C2226 c2226, AbstractC1685 abstractC1685) {
        this.f4733 = c2226;
        this.f4735 = abstractC1685;
    }

    @Override // p078.AbstractC1685
    public String toString() {
        switch (this.f4734) {
            case 1:
                return ((AbstractC1685) this.f4735).toString();
            default:
                return super.toString();
        }
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ void mo4127(C3380 c3380) {
        switch (this.f4734) {
            case 1:
                mo4127(c3380);
                break;
            default:
                super.mo4127(c3380);
                break;
        }
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public int mo4128() {
        switch (this.f4734) {
            case 1:
                return ((AbstractC1685) this.f4735).mo4128();
            default:
                return super.mo4128();
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public InterfaceC3379 m4129() {
        switch (this.f4734) {
            case 1:
                return (C1696) ((AbstractC1685) this.f4735).ᵢʿ();
            default:
                return super.ᵢʿ();
        }
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public void mo4126(C3380 c3380) {
        switch (this.f4734) {
            case 0:
                c3380.m8847(this.f6557);
                EnumSet enumSet = (EnumSet) this.f4735;
                c3380.m8847(enumSet.size());
                c3380.m8847(1);
                c3380.m8239(2);
                Iterator it = enumSet.iterator();
                while (it.hasNext()) {
                    if (((EnumC1689) it.next()).m5367()) {
                        throw new UnsupportedOperationException("SMB 3.x support is not yet implemented");
                    }
                }
                c3380.m8238();
                UUID uuid = (UUID) this.f4733;
                long leastSignificantBits = uuid.getLeastSignificantBits();
                long mostSignificantBits = uuid.getMostSignificantBits();
                c3380.m8844(mostSignificantBits >>> 32);
                c3380.m8847((int) ((mostSignificantBits >>> 16) & 65535));
                c3380.m8847((int) (mostSignificantBits & 65535));
                C3779.f14621.m8856(c3380, leastSignificantBits);
                EnumC1689 enumC1689 = EnumC1689.f6577;
                if (enumSet.contains(enumC1689)) {
                    throw new UnsupportedOperationException("SMB 3.x support is not yet implemented");
                }
                c3380.m8238();
                c3380.m8238();
                Iterator it2 = enumSet.iterator();
                while (it2.hasNext()) {
                    c3380.m8847(((EnumC1689) it2.next()).f6583);
                }
                int size = ((enumSet.size() * 2) + 34) % 8;
                if (size > 0) {
                    c3380.m8239(8 - size);
                }
                if (enumSet.contains(enumC1689)) {
                    throw new UnsupportedOperationException("SMB 3.x support is not yet implemented");
                }
                return;
            default:
                super.mo4126(c3380);
                return;
        }
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public void mo4127(C3380 c3380) {
        switch (this.f4734) {
            case 1:
                AbstractC1685 abstractC1685 = (AbstractC1685) this.f4735;
                try {
                    ((C1696) abstractC1685.ᵢʿ()).f6601 |= 8;
                    int i = c3380.f14616;
                    C2228 c2228 = new C2228(this, c3380);
                    abstractC1685.mo4127(c2228);
                    System.arraycopy(c2228.f8870.mo6781(), 0, c3380.f14615, i + 48, 16);
                    return;
                } catch (SecurityException e) {
                    throw new IllegalStateException(e);
                }
            default:
                super.mo4127(c3380);
                return;
        }
    }

    @Override // p078.AbstractC1685
    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public AbstractC1685 mo4131() {
        switch (this.f4734) {
            case 1:
                return ((AbstractC1685) this.f4735).mo4131();
            default:
                return this;
        }
    }
}
