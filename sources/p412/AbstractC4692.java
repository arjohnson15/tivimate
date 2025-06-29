package p412;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p447.AbstractC5172;
import p447.C5171;

/* renamed from: ﹳˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4692 extends View {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f17850;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public String f17851;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Context f17852;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public AbstractC5172 f17853;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int[] f17854;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public String f17855;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public HashMap f17856;

    public AbstractC4692(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17854 = new int[32];
        this.f17856 = new HashMap();
        this.f17852 = context;
        mo166(attributeSet);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f17854, this.f17850);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f17851;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f17855;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f17851 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f17850 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m10603(str.substring(i));
                return;
            } else {
                m10603(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f17855 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f17850 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m10602(str.substring(i));
                return;
            } else {
                m10602(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f17851 = null;
        this.f17850 = 0;
        for (int i : iArr) {
            m10599(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f17851 == null) {
            m10599(i);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10599(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f17850 + 1;
        int[] iArr = this.f17854;
        if (i2 > iArr.length) {
            this.f17854 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f17854;
        int i3 = this.f17850;
        iArr2[i3] = i;
        this.f17850 = i3 + 1;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m10600(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f17850; i++) {
            View view = (View) constraintLayout.f269.get(this.f17854[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: ˉי */
    public void mo174() {
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m10601() {
        if (this.f17853 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C4708) {
            ((C4708) layoutParams).f18009 = this.f17853;
        }
    }

    /* renamed from: ˏᵢ */
    public void mo166(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4702.f17908);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f17851 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f17855 = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10602(String str) {
        if (str == null || str.length() == 0 || this.f17852 == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C4708) && strTrim.equals(((C4708) layoutParams).f17988)) {
                if (childAt.getId() == -1) {
                    String str2 = "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID";
                } else {
                    m10599(childAt.getId());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10603(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto L99
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L99
        La:
            android.content.Context r0 = r5.f17852
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L23
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L24
        L23:
            r1 = r2
        L24:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L4d
            if (r1 == 0) goto L4d
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L41
            java.util.HashMap r3 = r1.f266
            if (r3 == 0) goto L41
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L41
            java.util.HashMap r3 = r1.f266
            java.lang.Object r3 = r3.get(r6)
            goto L42
        L41:
            r3 = r2
        L42:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L4d
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 != 0) goto L56
            if (r1 == 0) goto L56
            int r3 = r5.m10604(r1, r6)
        L56:
            if (r3 != 0) goto L64
            java.lang.Class<ﹳˑ.ˏᴵ> r1 = p412.AbstractC4699.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L63
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
        L64:
            if (r3 != 0) goto L74
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L74:
            if (r3 == 0) goto L83
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f17856
            r1.put(r0, r6)
            r5.m10599(r3)
            goto L99
        L83:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412.AbstractC4692.m10603(java.lang.String):void");
    }

    /* renamed from: ٴˎ */
    public void mo175(ConstraintLayout constraintLayout) {
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m10604(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f17852.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m10605() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m10600((ConstraintLayout) parent);
    }

    /* renamed from: ﹶˆ */
    public void mo167(C5171 c5171, boolean z) {
    }
}
