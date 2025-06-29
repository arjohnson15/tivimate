package p226;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import p071.AbstractC1569;
import p071.C1568;
import p222.RunnableC2949;
import p286.AbstractC3390;
import p307.AbstractC3568;
import p307.InterfaceC3555;
import p307.InterfaceC3566;
import ˆʽ.ᵎˏ;
import ˏᵢ.ᵢٴ;

/* renamed from: ˑʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3027 extends AbstractC1569 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC3030 f11704;

    public C3027(AbstractActivityC3030 abstractActivityC3030) {
        this.f11704 = abstractActivityC3030;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p071.AbstractC1569
    /* renamed from: ʽᐧ */
    public final void mo5159(int i, AbstractC3390 abstractC3390, Object obj) {
        Bundle bundle;
        AbstractActivityC3030 abstractActivityC3030 = this.f11704;
        ᵢٴ r1 = abstractC3390.mo8248(abstractActivityC3030, obj);
        if (r1 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2949(this, i, r1, 1));
            return;
        }
        Intent intentMo8250 = abstractC3390.mo8250(obj);
        if (intentMo8250.getExtras() != null && intentMo8250.getExtras().getClassLoader() == null) {
            intentMo8250.setExtrasClassLoader(abstractActivityC3030.getClassLoader());
        }
        if (intentMo8250.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentMo8250.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo8250.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo8250.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo8250.getAction())) {
                abstractActivityC3030.startActivityForResult(intentMo8250, i, bundle);
                return;
            }
            C1568 c1568 = (C1568) intentMo8250.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                abstractActivityC3030.startIntentSenderForResult(c1568.f6313, i, c1568.f6310, c1568.f6311, c1568.f6312, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2949(this, i, e, 2));
                return;
            }
        }
        String[] stringArrayExtra = intentMo8250.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                throw new IllegalArgumentException(ᵎˏ.ˎٴ(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr[i3] = stringArrayExtra[i4];
                    i3++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (abstractActivityC3030 instanceof InterfaceC3566) {
                ((InterfaceC3566) abstractActivityC3030).validateRequestPermissionsRequestCode(i);
            }
            AbstractC3568.m8454(abstractActivityC3030, stringArrayExtra, i);
        } else if (abstractActivityC3030 instanceof InterfaceC3555) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2949(strArr, abstractActivityC3030, i, 4));
        }
    }
}
