package p285;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0207;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.C0212;
import androidx.lifecycle.C0236;
import androidx.lifecycle.C0241;
import androidx.lifecycle.C0243;
import androidx.lifecycle.C0263;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0213;
import androidx.lifecycle.InterfaceC0242;
import androidx.lifecycle.InterfaceC0260;
import androidx.lifecycle.InterfaceC0262;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ٴˋ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3385 implements InterfaceC0213 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f13225;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13226;

    public /* synthetic */ C3385(int i, Object obj) {
        this.f13226 = i;
        this.f13225 = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) throws NoSuchMethodException, SecurityException {
        boolean z;
        switch (this.f13226) {
            case 0:
                if (enumC0247 != EnumC0247.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0262.getLifecycle().mo1031(this);
                InterfaceC3387 interfaceC3387 = (InterfaceC3387) this.f13225;
                Bundle bundleM8243 = interfaceC3387.getSavedStateRegistry().m8243("androidx.savedstate.Restarter");
                if (bundleM8243 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM8243.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C3385.class.getClassLoader()).asSubclass(InterfaceC3384.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                if (!(interfaceC3387 instanceof InterfaceC0242)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                C0241 viewModelStore = ((InterfaceC0242) interfaceC3387).getViewModelStore();
                                C3383 savedStateRegistry = interfaceC3387.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f1281;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    AbstractC0207 abstractC0207 = (AbstractC0207) linkedHashMap.get((String) it.next());
                                    AbstractC0233 lifecycle = interfaceC3387.getLifecycle();
                                    C0263 c0263 = (C0263) abstractC0207.m999("androidx.lifecycle.savedstate.vm.tag");
                                    if (c0263 != null && !(z = c0263.f1323)) {
                                        if (z) {
                                            throw new IllegalStateException("Already attached to lifecycleOwner");
                                        }
                                        c0263.f1323 = true;
                                        lifecycle.mo1032(c0263);
                                        savedStateRegistry.m8242(c0263.f1324, c0263.f1322.f1304);
                                        EnumC0230 enumC0230 = ((C0236) lifecycle).f1275;
                                        if (enumC0230 == EnumC0230.f1250 || enumC0230.m1030(EnumC0230.f1253)) {
                                            savedStateRegistry.m8244();
                                        } else {
                                            lifecycle.mo1032(new C0243(lifecycle, 1, savedStateRegistry));
                                        }
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m8244();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(ᐧʻ.ﾞˊ("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(ᵎˏ.ˑי("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0260[] interfaceC0260Arr = (InterfaceC0260[]) this.f13225;
                if (interfaceC0260Arr.length > 0) {
                    InterfaceC0260 interfaceC0260 = interfaceC0260Arr[0];
                    throw null;
                }
                if (interfaceC0260Arr.length <= 0) {
                    return;
                }
                InterfaceC0260 interfaceC02602 = interfaceC0260Arr[0];
                throw null;
            default:
                if (enumC0247 != EnumC0247.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0247).toString());
                }
                interfaceC0262.getLifecycle().mo1031(this);
                ((C0212) this.f13225).m1007();
                return;
        }
    }
}
