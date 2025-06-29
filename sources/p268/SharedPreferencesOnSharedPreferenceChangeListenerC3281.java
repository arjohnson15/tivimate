package p268;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.lifecycle.AbstractC0224;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import ar.tvplayer.tv.settings.ui.playlists.DeletePlaylistActivity;
import ar.tvplayer.tv.settings.ui.playlists.PlaylistNameActivity;
import ar.tvplayer.tv.settings.ui.playlists.wizard.PlaylistWizardActivity;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.lsposed.hiddenapibypass.library.R;
import p070.AbstractC1549;
import p071.AbstractC1570;
import p072.AbstractC1642;
import p132.C2077;
import p186.C2587;
import p252.AbstractC3139;
import p278.AbstractC3362;
import p286.C3389;
import p288.C3395;
import p288.C3406;
import p330.InterfaceC3746;
import p395.AbstractC4535;
import ʼˈ.ﹳﹶ;
import ʽᵔ.ʻʻ;
import ˈⁱ.ﹳﹳ;
import ˉﾞ.ˈﹳ;
import ˎˊ.ˏʾ;
import יˏ.ʾˈ;
import ـˈ.ˑי;
import ᐧ.ﹳˑ;
import ᴵˆ.ـﹶ;
import ᵎﹳ.ˑʽ;

