package com.github.catvod.spider.merge.W;

import android.app.Activity;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class p {
    public static WebView a;
    public static String b;
    public static boolean c;
    public static WebBackForwardList d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f655short = {2804, 2803, 2804, 2764, 2691, 2804, 2694, 2804, 2764, 2691, 2803, 2793, 2693, 2802, 2761, 2693, 2770, 2805, 2691, 2804, 2805, 876, 877, 869, 877, 1294, 1393, 3179, 3124, 1658, 1657, 1662, 1656, 1428, 1529, 1421, 1461, 1530, 1528, 26823, 22665, 2368, 2356, 2316, 2371, 2369, 2288, 15388, 3106, 3110, 3123, 15389, 2782, 2777, 2732, 2728, 2749, 2782, 2783, 636, 520, 526, 522, 543, 636, 521, -532, 714, 718, 731, -531, 408, 21551, -27775, 2165, 2058, 2194, 2282, 2194, 2282, 2194, 2282, 2910};

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
        C0037.m6361(webView, new l(1));
    }

    public static String b(String str) {
        String strM3484 = C0015.m3484(m5941(), 0, 21, 2728);
        String strM1840 = C0007.m1840();
        String strM9640 = C0064.m9640(C0015.m3446(C0064.m9640(C0015.m3446(C0064.m9640(C0015.m3446(C0064.m9640(C0015.m3446(C0064.m9640(C0025.m4800(str, strM3484, strM1840)), C0000.m1077(m5941(), 21, 4, 861), strM1840)), C0035.m6131(m5941(), 25, 2, 1338), strM1840)), C0025.m4795(m5941(), 27, 2, 3167), strM1840)), C0027.m5062(m5941(), 29, 4, 1608), strM1840));
        String strM1778 = C0006.m1778(strM9640, C0017.m3646(m5941(), 33, 6, 1489));
        String strM8477 = C0053.m8477(m5941(), 39, 2, 2745);
        if (!C0058.m9127(strM1778, strM8477)) {
            return strM1778;
        }
        String strM17782 = C0006.m1778(strM9640, C0009.m2037(m5941(), 41, 5, 2408));
        return C0058.m9127(strM17782, strM8477) ? C0038.m6452(m5941(), 46, 1, 2241) : strM17782;
    }

    public static String c(String str) {
        String strM9585 = C0063.m9585(m5941(), 47, 5, 3084);
        String strM1840 = C0007.m1840();
        return C0015.m3446(C0015.m3446(C0015.m3446(C0025.m4800(C0025.m4800(C0025.m4800(C0025.m4800(str, strM9585, strM1840), C0026.m4951(m5941(), 52, 7, 2690), strM1840), C0008.m1970(m5941(), 59, 7, 544), strM1840), C0015.m3484(m5941(), 66, 5, 740), strM1840), C0022.m4403(m5941(), 71, 1, 438), strM1840), C0010.m2300(m5941(), 72, 2, 1351), strM1840), C0056.m8911(m5941(), 74, 2, 2113), strM1840);
    }

    public static synchronized WebView d(Activity activity) {
        try {
            if (C0054.m8548() == null) {
                WebView webView = new WebView(C0035.m6101(activity));
                a = webView;
                if (!C0036.m6262()) {
                    C0042.m7134(webView);
                    c = true;
                }
                WebBackForwardList webBackForwardListM5183 = C0028.m5183();
                if (webBackForwardListM5183 != null) {
                    WebView webViewM8548 = C0054.m8548();
                    if (C0060.m9328(webBackForwardListM5183) != 0) {
                        String strM4540 = C0023.m4540(C0057.m8955(webBackForwardListM5183));
                        if (strM4540 != null && !C0057.m8953(strM4540)) {
                            C0048.m7899(webViewM8548, strM4540);
                        }
                        d = webBackForwardListM5183;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C0054.m8548();
    }

    public static HashMap e(String str, String str2) {
        String strM6131 = C0035.m6131(m5941(), 76, 6, 2254);
        String[] strArrM4752 = C0024.m4752(str2, strM6131);
        String[] strArrM47522 = C0024.m4752(str, strM6131);
        HashMap map = new HashMap();
        for (int i = 0; i < strArrM47522.length; i++) {
            C0053.m8424(map, strArrM47522[i], C0024.m4752(strArrM4752[i], C0049.m8007(m5941(), 82, 1, 2941)));
        }
        return map;
    }

    /* renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5941() {
        if (C0045.m7538() < 0) {
            return f655short;
        }
        return null;
    }
}