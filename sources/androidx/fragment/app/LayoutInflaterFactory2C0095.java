package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import p040.AbstractC1271;
import p291.AbstractC3458;
import p291.C3419;
import p297.AbstractC3490;
import p297.C3489;

/* renamed from: androidx.fragment.app.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0095 implements LayoutInflater.Factory2 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0104 f578;

    public LayoutInflaterFactory2C0095(AbstractC0104 abstractC0104) {
        this.f578 = abstractC0104;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0109 c0109M674;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC0104 abstractC0104 = this.f578;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC0104);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1271.f5209);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = AbstractComponentCallbacksC0100.class.isAssignableFrom(C3419.m8289(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100M655 = resourceId != -1 ? abstractC0104.m655(resourceId) : null;
                if (abstractComponentCallbacksC0100M655 == null && string != null) {
                    abstractComponentCallbacksC0100M655 = abstractC0104.m675(string);
                }
                if (abstractComponentCallbacksC0100M655 == null && id != -1) {
                    abstractComponentCallbacksC0100M655 = abstractC0104.m655(id);
                }
                if (abstractComponentCallbacksC0100M655 == null) {
                    C3419 c3419M677 = abstractC0104.m677();
                    context.getClassLoader();
                    abstractComponentCallbacksC0100M655 = c3419M677.m8291(attributeValue);
                    abstractComponentCallbacksC0100M655.mFromLayout = true;
                    abstractComponentCallbacksC0100M655.mFragmentId = resourceId != 0 ? resourceId : id;
                    abstractComponentCallbacksC0100M655.mContainerId = id;
                    abstractComponentCallbacksC0100M655.mTag = string;
                    abstractComponentCallbacksC0100M655.mInLayout = true;
                    abstractComponentCallbacksC0100M655.mFragmentManager = abstractC0104;
                    AbstractC3458 abstractC3458 = abstractC0104.f635;
                    abstractComponentCallbacksC0100M655.mHost = abstractC3458;
                    abstractComponentCallbacksC0100M655.onInflate((Context) abstractC3458.f13385, attributeSet, abstractComponentCallbacksC0100M655.mSavedFragmentState);
                    c0109M674 = abstractC0104.m670(abstractComponentCallbacksC0100M655);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str2 = "Fragment " + abstractComponentCallbacksC0100M655 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                    }
                } else {
                    if (abstractComponentCallbacksC0100M655.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    abstractComponentCallbacksC0100M655.mInLayout = true;
                    abstractComponentCallbacksC0100M655.mFragmentManager = abstractC0104;
                    AbstractC3458 abstractC34582 = abstractC0104.f635;
                    abstractComponentCallbacksC0100M655.mHost = abstractC34582;
                    abstractComponentCallbacksC0100M655.onInflate((Context) abstractC34582.f13385, attributeSet, abstractComponentCallbacksC0100M655.mSavedFragmentState);
                    c0109M674 = abstractC0104.m674(abstractComponentCallbacksC0100M655);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str3 = "Retained Fragment " + abstractComponentCallbacksC0100M655 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C3489 c3489 = AbstractC3490.f13484;
                AbstractC3490.m8379(new FragmentTagUsageViolation(abstractComponentCallbacksC0100M655, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0100M655 + " to container " + viewGroup));
                AbstractC3490.m8381(abstractComponentCallbacksC0100M655).getClass();
                abstractComponentCallbacksC0100M655.mContainer = viewGroup;
                c0109M674.m719();
                c0109M674.m716();
                View view2 = abstractComponentCallbacksC0100M655.mView;
                if (view2 == null) {
                    throw new IllegalStateException(ˆʽ.ᵎˏ.ˑי("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (abstractComponentCallbacksC0100M655.mView.getTag() == null) {
                    abstractComponentCallbacksC0100M655.mView.setTag(string);
                }
                abstractComponentCallbacksC0100M655.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0089(this, c0109M674));
                return abstractComponentCallbacksC0100M655.mView;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
