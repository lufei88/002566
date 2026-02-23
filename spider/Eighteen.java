package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.c;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;

/* loaded from: classes.dex */
public class Eighteen extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f20short = {2515, 2501, 2497, 2514, 2499, 2504, 2559, 2507, 2501, 2521, 2519, 2511, 2514, 2500, 2215, 2225, 2229, 2214, 2231, 2236, 2187, 2208, 2221, 2212, 2225, 2879, 2874, 2871, 2856, 894, 872, 876, 895, 878, 869, 2009, 1989, 1989, 1985, 1986, 1931, 1950, 1950, 2012, 2011, 1991, 1921, 1921, 1923, 1951, 2002, 2014, 2012, 1950, 1995, 2009, 1950, 1986, 2004, 2000, 1987, 2002, 2009, 2007, 2014, 1987, 2012, 2030, 1986, 2004, 2000, 1987, 2002, 2009, 1950, 2000, 2013, 2013, 1950, 2928, 2870, 2858, 2867, 2866, 2372, 2377, 2390, 2318, 2384, 2383, 2387, 2388, 1304, 2772, 2766, 2777, 2778, 668, 640, 640, 644, 647, 718, 731, 731, 665, 670, 642, 708, 708, 710, 730, 663, 667, 665, 731, 654, 668, 731, 497, 426, 1119, 1054, 1024, 1054, 1111, 1107, 1113, 780, 781, 796, 2353, 2364, 2339, 2427, 2360, 2352, 2337, 2356, 2031, 2044, 2035, 2041, 2034, 2032, 2081, 2084, 2110, 2105, 2579, 2580, 2590, 2591, 2562, 1453, 1457, 1457, 1461, 1462, 1535, 1514, 1514, 1448, 1455, 1459, 1525, 1525, 1527, 1515, 1446, 1450, 1448, 1514, 1471, 1453, 1514, 2185, 2180, 2203, 2243, 2205, 2178, 2206, 2201, 3312, 1263, 1269, 1250, 1249, 744, 691, 3001, 3064, 3046, 3064, 2993, 2997, 3007, 2274, 2275, 2290, 1514, 1511, 1528, 1440, 1507, 1515, 1530, 1519, 916, 904, 904, 908, 911, 966, 979, 979, 913, 918, 906, 972, 972, 974, 978, 927, 915, 913, 979, 902, 916, 979, 2657, 2668, 2675, 2603, 2675, 2668, 2657, 2656, 2666, 2600, 2674, 2679, 2660, 2677, 2417, 2428, 2403, 2363, 2420, 2407, 2422, 2429, 2428, 2403, 2416, 2360, 2401, 2428, 2401, 2425, 2416, 2357, 2347, 2357, 2429, 2340, 3034, 3031, 3016, 2960, 3022, 3026, 3039, 3015, 3035, 3020, 2963, 3017, 3020, 3039, 3022, 2974, 2944, 2974, 3031, 3027, 3033, 2435, 2434, 2451, 2083, 2090, 2131, 2116, 26211, 26608, 746, 1761, 1789, 1789, 1785, 1786, 1715, 1702, 1702, 1764, 1763, 1791, 1721, 1721, 1723, 1703, 1770, 1766, 1764, 1702, 1779, 1761, 1702, 2751, 2726, 2788, 2731, 2724, 2723, 2727, 2735, 2724, 2751, 2709, 2709, 2724, 2731, 2748, 2794, 2804, 2794, 2726, 2723, 2794, 2804, 2794, 2731, 2474, 2480, 2471, 2468, 600, 587, 580, 590, 581, 583, 517, 587, 582, 582, 517, 2274, 2283, 2203, 1558, 1563, 1540, 1628, 1538, 1565, 1537, 1542, 1782, 277, 334, 1241, 1176, 1158, 1176, 1233, 1237, 1247, 395, 394, 411, 2018, 2031, 2032, 1960, 2027, 2019, 2034, 2023, 625, 621, 621, 617, 618, 547, 566, 566, 628, 627, 623, 553, 553, 555, 567, 634, 630, 628, 566, 611, 625, 566, 634, 625, 624, 631, 636, 618, 636, 582, 592, 632, 628, 598, 623, 636, 619, 604, 624, 638, 625, 621, 636, 636, 631, 576, 636, 632, 619, 618, 598, 629, 637, 566, 552, 544, 566, 624, 631, 637, 636, 609, 567, 625, 621, 628, 629, 2212, 2211, 2214, 2209, 2219, 2283, 2219, 2208, 2225, 2438, 2501, 2459, 2525, 2448, 1389, 1326, 1331, 1399, 2886, 2906, 2906, 2910, 2909, 2836, 2817, 2817, 2883, 2884, 2904, 2846, 2846, 2844, 2816, 2893, 2881, 2883, 2817, 2900, 2886, 2817, 1260};

    public static String a(String str, String str2) {
        HashMap mapM4127 = C0019.m4127(C0029.m5256(m127(), 0, 14, 2464), str, C0013.m3106(m127(), 14, 11, 2260), C0063.m9585(m127(), 25, 2, 2905));
        C0053.m8424(mapM4127, C0002.m1305(m127(), 27, 2, 2904), C0050.m8131(m127(), 29, 6, 781));
        StringBuilder sb = new StringBuilder(C0049.m8007(m127(), 35, 44, 1969));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0010.m2300(m127(), 79, 5, 2910));
        String strM2029 = C0008.m2029(C0003.m1396(C0047.m7763(sb), mapM4127, null));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(strM2029), C0056.m8911(m127(), 84, 8, 2336)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            C0055.m8732(C0015.m3446(C0049.m8058(C0030.m5333(mVar, C0022.m4403(m127(), 92, 1, 1401)), C0021.m4340(m127(), 93, 4, 2748)), C0065.m9775(m127(), 97, 22, 756), C0007.m1840()), C0024.m4684(C0030.m5333(mVar, C0031.m5565(m127(), 119, 2, 409))), C0049.m8058(C0030.m5333(mVar, C0048.m7902(m127(), 121, 7, 1086)), C0024.m4740(m127(), 128, 3, 895)), C0024.m4684(C0030.m5333(mVar, C0064.m9599(m127(), 131, 8, 2389))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    /* renamed from: ۟۠ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m125(Object obj) {
        if (C0041.m6823() <= 0) {
            ((Response) obj).close();
        }
    }

    /* renamed from: ۟ۡۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Response m126(Object obj) {
        if (C0012.m3024() > 0) {
            return c.f((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m127() {
        if (C0026.m4977() < 0) {
            return f20short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM3446 = C0015.m3446(C0015.m3446(str, C0054.m8574(m127(), 139, 6, 1949), C0053.m8477(m127(), 145, 4, 2125)), C0021.m4340(m127(), 149, 5, 2682), str2);
        String strM7151 = C0042.m7151(m127(), 154, 22, 1477);
        StringBuilder sb = new StringBuilder(strM7151);
        C0018.m3933(sb, strM3446);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), null)), C0009.m2037(m127(), 176, 8, 2285)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            C0055.m8732(C0015.m3446(C0049.m8058(C0030.m5333(mVar, C0042.m7151(m127(), 184, 1, 3217)), C0044.m7509(m127(), 185, 4, 1159)), strM7151, C0007.m1840()), C0024.m4684(C0030.m5333(mVar, C0058.m9106(m127(), 189, 2, 640))), C0049.m8058(C0030.m5333(mVar, C0013.m3106(m127(), 191, 7, 3032)), C0049.m8007(m127(), 198, 3, 2193)), C0024.m4684(C0030.m5333(mVar, C0062.m9389(m127(), 201, 8, 1422))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder(C0032.m5708(m127(), 209, 22, 1020));
        C0018.m3933(sb, (String) C0048.m7915(list, 0));
        m mVar = (m) C0028.m5161(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), null)), C0016.m3525(m127(), 231, 14, 2565)), 0);
        String strM4684 = C0024.m4684(C0030.m5333(mVar, C0004.m1549(m127(), 245, 22, 2325)));
        String strM8058 = C0049.m8058(C0030.m5333(mVar, C0012.m2973(m127(), 267, 21, 3006)), C0054.m8574(m127(), 288, 3, 2544));
        com.github.catvod.spider.merge.E.m mVar2 = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar2, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar2, strM8058);
        C0005.m1628(mVar2, strM4684);
        C0054.m8596(mVar2, C0021.m4340(m127(), 291, 4, 2066));
        StringBuilder sb2 = new StringBuilder(C0020.m4199(m127(), 295, 3, 718));
        C0018.m3933(sb2, (String) C0048.m7915(list, 0));
        C0044.m7449(mVar2, C0047.m7763(sb2));
        return C0053.m8428(mVar2);
    }

    public String homeContent(boolean z) {
        String strM1840;
        String strM6131;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM61312 = C0035.m6131(m127(), 298, 22, 1673);
        h hVarM3577 = C0016.m3577(C0032.m5769(strM61312, null));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0029.m5256(m127(), 320, 24, 2762)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM1840 = C0007.m1840();
            strM6131 = C0035.m6131(m127(), 344, 4, 2498);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            String strM9669 = C0064.m9669(mVar);
            String strM3446 = C0015.m3446(C0010.m2339(mVar, strM6131), strM61312, strM1840);
            if (C0058.m9127(strM3446, C0038.m6452(m127(), 348, 11, 554))) {
                if (C0058.m9127(strM9669, C0058.m9106(m127(), 359, 3, 2259))) {
                    break;
                }
                C0004.m1532(arrayList, new b(strM3446, strM9669, null));
            }
        }
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0041.m6779(m127(), 362, 8, 1650)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            C0055.m8732(C0015.m3446(C0049.m8058(C0030.m5333(mVar2, C0042.m7151(m127(), 370, 1, 1687)), strM6131), strM61312, strM1840), C0024.m4684(C0030.m5333(mVar2, C0054.m8574(m127(), 371, 2, 381))), C0049.m8058(C0030.m5333(mVar2, C0045.m7657(m127(), 373, 7, 1208)), C0027.m5062(m127(), 380, 3, 504)), C0024.m4684(C0030.m5333(mVar2, C0017.m3646(m127(), 383, 8, 1926))), arrayList2);
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        m125(m126(C0021.m4340(m127(), 391, 67, 537)));
    }

    public boolean isVideoFormat(String str) {
        return !C0058.m9127(str, C0046.m7718(m127(), 458, 9, 2245)) && (C0058.m9127(str, C0045.m7657(m127(), 467, 5, 2472)) || C0058.m9127(str, C0014.m3332(m127(), 472, 4, 1347)));
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0038.m6396(gVar);
        StringBuilder sb = new StringBuilder(C0023.m4536(m127(), 476, 22, 2862));
        C0018.m3933(sb, str2);
        C0017.m3667(gVar, C0047.m7763(sb));
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0053.m8413(str, C0007.m1842(m127(), 498, 1, 1245));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0053.m8413(str, str2);
    }
}