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
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PPX extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f95short = {507, 477, 459, 476, 387, 495, 457, 459, 448, 474, 1349, 1383, 1394, 1377, 1380, 1380, 1385, 1319, 1341, 1318, 1336, 1320, 1312, 1377, 1368, 1376, 1383, 1382, 1389, 1331, 1320, 1355, 1368, 1373, 1320, 1377, 1368, 1376, 1383, 1382, 1389, 1320, 1351, 1371, 1320, 1337, 1342, 1367, 1342, 1320, 1380, 1377, 1379, 1389, 1320, 1349, 1385, 1387, 1320, 1351, 1371, 1320, 1360, 1313, 1320, 1353, 1400, 1400, 1380, 1389, 1375, 1389, 1386, 1347, 1377, 1404, 1319, 1342, 1336, 1341, 1318, 1337, 1318, 1337, 1341, 1320, 1312, 1347, 1344, 1372, 1349, 1348, 1316, 1320, 1380, 1377, 1379, 1389, 1320, 1359, 1389, 1387, 1379, 1383, 1313, 1320, 1374, 1389, 1402, 1403, 1377, 1383, 1382, 1319, 1337, 1342, 1318, 1342, 1320, 1349, 1383, 1386, 1377, 1380, 1389, 1319, 1337, 1341, 1357, 1337, 1340, 1328, 1320, 1371, 1385, 1390, 1385, 1402, 1377, 1319, 1342, 1336, 1340, 1318, 1337, 2921, 2891, 2891, 2893, 2904, 2908, 959, 942, 942, 946, 951, 957, 959, 938, 951, 945, 944, 1009, 948, 941, 945, 944, 1010, 1022, 938, 955, 934, 938, 1009, 948, 959, 936, 959, 941, 957, 940, 951, 942, 938, 1010, 1022, 1012, 1009, 1012, 997, 1022, 943, 995, 1006, 1008, 1006, 1007, 2640, 2565, 2650, 2637, 2649, 2653, 2637, 2651, 2652, 2637, 2636, 2565, 2655, 2625, 2652, 2624, 678, 691, 690, 694, 650, 650, 654, 684, 667, 655, 651, 667, 653, 650, 1407, 1395, 1394, 1384, 1401, 1394, 1384, 1329, 1384, 1381, 1388, 1401, 1777, 1760, 1760, 1788, 1785, 1779, 1777, 1764, 1785, 1791, 1790, 1727, 1768, 1725, 1767, 1767, 1767, 1725, 1782, 1791, 1762, 1789, 1725, 1765, 1762, 1788, 1781, 1790, 1779, 1791, 1780, 1781, 1780, 1707, 1712, 1779, 1784, 1777, 1762, 1763, 1781, 1764, 1709, 1733, 1732, 1750, 1725, 1704, 1116, 1089, 1114, 1108, 1114, 1117, 438, 426, 426, 430, 429, 484, 497, 497, 444, 440, 431, 431, 496, 425, 437, 439, 486, 496, 445, 433, 435, 944, 934, 928, 1006, 933, 934, 951, 928, 939, 1006, 944, 938, 951, 934, 1282, 1296, 1308, 1300, 1372, 1310, 1283, 1304, 1302, 1304, 1311, 3272, 3294, 3288, 3222, 3293, 3294, 3279, 3288, 3283, 3222, 3286, 3284, 3295, 3294, 1300, 1304, 1285, 1284, 592, 582, 576, 526, 581, 582, 599, 576, 587, 526, 583, 582, 592, 599, 2843, 2835, 2830, 2826, 2823, 3308, 3310, 3310, 3304, 3325, 3321, 3232, 3297, 3308, 3299, 3306, 3320, 3308, 3306, 3304, 624, 610, 551, 585, 580, 550, 624, 610, 561, 635, 567, 570, 548, 563, 2305, 2307, 2328, 2334, 2307, 2328, 2309, 2312, 628, 572, 560, 557, 545, 616, 2703, 2723, 2723, 2727, 2725, 2729, 1490, 1477, 1487, 1523, 1534, 1510, 1530, 1517, 1458, 1481, 1520, 1523, 1514, 1522, 1530, 1442, 1455, 1457, 1447, 1444, 1471, 1490, 1477, 1487, 1523, 1534, 1510, 1530, 1517, 1458, 1489, 1501, 1478, 1458, 1479, 1490, 1478, 1502, 1498, 1484, 1447, 1533, 1453, 1454, 1454, 1454, 1448, 1450, 1446, 1448, 1447, 1532, 1455, 1452, 1447, 1446, 1452, 1448, 1529, 1454, 1447, 1453, 1531, 1534, 1450, 1531, 1453, 1451, 1452, 1447, 1531, 1448, 1530, 1448, 1446, 1455, 1446, 1446, 1454, 1447, 1529, 1453, 1446, 1448, 1529, 1453, 1450, 1448, 1531, 1448, 1533, 1450, 1532, 1530, 1449, 1449, 1446, 1448, 1453, 1446, 1449, 1533, 1454, 1529, 1529, 1451, 1453, 1531, 1447, 1446, 1451, 1534, 1533, 1451, 1447, 1454, 1533, 1534, 1534, 1455, 1452, 1447, 1448, 1452, 1534, 1532, 1453, 1449, 1454, 1447, 1534, 1453, 1534, 1454, 1448, 1533, 1507, 1530, 1450, 1446, 1454, 1533, 1530, 1533, 1447, 1531, 1529, 1450, 1453, 1532, 1532, 1450, 1530, 1450, 1531, 1534, 1531, 1448, 1446, 1534, 1447, 1532, 1454, 1450, 1447, 1449, 1454, 1450, 1531, 1442, 1452, 1457, 1446, 1448, 1450, 1448, 1448, 1451, 1444, 1471, 1490, 1477, 1487, 1523, 1534, 1510, 1530, 1517, 1458, 1490, 1514, 1515, 1530, 1531, 1442, 1529, 1534, 1523, 1516, 1530, 568, 548, 548, 544, 547, 618, 639, 639, 544, 544, 552, 553, 547, 638, 563, 563, 639, 639, 569, 574, 564, 565, 552, 638, 544, 568, 544, 639, 550, 575, 564, 639, 548, 553, 544, 565, 639, 569, 564, 639, 451, 389, 409, 384, 385, 3028, 3027, 3036, 3029, 3013, 3031, 3036, 2969, 2969, 2969, 2853, 2856, 2871, 2927, 2865, 2868, 2851, 2861, 2856, 2850, 2924, 2861, 2856, 2866, 2869, 2924, 2851, 2862, 2873, 2927, 2865, 2868, 2851, 2861, 2856, 2850, 2924, 2865, 2856, 2850, 2924, 2851, 519, 1176, 1157, 1176, 1152, 1161, 2413, 2423, 2400, 2403, 1186, 1190, 1196, 1253, 1191, 1194, 1201, 1202, 2253, 2248, 2269, 2248, 2180, 2266, 2267, 2250, 2634, 2633, 2648, 2647, 2583, 2633, 2636, 2651, 2645, 2640, 2650, 2580, 2645, 2640, 2634, 2637, 2580, 2633, 2635, 2651, 2583, 2641, 2640, 2653, 2652, 2583, 2655, 2637, 2571, 2467, 2495, 2495, 2491, 2488, 2545, 2532, 2532, 2491, 2491, 2483, 2482, 2488, 2533, 2472, 2472, 2532, 682, 753, 748, 689, 686, 683, 678, 679, 751, 683, 684, 676, 685, 751, 694, 683, 694, 686, 679, 748, 682, 683, 678, 679, 1484, 1473, 1502, 1414, 1499, 1476, 1473, 1484, 1485, 1413, 1500, 1473, 1477, 1485, 1413, 1473, 1477, 1487, 1434, 1416, 1430, 1416, 1473, 1477, 1487, 496, 497, 480, 775, 778, 789, 845, 784, 788, 778, 787, 774, 785, 846, 788, 785, 770, 787, 787, 774, 785, 2972, 3027, 2958, 2954, 2964, 2957, 2968, 2959, 3024, 2958, 2961, 2964, 2969, 2968, 1161, 1168, 1234, 1181, 1170, 1160, 1172, 1171, 1168, 1171, 1179, 1157, 1233, 1168, 1173, 1167, 1160, 1233, 1164, 1168, 1181, 1157, 1234, 1167, 1173, 1158, 1177, 1158, 1158, 1158, 3084, 2277, 2297, 2297, 2301, 2302, 2231, 2210, 2210, 2301, 2301, 2293, 2292, 2302, 2211, 2286, 2286, 2210, 1852, 1830, 1841, 1842, 600, 2825, 2886, 2828, 2829, 2840, 2820, 2823, 2833, 2821, 2829, 2822, 2844, 2886, 2822, 2823, 2822, 2829, 2886, 2827, 2823, 2842, 2909, 2948, 2951, 2966, 2969, 555, 629, 567, 562, 565, 574, 618, 635, 613, 635, 570, 2807, 2729, 2787, 2790, 2803, 2790, 2727, 2745, 2727, 2790, 2202, 2199, 2184, 2256, 2186, 2203, 2182, 2186, 2256, 2205, 2193, 2188, 2253, 1645, 1632, 1663, 1575, 1658, 1661, 1660, 1632, 1572, 1642, 1638, 1639, 1661, 1644, 1639, 1661, 1622, 1622, 1661, 
    1633, 1660, 1636, 1643, 480, 483, 498, 509, 445, 483, 506, 496, 446, 487, 502, 491, 487, 445, 487, 502, 491, 487, 446, 481, 506, 500, 507, 487, 2639, 673, 2645, 3155, 31759, 22091, 30644, -29881, 20710, 30746, -31588, 22011, 26744, 1579, 1580, 1586, 1632, 2266, 2217, 668, 1884, 1803, 1804, 1810, 1884, 1860, 1884, 1878, 1829, 1824, 1884, 1827, 1877, 1879, 1884, 1872, 1876, 1857, 1884, 1803, 1804, 1810, 1825, 1808, 1819, 1798, 1802, 1884, 1664, 1692, 1692, 1688, 1691, 1746, 1735, 1735, 1674, 1678, 1689, 1689, 1734, 1695, 1667, 1665, 1744, 1734, 1675, 1671, 1669, 1735, 1673, 1676, 1669, 1665, 1670, 1735, 1669, 1665, 1682, 1664, 1665, 1719, 1666, 1691, 1671, 1670, 1734, 1688, 1664, 1688, 2931, 2927, 2927, 2923, 2920, 2849, 2868, 2868, 2923, 2923, 2915, 2914, 2920, 2869, 2936, 2936, 2868, 2868, 2930, 2933, 2943, 2942, 2915, 2869, 2923, 2931, 2923, 2868, 2925, 2932, 2943, 2868, 2920, 2942, 2938, 2921, 2936, 2931, 2868, 2924, 2943, 2868, 3220, 3282, 3278, 3287, 3286, 1159, 1162, 1173, 1229, 1171, 1174, 1153, 1167, 1162, 1152, 1230, 1167, 1162, 1168, 1175, 1230, 1153, 1164, 1179, 1229, 1168, 1158, 1154, 1169, 1152, 1163, 1230, 1153, 1164, 1179, 1425, 1436, 1411, 1499, 1409, 1437, 1408, 1432, 1431, 1496, 1409, 1421, 1409, 1499, 1430, 1434, 1415, 1473, 1499, 1437, 1436, 1425, 1424, 1493, 1483, 1493, 1428, 3120, 3114, 3133, 3134, 2828, 2824, 2818, 2891, 2825, 2820, 2847, 2844, 1267, 1270, 1251, 1270, 1210, 1252, 1253, 1268, 2196, 2199, 2182, 2185, 2249, 2199, 2194, 2181, 2187, 2190, 2180, 2250, 2187, 2190, 2196, 2195, 2250, 2199, 2197, 2181, 2249, 2191, 2190, 2179, 2178, 2249, 2177, 2195, 2261, 2954, 2966, 2966, 2962, 2961, 3032, 3021, 3021, 2962, 2962, 2970, 2971, 2961, 3020, 2945, 2945, 3021};
    public String a;

    public static HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0058.m9106(m521(), 0, 10, 430), C0011.m2805(m521(), 10, 135, 1288), C0063.m9585(m521(), 145, 6, 2856), C0022.m4403(m521(), 151, 46, 990));
        C0053.m8424(mapM4127, C0058.m9106(m521(), 197, 16, 2600), C0024.m4740(m521(), 213, 14, 766));
        C0053.m8424(mapM4127, C0009.m2037(m521(), 227, 12, 1308), C0064.m9599(m521(), 239, 48, 1680));
        C0053.m8424(mapM4127, C0039.m6551(m521(), 287, 6, 1075), C0021.m4340(m521(), 293, 21, 478));
        C0053.m8424(mapM4127, C0056.m8911(m521(), 314, 14, 963), C0022.m4403(m521(), 328, 11, 1393));
        C0053.m8424(mapM4127, C0026.m4951(m521(), 339, 14, 3259), C0062.m9389(m521(), 353, 4, 1399));
        C0053.m8424(mapM4127, C0058.m9106(m521(), 357, 14, 547), C0061.m9361(m521(), 371, 5, 2942));
        C0053.m8424(mapM4127, C0005.m1645(m521(), 376, 15, 3213), C0027.m5062(m521(), 391, 14, 522));
        C0053.m8424(mapM4127, C0056.m8911(m521(), 405, 8, 2417), C0042.m7151(m521(), 413, 6, 513));
        C0053.m8424(mapM4127, C0057.m8978(m521(), 419, 6, 2764), C0045.m7657(m521(), 425, 200, 1439));
        return mapM4127;
    }

    /* renamed from: ۟۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m521() {
        if (C0015.m3433() >= 0) {
            return f95short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM1130 = C0000.m1130(C0003.m1398(m521(), 625, 40, 592), str, C0038.m6452(m521(), 665, 5, 493));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0017.m3646(m521(), 670, 10, 2994));
        C0018.m3933(sb, strM1130);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(strM1130, C0038.m6454())), C0012.m2973(m521(), 680, 32, 2881)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM6584 = C0040.m6584(m521(), 712, 1, 614);
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM6584), C0056.m8911(m521(), 713, 5, 1260));
            String strM80582 = C0049.m8058(C0030.m5333(mVar, strM6584), C0035.m6131(m521(), 718, 4, 2309));
            C0055.m8732(C0026.m4915(C0060.m9352(m521(), 767, 17, 2507), strM80582), strM8058, C0010.m2339(C0036.m6243(mVar, C0039.m6551(m521(), 722, 8, 1227)), C0014.m3332(m521(), 730, 8, 2217)), C0055.m8697(C0036.m6243(mVar, C0004.m1549(m521(), 738, 29, 2617))), arrayList);
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(400), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM4199;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0038.m6454()));
        String strM4684 = C0024.m4684(C0030.m5333(hVarM3577, C0044.m7509(m521(), 784, 24, 706)));
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, C0064.m9599(m521(), 808, 25, 1448)), C0005.m1645(m521(), 833, 3, 387));
        d dVarM6459 = C0038.m6459(C0030.m5333(hVarM3577, C0065.m9775(m521(), 836, 18, 867)), C0031.m5565(m521(), 854, 14, 3069));
        d dVarM5333 = C0030.m5333(hVarM3577, C0003.m1398(m521(), 868, 27, 1276));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM4684);
        C0018.m3933(sb, strM8058);
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM6459);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM4199 = C0020.m4199(m521(), 895, 3, 1186);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0018.m3933(sb2, C0016.m3579());
            C0018.m3933(sb2, C0055.m8697(mVar));
            C0018.m3933(sb2, strM4199);
        }
        StringBuilder sb3 = new StringBuilder(C0007.m1840());
        Iterator itM78072 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0025.m4795(m521(), 898, 1, 3181)));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM9669 = C0064.m9669(mVar2);
                StringBuilder sb4 = new StringBuilder(C0047.m7833(m521(), 899, 17, 2189));
                C0018.m3933(sb4, C0010.m2339(mVar2, C0048.m7902(m521(), 916, 4, 1876)));
                String strM7763 = C0047.m7763(sb4);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '$');
                C0018.m3933(sb3, strM7763);
                String strM7657 = C0045.m7657(m521(), 920, 1, 550);
                C0018.m3933(sb3, strM7657);
                C0018.m3933(sb3, strM4684);
                C0018.m3933(sb3, strM7657);
                C0018.m3933(sb3, strM9669);
                C0062.m9399(sb3, '#');
            }
            C0018.m3933(sb3, strM4199);
        }
        String strM3917 = C0018.m3917(m521(), 921, 22, 2920);
        d dVarM53332 = C0030.m5333(hVarM3577, strM3917);
        String strM5109 = C0028.m5109(m521(), 943, 4, 3063);
        String strM96692 = C0064.m9669((m) C0028.m5161(C0038.m6459(dVarM53332, strM5109), 2));
        String strM96693 = C0064.m9669((m) C0028.m5161(C0038.m6459(C0030.m5333(hVarM3577, strM3917), strM5109), 0));
        String strM46842 = C0024.m4684(C0030.m5333(hVarM3577, C0048.m7902(m521(), 947, 11, 603)));
        String strM46843 = C0024.m4684(C0030.m5333(hVarM3577, C0060.m9352(m521(), 958, 10, 2695)));
        String strM46844 = C0024.m4684(C0030.m5333(hVarM3577, C0014.m3332(m521(), 968, 13, 2302)));
        StringBuilder sb5 = new StringBuilder();
        C0018.m3933(sb5, C0036.m6189());
        C0018.m3933(sb5, C0024.m4684(C0038.m6459(C0030.m5333(hVarM3577, C0042.m7151(m521(), 981, 23, 1545)), C0054.m8574(m521(), 1004, 24, 403))));
        String strM77632 = C0047.m7763(sb5);
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0017.m3671(mVar3, strM96692);
        C0058.m9152(mVar3, strM46842);
        C0058.m9159(mVar3, strM46843);
        C0019.m4073(mVar3, strM77632);
        C0022.m4432(mVar3, strM96693);
        StringBuilder sb6 = new StringBuilder();
        C0018.m3933(sb6, C0055.m8703());
        C0018.m3933(sb6, strM46844);
        C0027.m5000(mVar3, C0047.m7763(sb6));
        C0005.m1628(mVar3, strM4684);
        C0054.m8596(mVar3, C0000.m1096(sb2));
        C0044.m7449(mVar3, C0000.m1096(sb3));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0016.m3525(m521(), 1028, 1, 2686), C0008.m1970(m521(), 1029, 1, 659), C0008.m1970(m521(), 1030, 1, 2662), C0052.m8337(m521(), 1031, 1, 3175)});
        List listM12032 = C0001.m1203(new String[]{C0009.m2037(m521(), 1032, 2, 2362), C0027.m5062(m521(), 1034, 3, 641), C0055.m8814(m521(), 1037, 2, 1766), C0053.m8477(m521(), 1039, 2, 1875)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0017.m3725(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM9106 = C0058.m9106(m521(), 1041, 3, 1630);
        String strM5565 = C0031.m5565(m521(), 1044, 1, 1615);
        String strM3484 = C0015.m3484(m521(), 1045, 2, 2182);
        String[] strArrM4752 = C0024.m4752(str2, C0047.m7833(m521(), 1047, 1, 738));
        String str3 = null;
        String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str5 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        String strM2827 = C0011.m2827(str4, str5, str3);
        try {
            String strM3446 = C0015.m3446(C0012.m3038(C0006.m1778(C0032.m5769(str4, C0038.m6454()), C0061.m9361(m521(), 1048, 28, 1918))), strM3484, strM5565);
            HashMap map = new HashMap();
            C0053.m8424(map, strM9106, strM3446);
            String strM34462 = C0015.m3446(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0053.m8477(m521(), 1076, 42, 1768), map, C0054.m8593()))), strM9106), strM3484, strM5565);
            strM2827 = C0011.m2827(strM3446, str5, str);
            if (strM3446 != null) {
                g gVar = new g();
                C0017.m3667(gVar, strM34462);
                C0002.m1282(gVar, strM2827);
                C0057.m9029(gVar, C0038.m6454());
                return C0033.m5828(gVar);
            }
            g gVar2 = new g();
            C0017.m3667(gVar2, str4);
            C0006.m1720(gVar2, 1);
            C0002.m1282(gVar2, strM2827);
            C0057.m9029(gVar2, C0038.m6454());
            return C0033.m5828(gVar2);
        } catch (Exception unused) {
            g gVar3 = new g();
            C0017.m3667(gVar3, str4);
            C0006.m1720(gVar3, 1);
            C0002.m1282(gVar3, strM2827);
            C0057.m9029(gVar3, C0038.m6454());
            return C0033.m5828(gVar3);
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0000.m1130(C0017.m3646(m521(), 1118, 42, 2843), str, C0048.m7902(m521(), 1160, 5, 3258)), C0038.m6454())), C0041.m6779(m521(), 1165, 30, 1251)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM7718 = C0046.m7718(m521(), 1195, 27, 1525);
            String strM4684 = C0024.m4684(C0030.m5333(mVar, strM7718));
            String strM8058 = C0049.m8058(C0030.m5333(mVar, strM7718), C0051.m8259(m521(), 1222, 4, 3160));
            C0055.m8732(C0026.m4915(C0035.m6131(m521(), 1271, 17, 3042), strM8058), strM4684, C0010.m2339(C0036.m6243(mVar, C0027.m5062(m521(), 1226, 8, 2917)), C0018.m3917(m521(), 1234, 8, 1175)), C0055.m8697(C0036.m6243(mVar, C0004.m1549(m521(), 1242, 29, 2279))), arrayList);
        }
        return C0047.m7783(arrayList);
    }
}