package p361;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import j$.util.Objects;
import java.io.IOException;
import org.lsposed.hiddenapibypass.library.R;
import org.xmlpull.v1.XmlPullParserException;
import p237.C3093;
import p239.AbstractC3098;

/* renamed from: ᵔᵔ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4103 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4089 f15835;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4096 f15836;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4096 f15837;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int[][] f15838;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f15839;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4096 f15840;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C4096 f15841;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4089[] f15842;

    public C4103(C3093 c3093) {
        this.f15839 = c3093.f11934;
        this.f15835 = (C4089) c3093.f11937;
        this.f15838 = (int[][]) c3093.f11941;
        this.f15842 = (C4089[]) c3093.f11935;
        this.f15836 = (C4096) c3093.f11939;
        this.f15840 = (C4096) c3093.f11940;
        this.f15841 = (C4096) c3093.f11936;
        this.f15837 = (C4096) c3093.f11942;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4103 m9399(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        C3093 c3093 = new C3093(2);
        c3093.m7604();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            c3093.m7604();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                m9400(c3093, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            return c3093.m7598();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9400(C3093 c3093, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC3098.f11967;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                C4089 c4089M9375 = C4089.m9379(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new C4097(0)).m9375();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr._2_res_0x7f040500 && attributeNameResource != R.attr._2_res_0x7f040508) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                c3093.m7603(StateSet.trimStateSet(iArr2, i), c4089M9375);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4089 m9401() {
        C4089 c4089 = this.f15835;
        C4096 c4096 = this.f15837;
        C4096 c40962 = this.f15841;
        C4096 c40963 = this.f15840;
        C4096 c40964 = this.f15836;
        if (c40964 == null && c40963 == null && c40962 == null && c4096 == null) {
            return c4089;
        }
        C4087 c4087M9381 = c4089.m9381();
        if (c40964 != null) {
            c4087M9381.f15758 = c40964.f15802;
        }
        if (c40963 != null) {
            c4087M9381.f15765 = c40963.f15802;
        }
        if (c40962 != null) {
            c4087M9381.f15762 = c40962.f15802;
        }
        if (c4096 != null) {
            c4087M9381.f15766 = c4096.f15802;
        }
        return c4087M9381.m9375();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m9402() {
        if (this.f15839 > 1) {
            return true;
        }
        C4096 c4096 = this.f15836;
        if (c4096 != null && c4096.f15804 > 1) {
            return true;
        }
        C4096 c40962 = this.f15840;
        if (c40962 != null && c40962.f15804 > 1) {
            return true;
        }
        C4096 c40963 = this.f15841;
        if (c40963 != null && c40963.f15804 > 1) {
            return true;
        }
        C4096 c40964 = this.f15837;
        return c40964 != null && c40964.f15804 > 1;
    }
}
