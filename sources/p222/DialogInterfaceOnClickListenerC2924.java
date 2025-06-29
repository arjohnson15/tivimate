package p222;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p225.C2990;
import p225.C3009;
import p225.DialogInterfaceC2998;

/* renamed from: ˏᴵ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2924 implements InterfaceC2955, DialogInterface.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2937 f11329;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public CharSequence f11330;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C2904 f11331;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public DialogInterfaceC2998 f11332;

    public DialogInterfaceOnClickListenerC2924(C2904 c2904) {
        this.f11331 = c2904;
    }

    @Override // p222.InterfaceC2955
    public final void dismiss() {
        DialogInterfaceC2998 dialogInterfaceC2998 = this.f11332;
        if (dialogInterfaceC2998 != null) {
            dialogInterfaceC2998.dismiss();
            this.f11332 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2904 c2904 = this.f11331;
        c2904.setSelection(i);
        if (c2904.getOnItemClickListener() != null) {
            c2904.performItemClick(null, i, this.f11329.getItemId(i));
        }
        dismiss();
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo7274() {
        DialogInterfaceC2998 dialogInterfaceC2998 = this.f11332;
        if (dialogInterfaceC2998 != null) {
            return dialogInterfaceC2998.isShowing();
        }
        return false;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Drawable mo7275() {
        return null;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˉי */
    public final void mo7259(int i) {
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˉⁱ */
    public final void mo7260(int i, int i2) {
        if (this.f11329 == null) {
            return;
        }
        C2904 c2904 = this.f11331;
        C2990 c2990 = new C2990(c2904.getPopupContext());
        CharSequence charSequence = this.f11330;
        if (charSequence != null) {
            c2990.setTitle(charSequence);
        }
        C2937 c2937 = this.f11329;
        int selectedItemPosition = c2904.getSelectedItemPosition();
        C3009 c3009 = c2990.f11507;
        c3009.f11549 = c2937;
        c3009.f11559 = this;
        c3009.f11560 = selectedItemPosition;
        c3009.f11550 = true;
        DialogInterfaceC2998 dialogInterfaceC2998Create = c2990.create();
        this.f11332 = dialogInterfaceC2998Create;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC2998Create.f11525.f11683;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f11332.show();
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int mo7276() {
        return 0;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo7277(int i) {
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˏᴵ */
    public final void mo7261(ListAdapter listAdapter) {
        this.f11329 = (C2937) listAdapter;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo7278(Drawable drawable) {
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int mo7279() {
        return 0;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ٴˎ */
    public final void mo7262(CharSequence charSequence) {
        this.f11330 = charSequence;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ᴵʿ */
    public final CharSequence mo7263() {
        return this.f11330;
    }

    @Override // p222.InterfaceC2955
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo7280(int i) {
    }
}
