package p417;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import p177.AbstractC2491;
import p195.AbstractC2710;
import p305.C3542;

/* renamed from: ﹳᴵ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4765 extends AbstractC2491 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f18272;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f18273;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public IBinder f18274;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Account f18275;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f18276;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final String f18277;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final boolean f18278;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C3542[] f18279;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public String f18280;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18281;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C3542[] f18282;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Scope[] f18283;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Bundle f18284;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final boolean f18285;
    public static final Parcelable.Creator<C4765> CREATOR = new C4749(1);

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final Scope[] f18271 = new Scope[0];

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static final C3542[] f18270 = new C3542[0];

    public C4765(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C3542[] c3542Arr, C3542[] c3542Arr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f18271 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C3542[] c3542Arr3 = f18270;
        C3542[] c3542Arr4 = c3542Arr == null ? c3542Arr3 : c3542Arr;
        c3542Arr3 = c3542Arr2 != null ? c3542Arr2 : c3542Arr3;
        this.f18281 = i;
        this.f18273 = i2;
        this.f18276 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f18280 = "com.google.android.gms";
        } else {
            this.f18280 = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC4763.f18263;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC4759 c4771 = iInterfaceQueryLocalInterface instanceof InterfaceC4759 ? (InterfaceC4759) iInterfaceQueryLocalInterface : new C4771(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (c4771 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        C4771 c47712 = (C4771) c4771;
                        Parcel parcelM2288 = c47712.m2288(c47712.m2289(), 2);
                        Account account3 = (Account) AbstractC2710.m6874(parcelM2288, Account.CREATOR);
                        parcelM2288.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f18274 = iBinder;
            account2 = account;
        }
        this.f18275 = account2;
        this.f18283 = scopeArr2;
        this.f18284 = bundle2;
        this.f18279 = c3542Arr4;
        this.f18282 = c3542Arr3;
        this.f18285 = z;
        this.f18272 = i4;
        this.f18278 = z2;
        this.f18277 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C4749.m10672(this, parcel, i);
    }
}
