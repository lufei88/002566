package com.github.catvod.spider.merge.e0;

import android.app.Activity;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.l;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0287f {
    public static WebView a;
    public static String b;
    public static boolean c;
    public static WebBackForwardList d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f780short = {2457, 2502, 2500, 2521, 2510, 2511, 2441, 2514, 2521, 2443, 2501, 2515, 2519, 2517, 2526, 2514, 2519, 2520, 2523, 2499, 2448, 2513, 2521, 2443, 2527, 2520, 2514, 2515, 2510};

    public static void a(WebView webView) {
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
        C0037.m6361(webView, new l(5));
    }

    public static synchronized WebView b(Activity activity) {
        try {
            if (C0006.m1741() == null) {
                WebView webView = new WebView(C0035.m6101(activity));
                a = webView;
                if (!C0001.m1199()) {
                    C0010.m2389(webView);
                    WebView webViewM1741 = C0006.m1741();
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0022.m4455());
                    C0018.m3933(sb, C0064.m9599(m8172(), 0, 29, 2486));
                    C0048.m7899(webViewM1741, C0047.m7763(sb));
                    c = true;
                }
                WebBackForwardList webBackForwardListM3364 = C0014.m3364();
                if (webBackForwardListM3364 != null) {
                    WebView webViewM17412 = C0006.m1741();
                    if (C0060.m9328(webBackForwardListM3364) != 0) {
                        String strM4540 = C0023.m4540(C0057.m8955(webBackForwardListM3364));
                        if (strM4540 != null && !C0057.m8953(strM4540)) {
                            C0048.m7899(webViewM17412, strM4540);
                        }
                        d = webBackForwardListM3364;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C0006.m1741();
    }

    /* renamed from: ۠ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8172() {
        if (C0007.m1886() >= 0) {
            return f780short;
        }
        return null;
    }
}