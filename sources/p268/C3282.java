package p268;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC0224;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.lsposed.hiddenapibypass.library.R;
import p013.AbstractC1039;
import p072.AbstractC1642;
import p252.AbstractC3139;
import p330.InterfaceC3746;
import ʽᵔ.ʻʻ;
import ˈⁱ.ﹳﹳ;
import ˈﾞ.ˋˉ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ـˏ.ˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3282 extends ˋˉ {

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final Object f12778;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public ArrayList f12779;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final Object f12780;

    public C3282() {
        ﾞﾞ r0 = new ﾞﾞ(this, 0);
        boolean z = AbstractC3139.f12115;
        this.f12780 = ﹳﹳ.ᐧⁱ(3, r0);
        this.f12778 = ﹳﹳ.ᐧⁱ(3, new ﾞﾞ(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ٴˑ.ˑʽ] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        postponeEnterTransition(500L, TimeUnit.MILLISECONDS);
        ?? r5 = this.f12778;
        ((ʽⁱ) r5.getValue()).ʽᐧ.m1042(getViewLifecycleOwner(), new ʻʻ(14, new ⁱⁱ(this, 0)));
        ((ʽⁱ) r5.getValue()).ˑʽ.m1042(getViewLifecycleOwner(), new ʻʻ(14, new ⁱⁱ(this, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ˎᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8080() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p268.C3282.m8080():void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m8081() {
        ʽⁱ r0 = (ʽⁱ) this.f12778.getValue();
        ArrayList arrayList = this.f12779;
        if (arrayList == null) {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((ᐧʼ) it.next()).ـﹶ));
        }
        r0.getClass();
        AbstractC1642.m5294(AbstractC0224.m1023(r0), null, 0, new ʻ(arrayList2, (InterfaceC3746) null), 3);
        if (((ʻʻ) this.f12780.getValue()).ˎˑ) {
            ᵢʿ.ᐧʻ = true;
        }
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final boolean m8082(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.f12779;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i < arrayList.size() && i2 >= 0) {
                ArrayList arrayList2 = this.f12779;
                if (arrayList2 == null) {
                    arrayList2 = null;
                }
                if (i2 < arrayList2.size()) {
                    ArrayList arrayList3 = this.f12779;
                    if (arrayList3 == null) {
                        arrayList3 = null;
                    }
                    ᐧʼ r3 = (ᐧʼ) arrayList3.remove(i);
                    ArrayList arrayList4 = this.f12779;
                    (arrayList4 != null ? arrayList4 : null).add(i2, r3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final boolean m8083(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.f12779;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i < arrayList.size() && i2 >= 0) {
                ArrayList arrayList2 = this.f12779;
                if (arrayList2 == null) {
                    arrayList2 = null;
                }
                if (i2 < arrayList2.size()) {
                    ArrayList arrayList3 = this.f12779;
                    ArrayList arrayList4 = arrayList3 == null ? null : arrayList3;
                    if (arrayList3 == null) {
                        arrayList3 = null;
                    }
                    Object obj = arrayList3.get(i2);
                    ArrayList arrayList5 = this.f12779;
                    (arrayList5 == null ? null : arrayList5).set(i2, (arrayList5 != null ? arrayList5 : null).get(i));
                    arrayList4.set(i, obj);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m8084(String str) {
        PreferenceScreen preferenceScreenM6354 = this.f9034.m6354(requireContext());
        preferenceScreenM6354.m1197(getString(R.string._2_res_0x7f1302b5) + " (" + ((ʻʻ) this.f12780.getValue()).ˆʿ + ')');
        m6305(preferenceScreenM6354);
    }
}
