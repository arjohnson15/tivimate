package p149;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;
import androidx.preference.DialogPreference;
import p225.C2990;
import p225.C3009;
import p225.DialogInterfaceC2998;

/* renamed from: ˊʾ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC2305 extends DialogInterfaceOnCancelListenerC0116 implements DialogInterface.OnClickListener {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public CharSequence f9097;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f9098;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public BitmapDrawable f9099;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public int f9100;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public CharSequence f9101;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public CharSequence f9102;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public DialogPreference f9103;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public CharSequence f9104;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9100 = i;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractComponentCallbacksC0100 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof AbstractC2282)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        AbstractC2282 abstractC2282 = (AbstractC2282) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f9097 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f9102 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f9101 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f9104 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f9098 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f9099 = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) abstractC2282.m6301(string);
        this.f9103 = dialogPreference;
        this.f9097 = dialogPreference.f1522;
        this.f9102 = dialogPreference.f1523;
        this.f9101 = dialogPreference.f1524;
        this.f9104 = dialogPreference.f1526;
        this.f9098 = dialogPreference.f1527;
        Drawable drawable = dialogPreference.f1525;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f9099 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f9099 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo6309(this.f9100 == -1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f9097);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f9102);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f9101);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f9104);
        bundle.putInt("PreferenceDialogFragment.layout", this.f9098);
        BitmapDrawable bitmapDrawable = this.f9099;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public void mo6349(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f9104;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    /* renamed from: ˉᵎ */
    public abstract void mo6309(boolean z);

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final DialogPreference m6350() {
        if (this.f9103 == null) {
            this.f9103 = (DialogPreference) ((AbstractC2282) getTargetFragment()).m6301(requireArguments().getString("key"));
        }
        return this.f9103;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0116
    /* renamed from: ᵔ */
    public final Dialog mo742(Bundle bundle) {
        this.f9100 = -2;
        C2990 title = new C2990(requireContext()).setTitle(this.f9097);
        BitmapDrawable bitmapDrawable = this.f9099;
        C3009 c3009 = title.f11507;
        c3009.f11554 = bitmapDrawable;
        c3009.f11558 = this.f9102;
        c3009.f11553 = this;
        c3009.f11564 = this.f9101;
        c3009.f11547 = this;
        requireContext();
        int i = this.f9098;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            mo6349(viewInflate);
            title.setView(viewInflate);
        } else {
            c3009.f11557 = this.f9104;
        }
        mo6310(title);
        DialogInterfaceC2998 dialogInterfaceC2998Create = title.create();
        if (this instanceof C2309) {
            Window window = dialogInterfaceC2998Create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                AbstractC2296.m6341(window);
            } else {
                C2309 c2309 = (C2309) this;
                c2309.f9121 = SystemClock.currentThreadTimeMillis();
                c2309.m6356();
            }
        }
        return dialogInterfaceC2998Create;
    }

    /* renamed from: ⁱʿ */
    public void mo6310(C2990 c2990) {
    }
}
