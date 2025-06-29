package p061;

import android.graphics.Rect;
import android.view.View;
import p049.C1310;
import p192.C2675;
import p192.InterfaceC2663;
import p262.InterfaceC3255;

/* renamed from: ʾـ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1420 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f5785;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f5786;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5787;

    public AbstractC1420(int i, String str, String str2) {
        this.f5787 = i;
        this.f5785 = str;
        this.f5786 = str2;
    }

    public AbstractC1420(AbstractC1402 abstractC1402) {
        this.f5787 = Integer.MIN_VALUE;
        this.f5786 = new Rect();
        this.f5785 = abstractC1402;
    }

    public AbstractC1420(InterfaceC2663 interfaceC2663) {
        this.f5787 = 0;
        this.f5786 = new C2675();
        this.f5785 = interfaceC2663;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static AbstractC1420 m4913(AbstractC1402 abstractC1402, int i) {
        if (i == 0) {
            return new C1357(abstractC1402, 0);
        }
        if (i == 1) {
            return new C1357(abstractC1402, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: ʿʼ */
    public abstract int mo4713(View view);

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public abstract void mo4914(InterfaceC3255 interfaceC3255);

    /* renamed from: ˉי */
    public abstract int mo4714();

    /* renamed from: ˉⁱ */
    public abstract int mo4715();

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public abstract void mo4915(InterfaceC3255 interfaceC3255);

    /* renamed from: ˋⁱ */
    public abstract int mo4716();

    /* renamed from: ˎٴ */
    public abstract void mo4717(int i);

    /* renamed from: ˏʾ */
    public abstract int mo4718();

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int m4916() {
        if (Integer.MIN_VALUE == this.f5787) {
            return 0;
        }
        return mo4723() - this.f5787;
    }

    /* renamed from: ˏᵢ */
    public abstract int mo4719();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract void mo4917(InterfaceC3255 interfaceC3255);

    /* renamed from: ˑי */
    public abstract int mo4720(View view);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract void mo4918(InterfaceC3255 interfaceC3255);

    /* renamed from: ٴˎ */
    public abstract int mo4721(View view);

    /* renamed from: ᐧʻ */
    public abstract int mo4722(View view);

    /* renamed from: ᴵʿ */
    public abstract int mo4723();

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public abstract void mo4919();

    /* renamed from: ᵎـ */
    public abstract int mo4724(View view);

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public abstract void mo4920(InterfaceC3255 interfaceC3255);

    /* renamed from: ﹳﹳ */
    public abstract int mo4725(View view);

    /* renamed from: ﹶˆ */
    public abstract int mo4726();

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public abstract C1310 mo4921(InterfaceC3255 interfaceC3255);
}
