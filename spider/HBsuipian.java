package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
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
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBsuipian extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f58short = {2901, 2889, 2889, 2893, 2894, 2823, 2834, 2834, 2894, 2893, 2904, 2904, 2905, 2835, 2901, 2900, 2902, 2899, 2887, 2835, 2910, 2898, 2896, 2834, 2893, 2908, 2893, 2908, 2884, 2908, 2834, 2893, 2908, 2893, 2908, 2884, 2908, 2832, 2907, 2900, 2897, 2904, 2834, 2907, 2900, 2897, 2904, 2894, 2834, 2905, 2898, 2890, 2899, 2897, 2898, 2908, 2905, 2834, 2767, 2757, 2808, 2772, 2770, 2766, 2775, 2766, 2758, 2761, 2808, 2770, 2770, 2766, 2755, 607, 633, 623, 632, 551, 587, 621, 623, 612, 638, 1725, 1695, 1674, 1689, 1692, 1692, 1681, 1759, 1733, 1758, 1728, 1744, 1752, 1724, 1689, 1694, 1669, 1672, 1739, 1744, 1713, 1694, 1684, 1666, 1695, 1689, 1684, 1744, 1729, 1731, 1739, 1744, 1699, 1725, 1757, 1719, 1737, 1736, 1736, 1728, 1744, 1714, 1669, 1689, 1692, 1684, 1759, 1700, 1696, 1729, 1713, 1758, 1730, 1730, 1728, 1734, 1730, 1732, 1758, 1728, 1729, 1732, 1739, 1744, 1671, 1670, 1753, 1744, 1713, 1664, 1664, 1692, 1685, 1703, 1685, 1682, 1723, 1689, 1668, 1759, 1733, 1731, 1735, 1758, 1731, 1734, 1744, 1752, 1723, 1720, 1700, 1725, 1724, 1756, 1744, 1692, 1689, 1691, 1685, 1744, 1719, 1685, 1683, 1691, 1695, 1753, 1744, 1702, 1685, 1666, 1667, 1689, 1695, 1694, 1759, 1732, 1758, 1728, 1744, 1715, 1688, 1666, 1695, 1693, 1685, 1759, 1729, 1728, 1736, 1758, 1728, 1758, 1733, 1731, 1733, 1737, 1758, 1729, 1730, 1736, 1744, 1725, 1695, 1682, 1689, 1692, 1685, 1744, 1699, 1681, 1686, 1681, 1666, 1689, 1759, 1733, 1731, 1735, 1758, 1731, 1734, 1744, 1704, 1703, 1717, 1714, 1759, 1733, 1729, 1732, 1731, 1744, 1725, 1725, 1703, 1717, 1714, 1699, 1716, 1723, 1759, 1730, 1728, 1730, 1731, 1728, 1736, 1728, 1729, 1744, 1725, 1725, 1703, 1717, 1714, 1721, 1716, 1759, 1733, 1733, 1737, 1736, 1744, 1725, 1689, 1683, 1666, 1695, 1725, 1685, 1667, 1667, 1685, 1694, 1687, 1685, 1666, 1759, 1736, 1758, 1728, 1758, 1732, 1728, 1758, 1730, 1733, 1728, 1728, 1752, 1728, 1672, 1730, 1736, 1728, 1728, 1730, 1736, 1731, 1736, 1753, 1744, 1703, 1685, 1715, 1688, 1681, 1668, 1759, 1681, 1666, 1693, 1734, 1732, 1744, 1703, 1685, 1689, 1672, 1689, 1694, 1744, 1726, 1685, 1668, 1700, 1673, 1664, 1685, 1759, 1703, 1721, 1718, 1721, 1744, 1724, 1681, 1694, 1687, 1669, 1681, 1687, 1685, 1759, 1674, 1688, 1711, 1715, 1726, 1744, 1713, 1714, 1721, 1759, 1681, 1666, 1693, 1734, 1732, 2818, 2835, 2835, 2826, 2823, 2608, 2657, 2621, 2612, 2663, 2613, 2615, 2663, 2609, 2611, 2620, 2614, 2656, 2613, 2608, 2620, 2620, 2611, 2608, 2611, 2615, 2621, 2613, 2656, 2620, 2660, 2608, 2662, 2609, 2657, 2614, 2611, 3025, 3045, 3044, 3064, 3071, 3042, 3065, 3050, 3057, 3044, 3065, 3071, 3070, 2556, 2556, 2528, 2541, 1457, 1437, 1436, 1414, 1431, 1436, 1414, 1503, 1446, 1419, 1410, 1431, 2449, 2432, 2432, 2460, 2457, 2451, 2449, 2436, 2457, 2463, 2462, 2527, 2440, 2525, 2439, 2439, 2439, 2525, 2454, 2463, 2434, 2461, 2525, 2437, 2434, 2460, 2453, 2462, 2451, 2463, 2452, 2453, 2452, 1781, 1769, 1769, 1773, 1774, 1703, 1714, 1714, 1787, 1775, 1784, 1784, 1712, 1788, 1773, 1780, 1715, 1791, 1780, 1786, 1781, 1778, 1769, 1770, 1780, 1779, 1785, 1715, 1790, 1790, 1714, 1773, 1788, 1773, 1788, 1764, 1788, 1714, 1773, 1788, 1773, 1788, 1764, 1788, 1712, 1788, 1773, 1780, 1714, 1771, 1780, 1785, 1784, 1778, 1774, 1714, 1773, 1788, 1786, 1784, 1698, 1769, 1764, 1773, 1784, 1696, 1704, 1723, 1769, 1788, 1786, 1748, 1785, 1696, 801, 887, 870, 864, 866, 841, 882, 874, 826, 3310, 3256, 3241, 3247, 3245, 3227, 3233, 3250, 3245, 3317, 3321, 3322, 1852, 1849, 1827, 1828, 996, 1017, 1000, 992, 964, 1001, 3327, 1927, 1944, 1941, 1940, 1950, 1970, 1950, 1941, 1940, 1337, 1324, 1322, 1342, 2350, 2355, 2350, 2358, 2367, 1025, 1029, 1033, 1039, 1037, 1059, 1037, 1041, 1784, 1110, 1106, 1118, 1112, 1114, 1137, 1118, 1106, 1114, 23335, -25154, 23990, 25679, 1117, 1655, 1643, 1643, 1647, 1644, 1573, 1584, 1584, 1657, 1645, 1658, 1658, 1586, 1662, 1647, 1654, 1585, 1661, 1654, 1656, 1655, 1648, 1643, 1640, 1654, 1649, 1659, 1585, 1660, 1660, 1584, 1647, 1662, 1647, 1662, 1638, 1662, 1584, 1647, 1662, 1647, 1662, 1638, 1662, 1586, 1662, 1647, 1654, 1584, 1641, 1654, 1659, 1658, 1648, 1644, 1584, 1654, 1649, 1657, 1648, 1568, 1641, 1654, 1659, 1658, 1648, 1628, 1648, 1659, 1658, 1570, 1138, 1085, 1056, 1073, 1081, 1053, 1072, 1129, 2549, 2544, 2533, 2544, 1358, 1371, 1346, 1368, 1348, 1359, 1358, 1368, 1383, 1346, 1368, 1375, 2329, 1024, 1045, 1036, 1046, 1034, 1025, 1024, 1046, 744, 767, 745, 757, 758, 751, 750, 755, 757, 756, 726, 755, 745, 750, 3060, 3067, 3070, 3063, 3033, 3063, 3051, 1381, 1386, 1391, 1382, 1357, 1378, 1390, 1382, 2930, 687, 690, 687, 695, 702, 438, 434, 446, 440, 442, 404, 442, 422, 873, 877, 865, 871, 869, 846, 865, 877, 869, -25527, 28671, 2741, 10890, 830, 830, 26344, -27039, 804, 8987, 2651, 2634, 2637, 2654, 2635, 2646, 2640, 2641, 2259, 2271, 2270, 2244, 2261, 2270, 2244, 32675, 23081, 1816, 2038, 2026, 2026, 2030, 2029, 1956, 1969, 1969, 2040, 2028, 2043, 2043, 1971, 2047, 2030, 2039, 1968, 2044, 2039, 2041, 2038, 2033, 2026, 2025, 2039, 2032, 2042, 1968, 2045, 2045, 1969, 2030, 2047, 2030, 2047, 2023, 2047, 1969, 2030, 2047, 2030, 2047, 2023, 2047, 1971, 2047, 2030, 2039, 1969, 2026, 2038, 2043, 2047, 2026, 2043, 2028, 1969, 2026, 2047, 2041, 2029, 1956, 1953, 1972, 1953, 2414, 2403, 883, 866, 895, 883, 856, 881, 870, 875, 2382, 2370, 2371, 2393, 2376, 2371, 2393, 2304, 2393, 2388, 2397, 2376, 3092, 3077, 3077, 3097, 3100, 3094, 3092, 3073, 3100, 3098, 3099, 3162, 3103, 3078, 3098, 3099, 3150, 3157, 3094, 3101, 3092, 3079, 3078, 3088, 3073, 3144, 3072, 3073, 3091, 3160, 3149, 2516, 2452, 2519, 2498, 2510, 2515, 2532, 2511, 2434, 2517, 2505, 2497, 2515, 2513, 2439, 2515, 440, 444, 426, 470, 444, 442, 443, 470, 425, 434, 442, 426, 460, 425, 408, 413, 413, 400, 407, 414, 3007, 2976, 2997, 3006, 2969, 2996, 3197, 3187, 3183, 1944, 1944, 1924, 1929, 2737, 2711, 2689, 2710, 2761, 2725, 2691, 2689, 2698, 2704, 974, 1004, 1017, 1002, 1007, 1007, 994, 940, 950, 941, 947, 
    931, 939, 975, 1002, 1005, 1014, 1019, 952, 931, 962, 1005, 999, 1009, 1004, 1002, 999, 931, 946, 944, 952, 931, 976, 974, 942, 964, 954, 955, 955, 947, 931, 961, 1014, 1002, 1007, 999, 940, 983, 979, 946, 962, 941, 945, 945, 947, 949, 945, 951, 941, 947, 946, 951, 952, 931, 1012, 1013, 938, 931, 962, 1011, 1011, 1007, 998, 980, 998, 993, 968, 1002, 1015, 940, 950, 944, 948, 941, 944, 949, 931, 939, 968, 971, 983, 974, 975, 943, 931, 1007, 1002, 1000, 998, 931, 964, 998, 992, 1000, 1004, 938, 931, 981, 998, 1009, 1008, 1002, 1004, 1005, 940, 951, 941, 947, 931, 960, 1003, 1009, 1004, 1006, 998, 940, 946, 947, 955, 941, 947, 941, 950, 944, 950, 954, 941, 946, 945, 955, 931, 974, 1004, 993, 1002, 1007, 998, 931, 976, 994, 997, 994, 1009, 1002, 940, 950, 944, 948, 941, 944, 949, 931, 987, 980, 966, 961, 940, 950, 946, 951, 944, 931, 974, 974, 980, 966, 961, 976, 967, 968, 940, 945, 947, 945, 944, 947, 955, 947, 946, 931, 974, 974, 980, 966, 961, 970, 967, 940, 950, 950, 954, 955, 931, 974, 1002, 992, 1009, 1004, 974, 998, 1008, 1008, 998, 1005, 996, 998, 1009, 940, 955, 941, 947, 941, 951, 947, 941, 945, 950, 947, 947, 939, 947, 1019, 945, 955, 947, 947, 945, 955, 944, 955, 938, 931, 980, 998, 960, 1003, 994, 1015, 940, 994, 1009, 1006, 949, 951, 931, 980, 998, 1002, 1019, 1002, 1005, 931, 973, 998, 1015, 983, 1018, 1011, 998, 940, 980, 970, 965, 970, 931, 975, 994, 1005, 996, 1014, 994, 996, 998, 940, 1017, 1003, 988, 960, 973, 931, 962, 961, 970, 940, 994, 1009, 1006, 949, 951, 1312, 1340, 1340, 1336, 1339, 1394, 1383, 1383, 1326, 1338, 1325, 1325, 1381, 1321, 1336, 1313, 1382, 1322, 1313, 1327, 1312, 1319, 1340, 1343, 1313, 1318, 1324, 1382, 1323, 1323, 1383, 1336, 1321, 1336, 1321, 1329, 1321, 1383, 1336, 1321, 1336, 1321, 1329, 1321, 1381, 1321, 1336, 1313, 1383, 1319, 1321, 1341, 1340, 1312, 1402, 1383, 1341, 1341, 1313, 1324, 1974, 1978, 1969, 1968, 1212, 1209, 1196, 1209, 2502, 2525, 2521, 2519, 2524, 2363, 2353, 2316, 2336, 2342, 2362, 2339, 2362, 2354, 2365, 2316, 2343, 2364, 2360, 2358, 2365, 3021, 3025, 3025, 3029, 1123, 1222, 1242, 1242, 1246, 1245, 1172, 1153, 1153, 1224, 1244, 1227, 1227, 1155, 1231, 1246, 1223, 1152, 1228, 1223, 1225, 1222, 1217, 1242, 1241, 1223, 1216, 1226, 1152, 1229, 1229, 1153, 1246, 1231, 1246, 1231, 1239, 1231, 1153, 1246, 1231, 1246, 1231, 1239, 1231, 1155, 1231, 1246, 1223, 1153, 1240, 1223, 1226, 1227, 1217, 1245, 1153, 1246, 1231, 1225, 1227, 1169, 1242, 1239, 1246, 1227, 1171, 1179, 1160, 1245, 1227, 1231, 1244, 1229, 1222, 1171, 1705, 1791, 1774, 1768, 1770, 1729, 1786, 1762, 1714, 608, 566, 551, 545, 547, 533, 559, 572, 547, 635, 631, 628, 1607, 1602, 1624, 1631, 938, 951, 934, 942, 906, 935, 1175, 1260, 1267, 1278, 1279, 1269, 1241, 1269, 1278, 1279, 956, 937, 943, 955, 2654, 2627, 2654, 2630, 2639, 2812, 2808, 2804, 2802, 2800, 2782, 2800, 2796, 344, 2488, 2492, 2480, 2486, 2484, 2463, 2480, 2492, 2484};
    public String a = C0039.m6551(m363(), 0, 58, 2877);
    public String b;
    public final String c;

    public HBsuipian() {
        String strM1840 = C0007.m1840();
        String strM7833 = C0047.m7833(m363(), 58, 15, 2727);
        String strM6394 = C0038.m6394(strM7833, strM1840);
        if (C0057.m8953(strM6394)) {
            String strM2352 = C0010.m2352(16);
            this.c = strM2352;
            C0007.m1876(strM2352, strM7833);
        } else {
            this.c = strM6394;
        }
        C0063.m9593(this);
    }

    /* renamed from: ۟۠۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m359(Object obj, Object obj2) {
        if (C0050.m8121() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static JsonArray m360(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m361(Object obj) {
        if (C0019.m4065() < 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۡۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m362(Object obj, Object obj2, Object obj3) {
        if (C0000.m1116() < 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۥۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m363() {
        if (C0031.m5628() >= 0) {
            return f58short;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m364(int i, Object obj, Object obj2) {
        if (C0038.m6471() > 0) {
            return AbstractC0308c.b(i, (JsonObject) obj, (String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m365(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            return AbstractC0308c.d((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۡۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m366(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return ((JsonObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۧۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m367(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((JsonArray) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m368(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۢ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static JsonArray m369(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m370(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m371(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((JsonElement) obj).isJsonObject();
        }
        return false;
    }

    /* renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static Iterator m372(Object obj) {
        if (C0055.m8740() > 0) {
            return ((JsonArray) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
    public static String m373(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return g.n((ArrayList) obj, (JsonElement) obj2);
        }
        return null;
    }

    /* renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m374(Object obj) {
        if (C0013.m3167() > 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۨۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonElement m375(Object obj, int i) {
        if (C0057.m9017() > 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static JsonObject m376(Object obj) {
        if (C0006.m1726() < 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    public final HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0013.m3106(m363(), 73, 10, 522), C0010.m2300(m363(), 83, 299, 1776), C0060.m9352(m363(), 382, 5, 2915), C0005.m1645(m363(), 387, 32, 2565));
        C0053.m8424(mapM4127, C0063.m9585(m363(), 419, 13, 2960), C0029.m5269(this));
        C0053.m8424(mapM4127, C0017.m3646(m363(), 432, 4, 2441), C0026.m4955(this));
        C0053.m8424(mapM4127, C0031.m5565(m363(), 436, 12, 1522), C0040.m6584(m363(), 448, 33, 2544));
        return mapM4127;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM5769 = C0032.m5769(C0058.m9145(C0045.m7657(m363(), 481, 74, 1693), str, C0032.m5708(m363(), 555, 9, 775), str2, C0000.m1077(m363(), 564, 12, 3272)), C0048.m7901(this));
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObjectM376 = m376(strM5769);
        String strM3525 = C0016.m3525(m363(), 576, 4, 1872);
        if (m366(jsonObjectM376, strM3525)) {
            Iterator itM372 = m372(m369(jsonObjectM376, strM3525));
            while (C0012.m2962(itM372)) {
                JsonElement jsonElement = (JsonElement) C0048.m7949(itM372);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, m368(m359(m370(jsonElement), C0061.m9361(m363(), 580, 6, 909))));
                String strM6188 = C0036.m6188(m363(), 586, 1, 3263);
                C0018.m3933(sb, strM6188);
                C0018.m3933(sb, m368(m359(m370(jsonElement), C0037.m6307(m363(), 587, 9, 2033))));
                C0018.m3933(sb, strM6188);
                JsonObject jsonObjectM370 = m370(jsonElement);
                String strM3332 = C0014.m3332(m363(), 596, 4, 1357);
                C0018.m3933(sb, m368(m359(jsonObjectM370, strM3332)));
                String strM7763 = C0047.m7763(sb);
                String strM368 = m368(m359(m370(jsonElement), C0057.m8978(m363(), 600, 5, 2394)));
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0041.m6785(this));
                C0018.m3933(sb2, m368(m359(m370(jsonElement), C0019.m4107(m363(), 605, 8, 1128))));
                C0018.m3933(sb2, C0037.m6307(m363(), 613, 1, 1751));
                C0018.m3933(sb2, m368(m359(m370(jsonElement), C0058.m9106(m363(), 614, 9, 1087))));
                C0055.m8732(strM7763, strM368, C0047.m7763(sb2), m368(m359(m370(jsonElement), strM3332)), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    public String convert_minutes(int i) {
        try {
            int iM6456 = C0038.m6456(C0054.m8599(i));
            if (iM6456 == 0) {
                return C0054.m8599(iM6456);
            }
            int i2 = iM6456 / 60;
            int i3 = iM6456 % 60;
            String strM5565 = C0031.m5565(m363(), 623, 2, 2337);
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                C0036.m6177(sb, i3);
                C0018.m3933(sb, strM5565);
                return C0047.m7763(sb);
            }
            String strM9775 = C0065.m9775(m363(), 625, 2, 441);
            if (i3 == 0) {
                StringBuilder sb2 = new StringBuilder();
                C0036.m6177(sb2, i2);
                C0018.m3933(sb2, strM9775);
                return C0047.m7763(sb2);
            }
            StringBuilder sb3 = new StringBuilder();
            C0036.m6177(sb3, i2);
            C0018.m3933(sb3, strM9775);
            C0036.m6177(sb3, i3);
            C0018.m3933(sb3, strM5565);
            return C0047.m7763(sb3);
        } catch (NullPointerException | NumberFormatException unused) {
            return C0054.m8599(i);
        }
    }

    public String detailContent(List<String> list) {
        String[] strArrM4752 = C0024.m4752((String) C0048.m7915(list, 0), C0025.m4795(m363(), 627, 1, 1053));
        String str = strArrM4752[0];
        String str2 = strArrM4752[1];
        String str3 = strArrM4752[2];
        StringBuilder sb = new StringBuilder(C0056.m8911(m363(), 628, 71, 1567));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0030.m5362(m363(), 699, 8, 1108));
        C0018.m3933(sb, str);
        JsonObject jsonObjectM376 = m376(C0032.m5769(C0047.m7763(sb), C0048.m7901(this)));
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObjectM365 = m365(jsonObjectM376, C0049.m8007(m363(), 707, 4, 2449));
        JsonArray jsonArrayM360 = m360(jsonObjectM365, C0043.m7290(m363(), 711, 12, 1323));
        Iterator itM372 = m372(jsonArrayM360);
        while (true) {
            boolean zM2962 = C0012.m2962(itM372);
            String strM7509 = C0044.m7509(m363(), 723, 1, 2358);
            String strM1840 = C0007.m1840();
            if (!zM2962) {
                String str4 = (String) C0048.m7915(list, 0);
                String strM362 = m362(jsonObjectM365, C0044.m7509(m363(), 762, 5, 731), strM1840);
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0041.m6785(this));
                C0018.m3933(sb2, strM7509);
                C0018.m3933(sb2, m362(jsonObjectM365, C0040.m6584(m363(), 767, 8, 479), strM1840));
                C0018.m3933(sb2, strM7509);
                C0018.m3933(sb2, m362(jsonObjectM365, C0022.m4403(m363(), 775, 9, 768), strM1840));
                String strM7763 = C0047.m7763(sb2);
                StringBuilder sb3 = new StringBuilder(C0007.m1842(m363(), 784, 4, 2703));
                C0036.m6177(sb3, m361(jsonArrayM360));
                C0018.m3933(sb3, C0055.m8814(m363(), 788, 6, 798));
                C0018.m3933(sb3, C0057.m9010(this, m364(0, jsonObjectM365, C0014.m3332(m363(), 794, 8, 2623))));
                m mVar = new m(str4, strM362, strM7763, C0047.m7763(sb3));
                C0058.m9085(mVar, str3);
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0055.m8703());
                C0018.m3933(sb4, m362(jsonObjectM365, C0055.m8814(m363(), 802, 7, 2224), strM1840));
                C0027.m5000(mVar, C0047.m7763(sb4));
                C0054.m8596(mVar, C0027.m5062(m363(), 809, 2, 2126));
                C0044.m7449(mVar, C0036.m6194(C0037.m6307(m363(), 811, 1, 1851), arrayList));
                return C0053.m8428(mVar);
            }
            JsonElement jsonElement = (JsonElement) C0048.m7949(itM372);
            if (m371(jsonElement)) {
                JsonObject jsonObjectM370 = m370(jsonElement);
                String strM3622 = m362(jsonObjectM370, C0056.m8911(m363(), 724, 8, 1125), strM1840);
                JsonArray jsonArrayM3602 = m360(jsonObjectM370, C0062.m9389(m363(), 732, 14, 666));
                if (!m367(jsonArrayM3602)) {
                    JsonObject jsonObjectM3702 = m370(m375(jsonArrayM3602, 0));
                    String strM3623 = m362(jsonObjectM3702, C0003.m1398(m363(), 746, 7, 2962), strM1840);
                    String strM3624 = m362(jsonObjectM3702, C0046.m7718(m363(), 753, 8, 1283), strM1840);
                    StringBuilder sb5 = new StringBuilder();
                    C0018.m3933(sb5, strM3622);
                    C0018.m3933(sb5, C0042.m7151(m363(), 761, 1, 2902));
                    C0018.m3933(sb5, strM3623);
                    C0018.m3933(sb5, strM7509);
                    C0018.m3933(sb5, strM3624);
                    C0004.m1532(arrayList, C0047.m7763(sb5));
                }
            }
        }
    }

    public String homeContent(boolean z) {
        String strM5769 = C0032.m5769(C0041.m6779(m363(), 812, 61, 1950), C0048.m7901(this));
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObjectM376 = m376(strM5769);
        String strM6131 = C0035.m6131(m363(), 873, 4, 1984);
        if (m366(jsonObjectM376, strM6131)) {
            Iterator itM372 = m372(m369(jsonObjectM376, strM6131));
            while (C0012.m2962(itM372)) {
                JsonElement jsonElement = (JsonElement) C0048.m7949(itM372);
                C0004.m1532(arrayList, new b(m368(m359(m370(jsonElement), C0015.m3484(m363(), 877, 2, 2311))), m368(m359(m370(jsonElement), C0029.m5256(m363(), 879, 8, 775))), null));
            }
        }
        return m373(arrayList, m374(C0007.m1840()));
    }

    public void init(Context context, String str) {
        this.a = str;
    }

    public void login() {
        String strM4955 = C0026.m4955(this);
        try {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            C0053.m8424(map2, C0024.m4740(m363(), 887, 12, 2349), C0009.m2037(m363(), 899, 31, 3189));
            byte[] bArrM8115 = C0050.m8115(C0031.m5573(C0031.m5627(C0009.m2099() / 1000), C0047.m7833(m363(), 930, 16, 2468), C0007.m1840(), C0063.m9585(m363(), 946, 20, 505)));
            C0062.m9425();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrM8115) {
                String strM8889 = C0056.m8889(b & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb, '0');
                }
                C0018.m3933(sb, strM8889);
            }
            String strM7763 = C0047.m7763(sb);
            C0053.m8424(map, C0005.m1645(m363(), 966, 6, 3024), strM4955);
            C0053.m8424(map2, C0055.m8814(m363(), 972, 3, 3094), strM7763);
            C0053.m8424(map2, C0049.m8007(m363(), 975, 4, 2029), strM4955);
            C0053.m8424(map2, C0000.m1077(m363(), 979, 10, 2788), C0011.m2805(m363(), 989, 299, 899));
            JSONObject jSONObject = new JSONObject(C0046.m7725(C0008.m2029(C0045.m7628(C0001.m1189(m363(), 1288, 60, 1352), C0041.m6815(map), map2))));
            if (C0046.m7710(jSONObject, C0044.m7509(m363(), 1348, 4, 2005)) == 200) {
                String strM1212 = C0001.m1212(C0003.m1370(jSONObject, C0048.m7902(m363(), 1352, 4, 1240)), C0036.m6188(m363(), 1356, 5, 2482));
                this.b = strM1212;
                C0007.m1876(strM1212, C0035.m6131(m363(), 1361, 16, 2387));
            }
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM5188 = str2;
        if (!C0043.m7277(strM5188, C0013.m3106(m363(), 1377, 4, 2981))) {
            strM5188 = C0028.m5188(new StringBuilder(), C0041.m6785(this), strM5188);
        }
        g gVar = new g();
        C0017.m3667(gVar, strM5188);
        C0006.m1720(gVar, 0);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0028.m5142(this, str, true, C0027.m5062(m363(), 1381, 1, 1106));
    }

    public String searchContent(String str, boolean z, String str2) {
        String strM5769 = C0032.m5769(C0058.m9145(C0048.m7902(m363(), 1382, 75, 1198), str, C0045.m7657(m363(), 1457, 9, 1679), str2, C0045.m7657(m363(), 1466, 12, 582)), C0048.m7901(this));
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObjectM376 = m376(strM5769);
        String strM6131 = C0035.m6131(m363(), 1478, 4, 1579);
        if (m366(jsonObjectM376, strM6131)) {
            Iterator itM372 = m372(m369(jsonObjectM376, strM6131));
            while (C0012.m2962(itM372)) {
                JsonElement jsonElement = (JsonElement) C0048.m7949(itM372);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, m368(m359(m370(jsonElement), C0018.m3917(m363(), 1482, 6, 963))));
                String strM1398 = C0003.m1398(m363(), 1488, 1, 1239);
                C0018.m3933(sb, strM1398);
                C0018.m3933(sb, m368(m359(m370(jsonElement), C0015.m3484(m363(), 1489, 9, 1178))));
                C0018.m3933(sb, strM1398);
                JsonObject jsonObjectM370 = m370(jsonElement);
                String strM3106 = C0013.m3106(m363(), 1498, 4, 968);
                C0018.m3933(sb, m368(m359(jsonObjectM370, strM3106)));
                String strM7763 = C0047.m7763(sb);
                String strM368 = m368(m359(m370(jsonElement), C0023.m4536(m363(), 1502, 5, 2602)));
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0041.m6785(this));
                C0018.m3933(sb2, m368(m359(m370(jsonElement), C0009.m2037(m363(), 1507, 8, 2709))));
                C0018.m3933(sb2, C0035.m6131(m363(), 1515, 1, 375));
                C0018.m3933(sb2, m368(m359(m370(jsonElement), C0061.m9361(m363(), 1516, 9, 2513))));
                C0055.m8732(strM7763, strM368, C0047.m7763(sb2), m368(m359(m370(jsonElement), strM3106)), arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }
}