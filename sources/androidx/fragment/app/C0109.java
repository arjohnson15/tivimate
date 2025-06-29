package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.InterfaceC0242;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p080.AbstractC1702;
import p291.AbstractC3422;
import p291.AbstractC3458;
import p291.C3419;
import p291.ViewOnAttachStateChangeListenerC3460;
import p297.AbstractC3490;
import p297.C3489;
import p331.C3758;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p447.AbstractC5179;
import ـˈ.ˉᵎ;

/* renamed from: androidx.fragment.app.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0109 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0090 f675;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 f677;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3758 f678;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f679 = false;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f676 = -1;

    public C0109(C3758 c3758, C0090 c0090, AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f678 = c3758;
        this.f675 = c0090;
        this.f677 = abstractComponentCallbacksC0100;
    }

    public C0109(C3758 c3758, C0090 c0090, AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, Bundle bundle) {
        this.f678 = c3758;
        this.f675 = c0090;
        this.f677 = abstractComponentCallbacksC0100;
        abstractComponentCallbacksC0100.mSavedViewState = null;
        abstractComponentCallbacksC0100.mSavedViewRegistryState = null;
        abstractComponentCallbacksC0100.mBackStackNesting = 0;
        abstractComponentCallbacksC0100.mInLayout = false;
        abstractComponentCallbacksC0100.mAdded = false;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = abstractComponentCallbacksC0100.mTarget;
        abstractComponentCallbacksC0100.mTargetWho = abstractComponentCallbacksC01002 != null ? abstractComponentCallbacksC01002.mWho : null;
        abstractComponentCallbacksC0100.mTarget = null;
        abstractComponentCallbacksC0100.mSavedFragmentState = bundle;
        abstractComponentCallbacksC0100.mArguments = bundle.getBundle("arguments");
    }

    public C0109(C3758 c3758, C0090 c0090, ClassLoader classLoader, C3419 c3419, Bundle bundle) {
        this.f678 = c3758;
        this.f675 = c0090;
        C0092 c0092 = (C0092) bundle.getParcelable("state");
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M8291 = c3419.m8291(c0092.f570);
        abstractComponentCallbacksC0100M8291.mWho = c0092.f562;
        abstractComponentCallbacksC0100M8291.mFromLayout = c0092.f565;
        abstractComponentCallbacksC0100M8291.mInDynamicContainer = c0092.f569;
        abstractComponentCallbacksC0100M8291.mRestored = true;
        abstractComponentCallbacksC0100M8291.mFragmentId = c0092.f563;
        abstractComponentCallbacksC0100M8291.mContainerId = c0092.f572;
        abstractComponentCallbacksC0100M8291.mTag = c0092.f574;
        abstractComponentCallbacksC0100M8291.mRetainInstance = c0092.f564;
        abstractComponentCallbacksC0100M8291.mRemoving = c0092.f568;
        abstractComponentCallbacksC0100M8291.mDetached = c0092.f571;
        abstractComponentCallbacksC0100M8291.mHidden = c0092.f575;
        abstractComponentCallbacksC0100M8291.mMaxState = EnumC0230.values()[c0092.f561];
        abstractComponentCallbacksC0100M8291.mTargetWho = c0092.f567;
        abstractComponentCallbacksC0100M8291.mTargetRequestCode = c0092.f566;
        abstractComponentCallbacksC0100M8291.mUserVisibleHint = c0092.f573;
        this.f677 = abstractComponentCallbacksC0100M8291;
        abstractComponentCallbacksC0100M8291.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0100M8291.setArguments(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Instantiated fragment " + abstractComponentCallbacksC0100M8291;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m714() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100;
        View view;
        View view2;
        int iIndexOfChild = -1;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = this.f677;
        View view3 = abstractComponentCallbacksC01002.mContainer;
        while (true) {
            abstractComponentCallbacksC0100 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id._2_res_0x7f0b01a2);
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC01003 = tag instanceof AbstractComponentCallbacksC0100 ? (AbstractComponentCallbacksC0100) tag : null;
            if (abstractComponentCallbacksC01003 != null) {
                abstractComponentCallbacksC0100 = abstractComponentCallbacksC01003;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0100 parentFragment = abstractComponentCallbacksC01002.getParentFragment();
        if (abstractComponentCallbacksC0100 != null && !abstractComponentCallbacksC0100.equals(parentFragment)) {
            int i = abstractComponentCallbacksC01002.mContainerId;
            C3489 c3489 = AbstractC3490.f13484;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC01002);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC0100);
            sb.append(" via container with ID ");
            AbstractC3490.m8379(new WrongNestedHierarchyViolation(abstractComponentCallbacksC01002, AbstractC5179.m11550(sb, i, " without using parent's childFragmentManager")));
            AbstractC3490.m8381(abstractComponentCallbacksC01002).getClass();
        }
        C0090 c0090 = this.f675;
        c0090.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC01002.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = c0090.f547;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC01002);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01004 = (AbstractComponentCallbacksC0100) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC01004.mContainer == viewGroup && (view = abstractComponentCallbacksC01004.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0100 abstractComponentCallbacksC01005 = (AbstractComponentCallbacksC0100) arrayList.get(i2);
                    if (abstractComponentCallbacksC01005.mContainer == viewGroup && (view2 = abstractComponentCallbacksC01005.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC01002.mContainer.addView(abstractComponentCallbacksC01002.mView, iIndexOfChild);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m715() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (zIsLoggable) {
            String str = "moveto CREATED: " + abstractComponentCallbacksC0100;
        }
        Bundle bundle = abstractComponentCallbacksC0100.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0100.mIsCreated) {
            abstractComponentCallbacksC0100.mState = 1;
            abstractComponentCallbacksC0100.restoreChildFragmentState();
        } else {
            C3758 c3758 = this.f678;
            c3758.m8728(abstractComponentCallbacksC0100, false);
            abstractComponentCallbacksC0100.performCreate(bundle2);
            c3758.m8723(abstractComponentCallbacksC0100, false);
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m716() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (abstractComponentCallbacksC0100.mFromLayout && abstractComponentCallbacksC0100.mInLayout && !abstractComponentCallbacksC0100.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                String str = "moveto CREATE_VIEW: " + abstractComponentCallbacksC0100;
            }
            Bundle bundle = abstractComponentCallbacksC0100.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0100.performCreateView(abstractComponentCallbacksC0100.performGetLayoutInflater(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC0100.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0100.mView.setTag(R.id._2_res_0x7f0b01a2, abstractComponentCallbacksC0100);
                if (abstractComponentCallbacksC0100.mHidden) {
                    abstractComponentCallbacksC0100.mView.setVisibility(8);
                }
                abstractComponentCallbacksC0100.performViewCreated();
                this.f678.m8729(abstractComponentCallbacksC0100, abstractComponentCallbacksC0100.mView, false);
                abstractComponentCallbacksC0100.mState = 2;
            }
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m717(ClassLoader classLoader) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        Bundle bundle = abstractComponentCallbacksC0100.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0100.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0100.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0100.mSavedViewState = abstractComponentCallbacksC0100.mSavedFragmentState.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0100.mSavedViewRegistryState = abstractComponentCallbacksC0100.mSavedFragmentState.getBundle("viewRegistryState");
            C0092 c0092 = (C0092) abstractComponentCallbacksC0100.mSavedFragmentState.getParcelable("state");
            if (c0092 != null) {
                abstractComponentCallbacksC0100.mTargetWho = c0092.f567;
                abstractComponentCallbacksC0100.mTargetRequestCode = c0092.f566;
                Boolean bool = abstractComponentCallbacksC0100.mSavedUserVisibleHint;
                if (bool != null) {
                    abstractComponentCallbacksC0100.mUserVisibleHint = bool.booleanValue();
                    abstractComponentCallbacksC0100.mSavedUserVisibleHint = null;
                } else {
                    abstractComponentCallbacksC0100.mUserVisibleHint = c0092.f573;
                }
            }
            if (abstractComponentCallbacksC0100.mUserVisibleHint) {
                return;
            }
            abstractComponentCallbacksC0100.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0100, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m718() {
        /*
            r6 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            androidx.fragment.app.ˏᴵ r2 = r6.f677
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L1a:
            android.view.View r1 = r2.getFocusedView()
            if (r1 == 0) goto L74
            android.view.View r3 = r2.mView
            if (r1 != r3) goto L25
            goto L2f
        L25:
            android.view.ViewParent r3 = r1.getParent()
        L29:
            if (r3 == 0) goto L74
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L6f
        L2f:
            boolean r3 = r1.requestFocus()
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)
            if (r4 == 0) goto L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " "
            r4.append(r1)
            if (r3 == 0) goto L4e
            java.lang.String r1 = "succeeded"
            goto L50
        L4e:
            java.lang.String r1 = "failed"
        L50:
            r4.append(r1)
            java.lang.String r1 = " on Fragment "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = " resulting in focused view "
            r4.append(r1)
            android.view.View r1 = r2.mView
            android.view.View r1 = r1.findFocus()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto L74
        L6f:
            android.view.ViewParent r3 = r3.getParent()
            goto L29
        L74:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            ᴵﹳ.ʿʼ r1 = r6.f678
            r3 = 0
            r1.m8737(r2, r3)
            androidx.fragment.app.ˆʿ r1 = r6.f675
            java.lang.String r3 = r2.mWho
            r1.m600(r3, r0)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0109.m718():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01a1, code lost:
    
        continue;
     */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m719() {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0109.m719():void");
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m720() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (abstractComponentCallbacksC0100.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Saving view state for fragment " + abstractComponentCallbacksC0100 + " with view " + abstractComponentCallbacksC0100.mView;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0100.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0100.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0100.mViewLifecycleOwner.f585.m8246(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0100.mSavedViewRegistryState = bundle;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m721() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (zIsLoggable) {
            String str = "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0100;
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0100.mContainer;
        if (viewGroup != null && (view = abstractComponentCallbacksC0100.mView) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0100.performDestroyView();
        this.f678.m8738(abstractComponentCallbacksC0100, false);
        abstractComponentCallbacksC0100.mContainer = null;
        abstractComponentCallbacksC0100.mView = null;
        abstractComponentCallbacksC0100.mViewLifecycleOwner = null;
        abstractComponentCallbacksC0100.mViewLifecycleOwnerLiveData.m1044(null);
        abstractComponentCallbacksC0100.mInLayout = false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m722() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (zIsLoggable) {
            String str = "moveto ATTACHED: " + abstractComponentCallbacksC0100;
        }
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = abstractComponentCallbacksC0100.mTarget;
        C0109 c0109 = null;
        C0090 c0090 = this.f675;
        if (abstractComponentCallbacksC01002 != null) {
            C0109 c01092 = (C0109) c0090.f545.get(abstractComponentCallbacksC01002.mWho);
            if (c01092 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0100 + " declared target fragment " + abstractComponentCallbacksC0100.mTarget + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0100.mTargetWho = abstractComponentCallbacksC0100.mTarget.mWho;
            abstractComponentCallbacksC0100.mTarget = null;
            c0109 = c01092;
        } else {
            String str2 = abstractComponentCallbacksC0100.mTargetWho;
            if (str2 != null && (c0109 = (C0109) c0090.f545.get(str2)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0100);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(ˆʽ.ᵎˏ.ˎٴ(sb, abstractComponentCallbacksC0100.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0109 != null) {
            c0109.m719();
        }
        AbstractC0104 abstractC0104 = abstractComponentCallbacksC0100.mFragmentManager;
        abstractComponentCallbacksC0100.mHost = abstractC0104.f635;
        abstractComponentCallbacksC0100.mParentFragment = abstractC0104.f616;
        C3758 c3758 = this.f678;
        c3758.m8730(abstractComponentCallbacksC0100, false);
        abstractComponentCallbacksC0100.performAttach();
        c3758.m8741(abstractComponentCallbacksC0100, false);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m723() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (zIsLoggable) {
            String str = "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0100;
        }
        Bundle bundle = abstractComponentCallbacksC0100.mSavedFragmentState;
        abstractComponentCallbacksC0100.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f678.m8732(abstractComponentCallbacksC0100, false);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m724() throws Resources.NotFoundException {
        String resourceName;
        int i = 0;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (abstractComponentCallbacksC0100.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            String str = "moveto CREATE_VIEW: " + abstractComponentCallbacksC0100;
        }
        Bundle bundle = abstractComponentCallbacksC0100.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = abstractComponentCallbacksC0100.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0100.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = abstractComponentCallbacksC0100.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException(ˉᵎ.ᴵʿ("Cannot create fragment ", abstractComponentCallbacksC0100, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0100.mFragmentManager.f634.mo605(i2);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0100.mRestored && !abstractComponentCallbacksC0100.mInDynamicContainer) {
                        try {
                            resourceName = abstractComponentCallbacksC0100.getResources().getResourceName(abstractComponentCallbacksC0100.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0100.mContainerId) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0100);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C3489 c3489 = AbstractC3490.f13484;
                    AbstractC3490.m8379(new WrongFragmentContainerViolation(abstractComponentCallbacksC0100, "Attempting to add fragment " + abstractComponentCallbacksC0100 + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC3490.m8381(abstractComponentCallbacksC0100).getClass();
                }
            }
        }
        abstractComponentCallbacksC0100.mContainer = viewGroup;
        abstractComponentCallbacksC0100.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (abstractComponentCallbacksC0100.mView != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                String str2 = "moveto VIEW_CREATED: " + abstractComponentCallbacksC0100;
            }
            abstractComponentCallbacksC0100.mView.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0100.mView.setTag(R.id._2_res_0x7f0b01a2, abstractComponentCallbacksC0100);
            if (viewGroup != null) {
                m714();
            }
            if (abstractComponentCallbacksC0100.mHidden) {
                abstractComponentCallbacksC0100.mView.setVisibility(8);
            }
            if (abstractComponentCallbacksC0100.mView.isAttachedToWindow()) {
                View view = abstractComponentCallbacksC0100.mView;
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                AbstractC4362.m9944(view);
            } else {
                View view2 = abstractComponentCallbacksC0100.mView;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3460(i, view2));
            }
            abstractComponentCallbacksC0100.performViewCreated();
            this.f678.m8729(abstractComponentCallbacksC0100, abstractComponentCallbacksC0100.mView, false);
            int visibility = abstractComponentCallbacksC0100.mView.getVisibility();
            abstractComponentCallbacksC0100.setPostOnViewCreatedAlpha(abstractComponentCallbacksC0100.mView.getAlpha());
            if (abstractComponentCallbacksC0100.mContainer != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0100.mView.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0100.setFocusedView(viewFindFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str3 = "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0100;
                    }
                }
                abstractComponentCallbacksC0100.mView.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0100.mState = 2;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m725() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M592;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (zIsLoggable) {
            String str = "movefrom CREATED: " + abstractComponentCallbacksC0100;
        }
        boolean zIsChangingConfigurations = true;
        boolean z = abstractComponentCallbacksC0100.mRemoving && !abstractComponentCallbacksC0100.isInBackStack();
        C0090 c0090 = this.f675;
        if (z && !abstractComponentCallbacksC0100.mBeingSaved) {
            c0090.m600(abstractComponentCallbacksC0100.mWho, null);
        }
        if (!z) {
            C0114 c0114 = c0090.f548;
            if (!((c0114.f685.containsKey(abstractComponentCallbacksC0100.mWho) && c0114.f686) ? c0114.f688 : true)) {
                String str2 = abstractComponentCallbacksC0100.mTargetWho;
                if (str2 != null && (abstractComponentCallbacksC0100M592 = c0090.m592(str2)) != null && abstractComponentCallbacksC0100M592.mRetainInstance) {
                    abstractComponentCallbacksC0100.mTarget = abstractComponentCallbacksC0100M592;
                }
                abstractComponentCallbacksC0100.mState = 0;
                return;
            }
        }
        AbstractC3458 abstractC3458 = abstractComponentCallbacksC0100.mHost;
        if (abstractC3458 instanceof InterfaceC0242) {
            zIsChangingConfigurations = c0090.f548.f688;
        } else {
            AbstractActivityC0113 abstractActivityC0113 = abstractC3458.f13385;
            if (abstractActivityC0113 instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC0113.isChangingConfigurations();
            }
        }
        if ((z && !abstractComponentCallbacksC0100.mBeingSaved) || zIsChangingConfigurations) {
            c0090.f548.m736(abstractComponentCallbacksC0100, false);
        }
        abstractComponentCallbacksC0100.performDestroy();
        this.f678.m8735(abstractComponentCallbacksC0100, false);
        Iterator it = c0090.m599().iterator();
        while (it.hasNext()) {
            C0109 c0109 = (C0109) it.next();
            if (c0109 != null) {
                String str3 = abstractComponentCallbacksC0100.mWho;
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = c0109.f677;
                if (str3.equals(abstractComponentCallbacksC01002.mTargetWho)) {
                    abstractComponentCallbacksC01002.mTarget = abstractComponentCallbacksC0100;
                    abstractComponentCallbacksC01002.mTargetWho = null;
                }
            }
        }
        String str4 = abstractComponentCallbacksC0100.mTargetWho;
        if (str4 != null) {
            abstractComponentCallbacksC0100.mTarget = c0090.m592(str4);
        }
        c0090.m594(this);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final Bundle m726() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (abstractComponentCallbacksC0100.mState == -1 && (bundle = abstractComponentCallbacksC0100.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C0092(abstractComponentCallbacksC0100));
        if (abstractComponentCallbacksC0100.mState > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0100.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f678.m8731(abstractComponentCallbacksC0100, bundle3, false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0100.mSavedStateRegistryController.m8246(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM686 = abstractComponentCallbacksC0100.mChildFragmentManager.m686();
            if (!bundleM686.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM686);
            }
            if (abstractComponentCallbacksC0100.mView != null) {
                m720();
            }
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0100.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0100.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0100.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m727() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (abstractComponentCallbacksC0100.mFragmentManager == null) {
            return abstractComponentCallbacksC0100.mState;
        }
        int iMin = this.f676;
        int iOrdinal = abstractComponentCallbacksC0100.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0100.mFromLayout) {
            if (abstractComponentCallbacksC0100.mInLayout) {
                iMin = Math.max(this.f676, 2);
                View view = abstractComponentCallbacksC0100.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f676 < 4 ? Math.min(iMin, abstractComponentCallbacksC0100.mState) : Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC0100.mInDynamicContainer && abstractComponentCallbacksC0100.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC0100.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0100.mContainer;
        if (viewGroup != null) {
            C0101 c0101M616 = C0101.m616(viewGroup, abstractComponentCallbacksC0100.getParentFragmentManager());
            c0101M616.getClass();
            C0091 c0091M626 = c0101M616.m626(abstractComponentCallbacksC0100);
            int i = c0091M626 != null ? c0091M626.f549 : 0;
            C0091 c0091M623 = c0101M616.m623(abstractComponentCallbacksC0100);
            i = c0091M623 != null ? c0091M623.f549 : 0;
            int i2 = i == 0 ? -1 : AbstractC3422.f13293[AbstractC1702.m5411(i)];
            if (i2 != -1 && i2 != 1) {
                i = i;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0100.mRemoving) {
            iMin = abstractComponentCallbacksC0100.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0100.mDeferStart && abstractComponentCallbacksC0100.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC0100.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0100;
        }
        return iMin;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m728() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f677;
        if (zIsLoggable) {
            String str = "movefrom ATTACHED: " + abstractComponentCallbacksC0100;
        }
        abstractComponentCallbacksC0100.performDetach();
        this.f678.m8742(abstractComponentCallbacksC0100, false);
        abstractComponentCallbacksC0100.mState = -1;
        abstractComponentCallbacksC0100.mHost = null;
        abstractComponentCallbacksC0100.mParentFragment = null;
        abstractComponentCallbacksC0100.mFragmentManager = null;
        if (!abstractComponentCallbacksC0100.mRemoving || abstractComponentCallbacksC0100.isInBackStack()) {
            C0114 c0114 = this.f675.f548;
            boolean z = true;
            if (c0114.f685.containsKey(abstractComponentCallbacksC0100.mWho) && c0114.f686) {
                z = c0114.f688;
            }
            if (!z) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            String str2 = "initState called for fragment: " + abstractComponentCallbacksC0100;
        }
        abstractComponentCallbacksC0100.initState();
    }
}
