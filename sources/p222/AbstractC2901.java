package p222;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p378.AbstractC4345;
import p378.C4389;
import ˏᵢ.ᵢٴ;

/* renamed from: ˏᴵ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2901 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m7246(DragEvent dragEvent, View view, Activity activity) {
        ᵢٴ c4389;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c4389 = new ᵢٴ(clipData, 3);
        } else {
            c4389 = new C4389();
            c4389.f16910 = clipData;
            c4389.f16912 = 3;
        }
        AbstractC4345.m9877(view, c4389.mo9932());
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m7247(DragEvent dragEvent, TextView textView, Activity activity) {
        ᵢٴ c4389;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c4389 = new ᵢٴ(clipData, 3);
            } else {
                c4389 = new C4389();
                c4389.f16910 = clipData;
                c4389.f16912 = 3;
            }
            AbstractC4345.m9877(textView, c4389.mo9932());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
