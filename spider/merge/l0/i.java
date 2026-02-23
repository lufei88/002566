package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class i {
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final /* synthetic */ i[] g;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f835short = {257, 261, 283, 262, 273, 282, 269, 258, 256, 285, 262, 285, 273, 285, 286, 926, 954, 932, 953, 942, 933, 932, 931, 938, 1005, 925, 959, 930, 953, 930, 942, 930, 929, 958, 2755, 2759, 1869, 1884, 1867, 1871, 1882, 1867, 1866, 1664, 1713, 1702, 1698, 1719, 1702, 1703, 1432, 1434, 1434, 1436, 1417, 1421, 1436, 1437, 1747, 1777, 1777, 1783, 1762, 1766, 1783, 1782, 1202, 1203, 1187, 1215, 1203, 1202, 1192, 1209, 1202, 1192, 1573, 1540, 1611, 1576, 1540, 1541, 1567, 1550, 1541, 1567, 903, 918, 901, 899, 926, 918, 923, 904, 916, 920, 921, 899, 914, 921, 899, 2692, 2741, 2726, 2720, 2749, 2741, 2744, 2804, 2711, 2747, 2746, 2720, 2737, 2746, 2720, 3306, 3314, 3307, 3315, 3310, 3320, 3316, 3315, 3302, 3315, 3314, 3316, 2406, 2398, 2375, 2399, 2370, 2310, 2424, 2399, 2378, 2399, 2398, 2392, 1997, 2010, 2011, 2006, 1997, 2010, 2012, 1995, 1452, 1422, 1431, 1412, 1413, 1473, 1457, 1412, 1427, 1420, 1408, 1423, 1412, 1423, 1429, 1421, 1432, 1536, 1545, 1555, 1544, 1538, 1669, 1708, 1718, 1709, 1703, 782, 793, 792, 789, 782, 793, 799, 776, 771, 783, 793, 793, 771, 787, 776, 788, 793, 782, 443, 397, 397, 456, 423, 412, 384, 397, 410, 2251, 2250, 2257, 2266, 2248, 2250, 2241, 2252, 2243, 2252, 2240, 2241, 1008, 977, 970, 926, 1011, 977, 986, 983, 984, 983, 987, 986, 2974, 2959, 2951, 2970, 2949, 2968, 2955, 2968, 2963, 2965, 2968, 2959, 2958, 2947, 2968, 2959, 2953, 2974, 2720, 2705, 2713, 2692, 2715, 2694, 2709, 2694, 2701, 2772, 2726, 2705, 2704, 2717, 2694, 2705, 2711, 2688, 1894, 1893, 1888, 1915, 1910, 1889, 1909, 1905, 1889, 1911, 1904, 2219, 2184, 2189, 2249, 2235, 2188, 2200, 2204, 2188, 2202, 2205, 1284, 1311, 1296, 1284, 1285, 1305, 1310, 1283, 1304, 1291, 1300, 1301, 1576, 1555, 1564, 1544, 1545, 1557, 1554, 1551, 1556, 1543, 1560, 1561, 595, 602, 583, 599, 604, 593, 593, 592, 603, 964, 1005, 1008, 992, 1003, 998, 998, 999, 1004, 2298, 2299, 2272, 2283, 2290, 2299, 2273, 2298, 2288, 1642, 1611, 1616, 1540, 1634, 1611, 1617, 1610, 1600, 1389, 1381, 1396, 1384, 1391, 1380, 1407, 1390, 1391, 1396, 1407, 1377, 1388, 1388, 1391, 1399, 1381, 1380, 1887, 1911, 1894, 1914, 1917, 1910, 1842, 1884, 1917, 1894, 1842, 1875, 1918, 1918, 1917, 1893, 1911, 1910, 861, 860, 839, 844, 850, 848, 848, 854, 835, 839, 850, 849, 863, 854, 2424, 2393, 2370, 2326, 2423, 2389, 2389, 2387, 2374, 2370, 2391, 2388, 2394, 2387, 1669, 1682, 1670, 1666, 1682, 1668, 1667, 1672, 1667, 1694, 1690, 1682, 1688, 1666, 1667, 736, 727, 707, 711, 727, 705, 710, 658, 742, 731, 735, 727, 733, 711, 710, 2252, 2240, 2241, 2249, 2243, 2246, 2252, 2267, 2278, 2250, 2251, 2243, 2249, 2252, 2246, 2257, 1499, 1491, 1490, 1497, 2667, 2627, 2626, 2633, 2576, 2585, 2578, 2587, 2568, 2580, 2563, 2574, 2585, 2573, 2569, 2581, 2574, 2585, 2584, 1434, 1459, 1464, 1457, 1442, 1470, 1526, 1412, 1459, 1447, 1443, 1471, 1444, 1459, 1458, 2427, 2425, 2414, 2408, 2404, 2405, 2415, 2402, 2431, 2402, 2404, 2405, 2420, 2413, 2410, 2402, 2407, 2414, 2415, 2390, 2420, 2403, 2405, 2409, 2408, 2402, 2415, 2418, 2415, 2409, 2408, 2342, 2368, 2407, 2415, 2410, 2403, 2402, 2982, 2999, 2991, 3002, 3001, 2999, 2994, 2985, 2978, 3001, 3001, 2985, 3002, 2999, 2980, 2993, 2995, 802, 787, 779, 798, 797, 787, 790, 850, 806, 797, 797, 850, 830, 787, 768, 789, 791, 1086, 1061, 1080, 1086, 1083, 1083, 1060, 1081, 1087, 1070, 1071, 1076, 1062, 1070, 1071, 1058, 1066, 1076, 1087, 1074, 1083, 1070, 1848, 1795, 1822, 1816, 1821, 1821, 1794, 1823, 1817, 1800, 1801, 1869, 1824, 1800, 1801, 1796, 1804, 1869, 1849, 1812, 1821, 1800, 1515, 1528, 1527, 1534, 1532, 1510, 1527, 1526, 1517, 1510, 1514, 1528, 1517, 1520, 1514, 1535, 1520, 1528, 1531, 1525, 1532, 971, 1020, 1000, 1004, 1020, 1002, 1005, 1020, 1021, 953, 971, 1016, 1015, 1022, 1020, 953, 983, 1014, 1005, 953, 970, 1016, 1005, 1008, 1002, 1023, 1008, 1016, 1019, 1013, 1020, 1576, 1589, 1597, 1576, 1582, 1593, 1580, 1593, 1572, 1570, 1571, 1586, 1579, 1580, 1572, 1569, 1576, 1577, 1660, 1601, 1609, 1628, 1626, 1613, 1624, 1613, 1616, 1622, 1623, 1561, 1663, 1624, 1616, 1621, 1628, 1629, 2736, 2731, 2731, 2747, 2729, 2725, 2730, 2749, 2747, 2742, 2721, 2741, 2737, 2721, 2743, 2736, 2743, 3041, 3034, 3034, 2965, 3064, 3028, 3035, 3020, 2965, 3047, 3024, 3012, 3008, 3024, 3014, 3009, 3014, 2694, 2689, 2715, 2698, 2717, 2689, 2702, 2691, 2704, 2698, 2717, 2717, 2688, 2717, 2829, 2858, 2864, 2849, 2870, 2858, 2853, 2856, 2916, 2839, 2849, 2870, 2866, 2849, 2870, 2916, 2817, 2870, 2870, 2859, 2870, 2115, 2114, 2137, 2130, 2116, 2112, 2141, 2113, 2120, 2112, 2120, 2115, 2137, 2120, 2121, 2408, 2377, 2386, 2310, 2415, 2379, 2390, 2378, 2371, 2379, 2371, 2376, 2386, 2371, 2370, 568, 558, 569, 573, 546, 552, 558, 564, 574, 549, 554, 573, 554, 546, 551, 554, 553, 551, 558, 2230, 2176, 2199, 2195, 2188, 2182, 2176, 2245, 2224, 2187, 2180, 2195, 2180, 2188, 2185, 2180, 2183, 2185, 2176, 2073, 2050, 2079, 2073, 2076, 2076, 2051, 2078, 2072, 2057, 2056, 2067, 2052, 2072, 2072, 2076, 2067, 2074, 2057, 2078, 2079, 2053, 2051, 2050, 2709, 2697, 2697, 2701, 2813, 2699, 2744, 2735, 2734, 2740, 2738, 2739, 2813, 2707, 2738, 2729, 2813, 2702, 2728, 2733, 2733, 2738, 2735, 2729, 2744, 2745};
    public final int a;
    public final String b;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i(C0048.m7902(f835short, 0, 15, 338), 0, 101, C0004.m1549(f835short, 15, 19, 973));
        String strM5708 = C0032.m5708(f835short, 34, 2, 2700);
        i iVar2 = new i(strM5708, 1, 200, strM5708);
        c = iVar2;
        i iVar3 = new i(C0039.m6551(f835short, 36, 7, 1806), 2, 201, C0037.m6307(f835short, 43, 7, 1731));
        i iVar4 = new i(C0003.m1398(f835short, 50, 8, 1497), 3, 202, C0061.m9361(f835short, 58, 8, 1682));
        i iVar5 = new i(C0047.m7833(f835short, 66, 10, 1276), 4, 204, C0048.m7902(f835short, 76, 10, 1643));
        i iVar6 = new i(C0058.m9106(f835short, 86, 15, 983), 5, 206, C0034.m6001(f835short, 101, 15, 2772));
        d = iVar6;
        i iVar7 = new i(C0055.m8814(f835short, 116, 12, 3239), 6, 207, C0054.m8574(f835short, 128, 12, 2347));
        i iVar8 = new i(C0044.m7509(f835short, 140, 8, 1951), 7, 301, C0037.m6307(f835short, 148, 17, 1505));
        i iVar9 = new i(C0006.m1774(f835short, 165, 5, 1606), 8, 302, C0063.m9585(f835short, 170, 5, 1731));
        i iVar10 = new i(C0033.m5852(f835short, 175, 18, 860), 9, 303, C0061.m9361(f835short, 193, 9, 488));
        i iVar11 = new i(C0007.m1842(f835short, 202, 12, 2181), 10, 304, C0027.m5062(f835short, 214, 12, 958));
        i iVar12 = new i(C0020.m4199(f835short, 226, 18, 3018), 11, 307, C0000.m1077(f835short, 244, 18, 2804));
        i iVar13 = new i(C0024.m4740(f835short, 262, 11, 1828), 12, 400, C0023.m4536(f835short, 273, 11, 2281));
        e = iVar13;
        i iVar14 = new i(C0026.m4951(f835short, 284, 12, 1361), 13, 401, C0046.m7718(f835short, 296, 12, 1661));
        i iVar15 = new i(C0051.m8259(f835short, 308, 9, 533), 14, 403, C0011.m2805(f835short, 317, 9, 898));
        i iVar16 = new i(C0000.m1077(f835short, 326, 9, 2228), 15, 404, C0063.m9585(f835short, 335, 9, 1572));
        i iVar17 = new i(C0010.m2300(f835short, 344, 18, 1312), 16, 405, C0056.m8911(f835short, 362, 18, 1810));
        i iVar18 = new i(C0019.m4107(f835short, 380, 14, 787), 17, 406, C0065.m9775(f835short, 394, 14, 2358));
        i iVar19 = new i(C0039.m6551(f835short, 408, 15, 1751), 18, 408, C0009.m2037(f835short, 423, 15, 690));
        i iVar20 = new i(C0011.m2805(f835short, 438, 8, 2191), 19, 409, C0047.m7833(f835short, 446, 8, 2213));
        i iVar21 = new i(C0011.m2805(f835short, 454, 4, 1436), 20, 410, C0002.m1305(f835short, 458, 4, 2604));
        i iVar22 = new i(C0055.m8814(f835short, 462, 15, 2652), 21, 411, C0063.m9585(f835short, 477, 15, 1494));
        i iVar23 = new i(C0026.m4951(f835short, 492, 19, 2347), 22, 412, C0039.m6551(f835short, 511, 19, 2310));
        i iVar24 = new i(C0024.m4740(f835short, 530, 17, 3062), 23, 413, C0006.m1774(f835short, 547, 17, 882));
        i iVar25 = new i(C0031.m5565(f835short, 564, 22, 1131), 24, 415, C0033.m5852(f835short, 586, 22, 1901));
        i iVar26 = new i(C0043.m7290(f835short, 608, 21, 1465), 25, 416, C0030.m5362(f835short, 629, 31, 921));
        i iVar27 = new i(C0024.m4740(f835short, 660, 18, 1645), 26, 417, C0050.m8131(f835short, 678, 18, 1593));
        i iVar28 = new i(C0040.m6584(f835short, 696, 17, 2788), 27, 429, C0007.m1842(f835short, 713, 17, 2997));
        i iVar29 = new i(C0036.m6188(f835short, 730, 14, 2767), 28, 500, C0040.m6584(f835short, 744, 21, 2884));
        f = iVar29;
        g = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25, iVar26, iVar27, iVar28, iVar29, new i(C0054.m8574(f835short, 765, 15, 2061), 29, 501, C0000.m1077(f835short, 780, 15, 2342)), new i(C0018.m3917(f835short, 795, 19, 619), 30, 503, C0027.m5062(f835short, 814, 19, 2277)), new i(C0012.m2973(f835short, 833, 24, 2124), 31, 505, C0019.m4107(f835short, 857, 26, 2781))};
    }

    public i(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) g.clone();
    }
}