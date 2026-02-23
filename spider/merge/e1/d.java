package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
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
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.g1.e;
import com.github.catvod.spider.merge.g1.f;
import com.github.catvod.spider.merge.g1.g;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
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
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public abstract class d {
    public static volatile int a;
    public static final boolean d;
    public static volatile com.github.catvod.spider.merge.g1.c e;
    public static final String[] f;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f783short = {3176, 3191, 3197, 3119, 3185, 3125, 3199, 3198, 3183, 3198, 3192, 3183, 3159, 3188, 3196, 3196, 3198, 3177, 3157, 3194, 3190, 3198, 3158, 3186, 3176, 3190, 3194, 3183, 3192, 3187, 2504, 2510, 2505, 2521, 1978, 1958, 1976, 2705, 2800, 2691, 2716, 2710, 2788, 2714, 2800, 2723, 2741, 2722, 2726, 2745, 2739, 2741, 2800, 2720, 2722, 2751, 2726, 2745, 2740, 2741, 2722, 2800, 2742, 2737, 2745, 2748, 2741, 2740, 2800, 2724, 2751, 2800, 2745, 2750, 2723, 2724, 2737, 2750, 2724, 2745, 2737, 2724, 2741, 2794, 2778, 3129, 3096, 3081, 3096, 3102, 3081, 3096, 3097, 3165, 3089, 3090, 3098, 3098, 3096, 3087, 3165, 3091, 3100, 3088, 3096, 3165, 3088, 3092, 3086, 3088, 3100, 3081, 3102, 3093, 3155, 3165, 3130, 3092, 3083, 3096, 3091, 3165, 3091, 3100, 3088, 3096, 3143, 3165, 3167, 1839, 1846, 1837, 1902, 1890, 1888, 1917, 1912, 1913, 1896, 1897, 1837, 1891, 1900, 1888, 1896, 1847, 1837, 1839, 1333, 1337, 1869, 1915, 1915, 1854, 1910, 1898, 1898, 1902, 1901, 1828, 1841, 1841, 1897, 1897, 1897, 1840, 1901, 1906, 1912, 1834, 1908, 1840, 1905, 1900, 1913, 1841, 1917, 1905, 1914, 1915, 1901, 1840, 1910, 1898, 1907, 1906, 1853, 1906, 1905, 1913, 1913, 1915, 1900, 1872, 1919, 1907, 1915, 1875, 1911, 1901, 1907, 1919, 1898, 1917, 1910, 1854, 1912, 1905, 1900, 1854, 1919, 1904, 1854, 1915, 1894, 1902, 1906, 1919, 1904, 1919, 1898, 1911, 1905, 1904, 2845, 2874, 2866, 2871, 2878, 2879, 2939, 2863, 2868, 2939, 2877, 2866, 2869, 2879, 2939, 2868, 2857, 2876, 2933, 2856, 2871, 2877, 2927, 2865, 2933, 2867, 2878, 2871, 2859, 2878, 2857, 2856, 2933, 2830, 2863, 2866, 2871, 2939, 2868, 2857, 2939, 2866, 2863, 2856, 2939, 2872, 2874, 2871, 2871, 2878, 2857, 2939, 2866, 2869, 2939, 2863, 2867, 2878, 2939, 2856, 2863, 2874, 2872, 2864, 2912, 2939, 2863, 2867, 2866, 2856, 2939, 2856, 2867, 2868, 2862, 2871, 2879, 2939, 2869, 2868, 2863, 2939, 2867, 2874, 2859, 2859, 2878, 2869, 899, 952, 932, 947, 951, 949, 958, 951, 948, 954, 947, 1014, 949, 953, 946, 947, 1150, 1123, 1142, 1087, 1122, 1149, 1143, 1061, 1147, 1087, 1117, 1150, 1142, 1142, 1140, 1123, 1111, 1136, 1138, 1125, 1150, 1123, 1128, 1073, 1144, 1151, 1073, 1143, 1136, 1144, 1149, 1140, 1141, 1073, 1122, 1125, 1136, 1125, 1140, 1087, 1073, 1118, 1123, 1144, 1142, 1144, 1151, 1136, 1149, 1073, 1140, 1129, 1138, 1140, 1121, 1125, 1144, 1150, 1151, 1073, 1126, 1136, 1122, 1073, 1125, 1145, 1123, 1150, 1126, 1151, 1073, 1108, 1104, 1091, 1117, 1112, 1108, 1091, 1087, 1073, 1090, 1140, 1140, 1073, 1136, 1149, 1122, 1150, 1073, 1145, 1125, 1125, 1121, 1122, 1067, 1086, 1086, 1126, 1126, 1126, 1087, 1122, 1149, 1143, 1061, 1147, 1087, 1150, 1123, 1142, 1086, 1138, 1150, 1141, 1140, 1122, 1087, 1145, 1125, 1148, 1149, 1074, 1124, 1151, 1122, 1124, 1138, 1138, 1140, 1122, 1122, 1143, 1124, 1149, 1112, 1151, 1144, 1125, 2733, 2714, 2703, 2704, 2701, 2699, 2714, 2715, 2783, 2714, 2695, 2716, 2714, 2703, 2699, 2710, 2704, 2705, 2757, 2790, 2756, 2771, 2770, 2758, 2763, 2695, 2775, 2773, 2760, 2769, 2766, 2755, 2754, 2773, 2695, 2766, 2772, 2695, 2760, 2753, 2695, 2771, 2782, 2775, 2754, 2695, 2812, 1037, 2236, 2205, 2258, 2209, 2238, 2228, 2246, 2232, 2258, 2178, 2176, 2205, 2180, 2203, 2198, 2199, 2176, 2177, 2258, 2181, 2199, 2176, 2199, 2258, 2196, 2205, 2183, 2204, 2198, 2268, 1153, 1184, 1187, 1188, 1200, 1193, 1201, 1196, 1195, 1186, 1253, 1201, 1194, 1253, 1195, 1194, 1256, 1194, 1205, 1184, 1207, 1188, 1201, 1196, 1194, 1195, 1253, 1261, 1163, 1162, 1173, 1260, 1253, 1193, 1194, 1186, 1186, 1184, 1207, 1253, 1196, 1192, 1205, 1193, 1184, 1192, 1184, 1195, 1201, 1188, 1201, 1196, 1194, 1195, 3299, 3285, 3285, 3216, 3288, 3268, 3268, 3264, 3267, 3210, 3231, 3231, 3271, 3271, 3271, 3230, 3267, 3292, 3286, 3204, 3290, 3230, 3295, 3266, 3287, 3231, 3283, 3295, 3284, 3285, 3267, 3230, 3288, 3268, 3293, 3292, 3219, 3294, 3295, 3296, 3266, 3295, 3270, 3289, 3284, 3285, 3266, 3267, 3216, 3286, 3295, 3266, 3216, 3286, 3269, 3266, 3268, 3288, 3285, 3266, 3216, 3284, 3285, 3268, 3281, 3289, 3292, 3267, 3230, 1681, 1676, 1689, 1745, 1677, 1682, 1688, 1738, 1684, 1745, 1687, 1683, 1678, 1682, 1745, 1709, 1674, 1695, 1674, 1687, 1693, 1714, 1681, 1689, 1689, 1691, 1676, 1724, 1687, 1680, 1690, 1691, 1676, 1744, 1693, 1682, 1695, 1677, 1677, 510, 457, 457, 468, 457, 411, 476, 478, 463, 463, 466, 469, 476, 411, 457, 478, 456, 468, 462, 457, 472, 478, 456, 411, 477, 457, 468, 470, 411, 459, 474, 463, 467, 1660, 1600, 1613, 1544, 1626, 1613, 1625, 1629, 1613, 1627, 1628, 1613, 1612, 1544, 1630, 1613, 1626, 1627, 1601, 1607, 1606, 1544, 2101, 2167, 2156, 2101, 2156, 2170, 2144, 2151, 2101, 2150, 2169, 2163, 2081, 2175, 2101, 2167, 2172, 2171, 2161, 2172, 2171, 2162, 2101, 2172, 2150, 2101, 2171, 2170, 2145, 2101, 2166, 2170, 2168, 2149, 2164, 2145, 2172, 2167, 2169, 2160, 2101, 2146, 2172, 2145, 2173, 2101, 1547, 1597, 1597, 1656, 1584, 1580, 1580, 1576, 1579, 1634, 1655, 1655, 1583, 1583, 1583, 1654, 1579, 1588, 1598, 1644, 1586, 1654, 1591, 1578, 1599, 1655, 1595, 1591, 1596, 1597, 1579, 1654, 1584, 1580, 1589, 1588, 1659, 1582, 1597, 1578, 1579, 1585, 1591, 1590, 1543, 1589, 1585, 1579, 1589, 1593, 1580, 1595, 1584, 1656, 1598, 1591, 1578, 1656, 1598, 1581, 1578, 1580, 1584, 1597, 1578, 1656, 1596, 1597, 1580, 1593, 1585, 1588, 1579, 1654, 1706, 1681, 1690, 1671, 1679, 1690, 1692, 1675, 1690, 1691, 1759, 1679, 1677, 1680, 1693, 1683, 1690, 1682, 1759, 1680, 1692, 1692, 1674, 1677, 1690, 1691, 1759, 1691, 1674, 1677, 1686, 1681, 1688, 1759, 1673, 1690, 1677, 1676, 1686, 1680, 1681, 1759, 1676, 1694, 1681, 1686, 1675, 1670, 1759, 1692, 1687, 1690, 1692, 1684, 541, 570, 562, 567, 574, 575, 635, 559, 564, 635, 562, 565, 552, 559, 570, 565, 559, 562, 570, 559, 574, 635, 520, 535, 541, 623, 529, 635, 535, 564, 572, 572, 574, 553, 541, 570, 568, 559, 564, 553, 546, 743, 732, 727, 714, 706, 727, 721, 710, 727, 726, 658, 731, 732, 731, 710, 731, 723, 734, 731, 712, 723, 710, 731, 733, 
    732, 658, 724, 723, 731, 734, 711, 704, 727, 742, 647, 713, 722, 714, 709, 706, 725, 647, 655, 1361, 1368, 1303, 1310, 1368, 1300, 1303, 1311, 1311, 1297, 1302, 1311, 1368, 1307, 1305, 1300, 1300, 1291, 1368, 1308, 1293, 1290, 1297, 1302, 1311, 1368, 1292, 1296, 1309, 1368, 1297, 1302, 1297, 1292, 1297, 1305, 1300, 1297, 1282, 1305, 1292, 1297, 1303, 1302, 1368, 1288, 1296, 1305, 1291, 1309, 1368, 1296, 1305, 1294, 1309, 1368, 1306, 1309, 1309, 1302, 1368, 1297, 1302, 1292, 1309, 1290, 1307, 1309, 1288, 1292, 1309, 1308, 1368, 1305, 1302, 1308, 1368, 1305, 1290, 1309, 2251, 2250, 2258, 2181, 2247, 2240, 2252, 2251, 2242, 2181, 2263, 2240, 2261, 2249, 2244, 2268, 2240, 2241, 2187, 2181, 2289, 2253, 2240, 2262, 2240, 2181, 2244, 2263, 2240, 2181, 2262, 2256, 2247, 2255, 2240, 2246, 2257, 2181, 2257, 2250, 2181, 2257, 2253, 2240, 2181, 2243, 2252, 2249, 2257, 2240, 2263, 2252, 2251, 2242, 2181, 2263, 2256, 2249, 2240, 2262, 2181, 2250, 2243, 2181, 2257, 2253, 2240, 2181, 2256, 2251, 2241, 2240, 2263, 2249, 2268, 2252, 2251, 2242, 2181, 2249, 2250, 2242, 2242, 2252, 2251, 2242, 2181, 2262, 2268, 2262, 2257, 2240, 2248, 2187, 2778, 2796, 2796, 2729, 2792, 2789, 2810, 2790, 2729, 2785, 2813, 2813, 2809, 2810, 2739, 2726, 2726, 2814, 2814, 2814, 2727, 2810, 2789, 2799, 2749, 2787, 2727, 2790, 2811, 2798, 2726, 2794, 2790, 2797, 2796, 2810, 2727, 2785, 2813, 2788, 2789, 2730, 2811, 2796, 2809, 2789, 2792, 2800, 1885, 1889, 1900, 1833, 1903, 1894, 1893, 1893, 1894, 1918, 1888, 1895, 1902, 1833, 1914, 1900, 1917, 1833, 1894, 1903, 1833, 1914, 1916, 1899, 1914, 1917, 1888, 1917, 1916, 1917, 1900, 1833, 1893, 1894, 1902, 1902, 1900, 1915, 1914, 1833, 1892, 1896, 1904, 1833, 1889, 1896, 1919, 1900, 1833, 1899, 1900, 1900, 1895, 1833, 1896, 1898, 1898, 1900, 1914, 1914, 1900, 1901, 681, 696, 703, 676, 675, 682, 749, 697, 677, 680, 749, 676, 675, 676, 697, 676, 684, 673, 676, 695, 684, 697, 676, 674, 675, 749, 701, 677, 684, 702, 680, 739, 749, 641, 674, 682, 682, 676, 675, 682, 749, 686, 684, 673, 673, 702, 749, 681, 696, 703, 676, 675, 682, 749, 697, 677, 676, 702, 2421, 2413, 2404, 2422, 2400, 2341, 2418, 2400, 2423, 2400, 2341, 2411, 2410, 2417, 2341, 2413, 2410, 2411, 2410, 2423, 2400, 2401, 2347, 2341, 2381, 2410, 2418, 2400, 2419, 2400, 2423, 2345, 2341, 2422, 2416, 2407, 2422, 2400, 2420, 2416, 2400, 2411, 2417, 2341, 2409, 2410, 2402, 2402, 2412, 2411, 2402, 2341, 2406, 2404, 2409, 2409, 2422, 2341, 2417, 2410, 2341, 2417, 2413, 2400, 2422, 2400, 1004, 1007, 999, 999, 997, 1010, 1011, 928, 1015, 1001, 1004, 1004, 928, 1015, 1007, 1010, 1003, 928, 993, 1011, 928, 1006, 1007, 1010, 1005, 993, 1004, 1004, 1017, 928, 997, 1016, 1008, 997, 995, 1012, 997, 996, 942, 2156, 2138, 2138, 2079, 2142, 2131, 2124, 2128, 2079, 2135, 2123, 2123, 2127, 2124, 2053, 2064, 2064, 2120, 2120, 2120, 2065, 2124, 2131, 2137, 2059, 2133, 2065, 2128, 2125, 2136, 2064, 2140, 2128, 2139, 2138, 2124, 2065, 2135, 2123, 2130, 2131, 2076, 2124, 2122, 2141, 2124, 2123, 2134, 2123, 2122, 2123, 2138, 2163, 2128, 2136, 2136, 2138, 2125, 1415, 1446, 1455, 1446, 1444, 1442, 1463, 1446, 1507, 1455, 1452, 1444, 1444, 1446, 1457, 1507, 1440, 1442, 1453, 1453, 1452, 1463, 1507, 1441, 1446, 1507, 1453, 1462, 1455, 1455, 1507, 1442, 1463, 1507, 1463, 1451, 1450, 1456, 1507, 1456, 1463, 1442, 1463, 1446, 1517, 1356, 1379, 1390, 1404, 1404, 1327, 1407, 1390, 1403, 1383, 1327, 1388, 1376, 1377, 1403, 1390, 1382, 1377, 1404, 1327, 1372, 1347, 1353, 1339, 1349, 1327, 1389, 1382, 1377, 1387, 1382, 1377, 1384, 1404, 1327, 1403, 1390, 1405, 1384, 1386, 1403, 1382, 1377, 1384, 1327, 1404, 1379, 1385, 1339, 1381, 1314, 1390, 1407, 1382, 1327, 1401, 1386, 1405, 1404, 1382, 1376, 1377, 1404, 1327, 1342, 1313, 1336, 1313, 1399, 1327, 1376, 1405, 1327, 1386, 1390, 1405, 1379, 1382, 1386, 1405, 1313, 2959, 2977, 2984, 2985, 2996, 2991, 2984, 2977, 3046, 2980, 2991, 2984, 2978, 2991, 2984, 2977, 3046, 2976, 2985, 2995, 2984, 2978, 3046, 2983, 2994, 3046, 2973, 2034, 787, 805, 805, 864, 808, 820, 820, 816, 819, 890, 879, 879, 823, 823, 823, 878, 819, 812, 806, 884, 810, 878, 815, 818, 807, 879, 803, 815, 804, 805, 819, 878, 808, 820, 813, 812, 867, 809, 807, 814, 815, 818, 805, 804, 770, 809, 814, 804, 809, 814, 807, 819, 864, 806, 815, 818, 864, 801, 814, 864, 805, 824, 816, 812, 801, 814, 801, 820, 809, 815, 814, 878, 2948, 2987, 2982, 2996, 2996, 3047, 2999, 2982, 2995, 2991, 3047, 2980, 2984, 2985, 2995, 2982, 2990, 2985, 2996, 3047, 2986, 2994, 2987, 2995, 2990, 2999, 2987, 2978, 3047, 2964, 2955, 2945, 3059, 2957, 3047, 2999, 2997, 2984, 2993, 2990, 2979, 2978, 2997, 2996, 3049, 2636, 2661, 2687, 2660, 2670, 2602, 2682, 2680, 2661, 2684, 2659, 2670, 2671, 2680, 2602, 2641, 777, 971, 1021, 1021, 952, 1008, 1004, 1004, 1000, 1003, 930, 951, 951, 1007, 1007, 1007, 950, 1003, 1012, 1022, 940, 1010, 950, 1015, 1002, 1023, 951, 1019, 1015, 1020, 1021, 1003, 950, 1008, 1004, 1013, 1012, 955, 1013, 1005, 1012, 1004, 1009, 1000, 1012, 1021, 967, 1018, 1009, 1014, 1020, 1009, 1014, 1023, 1003, 952, 1022, 1015, 1002, 952, 1017, 1014, 952, 1021, 992, 1000, 1012, 1017, 1014, 1017, 1004, 1009, 1015, 1014, 950};
    public static final com.github.catvod.spider.merge.g1.c b = new com.github.catvod.spider.merge.g1.c(1);
    public static final com.github.catvod.spider.merge.g1.c c = new com.github.catvod.spider.merge.g1.c(0);

    static {
        String strM8891;
        try {
            strM8891 = C0056.m8891(C0036.m6188(m8175(), 0, 30, 3099));
        } catch (SecurityException unused) {
            strM8891 = null;
        }
        d = strM8891 == null ? false : C0000.m1057(strM8891, C0036.m6188(m8175(), 30, 4, 2492));
        f = new String[]{C0025.m4795(m8175(), 34, 3, 1928)};
    }

    public static ArrayList a() {
        ClassLoader classLoaderM7605 = C0045.m7605(d.class);
        ServiceLoader serviceLoaderM3119 = C0033.m5797() == null ? C0013.m3119(com.github.catvod.spider.merge.g1.c.class, classLoaderM7605) : (ServiceLoader) C0006.m1770(new c(classLoaderM7605));
        ArrayList arrayList = new ArrayList();
        Iterator itM7164 = C0042.m7164(serviceLoaderM3119);
        while (C0012.m2962(itM7164)) {
            try {
                C0004.m1532(arrayList, (com.github.catvod.spider.merge.g1.c) C0048.m7949(itM7164));
            } catch (ServiceConfigurationError e2) {
                StringBuilder sb = new StringBuilder(C0017.m3646(m8175(), 37, 48, 2768));
                C0018.m3933(sb, C0036.m6261(e2));
                C0033.m5867(C0047.m7763(sb));
            }
        }
        return arrayList;
    }

    public static b b(Class cls) {
        int i;
        b bVarM3659 = C0017.m3659(C0013.m3085(cls));
        if (C0004.m1572()) {
            f fVarM3598 = C0016.m3598();
            Class cls2 = null;
            if (fVarM3598 == null) {
                if (C0014.m3295()) {
                    fVarM3598 = null;
                } else {
                    try {
                        fVarM3598 = new f();
                    } catch (SecurityException unused) {
                        fVarM3598 = null;
                    }
                    g.a = fVarM3598;
                    g.b = true;
                }
            }
            if (fVarM3598 != null) {
                Class[] clsArrM6146 = C0035.m6146(fVarM3598);
                String strM3085 = C0013.m3085(g.class);
                int i2 = 0;
                while (i2 < clsArrM6146.length && !C0007.m1815(strM3085, C0013.m3085(clsArrM6146[i2]))) {
                    i2++;
                }
                if (i2 >= clsArrM6146.length || (i = i2 + 2) >= clsArrM6146.length) {
                    throw new IllegalStateException(C0063.m9585(m8175(), 224, 88, 2907));
                }
                cls2 = clsArrM6146[i];
            }
            if (cls2 != null && (!C0051.m8197(cls2, cls))) {
                String strM7677 = C0046.m7677(bVarM3659);
                String strM30852 = C0013.m3085(cls2);
                StringBuilder sb = new StringBuilder(C0041.m6779(m8175(), 85, 44, 3197));
                C0018.m3933(sb, strM7677);
                C0018.m3933(sb, C0051.m8259(m8175(), 129, 19, 1805));
                C0018.m3933(sb, strM30852);
                C0018.m3933(sb, C0012.m2973(m8175(), 148, 2, 1303));
                C0033.m5867(C0047.m7763(sb));
                C0033.m5867(C0005.m1645(m8175(), 150, 74, 1822));
            }
        }
        return bVarM3659;
    }

    public static b c(String str) {
        com.github.catvod.spider.merge.g1.c cVarM3920;
        if (C0030.m5417() == 0) {
            synchronized (d.class) {
                try {
                    if (C0030.m5417() == 0) {
                        a = 1;
                        C0004.m1559();
                    }
                } finally {
                }
            }
        }
        int iM5417 = C0030.m5417();
        if (iM5417 == 1) {
            cVarM3920 = C0018.m3920();
        } else {
            if (iM5417 == 2) {
                throw new IllegalStateException(C0062.m9389(m8175(), 328, 138, 1041));
            }
            if (iM5417 == 3) {
                cVarM3920 = C0059.m9186();
            } else {
                if (iM5417 != 4) {
                    throw new IllegalStateException(C0032.m5708(m8175(), 312, 16, 982));
                }
                cVarM3920 = C0039.m6479();
            }
        }
        return C0060.m9309(C0059.m9187(cVarM3920), str);
    }

    public static final void d() {
        String strM1645 = C0005.m1645(m8175(), 466, 19, 2815);
        try {
            ArrayList arrayListM3469 = C0015.m3469();
            C0054.m8582(arrayListM3469);
            if (C0007.m1817(arrayListM3469)) {
                a = 4;
                C0033.m5867(C0019.m4107(m8175(), 514, 30, 2290));
                C0033.m5867(C0028.m5109(m8175(), 544, 54, 1221));
                C0033.m5867(C0058.m9106(m8175(), 598, 69, 3248));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoaderM7605 = C0045.m7605(d.class);
                    String strM7718 = C0046.m7718(m8175(), 667, 39, 1790);
                    Enumeration enumerationM5176 = classLoaderM7605 == null ? C0028.m5176(strM7718) : C0058.m9059(classLoaderM7605, strM7718);
                    while (C0034.m6038(enumerationM5176)) {
                        C0039.m6497(linkedHashSet, (URL) C0033.m5838(enumerationM5176));
                    }
                } catch (IOException e2) {
                    String strM8574 = C0054.m8574(m8175(), 706, 33, 443);
                    PrintStream printStreamM7298 = C0043.m7298();
                    C0012.m2969(printStreamM7298, strM8574);
                    C0012.m2969(printStreamM7298, strM1645);
                    C0049.m7975(e2);
                }
                C0010.m2353(linkedHashSet);
            } else {
                e = (com.github.catvod.spider.merge.g1.c) C0028.m5167(arrayListM3469, 0);
                C0047.m7777(C0059.m9186());
                a = 3;
                if (!C0007.m1817(arrayListM3469) && C0009.m2139(arrayListM3469) > 1) {
                    StringBuilder sb = new StringBuilder(C0028.m5109(m8175(), 485, 28, 2727));
                    C0016.m3605(sb, C0028.m5167(arrayListM3469, 0));
                    C0018.m3933(sb, C0025.m4795(m8175(), 513, 1, 1104));
                    C0033.m5867(C0047.m7763(sb));
                }
            }
            C0005.m1660();
            if (C0030.m5417() == 3) {
                try {
                    String strM2071 = C0009.m2071(C0059.m9186());
                    boolean z = false;
                    for (String str : C0008.m1995()) {
                        if (C0043.m7277(strM2071, str)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0038.m6452(m8175(), 739, 22, 1576));
                    C0018.m3933(sb2, strM2071);
                    C0018.m3933(sb2, C0037.m6307(m8175(), 761, 46, 2069));
                    C0018.m3933(sb2, C0037.m6312(C0001.m1203(C0008.m1995())));
                    C0033.m5867(C0047.m7763(sb2));
                    C0033.m5867(C0005.m1645(m8175(), 807, 74, 1624));
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    PrintStream printStreamM72982 = C0043.m7298();
                    C0012.m2969(printStreamM72982, C0029.m5256(m8175(), 881, 54, 1791));
                    C0012.m2969(printStreamM72982, strM1645);
                    C0049.m7975(th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            PrintStream printStreamM72983 = C0043.m7298();
            C0012.m2969(printStreamM72983, C0051.m8259(m8175(), 935, 41, 603));
            C0012.m2969(printStreamM72983, strM1645);
            C0049.m7975(e3);
            throw new IllegalStateException(C0012.m2973(m8175(), 976, 33, 690), e3);
        }
    }

    public static void e() {
        com.github.catvod.spider.merge.g1.c cVarM3920 = C0018.m3920();
        synchronized (cVarM3920) {
            try {
                ((e) C0045.m7627(cVarM3920)).a = true;
                e eVar = (e) C0045.m7627(cVarM3920);
                C0047.m7777(eVar);
                Iterator itM7816 = C0047.m7816(new ArrayList(C0031.m5669(C0011.m2758(eVar))));
                while (C0012.m2962(itM7816)) {
                    com.github.catvod.spider.merge.g1.d dVar = (com.github.catvod.spider.merge.g1.d) C0048.m7949(itM7816);
                    dVar.b = C0017.m3659(C0005.m1590(dVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueueM3408 = C0015.m3408((e) C0045.m7627(C0018.m3920()));
        int iM8205 = C0051.m8205(linkedBlockingQueueM3408);
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (C0031.m5622(linkedBlockingQueueM3408, arrayList, 128) != 0) {
            Iterator itM78162 = C0047.m7816(arrayList);
            while (C0012.m2962(itM78162)) {
                com.github.catvod.spider.merge.f1.c cVar = (com.github.catvod.spider.merge.f1.c) C0048.m7949(itM78162);
                if (cVar != null) {
                    com.github.catvod.spider.merge.g1.d dVarM8754 = C0055.m8754(cVar);
                    String strM1590 = C0005.m1590(dVarM8754);
                    if (C0036.m6236(dVarM8754) == null) {
                        throw new IllegalStateException(C0017.m3646(m8175(), 1524, 45, 1475));
                    }
                    if (!(C0036.m6236(dVarM8754) instanceof com.github.catvod.spider.merge.g1.b)) {
                        if (!C0059.m9254(dVarM8754)) {
                            C0033.m5867(strM1590);
                        } else if (C0056.m8943(dVarM8754, C0026.m4910(cVar)) && C0059.m9254(dVarM8754)) {
                            try {
                                C0052.m8352(C0040.m6636(dVarM8754), C0036.m6236(dVarM8754), new Object[]{cVar});
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (C0059.m9254(C0055.m8754(cVar))) {
                        StringBuilder sb = new StringBuilder(C0005.m1645(m8175(), 1009, 10, 679));
                        C0036.m6177(sb, iM8205);
                        C0018.m3933(sb, C0019.m4107(m8175(), 1019, 80, 1400));
                        C0033.m5867(C0047.m7763(sb));
                        C0033.m5867(C0064.m9599(m8175(), 1099, 94, 2213));
                        C0033.m5867(C0010.m2300(m8175(), 1193, 48, 2697));
                    } else if (!(C0036.m6236(C0055.m8754(cVar)) instanceof com.github.catvod.spider.merge.g1.b)) {
                        C0033.m5867(C0048.m7902(m8175(), 1241, 62, 1801));
                        C0033.m5867(C0025.m4795(m8175(), 1303, 58, 717));
                        C0033.m5867(C0003.m1398(m8175(), 1361, 66, 2309));
                        C0033.m5867(C0041.m6779(m8175(), 1427, 39, 896));
                        C0033.m5867(C0019.m4107(m8175(), 1466, 58, 2111));
                    }
                }
                i = i2;
            }
            C0017.m3687(arrayList);
        }
        e eVar2 = (e) C0045.m7627(C0018.m3920());
        C0009.m2106(C0011.m2758(eVar2));
        C0043.m7284(C0015.m3408(eVar2));
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (C0044.m7446(linkedHashSet)) {
            return;
        }
        C0033.m5867(C0028.m5109(m8175(), 1569, 81, 1295));
        Iterator itM5199 = C0029.m5199(linkedHashSet);
        while (C0012.m2962(itM5199)) {
            URL url = (URL) C0048.m7949(itM5199);
            StringBuilder sb = new StringBuilder(C0055.m8814(m8175(), 1650, 27, 3014));
            C0016.m3605(sb, url);
            C0018.m3933(sb, C0012.m2973(m8175(), 1677, 1, 1967));
            C0033.m5867(C0047.m7763(sb));
        }
        C0033.m5867(C0034.m6001(m8175(), 1678, 72, 832));
    }

    public static void g(ArrayList arrayList) {
        if (C0009.m2139(arrayList) > 1) {
            C0033.m5867(C0052.m8337(m8175(), 1750, 45, 3015));
            Iterator itM7816 = C0047.m7816(arrayList);
            while (C0012.m2962(itM7816)) {
                com.github.catvod.spider.merge.g1.c cVar = (com.github.catvod.spider.merge.g1.c) C0048.m7949(itM7816);
                StringBuilder sb = new StringBuilder(C0020.m4199(m8175(), 1795, 16, 2570));
                C0016.m3605(sb, cVar);
                C0018.m3933(sb, C0026.m4951(m8175(), 1811, 1, 852));
                C0033.m5867(C0047.m7763(sb));
            }
            C0033.m5867(C0039.m6551(m8175(), 1812, 74, 920));
        }
    }

    /* renamed from: ۟ۦۣۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8175() {
        if (C0052.m8320() >= 0) {
            return f783short;
        }
        return null;
    }
}