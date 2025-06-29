package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.leanback.widget.RunnableC0183;
import androidx.lifecycle.AbstractC0224;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.AbstractC0244;
import androidx.lifecycle.C0217;
import androidx.lifecycle.C0236;
import androidx.lifecycle.C0241;
import androidx.lifecycle.C0255;
import androidx.lifecycle.C0259;
import androidx.lifecycle.EnumC0230;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0208;
import androidx.lifecycle.InterfaceC0218;
import androidx.lifecycle.InterfaceC0242;
import androidx.lifecycle.InterfaceC0262;
import ar.tvplayer.tv.ui.MainActivity;
import com.PanelUrl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.lsposed.hiddenapibypass.library.R;
import p070.AbstractC1563;
import p070.C1545;
import p071.AbstractC1570;
import p071.InterfaceC1566;
import p200.C2757;
import p225.AbstractActivityC3013;
import p285.C3383;
import p285.C3386;
import p285.InterfaceC3387;
import p286.AbstractC3390;
import p291.AbstractC3416;
import p291.AbstractC3428;
import p291.AbstractC3458;
import p291.C3419;
import p291.C3426;
import p291.C3434;
import p291.C3444;
import p291.C3445;
import p291.C3446;
import p291.C3455;
import p291.InterfaceC3438;
import p291.RunnableC3431;
import p297.AbstractC3490;
import p297.C3489;
import p301.C3506;
import p307.AbstractC3574;
import p458.AbstractC5393;
import p458.C5394;
import p458.C5395;
import ـˈ.ˉᵎ;

