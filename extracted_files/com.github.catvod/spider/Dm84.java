package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.c;
import com.github.catvod.spider.merge.E.d;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Dm84 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f17short = {28593, 624, 619, 26572, 24883, -28367, 2666, 2679, 2675, 2683, 25683, 18912, 27470, 1089, 1088, 1117, 1114, 24905, -30332, 20550, 3257, 3241, 3237, 3256, 3247, 2718, 2744, 2734, 2745, 2790, 2698, 2732, 2734, 2725, 2751, 1603, 1633, 1652, 1639, 1634, 1634, 1647, 1569, 1595, 1568, 1598, 1582, 1574, 1625, 1639, 1632, 1642, 1633, 1657, 1661, 1582, 1600, 1626, 1582, 1599, 1598, 1568, 1598, 1589, 1582, 1625, 1639, 1632, 1592, 1594, 1589, 1582, 1654, 1592, 1594, 1575, 1582, 1615, 1662, 1662, 1634, 1643, 1625, 1643, 1644, 1605, 1639, 1658, 1569, 1595, 1597, 1593, 1568, 1597, 1592, 1582, 1574, 1605, 1606, 1626, 1603, 1602, 1570, 1582, 1634, 1639, 1637, 1643, 1582, 1609, 1643, 1645, 1637, 1633, 1575, 1582, 1613, 1638, 1660, 1633, 1635, 1643, 1569, 1599, 1596, 1596, 1568, 1598, 1568, 1598, 1568, 1598, 1582, 1629, 1647, 1640, 1647, 1660, 1639, 1569, 1595, 1597, 1593, 1568, 1597, 1592, 388, 422, 422, 416, 437, 433, 3199, 3182, 3187, 3199, 3108, 3171, 3199, 3174, 3175, 3111, 3178, 3195, 3195, 3175, 3170, 3176, 3178, 3199, 3170, 3172, 3173, 3108, 3187, 3171, 3199, 3174, 3175, 3104, 3187, 3174, 3175, 3111, 3178, 3195, 3195, 3175, 3170, 3176, 3178, 3199, 3170, 3172, 3173, 3108, 3187, 3174, 3175, 3120, 3194, 3126, 3131, 3109, 3122, 3111, 3170, 3174, 3178, 3180, 3182, 3108, 3178, 3197, 3170, 3181, 3111, 3170, 3174, 3178, 3180, 3182, 3108, 3196, 3182, 3177, 3195, 3111, 3170, 3174, 3178, 3180, 3182, 3108, 3178, 3195, 3173, 3180, 3111, 3105, 3108, 3105, 3120, 3194, 3126, 3131, 3109, 3123, 3111, 3178, 3195, 3195, 3175, 3170, 3176, 3178, 3199, 3170, 3172, 3173, 3108, 3192, 3170, 3180, 3173, 3182, 3183, 3110, 3182, 3187, 3176, 3171, 3178, 3173, 3180, 3182, 3120, 3197, 3126, 3177, 3128, 3120, 3194, 3126, 3131, 3109, 3132, 2272, 2285, 2276, 2289, 3263, 3235, 3239, 3252, 2928, 2923, 2227, 2222, 2218, 2210, 322, 286, 261, 258, 282, 320, 3072, 3072, 3240, 1941, 2003, 1999, 2006, 2007, 2135, 2123, 2123, 2127, 2124, 2053, 2064, 2064, 2139, 2130, 2055, 2059, 2065, 2123, 2121, 3321, 3316, 3307, 3251, 3316, 3305, 3320, 3312, 835, 780, 833, 845, 852, 839, 848, 3071, 3066, 3055, 3066, 2998, 3065, 3068, 895, 816, 874, 887, 874, 882, 891, 1666, 1688, 1679, 1676, 704, 707, 722, 733, 669, 727, 726, 704, 720, 2532, 2635, 2647, 2647, 2643, 2640, 2585, 2572, 2572, 2631, 2638, 2587, 2583, 2573, 2647, 2645, 2852, 2941, 2852, 2420, 2349, 2354, 2410, 2371, 2408, 2421, 2408, 2416, 2425, 3105, 3199, 3111, 3086, 3125, 3124, 3106, 3122, 3185, 3183, 3185, 3106, 3105, 3120, 3135, 3199, 3125, 3124, 3106, 3122, 762, 754, 739, 758, 716, 743, 741, 760, 743, 754, 741, 739, 750, 682, 760, 752, 685, 766, 762, 758, 752, 754, 714, 2689, 2701, 2700, 2710, 2695, 2700, 2710, 640, 648, 665, 652, 694, 643, 652, 640, 648, 720, 642, 650, 727, 667, 644, 649, 648, 642, 727, 652, 671, 648, 652, 688, 1279, 1271, 1254, 1267, 1225, 1276, 1267, 1279, 1271, 1199, 1277, 1269, 1192, 1252, 1275, 1270, 1271, 1277, 1192, 1265, 1278, 1267, 1249, 1249, 1231, 1247, 1239, 1222, 1235, 1257, 1244, 1235, 1247, 1239, 1167, 1245, 1237, 1160, 1220, 1243, 1238, 1239, 1245, 1160, 1235, 1233, 1222, 1245, 1216, 1263, 2653, 2645, 2628, 2641, 2667, 2624, 2626, 2655, 2624, 2645, 2626, 2628, 2633, 2573, 2655, 2647, 2570, 2644, 2645, 2627, 2643, 2626, 2649, 2624, 2628, 2649, 2655, 2654, 2669, 1448, 1440, 1457, 1444, 1438, 1451, 1444, 1448, 1440, 1528, 1450, 1442, 1535, 1459, 1452, 1441, 1440, 1450, 1535, 1463, 1440, 1449, 1440, 1444, 1462, 1440, 1434, 1441, 1444, 1457, 1440, 1432, 1910, 1918, 1903, 1914, 1856, 1909, 1914, 1910, 1918, 1830, 1908, 1916, 1825, 1901, 1906, 1919, 1918, 1908, 1825, 1919, 1906, 1897, 1918, 1912, 1903, 1908, 1897, 1862, 3018, 3027, 2961, 3019, 3038, 3037, 3040, 3036, 3024, 3025, 3019, 3021, 3024, 3027, 2975, 2945, 2975, 3027, 3030, 2189, 2196, 2262, 2184, 2196, 2201, 2177, 2215, 2196, 2193, 2187, 2188, 3089, 789, 1608, 1618, 1605, 1606, 3021, 506, 506, 506, 3098, 3078, 3078, 3074, 3073, 3144, 3165, 3165, 3094, 3103, 3146, 3142, 3164, 3078, 3076, 2211, 2234, 2296, 2232, 2231, 2208, 2185, 2212, 2233, 2209, 2294, 2280, 2294, 2234, 2239, 2294, 2280, 2294, 2231, 1514, 1520, 1511, 1508, 795, 856, 861, 839, 832, 3238, 830, 802, 802, 806, 805, 876, 889, 889, 818, 827, 878, 866, 888, 802, 800, 889, 826, 831, 805, 802, 891, 697, 767, 739, 762, 763, 2686, 2663, 2597, 2663, 2658, 2680, 2687, 2644, 2669, 2658, 2663, 2687, 2670, 2681, 2603, 2613, 2603, 2663, 2658, 2603, 2613, 2603, 2671, 2658, 2685, 2954, -25211, 21072, 1696, 1709, 1700, 1713, 27758, -24641, 2272, 2300, 2296, 2283, 27145, 22292, 1166, 1173, 1334, 1339, 1316, 1404, 1339, 1318, 1335, 1343, 280, 343, 282, 278, 271, 284, 267, 2833, 2836, 2817, 2836, 2904, 2839, 2834, 2640, 2591, 2629, 2648, 2629, 2653, 2644, 2464, 2467, 2482, 2493, 2557, 2487, 2486, 2464, 2480, 3097, 2273, 2301, 2301, 2297, 2298, 2227, 2214, 2214, 2285, 2276, 2225, 2237, 2215, 2301, 2303, 836, 843, 863, 844, 832, 840, 1671, 1670, 1687, 2250, 2262, 2262, 2258, 2257, 2200, 2189, 2189, 2246, 2255, 2202, 2198, 2188, 2262, 2260, 2568, 2644, 2570, 2570, 2570, 2570, 2570, 2570, 2570, 2570, 2570, 2570, 2569, 2639, 2643, 2634, 2635, 2584, 2640, 2627, 2586, 1299, 1310, 1281, 1369, 1310, 1283, 1298, 1306, 1688, 1751, 1690, 1686, 1679, 1692, 1675, 2045, 2040, 2029, 2040, 1972, 2043, 2046, 2625, 2574, 2644, 2633, 2644, 2636, 2629, 2308, 2334, 2313, 2314, 2436, 2439, 2454, 2457, 2521, 2451, 2450, 2436, 2452, 1179};

    public static d a(String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            String strM3446 = (String) C0048.m7949(itM7816);
            if (!C0057.m8953(strM3446)) {
                String strM34462 = C0015.m3446(strM3446, C0023.m4536(m107(), 0, 1, 3256), C0007.m1840());
                if (C0007.m1815(str2, C0037.m6307(m107(), 1, 2, 530))) {
                    strM3446 = C0015.m3446(C0015.m3446(C0015.m3446(strM3446, C0032.m5708(m107(), 3, 3, 1221), C0061.m9361(m107(), 6, 4, 2590)), C0027.m5062(m107(), 10, 3, 1882), C0041.m6779(m107(), 13, 4, 1065)), C0058.m9106(m107(), 17, 3, 576), C0022.m4403(m107(), 20, 5, 3274));
                }
                C0004.m1532(arrayList2, new c(strM34462, strM3446));
            }
        }
        return new d(str2, str, arrayList2);
    }

    public static HashMap b() {
        return C0019.m4127(C0021.m4340(m107(), 25, 10, 2763), C0011.m2805(m107(), 35, 111, 1550), C0036.m6188(m107(), 146, 6, 453), C0036.m6188(m107(), 152, 135, 3083));
    }

    /* renamed from: ۨۤ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m107() {
        if (C0033.m5872() > 0) {
            return f17short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM9106 = C0058.m9106(m107(), 287, 4, 2196);
        Object objM9715 = C0065.m9715(map, strM9106);
        String strM1840 = C0007.m1840();
        if (objM9715 == null) {
            C0053.m8424(map, strM9106, strM1840);
        }
        String strM9585 = C0063.m9585(m107(), 291, 4, 3270);
        if (C0065.m9715(map, strM9585) == null) {
            C0053.m8424(map, strM9585, strM1840);
        }
        String strM3646 = C0017.m3646(m107(), 295, 2, 2834);
        if (C0065.m9715(map, strM3646) == null) {
            C0053.m8424(map, strM3646, C0033.m5852(m107(), 297, 4, 2247));
        }
        String str3 = (String) C0065.m9715(map, strM3646);
        String strM8909 = C0056.m8909((String) C0065.m9715(map, strM9106));
        String str4 = (String) C0065.m9715(map, strM9585);
        String strM8259 = C0051.m8259(m107(), 301, 6, 365);
        String strM9352 = C0060.m9352(m107(), 307, 2, 3117);
        String strM8477 = C0053.m8477(m107(), 309, 1, 3205);
        StringBuilder sbM8368 = C0052.m8368(strM8259, str, strM9352, str3, strM8477);
        C0011.m2747(sbM8368, strM8909, strM9352, str4, strM8477);
        C0018.m3933(sbM8368, str2);
        C0018.m3933(sbM8368, C0029.m5256(m107(), 310, 5, 1979));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0020.m4199(m107(), 315, 15, 2111), C0047.m7763(sbM8368)), C0037.m6381())), C0064.m9599(m107(), 330, 8, 3229)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0019.m4107(m107(), 338, 7, 802)), C0032.m5708(m107(), 345, 7, 2971));
            String strM3525 = C0016.m3525(m107(), 352, 7, 798);
            String strM80582 = C0049.m8058(C0030.m5333(mVar, strM3525), C0033.m5852(m107(), 359, 4, 1770));
            C0055.m8732(C0024.m4752(strM80582, C0032.m5708(m107(), 372, 1, 2507))[2], C0024.m4684(C0030.m5333(mVar, strM3525)), strM8058, C0024.m4684(C0030.m5333(mVar, C0035.m6131(m107(), 363, 9, 691))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0022.m4403(m107(), 373, 15, 2595), C0029.m5256(m107(), 388, 3, 2827)), (String) C0048.m7915(list, 0)), C0037.m6381()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0018.m3917(m107(), 391, 10, 2332)));
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0018.m3917(m107(), 401, 20, 3153)));
        com.github.catvod.spider.merge.V0.d dVarM5333 = C0030.m5333(hVarM3577, C0009.m2037(m107(), 421, 23, 663));
        String strM5109 = C0028.m5109(m107(), 444, 7, 2786);
        String strM8058 = C0049.m8058(dVarM5333, strM5109);
        String strM80582 = C0049.m8058(C0030.m5333(hVarM3577, C0013.m3106(m107(), 451, 24, 749)), strM5109);
        String strM80583 = C0049.m8058(C0030.m5333(hVarM3577, C0005.m1645(m107(), 475, 25, 1170)), strM5109);
        String strM80584 = C0049.m8058(C0030.m5333(hVarM3577, C0040.m6584(m107(), 500, 25, 1202)), strM5109);
        String strM80585 = C0049.m8058(C0030.m5333(hVarM3577, C0041.m6779(m107(), 525, 29, 2608)), strM5109);
        String strM80586 = C0049.m8058(C0030.m5333(hVarM3577, C0061.m9361(m107(), 554, 32, 1477)), strM5109);
        String strM80587 = C0049.m8058(C0030.m5333(hVarM3577, C0024.m4740(m107(), 586, 28, 1819)), strM5109);
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM8058);
        C0022.m4432(mVar, strM80586);
        C0005.m1628(mVar, strM4684);
        C0017.m3671(mVar, strM80582);
        C0058.m9152(mVar, strM80584);
        C0019.m4073(mVar, strM46842);
        C0027.m5000(mVar, strM80585);
        C0058.m9159(mVar, strM80587);
        C0058.m9085(mVar, strM80583);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.github.catvod.spider.merge.V0.d dVarM53332 = C0030.m5333(hVarM3577, C0041.m6779(m107(), 614, 19, 3007));
        com.github.catvod.spider.merge.V0.d dVarM53333 = C0030.m5333(hVarM3577, C0041.m6779(m107(), 633, 12, 2296));
        for (int i = 0; i < C0009.m2095(dVarM53332); i++) {
            String strM9669 = C0064.m9669((m) C0028.m5161(dVarM53332, i));
            com.github.catvod.spider.merge.V0.d dVarM53334 = C0030.m5333((m) C0028.m5161(dVarM53333, i), C0039.m6551(m107(), 645, 1, 3184));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < C0009.m2095(dVarM53334); i2++) {
                m mVar2 = (m) C0028.m5161(dVarM53334, i2);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0064.m9669(mVar2));
                C0018.m3933(sb, C0061.m9361(m107(), 646, 1, 817));
                C0018.m3933(sb, C0010.m2339(mVar2, C0049.m8007(m107(), 647, 4, 1568)));
                C0004.m1532(arrayList, C0047.m7763(sb));
            }
            if (C0009.m2139(arrayList) > 0) {
                C0006.m1755(linkedHashMap, strM9669, C0036.m6194(C0017.m3646(m107(), 651, 1, 3054), arrayList));
            }
        }
        if (C0038.m6428(linkedHashMap) > 0) {
            Set setM3352 = C0014.m3352(linkedHashMap);
            String strM7657 = C0045.m7657(m107(), 652, 3, 478);
            C0054.m8596(mVar, C0036.m6194(strM7657, setM3352));
            C0044.m7449(mVar, C0036.m6194(strM7657, C0053.m8457(linkedHashMap)));
        }
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        String strM3484;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h hVarM3577 = C0016.m3577(C0032.m5769(C0029.m5256(m107(), 655, 15, 3186), C0037.m6381()));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0062.m9389(m107(), 670, 19, 2262)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM3484 = C0015.m3484(m107(), 689, 4, 1410);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            if (C0043.m7277(C0010.m2339(mVar, strM3484), C0046.m7718(m107(), 693, 5, 820))) {
                C0004.m1532(arrayList2, new b(C0054.m8636(C0024.m4752(C0010.m2339(mVar, strM3484), C0022.m4403(m107(), 698, 1, 3211))[1], 0, 1), C0054.m8636(C0064.m9669(mVar), 0, 2), null));
            }
        }
        Iterator itM7816 = C0047.m7816(arrayList2);
        while (C0012.m2962(itM7816)) {
            b bVar = (b) C0048.m7949(itM7816);
            StringBuilder sb = new StringBuilder(C0061.m9361(m107(), 699, 21, 854));
            C0018.m3933(sb, C0052.m8377(bVar));
            C0018.m3933(sb, C0000.m1077(m107(), 720, 5, 663));
            h hVarM35772 = C0016.m3577(C0032.m5769(C0047.m7763(sb), C0037.m6381()));
            com.github.catvod.spider.merge.V0.d dVarM5333 = C0030.m5333(hVarM35772, C0042.m7151(m107(), 725, 25, 2571));
            ArrayList arrayList3 = new ArrayList();
            m mVar2 = (m) C0028.m5161(dVarM5333, 0);
            String strM9389 = C0062.m9389(m107(), 750, 1, 3051);
            C0004.m1532(arrayList3, C0014.m3319(C0055.m8814(m107(), 751, 2, 1499), C0055.m8814(m107(), 753, 4, 1748), C0039.m6481(C0030.m5333(mVar2, strM9389))));
            C0004.m1532(arrayList3, C0014.m3319(C0054.m8574(m107(), 757, 2, 2604), C0030.m5362(m107(), 759, 4, 2201), C0039.m6481(C0030.m5333((m) C0028.m5161(dVarM5333, 1), strM9389))));
            C0004.m1532(arrayList3, C0014.m3319(C0043.m7290(m107(), 763, 2, 2459), C0005.m1645(m107(), 765, 2, 1260), C0039.m6481(C0030.m5333((m) C0028.m5161(dVarM5333, 2), strM9389))));
            C0037.m6362(linkedHashMap, C0052.m8377(bVar), arrayList3);
            hVarM3577 = hVarM35772;
        }
        Iterator itM78072 = C0047.m7807(C0030.m5333(hVarM3577, C0063.m9585(m107(), 767, 8, 1362)));
        while (C0012.m2962(itM78072)) {
            m mVar3 = (m) C0048.m7949(itM78072);
            String strM8058 = C0049.m8058(C0030.m5333(mVar3, C0009.m2037(m107(), 775, 7, 377)), C0018.m3917(m107(), 782, 7, 2933));
            String strM4340 = C0021.m4340(m107(), 789, 7, 2609);
            String strM80582 = C0049.m8058(C0030.m5333(mVar3, strM4340), strM3484);
            C0055.m8732(C0024.m4752(strM80582, C0044.m7509(m107(), 805, 1, 3126))[2], C0024.m4684(C0030.m5333(mVar3, strM4340)), strM8058, C0024.m4684(C0030.m5333(mVar3, C0008.m1970(m107(), 796, 9, 2515))), arrayList);
        }
        return C0033.m5854(arrayList2, arrayList, linkedHashMap);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM8058 = C0049.m8058(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0053.m8477(m107(), 806, 15, 2185), str2), C0037.m6381())), C0041.m6779(m107(), 821, 6, 813)), C0035.m6131(m107(), 827, 3, 1780));
        g gVar = new g();
        C0017.m3667(gVar, strM8058);
        C0038.m6396(gVar);
        C0057.m9029(gVar, C0037.m6381());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0002.m1305(m107(), 830, 15, 2210), C0062.m9389(m107(), 845, 21, 2599)), str), C0037.m6381())), C0065.m9775(m107(), 866, 8, 1399)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0028.m5109(m107(), 874, 7, 1785)), C0019.m4107(m107(), 881, 7, 1945));
            String strM1549 = C0004.m1549(m107(), 888, 7, 2592);
            String strM80582 = C0049.m8058(C0030.m5333(mVar, strM1549), C0034.m6001(m107(), 895, 4, 2412));
            C0055.m8732(C0024.m4752(strM80582, C0064.m9599(m107(), 908, 1, 1204))[2], C0024.m4684(C0030.m5333(mVar, strM1549)), strM8058, C0024.m4684(C0030.m5333(mVar, C0012.m2973(m107(), 899, 9, 2551))), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}