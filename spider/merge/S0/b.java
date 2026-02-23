package com.github.catvod.spider.merge.S0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f494short = {2541, 1027, 1027, 2916, 2916, 2916, 1773, 1773, 1773, 1773, 1701, 1701, 1701, 1701, 1701, 1893, 1893, 1893, 1893, 1893, 1893, 2176, 2176, 2176, 2176, 2176, 2176, 2176, 2120, 2120, 2120, 2120, 2120, 2120, 2120, 2120, 2952, 2952, 2952, 2952, 2952, 2952, 2952, 2952, 2952, 2397, 2397, 2397, 2397, 2397, 2397, 2397, 2397, 2397, 2397, 2481, 2481, 2481, 2481, 2481, 2481, 2481, 2481, 2481, 2481, 2481, 876, 876, 876, 876, 876, 876, 876, 876, 876, 876, 876, 876, 2535, 2535, 2535, 2535, 2535, 2535, 2535, 2535, 2535, 2535, 2535, 2535, 2535, 906, 906, 906, 906, 906, 906, 906, 906, 906, 906, 906, 906, 906, 906, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 1378, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 2358, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 749, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 2077, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 669, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1364, 1283, 1394, 1397, 1397, 1281, 1395, 1318, 1388, 1393, 1391, 1312, 1394, 1396, 1398, 1396, 1993, 1996, 2038, 1978, 2029, 2006, 1978, 1997, 1994, 1996, 2038, 1978, 2029, 2006, 1978, 1997, 1959, 1978, 1966, 1980, 1978, 1977, 1994, 1981, 1965, 3270, 3265, 3301, 3245, 3245, 3248, 3265, 3301, 3244, 3323, 3264, 3255, 2872, 1828, 2257};
    public static final String[] a = {C0007.m1840(), C0014.m3332(m5103(), 0, 1, 2509), C0039.m6551(m5103(), 1, 2, 1059), C0012.m2973(m5103(), 3, 3, 2884), C0041.m6779(m5103(), 6, 4, 1741), C0009.m2037(m5103(), 10, 5, 1669), C0015.m3484(m5103(), 15, 6, 1861), C0042.m7151(m5103(), 21, 7, 2208), C0060.m9352(m5103(), 28, 8, 2152), C0000.m1077(m5103(), 36, 9, 2984), C0007.m1842(m5103(), 45, 10, 2429), C0057.m8978(m5103(), 55, 11, 2449), C0007.m1842(m5103(), 66, 12, 844), C0026.m4951(m5103(), 78, 13, 2503), C0052.m8337(m5103(), 91, 14, 938), C0037.m6307(m5103(), 105, 15, 1346), C0002.m1305(m5103(), 120, 16, 2326), C0056.m8911(m5103(), 136, 17, 717), C0040.m6584(m5103(), 153, 18, 2109), C0004.m1549(m5103(), 171, 19, 701), C0061.m9361(m5103(), 190, 20, 1396)};
    public static final Pattern b = C0005.m1602(C0063.m9585(m5103(), 210, 15, 1373));
    public static final Pattern c = C0005.m1602(C0001.m1189(m5103(), 225, 25, 1943));
    public static final Pattern d = C0005.m1602(C0003.m1398(m5103(), 250, 12, 3229));
    public static final a e = new a(0);

    public static void a(StringBuilder sb, String str, boolean z) {
        int iM1584 = C0004.m1584(str);
        int iM1896 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iM1896 < iM1584) {
            int iM1058 = C0000.m1058(str, iM1896);
            if (iM1058 == 32 || iM1058 == 9 || iM1058 == 10 || iM1058 == 12 || iM1058 == 13 || iM1058 == 160) {
                if ((!z || z2) && !z3) {
                    C0062.m9399(sb, ' ');
                    z3 = true;
                }
            } else if (iM1058 != 8203 && iM1058 != 173) {
                C0035.m6149(sb, iM1058);
                z2 = true;
                z3 = false;
            }
            iM1896 += C0007.m1896(iM1058);
        }
    }

    public static StringBuilder b() {
        Stack stack = (Stack) C0017.m3710(C0000.m1106());
        return C0014.m3370(stack) ? new StringBuilder(8192) : (StringBuilder) C0047.m7745(stack);
    }

    public static boolean c(String str, String[] strArr) {
        return C0002.m1273(strArr, str) >= 0;
    }

    public static boolean d(String str) {
        if (str != null && C0004.m1584(str) != 0) {
            int iM1584 = C0004.m1584(str);
            for (int i = 0; i < iM1584; i++) {
                if (!C0059.m9245(C0000.m1058(str, i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String f(String str, ArrayList arrayList) {
        Iterator itM7816 = C0047.m7816(arrayList);
        if (!C0012.m2962(itM7816)) {
            return C0007.m1840();
        }
        String strM6312 = C0037.m6312(C0048.m7949(itM7816));
        if (!C0012.m2962(itM7816)) {
            return strM6312;
        }
        StringBuilder sbM8572 = C0054.m8572();
        C0065.m9779(sbM8572);
        Object obj = strM6312;
        while (true) {
            C0016.m3605(sbM8572, obj);
            if (!C0012.m2962(itM7816)) {
                return C0004.m1543(sbM8572);
            }
            Object objM7949 = C0048.m7949(itM7816);
            C0018.m3933(sbM8572, str);
            obj = objM7949;
        }
    }

    public static String g(StringBuilder sb) {
        StringBuilder sb2 = sb;
        C0065.m9779(sb2);
        String strM7763 = C0047.m7763(sb2);
        if (C0006.m1693(sb2) > 8192) {
            sb2 = new StringBuilder(8192);
        } else {
            C0055.m8804(sb2, 0, C0006.m1693(sb2));
        }
        Stack stack = (Stack) C0017.m3710(C0000.m1106());
        C0005.m1657(stack, sb2);
        while (C0009.m2095(stack) > 8) {
            C0047.m7745(stack);
        }
        return strM7763;
    }

    public static URL h(URL url, String str) {
        String strM1623 = C0005.m1623(C0034.m6026(C0036.m6196(), str), C0007.m1840());
        if (C0043.m7277(strM1623, C0037.m6307(m5103(), 262, 1, 2823))) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0030.m5335(url));
            C0018.m3933(sb, strM1623);
            strM1623 = C0047.m7763(sb);
        }
        URL url2 = new URL(url, strM1623);
        String strM9412 = C0062.m9412(C0034.m6026(C0057.m9033(), C0015.m3420(url2)), C0007.m1842(m5103(), 263, 1, 1803));
        if (C0006.m1759(url2) != null) {
            StringBuilder sbM3016 = C0012.m3016(strM9412, C0010.m2300(m5103(), 264, 1, 2290));
            C0018.m3933(sbM3016, C0006.m1759(url2));
            strM9412 = C0047.m7763(sbM3016);
        }
        return new URL(C0046.m7739(url2), C0044.m7407(url2), C0013.m3182(url2), strM9412);
    }

    /* renamed from: ۟ۤ۠۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m5103() {
        if (C0051.m8216() < 0) {
            return f494short;
        }
        return null;
    }
}