package p052;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ʾʼ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC1318 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ String f5366;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Object f5367;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Context f5368;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5369;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f5370;

    public /* synthetic */ CallableC1318(String str, Context context, Object obj, int i, int i2) {
        this.f5369 = i2;
        this.f5366 = str;
        this.f5368 = context;
        this.f5367 = obj;
        this.f5370 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f5370;
        Object obj = this.f5367;
        Context context = this.f5368;
        String str = this.f5366;
        switch (this.f5369) {
            case 0:
                Object[] objArr = {(C1328) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC1323.m4620(str, context, DesugarCollections.unmodifiableList(arrayList), i);
            default:
                try {
                    return AbstractC1323.m4620(str, context, (List) obj, i);
                } catch (Throwable unused) {
                    return new C1327(-3);
                }
        }
    }
}
