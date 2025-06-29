package p331;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0113;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.AbstractC0543;
import com.google.android.gms.internal.measurement.C0504;
import com.google.android.gms.internal.measurement.C0506;
import com.google.android.gms.internal.measurement.EnumC0356;
import com.google.android.gms.internal.measurement.InterfaceC0489;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import net.engio.mbassy.bus.error.MissingPropertyException;
import p033.C1219;
import p058.InterfaceC1350;
import p065.AbstractC1502;
import p065.C1529;
import p138.C2111;
import p138.C2114;
import p138.C2116;
import p254.InterfaceC3165;
import p254.InterfaceC3183;
import p266.C3263;
import p305.C3525;
import p306.C3547;
import p306.C3550;
import p306.C3554;
import p334.C3789;
import p378.InterfaceC4359;
import p383.AbstractC4470;
import p383.C4457;
import p383.C4458;
import p396.AbstractC4581;
import p396.C4590;
import p396.InterfaceC4576;
import p411.InterfaceC4690;
import p428.AbstractC4928;
import p430.C4994;
import p430.InterfaceC4992;
import p452.InterfaceC5193;
import ˆʽ.ᵎˏ;
import ˈˉ.ﹳﹳ;
import ˊﹶ.ˋˉ;
import ᵎﹳ.ᐧʻ;
import ᵔʼ.ˑʽ;
import ﹶˋ.ـﹶ;

