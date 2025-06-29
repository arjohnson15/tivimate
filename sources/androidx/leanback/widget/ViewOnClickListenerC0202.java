package androidx.leanback.widget;

import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import androidx.preference.Preference;
import com.google.android.material.datepicker.C0687;
import java.util.ArrayList;
import java.util.HashMap;
import p166.C2429;
import p166.C2432;
import p166.C2433;
import p182.AbstractC2517;
import p222.C2881;
import p225.C3022;
import p272.C3311;
import p320.C3644;
import p334.C3789;
import p345.AbstractC3980;

/* renamed from: androidx.leanback.widget.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0202 implements View.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f1199;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f1200;

    public /* synthetic */ ViewOnClickListenerC0202(int i, Object obj) {
        this.f1200 = i;
        this.f1199 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0157 interfaceC0157;
        Message message;
        Message message2;
        Message message3;
        switch (this.f1200) {
            case 0:
                if (view != null && view.getWindowToken() != null) {
                    C0180 c0180 = (C0180) this.f1199;
                    VerticalGridView verticalGridView = c0180.f1152;
                    if (verticalGridView.f1704) {
                        C0193 c0193 = (C0193) verticalGridView.m1331(view);
                        C0203 c0203 = c0193.f1184;
                        if (c0203.m987()) {
                            c0180.f1145.ˉי(c0180, c0193);
                            break;
                        } else if (c0203.m991()) {
                            InterfaceC0157 interfaceC01572 = c0180.f1146;
                            if (interfaceC01572 != null) {
                                interfaceC01572.mo747(c0193.f1184);
                                break;
                            }
                        } else {
                            C0203 c02032 = c0193.f1184;
                            int i = c02032.f1205;
                            VerticalGridView verticalGridView2 = c0180.f1152;
                            if (verticalGridView2.f1704 && i != 0) {
                                C0159 c0159 = c0180.f1144;
                                if (i != -1) {
                                    ArrayList arrayList = c0180.f1143;
                                    int size = arrayList.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        C0203 c02033 = (C0203) arrayList.get(i2);
                                        if (c02033 != c02032 && c02033.f1205 == i && c02033.m990()) {
                                            c02033.m995(0, 1);
                                            C0193 c01932 = (C0193) verticalGridView2.m1292(i2, false);
                                            if (c01932 != null) {
                                                c0159.getClass();
                                                KeyEvent.Callback callback = c01932.f1183;
                                                if (callback instanceof Checkable) {
                                                    ((Checkable) callback).setChecked(false);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!c02032.m990()) {
                                    c02032.m995(1, 1);
                                    c0159.getClass();
                                    KeyEvent.Callback callback2 = c0193.f1183;
                                    if (callback2 instanceof Checkable) {
                                        ((Checkable) callback2).setChecked(true);
                                    }
                                } else if (i == -1) {
                                    c02032.m995(0, 1);
                                    c0159.getClass();
                                    KeyEvent.Callback callback3 = c0193.f1183;
                                    if (callback3 instanceof Checkable) {
                                        ((Checkable) callback3).setChecked(false);
                                    }
                                }
                            }
                            if (c0203.m988() && (c0203.f1202 & 8) != 8 && (interfaceC0157 = c0180.f1146) != null) {
                                interfaceC0157.mo747(c0193.f1184);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                SearchBar searchBar = (SearchBar) this.f1199;
                if (searchBar.f912) {
                    searchBar.m876();
                    break;
                } else {
                    searchBar.m873();
                    break;
                }
            case 2:
                C0687 c0687 = (C0687) this.f1199;
                int i3 = c0687.f3273;
                if (i3 == 2) {
                    c0687.m2859(1);
                    break;
                } else if (i3 == 1) {
                    c0687.m2859(2);
                    break;
                }
                break;
            case 3:
                ((Preference) this.f1199).mo1164(view);
                break;
            case 4:
                ((AbstractC2517) this.f1199).mo6649();
                break;
            case 5:
                C2881 c2881 = ((Toolbar) this.f1199).f224;
                C3644 c3644 = c2881 == null ? null : c2881.f11151;
                if (c3644 != null) {
                    c3644.collapseActionView();
                    break;
                }
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                C3022 c3022 = (C3022) this.f1199;
                Message messageObtain = (view != c3022.f11694 || (message3 = c3022.f11676) == null) ? (view != c3022.f11671 || (message2 = c3022.f11687) == null) ? (view != c3022.f11677 || (message = c3022.f11689) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c3022.f11668.obtainMessage(1, c3022.f11664).sendToTarget();
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f1199;
                CheckedTextView checkedTextView = trackSelectionView.f1513;
                HashMap map = trackSelectionView.f1519;
                boolean z = true;
                if (view == checkedTextView) {
                    trackSelectionView.f1509 = true;
                    map.clear();
                } else if (view == trackSelectionView.f1515) {
                    trackSelectionView.f1509 = false;
                    map.clear();
                } else {
                    trackSelectionView.f1509 = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C3311 c3311 = (C3311) tag;
                    C2429 c2429 = c3311.f12866;
                    C2433 c2433 = c2429.f9651;
                    C2432 c2432 = (C2432) map.get(c2433);
                    int i4 = c3311.f12865;
                    if (c2432 == null) {
                        if (!trackSelectionView.f1514 && map.size() > 0) {
                            map.clear();
                        }
                        map.put(c2433, new C2432(c2433, AbstractC3980.m9207(Integer.valueOf(i4))));
                    } else {
                        ArrayList arrayList2 = new ArrayList(c2432.f9694);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.f1512 && c2429.f9653;
                        if (!z2 && (!trackSelectionView.f1514 || trackSelectionView.f1518.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList2.remove(Integer.valueOf(i4));
                            if (arrayList2.isEmpty()) {
                                map.remove(c2433);
                            } else {
                                map.put(c2433, new C2432(c2433, arrayList2));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList2.add(Integer.valueOf(i4));
                                map.put(c2433, new C2432(c2433, arrayList2));
                            } else {
                                map.put(c2433, new C2432(c2433, AbstractC3980.m9207(Integer.valueOf(i4))));
                            }
                        }
                    }
                }
                trackSelectionView.m1163();
                break;
        }
    }
}
