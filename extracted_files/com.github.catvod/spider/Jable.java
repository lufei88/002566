package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
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
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
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
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Jable extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f75short = {1705, 1679, 1689, 1678, 1745, 1725, 1691, 1689, 1682, 1672, 2205, 2210, 2238, 2233, 2208, 2220, 2211, 2207, 2232, 2211, 2233, 2212, 2208, 2216, 2274, 2298, 2275, 2302, 2299, 2275, 2302, 1255, 1216, 1244, 1243, 1608, 1603, 1600, 1614, 1607, 1548, 1622, 1620, 836, 891, 871, 864, 889, 885, 890, 825, 832, 891, 895, 881, 890, 1174, 1174, 1175, 1180, 1173, 1169, 1181, 1174, 1160, 1174, 1222, 1181, 1217, 1160, 1169, 1172, 1174, 1219, 1160, 1220, 1172, 1171, 1173, 1160, 1173, 1217, 1174, 1220, 1216, 1220, 1180, 1216, 1171, 1219, 1180, 1168, 2079, 2051, 2051, 2055, 2052, 2125, 2136, 2136, 2077, 2070, 2069, 2075, 2066, 2137, 2051, 2049, 2136, 2068, 2070, 2051, 2066, 2064, 2072, 2053, 2078, 2066, 2052, 2136, 1865, 1881, 1803, 1801, 1794, 1795, 1883, 1799, 1813, 1823, 1800, 1797, 1856, 1792, 1811, 1800, 1797, 1810, 1807, 1801, 1800, 1883, 1793, 1795, 1810, 1849, 1796, 1802, 1801, 1797, 1805, 1856, 1796, 1802, 1801, 1797, 1805, 1849, 1807, 1794, 1883, 1802, 1807, 1813, 1810, 1849, 1808, 1807, 1794, 1795, 1801, 1813, 1849, 1797, 1801, 1803, 1803, 1801, 1800, 1849, 1808, 1807, 1794, 1795, 1801, 1813, 1849, 1802, 1807, 1813, 1810, 1856, 1813, 1801, 1812, 1810, 1849, 1796, 1823, 1883, 1814, 1801, 1813, 1810, 1849, 1794, 1799, 1810, 1795, 1856, 1792, 1812, 1801, 1803, 1883, 2314, 2335, 2333, 2379, 750, 663, 757, 2514, 2527, 2496, 2456, 2496, 2527, 2514, 2515, 2521, 2459, 2527, 2523, 2513, 2459, 2516, 2521, 2510, 501, 497, 507, 740, 737, 756, 737, 685, 755, 754, 739, 1243, 1077, 1071, 1080, 1083, 484, 489, 502, 430, 484, 485, 500, 481, 489, 492, 416, 446, 416, 488, 438, 983, 1519, 1523, 1523, 1527, 1524, 1469, 1448, 1448, 1517, 1510, 1509, 1515, 1506, 1449, 1523, 1521, 1448, 1521, 1518, 1507, 1506, 1512, 1524, 1448, 2206, 1763, 1771, 1786, 1775, 1749, 1790, 1788, 1761, 1790, 1771, 1788, 1786, 1783, 1715, 1761, 1769, 1716, 1786, 1767, 1786, 1762, 1771, 1747, 691, 703, 702, 676, 693, 702, 676, 2530, 2538, 2555, 2542, 2516, 2559, 2557, 2528, 2559, 2538, 2557, 2555, 2550, 2482, 2528, 2536, 2485, 2534, 2530, 2542, 2536, 2538, 2514, 2359, 2356, 2341, 2346, 2410, 2349, 2346, 2341, 2343, 2352, 2349, 2354, 2337, 2409, 2343, 2347, 2344, 2347, 2358, 18248, 22336, 27902, 2402, 790, 829, 830, 816, 825, 25155, 25552, 1738, 1041, 1045, 1034, 1068, 1035, 1045, 2430, 2402, 2402, 2406, 2405, 2348, 2361, 2361, 2428, 2423, 2420, 2426, 2419, 2360, 2402, 2400, 2361, 2421, 2423, 2402, 2419, 2417, 2425, 2404, 2431, 2419, 2405, 2361, 3323, 3318, 3305, 3249, 3318, 3314, 3320, 3250, 3325, 3312, 3303, 3263, 3233, 3263, 3326, 1835, 1810, 1800, 1823, 1820, 1541, 1544, 1559, 1615, 1536, 1539, 1554, 1550, 1549, 1556, 1557, 1540, 1612, 1538, 1540, 1551, 1557, 1540, 1555, 1601, 1631, 1601, 1545, 1621, 766, 738, 738, 742, 741, 684, 697, 697, 764, 759, 756, 762, 755, 696, 738, 736, 2053, 2056, 2071, 2127, 2071, 2056, 2053, 2052, 2062, 2124, 2056, 2060, 2054, 2124, 2051, 2062, 2073, 1164, 1160, 1154, 2607, 2602, 2623, 2602, 2662, 2616, 2617, 2600, 3089, 1307, 1302, 1289, 1361, 1307, 1306, 1291, 1310, 1302, 1299, 1375, 1345, 1375, 1303, 1353, 1591, 1662, 1648, 1663, 2358, 2346, 2346, 2350, 2349, 2404, 2417, 2417, 2356, 2367, 2364, 2354, 2363, 2416, 2346, 2344, 2417, 2349, 2363, 2367, 2348, 2365, 2358, 2417, 1103, 2363, 2358, 2345, 2417, 2345, 2358, 2363, 2362, 2352, 2418, 2358, 2354, 2360, 2418, 2365, 2352, 2343, 1925, 1921, 1931, 2293, 2288, 2277, 2288, 2236, 2274, 2275, 2290, 3049, 2863, 2869, 2850, 2849, 3232, 3245, 3250, 3306, 3232, 3233, 3248, 3237, 3245, 3240, 3300, 3322, 3300, 3244, 3314};

    public static HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0002.m1305(m445(), 0, 10, 1788), C0050.m8131(m445(), 10, 21, 2253), C0065.m9775(m445(), 31, 4, 1199), C0060.m9352(m445(), 35, 8, 1570));
        C0053.m8424(mapM4127, C0044.m7509(m445(), 43, 13, 788), C0045.m7657(m445(), 56, 36, 1189));
        return mapM4127;
    }

    /* renamed from: ۤ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m445() {
        if (C0041.m6823() < 0) {
            return f75short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbM7672 = C0046.m7672(C0050.m8131(m445(), 92, 28, 2167), str, C0009.m2037(m445(), 120, 95, 1894));
        C0018.m3933(sbM7672, C0029.m5240(C0045.m7549(), C0057.m8978(m445(), 215, 4, 2351), new Object[]{C0011.m2808(C0038.m6456(str2))}));
        C0018.m3933(sbM7672, C0004.m1549(m445(), 219, 3, 712));
        C0058.m9141(sbM7672, C0009.m2099());
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sbM7672), C0048.m7928())), C0038.m6452(m445(), 222, 17, 2486)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            C0032.m5685(C0024.m4752(C0049.m8058(C0030.m5333(mVar, C0052.m8337(m445(), 250, 1, 1210)), C0010.m2300(m445(), 251, 4, 1117)), C0040.m6584(m445(), 270, 1, 1016))[4], C0024.m4684(C0030.m5333(mVar, C0050.m8131(m445(), 255, 15, 384))), C0049.m8058(C0030.m5333(mVar, C0065.m9775(m445(), 239, 3, 412)), C0011.m2805(m445(), 242, 8, 640)), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarM3577 = C0016.m3577(C0032.m5769(C0050.m8125(C0050.m8125(C0011.m2805(m445(), 271, 24, 1415), (String) C0048.m7915(list, 0)), C0014.m3332(m445(), 295, 1, 2225)), C0048.m7928()));
        d dVarM5333 = C0030.m5333(hVarM3577, C0037.m6307(m445(), 296, 23, 1678));
        String strM8814 = C0055.m8814(m445(), 319, 7, 720);
        String strM8058 = C0049.m8058(dVarM5333, strM8814);
        String strM80582 = C0049.m8058(C0030.m5333(hVarM3577, C0028.m5109(m445(), 326, 23, 2447)), strM8814);
        String strM9669 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, C0046.m7718(m445(), 349, 19, 2372)), 0));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar, strM80582);
        C0022.m4432(mVar, C0015.m3446(strM9669, C0047.m7833(m445(), 368, 4, 2370), C0007.m1840()));
        C0005.m1628(mVar, strM8058);
        C0054.m8596(mVar, C0017.m3646(m445(), 372, 5, 860));
        StringBuilder sb = new StringBuilder(C0009.m2037(m445(), 377, 3, 1774));
        C0018.m3933(sb, C0057.m9032(C0000.m1081(hVarM3577), C0022.m4403(m445(), 380, 6, 1145)));
        C0044.m7449(mVar, C0047.m7763(sb));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        String strM8259;
        String strM6779;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0026.m4951(m445(), 386, 28, 2326), C0048.m7928())), C0000.m1077(m445(), 414, 15, 3231)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM8259 = C0051.m8259(m445(), 429, 1, 1796);
            strM6779 = C0041.m6779(m445(), 430, 4, 1914);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0004.m1532(arrayList2, new b(C0024.m4752(C0010.m2339(mVar, strM6779), strM8259)[4], C0024.m4684(C0030.m5333(mVar, C0027.m5062(m445(), 434, 24, 1633))), null));
        }
        Iterator itM78072 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0048.m7902(m445(), 458, 16, 662), C0048.m7928())), C0064.m9599(m445(), 474, 17, 2145)));
        while (C0012.m2962(itM78072)) {
            m mVar2 = (m) C0048.m7949(itM78072);
            String strM8058 = C0049.m8058(C0030.m5333(mVar2, C0062.m9389(m445(), 491, 3, 1253)), C0040.m6584(m445(), 494, 8, 2635));
            String strM80582 = C0049.m8058(C0030.m5333(mVar2, C0027.m5062(m445(), 502, 1, 3184)), strM6779);
            String strM4684 = C0024.m4684(C0030.m5333(mVar2, C0048.m7902(m445(), 503, 15, 1407)));
            if (!C0060.m9349(strM8058, C0000.m1077(m445(), 518, 4, 1561)) && !C0057.m8953(strM4684)) {
                C0032.m5685(C0024.m4752(strM80582, strM8259)[4], strM4684, strM8058, arrayList);
            }
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0057.m9029(gVar, C0048.m7928());
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM8125 = C0050.m8125(C0045.m7657(m445(), 522, 24, 2398), C0056.m8909(str));
        String strM9585 = C0063.m9585(m445(), 546, 1, 1120);
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0050.m8125(strM8125, strM9585), C0048.m7928())), C0064.m9599(m445(), 547, 17, 2399)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, C0047.m7833(m445(), 564, 3, 2028)), C0044.m7509(m445(), 567, 8, 2193));
            String strM80582 = C0049.m8058(C0030.m5333(mVar, C0019.m4107(m445(), 575, 1, 2952)), C0041.m6779(m445(), 576, 4, 2887));
            C0032.m5685(C0024.m4752(strM80582, strM9585)[4], C0024.m4684(C0030.m5333(mVar, C0017.m3646(m445(), 580, 15, 3268))), strM8058, arrayList);
        }
        return C0047.m7783(arrayList);
    }
}