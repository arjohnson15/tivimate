package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p000.C0877;
import p000.InterfaceC0864;
import p000.InterfaceC0875;
import p061.C1424;
import p323.InterfaceC3699;
import p331.C3758;
import p383.C4457;
import p412.AbstractC4702;
import p412.C4696;

/* renamed from: androidx.leanback.widget.ʽⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0137 implements InterfaceC0864, InterfaceC3699 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f1032;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f1033;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f1034;

    public C0137(int i) {
        switch (i) {
            case 5:
                this.f1033 = new C0137[256];
                this.f1034 = 0;
                this.f1032 = 0;
                break;
            default:
                this.f1033 = new C3758(2);
                this.f1034 = 8000;
                this.f1032 = 8000;
                break;
        }
    }

    public C0137(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f1033 = new ArrayList();
        this.f1032 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4702.f17911);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1034 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1034);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1032);
                this.f1032 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C4696().m10615((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p323.InterfaceC3699
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int mo899() {
        return this.f1032;
    }

    @Override // p000.InterfaceC0864
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC0875 mo900() {
        return new C0877(this.f1034, this.f1032, (C3758) this.f1033);
    }

    @Override // p323.InterfaceC3699
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int mo901() {
        int i = this.f1034;
        return i == -1 ? ((C4457) this.f1033).m10106() : i;
    }

    @Override // p323.InterfaceC3699
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int mo902() {
        return this.f1034;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m903() {
        int i;
        int i2 = this.f1034;
        if (i2 != 2) {
            if (i2 != 3 && i2 != 1) {
                this.f1033 = null;
                return;
            }
            C1424 c1424 = (C1424) this.f1033;
            if (c1424 == null || c1424.m4935() != Integer.MAX_VALUE) {
                this.f1033 = new C1424(Integer.MAX_VALUE);
                return;
            }
            return;
        }
        if (this.f1032 <= 0) {
            throw new IllegalArgumentException();
        }
        C1424 c14242 = (C1424) this.f1033;
        if (c14242 != null) {
            synchronized (((ٴᐧ.ᐧⁱ) c14242.f5802)) {
                i = c14242.f5797;
            }
            if (i == this.f1032) {
                return;
            }
        }
        this.f1033 = new C1424(this.f1032);
    }
}
