package p120;

import android.view.View;
import androidx.lifecycle.RunnableC0246;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import p224.C2982;
import p413.RunnableC4710;

/* renamed from: ˈˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1865 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f7122;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f7123;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f7124;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f7125;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f7126;

    public /* synthetic */ C1865() {
        this.f7125 = 0;
    }

    public C1865(BottomSheetBehavior bottomSheetBehavior) {
        this.f7125 = 2;
        this.f7123 = bottomSheetBehavior;
        this.f7126 = new RunnableC4710(0, this);
    }

    public C1865(SideSheetBehavior sideSheetBehavior) {
        this.f7125 = 1;
        this.f7123 = sideSheetBehavior;
        this.f7126 = new RunnableC0246(16, this);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int m5628(int i, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.f7126;
        try {
            int i2 = this.f7122;
            if (i + i2 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i3 = 0;
            if (i2 != 0) {
                if (!this.f7124) {
                    throw new DataLengthException("data not block size aligned");
                }
                ((C2982) this.f7123).m7405(0, 0, bArr2, bArr2);
                int i4 = this.f7122;
                this.f7122 = 0;
                System.arraycopy(bArr2, 0, bArr, i, i4);
                i3 = i4;
            }
            m5629();
            return i3;
        } catch (Throwable th) {
            m5629();
            throw th;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m5629() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f7126;
            if (i >= bArr.length) {
                this.f7122 = 0;
                ((C2982) this.f7123).getClass();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m5630(int i) {
        switch (this.f7125) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7123;
                WeakReference weakReference = sideSheetBehavior.f3378;
                if (weakReference != null && weakReference.get() != null) {
                    this.f7122 = i;
                    if (!this.f7124) {
                        ((View) sideSheetBehavior.f3378.get()).postOnAnimation((RunnableC0246) this.f7126);
                        this.f7124 = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f7123;
                WeakReference weakReference2 = bottomSheetBehavior.f3154;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f7122 = i;
                    if (!this.f7124) {
                        ((View) bottomSheetBehavior.f3154.get()).postOnAnimation((RunnableC4710) this.f7126);
                        this.f7124 = true;
                        break;
                    }
                }
                break;
        }
    }
}
