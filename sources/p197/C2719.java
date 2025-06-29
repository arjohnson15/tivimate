package p197;

import android.util.Property;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p080.AbstractC1702;

/* renamed from: ˎˑ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2719 extends C2734 {

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public Property f10653;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public WeakReference f10654;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public String f10655;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static C2719 m6913(View view, Property property, float... fArr) {
        C2719 c2719 = new C2719();
        c2719.m6917(view);
        C2714[] c2714Arr = c2719.f10697;
        if (c2714Arr != null) {
            C2714 c2714 = c2714Arr[0];
            String str = c2714.f10624;
            c2714.f10618 = property;
            c2719.f10703.remove(str);
            c2719.f10703.put(c2719.f10655, c2714);
        }
        if (c2719.f10653 != null) {
            c2719.f10655 = property.getName();
        }
        c2719.f10653 = property;
        c2719.f10688 = false;
        c2719.mo6919(fArr);
        return c2719;
    }

    @Override // p197.C2734
    /* renamed from: clone */
    public final Object mo6910() {
        return (C2719) super.clone();
    }

    @Override // p197.C2734
    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectAnimator@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(", target ");
        WeakReference weakReference = this.f10654;
        sb.append(weakReference == null ? null : weakReference.get());
        String string = sb.toString();
        if (this.f10697 != null) {
            for (int i = 0; i < this.f10697.length; i++) {
                StringBuilder sbM5409 = AbstractC1702.m5409(string, "\n    ");
                sbM5409.append(this.f10697[i].toString());
                string = sbM5409.toString();
            }
        }
        return string;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void m6914(long j) {
        super.mo6907(j);
    }

    @Override // p197.C2734
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2734 mo6907(long j) {
        super.mo6907(j);
        return this;
    }

    @Override // p197.C2734
    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void mo6916(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WeakReference weakReference = this.f10654;
        Object obj = weakReference == null ? null : weakReference.get();
        if (this.f10654 != null && obj == null) {
            cancel();
            return;
        }
        super.mo6916(f);
        int length = this.f10697.length;
        for (int i = 0; i < length; i++) {
            C2714 c2714 = this.f10697[i];
            Object[] objArr = c2714.f10627;
            Property property = c2714.f10618;
            if (property != null) {
                property.set(obj, Float.valueOf(c2714.f10625));
            } else if (c2714.f10621 != null) {
                try {
                    objArr[0] = Float.valueOf(c2714.f10625);
                    c2714.f10621.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    e.toString();
                } catch (InvocationTargetException e2) {
                    e2.toString();
                }
            }
        }
    }

    @Override // p197.C2734, p197.AbstractC2726
    /* renamed from: ˋⁱ */
    public final boolean mo6894() {
        return this.f10688;
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final void m6917(View view) {
        WeakReference weakReference = this.f10654;
        if ((weakReference == null ? null : weakReference.get()) != view) {
            if (this.f10696) {
                cancel();
            }
            this.f10654 = view != null ? new WeakReference(view) : null;
            this.f10688 = false;
        }
    }

    @Override // p197.C2734
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void mo6918() {
        if (this.f10688) {
            return;
        }
        WeakReference weakReference = this.f10654;
        Object obj = weakReference == null ? null : weakReference.get();
        if (obj != null) {
            int length = this.f10697.length;
            for (int i = 0; i < length; i++) {
                C2714 c2714 = this.f10697[i];
                if (c2714.f10618 != null) {
                    try {
                        List list = c2714.f10626.f10666;
                        int size = list == null ? 0 : list.size();
                        Object obj2 = null;
                        for (int i2 = 0; i2 < size; i2++) {
                            C2730 c2730 = (C2730) list.get(i2);
                            if (!c2730.f10685 || c2730.f10682) {
                                if (obj2 == null) {
                                    obj2 = c2714.f10618.get(obj);
                                }
                                Float f = (Float) obj2;
                                if (f != null && f.getClass() == Float.class) {
                                    c2730.f10684 = f.floatValue();
                                    c2730.f10685 = true;
                                }
                                c2730.f10682 = true;
                            }
                        }
                    } catch (ClassCastException unused) {
                        String str = "No such property (" + c2714.f10618.getName() + ") on target object " + obj + ". Trying reflection instead";
                        c2714.f10618 = null;
                    }
                } else if (c2714.f10618 == null) {
                    Class<?> cls = obj.getClass();
                    if (c2714.f10621 == null) {
                        c2714.f10621 = c2714.m6880(cls, C2714.f10614, "set", c2714.f10619);
                    }
                    List list2 = c2714.f10626.f10666;
                    int size2 = list2 == null ? 0 : list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C2730 c27302 = (C2730) list2.get(i3);
                        if (!c27302.f10685 || c27302.f10682) {
                            if (c2714.f10623 == null) {
                                Method methodM6880 = c2714.m6880(cls, C2714.f10616, "get", null);
                                c2714.f10623 = methodM6880;
                                if (methodM6880 == null) {
                                    break;
                                }
                            }
                            try {
                                Float f2 = (Float) c2714.f10623.invoke(obj, null);
                                if (f2 != null && f2.getClass() == Float.class) {
                                    c27302.f10684 = f2.floatValue();
                                    c27302.f10685 = true;
                                }
                                c27302.f10682 = true;
                            } catch (IllegalAccessException e) {
                                e.toString();
                            } catch (InvocationTargetException e2) {
                                e2.toString();
                            }
                        }
                    }
                }
            }
        }
        super.mo6918();
    }

    @Override // p197.C2734, p197.AbstractC2726
    /* renamed from: ᵎـ */
    public final AbstractC2726 mo6907(long j) {
        super.mo6907(j);
        return this;
    }

    @Override // p197.C2734
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void mo6919(float... fArr) {
        C2714[] c2714Arr = this.f10697;
        if (c2714Arr != null && c2714Arr.length != 0) {
            super.mo6919(fArr);
            return;
        }
        Property property = this.f10653;
        if (property != null) {
            m6948(new C2714(property, fArr));
        } else {
            m6948(new C2714(this.f10655, fArr));
        }
    }

    @Override // p197.C2734, p197.AbstractC2726
    /* renamed from: ﹳˎ */
    public final void mo6909() {
        ArrayList arrayList = C2723.m6926().f10672;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC2725 interfaceC2725 = (InterfaceC2725) arrayList.get(size);
            if (interfaceC2725 != null && (interfaceC2725 instanceof C2719)) {
            }
        }
        m6944(false);
    }

    @Override // p197.C2734, p197.AbstractC2726
    /* renamed from: ﹶˆ */
    public final AbstractC2726 mo6910() {
        return (C2719) super.clone();
    }

    @Override // p197.C2734
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final C2734 clone() {
        return (C2719) super.clone();
    }
}