/* renamed from: ᴵﹳ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3758 implements InterfaceC1350, InterfaceC4690, InterfaceC4359, InterfaceC3183, InterfaceC4992 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f14519;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f14520;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f14521;

    public C3758(int i) {
        this.f14521 = i;
        switch (i) {
            case 18:
                C3525 c3525 = C3525.f13650;
                this.f14519 = new SparseIntArray();
                this.f14520 = c3525;
                break;
            default:
                this.f14519 = new HashMap();
                break;
        }
    }

    public C3758(int i, int i2) {
        this.f14521 = 16;
        this.f14519 = new int[]{i, i2};
        this.f14520 = new float[]{0.0f, 1.0f};
    }

    public C3758(int i, int i2, int i3) {
        this.f14521 = 16;
        this.f14519 = new int[]{i, i2, i3};
        this.f14520 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ C3758(int i, Object obj, Object obj2, boolean z) {
        this.f14521 = i;
        this.f14519 = obj2;
        this.f14520 = obj;
    }

    public /* synthetic */ C3758(int i, boolean z) {
        this.f14521 = i;
    }

    public C3758(AbstractC0104 abstractC0104) {
        this.f14521 = 12;
        this.f14519 = abstractC0104;
        this.f14520 = new CopyOnWriteArrayList();
    }

    public C3758(WorkDatabase_Impl workDatabase_Impl) {
        this.f14521 = 0;
        this.f14519 = workDatabase_Impl;
        this.f14520 = new C3757(workDatabase_Impl, 1);
    }

    public /* synthetic */ C3758(Object obj, int i, Object obj2) {
        this.f14521 = i;
        this.f14519 = obj;
        this.f14520 = obj2;
    }

    public C3758(ArrayList arrayList, ArrayList arrayList2) {
        this.f14521 = 16;
        int size = arrayList.size();
        this.f14519 = new int[size];
        this.f14520 = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f14519)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f14520)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C3758(C1219 c1219) {
        this.f14521 = 11;
        this.f14519 = c1219;
        this.f14520 = new AtomicBoolean(false);
    }

    public C3758(C3761 c3761) throws Resources.NotFoundException, IOException {
        this.f14521 = 6;
        int iM11048 = AbstractC4928.m11048((Context) c3761.f14527, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) c3761.f14527;
        if (iM11048 != 0) {
            this.f14519 = "Unity";
            String string = context.getResources().getString(iM11048);
            this.f14520 = string;
            ᐧʻ.ﾞˊ("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f14519 = "Flutter";
                this.f14520 = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    return;
                } else {
                    return;
                }
            } catch (IOException unused) {
            }
        }
        this.f14519 = null;
        this.f14520 = null;
    }

    public C3758(C4458 c4458) {
        this.f14521 = 14;
        this.f14519 = c4458;
        this.f14520 = new C4457();
    }

    public C3758(InterfaceC1350[] interfaceC1350Arr) {
        this.f14521 = 4;
        this.f14519 = interfaceC1350Arr;
        this.f14520 = new ˑʽ();
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static C3758 m8722(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new C3758(context, 8, uriBuildDocumentUriUsingTree);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    @Override // p452.InterfaceC5193
    public Object get() {
        switch (this.f14521) {
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C2114((Context) ((C3263) this.f14519).f12727, (C2116) ((C2111) this.f14520).get());
            default:
                return new C3554(new ˑʽ(), new ﹳﹳ(22), C3550.f13711, (C3547) ((ˋˉ) this.f14519).get(), (InterfaceC5193) this.f14520);
        }
    }

    @Override // p254.InterfaceC3183
    /* renamed from: ʽᐧ */
    public void mo7562() {
        byte[] bArr = AbstractC4470.f17203;
        C4457 c4457 = (C4457) this.f14520;
        c4457.getClass();
        c4457.m10081(bArr.length, bArr);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m8723(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8723(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public void m8724(C0504 c0504) {
        Iterator it = c0504.f2851.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f14519).put(((EnumC0356) it.next()).toString(), c0504);
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public void m8725(C3775 c3775) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14519;
        workDatabase_Impl.m5041();
        workDatabase_Impl.m5048();
        try {
            ((C3757) this.f14520).m8720(c3775);
            workDatabase_Impl.m5055();
        } finally {
            workDatabase_Impl.m5046();
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m8726(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8726(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p058.InterfaceC1350
    /* renamed from: ˉⁱ */
    public StackTraceElement[] mo4704(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC1350[] interfaceC1350Arr = (InterfaceC1350[]) this.f14519;
        StackTraceElement[] stackTraceElementArrMo4704 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            InterfaceC1350 interfaceC1350 = interfaceC1350Arr[i];
            if (stackTraceElementArrMo4704.length <= 1024) {
                break;
            }
            stackTraceElementArrMo4704 = interfaceC1350.mo4704(stackTraceElementArr);
        }
        return stackTraceElementArrMo4704.length > 1024 ? ((ˑʽ) this.f14520).ˉⁱ(stackTraceElementArrMo4704) : stackTraceElementArrMo4704;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public Object m8727(String str) {
        HashMap map = (HashMap) this.f14520;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new MissingPropertyException(ᵎˏ.ˑי("The property ", str, " is not available in this runtime"));
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public void m8728(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8728(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public void m8729(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, View view, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8729(abstractComponentCallbacksC0100, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void m8730(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractC0104 abstractC0104 = (AbstractC0104) this.f14519;
        AbstractActivityC0113 abstractActivityC0113 = abstractC0104.f635.f13385;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = abstractC0104.f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8730(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m8731(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, Bundle bundle, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8731(abstractComponentCallbacksC0100, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p430.InterfaceC4992
    /* renamed from: ˏᵢ */
    public void mo5427(IOException iOException) {
        try {
            ((InterfaceC4576) this.f14519).mo7069(iOException);
        } catch (Throwable th) {
            AbstractC4581.m10479(th);
            th.printStackTrace();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m8732(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8732(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m8733(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8733(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public synchronized Map m8734() {
        try {
            if (((Map) this.f14520) == null) {
                this.f14520 = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f14519));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f14520;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c A[EDGE_INSN: B:64:0x011c->B:50:0x011c BREAK  A[LOOP:1: B:36:0x00e3->B:49:0x010b], SYNTHETIC] */
    @Override // p254.InterfaceC3183
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p254.C3166 mo7567(p254.C3159 r17, long r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p331.C3758.mo7567(יי.ˉⁱ, long):יי.ˏᵢ");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // p378.InterfaceC4359
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p378.C4369 mo2871(android.view.View r17, p378.C4369 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f14520
            ʻˉ.ˋⁱ r3 = (p007.C0946) r3
            int r4 = r3.f4158
            java.lang.Object r5 = r0.f14519
            ˊﹶ.ᴵʿ r5 = (p166.C2428) r5
            ᵢٴ.ʽˆ r6 = r2.f16871
            r7 = 7
            ﹳﹶ.ˑʽ r7 = r6.mo9839(r7)
            r8 = 32
            ﹳﹶ.ˑʽ r6 = r6.mo9839(r8)
            int r8 = r7.f18364
            java.lang.Object r9 = r5.f9649
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            r9.f3195 = r8
            int r8 = r17.getLayoutDirection()
            r11 = 1
            if (r8 != r11) goto L2e
            r8 = 1
            goto L2f
        L2e:
            r8 = 0
        L2f:
            int r12 = r17.getPaddingBottom()
            int r13 = r17.getPaddingLeft()
            int r14 = r17.getPaddingRight()
            boolean r15 = r9.f3164
            if (r15 == 0) goto L48
            int r12 = r18.m9953()
            r9.f3156 = r12
            int r10 = r3.f4157
            int r12 = r12 + r10
        L48:
            int r3 = r3.f4156
            boolean r10 = r9.f3167
            int r11 = r7.f18366
            if (r10 == 0) goto L57
            if (r8 == 0) goto L54
            r10 = r3
            goto L55
        L54:
            r10 = r4
        L55:
            int r13 = r10 + r11
        L57:
            boolean r10 = r9.f3182
            int r0 = r7.f18365
            if (r10 == 0) goto L63
            if (r8 == 0) goto L60
            goto L61
        L60:
            r4 = r3
        L61:
            int r14 = r4 + r0
        L63:
            android.view.ViewGroup$LayoutParams r3 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r9.f3181
            if (r4 == 0) goto L75
            int r4 = r3.leftMargin
            if (r4 == r11) goto L75
            r3.leftMargin = r11
            r10 = 1
            goto L76
        L75:
            r10 = 0
        L76:
            boolean r4 = r9.f3189
            if (r4 == 0) goto L81
            int r4 = r3.rightMargin
            if (r4 == r0) goto L81
            r3.rightMargin = r0
            r10 = 1
        L81:
            boolean r0 = r9.f3146
            if (r0 == 0) goto L8f
            int r0 = r3.topMargin
            int r4 = r7.f18364
            if (r0 == r4) goto L8f
            r3.topMargin = r4
            r11 = 1
            goto L90
        L8f:
            r11 = r10
        L90:
            if (r11 == 0) goto L95
            r1.setLayoutParams(r3)
        L95:
            int r0 = r17.getPaddingTop()
            r1.setPadding(r13, r0, r14, r12)
            boolean r0 = r5.f9650
            if (r0 == 0) goto La4
            int r1 = r6.f18367
            r9.f3157 = r1
        La4:
            if (r15 != 0) goto La8
            if (r0 == 0) goto Lab
        La8:
            r9.m2815()
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p331.C3758.mo2871(android.view.View, ᵢٴ.ٴﹶ):ᵢٴ.ٴﹶ");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m8735(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8735(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC0489 m8736(ـﹶ r4, InterfaceC0489 interfaceC0489) {
        AbstractC0543.m2450(r4);
        if (!(interfaceC0489 instanceof C0506)) {
            return interfaceC0489;
        }
        C0506 c0506 = (C0506) interfaceC0489;
        ArrayList arrayList = c0506.f2853;
        HashMap map = (HashMap) this.f14519;
        String str = c0506.f2854;
        return (map.containsKey(str) ? (C0504) map.get(str) : (C0504) this.f14520).m2344(str, r4, arrayList);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m8737(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8737(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void m8738(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8738(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m8739(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8739(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[LOOP:1: B:29:0x0078->B:31:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8 A[LOOP:2: B:33:0x008a->B:73:0x00f8, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p331.C3758 m8740(java.lang.String r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p331.C3758.m8740(java.lang.String):ᴵﹳ.ʿʼ");
    }

    @Override // p430.InterfaceC4992
    /* renamed from: ﹳˑ */
    public void mo5428(C4994 c4994) {
        InterfaceC4576 interfaceC4576 = (InterfaceC4576) this.f14519;
        C4590 c4590 = (C4590) this.f14520;
        try {
            try {
                interfaceC4576.mo7070(c4590, c4590.m10489(c4994));
            } catch (Throwable th) {
                AbstractC4581.m10479(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC4581.m10479(th2);
            try {
                interfaceC4576.mo7069(th2);
            } catch (Throwable th3) {
                AbstractC4581.m10479(th3);
                th3.printStackTrace();
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m8741(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractC0104 abstractC0104 = (AbstractC0104) this.f14519;
        AbstractActivityC0113 abstractActivityC0113 = abstractC0104.f635.f13385;
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = abstractC0104.f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8741(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public void m8742(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100, boolean z) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC01002 = ((AbstractC0104) this.f14519).f616;
        if (abstractComponentCallbacksC01002 != null) {
            abstractComponentCallbacksC01002.getParentFragmentManager().f610.m8742(abstractComponentCallbacksC0100, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14520).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public Long m8743(String str) {
        TreeMap treeMap = C1529.f6210;
        C1529 c1529M5069 = AbstractC1502.m5069(1, "SELECT long_value FROM Preference where `key`=?");
        c1529M5069.mo4420(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14519;
        workDatabase_Impl.m5041();
        Long lValueOf = null;
        Cursor cursorM5052 = workDatabase_Impl.m5052(c1529M5069, null);
        try {
            if (cursorM5052.moveToFirst() && !cursorM5052.isNull(0)) {
                lValueOf = Long.valueOf(cursorM5052.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM5052.close();
            c1529M5069.m5111();
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public InterfaceC3165 m8744(Object... objArr) {
        Constructor constructorM4333;
        synchronized (((AtomicBoolean) this.f14520)) {
            if (!((AtomicBoolean) this.f14520).get()) {
                try {
                    constructorM4333 = ((C1219) this.f14519).m4333();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f14520).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorM4333 = null;
        }
        if (constructorM4333 == null) {
            return null;
        }
        try {
            return (InterfaceC3165) constructorM4333.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
