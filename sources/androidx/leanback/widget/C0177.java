package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.lsposed.hiddenapibypass.library.R;
import p334.C3789;

/* renamed from: androidx.leanback.widget.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0177 implements RecognitionListener {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ SearchBar f1139;

    public C0177(SearchBar searchBar) {
        this.f1139 = searchBar;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        switch (i) {
            case 1:
                int i2 = SearchBar.f904;
                break;
            case 2:
                int i3 = SearchBar.f904;
                break;
            case 3:
                int i4 = SearchBar.f904;
                break;
            case 4:
                int i5 = SearchBar.f904;
                break;
            case 5:
                int i6 = SearchBar.f904;
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                int i7 = SearchBar.f904;
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                int i8 = SearchBar.f904;
                break;
            case 8:
                int i9 = SearchBar.f904;
                break;
            case 9:
                int i10 = SearchBar.f904;
                break;
            default:
                int i11 = SearchBar.f904;
                break;
        }
        SearchBar searchBar = this.f1139;
        searchBar.m876();
        searchBar.mo782();
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.size() == 0) {
            return;
        }
        String str = stringArrayList.get(0);
        String str2 = stringArrayList.size() > 1 ? stringArrayList.get(1) : null;
        SearchEditText searchEditText = this.f1139.f908;
        searchEditText.getClass();
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            Matcher matcher = AbstractC0144.f1040.matcher(str2);
            while (matcher.find()) {
                int iStart = matcher.start() + length;
                spannableStringBuilder.setSpan(new C0139(searchEditText, str2.charAt(matcher.start()), iStart), iStart, matcher.end() + length, 33);
            }
        }
        searchEditText.f1045 = Math.max(str.length(), searchEditText.f1045);
        searchEditText.setText(new SpannedString(spannableStringBuilder));
        searchEditText.bringPointIntoView(searchEditText.length());
        ObjectAnimator objectAnimator = searchEditText.f1043;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int streamPosition = searchEditText.getStreamPosition();
        int length2 = searchEditText.length();
        int i = length2 - streamPosition;
        if (i > 0) {
            if (searchEditText.f1043 == null) {
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                searchEditText.f1043 = objectAnimator2;
                objectAnimator2.setTarget(searchEditText);
                searchEditText.f1043.setProperty(AbstractC0144.f1041);
            }
            searchEditText.f1043.setIntValues(streamPosition, length2);
            searchEditText.f1043.setDuration(i * 50);
            searchEditText.f1043.start();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SearchBar searchBar = this.f1139;
        SpeechOrbView speechOrbView = searchBar.f913;
        speechOrbView.setOrbColors(speechOrbView.f968);
        speechOrbView.setOrbIcon(speechOrbView.getResources().getDrawable(R.drawable._2_res_0x7f080192));
        speechOrbView.m879(true);
        speechOrbView.f940 = false;
        speechOrbView.m878();
        View view = speechOrbView.f937;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        speechOrbView.f965 = 0;
        speechOrbView.f966 = true;
        searchBar.mo783();
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ʾי.ˑʽ r4;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        SearchBar searchBar = this.f1139;
        if (stringArrayList != null) {
            String str = stringArrayList.get(0);
            searchBar.f909 = str;
            searchBar.f908.setText(str);
            if (!TextUtils.isEmpty(searchBar.f909) && (r4 = searchBar.f919) != null) {
                ʽᵔ.ﾞﾞ.ᵎˆ((ʽᵔ.ﾞﾞ) r4.ˆʿ, searchBar.f909, true);
            }
        }
        searchBar.m876();
        searchBar.mo784();
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        this.f1139.f913.setSoundLevel(f < 0.0f ? 0 : (int) (f * 10.0f));
    }
}
