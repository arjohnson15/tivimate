package p149;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0105;
import androidx.leanback.widget.RunnableC0183;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1402;
import p291.C3419;
import p335.AbstractC3795;
import p395.RunnableC4533;
import ˆʽ.ᵎˏ;

/* renamed from: ˊʾ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2282 extends AbstractComponentCallbacksC0100 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2308 f9034;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f9035;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public RecyclerView f9037;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f9039;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public RunnableC4533 f9042;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2304 f9040 = new C2304(this);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f9041 = R.layout._2_res_0x7f0e0125;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final HandlerC2291 f9036 = new HandlerC2291(this, Looper.getMainLooper(), 0);

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final RunnableC0183 f9038 = new RunnableC0183(10, this);

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr._2_res_0x7f0404a4, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style._2_res_0x7f140197;
        }
        requireContext().getTheme().applyStyle(i, false);
        C2308 c2308 = new C2308(requireContext());
        this.f9034 = c2308;
        c2308.f9111 = this;
        m6306(getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, AbstractC2283.f9049, R.attr._2_res_0x7f04049e, 0);
        this.f9041 = typedArrayObtainStyledAttributes.getResourceId(0, this.f9041);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f9041, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewMo6308 = mo6308(layoutInflaterCloneInContext, viewGroup2);
        this.f9037 = recyclerViewMo6308;
        C2304 c2304 = this.f9040;
        recyclerViewMo6308.m1327(c2304);
        if (drawable != null) {
            c2304.getClass();
            c2304.f9093 = drawable.getIntrinsicHeight();
        } else {
            c2304.f9093 = 0;
        }
        c2304.f9095 = drawable;
        AbstractC2282 abstractC2282 = c2304.f9096;
        RecyclerView recyclerView = abstractC2282.f9037;
        if (recyclerView.f1708.size() != 0) {
            AbstractC1402 abstractC1402 = recyclerView.f1683;
            if (abstractC1402 != null) {
                abstractC1402.mo1250("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView.m1280();
            recyclerView.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            c2304.f9093 = dimensionPixelSize;
            RecyclerView recyclerView2 = abstractC2282.f9037;
            if (recyclerView2.f1708.size() != 0) {
                AbstractC1402 abstractC14022 = recyclerView2.f1683;
                if (abstractC14022 != null) {
                    abstractC14022.mo1250("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView2.m1280();
                recyclerView2.requestLayout();
            }
        }
        c2304.f9094 = z;
        if (this.f9037.getParent() == null) {
            viewGroup2.addView(this.f9037);
        }
        this.f9036.post(this.f9038);
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onDestroyView() {
        RunnableC0183 runnableC0183 = this.f9038;
        HandlerC2291 handlerC2291 = this.f9036;
        handlerC2291.removeCallbacks(runnableC0183);
        handlerC2291.removeMessages(1);
        if (this.f9039) {
            this.f9037.setAdapter(null);
            PreferenceScreen preferenceScreen = (PreferenceScreen) this.f9034.f9116;
            if (preferenceScreen != null) {
                preferenceScreen.mo1191();
            }
        }
        this.f9037 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.f9034.f9116;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo1190(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onStart() {
        super.onStart();
        C2308 c2308 = this.f9034;
        c2308.f9112 = this;
        c2308.f9118 = this;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onStop() {
        super.onStop();
        C2308 c2308 = this.f9034;
        c2308.f9112 = null;
        c2308.f9118 = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen = (PreferenceScreen) this.f9034.f9116) != null) {
            preferenceScreen.mo1182(bundle2);
        }
        if (this.f9039) {
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) this.f9034.f9116;
            if (preferenceScreen2 != null) {
                this.f9037.setAdapter(new C2311(preferenceScreen2));
                preferenceScreen2.mo1186();
            }
            RunnableC4533 runnableC4533 = this.f9042;
            if (runnableC4533 != null) {
                runnableC4533.run();
                this.f9042 = null;
            }
        }
        this.f9035 = true;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final Preference m6301(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C2308 c2308 = this.f9034;
        if (c2308 == null || (preferenceScreen = (PreferenceScreen) c2308.f9116) == null) {
            return null;
        }
        return preferenceScreen.m1206(charSequence);
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final void m6302(int i, String str) throws Resources.NotFoundException {
        C2308 c2308 = this.f9034;
        if (c2308 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        c2308.f9117 = true;
        C2297 c2297 = new C2297(contextRequireContext, c2308);
        XmlResourceParser xml = contextRequireContext.getResources().getXml(i);
        try {
            PreferenceGroup preferenceGroupM6343 = c2297.m6343(xml);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceGroupM6343;
            preferenceScreen.m1188(c2308);
            SharedPreferences.Editor editor = (SharedPreferences.Editor) c2308.f9115;
            if (editor != null) {
                editor.apply();
            }
            c2308.f9117 = false;
            PreferenceScreen preferenceScreen2 = preferenceScreen;
            if (str != null) {
                Preference preferenceM1206 = preferenceScreen.m1206(str);
                boolean z = preferenceM1206 instanceof PreferenceScreen;
                preferenceScreen2 = preferenceM1206;
                if (!z) {
                    throw new IllegalArgumentException(ᵎˏ.ˑי("Preference object with key ", str, " is not a PreferenceScreen"));
                }
            }
            m6305(preferenceScreen2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean m6303(Preference preference) {
        boolean z;
        if (preference.f1574 == null) {
            return false;
        }
        if (mo6307() instanceof AbstractC3795) {
            ((AbstractC3795) mo6307()).getClass();
            z = true;
        } else {
            z = false;
        }
        for (AbstractComponentCallbacksC0100 parentFragment = this; !z && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof AbstractC3795) {
                z = true;
            }
        }
        if (!z) {
            getContext();
        }
        if (!z) {
            getActivity();
        }
        if (!z) {
            AbstractC0104 parentFragmentManager = getParentFragmentManager();
            Bundle bundleM1199 = preference.m1199();
            C3419 c3419M677 = parentFragmentManager.m677();
            requireActivity().getClassLoader();
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M8291 = c3419M677.m8291(preference.f1574);
            abstractComponentCallbacksC0100M8291.setArguments(bundleM1199);
            abstractComponentCallbacksC0100M8291.setTargetFragment(this, 0);
            C0105 c0105 = new C0105(parentFragmentManager);
            c0105.m700(((View) requireView().getParent()).getId(), abstractComponentCallbacksC0100M8291, null);
            c0105.m702(null);
            c0105.m697(false);
        }
        return true;
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final void m6304(String str) {
        RunnableC4533 runnableC4533 = new RunnableC4533(20, this, str, false);
        if (this.f9037 == null) {
            this.f9042 = runnableC4533;
        } else {
            runnableC4533.run();
        }
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m6305(PreferenceScreen preferenceScreen) {
        C2308 c2308 = this.f9034;
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) c2308.f9116;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.mo1191();
            }
            c2308.f9116 = preferenceScreen;
            if (preferenceScreen != null) {
                this.f9039 = true;
                if (this.f9035) {
                    HandlerC2291 handlerC2291 = this.f9036;
                    if (handlerC2291.hasMessages(1)) {
                        return;
                    }
                    handlerC2291.obtainMessage(1).sendToTarget();
                }
            }
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public abstract void m6306(String str);

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public AbstractComponentCallbacksC0100 mo6307() {
        return null;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public RecyclerView mo6308(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id._2_res_0x7f0b030f)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout._2_res_0x7f0e0127, viewGroup, false);
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        recyclerView2.setAccessibilityDelegateCompat(new C2285(recyclerView2));
        return recyclerView2;
    }
}
