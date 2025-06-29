package p456;

import android.os.Bundle;
import android.os.Parcel;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.internal.play_billing.AbstractC0591;
import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.C0664;
import com.google.android.gms.internal.play_billing.InterfaceC0600;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import p181.AbstractC2507;
import p181.AbstractC2508;
import p181.C2503;
import p181.InterfaceC2504;

/* renamed from: ﾞⁱ.ـᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC5302 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ String f20574;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Object f20575;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f20576;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f20577;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f20578;

    public /* synthetic */ CallableC5302(C2503 c2503, String str, ArrayList arrayList, InterfaceC2504 interfaceC2504) {
        this.f20577 = 4;
        this.f20576 = c2503;
        this.f20574 = str;
        this.f20578 = arrayList;
        this.f20575 = interfaceC2504;
    }

    public /* synthetic */ CallableC5302(BinderC5240 binderC5240, String str, String str2, String str3, int i) {
        this.f20577 = i;
        this.f20574 = str;
        this.f20576 = str2;
        this.f20578 = str3;
        this.f20575 = binderC5240;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strM2648;
        int iM2645;
        ArrayList arrayList;
        Bundle bundle;
        switch (this.f20577) {
            case 0:
                BinderC5240 binderC5240 = (BinderC5240) this.f20575;
                binderC5240.f20139.m11819();
                C5348 c5348 = binderC5240.f20139.f20428;
                C5273.m11792(c5348);
                return c5348.m12038(this.f20574, (String) this.f20576, (String) this.f20578);
            case 1:
                BinderC5240 binderC52402 = (BinderC5240) this.f20575;
                binderC52402.f20139.m11819();
                C5348 c53482 = binderC52402.f20139.f20428;
                C5273.m11792(c53482);
                return c53482.m12067(this.f20574, (String) this.f20576, (String) this.f20578);
            case 2:
                BinderC5240 binderC52403 = (BinderC5240) this.f20575;
                binderC52403.f20139.m11819();
                C5348 c53483 = binderC52403.f20139.f20428;
                C5273.m11792(c53483);
                return c53483.m12038(this.f20574, (String) this.f20576, (String) this.f20578);
            case 3:
                BinderC5240 binderC52404 = (BinderC5240) this.f20575;
                binderC52404.f20139.m11819();
                C5348 c53484 = binderC52404.f20139.f20428;
                C5273.m11792(c53484);
                return c53484.m12067(this.f20574, (String) this.f20576, (String) this.f20578);
            default:
                C2503 c2503 = (C2503) this.f20576;
                String str = this.f20574;
                ArrayList arrayList2 = (ArrayList) this.f20578;
                InterfaceC2504 interfaceC2504 = (InterfaceC2504) this.f20575;
                c2503.getClass();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        strM2648 = "";
                        iM2645 = 0;
                    } else {
                        int i2 = i + 20;
                        ArrayList<String> arrayList4 = new ArrayList<>(arrayList2.subList(i, i2 > size ? size : i2));
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList4);
                        bundle2.putString("playBillingLibraryVersion", c2503.f9934);
                        try {
                            if (c2503.f9940) {
                                InterfaceC0600 interfaceC0600 = c2503.f9949;
                                String packageName = c2503.f9935.getPackageName();
                                int i3 = c2503.f9937;
                                c2503.f9953.getClass();
                                if (c2503.f9941) {
                                    c2503.f9953.getClass();
                                }
                                String str2 = c2503.f9934;
                                Bundle bundle3 = new Bundle();
                                arrayList = arrayList2;
                                if (i3 >= 9) {
                                    bundle3.putString("playBillingLibraryVersion", str2);
                                }
                                if (i3 >= 9) {
                                    bundle3.putBoolean("enablePendingPurchases", true);
                                }
                                C0664 c0664 = (C0664) interfaceC0600;
                                Parcel parcelM2712 = c0664.m2712();
                                parcelM2712.writeInt(10);
                                parcelM2712.writeString(packageName);
                                parcelM2712.writeString(str);
                                int i4 = AbstractC0591.f2956;
                                parcelM2712.writeInt(1);
                                bundle2.writeToParcel(parcelM2712, 0);
                                parcelM2712.writeInt(1);
                                bundle3.writeToParcel(parcelM2712, 0);
                                Parcel parcelM2713 = c0664.m2713(parcelM2712, 901);
                                bundle = (Bundle) AbstractC0591.m2556(parcelM2713, Bundle.CREATOR);
                                parcelM2713.recycle();
                            } else {
                                arrayList = arrayList2;
                                InterfaceC0600 interfaceC06002 = c2503.f9949;
                                String packageName2 = c2503.f9935.getPackageName();
                                C0664 c06642 = (C0664) interfaceC06002;
                                Parcel parcelM27122 = c06642.m2712();
                                parcelM27122.writeInt(3);
                                parcelM27122.writeString(packageName2);
                                parcelM27122.writeString(str);
                                int i5 = AbstractC0591.f2956;
                                parcelM27122.writeInt(1);
                                bundle2.writeToParcel(parcelM27122, 0);
                                Parcel parcelM27132 = c06642.m2713(parcelM27122, 2);
                                bundle = (Bundle) AbstractC0591.m2556(parcelM27132, Bundle.CREATOR);
                                parcelM27132.recycle();
                            }
                            if (bundle == null) {
                                AbstractC0629.m2646("BillingClient", "querySkuDetailsAsync got null sku details list");
                                c2503.m6618(AbstractC2508.m6628(44, 8, AbstractC2507.f9965));
                            } else if (bundle.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    AbstractC0629.m2646("BillingClient", "querySkuDetailsAsync got null response list");
                                    c2503.m6618(AbstractC2508.m6628(46, 8, AbstractC2507.f9965));
                                } else {
                                    for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                                        try {
                                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i6));
                                            AbstractC0629.m2642("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                            arrayList3.add(skuDetails);
                                        } catch (JSONException e) {
                                            AbstractC0629.m2647("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                            c2503.m6618(AbstractC2508.m6628(47, 8, AbstractC2507.m6626(6, "Error trying to decode SkuDetails.")));
                                            strM2648 = "Error trying to decode SkuDetails.";
                                            arrayList3 = null;
                                            iM2645 = 6;
                                            interfaceC2504.mo4250(AbstractC2507.m6626(iM2645, strM2648), arrayList3);
                                            return null;
                                        }
                                    }
                                    i = i2;
                                    arrayList2 = arrayList;
                                }
                            } else {
                                iM2645 = AbstractC0629.m2645("BillingClient", bundle);
                                strM2648 = AbstractC0629.m2648("BillingClient", bundle);
                                if (iM2645 != 0) {
                                    AbstractC0629.m2646("BillingClient", "getSkuDetails() failed. Response code: " + iM2645);
                                    c2503.m6618(AbstractC2508.m6628(23, 8, AbstractC2507.m6626(iM2645, strM2648)));
                                } else {
                                    AbstractC0629.m2646("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    c2503.m6618(AbstractC2508.m6628(45, 8, AbstractC2507.m6626(6, strM2648)));
                                }
                            }
                        } catch (Exception e2) {
                            AbstractC0629.m2647("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                            c2503.m6618(AbstractC2508.m6628(43, 8, AbstractC2507.f9963));
                            strM2648 = "Service connection is disconnected.";
                            arrayList3 = null;
                            iM2645 = -1;
                        }
                    }
                }
                strM2648 = "Item is unavailable for purchase.";
                arrayList3 = null;
                iM2645 = 4;
                interfaceC2504.mo4250(AbstractC2507.m6626(iM2645, strM2648), arrayList3);
                return null;
        }
    }
}
