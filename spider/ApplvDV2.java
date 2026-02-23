package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B0.a;
import com.github.catvod.spider.merge.C.C0017;
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
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.h;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
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
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
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
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ApplvDV2 extends Spider {
    public static final Pattern e;
    public static final Pattern f;
    public h a = null;
    public final HashMap b = new HashMap();
    public String[] c = null;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f5short = {2533, 2548, 2541, 2520, 2474, 2548, 2540, 2548, 2475, 2474, 2478, 2491, 2475, 2546, 2539, 2528, 1663, 1646, 1655, 1602, 1584, 1646, 1654, 1646, 1585, 1584, 1589, 1569, 1602, 1584, 1640, 1649, 1658, 1214, 1215, 1210, 1229, 1198, 1215, 1210, 1196, 1098, 1102, 1100, 1041, 1046, 1032, 1048, 1042, 1048, 1042, 1037, 1024, 1048, 1044, 1036, 1044, 1080, 1115, 1037, 1024, 1101, 1113, 511, 483, 483, 487, 484, 424, 429, 440, 440, 460, 457, 440, 458, 445, 2178, 2206, 2195, 2187, 2199, 2176, 2255, 2204, 2199, 2181, 1589, 1645, 1632, 1663, 1577, 1632, 1645, 1588, 1579, 1663, 1632, 1645, 1644, 1638, 1579, 1346, 1306, 1303, 1288, 1374, 1303, 1306, 1347, 1372, 1317, 1312, 1372, 1315, 1364, 1345, 1294, 1298, 1311, 1287, 1307, 1292, 1372, 1067, 1067, -29246, -25451, -28422, 26529, 2747, 2719, 2688, 2745, 2688, 2723, 2719, 2706, 2698, 2710, 2689, 2735, 2779, 739, 694, 697, 685, 702, 690, 698, 644, 643, 684, 643, 652, 642, 757, 736, 684, 685, 700, 738, 765, 644, 641, 765, 642, 756, 736, 765, 1928, 1986, 2013, 2000, 2001, 2011, 2031, 2024, 1991, 2024, 2023, 2025, 1950, 1931, 1991, 1990, 2007, 1929, 1942, 2031, 2026, 1942, 2025, 1951, 1931, 1942, 1108, 1101, 1094, 1036, 1051, 1095, 1042, 1041, 1036, 1089, 1101, 1103, 1755, 1785, 1772, 1791, 1786, 1786, 1783, 1721, 1699, 1720, 1702, 1718, 1726, 1754, 1791, 1784, 1763, 1774, 1709, 1718, 1751, 1784, 1778, 1764, 1785, 1791, 1778, 1718, 1696, 1720, 1702, 1709, 1718, 1752, 1779, 1774, 1763, 1765, 1718, 1699, 1718, 1748, 1763, 1791, 1786, 1778, 1721, 1755, 1732, 1751, 1699, 1710, 1752, 1727, 1718, 1751, 1766, 1766, 1786, 1779, 1729, 1779, 1780, 1757, 1791, 1762, 1721, 1699, 1701, 1697, 1720, 1701, 1696, 1718, 1726, 1757, 1758, 1730, 1755, 1754, 1722, 1718, 1786, 1791, 1789, 1779, 1718, 1745, 1779, 1781, 1789, 1785, 1727, 1718, 1749, 1790, 1764, 1785, 1787, 1779, 1721, 1703, 1702, 1701, 1720, 1702, 1720, 1702, 1720, 1702, 1718, 1755, 1785, 1780, 1791, 1786, 1779, 1718, 1733, 1783, 1776, 1783, 1764, 1791, 1721, 1699, 1701, 1697, 1720, 1701, 1696, 574, 559, 566, 625, 559, 567, 559, 624, 574, 559, 559, 1093, 1114, 1116, 1101, 1101, 943, 955, 940, 940, 930, 936, 935, 1595, 1586, 1571, 1182, 1171, 1152, 1163, 1751, 1742, 1750, 1756, 2530, 2553, 2531, 2537, 3299, 3306, 3305, 3299, 440, 420, 421, 431, 2593, 2604, 2593, 2603, 1533, 1506, 1525, 1535, 2790, 2750, 2727, 2732, 899, 903, 900, 920, 920, 924, 963, 984, 962, 989, 962, 988, 2372, 2401, 2412, 2422, 2409, 2411, 2351, 2354, 2350, 2353, 2350, 2352, 674, 647, 660, 658, 713, 724, 712, 727, 723, 710, 718, 642, 647, 660, 658, 732, 655, 649, 719, 1940, 1969, 1954, 1956, 2047, 2018, 2046, 2017, 2020, 2032, 2040, 1972, 1969, 1954, 1956, 2026, 1977, 1983, 2041, 3068, 3034, 3020, 3035, 2948, 3048, 3022, 3020, 3015, 3037, 500, 592, 592, 592, 521, 586, 576, 595, 593, 521, 580, 584, 586, 2966, 3067, 3033, 3020, 3039, 3034, 3034, 3031, 2969, 2947, 2968, 2950, 1288, 1704, 1678, 1688, 1679, 1744, 1724, 1690, 1688, 1683, 1673, 998, 977, 978, 977, 966, 977, 966, 2034, 2031, 2034, 2023, 2024, 1960, 2027, 2017, 2034, 2032, 418, 425, 428, 425, 418, 425, 428, 425, 2822, 2894, 2898, 2898, 2902, 2901, 2844, 2825, 2825, 2897, 2897, 2897, 2824, 2884, 2895, 2890, 2895, 2884, 2895, 2890, 2895, 2824, 2885, 2889, 2891, 2825, 685, 704, 738, 759, 740, 737, 737, 748, 674, 696, 675, 701, 685, 677, 730, 740, 739, 745, 738, 762, 766, 685, 707, 729, 685, 700, 701, 675, 701, 694, 685, 730, 740, 739, 699, 697, 694, 685, 757, 699, 697, 676, 685, 716, 765, 765, 737, 744, 730, 744, 751, 710, 740, 761, 674, 696, 702, 698, 675, 702, 699, 685, 677, 710, 709, 729, 704, 705, 673, 685, 737, 740, 742, 744, 685, 714, 744, 750, 742, 738, 676, 685, 718, 741, 767, 738, 736, 744, 674, 700, 703, 703, 675, 701, 675, 701, 675, 701, 685, 734, 748, 747, 748, 767, 740, 674, 696, 702, 698, 675, 702, 699, 25549, 22326, 29176, 1223, 1236, 1239, 1237, 1223, -30444, -29813, -1045, 20522, 23155, 30289, 25830, 31974, 1245, 1223, 2063, 2093, 2104, 2091, 2094, 2094, 2083, 2157, 2167, 2156, 2162, 2146, 2154, 2069, 2091, 2092, 2086, 2093, 2101, 2097, 2146, 2060, 2070, 2146, 2163, 2162, 2156, 2162, 2169, 2146, 2069, 2091, 2092, 2164, 2166, 2169, 2146, 2106, 2164, 2166, 2155, 2146, 2051, 2098, 2098, 2094, 2087, 2069, 2087, 2080, 2057, 2091, 2102, 2157, 2167, 2161, 2165, 2156, 2161, 2164, 2146, 2154, 2057, 2058, 2070, 2063, 2062, 2158, 2146, 2094, 2091, 2089, 2087, 2146, 2053, 2087, 2081, 2089, 2093, 2155, 2146, 2049, 2090, 2096, 2093, 2095, 2087, 2157, 2163, 2163, 2165, 2156, 2162, 2156, 2162, 2156, 2162, 2146, 2065, 2083, 2084, 2083, 2096, 2091, 2157, 2167, 2161, 2165, 2156, 2161, 2164, 1583, 1545, 1567, 1544, 1623, 1595, 1565, 1567, 1556, 1550, 1921, 1955, 1955, 1957, 1968, 1972, 2029, 1925, 1966, 1955, 1967, 1956, 1961, 1966, 1959, 1852, 1841, 1840, 1851, 1825, 1852, 1825, 1836, 2916, 20785, 23400, 23752, 18973, 26003, -1306, 1759, 1754, 1754, 1773, 1739, 1742, 1742, 1740, 1755, 1741, 1741, 1755, 1754, 2719, 2714, 2703, 2714, 2743, 2736, 2734, 1702, 1702, 466, 462, 462, 458, 457, 384, 1112, 1092, 1092, 1088, 2537, 2532, 2528, 2533, 2532, 2547, 1881, 1908, 1904, 1909, 1908, 1891, 2089, 2084, 2080, 2085, 2084, 2099, 2098, 1020, 977, 981, 976, 977, 966, 967, 1410, 1412, 1426, 1413, 1498, 1430, 1424, 1426, 1433, 1411, 2168, 2142, 2120, 2143, 2048, 2156, 2122, 2120, 2115, 2137, 1301, 1299, 1284, 1287, 1284, 1299, 1284, 1299, 3225, 3246, 3245, 3246, 3257, 3246, 3257, 1400, 1385, 1402, 1403, 1389, 553, 1150, 1135, 1142, 1073, 1135, 1143, 1135, 1072, 1150, 1135, 1135, 289, 318, 312, 297, 297, 2165, 2093, 2100, 2111, 1107, 1105, 1033, 1093, 1106, 1099, 1090, 1102, 1033, 1092, 1092, 2924, 2928, 2928, 2932, 2935, 2878, 2859, 2859, 2928, 2930, 2858, 2918, 2929, 2920, 2913, 2925, 2858, 2919, 2919, 2859, 2917, 2932, 2925, 2870, 2858, 2932, 2924, 2932, 2859, 2930, 2869, 2858, 2930, 
    2923, 2912, 2875, 2928, 2941, 2932, 2913, 2873, 2645, 2643, 2636, 2649, 2642, 2629, 2633, 2642, 398, 461, 456, 466, 469, 414, 469, 472, 465, 452, 412, 1268, 1215, 1202, 1211, 1198, 1270, 3054, 2992, 2994, 3052, 3005, 3000, 2978, 2981, 3063, 2994, 3005, 2992, 2978, 2978, 3052, 1865, 1860, 1863, 1860, 1868, 1877, 1860, 1868, 2874, 2854, 2854, 2850, 2920, 2941, 2941, 2853, 2853, 2853, 2940, 2870, 2875, 2872, 2875, 2867, 2858, 2875, 2867, 2940, 2865, 2877, 2879, 2941, 2867, 2850, 2875, 2940, 2850, 2874, 2850, 2941, 2867, 2850, 2850, 2941, 2852, 2875, 2870, 2871, 2877, 2925, 2854, 2875, 2870, 2927, 1337, 1318, 1323, 1322, 1312, 1392, 1339, 1318, 1323, 1394, 536, 515, 536, 525, 512, 540, 525, 523, 521, 2651, 2654, 2650, 2654, 2627, 504, 483, 504, 493, 480, 2986, 3003, 3005, 3007, 3001, 2997, 2991, 2996, 2990, 855, 850, 839, 850, 1188, 1205, 1196, 1259, 1205, 1197, 1205, 1258, 1188, 1205, 1205, 1627, 1604, 1602, 1619, 1619, 1199, 1271, 1262, 1253, 2116, 2049, 2062, 2051, 2065, 2065, 2143, 29497, -26517, 2049, 2062, 2051, 2065, 2065, 2116, 2051, 2064, 2055, 2051, 2143, 29497, -26517, 2051, 2064, 2055, 2051, 2116, 2062, 2051, 2060, 2053, 2143, 29497, -26517, 2062, 2051, 2060, 2053, 2116, 2075, 2055, 2051, 2064, 2143, 29497, -26517, 2075, 2055, 2051, 2064, 2116, 2048, 2075, 2143, 27632, 22253, 2116, 2062, 2059, 2063, 2059, 2070, 2143, 2131, 2138, 2116, 2066, 2051, 2053, 2055, 2143, 2113, 2098, 2092, 2113, 1073, 1127, 1142, 1136, 1138, 1066, 1076, 1095, 1113, 1076, 1073, 1142, 1125, 1138, 1142, 1066, 32588, -27618, 1142, 1125, 1138, 1142, 1073, 1123, 1134, 1127, 1138, 1066, 32588, -27618, 1140, 1147, 1142, 1124, 1124, 1073, 1124, 1123, 1142, 1125, 1123, 1066, 32588, -27618, 1134, 1138, 1142, 1125, 1241, 1180, 1171, 1182, 1164, 1164, 1218, 32676, -27402, 1180, 1171, 1182, 1164, 1164, 1241, 1182, 1165, 1178, 1182, 1218, 32676, -27402, 1182, 1165, 1178, 1182, 1241, 1171, 1182, 1169, 1176, 1218, 32676, -27402, 1171, 1182, 1169, 1176, 1241, 1158, 1178, 1182, 1165, 1218, 32676, -27402, 1158, 1178, 1182, 1165, 1241, 1171, 1174, 1170, 1174, 1163, 1218, 1230, 1223, 1241, 1167, 1176, 1218, 1244, 1199, 1201, 1244, 484, 407, 393, 484, 3297, 3310, 3299, 3313, 3313, 30700, -25410, 3284, 3291, 3286, 3268, 3268, 2029, 2046, 2025, 2029, 31076, -28106, 606, 589, 602, 606, 3126, 3131, 3124, 3133, 30956, -27714, 987, 982, 985, 976, 1668, 1688, 1692, 1679, 29546, -26568, 2120, 2132, 2128, 2115, 27441, 22060, 2957, 2952, 2962, 2965, 2152, 2161, 2170, 2113, 2156, 2171, 2163, 2175, 2156, 2165, 2157, 3183, 3190, 3197, 3142, 3177, 3184, 3194, 2124, 2133, 2142, 2149, 2132, 2139, 2135, 2143, 1364, 1357, 1350, 1405, 1355, 1350, 2809, 2802, 2799, 2787, 2811, 2814, 2809, 2812, 2395, 2374, 2395, 2371, 2378, 2285, 2292, 2302, 1034, 1037, 1048, 1037, 1052, 846, 793, 824, 811, 845, 817, 790, 820, 846, 779, 794, 809, 846, 846, 778, 830, 846, 802, 848, 785, 846, 844, 816, 782, 737, 712, 722, 688, 739, 712, 717, 694, 716, 761, 697, 752, 738, 727, 739, 757, 739, 712, 726, 745, 716, 691, 705, 758, 730, 711, 729, 690, 729, 762, 709, 691, 729, 727, 729, 688, 730, 724, 726, 747, 718, 746, 747, 691, 730, 708, 713, 761, 719, 711, 721, 757, 737, 750, 706, 750, 2158, 2067, 2163, 2155, 2157, 2049, 2093, 2167, 2157, 2156, 2067, 2157, 2157, 2049, 2109, 2159, 1570, 1587, 1589, 1591, 3091, 3100, 3089, 3075, 3075, 3101, 3086, 3097, 3101, 2096, 2109, 2098, 2107, 1335, 1323, 1327, 1340, 31818, -26856, 2283, 22952, -26584, 2301, 2283, 689, 865, 1017, 1480, 1424, 1417, 1410, 1300, 26252, 23441, 1333, 21622, -27146, 1315, 1333, 25118, 24750, 1315, 1386, 1399, 1395, 1403, 1333, 25118, 30195, 1315, 1398, 1399, 1386, 1389, 1333, -28966, 22296, 1315, 1389, 1405, 1393, 1388, 1403, 1965, 1980, 1957, 2018, 1980, 1956, 1980, 2019, 1965, 1980, 1980, 2984, 2999, 2993, 2976, 2976, 20986, 32647, 983, 21140, -27884, 961, 983, 30409, 23693, 961, 913, 915, 906, 917, 921, 983, -29662, 32017, 20891, 961, 904, 906, 908, 912, 925, 901, 983, 32000, -32378, 961, 904, 906, 911, 916, 915, 907, 983, 20820, 27863, 961, 927, 915, 913, 917, 927, 983, 968, 951, 961, 913, 915, 906, 917, 921, 931, 968, 919, 983, 19631, -31922, 961, 904, 917, 901, 905, 1014, 30887, -27659, 927, 912, 925, 911, 911, 983, 21140, -27884, 961, 983, 22112, 20891, 983, 29133, 25401, 983, 25516, 25578, 983, 20820, 19616, 983, 31277, 23943, 983, 20891, 25401, 983, 25060, 19829, 983, -30566, 20694, 983, 29011, 31894, 983, 20820, 30407, 983, 23227, 23943, 983, 26778, 19548, 983, 21102, -27243, 983, 25686, 25060, 983, 25516, 25578, 983, 25424, 30317, 983, 25398, 25446, 983, 32051, 21124, 983, -27474, 26073, 983, 26235, -32378, 983, 23634, 30409, 23693, 983, 20504, -29895, 983, 20602, 20494, 983, -29652, 20820, 983, 21088, 25773, 983, 25398, 25446, 983, 25398, 25446, 983, 19674, 30714, 983, 25401, -32370, 983, 31347, 20949, 983, 19957, 32091, 983, 21187, 31001, 983, 31917, 32032, 30409, 23693, 1014, 30887, -27659, 925, 910, 921, 925, 983, 21140, -27884, 961, 983, 23259, -27206, 983, -26011, 28115, 983, 20492, 28034, 983, 31858, 21761, 983, -32499, 21761, 983, 28457, 21761, 983, 26137, 25808, 983, -27627, 21761, 983, 23627, 21761, 983, 28428, 21761, 983, 20620, 23898, 983, -30077, 28689, 29093, 983, 20828, 24835, 23259, 983, 21130, 19754, 1014, 30887, -27659, 901, 921, 925, 910, 983, 21140, -27884, 961, 983, 974, 972, 974, 975, 983, 974, 972, 974, 974, 983, 974, 972, 974, 973, 983, 974, 972, 974, 972, 983, 974, 972, 973, 965, 983, 974, 972, 973, 964, 983, 974, 972, 973, 971, 983, 974, 972, 973, 970, 983, 974, 972, 973, 969, 983, 974, 972, 973, 968, 983, 974, 972, 973, 975, 983, 974, 972, 973, 974, 983, 974, 972, 973, 973, 983, 974, 972, 973, 972, 983, 974, 972, 972, 965, 983, 974, 972, 972, 964, 983, 974, 972, 972, 971, 983, 974, 972, 972, 970, 983, 974, 972, 972, 969, 983, 974, 972, 972, 968, 983, 974, 972, 972, 975, 983, 974, 972, 972, 974, 983, 974, 972, 972, 973, 983, 974, 
    972, 972, 972, 1283, 2259, 2242, 2267, 2204, 2242, 2266, 2242, 2205, 2259, 2242, 2242, 500, 428, 437, 446, 2964, 2955, 2957, 2972, 2972, 2622, 2616, 2599, 2610, 2617, 2606, 2594, 2617, 2893, 2822, 2823, 2838, 2819, 2827, 2830, 2859, 2854, 2909, 2836, 2829, 2822, 2877, 2827, 2822, 2911, 1588, 1663, 1662, 1647, 1658, 1650, 1655, 1572, 1645, 1652, 1663, 1604, 1650, 1663, 1574, 579, 590, 589, 590, 582, 607, 590, 582, 677, 697, 697, 701, 702, 759, 738, 738, 698, 698, 698, 739, 681, 676, 679, 676, 684, 693, 676, 684, 739, 686, 674, 672, 738, 684, 701, 676, 739, 701, 677, 701, 738, 684, 701, 701, 738, 699, 676, 681, 680, 674, 658, 681, 680, 697, 684, 676, 673, 754, 676, 681, 752, 977, 976, 977, 976, 900, 921, 1641, 1653, 1653, 1649, 1595, 1582, 1582, 1654, 1654, 1654, 1583, 1584, 1585, 1584, 1585, 1637, 1656, 1583, 1634, 1634, 1582, 1632, 1649, 1640, 1583, 1649, 1641, 1649, 1582, 1632, 1649, 1649, 1582, 1655, 1640, 1637, 1636, 1646, 1630, 1637, 1636, 1653, 1632, 1640, 1645, 1598, 1640, 1637, 1596, 2942, 2913, 2924, 2925, 2919, 2903, 2924, 2925, 2940, 2921, 2913, 2916, 2871, 2913, 2924, 2869, 1324, 1341, 1316, 1379, 1341, 1317, 1341, 1378, 1324, 1341, 1341, 1378, 3128, 3113, 3130, 3131, 3117, 3095, 3113, 3128, 3105, 2336, 658, 669, 657, 665, 955, 951, 956, 957, 423, 446, 437, 398, 420, 419, 445, 398, 422, 440, 421, 441, 398, 417, 445, 432, 424, 436, 419, 2925, 2932, 2943, 2884, 2936, 2935, 2938, 2920, 2920, 1179, 1182, 1163, 1182, 1806, 1801, 1815, 2195, 2206, 2199, 2178, 2232, 2185, 2182, 2186, 2178, 3167, 3142, 3149, 3190, 3146, 3142, 3143, 3165, 3148, 3143, 3165, 1681, 1672, 1667, 1720, 1667, 1678, 1685, 1666, 1668, 1683, 1672, 1685, 1483, 1490, 1497, 1506, 1500, 1502, 1481, 1490, 1487, 2599, 2622, 2613, 2574, 2595, 2612, 2620, 2608, 2595, 2618, 2594, 2436, 2461, 2454, 2477, 2451, 2432, 2455, 2451, 3090, 3083, 3072, 3131, 3101, 3073, 3077, 3094, 1009, 1000, 995, 984, 1015, 1006, 996, 2504, 2513, 2522, 2529, 2512, 2527, 2515, 2523, 1274, 1251, 1256, 1235, 1253, 1256, 2857, 2935, 2865, 2940, 265, 374, 1976, 477, 452, 463, 500, 450, 453, 461, 452, 2765, 2772, 2783, 2788, 2763, 2775, 2778, 2754, 2788, 2775, 2770, 2760, 2767, 1494, 1482, 1479, 1503, 1475, 1492, 1529, 1487, 1480, 1472, 1481, 633, 621, 624, 626, 2947, 2968, 2975, 2951, 479, 462, 477, 476, 458, 1860, 1877, 1862, 1863, 1873, 1798, 523, 535, 535, 531, 2315, 2315, 2879, 2851, 2851, 2855, 2925, 3054, 3054, 985, 457, 468, 457, 465, 472, 1726, 1722, 1712, 1672, 1698, 1701, 1723, 1753, 1748, 1757, 1736, 1768, 1773, 1786, 1772, 1777, 1781, 1789, 1149, 1134, 1145, 1149, 699, 701, 698, 673, 676, 1301, 1303, 1280, 1307, 1286, 2494, 2483, 2472, 2495, 2489, 2478, 2485, 2472, 1601, 1606, 1628, 1626, 1607, 259, 284, 273, 272, 282, 281, 284, 262, 257, 2039, 2032, 2030, 1983, 2187, 2061, 2061, 2061, 1639, 1662, 1653, 1614, 1633, 1661, 1648, 1640, 1614, 1655, 1635, 1662, 1660, 1224, 1233, 1242, 1249, 1230, 1234, 1247, 1223, 1249, 1227, 1228, 1234, 1478, 1475, 1497, 1502, 2798, 2785, 2796, 2814, 2814, 567, 550, 575, 632, 550, 574, 550, 633, 567, 550, 550, 2524, 2499, 2501, 2516, 2516, 835, 795, 770, 777, 2978, 2980, 3003, 2990, 2981, 2994, 3006, 2981, 3045, 2984, 2980, 2982, 1617, 1554, 1559, 1549, 1546, 1601, 1546, 1543, 1550, 1563, 2403, 2360, 2357, 2364, 2345, 2367, 256, 271, 280, 337, 282, 257, 261, 267, 256, 339, 3023, 3140, 3123, 2714, 2447, 2434, 2443, 2462, 2468, 2450, 2463, 637, 624, 633, 620, 598, 615, 616, 612, 620, 1202, 1207, 1197, 1194, 3247, 3242, 3263, 3242, 643, 654, 647, 658, 680, 658, 655, 643, 658, 665, 659, 31441, -28285, 1036, 1040, 1044, 1031, 2974, 2963, 2972, 2965, 865, 882, 869, 865, 30352, 23904, 21658, 17427, -30342, -30569, 21732, 20718, 2948, 2954, 2966, 2115, 2124, 2112, 2120, 1856, 2204, 1403, 1388, 1377, 1400, 1384, 1547, 1540, 1537, 1561, 1544, 1567, 1566, 690, 675, 698, 765, 675, 699, 675, 764, 690, 675, 675, 1431, 1416, 1422, 1439, 1439, 2609, 2665, 2672, 2683, 656, 713, 720, 731, 751, 727, 733, 766, 723, 723, 1527, 1520, 1530, 1531, 1510, 1473, 1512, 1527, 1530, 1531, 1521, 1441, 1514, 1521, 1525, 1531, 1520, 1443, 625, 627, 618, 629, 633, 570, 620, 637, 635, 633, 545, 557, 570, 637, 622, 633, 637, 545, 570, 616, 613, 620, 633, 545, 570, 623, 616, 637, 622, 616, 545, 2746, 2723, 2728, 2707, 2750, 2729, 2721, 2733, 2750, 2727, 2751, 1826, 1851, 1840, 1803, 1828, 1853, 1847, 1014, 1007, 996, 991, 1006, 993, 1005, 997, 934, 959, 948, 911, 953, 948, 2268, 2265, 2252, 2265, 3161, 3154, 3151, 3139, 3163, 3166, 3161, 3164, 2996, 2985, 2996, 2988, 2981, 1866, 1875, 1881, 3303, 3296, 3317, 3296, 3313, 272, 266, 271, 277, 274, 869, 892, 887, 844, 895, 890, 864, 871, 1982, 2025, 1992, 2011, 1981, 1985, 2022, 1988, 1982, 2043, 2026, 2009, 1982, 1982, 2042, 1998, 1982, 2002, 1952, 2017, 1982, 1980, 1984, 2046, 2315, 2338, 2360, 2394, 2313, 2338, 2343, 2396, 2342, 2323, 2387, 2330, 2312, 2365, 2313, 2335, 2313, 2338, 2364, 2307, 2342, 2393, 2347, 2332, 2352, 2349, 2355, 2392, 2355, 2320, 2351, 2393, 2355, 2365, 2355, 2394, 2352, 2366, 2364, 2305, 2340, 2304, 2305, 2393, 2352, 2350, 2339, 2323, 2341, 2349, 2363, 2335, 2315, 2308, 2344, 2308, 2332, 2401, 2305, 2329, 2335, 2419, 2399, 2309, 2335, 2334, 2401, 2335, 2335, 2419, 2383, 2333, 637, 632, 610, 613, 2311, 2311, 2311, 477, 403, 386, 411, 477, 415, 403, 411, 412, 477, 411, 412, 411, 390, 461, 390, 411, 415, 407, 463, 390, 411, 415, 407, 468, 390, 413, 409, 407, 412, 463, 2405, 2338, 2355, 2355, 2332, 2346, 2343, 2430, 1927, 1984, 2001, 1994, 2046, 1996, 1984, 2003, 1994, 1948, 1997, 2007, 1989, 1998, 2004, 1932, 1987, 1998, 2009, 1932, 2004, 1992, 1932, 1943, 1927, 2007, 1988, 2003, 2002, 1992, 1998, 1999, 1948, 2765, 3278, 3275, 3294, 3275, 2128, 2113, 2130, 2131, 2117, 2131, 2147, 2127, 
    2126, 2118, 2121, 2119, 2523, 2524, 2498, 2460, 2449, 2456, 2445, 1176, 2068, 2056, 2056, 2060, 2567, 1349, 1369, 1369, 1373, 1303, 1282, 1282, 1308, 1304, 1305, 1283, 1311, 1308, 1300, 1283, 1308, 1308, 1310, 1283, 1308, 1310, 1303, 1308, 1311, 1308, 1311, 1308, 1282, 1344, 1346, 1375, 1356, 1347, 1394, 1365, 1346, 1375, 1283, 1373, 1349, 1373, 1298, 1368, 1375, 1345, 1296, 2910, 2822, 2847, 2836, 1585, 1639, 1654, 1648, 1650, 1578, 937, 943, 944, 933, 942, 953, 949, 942, 1006, 931, 943, 941, 543, 604, 601, 579, 580, 527, 583, 596, 525, 1541, 1613, 1630, 1543, 1043, 1026, 1051, 1116, 1026, 1050, 1026, 1117, 1043, 1026, 1026, 1177, 1158, 1152, 1169, 1169, 1953, 1975, 1953, 1960, 1960, 1957, 1969, 1968, 1963, 2121, 2134, 2121, 2124, 2134, 2126, 2123, 2134, 2121, 2120, 2121, 912, 896, 915, 921, 2101, 2098, 2101, 873, 893, 880, 864, 2291, 2273, 2273, 2288, 2277, 2285, 2218, 2279, 2282, 896, 905, 903, 899, 905, 902, 898, 925, 985, 1140, 1147, 1126, 1064, 1066, 2426, 2410, 2410, 2350, 2412, 2409, 2406, 2405, 3134, 3133, 3108, 3127, 3179, 3179, 3178, 3179, 3235, 3327, 3235, 3306, 872, 879, 810, 884, 892, 881, 874, 2977, 2990, 2992, 2993, 928, 935, 932, 1005, 928, 940, 952, 953, 953, 953, 1160, 1152, 1161, 1152, 1228, 1230, 1874, 1887, 1871, 1881, 1859, 1887, 1544, 1541, 1536, 1541, 1543, 1560, 1562, 513, 513, 523, 537, 516, 1342, 1334, 1323, 1338, 1324, 1322, 1340, 1342, 1334, 525, 525, 601, 532, 542, 731, 720, 704, 722, 727, 726, 1269, 1251, 1270, 1249, 1258, 1263, 1259, 2285, 2290, 2283, 2297, 2283, 2648, 2642, 2638, 2636, 2335, 2305, 2334, 2316, 2315, 2943, 2849, 2851, 2941, 2860, 2857, 2867, 2868, 2918, 2874, 2861, 2941, 2542, 2480, 2482, 2540, 2493, 2488, 2466, 2469, 2551, 2470, 2485, 2540, 633, 623, 619, 632, 617, 610, 565, 638, 623, 626, 638, 567, 529, 583, 592, 522, 2593, 2596, 2622, 2617, 823, 818, 807, 818, 2522, 2499, 2504, 2547, 2501, 2504, 918, 911, 900, 959, 914, 901, 909, 897, 914, 907, 915, 1331, 1322, 1313, 1306, 1333, 1324, 1318, 2888, 2897, 2906, 2913, 2896, 2911, 2899, 2907, 2873, 2866, 2863, 2851, 2875, 2878, 2873, 2876, 889, 868, 889, 865, 872, 2052, 2077, 2071, 2329, 2334, 2315, 2334, 2319};
    public static final Pattern d = C0005.m1602(C0032.m5708(m55(), 0, 16, 2436));

    static {
        C0005.m1602(C0001.m1189(m55(), 16, 17, 1566));
        C0005.m1602(C0005.m1645(m55(), 33, 8, 1169));
        e = C0005.m1602(C0034.m6001(m55(), 41, 22, 1124));
        f = C0005.m1602(C0034.m6001(m55(), 63, 14, 407));
        C0005.m1602(C0046.m7718(m55(), 77, 10, 2290));
        C0005.m1602(C0018.m3917(m55(), 87, 15, 1545));
        C0005.m1602(C0038.m6452(m55(), 102, 22, 1406));
        C0005.m1602(C0006.m1774(m55(), 124, 6, 1028));
        C0005.m1602(C0053.m8477(m55(), 130, 13, 2803));
        C0005.m1602(C0058.m9106(m55(), 143, 27, 735));
        C0005.m1602(C0049.m8007(m55(), 170, 26, 1972));
    }

    public static void a(JSONObject jSONObject, String str, ArrayList arrayList) {
        Iterator itM7553 = C0045.m7553(jSONObject);
        while (C0012.m2962(itM7553)) {
            String str2 = (String) C0048.m7949(itM7553);
            try {
                Object objM5409 = C0030.m5409(jSONObject, str2);
                if (C0007.m1815(str2, str) && (objM5409 instanceof JSONArray)) {
                    C0004.m1532(arrayList, (JSONArray) objM5409);
                }
                if (objM5409 instanceof JSONObject) {
                    C0041.m6772((JSONObject) objM5409, str, arrayList);
                } else if (objM5409 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objM5409;
                    for (int i = 0; i < C0053.m8396(jSONArray); i++) {
                        C0041.m6772(C0018.m3923(jSONArray, i), str, arrayList);
                    }
                }
            } catch (JSONException e2) {
                m56(e2);
            }
        }
    }

    public static HashMap e(String str) {
        HashMap map = new HashMap();
        C0053.m8424(map, C0045.m7657(m55(), 459, 10, 2985), C0058.m9127(str, C0053.m8477(m55(), 196, 12, 1058)) ? C0043.m7290(m55(), 208, 131, 1686) : (C0058.m9127(str, C0018.m3917(m55(), 339, 11, 607)) || C0058.m9127(str, C0049.m8007(m55(), 350, 5, 1085)) || C0058.m9127(str, C0011.m2805(m55(), 355, 7, 969))) ? C0015.m3484(m55(), 440, 19, 2000) : (C0058.m9127(str, C0064.m9599(m55(), 362, 3, 1601)) || C0058.m9127(str, C0039.m6551(m55(), 365, 4, 1272)) || C0058.m9127(str, C0015.m3484(m55(), 369, 4, 1711)) || C0058.m9127(str, C0042.m7151(m55(), 373, 4, 2458)) || C0058.m9127(str, C0025.m4795(m55(), 377, 4, 3216)) || C0058.m9127(str, C0029.m5256(m55(), 381, 4, 476)) || C0058.m9127(str, C0051.m8259(m55(), 385, 4, 2648)) || C0058.m9127(str, C0008.m1970(m55(), 389, 4, 1420))) ? C0050.m8131(m55(), 421, 19, 742) : C0058.m9127(str, C0014.m3332(m55(), 393, 4, 2760)) ? C0036.m6188(m55(), 397, 12, 1004) : C0058.m9106(m55(), 409, 12, 2304));
        return map;
    }

    public static String f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C0053.m8396(jSONArray); i++) {
                C0004.m1532(arrayList, C0025.m4770(jSONArray, i));
            }
            return C0032.m5761(arrayList, C0056.m8911(m55(), 469, 1, 472));
        } catch (JSONException unused) {
            return C0007.m1840();
        }
    }

    public static JSONObject fixJsonVodHeader(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        boolean zM9127 = C0058.m9127(str, C0047.m7833(m55(), 470, 12, 551));
        String strM8007 = C0049.m8007(m55(), 482, 12, 2998);
        String strM4107 = C0019.m4107(m55(), 494, 1, 1320);
        String strM1549 = C0004.m1549(m55(), 495, 10, 1789);
        String strM8477 = C0053.m8477(m55(), 505, 7, 948);
        if (zM9127 || C0058.m9127(str2, C0058.m9106(m55(), 512, 10, 1926))) {
            C0047.m7743(jSONObject2, strM8477, strM4107);
            C0047.m7743(jSONObject2, strM1549, strM8007);
        } else if (C0058.m9127(str, C0057.m8978(m55(), 522, 8, 448))) {
            C0047.m7743(jSONObject2, strM8477, C0039.m6551(m55(), 530, 26, 2854));
            C0047.m7743(jSONObject2, strM1549, C0031.m5565(m55(), 556, 112, 653));
        }
        return jSONObject2;
    }

    public static Headers ger302(String str) {
        String strM5362 = C0030.m5362(m55(), 668, 18, 1255);
        OkHttpClient okHttpClientM41 = m41(m46(m49(new OkHttpClient.Builder(), false), false));
        Request.Builder builderM43 = m43(m48(new Request.Builder(), str));
        String strM3646 = C0017.m3646(m55(), 686, 111, 2114);
        String strM7151 = C0042.m7151(m55(), 797, 10, 1658);
        Request.Builder builderM54 = m54(m54(builderM43, strM7151, strM3646), strM7151, strM7151);
        String strM1398 = C0003.m1398(m55(), 807, 15, 1984);
        String strM7509 = C0044.m7509(m55(), 822, 8, 1877);
        try {
            Response responseM58 = m58(m47(okHttpClientM41, m52(builderM54, strM1398, strM7509, strM7509, C0017.m3646(m55(), 830, 1, 2901))));
            try {
                if (m44(responseM58) == 302) {
                    C0012.m2969(C0035.m6087(), C0044.m7509(m55(), 831, 6, 1532));
                    Headers headersM45 = m45(responseM58);
                    m61(responseM58);
                    return headersM45;
                }
                PrintStream printStreamM6087 = C0035.m6087();
                StringBuilder sb = new StringBuilder(strM5362);
                C0036.m6177(sb, m44(responseM58));
                C0012.m2969(printStreamM6087, C0047.m7763(sb));
                m61(responseM58);
                return null;
            } catch (Throwable th) {
                if (responseM58 != null) {
                    try {
                        m61(responseM58);
                    } catch (Throwable th2) {
                        try {
                            C0052.m8352(C0057.m8970(Throwable.class, C0041.m6779(m55(), 837, 13, 1726), new Class[]{Throwable.class}), th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            C0049.m7975(e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0 A[PHI: r4
  0x00f0: PHI (r4v4 java.lang.String) = (r4v1 java.lang.String), (r4v2 java.lang.String), (r4v3 java.lang.String) binds: [B:29:0x00ee, B:32:0x010c, B:35:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject jsonParse(java.lang.String r60, java.lang.String r61) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.ApplvDV2.jsonParse(java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m39(Object obj) {
        if (C0005.m1599() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m40(Object obj) {
        if (C0006.m1726() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m41(Object obj) {
        if (C0007.m1886() > 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static JsonObject m42(Object obj, Object obj2) {
        if (C0043.m7332() >= 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۧۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m43(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m44(Object obj) {
        if (C0008.m1975() > 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۟ۥۥۤ۟, reason: not valid java name and contains not printable characters */
    public static Headers m45(Object obj) {
        if (C0045.m7538() < 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۟ۥۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m46(Object obj, boolean z) {
        if (C0006.m1726() < 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۡ۟, reason: not valid java name and contains not printable characters */
    public static Call m47(Object obj, Object obj2) {
        if (C0022.m4497() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m48(Object obj, Object obj2) {
        if (C0020.m4210() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m49(Object obj, boolean z) {
        if (C0059.m9257() < 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m50(Object obj) {
        if (C0044.m7508() <= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m51(Object obj, Object obj2, Object obj3) {
        if (C0021.m4379() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۢۦۢۥ, reason: not valid java name and contains not printable characters */
    public static Request m52(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0008.m1975() > 0) {
            return a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۢۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m53(Object obj) {
        if (C0064.m9659() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۢۧۥۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m54(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() < 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۦۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m55() {
        if (C0018.m3956() > 0) {
            return f5short;
        }
        return null;
    }

    /* renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static void m56(Object obj) {
        if (C0058.m9131() <= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۤ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m57(Object obj, Object obj2) {
        if (C0061.m9359() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Response m58(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۦۢۤۦ, reason: contains not printable characters */
    public static String m59(Object obj, Object obj2, Object obj3) {
        if (C0001.m1164() <= 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۤ۠ۡ, reason: contains not printable characters */
    public static JsonArray m60(Object obj, Object obj2) {
        if (C0043.m7332() >= 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m61(Object obj) {
        if (C0000.m1116() < 0) {
            ((Response) obj).close();
        }
    }

    /* renamed from: ۨۡۧۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m62(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    public final String b() {
        String[] strArrM6169 = C0036.m6169(this);
        return (strArrM6169 == null || strArrM6169.length < 1) ? C0007.m1840() : C0064.m9640(strArrM6169[0]);
    }

    public final String c(String str) {
        String strM8574;
        if (C0058.m9127(str, C0002.m1305(m55(), 936, 11, 1055)) || C0058.m9127(str, C0003.m1398(m55(), 947, 5, 345))) {
            if (C0058.m9127(str, C0006.m1774(m55(), 1048, 8, 1837))) {
                return C0000.m1077(m55(), 1056, 46, 2898);
            }
            strM8574 = C0054.m8574(m55(), 1102, 10, 1359);
        } else if (!C0058.m9127(str, C0063.m9585(m55(), 952, 4, 2139))) {
            strM8574 = C0008.m1970(m55(), 1033, 15, 3025);
        } else {
            if (C0058.m9127(str, C0032.m5708(m55(), 956, 11, 1063))) {
                return C0015.m3484(m55(), 967, 41, 2820);
            }
            strM8574 = C0058.m9127(str, C0006.m1774(m55(), 1008, 8, 2620)) ? C0050.m8131(m55(), 1016, 11, 417) : C0025.m4795(m55(), 1027, 6, 1227);
        }
        return C0050.m8125(str, strM8574);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r69, java.lang.String r70, boolean r71, java.util.HashMap<java.lang.String, java.lang.String> r72) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.ApplvDV2.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public final String d(String str, JSONObject jSONObject) {
        String strM1840 = C0007.m1840();
        if (jSONObject != null) {
            Iterator itM7553 = C0045.m7553(jSONObject);
            while (C0012.m2962(itM7553)) {
                String str2 = (String) C0048.m7949(itM7553);
                if (C0007.m1815(str2, C0028.m5109(m55(), 1559, 5, 3184)) || C0007.m1815(str2, C0031.m5565(m55(), 1564, 4, 3196)) || C0007.m1815(str2, C0041.m6779(m55(), 1568, 4, 2140)) || C0007.m1815(str2, C0029.m5256(m55(), 1572, 4, 1358))) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        C0018.m3933(sb, strM1840);
                        C0018.m3933(sb, C0060.m9352(m55(), 1576, 2, 1809));
                        C0018.m3933(sb, str2);
                        C0018.m3933(sb, C0020.m4199(m55(), 1578, 5, 2240));
                        C0018.m3933(sb, C0015.m3446(C0001.m1212(jSONObject, str2), C0041.m6779(m55(), 1583, 1, 669), C0018.m3917(m55(), 1584, 1, 842)));
                        C0018.m3933(sb, C0053.m8477(m55(), 1585, 1, 1011));
                        strM1840 = C0047.m7763(sb);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return C0058.m9127(str, C0009.m2037(m55(), 1586, 4, 1510)) ? C0065.m9804(strM1840, C0011.m2805(m55(), 1590, 32, 1310)) : (C0058.m9127(str, C0055.m8814(m55(), 1622, 11, 1996)) || C0058.m9127(str, C0030.m5362(m55(), 1633, 5, 3024))) ? strM1840 : C0021.m4340(m55(), 1638, 365, 1020);
    }

    public String detailContent(List<String> list) {
        String strM7718;
        String strM2300;
        ArrayList arrayList;
        ArrayList arrayList2;
        String strM7763;
        String str;
        HashMap map;
        StringBuilder sb;
        String str2;
        String str3;
        String strM5852 = C0033.m5852(m55(), 2003, 1, 1327);
        String strM9592 = C0063.m9592(this);
        StringBuilder sb2 = new StringBuilder();
        boolean zM9127 = C0058.m9127(strM9592, C0041.m6779(m55(), 2004, 11, 2226));
        String strM1840 = C0007.m1840();
        String strM4951 = C0026.m4951(m55(), 2015, 4, 474);
        String strM6188 = C0036.m6188(m55(), 2019, 5, 3052);
        if (zM9127 || C0058.m9127(strM9592, strM6188)) {
            if (C0058.m9127(strM9592, C0014.m3332(m55(), 2064, 8, 551))) {
                strM2300 = C0023.m4536(m55(), 2072, 53, 717);
            } else if (C0058.m9127(strM9592, C0044.m7509(m55(), 2125, 6, 992))) {
                strM2300 = C0010.m2300(m55(), 2131, 49, 1537);
            } else {
                strM7718 = C0046.m7718(m55(), 2180, 16, 2824);
                strM2300 = C0050.m8125(strM9592, strM7718);
            }
        } else if (C0058.m9127(strM9592, strM4951)) {
            strM7718 = C0058.m9127(strM9592, C0033.m5852(m55(), 2024, 8, 2647)) ? C0005.m1645(m55(), 2032, 17, 2914) : C0026.m4951(m55(), 2049, 15, 1563);
            strM2300 = C0050.m8125(strM9592, strM7718);
        } else {
            strM2300 = strM1840;
        }
        C0018.m3933(sb2, strM2300);
        C0018.m3933(sb2, (String) C0048.m7915(list, 0));
        String strM77632 = C0047.m7763(sb2);
        m40(strM77632);
        JSONObject jSONObject = new JSONObject(C0032.m5769(strM77632, C0049.m8036(strM77632)));
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String str4 = (String) C0048.m7915(list, 0);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean zM91272 = C0058.m9127(strM9592, C0015.m3484(m55(), 2196, 12, 1357));
        HashMap mapM3637 = C0017.m3637(this);
        String strM8574 = C0054.m8574(m55(), 2208, 9, 3144);
        String strM4199 = C0020.m4199(m55(), 2217, 1, 2307);
        String strM4795 = C0025.m4795(m55(), 2218, 4, 764);
        String strM1842 = C0007.m1842(m55(), 2222, 4, 984);
        String strM7509 = C0044.m7509(m55(), 2226, 19, 465);
        String str5 = strM5852;
        String strM1077 = C0000.m1077(m55(), 2245, 9, 2843);
        String strM49512 = C0026.m4951(m55(), 2254, 4, 1279);
        String strM7902 = C0048.m7902(m55(), 2258, 3, 1915);
        String strM3106 = C0013.m3106(m55(), 2261, 9, 2279);
        HashMap map2 = mapM3637;
        String strM3484 = C0015.m3484(m55(), 2270, 11, 3113);
        String str6 = strM8574;
        String strM6001 = C0034.m6001(m55(), 2281, 12, 1767);
        ArrayList arrayList5 = arrayList3;
        String strM8477 = C0053.m8477(m55(), 2293, 9, 1469);
        String str7 = strM4199;
        String strM1305 = C0002.m1305(m55(), 2302, 11, 2641);
        String str8 = strM7902;
        String strM7833 = C0047.m7833(m55(), 2313, 8, 2546);
        ArrayList arrayList6 = arrayList4;
        String strM4403 = C0022.m4403(m55(), 2321, 8, 3172);
        String str9 = strM4795;
        String strM10772 = C0000.m1077(m55(), 2329, 7, 903);
        String str10 = strM1842;
        String strM61882 = C0036.m6188(m55(), 2336, 8, 2494);
        String strM8814 = C0055.m8814(m55(), 2344, 6, 1164);
        if (zM91272) {
            JSONObject jSONObjectM1370 = C0003.m1370(jSONObject, strM49512);
            C0047.m7743(jSONObject3, strM8814, C0009.m2054(jSONObjectM1370, strM8814, str4));
            C0047.m7743(jSONObject3, strM10772, C0063.m9545(jSONObjectM1370, strM61882, jSONObject3, strM61882, strM10772));
            C0047.m7743(jSONObject3, strM4403, C0029.m5215(jSONObjectM1370, strM1077, jSONObject3, strM3106, strM4403));
            C0047.m7743(jSONObject3, strM7833, C0051.m8200(jSONObjectM1370, strM7833));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0036.m6189());
            C0018.m3933(sb3, C0051.m8200(jSONObjectM1370, strM1305));
            C0047.m7743(jSONObject3, strM1305, C0047.m7763(sb3));
            C0047.m7743(jSONObject3, strM6001, C0029.m5215(jSONObjectM1370, strM8477, jSONObject3, strM8477, strM6001));
            StringBuilder sb4 = new StringBuilder();
            C0018.m3933(sb4, C0055.m8703());
            C0018.m3933(sb4, C0051.m8200(jSONObjectM1370, strM3484));
            C0047.m7743(jSONObject3, strM3484, C0047.m7763(sb4));
            JSONArray jSONArrayM4333 = C0021.m4333(jSONObjectM1370, strM7509);
            int i = 0;
            while (i < C0053.m8396(jSONArrayM4333)) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                String str11 = str10;
                String strM9640 = C0064.m9640(C0051.m8200(jSONObjectM3923, str11));
                if (C0057.m8953(strM9640)) {
                    str3 = str9;
                    strM9640 = C0064.m9640(C0001.m1212(jSONObjectM3923, str3));
                } else {
                    str3 = str9;
                }
                C0058.m9127(strM9640, C0000.m1077(m55(), 2350, 4, 2884));
                StringBuilder sb5 = new StringBuilder();
                C0018.m3933(sb5, C0016.m3579());
                C0018.m3933(sb5, strM9640);
                ArrayList arrayList7 = arrayList6;
                C0004.m1532(arrayList7, C0047.m7763(sb5));
                String str12 = str8;
                String[] strArrM4752 = C0024.m4752(C0001.m1212(jSONObjectM3923, str12), C0061.m9361(m55(), 2354, 2, 341));
                String strM77633 = strM1840;
                int i2 = 0;
                while (i2 < strArrM4752.length) {
                    StringBuilder sbM5621 = C0031.m5621(strM77633);
                    C0018.m3933(sbM5621, strArrM4752[i2]);
                    String strM3332 = C0014.m3332(m55(), 2356, 1, 1990);
                    C0018.m3933(sbM5621, strM3332);
                    C0018.m3933(sbM5621, C0001.m1212(jSONObjectM1370, strM61882));
                    C0018.m3933(sbM5621, strM3332);
                    i2++;
                    C0036.m6177(sbM5621, i2);
                    C0018.m3933(sbM5621, str7);
                    strM77633 = C0047.m7763(sbM5621);
                }
                ArrayList arrayList8 = arrayList5;
                String str13 = str7;
                C0004.m1532(arrayList8, strM77633);
                String str14 = str6;
                String strM96402 = C0064.m9640(C0051.m8200(jSONObjectM3923, str14));
                HashMap map3 = map2;
                ArrayList arrayList9 = C0065.m9715(map3, strM9640) == null ? new ArrayList() : (ArrayList) C0065.m9715(map3, strM9640);
                if (!C0057.m8953(strM96402) && !C0041.m6838(arrayList9, strM96402)) {
                    C0004.m1532(arrayList9, strM96402);
                }
                i++;
                str10 = str11;
                str9 = str3;
                str8 = str12;
                arrayList6 = arrayList7;
                str6 = str14;
                arrayList5 = arrayList8;
                map2 = map3;
                str7 = str13;
            }
            arrayList2 = arrayList5;
            arrayList = arrayList6;
        } else {
            HashMap map4 = map2;
            String str15 = str6;
            ArrayList arrayList10 = arrayList5;
            String str16 = str8;
            ArrayList arrayList11 = arrayList6;
            String str17 = str9;
            String str18 = str10;
            if (C0058.m9127(strM9592, strM6188)) {
                JSONObject jSONObjectM13702 = C0003.m1370(C0003.m1370(jSONObject, strM49512), C0046.m7718(m55(), 2357, 8, 427));
                C0047.m7743(jSONObject3, strM8814, C0009.m2054(jSONObjectM13702, strM8814, str4));
                C0047.m7743(jSONObject3, strM10772, C0063.m9545(jSONObjectM13702, strM61882, jSONObject3, strM61882, strM10772));
                C0047.m7743(jSONObject3, strM4403, C0029.m5215(jSONObjectM13702, strM1077, jSONObject3, strM3106, strM4403));
                C0047.m7743(jSONObject3, strM1305, C0029.m5215(jSONObjectM13702, strM7833, jSONObject3, strM7833, strM1305));
                C0047.m7743(jSONObject3, strM6001, C0029.m5215(jSONObjectM13702, strM8477, jSONObject3, strM8477, strM6001));
                C0047.m7743(jSONObject3, strM3484, C0051.m8200(jSONObjectM13702, strM3484));
                JSONArray jSONArrayM43332 = C0021.m4333(jSONObjectM13702, strM7509);
                int i3 = 0;
                while (i3 < C0053.m8396(jSONArrayM43332)) {
                    JSONObject jSONObjectM39232 = C0018.m3923(jSONArrayM43332, i3);
                    String str19 = str18;
                    String strM96403 = C0064.m9640(C0051.m8200(jSONObjectM39232, str19));
                    if (C0057.m8953(strM96403)) {
                        str2 = str17;
                        strM96403 = C0064.m9640(C0001.m1212(jSONObjectM39232, str2));
                    } else {
                        str2 = str17;
                    }
                    ArrayList arrayList12 = arrayList11;
                    C0004.m1532(arrayList12, strM96403);
                    String str20 = str16;
                    ArrayList arrayList13 = arrayList10;
                    C0004.m1532(arrayList13, C0001.m1212(jSONObjectM39232, str20));
                    String str21 = str15;
                    String strM96404 = C0064.m9640(C0051.m8200(jSONObjectM39232, str21));
                    HashMap map5 = map4;
                    ArrayList arrayList14 = C0065.m9715(map5, strM96403) == null ? new ArrayList() : (ArrayList) C0065.m9715(map5, strM96403);
                    if (!C0057.m8953(strM96404) && !C0041.m6838(arrayList14, strM96404)) {
                        C0004.m1532(arrayList14, strM96404);
                    }
                    i3++;
                    str18 = str19;
                    str17 = str2;
                    arrayList11 = arrayList12;
                    str16 = str20;
                    str15 = str21;
                    arrayList10 = arrayList13;
                    map4 = map5;
                }
                arrayList2 = arrayList10;
                arrayList = arrayList11;
            } else {
                ArrayList arrayList15 = arrayList10;
                ArrayList arrayList16 = arrayList11;
                HashMap map6 = map4;
                String str22 = str16;
                if (C0058.m9127(strM9592, strM4951)) {
                    JSONObject jSONObjectM13703 = C0003.m1370(jSONObject, strM49512);
                    C0047.m7743(jSONObject3, strM8814, C0009.m2054(jSONObjectM13703, strM8814, str4));
                    C0047.m7743(jSONObject3, strM10772, C0063.m9545(jSONObjectM13703, strM61882, jSONObject3, strM61882, strM10772));
                    C0047.m7743(jSONObject3, strM4403, C0029.m5215(jSONObjectM13703, strM1077, jSONObject3, strM3106, strM4403));
                    C0047.m7743(jSONObject3, strM1305, C0029.m5215(jSONObjectM13703, strM7833, jSONObject3, strM7833, strM1305));
                    C0047.m7743(jSONObject3, strM6001, C0029.m5215(jSONObjectM13703, strM8477, jSONObject3, strM8477, strM6001));
                    C0047.m7743(jSONObject3, strM3484, C0051.m8200(jSONObjectM13703, strM3484));
                    JSONArray jSONArrayM43333 = C0021.m4333(jSONObjectM13703, C0010.m2300(m55(), 2365, 13, 2747));
                    int i4 = 0;
                    while (i4 < C0053.m8396(jSONArrayM43333)) {
                        JSONObject jSONObjectM39233 = C0018.m3923(jSONArrayM43333, i4);
                        String strM5109 = C0028.m5109(m55(), 2378, 11, 1446);
                        String strM96405 = C0064.m9640(C0051.m8200(C0003.m1370(jSONObjectM39233, strM5109), C0024.m4740(m55(), 2389, 4, 543)));
                        if (C0057.m8953(strM96405)) {
                            strM96405 = C0064.m9640(C0051.m8200(C0003.m1370(jSONObjectM39233, strM5109), C0054.m8574(m55(), 2393, 4, 3056)));
                        }
                        ArrayList arrayList17 = arrayList16;
                        C0004.m1532(arrayList17, strM96405);
                        String str23 = str22;
                        ArrayList arrayList18 = arrayList15;
                        C0004.m1532(arrayList18, C0001.m1212(jSONObjectM39233, str23));
                        try {
                            ArrayList arrayList19 = new ArrayList();
                            str = str5;
                            try {
                                String[] strArrM47522 = C0024.m4752(C0051.m8200(C0003.m1370(jSONObjectM39233, strM5109), C0049.m8007(m55(), 2397, 5, 431)), str);
                                String[] strArrM47523 = C0024.m4752(C0051.m8200(C0003.m1370(jSONObjectM39233, strM5109), C0049.m8007(m55(), 2402, 6, 1844)), str);
                                C0034.m6012(arrayList19, C0001.m1203(strArrM47522));
                                C0034.m6012(arrayList19, C0001.m1203(strArrM47523));
                                map = map6;
                            } catch (Exception e2) {
                                e = e2;
                                map = map6;
                                m56(e);
                                i4++;
                                map6 = map;
                                arrayList16 = arrayList17;
                                arrayList15 = arrayList18;
                                str5 = str;
                                str22 = str23;
                            }
                            try {
                                ArrayList arrayList20 = C0065.m9715(map, strM96405) == null ? new ArrayList() : (ArrayList) C0065.m9715(map, strM96405);
                                Iterator itM7816 = C0047.m7816(arrayList19);
                                while (C0012.m2962(itM7816)) {
                                    String strM77634 = (String) C0048.m7949(itM7816);
                                    boolean zM91273 = C0058.m9127(strM77634, C0046.m7718(m55(), 2408, 4, 611));
                                    Pattern patternM8145 = C0050.m8145();
                                    if (zM91273) {
                                        Matcher matcherM6026 = C0034.m6026(patternM8145, strM77634);
                                        if (C0003.m1405(matcherM6026)) {
                                            strM77634 = C0021.m4306(matcherM6026, 0);
                                        }
                                    } else if (C0058.m9127(strM77634, C0000.m1077(m55(), 2412, 2, 2340))) {
                                        Matcher matcherM60262 = C0034.m6026(patternM8145, strM77634);
                                        if (C0003.m1405(matcherM60262)) {
                                            sb = new StringBuilder();
                                            C0018.m3933(sb, C0027.m5062(m55(), 2414, 5, 2903));
                                            C0018.m3933(sb, C0021.m4306(matcherM60262, 0));
                                            strM77634 = C0047.m7763(sb);
                                        }
                                    } else {
                                        Matcher matcherM60263 = C0034.m6026(C0000.m1066(), strM9592);
                                        if (C0003.m1405(matcherM60263)) {
                                            Matcher matcherM60264 = C0034.m6026(patternM8145, strM9592);
                                            if (C0003.m1405(matcherM60264)) {
                                                sb = new StringBuilder();
                                                C0018.m3933(sb, C0021.m4306(matcherM60263, 0));
                                                C0018.m3933(sb, C0021.m4306(matcherM60264, 0));
                                                strM77634 = C0047.m7763(sb);
                                            }
                                        }
                                    }
                                    String strM96406 = C0064.m9640(C0015.m3446(strM77634, C0022.m4403(m55(), 2419, 2, 3008), C0012.m2973(m55(), 2421, 1, 1015)));
                                    if (!C0057.m8953(strM96406) && !C0041.m6838(arrayList20, strM96406)) {
                                        C0004.m1532(arrayList20, strM96406);
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                m56(e);
                                i4++;
                                map6 = map;
                                arrayList16 = arrayList17;
                                arrayList15 = arrayList18;
                                str5 = str;
                                str22 = str23;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str = str5;
                        }
                        i4++;
                        map6 = map;
                        arrayList16 = arrayList17;
                        arrayList15 = arrayList18;
                        str5 = str;
                        str22 = str23;
                    }
                    arrayList2 = arrayList15;
                    arrayList = arrayList16;
                } else {
                    String str24 = str22;
                    if (C0003.m1405(C0034.m6026(C0053.m8456(), strM9592))) {
                        C0047.m7743(jSONObject3, strM8814, C0009.m2054(jSONObject, strM8814, str4));
                        String strM47952 = C0025.m4795(m55(), 2422, 5, 445);
                        C0047.m7743(jSONObject3, strM10772, C0063.m9545(jSONObject, strM47952, jSONObject3, strM61882, C0049.m8007(m55(), 2427, 7, 1751)));
                        C0047.m7743(jSONObject3, strM3106, C0014.m3337(C0008.m1964(jSONObject, C0008.m1970(m55(), 2434, 4, 1709))));
                        C0047.m7743(jSONObject3, strM4403, C0051.m8200(jSONObject, C0002.m1305(m55(), 2438, 7, 1688)));
                        C0047.m7743(jSONObject3, strM7833, C0014.m3337(C0008.m1964(jSONObject, C0040.m6584(m55(), 2445, 4, 1052))));
                        C0047.m7743(jSONObject3, strM1305, C0051.m8200(jSONObject, C0013.m3106(m55(), 2449, 5, 719)));
                        C0047.m7743(jSONObject3, strM8477, C0014.m3337(C0008.m1964(jSONObject, C0058.m9106(m55(), 2454, 5, 1396))));
                        C0047.m7743(jSONObject3, strM6001, C0014.m3337(C0008.m1964(jSONObject, C0063.m9585(m55(), 2459, 8, 2522))));
                        C0047.m7743(jSONObject3, strM3484, C0051.m8200(jSONObject, C0041.m6779(m55(), 2467, 5, 1576)));
                        JSONObject jSONObjectM13704 = C0003.m1370(jSONObject, C0047.m7833(m55(), 2472, 9, 373));
                        Iterator itM7553 = C0045.m7553(jSONObjectM13704);
                        while (C0012.m2962(itM7553)) {
                            String str25 = (String) C0048.m7949(itM7553);
                            ArrayList arrayList21 = (ArrayList) C0065.m9715(map6, str25);
                            if (arrayList21 == null) {
                                arrayList21 = new ArrayList();
                                C0053.m8424(map6, str25, arrayList21);
                            }
                            JSONArray jSONArrayM43334 = C0021.m4333(jSONObjectM13704, str25);
                            ArrayList arrayList22 = new ArrayList();
                            int i5 = 0;
                            while (i5 < C0053.m8396(jSONArrayM43334)) {
                                JSONObject jSONObjectM39234 = C0018.m3923(jSONArrayM43334, i5);
                                String str26 = str24;
                                String strM1212 = C0001.m1212(jSONObjectM39234, str26);
                                String strM18422 = C0007.m1842(m55(), 2481, 4, 1922);
                                boolean zM91274 = C0058.m9127(strM1212, strM18422);
                                String strM1970 = C0008.m1970(m55(), 2485, 1, 2223);
                                if (zM91274) {
                                    int iM9178 = C0059.m9178(strM1212, strM18422) + 4;
                                    String strM96407 = C0064.m9640(C0054.m8636(strM1212, 0, iM9178));
                                    if (!C0057.m8953(strM96407) && !C0041.m6838(arrayList21, strM96407)) {
                                        C0004.m1532(arrayList21, strM96407);
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    C0018.m3933(sb6, C0001.m1212(jSONObjectM39234, strM47952));
                                    C0018.m3933(sb6, strM1970);
                                    C0018.m3933(sb6, C0064.m9640(C0056.m8890(strM1212, iM9178)));
                                    strM7763 = C0047.m7763(sb6);
                                } else {
                                    StringBuilder sb7 = new StringBuilder();
                                    C0018.m3933(sb7, C0001.m1212(jSONObjectM39234, strM47952));
                                    C0018.m3933(sb7, strM1970);
                                    C0018.m3933(sb7, strM1212);
                                    strM7763 = C0047.m7763(sb7);
                                }
                                C0004.m1532(arrayList22, strM7763);
                                i5++;
                                str24 = str26;
                            }
                            C0004.m1532(arrayList16, str25);
                            C0004.m1532(arrayList15, C0032.m5761(arrayList22, str7));
                        }
                    }
                    arrayList = arrayList16;
                    arrayList2 = arrayList15;
                }
            }
        }
        String strM9389 = C0062.m9389(m55(), 2486, 3, 2089);
        C0047.m7743(jSONObject3, C0017.m3646(m55(), 2489, 13, 1553), C0032.m5761(arrayList, strM9389));
        C0047.m7743(jSONObject3, C0008.m1970(m55(), 2502, 12, 1214), C0032.m5761(arrayList2, strM9389));
        JSONArray jSONArray = new JSONArray();
        C0044.m7459(jSONArray, jSONObject3);
        C0047.m7743(jSONObject2, C0038.m6452(m55(), 2514, 4, 1450), jSONArray);
        return C0004.m1539(jSONObject2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x031b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b3 A[PHI: r23
  0x02b3: PHI (r23v16 java.lang.String) = (r23v8 java.lang.String), (r23v9 java.lang.String), (r23v10 java.lang.String), (r23v17 java.lang.String) binds: [B:77:0x0317, B:73:0x02f9, B:69:0x02db, B:62:0x02b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03bb  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r83) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.ApplvDV2.homeContent(boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeVideoContent() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.ApplvDV2.homeVideoContent():java.lang.String");
    }

    public void init(Context context, String str) {
        try {
            this.c = C0024.m4752(str, C0018.m3917(m55(), 2912, 3, 2340));
            h hVar = new h(1);
            this.a = hVar;
            String[] strArrM6169 = C0036.m6169(this);
            hVar.b = strArrM6169[1];
            hVar.c = strArrM6169[2];
            hVar.d = strArrM6169[3];
            hVar.e = strArrM6169[4];
        } catch (Exception unused) {
        }
    }

    public boolean isVideoFormat(String str) {
        return C0015.m3436(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM6001;
        C0036.m6219();
        h hVarM8144 = C0050.m8144(this);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, (String) C0020.m4247(hVarM8144));
        C0018.m3933(sb, C0006.m1774(m55(), 2915, 31, 498));
        C0018.m3933(sb, (String) C0024.m4735(hVarM8144));
        C0018.m3933(sb, C0016.m3525(m55(), 2946, 8, 2371));
        C0018.m3933(sb, (String) C0062.m9424(hVarM8144));
        C0018.m3933(sb, C0054.m8574(m55(), 2954, 33, 1953));
        C0018.m3933(sb, (String) C0046.m7731(hVarM8144));
        String strM5769 = C0032.m5769(C0047.m7763(sb), null);
        String strM3646 = C0017.m3646(m55(), 2987, 1, 2799);
        String strM1840 = C0007.m1840();
        String strM4800 = C0025.m4800(strM5769, strM3646, strM1840);
        if (C0004.m1584(strM4800) > 16) {
            String strM8636 = C0054.m8636(strM4800, 0, 16);
            strM4800 = C0038.m6411(C0056.m8890(strM4800, 16), strM8636, strM8636);
        }
        Iterator itM62 = m62(m60(m42(m50(strM4800), C0031.m5565(m55(), 2988, 4, 3242)), C0055.m8814(m55(), 2992, 12, 2080)));
        while (true) {
            boolean zM2962 = C0012.m2962(itM62);
            strM6001 = C0034.m6001(m55(), 3004, 3, 2478);
            if (!zM2962) {
                break;
            }
            JsonObject jsonObjectM53 = m53((JsonElement) C0048.m7949(itM62));
            String strM59 = m59(jsonObjectM53, C0031.m5565(m55(), 3007, 4, 2536), strM1840);
            String strM1645 = C0005.m1645(m55(), 3011, 1, 1193);
            if (strM59 == strM1645 || (strM59 != null && C0058.m9103(strM59, strM1645))) {
                if (C0058.m9127(m59(jsonObjectM53, strM6001, strM1840), C0053.m8477(m55(), 3012, 4, 2172))) {
                    C0004.m1532(C0062.m9406(hVarM8144), m59(jsonObjectM53, strM6001, strM1840));
                }
            }
        }
        String[] strArrM4752 = C0024.m4752(str2, C0004.m1549(m55(), 3016, 1, 2681));
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String strM2827 = C0011.m2827(str3, (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1], (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2]);
        ArrayList arrayListM9406 = C0062.m9406(C0050.m8144(this));
        for (int i = 0; i < C0009.m2139(arrayListM9406); i++) {
            try {
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, (String) C0028.m5167(arrayListM9406, i));
                C0018.m3933(sb2, str3);
                strM1840 = m39(m57((JsonObject) m51(new Gson(), C0032.m5769(C0047.m7763(sb2), null), JsonObject.class), strM6001));
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, C0038.m6452(m55(), 3017, 46, 1325));
                C0018.m3933(sb3, C0053.m8464(strM1840));
                strM1840 = C0032.m5769(C0047.m7763(sb3), null);
            } catch (Exception unused) {
            }
        }
        g gVar = new g();
        C0017.m3667(gVar, strM1840);
        C0002.m1282(gVar, strM2827);
        C0057.m9029(gVar, C0038.m6454());
        return C0033.m5828(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x042e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String searchContent(java.lang.String r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.ApplvDV2.searchContent(java.lang.String, boolean):java.lang.String");
    }
}