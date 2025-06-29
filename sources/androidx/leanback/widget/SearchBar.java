package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import org.lsposed.hiddenapibypass.library.R;
import p252.AbstractC3139;

/* loaded from: classes.dex */
public class SearchBar extends RelativeLayout {

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static final /* synthetic */ int f904 = 0;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final int f905;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public Drawable f906;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public InterfaceC0188 f907;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public SearchEditText f908;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public String f909;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final SparseIntArray f910;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Drawable f911;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f912;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public SpeechOrbView f913;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final int f914;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int f915;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final int f916;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Handler f917;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ImageView f918;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC0173 f919;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final InputMethodManager f920;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final Context f921;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f922;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public SpeechRecognizer f923;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final int f924;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public String f925;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f926;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public String f927;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public SoundPool f928;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f929;

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f917 = new Handler();
        this.f929 = false;
        this.f910 = new SparseIntArray();
        this.f912 = false;
        this.f921 = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen._2_res_0x7f0701b6));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f909 = "";
        this.f920 = (InputMethodManager) context.getSystemService("input_method");
        this.f915 = resources.getColor(R.color._2_res_0x7f0600f6);
        this.f916 = resources.getColor(R.color._2_res_0x7f0600f5);
        this.f905 = resources.getInteger(R.integer._2_res_0x7f0c002e);
        this.f924 = resources.getInteger(R.integer._2_res_0x7f0c002f);
        this.f914 = resources.getColor(R.color._2_res_0x7f0600f4);
        this.f926 = resources.getColor(R.color._2_res_0x7f0600f3);
    }

    public Drawable getBadgeDrawable() {
        return this.f911;
    }

    public CharSequence getHint() {
        return this.f925;
    }

    public String getTitle() {
        return this.f927;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f928 = new SoundPool(2, 1, 0);
        int[] iArr = {R.raw._2_res_0x7f120004, R.raw._2_res_0x7f120006, R.raw._2_res_0x7f120005, R.raw._2_res_0x7f120007};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            this.f910.put(i2, this.f928.load(this.f921, i2, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m876();
        this.f928.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        this.f906 = ((RelativeLayout) findViewById(R.id._2_res_0x7f0b0242)).getBackground();
        this.f908 = (SearchEditText) findViewById(R.id._2_res_0x7f0b0245);
        ImageView imageView = (ImageView) findViewById(R.id._2_res_0x7f0b0241);
        this.f918 = imageView;
        Drawable drawable = this.f911;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f908.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0146(this, 0));
        this.f908.addTextChangedListener(new ـˈ.ˉי(this, new RunnableC0135(this, 0)));
        int i = 1;
        this.f908.setOnKeyboardDismissListener(new ﾞᐧ(1, this));
        this.f908.setOnEditorActionListener(new C0145(i, this));
        this.f908.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id._2_res_0x7f0b0243);
        this.f913 = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new ViewOnClickListenerC0202(i, this));
        this.f913.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0146(this, 1));
        m874(hasFocus());
        m877();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f911 = drawable;
        ImageView imageView = this.f918;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.f918.setVisibility(0);
            } else {
                this.f918.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i) {
        this.f913.setNextFocusDownId(i);
        this.f908.setNextFocusDownId(i);
    }

    public void setPermissionListener(InterfaceC0188 interfaceC0188) {
        this.f907 = interfaceC0188;
    }

    public void setSearchAffordanceColors(C0166 c0166) {
        SpeechOrbView speechOrbView = this.f913;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(c0166);
        }
    }

    public void setSearchAffordanceColorsInListening(C0166 c0166) {
        SpeechOrbView speechOrbView = this.f913;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(c0166);
        }
    }

    public void setSearchBarListener(InterfaceC0173 interfaceC0173) {
        this.f919 = interfaceC0173;
    }

    public void setSearchQuery(String str) {
        m876();
        this.f908.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f909, str)) {
            return;
        }
        this.f909 = str;
        ʾי.ˑʽ r0 = this.f919;
        if (r0 != null) {
            ʽᵔ.ﾞﾞ.ᵎˆ((ʽᵔ.ﾞﾞ) r0.ˆʿ, str, false);
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(InterfaceC0132 interfaceC0132) {
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        m876();
        SpeechRecognizer speechRecognizer2 = this.f923;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f922) {
                this.f923.cancel();
                this.f922 = false;
            }
        }
        this.f923 = speechRecognizer;
    }

    public void setTitle(String str) throws Resources.NotFoundException {
        this.f927 = str;
        m877();
    }

    /* renamed from: ʽᐧ */
    public void mo782() {
        this.f917.post(new RunnableC0134(R.raw._2_res_0x7f120004, 0, this));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m873() {
        ʽᵔ.ˑʽ r0;
        if (this.f912) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.f923 == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT < 23 || (r0 = this.f907) == null) {
                throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
            }
            AbstractC3139.m7747(r0.ˆʿ.ˎᵢ, "android.permission.RECORD_AUDIO");
            return;
        }
        this.f912 = true;
        this.f908.setText("");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.f923.setRecognitionListener(new C0177(this));
        this.f922 = true;
        this.f923.startListening(intent);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m874(boolean z) {
        if (z) {
            this.f906.setAlpha(this.f905);
            boolean zIsFocused = this.f913.isFocused();
            int i = this.f914;
            if (zIsFocused) {
                this.f908.setTextColor(i);
                this.f908.setHintTextColor(i);
            } else {
                this.f908.setTextColor(this.f915);
                this.f908.setHintTextColor(i);
            }
        } else {
            this.f906.setAlpha(this.f924);
            this.f908.setTextColor(this.f916);
            this.f908.setHintTextColor(this.f926);
        }
        m877();
    }

    /* renamed from: ˑʽ */
    public void mo783() {
        this.f917.post(new RunnableC0134(R.raw._2_res_0x7f120006, 0, this));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m875() {
        this.f920.hideSoftInputFromWindow(this.f908.getWindowToken(), 0);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m876() {
        if (this.f912) {
            this.f908.setText(this.f909);
            this.f908.setHint(this.f925);
            this.f912 = false;
            if (this.f923 == null) {
                return;
            }
            this.f913.m881();
            if (this.f922) {
                this.f923.cancel();
                this.f922 = false;
            }
            this.f923.setRecognitionListener(null);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m877() throws Resources.NotFoundException {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.f927)) {
            string = this.f913.isFocused() ? getResources().getString(R.string._2_res_0x7f130100, this.f927) : getResources().getString(R.string._2_res_0x7f1300ff, this.f927);
        } else if (this.f913.isFocused()) {
            string = getResources().getString(R.string._2_res_0x7f1300fe);
        }
        this.f925 = string;
        SearchEditText searchEditText = this.f908;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    /* renamed from: ﹳﹳ */
    public void mo784() {
        this.f917.post(new RunnableC0134(R.raw._2_res_0x7f120007, 0, this));
    }
}
