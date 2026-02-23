package com.github.catvod.spider.merge.a0;

import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
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
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
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
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.github.catvod.spider.merge.a0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259u {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f730short = {1771, 1718, 1719, 1713, 2934, 2873, 2859, 2859, 1290, 1367, 1351, 1351, 1993, 1940, 1939, 1931, 2799, 2741, 2741, 2732, 2733, 2481, 2482, 2483, 316, 288, 288, 292, 295, 366, 379, 379, 291, 291, 291, 378, 357, 358, 359, 364, 354, 353, 378, 311, 315, 313, 379, 310, 379, 309, 292, 317, 379, 295, 316, 309, 294, 305, 379, 307, 305, 288, 363, 312, 317, 313, 317, 288, 361, 357, 356, 356, 370, 314, 305, 300, 288, 361, 377, 357, 370, 315, 294, 304, 305, 294, 278, 301, 361, 306, 317, 312, 305, 267, 314, 309, 313, 305, 370, 315, 294, 304, 305, 294, 272, 317, 294, 305, 311, 288, 317, 315, 314, 361, 309, 295, 311, 370, 295, 316, 309, 294, 305, 287, 305, 301, 361, 3261, 3275, 3322, 3305, 3326, 3317, 3311, 3293, 3314, 3319, 3326, 3282, 3327, 3238, 1022, 904, 953, 959, 957, 997, 1001, 1022, 957, 942, 957, 950, 940, 997, 944, 951, 949, 957, 916, 945, 939, 940, 926, 945, 948, 957, 1022, 951, 936, 957, 938, 953, 940, 957, 908, 929, 936, 957, 997, 1004, 2968, 2812, 2737, 2741, 2812, 1086, 1083, 1070, 1083, 1514, 1485, 1477, 1484, 1519, 1482, 1488, 1495, 795, 2616, 2581, 2588, 2569, 1917, 2312, 2408, 2320, 2366, 2338, 2333, 2359, 2362, 2364, 3193, 3139, 3152, 3151, 1586, 1539, 1558, 1552, 1769, 2220, 2179, 2182, 2191, 2211, 2190, 1639, 1608, 1613, 1604, 1647, 1600, 1612, 1604, 1468, 1468, 2854, 2849, 2879, 589, 591, 594, 581, 580, 541, 584, 591, 593, 541, 519, 2759, 2762, 2766, 2763, 2762, 2781, 504, 506, 487, 496, 497, 424, 480, 493, 489, 492, 493, 506, 424, 434, 1540, 1591, 1592, 1585, 1587, 2039, 2005, 2005, 2003, 1990, 1986, 682, 648, 648, 654, 667, 671, 710, 686, 645, 648, 644, 655, 642, 645, 652, 1452, 1422, 1422, 1416, 1437, 1433, 1472, 1441, 1420, 1411, 1418, 1432, 1420, 1418, 1416, 2379, 2407, 2407, 2403, 2401, 2413, 1622, 1643, 1648, 1662, 1648, 1655, 1622, 1633, 1634, 1633, 1654, 1633, 1654, 2341, 2323, 2325, 2395, 2357, 2334, 2395, 2339, 2327, 450, 500, 498, 444, 466, 505, 444, 452, 496, 444, 476, 510, 499, 504, 509, 500, 737, 727, 721, 671, 753, 730, 671, 743, 723, 671, 738, 734, 723, 710, 724, 733, 704, 735, 2501, 2547, 2549, 2491, 2512, 2547, 2530, 2549, 2558, 2491, 2514, 2547, 2533, 2530, 2550, 2496, 2502, 2440, 2531, 2496, 2513, 2502, 2509, 2440, 2536, 2506, 2497, 2496, 2898, 2916, 2914, 2860, 2887, 2916, 2933, 2914, 2921, 2860, 2898, 2920, 2933, 2916, 2363, 2333, 2315, 2332, 2371, 2351, 2313, 2315, 2304, 2330, 2367, 2401, 2343, 2410, 795, 837, 771, 846, 854, 771, 772, 794, 854, 854, 844, 3230, 1013, 388, 478, 473, 3000, 3043, 3048, 3002, 3058, 3044, 2977, 3059, 3070, 3063, 3042, 3002, 3057, 3054, 3043, 3042, 3048, 2977, 3058, 3061, 3051, 3002, 2978, 3060, 2977, 3055, 3042, 3046, 3043, 3042, 3061, 3002, 2978, 3060, 2598, 2680, 2622, 2675, 2667, 2599, 2594, 2597, 2606, 2667, 2726, 738, 700, 762, 695, 687, 767, 765, 736, 759, 758, 746, 747, 687, 739, 742, 737, 746, 687, 1274, 1248, 2794, 2758, 2759, 2781, 2764, 2759, 2781, 2692, 2813, 2768, 2777, 2764, 1033, 1071, 1081, 1070, 1137, 1053, 1083, 1081, 1074, 1064, 676, 646, 659, 640, 645, 645, 648, 710, 732, 711, 729, 713, 705, 677, 640, 647, 668, 657, 722, 713, 680, 647, 653, 667, 646, 640, 653, 713, 721, 711, 729, 711, 729, 722, 713, 698, 676, 708, 686, 720, 732, 732, 700, 713, 683, 668, 640, 645, 653, 710, 699, 728, 735, 679, 702, 704, 713, 680, 665, 665, 645, 652, 702, 652, 651, 674, 640, 669, 710, 732, 730, 734, 711, 730, 735, 713, 705, 674, 673, 701, 676, 677, 709, 713, 645, 640, 642, 652, 713, 686, 652, 650, 642, 646, 704, 713, 682, 641, 667, 646, 644, 652, 710, 728, 728, 735, 711, 729, 711, 729, 711, 729, 713, 676, 646, 651, 640, 645, 652, 713, 698, 648, 655, 648, 667, 640, 710, 732, 730, 734, 711, 730, 735, 1500, 1520, 1520, 1524, 1526, 1530, 1888, 1916, 1905, 1892, 1910, 1919, 1890, 1917, 904, 922, 925, 925, 940, 940, 1009, 906, 953, 942, 943, 949, 947, 946, 1588, 3211, 3244, 3240, 3259, 3244, 3259, 3305, 725, 737, 736, 764, 763, 742, 765, 750, 757, 736, 765, 763, 762, 2167, 2140, 2116, 2141, 2143, 2140, 2130, 2135, 2150, 2113, 2143, 2453, 2448, 2437, 2448, 1557, 1553, 1656, 1632, 1656, 1547, 1565, 2626, 2643, 2643, 2639, 2634, 2624, 2626, 2647, 2634, 2636, 2637, 2572, 2633, 2640, 2636, 2637, 3193, 3166, 3162, 3145, 3166, 3145, 3099, 3102, 3143, 3073, 3095, 3084, 3091, 3072, 3116, 3073, 3143, 3167, 3157, 3145, 3143, 3072, 3089, 3076, 3074, 3143, 3167, 3143, 492, 482, 492, 424, 423, 418, 427, 391, 426, 492, 500, 492, 1854, 1840, 1854, 1903, 1839, 1911, 1913, 1893, 1882, 1904, 1917, 1915, 1854, 1830, 1854, 2363, 2357, 2363, 2399, 2416, 2421, 2428, 2391, 2424, 2420, 2428, 2363, 2339, 2363, 1368, 1366, 1368, 1321, 1299, 1280, 1311, 1368, 1344, 1368, 1509, 1466, 2691, 2719, 2719, 2715, 2712, 2769, 2756, 2756, 2716, 2716, 2716, 2757, 2778, 2777, 2776, 2715, 2698, 2693, 2757, 2696, 2692, 2694, 2756, 2698, 2715, 2690, 2756, 2701, 2690, 2695, 2702, 2756, 2703, 2692, 2716, 2693, 2695, 2692, 2698, 2703, 2740, 2690, 2693, 2701, 2692, 1844, 1810, 1796, 1811, 1868, 1824, 1798, 1796, 1807, 1813, 1049, 1050, 1051, 1112, 1097, 1094, 1031, 1118, 1050, 1030, 1053, 1030, 1053, 1024, 1129, 1094, 1100, 1114, 1095, 1089, 1100, 1143, 1049, 1048, 1043, 1136, 1089, 1097, 1095, 1093, 1089, 1025, 632, 602, 602, 604, 585, 589, 532, 636, 599, 602, 598, 605, 592, 599, 606, 2014, 1987, 2000, 1993, 2250, 2278, 2279, 2301, 2284, 2279, 2301, 2212, 2269, 2288, 2297, 2284, 2961, 2949, 2948, 2968, 2975, 2946, 2969, 2954, 2961, 2948, 2969, 2975, 2974, 2966, 2954, 2959, 2972, 2955, 2954, 2960, 2966, 2967, 1829, 1802, 1792, 1814, 1803, 1805, 1792, 1851, 1877, 1876, 503, 500, 508, 498, 501, 494, 494, 498, 511, 554, 553, 559, 555, 553, 634, 
    551, 550, 556, 552, 637, 551, 550, 634, 552, 636, 637, 555, 632, 550, 551, 557, 634, 553, 555, 551, 551, 635, 553, 553, 554, 556, 1276, 1248, 1261, 1272, 1258, 1251, 1278, 1249, 697, 694, 700, 682, 695, 689, 700, 733, 732, 719, 720, 730, 732, 717, 704, 713, 732, 1233, 1156, 1226, 1217, 1224, 1223, 1223, 1228, 1221, 2951, 2950, 2950, 2945, 1107, 1106, 1089, 1118, 1108, 1106, 1113, 1110, 1114, 1106, 2825, 2872, 2864, 2878, 2876, 2872, 2923, 2878, 2930, 2915, 2915, 2878, 2917, 2934, 2913, 2912, 2938, 2940, 2941, 3081, 3093, 3086, 3093, 3086, 2357, 2340, 2340, 2425, 2338, 2353, 2342, 2343, 2365, 2363, 2362, 701, 690, 2996, 2997, 2982, 3001, 2995, 2997, 3005, 3007, 2996, 2997, 3004, -29301, -26703, 25548, 28679, 22825, 1580, 1613, 1614, 1615, -31347, 23388, 23364, -30634, 20890, 28131, 17965, -2137, -31908, -26266, 27931, 32464, 22526, 1735, 1755, 1755, 1759, 1756, 1685, 1664, 1664, 1752, 1752, 1752, 1665, 1694, 1693, 1692, 1687, 1689, 1690, 1665, 1740, 1728, 1730, 1664, 1741, 1664, 1742, 1759, 1734, 1664, 1753, 1734, 1739, 1738, 1728, 1664, 1759, 1731, 1742, 1750, 1664, 1734, 1729, 1737, 1728, 1680, 1738, 1755, 1742, 1736, 1682, 2483, 2534, 2556, 2543, 2544, 2472, 1815, 1879, 1859, 1886, 1884, 1804, 1792, 1815, 1858, 1881, 1872, 1859, 1876, 1914, 1876, 1864, 1804, 1636, 1577, 1581, 1636, 1114, 1119, 1098, 1119, 2718, 2689, 2700, 2701, 2695, 2743, 2712, 2692, 2697, 2705, 2743, 2689, 2694, 2702, 2695, 688, 695, 681, -31824, -26230, 28151, 32316, 22290, 2103, 2166, 2165, 2164, 2163, 2149, 2149, 2153, 2153, 2157, 2159, 2147, 17980, 29308, 2103, 2081, 2146, 2091, 2092, 2091, 2102, 2071, 2097, 2087, 2096, 2059, 2092, 2084, 2093, 2156, 2156, 2156, 1500, 1482, 1417, 1482, 1478, 1478, 1474, 1472, 1484, 1417, 1487, 1499, 1478, 1476, 1417, 1484, 1489, 1501, 1417, 1472, 1498, 1417, 1484, 1476, 1497, 1501, 1488, 1415, 1415, 1415, 2320, 1251, 1194, 1197, 1194, 1207, 1174, 1184, 1251, 1261, 1261, 1261, 2728, 2740, 2740, 2736, 2739, 2810, 2799, 2799, 2743, 2743, 2743, 2798, 2801, 2802, 2803, 2736, 2721, 2734, 2798, 2723, 2735, 2733, 2799, 2722, 2799, 2721, 2736, 2729, 2799, 2741, 2739, 2725, 2738, 2799, 2729, 2734, 2726, 2735, 771, 887, 840, 849, 771, 795, 839, 832, 845, 850, 836, 394, 384, 397, 395, 470, 23019, 816, 790, 768, 791, 840, 804, 770, 768, 779, 785, 626, 592, 581, 598, 595, 595, 606, 528, 522, 529, 527, 543, 535, 627, 598, 593, 586, 583, 516, 543, 638, 593, 603, 589, 592, 598, 603, 543, 519, 529, 527, 529, 527, 516, 543, 620, 626, 530, 632, 518, 522, 522, 618, 543, 637, 586, 598, 595, 603, 528, 621, 526, 521, 625, 616, 534, 543, 638, 591, 591, 595, 602, 616, 602, 605, 628, 598, 587, 528, 522, 524, 520, 529, 524, 521, 543, 535, 628, 631, 619, 626, 627, 531, 543, 595, 598, 596, 602, 543, 632, 602, 604, 596, 592, 534, 543, 636, 599, 589, 592, 594, 602, 528, 526, 526, 521, 529, 527, 529, 527, 529, 527, 543, 626, 592, 605, 598, 595, 602, 543, 620, 606, 601, 606, 589, 598, 528, 522, 524, 520, 529, 524, 521, 2240, 2279, 2275, 2288, 2279, 2288, 2210, 2391, 2403, 2402, 2430, 2425, 2404, 2431, 2412, 2423, 2402, 2431, 2425, 2424, 25964, 29757, 23827, 2491, 2530, 2480, 2465, 2482, 2483, 2469, 2530, 2554, 2544, 2540, 2530, 2485, 2482, 2476, 2530, 2554, 2530, 2530, 2540, 2530, 2477, 2483, 2471, 2530, 2554, 2530, 2545, 2546, 2547, -31514, 23095, 20721, 27784, 27606, 28394, 32699, 22165, -2356, -32201, -26483, 30382, 18413, 23520, -24668, 24014, -26611, 27760, -26483, 30382, 2530, 2540, 2530, 2469, 2482, 2482, 2445, 2483, 2471, 2530, 2554, 2530, 2545, 2546, 2547, -31514, 23095, 20721, 27784, 27606, 28394, 32699, 22165, -2356, -32201, -26483, 30382, 18413, 23520, -24668, 24014, -26611, 27760, -26483, 30382, 2530, 2493, 1831, 1809, 1798, 1794, 1821, 1815, 1809, 1824, 1821, 1815, 1823, 1809, 1792, 1870, 1727, 1710, 1710, 1714, 1719, 1725, 1727, 1706, 1719, 1713, 1712, 1777, 1716, 1709, 1713, 1712, 1454, 1527, 1457, 1447, 1468, 1443, 1456, 1436, 1457, 1527, 1519, 1509, 1529, 1527, 1456, 1441, 1460, 1458, 1527, 1519, 1527, 1527, 1529, 1527, 1459, 1468, 1465, 1456, 1435, 1460, 1464, 1456, 1527, 1519, 1527, 1469, 1463, 1441, 1443, 1527, 1529, 1527, 1445, 1460, 1447, 1456, 1467, 1441, 1427, 1468, 1465, 1456, 1436, 1457, 1527, 1519, 1509, 1529, 1527, 1446, 1468, 1455, 1456, 1527, 1519, 1509, 1529, 1527, 1441, 1452, 1445, 1456, 1527, 1519, 1508, 1529, 1527, 1457, 1440, 1445, 1465, 1468, 1462, 1460, 1441, 1456, 1527, 1519, 1508, 1529, 1527, 1435, 1466, 1441, 1415, 1456, 1440, 1446, 1456, 1527, 1519, 1509, 1529, 1527, 1456, 1443, 1456, 1467, 1441, 1527, 1519, 1527, 1467, 1456, 1442, 1430, 1447, 1456, 1460, 1441, 1456, 1427, 1466, 1465, 1457, 1456, 1447, 1527, 1529, 1527, 1466, 1445, 1456, 1447, 1460, 1441, 1456, 1409, 1452, 1445, 1456, 1527, 1519, 1508, 1529, 1527, 1415, 1456, 1444, 1440, 1456, 1446, 1441, 1414, 1466, 1440, 1447, 1462, 1456, 1527, 1519, 1509, 1448, 3136, 3164, 3164, 3160, 3163, 3090, 3079, 3079, 3167, 3167, 3167, 3078, 3097, 3098, 3099, 3160, 3145, 3142, 3078, 3147, 3143, 3141, 3079, 3146, 3079, 3145, 3160, 3137, 3079, 3150, 3137, 3140, 3149, 3079, 3165, 3160, 3140, 3143, 3145, 3148, 3191, 3162, 3149, 3161, 3165, 3149, 3163, 3164, 482, 452, 466, 453, 410, 502, 464, 466, 473, 451, 701, 671, 650, 665, 668, 668, 657, 735, 709, 734, 704, 720, 728, 679, 665, 670, 660, 671, 647, 643, 720, 702, 676, 720, 705, 704, 734, 704, 715, 720, 679, 703, 679, 710, 708, 715, 720, 648, 710, 708, 729, 720, 689, 640, 640, 668, 661, 679, 661, 658, 699, 665, 644, 735, 709, 707, 711, 734, 707, 710, 720, 728, 699, 696, 676, 701, 700, 732, 720, 668, 665, 667, 661, 720, 695, 661, 659, 667, 671, 729, 720, 691, 664, 642, 671, 669, 661, 735, 705, 707, 706, 734, 704, 734, 710, 711, 712, 712, 734, 711, 710, 720, 675, 657, 662, 657, 642, 665, 735, 709, 707, 711, 734, 707, 710, 1647, 1603, 1602, 1624, 
    1609, 1602, 1624, 1537, 1656, 1621, 1628, 1609, 2430, 2393, 2397, 2382, 2393, 2382, 2332, 2486, 2434, 2435, 2463, 2456, 2437, 2462, 2445, 2454, 2435, 2462, 2456, 2457, 593, 583, 577, 527, 577, 586, 527, 599, 579, 1451, 1479, 1510, 1533, 1446, 1480, 1440, 1483, 1531, 1512, 1511, 1517, 1451, 1458, 1535, 1460, 1451, 1457, 1451, 1445, 1449, 1451, 1482, 1505, 1531, 1510, 1508, 1504, 1532, 1508, 1451, 1458, 1535, 1460, 1451, 1464, 1466, 1467, 1451, 1445, 1449, 1451, 1486, 1510, 1510, 1518, 1509, 1516, 1449, 1482, 1505, 1531, 1510, 1508, 1516, 1451, 1458, 1535, 1460, 1451, 1464, 1466, 1467, 1451, 3318, 3271, 3271, 3226, 3297, 3282, 3269, 3268, 3294, 3288, 3289, 1524, 3118, 3122, 3135, 3114, 3128, 3121, 3116, 3123, 1424, 1410, 1413, 1225, 1228, 1241, 1228, 664, 703, 695, 702, 555, 516, 513, 520, 548, 521, -30081, 20215, 29856, 441, 442, 443, 32473, 30544, 457, 504, 504, 25571, 25159, 20228, 32636, 31113};
    public String a = C0007.m1840();
    public boolean b = true;
    public final com.github.catvod.spider.merge.K.a c;
    public ScheduledExecutorService d;
    public AlertDialog e;
    public String f;
    public boolean g;

    public C0259u() {
        new HashMap();
        C0001.m1203(new String[]{C0045.m7657(m7082(), 0, 4, 1733), C0005.m1645(m7082(), 4, 4, 2904), C0033.m5852(m7082(), 8, 4, 1316), C0033.m5852(m7082(), 12, 4, 2023), C0026.m4951(m7082(), 16, 5, 2753)});
        new HashMap();
        this.g = false;
        C0050.m8082();
        com.github.catvod.spider.merge.K.a aVar = (com.github.catvod.spider.merge.K.a) C0033.m5856(C0058.m9105(C0002.m1247(C0058.m9106(m7082(), 21, 3, 2432))), com.github.catvod.spider.merge.K.a.class);
        this.c = aVar == null ? new com.github.catvod.spider.merge.K.a() : aVar;
    }

    public static String c(String str, String str2) {
        return C0032.m5769(C0058.m9145(C0038.m6452(m7082(), 24, 103, 340), str, C0037.m6307(m7082(), 127, 14, 3227), str2, C0052.m8337(m7082(), 141, 40, 984)), null);
    }

    public static String d(String str) {
        String str2;
        String str3;
        Class<JsonObject> cls;
        String str4;
        String str5;
        String strM6194;
        Iterator it;
        String strM5823 = C0033.m5823(str, C0023.m4536(m7082(), 181, 1, 2984));
        String strM9389 = C0062.m9389(m7082(), 182, 4, 2782);
        boolean zM9127 = C0058.m9127(strM5823, strM9389);
        String strM1840 = C0007.m1840();
        if (!zM9127) {
            return strM1840;
        }
        ArrayList arrayList = new ArrayList();
        Class<JsonObject> cls2 = JsonObject.class;
        JsonObject jsonObject = (JsonObject) C0033.m5856(strM5823, cls2);
        String strM1305 = C0002.m1305(m7082(), 186, 4, 1114);
        if (!m7081(jsonObject, strM1305)) {
            return strM1840;
        }
        JsonObject jsonObjectM7091 = m7091(jsonObject, strM1305);
        String strM6551 = C0039.m6551(m7082(), 190, 8, 1443);
        Iterator itM7088 = m7088(m7080(jsonObjectM7091, strM6551));
        while (true) {
            boolean zM2962 = C0012.m2962(itM7088);
            String strM1549 = C0004.m1549(m7082(), 198, 1, 824);
            if (!zM2962) {
                return C0036.m6194(strM1549, arrayList);
            }
            JsonObject jsonObjectM7097 = m7097((JsonElement) C0048.m7949(itM7088));
            String strM8978 = C0057.m8978(m7082(), 199, 4, 2668);
            String strM7090 = m7090(m7092(jsonObjectM7097, strM8978));
            String strM7290 = C0043.m7290(m7082(), 203, 1, 1868);
            boolean zM91272 = C0058.m9127(strM7090, strM7290);
            String strM5062 = C0027.m5062(m7082(), 204, 9, 2395);
            String strM1189 = C0001.m1189(m7082(), 213, 4, 3114);
            String strM4951 = C0026.m4951(m7082(), 217, 4, 1655);
            Iterator it2 = itM7088;
            String strM6779 = C0041.m6779(m7082(), 221, 1, 1741);
            String str6 = strM1840;
            String strM9361 = C0061.m9361(m7082(), 222, 6, 2282);
            String strM1970 = C0008.m1970(m7082(), 228, 8, 1569);
            String str7 = strM6551;
            String strM4107 = C0019.m4107(m7082(), 236, 2, 1431);
            if (zM91272 || !C0003.m1392(m7090(m7092(jsonObjectM7097, strM1970)))) {
                str2 = strM1305;
            } else {
                StringBuilder sb = new StringBuilder();
                str2 = strM1305;
                C0018.m3933(sb, m7090(m7092(jsonObjectM7097, strM1970)));
                C0018.m3933(sb, strM6779);
                C0018.m3933(sb, m7090(m7092(jsonObjectM7097, strM1970)));
                C0018.m3933(sb, strM4107);
                C0018.m3933(sb, str);
                C0018.m3933(sb, strM4107);
                C0018.m3933(sb, m7090(m7092(jsonObjectM7097, strM9361)));
                C0018.m3933(sb, strM4107);
                C0018.m3933(sb, m7090(m7092(jsonObjectM7097, strM4951)));
                C0018.m3933(sb, strM4107);
                C0018.m3933(sb, m7090(m7092(jsonObjectM7097, strM1189)));
                C0018.m3933(sb, strM4107);
                C0018.m3933(sb, m7090(m7092(jsonObjectM7097, strM5062)));
                C0004.m1532(arrayList, C0047.m7763(sb));
            }
            if (C0058.m9127(m7090(m7092(jsonObjectM7097, strM8978)), strM7290)) {
                String strM58232 = C0033.m5823(str, m7090(m7092(jsonObjectM7097, strM9361)));
                if (C0058.m9127(strM58232, strM9389)) {
                    ArrayList arrayList2 = new ArrayList();
                    JsonObject jsonObject2 = (JsonObject) C0033.m5856(strM58232, cls2);
                    str4 = str2;
                    if (m7081(jsonObject2, str4)) {
                        str3 = strM9389;
                        String str8 = str7;
                        Iterator itM70882 = m7088(m7080(m7091(jsonObject2, str4), str8));
                        while (C0012.m2962(itM70882)) {
                            String str9 = str8;
                            JsonObject jsonObjectM70972 = m7097((JsonElement) C0048.m7949(itM70882));
                            Class<JsonObject> cls3 = cls2;
                            if (C0058.m9127(m7090(m7092(jsonObjectM70972, strM8978)), strM7290) || !C0003.m1392(m7090(m7092(jsonObjectM70972, strM1970)))) {
                                it = itM70882;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                it = itM70882;
                                C0018.m3933(sb2, m7090(m7092(jsonObjectM70972, strM1970)));
                                C0018.m3933(sb2, strM6779);
                                C0018.m3933(sb2, m7090(m7092(jsonObjectM70972, strM1970)));
                                C0018.m3933(sb2, strM4107);
                                C0018.m3933(sb2, str);
                                C0018.m3933(sb2, strM4107);
                                C0018.m3933(sb2, m7090(m7092(jsonObjectM70972, strM9361)));
                                C0018.m3933(sb2, strM4107);
                                C0018.m3933(sb2, m7090(m7092(jsonObjectM70972, strM4951)));
                                C0018.m3933(sb2, strM4107);
                                C0018.m3933(sb2, m7090(m7092(jsonObjectM70972, strM1189)));
                                C0018.m3933(sb2, strM4107);
                                C0018.m3933(sb2, m7090(m7092(jsonObjectM70972, strM5062)));
                                C0004.m1532(arrayList2, C0047.m7763(sb2));
                            }
                            str8 = str9;
                            cls2 = cls3;
                            itM70882 = it;
                        }
                        str5 = str8;
                        cls = cls2;
                        strM6194 = C0036.m6194(strM1549, arrayList2);
                    } else {
                        str3 = strM9389;
                        cls = cls2;
                        str5 = str7;
                        strM6194 = str6;
                    }
                } else {
                    str3 = strM9389;
                    cls = cls2;
                    strM6194 = str6;
                    str4 = str2;
                    str5 = str7;
                }
                C0004.m1532(arrayList, strM6194);
            } else {
                str3 = strM9389;
                cls = cls2;
                str4 = str2;
                str5 = str7;
            }
            strM1305 = str4;
            itM7088 = it2;
            strM1840 = str6;
            strM9389 = str3;
            strM6551 = str5;
            cls2 = cls;
        }
    }

    public static Object[] j(Map map) {
        int i = 1;
        String strM2083 = C0009.m2083((String) C0062.m9431(map, C0039.m6551(m7082(), 238, 3, 2899)));
        m7087(C0050.m8125(C0057.m8978(m7082(), 241, 11, 573), strM2083));
        String strM3646 = C0017.m3646(m7082(), 252, 6, 2735);
        m7087(C0050.m8125(C0032.m5708(m7082(), 258, 14, 392), C0009.m2083((String) C0062.m9431(map, strM3646))));
        Object map2 = (Map) m7077(new Gson(), C0009.m2083((String) C0062.m9431(map, strM3646)), Map.class);
        if (map2 == null) {
            map2 = new HashMap();
        }
        String[] strArr = {C0002.m1305(m7082(), 272, 5, 1622), C0029.m5256(m7082(), 277, 6, 1974), C0015.m3484(m7082(), 283, 15, 747), C0043.m7290(m7082(), 298, 15, 1517), C0041.m6779(m7082(), 313, 6, 2312), C0003.m1398(m7082(), 319, 6, 1561), C0063.m9585(m7082(), 325, 7, 1540), C0016.m3525(m7082(), 332, 9, 2422), C0041.m6779(m7082(), 341, 16, 401), C0065.m9775(m7082(), 357, 18, 690), C0062.m9389(m7082(), 375, 14, 2454), C0029.m5256(m7082(), 389, 14, 2469), C0046.m7718(m7082(), 403, 14, 2817), C0039.m6551(m7082(), 417, 10, 2414)};
        ArrayList arrayList = new ArrayList(14);
        for (int i2 = 0; i2 < 14; i2++) {
            String str = strArr[i2];
            C0047.m7777(str);
            C0004.m1532(arrayList, str);
        }
        List listM5209 = C0029.m5209(arrayList);
        Iterator itM5199 = C0029.m5199(C0026.m4887(map));
        while (C0012.m2962(itM5199)) {
            String str2 = (String) C0048.m7949(itM5199);
            Iterator itM3109 = C0013.m3109(listM5209);
            while (C0012.m2962(itM3109)) {
                if (C0007.m1815(C0023.m4587((String) C0048.m7949(itM3109)), C0023.m4587(str2))) {
                    C0006.m1755(map2, str2, C0062.m9431(map, str2));
                }
            }
        }
        if (!C0058.m9127(C0004.m1522(strM2083), C0038.m6452(m7082(), 427, 4, 2386))) {
            return C0057.m8993(strM2083, map2);
        }
        m7087(C0050.m8125(C0014.m3332(m7082(), 431, 11, 886), strM2083));
        com.github.catvod.spider.merge.Z.d dVarM1803 = C0007.m1803(strM2083, new HashMap(), map2);
        String strM2029 = C0008.m2029(dVarM1803);
        String strM9361 = C0061.m9361(m7082(), 442, 1, 3220);
        String[] strArrM4752 = C0024.m4752(strM2029, strM9361);
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String strM5362 = C0030.m5362(m7082(), 443, 1, 986);
        C0018.m3933(sb, C0054.m8636(strM2083, 0, C0002.m1279(strM2083, strM5362)));
        C0018.m3933(sb, strM5362);
        String strM7763 = C0047.m7763(sb);
        int length = strArrM4752.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str3 = strArrM4752[i3];
            if (C0058.m9127(str3, C0000.m1077(m7082(), 444, 3, 426))) {
                i4 += i;
                String strM9804 = C0065.m9804(strM7763, str3);
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0051.m8217());
                C0018.m3933(sb2, C0018.m3917(m7082(), 447, 34, 2951));
                String strM1327 = C0002.m1327(C0047.m7763(sb2), new Object[]{C0050.m8153(C0012.m3018(strM9804, C0002.m1270())), C0050.m8153(C0012.m3018(C0041.m6815(map2), C0002.m1270()))});
                StringBuilder sb3 = new StringBuilder(C0057.m8978(m7082(), 481, 10, 2635));
                C0036.m6177(sb3, i4);
                C0018.m3933(sb3, C0047.m7833(m7082(), 491, 1, 2716));
                C0018.m3933(sb3, str3);
                m7087(C0047.m7763(sb3));
                StringBuilder sb4 = new StringBuilder(C0032.m5708(m7082(), 492, 18, 655));
                C0036.m6177(sb4, i4);
                C0018.m3933(sb4, C0019.m4107(m7082(), 510, 2, 1242));
                C0018.m3933(sb4, strM1327);
                m7087(C0047.m7763(sb4));
                str3 = strM1327;
            }
            C0004.m1532(arrayList2, str3);
            i3++;
            i = 1;
        }
        String strM6194 = C0036.m6194(strM9361, arrayList2);
        String strM3917 = C0018.m3917(m7082(), 512, 12, 2729);
        Map mapM6192 = C0036.m6192(dVarM1803);
        String str4 = (String) C0048.m7915((List) C0062.m9431(mapM6192, strM3917), 0);
        HashMap map3 = new HashMap();
        Iterator itM51992 = C0029.m5199(C0026.m4887(mapM6192));
        while (C0012.m2962(itM51992)) {
            String str5 = (String) C0048.m7949(itM51992);
            C0053.m8424(map3, str5, (String) C0048.m7915((List) C0062.m9431(mapM6192, str5), 0));
        }
        return new Object[]{C0011.m2808(C0057.m9021(dVarM1803)), str4, new ByteArrayInputStream(C0012.m3018(strM6194, C0002.m1270())), map3};
    }

    /* renamed from: ۟۠ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m7077(Object obj, Object obj2, Object obj3) {
        if (C0006.m1726() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۢۥۦ, reason: not valid java name and contains not printable characters */
    public static Request m7078(Object obj) {
        if (C0036.m6252() > 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7079(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() < 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static JsonArray m7080(Object obj, Object obj2) {
        if (C0012.m3024() > 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7081(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۡۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7082() {
        if (C0002.m1242() > 0) {
            return f730short;
        }
        return null;
    }

    /* renamed from: ۟ۧۢ۟۟, reason: not valid java name and contains not printable characters */
    public static Request m7083(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0058.m9131() <= 0) {
            return com.github.catvod.spider.merge.B0.a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۤ۠, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7084(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7085(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m7086(Object obj) {
        if (C0028.m5152() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۠ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7087(Object obj) {
        if (C0013.m3167() > 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۡۦۡ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m7088(Object obj) {
        if (C0030.m5375() > 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۢۡۧۤ, reason: not valid java name and contains not printable characters */
    public static RequestBody m7089(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static String m7090(Object obj) {
        if (C0033.m5872() > 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m7091(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۨۡ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m7092(Object obj, Object obj2) {
        if (C0053.m8389() > 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧ۠۟۟, reason: not valid java name and contains not printable characters */
    public static Call m7093(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۧۦۣۥ, reason: not valid java name and contains not printable characters */
    public static String m7094(Object obj) {
        if (C0017.m3633() < 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۨ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static MediaType m7095(Object obj) {
        if (C0032.m5686() <= 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Response m7096(Object obj) {
        if (C0035.m6140() < 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۨۧۨۢ, reason: not valid java name and contains not printable characters */
    public static JsonObject m7097(Object obj) {
        if (C0023.m4566() < 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    public final void a() {
        try {
            AlertDialog alertDialogM1792 = C0006.m1792(this);
            if (alertDialogM1792 != null) {
                C0004.m1577(alertDialogM1792);
            }
        } catch (Exception unused) {
        }
    }

    public final HashMap b() {
        HashMap mapM4251 = C0020.m4251(C0014.m3332(m7082(), 524, 10, 1116), C0000.m1077(m7082(), 534, 133, 745));
        C0053.m8424(mapM4251, C0007.m1842(m7082(), 667, 6, 1439), C0040.m6680(this));
        C0053.m8424(mapM4251, C0053.m8477(m7082(), 673, 8, 1808), C0021.m4340(m7082(), 681, 3, 1023));
        C0053.m8424(mapM4251, C0005.m1645(m7082(), 684, 11, 988), C0000.m1077(m7082(), 695, 1, 1543));
        StringBuilder sb = new StringBuilder(C0028.m5109(m7082(), 696, 7, 3273));
        C0018.m3933(sb, C0040.m6680(this));
        C0053.m8424(mapM4251, C0048.m7902(m7082(), 703, 13, 660), C0047.m7763(sb));
        return mapM4251;
    }

    public final String e(String str, String str2, String str3, String str4, String str5) {
        String strM4107 = C0019.m4107(m7082(), 716, 11, 2099);
        String strM4795 = C0025.m4795(m7082(), 727, 4, 2545);
        String strM7902 = C0048.m7902(m7082(), 731, 7, 1624);
        String strM1398 = C0003.m1398(m7082(), 738, 16, 2595);
        String strM6001 = C0034.m6001(m7082(), 754, 7, 3131);
        String strM3484 = C0015.m3484(m7082(), 761, 21, 3173);
        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            MediaType mediaTypeM7095 = m7095(strM1398);
            StringBuilder sb = new StringBuilder(strM3484);
            C0018.m3933(sb, str);
            C0018.m3933(sb, C0041.m6779(m7082(), 782, 12, 462));
            C0018.m3933(sb, str2);
            C0018.m3933(sb, C0029.m5256(m7082(), 794, 15, 1820));
            C0018.m3933(sb, str5);
            C0018.m3933(sb, C0050.m8131(m7082(), 809, 14, 2329));
            C0018.m3933(sb, str3);
            C0018.m3933(sb, C0026.m4951(m7082(), 823, 10, 1402));
            C0018.m3933(sb, str4);
            C0018.m3933(sb, C0016.m3525(m7082(), 833, 2, 1479));
            Request.Builder builderM7079 = m7079(m7079(m7079(m7084(m7085(new Request.Builder(), C0000.m1077(m7082(), 835, 45, 2795)), m7089(mediaTypeM7095, C0047.m7763(sb))), C0035.m6131(m7082(), 880, 10, 1889), C0042.m7151(m7082(), 890, 32, 1064)), C0017.m3646(m7082(), 922, 15, 569), C0051.m8259(m7082(), 937, 4, 1977)), C0021.m4340(m7082(), 941, 12, 2185), strM1398);
            String strM8007 = C0049.m8007(m7082(), 953, 13, 3056);
            StringBuilder sb2 = new StringBuilder(strM6001);
            C0018.m3933(sb2, C0040.m6680(this));
            JsonObject jsonObject = (JsonObject) m7077(new Gson(), m7094(m7086(m7096(m7093(okHttpClient, m7078(m7079(m7079(m7079(m7079(m7079(m7079(m7079(m7079(m7079(m7079(builderM7079, strM8007, C0047.m7763(sb2)), C0034.m6001(m7082(), 966, 9, 3065), C0041.m6779(m7082(), 975, 10, 1892)), C0003.m1398(m7082(), 985, 9, 411), C0016.m3525(m7082(), 994, 32, 542)), C0061.m9361(m7082(), 1026, 8, 1164), C0048.m7902(m7082(), 1034, 7, 728)), C0007.m1842(m7082(), 1041, 10, 697), strM7902), C0050.m8131(m7082(), 1051, 9, 1193), C0054.m8574(m7082(), 1060, 4, 2998)), C0010.m2300(m7082(), 1064, 10, 1079), C0042.m7151(m7082(), 1074, 6, 2897)), C0046.m7718(m7082(), 1080, 13, 2835), C0051.m8259(m7082(), 1093, 5, 3131)), C0027.m5062(m7082(), 1098, 11, 2388), C0009.m2037(m7082(), 1109, 2, 650)), C0019.m4107(m7082(), 1111, 11, 3024), strM7902)))))), JsonObject.class);
            if (!C0057.m8953(m7090(m7092(m7091(jsonObject, strM4795), strM4107)))) {
                return m7090(m7092(m7091(jsonObject, strM4795), strM4107));
            }
        } catch (Exception unused) {
            C0038.m6402(C0004.m1549(m7082(), 1122, 9, 1660));
        }
        C0038.m6402(C0015.m3484(m7082(), 1131, 13, 2219));
        return C0007.m1840();
    }

    public final String f(String str, String str2, String str3) {
        StringBuilder sbM8368 = C0052.m8368(C0034.m6001(m7082(), 1144, 50, 1711), str2, C0043.m7290(m7082(), 1194, 6, 2453), str3, C0054.m8574(m7082(), 1200, 17, 1841));
        C0018.m3933(sbM8368, str);
        String strM5769 = C0032.m5769(C0047.m7763(sbM8368), C0040.m6609(this));
        boolean zM9127 = C0058.m9127(strM5769, C0029.m5256(m7082(), 1217, 4, 1606));
        String strM1840 = C0007.m1840();
        if (!zM9127) {
            return strM1840;
        }
        new ArrayList();
        Iterator itM7088 = m7088(m7080(m7091((JsonObject) m7077(new Gson(), strM5769, JsonObject.class), C0036.m6188(m7082(), 1221, 4, 1086)), C0027.m5062(m7082(), 1225, 15, 2792)));
        while (C0012.m2962(itM7088)) {
            strM1840 = m7090(m7092(m7097((JsonElement) C0048.m7949(itM7088)), C0056.m8911(m7082(), 1240, 3, 709)));
            if (!C0057.m8953(strM1840)) {
                break;
            }
        }
        if (C0057.m8953(strM1840)) {
            C0038.m6402(C0020.m4199(m7082(), 1243, 9, 2119));
        }
        return strM1840;
    }

    public final void g() {
        int i = 0;
        String strM4740 = C0024.m4740(m7082(), 1252, 10, 2054);
        com.github.catvod.spider.merge.K.a aVarM8057 = C0049.m8057(this);
        try {
            try {
                m7087(C0062.m9389(m7082(), 1262, 18, 2114));
                if (C0048.m7937(new CharSequence[]{C0040.m6680(this)})) {
                    m7087(C0018.m3917(m7082(), 1280, 30, 1449));
                    this.a = C0049.m8065(C0054.m8549(aVarM8057));
                }
                if (C0040.m6623(new CharSequence[]{C0040.m6680(this)}) && C0058.m9127(C0040.m6680(this), C0042.m7151(m7082(), 1310, 1, 2366))) {
                    m7087(C0027.m5062(m7082(), 1311, 11, 1219));
                    this.g = false;
                    C0050.m8132(this);
                    C0012.m3026(aVarM8057, new com.github.catvod.spider.merge.K.b(C0040.m6680(this)));
                    while (C0057.m8953(C0049.m8065(C0054.m8549(aVarM8057)))) {
                        C0060.m9274(250L);
                    }
                    return;
                }
                if (C0048.m7937(new CharSequence[]{C0040.m6680(this)}) && C0048.m7937(new CharSequence[]{C0045.m7650(this)})) {
                    m7087(strM4740);
                    throw new RuntimeException(strM4740);
                }
                String strM7650 = C0045.m7650(this);
                this.a = strM7650;
                C0012.m3026(aVarM8057, new com.github.catvod.spider.merge.K.b(strM7650));
                if (C0057.m8953(C0049.m8065(C0054.m8549(aVarM8057)))) {
                    throw new Exception(C0040.m6680(this));
                }
                C0050.m8132(this);
                while (C0057.m8953(C0049.m8065(C0054.m8549(aVarM8057)))) {
                    C0060.m9274(250L);
                }
            } catch (Exception e) {
                C0029.m5218(C0054.m8549(aVarM8057));
                C0049.m7975(e);
                C0065.m9798(this);
                C0016.m3575(new RunnableC0256q(this, i));
                while (C0057.m8953(C0049.m8065(C0054.m8549(aVarM8057)))) {
                    C0060.m9274(250L);
                }
            }
        } catch (Throwable th) {
            while (C0057.m8953(C0049.m8065(C0054.m8549(aVarM8057)))) {
                C0060.m9274(250L);
            }
            throw th;
        }
    }

    public final void h() {
        try {
            if (C0015.m3507(this)) {
                C0063.m9586(this);
                this.b = false;
            }
            C0058.m9127(C0008.m2029(C0007.m1803(C0050.m8131(m7082(), 1322, 38, 2752), new HashMap(), C0040.m6609(this))), C0026.m4951(m7082(), 1360, 11, 801));
        } catch (Exception unused) {
        }
    }

    public final String i(String str, String[] strArr) {
        try {
            StringBuilder sb = new StringBuilder(C0045.m7657(m7082(), 1371, 5, 492));
            C0018.m3933(sb, str);
            m7087(C0047.m7763(sb));
            String str2 = strArr[1];
            String str3 = strArr[2];
            String str4 = strArr[3];
            String str5 = strArr[4];
            String str6 = strArr[5];
            String str7 = strArr[0];
            String strM2827 = C0011.m2827(str2, C0002.m1316(C0035.m6110()), str7);
            if (C0058.m9127(str, C0022.m4403(m7082(), 1376, 1, 2676))) {
                String strM3698 = C0017.m3698(this, str4, str3, str7, str5, str6);
                com.github.catvod.spider.merge.E.g gVar = new com.github.catvod.spider.merge.E.g();
                C0017.m3667(gVar, strM3698);
                C0002.m1282(gVar, strM2827);
                return C0033.m5828(gVar);
            }
            String strM4810 = C0025.m4810(this, str2, str4, str5);
            HashMap map = new HashMap();
            C0053.m8424(map, C0036.m6188(m7082(), 1377, 10, 869), C0061.m9361(m7082(), 1387, 133, 575));
            StringBuilder sb2 = new StringBuilder(C0038.m6452(m7082(), 1520, 7, 2178));
            C0018.m3933(sb2, C0040.m6680(this));
            C0053.m8424(map, C0064.m9599(m7082(), 1527, 13, 2326), C0047.m7763(sb2));
            if (C0057.m8953(strM4810)) {
                throw new RuntimeException(C0064.m9599(m7082(), 1540, 3, 582));
            }
            com.github.catvod.spider.merge.E.g gVar2 = new com.github.catvod.spider.merge.E.g();
            C0017.m3667(gVar2, strM4810);
            C0002.m1282(gVar2, strM2827);
            return C0033.m5828(gVar2);
        } catch (Exception unused) {
            return C0049.m8007(m7082(), 1543, 87, 2496);
        }
    }

    public final void k(String str) {
        this.f = str;
        String strM8007 = C0049.m8007(m7082(), 1630, 14, 1908);
        StringBuilder sb = new StringBuilder(strM8007);
        C0018.m3933(sb, str);
        m7087(C0047.m7763(sb));
        StringBuilder sb2 = new StringBuilder(strM8007);
        C0018.m3933(sb2, str);
        C0038.m6402(C0047.m7763(sb2));
        C0022.m4462(this);
        C0065.m9798(this);
    }

    public final void l() {
        OkHttpClient okHttpClient = new OkHttpClient();
        String strM2037 = C0009.m2037(m7082(), 1644, 16, 1758);
        Request.Builder builderM7079 = m7079(m7079(m7084(m7085(new Request.Builder(), C0035.m6131(m7082(), 1823, 48, 3112)), m7089(m7095(strM2037), C0051.m8259(m7082(), 1660, 163, 1493))), C0017.m3646(m7082(), 1871, 10, 439), C0036.m6188(m7082(), 1881, 115, 752)), C0031.m5565(m7082(), 1996, 12, 1580), strM2037);
        StringBuilder sb = new StringBuilder(C0004.m1549(m7082(), 2008, 7, 2364));
        C0018.m3933(sb, C0040.m6680(this));
        m7090(m7092(m7091(m7091((JsonObject) C0033.m5856(m7094(m7086(m7096(m7093(okHttpClient, m7083(m7079(m7079(builderM7079, C0045.m7657(m7082(), 2015, 13, 2551), C0047.m7763(sb)), C0021.m4340(m7082(), 2028, 9, 546), C0012.m2973(m7082(), 2037, 64, 1417)), C0063.m9585(m7082(), 2101, 11, 3255), C0001.m1189(m7082(), 2112, 1, 1479), C0020.m4199(m7082(), 2113, 8, 3166), C0053.m8477(m7082(), 2121, 3, 1511)))))), JsonObject.class), C0023.m4536(m7082(), 2124, 4, 1197)), C0047.m7833(m7082(), 2128, 4, 721)), C0035.m6131(m7082(), 2132, 6, 621)));
    }

    public final void m(String str) {
        try {
            int iM3103 = C0013.m3103(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM3103, iM3103);
            ImageView imageView = new ImageView(C0031.m5652());
            C0028.m5147(imageView, C0046.m7662());
            C0022.m4421(imageView, C0008.m2002(iM3103, str));
            FrameLayout frameLayout = new FrameLayout(C0031.m5652());
            layoutParams.gravity = 17;
            C0041.m6790(frameLayout, imageView, layoutParams);
            if (C0054.m8632() >= 17) {
                this.e = C0019.m4124(C0027.m5084(C0039.m6476(C0047.m7848(new AlertDialog.Builder(C0022.m4453()), frameLayout), new DialogInterfaceOnCancelListenerC0242c(2, this)), new DialogInterfaceOnDismissListenerC0243d(2, this)));
            }
            Window windowM1119 = C0000.m1119(C0006.m1792(this));
            C0047.m7777(windowM1119);
            C0035.m6135(windowM1119, new ColorDrawable(0));
            C0038.m6402(C0046.m7718(m7082(), 2138, 16, 392));
            this.g = false;
        } catch (Exception unused) {
        }
    }

    public final void n() {
        ScheduledExecutorService scheduledExecutorServiceM9723 = C0065.m9723(this);
        if (scheduledExecutorServiceM9723 != null) {
            C0009.m2093(scheduledExecutorServiceM9723);
        }
        C0016.m3575(new RunnableC0256q(this, 1));
    }
}