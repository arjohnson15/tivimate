package p149;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ˊʾ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnCreateContextMenuListenerC2289 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Preference f9064;

    public ViewOnCreateContextMenuListenerC2289(Preference preference) {
        this.f9064 = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f9064;
        CharSequence charSequenceMo1177 = preference.mo1177();
        if (!preference.f1547 || TextUtils.isEmpty(charSequenceMo1177)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceMo1177);
        contextMenu.add(0, 0, 0, R.string._2_res_0x7f130081).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f9064;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f1565.getSystemService("clipboard");
        CharSequence charSequenceMo1177 = preference.mo1177();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMo1177));
        Context context = preference.f1565;
        Toast.makeText(context, context.getString(R.string._2_res_0x7f1301b8, charSequenceMo1177), 0).show();
        return true;
    }
}
