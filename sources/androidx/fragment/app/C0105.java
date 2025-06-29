package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p291.AbstractC3458;
import p291.C3414;
import p291.C3447;
import p291.InterfaceC3418;
import p297.AbstractC3490;
import p334.C3789;
import ˆʽ.ﹶˉ;

/* renamed from: androidx.fragment.app.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0105 implements InterfaceC3418 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f637;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f638;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f639;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f640;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public CharSequence f641;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final AbstractC0104 f642;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public CharSequence f643;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public ArrayList f644;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f645;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f646;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f647;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f648;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f649;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f650;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public ArrayList f651;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f652;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public ArrayList f653;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f654;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f655;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public String f656;

    public C0105(AbstractC0104 abstractC0104) {
        abstractC0104.m677();
        AbstractC3458 abstractC3458 = abstractC0104.f635;
        if (abstractC3458 != null) {
            abstractC3458.f13385.getClassLoader();
        }
        this.f648 = new ArrayList();
        this.f645 = true;
        this.f647 = false;
        this.f654 = -1;
        this.f642 = abstractC0104;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f654 >= 0) {
            sb.append(" #");
            sb.append(this.f654);
        }
        if (this.f656 != null) {
            sb.append(" ");
            sb.append(this.f656);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m696(C3414 c3414) {
        this.f648.add(c3414);
        c3414.f13285 = this.f637;
        c3414.f13279 = this.f646;
        c3414.f13283 = this.f655;
        c3414.f13284 = this.f638;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m697(boolean z) {
        if (this.f652) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Commit: " + this;
            PrintWriter printWriter = new PrintWriter(new C3447());
            m701("  ", printWriter, true);
            printWriter.close();
        }
        this.f652 = true;
        boolean z2 = this.f650;
        AbstractC0104 abstractC0104 = this.f642;
        if (z2) {
            this.f654 = abstractC0104.f602.getAndIncrement();
        } else {
            this.f654 = -1;
        }
        abstractC0104.m666(this, z);
        return this.f654;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m698(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        AbstractC0104 abstractC0104 = abstractComponentCallbacksC0100.mFragmentManager;
        if (abstractC0104 == null || abstractC0104 == this.f642) {
            m696(new C3414(abstractComponentCallbacksC0100, 3));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0100.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m699(ﹶˉ r4) {
        AbstractC0104 abstractC0104 = r4.mFragmentManager;
        if (abstractC0104 == null || abstractC0104 == this.f642) {
            m696(new C3414(r4, 5));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + r4.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m700(int i, AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m705(i, abstractComponentCallbacksC0100, str, 2);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m701(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f656);
            printWriter.print(" mIndex=");
            printWriter.print(this.f654);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f652);
            if (this.f649 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f649));
            }
            if (this.f637 != 0 || this.f646 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f637));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f646));
            }
            if (this.f655 != 0 || this.f638 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f655));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f638));
            }
            if (this.f639 != 0 || this.f643 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f639));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f643);
            }
            if (this.f640 != 0 || this.f641 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f640));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f641);
            }
        }
        ArrayList arrayList = this.f648;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3414 c3414 = (C3414) arrayList.get(i);
            switch (c3414.f13282) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c3414.f13282;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c3414.f13278);
            if (z) {
                if (c3414.f13285 != 0 || c3414.f13279 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c3414.f13285));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c3414.f13279));
                }
                if (c3414.f13283 != 0 || c3414.f13284 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c3414.f13283));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c3414.f13284));
                }
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m702(String str) {
        if (!this.f645) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f650 = true;
        this.f656 = str;
    }

    @Override // p291.InterfaceC3418
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo703(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f650) {
            return true;
        }
        this.f642.f631.add(this);
        return true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m704() {
        if (this.f650) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f645 = false;
        this.f642.m676(this, false);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m705(int i, AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, String str, int i2) {
        String str2 = abstractComponentCallbacksC0100.mPreviousWho;
        if (str2 != null) {
            AbstractC3490.m8380(abstractComponentCallbacksC0100, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0100.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0100.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0100 + ": was " + abstractComponentCallbacksC0100.mTag + " now " + str);
            }
            abstractComponentCallbacksC0100.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0100 + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0100.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0100 + ": was " + abstractComponentCallbacksC0100.mFragmentId + " now " + i);
            }
            abstractComponentCallbacksC0100.mFragmentId = i;
            abstractComponentCallbacksC0100.mContainerId = i;
        }
        m696(new C3414(abstractComponentCallbacksC0100, i2));
        abstractComponentCallbacksC0100.mFragmentManager = this.f642;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m706(int i) {
        if (this.f650) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            ArrayList arrayList = this.f648;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3414 c3414 = (C3414) arrayList.get(i2);
                AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = c3414.f13278;
                if (abstractComponentCallbacksC0100 != null) {
                    abstractComponentCallbacksC0100.mBackStackNesting += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        String str2 = "Bump nesting of " + c3414.f13278 + " to " + c3414.f13278.mBackStackNesting;
                    }
                }
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m707(ᐧﾞ.ـﹶ r4) {
        AbstractC0104 abstractC0104 = r4.mFragmentManager;
        if (abstractC0104 == null || abstractC0104 == this.f642) {
            m696(new C3414(r4, 4));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + r4.toString() + " is already attached to a FragmentManager.");
    }
}
