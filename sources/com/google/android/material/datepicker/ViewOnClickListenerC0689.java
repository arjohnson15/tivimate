package com.google.android.material.datepicker;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import org.lsposed.hiddenapibypass.library.R;
import p013.AbstractC1037;
import p036.C1240;
import p036.C1245;
import p132.C2077;
import p166.InterfaceC2419;
import p176.InterfaceC2490;
import p227.C3053;
import p272.C3308;
import p272.C3323;
import p272.C3328;
import p272.C3339;
import p334.C3789;
import p338.InterfaceC3856;
import p357.C4052;
import p357.C4060;
import p357.C4066;
import p438.C5118;
import ʿᴵ.ʾʼ;
import ˆٴ.ʾـ;
import ˆٴ.ˉʻ;
import יˏ.ʾˈ;
import ـˈ.ˆˉ;
import ـˈ.ᐧᴵ;
import ᵢﹳ.ـˆ;

/* renamed from: com.google.android.material.datepicker.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0689 implements View.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f3283;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f3284;

    public /* synthetic */ ViewOnClickListenerC0689(int i, Object obj) {
        this.f3284 = i;
        this.f3283 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ـˆ r8;
        ʾـ r5;
        Object obj = this.f3283;
        switch (this.f3284) {
            case 0:
                ((C0692) obj).m2867();
                throw null;
            case 1:
                ˆˉ r1 = ((ʿᴵ.ˑʽ) obj).ˋˊ();
                ـˆ parentFragment = r1 != null ? r1.getParentFragment() : null;
                r8 = parentFragment instanceof ʾʼ ? (ʾʼ) parentFragment : null;
                if (r8 != null) {
                    ʿᴵ.ﾞˊ r12 = ʿᴵ.ﾞˊ.ˆʿ;
                    InterfaceC2490[] interfaceC2490Arr = ʾʼ.ـᵎ;
                    r8.ˉʾ(r12, true, true, false);
                    r8.יᴵ(true);
                    return;
                }
                return;
            case 2:
                InterfaceC2490[] interfaceC2490Arr2 = ʾـ.ʻˉ;
                ʾـ r122 = (ʾـ) obj;
                ـˆ parentFragment2 = r122.getParentFragment();
                r8 = parentFragment2 instanceof ˉʻ ? (ˉʻ) parentFragment2 : null;
                if (r8 != null && r8.ˉʾ()) {
                    if (ʾˈ.ˑʽ || (r5 = r8.ᵢˆ(((ˉʻ) r8).ˋﾞ)) == null) {
                        return;
                    }
                    r8.ᴵᴵ().ˉⁱ.setHeader("");
                    r8.ᴵᴵ().ˉⁱ.setItems(AbstractC1037.m4011(new ᵔᐧ.ˑʽ(r8.getString(R.string._2_res_0x7f13018a), r8.יˆ(1), 1), new ᵔᐧ.ˑʽ(r8.getString(R.string._2_res_0x7f1301ad), r8.יˆ(2), 2), new ᵔᐧ.ˑʽ(r8.getString(R.string._2_res_0x7f13018f), true, 3), new ᵔᐧ.ˑʽ(r5.ⁱᵎ() ? r8.getString(R.string._2_res_0x7f1301a4) : r8.getString(R.string._2_res_0x7f1301a7), r8.יˆ(4), 4), new ᵔᐧ.ˑʽ(r5.getId() == ((ˉʻ) r8).ᵎʽ ? r8.getString(R.string._2_res_0x7f1301aa) : r8.getString(R.string._2_res_0x7f13019b), r8.יˆ(5), 5), new ᵔᐧ.ˑʽ(r8.getString(R.string._2_res_0x7f13019d), r8.יˆ(6), 6), new ᵔᐧ.ˑʽ(r8.getString(R.string._2_res_0x7f1301ac), r8.יˆ(7), 7)));
                    r8.ᴵᴵ().ˉⁱ.setOnItemClickedListener(new ʼᐧ.ˏᴵ(12, r8));
                    r8.ʼﹶ(true);
                    return;
                }
                if (r122.ᵎᵢ) {
                    r122.ᵎﹳ(false);
                    return;
                } else if (r122.יי().ˋⁱ.getVisibility() != 0) {
                    ʾـ.ﹳʻ(r122, C2077.f7939.m5897(), (KeyEvent) null, false, false, 14);
                    return;
                } else {
                    r122.ˏʻ(true);
                    ˈי.ʾˈ.ˑי(r122.getChildFragmentManager(), true, 1, true, false, (Bundle) null, 24);
                    return;
                }
            case 3:
                יⁱ.ˏᴵ r11 = (יⁱ.ˏᴵ) obj;
                C3053 c3053M890 = r11.ˑﾞ.m890(0);
                C3053 c3053M8902 = r11.ˑﾞ.m890(1);
                if (c3053M890 == null || c3053M8902 == null) {
                    return;
                }
                ⁱـ.ˑי.ˑʽ = Integer.valueOf((c3053M890.f11759 * 60) + (c3053M8902.f11759 * 5));
                r11.ʻﹳ();
                return;
            case 4:
                יⁱ.ﹳˎ r112 = (יⁱ.ﹳˎ) obj;
                LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(r112.ˑﾞ.getDate()), ZoneId.systemDefault());
                ⁱـ.ˑי.ʽᐧ = Long.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(((יⁱ.ᵎˏ) r112.ʾʼ.getValue()).ᐧⁱ), ZoneId.systemDefault()).withYear(localDateTimeOfInstant.getYear()).withMonth(localDateTimeOfInstant.getMonthValue()).withDayOfMonth(localDateTimeOfInstant.getDayOfMonth()).withSecond(0).o(ZoneId.systemDefault()).toInstant().toEpochMilli());
                r112.ʻﹳ();
                return;
            case 5:
                יⁱ.ˋˊ r113 = (יⁱ.ˋˊ) obj;
                ⁱـ.ˑי.ʽᐧ = Long.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(((יⁱ.ʿˏ) r113.ʾʼ.getValue()).ᐧⁱ), ZoneId.systemDefault()).withHour(r113.ˑﾞ.getHour()).withMinute(r113.ˑﾞ.getMinute()).withSecond(0).o(ZoneId.systemDefault()).toInstant().toEpochMilli());
                r113.ʻﹳ();
                return;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC2490[] interfaceC2490Arr3 = ᐧᴵ.ˉᵎ;
                ᐧᴵ r114 = (ᐧᴵ) obj;
                String pin = r114.ʿˊ().ˏᴵ.getPin();
                if (pin.length() > 0) {
                    r114.ٴᐧ(pin);
                    return;
                }
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C3328.m8122((C3328) obj);
                return;
            case 8:
                C3328 c3328 = ((C3323) obj).f12887;
                ʿﾞ.ﹳﹳ r2 = c3328.f12962;
                if (r2 == null || !r2.ٴᐧ(29)) {
                    return;
                }
                C1245 c1245M11371 = ((C5118) c3328.f12962).m11371();
                InterfaceC2419 interfaceC2419 = c3328.f12962;
                c1245M11371.getClass();
                C1240 c1240 = new C1240(c1245M11371);
                c1240.m6496(1);
                c1240.m4455(1);
                ((C5118) interfaceC2419).m11392(new C1245(c1240));
                ((String[]) c3328.f12961.f12896)[1] = c3328.getResources().getString(R.string._2_res_0x7f1300b7);
                c3328.f12973.dismiss();
                return;
            case 9:
                C3308 c3308 = (C3308) obj;
                int iM4775 = c3308.m4775();
                C3328 c33282 = c3308.f12863;
                View view2 = c33282.f12921;
                if (iM4775 == 0) {
                    view2.getClass();
                    c33282.m8123(c33282.f12969, view2);
                    return;
                } else if (iM4775 != 1) {
                    c33282.f12973.dismiss();
                    return;
                } else {
                    view2.getClass();
                    c33282.m8123(c33282.f12941, view2);
                    return;
                }
            case 10:
                C3328 c33283 = ((C3323) obj).f12887;
                ʿﾞ.ﹳﹳ r22 = c33283.f12962;
                if (r22 == null || !r22.ٴᐧ(29)) {
                    return;
                }
                C1245 c1245M113712 = ((C5118) c33283.f12962).m11371();
                InterfaceC2419 interfaceC24192 = c33283.f12962;
                c1245M113712.getClass();
                C1240 c12402 = new C1240(c1245M113712);
                c12402.m6496(3);
                c12402.f9514 = -3;
                ((C5118) interfaceC24192).m11392(new C1245(c12402));
                c33283.f12973.dismiss();
                return;
            case 11:
                C3339 c3339 = (C3339) obj;
                c3339.m8171();
                if (view.getId() == R.id._2_res_0x7f0b0170) {
                    c3339.f13055.start();
                    return;
                } else {
                    if (view.getId() == R.id._2_res_0x7f0b016f) {
                        c3339.f13042.start();
                        return;
                    }
                    return;
                }
            case 12:
                C4060 c4060 = (C4060) obj;
                EditText editText = c4060.f15648;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c4060.m9361();
                return;
            case 13:
                ((C4052) obj).m9311();
                return;
            case 14:
                C4066 c4066 = (C4066) obj;
                EditText editText2 = c4066.f15687;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c4066.f15687;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c4066.f15687.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c4066.f15687.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c4066.f15687.setSelection(selectionEnd);
                }
                c4066.m9361();
                return;
            case 15:
                ᵔᐧ.ﹳﹳ r115 = (ᵔᐧ.ﹳﹳ) obj;
                int iM47752 = r115.m4775();
                if (iM47752 != -1) {
                    ᵔᐧ.ʿʼ r23 = r115.ˊᵔ;
                    InterfaceC3856 onItemClickedListener = r23.ʿʼ.getOnItemClickedListener();
                    if (onItemClickedListener != null) {
                        onItemClickedListener.mo4036(Integer.valueOf(((ᵔᐧ.ˑʽ) r23.ﹳﹳ.get(iM47752)).ـﹶ));
                        return;
                    }
                    return;
                }
                return;
            default:
                ˆˉ r13 = ((ʿᴵ.ˑʽ) obj).ˋˊ();
                AbstractComponentCallbacksC0100 parentFragment3 = r13 != null ? r13.getParentFragment() : null;
                r8 = parentFragment3 instanceof ـˆ ? (ـˆ) parentFragment3 : null;
                if (r8 != null) {
                    ᵢﹳ.ﹳˎ r14 = ᵢﹳ.ﹳˎ.ˆʿ;
                    InterfaceC2490[] interfaceC2490Arr4 = ـˆ.ٴﹶ;
                    r8.ˋˏ(r14, true, true, false);
                    r8.ˉʾ(true);
                    return;
                }
                return;
        }
    }
}
