package p456;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractBinderC0558;
import com.google.android.gms.internal.measurement.AbstractC0522;
import com.google.android.gms.internal.measurement.C0329;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p029.RunnableC1181;
import p181.CallableC2509;
import p181.CallableC2516;
import p238.AbstractC3095;
import p251.RunnableC3129;
import p305.AbstractC3537;
import p305.C3532;
import p334.C3789;
import p417.AbstractC4753;
import p428.CallableC4922;

/* renamed from: ﾞⁱ.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class BinderC5240 extends AbstractBinderC0558 implements InterfaceC5311 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Boolean f20137;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String f20138;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5273 f20139;

    public BinderC5240(C5273 c5273) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC4753.m10683(c5273);
        this.f20139 = c5273;
        this.f20138 = null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0558
    /* renamed from: ʽᐧ */
    public final boolean mo1630(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        ArrayList arrayList;
        switch (i) {
            case 1:
                C5343 c5343 = (C5343) AbstractC0522.m2386(parcel, C5343.CREATOR);
                C5253 c5253 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11671(c5343, c5253);
                parcel2.writeNoException();
                return true;
            case 2:
                C5290 c5290 = (C5290) AbstractC0522.m2386(parcel, C5290.CREATOR);
                C5253 c52532 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11675(c5290, c52532);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                C5253 c52533 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11687(c52533);
                parcel2.writeNoException();
                return true;
            case 5:
                C5343 c53432 = (C5343) AbstractC0522.m2386(parcel, C5343.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC0522.m2387(parcel);
                AbstractC4753.m10683(c53432);
                AbstractC4753.m10688(string);
                m11676(string, true);
                m11683(new RunnableC1181(this, c53432, string, 8));
                parcel2.writeNoException();
                return true;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                C5253 c52534 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11674(c52534);
                parcel2.writeNoException();
                return true;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C5253 c52535 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                z = parcel.readInt() != 0;
                AbstractC0522.m2387(parcel);
                m11685(c52535);
                String str = c52535.f20334;
                AbstractC4753.m10683(str);
                C5273 c5273 = this.f20139;
                try {
                    List<C5234> list = (List) c5273.mo11648().m11748(new CallableC4922(this, 4, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (C5234 c5234 : list) {
                        if (z || !C5316.m11941(c5234.f20086)) {
                            arrayList.add(new C5290(c5234));
                        }
                    }
                } catch (InterruptedException e) {
                    e = e;
                    c5273.mo11655().f20571.m4529(C5301.m11911(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    c5273.mo11655().f20571.m4529(C5301.m11911(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C5343 c53433 = (C5343) AbstractC0522.m2386(parcel, C5343.CREATOR);
                String string2 = parcel.readString();
                AbstractC0522.m2387(parcel);
                byte[] bArrMo11684 = mo11684(c53433, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo11684);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC0522.m2387(parcel);
                mo11666(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                C5253 c52536 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                String strMo11686 = mo11686(c52536);
                parcel2.writeNoException();
                parcel2.writeString(strMo11686);
                return true;
            case 12:
                C5345 c5345 = (C5345) AbstractC0522.m2386(parcel, C5345.CREATOR);
                C5253 c52537 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11669(c5345, c52537);
                parcel2.writeNoException();
                return true;
            case 13:
                C5345 c53452 = (C5345) AbstractC0522.m2386(parcel, C5345.CREATOR);
                AbstractC0522.m2387(parcel);
                AbstractC4753.m10683(c53452);
                AbstractC4753.m10683(c53452.f20728);
                AbstractC4753.m10688(c53452.f20731);
                m11676(c53452.f20731, true);
                m11683(new RunnableC3129(this, 28, new C5345(c53452)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC0522.f2867;
                z = parcel.readInt() != 0;
                C5253 c52538 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                List listMo11670 = mo11670(string6, string7, z, c52538);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11670);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0522.f2867;
                z = parcel.readInt() != 0;
                AbstractC0522.m2387(parcel);
                List listMo11681 = mo11681(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11681);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                C5253 c52539 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                List listMo11663 = mo11663(string11, string12, c52539);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11663);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC0522.m2387(parcel);
                List listMo11664 = mo11664(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11664);
                return true;
            case 18:
                C5253 c525310 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11679(c525310);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                C5253 c525311 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11678(bundle, c525311);
                parcel2.writeNoException();
                return true;
            case 20:
                C5253 c525312 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11680(c525312);
                parcel2.writeNoException();
                return true;
            case 21:
                C5253 c525313 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                C5309 c5309Mo11665 = mo11665(c525313);
                parcel2.writeNoException();
                if (c5309Mo11665 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c5309Mo11665.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                C5253 c525314 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                AbstractC0522.m2387(parcel);
                List listMo11677 = mo11677(bundle2, c525314);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo11677);
                return true;
            case 25:
                C5253 c525315 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11668(c525315);
                parcel2.writeNoException();
                return true;
            case 26:
                C5253 c525316 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11672(c525316);
                parcel2.writeNoException();
                return true;
            case 27:
                C5253 c525317 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11682(c525317);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) AbstractC0522.m2386(parcel, Bundle.CREATOR);
                C5253 c525318 = (C5253) AbstractC0522.m2386(parcel, C5253.CREATOR);
                AbstractC0522.m2387(parcel);
                mo11688(bundle3, c525318);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final List mo11663(String str, String str2, C5253 c5253) {
        m11685(c5253);
        String str3 = c5253.f20334;
        AbstractC4753.m10683(str3);
        C5273 c5273 = this.f20139;
        try {
            return (List) c5273.mo11648().m11748(new CallableC5302(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e) {
            c5273.mo11655().f20571.m4531(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final List mo11664(String str, String str2, String str3) {
        m11676(str, true);
        C5273 c5273 = this.f20139;
        try {
            return (List) c5273.mo11648().m11748(new CallableC5302(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            c5273.mo11655().f20571.m4531(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C5309 mo11665(C5253 c5253) {
        m11685(c5253);
        String str = c5253.f20334;
        AbstractC4753.m10688(str);
        C5273 c5273 = this.f20139;
        try {
            return (C5309) c5273.mo11648().m11747(new CallableC4922(this, 3, c5253)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C5301 c5301Mo11655 = c5273.mo11655();
            c5301Mo11655.f20571.m4529(C5301.m11911(str), e, "Failed to get consent. appId");
            return new C5309(null);
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void mo11666(long j, String str, String str2, String str3) {
        m11683(new RunnableC5308(this, str2, str3, str, j, 0));
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m11667(C5343 c5343, C5253 c5253) {
        C5273 c5273 = this.f20139;
        c5273.m11819();
        c5273.m11807(c5343, c5253);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void mo11668(C5253 c5253) {
        AbstractC4753.m10688(c5253.f20334);
        AbstractC4753.m10683(c5253.f20323);
        RunnableC5258 runnableC5258 = new RunnableC5258(0);
        runnableC5258.f20366 = this;
        runnableC5258.f20367 = c5253;
        m11673(runnableC5258);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo11669(C5345 c5345, C5253 c5253) {
        AbstractC4753.m10683(c5345);
        AbstractC4753.m10683(c5345.f20728);
        m11685(c5253);
        C5345 c53452 = new C5345(c5345);
        c53452.f20731 = c5253.f20334;
        m11683(new RunnableC1181(this, c53452, c5253, 7));
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final List mo11670(String str, String str2, boolean z, C5253 c5253) {
        m11685(c5253);
        String str3 = c5253.f20334;
        AbstractC4753.m10683(str3);
        C5273 c5273 = this.f20139;
        try {
            List<C5234> list = (List) c5273.mo11648().m11748(new CallableC5302(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5234 c5234 : list) {
                if (z || !C5316.m11941(c5234.f20086)) {
                    arrayList.add(new C5290(c5234));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            C5301 c5301Mo11655 = c5273.mo11655();
            c5301Mo11655.f20571.m4529(C5301.m11911(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            C5301 c5301Mo116552 = c5273.mo11655();
            c5301Mo116552.f20571.m4529(C5301.m11911(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo11671(C5343 c5343, C5253 c5253) {
        AbstractC4753.m10683(c5343);
        m11685(c5253);
        m11683(new RunnableC1181(this, c5343, c5253, 9));
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo11672(C5253 c5253) {
        AbstractC4753.m10688(c5253.f20334);
        AbstractC4753.m10683(c5253.f20323);
        RunnableC5258 runnableC5258 = new RunnableC5258(1);
        runnableC5258.f20366 = this;
        runnableC5258.f20367 = c5253;
        m11673(runnableC5258);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11673(Runnable runnable) {
        C5273 c5273 = this.f20139;
        if (c5273.mo11648().m11741()) {
            runnable.run();
        } else {
            c5273.mo11648().m11739(runnable);
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo11674(C5253 c5253) {
        m11685(c5253);
        m11683(new RunnableC5258(this, c5253, 2));
    }

    @Override // p456.InterfaceC5311
    /* renamed from: יʻ, reason: contains not printable characters */
    public final void mo11675(C5290 c5290, C5253 c5253) {
        AbstractC4753.m10683(c5290);
        m11685(c5253);
        m11683(new RunnableC1181(this, c5290, c5253, 10));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m11676(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5273 c5273 = this.f20139;
        if (zIsEmpty) {
            c5273.mo11655().f20571.m4533("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f20137 == null) {
                    this.f20137 = Boolean.valueOf("com.google.android.gms".equals(this.f20138) || AbstractC3095.m7612(c5273.f20418.f20114, Binder.getCallingUid()) || C3532.m8417(c5273.f20418.f20114).m8421(Binder.getCallingUid()));
                }
                if (this.f20137.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                c5273.mo11655().f20571.m4531(C5301.m11911(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f20138 == null) {
            Context context = c5273.f20418.f20114;
            int callingUid = Binder.getCallingUid();
            int i = AbstractC3537.f13678;
            if (AbstractC3095.m7611(callingUid, context, str)) {
                this.f20138 = str;
            }
        }
        if (str.equals(this.f20138)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final List mo11677(Bundle bundle, C5253 c5253) {
        m11685(c5253);
        String str = c5253.f20334;
        AbstractC4753.m10683(str);
        C5273 c5273 = this.f20139;
        try {
            return (List) c5273.mo11648().m11748(new CallableC2509(this, c5253, bundle, 4)).get();
        } catch (InterruptedException | ExecutionException e) {
            C5301 c5301Mo11655 = c5273.mo11655();
            c5301Mo11655.f20571.m4529(C5301.m11911(str), e, "Failed to get trigger URIs. appId");
            return Collections.emptyList();
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo11678(Bundle bundle, C5253 c5253) {
        m11685(c5253);
        String str = c5253.f20334;
        AbstractC4753.m10683(str);
        RunnableC5306 runnableC5306 = new RunnableC5306(1);
        runnableC5306.f20582 = this;
        runnableC5306.f20583 = bundle;
        runnableC5306.f20584 = str;
        m11683(runnableC5306);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void mo11679(C5253 c5253) {
        AbstractC4753.m10688(c5253.f20334);
        m11676(c5253.f20334, false);
        m11683(new RunnableC5258(this, c5253, 5));
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void mo11680(C5253 c5253) {
        AbstractC4753.m10688(c5253.f20334);
        AbstractC4753.m10683(c5253.f20323);
        m11673(new RunnableC5258(this, c5253, 6));
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final List mo11681(String str, String str2, String str3, boolean z) {
        m11676(str, true);
        C5273 c5273 = this.f20139;
        try {
            List<C5234> list = (List) c5273.mo11648().m11748(new CallableC5302(this, str, str2, str3, 2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5234 c5234 : list) {
                if (z || !C5316.m11941(c5234.f20086)) {
                    arrayList.add(new C5290(c5234));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            C5301 c5301Mo11655 = c5273.mo11655();
            c5301Mo11655.f20571.m4529(C5301.m11911(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            C5301 c5301Mo116552 = c5273.mo11655();
            c5301Mo116552.f20571.m4529(C5301.m11911(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void mo11682(C5253 c5253) {
        m11685(c5253);
        m11683(new RunnableC5258(this, c5253, 3));
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m11683(Runnable runnable) {
        C5273 c5273 = this.f20139;
        if (c5273.mo11648().m11741()) {
            runnable.run();
        } else {
            c5273.mo11648().m11743(runnable);
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final byte[] mo11684(C5343 c5343, String str) {
        AbstractC4753.m10688(str);
        AbstractC4753.m10683(c5343);
        m11676(str, true);
        C5273 c5273 = this.f20139;
        C5301 c5301Mo11655 = c5273.mo11655();
        C5236 c5236 = c5273.f20418;
        C5270 c5270 = c5236.f20108;
        String str2 = c5343.f20721;
        c5301Mo11655.f20567.m4531(c5270.m11769(str2), "Log and bundle. event");
        c5273.mo11653().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c5273.mo11648().m11747(new CallableC2516(this, c5343, str)).get();
            if (bArr == null) {
                c5273.mo11655().f20571.m4531(C5301.m11911(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            c5273.mo11653().getClass();
            c5273.mo11655().f20567.m4530("Log and bundle processed. event, size, time_ms", c5236.f20108.m11769(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            C5301 c5301Mo116552 = c5273.mo11655();
            c5301Mo116552.f20571.m4530("Failed to log and bundle. appId, event, error", C5301.m11911(str), c5236.f20108.m11769(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            C5301 c5301Mo1165522 = c5273.mo11655();
            c5301Mo1165522.f20571.m4530("Failed to log and bundle. appId, event, error", C5301.m11911(str), c5236.f20108.m11769(str2), e);
            return null;
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m11685(C5253 c5253) {
        AbstractC4753.m10683(c5253);
        String str = c5253.f20334;
        AbstractC4753.m10688(str);
        m11676(str, false);
        this.f20139.m11809().m11980(c5253.f20319, c5253.f20339);
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String mo11686(C5253 c5253) {
        m11685(c5253);
        C5273 c5273 = this.f20139;
        try {
            return (String) c5273.mo11648().m11748(new CallableC4922(c5273, 5, c5253)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C5301 c5301Mo11655 = c5273.mo11655();
            c5301Mo11655.f20571.m4529(C5301.m11911(c5253.f20334), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void mo11687(C5253 c5253) {
        m11685(c5253);
        m11683(new RunnableC5258(this, c5253, 4));
    }

    @Override // p456.InterfaceC5311
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void mo11688(Bundle bundle, C5253 c5253) {
        C0329.f2451.get();
        if (this.f20139.m11832().m11727(null, AbstractC5248.f20243)) {
            m11685(c5253);
            String str = c5253.f20334;
            AbstractC4753.m10683(str);
            RunnableC5306 runnableC5306 = new RunnableC5306(0);
            runnableC5306.f20582 = this;
            runnableC5306.f20583 = bundle;
            runnableC5306.f20584 = str;
            m11683(runnableC5306);
        }
    }
}
