package p139;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.leanback.widget.C0168;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p200.AbstractC2746;
import p200.C2741;
import p200.C2742;
import p340.AbstractC3876;
import p378.AbstractC4339;
import p378.AbstractC4345;
import ᴵﹳ.ٴˎ;
import ᵔʼ.ˑʽ;
import ﹶˋ.ـﹶ;

/* renamed from: ˉˋ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2160 implements Cloneable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public ArrayList f8458;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public long f8459;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public C2154 f8462;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public ٴˎ f8465;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public InterfaceC2121[] f8468;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public ArrayList f8469;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public long f8480;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public static final Animator[] f8455 = new Animator[0];

    /* renamed from: יˋ, reason: contains not printable characters */
    public static final int[] f8456 = {2, 1, 3, 4};

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final ˑʽ f8453 = new ˑʽ();

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static final ThreadLocal f8454 = new ThreadLocal();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f8472 = getClass().getName();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f8460 = -1;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public long f8466 = -1;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public TimeInterpolator f8471 = null;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ArrayList f8461 = new ArrayList();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ArrayList f8478 = new ArrayList();

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ArrayList f8481 = null;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public ـﹶ f8464 = new ـﹶ(5);

    /* renamed from: ـˆ, reason: contains not printable characters */
    public ـﹶ f8470 = new ـﹶ(5);

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C2122 f8473 = null;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int[] f8483 = f8456;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final ArrayList f8479 = new ArrayList();

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public Animator[] f8467 = f8455;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f8477 = 0;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f8457 = false;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f8476 = false;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public AbstractC2160 f8475 = null;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public ArrayList f8482 = null;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public ArrayList f8463 = new ArrayList();

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public ˑʽ f8474 = f8453;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static boolean m6076(C2123 c2123, C2123 c21232, String str) {
        Object obj = c2123.f8363.get(str);
        Object obj2 = c21232.f8363.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m6077(ـﹶ r12, View view, C2123 c2123) {
        ((C2741) r12.ˆʿ).put(view, c2123);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) r12.ˎˑ;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        String strM9863 = AbstractC4339.m9863(view);
        if (strM9863 != null) {
            C2741 c2741 = (C2741) r12.ˆᵔ;
            if (c2741.containsKey(strM9863)) {
                c2741.put(strM9863, null);
            } else {
                c2741.put(strM9863, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C2742 c2742 = (C2742) r12.ᐧˋ;
                if (c2742.f10726) {
                    int i = c2742.f10725;
                    long[] jArr = c2742.f10723;
                    Object[] objArr = c2742.f10724;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != AbstractC2746.f10741) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c2742.f10726 = false;
                    c2742.f10725 = i2;
                }
                if (AbstractC3876.m9070(c2742.f10723, c2742.f10725, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2742.m6964(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c2742.m6968(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c2742.m6964(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static C2741 m6078() {
        ThreadLocal threadLocal = f8454;
        C2741 c2741 = (C2741) threadLocal.get();
        if (c2741 != null) {
            return c2741;
        }
        C2741 c27412 = new C2741(0);
        threadLocal.set(c27412);
        return c27412;
    }

    public void cancel() {
        ArrayList arrayList = this.f8479;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f8467);
        this.f8467 = f8455;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f8467 = animatorArr;
        m6087(this, InterfaceC2128.f8377, false);
    }

    public final String toString() {
        return mo6012("");
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m6079() {
        if (this.f8477 == 0) {
            m6087(this, InterfaceC2128.f8373, false);
            this.f8476 = false;
        }
        this.f8477++;
    }

    /* renamed from: ʾʼ */
    public void mo5995(long j) {
        this.f8466 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f8469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f8458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (p139.C2123) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /* renamed from: ʿˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p139.C2123 m6080(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            ˉˋ.ˆʿ r0 = r5.f8473
            if (r0 == 0) goto L9
            ˉˋ.ˆᵔ r6 = r0.m6080(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f8458
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f8469
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            ˉˋ.ˆᵔ r4 = (p139.C2123) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f8361
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f8469
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f8458
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            ˉˋ.ˆᵔ r1 = (p139.C2123) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p139.AbstractC2160.m6080(android.view.View, boolean):ˉˋ.ˆᵔ");
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean m6081(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f8461;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8478;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* renamed from: ˆᵔ */
    public void mo5997(ViewGroup viewGroup) {
        if (this.f8476) {
            return;
        }
        ArrayList arrayList = this.f8479;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f8467);
        this.f8467 = f8455;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f8467 = animatorArr;
        m6087(this, InterfaceC2128.f8375, false);
        this.f8457 = true;
    }

    /* renamed from: ˈٴ */
    public boolean mo5998() {
        return this instanceof C2120;
    }

    /* renamed from: ˉי */
    public void mo5999(C2123 c2123) {
    }

    /* renamed from: ˉⁱ */
    public abstract void mo5979(C2123 c2123);

    /* renamed from: ˋˉ */
    public void mo6001(View view) {
        this.f8478.remove(view);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final AbstractC2160 m6082() {
        C2122 c2122 = this.f8473;
        return c2122 != null ? c2122.m6082() : this;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m6083(ViewGroup viewGroup, boolean z) {
        m6088(z);
        ArrayList arrayList = this.f8461;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8478;
        if (size <= 0 && arrayList2.size() <= 0) {
            m6090(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C2123 c2123 = new C2123(viewFindViewById);
                if (z) {
                    mo5979(c2123);
                } else {
                    mo5983(c2123);
                }
                c2123.f8362.add(this);
                mo5999(c2123);
                if (z) {
                    m6077(this.f8464, viewFindViewById, c2123);
                } else {
                    m6077(this.f8470, viewFindViewById, c2123);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C2123 c21232 = new C2123(view);
            if (z) {
                mo5979(c21232);
            } else {
                mo5983(c21232);
            }
            c21232.f8362.add(this);
            mo5999(c21232);
            if (z) {
                m6077(this.f8464, view, c21232);
            } else {
                m6077(this.f8470, view, c21232);
            }
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m6084() {
        int i = this.f8477 - 1;
        this.f8477 = i;
        if (i == 0) {
            m6087(this, InterfaceC2128.f8374, false);
            for (int i2 = 0; i2 < ((C2742) this.f8464.ᐧˋ).m6965(); i2++) {
                View view = (View) ((C2742) this.f8464.ᐧˋ).m6969(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C2742) this.f8470.ᐧˋ).m6965(); i3++) {
                View view2 = (View) ((C2742) this.f8470.ᐧˋ).m6969(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f8476 = true;
        }
    }

    /* renamed from: ˎᵔ */
    public void mo6003() {
    }

    @Override // 
    /* renamed from: ˏᴵ, reason: merged with bridge method [inline-methods] */
    public AbstractC2160 clone() {
        try {
            AbstractC2160 abstractC2160 = (AbstractC2160) super.clone();
            abstractC2160.f8463 = new ArrayList();
            abstractC2160.f8464 = new ـﹶ(5);
            abstractC2160.f8470 = new ـﹶ(5);
            abstractC2160.f8458 = null;
            abstractC2160.f8469 = null;
            abstractC2160.f8462 = null;
            abstractC2160.f8475 = this;
            abstractC2160.f8482 = null;
            return abstractC2160;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m6085(InterfaceC2121 interfaceC2121) {
        if (this.f8482 == null) {
            this.f8482 = new ArrayList();
        }
        this.f8482.add(interfaceC2121);
    }

    /* renamed from: ˑי */
    public Animator mo5982(ViewGroup viewGroup, C2123 c2123, C2123 c21232) {
        return null;
    }

    /* renamed from: ˑⁱ */
    public void mo6005(TimeInterpolator timeInterpolator) {
        this.f8471 = timeInterpolator;
    }

    /* renamed from: ˑﾞ */
    public void mo6006(ٴˎ r1) {
        this.f8465 = r1;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final C2123 m6086(View view, boolean z) {
        C2122 c2122 = this.f8473;
        if (c2122 != null) {
            return c2122.m6086(view, z);
        }
        return (C2123) ((C2741) (z ? this.f8464 : this.f8470).ˆʿ).get(view);
    }

    /* renamed from: ـˆ */
    public void mo6007(View view) {
        if (this.f8457) {
            if (!this.f8476) {
                ArrayList arrayList = this.f8479;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f8467);
                this.f8467 = f8455;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f8467 = animatorArr;
                m6087(this, InterfaceC2128.f8376, false);
            }
            this.f8457 = false;
        }
    }

    /* renamed from: ᐧʻ */
    public abstract void mo5983(C2123 c2123);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m6087(AbstractC2160 abstractC2160, InterfaceC2128 interfaceC2128, boolean z) {
        AbstractC2160 abstractC21602 = this.f8475;
        if (abstractC21602 != null) {
            abstractC21602.m6087(abstractC2160, interfaceC2128, z);
        }
        ArrayList arrayList = this.f8482;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f8482.size();
        InterfaceC2121[] interfaceC2121Arr = this.f8468;
        if (interfaceC2121Arr == null) {
            interfaceC2121Arr = new InterfaceC2121[size];
        }
        this.f8468 = null;
        InterfaceC2121[] interfaceC2121Arr2 = (InterfaceC2121[]) this.f8482.toArray(interfaceC2121Arr);
        for (int i = 0; i < size; i++) {
            interfaceC2128.mo4337(interfaceC2121Arr2[i], abstractC2160, z);
            interfaceC2121Arr2[i] = null;
        }
        this.f8468 = interfaceC2121Arr2;
    }

    /* renamed from: ᐧⁱ */
    public boolean mo5984(C2123 c2123, C2123 c21232) {
        if (c2123 == null || c21232 == null) {
            return false;
        }
        String[] strArrMo5985 = mo5985();
        if (strArrMo5985 == null) {
            Iterator it = c2123.f8363.keySet().iterator();
            while (it.hasNext()) {
                if (m6076(c2123, c21232, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo5985) {
            if (!m6076(c2123, c21232, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: ᴵʼ */
    public void mo6008() {
        m6079();
        C2741 c2741M6078 = m6078();
        Iterator it = this.f8463.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (c2741M6078.containsKey(animator)) {
                m6079();
                if (animator != null) {
                    animator.addListener(new C2137(this, c2741M6078));
                    long j = this.f8466;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f8460;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f8471;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0168(2, this));
                    animator.start();
                }
            }
        }
        this.f8463.clear();
        m6084();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m6088(boolean z) {
        if (z) {
            ((C2741) this.f8464.ˆʿ).clear();
            ((SparseArray) this.f8464.ˎˑ).clear();
            ((C2742) this.f8464.ᐧˋ).m6970();
        } else {
            ((C2741) this.f8470.ˆʿ).clear();
            ((SparseArray) this.f8470.ˎˑ).clear();
            ((C2742) this.f8470.ᐧˋ).m6970();
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m6089(View view) {
        ArrayList arrayList = this.f8481;
        if (view != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
        this.f8481 = arrayList;
    }

    /* renamed from: ᵎـ */
    public void mo6010(ViewGroup viewGroup, ـﹶ r20, ـﹶ r21, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C2123 c2123;
        Animator animator;
        C2123 c21232;
        C2741 c2741M6078 = m6078();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z = m6082().f8462 != null;
        int i2 = 0;
        while (i2 < size) {
            C2123 c21233 = (C2123) arrayList.get(i2);
            C2123 c21234 = (C2123) arrayList2.get(i2);
            if (c21233 != null && !c21233.f8362.contains(this)) {
                c21233 = null;
            }
            if (c21234 != null && !c21234.f8362.contains(this)) {
                c21234 = null;
            }
            if ((c21233 != null || c21234 != null) && (c21233 == null || c21234 == null || mo5984(c21233, c21234))) {
                Animator animatorMo5982 = mo5982(viewGroup, c21233, c21234);
                if (animatorMo5982 != null) {
                    String str = this.f8472;
                    if (c21234 != null) {
                        String[] strArrMo5985 = mo5985();
                        view = c21234.f8361;
                        if (strArrMo5985 != null && strArrMo5985.length > 0) {
                            c21232 = new C2123(view);
                            C2123 c21235 = (C2123) ((C2741) r21.ˆʿ).get(view);
                            i = size;
                            if (c21235 != null) {
                                int i3 = 0;
                                while (i3 < strArrMo5985.length) {
                                    HashMap map = c21232.f8363;
                                    String str2 = strArrMo5985[i3];
                                    map.put(str2, c21235.f8363.get(str2));
                                    i3++;
                                    strArrMo5985 = strArrMo5985;
                                }
                            }
                            int i4 = c2741M6078.f10778;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = animatorMo5982;
                                    break;
                                }
                                C2150 c2150 = (C2150) c2741M6078.get((Animator) c2741M6078.m7021(i5));
                                if (c2150.f8418 != null && c2150.f8419 == view && c2150.f8416.equals(str) && c2150.f8418.equals(c21232)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = animatorMo5982;
                            c21232 = null;
                        }
                        animatorMo5982 = animator;
                        c2123 = c21232;
                    } else {
                        i = size;
                        view = c21233.f8361;
                        c2123 = null;
                    }
                    if (animatorMo5982 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C2150 c21502 = new C2150();
                        c21502.f8419 = view;
                        c21502.f8416 = str;
                        c21502.f8418 = c2123;
                        c21502.f8421 = windowId;
                        c21502.f8417 = this;
                        c21502.f8420 = animatorMo5982;
                        if (z) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animatorMo5982);
                            animatorMo5982 = animatorSet;
                        }
                        c2741M6078.put(animatorMo5982, c21502);
                        this.f8463.add(animatorMo5982);
                    }
                }
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C2150 c21503 = (C2150) c2741M6078.get((Animator) this.f8463.get(sparseIntArray.keyAt(i6)));
                c21503.f8420.setStartDelay(c21503.f8420.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: ᵔٴ */
    public String mo6012(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f8466 != -1) {
            sb.append("dur(");
            sb.append(this.f8466);
            sb.append(") ");
        }
        if (this.f8460 != -1) {
            sb.append("dly(");
            sb.append(this.f8460);
            sb.append(") ");
        }
        if (this.f8471 != null) {
            sb.append("interp(");
            sb.append(this.f8471);
            sb.append(") ");
        }
        ArrayList arrayList = this.f8461;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8478;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: ᵔﹳ */
    public void mo6013(long j) {
        this.f8460 = j;
    }

    /* renamed from: ᵢʿ */
    public void mo6014() {
        C2741 c2741M6078 = m6078();
        this.f8459 = 0L;
        for (int i = 0; i < this.f8463.size(); i++) {
            Animator animator = (Animator) this.f8463.get(i);
            C2150 c2150 = (C2150) c2741M6078.get(animator);
            if (animator != null && c2150 != null) {
                long j = this.f8466;
                Animator animator2 = c2150.f8420;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f8460;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f8471;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f8479.add(animator);
                this.f8459 = Math.max(this.f8459, AbstractC2131.m6030(animator));
            }
        }
        this.f8463.clear();
    }

    /* renamed from: ᵢٴ */
    public void mo6015(ˑʽ r1) {
        if (r1 == null) {
            this.f8474 = f8453;
        } else {
            this.f8474 = r1;
        }
    }

    /* renamed from: ﹳˎ */
    public void mo6016(ViewGroup viewGroup) {
        C2741 c2741M6078 = m6078();
        int i = c2741M6078.f10778;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C2741 c2741 = new C2741(c2741M6078);
        c2741M6078.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            C2150 c2150 = (C2150) c2741.m7016(i2);
            if (c2150.f8419 != null && windowId.equals(c2150.f8421)) {
                ((Animator) c2741.m7021(i2)).end();
            }
        }
    }

    /* renamed from: ﹳˑ */
    public boolean mo6017() {
        return !this.f8479.isEmpty();
    }

    /* renamed from: ﹳﹳ */
    public void mo6018(View view) {
        this.f8478.add(view);
    }

    /* renamed from: ﹳﹶ */
    public AbstractC2160 mo6019(InterfaceC2121 interfaceC2121) {
        AbstractC2160 abstractC2160;
        ArrayList arrayList = this.f8482;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC2121) && (abstractC2160 = this.f8475) != null) {
            abstractC2160.mo6019(interfaceC2121);
        }
        if (this.f8482.size() == 0) {
            this.f8482 = null;
        }
        return this;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m6090(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C2123 c2123 = new C2123(view);
            if (z) {
                mo5979(c2123);
            } else {
                mo5983(c2123);
            }
            c2123.f8362.add(this);
            mo5999(c2123);
            if (z) {
                m6077(this.f8464, view, c2123);
            } else {
                m6077(this.f8470, view, c2123);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList arrayList = this.f8481;
            if (arrayList == null || !arrayList.contains(view)) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m6090(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: ﾞʽ */
    public String[] mo5985() {
        return null;
    }

    /* renamed from: ﾞᐧ */
    public void mo6021(long j, long j2) {
        long j3 = this.f8459;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f8476 = false;
            m6087(this, InterfaceC2128.f8373, z);
        }
        ArrayList arrayList = this.f8479;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f8467);
        this.f8467 = f8455;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            AbstractC2131.m6029(animator, Math.min(Math.max(0L, j), AbstractC2131.m6030(animator)));
        }
        this.f8467 = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.f8476 = true;
        }
        m6087(this, InterfaceC2128.f8374, z);
    }
}