/* renamed from: ـˏ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3281 extends ˑי implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f12773;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final AbstractC1570 f12774;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public ʻʿ f12775;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Object f12776;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final AbstractC1570 f12777;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedPreferencesOnSharedPreferenceChangeListenerC3281() {
        ˑⁱ r2 = new ˑⁱ(this, 0);
        boolean z = AbstractC3139.f12115;
        this.f12773 = ﹳﹳ.ᐧⁱ(3, r2);
        this.f12776 = ﹳﹳ.ᐧⁱ(3, new ˑⁱ(this, 1));
        this.f12775 = ʻʿ.ᐧⁱ;
        this.f12777 = registerForActivityResult(new C3389(2), new ᵢٴ(this, 0));
        this.f12774 = registerForActivityResult(new C3389(2), new ᵢٴ(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onCreate(bundle);
        C2077.f7939.ﾞﾞ(this);
        if (bundle != null) {
            this.f12775 = bundle.getSerializable("update_status");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*androidx.fragment.app.ˏᴵ*/.onDestroy();
        C2077.f7939.ʻ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(Bundle bundle) {
        super/*ˊʾ.ʿˏ*/.onSaveInstanceState(bundle);
        bundle.putSerializable("update_status", this.f12775);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (AbstractC1549.m5138(str, "defaultTvgSourceId")) {
            m8077().ᐧʻ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        postponeEnterTransition(500L, TimeUnit.MILLISECONDS);
        m8077().ˑʽ.m1042(getViewLifecycleOwner(), new ʻʻ(12, new ˎᵔ(this, 0)));
        m8077().ʿʼ.m1042(getViewLifecycleOwner(), new ʻʻ(12, new ˎᵔ(this, 1)));
        m8077().ٴˎ.ʿʼ(getViewLifecycleOwner(), new ˋˉ(1, this));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m8075(Preference preference) {
        ˈﹳ r1;
        ˈﹳ r3;
        ـﹶ r9;
        ˈﹳ r32;
        ˈﹳ r12;
        ˈﹳ r13;
        ˈﹳ r33;
        ˈﹳ r34;
        String str = preference.f1558;
        if (str != null) {
            int iHashCode = str.hashCode();
            ?? r6 = this.f12773;
            switch (iHashCode) {
                case -2071603083:
                    if (str.equals("enablePlaylist")) {
                        ٴᐧ r14 = m8077();
                        r14.getClass();
                        AbstractC1642.m5294(AbstractC0224.m1023(r14), null, 0, new ˈﹳ(r14, (InterfaceC3746) null), 3);
                        break;
                    }
                    break;
                case -2059492803:
                    if (str.equals("playlistUrl") && (r1 = (ˈﹳ) m8077().ˑʽ.m1049()) != null) {
                        Intent intent = new Intent(getContext(), (Class<?>) PlaylistWizardActivity.class);
                        intent.putExtra("ar.tvplayer.tv.settings.Args", (Parcelable) new ﹳﹶ(r1.ـﹶ, r1.ˑʽ, r1.ﹳﹳ));
                        startActivity(intent);
                        break;
                    }
                    break;
                case -1621778398:
                    if (str.equals("stalkerPortalParameters") && (r3 = (ˈﹳ) m8077().ˑʽ.m1049()) != null) {
                        ـﹶ parentFragment = getParentFragment();
                        r9 = parentFragment instanceof ـﹶ ? parentFragment : null;
                        if (r9 != null) {
                            ʽᐧ c3284 = new C3284();
                            c3284.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ʿˉ(r3.ـﹶ, r3.ˑʽ, r3.ˏᵢ, r3.ﹶˆ, r3.ˏʾ))}));
                            r9.m8889(c3284);
                            break;
                        }
                    }
                    break;
                case -1572977215:
                    if (str.equals("playlistUnlockPremium")) {
                        AbstractC4535.m10353(this);
                        break;
                    }
                    break;
                case -1545321029:
                    if (str.equals("updatePlaylist")) {
                        ٴᐧ r15 = m8077();
                        r15.getClass();
                        AbstractC1642.m5294(AbstractC0224.m1023(r15), null, 0, new ʽˆ(r15, (InterfaceC3746) null), 3);
                        ʻʿ r16 = ʻʿ.ˆʿ;
                        if (this.f12775 != r16) {
                            this.f12775 = r16;
                            m8076();
                            break;
                        }
                    }
                    break;
                case -1484690687:
                    if (str.equals("updateIntervalHours")) {
                        ـﹶ parentFragment2 = getParentFragment();
                        r9 = parentFragment2 instanceof ـﹶ ? parentFragment2 : null;
                        if (r9 != null) {
                            long j = ((ᵔﹳ) r6.getValue()).ᐧⁱ;
                            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = new ᵔˋ();
                            abstractComponentCallbacksC0100.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ʼᵎ(j))}));
                            r9.m8889(abstractComponentCallbacksC0100);
                            break;
                        }
                    }
                    break;
                case -1196393835:
                    if (str.equals("xtreamCodesParameters") && (r32 = (ˈﹳ) m8077().ˑʽ.m1049()) != null) {
                        ـﹶ parentFragment3 = getParentFragment();
                        r9 = parentFragment3 instanceof ـﹶ ? parentFragment3 : null;
                        if (r9 != null) {
                            ʽᐧ c3285 = new C3285();
                            c3285.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ٴᵔ(r32.ـﹶ, r32.ˑʽ, r32.ˏᵢ, r32.ﹶˆ, r32.ˏʾ, r32.ˉⁱ))}));
                            r9.m8889(c3285);
                            break;
                        }
                    }
                    break;
                case -313536182:
                    if (str.equals("autoUpdatePlaylist")) {
                        ٴᐧ r17 = m8077();
                        r17.getClass();
                        AbstractC1642.m5294(AbstractC0224.m1023(r17), null, 0, new ʻﹳ(r17, (InterfaceC3746) null), 3);
                        break;
                    }
                    break;
                case -173502307:
                    if (str.equals("deletePlaylist") && (r12 = (ˈﹳ) m8077().ˑʽ.m1049()) != null) {
                        Intent intent2 = new Intent(getContext(), (Class<?>) DeletePlaylistActivity.class);
                        intent2.putExtra("ar.tvplayer.tv.settings.Args", (Parcelable) new ˋˊ(r12.ʽᐧ));
                        this.f12774.mo5158(intent2);
                        break;
                    }
                    break;
                case 14222233:
                    if (str.equals("manageGroups") && (r13 = (ˈﹳ) m8077().ˑʽ.m1049()) != null) {
                        ˏʾ.ʾʼ(this, r13.ـﹶ, r13.ﹳﹳ);
                        break;
                    }
                    break;
                case 555760278:
                    if (str.equals("catchup") && (r33 = (ˈﹳ) m8077().ˑʽ.m1049()) != null) {
                        ـﹶ parentFragment4 = getParentFragment();
                        r9 = parentFragment4 instanceof ـﹶ ? parentFragment4 : null;
                        if (r9 != null) {
                            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = new ᴵʿ();
                            abstractComponentCallbacksC01002.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ˏʾ(r33.ـﹶ))}));
                            r9.m8889(abstractComponentCallbacksC01002);
                            break;
                        }
                    }
                    break;
                case 575284716:
                    if (str.equals("logosPriority")) {
                        ـﹶ parentFragment5 = getParentFragment();
                        r9 = parentFragment5 instanceof ـﹶ ? parentFragment5 : null;
                        if (r9 != null) {
                            long j2 = ((ᵔﹳ) r6.getValue()).ᐧⁱ;
                            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01003 = new ᐧⁱ();
                            abstractComponentCallbacksC01003.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new יʻ(j2))}));
                            r9.m8889(abstractComponentCallbacksC01003);
                            break;
                        }
                    }
                    break;
                case 580007805:
                    if (str.equals("playlistName")) {
                        String strValueOf = String.valueOf(preference.mo1177());
                        Intent intent3 = new Intent(getContext(), (Class<?>) PlaylistNameActivity.class);
                        intent3.putExtra("ar.tvplayer.tv.settings.Args", (Parcelable) new ᐧˋ(strValueOf));
                        this.f12777.mo5158(intent3);
                        break;
                    }
                    break;
                case 2065011902:
                    if (str.equals("tvGuideSources") && (r34 = (ˈﹳ) m8077().ˑʽ.m1049()) != null) {
                        ـﹶ parentFragment6 = getParentFragment();
                        r9 = parentFragment6 instanceof ـﹶ ? parentFragment6 : null;
                        if (r9 != null) {
                            ˑי c3283 = new C3283();
                            c3283.setArguments(ˏʾ.ʿʼ(new C3395[]{new C3395("args", new ᵎᵢ(r34.ـﹶ, r34.ʽᐧ, r34.ʿʼ))}));
                            r9.m8889(c3283);
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m8076() {
        C3406 c3406 = C2587.f10275;
        if (C2587.m6723()) {
            int iOrdinal = this.f12775.ordinal();
            boolean z = true;
            Drawable drawable = null;
            drawable = null;
            drawable = null;
            String string = "";
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    Drawable drawable2 = ʾˈ.ˋˊ(this, R.drawable._2_res_0x7f080083);
                    ((Animatable) drawable2).start();
                    z = false;
                    drawable = drawable2;
                } else if (iOrdinal == 2) {
                    string = getString(R.string._2_res_0x7f1303ce);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = getString(R.string._2_res_0x7f1303cd);
                }
            }
            Preference preferenceM6301 = m6301("updatePlaylist");
            if (preferenceM6301 != null) {
                AbstractC3362.m8181(preferenceM6301, z);
                preferenceM6301.m1201(drawable);
                preferenceM6301.mo1175(string);
            }
            Preference preferenceM63012 = m6301("deletePlaylist");
            if (preferenceM63012 != null) {
                AbstractC3362.m8181(preferenceM63012, z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final ٴᐧ m8077() {
        return (ٴᐧ) this.f12776.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, ٴˑ.ˑʽ] */
    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m8078() {
        List list;
        String string;
        String string2;
        boolean z = false;
        ˈﹳ r2 = (ˈﹳ) m8077().ˑʽ.m1049();
        if (r2 == null || (list = (List) m8077().ʿʼ.m1049()) == null) {
            return;
        }
        C3406 c3406 = C2587.f10275;
        boolean zM6723 = C2587.m6723();
        ˉᵎ(r2.ʽᐧ);
        AbstractC3362.m8221(this, true);
        SwitchPreference switchPreference = (SwitchPreference) m6301("enablePlaylist");
        if (switchPreference != null) {
            switchPreference.m1210(r2.ʿʼ);
            AbstractC3362.m8181(switchPreference, zM6723);
            switchPreference.m1201(ˎˉ());
        }
        Preference preferenceM6301 = m6301("playlistName");
        if (preferenceM6301 != null) {
            AbstractC3362.m8181(preferenceM6301, zM6723);
            preferenceM6301.m1201(ˎˉ());
            preferenceM6301.mo1175(r2.ʽᐧ);
        }
        Preference preferenceM63012 = m6301("playlistUrl");
        if (preferenceM63012 != null) {
            preferenceM63012.m1184((((Boolean) r2.ᵎـ.getValue()).booleanValue() || ((Boolean) r2.ˎٴ.getValue()).booleanValue()) ? false : true);
            AbstractC3362.m8181(preferenceM63012, zM6723);
            preferenceM63012.m1201(ˎˉ());
            preferenceM63012.mo1175(r2.ˑʽ);
        }
        Preference preferenceM63013 = m6301("tvGuideSources");
        if (preferenceM63013 != null) {
            int size = list.size();
            preferenceM63013.m1184(!r2.ﹳﹳ);
            AbstractC3362.m8181(preferenceM63013, zM6723);
            preferenceM63013.m1201(ˎˉ());
            preferenceM63013.mo1175(getResources().getQuantityString(R.plurals._2_res_0x7f110004, size, Integer.valueOf(size)));
        }
        Preference preferenceM63014 = m6301("logosPriority");
        if (preferenceM63014 != null) {
            int iOrdinal = r2.ˋⁱ.ordinal();
            if (iOrdinal == 0) {
                string2 = ﹳˑ.ˑʽ(this);
            } else if (iOrdinal == 1) {
                string2 = getString(R.string._2_res_0x7f13030a);
            } else if (iOrdinal == 2) {
                string2 = getString(R.string._2_res_0x7f130308);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = getString(R.string._2_res_0x7f130307);
            }
            preferenceM63014.mo1175(string2);
            preferenceM63014.m1184(zM6723 && !r2.ﹳﹳ);
            preferenceM63014.m1201(ˎˉ());
        }
        Preference preferenceM63015 = m6301("catchup");
        if (preferenceM63015 != null) {
            ˑʽ r8 = r2.ˏᴵ;
            if (r8 == null) {
                r8 = (ˑʽ) r2.ᵎˏ.getValue();
            }
            int iOrdinal2 = r8.ordinal();
            if (iOrdinal2 == 0) {
                string = getString(R.string.none);
            } else if (iOrdinal2 == 1) {
                string = getString(R.string.auto);
            } else if (iOrdinal2 == 2) {
                string = getString(R.string._2_res_0x7f1303e0);
            } else {
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string = getString(R.string._2_res_0x7f1302bf);
            }
            preferenceM63015.mo1175(string);
            preferenceM63015.m1184(zM6723 && !r2.ﹳﹳ);
            preferenceM63015.m1201(ˎˉ());
        }
        EditTextPreference editTextPreference = (EditTextPreference) m6301("userAgent");
        if (editTextPreference != null) {
            editTextPreference.f1553 = new יⁱ.ˑʽ(this, 1);
            editTextPreference.m1173(r2.ˑי);
            AbstractC3362.m8181(editTextPreference, zM6723);
            editTextPreference.m1201(ˎˉ());
        }
        Preference preferenceM63016 = m6301("xtreamCodesParameters");
        if (preferenceM63016 != null) {
            preferenceM63016.m1184(((Boolean) r2.ᵎـ.getValue()).booleanValue());
            AbstractC3362.m8181(preferenceM63016, zM6723);
            preferenceM63016.m1201(ˎˉ());
        }
        Preference preferenceM63017 = m6301("stalkerPortalParameters");
        if (preferenceM63017 != null) {
            preferenceM63017.m1184(((Boolean) r2.ˎٴ.getValue()).booleanValue());
            AbstractC3362.m8181(preferenceM63017, zM6723);
            preferenceM63017.m1201(ˎˉ());
        }
        Preference preferenceM63018 = m6301("manageGroups");
        if (preferenceM63018 != null) {
            AbstractC3362.m8181(preferenceM63018, zM6723);
            preferenceM63018.m1201(ˎˉ());
        }
        Preference preferenceM63019 = m6301("updateIntervalHours");
        if (preferenceM63019 != null) {
            int i = AbstractC3139.f12115 ? r2.ᐧʻ : 0;
            preferenceM63019.mo1175(i == 0 ? getString(R.string.none) : String.valueOf(i));
            AbstractC3362.m8181(preferenceM63019, zM6723);
            preferenceM63019.m1201(ˎˉ());
        }
        SwitchPreference switchPreference2 = (SwitchPreference) m6301("autoUpdatePlaylist");
        if (switchPreference2 != null) {
            if (AbstractC3139.f12115 && r2.ٴˎ) {
                z = true;
            }
            switchPreference2.m1210(z);
            AbstractC3362.m8181(switchPreference2, zM6723);
            switchPreference2.m1201(ˎˉ());
        }
        Preference preferenceM630110 = m6301("updatePlaylist");
        if (preferenceM630110 != null) {
            AbstractC3362.m8181(preferenceM630110, zM6723);
            preferenceM630110.m1201(ˎˉ());
        }
        Preference preferenceM630111 = m6301("playlistPremiumOptions");
        if (preferenceM630111 != null) {
            preferenceM630111.m1184(!zM6723);
        }
        Preference preferenceM630112 = m6301("playlistUnlockPremium");
        if (preferenceM630112 != null) {
            preferenceM630112.m1184(true ^ zM6723);
        }
        m8076();
        startPostponedEnterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m8079(String str) {
        m6305(this.f9034.m6354(requireContext()));
        AbstractC3362.m8216(this, "playlistPremiumOptions", getString(R.string._2_res_0x7f1301c6));
        AbstractC3362.m8198(this, "playlistUnlockPremium", getString(R.string._2_res_0x7f13043e), null, ⁱʿ(), false, false, 0, 244);
        AbstractC3362.m8182(this, "enablePlaylist", getString(R.string._2_res_0x7f1302ac), null, null, false, false, 508);
        AbstractC3362.m8198(this, "playlistName", getString(R.string._2_res_0x7f13032e), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "playlistUrl", getString(R.string._2_res_0x7f130333), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "tvGuideSources", getString(R.string._2_res_0x7f1302b3), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "logosPriority", getString(R.string._2_res_0x7f130306), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "catchup", getString(R.string._2_res_0x7f130269), null, null, false, false, 0, 252);
        AbstractC3362.m8204(this, "userAgent", getString(R.string._2_res_0x7f1303d8), null, false, 12);
        AbstractC3362.m8198(this, "xtreamCodesParameters", getString(R.string._2_res_0x7f1303e1), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "stalkerPortalParameters", getString(R.string._2_res_0x7f1303a6), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "manageGroups", getString(R.string._2_res_0x7f13030e), null, null, false, false, 0, 252);
        AbstractC3362.m8216(this, "updateOptions", getString(R.string._2_res_0x7f1303cb));
        AbstractC3362.m8198(this, "updateIntervalHours", getString(R.string._2_res_0x7f1303c8), null, null, false, false, 0, 252);
        AbstractC3362.m8182(this, "autoUpdatePlaylist", getString(R.string._2_res_0x7f1303c9), null, null, false, false, 508);
        AbstractC3362.m8198(this, "updatePlaylist", getString(R.string._2_res_0x7f1303cc), null, null, false, false, 0, 252);
        AbstractC3362.m8198(this, "deletePlaylist", getString(R.string._2_res_0x7f13029b), null, null, false, false, 0, 252);
        AbstractC3362.m8221(this, false);
    }
}
