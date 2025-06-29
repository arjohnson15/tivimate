package p378;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ᵢٴ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4390 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final ArrayList f16916 = new ArrayList();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public SparseArray f16917;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public WeakReference f16918;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public WeakHashMap f16919;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final View m9981(View view) {
        int size;
        WeakHashMap weakHashMap = this.f16919;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewM9981 = m9981(viewGroup.getChildAt(childCount));
                    if (viewM9981 != null) {
                        return viewM9981;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id._2_res_0x7f0b0381);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
