package p361;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.C0559;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import p000.InterfaceC0880;
import p033.C1215;
import p033.C1220;
import p166.AbstractC2394;
import p374.AbstractC4273;
import p374.C4245;
import p374.C4256;
import p374.C4281;
import p374.InterfaceC4249;
import p374.InterfaceC4277;
import p374.InterfaceC4294;
import p383.AbstractC4470;
import p383.C4469;
import p438.C5076;
import p438.C5088;
import p438.C5112;
import p438.C5120;
import p438.C5121;
import ˈי.ʾˈ;
import ˊﹶ.ˋˉ;

/* renamed from: ᵔᵔ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4092 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f15786;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f15787;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final Object f15788;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Object f15789;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public Object f15790;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Object f15791;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f15792;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f15793;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object f15794;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f15795;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f15796;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Object f15797;

    public C4092() {
        this.f15786 = new C4107[4];
        this.f15792 = new Matrix[4];
        this.f15796 = new Matrix[4];
        this.f15787 = new PointF();
        this.f15794 = new Path();
        this.f15795 = new Path();
        this.f15788 = new C4107();
        this.f15790 = new float[2];
        this.f15789 = new float[2];
        this.f15791 = new Path();
        this.f15797 = new Path();
        this.f15793 = true;
        for (int i = 0; i < 4; i++) {
            ((C4107[]) this.f15786)[i] = new C4107();
            ((Matrix[]) this.f15792)[i] = new Matrix();
            ((Matrix[]) this.f15796)[i] = new Matrix();
        }
    }

    public C4092(C5076 c5076, C1220 c1220, C4469 c4469, C1215 c1215) {
        this.f15786 = c1215;
        this.f15794 = c5076;
        this.f15790 = new C4245();
        this.f15796 = new IdentityHashMap();
        this.f15787 = new HashMap();
        this.f15792 = new ArrayList();
        this.f15797 = c1220;
        this.f15788 = c4469;
        this.f15795 = new HashMap();
        this.f15791 = new HashSet();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m9385(C4089 c4089, float[] fArr, float f, RectF rectF, ˋˉ r25, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C4107[] c4107Arr;
        int i;
        float[] fArr2;
        C4092 c4092 = this;
        ˋˉ r3 = r25;
        path.rewind();
        Path path2 = (Path) c4092.f15794;
        path2.rewind();
        Path path3 = (Path) c4092.f15795;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            matrixArr = (Matrix[]) c4092.f15796;
            matrixArr2 = (Matrix[]) c4092.f15792;
            c4107Arr = (C4107[]) c4092.f15786;
            fArr2 = (float[]) c4092.f15790;
            if (i2 >= 4) {
                break;
            }
            InterfaceC4104 c4094 = fArr == null ? i2 != 1 ? i2 != 2 ? i2 != 3 ? c4089.f15779 : c4089.f15772 : c4089.f15776 : c4089.f15780 : new C4094(fArr[i2]);
            ʾˈ r12 = i2 != 1 ? i2 != 2 ? i2 != 3 ? c4089.f15771 : c4089.f15778 : c4089.f15781 : c4089.f15777;
            C4107 c4107 = c4107Arr[i2];
            r12.getClass();
            r12.ˉי(c4107, f, c4094.mo9371(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = (PointF) c4092.f15787;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            C4107 c41072 = c4107Arr[i2];
            fArr2[0] = c41072.f15873;
            fArr2[1] = c41072.f15875;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            C4107 c41073 = c4107Arr[i4];
            c41073.getClass();
            fArr2[0] = 0.0f;
            fArr2[1] = c41073.f15876;
            matrixArr2[i4].mapPoints(fArr2);
            if (i4 == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            } else {
                path.lineTo(fArr2[0], fArr2[1]);
            }
            c4107Arr[i4].m9420(matrixArr2[i4], path);
            if (r3 != null) {
                C4107 c41074 = c4107Arr[i4];
                Matrix matrix = matrixArr2[i4];
                C4105 c4105 = (C4105) r3.ˆʿ;
                BitSet bitSet = c4105.f15849;
                c41074.getClass();
                bitSet.set(i4, false);
                c41074.m9422(c41074.f15874);
                c4105.f15855[i4] = new C4095(new ArrayList(c41074.f15878), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C4107 c41075 = c4107Arr[i4];
            fArr2[0] = c41075.f15873;
            fArr2[1] = c41075.f15875;
            matrixArr2[i4].mapPoints(fArr2);
            C4107 c41076 = c4107Arr[i6];
            c41076.getClass();
            float[] fArr3 = (float[]) c4092.f15789;
            fArr3[0] = 0.0f;
            fArr3[1] = c41076.f15876;
            matrixArr2[i6].mapPoints(fArr3);
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            C4107 c41077 = c4107Arr[i4];
            fArr2[0] = c41077.f15873;
            fArr2[1] = c41077.f15875;
            matrixArr2[i4].mapPoints(fArr2);
            if (i4 == 1 || i4 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            C4107 c41078 = (C4107) c4092.f15788;
            c41078.m9423(0.0f, 270.0f, 0.0f);
            (i4 != 1 ? i4 != 2 ? i4 != 3 ? c4089.f15773 : c4089.f15782 : c4089.f15774 : c4089.f15775).getClass();
            c41078.m9421(fMax, 0.0f);
            Path path4 = (Path) c4092.f15791;
            path4.reset();
            c41078.m9420(matrixArr[i4], path4);
            if (c4092.f15793 && (c4092.m9390(path4, i4) || c4092.m9390(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = c41078.f15876;
                matrixArr[i4].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                c41078.m9420(matrixArr[i4], path2);
            } else {
                c41078.m9420(matrixArr[i4], path);
            }
            if (r25 != null) {
                Matrix matrix2 = matrixArr[i4];
                C4105 c41052 = (C4105) r25.ˆʿ;
                c41052.f15849.set(i4 + 4, false);
                c41078.m9422(c41078.f15874);
                c41052.f15860[i4] = new C4095(new ArrayList(c41078.f15878), new Matrix(matrix2));
            }
            c4092 = this;
            i4 = i5;
            r3 = r25;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m9386(C5088 c5088) {
        if (c5088.f19335 && c5088.f19336.isEmpty()) {
            C5112 c5112 = (C5112) ((HashMap) this.f15795).remove(c5088);
            c5112.getClass();
            C5121 c5121 = c5112.f19468;
            InterfaceC4277 interfaceC4277 = c5112.f19470;
            interfaceC4277.mo9735(c5121);
            C0559 c0559 = c5112.f19469;
            interfaceC4277.mo9732(c0559);
            interfaceC4277.mo9738(c0559);
            ((HashSet) this.f15791).remove(c5088);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m9387(InterfaceC4294 interfaceC4294) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f15796;
        C5088 c5088 = (C5088) identityHashMap.remove(interfaceC4294);
        c5088.getClass();
        c5088.f19337.mo6116(interfaceC4294);
        c5088.f19336.remove(((C4281) interfaceC4294).f16623);
        if (!identityHashMap.isEmpty()) {
            m9392();
        }
        m9386(c5088);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public AbstractC2394 m9388() {
        ArrayList arrayList = (ArrayList) this.f15792;
        if (arrayList.isEmpty()) {
            return AbstractC2394.f9448;
        }
        int iMo6474 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            C5088 c5088 = (C5088) arrayList.get(i);
            c5088.f19338 = iMo6474;
            iMo6474 += c5088.f19337.f16537.f16576.mo6474();
        }
        return new C5120(arrayList, (C4245) this.f15790);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC2394 m9389(int i, ArrayList arrayList, C4245 c4245) {
        if (!arrayList.isEmpty()) {
            this.f15790 = c4245;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                C5088 c5088 = (C5088) arrayList.get(i2 - i);
                ArrayList arrayList2 = (ArrayList) this.f15792;
                if (i2 > 0) {
                    C5088 c50882 = (C5088) arrayList2.get(i2 - 1);
                    c5088.f19338 = c50882.f19337.f16537.f16576.mo6474() + c50882.f19338;
                    c5088.f19335 = false;
                    c5088.f19336.clear();
                } else {
                    c5088.f19338 = 0;
                    c5088.f19335 = false;
                    c5088.f19336.clear();
                }
                int iMo6474 = c5088.f19337.f16537.f16576.mo6474();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((C5088) arrayList2.get(i3)).f19338 += iMo6474;
                }
                arrayList2.add(i2, c5088);
                ((HashMap) this.f15787).put(c5088.f19334, c5088);
                if (this.f15793) {
                    m9391(c5088);
                    if (((IdentityHashMap) this.f15796).isEmpty()) {
                        ((HashSet) this.f15791).add(c5088);
                    } else {
                        C5112 c5112 = (C5112) ((HashMap) this.f15795).get(c5088);
                        if (c5112 != null) {
                            c5112.f19470.mo9736(c5112.f19468);
                        }
                    }
                }
            }
        }
        return m9388();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean m9390(Path path, int i) {
        Path path2 = (Path) this.f15797;
        path2.reset();
        ((C4107[]) this.f15786)[i].m9420(((Matrix[]) this.f15792)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ᵢˎ.ˈٴ, ﹶﾞ.ﾞᐧ] */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m9391(C5088 c5088) {
        C4256 c4256 = c5088.f19337;
        ?? r1 = new InterfaceC4249() { // from class: ﹶﾞ.ﾞᐧ
            @Override // p374.InterfaceC4249
            /* renamed from: ـﹶ */
            public final void mo9709(AbstractC4273 abstractC4273, AbstractC2394 abstractC2394) {
                C4469 c4469 = ((C5076) this.f19593.f15794).f19262;
                c4469.m10160(2);
                c4469.m10157(22);
            }
        };
        C0559 c0559 = new C0559(20, this, c5088, false);
        ((HashMap) this.f15795).put(c5088, new C5112(c4256, r1, c0559));
        int i = AbstractC4470.f17202;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c4256.mo9737(new Handler(looperMyLooper, null), c0559);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c4256.mo9729(new Handler(looperMyLooper2, null), c0559);
        c4256.mo9733(r1, (InterfaceC0880) this.f15789, (C1215) this.f15786);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m9392() {
        Iterator it = ((HashSet) this.f15791).iterator();
        while (it.hasNext()) {
            C5088 c5088 = (C5088) it.next();
            if (c5088.f19336.isEmpty()) {
                C5112 c5112 = (C5112) ((HashMap) this.f15795).get(c5088);
                if (c5112 != null) {
                    c5112.f19470.mo9736(c5112.f19468);
                }
                it.remove();
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m9393(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = (ArrayList) this.f15792;
            C5088 c5088 = (C5088) arrayList.remove(i3);
            ((HashMap) this.f15787).remove(c5088.f19334);
            int i4 = -c5088.f19337.f16537.f16576.mo6474();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C5088) arrayList.get(i5)).f19338 += i4;
            }
            c5088.f19335 = true;
            if (this.f15793) {
                m9386(c5088);
            }
        }
    }
}
