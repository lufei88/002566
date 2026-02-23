package com.github.catvod.spider.merge.W;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public final class l extends WebViewClient {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int iM1880 = C0007.m1880(this);
        super.onPageFinished(webView, str);
        switch (iM1880) {
            case 5:
                if (C0054.m8632() < 19) {
                    C0048.m7899(webView, C0046.m7724());
                    break;
                } else {
                    C0020.m4198(webView);
                    break;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (C0007.m1880(this)) {
            case 0:
                C0048.m7899(webView, str);
                break;
            case 1:
                C0048.m7899(webView, str);
                break;
            case 2:
                C0048.m7899(webView, str);
                break;
            case 3:
                C0048.m7899(webView, str);
                break;
            case 4:
                C0048.m7899(webView, str);
                break;
            default:
                C0048.m7899(webView, str);
                break;
        }
        return true;
    }
}