/* renamed from: androidx.fragment.app.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0100 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0262, InterfaceC0242, InterfaceC0218, InterfaceC3387 {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    boolean mAdded;
    C3446 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    AbstractC0104 mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    InterfaceC0208 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    AbstractC0104 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC3458 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0236 mLifecycleRegistry;
    EnumC0230 mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC3428> mOnPreAttachedListeners;
    AbstractComponentCallbacksC0100 mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final AbstractC3428 mSavedStateAttachListener;
    C3386 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    AbstractComponentCallbacksC0100 mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    C0097 mViewLifecycleOwner;
    C0259 mViewLifecycleOwnerLiveData;
    String mWho;

    public AbstractComponentCallbacksC0100() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C3455();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC3431(this, 0);
        this.mMaxState = EnumC0230.f1251;
        this.mViewLifecycleOwnerLiveData = new C0259();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C0099(this);
        m614();
    }

    public AbstractComponentCallbacksC0100(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Deprecated
    public static AbstractComponentCallbacksC0100 instantiate(Context context, String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = (AbstractComponentCallbacksC0100) C3419.m8290(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(abstractComponentCallbacksC0100.getClass().getClassLoader());
                abstractComponentCallbacksC0100.setArguments(bundle);
            }
            return abstractComponentCallbacksC0100;
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(ˆʽ.ᵎˏ.ˑי("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(ˆʽ.ᵎˏ.ˑי("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(ˆʽ.ᵎˏ.ˑי("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(ˆʽ.ᵎˏ.ˑי("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC0104 abstractC0104;
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 != null) {
            c3446.f13359 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC0104 = this.mFragmentManager) == null) {
            return;
        }
        C0101 c0101M616 = C0101.m616(viewGroup, abstractC0104);
        c0101M616.m622();
        if (z) {
            this.mHost.f13386.post(new RunnableC0183(23, c0101M616));
        } else {
            c0101M616.m619();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC3416 createFragmentContainer() {
        return new C0094(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M612 = m612(false);
        if (abstractComponentCallbacksC0100M612 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC0100M612);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            ﹶˋ.ـﹶ r4 = new ﹶˋ.ـﹶ(getViewModelStore(), C3506.f13600, C5394.f20869);
            C1545 c1545M5154 = AbstractC1563.m5154(C3506.class);
            String strM5132 = c1545M5154.m5132();
            if (strM5132 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C2757 c2757 = ((C3506) r4.ᴵʿ(c1545M5154, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5132))).f13601;
            if (c2757.f10787 > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (c2757.f10787 > 0) {
                    if (c2757.f10786[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(c2757.f10788[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m693(ᵎﹳ.ᐧʻ.ˉⁱ(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public AbstractComponentCallbacksC0100 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f612.m595(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC0113 getActivity() {
        AbstractC3458 abstractC3458 = this.mHost;
        if (abstractC3458 == null) {
            return null;
        }
        return abstractC3458.f13388;
    }

    public boolean getAllowEnterTransitionOverlap() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return true;
        }
        c3446.getClass();
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return true;
        }
        c3446.getClass();
        return true;
    }

    public View getAnimatingAway() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        c3446.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC0104 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        AbstractC3458 abstractC3458 = this.mHost;
        if (abstractC3458 == null) {
            return null;
        }
        return abstractC3458.f13385;
    }

    @Override // androidx.lifecycle.InterfaceC0218
    public AbstractC5393 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            String str = "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory";
        }
        C5395 c5395 = new C5395();
        if (application != null) {
            c5395.m12172(C0217.f1232, application);
        }
        c5395.m12172(AbstractC0224.f1240, this);
        c5395.m12172(AbstractC0224.f1237, this);
        if (getArguments() != null) {
            c5395.m12172(AbstractC0224.f1239, getArguments());
        }
        return c5395;
    }

    @Override // androidx.lifecycle.InterfaceC0218
    public InterfaceC0208 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                String str = "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory";
            }
            this.mDefaultFactory = new C0255(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return 0;
        }
        return c3446.f13345;
    }

    public Object getEnterTransition() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        return c3446.f13361;
    }

    public AbstractC3574 getEnterTransitionCallback() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        c3446.getClass();
        return null;
    }

    public int getExitAnim() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return 0;
        }
        return c3446.f13353;
    }

    public Object getExitTransition() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        return c3446.f13350;
    }

    public AbstractC3574 getExitTransitionCallback() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        c3446.getClass();
        return null;
    }

    public View getFocusedView() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        return c3446.f13354;
    }

    @Deprecated
    public final AbstractC0104 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC3458 abstractC3458 = this.mHost;
        if (abstractC3458 == null) {
            return null;
        }
        return ((C0111) abstractC3458).f681;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC3458 abstractC3458 = this.mHost;
        if (abstractC3458 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC3013 abstractActivityC3013 = ((C0111) abstractC3458).f681;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC3013.getLayoutInflater().cloneInContext(abstractActivityC3013);
        layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f619);
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.lifecycle.InterfaceC0262
    public AbstractC0233 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public int getNextTransition() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return 0;
        }
        return c3446.f13356;
    }

    public final AbstractComponentCallbacksC0100 getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC0104 getParentFragmentManager() {
        AbstractC0104 abstractC0104 = this.mFragmentManager;
        if (abstractC0104 != null) {
            return abstractC0104;
        }
        throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return false;
        }
        return c3446.f13355;
    }

    public int getPopEnterAnim() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return 0;
        }
        return c3446.f13360;
    }

    public int getPopExitAnim() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return 0;
        }
        return c3446.f13346;
    }

    public float getPostOnViewCreatedAlpha() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return 1.0f;
        }
        return c3446.f13351;
    }

    public Object getReenterTransition() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        Object obj = c3446.f13348;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getReturnTransition() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        Object obj = c3446.f13347;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p285.InterfaceC3387
    public final C3383 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f13227;
    }

    public Object getSharedElementEnterTransition() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        return c3446.f13349;
    }

    public Object getSharedElementReturnTransition() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return null;
        }
        Object obj = c3446.f13358;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C3446 c3446 = this.mAnimationInfo;
        return (c3446 == null || (arrayList = c3446.f13357) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C3446 c3446 = this.mAnimationInfo;
        return (c3446 == null || (arrayList = c3446.f13352) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Deprecated
    public final AbstractComponentCallbacksC0100 getTargetFragment() {
        return m612(true);
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC0262 getViewLifecycleOwner() {
        C0097 c0097 = this.mViewLifecycleOwner;
        if (c0097 != null) {
            return c0097;
        }
        throw new IllegalStateException(ˉᵎ.ᴵʿ("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public AbstractC0244 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC0242
    public C0241 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m615() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.f614.f690;
        C0241 c0241 = (C0241) map.get(this.mWho);
        if (c0241 != null) {
            return c0241;
        }
        C0241 c02412 = new C0241();
        map.put(this.mWho, c02412);
        return c02412;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [android.widget.RelativeLayout, androidx.constraintlayout.widget.ConstraintLayout] */
    public void hookMainActivity(MainActivity mainActivity) {
        View viewFindViewById;
        View viewFindViewById2 = mainActivity.findViewById(R.id._2_res_0x7f0b03bf);
        if (viewFindViewById2 != null) {
            ((TextView) viewFindViewById2).setText(PanelUrl._appName.concat(" is intended for using on TV boxes with a remote control. It is not optimized for devices with a touch screen."));
        }
        View viewFindViewById3 = mainActivity.findViewById(R.id._2_res_0x7f0b03d9);
        if (viewFindViewById3 != null) {
            ((TextView) viewFindViewById3).setText("Welcome to ".concat(PanelUrl._appName));
        }
        View viewFindViewById4 = mainActivity.findViewById(R.id._2_res_0x7f0b03d8);
        if (viewFindViewById4 != null) {
            ((TextView) viewFindViewById4).setText("Add a playlist to get started");
        }
        if (PanelUrl._logoHook && (viewFindViewById = mainActivity.findViewById(R.id._2_res_0x7f0b0217)) != null) {
            ?? r2 = (ConstraintLayout) ((ImageView) viewFindViewById).getParent();
            ((ImageView) r2.getChildAt(0)).setImageDrawable(null);
            ((ImageView) r2.getChildAt(2)).setImageDrawable(null);
            ((ImageView) r2.getChildAt(3)).setImageDrawable(null);
            ((ImageView) r2.getChildAt(4)).setImageDrawable(null);
            ImageView imageView = (ImageView) r2.getChildAt(1);
            byte[] bArrDecode = Base64.decode(PanelUrl._hash, 0);
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            imageView.setImageTintMode(null);
        }
    }

    public void initState() {
        m614();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C3455();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            AbstractC0104 abstractC0104 = this.mFragmentManager;
            if (abstractC0104 == null) {
                return false;
            }
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.mParentFragment;
            abstractC0104.getClass();
            if (!(abstractComponentCallbacksC0100 == null ? false : abstractComponentCallbacksC0100.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.mParentFragment;
            if (abstractComponentCallbacksC0100 == null ? true : abstractComponentCallbacksC0100.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        C3446 c3446 = this.mAnimationInfo;
        if (c3446 == null) {
            return false;
        }
        return c3446.f13359;
    }

    public final boolean isStateSaved() {
        AbstractC0104 abstractC0104 = this.mFragmentManager;
        if (abstractC0104 == null) {
            return false;
        }
        return abstractC0104.m657();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m634();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent;
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC3458 abstractC3458 = this.mHost;
        AbstractActivityC0113 abstractActivityC0113 = abstractC3458 == null ? null : abstractC3458.f13388;
        if (abstractActivityC0113 != null) {
            this.mCalled = false;
            onAttach((Activity) abstractActivityC0113);
        }
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        if (abstractC0104.f605 >= 1) {
            return;
        }
        abstractC0104.f632 = false;
        abstractC0104.f604 = false;
        abstractC0104.f614.f689 = false;
        abstractC0104.m641(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC3458 abstractC3458 = this.mHost;
        AbstractActivityC0113 abstractActivityC0113 = abstractC3458 == null ? null : abstractC3458.f13388;
        if (abstractActivityC0113 != null) {
            this.mCalled = false;
            onInflate((Activity) abstractActivityC0113, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m634();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            String str = "moveto RESTORE_VIEW_STATE: " + this;
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        abstractC0104.f632 = false;
        abstractC0104.f604 = false;
        abstractC0104.f614.f689 = false;
        abstractC0104.m641(4);
    }

    public void performAttach() {
        Iterator<AbstractC3428> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo611();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m637(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f13385);
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it2 = this.mFragmentManager.f613.iterator();
        while (it2.hasNext()) {
            ((InterfaceC3438) it2.next()).mo730(this);
        }
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        abstractC0104.f632 = false;
        abstractC0104.f604 = false;
        abstractC0104.f614.f689 = false;
        abstractC0104.m641(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m646(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m634();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo1032(new C0096(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m1034(EnumC0247.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.m659(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m634();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0097(this, getViewModelStore(), new RunnableC0093(this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f581 != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m608();
        if (Log.isLoggable("FragmentManager", 3)) {
            String str = "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this;
        }
        AbstractC0224.m1025(this.mView, this.mViewLifecycleOwner);
        this.mView.setTag(R.id._2_res_0x7f0b0423, this.mViewLifecycleOwner);
        ˆˑ.ﹳﹳ.ﹳˑ(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.m1044(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m648();
        this.mLifecycleRegistry.m1034(EnumC0247.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m641(1);
        if (this.mView != null) {
            C0097 c0097 = this.mViewLifecycleOwner;
            c0097.m608();
            if (c0097.f581.f1275.m1030(EnumC0230.f1252)) {
                this.mViewLifecycleOwner.m609(EnumC0247.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        ﹶˋ.ـﹶ r4 = new ﹶˋ.ـﹶ(getViewModelStore(), C3506.f13600, C5394.f20869);
        C1545 c1545M5154 = AbstractC1563.m5154(C3506.class);
        String strM5132 = c1545M5154.m5132();
        if (strM5132 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        C2757 c2757 = ((C3506) r4.ᴵʿ(c1545M5154, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5132))).f13601;
        if (c2757.f10787 <= 0) {
            this.mPerformedCreateView = false;
        } else {
            c2757.f10786[0].getClass();
            throw new ClassCastException();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onDetach()"));
        }
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        if (abstractC0104.f617) {
            return;
        }
        abstractC0104.m648();
        this.mChildFragmentManager = new C3455();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m664(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m682(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m641(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m609(EnumC0247.ON_PAUSE);
        }
        this.mLifecycleRegistry.m1034(EnumC0247.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.m687(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM633 = AbstractC0104.m633(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM633) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM633);
            onPrimaryNavigationFragmentChanged(zM633);
            AbstractC0104 abstractC0104 = this.mChildFragmentManager;
            abstractC0104.m663();
            abstractC0104.m656(abstractC0104.f630);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m634();
        this.mChildFragmentManager.m644(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onResume()"));
        }
        C0236 c0236 = this.mLifecycleRegistry;
        EnumC0247 enumC0247 = EnumC0247.ON_RESUME;
        c0236.m1034(enumC0247);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m609(enumC0247);
        }
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        abstractC0104.f632 = false;
        abstractC0104.f604 = false;
        abstractC0104.f614.f689 = false;
        abstractC0104.m641(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.m634();
        this.mChildFragmentManager.m644(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onStart()"));
        }
        C0236 c0236 = this.mLifecycleRegistry;
        EnumC0247 enumC0247 = EnumC0247.ON_START;
        c0236.m1034(enumC0247);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m609(enumC0247);
        }
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        abstractC0104.f632 = false;
        abstractC0104.f604 = false;
        abstractC0104.f614.f689 = false;
        abstractC0104.m641(5);
    }

    public void performStop() {
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        abstractC0104.f604 = true;
        abstractC0104.f614.f689 = true;
        abstractC0104.m641(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m609(EnumC0247.ON_STOP);
        }
        this.mLifecycleRegistry.m1034(EnumC0247.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.m641(2);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        m613().f13359 = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC0104 abstractC0104 = this.mFragmentManager;
        if (abstractC0104 != null) {
            this.mPostponedHandler = abstractC0104.f635.f13386;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> AbstractC1570 registerForActivityResult(AbstractC3390 abstractC3390, InterfaceC1566 interfaceC1566) {
        C0110 c0110 = new C0110(this);
        if (this.mState > 1) {
            throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        C3434 c3434 = new C3434(this, c0110, atomicReference, abstractC3390, interfaceC1566);
        if (this.mState >= 0) {
            c3434.mo611();
        } else {
            this.mOnPreAttachedListeners.add(c3434);
        }
        return new C3444(atomicReference);
    }

    public final AbstractActivityC0113 requireActivity() {
        AbstractActivityC0113 activity = getActivity();
        if (activity == null) {
            throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " not attached to an activity."));
        }
        if (activity instanceof MainActivity) {
            hookMainActivity(activity);
        }
        return activity;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " not attached to a context."));
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.m647(bundle);
        AbstractC0104 abstractC0104 = this.mChildFragmentManager;
        abstractC0104.f632 = false;
        abstractC0104.f604 = false;
        abstractC0104.f614.f689 = false;
        abstractC0104.m641(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C3426(ˉᵎ.ᴵʿ("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m609(EnumC0247.ON_CREATE);
        }
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m613().f13345 = i;
        m613().f13353 = i2;
        m613().f13360 = i3;
        m613().f13346 = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterTransition(Object obj) {
        m613().f13361 = obj;
    }

    public void setExitTransition(Object obj) {
        m613().f13350 = obj;
    }

    public void setFocusedView(View view) {
        m613().f13354 = view;
    }

    public void setInitialSavedState(C3445 c3445) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c3445 == null || (bundle = c3445.f13344) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m613();
        this.mAnimationInfo.f13356 = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m613().f13355 = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m613().f13351 = f;
    }

    public void setReenterTransition(Object obj) {
        m613().f13348 = obj;
    }

    public void setReturnTransition(Object obj) {
        m613().f13347 = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m613().f13349 = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m613();
        C3446 c3446 = this.mAnimationInfo;
        c3446.f13357 = arrayList;
        c3446.f13352 = arrayList2;
    }

    @Deprecated
    public void setTargetFragment(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, int i) {
        if (abstractComponentCallbacksC0100 != null) {
            C3489 c3489 = AbstractC3490.f13484;
            AbstractC3490.m8379(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + abstractComponentCallbacksC0100 + " with request code " + i + " for fragment " + this));
            AbstractC3490.m8381(this).getClass();
        }
        AbstractC0104 abstractC0104 = this.mFragmentManager;
        AbstractC0104 abstractC01042 = abstractComponentCallbacksC0100 != null ? abstractComponentCallbacksC0100.mFragmentManager : null;
        if (abstractC0104 != null && abstractC01042 != null && abstractC0104 != abstractC01042) {
            throw new IllegalArgumentException(ˉᵎ.ᴵʿ("Fragment ", abstractComponentCallbacksC0100, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M612 = abstractComponentCallbacksC0100; abstractComponentCallbacksC0100M612 != null; abstractComponentCallbacksC0100M612 = abstractComponentCallbacksC0100M612.m612(false)) {
            if (abstractComponentCallbacksC0100M612.equals(this)) {
                throw new IllegalArgumentException("Setting " + abstractComponentCallbacksC0100 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (abstractComponentCallbacksC0100 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || abstractComponentCallbacksC0100.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = abstractComponentCallbacksC0100;
        } else {
            this.mTargetWho = abstractComponentCallbacksC0100.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC3458 abstractC3458 = this.mHost;
        if (abstractC3458 == null) {
            throw new IllegalStateException(ˉᵎ.ᴵʿ("Fragment ", this, " not attached to Activity"));
        }
        abstractC3458.f13385.startActivity(intent, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m613().f13359) {
            return;
        }
        if (this.mHost == null) {
            m613().f13359 = false;
        } else if (Looper.myLooper() != this.mHost.f13386.getLooper()) {
            this.mHost.f13386.postAtFrontOfQueue(new RunnableC3431(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC0100 m612(boolean z) {
        String str;
        if (z) {
            C3489 c3489 = AbstractC3490.f13484;
            AbstractC3490.m8379(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            AbstractC3490.m8381(this).getClass();
        }
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.mTarget;
        if (abstractComponentCallbacksC0100 != null) {
            return abstractComponentCallbacksC0100;
        }
        AbstractC0104 abstractC0104 = this.mFragmentManager;
        if (abstractC0104 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC0104.f612.m592(str);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C3446 m613() {
        if (this.mAnimationInfo == null) {
            C3446 c3446 = new C3446();
            c3446.f13361 = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c3446.f13347 = obj;
            c3446.f13350 = null;
            c3446.f13348 = obj;
            c3446.f13349 = null;
            c3446.f13358 = obj;
            c3446.f13351 = 1.0f;
            c3446.f13354 = null;
            this.mAnimationInfo = c3446;
        }
        return this.mAnimationInfo;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m614() {
        this.mLifecycleRegistry = new C0236(this);
        this.mSavedStateRegistryController = new C3386(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        AbstractC3428 abstractC3428 = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            abstractC3428.mo611();
        } else {
            this.mOnPreAttachedListeners.add(abstractC3428);
        }
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int m615() {
        EnumC0230 enumC0230 = this.mMaxState;
        return (enumC0230 == EnumC0230.f1250 || this.mParentFragment == null) ? enumC0230.ordinal() : Math.min(enumC0230.ordinal(), this.mParentFragment.m615());
    }
}
