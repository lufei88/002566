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
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public abstract class B {
    public static WebView a;
    public static String b;
    public static boolean c;
    public static WebBackForwardList d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f646short = {3304, 3273, 3282, 3206, 3284, 3267, 3271, 3269, 3278, 3267, 3266, 1837, 1846, 1853, 1846};

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
        C0037.m6361(webView, new l(4));
    }

    public static com.github.catvod.spider.merge.E0.c b(String str) {
        com.github.catvod.spider.merge.E0.a aVar = new com.github.catvod.spider.merge.E0.a(C0004.m1584(str));
        CharBuffer charBufferM7703 = C0046.m7703(C0004.m1584(str));
        C0027.m5005(charBufferM7703, str);
        C0038.m6439(charBufferM7703);
        int iM6363 = C0037.m6363(charBufferM7703);
        int iM4101 = C0019.m4101(C0039.m6527(aVar));
        if (iM4101 != 0) {
            if (iM4101 != 1) {
                if (iM4101 == 2 && C0037.m6363(C0030.m5432(aVar)) < iM6363) {
                    IntBuffer intBufferM9514 = C0063.m9514(C0039.m6503(C0037.m6343(C0030.m5432(aVar)) + iM6363));
                    C0001.m1216(C0030.m5432(aVar));
                    C0064.m9682(intBufferM9514, C0030.m5432(aVar));
                    aVar.d = intBufferM9514;
                }
            } else if (C0037.m6363(C0037.m6380(aVar)) < iM6363) {
                CharBuffer charBufferM77032 = C0046.m7703(C0039.m6503(C0037.m6343(C0037.m6380(aVar)) + iM6363));
                C0038.m6439(C0037.m6380(aVar));
                C0007.m1862(charBufferM77032, C0037.m6380(aVar));
                aVar.c = charBufferM77032;
            }
        } else if (C0037.m6363(C0064.m9695(aVar)) < iM6363) {
            ByteBuffer byteBufferM4407 = C0022.m4407(C0039.m6503(C0037.m6343(C0064.m9695(aVar)) + iM6363));
            C0064.m9655(C0064.m9695(aVar));
            C0029.m5213(byteBufferM4407, C0064.m9695(aVar));
            aVar.b = byteBufferM4407;
        }
        if (!C0054.m8561(charBufferM7703)) {
            throw new UnsupportedOperationException(C0049.m8007(m5911(), 11, 4, 1913));
        }
        int iM41012 = C0019.m4101(C0039.m6527(aVar));
        if (iM41012 == 0) {
            char[] cArrM8140 = C0050.m8140(charBufferM7703);
            int iM4874 = C0025.m4874(charBufferM7703) + C0054.m8649(charBufferM7703);
            int iM1152 = C0001.m1152(charBufferM7703) + C0054.m8649(charBufferM7703);
            byte[] bArrM1530 = C0004.m1530(C0064.m9695(aVar));
            int iM48742 = C0025.m4874(C0064.m9695(aVar)) + C0050.m8117(C0064.m9695(aVar));
            while (true) {
                if (iM4874 >= iM1152) {
                    C0043.m7356(charBufferM7703, iM4874 - C0054.m8649(charBufferM7703));
                    ByteBuffer byteBufferM9695 = C0064.m9695(aVar);
                    C0002.m1329(byteBufferM9695, iM48742 - C0050.m8117(byteBufferM9695));
                    break;
                }
                char c2 = cArrM8140[iM4874];
                if (c2 <= 255) {
                    bArrM1530[iM48742] = (byte) (c2 & 255);
                    iM4874++;
                    iM48742++;
                } else {
                    C0043.m7356(charBufferM7703, iM4874 - C0054.m8649(charBufferM7703));
                    ByteBuffer byteBufferM96952 = C0064.m9695(aVar);
                    C0002.m1329(byteBufferM96952, iM48742 - C0050.m8117(byteBufferM96952));
                    if (C0012.m3030(c2)) {
                        int iM63632 = C0037.m6363(charBufferM7703);
                        C0064.m9655(C0064.m9695(aVar));
                        IntBuffer intBufferM95142 = C0063.m9514(C0008.m1965(C0037.m6363(C0064.m9695(aVar)) + iM63632, C0037.m6343(C0064.m9695(aVar)) / 4));
                        while (C0004.m1585(C0064.m9695(aVar))) {
                            C0033.m5868(intBufferM95142, C0038.m6453(C0064.m9695(aVar)) & 255);
                        }
                        aVar.a = 3;
                        aVar.b = null;
                        aVar.d = intBufferM95142;
                        C0044.m7461(aVar, charBufferM7703);
                    } else {
                        int iM63633 = C0037.m6363(charBufferM7703);
                        C0064.m9655(C0064.m9695(aVar));
                        CharBuffer charBufferM77033 = C0046.m7703(C0008.m1965(C0037.m6363(C0064.m9695(aVar)) + iM63633, C0037.m6343(C0064.m9695(aVar)) / 2));
                        while (C0004.m1585(C0064.m9695(aVar))) {
                            C0017.m3723(charBufferM77033, (char) (C0038.m6453(C0064.m9695(aVar)) & 255));
                        }
                        aVar.a = 2;
                        aVar.b = null;
                        aVar.c = charBufferM77033;
                        C0009.m2044(aVar, charBufferM7703);
                    }
                }
            }
        } else if (iM41012 == 1) {
            C0009.m2044(aVar, charBufferM7703);
        } else if (iM41012 == 2) {
            C0044.m7461(aVar, charBufferM7703);
        }
        int iM41013 = C0019.m4101(C0039.m6527(aVar));
        if (iM41013 == 0) {
            C0064.m9655(C0064.m9695(aVar));
        } else if (iM41013 == 1) {
            C0038.m6439(C0037.m6380(aVar));
        } else if (iM41013 == 2) {
            C0001.m1216(C0030.m5432(aVar));
        }
        int iM6527 = C0039.m6527(aVar);
        ByteBuffer byteBufferM96953 = C0064.m9695(aVar);
        CharBuffer charBufferM6380 = C0037.m6380(aVar);
        IntBuffer intBufferM5432 = C0030.m5432(aVar);
        com.github.catvod.spider.merge.E0.b bVar = new com.github.catvod.spider.merge.E0.b(iM6527, byteBufferM96953, charBufferM6380, intBufferM5432);
        int iM41014 = C0019.m4101(iM6527);
        if (iM41014 == 0) {
            int iM7596 = C0045.m7596(bVar);
            int iM7839 = C0047.m7839(bVar);
            byte[] bArrM15302 = C0004.m1530(byteBufferM96953);
            C0003.m1472(bVar);
            return new com.github.catvod.spider.merge.E0.c(bArrM15302, iM7596, iM7839, 2);
        }
        if (iM41014 == 1) {
            int iM75962 = C0045.m7596(bVar);
            int iM78392 = C0047.m7839(bVar);
            char[] cArrM81402 = C0050.m8140(charBufferM6380);
            C0003.m1472(bVar);
            return new com.github.catvod.spider.merge.E0.c(cArrM81402, iM75962, iM78392, 0);
        }
        if (iM41014 != 2) {
            throw new UnsupportedOperationException(C0046.m7718(m5911(), 0, 11, 3238));
        }
        int iM75963 = C0045.m7596(bVar);
        int iM78393 = C0047.m7839(bVar);
        int[] iArrM8293 = C0052.m8293(intBufferM5432);
        C0003.m1472(bVar);
        return new com.github.catvod.spider.merge.E0.c(iArrM8293, iM75963, iM78393, 1);
    }

    public static synchronized WebView c(Activity activity) {
        try {
            if (C0046.m7668() == null) {
                WebView webView = new WebView(C0035.m6101(activity));
                a = webView;
                if (!C0051.m8188()) {
                    C0008.m2017(webView);
                    c = true;
                }
                WebBackForwardList webBackForwardListM1360 = C0003.m1360();
                if (webBackForwardListM1360 != null) {
                    WebView webViewM7668 = C0046.m7668();
                    if (C0060.m9328(webBackForwardListM1360) != 0) {
                        String strM4540 = C0023.m4540(C0057.m8955(webBackForwardListM1360));
                        if (strM4540 != null && !C0057.m8953(strM4540)) {
                            C0048.m7899(webViewM7668, strM4540);
                        }
                        d = webBackForwardListM1360;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C0046.m7668();
    }

    /* renamed from: ۟ۦۥۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5911() {
        if (C0059.m9257() <= 0) {
            return f646short;
        }
        return null;
    }
}