package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
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
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class NCat extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f90short = {702, 664, 654, 665, 710, 682, 652, 654, 645, 671, 2469, 2439, 2450, 2433, 2436, 2436, 2441, 2503, 2525, 2502, 2520, 2504, 2496, 2495, 2433, 2438, 2444, 2439, 2463, 2459, 2504, 2470, 2492, 2504, 2521, 2520, 2502, 2520, 2515, 2504, 2495, 2433, 2438, 2526, 2524, 2515, 2504, 2448, 2526, 2524, 2497, 2504, 2473, 2456, 2456, 2436, 2445, 2495, 2445, 2442, 2467, 2433, 2460, 2503, 2525, 2523, 2527, 2502, 2523, 2526, 2504, 2496, 2467, 2464, 2492, 2469, 2468, 2500, 2504, 2436, 2433, 2435, 2445, 2504, 2479, 2445, 2443, 2435, 2439, 2497, 2504, 2475, 2432, 2458, 2439, 2437, 2445, 2503, 2521, 2522, 2522, 2502, 2520, 2502, 2520, 2502, 2520, 2504, 2491, 2441, 2446, 2441, 2458, 2433, 2503, 2525, 2523, 2527, 2502, 2523, 2526, 2076, 2072, 2066, 3316, 3304, 3304, 3308, 3311, 3238, 3251, 3251, 3307, 3307, 3307, 3250, 3314, 3327, 3325, 3304, 3247, 3250, 3327, 3315, 3313, 3238, 3241, 3245, 3245, 3245, 3245, 3251, 3311, 3316, 3315, 3307, 3251, 1445, 1445, 1445, 1445, 1445, 1467, 1445, 1859, 1797, 1817, 1792, 1793, 1078, 1083, 1060, 1148, 1087, 1085, 1078, 1063, 1086, 1079, 1151, 1083, 1062, 1079, 1087, 1207, 1202, 1191, 1202, 1278, 1212, 1185, 1210, 1204, 1210, 1213, 1202, 1215, 3108, 1179, 1153, 1174, 1173, 1063, 1082, 1063, 1087, 1078, 573, 545, 545, 549, 2993, 2989, 2989, 2985, 2986, 3043, 3062, 3062, 3055, 3048, 3063, 3048, 3053, 3054, 3063, 3040, 3050, 3063, 3051, 3052, 3051, 3043, 3048, 3052, 3049, 3049, 3051, 2759, 2267, 2243, 2251, 2228, 2284, 2267, 2268, 2251, 2220, 2250, 2215, 2237, 2296, 2293, 2253, 2239, 2277, 2252, 2276, 2282, 2264, 2280, 2245, 2238, 608, 612, 626, 526, 612, 610, 611, 526, 625, 618, 610, 626, 532, 625, 576, 581, 581, 584, 591, 582, 2195, 2192, 2193, 2198, 2199, 2196, 2050, 2078, 2078, 2074, 2073, 2128, 2117, 2117, 2077, 2077, 2077, 2116, 2052, 2057, 2059, 2078, 2137, 2116, 2057, 2053, 2055, 2128, 2143, 2139, 2139, 2139, 2139, 2117, 2062, 2063, 2078, 2059, 2051, 2054, 2117, 2810, 2807, 2792, 2736, 2810, 2811, 2794, 2815, 2807, 2802, 2739, 2794, 2807, 2794, 2802, 2811, 2750, 2797, 2794, 2796, 2801, 2800, 2809, 1866, 1792, 1793, 1808, 1797, 1805, 1800, 1865, 1812, 1805, 1799, 1860, 1805, 1801, 1795, 1485, 1480, 1501, 1480, 1412, 1478, 1499, 1472, 1486, 1472, 1479, 1480, 1477, 1713, 1790, 1716, 1717, 1700, 1713, 1721, 1724, 1789, 1700, 1713, 1719, 1699, 1789, 1721, 1700, 1717, 1725, 1566, 1555, 1548, 1620, 1566, 1567, 1550, 1563, 1555, 1558, 1623, 1566, 1567, 1545, 1561, 1626, 1546, 1784, 1719, 1770, 1782, 1772, 1771, 1786, 1788, 1716, 1776, 1773, 1788, 1780, 2191, 2178, 2205, 2245, 2190, 2203, 2178, 2200, 2180, 2191, 2190, 2246, 2183, 2178, 2200, 2207, 3008, 3011, 3026, 3037, 2732, 2732, 2732, 1077, 1154, 1245, 1217, 1228, 1236, 1154, 510, 484, 499, 496, 1920, 2922, 1410, 1438, 1438, 1434, 1433, 1488, 1477, 1477, 1500, 1499, 1476, 1499, 1502, 1501, 1476, 1491, 1497, 1476, 1496, 1503, 1496, 1488, 1499, 1503, 1498, 1498, 1496, 1942, 1938, 1944, 2996, 766, 2854, 417, 2100, 32334, 21514, -29962, 31685, 22351, 22766, 25965, 30966, -31632, 32604, 23254, 942, 946, 946, 950, 949, 1020, 1001, 1001, 945, 945, 945, 1000, 936, 933, 935, 946, 1013, 1000, 933, 937, 939, 1020, 1011, 1015, 1015, 1015, 1015, 2337, 2348, 2355, 2411, 2344, 2346, 2337, 2352, 2345, 2336, 2408, 2348, 2353, 2336, 2344, 2720, 2725, 2736, 2725, 2793, 2731, 2742, 2733, 2723, 2733, 2730, 2725, 2728, 969, 2531, 2553, 2542, 2541, 834, 863, 834, 858, 851, 2463, 2435, 2435, 2439, 2647, 2635, 2635, 2639, 2636, 2565, 2576, 2576, 2569, 2574, 2577, 2574, 2571, 2568, 2577, 2566, 2572, 2577, 2573, 2570, 2573, 2565, 2574, 2570, 2575, 2575, 2573, 3201, 1107, 1103, 1103, 1099, 1096, 1025, 1044, 1044, 1100, 1100, 1100, 1045, 1109, 1112, 1114, 1103, 1032, 1045, 1112, 1108, 1110, 1025, 1038, 1034, 1034, 1034, 1034, 1044, 1099, 1111, 1114, 1090, 1044, 1556, 1546, 1549, 1543, 1548, 1556, 1613, 1556, 1547, 1538, 1559, 1591, 1582, 1575, 1556, 1547, 1538, 1559, 1591, 1582, 1575, 1587, 1587, 1587, 1587, 1603, 1630, 1603, 1604, 1611, 1613, 1609, 1628, 1610, 1604, 763, 763, 745, 739, 748, 670, 707, 721, 726, 725, 736, 732, 721, 713, 748, 664, 748, 665, 748, 670, 709, 706, 732, 664, 658, 664, 670, 666, 655, 665, 658, 665, 668, 2956, 2952, 2946, 475, 455, 455, 451, 448, 393, 412, 412, 452, 452, 452, 413, 477, 464, 466, 455, 384, 413, 464, 476, 478, 393, 390, 386, 386, 386, 386, 412, 448, 470, 466, 449, 464, 475, 396, 472, 398, 1096, 1038, 1042, 1035, 1034, 1909, 1850, 1895, 1905, 1909, 1894, 1911, 1916, 1849, 1894, 1905, 1895, 1889, 1912, 1888, 1849, 1917, 1888, 1905, 1913, 258, 263, 274, 263, 331, 265, 276, 271, 257, 271, 264, 263, 266, 1553, 1547, 1564, 1567, 961, 988, 961, 985, 976, 305, 301, 301, 297, 1665, 1693, 1693, 1689, 1690, 1747, 1734, 1734, 1759, 1752, 1735, 1752, 1757, 1758, 1735, 1744, 1754, 1735, 1755, 1756, 1755, 1747, 1752, 1756, 1753, 1753, 1755, 1016};

    public static HashMap a() {
        return C0020.m4251(C0031.m5565(m500(), 0, 10, 747), C0029.m5256(m500(), 10, 111, 2536));
    }

    /* renamed from: ۦۣۦ۠, reason: contains not printable characters */
    public static short[] m500() {
        if (C0024.m4693() < 0) {
            return f90short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM9775 = C0065.m9775(m500(), 121, 3, 2165);
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0058.m9145(C0064.m9599(m500(), 124, 33, 3228), str, C0029.m5256(m500(), 157, 7, 1416), str2, C0043.m7290(m500(), 164, 5, 1901)), C0056.m8899())), C0001.m1189(m500(), 169, 15, 1106)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(C0053.m8455(C0030.m5333(mVar, strM9775)), C0017.m3646(m500(), 184, 13, 1235));
                String strM8058 = C0049.m8058(C0030.m5333(mVar, C0026.m4951(m500(), 197, 1, 3141)), C0038.m6452(m500(), 198, 4, 1267));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM9775), C0006.m1774(m500(), 202, 5, 1107));
                if (!C0043.m7277(strM2339, C0042.m7151(m500(), 207, 4, 597))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0022.m4403(m500(), 211, 27, 3033));
                    C0018.m3933(sb, strM2339);
                    strM2339 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM8058, C0031.m5565(m500(), 238, 1, 2792))[2], strM80582, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String decryptUrl(String str, String str2) {
        try {
            return C0005.m1594(str, C0058.m9106(m500(), 239, 24, 2189), str2, C0031.m5565(m500(), 263, 20, 545));
        } catch (Exception e) {
            C0049.m7975(e);
            return C0026.m4951(m500(), 283, 6, 2210);
        }
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0008.m1970(m500(), 289, 35, 2154), (String) C0048.m7915(list, 0)), C0056.m8899()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0052.m8337(m500(), 324, 23, 2718)));
        String strM2339 = C0010.m2339(C0053.m8455(C0030.m5333(hVarM3577, C0013.m3106(m500(), 347, 15, 1892))), C0063.m9585(m500(), 362, 13, 1449));
        String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0055.m8814(m500(), 375, 18, 1744)), 0));
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0011.m2805(m500(), 393, 17, 1658)));
        d dVarM5333 = C0030.m5333(hVarM3577, C0057.m8978(m500(), 410, 13, 1689));
        d dVarM53332 = C0030.m5333(hVarM3577, C0056.m8911(m500(), 423, 16, 2283));
        String strM1840 = C0007.m1840();
        String str = strM1840;
        String strM5172 = str;
        int i = 0;
        while (i < C0009.m2095(dVarM5333)) {
            String strM96692 = C0064.m9669(C0053.m8455(C0030.m5333((m) C0028.m5161(dVarM5333, i), C0043.m7290(m500(), 439, 4, 2995))));
            boolean zM1815 = C0007.m1815(strM1840, str);
            String strM6452 = C0038.m6452(m500(), 443, 3, 2696);
            String strM51722 = !zM1815 ? C0028.m5172(str, strM6452, strM96692) : C0065.m9804(str, strM96692);
            d dVarM53333 = C0030.m5333((m) C0028.m5161(dVarM53332, i), C0013.m3106(m500(), 446, 1, 1108));
            String strM7763 = strM1840;
            int i2 = 0;
            while (i2 < C0009.m2095(dVarM53333)) {
                boolean zM18152 = C0007.m1815(strM1840, strM7763);
                d dVar = dVarM53332;
                String strM4340 = C0021.m4340(m500(), 447, 6, 1197);
                d dVar2 = dVarM5333;
                String strM8978 = C0057.m8978(m500(), 453, 4, 406);
                String str2 = strM51722;
                String strM4795 = C0025.m4795(m500(), 457, 1, 1956);
                StringBuilder sbM3016 = !zM18152 ? C0012.m3016(strM7763, C0000.m1077(m500(), 458, 1, 2889)) : C0031.m5621(strM7763);
                C0018.m3933(sbM3016, C0064.m9669((m) C0028.m5161(dVarM53333, i2)));
                C0018.m3933(sbM3016, strM4795);
                C0018.m3933(sbM3016, C0015.m3446(C0010.m2339((m) C0028.m5161(dVarM53333, i2), strM8978), strM4340, strM1840));
                strM7763 = C0047.m7763(sbM3016);
                i2++;
                dVarM53332 = dVar;
                dVarM5333 = dVar2;
                strM51722 = str2;
            }
            d dVar3 = dVarM53332;
            d dVar4 = dVarM5333;
            String str3 = strM51722;
            strM5172 = !C0007.m1815(strM1840, strM5172) ? C0028.m5172(strM5172, strM6452, strM7763) : C0065.m9804(strM5172, strM7763);
            i++;
            dVarM53332 = dVar3;
            dVarM5333 = dVar4;
            str = str3;
        }
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        StringBuilder sb = new StringBuilder(C0025.m4795(m500(), 459, 27, 1514));
        C0018.m3933(sb, strM2339);
        C0026.m4947(mVar, C0047.m7763(sb));
        C0022.m4432(mVar, strM9669);
        C0005.m1628(mVar, strM4684);
        C0027.m5000(mVar, strM46842);
        C0054.m8596(mVar, str);
        C0044.m7449(mVar, strM5172);
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        String strM5362 = C0030.m5362(m500(), 486, 3, 2047);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {C0052.m8337(m500(), 489, 1, 2949), C0057.m8978(m500(), 490, 1, 716), C0002.m1305(m500(), 491, 1, 2837), C0027.m5062(m500(), 492, 1, 405), C0025.m4795(m500(), 493, 1, 2050)};
        String[] strArr2 = {C0002.m1305(m500(), 494, 2, 2939), C0062.m9389(m500(), 496, 3, 1320), C0014.m3332(m500(), 499, 2, 2630), C0036.m6188(m500(), 501, 2, 1546), C0001.m1189(m500(), 503, 2, 2225)};
        for (int i = 0; i < 5; i++) {
            C0004.m1532(arrayList2, new b(strArr[i], strArr2[i], null));
        }
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0046.m7718(m500(), 505, 27, 966), C0056.m8899())), C0027.m5062(m500(), 532, 15, 2373)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM2339 = C0010.m2339(C0053.m8455(C0030.m5333(mVar, strM5362)), C0006.m1774(m500(), 547, 13, 2756));
                String strM8058 = C0049.m8058(C0030.m5333(mVar, C0018.m3917(m500(), 560, 1, 936)), C0032.m5708(m500(), 561, 4, 2443));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM5362), C0050.m8131(m500(), 565, 5, 822));
                if (!C0043.m7277(strM2339, C0031.m5565(m500(), 570, 4, 2551))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0060.m9352(m500(), 574, 27, 2623));
                    C0018.m3933(sb, strM2339);
                    strM2339 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM8058, C0049.m8007(m500(), 601, 1, 3246))[2], strM80582, strM2339));
            } catch (Exception unused) {
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0008.m1970(m500(), 602, 33, 1083), str2), C0056.m8899()));
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0026.m4951(m500(), 635, 35, 1635)), C0000.m1081(hVarM3577));
        boolean zM1405 = C0003.m1405(matcherM6026);
        String strM1840 = C0007.m1840();
        if (zM1405) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            Matcher matcherM60262 = C0034.m6026(C0005.m1602(C0058.m9106(m500(), 670, 33, 688)), C0000.m1081(hVarM3577));
            if (C0003.m1405(matcherM60262)) {
                strM1840 = C0021.m4306(matcherM60262, 1);
            }
            strM1840 = C0007.m1873(this, strM4306, strM1840);
        }
        g gVar = new g();
        C0017.m3667(gVar, strM1840);
        C0057.m9029(gVar, C0056.m8899());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        String strM8131 = C0050.m8131(m500(), 703, 3, 3045);
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0045.m7657(m500(), 706, 37, 435), C0056.m8909(str)), C0001.m1189(m500(), 743, 5, 1126)), C0056.m8899())), C0004.m1549(m500(), 748, 20, 1812)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            try {
                String strM8058 = C0049.m8058(C0030.m5333(mVar, strM8131), C0039.m6551(m500(), 768, 13, 358));
                String strM2339 = C0010.m2339(mVar, C0045.m7657(m500(), 781, 4, 1657));
                String strM80582 = C0049.m8058(C0030.m5333(mVar, strM8131), C0061.m9361(m500(), 785, 5, 949));
                if (!C0043.m7277(strM8058, C0008.m1970(m500(), 790, 4, 345))) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0013.m3106(m500(), 794, 27, 1769));
                    C0018.m3933(sb, strM8058);
                    strM8058 = C0047.m7763(sb);
                }
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0024.m4752(strM2339, C0040.m6584(m500(), 821, 1, 983))[2], strM80582, strM8058));
            } catch (Exception unused) {
            }
        }
        return C0047.m7783(arrayList);
    }
}