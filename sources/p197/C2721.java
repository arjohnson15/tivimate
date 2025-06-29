package p197;

import java.util.Arrays;
import java.util.List;
import p080.AbstractC1702;

/* renamed from: ˎˑ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2721 implements Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final List f10666;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public InterfaceC2717 f10667;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f10668;

    public C2721(C2730... c2730Arr) {
        int length = c2730Arr.length;
        this.f10668 = length;
        this.f10666 = Arrays.asList(c2730Arr);
        C2730 c2730 = c2730Arr[0];
        c2730Arr[length - 1].getClass();
    }

    public final String toString() {
        String string = " ";
        for (int i = 0; i < this.f10668; i++) {
            StringBuilder sbM5407 = AbstractC1702.m5407(string);
            sbM5407.append(Float.valueOf(((C2730) this.f10666.get(i)).f10684));
            sbM5407.append("  ");
            string = sbM5407.toString();
        }
        return string;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2721 clone() {
        List list = this.f10666;
        int size = list.size();
        C2730[] c2730Arr = new C2730[size];
        for (int i = 0; i < size; i++) {
            c2730Arr[i] = ((C2730) list.get(i)).clone();
        }
        return new C2721(c2730Arr);
    }
}
