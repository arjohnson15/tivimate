package p378;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: ᵢٴ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4347 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ViewParent f16842;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int[] f16843;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ViewGroup f16844;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ViewParent f16845;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f16846;

    public C4347(ViewGroup viewGroup) {
        this.f16844 = viewGroup;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m9893(float f, float f2) {
        ViewParent viewParentM9894;
        if (!this.f16846 || (viewParentM9894 = m9894(0)) == null) {
            return false;
        }
        try {
            return viewParentM9894.onNestedPreFling(this.f16844, f, f2);
        } catch (AbstractMethodError e) {
            String str = "ViewParent " + viewParentM9894 + " does not implement interface method onNestedPreFling";
            return false;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ViewParent m9894(int i) {
        if (i == 0) {
            return this.f16845;
        }
        if (i != 1) {
            return null;
        }
        return this.f16842;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m9895(int i) {
        ViewParent viewParentM9894 = m9894(i);
        if (viewParentM9894 != null) {
            boolean z = viewParentM9894 instanceof InterfaceC4374;
            ViewGroup viewGroup = this.f16844;
            if (z) {
                ((InterfaceC4374) viewParentM9894).mo121(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM9894.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    String str = "ViewParent " + viewParentM9894 + " does not implement interface method onStopNestedScroll";
                }
            }
            if (i == 0) {
                this.f16845 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f16842 = null;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m9896(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentM9894;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f16846 || (viewParentM9894 = m9894(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f16844;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f16843 == null) {
                this.f16843 = new int[2];
            }
            iArr3 = this.f16843;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM9894 instanceof InterfaceC4374) {
            ((InterfaceC4374) viewParentM9894).mo127(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentM9894.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                String str = "ViewParent " + viewParentM9894 + " does not implement interface method onNestedPreScroll";
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m9897(float f, float f2, boolean z) {
        ViewParent viewParentM9894;
        if (!this.f16846 || (viewParentM9894 = m9894(0)) == null) {
            return false;
        }
        try {
            return viewParentM9894.onNestedFling(this.f16844, f, f2, z);
        } catch (AbstractMethodError e) {
            String str = "ViewParent " + viewParentM9894 + " does not implement interface method onNestedFling";
            return false;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m9898(int i) {
        return m9894(i) != null;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m9899(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (m9898(i2)) {
            return true;
        }
        if (this.f16846) {
            View view = this.f16844;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof InterfaceC4374;
                if (z) {
                    zOnStartNestedScroll = ((InterfaceC4374) parent).mo129(view2, view, i, i2);
                } else if (i2 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                    } catch (AbstractMethodError e) {
                        String str = "ViewParent " + parent + " does not implement interface method onStartNestedScroll";
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        this.f16845 = parent;
                    } else if (i2 == 1) {
                        this.f16842 = parent;
                    }
                    if (z) {
                        ((InterfaceC4374) parent).mo128(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i);
                        } catch (AbstractMethodError e2) {
                            String str2 = "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted";
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m9900(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM9894;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f16846 || (viewParentM9894 = m9894(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f16844;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f16843 == null) {
                this.f16843 = new int[2];
            }
            int[] iArr4 = this.f16843;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentM9894 instanceof InterfaceC4355) {
            ((InterfaceC4355) viewParentM9894).mo130(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentM9894 instanceof InterfaceC4374) {
                ((InterfaceC4374) viewParentM9894).mo122(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    viewParentM9894.onNestedScroll(viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    String str = "ViewParent " + viewParentM9894 + " does not implement interface method onNestedScroll";
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }
}
