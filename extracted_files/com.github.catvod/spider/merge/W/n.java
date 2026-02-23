package com.github.catvod.spider.merge.W;

import android.app.Activity;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public abstract class n {
    public static WebView a;
    public static String b;
    public static boolean c;
    public static WebBackForwardList d;

    public static void b(WebView webView) {
        WebSettings webSettingsM8148 = C0050.m8148(webView);
        C0044.m7416(webSettingsM8148, true);
        C0042.m7175(webSettingsM8148, true);
        C0064.m9603(webSettingsM8148, true);
        C0019.m4050(webSettingsM8148, true);
        C0014.m3317(webSettingsM8148, true);
        C0057.m9025(webSettingsM8148, true);
        C0028.m5150(webSettingsM8148, false);
        C0037.m6309(webSettingsM8148, -1);
        int iM8632 = C0054.m8632();
        if (iM8632 >= 19) {
            C0027.m5086();
        }
        if (iM8632 >= 21) {
            C0024.m4654(webSettingsM8148);
            C0045.m7640(C0001.m1175(), webView);
        }
        C0037.m6361(webView, new l(0));
    }

    public static synchronized WebView c(Activity activity) {
        try {
            if (C0024.m4750() == null) {
                WebView webView = new WebView(C0035.m6101(activity));
                a = webView;
                if (!C0020.m4203()) {
                    C0000.m1125(webView);
                    c = true;
                }
                WebBackForwardList webBackForwardListM6560 = C0039.m6560();
                if (webBackForwardListM6560 != null) {
                    WebView webViewM4750 = C0024.m4750();
                    if (C0060.m9328(webBackForwardListM6560) != 0) {
                        String strM4540 = C0023.m4540(C0057.m8955(webBackForwardListM6560));
                        if (strM4540 != null && !C0057.m8953(strM4540)) {
                            C0048.m7899(webViewM4750, strM4540);
                        }
                        d = webBackForwardListM6560;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C0024.m4750();
    }
}