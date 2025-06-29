package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.fragment.app.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0092 implements Parcelable {
    public static final Parcelable.Creator<C0092> CREATOR = new ـˏ.ٴˎ(26);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int f561;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final String f562;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f563;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean f564;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f565;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int f566;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final String f567;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean f568;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f569;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f570;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean f571;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f572;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final boolean f573;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final String f574;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final boolean f575;

    public C0092(Parcel parcel) {
        this.f570 = parcel.readString();
        this.f562 = parcel.readString();
        this.f565 = parcel.readInt() != 0;
        this.f569 = parcel.readInt() != 0;
        this.f563 = parcel.readInt();
        this.f572 = parcel.readInt();
        this.f574 = parcel.readString();
        this.f564 = parcel.readInt() != 0;
        this.f568 = parcel.readInt() != 0;
        this.f571 = parcel.readInt() != 0;
        this.f575 = parcel.readInt() != 0;
        this.f561 = parcel.readInt();
        this.f567 = parcel.readString();
        this.f566 = parcel.readInt();
        this.f573 = parcel.readInt() != 0;
    }

    public C0092(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f570 = abstractComponentCallbacksC0100.getClass().getName();
        this.f562 = abstractComponentCallbacksC0100.mWho;
        this.f565 = abstractComponentCallbacksC0100.mFromLayout;
        this.f569 = abstractComponentCallbacksC0100.mInDynamicContainer;
        this.f563 = abstractComponentCallbacksC0100.mFragmentId;
        this.f572 = abstractComponentCallbacksC0100.mContainerId;
        this.f574 = abstractComponentCallbacksC0100.mTag;
        this.f564 = abstractComponentCallbacksC0100.mRetainInstance;
        this.f568 = abstractComponentCallbacksC0100.mRemoving;
        this.f571 = abstractComponentCallbacksC0100.mDetached;
        this.f575 = abstractComponentCallbacksC0100.mHidden;
        this.f561 = abstractComponentCallbacksC0100.mMaxState.ordinal();
        this.f567 = abstractComponentCallbacksC0100.mTargetWho;
        this.f566 = abstractComponentCallbacksC0100.mTargetRequestCode;
        this.f573 = abstractComponentCallbacksC0100.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f570);
        sb.append(" (");
        sb.append(this.f562);
        sb.append(")}:");
        if (this.f565) {
            sb.append(" fromLayout");
        }
        if (this.f569) {
            sb.append(" dynamicContainer");
        }
        int i = this.f572;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f574;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f564) {
            sb.append(" retainInstance");
        }
        if (this.f568) {
            sb.append(" removing");
        }
        if (this.f571) {
            sb.append(" detached");
        }
        if (this.f575) {
            sb.append(" hidden");
        }
        String str2 = this.f567;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f566);
        }
        if (this.f573) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f570);
        parcel.writeString(this.f562);
        parcel.writeInt(this.f565 ? 1 : 0);
        parcel.writeInt(this.f569 ? 1 : 0);
        parcel.writeInt(this.f563);
        parcel.writeInt(this.f572);
        parcel.writeString(this.f574);
        parcel.writeInt(this.f564 ? 1 : 0);
        parcel.writeInt(this.f568 ? 1 : 0);
        parcel.writeInt(this.f571 ? 1 : 0);
        parcel.writeInt(this.f575 ? 1 : 0);
        parcel.writeInt(this.f561);
        parcel.writeString(this.f567);
        parcel.writeInt(this.f566);
        parcel.writeInt(this.f573 ? 1 : 0);
    }
}
