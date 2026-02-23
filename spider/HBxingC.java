package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
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
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HBxingC extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f66short = {3076, 3106, 3124, 3107, 3196, 3088, 3126, 3124, 3135, 3109, 1434, 1532, 1485, 1485, 1489, 1496, 1534, 1490, 1487, 1496, 1520, 1496, 1497, 1492, 1500, 1426, 1420, 1427, 1421, 1427, 1421, 1427, 1420, 1418, 1529, 1416, 1421, 1437, 1429, 1492, 1517, 1493, 1490, 1491, 1496, 1414, 1437, 1512, 1414, 1437, 1534, 1517, 1512, 1437, 1522, 1518, 1437, 1420, 1422, 1506, 1422, 1506, 1420, 1437, 1489, 1492, 1494, 1496, 1437, 1520, 1500, 1502, 1437, 1522, 1518, 1437, 1509, 1414, 1437, 1479, 1493, 1506, 1502, 1491, 1428, 514, 558, 559, 559, 548, 546, 565, 552, 558, 559, 1701, 1675, 1675, 1694, 1731, 1711, 1666, 1671, 1688, 1675, 972, 1006, 1006, 1000, 1021, 1017, 928, 968, 995, 1006, 994, 1001, 996, 995, 1002, 2174, 2163, 2162, 2169, 2147, 2174, 2147, 2158, 2663, 2637, 2647, 2563, 2659, 2635, 2650, 2639, 2666, 2639, 2650, 2639, 2268, 3233, 2797, 2801, 2801, 2805, 2751, 2730, 2730, 2802, 2802, 2802, 2731, 2813, 2796, 2795, 2786, 2790, 2797, 2784, 2795, 2802, 2800, 2731, 2790, 2794, 2792, 2730, 1265, 1207, 1200, 1210, 1211, 1190, 2785, 2727, 2747, 2722, 2723, 2004, 1222, 1152, 1159, 1165, 1164, 1169, 1223, 1153, 1181, 1156, 1157, 2111, 2104, 2103, 2110, 2094, 2108, 2103, 2162, 2162, 2162, 718, 727, 661, 712, 719, 718, 722, 662, 717, 724, 735, 727, 722, 712, 719, 667, 645, 667, 727, 722, 1924, 1929, 1942, 1998, 1940, 1921, 1927, 1939, 26184, -31489, 31503, 20649, 958, 931, 958, 934, 943, 2433, 2459, 2444, 2447, 1847, 1842, 1831, 1842, 1918, 1852, 1825, 1850, 1844, 1850, 1853, 1842, 1855, 1202, 1201, 1184, 1199, 1263, 1201, 1192, 1186, 1260, 1205, 1188, 1209, 1205, 1263, 1205, 1188, 1209, 1205, 1260, 1203, 1192, 1190, 1193, 1205, 3180, 3125, 3114, 3184, 3181, 3184, 3176, 3169, 1743, 2739, 2812, 2721, 2726, 2727, 2747, 2815, 2724, 2749, 2742, 2750, 2747, 2721, 2726, 2701, 2701, 2726, 2746, 2727, 2751, 2736, 2812, 2724, 2815, 2726, 2746, 2727, 2751, 2736, 2812, 2750, 2739, 2728, 2731, 2750, 2749, 2739, 2742, 1881, 1884, 1865, 1884, 1808, 1874, 1871, 1876, 1882, 1876, 1875, 1884, 1873, 2285, 2272, 2303, 2215, 2298, 2301, 2300, 2272, 2212, 2297, 2280, 2279, 2279, 2284, 2277, 2262, 2262, 2273, 2284, 2280, 2285, 2215, 2283, 2278, 2301, 2301, 2278, 2276, 2212, 2277, 2272, 2279, 2284, 2869, 2926, 2931, 2857, 2868, 2857, 2865, 2872, 2611, 2622, 2593, 2681, 2596, 2595, 2594, 2622, 2682, 2599, 2614, 2617, 2617, 2610, 2619, 2568, 2613, 2611, 2681, 2612, 2616, 2619, 2682, 2599, 2611, 2681, 2612, 2619, 2610, 2614, 2597, 2609, 2622, 2607, 2883, 2883, 2883, 2069, 929, 956, 929, 953, 944, 2522, 2496, 2519, 2516, 469, 2037, 3071, 2580, 2634, 2560, 2565, 2576, 2565, 459, 456, 473, 470, 406, 456, 465, 475, 405, 460, 477, 448, 460, 406, 460, 477, 448, 460, 405, 458, 465, 479, 464, 460, 771, 768, 785, 798, 862, 788, 789, 772, 785, 793, 796, 861, 771, 795, 789, 772, 787, 792, 2651, 2646, 2654, 2641, 2630, 2646, 2641, 2648, 2445, 2432, 2440, 2439, 2458, 2433, 2432, 2435, 2460, 2688, 2709, 2708, 2717, 2691, 2707, 2131, 2136, 2137, 2128, 2138, 2134, 2137, 32696, 22012, 31119, -31364, 24285, 32575, -31815, 22292, 27287, 448, 433, 429, 429, 425, 483, 502, 502, 430, 430, 430, 503, 417, 432, 439, 446, 442, 433, 444, 439, 430, 428, 503, 442, 438, 436, 502, 2173, 413, 289, 311, 307, 288, 305, 314, 293, 317, 288, 310, 2483, 2479, 2479, 2475, 2529, 2548, 2548, 2476, 2476, 2476, 2549, 2467, 2482, 2485, 2492, 2488, 2483, 2494, 2485, 2476, 2478, 2549, 2488, 2484, 2486, 2548, 2548, 2472, 2494, 2490, 2473, 2488, 2483, 2549, 2475, 2483, 2475, 1308, 1297, 1294, 1366, 1291, 1292, 1293, 1297, 1365, 1288, 1305, 1302, 1302, 1309, 1300, 1319, 1306, 1308, 573, 548, 614, 571, 572, 573, 545, 613, 574, 551, 556, 548, 545, 571, 572, 535, 535, 549, 557, 556, 545, 553, 614, 555, 551, 548, 613, 568, 556, 614, 555, 548, 557, 553, 570, 558, 545, 560, 616, 630, 616, 548, 545, 1946, 1943, 1928, 2000, 1930, 1951, 1945, 1933, 25388, -32357, 29979, 24253, 2062, 2067, 2062, 2070, 2079, 936, 946, 933, 934, 2029, 2024, 2045, 2024, 1956, 2022, 2043, 2016, 2030, 2016, 2023, 2024, 2021, 1810, 1809, 1792, 1807, 1871, 1809, 1800, 1794, 1868, 1813, 1796, 1817, 1813, 1871, 1813, 1796, 1817, 1813, 1868, 1811, 1800, 1798, 1801, 1813, 616, 628, 628, 624, 570, 559, 559, 631, 631, 631, 558, 632, 617, 622, 615, 611, 616, 613, 622, 631, 629, 558, 611, 623, 621, 559};
    public String a;

    public static HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0015.m3484(m406(), 0, 10, 3153), C0043.m7290(m406(), 10, 75, 1469), C0020.m4199(m406(), 85, 10, 577), C0033.m5852(m406(), 95, 10, 1774));
        C0053.m8424(mapM4127, C0057.m8978(m406(), 105, 15, 909), C0023.m4536(m406(), 120, 8, 2071));
        C0053.m8424(mapM4127, C0057.m8978(m406(), 128, 12, 2606), C0042.m7151(m406(), 140, 1, 2285));
        return mapM4127;
    }

    /* renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m406() {
        if (C0064.m9659() <= 0) {
            return f66short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM6452 = C0038.m6452(m406(), 141, 1, 3264);
        ArrayList arrayList = new ArrayList();
        String strM1189 = C0001.m1189(m406(), 142, 26, 2693);
        String strM9145 = C0058.m9145(strM1189, str, C0022.m4403(m406(), 168, 6, 1246), str2, C0006.m1774(m406(), 174, 5, 2767));
        if (str2 == C0007.m1842(m406(), 179, 1, 2021)) {
            strM9145 = C0000.m1130(strM1189, str, C0055.m8814(m406(), 180, 11, 1257));
        }
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0013.m3106(m406(), 191, 10, 2137));
        C0018.m3933(sb, strM9145);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM9145, C0017.m3712())), C0007.m1842(m406(), 201, 20, 699)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM4684 = C0024.m4684(C0030.m5333(mVar, C0032.m5708(m406(), 221, 8, 2016)));
                if (!C0058.m9127(strM4684, C0014.m3332(m406(), 229, 2, 1677)) && !C0058.m9127(strM4684, C0063.m9585(m406(), 231, 2, 640))) {
                    String strM8058 = C0049.m8058(C0030.m5333(mVar, strM6452), C0000.m1077(m406(), 233, 5, 970));
                    String strM80582 = C0049.m8058(C0030.m5333(mVar, strM6452), C0023.m4536(m406(), 238, 4, 2537));
                    String strM80583 = C0049.m8058(C0030.m5333(mVar, strM6452), C0064.m9599(m406(), 242, 13, 1875));
                    String strM9669 = C0064.m9669(C0036.m6243(mVar, C0065.m9775(m406(), 255, 24, 1217)));
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, strM1189);
                    C0018.m3933(sb2, strM80582);
                    C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0047.m7763(sb2), strM8058, strM80583, strM9669));
                }
            } catch (Exception unused) {
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM1645;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0017.m3712()));
        String str = C0002.m1240(C0024.m4684(C0030.m5333(hVarM3577, C0034.m6001(m406(), 279, 8, 3076))), C0009.m2037(m406(), 287, 1, 1775), 2)[0];
        String strM9352 = C0060.m9352(m406(), 288, 38, 2770);
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, strM9352), C0050.m8131(m406(), 326, 13, 1853));
        d dVarM6459 = C0038.m6459(C0030.m5333(hVarM3577, C0004.m1549(m406(), 339, 33, 2185)), C0056.m8911(m406(), 372, 8, 2909));
        d dVarM5333 = C0030.m5333(hVarM3577, C0048.m7902(m406(), 380, 34, 2647));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM6459);
        int i = 0;
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM1645 = C0005.m1645(m406(), 414, 3, 2919);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            if (i > C0009.m2095(dVarM6459) - 5) {
                break;
            }
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, C0064.m9669(mVar));
            C0018.m3933(sb2, strM1645);
            i++;
        }
        StringBuilder sb3 = new StringBuilder(C0007.m1840());
        Iterator itM78072 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0013.m3106(m406(), 417, 1, 2164)));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM2339 = C0010.m2339(mVar2, C0002.m1305(m406(), 418, 5, 981));
                if (C0057.m8953(strM2339)) {
                    strM2339 = str;
                }
                String strM23392 = C0010.m2339(mVar2, C0026.m4951(m406(), 423, 4, 2482));
                if (C0057.m8953(strM23392)) {
                    strM23392 = (String) C0048.m7915(list, 0);
                }
                C0018.m3933(sb3, strM2339);
                C0018.m3933(sb3, C0015.m3484(m406(), 427, 1, 497));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, strM23392);
                String strM1077 = C0000.m1077(m406(), 428, 1, 1931);
                C0018.m3933(sb4, strM1077);
                C0018.m3933(sb4, str);
                C0018.m3933(sb4, strM1077);
                C0018.m3933(sb4, strM2339);
                C0018.m3933(sb3, C0047.m7763(sb4));
                C0018.m3933(sb3, C0049.m8007(m406(), 429, 1, 3036));
            }
            C0018.m3933(sb3, strM1645);
        }
        d dVarM53332 = C0030.m5333(hVarM3577, C0025.m4795(m406(), 430, 6, 2660));
        String strM4684 = C0024.m4684(C0038.m6459(C0030.m5333(hVarM3577, strM9352), C0017.m3646(m406(), 436, 24, 440)));
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0020.m4199(m406(), 460, 18, 880)));
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0036.m6189());
        C0018.m3933(sb5, strM4684);
        C0019.m4073(mVar3, C0047.m7763(sb5));
        C0058.m9159(mVar3, C0064.m9669((m) C0028.m5161(dVarM53332, 1)));
        C0058.m9152(mVar3, C0064.m9669((m) C0028.m5161(dVarM53332, 2)));
        C0058.m9085(mVar3, C0064.m9669((m) C0028.m5161(dVarM53332, 3)));
        StringBuilder sb6 = new StringBuilder();
        C0018.m3933(sb6, C0055.m8703());
        C0018.m3933(sb6, strM46842);
        C0027.m5000(mVar3, C0047.m7763(sb6));
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar3, strM8058);
        C0005.m1628(mVar3, str);
        C0054.m8596(mVar3, C0000.m1096(sb2));
        C0044.m7449(mVar3, C0000.m1096(sb3));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0000.m1077(m406(), 478, 8, 2623), C0062.m9389(m406(), 486, 9, 2537), C0026.m4951(m406(), 495, 6, 2810), C0000.m1077(m406(), 501, 7, 2103)});
        List listM12032 = C0001.m1203(new String[]{C0003.m1398(m406(), 508, 2, 2701), C0022.m4403(m406(), 510, 3, 3258), C0041.m6779(m406(), 513, 2, 451), C0003.m1398(m406(), 515, 2, 1468)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0007.m1834(this), null, arrayList);
    }

    public void init(Context context) {
        C0051.m8194(C0035.m6110());
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0057.m8978(m406(), 517, 1, 446));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        String strM2827 = C0011.m2827(str4, str5, str3);
        g gVar = new g();
        StringBuilder sb = new StringBuilder(C0049.m8007(m406(), 518, 26, 473));
        C0018.m3933(sb, str4);
        C0017.m3667(gVar, C0047.m7763(sb));
        C0006.m1720(gVar, 1);
        C0057.m9029(gVar, C0017.m3712());
        C0002.m1282(gVar, strM2827);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0003.m1382(this, str, true, C0032.m5708(m406(), 544, 1, 2124));
    }

    public String searchContent(String str, boolean z, String str2) {
        String strM7718 = C0046.m7718(m406(), 545, 1, 508);
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0038.m6459(C0030.m5333(C0016.m3577(C0008.m2029(C0003.m1396(C0015.m3484(m406(), 556, 37, 2523), C0020.m4251(C0060.m9352(m406(), 546, 10, 338), str), C0017.m3712()))), C0063.m9585(m406(), 593, 18, 1400)), C0015.m3484(m406(), 611, 43, 584)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM4684 = C0024.m4684(C0030.m5333(mVar, C0058.m9106(m406(), 654, 8, 2046)));
                if (!C0058.m9127(strM4684, C0025.m4795(m406(), 662, 2, 1001)) && !C0058.m9127(strM4684, C0063.m9585(m406(), 664, 2, 3220))) {
                    String strM8058 = C0049.m8058(C0030.m5333(mVar, strM7718), C0012.m2973(m406(), 666, 5, 2170));
                    String strM80582 = C0049.m8058(C0030.m5333(mVar, strM7718), C0006.m1774(m406(), 671, 4, 960));
                    String strM80583 = C0049.m8058(C0030.m5333(mVar, strM7718), C0013.m3106(m406(), 675, 13, 1929));
                    m mVarM6243 = C0036.m6243(mVar, C0003.m1398(m406(), 688, 24, 1889));
                    C0047.m7777(mVarM6243);
                    String strM9669 = C0064.m9669(mVarM6243);
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0006.m1774(m406(), 712, 26, 512));
                    C0018.m3933(sb, strM80582);
                    C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0047.m7763(sb), strM8058, strM80583, strM9669));
                }
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}