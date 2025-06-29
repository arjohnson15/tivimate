package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0482 implements IInterface {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final IBinder f2816;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f2817;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f2818;

    public /* synthetic */ AbstractC0482(IBinder iBinder, String str, int i) {
        this.f2818 = i;
        this.f2816 = iBinder;
        this.f2817 = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f2818) {
        }
        return this.f2816;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Parcel m2287() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2817);
        return parcelObtain;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Parcel m2288(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2816.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Parcel m2289() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2817);
        return parcelObtain;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Parcel m2290(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2816.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public void m2291(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2816.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
