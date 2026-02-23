package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B0.a;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
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
import com.github.catvod.spider.merge.Z.d;
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
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBgetappapi extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f42short = {1813, 1796, 1796, 1813, 1796, 1821, 27989, 24587, 984, 1023, 995, 996, 1880, 1883, 1880, 1863, 1883, 1881, 1885, 1863, 1883, 1884, 1880, 1863, 1886, 1881, 1875, 1882, 1882, 1883, 1883, 1652, 1618, 1604, 1619, 1548, 1632, 1606, 1604, 1615, 1621, 559, 525, 536, 523, 526, 526, 515, 589, 599, 588, 594, 578, 586, 558, 523, 524, 535, 538, 601, 578, 547, 524, 518, 528, 525, 523, 518, 578, 595, 593, 601, 578, 562, 523, 538, 519, 526, 578, 602, 587, 578, 547, 530, 530, 526, 519, 565, 519, 512, 553, 523, 534, 589, 599, 593, 597, 588, 593, 596, 578, 586, 553, 554, 566, 559, 558, 590, 578, 526, 523, 521, 519, 578, 549, 519, 513, 521, 525, 587, 578, 545, 522, 528, 525, 527, 519, 589, 595, 595, 596, 588, 594, 588, 594, 588, 594, 578, 559, 525, 512, 523, 526, 519, 578, 561, 515, 516, 515, 528, 523, 589, 599, 593, 597, 588, 593, 596, 2441, 2469, 2468, 2468, 2479, 2473, 2494, 2467, 2469, 2468, 932, 906, 906, 927, 962, 942, 899, 902, 921, 906, 2726, 2692, 2692, 2690, 2711, 2707, 2762, 2722, 2697, 2692, 2696, 2691, 2702, 2697, 2688, 3148, 3137, 3136, 3147, 3153, 3148, 3153, 3164, 2347, 2398, 2352, 2310, 2304, 2311, 2332, 2334, 2398, 2363, 2326, 2322, 2327, 2326, 2305, 1825, 1815, 1809, 1814, 1805, 1807, 1844, 1795, 1806, 1815, 1799, 1734, 1715, 1757, 1778, 1783, 1787, 1776, 1770, 1715, 1738, 1767, 1774, 1787, 309, 282, 272, 262, 283, 285, 272, 1515, 1438, 1522, 1478, 1479, 1499, 1438, 1511, 1500, 1496, 1494, 1501, 1212, 1231, 1227, 1212, 1231, 1214, 1231, 1224, 1214, 1224, 1209, 1226, 1224, 1227, 1231, 1730, 1719, 1755, 1770, 1770, 1719, 1740, 1791, 1768, 1769, 1779, 1781, 1780, 1999, 2003, 1997, 3142, 3180, 3190, 3106, 3138, 3178, 3195, 3182, 3147, 3182, 3195, 3182, 1563, 1742, 1731, 1731, 1728, 1752, 1772, 1757, 1728, 1756, 1756, 1791, 1757, 1728, 1755, 1728, 1740, 1728, 1731, 1789, 1738, 1739, 1734, 1757, 1738, 1740, 1755, 1756, 2529, 2535, 2528, 2544, 2657, 2580, 2667, 2652, 2632, 2636, 2652, 2634, 2637, 2580, 2669, 2640, 2644, 2652, 1250, 1252, 1250, 1254, 1250, 1252, 1250, 1259, 1250, 21131, 22738, 24434, 18855, 26153, -1700, 590, 621, 609, 611, 630, 619, 621, 620, 1472, 1477, 1477, 1522, 1492, 1489, 1489, 1491, 1476, 1490, 1490, 1476, 1477, 2547, 2530, 2555, 2492, 2530, 2554, 2530, 2493, 2549, 2551, 2534, 2547, 2530, 2530, 2547, 2530, 2555, 2492, 2555, 2556, 2550, 2551, 2538, 2493, 2534, 2539, 2530, 2551, 2516, 2555, 2558, 2534, 2551, 2528, 2500, 2557, 2550, 2526, 2555, 2529, 2534, 469, 454, 465, 469, 21453, -28083, 2003, 1999, 1995, 2008, 2394, 2391, 2398, 2379, 2417, 2375, 2378, 3080, 3097, 3103, 3101, 2338, 2366, 2339, 2341, 25410, 25074, 702, 691, 700, 693, 939, 932, 937, 955, 955, 260, 257, 276, 257, 313, 302, 296, 292, 294, 294, 302, 293, 303, 276, 295, 290, 312, 319, 2111, 2086, 2093, 2070, 2080, 2093, 1478, 1503, 1492, 1519, 1502, 1489, 1501, 1493, 2996, 2989, 2982, 2973, 2994, 2987, 2977, 790, 783, 772, 831, 786, 773, 781, 769, 786, 779, 787, 1358, 1375, 1350, 1281, 1375, 1351, 1375, 1280, 1352, 1354, 1371, 1358, 1375, 1375, 1358, 1375, 1350, 1281, 1350, 1345, 1355, 1354, 1367, 1280, 1369, 1344, 1355, 1387, 1354, 1371, 1358, 1350, 1347, 494, 503, 508, 455, 497, 508, 1473, 1476, 1489, 1476, 2345, 2352, 2363, 2132, 2125, 2118, 2173, 2124, 2115, 2127, 2119, 1154, 1179, 1168, 1195, 1158, 1169, 1177, 1173, 1158, 1183, 1159, 1756, 1733, 1742, 1781, 1739, 1737, 1758, 1733, 1752, 2745, 2720, 2731, 2704, 2731, 2726, 2749, 2730, 2732, 2747, 2720, 2749, 1768, 1777, 1786, 1729, 1789, 1777, 1776, 1770, 1787, 1776, 1770, 3300, 3325, 3318, 3277, 3298, 3326, 3315, 3307, 3277, 3326, 3323, 3297, 3302, 1999, 2003, 2014, 1990, 2010, 1997, 2016, 2006, 2001, 2009, 2000, 1288, 1299, 1300, 1292, 1990, 1990, 1990, 3307, 3308, 3314, 3309, 725, 730, 726, 734, 448, 1788, 1773, 1790, 1791, 1769, 2111, 926, 921, 903, 900, 927, 923, 917, 926, 1447, 1682, 1716, 1698, 1717, 1770, 1670, 1696, 1698, 1705, 1715, 2281, 2285, 2286, 2290, 2290, 2294, 2217, 2229, 2216, 2231, 2226, 2216, 2239, 1882, 1910, 1911, 1901, 1916, 1911, 1901, 1844, 1869, 1888, 1897, 1916, 1147, 1130, 1130, 1142, 1139, 1145, 1147, 1134, 1139, 1141, 1140, 1077, 1122, 1079, 1133, 1133, 1133, 1079, 1148, 1141, 1128, 1143, 1079, 1135, 1128, 1142, 1151, 1140, 1145, 1141, 1150, 1151, 1150, 1977, 1960, 1960, 2037, 1965, 1963, 1981, 1962, 2037, 1964, 1975, 1971, 1981, 1974, 2301, 2227, 2210, 2235, 2300, 2210, 2234, 2210, 2301, 2229, 2231, 2214, 2227, 2210, 2210, 2227, 2210, 2235, 2300, 2235, 2236, 2230, 2231, 2218, 2301, 2235, 2236, 2235, 2214, 2180, 2275, 2275, 2283, 2937, 2940, 2921, 2940, 1105, 1116, 1109, 1088, 1146, 1097, 1100, 1110, 1105, 2922, 2919, 2926, 2939, 2881, 2935, 2938, 2385, 2396, 2389, 2368, 2426, 2379, 2372, 2376, 2368, 2506, 2509, 2513, 2518, 2165, 2171, 2151, 2254, 2257, 669, 646, 642, 652, 647, 1947, 2434, 2468, 2482, 2469, 2554, 2454, 2480, 2482, 2489, 2467, 1749, 1783, 1762, 1777, 1780, 1780, 1785, 1719, 1709, 1718, 1704, 1720, 1712, 1748, 1777, 1782, 1773, 1760, 1699, 1720, 1753, 1782, 1788, 1770, 1783, 1777, 1788, 1720, 1705, 1707, 1699, 1720, 1736, 1777, 1760, 1789, 1780, 1720, 1711, 1713, 1720, 1753, 1768, 1768, 1780, 1789, 1743, 1789, 1786, 1747, 1777, 1772, 1719, 1709, 1707, 1711, 1718, 1707, 1710, 1720, 1712, 1747, 1744, 1740, 1749, 1748, 1716, 1720, 1780, 1777, 1779, 1789, 1720, 1759, 1789, 1787, 1779, 1783, 1713, 1720, 1755, 1776, 1770, 1783, 1781, 1789, 1719, 1705, 1705, 1710, 1718, 1704, 1718, 1704, 1718, 1704, 1720, 1749, 1783, 1786, 1777, 1780, 1789, 1720, 1739, 1785, 1790, 1785, 1770, 1777, 1719, 1709, 1707, 1711, 1718, 1707, 1710, 1404, 1289, 1383, 1361, 1367, 1360, 1355, 1353, 1289, 1388, 1345, 1349, 1344, 1345, 1366, 2575, 2617, 2623, 2616, 2595, 2593, 2586, 2605, 2592, 2617, 2601, 1317, 1360, 1342, 1297, 1300, 1304, 1299, 1289, 1360, 1321, 1284, 1293, 1304, 3206, 3241, 3235, 3253, 3240, 3246, 3235, 989, 936, 964, 1008, 1009, 
    1005, 936, 977, 1002, 1006, 992, 1003, 3012, 2999, 2995, 3012, 2999, 3014, 2999, 2992, 3014, 2992, 3009, 2994, 2992, 2995, 2999, 1790, 1675, 1767, 1750, 1750, 1675, 1776, 1731, 1748, 1749, 1743, 1737, 1736, 1909, 1897, 1911, 2882, 2920, 2930, 2854, 2886, 2926, 2943, 2922, 2895, 2922, 2943, 2922, 1541, 2153, 2076, 2147, 2132, 2112, 2116, 2132, 2114, 2117, 2076, 2149, 2136, 2140, 2132, 2253, 2251, 2253, 2249, 2253, 2251, 2253, 2244, 2253, 2435, 2436, 2458, 1911, 1890, 1897, 1891, 1913, 2341, 2361, 2361, 2365, 467, 450, 475, 412, 450, 474, 450, 413, 469, 471, 454, 467, 450, 450, 467, 450, 475, 412, 475, 476, 470, 471, 458, 413, 452, 477, 470, 482, 467, 448, 449, 471, 1282, 1299, 1280, 1281, 1303, 1325, 1299, 1282, 1307, 2726, 2749, 2745, 2743, 2748, 2450, 2455, 2434, 2455, 794, 2610, 2610, 2964, 3011, 3012, 3034, 2964, 2956, 2964, 2974, 3053, 3048, 2964, 3051, 2973, 2975, 2964, 2569, 2654, 2649, 2631, 2569, 2577, 2571, 2569, 2563, 2672, 2677, 2569, 2678, 2560, 2562, 2569, 1881, 1864, 1873, 1814, 1864, 1872, 1864, 1815, 1887, 1885, 1868, 1881, 1864, 1864, 1881, 1864, 1873, 1814, 1873, 1878, 1884, 1885, 1856, 1815, 1867, 1885, 1881, 1866, 1883, 1872, 1908, 1873, 1867, 1868, 2908, 2898, 2894, 2880, 2904, 2885, 2899, 2884, 1081, 1076, 1085, 1064, 1085, 1068, 1066, 1064, 1042, 1060, 1065, 990, 1467, 1470, 1451, 1470, 398, 408, 412, 399, 414, 405, 418, 401, 404, 398, 393, 1558, 1551, 1540, 1599, 1545, 1540, 1188, 1213, 1206, 1165, 1212, 1203, 1215, 1207, 3085, 3092, 3103, 3108, 3083, 3090, 3096, 823, 814, 805, 798, 819, 804, 812, 800, 819, 810, 818};
    public String a;
    public final String b;
    public String c;
    public String d;
    public String e;

    public HBgetappapi() {
        String strM1840 = C0007.m1840();
        this.a = strM1840;
        this.b = C0046.m7718(m272(), 0, 8, 1908);
        this.c = strM1840;
        this.d = strM1840;
    }

    public static String ger302(String str) {
        String strM252 = str;
        try {
            Response responseM269 = m269(m270(m254(m265(m263(new OkHttpClient.Builder(), false), false)), m262(m256(m256(m256(m256(m256(m256(m256(m256(m256(m268(m266(new Request.Builder(), strM252)), C0035.m6131(m272(), 8, 4, 912), C0054.m8574(m272(), 12, 19, 1897)), C0016.m3525(m272(), 31, 10, 1569), C0057.m8978(m272(), 41, 117, 610)), C0035.m6131(m272(), 158, 10, 2506), C0055.m8814(m272(), 168, 10, 1007)), C0041.m6779(m272(), 178, 15, 2791), C0005.m1645(m272(), 193, 8, 3109)), C0002.m1305(m272(), 201, 15, 2419), C0036.m6188(m272(), 216, 11, 1890)), C0056.m8911(m272(), 227, 13, 1694), C0054.m8574(m272(), 240, 7, 372)), C0014.m3332(m272(), 247, 12, 1459), C0043.m7290(m272(), 259, 15, 1274)), C0050.m8131(m272(), 274, 13, 1690), C0028.m5109(m272(), 287, 3, 2045)), C0046.m7718(m272(), 290, 12, 3087), C0051.m8259(m272(), 302, 1, 1578)), C0011.m2805(m272(), 303, 27, 1711), C0063.m9585(m272(), 330, 4, 2453), C0028.m5109(m272(), 334, 14, 2617), C0042.m7151(m272(), 348, 9, 1235))));
            try {
                if (m257(responseM269) != 302) {
                    m271(responseM269);
                    return strM252;
                }
                C0012.m2969(C0035.m6087(), C0005.m1645(m272(), 357, 6, 1606));
                strM252 = m252(m264(responseM269), C0013.m3106(m272(), 363, 8, 514));
                m271(responseM269);
                return strM252;
            } catch (Throwable th) {
                if (responseM269 != null) {
                    try {
                        m271(responseM269);
                    } catch (Throwable th2) {
                        try {
                            C0052.m8352(C0057.m8970(Throwable.class, C0016.m3525(m272(), 371, 13, 1441), new Class[]{Throwable.class}), th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            return strM252;
        }
    }

    /* renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m252(Object obj, Object obj2) {
        if (C0023.m4566() < 0) {
            return ((Headers) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static Iterator m253(Object obj) {
        if (C0044.m7508() < 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۟۟۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m254(Object obj) {
        if (C0013.m3167() > 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static JsonArray m255(Object obj, Object obj2) {
        if (C0032.m5686() <= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m256(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() <= 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int m257(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۟ۥۥۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m258(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Object m259(Object obj, Object obj2, Object obj3) {
        if (C0026.m4977() < 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۨ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m260(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static JsonElement m261(Object obj, Object obj2) {
        if (C0019.m4065() <= 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Request m262(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0040.m6582() >= 0) {
            return a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m263(Object obj, boolean z) {
        if (C0010.m2320() <= 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۢ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static Headers m264(Object obj) {
        if (C0056.m8886() < 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m265(Object obj, boolean z) {
        if (C0047.m7837() > 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۣۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m266(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static String m267(Object obj) {
        if (C0022.m4497() > 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۤۢۢۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m268(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۤۥۦۡ, reason: not valid java name and contains not printable characters */
    public static Response m269(Object obj) {
        if (C0021.m4379() > 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۥۨۤ۠, reason: contains not printable characters */
    public static Call m270(Object obj, Object obj2) {
        if (C0013.m3167() > 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۠ۦ۟, reason: contains not printable characters */
    public static void m271(Object obj) {
        if (C0038.m6471() > 0) {
            ((Response) obj).close();
        }
    }

    /* renamed from: ۦۣۧۦ, reason: contains not printable characters */
    public static short[] m272() {
        if (C0057.m9017() >= 0) {
            return f42short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strM5188 = C0028.m5188(new StringBuilder(), C0024.m4729(this), C0050.m8131(m272(), 384, 41, 2450));
        String strM3525 = C0016.m3525(m272(), 425, 4, 436);
        String strM2805 = C0011.m2805(m272(), 429, 2, 677);
        HashMap mapM4127 = C0019.m4127(strM3525, strM2805, C0050.m8131(m272(), 431, 4, 1962), strM2805);
        C0053.m8424(mapM4127, C0044.m7509(m272(), 435, 7, 2350), str);
        C0053.m8424(mapM4127, C0033.m5852(m272(), 442, 4, 3192), str2);
        C0053.m8424(mapM4127, C0024.m4740(m272(), 446, 4, 2385), C0012.m2973(m272(), 450, 2, 1090));
        C0053.m8424(mapM4127, C0058.m9106(m272(), 452, 4, 722), strM2805);
        C0053.m8424(mapM4127, C0047.m7833(m272(), 456, 5, 968), strM2805);
        Iterator itM253 = m253(m255((JsonObject) C0033.m5856(C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(strM5188, mapM4127, C0021.m4380(this)))), C0028.m5109(m272(), 461, 4, 352)), C0009.m2083(C0058.m9133(this)), C0009.m2083(C0002.m1338(this))), JsonObject.class), C0005.m1645(m272(), 465, 14, 331)));
        while (C0012.m2962(itM253)) {
            JsonObject jsonObjectM258 = m258((JsonElement) C0048.m7949(itM253));
            C0004.m1532(arrayList, new m(m267(m261(jsonObjectM258, C0018.m3917(m272(), 479, 6, 2121))), m267(m261(jsonObjectM258, C0060.m9352(m272(), 485, 8, 1456))), m267(m261(jsonObjectM258, C0062.m9389(m272(), 493, 7, 3010))), m267(m261(jsonObjectM258, C0042.m7151(m272(), 500, 11, 864)))));
        }
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM7651 = C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0024.m4729(this), C0024.m4740(m272(), 511, 33, 1327)), C0020.m4251(C0024.m4740(m272(), 544, 6, 408), (String) C0048.m7915(list, 0)), C0021.m4380(this)))), C0044.m7509(m272(), 550, 4, 1445)), C0009.m2083(C0058.m9133(this)), C0009.m2083(C0002.m1338(this)));
        C0012.m2969(C0035.m6087(), strM7651);
        JsonObject jsonObject = (JsonObject) m259(new Gson(), strM7651, JsonObject.class);
        JsonObject jsonObjectM260 = m260(jsonObject, C0001.m1189(m272(), 554, 3, 2399));
        String strM267 = m267(m261(jsonObjectM260, C0048.m7902(m272(), 557, 8, 2082)));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0036.m6189());
        C0018.m3933(sb, m267(m261(jsonObjectM260, C0002.m1305(m272(), 565, 11, 1268))));
        String strM7763 = C0047.m7763(sb);
        String strM2672 = m267(m261(jsonObjectM260, C0042.m7151(m272(), 576, 9, 1706)));
        String strM2673 = m267(m261(jsonObjectM260, C0019.m4107(m272(), 585, 12, 2767)));
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0055.m8703());
        C0018.m3933(sb2, m267(m261(jsonObjectM260, C0026.m4951(m272(), 597, 11, 1694))));
        String strM77632 = C0047.m7763(sb2);
        Iterator itM253 = m253(m255(jsonObject, C0065.m9775(m272(), 608, 13, 3218)));
        String strM1840 = C0007.m1840();
        String strM9804 = strM1840;
        while (C0012.m2962(itM253)) {
            JsonObject jsonObjectM258 = m258((JsonElement) C0048.m7949(itM253));
            JsonObject jsonObjectM2602 = m260(jsonObjectM258, C0000.m1077(m272(), 621, 11, 1983));
            StringBuilder sbM5621 = C0031.m5621(strM1840);
            C0018.m3933(sbM5621, C0016.m3579());
            C0018.m3933(sbM5621, m267(m261(jsonObjectM2602, C0042.m7151(m272(), 632, 4, 1403))));
            String strM2300 = C0010.m2300(m272(), 636, 3, 2018);
            C0018.m3933(sbM5621, strM2300);
            strM1840 = C0047.m7763(sbM5621);
            Iterator itM2532 = m253(m255(jsonObjectM258, C0026.m4951(m272(), 639, 4, 3230)));
            while (C0012.m2962(itM2532)) {
                JsonObject jsonObjectM2582 = m258((JsonElement) C0048.m7949(itM2532));
                StringBuilder sbM56212 = C0031.m5621(strM9804);
                String strM7657 = C0045.m7657(m272(), 643, 4, 699);
                C0018.m3933(sbM56212, m267(m261(jsonObjectM2582, strM7657)));
                C0018.m3933(sbM56212, C0024.m4740(m272(), 647, 1, 484));
                C0018.m3933(sbM56212, m267(m261(jsonObjectM2602, C0034.m6001(m272(), 648, 5, 1676))));
                String strM6452 = C0038.m6452(m272(), 653, 1, 2113);
                C0018.m3933(sbM56212, strM6452);
                C0018.m3933(sbM56212, m267(m261(jsonObjectM2582, C0001.m1189(m272(), 654, 3, 1003))));
                C0018.m3933(sbM56212, strM6452);
                C0018.m3933(sbM56212, strM267);
                C0018.m3933(sbM56212, strM6452);
                C0018.m3933(sbM56212, m267(m261(jsonObjectM2582, strM7657)));
                C0018.m3933(sbM56212, strM6452);
                C0018.m3933(sbM56212, m267(m261(jsonObjectM2582, C0005.m1645(m272(), 657, 5, 1008))));
                C0018.m3933(sbM56212, C0030.m5362(m272(), 662, 1, 1412));
                strM9804 = C0047.m7763(sbM56212);
            }
            strM9804 = C0065.m9804(strM9804, strM2300);
        }
        m mVar = new m();
        C0011.m2828(mVar, (String) C0048.m7915(list, 0));
        C0005.m1628(mVar, strM267);
        C0058.m9152(mVar, strM2672);
        C0027.m5000(mVar, strM77632);
        C0058.m9159(mVar, strM2673);
        C0019.m4073(mVar, strM7763);
        C0054.m8596(mVar, C0000.m1096(strM1840));
        C0044.m7449(mVar, C0000.m1096(strM9804));
        return C0053.m8428(mVar);
    }

    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        C0009.m2099();
        C0053.m8424(map, C0031.m5565(m272(), 663, 10, 1735), C0013.m3106(m272(), 673, 13, 2182));
        C0053.m8424(map, C0039.m6551(m272(), 686, 12, 1817), C0049.m8007(m272(), 698, 33, 1050));
        C0053.m8424(map, C0051.m8259(m272(), 731, 14, 2008), C0047.m7796(this));
        return map;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM1964 = C0008.m1964(new JSONObject(C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0024.m4729(this), C0006.m1774(m272(), 745, 33, 2258)), C0021.m4380(this), C0021.m4380(this)))), C0024.m4740(m272(), 778, 4, 2845)), C0009.m2083(C0058.m9133(this)), C0009.m2083(C0002.m1338(this)))), C0031.m5565(m272(), 782, 9, 1061));
        for (int i = 0; i < C0053.m8396(jSONArrayM1964); i++) {
            C0004.m1532(arrayList, new b(C0001.m1212(C0018.m3923(jSONArrayM1964, i), C0005.m1645(m272(), 791, 7, 2846)), C0001.m1212(C0018.m3923(jSONArrayM1964, i), C0001.m1189(m272(), 798, 9, 2341)), null));
        }
        return C0003.m1448(C0002.m1239(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(new String(C0007.m1882(str)));
                this.a = C0001.m1212(jSONObject, C0017.m3646(m272(), 807, 4, 2466));
                this.c = C0001.m1212(jSONObject, C0040.m6584(m272(), 811, 3, 2078));
                this.d = C0001.m1212(jSONObject, C0032.m5708(m272(), 814, 2, 2215));
                this.e = C0001.m1212(jSONObject, C0055.m8814(m272(), 816, 5, 745));
            } catch (Exception unused) {
            }
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        d dVarM1396;
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0029.m5256(m272(), 821, 1, 2021));
        String str3 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
        String str4 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        String str5 = (strArrM4752.length <= 2 || C0057.m8953(strArrM4752[2])) ? null : strArrM4752[2];
        String str6 = (strArrM4752.length <= 3 || C0057.m8953(strArrM4752[3])) ? null : strArrM4752[3];
        String str7 = (strArrM4752.length <= 4 || C0057.m8953(strArrM4752[4])) ? null : strArrM4752[4];
        HashMap mapM4127 = C0019.m4127(C0060.m9352(m272(), 822, 10, 2519), C0023.m4536(m272(), 832, 117, 1688), C0033.m5852(m272(), 949, 15, 1316), C0058.m9106(m272(), 964, 11, 2636));
        C0053.m8424(mapM4127, C0012.m2973(m272(), 975, 13, 1405), C0005.m1645(m272(), 988, 7, 3271));
        C0053.m8424(mapM4127, C0056.m8911(m272(), 995, 12, 901), C0008.m1970(m272(), 1007, 15, 2946));
        C0053.m8424(mapM4127, C0005.m1645(m272(), 1022, 13, 1702), C0049.m8007(m272(), 1035, 3, 1863));
        C0053.m8424(mapM4127, C0038.m6452(m272(), 1038, 12, 2827), C0044.m7509(m272(), 1050, 1, 1588));
        C0053.m8424(mapM4127, C0017.m3646(m272(), 1051, 14, 2097), C0012.m2973(m272(), 1065, 9, 2300));
        String strM2827 = C0011.m2827(str4, str5, str6);
        String strM5109 = C0028.m5109(m272(), 1074, 3, 2550);
        if (str3 != null) {
            if (C0058.m9127(str3, C0022.m4403(m272(), 1077, 5, 1807))) {
                PrintStream printStreamM6087 = C0035.m6087();
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, str3);
                C0018.m3933(sb, str4);
                C0012.m2969(printStreamM6087, C0047.m7763(sb));
                g gVar = new g();
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, str3);
                C0018.m3933(sb2, str4);
                C0017.m3667(gVar, C0026.m4952(C0047.m7763(sb2)));
                C0006.m1720(gVar, 1);
                C0002.m1282(gVar, strM2827);
                return C0033.m5828(gVar);
            }
            if (C0058.m9127(str3, C0055.m8814(m272(), 1082, 4, 2381))) {
                PrintStream printStreamM60872 = C0035.m6087();
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, str3);
                C0018.m3933(sb3, str4);
                C0012.m2969(printStreamM60872, C0026.m4952(C0047.m7763(sb3)));
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, str3);
                C0018.m3933(sb4, str4);
                JSONObject jSONObject = new JSONObject(C0032.m5769(C0026.m4952(C0047.m7763(sb4)), null));
                if (!C0063.m9499(jSONObject, strM5109)) {
                    g gVar2 = new g();
                    C0017.m3667(gVar2, str4);
                    C0064.m9646(gVar2);
                    C0002.m1282(gVar2, strM2827);
                    return C0033.m5828(gVar2);
                }
                String strM1212 = C0001.m1212(jSONObject, strM5109);
                g gVar3 = new g();
                C0017.m3667(gVar3, strM1212);
                C0006.m1720(gVar3, 0);
                C0002.m1282(gVar3, strM2827);
                return C0033.m5828(gVar3);
            }
        }
        if (str3 == null) {
            g gVar4 = new g();
            C0017.m3667(gVar4, C0052.m8305(str4));
            C0002.m1282(gVar4, strM2827);
            return C0033.m5828(gVar4);
        }
        String strM5188 = C0028.m5188(new StringBuilder(), C0024.m4729(this), C0056.m8911(m272(), 1086, 32, 434));
        String strM1970 = C0008.m1970(m272(), 1118, 9, 1394);
        if (str7 != null) {
            HashMap mapM4251 = C0020.m4251(strM1970, str3);
            C0053.m8424(mapM4251, strM5109, C0027.m4992(str4, C0009.m2083(C0058.m9133(this)), C0009.m2083(C0002.m1338(this))));
            C0053.m8424(mapM4251, C0061.m9361(m272(), 1127, 5, 2770), str7);
            dVarM1396 = C0003.m1396(strM5188, mapM4251, C0021.m4380(this));
        } else {
            HashMap mapM42512 = C0020.m4251(strM1970, str3);
            C0053.m8424(mapM42512, strM5109, C0027.m4992(str4, C0009.m2083(C0058.m9133(this)), C0009.m2083(C0002.m1338(this))));
            dVarM1396 = C0003.m1396(strM5188, mapM42512, C0021.m4380(this));
        }
        String strM7651 = C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(dVarM1396)), C0018.m3917(m272(), 1132, 4, 2550)), C0009.m2083(C0058.m9133(this)), C0009.m2083(C0002.m1338(this)));
        String strM51092 = C0028.m5109(m272(), 1136, 1, 784);
        String strM1840 = C0007.m1840();
        String strM4800 = C0025.m4800(C0025.m4800(strM7651, strM51092, strM1840), C0044.m7509(m272(), 1137, 2, 2670), strM1840);
        Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0040.m6584(m272(), 1139, 15, 2998)), strM4800);
        if (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            g gVar5 = new g();
            C0017.m3667(gVar5, strM4306);
            C0006.m1720(gVar5, 0);
            C0002.m1282(gVar5, strM2827);
            C0057.m9029(gVar5, mapM4127);
            return C0033.m5828(gVar5);
        }
        Matcher matcherM60262 = C0034.m6026(C0005.m1602(C0049.m8007(m272(), 1154, 16, 2603)), strM4800);
        if (!C0003.m1405(matcherM60262)) {
            g gVar6 = new g();
            C0017.m3667(gVar6, str4);
            C0006.m1720(gVar6, 0);
            C0064.m9646(gVar6);
            C0002.m1282(gVar6, strM2827);
            return C0033.m5828(gVar6);
        }
        String strM43062 = C0021.m4306(matcherM60262, 1);
        g gVar7 = new g();
        C0017.m3667(gVar7, strM43062);
        C0006.m1720(gVar7, 0);
        C0002.m1282(gVar7, strM2827);
        C0057.m9029(gVar7, mapM4127);
        return C0033.m5828(gVar7);
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM253 = m253(m255((JsonObject) C0033.m5856(C0045.m7651(C0001.m1212(new JSONObject(C0008.m2029(C0003.m1396(C0028.m5188(new StringBuilder(), C0024.m4729(this), C0036.m6188(m272(), 1170, 34, 1848)), C0019.m4127(C0028.m5109(m272(), 1204, 8, 2871), str, C0024.m4740(m272(), 1212, 11, 1101), C0013.m3106(m272(), 1223, 1, 1007)), C0021.m4380(this)))), C0037.m6307(m272(), 1224, 4, 1503)), C0009.m2083(C0058.m9133(this)), C0009.m2083(C0002.m1338(this))), JsonObject.class), C0023.m4536(m272(), 1228, 11, 509)));
        while (C0012.m2962(itM253)) {
            JsonObject jsonObjectM258 = m258((JsonElement) C0048.m7949(itM253));
            C0004.m1532(arrayList, new m(m267(m261(jsonObjectM258, C0053.m8477(m272(), 1239, 6, 1632))), m267(m261(jsonObjectM258, C0016.m3525(m272(), 1245, 8, 1234))), m267(m261(jsonObjectM258, C0003.m1398(m272(), 1253, 7, 3195))), m267(m261(jsonObjectM258, C0051.m8259(m272(), 1260, 11, 833)))));
        }
        return C0047.m7783(arrayList);
    }
}