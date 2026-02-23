package com.github.catvod.spider.merge.e0;

import android.view.View;
import android.webkit.WebView;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* renamed from: com.github.catvod.spider.merge.e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0284c implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0288g b;

    public /* synthetic */ ViewOnFocusChangeListenerC0284c(C0288g c0288g, int i) {
        this.a = i;
        this.b = c0288g;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (C0028.m5189(this)) {
            case 0:
                C0288g c0288gM6021 = C0034.m6021(this);
                if (!z) {
                    C0047.m7777(c0288gM6021);
                    break;
                } else {
                    WebView webViewM3158 = C0013.m3158(c0288gM6021);
                    if (webViewM3158 != null && !C0027.m5080(c0288gM6021)) {
                        C0040.m6677(webViewM3158);
                        break;
                    }
                }
                break;
            default:
                C0288g c0288gM60212 = C0034.m6021(this);
                if (!z) {
                    if (!C0027.m5080(c0288gM60212)) {
                        C0047.m7781(C0057.m9027(c0288gM60212), new com.github.catvod.spider.merge.F.b(11, c0288gM60212));
                        break;
                    }
                } else {
                    C0047.m7777(c0288gM60212);
                    break;
                }
                break;
        }
    }
}