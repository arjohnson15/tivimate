package p378;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p219.AbstractC2840;
import ˆʽ.ᵎˏ;

/* renamed from: ᵢٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4389 implements InterfaceC4357, InterfaceC4334 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f16910;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f16911;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f16912;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f16913;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f16914;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Cloneable f16915;

    public /* synthetic */ C4389() {
        this.f16914 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C4389(View view) {
        this.f16914 = 2;
        this.f16915 = new int[2];
        this.f16911 = view;
    }

    public C4389(C4389 c4389) {
        this.f16914 = 1;
        ClipData clipData = (ClipData) c4389.f16910;
        clipData.getClass();
        this.f16910 = clipData;
        int i = c4389.f16912;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f16912 = i;
        int i2 = c4389.f16913;
        if ((i2 & 1) == i2) {
            this.f16913 = i2;
            this.f16911 = (Uri) c4389.f16911;
            this.f16915 = (Bundle) c4389.f16915;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    public String toString() {
        String str;
        switch (this.f16914) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f16910).getDescription());
                sb.append(", source=");
                int i = this.f16912;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f16913;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f16911;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return ᵎˏ.ˎٴ(sb, ((Bundle) this.f16915) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m9980(C4369 c4369, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C4394) it.next()).f16922.mo9963() & 8) != 0) {
                ((View) this.f16911).setTranslationY(AbstractC2840.m7113(r3.f16922.mo9962(), this.f16913, 0));
                return;
            }
        }
    }

    @Override // p378.InterfaceC4334
    /* renamed from: ˉי */
    public ContentInfo mo9842() {
        return null;
    }

    @Override // p378.InterfaceC4357
    /* renamed from: ˉⁱ */
    public void mo9929(Uri uri) {
        this.f16911 = uri;
    }

    @Override // p378.InterfaceC4357
    /* renamed from: ˋⁱ */
    public void mo9930(int i) {
        this.f16913 = i;
    }

    @Override // p378.InterfaceC4334
    /* renamed from: ˏʾ */
    public int mo9843() {
        return this.f16912;
    }

    @Override // p378.InterfaceC4357
    /* renamed from: ˏᵢ */
    public void mo9931(Bundle bundle) {
        this.f16915 = bundle;
    }

    @Override // p378.InterfaceC4334
    /* renamed from: ـﹶ */
    public ClipData mo9844() {
        return (ClipData) this.f16910;
    }

    @Override // p378.InterfaceC4357
    /* renamed from: ﹳﹳ */
    public C4367 mo9932() {
        return new C4367(new C4389(this));
    }

    @Override // p378.InterfaceC4334
    /* renamed from: ﹶˆ */
    public int mo9845() {
        return this.f16913;
    }
}
