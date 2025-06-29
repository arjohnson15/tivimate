package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.C0315;
import com.google.android.gms.internal.play_billing.C0615;
import com.google.crypto.tink.shaded.protobuf.C0762;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0016 implements Iterator {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f361;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f362;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f363 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f360 = 0;

    public C0016(C0056 c0056) {
        this.f362 = c0056;
        this.f361 = c0056.size();
    }

    public C0016(C0315 c0315) {
        this.f362 = c0315;
        this.f361 = c0315.mo1834();
    }

    public C0016(C0615 c0615) {
        this.f362 = c0615;
        this.f361 = c0615.mo2574();
    }

    public C0016(C0762 c0762) {
        this.f362 = c0762;
        this.f361 = c0762.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f363) {
            case 0:
                if (this.f360 < this.f361) {
                }
                break;
            case 1:
                if (this.f360 < this.f361) {
                }
                break;
            case 2:
                if (this.f360 < this.f361) {
                }
                break;
            default:
                if (this.f360 < this.f361) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f363) {
            case 0:
                int i = this.f360;
                if (i >= this.f361) {
                    throw new NoSuchElementException();
                }
                this.f360 = i + 1;
                return Byte.valueOf(((C0056) this.f362).f469[i]);
            case 1:
                int i2 = this.f360;
                if (i2 >= this.f361) {
                    throw new NoSuchElementException();
                }
                this.f360 = i2 + 1;
                return Byte.valueOf(((C0315) this.f362).mo1837(i2));
            case 2:
                int i3 = this.f360;
                if (i3 >= this.f361) {
                    throw new NoSuchElementException();
                }
                this.f360 = i3 + 1;
                return Byte.valueOf(((C0615) this.f362).mo2573(i3));
            default:
                int i4 = this.f360;
                if (i4 >= this.f361) {
                    throw new NoSuchElementException();
                }
                this.f360 = i4 + 1;
                return Byte.valueOf(((C0762) this.f362).mo3170(i4));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f363) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
