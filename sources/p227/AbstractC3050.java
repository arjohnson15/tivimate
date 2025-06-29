package p227;

import android.view.KeyEvent;
import androidx.leanback.widget.picker.Picker;
import java.util.ArrayList;

/* renamed from: ˑʾ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3050 extends Picker {
    @Override // androidx.leanback.widget.picker.Picker, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 1 || keyCode < 7 || keyCode > 16) {
            return super.dispatchKeyEvent(keyEvent);
        }
        m887(getSelectedColumn(), keyCode - 7);
        performClick();
        return true;
    }

    public String getPin() {
        StringBuilder sb = new StringBuilder();
        int columnsCount = getColumnsCount();
        for (int i = 0; i < columnsCount; i++) {
            sb.append(Integer.toString(m890(i).f11759));
        }
        return sb.toString();
    }

    @Override // android.view.View
    public boolean performClick() {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn == getColumnsCount() - 1) {
            return super.performClick();
        }
        setSelectedColumn(selectedColumn + 1);
        return false;
    }

    public void setNumberOfColumns(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C3053 c3053 = new C3053();
            c3053.f11756 = 0;
            c3053.f11758 = 9;
            c3053.f11757 = "%d";
            arrayList.add(c3053);
        }
        setColumns(arrayList);
    }
}
