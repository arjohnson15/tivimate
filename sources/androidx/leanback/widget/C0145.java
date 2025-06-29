package androidx.leanback.widget;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.preference.EditTextPreference;
import p335.C3790;

/* renamed from: androidx.leanback.widget.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0145 implements TextView.OnEditorActionListener, InterfaceC0191 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f1047;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1048;

    public /* synthetic */ C0145(int i, Object obj) {
        this.f1048 = i;
        this.f1047 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f1048) {
            case 0:
                C0180 c0180 = (C0180) this.f1047;
                if (i != 5 && i != 6) {
                    if (i == 1) {
                        c0180.f1145.ᐧʻ(c0180, textView);
                        break;
                    }
                } else {
                    c0180.f1145.ٴˎ(c0180, textView);
                    break;
                }
                break;
            case 1:
                SearchBar searchBar = (SearchBar) this.f1047;
                if ((3 != i && i != 0) || searchBar.f919 == null) {
                    if (1 == i && searchBar.f919 != null) {
                        searchBar.m875();
                        searchBar.f917.postDelayed(new RunnableC0176(this, 1), 500L);
                        break;
                    } else if (2 == i) {
                        searchBar.m875();
                        searchBar.f917.postDelayed(new RunnableC0176(this, 2), 500L);
                        break;
                    }
                } else {
                    searchBar.m875();
                    searchBar.f917.postDelayed(new RunnableC0176(this, 0), 500L);
                    break;
                }
                break;
            default:
                if (i == 6 || i == 2 || i == 3 || i == 5 || i == 4) {
                    C3790 c3790 = (C3790) this.f1047;
                    ((InputMethodManager) c3790.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                    ((EditTextPreference) c3790.m8886()).m1173(textView.getText().toString());
                    c3790.getFragmentManager().m684();
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean m907(EditText editText, int i, KeyEvent keyEvent) {
        C0180 c0180 = (C0180) this.f1047;
        if (i == 4 && keyEvent.getAction() == 1) {
            c0180.f1145.ᐧʻ(c0180, editText);
            return true;
        }
        if (i != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        c0180.f1145.ٴˎ(c0180, editText);
        return true;
    }
}
