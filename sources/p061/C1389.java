package p061;

import android.opengl.GLES20;
import android.support.v4.media.session.AbstractC0002;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p153.C2324;
import p193.C2705;
import p254.C3169;
import p254.InterfaceC3177;
import p266.C3264;
import p341.C3880;
import p341.C3898;
import p341.InterfaceC3904;
import p378.AbstractC4345;
import p383.AbstractC4464;
import p383.C4458;
import ˏᵢ.ᵢٴ;
import ـˊ.ʿʼ;

/* renamed from: ʾـ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1389 implements InterfaceC3904 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5664;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Cloneable f5665;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f5666;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object f5667;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5668;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object f5669;

    public C1389(String str, String str2) throws GlUtil$GlException {
        byte[] bArr;
        byte[] bArr2;
        this.f5668 = 3;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f5664 = iGlCreateProgram;
        AbstractC4464.m10143();
        m4788(iGlCreateProgram, 35633, str);
        m4788(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        AbstractC4464.m10137("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f5665 = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f5666 = new C3264[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.f5664;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            byte[] bArr3 = new byte[i5];
            GLES20.glGetActiveAttrib(i4, i3, i5, new int[i2], 0, new int[i2], 0, new int[i2], 0, bArr3, 0);
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    bArr2 = bArr3;
                    i6 = i5;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i6] == 0) {
                        break;
                    }
                    i6++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i6);
            GLES20.glGetAttribLocation(i4, str3);
            C3264 c3264 = new C3264(7);
            ((C3264[]) this.f5666)[i3] = c3264;
            ((HashMap) this.f5665).put(str3, c3264);
            i3++;
            i2 = 1;
        }
        this.f5669 = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f5664, 35718, iArr4, 0);
        this.f5667 = new ʿʼ[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[i]; i7++) {
            int i8 = this.f5664;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i8, 35719, iArr5, i);
            int i9 = iArr5[i];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                }
            }
            i = 0;
            String str4 = new String(bArr, 0, i10);
            GLES20.glGetUniformLocation(i8, str4);
            ʿʼ r5 = new ʿʼ(7);
            ((ʿʼ[]) this.f5667)[i7] = r5;
            ((HashMap) this.f5669).put(str4, r5);
        }
        AbstractC4464.m10143();
    }

    public C1389(C1366 c1366) {
        this.f5668 = 0;
        this.f5664 = 0;
        this.f5666 = c1366;
        this.f5667 = new C1403(0);
        this.f5665 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1389(C3169 c3169, ᵢٴ r3, byte[] bArr, C2705[] c2705Arr, int i) {
        this.f5668 = 1;
        this.f5666 = c3169;
        this.f5667 = r3;
        this.f5665 = bArr;
        this.f5669 = c2705Arr;
        this.f5664 = i;
    }

    public C1389(C3880 c3880, int i) {
        this.f5668 = 2;
        this.f5669 = c3880;
        this.f5666 = new C2324(5, new byte[5]);
        this.f5667 = new SparseArray();
        this.f5665 = new SparseIntArray();
        this.f5664 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m4788(int i, int i2, String str) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC4464.m10137(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC4464.m10143();
    }

    public String toString() {
        switch (this.f5668) {
            case 0:
                return ((C1403) this.f5667).toString() + ", hidden list:" + ((ArrayList) this.f5665).size();
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4789(View view, int i, boolean z) {
        RecyclerView recyclerView = ((C1366) this.f5666).f5546;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4791(i);
        ((C1403) this.f5667).m4866(childCount, z);
        if (z) {
            m4793(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        AbstractC1373 abstractC1373 = recyclerView.f1684;
        if (abstractC1373 == null || abstractC1375M1270 == null) {
            return;
        }
        abstractC1373.mo4758(abstractC1375M1270);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m4790(int i) {
        int iM4791 = m4791(i);
        ((C1403) this.f5667).m4880(iM4791);
        RecyclerView recyclerView = ((C1366) this.f5666).f5546;
        View childAt = recyclerView.getChildAt(iM4791);
        if (childAt != null) {
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(childAt);
            if (abstractC1375M1270 != null) {
                if (abstractC1375M1270.m4770() && !abstractC1375M1270.m4771()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC1375M1270);
                    throw new IllegalArgumentException(AbstractC0002.m37(recyclerView, sb));
                }
                if (RecyclerView.f1644) {
                    String str = "tmpDetach " + abstractC1375M1270;
                }
                abstractC1375M1270.m4777(256);
            }
        } else if (RecyclerView.f1643) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM4791);
            throw new IllegalArgumentException(AbstractC0002.m37(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM4791);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public int m4791(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C1366) this.f5666).f5546.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C1403 c1403 = (C1403) this.f5667;
            int iM4874 = i - (i2 - c1403.m4874(i2));
            if (iM4874 == 0) {
                while (c1403.m4855(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM4874;
        }
        return -1;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int m4792() {
        return ((C1366) this.f5666).f5546.getChildCount();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m4793(View view) {
        ((ArrayList) this.f5665).add(view);
        C1366 c1366 = (C1366) this.f5666;
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        if (abstractC1375M1270 != null) {
            int i = abstractC1375M1270.f5621;
            View view2 = abstractC1375M1270.f5618;
            if (i != -1) {
                abstractC1375M1270.f5613 = i;
            } else {
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                abstractC1375M1270.f5613 = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c1366.f5546;
            if (recyclerView.m1299()) {
                abstractC1375M1270.f5621 = 4;
                recyclerView.f1688.add(abstractC1375M1270);
            } else {
                WeakHashMap weakHashMap2 = AbstractC4345.f16838;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public View m4794(int i) {
        return ((C1366) this.f5666).f5546.getChildAt(i);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m4795(View view) {
        if (((ArrayList) this.f5665).remove(view)) {
            C1366 c1366 = (C1366) this.f5666;
            AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
            if (abstractC1375M1270 != null) {
                int i = abstractC1375M1270.f5613;
                RecyclerView recyclerView = c1366.f5546;
                if (recyclerView.m1299()) {
                    abstractC1375M1270.f5621 = i;
                    recyclerView.f1688.add(abstractC1375M1270);
                } else {
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    abstractC1375M1270.f5618.setImportantForAccessibility(i);
                }
                abstractC1375M1270.f5613 = 0;
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public View m4796(int i) {
        return ((C1366) this.f5666).f5546.getChildAt(m4791(i));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m4797(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((C1366) this.f5666).f5546;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4791(i);
        ((C1403) this.f5667).m4866(childCount, z);
        if (z) {
            m4793(view);
        }
        AbstractC1375 abstractC1375M1270 = RecyclerView.m1270(view);
        if (abstractC1375M1270 != null) {
            if (!abstractC1375M1270.m4770() && !abstractC1375M1270.m4771()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC1375M1270);
                throw new IllegalArgumentException(AbstractC0002.m37(recyclerView, sb));
            }
            if (RecyclerView.f1644) {
                String str = "reAttach " + abstractC1375M1270;
            }
            abstractC1375M1270.f5619 &= -257;
        } else if (RecyclerView.f1643) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC0002.m37(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    @Override // p341.InterfaceC3904
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4798(p383.C4457 r36) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1389.mo4798(ᵢᵢ.ˋⁱ):void");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int m4799(String str) throws GlUtil$GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f5664, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        AbstractC4464.m10143();
        return iGlGetAttribLocation;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int m4800(View view) {
        int iIndexOfChild = ((C1366) this.f5666).f5546.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        C1403 c1403 = (C1403) this.f5667;
        if (c1403.m4855(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - c1403.m4874(iIndexOfChild);
    }

    @Override // p341.InterfaceC3904
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo4801(C4458 c4458, InterfaceC3177 interfaceC3177, C3898 c3898) {
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int m4802() {
        return ((C1366) this.f5666).f5546.getChildCount() - ((ArrayList) this.f5665).size();
    }
}
